package ServiceNow.COVIDCode.StepsImplementation;

import java.util.List;

import org.openqa.selenium.WebElement;

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

		covidCodeEQPage.userGroupIdDropdown.click();
		List<WebElement> groupIDs = covidCodeEQPage.dropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(groupIDs, groupUserID);

		// scrolling down page
		JavascriptUtils.scrollDown(700);
		covidCodeEQPage.consentDropdown.click();
		List<WebElement> consentValues = covidCodeEQPage.dropDownValues;
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
		covidCodeEQPage.patientLastNameTextBox.sendKeys("AutomatedLN");
		covidCodeEQPage.patientFirstNameTextBox.sendKeys("AutomatedFNGroup3");
		covidCodeEQPage.patientMiddletNameTextBox.sendKeys("M");
		covidCodeEQPage.patientEmailAddressTextBox.sendKeys("email@email.com");
		covidCodeEQPage.patientPhoneNumberTextBox.sendKeys("1112223333");
		covidCodeEQPage.patientStreetAddress1TextBox.sendKeys("123 street");
		JavascriptUtils.scrollDown(700);
		covidCodeEQPage.patientCityTextBox.sendKeys("Rockville");
		covidCodeEQPage.patientStateTextBox.sendKeys("MD");
		covidCodeEQPage.patientZipCodeTextBox.sendKeys("12345");
		JavascriptUtils.scrollDown(300);
		JavascriptUtils.selectDateByJS(covidCodeEQPage.dateFormCompleted, "04-06-2020");
		JavascriptUtils.selectDateByJS(covidCodeEQPage.DOBCalendar, "04-01-2000");
		covidCodeEQPage.biologicalSexDropdown.click();
		List<WebElement> biologicalSexValues = covidCodeEQPage.dropDownValues;
		for (WebElement value : biologicalSexValues) {
			System.out.println(value);
			if (value.getText().contains("Male")) {
				value.click();
				break;
			}
		}
		covidCodeEQPage.currentWeightDropdown.click();
		List<WebElement> currentWeightValues = covidCodeEQPage.dropDownValues;
		for (WebElement value : currentWeightValues) {
			if (value.getText().contains("Pounds")) {
				value.click();
				break;
			}
		}
		covidCodeEQPage.weightTextBox.sendKeys("200");
		covidCodeEQPage.raceDropdown.click();
		List<WebElement> raceValues = covidCodeEQPage.dropDownValues;
		for (WebElement value : raceValues) {
			if (value.getText().contains("Asian")) {
				value.click();
				break;
			}
		}
		covidCodeEQPage.hispanicOrLatinoDropdown.click();
		List<WebElement> hispanicOrLatinoValues = covidCodeEQPage.dropDownValues;
		for (WebElement value1 : hispanicOrLatinoValues) {
			if (value1.getText().contains("Yes")) {
				value1.click();
				break;
			}
		}
		covidCodeEQPage.currentHeightDropdown.click();
		List<WebElement> heightDropdownValues = covidCodeEQPage.dropDownValues;
		for (WebElement value : heightDropdownValues) {
			if (value.getText().contains("Foot/Inches")) {
				value.click();
				break;
			}
		}
		covidCodeEQPage.feetTextBox.sendKeys("5");
		covidCodeEQPage.inchesTextBox.sendKeys("10");
		/*
		 * covidCodeEQPage.whenOfficiallyDiagnosed.sendKeys("Aug 05, 2020");
		 */
		
		/*
		 * Clicks on the "Were you symptomatic" drop down
		 */
		covidCodeEQPage.wereYouSymptomaticDropdown.click();

		/*
		 * Selects yes value from "Were you symptomatic" drop down We can pass parameter
		 * when selecting yes or no options later
		 */
		CommonUtils.selectValueFromBootStrapDropDown(covidCodeEQPage.wereYouSymptomaticDropdownValues, "Yes");
		// selectDateByJS(EQPage.whenDevelopSymptoms, "04-01-2020");
		JavascriptUtils.selectDateByJS(covidCodeEQPage.whenDevelopSymptoms, "04-01-2020");
		/*
		 * covidCodeEQPage.whenDevelopSymptoms.sendKeys("Aug 01, 2020");
		 */
		// selectDateByJS(EQPage.whenOfficiallyDiagnosed, "04-04-2020");
		JavascriptUtils.selectDateByJS(covidCodeEQPage.whenOfficiallyDiagnosed, "04-04-2020");
		
	}

	/**
	 * This method clicks on submit button and clicks on yes on the submission pop
	 * up
	 */
	public void submittingEQ() {
		covidCodeEQPage.submitButton.click();
		MiscUtils.sleep(2000);
		covidCodeEQPage.YesButton.click();
	}

}
