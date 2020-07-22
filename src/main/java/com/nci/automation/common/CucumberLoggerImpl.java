package com.nci.automation.common;

import org.apache.log4j.Logger;

import com.nci.automation.utils.CucumberLogUtils;

/**
 * Implementation of CucumberLogger which can be used to log messages to
 * cucumber report and Console if needed.
 */
public class CucumberLoggerImpl<T> implements CucumberLogger {

	private static Logger LOG = Logger.getLogger(CucumberLoggerImpl.class);
	private boolean shouldLogToConsole;
	
	@SuppressWarnings("unused")
	private Class<T> loggerClazz;
	
	/**
	 * Creates an instance of {@code CucumberLoggerImpl} class and returns it
	 * This constructor enables the console logging.
	 * 
	 * @param loggerClazz
	 *            the class to be user for logging, the console logging is
	 *            enabled.
	 */
	CucumberLoggerImpl(Class<T> loggerClazz) {
		this.loggerClazz = loggerClazz;

		if (loggerClazz != null) {
			shouldLogToConsole = true;
			LOG = Logger.getLogger(loggerClazz);
		}
	}

	/**
	 * Creates and returns an instance of {@code CucumberLoggerImpl}
	 * 
	 * Using this constructor will disable the console logging
	 */
	CucumberLoggerImpl() {
	}

	public void logScreenShot(String message) {
		CucumberLogUtils.logScreenShot(message);

		if (shouldLogToConsole) {
			LOG.info(message);
		}

	}

	
	public void logPass(String message, boolean shouldTakeScreenShot) {
		CucumberLogUtils.logPass(message, shouldTakeScreenShot);

		if (shouldLogToConsole) {
			LOG.info(message);
		}
	}

	
	public void logFail(String message, boolean shouldTakeScreenShot) {
		CucumberLogUtils.logFail(message, shouldTakeScreenShot);

		if (shouldLogToConsole) {
			LOG.error(message);
		}
	}

	public void logInfo(String message) {
		CucumberLogUtils.logInfo(message);

		if (shouldLogToConsole) {
			LOG.info(message);
		}
	}

	
	public void logDebug(String message) {
		CucumberLogUtils.logDebug(message);

		if (shouldLogToConsole) {
			LOG.debug(message);
		}
	}

	
	public void logError(String message) {
		CucumberLogUtils.logError(message);

		if (shouldLogToConsole) {
			LOG.error(message);
		}
	}

}
