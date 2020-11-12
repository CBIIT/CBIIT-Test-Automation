package AnalysisTools.CEDCD.StepsImplementation;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class CEDCDSearchFemaleCohortsStepImp extends PageInitializer {

	/** This method takes you to the CEDCD homepage and logs a screenshot */
	public void startUpCEDCDBrowser() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CEDCD"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	/**
	 * This method filters the cohorts by selecting female and clicking "Search
	 * Cohorts" button
	 */
	public void filterResultsByFemale() {
		cedcdSearchCohortsPage.searchCohortsGenderBtn.click();
		cedcdSearchCohortsPage.searchCohortsFemaleOption.click();
		cedcdSearchCohortsPage.searchCohortResultBtn.click();
		cedcdSearchCohortsPage.showVariablesCollectedInCohortStudy.click();

	}

	/**
	 * This method verifies the correct number of cohorts are returned, highlights
	 * the results in red and logs screenshot
	 */
	public void femaleResultsReturnedWithRedBorderScreenshot() {
		Assert.assertTrue(cedcdSearchCohortsPage.numberOfSearchResultReturned.getText().contains("53"));
		JavascriptUtils.drawRedBorder(cedcdSearchCohortsPage.numberOfSearchResultReturned);
		CucumberLogUtils.logScreenShot();
	}

}
