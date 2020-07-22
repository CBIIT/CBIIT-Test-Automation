package com.nci.automation.db;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.nci.automation.common.DbMultiRowMapper;
import com.nci.automation.common.DbRowMapper;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.xceptions.TestingException;

/**
 * Contains utilities related to database connections
 */
public class DatabaseUtils {

	
	/**
	 * Get a database connections
	 * 
	 * @param username
	 * @param password
	 * @param url
	 * @return
	 * @throws TestingException
	 */
	public static Connection getConnnection(String url, String username, String password) throws TestingException {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, username, password);
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			throw new TestingException("Problem when establishing a connection to the database - " + e.getMessage(), e);
		}

		return conn;
	}

	public static void commitAndClose(Connection connection) throws TestingException {
		commit(connection);
		closeQuietly(connection);
	}

	/**
	 * Commit all updates since last commit
	 * 
	 * @throws TestingException
	 */
	public static void commit(Connection connection) throws TestingException {
		try {
			connection.commit();
		} catch (SQLException e) {
			throw new TestingException("Commit failed", e);
		}
	}

	/**
	 * Rollback all updates since last commit
	 * 
	 * @throws TestingException
	 */
	public static void rollback(Connection connection) throws TestingException {
		try {
			connection.rollback();
		} catch (SQLException e) {
			throw new TestingException("Rollback failed", e);
		}
	}

	/**
	 * Closes SQL connection objects
	 * 
	 * @param sqlObjects
	 */
	public static void closeQuietly(Object... sqlObjects) {
		for (Object obj2Close : sqlObjects) {
			try {
				if (obj2Close instanceof Connection) {
					Connection conn = (Connection) obj2Close;
					conn.close();
					conn = null;
				} else if (obj2Close instanceof PreparedStatement) {
					PreparedStatement stmt = (PreparedStatement) obj2Close;
					stmt.close();
					stmt = null;
				} else if (obj2Close instanceof ResultSet) {
					ResultSet rs = (ResultSet) obj2Close;
					rs.close();
					rs = null;
				}
			} catch (SQLException e) {
				CucumberLogUtils.logDebug(e.getMessage());
				continue;
			}
		}
	}


	private static Map<String, DbField> getCurrentRow(ResultSetMetaData metaData, ResultSet resultSet)
			throws SQLException {
		Map<String, DbField> rowMap = new HashMap<String, DbField>();

		int columnCount = metaData.getColumnCount();

		for (int i = 1; i <= columnCount; i++) {
			String columnName = metaData.getColumnName(i);
			int columnType = metaData.getColumnType(i);
			DbField columnValue = getFieldValue(columnName, columnType, resultSet);

			rowMap.put(columnName, columnValue);
		}

		return rowMap;
	}

	private static DbField getFieldValue(String columnName, int columnType, ResultSet resultSet) throws SQLException {

		DbField dbField = null;
		Object fieldValue = null;

		switch (columnType) {

		case Types.INTEGER:
			fieldValue = resultSet.getInt(columnName);
			dbField = DbField.createField(columnType, fieldValue);
			break;
		case Types.NUMERIC:
			fieldValue = resultSet.getBigDecimal(columnName);
			dbField = DbField.createField(columnType, fieldValue);
			break;
		case Types.DATE:
			Date date = resultSet.getDate(columnName);

			if (date != null) {
				long time = date.getTime();
				fieldValue = new java.util.Date(time);
				dbField = DbField.createField(columnType, fieldValue);
			}

			break;
		case Types.TIME:
			Time sqlTime = resultSet.getTime(columnName);

			if (sqlTime != null) {
				long time = sqlTime.getTime();
				fieldValue = new Date(time);
				dbField = DbField.createField(columnType, fieldValue);
			}

			break;
		case Types.TIMESTAMP:
			Timestamp sqlTimeStamp = resultSet.getTimestamp(columnName);

			if (sqlTimeStamp != null) {
				long time = sqlTimeStamp.getTime();
				fieldValue = new Date(time);
				dbField = DbField.createField(columnType, fieldValue);
			}

			break;
		case Types.BOOLEAN:
			fieldValue = resultSet.getBoolean(columnName);
			dbField = DbField.createField(columnType, fieldValue);
			break;
		case Types.CLOB:
			Clob columnClobValue = resultSet.getClob(columnName);

			if (columnClobValue != null) {
				fieldValue = getStringFromClob(columnClobValue);
				dbField = DbField.createField(columnType, fieldValue);
			}

			break;
		case Types.BLOB:
			Blob columnBlobValue = resultSet.getBlob(columnName);

			if (columnBlobValue != null) {
				fieldValue = getStringFromBlob(columnBlobValue);
				dbField = DbField.createField(columnType, fieldValue);
			}
			break;
		default:
			fieldValue = resultSet.getString(columnName);
			dbField = DbField.createField(columnType, fieldValue);
			break;
		}

		return dbField;
	}

	/**
	 * Returns rowMapper that will create columnName, value map for row with index
	 * {@code row} from the result set.
	 */
	public static DbRowMapper<Map<String, String>> getSingleRowMapper() {
		return new DbRowMapper<Map<String, String>>() {

			public Map<String, String> mapDBRow(ResultSet resultSet, int row) throws SQLException {
				Map<String, String> rowMap = new HashMap<String, String>();

				if (resultSet != null) {

					ResultSetMetaData metaData = resultSet.getMetaData();

					int columnCount = metaData.getColumnCount();

					for (int i = 1; i <= columnCount; i++) {
						String columnName = metaData.getColumnName(i);
						int columnType = metaData.getColumnType(i);
						String columnValue = "";

						if (columnType == Types.CLOB) {
							Clob columnClobValue = resultSet.getClob(columnName);
							columnValue = getStringFromClob(columnClobValue);
						} else {
							columnValue = resultSet.getString(columnName);
						}

						rowMap.put(columnName, columnValue);
					}

				}

				return rowMap;
			}

		};
	}

	/**
	 * Get a connection to an Oracle database
	 * 
	 * @param host
	 * @param port
	 * @param sid
	 * @param username
	 * @param password
	 * @return
	 * @throws TestingException
	 */
	public static Connection getOracleConnection(String host, String port, String sid, String username, String password)
			throws TestingException {
		String url = "jdbc:oracle:thin:@" + host + ":" + port + ":" + sid;

		return getConnnection(url, username, password);
	}

	
	/**
	 * Returns corresponding string from given {@code clob}.
	 *
	 * This method will return {@code null} if {@code clob} is {@code null}.
	 *
	 * @param clob the Clob for which corresponding string is required.
	 *
	 * @return Returns the string value of clob.
	 *
	 * @throws SQLException if there is any error while reading string from clob.
	 */
	public static String getStringFromClob(Clob clob) throws SQLException {
		String str = null;

		if (clob != null) {
			str = clob.getSubString(1, (int) clob.length());
		}
		return str;
	}

	/**
	 * Returns corresponding string from given {@code blob}.
	 *
	 * This method will return {@code null} if {@code blob} is {@code null}.
	 *
	 * @param blob the Blob for which corresponding string is required.
	 *
	 * @return Returns the string value of blob.
	 *
	 * @throws SQLException if there is any error while reading string from blob.
	 */
	public static String getStringFromBlob(Blob blob) throws SQLException {
		String str = null;
		byte[] blobArray = null;

		if (blob != null) {
			blobArray = blob.getBytes(1, (int) blob.length());
			str = new String(blobArray);
		}
		return str;
	}

	/**
	 * Returns dbunit specific database connection
	 *
	 * @param clob the Clob for which corresponding string is required.
	 *
	 * @return Returns the string value of clob.
	 *
	 * @throws SQLException if there is any error while reading string from clob.
	 */
	public static String getUnitResult(Connection connection, String sQuery) throws Exception {

		String result = null;
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sQuery);

		// Fetch each row from the result set
		while (rs.next())
			// Get the data from the row using the column index
			result = rs.getString(1);
		rs.close();
		stmt.close();
		return result;
	}

	// For List (First column)
	public static List<String> getListResult(Connection connection, String sQuery) throws Exception {

		List<String> result = new LinkedList<String>();
		result = new ArrayList<String>();

		// Create a result set containing all data from my_table
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sQuery);

		// Fetch each row from the result set
		while (rs.next())
			result.add(rs.getString(1));
		rs.close();
		stmt.close();
		return result;
	}

	public static String buildINClauseString(List<String> valueList) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < valueList.size(); i++) {
			sb.append("'").append(valueList.get(i)).append("'");

			if (i < valueList.size() - 1) {
				sb.append(",");
			}
		}

		return sb.toString();
	}
	
	/**
	 * Returns {@code DbMultiRowMapper} object whose
	 * {@code DbMultiRowMapper#mapDBRow(ResultSet)} will return a list of mapings
	 * between column name and colum dbFields
	 *
	 * The {@code DbField#getType()} is one of {@code java.sql.Types} data type. The
	 * {@code DbField#getValue()} returns the values as follows.
	 *
	 * INTEGER type will have java Integer value NUMERIC type will have java
	 * BigDecimal value BOOLEAN type will have java boolean value DATE, TIME and
	 * TIMESTAMP types will have java Date value CLOB type will have java String
	 * value Any other values will have java String value
	 *
	 * This method will not handle BLOBs and SQLXML types for now.
	 */
	public static DbMultiRowMapper<Map<String, DbField>> getMultiRowMapper() {
		return new DbMultiRowMapper<Map<String, DbField>>() {

			public List<Map<String, DbField>> mapDbResults(ResultSet resultSet) throws SQLException {
				List<Map<String, DbField>> rowList = new ArrayList<Map<String, DbField>>();

				if (resultSet != null) {
					ResultSetMetaData metaData = resultSet.getMetaData();

					while (resultSet.next()) {
						Map<String, DbField> currentRow = getCurrentRow(metaData, resultSet);
						rowList.add(currentRow);
					}

				}

				return rowList;
			}

		};
	}
}
