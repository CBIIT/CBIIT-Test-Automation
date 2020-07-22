package com.nci.automation.common;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This interface provides contract for mapping from a jdbc result set to given
 * java type.
 * 
 * @param T
 *            the type of the object to be mapped
 */
public interface DbRowMapper<T> {

	/**
	 * Maps the database row at {@code rowIndex} from the {@code resultSet} into
	 * given object
	 * 
	 * @param resultSet
	 *            The jdbc result set object from which data is retrieved.
	 * 
	 * @param rowIndex
	 *            the row number in database.
	 * 
	 * @return returns the mapped object.
	 */
	public T mapDBRow(ResultSet resultSet, int rowIndex) throws SQLException;
}
