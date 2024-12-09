package ANALYSIS_TOOLS.CEDCD.steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import static com.nci.automation.web.TestProperties.getCedcdUrl;

public class CEDCDStartUps extends PageInitializer {

	public void startUpCEDCDBrowser() {
		WebDriverUtils.webDriver.get(getCedcdUrl());
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	public void setUpOnSearchCohortsTabPage() {
		startUpCEDCDBrowser();
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortTab);
	}

	public void setUpOnBiospecimenTabPage() {
		startUpCEDCDBrowser();
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.biospecimenTab);
	}
}