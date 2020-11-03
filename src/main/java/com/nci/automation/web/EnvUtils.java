package com.nci.automation.web;

import java.io.IOException;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.xceptions.TestingException;
import com.nci.automation.xml.JDomXmlUtils;

/**
 * This class contains methods to interact with xml files
 * @author sohilz2
 */
public class EnvUtils {
	
	
	/**
	 * This method will return the application URL. make sure you have 
	 * proper URL placed in all environment xml files.
	 * @return String object
	 * @throws TestingException
	 */
	public static String getApplicationUrl(String appName) throws TestingException {
        final String appURL = "//application[@id='"+ appName +"']/login_url";
        return getConfigValue(appURL);
    }
	

    
	/**
	 * This method will return the application user-name. make sure you have 
	 * proper user-name placed in all environment xmls.
	 * @return String object
	 * @throws TestingException
	 */
    public static String getUserName(String role) throws TestingException {
        final String userIdXPath = "//role/user[@id='%s']/userId";
        return EncryptionUtils.decrypt(getConfigValue(userIdXPath, role));
    }
    
	/**
	 * This method will return the application decrypted password.
	 * @return String object
	 * @throws TestingException
	 */
    public static String getPassword(String role) throws TestingException {
        final String userPasswordXPath = "//role/user[@id='%s']/password";
        return EncryptionUtils.decrypt(getConfigValue(userPasswordXPath, role));
    }
    
	/**
	 * This method will return the database URL.
	 * @return String object
	 * @throws TestingException
	 */
    public static String getDatabaseURL() throws TestingException {
    	final String dbUrlXPath = "//db/default/url";
        return getConfigValue(dbUrlXPath);
    }

	/**
	 * This method will return the database user-name.
	 * @return String object
	 * @throws TestingException
	 */
    public static String getDatabaseUsername() throws TestingException {
    	final String dbUserNameXPath = "//db/default/username";
        return getConfigValue(dbUserNameXPath);
    }

    /**
	 * This method will return the database decrypted password.
	 * @return String object
	 * @throws TestingException
	 */
    public static String getDatabasePassword() throws TestingException {
    	final String dbPasswordXPath = "//db/default/password";
        return EncryptionUtils.decrypt(getConfigValue(dbPasswordXPath));
    }
    
    public static String getExecutionEnv() throws TestingException {
		String env="";
		String url=WebDriverUtils.webDriver.getCurrentUrl();
		if(url.contains("test")) {
			env="Test";
		}else if(url.contains("stage")) {
			env="Stage";
		}else if(url.contains("dev")) {
			env="Dev";
		}else if(url.contains("sandbox")) {
			env="SandBox";
		}
		env="Environment: "+env+" ("+url+")";
		return env;
	}
   
    public static String getDbFeedCompareQuery(String dbName, String tableName) throws TestingException {
    	final String dbUrlXPath = "//dbFeedCompareQueries/"+ dbName+ "/"+ tableName +"/query";
        return getConfigValue(dbUrlXPath);
    }
    
    public static String getDbQuery(String dbName, String queryName) throws TestingException {
    	final String dbUrlXPath = "//%s/dbQueries/query[@id='%s']";
    	System.out.println("Query path = " + String.format(dbUrlXPath,dbName,queryName));
        return getConfigValue(dbUrlXPath,dbName,queryName);
    }
    
    public static String getFirefoxProfileName() throws TestingException {
        final String firefoxProfileNameXPath = "//firefox-profile[@enabled='true']/profile-name";
        return getConfigValue(firefoxProfileNameXPath);
    }

    public static String getProxyHostnameFor(String appName) throws TestingException {
        final String proxyHostNameXPath = "//proxies/proxy[@name='%s']/hostname";
        return getConfigValue(proxyHostNameXPath, appName);
    }

    public static String getProxyPortFor(String appName) throws TestingException {
        final String proxyPortXPath = "//proxies/proxy[@name='%s']/port";
        return getConfigValue(proxyPortXPath, appName);
    }

    public static String getProxyUsernameFor(String appName) throws TestingException {
        final String proxyUserNameXPath = "//proxies/proxy[@name='%s']/username";
        return getConfigValue(proxyUserNameXPath, appName);
    }

    public static String getProxyPasswordFor(String appName) throws TestingException {
    	final String proxyPasswordXPath = "//proxies/proxy[@name='%s']/password";
        return getConfigValue(proxyPasswordXPath, appName);
    }

    public static String getConfigValue(String configElementXPathTemplate, Object... args) throws TestingException {
    	final String configElementXPath = String.format(configElementXPathTemplate, args);
        //CucumberLogUtils.logDebug("Executing XPath against local environment file: " + configElementXPath);
        String envFilePath = ConfUtils.getEnvFileResourcePath();
        String configElementValue = null;

        try {
            configElementValue = JDomXmlUtils.getValueByXpathFromResourcePath(envFilePath, configElementXPath);
        } catch (IOException ioException) {
            throw new TestingException("IO Error while reading the xml file from the config Path: " + configElementXPath, ioException);
        }

        return configElementValue;
    }
    
	public static String getHomePageUrl(String appName) throws TestingException {
        final String appURL = "//application[@id='"+ appName +"']/home_url";
        return getConfigValue(appURL);
    }
	
	public static String getLandingPageUrl(String appName) throws TestingException {
        final String appURL = "//application[@id='"+ appName +"']/landing_url";
        return getConfigValue(appURL);
    }
    
//  public static String getDatabaseURL(String dbName) throws TestingException {
//	final String dbUrlXPath = "//db/"+ dbName+ "/url";
//    return getConfigValue(dbUrlXPath);
//}
//
//public static String getDatabaseUsername(String dbName) throws TestingException {
//	final String dbUserNameXPath = "//db/"+ dbName+ "/username";
//    return getConfigValue(dbUserNameXPath);
//}
//
//public static String getDatabasePassword(String dbName) throws TestingException {
//	final String dbPasswordXPath = "//db/"+ dbName+ "/password";
//    return getConfigValue(dbPasswordXPath);
//}
}
