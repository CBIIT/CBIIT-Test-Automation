package AnalysisTools.CEDCD.Steps;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDMaleDiscrepancyOnSearchCohortsSteps extends PageInitializer {

	@When("the user filters by males")
	public void the_user_filters_by_males() {
		
		cedcdMaleDiscrepancyOnSearchCohortsStepImp.filterByMale();

	}

	@Then("{int} results return for Male cohort Filter results")
	public void results_return_for_Male_cohort_Filter_results(int numberOfMalesReturned) {
		
		cedcdMaleDiscrepancyOnSearchCohortsStepImp.maleResultsReturnedWithBlueBorderScreenshot();

	}

}