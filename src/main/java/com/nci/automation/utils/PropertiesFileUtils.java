package com.nci.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;

/**
 * The properties utilities class that contain utilities that loads properties
 * from various sources like from class path resources or from operating system
 * files.
 */
public class PropertiesFileUtils {

	public Properties propertiesFile;

	public PropertiesFileUtils(String filePath) {

		propertiesFile = new Properties();
		File inputFile = new File(filePath);

		try {
			FileInputStream fis = new FileInputStream(inputFile);
			propertiesFile.load(fis);
			MiscUtils.closeQuietly(fis);
		}
		catch(Exception e) {
			CucumberLogUtils.logError("Error loading properties file");
			e.printStackTrace();
		}
	}

	/**
	 * This method will load the properties in to the System from given
	 * {@code configPath} path.
	 *
	 * @param properties
	 *            the properties object into which the properties from
	 *            {@code configPath}.
	 *
	 * @param configPath
	 *            the path to the config file to be loaded.
	 *
	 * @throws IOException
	 *             if there is error accessing properties file from configPath.
	 *
	 * @throws NPE
	 *             if {@code configPath} is blank OR properties is {@code null}
	 */
	public static void loadPropsFromResource(Properties properties,
			String configPath)
			throws IOException {

		if (StringUtils.isNotBlank(configPath)) {
			InputStream inputStream = PropertiesFileUtils.class
					.getResourceAsStream(configPath);
			properties.load(inputStream);
		} else {
			throw new NullPointerException(
					"properties config path can not be null");
		}

	}
}
