package AnalysisTools.CEDCD.Steps;

import javax.swing.plaf.basic.BasicArrowButton;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import AnalysisTools.CEDCD.Pages.CEDCDSearchCohortsPage;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDQuestionnaireSteps extends PageInitializer {
	
	@Given("the user is on the CEDCD homepage")
	public void the_user_is_on_the_CEDCD_homepage() {
		try {
			WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CEDCD"));
		} catch (TestingException e) {
			e.printStackTrace();
		}
	}
	
	@When("the user is logged in as Admin")
	public void the_user_is_logged_in_as_Admin() throws TestingException {
		cedcdAdminPage.nihLoginBtn.click();
		loginImpl.shomirITrustLogin();
	}
	
	@When("user selects add new Cohort")
	public void user_selects_add_new_Cohort() {
		cedcdAdminPage.addNewCohortlnk.click();
		
		
	}
	
	@When("enters Cohort Name as {string}")
	public void enters_Cohort_Name_as(String cohortName) {
		cedcdAdminPage.cohortNameTxtBox.sendKeys(cohortName);
	}
	
	@When("enters Cohort Acronym as {string}")
	public void enters_Cohort_Acronym_as(String cohortAcronym) {
		cedcdAdminPage.cohortAcroynmTxtBox.sendKeys(cohortAcronym);
	}
	
	@When("enters Cohort Owner")
	public void enters_Cohort_Owner() {
		cedcdAdminPage.cohortOwnerDownArrow.click();
		cedcdAdminPage.cohortOwnerTxtBox.sendKeys("Diego");
		cedcdAdminPage.cohortOwnerTxtBox.sendKeys(Keys.RETURN);
		
	}
	
	@When("enters {string}")
	public void enters(String notes) {
		cedcdAdminPage.notesTxtBox.sendKeys(notes);
	}
	
	@When("clicks submit")
	public void clicks_submit() {
		cedcdAdminPage.cohortSubmitBtn.click();
	}
	
	@Then("Cohort is added")
	public void Cohort_is_added() {
		CucumberLogUtils.logScreenShot();
		
	}
	
	@When("the user is logged in as a Cohort Owner")
	public void the_user_is_logged_in_as_a_Cohort_Owner() throws TestingException {
		cedcdAdminPage.nihLoginBtn.click();
		loginImpl.loginToITrust();
		
	}

	@When("the Cohort Owner selects their Cohort questionnaire")
	public void the_Cohort_Owner_selects_their_Cohort_questionnaire() {
		
	}

	@Then("Section A of the Questionnaire is filled out")
	public void section_A_of_the_Questionnaire_is_filled_out() {
		
		/** Entering all data required for Cohort the Information tab */
		
		/** A2 completion */
		cedcdCohortPage.a2TextBox.sendKeys("This is an automated test case");
		
		/** A3 completion */
		cedcdCohortPage.a3TextBox.sendKeys("AgainThisIsAnAutomatedTestCase.com");
		
		/** A4 completion */
		cedcdCohortPage.a4aName.sendKeys("Diego Juarez");
		cedcdCohortPage.a4aCohortPosition.sendKeys("Test Lead");
		cedcdCohortPage.a4aCountryCode.sendKeys("");
		cedcdCohortPage.a4aPhone.sendKeys("1234567890");
		cedcdCohortPage.a4aEmail.sendKeys("diego.juarezz@mail.com");
		cedcdCohortPage.a4bRadioButtonNo.click();
		cedcdCohortPage.a4bName.sendKeys("Kevin Mata");
		cedcdCohortPage.a4bCohortPosition.sendKeys("Tester");
		cedcdCohortPage.a4bCountryCode.sendKeys("");
		cedcdCohortPage.a4bPhone.sendKeys("0987654321");
		cedcdCohortPage.a4bEmail.sendKeys("kevinmata@mail.com");
		
		/** Entering all data for the Principal Investigators tab */
		cedcdCohortPage.principalInvestigatorTab.click();
		
		/** A5 completion */
		cedcdCohortPage.a5InvestigatorsName.sendKeys("Shomir Uddin");
		cedcdCohortPage.a5InvestigatorsInstitution.sendKeys("National Cancer Institute");
		cedcdCohortPage.a5InvestigatorsEmails.sendKeys("Shomir.Uddinn@mail.com");
		
		/** A6 completion */
		cedcdCohortPage.sameAs4aCheckbox.click();
		
		/** Entering all data for the Eligibility and Enrollments tab */
		
		/** A7 completion */
		cedcdCohortPage.eligibilityAndEnrollmentTab.click();
		cedcdCohortPage.eligibleSexAllValue.click();
		cedcdCohortPage.baselinePopulationCheckbox.click();
		cedcdCohortPage.baselinePopulationTextbox.sendKeys("Automated test case in Progress");
		cedcdCohortPage.eligibilityDiseaseOtherSpecifyTextbox.sendKeys("Diabetes");
		
		/** A8 completion */
		cedcdCohortPage.enrollmentTotal.sendKeys("17");
		cedcdCohortPage.startedInYear.sendKeys("1996");
		cedcdCohortPage.enrollmentOngoingYesRadio.click();
		cedcdCohortPage.targetNumberPlannedToEnroll.sendKeys("20000");
		cedcdCohortPage.targetCountCompletionYear.sendKeys("2025");
		cedcdCohortPage.enrollmentAgeMin.sendKeys("18");
		cedcdCohortPage.enrollmentAgeMax.sendKeys("45");
		cedcdCohortPage.enrollmentMedianAge.sendKeys("24");
		cedcdCohortPage.enrollmentMeanAge.sendKeys("25");
		cedcdCohortPage.currentAgeMin.sendKeys("35");
		cedcdCohortPage.currentAgeMax.sendKeys("65");
		cedcdCohortPage.currentMedianAge.sendKeys("45");
		cedcdCohortPage.currentMeanAge.sendKeys("43");
		
		/**=============================== Entering all data for the Recruitment tab ============================*/
		
		cedcdCohortPage.recruitmentTab.click();
		
		/** A9 completion */
		cedcdCohortPage.questionnaireFrequency.sendKeys("Monthly");
		
		/** A10 completion */
		cedcdCohortPage.mostRecentYear.sendKeys("2018");
		
		/** A11 completion */
		cedcdCohortPage.a11PhoneInterview.click();
		cedcdCohortPage.a11AdministeredViaWebBasedDevice.click();
		cedcdCohortPage.a11otherPleaseSpecify.click();
		cedcdCohortPage.a11otherPleaseSpecifyTextbox.sendKeys("A11 Automated Key Presses");
		
		/** A12 completion */
		cedcdCohortPage.a12RequireIRBApproval.click();
		cedcdCohortPage.a12LinkingOtherDatabases.click();
		cedcdCohortPage.a12OtherPleaseSpecify.click();
		cedcdCohortPage.a12OtherPleaseSpecifyTextbox.sendKeys("A12 Automated Key Presses");
		
		/** A13 completion */
		cedcdCohortPage.a13AdvisoryCommittees.click();
		cedcdCohortPage.a13GeneticVariantsBloodPressure.click();
		cedcdCohortPage.a13OtherPleaseSpecify.click();
		cedcdCohortPage.a13OtherPleaseSpecifyTextbox.sendKeys("A13 Automated Key Presses");
		
		/** Entering all data for the Documents tab (there is nothing entered in this section) */
		
		/** Saving the questionnaire */
		cedcdCohortPage.saveButton.click();
		
		
		
	}

	

}
