package AnalysisTools.CEDCD.StepsImplementation;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;

public class CEDCDMaleDiscrepancyOnSearchCohortsStepImp extends PageInitializer {

	/** This method filters and searches cohorts that are male */
	public void filterByMale() {
		cedcdSearchCohortsPage.searchCohortsGenderBtn.click();
		cedcdSearchCohortsPage.searchCohortsMaleOption.click();
		cedcdSearchCohortsPage.searchCohortResultBtn.click();
		cedcdSearchCohortsPage.showVariablesCollectedInCohortStudy.click();
	}

	/**
	 * This method verifies that the correct number of cohorts are returned,
	 * highlights number in blue and logs a screenshot
	 */
	public void maleResultsReturnedWithBlueBorderScreenshot() {

		Assert.assertTrue(cedcdSearchCohortsPage.numberOfSearchResultReturned.getText().contains("44"));
		JavascriptUtils.drawBlueBorder(cedcdSearchCohortsPage.numberOfSearchResultReturned);
		CucumberLogUtils.logScreenShot();

	}

}
