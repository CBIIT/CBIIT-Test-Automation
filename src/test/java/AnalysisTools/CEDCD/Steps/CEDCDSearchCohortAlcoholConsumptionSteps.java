package AnalysisTools.CEDCD.Steps;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDSearchCohortAlcoholConsumptionSteps extends PageInitializer {


	/**
	 * This method will filter cohorts by "Alcohol Consumption" and search for them
	 */
	@When("the user searches cohorts through Alcohol Consumption filter")
	public void the_user_searches_cohorts_through_Alcohol_Consumption_filter() {

		cedcdSearchCohortAlcoholConsumptionStepImp.searchCohortsByAlcConsumption();
	}

	/**
	 * This method will verify that the number of result returned by the the filter
	 * are accurate, it will highlight the result and log a screenshot
	 */
	@Then("the user sees {int} studies returned")
	public void the_user_sees_studies_returned(int numberOfReturnedAlcoholConsumptionCohorts) {
		cedcdSearchCohortAlcoholConsumptionStepImp.resultsReturnedWithAlcoholConsumption();

	}
}
