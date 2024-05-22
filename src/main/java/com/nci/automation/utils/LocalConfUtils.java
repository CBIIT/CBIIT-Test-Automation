package com.nci.automation.utils;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;

/**
 * @author sohilz2
 */
public class LocalConfUtils {

	private static Properties localConf = null;
	private static String RESOURCE_PATH = "src" + File.separator + "main"
			+ File.separator + "resources";

	private static String reportConfigPath = "/src/main/resources/conf/extent-config.xml";

	public static String getReportConfigPath() {
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path is not specified");
	}

	public static Properties loadLocalConf() {

		/*
		 * Check for environment variables first,
		 * then fallback to system property
		 */
		String isCloud = System.getenv("isCloud");
		if (isCloud == null) {
			isCloud = System.getProperty("isCloud");
		}

		String localConfResourcesPath;
		if (isCloud == null || isCloud.equalsIgnoreCase("false")) {
			localConfResourcesPath = "conf/localEnv.properties";
		} else {
			localConfResourcesPath = "conf/cloudEnv.properties";
		}

		localConf = new Properties();

		try {
			PropertiesFileUtils.loadPropsFromResource(localConf, localConfResourcesPath);
			localConf = loadSystemProperties(localConf);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return localConf;

	}

	private static Properties loadSystemProperties(Properties localProps) {

		Properties systemProperties = System.getProperties();
		Enumeration<?> e = systemProperties.propertyNames();
		String key, value;

		while (e.hasMoreElements()) {
			key = (String) e.nextElement();
			value = systemProperties.getProperty(key);
			localProps.setProperty(key, value);
		}

		return localProps;

	}

	public static Properties getProperties() {
		if (localConf == null) {
			loadLocalConf();
		}

		return localConf;
	}

	public static String getProperty(String key) {

		if (localConf == null) {
			loadLocalConf();
		}

		String value =  System.getenv(key);
		if (value == null) {
			value = localConf.getProperty(key);
		}

		return value;

	}

	public static void setProperty(String key, String value) {

		if (localConf == null) {
			loadLocalConf();
		}

		localConf.setProperty(key, value);

	}

	public static String getRootDir() {
		return System.getProperty("user.dir");
	}
}