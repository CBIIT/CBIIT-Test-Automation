package com.nci.automation.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.nci.automation.db.DatabaseUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.xceptions.TestingException;

/**
 * @author sohilz2
 * This class contains methods for interacting with the database.
 */
public class DatabaseDAO {

	/** The connection. */
	private static Connection connection = null;
	private static Statement st;
	private static ResultSet rSet;
	private static List<Map<String, String>> listData;

	/**
	 * Get a database connection to the database.
	 * 
	 * @return the database connection
	 * @throws TestingException the testing exception
	 */
	public static Connection getDatabaseConnection() throws TestingException {
		try {
			if (connection == null || connection.isClosed()) {
				String url = EnvUtils.getDatabaseURL();
				String username = EnvUtils.getDatabaseUsername();
				String password = EnvUtils.getDatabasePassword();

				connection = DatabaseUtils.getConnnection(url, username, password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new TestingException("SQL exception while connecting to database. " + e.getMessage());
		} catch (TestingException e) {
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * Closes an open connection to the database
	 */
	public static void closeDbConnection() {
		if (connection != null) {
			DatabaseUtils.closeQuietly(connection);
		}
	}

	/**
	 * Executes given {@code sql} query and returns value from the result set
	 * corresponding to the given {@code columnName}.
	 * 
	 * @param sql        the query to be executed.
	 * @param columnName the name of the column for which the value is needed.
	 * @return the string
	 * @throws TestingException the testing exception
	 */
	public String executeSingleValueQuery(String sql, String columnName) throws TestingException {
		String value = "";
		try {
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			while (resultSet.next()) {
				value = resultSet.getString(columnName);
			}
		} catch (SQLException sqlException) {
			throw new TestingException("SQL Error while executing the query: \n" + sql);
		}
		return value;
	}

	/**
	 * Executes given {@code sql} query and returns value from the result set
	 * corresponding to the given {@code columnName}.
	 * 
	 * @param sql        the query to be executed.
	 * @param columnName the name of the column for which the value is needed.
	 * @return the string
	 * @throws TestingException the testing exception
	 */
	public String executeSingleValueQuery(String sql, int columnNumber) throws TestingException {
		String value = "";
		try {
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			while (resultSet.next()) {
				value = resultSet.getString(columnNumber);
			}
		} catch (SQLException sqlException) {
			throw new TestingException("SQL Error while executing the query: \n" + sql);
		}
		return value;
	}

	/**
	 * Returns list of results as a result of execution of given query.
	 * 
	 * @param query      the sql query.
	 * @param columnName name of the db column.
	 * @return Returns the list values returned by the query. Assumes all values are
	 *         list.
	 * @throws SQLException the SQL exception
	 */
	public List<String> executeSingleColumnQuery(String query, String columnName) throws SQLException {
		List<String> resultList = new ArrayList<String>();
		Statement stmt = connection.createStatement();
		ResultSet resultSet = stmt.executeQuery(query);
		while (resultSet.next()) {
			String value = resultSet.getString(columnName);
			resultList.add(value);
		}
		return resultList;
	}

	/**
	 * This method will retrieve data from DB by specified query, store inside a
	 * List of Maps and return it
	 * 
	 * @return List<Map<String,String>>
	 */
	public static List<Map<String, String>> storeDataFromDB(String sqlQuery) {
		try {
			st = connection.createStatement();
			rSet = st.executeQuery(sqlQuery);
			ResultSetMetaData rSetMD = rSet.getMetaData();
			listData = new ArrayList<>();

			while (rSet.next()) {
				Map<String, String> rowMap = new LinkedHashMap<>();
				for (int i = 1; i <= rSetMD.getColumnCount(); i++) {
					rowMap.put(rSetMD.getColumnName(i), rSet.getObject(i).toString());
				}
				listData.add(rowMap);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listData;
	}

}
