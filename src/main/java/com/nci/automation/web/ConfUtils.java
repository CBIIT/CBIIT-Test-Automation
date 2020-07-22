package com.nci.automation.web;

import java.io.File;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;
import com.nci.automation.common.ScenarioContext;
import com.nci.automation.utils.LocalConfUtils;

/**
 * The class contains methods to interact with properties file.
 * @author sohilz2
 */
public class ConfUtils {
	
	private static final String ENVIRONMENT_PROPERTY_KEY = "env";
	
	private static final String RESOURCES_PATH = "src" + File.separator + "main" +
					File.separator + "resources";

	private static final String SPRING_CLASSPATH_DIR = "classpath:conf/env/";
	
	private static final String CONTENT_PATH = RESOURCES_PATH;
	
	private static Properties localConf = null;
	private static String resultsDir = "";
	private static String baseResultsDir = "";
	
	public static Properties getProperties(){
		
		if(localConf==null){
			localConf = LocalConfUtils.loadLocalConf();
		}
		//System.out.println(">>>>>>>>>>>>>>>>>>> Setting up the localConf >>>>>>>>>>");
		ScenarioContext.localConf = localConf;
		return localConf;
	}

	public static String getProperty(String key){
		return getProperties().getProperty(key);
	}

	public static String getRootDir(){
		return LocalConfUtils.getRootDir();
	}

	public static String getResourcesDir(){
		return getRootDir() + File.separator + RESOURCES_PATH;
	}

	public static String getContentDir(){
		return getRootDir() + File.separator + CONTENT_PATH;
	}

	public static String getTempDir(){
		return getResourcesDir() + File.separator + "conf" + File.separator + "temp";
	}

	public static String getWebDriverLibsDir(){
		return getResourcesDir() + File.separator + "libs" + File.separator + "webdriver";
	}

	public static String getDataDir(){
		return getContentDir() + File.separator + "data";
	}

	public static String getFeaturesDir(){
		return getContentDir() + File.separator + "features";
	}

	public static String getEnvironment(){
		/**
		 * Check for command line parms
		 */
		String returnValue = System.getProperty(ENVIRONMENT_PROPERTY_KEY);
		if(StringUtils.isBlank(returnValue)){
			returnValue = getProperty(ENVIRONMENT_PROPERTY_KEY);
		}
		return returnValue;
	}

	public static String getEnvFileResourcePath(){
		String returnValue = getEnvironment();
		returnValue = "/conf/env/" + returnValue + ".xml";
		return returnValue;
	}
	
	public static String getResultsDir(){
		return resultsDir;
	}

	public static String getResultsDataDir(){
		String returnValue = getResultsDir() + File.separator + "data";
		
		File dataDir = new File(returnValue);
		if(!dataDir.exists()){
			dataDir.mkdirs();
		}
		return returnValue;
	}
	
	public static void setResultsDir(String resultsDirName){
		resultsDir = baseResultsDir + File.separator + resultsDirName;		
	}

	public static void setBaseResultsDir(String baseDirName){
		baseResultsDir = baseDirName;		
	}

	public static String getBaseResultsDir(String baseDirName){
		return baseResultsDir;		
	}
	
	public static String getSpringClasspathDir(){
		return SPRING_CLASSPATH_DIR;
	}
	
	
}
