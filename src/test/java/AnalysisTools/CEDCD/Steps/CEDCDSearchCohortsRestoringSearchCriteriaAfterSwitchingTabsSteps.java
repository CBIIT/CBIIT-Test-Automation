package AnalysisTools.CEDCD.Steps;

import org.junit.Assert;

import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDSearchCohortsRestoringSearchCriteriaAfterSwitchingTabsSteps extends PageInitializer {

	@When("the user filters for a certain study")
	public void the_user_filters_for_a_certain_study() {

		/**
		 * This step clicks specifically on the 'Depression value from the drop down'
		 */
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.categoriesOfDataCollectedDepressionValue);
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortResultBtn);
	}

	@When("the user clicks on a different tab")
	public void the_user_clicks_on_a_different_tab() {
		/** This step clicks on a different tab on the page */

		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.biospecimenTab);

	}

	@When("the user click back on the previous tab")
	public void the_user_click_back_on_the_previous_tab() {

		/** This step clicks on the previous tab */
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortTab);

	}

	@Then("the user's filtered result from before are still populated")
	public void the_user_s_filtered_result_from_before_are_still_populated() {

		/**
		 * This step verifies that the previous selected value (depression) is still
		 * selected
		 */
		Assert.assertTrue(cedcdSearchCohortsPage.categoriesOfDataCollectedDepressionValue.isEnabled());

	}

}
