package AnalysisTools.CEDCD.Steps;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class CEDCDStartUps extends PageInitializer{
	
	/** This method takes you to the CEDCD homepage and logs a screenshot */
	public void startUpCEDCDBrowser() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CEDCD"));
		MiscUtils.sleep(2000);
	}
	
	
	public void setUpOnSearchCohortsTabPage() throws TestingException {
		startUpCEDCDBrowser();
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortTab);

	}
	
	public void setUpOnBiospecimenTabPage() throws TestingException {
		startUpCEDCDBrowser();
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.biospecimenTab);

	}
	
	

}
