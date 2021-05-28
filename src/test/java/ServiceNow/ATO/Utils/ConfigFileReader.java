package ServiceNow.ATO.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties;
	
	private final String configFilePath = System.getProperty("user.dir") + "/src/test/resources/testData/config.properties";
	
	private static ConfigFileReader configFileReader;
	
	private ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(configFilePath));
			properties = new Properties();
			properties.load(reader);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static ConfigFileReader getConfigFileReader() {
		if(configFileReader == null) {
			configFileReader = new ConfigFileReader();
		}
		return configFileReader;
	}
	
	
	public String getAtoUrl() {
		String atoURL = properties.getProperty("atoURL");
		if(atoURL != null) {
			return atoURL;
		} else {
			throw new RuntimeException("ATO URL is not specified in the config.properties file");
		}
	}
	
	
	public String getUserName() {
		String userName = properties.getProperty("userName");
		if(userName != null) {
			return userName;
		} else {
			throw new RuntimeException("Username is not specified in the config.properties file");
		}
	}
	
	public String getPassword() {
		String password = properties.getProperty("password");
		if(password != null) {
			return password;
		} else {
			throw new RuntimeException("Password is not specified in the config.properties file");
		}
	}

}
