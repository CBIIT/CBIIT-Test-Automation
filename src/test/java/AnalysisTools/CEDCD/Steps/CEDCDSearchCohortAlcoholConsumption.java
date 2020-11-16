package AnalysisTools.CEDCD.Steps;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDSearchCohortAlcoholConsumption extends PageInitializer{
	
	@Given("the user is on the CEDCD Search Cohorts Tab")
	public void the_user_is_on_the_CEDCD_Search_Cohorts_Tab() {
	}

	@When("the user searches cohorts through Alcohol Consumption filter")
	public void the_user_searches_cohorts_through_Alcohol_Consumption_filter() {
	}

	@Then("the user see {int} studies returned")
	public void the_user_see_studies_returned(int int1) {
	}


}
