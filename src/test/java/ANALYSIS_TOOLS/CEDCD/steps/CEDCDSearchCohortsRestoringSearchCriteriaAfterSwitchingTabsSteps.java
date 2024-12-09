package ANALYSIS_TOOLS.CEDCD.steps;

import org.junit.Assert;
import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;

public class CEDCDSearchCohortsRestoringSearchCriteriaAfterSwitchingTabsSteps extends PageInitializer {

	@When("the user filters by Depression study")
	public void the_user_filters_by_Depression_study() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.categoriesOfDataCollectedDropDown);
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.categoriesOfDataCollectedDepressionValue);
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortResultBtn);
	}

	@When("the user clicks on a different tab")
	public void the_user_clicks_on_a_different_tab() throws InterruptedException {
		JavascriptUtils.clickByJS(cedcdBiospecimenCountsPage.biospecimenTab);
		Thread.sleep(1000);
	}

	@When("the user click back on the previous tab")
	public void the_user_click_back_on_the_previous_tab() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortTab);
	}

	@Then("the user is filtered result from before are still populated")
	public void the_user_is_filtered_result_from_before_are_still_populated() {
		Assert.assertTrue(cedcdSearchCohortsPage.categoriesOfDataCollectedDepressionValue.isEnabled());
	}
}