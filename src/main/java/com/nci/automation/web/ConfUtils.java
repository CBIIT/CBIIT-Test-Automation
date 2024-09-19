package com.nci.automation.web;

import java.io.File;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;
import com.nci.automation.utils.LocalConfUtils;

public class ConfUtils {

	private static final String ENVIRONMENT_PROPERTY_KEY = "env";
	private static final String BROWSER_PROPERTY_KEY = "BROWSER_VAR";

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
		String returnValue = System.getProperty(ENVIRONMENT_PROPERTY_KEY);
		if (StringUtils.isBlank(returnValue)) {
			returnValue = getProperty(ENVIRONMENT_PROPERTY_KEY);
		}
		return returnValue;
	}

	public static String getBrowser() {
		String returnValue = System.getProperty(BROWSER_PROPERTY_KEY);
		if (StringUtils.isBlank(returnValue)) {
			returnValue = getProperty(BROWSER_PROPERTY_KEY);
		}
		return returnValue;
	}

	public static String getEnvFileResourcePath() {
		String returnValue = getEnvironment();
		returnValue = "/conf/env/" + returnValue + ".xml";
		return returnValue;
	}

	public static void setBaseResultsDir(String baseDirName) {
		baseResultsDir = baseDirName;
	}
}