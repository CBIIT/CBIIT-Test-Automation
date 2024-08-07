package com.nci.automation.web;

import java.io.File;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;
import com.nci.automation.utils.LocalConfUtils;

/**
 * The class contains methods to interact with properties file.
 *
 * @author sohilz2
 */
public class ConfUtils {

	private static final String ENVIRONMENT_PROPERTY_KEY = "env";

	private static Properties localConf = null;
	private static String resultsDir = "";
	private static String baseResultsDir = "";

	public static Properties getProperties() {

		if (localConf == null) {
			localConf = LocalConfUtils.loadLocalConf();
		}
		return localConf;
	}

	public static String getProperty(String key) {
		return getProperties().getProperty(key);
	}

	public static String getRootDir() {
		return LocalConfUtils.getRootDir();
	}

	public static String getEnvironment() {
		/**
		 * Check for command line parms
		 */
		String returnValue = System.getProperty(ENVIRONMENT_PROPERTY_KEY);
		if (StringUtils.isBlank(returnValue)) {
			returnValue = getProperty(ENVIRONMENT_PROPERTY_KEY);
		}
		return returnValue;
	}

	public static String getEnvFileResourcePath() {
		String returnValue = getEnvironment();
		returnValue = "/conf/env/" + returnValue + ".xml";
		return returnValue;
	}

	public static String getResultsDir() {
		return resultsDir;
	}


	public static void setResultsDir(String resultsDirName) {
		resultsDir = baseResultsDir + File.separator + resultsDirName;
	}

	public static void setBaseResultsDir(String baseDirName) {
		baseResultsDir = baseDirName;
	}

}