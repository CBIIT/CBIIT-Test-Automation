package AnalysisTools.CEDCD.Steps;

import javax.swing.plaf.basic.BasicArrowButton;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	public void section_A_of_the_Questionnaire_is_filled_out() throws InterruptedException {

		/** Entering all data required for Cohort the Information tab */

		/** A2 clearing of previous data and completion of section */
//		cedcdCohortPage.a2TextBox.clear();
		cedcdCohortPage.a2TextBox.sendKeys("This is an automated test case");
		Thread.sleep(3000);

		/** A3 clearing of previous data and completion of section */
//		cedcdCohortPage.a3TextBox.clear();
		cedcdCohortPage.a3TextBox.sendKeys("AgainThisIsAnAutomatedTestCase.com");
		Thread.sleep(3000);

		/** A4 clearing of previous data and completion of section */
//		cedcdCohortPage.a4aName.click();
//		cedcdCohortPage.a4aName.clear();
		cedcdCohortPage.a4aName.sendKeys("Diego Juarez");
		Thread.sleep(3000);

//		cedcdCohortPage.a4aCohortPosition.click();
//		cedcdCohortPage.a4aCohortPosition.clear();
		cedcdCohortPage.a4aCohortPosition.sendKeys("Test Lead");
		Thread.sleep(3000);

//		cedcdCohortPage.a4aCountryCode.clear();
		cedcdCohortPage.a4aCountryCode.sendKeys("");
		Thread.sleep(3000);

//		cedcdCohortPage.a4aPhone.clear();
		cedcdCohortPage.a4aPhone.sendKeys("1234567890");
		Thread.sleep(3000);

//		cedcdCohortPage.a4aEmail.clear();
		cedcdCohortPage.a4aEmail.sendKeys("diego.juarezz@mail.com");
		Thread.sleep(3000);

		cedcdCohortPage.a4bRadioButtonNo.click();

//		cedcdCohortPage.a4bName.clear();
		cedcdCohortPage.a4bName.sendKeys("Kevin Mata");

//		cedcdCohortPage.a4bCohortPosition.clear();
		cedcdCohortPage.a4bCohortPosition.sendKeys("Tester");

//		cedcdCohortPage.a4bCountryCode.clear();
		cedcdCohortPage.a4bCountryCode.sendKeys("");

//		cedcdCohortPage.a4bPhone.clear();
		cedcdCohortPage.a4bPhone.sendKeys("0987654321");

//		cedcdCohortPage.a4bEmail.clear();
		cedcdCohortPage.a4bEmail.sendKeys("kevinmata@mail.com");

		/** Entering all data for the Principal Investigators tab */
		cedcdCohortPage.principalInvestigatorTab.click();

		/** A5 clearing of previous data and completion of section */
//		cedcdCohortPage.a5InvestigatorsName.clear();
		cedcdCohortPage.a5InvestigatorsName.sendKeys("Shomir Uddin");

//		cedcdCohortPage.a5InvestigatorsInstitution.clear();
		cedcdCohortPage.a5InvestigatorsInstitution.sendKeys("National Cancer Institute");

//		cedcdCohortPage.a5InvestigatorsEmails.clear();
		cedcdCohortPage.a5InvestigatorsEmails.sendKeys("Shomir.Uddinn@mail.com");

		/** A6 clearing of previous data and completion of section */
		cedcdCohortPage.sameAs4aCheckbox.click();

		/** Entering all data for the Eligibility and Enrollments tab */

		/** A7 clearing of previous data and completion of section */
		cedcdCohortPage.eligibilityAndEnrollmentTab.click();

		cedcdCohortPage.eligibleSexAllValue.click();

		cedcdCohortPage.baselinePopulationCheckbox.click();

//		cedcdCohortPage.baselinePopulationTextbox.clear();
		cedcdCohortPage.baselinePopulationTextbox.sendKeys("Automated test case in Progress");

//		cedcdCohortPage.eligibilityDiseaseOtherSpecifyTextbox.clear();
		cedcdCohortPage.eligibilityDiseaseOtherSpecifyTextbox.sendKeys("Diabetes");

		/** A8 clearing of previous data and completion of section */
//		cedcdCohortPage.enrollmentTotal.clear();
		cedcdCohortPage.enrollmentTotal.sendKeys("17");

//		cedcdCohortPage.startedInYear.clear();
		cedcdCohortPage.startedInYear.sendKeys("1996");

		cedcdCohortPage.enrollmentOngoingYesRadio.click();

//		cedcdCohortPage.targetNumberPlannedToEnroll.clear();
		cedcdCohortPage.targetNumberPlannedToEnroll.sendKeys("20000");

//		cedcdCohortPage.targetCountCompletionYear.clear();
		cedcdCohortPage.targetCountCompletionYear.sendKeys("2025");

//		cedcdCohortPage.enrollmentAgeMin.clear();
		cedcdCohortPage.enrollmentAgeMin.sendKeys("18");

//		cedcdCohortPage.enrollmentAgeMax.clear();
		cedcdCohortPage.enrollmentAgeMax.sendKeys("45");

//		cedcdCohortPage.enrollmentMedianAge.clear();
		cedcdCohortPage.enrollmentMedianAge.sendKeys("24");

//		cedcdCohortPage.enrollmentMeanAge.clear();
		cedcdCohortPage.enrollmentMeanAge.sendKeys("25");

//		cedcdCohortPage.currentAgeMin.clear();
		cedcdCohortPage.currentAgeMin.sendKeys("35");

//		cedcdCohortPage.currentAgeMax.clear();
		cedcdCohortPage.currentAgeMax.sendKeys("65");

//		cedcdCohortPage.currentMedianAge.clear();
		cedcdCohortPage.currentMedianAge.sendKeys("45");

//		cedcdCohortPage.currentMeanAge.clear();
		cedcdCohortPage.currentMeanAge.sendKeys("43");

		/**
		 * =============================== Entering all data for the Recruitment tab
		 * ============================
		 */

		cedcdCohortPage.recruitmentTab.click();

		/** A9 clearing of previous data and completion of section */
//		cedcdCohortPage.questionnaireFrequency.clear();
		cedcdCohortPage.questionnaireFrequency.sendKeys("Monthly");

		/** A10 clearing of previous data and completion of section */
//		cedcdCohortPage.mostRecentYear.clear();
		cedcdCohortPage.mostRecentYear.sendKeys("2018");

		/** A11 clearing of previous data and completion of section */
		cedcdCohortPage.a11PhoneInterview.click();
		cedcdCohortPage.a11AdministeredViaWebBasedDevice.click();
		cedcdCohortPage.a11otherPleaseSpecify.click();
//		cedcdCohortPage.a11otherPleaseSpecifyTextbox.clear();
		cedcdCohortPage.a11otherPleaseSpecifyTextbox.sendKeys("A11 Automated Key Presses");

		/** A12 clearing of previous data and completion of section */
		cedcdCohortPage.a12RequireIRBApproval.click();
		cedcdCohortPage.a12LinkingOtherDatabases.click();
		cedcdCohortPage.a12OtherPleaseSpecify.click();
//		cedcdCohortPage.a12OtherPleaseSpecifyTextbox.clear();
		cedcdCohortPage.a12OtherPleaseSpecifyTextbox.sendKeys("A12 Automated Key Presses");

		/** A13 clearing of previous data and completion of section */
		cedcdCohortPage.a13AdvisoryCommittees.click();
		cedcdCohortPage.a13GeneticVariantsBloodPressure.click();
		cedcdCohortPage.a13OtherPleaseSpecify.click();
//		cedcdCohortPage.a13OtherPleaseSpecifyTextbox.clear();
		cedcdCohortPage.a13OtherPleaseSpecifyTextbox.sendKeys("A13 Automated Key Presses");

		/**
		 * Entering all data for the Documents tab (there is nothing entered in this
		 * section)
		 */

		/** Saving the questionnaire */
		cedcdCohortPage.saveButton.click();

	}

	// try to show the section circle color/status. Possibly from a screenshot.
	@Then("Section A status Circle is green")
	public void section_A_status_Circle_is_green() {

	}

	/**
	 * This step fills out the whole of Section C of the questionnaire
	 * 
	 * @throws InterruptedException
	 */
	@Then("Section C of the Questionnaire is filled out")
	public void section_C_of_the_Questionnaire_is_filled_out() {

		/** Selecting Section C */
		cedcdCohortPage.SectionC.click();

		/** C1 radio buttons filled out */
		cedcdCohortPage.c1BaselineYesRadio.click();
		cedcdCohortPage.c1FollowUpYesRadio.click();

		/** C2 radio buttons filled out */
		cedcdCohortPage.c2BaselineYesRadio.click();
		cedcdCohortPage.c2FollowUpYesRadio.click();

		/** C3 radio buttons filled out */
		cedcdCohortPage.c3BaselineYesRadio.click();
		cedcdCohortPage.c3FollowUpYesRadio.click();

		/** C4 radio buttons filled out */
		cedcdCohortPage.c4BaselineYesRadio.click();
		cedcdCohortPage.c4FollowUpYesRadio.click();

		/** C5 radio buttons filled out */
		cedcdCohortPage.c5BaselineYesRadio.click();
		cedcdCohortPage.c5FollowUpYesRadio.click();

		/** C6 radio buttons filled out */
		cedcdCohortPage.c6BaselineYesRadio.click();
		cedcdCohortPage.c6FollowUpYesRadio.click();

		/** C7 radio buttons filled out */
		cedcdCohortPage.c7BaselineYesRadio.click();
		cedcdCohortPage.c7FollowUpYesRadio.click();

		/** C8 radio buttons filled out */
		cedcdCohortPage.c8BaselineYesRadio.click();
		cedcdCohortPage.c8FollowUpYesRadio.click();

		/** C9 radio buttons filled out */
		cedcdCohortPage.c9BaselineYesRadio.click();
		cedcdCohortPage.c9FollowUpYesRadio.click();

		/** C10 radio buttons filled out */
		cedcdCohortPage.c10BaselineYesRadio.click();
		cedcdCohortPage.c10FollowUpYesRadio.click();

		/** C11 radio buttons filled out */
		cedcdCohortPage.c11BaselineYesRadio.click();
		cedcdCohortPage.c11FollowUpYesRadio.click();

		/** C12 radio buttons filled out */
		cedcdCohortPage.c12BaselineYesRadio.click();
		cedcdCohortPage.c12FollowUpYesRadio.click();

		/** C13 radio buttons filled out */
		cedcdCohortPage.c13BaselineYesRadio.click();
		cedcdCohortPage.c13FollowUpYesRadio.click();

		/** C14 radio buttons filled out */
		cedcdCohortPage.c14BaselineYesRadio.click();
		cedcdCohortPage.c14FollowUpYesRadio.click();

		/** C15 Check box options */

		/** C15 Baseline selected values */
		cedcdCohortPage.c15CigarBaselineValue.click();
		cedcdCohortPage.c15ChewTobaccoBaselineValue.click();
		cedcdCohortPage.c15OtherBaselineValue.click();
		CommonUtils.sendKeys(cedcdCohortPage.c15OtherBaselineTextBox, "C15 Baseline Text Box Test");

		/** C15 Follow Up selected values */
		cedcdCohortPage.c15PipesFollowUpValue.click();
		cedcdCohortPage.c15ECigarettesFollowUpValue.click();
		cedcdCohortPage.c15OtherFollowUpValue.click();
		CommonUtils.sendKeys(cedcdCohortPage.c15OtherFollowUpTextBox, "C15 Follow Up Text Box Test");

		/** C16 radio buttons filled out */
		cedcdCohortPage.c16BaselineYesRadio.click();
		cedcdCohortPage.c16FollowUpYesRadio.click();

		/** C17 radio buttons filled out */
		cedcdCohortPage.c17BaselineYesRadio.click();
		cedcdCohortPage.c17FollowUpYesRadio.click();

		/** C18 radio buttons filled out */
		cedcdCohortPage.c18BaselineYesRadio.click();
		cedcdCohortPage.c18FollowUpYesRadio.click();

		/** C19 radio buttons filled out */
		cedcdCohortPage.c19BaselineYesRadio.click();
		cedcdCohortPage.c19FollowUpYesRadio.click();

		/** C20 radio buttons filled out */
		cedcdCohortPage.c20BaselineYesRadio.click();
		cedcdCohortPage.c20FollowUpYesRadio.click();

		/** C21 radio buttons filled out */
		cedcdCohortPage.c21BaselineYesRadio.click();
		cedcdCohortPage.c21FollowUpYesRadio.click();

		/** C22 radio buttons filled out */
		cedcdCohortPage.c22BaselineYesRadio.click();
		cedcdCohortPage.c22FollowUpYesRadio.click();

		/** C23 radio buttons filled out */
		cedcdCohortPage.c23BaselineYesRadio.click();
		cedcdCohortPage.c23FollowUpYesRadio.click();

		/** C24 radio buttons filled out */
		cedcdCohortPage.c24BaselineYesRadio.click();
		cedcdCohortPage.c24FollowUpYesRadio.click();

		/** C25 radio buttons filled out */
		cedcdCohortPage.c25BaselineYesRadio.click();
		cedcdCohortPage.c25FollowUpYesRadio.click();

		/** C26 radio buttons filled out */
		cedcdCohortPage.c26BaselineYesRadio.click();
		cedcdCohortPage.c26FollowUpYesRadio.click();

		/** C27 radio buttons filled out */
		cedcdCohortPage.c27BaselineYesRadio.click();
		cedcdCohortPage.c27FollowUpYesRadio.click();

		/** C28 radio buttons filled out */
		cedcdCohortPage.c28BaselineYesRadio.click();
		cedcdCohortPage.c28FollowUpYesRadio.click();

		/** C29 radio buttons filled out */
		cedcdCohortPage.c29BaselineYesRadio.click();
		cedcdCohortPage.c29FollowUpYesRadio.click();

		/** C30 radio buttons filled out */
		cedcdCohortPage.c30BaselineYesRadio.click();
		cedcdCohortPage.c30FollowUpYesRadio.click();
		
		/** Clicking the Other Medical Conditions tab for section C */
		cedcdCohortPage.otherMedicalConditionsTab.click();
		
		/** C31 filling out all of the radio buttons for tab */
		
		/** Diabetes Yes selection for baseline and follow ups */
		cedcdCohortPage.c31DiabetesBaselineYesRadio.click();
		cedcdCohortPage.c31DiabetesFollowUpYesRadio.click();
		
		/** Stroke Yes selection for baseline and follow ups */
		cedcdCohortPage.c31StrokeBaselineYesRadio.click();
		cedcdCohortPage.c31StrokeFollowUpYesRadio.click();
		
		/** COPD and/or Emphysema Yes selection for baseline and follow ups */
		cedcdCohortPage.c31COPDBaselineYesRadio.click();
		cedcdCohortPage.c31COPDFollowUpYesRadio.click();
		
		/** Cardiovascular Disease Yes selection for baseline and follow ups */
		cedcdCohortPage.c31CardiovascularBaselineYesRadio.click();
		cedcdCohortPage.c31CardiovascularFollowUpYesRadio.click();
		
		/** Osteoporosis Yes selection for baseline and follow ups */
		cedcdCohortPage.c31OsteoporosisBaselineYesRadio.click();
		cedcdCohortPage.c31OsteoporosisFollowUpYesRadio.click();
		
		/** Mental Health Yes selection for baseline and follow ups */
		cedcdCohortPage.c31MentalHealthBaselineYesRadio.click();
		cedcdCohortPage.c31MentalHealthFollowUpYesRadio.click();
		
		/** Cognitive Decline Yes selection for baseline and follow ups */
		cedcdCohortPage.c31CognitiveDeclineBaselineYesRadio.click();
		cedcdCohortPage.c31CognitiveDeclineFollowUpYesRadio.click();
		
		/** Clicking the Cancer Related Conditions tab for section C */
		cedcdCohortPage.cancerRelatedConditionsTab.click();
		
		/** C32 filling out selected check boxes and text boxes */
		
		cedcdCohortPage.c32CancerToxicityCheckbox.click();
		cedcdCohortPage.c32CancerLateEffectsCheckbox.click();
		cedcdCohortPage.c32CancerOtherCheckbox.click();
		CommonUtils.sendKeys(cedcdCohortPage.c32CancerOtherSpecifyTextbox, "C32 Text Box Test");
		
		/** Saving the questionnaire after completion */
		cedcdCohortPage.saveButton.click();

	}

	// try to show the section circle color/status. Possibly from a screenshot.
	@Then("Section C status Circle is green")
	public void section_C_status_Circle_is_green() {

	}

}
