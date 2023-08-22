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
