package AnalysisTools.CEDCD.Steps;


import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDSearchFemaleCohortsSteps extends PageInitializer {
	@Given("the user is on the CEDCD homepage")
	public void the_user_is_on_the_CEDCD_homepage() throws TestingException {

		cedcdSearchFemaleCohortsStepImp.startUpCEDCDBrowser();

	}

	/** This method clicks on the search cohorts tab */
	@When("the user clicks on the CEDCD search cohorts tab")
	public void the_user_clicks_on_the_CEDCD_search_cohorts_tab() {

		cedcdSearchCohortsPage.searchCohortTab.click();

	}

	@When("the user filters by females")
	public void the_user_filters_by_females() {

		cedcdSearchFemaleCohortsStepImp.filterResultsByFemale();

	}

	@Then("{int} results return for Female Cohort Filter Result")
	public void results_return_for_Female_Cohort_Filter_Result(int numberOfFemalesReturned) {

		cedcdSearchFemaleCohortsStepImp.femaleResultsReturnedWithRedBorderScreenshot();

	}

}
