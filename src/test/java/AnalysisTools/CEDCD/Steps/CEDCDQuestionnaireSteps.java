package AnalysisTools.CEDCD.Steps;

import AnalysisTools.CEDCD.Pages.CEDCDSearchCohortsPage;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDQuestionnaireSteps extends PageInitializer {
	
	@When("the user is logged in as Admin")
	public void the_user_is_logged_in_as_Admin() {
		cedcdSearchCohortsPage.nihLoginBtn.click();
		cedcdAdminPage.internalUsernameTxtBox.sendKeys("uddins2");
		cedcdAdminPage.internalPasswordTxtBox.sendKeys("Areeb2007!");
		cedcdAdminPage.submit.click();
	}
	
	@When("user selects add new Cohort")
	public void user_selects_add_new_Cohort() {
		
	}
	
	@When("enters Cohort Name as {string}")
	public void enters_Cohort_Name_as(String cohortName) {
		
	}
	
	@When("enters Cohort Acronym as {string}")
	public void enters_Cohort_Acronym_as(String cohortAcronym) {
		
	}
	
	@When("selects Cohort Owner")
	public void selects_Cohort_Owner() {
		
	}
	
	@When("enters {string}")
	public void enters(String notes) {
		
	}
	
	@When("clicks submit")
	public void clicks_submit() {
		
	}
	
	@Then("Cohort is added")
	public void Cohort_is_added() {
		
	}
	

}
