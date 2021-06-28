package AnalysisTools.CEDCD.Steps;

import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
<<<<<<< Updated upstream
import junit.framework.Assert;
=======
<<<<<<< HEAD
=======
import junit.framework.Assert;
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream

=======
<<<<<<< HEAD
=======

>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	@When("the user filters by females")
	public void the_user_filters_by_females() {

		cedcdSearchFemaleCohortsStepImp.filterResultsByFemale();

	}

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
	@Then("{int} results return for Female Cohort Filter Result")
	public void results_return_for_Female_Cohort_Filter_Result(int numberOfFemalesReturned) {

		cedcdSearchFemaleCohortsStepImp.femaleResultsReturnedWithRedBorderScreenshot();

=======
>>>>>>> Stashed changes
	@Then("the results returned are for Female or All Cohorts")
	public void the_results_returned_are_for_Female_or_All_Cohorts() {
		
		cedcdSearchFemaleCohortsStepImp.comparingResultsReturnedtoFemaleAndAllValues();
		
//		System.out.println(cedcdSearchCohortsPage.returnedResultsForFemaleFilter);
		
<<<<<<< Updated upstream
=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	}

}
