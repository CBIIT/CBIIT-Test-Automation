package ANALYSIS_TOOLS.CEDCD.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;

public class CEDCDSearchFemaleCohortsSteps extends PageInitializer {

	@Given("the user is on the CEDCD Search Cohorts Tab")
	public void the_user_is_on_the_CEDCD_Search_Cohorts_Tab()  {
		cedcdStartUps.setUpOnSearchCohortsTabPage();
	}

	@When("the user clicks on the CEDCD search cohorts tab")
	public void the_user_clicks_on_the_CEDCD_search_cohorts_tab() {
		cedcdSearchCohortsPage.searchCohortTab.click();
	}

	@When("the user filters by females")
	public void the_user_filters_by_females() {
		cedcdSearchFemaleCohortsStepImp.filterResultsByFemale();
	}

	@Then("the results returned are for Female or All Cohorts")
	public void the_results_returned_are_for_Female_or_All_Cohorts() {
		cedcdSearchFemaleCohortsStepImp.comparingResultsReturnedtoFemaleAndAllValues();
	}
}