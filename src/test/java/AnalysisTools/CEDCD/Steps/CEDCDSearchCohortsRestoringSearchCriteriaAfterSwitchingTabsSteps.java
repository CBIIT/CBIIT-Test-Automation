package AnalysisTools.CEDCD.Steps;

import org.junit.Assert;

import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDSearchCohortsRestoringSearchCriteriaAfterSwitchingTabsSteps extends PageInitializer {

	/**
	 * This step clicks specifically on the 'Depression value from the drop down'
	 */
	@When("the user filters by Depression study")
		public void the_user_filters_by_Depression_study() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.categoriesOfDataCollectedDropDown);
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.categoriesOfDataCollectedDepressionValue);
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortResultBtn);
		
	}

	/** This step clicks on a different tab on the page 
	 * @throws InterruptedException */
	@When("the user clicks on a different tab")
	public void the_user_clicks_on_a_different_tab() throws InterruptedException {
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.biospecimenTab);
		Thread.sleep(1000);
	}

	/** This step clicks on the previous tab */
	@When("the user click back on the previous tab")
	public void the_user_click_back_on_the_previous_tab() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortTab);

	}
	/**
	 * This step verifies that the previous selected value (depression) is still
	 * selected
	 */
	@Then("the user is filtered result from before are still populated")
	public void the_user_is_filtered_result_from_before_are_still_populated() {

		Assert.assertTrue(cedcdSearchCohortsPage.categoriesOfDataCollectedDepressionValue.isEnabled());

	}

}
