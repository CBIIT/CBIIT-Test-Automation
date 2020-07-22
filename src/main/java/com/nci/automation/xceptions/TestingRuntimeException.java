package com.nci.automation.xceptions;

/**
 * Represents Runtime Testing Exception.
 * @author sohilz2
 */
public class TestingRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 5186306002762922939L;

	public TestingRuntimeException(Throwable exception) {
		super(exception);
	}

	public TestingRuntimeException(String errorMessage) {
	}

	public TestingRuntimeException(String errorMessage, Throwable exception) {
		super(errorMessage, exception);
	}
}
