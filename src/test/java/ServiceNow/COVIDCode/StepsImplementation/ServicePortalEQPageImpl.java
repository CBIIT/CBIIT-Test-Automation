package ServiceNow.COVIDCode.StepsImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializer;

public class ServicePortalEQPageImpl extends PageInitializer {
	public static ServicePortalEQPageImpl obj = new ServicePortalEQPageImpl();

	public static void group1EQSubmissionWithoutDiseaseCourseAndRiskFactorsInfo(String groupUserID, String consent) {
		obj.groupUserAndConsent(groupUserID, consent);
		obj.requiredDemographicsInfo();
		obj.submittingEQ();
	}

	public void groupUserAndConsent(String groupUserID, String consent) {
<<<<<<< Updated upstream
		MiscUtils.sleep(2000);
=======
<<<<<<< HEAD

=======
		MiscUtils.sleep(2000);
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
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
		covidCodeEQPage.enrollmentQuestionnairePatientFirstNameTextBox.sendKeys("AutomatedFN");
		covidCodeEQPage.enrollmentQuestionnairePatientMiddletNameTextBox.sendKeys("M");
		covidCodeEQPage.enrollmentQuestionnairePatientEmailAddressTextBox.sendKeys("email@email.com");
<<<<<<< Updated upstream
		covidCodeEQPage.enrollmentQuestionnairePatientPhoneNumberTextBox.sendKeys("111-222-3333");
=======
<<<<<<< HEAD
		covidCodeEQPage.enrollmentQuestionnairePatientPhoneNumberTextBox.sendKeys("1112223333");
=======
		covidCodeEQPage.enrollmentQuestionnairePatientPhoneNumberTextBox.sendKeys("111-222-3333");
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
		covidCodeEQPage.enrollmentQuestionnairePatientStreetAddress1TextBox.sendKeys("123 street");
		JavascriptUtils.scrollDown(700);
		covidCodeEQPage.enrollmentQuestionnairePatientCityTextBox.sendKeys("Rockville");
		covidCodeEQPage.enrollmentQuestionnairePatientStateTextBox.sendKeys("MD");
		covidCodeEQPage.enrollmentQuestionnairePatientZipCodeTextBox.sendKeys("12345");
		CommonUtils.click(covidCodeEQPage.demographicsTab);
		JavascriptUtils.selectDateByJS(covidCodeEQPage.enrollmentQuestionnaireDateFormCompletedBox, "04-06-2020");
		JavascriptUtils.selectDateByJS(covidCodeEQPage.enrollmentQuestionnaireDOBbox, "04-01-2000");
		covidCodeEQPage.enrollmentQuestionnaireBiologicalSexDropdown.click();
		MiscUtils.sleep(500);
		List<WebElement> biologicalSexValues = covidCodeEQPage.enrollmentQuestionnaireBiologicalSexDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalSexValues, "Male");
		covidCodeEQPage.enrollmentQuestionnaireCurrentWeightDropdown.click();
		MiscUtils.sleep(500);
		List<WebElement> currentWeightValues = covidCodeEQPage.enrollmentQuestionnaireCurrentWeightDropdownValues;
		CommonUtils.selectValueFromBootStrapDropDown(currentWeightValues, "Pounds");
		covidCodeEQPage.enrollmentQuestionnaireWeightTextBox.sendKeys("200");
		covidCodeEQPage.enrollmentQuestionnaireRaceDropdown.click();
		MiscUtils.sleep(500);
		List<WebElement> raceValues = covidCodeEQPage.enrollmentQuestionnaireRaceDropdownValues;
		CommonUtils.selectValueFromBootStrapDropDown(raceValues, "Asian");
		MiscUtils.sleep(500);
		covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoDropdown.click();
		List<WebElement> hispanicOrLatinoValues = covidCodeEQPage.enrollmentQuestionnaireHispanicOrLatinoDropdownValues;
		CommonUtils.selectValueFromBootStrapDropDown(hispanicOrLatinoValues, "Yes");
		MiscUtils.sleep(500);
		covidCodeEQPage.enrollmentQuestionnaireCurrentHeightDropdown.click();
		List<WebElement> heightDropdownValues = covidCodeEQPage.enrollmentQuestionnaireCurrentHeightDropdownValues;
		CommonUtils.selectValueFromBootStrapDropDown(heightDropdownValues, "Feet/Inches");

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
	 */

	public void servicePortalEnrollmentQuestionnaireExposureAndRiskAssertValueFromBootStrapDropDown(List<WebElement> lists, String[] arrayList) {
		MiscUtils.sleep(2000);
		List<String> act = new ArrayList<String>();
		for(WebElement l : lists){
		  act.add(l.getText());
		}
		List<String> exp = new ArrayList<String>(Arrays.asList(arrayList));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	  Assert.assertEquals(act, exp);
	}
    
	/***
	 * This method selects Yes on consent drop down
	 */
	public void initialQuestionnaireConcent() {
		covidCodeEQPage.enrollmentQuestionnaireConsentDropdown.click();
		List<WebElement> consentValues = covidCodeEQPage.enrollmentQuestionaireConsentDropDownValues;

		for (WebElement value : consentValues) {
			if (value.getText().contains("Yes")) {
				value.click();

				break;
			}
		}
	}

<<<<<<< Updated upstream
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
