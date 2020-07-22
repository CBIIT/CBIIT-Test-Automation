package com.nci.automation.common;

/**
 * Cucumber Logger. This logger will write reports to Cucumber report and
 * optionally to Console.
 * @author sohilz2
 *
 */
public interface CucumberLogger {

	/**
	 * Logs the screen shot of the webpage with given {@code message}
	 * 
	 * @param message
	 *            the message to be logged along with screent shot.
	 */
	void logScreenShot(String message);

	void logPass(String message, boolean shouldTakeScreenShot);

	void logFail(String message, boolean shouldTakeScreenShot);

	void logInfo(String message);

	void logDebug(String message);

	void logError(String message);

	public static class Factory {

		/**
		 * Creates new instance of {@code CucumberLogger} and returns it. This
		 * method will return a logger that will log the message both to
		 * cucumber report as well as console.
		 * 
		 * @param loggerClazz
		 *            the class to be referenced by the console logger.
		 */
		public static <T> CucumberLogger createInstnace(Class<T> loggerClazz) {
			return new CucumberLoggerImpl<T>(loggerClazz);
		}

		/**
		 * Creates new instance of {@code CucumberLogger} and returns it. The
		 * logger returned by this method will log the messages only to the
		 * Cucumber report.
		 */
		public static <T> CucumberLogger createInstance() {
			return new CucumberLoggerImpl<T>();
		}
	}
}
