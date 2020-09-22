package AnalysisTools.LDLink.StepsImplementation;

import org.junit.Test;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;


public class LDLinkHomePageImpl extends PageInitializer {
	
	@Test
	public void openUp() {
		try {
			WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		} catch (TestingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}



}
