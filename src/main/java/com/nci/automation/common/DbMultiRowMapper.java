package com.nci.automation.common;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.nci.automation.db.DbField;

public interface DbMultiRowMapper<T> {
	/**
	 * Reads given {@code resultSet} and returns the map of
	 * 
	 * @param resultSet
	 *            The jdbc result set object from which data is retrieved.
	 * 
	 * @return Returns List of ColunName, Value mappings for entire resultSet.
	 * 
	 * @throws SQLException
	 *             if there is any error reading the data from given
	 *             {@code resultSet}
	 */
	public List<Map<String, DbField>> mapDbResults(ResultSet resultSet)
			throws SQLException;
}
