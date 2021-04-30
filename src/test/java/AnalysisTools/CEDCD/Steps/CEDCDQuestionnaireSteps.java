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
import AnalysisTools.CEDCD.Pages.CEDCDAdminPage;
import AnalysisTools.CEDCD.Pages.CEDCDSearchCohortsPage;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDQuestionnaireSteps extends PageInitializer {
	@Given("the user is on the CEDCD homepage")
	public void the_user_is_on_the_CEDCD_homepage() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CEDCD"));
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
	}
	
	@Given("a Admin user adds a Cohort Study linked to Cohort Owner")
	public void a_Admin_user_adds_a_Cohort_Study_linked_to_Cohort_Owner() throws TestingException {
		MiscUtils.sleep(3000);
		JavascriptUtils.clickByJS(cedcdAdminPage.nihLoginBtn);
		//cedcdAdminPage.nihLoginBtn.click();
		loginImpl.shomirITrustLogin();
		MiscUtils.sleep(2000);
		cedcdAdminPage.addNewCohortlnk.click();
		MiscUtils.sleep(2000);
		cedcdAdminPage.cohortNameTxtBox.sendKeys("Automated_TestCohort_Name "+ CommonUtils.date);
		cedcdAdminPage.cohortAcroynmTxtBox.sendKeys("Automated_TestCohort_Acronym "+ CommonUtils.date);
		cedcdAdminPage.cohortOwnerDownArrow.click();
		cedcdAdminPage.cohortOwnerTxtBox.sendKeys("Diego");
		cedcdAdminPage.cohortOwnerTxtBox.sendKeys(Keys.RETURN);
		cedcdAdminPage.notesTxtBox.sendKeys("This Cohort Will Be Automated");
		JavascriptUtils.clickByJS(cedcdAdminPage.cohortSubmitBtn);
		CucumberLogUtils.logScreenShot();	
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cedcdAdminPage.logoutButton);
	}
	
	@When("a Cohort Owner logs in")
	public void a_Cohort_Owner_logs_in() throws TestingException {
		MiscUtils.sleep(3000);
		JavascriptUtils.clickByJS(cedcdAdminPage.nihLoginBtn);
		loginImpl.loginToITrust();
	}

	@When("selects linked Cohort")
	public void selects_linked_Cohort() {
		//ADD TO PAGES CLASS - CLICKING ON DROP DOWN
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.xpath("//div[@class=' css-yk16xz-control']")).click();
		MiscUtils.sleep(3000);
		//INPUT LOCATOR TO SEND TEXT TO DROP DOWN TEXT BOX
		WebDriverUtils.webDriver.findElement(By.id("react-select-2-input")).sendKeys("Automated_TestCohort_Name "+ CommonUtils.date);
		WebDriverUtils.webDriver.findElement(By.id("react-select-2-input")).sendKeys(Keys.RETURN);
	}
	
	@When("fills out all sections of the questionnaire")
	public void fills_out_all_sections_of_the_questionnaire() {
	
		/** Entering all data required for Cohort the Information tab */
		cedcdCohortPage.a2TextBox.sendKeys("This is an automated test case");

		/** A3 clearing of previous data and completion of section */
		cedcdCohortPage.a3TextBox.sendKeys("AnAutomatedTestCase.com");

		/** A4 clearing of previous data and completion of section */
		//cedcdCohortPage.a4aName.click();
		cedcdCohortPage.a4aName.sendKeys("Kevin Mata");
		//cedcdCohortPage.a4aCohortPosition.click();
		cedcdCohortPage.a4aCohortPosition.sendKeys("Test Lead");
		cedcdCohortPage.a4aCountryCode.sendKeys("");
		//cedcdCohortPage.a4aPhone.click();
		cedcdCohortPage.a4aPhone.sendKeys("7036875816");
		//cedcdCohortPage.a4aEmail.click();
		cedcdCohortPage.a4aEmail.sendKeys("diego.juarez@mail.com");
		cedcdCohortPage.a4bRadioButtonNo.click();
		cedcdCohortPage.a4bName.sendKeys("Kevin Mata");
		cedcdCohortPage.a4bCohortPosition.sendKeys("Tester");
		cedcdCohortPage.a4bCountryCode.sendKeys("");
		cedcdCohortPage.a4bPhone.sendKeys("7031112345");
		cedcdCohortPage.a4bEmail.sendKeys("kevinmata@mail.com");
		CucumberLogUtils.logScreenShot();

		/** Entering all data for the Principal Investigators tab */
		cedcdCohortPage.principalInvestigatorTab.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.a5InvestigatorsName.sendKeys("Shomir Uddin");
		cedcdCohortPage.a5InvestigatorsInstitution.sendKeys("National Cancer Institute");
		cedcdCohortPage.a5InvestigatorsEmails.sendKeys("Shomir.Uddinn@mail.com");
		
		/** A6 Selecting same as 4a checkbox */
		cedcdCohortPage.sameAs4aCheckbox.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

		/** Entering all data for the Eligibility and Enrollments tab */
		cedcdCohortPage.eligibilityAndEnrollmentTab.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.eligibleSexAllValue.click();
		cedcdCohortPage.baselinePopulationCheckbox.click();
		cedcdCohortPage.baselinePopulationTextbox.sendKeys("Automated test case in Progress");
		cedcdCohortPage.eligibilityDiseaseOtherSpecifyTextbox.sendKeys("Diabetes");
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
		CucumberLogUtils.logScreenShot();

		/** Entering all data for the Recruitment tab*/
		cedcdCohortPage.recruitmentTab.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.questionnaireFrequency.sendKeys("Monthly");
		cedcdCohortPage.mostRecentYear.sendKeys("2018");
		cedcdCohortPage.a11PhoneInterview.click();
		cedcdCohortPage.a11AdministeredViaWebBasedDevice.click();
		cedcdCohortPage.a11otherPleaseSpecify.click();
		cedcdCohortPage.a11otherPleaseSpecifyTextbox.sendKeys("A11 Automated Key Presses");
		cedcdCohortPage.a12RequireIRBApproval.click();
		cedcdCohortPage.a12LinkingOtherDatabases.click();
		cedcdCohortPage.a12OtherPleaseSpecify.click();
		cedcdCohortPage.a12OtherPleaseSpecifyTextbox.sendKeys("A12 Automated Key Presses");
		cedcdCohortPage.a13AdvisoryCommittees.click();
		cedcdCohortPage.a13GeneticVariantsBloodPressure.click();
		cedcdCohortPage.a13OtherPleaseSpecify.click();
		cedcdCohortPage.a13OtherPleaseSpecifyTextbox.sendKeys("A13 Automated Key Presses");
		CucumberLogUtils.logScreenShot();

		/**
		 * Entering all data for the Documents tab (there is nothing entered in this
		 * section)
		 */
		/** Saving sections and proceeding to next section */
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(cedcdCohortPage.saveAndContinueButton);
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(cedcdCohortPage.saveAndContinueButton);
		//cedcdCohortPage.saveAndContinueButton.click();
		CucumberLogUtils.logScreenShot();
		
		/** Selecting enrollment date for section B */
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(cedcdCohortPage.enrollmentDateBox);
		MiscUtils.sleep(2000);
		cedcdCohortPage.enrollmentDateBox.sendKeys("04/06/2021");
		CucumberLogUtils.logScreenShot();
		
		/** Saving sections and proceeding to next section */
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(cedcdCohortPage.saveAndContinueButton);
		MiscUtils.sleep(2000);
		cedcdCohortPage.saveAndContinueButton.click();
				
		/** C1 radio buttons filled out */
		MiscUtils.sleep(3000);
		cedcdCohortPage.c1BaselineYesRadio.click();
		cedcdCohortPage.c1FollowUpYesRadio.click();

		/** C2 radio buttons filled out */
		cedcdCohortPage.c2BaselineYesRadio.click();
		cedcdCohortPage.c2FollowUpYesRadio.click();

		/** C3 radio buttons filled out */
		cedcdCohortPage.c3BaselineYesRadio.click();
		cedcdCohortPage.c3FollowUpYesRadio.click();

		/** C4 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c4BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c4FollowUpYesRadio.click();

		/** C5 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c5BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c5FollowUpYesRadio.click();

		/** C6 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c6BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c6FollowUpYesRadio.click();

		/** C7 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c7BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c7FollowUpYesRadio.click();

		/** C8 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c8BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c8FollowUpYesRadio.click();

		/** C9 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c9BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c9FollowUpYesRadio.click();

		/** C10 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c10BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c10FollowUpYesRadio.click();
		CucumberLogUtils.logScreenShot();

		/** C11 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c11BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c11FollowUpYesRadio.click();

		/** C12 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c12BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c12FollowUpYesRadio.click();

		/** C13 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c13BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c13FollowUpYesRadio.click();

		/** C14 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c14BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c14FollowUpYesRadio.click();

		/** C15 Check box options */

		/** C15 Baseline selected values */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c15CigarBaselineValue.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c15ChewTobaccoBaselineValue.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c15OtherBaselineValue.click();
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(cedcdCohortPage.c15OtherBaselineTextBox, "C15 Baseline Text Box Test");

		/** C15 Follow Up selected values */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c15PipesFollowUpValue.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c15ECigarettesFollowUpValue.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c15OtherFollowUpValue.click();
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(cedcdCohortPage.c15OtherFollowUpTextBox, "C15 Follow Up Text Box Test");

		/** C16 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c16BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c16FollowUpYesRadio.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

		/** C17 radio buttons filled out */
		cedcdCohortPage.c17BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c17FollowUpYesRadio.click();

		/** C18 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c18BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c18FollowUpYesRadio.click();

		/** C19 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c19BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c19FollowUpYesRadio.click();

		/** C20 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c20BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c20FollowUpYesRadio.click();

		/** C21 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c21BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c21FollowUpYesRadio.click();

		/** C22 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c22BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c22FollowUpYesRadio.click();

		/** C23 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c23BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c23FollowUpYesRadio.click();

		/** C24 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c24BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c24FollowUpYesRadio.click();

		/** C25 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c25BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c25FollowUpYesRadio.click();

		/** C26 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c26BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c26FollowUpYesRadio.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

		/** C27 radio buttons filled out */
		cedcdCohortPage.c27BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c27FollowUpYesRadio.click();

		/** C28 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c28BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c28FollowUpYesRadio.click();

		/** C29 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c29BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c29FollowUpYesRadio.click();

		/** C30 radio buttons filled out */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c30BaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c30FollowUpYesRadio.click();
		CucumberLogUtils.logScreenShot();
		
		/** Clicking the Other Medical Conditions tab for section C */
		MiscUtils.sleep(2000);
		cedcdCohortPage.otherMedicalConditionsTab.click();
		
		/** C31 filling out all of the radio buttons for tab */
		
		/** Diabetes Yes selection for baseline and follow ups */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31DiabetesBaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31DiabetesFollowUpYesRadio.click();
		
		/** Stroke Yes selection for baseline and follow ups */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31StrokeBaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31StrokeFollowUpYesRadio.click();
		
		/** COPD and/or Emphysema Yes selection for baseline and follow ups */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31COPDBaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31COPDFollowUpYesRadio.click();
		
		/** Cardiovascular Disease Yes selection for baseline and follow ups */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31CardiovascularBaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31CardiovascularFollowUpYesRadio.click();
		
		/** Osteoporosis Yes selection for baseline and follow ups */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31OsteoporosisBaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31OsteoporosisFollowUpYesRadio.click();
		
		/** Mental Health Yes selection for baseline and follow ups */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31MentalHealthBaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31MentalHealthFollowUpYesRadio.click();
		
		/** Cognitive Decline Yes selection for baseline and follow ups */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31CognitiveDeclineBaselineYesRadio.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c31CognitiveDeclineFollowUpYesRadio.click();
		CucumberLogUtils.logScreenShot();
		
		/** Clicking the Cancer Related Conditions tab for section C */
		MiscUtils.sleep(2000);
		cedcdCohortPage.cancerRelatedConditionsTab.click();
		
		/** C32 filling out selected check boxes and text boxes */
		MiscUtils.sleep(2000);
		cedcdCohortPage.c32CancerToxicityCheckbox.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c32CancerLateEffectsCheckbox.click();
		MiscUtils.sleep(2000);
		cedcdCohortPage.c32CancerOtherCheckbox.click();
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(cedcdCohortPage.c32CancerOtherSpecifyTextbox, "C32 Text Box Test");
		CucumberLogUtils.logScreenShot();
		
		/** Saving sections and proceeding to next section */
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(cedcdCohortPage.saveAndContinueButton);
		MiscUtils.sleep(2000);
		cedcdCohortPage.saveAndContinueButton.click();
		
		/** Filling out Section D */
		MiscUtils.sleep(3000);
		cedcdCohortPage.cancerInformationTab.click();
		cedcdCohortPage.d2AscertainedDateTextBox.sendKeys("4/13/2021");
		cedcdCohortPage.d2AscertainedDateTextBox.sendKeys(Keys.RETURN);
		CucumberLogUtils.logScreenShot();
		cedcdCohortPage.SectionDCheckBoxes.get(0).click();
		cedcdCohortPage.SectionDRadioButton.get(0).click();
		cedcdCohortPage.SectionDRadioButton.get(2).click();
		cedcdCohortPage.SectionDRadioButton.get(4).click();
		cedcdCohortPage.SectionDRadioButton.get(6).click();
		CucumberLogUtils.logScreenShot();
		cedcdCohortPage.SectionDRadioButton.get(8).click();
		cedcdCohortPage.SectionDRadioButton.get(10).click();
		cedcdCohortPage.SectionDRadioButton.get(12).click();
		cedcdCohortPage.SectionDRadioButton.get(14).click();
		cedcdCohortPage.SectionDCheckBoxes.get(15).click();
		CucumberLogUtils.logScreenShot();
		
		/** Saving sections and proceeding to next section */
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(cedcdCohortPage.saveAndContinueButton);
		MiscUtils.sleep(2000);
		cedcdCohortPage.saveAndContinueButton.click();
		
		/** Filling out Section E */
		/** Sends year value for E1 */
		MiscUtils.sleep(3000);
		cedcdCohortPage.e1MortalityFollowUpTextBox.sendKeys("2000");
		
		/** Answering E.2 check boxes and text box */
		cedcdCohortPage.e2NDICheckBox.click();
		cedcdCohortPage.e2OtherCheckBox.click();
		cedcdCohortPage.e2OtherTextBox.sendKeys("With death certificates");
		MiscUtils.sleep(2000);		
		/** Sending answers for E3 */
		cedcdCohortPage.e3RadioYes.click();
		
		/** E.4 Do you have cause of death for most subjects radio button yes or no */
		cedcdCohortPage.e4RadioYes.click();
		
		/** Sending answers for E4's check boxes and text boxes */
		cedcdCohortPage.e4ICD9CheckBox.click();
		cedcdCohortPage.e4ICD10CheckBox.click();
		cedcdCohortPage.e4OtherCodeCheckBox.click();
		cedcdCohortPage.e4OtherCodeTextBox.sendKeys("Another Code that's not listed");
		
		/** Answering E5's What is the number of deaths in your cohort as of most recent mortality follow-up question */
		cedcdCohortPage.e5MortalityTextBox.sendKeys("4200");
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		
		/** Saving sections and proceeding to next section */
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(cedcdCohortPage.saveAndContinueButton);
		MiscUtils.sleep(2000);
		cedcdCohortPage.saveAndContinueButton.click();
		
		/** Filling out Section F **/
		MiscUtils.sleep(3000);
		cedcdCohortPage.SectionFRadioButtons.get(0).click();
		cedcdCohortPage.SectionFRadioButtons.get(2).click();
		cedcdCohortPage.SectionFRadioButtons.get(4).click();
		cedcdCohortPage.SectionFRadioButtons.get(7).click();
		cedcdCohortPage.sectionFWebsiteTextBox.sendKeys("https://wordcounter.net/");
		cedcdCohortPage.SectionFRadioButtons.get(8).click();
		CucumberLogUtils.logScreenShot();
		
		/** Saving sections and proceeding to next section */
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(cedcdCohortPage.saveAndContinueButton);
		MiscUtils.sleep(2000);
		cedcdCohortPage.saveAndContinueButton.click();
		
		/** Filling out Section G **/
		/** Answering G.1 Blood */
		MiscUtils.sleep(3000);
		cedcdCohortPage.g1BaselineYesValue.click();
		cedcdCohortPage.g1SerumBaselineCheckBox.click();
		cedcdCohortPage.g1BuffyCoatBaselineCheckBox.click();
		cedcdCohortPage.g1FollowUpYesValue.click();
		cedcdCohortPage.g1OtherBloodDerivativeFollowUpCheckBox.click();
		cedcdCohortPage.g1PlasmaFollowUpCheckBox.click();
		CucumberLogUtils.logScreenShot();
		
		/** Answering G.2 Buccal/Saliva */
		cedcdCohortPage.g2BaselineRadioYes.click();
		cedcdCohortPage.g2FollowUpRadioYes.click();
		
		/** Answering G.3 Tissue (include tumor and/or normal) */
		cedcdCohortPage.g3BaselineRadioYes.click();
		cedcdCohortPage.g3FollowUpRadioYes.click();
		
		/** Answering G.4 Urine */
		cedcdCohortPage.g4BaselineRadioYes.click();
		cedcdCohortPage.g4FollowUpRadioYes.click();
		
		/** Answering G.5 Feces */
		cedcdCohortPage.g5BaselineRadioYes.click();
		cedcdCohortPage.g5FollowUpRadioYes.click();
		
		/** Answering G.6 Other (e.g. toenails) */
		cedcdCohortPage.g6BaselineRadioYes.click();
		cedcdCohortPage.g6BaselineTextBox.sendKeys("Answering G6 Baseline Other Text Box");

		cedcdCohortPage.g6FollowUpRadioYes.click();
		cedcdCohortPage.g6FollowUpTextBox.sendKeys("Answering G6 Follow Up Other Text Box");
		
		/** Answering G.7 Did you collect repeated samples over multiple timepoints for the same individuals? */
		cedcdCohortPage.g7RadioYes.click();
		
		/** Answering G.8 If your cohort does not currently collect tumor blocks, do you have information on where the blocks are kept/stored? */
		cedcdCohortPage.g8RadioYes.click();
		CucumberLogUtils.logScreenShot();
		
		/** Switching to Additional Data Collected tab */
		cedcdCohortPage.additionalDataCollectedTab.click();
		
		/** Answering G.9 Genotyping Data (SNP) */
		cedcdCohortPage.g9RadioYes.click();
		
		/** Answering G.10 Sequencing Data – Exome */
		cedcdCohortPage.g10RadioYes.click();
		MiscUtils.sleep(2000);
		
		/** Answering G.11 Sequencing Data – Whole Genome */
		cedcdCohortPage.g11RadioYes.click();
		MiscUtils.sleep(2000);
		
		/** Answering G.12 Epigenetic Data (methylation, miRNA, histone chip-on-chip data) */
		cedcdCohortPage.g12RadioYes.click();
		
		/** Answering G.13 Transcriptomics Data */
		cedcdCohortPage.g13RadioYes.click();
		
		/** Answering G.14 Microbiome Data (16S RNA, metagenomics) */
		cedcdCohortPage.g14RadioYes.click();
		CucumberLogUtils.logScreenShot();
		
		/** Switching to Metabolomics Data tab */
		cedcdCohortPage.metabolicDataTab.click();
		
		/** Answering G.15 Metabolomic Data (from MS and/or NMR).  If answered Yes, the remainder of the questionnaire (G15a-G15i) is required.  If answered no, then you can just save the questionnaire */
		cedcdCohortPage.g15RadioYes.click();
		
		/** Answering G.15a Are the biospecimens collected fasting samples? */
		cedcdCohortPage.g15ARadioYes.click();
		
		/** Answering G.15b What are the disease outcome(s) in your study?* (Select all that apply) */
		cedcdCohortPage.g15BCancerCheckBoxValue.click();
		cedcdCohortPage.g15BDiabetesCheckBoxValue.click();
		cedcdCohortPage.g15BOtherSpecifyCheckBoxValue.click();
		cedcdCohortPage.g15BOtherSpecifyTextBoxValue.sendKeys("Answering G15b's Other, Specify text box");
		
		/** Answering G.15c Are you a member of the Consortium of Metabolomics Studies (COMETS)? */
		JavascriptUtils.clickByJS(cedcdCohortPage.g15CRadioButtonYes);
		
		/** Answering G.15d What is the number of participants with metabolomics data in your study? */
		cedcdCohortPage.g15DTextBox.sendKeys("4200");
		
		/** Answering G.15e Which laboratory or company was used for the analysis? */
		cedcdCohortPage.g15ETextBox.sendKeys("The NIH laboratories");
		
		/** Answering G.15f Which type(s) of analytical platform was used, (e.g., NMR, Orbitrap mass spectrometry, QTOF mass spectrometry)? */
		cedcdCohortPage.g15FTextBox.sendKeys("QTOF Mass Spectrometry");
		CucumberLogUtils.logScreenShot();
		
		/** Answering G.15g Which separation platform(s) was used (e.g., GC, HILIC, RPLC, Ion pairing LC)? */
		cedcdCohortPage.g15GTextBox.sendKeys("Ion pairing LC and HILIC");
		
		/** Answering G.15h How many metabolites were measured? */
		cedcdCohortPage.g15HTextBox.sendKeys("321");
		
		/** Answering G.15i What year were samples analyzed? */
		cedcdCohortPage.g15ITextBox.sendKeys("2000");
		CucumberLogUtils.logScreenShot();
		
		/** Click on the Biospecimens Counts */
		cedcdCohortPage.biospecimenCountsTab.click();
		
		/** Saving on section G */
		MiscUtils.sleep(2000);
		cedcdCohortPage.saveButton.click();
		MiscUtils.sleep(3000);
		}
	

	@When("submits the Cohort Study for Review")
	public void submits_the_Cohort_Study_for_Review() {
		cedcdCohortPage.submitForReviewButton.click();
		MiscUtils.sleep(3000);	
		/** Confiriming submission */
		cedcdCohortPage.confirmSubmitPopUpButton.click();
	}

	@Then("the Cohort Study Questionnaire is successfully submitted")
	public void the_Cohort_Study_Questionnaire_is_successfully_submitted() {
		
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
		cedcdCohortPage.a2TextBox.clear();
		cedcdCohortPage.a2TextBox.sendKeys("This is an automated test case12124234134123432");
		Thread.sleep(2000);

		/** A3 clearing of previous data and completion of section */
		JavascriptUtils.clearByJS(cedcdCohortPage.a3TextBox);
		cedcdCohortPage.a3TextBox.sendKeys("AgainThisIsAnAutomatedTestCase1213423424324234234234312.com");
		Thread.sleep(2000);

		/** A4 clearing of previous data and completion of section */
		cedcdCohortPage.a4aName.click();
		JavascriptUtils.clearByJS(cedcdCohortPage.a4aName);
		cedcdCohortPage.a4aName.sendKeys(Keys.BACK_SPACE);
		cedcdCohortPage.a4aName.sendKeys("Kevin Mata");
		Thread.sleep(2000);

		cedcdCohortPage.a4aCohortPosition.click();
		JavascriptUtils.clearByJS(cedcdCohortPage.a4aCohortPosition);
		cedcdCohortPage.a4aCohortPosition.sendKeys(Keys.BACK_SPACE);
		cedcdCohortPage.a4aCohortPosition.sendKeys("Test Lead 1234567890");
		Thread.sleep(2000);

		cedcdCohortPage.a4aCountryCode.sendKeys("");
		Thread.sleep(1000);

		cedcdCohortPage.a4aPhone.click();
		JavascriptUtils.clearByJS(cedcdCohortPage.a4aPhone);
		cedcdCohortPage.a4aPhone.sendKeys(Keys.BACK_SPACE);
		cedcdCohortPage.a4aPhone.sendKeys("1234567890");
		Thread.sleep(1000);

		cedcdCohortPage.a4aEmail.click();
		JavascriptUtils.clearByJS(cedcdCohortPage.a4aEmail);
		cedcdCohortPage.a4aEmail.sendKeys(Keys.BACK_SPACE);
		cedcdCohortPage.a4aEmail.sendKeys("diego.juarez@mail12345678900987654321.com");
		Thread.sleep(8000);

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
	
	@Then("Section E of the Questionnaire is filled out")
	public void section_E_of_the_Questionnaire_is_filled_out() throws InterruptedException {
		
		/** Clicks on the Mortality section tab */
		cedcdCohortPage.sectionE.click();
		
		/** Sends year value for E1 */
		cedcdCohortPage.e1MortalityFollowUpTextBox.sendKeys("2000");
		
		/** Answering E.2 check boxes and text box */
		cedcdCohortPage.e2NDICheckBox.click();
		cedcdCohortPage.e2OtherCheckBox.click();
		cedcdCohortPage.e2OtherTextBox.sendKeys("With death certificates");
		Thread.sleep(5000);		
		/** Sending answers for E3 */
		cedcdCohortPage.e3RadioYes.click();
		
		/** E.4 Do you have cause of death for most subjects radio button yes or no */
		cedcdCohortPage.e4RadioYes.click();
		
		/** Sending answers for E4's check boxes and text boxes */
		cedcdCohortPage.e4ICD9CheckBox.click();
		cedcdCohortPage.e4ICD10CheckBox.click();
		cedcdCohortPage.e4OtherCodeCheckBox.click();
		cedcdCohortPage.e4OtherCodeTextBox.sendKeys("Another Code that's not listed");
		
		/** Answering E5's What is the number of deaths in your cohort as of most recent mortality follow-up question */
		cedcdCohortPage.e5MortalityTextBox.sendKeys("4200");
		Thread.sleep(5000);
		
		/** Saving on section E of the questionnaire */
		cedcdCohortPage.saveButton.click();
		Thread.sleep(1000);
		CucumberLogUtils.logScreenShot();
		Thread.sleep(1000);
	}

	@Then("Section E status Circle is green")
	public void section_E_status_Circle_is_green() {
	}
	
	@When("selects first automated cohort")
	public void selects_first_automated_cohort() {
		
	}
	
	@Then("Section B of the Questionnaire is filled out")
	public void Section_B_of_the_Questionnaire_is_filled_out() {
		cedcdCohortPage.nextButton.click();
		cedcdCohortPage.enrollmentDateBox.sendKeys("04/06/2021");
	}
	
	@Then("Section D of the Questionnaire is filled out")
	public void Section_D_of_the_Questionnaire_is_filled_out() {
		cedcdCohortPage.nextButton.click();
		cedcdCohortPage.nextButton.click();
		cedcdCohortPage.nextButton.click();
		cedcdCohortPage.cancerInformationTab.click();
		cedcdCohortPage.d2AscertainedDateTextBox.sendKeys("4/13/2021");
		cedcdCohortPage.d2AscertainedDateTextBox.sendKeys(Keys.RETURN);
		cedcdCohortPage.SectionDCheckBoxes.get(0).click();
		cedcdCohortPage.SectionDRadioButton.get(0).click();
		cedcdCohortPage.SectionDRadioButton.get(2).click();
		cedcdCohortPage.SectionDRadioButton.get(4).click();
		cedcdCohortPage.SectionDRadioButton.get(6).click();
		cedcdCohortPage.SectionDRadioButton.get(8).click();
		cedcdCohortPage.SectionDRadioButton.get(10).click();
		cedcdCohortPage.SectionDRadioButton.get(12).click();
		cedcdCohortPage.SectionDRadioButton.get(14).click();
		cedcdCohortPage.SectionDCheckBoxes.get(15).click();
	}
	
	@Then("Section F of the Questionnaire is filled out")
	public void Section_F_of_the_Questionnaire_is_filled_out() {
		cedcdCohortPage.nextButton.click();
		cedcdCohortPage.nextButton.click();
		cedcdCohortPage.nextButton.click();
		cedcdCohortPage.nextButton.click();
		cedcdCohortPage.nextButton.click();
		cedcdCohortPage.SectionFRadioButtons.get(0).click();
		cedcdCohortPage.SectionFRadioButtons.get(2).click();
		cedcdCohortPage.SectionFRadioButtons.get(4).click();
		cedcdCohortPage.SectionFRadioButtons.get(7).click();
		cedcdCohortPage.sectionFWebsiteTextBox.sendKeys("https://wordcounter.net/");
		cedcdCohortPage.SectionFRadioButtons.get(8).click();
	}
	
	@Then("Section G of the Questionnaire is filled out")
	public void section_G_of_the_Questionnaire_is_filled_out() throws InterruptedException {
		
		/** Answering G.1 Blood */
		cedcdCohortPage.SectionG.click();
		Thread.sleep(1000);
		cedcdCohortPage.g1BaselineYesValue.click();
		cedcdCohortPage.g1SerumBaselineCheckBox.click();
		cedcdCohortPage.g1BuffyCoatBaselineCheckBox.click();
		cedcdCohortPage.g1FollowUpYesValue.click();
		cedcdCohortPage.g1OtherBloodDerivativeFollowUpCheckBox.click();
		cedcdCohortPage.g1PlasmaFollowUpCheckBox.click();
		
		/** Answering G.2 Buccal/Saliva */
		cedcdCohortPage.g2BaselineRadioYes.click();
		cedcdCohortPage.g2FollowUpRadioYes.click();
		
		/** Answering G.3 Tissue (include tumor and/or normal) */
		cedcdCohortPage.g3BaselineRadioYes.click();
		cedcdCohortPage.g3FollowUpRadioYes.click();
		
		/** Answering G.4 Urine */
		cedcdCohortPage.g4BaselineRadioYes.click();
		cedcdCohortPage.g4FollowUpRadioYes.click();
		
		/** Answering G.5 Feces */
		cedcdCohortPage.g5BaselineRadioYes.click();
		cedcdCohortPage.g5FollowUpRadioYes.click();
		
		/** Answering G.6 Other (e.g. toenails) */
		cedcdCohortPage.g6BaselineRadioYes.click();
		cedcdCohortPage.g6BaselineTextBox.sendKeys("Answering G6 Baseline Other Text Box");
		
		cedcdCohortPage.g6FollowUpRadioYes.click();
		cedcdCohortPage.g6FollowUpTextBox.sendKeys("Answering G6 Follow Up Other Text Box");
		
		/** Answering G.7 Did you collect repeated samples over multiple timepoints for the same individuals? */
		cedcdCohortPage.g7RadioYes.click();
		
		/** Answering G.8 If your cohort does not currently collect tumor blocks, do you have information on where the blocks are kept/stored? */
		cedcdCohortPage.g8RadioYes.click();
		
		/** Switching to Additional Data Collected tab */
		cedcdCohortPage.additionalDataCollectedTab.click();
		
		/** Answering G.9 Genotyping Data (SNP) */
		cedcdCohortPage.g9RadioYes.click();
		
		/** Answering G.10 Sequencing Data – Exome */
		cedcdCohortPage.g10RadioYes.click();
		Thread.sleep(1000);
		
		/** Answering G.11 Sequencing Data – Whole Genome */
		cedcdCohortPage.g11RadioYes.click();
		Thread.sleep(1000);
		
		/** Answering G.12 Epigenetic Data (methylation, miRNA, histone chip-on-chip data) */
		cedcdCohortPage.g12RadioYes.click();
		
		/** Answering G.13 Transcriptomics Data */
		cedcdCohortPage.g13RadioYes.click();
		
		/** Answering G.14 Microbiome Data (16S RNA, metagenomics) */
		cedcdCohortPage.g14RadioYes.click();
		
		/** Switching to Metabolomics Data tab */
		cedcdCohortPage.metabolicDataTab.click();
		
		/** Answering G.15 Metabolomic Data (from MS and/or NMR).  If answered Yes, the remainder of the questionnaire (G15a-G15i) is required.  If answered no, then you can just save the questionnaire */
		cedcdCohortPage.g15RadioYes.click();
		
		/** Answering G.15a Are the biospecimens collected fasting samples? */
		cedcdCohortPage.g15ARadioYes.click();
		
		/** Answering G.15b What are the disease outcome(s) in your study?* (Select all that apply) */
		cedcdCohortPage.g15BCancerCheckBoxValue.click();
		cedcdCohortPage.g15BDiabetesCheckBoxValue.click();
		cedcdCohortPage.g15BOtherSpecifyCheckBoxValue.click();
		cedcdCohortPage.g15BOtherSpecifyTextBoxValue.sendKeys("Answering G15b's Other, Specify text box");
		
		/** Answering G.15c Are you a member of the Consortium of Metabolomics Studies (COMETS)? */
		
		JavascriptUtils.clickByJS(cedcdCohortPage.g15CRadioButtonYes);
		
		/** Answering G.15d What is the number of participants with metabolomics data in your study? */
		cedcdCohortPage.g15DTextBox.sendKeys("4200");
		
		/** Answering G.15e Which laboratory or company was used for the analysis? */
		cedcdCohortPage.g15ETextBox.sendKeys("The NIH laboratories");
		
		/** Answering G.15f Which type(s) of analytical platform was used, (e.g., NMR, Orbitrap mass spectrometry, QTOF mass spectrometry)? */
		cedcdCohortPage.g15FTextBox.sendKeys("QTOF Mass Spectrometry");
		
		/** Answering G.15g Which separation platform(s) was used (e.g., GC, HILIC, RPLC, Ion pairing LC)? */
		cedcdCohortPage.g15GTextBox.sendKeys("Ion pairing LC and HILIC");
		
		/** Answering G.15h How many metabolites were measured? */
		cedcdCohortPage.g15HTextBox.sendKeys("321");
		
		/** Answering G.15i What year were samples analyzed? */
		cedcdCohortPage.g15ITextBox.sendKeys("2000");
		
		/** Click on the Biospecimens Counts */
		cedcdCohortPage.biospecimenCountsTab.click();
		
		/** Saving on section G */
		cedcdCohortPage.saveButton.click();
		Thread.sleep(20000);
		}

	@Then("Section G status Circle is green")
	public void section_G_status_Circle_is_green() {
	}
}
