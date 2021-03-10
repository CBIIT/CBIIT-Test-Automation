package ServiceNow.COVIDCode.StepsImplementation;


import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;

public class NativeViewStepsImpl extends PageInitializer {

	/***
	 * The below method navigates and fills out demographics section for an
	 * enrollment questionnaire in Native View Values are hard coded
	 */

	public void nativeViewFillOutDemographicsSection() {

		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsDateFormCompletedField.sendKeys("04-01-2020");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourDateOfBirthField
				.sendKeys("04-01-1990");
		JavascriptUtils.scrollIntoView(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourBioSexDropDown);
		CommonUtils.selectDropDownValue("Female",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourBioSexDropDown);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourCurrentHeightDropDown);
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Feet/Inches",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWhatIsYourCurrentHeightDropDown);
		MiscUtils.sleep(500);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHeightField.sendKeys("5");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHeightInches.sendKeys("10");
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Pounds",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsCurrentWeightDropDown);
		MiscUtils.sleep(500);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsWeighPoundtField.sendKeys("200");
		CommonUtils.selectDropDownValue("Asian",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsHowWouldYouDescribeYourRaceDropDown);
		MiscUtils.sleep(500);
		CommonUtils.selectDropDownValue("No",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewDemographicsAreYouHispaniceOrLatinoDropDown);
		MiscUtils.sleep(500);
		CucumberLogUtils.logScreenShot();

	}

	/***
	 * The below method navigates to and fills out the Symptomology section for an
	 * enrollment questionnaire in native view values are hard coded
	 */

	public void nativeViewFillOutSymptomologySection() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyTab.click();
		CucumberLogUtils.logScreenShot();
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyWereYouSymptomaticDropDown);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyWhenFirstDevelopSymptomsField
				.sendKeys("04-01-2020");
		CommonUtils.selectDropDownValue("Nasal or throat swab",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyHowWasTheSampleTakenDropDown);
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyHaveYouOfficiallyBeenDiagnosedWithCOVID19);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewSymptomologyDateOfficiallyDiagnosed.sendKeys("04-09-2020");
		CucumberLogUtils.logScreenShot();
	} 

	/***
	 * The below navigates to and fills out the Exposures and Risk Factors section
	 * for an enrollment questionnaire in native view Values are hard coded
	 */
	public void nativeViewFillOutExposuresAndRiskFactorsSection() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsTab.click();
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsTellMeMedicalConditionsUnlockButton
				.click();
		CucumberLogUtils.logScreenShot();
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorstellMeMedicalConditionsSearchBar
				.sendKeys("Asthma");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorstellMeMedicalConditionsSearchBar
				.sendKeys(Keys.RETURN);
		CucumberLogUtils.logScreenShot();
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
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Yes",
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewExposuredAndRiskFactorsDidYouThePatientWearAMaskDD);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	/***
	 * The below method navigates to the Participant Events Section in native view
	 * for an enrollment questionnaire and entering a consent date values are hard
	 * coded
	 */
	public void nativeViewConsentingParticipantEventsSection() {
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewParticipantEventsTab.click();
		MiscUtils.sleep(1000);
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
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeEnrollmentsLink.click();
	}

	/***
	 * This method navigates to a new COVIDcode Specimens form in native view
	 */
	public void nativeViewNavigateToCovidCodeSpecimens() {
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollementsPage.nativeViewPanelNavigatorSpecimensLink.click();
	}

	/***
	 * This method navigates to a new COVIDcode follow up questionnaire form in
	 * native view
	 */
	public void nativeViewNavigateToCovidCodeFollowUpQuestionnaire() {
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollementsPage.nativeViewPanelNavigatorCovidCodeFollowUpsLink.click();
	}

	/***
	 * This method navigates to a new COVIDcode My Inquiry Tracking Records in
	 * native view
	 */
	public void nativeViewNavigateToCovidCodeMyInquiryTrackingRecords() {
		CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
		nativeViewEnrollementsPage.filterNavigator.sendKeys("CovidCode App");
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		nativeViewEnrollementsPage.nativeViewPanelNavigatorMyInquiryTrackingRecordsLink.click();
	}

	/***
	 * This method consents, chooses group ID, and fills out patient basic
	 * information on the enrollment questionnaire form in Native View values are
	 * hard coded
	 */
	public void nativeViewConsentingWithGroupIDandFillPatientBasicInfo(String group, String consent) {
		CommonUtils.switchToFrame(nativeViewEnrollementsPage.NativeViewFrame);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsNewButton.click();
		CucumberLogUtils.logScreenShot();
		CommonUtils.selectDropDownValue(group,
				nativeViewEnrollmentViewPage.nativeViewEnrollmentViewUserGroupIDDropDown);
		CommonUtils.selectDropDownValue(consent, nativeViewEnrollmentViewPage.nativeViewEnrollmentViewConsentDropDown);
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPatientLastNameField.sendKeys("AutomatedLN");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPatientFirstName.sendKeys("AutomatedFN");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewPatientMiddleInitial.sendKeys("M");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewContactEmailAddress.sendKeys("email@automatedtest.com");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewContactPhoneNumber.sendKeys("1112223333");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewStreetAddress1.sendKeys("NCI Rockville");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewCity.sendKeys("Rockville");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewState.sendKeys("MD");
		nativeViewEnrollmentViewPage.nativeViewEnrollmentViewZipCode.sendKeys("20850");
		CucumberLogUtils.logScreenShot();
	}

	/***
	 * This method verifies an enrollment form has been successfully submitted
	 * Values are hard coded This method is to follow any enrollment that has been
	 * submitted with the email address email@automatedtest.com
	 */
	public void nativeViewVerifyingEnrollmentQuestionnaireWasSubmitted() {
		MiscUtils.sleep(2000);
		/*
		 * Clicking on the 'All' breadcrumb is necessary to properly search without
		 * added filters - refer to UI for further review
		 */
		nativeViewEnrollmentViewPage.nativeViewAllBreadCrumbLink.click();
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Contact Email Address",
				nativeViewEnrollementsPage.covidCodeEnrollmentsSearchDropDown);
		nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox.sendKeys("email@automatedtest.com");
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.covidCodeEnrollmentsSearchTextBox.sendKeys(Keys.RETURN);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	/***
	 * This method search Nurses in Assigned to text field on the My Inquiry
	 * Tracking in Native View and do assertion by selected values Values are hard
	 * coded
	 */
	public void nativeViewMyInquiryTrackingSearchNursesinAssignedToTextField() {
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Alan Orpia");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Janet Bracci");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Laura Harney");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Lisa Leathwood");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Maureen Risch");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys("Stephanie Steinbart");
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
				.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
		.sendKeys("Kathryn Nichols");
        nativeViewEnrollementsPage.myInquiryTrackingRecordsStudyTeamContactUnlockAssignedToSearchTextField
		.sendKeys(Keys.ENTER);
		MiscUtils.sleep(2000);
		String[] exp = { "Alan Orpia", "Janet Bracci", "Laura Harney", "Lisa Leathwood", "Maureen Risch",
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
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
}
