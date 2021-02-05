package ServiceNow.COVIDCode.StepsImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import appsCommon.PageInitializer;

public class ServicePortalEQPageImpl extends PageInitializer {
	public static ServicePortalEQPageImpl obj = new ServicePortalEQPageImpl();

	public static void group1EQSubmissionWithoutDiseaseCourseAndRiskFactorsInfo(String groupUserID, String consent) {
		obj.groupUserAndConsent(groupUserID, consent);
		obj.requiredDemographicsInfo();
		obj.submittingEQ();
	}

	public void groupUserAndConsent(String groupUserID, String consent) {

		servicePortalQuestionnairePage.startNewQuestionnaireButton.click();
		servicePortalQuestionnairePage.EnrollmentCreationUserGroupIDSelectDropDown.click();
		List<WebElement> groupIDs = servicePortalQuestionnairePage.EnrollmentCreationUserGroupIDSelectDropDownValues;

		CommonUtils.selectValueFromBootStrapDropDown(groupIDs, groupUserID);
		servicePortalQuestionnairePage.enrollmentCreationWindowText.click();
		// click on create enrollment button
		servicePortalQuestionnairePage.createEnrollmentButton.click();

		// scrolling down page
		JavascriptUtils.scrollDown(700);

		covidCodeEQPage.enrollmentQuestionnaireConsentDropdown.click();
		List<WebElement> consentValues = covidCodeEQPage.enrollmentQuestionaireConsentDropDownValues;

		for (WebElement value : consentValues) {
			if (value.getText().contains(consent)) {
				value.click();

				break;
			}
		}

	}

	/**
	 * 
	 * This method fills out full name, required information labeled with *, and
	 * Demographics information Values are hard coded and can be changed accordingly
	 */
	public void requiredDemographicsInfo() {
		covidCodeEQPage.enrollmentQuestionnairePatientLastNameTextBox.sendKeys("AutomatedLN");
		covidCodeEQPage.enrollmentQuestionnairePatientFirstNameTextBox.sendKeys("AutomatedFNGroup3");
		covidCodeEQPage.enrollmentQuestionnairePatientMiddletNameTextBox.sendKeys("M");
		covidCodeEQPage.enrollmentQuestionnairePatientEmailAddressTextBox.sendKeys("email@email.com");
		covidCodeEQPage.enrollmentQuestionnairePatientPhoneNumberTextBox.sendKeys("1112223333");
		covidCodeEQPage.enrollmentQuestionnairePatientStreetAddress1TextBox.sendKeys("123 street");
		JavascriptUtils.scrollDown(700);
		covidCodeEQPage.enrollmentQuestionnairePatientCityTextBox.sendKeys("Rockville");
		covidCodeEQPage.enrollmentQuestionnairePatientStateTextBox.sendKeys("MD");
		covidCodeEQPage.enrollmentQuestionnairePatientZipCodeTextBox.sendKeys("12345");
		CommonUtils.click(covidCodeEQPage.demographicsTab);
		JavascriptUtils.selectDateByJS(covidCodeEQPage.enrollmentQuestionnaireDateFormCompletedBox, "04-06-2020");
		JavascriptUtils.selectDateByJS(covidCodeEQPage.enrollmentQuestionnaireDOBbox, "04-01-2000");
		covidCodeEQPage.enrollmentQuestionnaireBiologicalSexDropdown.click();
		List<WebElement> biologicalSexValues = covidCodeEQPage.enrollmentQuestionnaireBiologicalSexDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalSexValues, "Male");
		covidCodeEQPage.enrollmentQuestionnaireCurrentWeightDropdown.click();

		List<WebElement> currentWeightValues = covidCodeEQPage.enrollmentQuestionnaireCurrentWeightDropdownValues;
		CommonUtils.selectValueFromBootStrapDropDown(currentWeightValues, "Pounds");

		covidCodeEQPage.enrollmentQuestionnaireWeightTextBox.sendKeys("200");
		covidCodeEQPage.enrollmentQuestionnaireRaceDropdown.click();

		List<WebElement> raceValues = covidCodeEQPage.enrollmentQuestionnaireRaceDropdownValues;
		CommonUtils.selectValueFromBootStrapDropDown(raceValues, "Asian");

		covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoDropdown.click();
		List<WebElement> hispanicOrLatinoValues = covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoDropdownValues;
		CommonUtils.selectValueFromBootStrapDropDown(hispanicOrLatinoValues, "Yes");

		covidCodeEQPage.enrollmentQuestionnaireCurrentHeightDropdown.click();
		List<WebElement> heightDropdownValues = covidCodeEQPage.enrollmentQuestionnaireCurrentHeightDropdownValues;
		CommonUtils.selectValueFromBootStrapDropDown(heightDropdownValues, "Foot/Inches");

		covidCodeEQPage.enrollmentQuestionnaireFeetTextBox.sendKeys("5");
		covidCodeEQPage.enrollmentQuestionnaireInchesTextBox.sendKeys("10");
		/*
		 * covidCodeEQPage.whenOfficiallyDiagnosed.sendKeys("Aug 05, 2020");
		 */

		/*
		 * Clicks on the "Symptomology" tab
		 */

		covidCodeEQPage.symptomologyTab.click();

		/*
		 * Clicks on the "Were you symptomatic" drop down
		 */
		covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticDropdown.click();

		/*
		 * Selects yes value from "Were you symptomatic" drop down We can pass parameter
		 * when selecting yes or no options later
		 */
		CommonUtils.selectValueFromBootStrapDropDown(
				covidCodeEQPage.enrollmentQuestionnaireWereYouSymptomaticDropdownValues, "Yes");
		JavascriptUtils.selectDateByJS(covidCodeEQPage.enrollmentQuestionnaireWhenDevelopSymptoms, "04-01-2020");
		JavascriptUtils.selectDateByJS(covidCodeEQPage.enrollmentQuestionnaireWhenOfficiallyDiagnosedCalendar,
				"04-04-2020");
	}

	/**
	 * This method clicks on submit button and clicks on yes on the submission pop
	 * up
	 */
	public void submittingEQ() {
		covidCodeEQPage.enrollmentQuestionnaireSubmitButton.click();
		MiscUtils.sleep(2000);
		covidCodeEQPage.enrollmentQuestionnaireConfirmSubmissionYesButton.click();
	}

	public static void enrollmentSubmissionConfirmation() {
		MiscUtils.sleep(10000);
		String text = servicePortalQuestionnairePage.servicePortalEnrollmentQuestionnaireSubmissionConfirmationText
				.getText();
		boolean status = text.contains("has been successfully submitted!");
		Assert.assertEquals(true, status);
	}

	/***
	 * This method compare expected and actual list of drop down and assert it on Exposure and Risk Factors tab
	 * Enrollment Questionnaire in service portal
	 * element List of Webelement is hard coded
	 */
	public void servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown( ) {
		MiscUtils.sleep(2000);
		String[] expArray = {"-- None --", "Day of or day before onset of symptoms/diagnosis (if asymptomatic)", "2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)", "1 to 4 weeks prior to onset of symptoms/diagnosis (if asymptomatic)", "1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic)", "Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)", "Never", "Don't know", "Prefer not to answer" };
		List<WebElement> lst=WebDriverUtils.webDriver.findElements(By.xpath("//ul[@class='select2-results']/li/div"));
		List<String> act = new ArrayList<String>();
		for(WebElement e : lst){
		    act.add(e.getText());
		}
		List<String> exp = new ArrayList<String>(Arrays.asList(expArray));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	    Assert.assertEquals(act, exp);
	}
}
