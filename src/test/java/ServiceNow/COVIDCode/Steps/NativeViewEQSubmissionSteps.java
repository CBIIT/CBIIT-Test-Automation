package ServiceNow.COVIDCode.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.COVIDCode.Pages.NativeViewEnrollmentViewPage;
import ServiceNow.COVIDCode.Pages.NativeViewEnrollmentsPage;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NativeViewEQSubmissionSteps extends PageInitializer {

	@Given("a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application")
	public void a_COVIDcode_Study_nurse_with_an_Admin_role_has_logged_in_to_the_COVIDcode_Study_Native_View_application()
			throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
	}

	@Given("is on the COVIDcode Enrollments page")
	public void is_on_the_COVIDcode_Enrollments_page() throws InterruptedException {
		CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.id("filter")));
		// Thread.sleep(3000);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
		// driver.findElement(By.id("filter")).sendKeys("CovidCode App");
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollementsPage.COVIDCodeEnrollmentsLink.click();
		// WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='1e1cc5b71b3f8090afebdd39bc4bcb28']/div/div")).click();
		String titleOfNativeEQ = WebDriverUtils.webDriver.getTitle();
		System.out.println("Title of Native View Enrollments Questionnaire page is: " + titleOfNativeEQ);
	}

	@When("the COVIDcode Study nurse begins an Enrollment Questionnaire for a {string} user who consents {string} to join the study")
	public void the_COVIDcode_Study_nurse_begins_an_Enrollment_Questionnaire_for_a_user_who_consents_to_join_the_study(
			String group, String consent) throws InterruptedException {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.frame);
		Thread.sleep(2000);
		// WebDriverUtils.webDriver.findElement(By.cssSelector("#sysverb_new")).click();
		nativeViewEnrollementsPage.newButton.click();
		CucumberLogUtils.logScreenShot();
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.userGroupIDDropDown, group);
		//CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.hostHospitalCodeDropDown, "HCC");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.consentDropDown, consent);
		nativeViewEnrollmentViewPage.patientLastNameField.sendKeys("AutomatedLN");
		nativeViewEnrollmentViewPage.patientFirstName.sendKeys("AutomatedFN");
		nativeViewEnrollmentViewPage.patientMiddleInitial.sendKeys("M");
		nativeViewEnrollmentViewPage.contactEmailAddress.sendKeys("email@automatedtest.com");
		nativeViewEnrollmentViewPage.contactPhoneNumber.sendKeys("1112223333");
		nativeViewEnrollmentViewPage.streetAddress1.sendKeys("NCI Rockville");
		nativeViewEnrollmentViewPage.city.sendKeys("Rockville");
		nativeViewEnrollmentViewPage.state.sendKeys("MD");
		nativeViewEnrollmentViewPage.zipCode.sendKeys("20850");
		CucumberLogUtils.logScreenShot();
	}

	@When("fills out the Enrollment Questionnaire by entering all required information including Demographics, Symptomology, and Exposures and Risk Factors")
	public void fills_out_the_Enrollment_Questionnaire_by_entering_all_required_information_including_Demographics_Symptomology_and_Exposures_and_Risk_Factors()
			throws InterruptedException {
		nativeViewEnrollmentViewPage.dateFormCompletedField.sendKeys("04-01-2020");
		nativeViewEnrollmentViewPage.whatIsYourDateOfBirthField.sendKeys("04-01-1990");
		JavascriptUtils.scrollIntoView(nativeViewEnrollmentViewPage.whatIsYourBioSexDropDown);
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.whatIsYourBioSexDropDown, "Female");
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nativeViewEnrollmentViewPage.whatIsYourCurrentHeightDropDown);
		MiscUtils.sleep(500);
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.whatIsYourCurrentHeightDropDown, "Foot/Inches");
		MiscUtils.sleep(500);
		nativeViewEnrollmentViewPage.heightField.sendKeys("5");
		nativeViewEnrollmentViewPage.heightInches.sendKeys("10");
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.currentWeightDropDown, "Pounds");
		MiscUtils.sleep(500);
		nativeViewEnrollmentViewPage.weightField.sendKeys("200");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.howWouldYouDescribeYourRaceDropDown, "Asian");
		MiscUtils.sleep(500);
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.areYouHispaniceOrLatinoDropDown, "No");
		MiscUtils.sleep(500);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.symptomologyTab.click();
		CucumberLogUtils.logScreenShot();		
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.wereYouSymptomaticDropDown, "Yes");
		nativeViewEnrollmentViewPage.whenFirstDevelopSymptomsField.sendKeys("04-01-2020");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.howWasTheSampleTakenDropDown, "Nasal or throat swab");	
		nativeViewEnrollmentViewPage.dateOfficiallyDiagnosed.sendKeys("04-09-2020");
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.exposuredAndRiskFactorsTab.click();
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.tellMeMedicalConditionsLockButton.click();
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.tellMeMedicalConditionsLookupButton.click();
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.multiSelectOptionsSearchBar.sendKeys("Asthma");
		nativeViewEnrollmentViewPage.multiSelectOptionsSearchBar.sendKeys(Keys.RETURN);
		CucumberLogUtils.logScreenShot();
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.hasPatientVapedDropDown, "Never");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.hasPatientSmoked100CigarretesDropDown,
				"Currently smokes daily");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.howManyCigarettesPatientSmokesDailyDD, "1-10");
		JavascriptUtils.scrollDown(500);
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.antiInflammatoryDD, "2-7 days ago");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.strokeMedicationDD, "Over a year ago");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.paracetamolAcetaminophenDD, "Today or yesterday");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.bloodThinnersDD, "Never");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.asthmaMedicationDD, "Never");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.aceInhibitorsDD, "1-12 months ago");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.allergyMedicationUsedDD, "Over a year ago");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.usedArbs, "Never");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.usedAntibiotics, "Over a year ago");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.exposureToCOVID19Frequency, "Never");
		CommonUtils.selectDropDownValue(nativeViewEnrollmentViewPage.haveYouBeenWearingFaceMask, "Yes");
		CucumberLogUtils.logScreenShot();
	}

	@When("submits the Enrollment Questionnaire")
	public void submits_the_Enrollment_Questionnaire() {
		nativeViewEnrollmentViewPage.submitButton.click();
	}

	@Then("the Enrollment Questionnaire should be successfully submitted")
	public void the_Enrollment_Questionnaire_should_be_successfully_submitted() {	
		CommonUtils.selectDropDownValue(nativeViewEnrollementsPage.searchDropDown, "Patient's First Name");
		nativeViewEnrollementsPage.searchTextBox.sendKeys("NVAutomatedFN");
		nativeViewEnrollementsPage.searchTextBox.sendKeys(Keys.RETURN);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();	
	}

}
