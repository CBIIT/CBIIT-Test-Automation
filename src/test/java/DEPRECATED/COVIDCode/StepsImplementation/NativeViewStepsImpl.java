package DEPRECATED.COVIDCode.StepsImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;

public class NativeViewStepsImpl extends PageInitializer {

	/***
	 * The below method navigates and fills out demographics section for an
	 * enrollment questionnaire in Native View Values are hard coded
	 */

	public void nativeViewFillOutDemographicsSection() {

		CommonUtils.scrollIntoView(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsDateFormCompletedField);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsDateFormCompletedField.sendKeys("04-01-2020");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourDateOfBirthField
				.sendKeys("04-01-1990");
		JavascriptUtils.scrollIntoView(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourBioSexDropDown);
		CommonUtils.selectDropDownValue("Female",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourBioSexDropDown);
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourCurrentHeightDropDown);
		CommonUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Feet/Inches",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourCurrentHeightDropDown);
		CommonUtils.sleep(500);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHeightField.sendKeys("5");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHeightInches.sendKeys("10");
		CommonUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Pounds",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsCurrentWeightDropDown);
		CommonUtils.sleep(500);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWeighPoundtField.sendKeys("200");
		CommonUtils.selectDropDownValue("Asian",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHowWouldYouDescribeYourRaceDropDown);
		CommonUtils.sleep(500);
		CommonUtils.selectDropDownValue("No",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsAreYouHispaniceOrLatinoDropDown);
		CommonUtils.sleep(500);
		CucumberLogUtils.logScreenshot();

	}

	/***
	 * The below method navigates to and fills out the Symptomology section for an
	 * enrollment questionnaire in native view values are hard coded
	 */

	public void nativeViewFillOutSymptomologySection() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyTab.click();
		CucumberLogUtils.logScreenshot();
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyWereYouSymptomaticDropDown);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyWhenFirstDevelopSymptomsField
				.sendKeys("04-01-2020");
		CommonUtils.selectDropDownValue("Nasal or throat swab",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyHowWasTheSampleTakenDropDown);
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyHaveYouOfficiallyBeenDiagnosedWithCOVID19);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyDateOfficiallyDiagnosed.sendKeys("04-09-2020");
		CucumberLogUtils.logScreenshot();
	} 

	/***
	 * The below navigates to and fills out the Exposures and Risk Factors section
	 * for an enrollment questionnaire in native view Values are hard coded
	 */
	public void nativeViewFillOutExposuresAndRiskFactorsSection() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsTab.click();
		CucumberLogUtils.logScreenshot();
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsTellMeMedicalConditionsUnlockButton
				.click();
		CucumberLogUtils.logScreenshot();
		CucumberLogUtils.logScreenshot();
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorstellMeMedicalConditionsSearchBar
				.sendKeys("Asthma");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorstellMeMedicalConditionsSearchBar
				.sendKeys(Keys.RETURN);
		CucumberLogUtils.logScreenshot();
		CommonUtils.selectDropDownValue("Never",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsHasPatientVapedDropDown);
		CommonUtils.selectDropDownValue("Currently smokes daily",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsHasPatientSmoked100CigarretesDropDown);
		CommonUtils.selectDropDownValue("1-10",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsHowManyCigarettesPatientSmokesDailyDD);
		JavascriptUtils.scrollDown(500);
		CommonUtils.selectDropDownValue("2 to 7 days prior to onset of symptoms/diagnosis (if asymptomatic)",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsAntiInflammatoryDD);
		CommonUtils.selectDropDownValue("Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationDD);
		CommonUtils.selectDropDownValue("Day of or day before onset of symptoms/diagnosis (if asymptomatic)",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsParacetamolAcetaminophenDD);
		CommonUtils.selectDropDownValue("Never",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsBloodThinnersDD);
		CommonUtils.selectDropDownValue("Never",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsAsthmaMedicationDD);
		CommonUtils.selectDropDownValue("1 to 12 months prior to onset of symptoms/diagnosis (if asymptomatic)",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsAceInhibitorsDD);
		CommonUtils.selectDropDownValue("Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsAllergyMedicationUsedDD);
		CommonUtils.selectDropDownValue("Never",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsUsedArbsDD);
		CommonUtils.selectDropDownValue("Over 1 year prior to onset of symptoms/diagnosis (if asymptomatic)",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsUsedAntibioticsDD);
		CommonUtils.selectDropDownValue("Never",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsExposureToCOVID19FrequencyDD);
		JavascriptUtils.scrollIntoView(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsDidYouThePatientWearAMaskDD);
		CommonUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsDidYouThePatientWearAMaskDD);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * The below method navigates to the Participant Events Section in native view
	 * for an enrollment questionnaire and entering a consent date values are hard
	 * coded
	 */
	public void nativeViewConsentingParticipantEventsSection() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab.click();
		CommonUtils.sleep(1000);
		JavascriptUtils.selectDateByJS(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsConsentedDate, "01/20/2021");

	}

	/***
	 * This method navigates to a new COVIDcode enrollment questionnaire form in
	 * native view
	 */
	public void nativeViewNavigateToCovidCodeEnrollmentQuestionnaire() {
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeEnrollmentsLink.click();
	}

	/***
	 * This method navigates to a new COVIDcode Specimens form in native view
	 */
	public void nativeViewNavigateToCovidCodeSpecimens() {
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
		nativeViewEnrollementsPage.nativeViewPanelNavigatorSpecimensLink.click();
	}

	/***
	 * This method navigates to a new COVIDcode follow up questionnaire form in
	 * native view
	 */
	public void nativeViewNavigateToCovidCodeFollowUpQuestionnaire() {
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		CommonUtils.sleep(500);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * This method navigates to a new COVIDcode My Inquiry Tracking Records in
	 * native view
	 */
	public void nativeViewNavigateToCovidCodeMyInquiryTrackingRecords() {
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
		nativeViewEnrollementsPage.nativeViewPanelNavigatorMyInquiryTrackingRecordsLink.click();
	}

	/***
	 * This method consents, chooses group ID, and fills out patient basic
	 * information on the enrollment questionnaire form in Native View values are
	 * hard coded
	 */
	public void nativeViewConsentingWithGroupIDandFillPatientBasicInfo(String group, String consent) {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();
		CucumberLogUtils.logScreenshot();
		CommonUtils.selectDropDownValue(group,
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewUserGroupIDDropDown);
		CommonUtils.selectDropDownValue(consent, nativeViewEnrollmentViewPage.nativeViewEnrollmentViewConsentDropDown);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPatientLastNameField.sendKeys("AutomatedLN");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPatientFirstName.sendKeys("AutomatedFN");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPatientMiddleInitial.sendKeys("M");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewContactEmailAddress.sendKeys("email@automatedtest.com");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewContactPhoneNumber.sendKeys("111-222-3333");
		CommonUtils.waitForVisibility(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewStreetAddress1);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewStreetAddress1.sendKeys("NCI Rockville");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewCity.sendKeys("Rockville");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewState.sendKeys("MD");
		CommonUtils.waitForVisibility(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewZipCode);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewZipCode.sendKeys("20850");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * This method verifies an enrollment form has been successfully submitted
	 * Values are hard coded This method is to follow any enrollment that has been
	 * submitted with the email address email@automatedtest.com
	 */
	public void nativeViewVerifyingEnrollmentQuestionnaireWasSubmitted() {
		CommonUtils.sleep(2000);
		/*
		 * Clicking on the 'All' breadcrumb is necessary to properly search without
		 * added filters - refer to UI for further review
		 */
		nativeViewEnrollmentViewPage.nativeViewAllBreadCrumbLink.click();
		CommonUtils.sleep(1000);
		CommonUtils.selectDropDownValue("for text",
				nativeViewEnrollementsPage.covidCodeEnrollmentsSearchDropDown);
		nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox.sendKeys("email@automatedtest.com");
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox.sendKeys(Keys.RETURN);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	/***
	 * This method searches Nurses in 'Assigned to' text field on the 'My Inquiry
	 * Tracking' page in Native View and asserts. selected values Values are hard
	 * coded
	 */
	public void nativeViewMyInquiryTrackingSearchNursesinAssignedToTextField() {
//		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
//				.sendKeys("Alan Orpia");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Janet Bracci");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Laura Harney");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Lisa Leathwood");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Maureen Risch");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Stephanie Steinbart");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		CommonUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
		.sendKeys("Kathryn Nichols");
        nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
		.sendKeys(Keys.ENTER);
		CommonUtils.sleep(2000);
		String[] exp = { "Janet Bracci", "Laura Harney", "Lisa Leathwood", "Maureen Risch",
				"Stephanie Steinbart", "Kathryn Nichols"};
		for (WebElement act : nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactListOfAssignedToDD) {
			boolean match = false;
			for (int i = 0; i < exp.length; i++) {
				if (act.getText().equals(exp[i])) {
					match = true;
				}
			}
			Assert.assertTrue(match);
		}
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}
	
	/***
	 * This method creates a new Enrollment Questionnaire for User Group 1, enters all required information and submits for review
	 */
	public void submitForReviewEQGroup1 () {
		ServiceNow_Login_Methods.nativeViewLogin();
		nativeViewStepsImpl.nativeViewNavigateToCovidCodeEnrollmentQuestionnaire();
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		CommonUtils.sleep(500);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();
		CommonUtils.sleep(2000);
		CommonUtils.selectDropDownValue("Group 1", nativeViewEnrollmentViewPage.nativeViewEnrollmentViewUserGroupIDDropDown);
		CommonUtils.selectDropDownValue("Yes", nativeViewEnrollmentViewPage.nativeViewEnrollmentViewConsentDropDown);
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPatientLastNameField, "TestLastName");
		CommonUtils.sendKeys(nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPatientFirstName, "TestFirstName");
		JavascriptUtils.scrollIntoView(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourBioSexDropDown);
		CommonUtils.selectDropDownValue("Female",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourBioSexDropDown);
		CommonUtils.sleep(500);
		CommonUtils.selectDropDownValue("Feet/Inches",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourCurrentHeightDropDown);
		CommonUtils.sleep(500);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHeightField.sendKeys("5");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHeightInches.sendKeys("10");
		CommonUtils.sleep(500);
		CommonUtils.selectDropDownValue("Pounds",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsCurrentWeightDropDown);
		CommonUtils.sleep(500);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWeighPoundtField.sendKeys("200");
		CommonUtils.selectDropDownValue("Asian",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHowWouldYouDescribeYourRaceDropDown);
		CommonUtils.sleep(500);
		CommonUtils.selectDropDownValue("No",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsAreYouHispaniceOrLatinoDropDown);
		CommonUtils.sleep(500);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab.click();
		CommonUtils.sleep(500);
		JavascriptUtils.selectDateByJS(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsConsentedDate, "01/20/2021");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPageSubmitForReviewBtn.click();
		CommonUtils.sleep(2000);
	}
	
	/***
	 * This method sends values one by one from list to lookup search field
	 */
	public void sendMultipleValuesToLookupField(String[] list, WebElement lookupField) {
		for(String l : list) {
			lookupField.sendKeys(l);
			CommonUtils.sendKeys(lookupField, Keys.ENTER);
			CommonUtils.sleep(1000);
		}
	}
	
	/** This method asserts actual list of WebElements with expected list of Strings */
	public void assertTwoLists(List<WebElement> lists, String[] arrayList) {
		CommonUtils.sleep(2000);
		List<String> act = new ArrayList<String>(Arrays.asList(lists.get(0).getText().split("\n")));
		List<String> exp = new ArrayList<String>(Arrays.asList(arrayList));
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	    Assert.assertEquals(act, exp);
	}
}
