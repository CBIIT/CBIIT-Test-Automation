package AnalysisTools.CEDCD.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializers.PageInitializer;

public class CEDCDStartUps extends PageInitializer {

	public void startUpCEDCDBrowser() {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CEDCD"));
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	public void setUpOnSearchCohortsTabPage() throws TestingException {
		startUpCEDCDBrowser();
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortTab);
	}

	public void setUpOnBiospecimenTabPage() {
		startUpCEDCDBrowser();
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.biospecimenTab);
	}
}