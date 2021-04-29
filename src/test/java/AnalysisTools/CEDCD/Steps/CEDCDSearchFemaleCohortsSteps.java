package AnalysisTools.CEDCD.Steps;

import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CEDCDSearchFemaleCohortsSteps extends PageInitializer {

	@Given("the user is on the CEDCD Search Cohorts Tab")
	public void the_user_is_on_the_CEDCD_Search_Cohorts_Tab() throws TestingException {

		cedcdStartUps.setUpOnSearchCohortsTabPage();

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

	@Then("the results returned are for Female or All Cohorts")
	public void the_results_returned_are_for_Female_or_All_Cohorts() {
		
		cedcdSearchFemaleCohortsStepImp.comparingResultsReturnedtoFemaleAndAllValues();
		
//		System.out.println(cedcdSearchCohortsPage.returnedResultsForFemaleFilter);
		
	}

}
