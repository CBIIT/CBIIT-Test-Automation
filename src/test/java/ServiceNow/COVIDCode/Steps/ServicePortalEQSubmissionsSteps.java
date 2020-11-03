package ServiceNow.COVIDCode.Steps;

import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ServicePortalEQSubmissionsSteps extends PageInitializer {
	
	@Given("a COVIDcode Study Provider user has logged in to the COVIDcode Study application")
	public void a_COVIDcode_Study_Provider_user_has_logged_in_to_the_COVIDcode_Study_application() throws TestingException {
		covidCodeLoginStepsImpl.covidCodeServicePortalLogin();
	}

	@When("the COVIDcode Study Provider fills out an Enrollment Questionnaire for a {string} who says {string} to join the study")
	public void the_COVIDcode_Study_Provider_fills_out_an_Enrollment_Questionnaire_for_a_who_says_to_join_the_study(String groupUserID, String consent) {
		covidCodeEQPageImpl.groupUserAndConsent(groupUserID, consent);
	}

	@When("enters users full name, required information, and demographics information")
	public void enters_users_full_name_required_information_and_demographics_information() {
		covidCodeEQPageImpl.requiredDemographicsInfo();
	}

	@When("does not enter Disease Course and Exposures and Risk Factors information")
	public void does_not_enter_Disease_Course_and_Exposures_and_Risk_Factors_information() {
		//skipping disease course and exposures and risk factors information
	}

	@When("Submits the enrollment questionnaire")
	public void submits_the_enrollment_questionnaire() {
		covidCodeEQPageImpl.submittingEQ();
	}

	@Then("the enrollment questionnaire should be successfully submitted")
	public void the_enrollment_questionnaire_should_be_successfully_submitted() {
		//Include step here
	}

}
