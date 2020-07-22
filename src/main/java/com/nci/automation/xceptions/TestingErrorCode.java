package com.nci.automation.xceptions;

public enum TestingErrorCode {
	
	SERVER_ERROR(1001, "Error accessing or reading from the server"), 

	CONTENT_UNCOMPRESS_ERROR(1002, "Error uncompressing the stream"), 

	FILE_WRITE_ERROR(1003, "Error writing to the file"),

	LOG_READER_ERROR(1004, "Error reading the server log content"),

	FILE_NOT_FOUND_ERROR(1005, "File not found"),

	NO_CLDF_FILE(1006, "No Cldf files corresponding to Mismo file"),

	NO_DATA_IN_XML(1007, "Expected data is not found in xml file"),

	VALUE_NOT_MATCHED(1008, "Data values are not matched"),

	VALUE_MATCHED(1009, "Data values are matched when not expecting to"),

	DATA_ERROR(1010, "System Exception due to invalid input data"),

	XML_PARSING_ERROR(1011, "XML Parsing error"),

	FILE_ACCESS_ERROR(1012, "Error accessing the file"),

	INPUT_DATA_ERROR(1013, "No input data found"),

	INVALID_OPTIONAL_CONFIG_PROPERTY(1014,
			"The system config property is not a valid one.");

	private final int code;

	private final String description;

	private TestingErrorCode(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return this.code;
	}

	public String getDescription() {
		return this.description;
	}
}
