package com.nci.automation.utils;

import java.util.Map;

import org.apache.log4j.Logger;

public class HashMapUtils {

	private static Logger logger = Logger.getLogger(HashMapUtils.class);
	
	public static void printHashMap(Map<String, String> map) {
		for(String key : map.keySet()) { //map.values()
			CucumberLogUtils.logInfo("Key: " + key + ", Value: " + map.get(key));
		}
	}

	public static boolean compareMaps(Map<String, String> actualMap,
			Map<String, String> expectedMap, boolean isCaseSensitive) {

		if((actualMap == null) || (expectedMap == null)) {
			CucumberLogUtils.logError("Actual and/or Expected Map is null!");
			return false;
		}
		if(actualMap.isEmpty() || expectedMap.isEmpty()) {
			CucumberLogUtils.logError("Actual and/or Expected Map is empty!");
			return false;
		}
		if(actualMap.size() != expectedMap.size()) {
			CucumberLogUtils.logError("Actual and Expected Maps are not of the same size");
			return false;
		}

		String keyForDebug = "";
		
		try {
			if (isCaseSensitive) {
				for(String key : actualMap.keySet()) {
					keyForDebug = key;
					if(!actualMap.get(key).contentEquals(expectedMap.get(key))) {
						CucumberLogUtils.logError("Mismatch at key: " + key);
						CucumberLogUtils.logError("Actual Value: " + actualMap.get(key) + 
								", Expected Value: " + expectedMap.get(key));
						return false;
					}
				}
			}
			else {
				for(String key : actualMap.keySet()) {
					keyForDebug = key;
					if(!actualMap.get(key).equalsIgnoreCase(expectedMap.get(key))) {
						CucumberLogUtils.logError("Mismatch at key: " + key);
						CucumberLogUtils.logError("Actual Value: " + actualMap.get(key) + 
								", Expected Value: " + expectedMap.get(key));
						return false;
					}
				}
			}
		}
		catch(NullPointerException e) {
			logger.error(String.format("Key %s not found in expected map", keyForDebug));
			return false;
		}
		return true;
	}
}
