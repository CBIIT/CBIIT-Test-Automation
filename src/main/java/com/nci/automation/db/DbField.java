package com.nci.automation.db;


/**
 * This class represents the database base field with type and value
 */
public class DbField {
	private int type;
	private Object value;
	
	private DbField(int type, Object value) {
		this.type = type;
		this.value = value;
	}

	public int getType() {
		return this.type;
	}

	public Object getValue() {
		return this.value;
	}

	public static DbField createField(int type, Object value) {
		return new DbField(type, value);
	}
}
