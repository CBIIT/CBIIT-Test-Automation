package ANALYSIS_TOOLS.CEDCD.steps;

import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;

public class CEDCDSearchCohortsNewPageLayoutSteps extends PageInitializer {

	@When("the user clicks on the CEDCD search cohorts")
	public void the_user_clicks_on_the_CEDCD_search_cohorts() {
		JavascriptUtils.clickByJS(cedcdSearchCohortsPage.searchCohortTab);
	}

	@Then("the user sees updated Search Cohorts UI page")
	public void the_user_sees_updated_Search_Cohorts_UI_page() {
		cedcdSearchCohortNewPageLayOutStepImp.cohortsSectionComparison();
	}
}