
package com.nci.automation.utils;

import java.util.HashMap;
import java.util.Map;

import com.nci.automation.common.ScenarioContext;
import com.saucelabs.saucerest.SauceREST;

public class SauceUtils {
	
	private static SauceREST sauceRest = null;
	
	private static SauceREST getSauceRest() {
		if(sauceRest == null) {
			String username = LocalConfUtils.getProperty("sauceUsername");
			String accessKey = LocalConfUtils.getProperty("sauceKey");
			sauceRest = new SauceREST(username, accessKey);
		}
			return sauceRest; 
	}

	public static void updateResultOnSauceDashboard(boolean isPass) {
		String sessionId = getSessionId();
		Map<String, Object> updates = getUpdatesHash(isPass);
		
		performUpdate(sessionId, updates);
	}

	public static void updateSauceDashboard(HashMap<String, Object> updates) {
		String sessionId = getSessionId();		
		performUpdate(sessionId, updates);
	}
	
	private static void performUpdate(String sessionId, Map<String, Object> updates) {
		SauceREST client = getSauceRest();
		
		if(sessionId == null || sessionId.isEmpty()) {
			CucumberLogUtils.logError ("sauceSessionId is null or empty! "
					+ "Couldn't update Sauce dashboard");
		}
		else {
			MiscUtils.setupHttpsProxy();
			client.updateJobInfo(sessionId, updates);
			MiscUtils.clearHttpsProxy();
		}
	}
	
	private static String getSessionId() {
		return ScenarioContext.sauceSessionId.get();
	}
	
	private static Map<String, Object> getUpdatesHash(boolean testResult) {
		Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("passed", testResult);
        return ret;
	}
	
}
