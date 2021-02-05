package AnalysisTools.CEDCD.StepsImplementation;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class CEDCDSearchCohortAlcoholConsumptionStepImp extends PageInitializer {

	/**
	 * This method will direct user to CEDCD home page and then click on the Search
	 * Cohorts tab
	 * 
	 * @throws TestingException
	 */

	public void setUpOnSearchCohortsPage() throws TestingException {
		cedcdSearchFemaleCohortsStepImp.startUpCEDCDBrowser();
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortTab);

	}

	/**
	 * This method will filter Cohorts by "Alcohol Consumption" and search for them
	 */
	public void searchCohortsByAlcConsumption() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.categoriesOfDataCollectedDropDown);
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.categoriesOfDataCollectedAlcoholConsumptionValue);
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortResultBtn);

	}

	/**
	 * This method will verify that the number of result returned by the the filter
	 * are accurate, it will highlight the result in a blue border and log a screenshot
	 */

	public void resultsReturnedWithAlcoholConsumption() {
		MiscUtils.sleep(2000);
		Assert.assertTrue(cedcdSearchCohortsPage.numberOfSearchResultReturned.getText().contains("58"));
		JavascriptUtils.drawBlueBorder(cedcdSearchCohortsPage.numberOfSearchResultReturned);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);

	}

}
