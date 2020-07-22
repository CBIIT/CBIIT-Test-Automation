package com.nci.automation.xceptions;

/**
 * Custom Exception class for Test Automation
 * @author sohilz2
 *
 */
public class TestingException extends Exception
{
	private static final long serialVersionUID = 1L;

	private TestingErrorCode errorCode;
	
	/**
	 * 
	 */
	public TestingException()
	{}
	
	public TestingException(TestingErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	/**
	 * @param message
	 */
	public TestingException(String message)
	{
		super(message);
	}
	
	/**
	 * @param cause
	 */
	public TestingException(Throwable cause)
	{
		super(cause);
	}
	
	/**
	 * @param message
	 * @param cause
	 */
	public TestingException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	public TestingErrorCode getErrorCode() {
		return this.errorCode;
	}

}
