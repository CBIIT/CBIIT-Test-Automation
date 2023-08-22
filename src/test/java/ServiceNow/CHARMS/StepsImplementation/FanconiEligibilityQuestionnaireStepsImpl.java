package ServiceNow.CHARMS.StepsImplementation;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import ServiceNow.CHARMS.NativeView.Pages.CHARMSParticipantDetailsPage;
import ServiceNow.CHARMS.Pages.FanconiScreenerNVPage;
import ServiceNow.CHARMS.Steps.HooksSteps;
import ServiceNow.CHARMS.Utils.CharmsUtil;
import appsCommon.PageInitializer;

public class FanconiEligibilityQuestionnaireStepsImpl extends PageInitializer {

	String referralValue;
	String excelSheet = "/Users/jains18/git/CBIIT-Test-Automation/src/main/resources/data.xlsx";

	Map<String, String> currentRow; // Excel Data Reader for FanconiScreener Tab
	Map<String, String> currentRowForCancerHistory; // Excel Data Reader for Cancer History Tab
	Map<String, String> currentRowForAnotherStudy; // Excel Data Reader for Another Study Tab

	SoftAssert softAssert = new SoftAssert();

	/* Method to click Eligibility Questionnaire link */
	public void eligibilityQuestionnairelinkClicked() {

		Set<String> allWindowHandles = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow : allWindowHandles) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow);
			MiscUtils.sleep(2000);
		}

		JavascriptUtils.scrollIntoView(fanconiEligibilityQuestionnairePage.nextButton);
		CommonUtils.waitForVisibility(fanconiEligibilityQuestionnairePage.nextButton);
		// CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	/*****************************************************************/
	/* Method to click Initial pages with Information on Study related */
	/*****************************************************************/
	public void initialStudyRelatedPageClicked() {

		for (int i = 1; i <= 6; ++i) {

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		}
	}

	/*
	 * Method to submit 'Are you completing this questionnaire for someone else?or
	 * Yourself
	 */
	public void participantSubmission() {

		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.participantCompletingRBtonList,
				currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/*****************************************************************/
	/* Method to submit the Participant and Proxy Name details */
	/*****************************************************************/
	public void participantNameSelected() {

		if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
				.contentEquals("Yes, I am completing this form for someone else")) {

			// What is the name of the person you are completing this for?
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.firstNameByProxyTextBox,
					currentRow.get("ProxyFirstName"));
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.middleNameByProxyTextBox,
					currentRow.get("ProxyMIddleName"));
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.lastNameByProxyTextBox,
					currentRow.get("ProxyLastName"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

			// What is your name?Proxy's Name
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.proxyFirstNameTextBox,
					currentRow.get("WhatIsYourNameFirstName"));
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.proxyMiddleNameTextBox,
					currentRow.get("WhatIsYourNameMiddleName"));
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.proxyLastNameTextBox,
					currentRow.get("WhatIsYourNameLastName"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

			// What is your relationship to the participant?
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("WhatIsYourRelationshipToParticipant"));

			if (currentRow.get("WhatIsYourRelationshipToParticipant").contentEquals("Other")) {

				// Add Other textBox option for your relationship to the participant
				CharmsUtil.sendKeysToElement(
						fanconiEligibilityQuestionnairePage.yourRelationshipToParticipantOtherTextBox,
						currentRow.get("WhatIsYourRelationshipToParticipantOther"));
			}

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

			// Are you the legal guardian of the participant?
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("AreYouTheLegalGuardianOfParticipant"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		} else {
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.firstNameTextBox,
					currentRow.get("ParticipantFirstName"));
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.middleNameTextBox,
					currentRow.get("ParticipantMiddleName"));
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.lastNameTextBox,
					currentRow.get("ParticipantLastName"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		}
	}

	/*****************************************************************/
	/* Method to submit Participant Basic Information- DOB,Gender by Birth */
	/*****************************************************************/
	public void participantbasicInformationSelected() {

		// What is your date of birth?
		CommonUtils.waitForVisibility(fanconiEligibilityQuestionnairePage.calendarMonthDropDown);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.calendarMonthDropDown,
				currentRow.get("DOBMonth"));

		fanconiEligibilityQuestionnairePage.calendarYearTextBox.clear();
		MiscUtils.sleep(500);

		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.calendarYearTextBox,
				currentRow.get("DOBYear"));
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.calendarDayOption);

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

		// What was your sex assigned at birth, on your original birth certificate?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.sexAssignedRBtonList,
				currentRow.get("SexAssigned"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

	}

	/*****************************************************************/
	/* Method to submit Participant Current Gender and Pronouns */
	/*****************************************************************/
	public void participantGenderInformationSelected() {

		if (currentRow.get("CurrentGender").isEmpty()) {
			// do nothing
		}

		else {
			// What is your current gender? (select one)
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.currentGenderRBtonList,
					currentRow.get("CurrentGender"));

			if (currentRow.get("CurrentGender").contentEquals("I use a different term:")) {
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.currentGenderDifferentTermTextBox,
						currentRow.get("CurrentGenderOther"));
			}
			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

			if (currentRow.get("Pronouns").isEmpty()) {
				// do nothing
			}

			else {
				// What are your pronouns?
				CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.pronounsRBtonList,
						currentRow.get("Pronouns"));

				if (currentRow.get("Pronouns").contentEquals("I use a different term:")) {
					CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.pronounsDifferentTermTextBox,
							currentRow.get("PronounsOther"));
				}

				// Click Next Button
				CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
			}
		}
	}

	/*****************************************************************/
	/* Method to add the Country and Address details */
	/*****************************************************************/
	public void participantCountrySelected() {

		if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
				.contentEquals("Yes, I am completing this form for someone else")) {

			// In which country do you currently live DropDown List?
			CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.countrylivedProxyDropDownList,
					currentRow.get("CountryLived"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

			if (currentRow.get("CountryLived").contentEquals("United States of America")) {
				// Please provide the mailing address where study materials can be sent needed.
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.streetProxyTextBox,
						currentRow.get("StreetAddress1"));
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.additionalStreetProxyTextBox,
						currentRow.get("StreetAddress2"));
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.cityProxyTextBox,
						currentRow.get("City"));
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.stateProxyTextBox,
						currentRow.get("State"));
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.zipCodeProxyTextBox,
						currentRow.get("ZipCode"));

				// Click Next Button
				CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
			}
		}

		else {
			// In which country do you currently live DropDown List?
			CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.countrylivedDropDownList,
					currentRow.get("CountryLived"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

			if (currentRow.get("CountryLived").contentEquals("United States of America")) {
				// Please provide the mailing address where study materials can be sent needed.
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.streetTextBox,
						currentRow.get("StreetAddress1"));
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.additionalStreetTextBox,
						currentRow.get("StreetAddress2"));
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.cityTextBox, currentRow.get("City"));
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.stateTextBox, currentRow.get("State"));
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.zipCodeTextBox,
						currentRow.get("ZipCode"));

				// Click Next Button
				CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
			}
		}
	}

	/*****************************************************************/
	/* Method to provide the Email Address */
	/*****************************************************************/
	public void emailAddressAdded() {

		// What is your email address?
		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.emailAddressTextBox,
				currentRow.get("EmailAddress"));
		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

		// Please confirm your email address.
		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.confirmEmailAddressTextBox,
				currentRow.get("ConfirmationEmailAddress"));
		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/*****************************************************************/
	/*
	 * Method to submit the participant in the NIH Inherited Bone Marrow Failure
	 * Syndrome study?
	 */
	/*****************************************************************/
	public void participatedInBoneMarrowFailureStudy() {

		// Are or were you a participant in the NIH Inherited Bone Marrow Failure
		// Syndrome study?
		CharmsUtil.selectRadioButtonValue(
				fanconiEligibilityQuestionnairePage.participateBoneMarrowSyndromeStudyRBtonList,
				currentRow.get("AreOrWereYouAParticipanInNIHInheritedBoneMarrowFailuresyndromeStudy"));
		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/*****************************************************************/
	/* Method to submit if Participant is adopted */
	/*****************************************************************/
	public void IsParticipantAdopted() {

		// Are you adopted?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.adoptedRBtonList,
				currentRow.get("AreYouAdopted"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/* Method to submit the phone details */
	public void phoneNumbersAdded() {

		// Please list your phone numbers below.
		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.homePhoneNumberTextBox,
				currentRow.get("HomePhoneNumber"));
		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.cellPhoneNumberTextBox,
				currentRow.get("CellPhoneNumber"));
		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.workPhoneNumberTextBox,
				currentRow.get("WorkPhoneNumber"));

		if (currentRow.get("HomePhoneNumber").contentEquals(currentRow.get("PreferredPhoneNumber"))) {
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.preferredHomePhoneNumberTextBox);
		}
		if (currentRow.get("CellPhoneNumber").contentEquals(currentRow.get("PreferredPhoneNumber"))) {
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.preferredCellPhoneNumberTextBox);
		}
		if (currentRow.get("WorkPhoneNumber").contentEquals(currentRow.get("PreferredPhoneNumber"))) {
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.preferredWorkPhoneNumberTextBox);
		}
		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

	}

	/* Method to submit the Ethnicity details */
	public void ethnicitySelected() {

		// What is your ethnicity?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.ethnicityRBtonList,
				currentRow.get("Ethnicity"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/* Method to submit the Race details */
	public void raceSelected() {

		// What is your race? Please select all that apply.
		for (int j = 1; j <= 6; ++j) {
			if (currentRow.get("Race" + j) != null) {
				CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.raceRBtonList,
						currentRow.get("Race" + j));
			}
		}
		if (currentRow.get("OtherRace") != null) {
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherRaceNameTextBox,
					currentRow.get("OtherRace"));
		}
		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/*****************************************************************/
	/*
	 * Method to submit Have you ever participated in a Fanconi anemia study at
	 * another medical institution, university, government agency or other site?
	 */
	/*****************************************************************/
	public void IsOtherMedicalInstitutionSelected() {

		// institution, university, government agency or other site?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/*****************************************************************/
	/* Method to submit Specifications of Another Medical Institution selected */
	/*****************************************************************/
	public void otherMedicalInstitutionSelected() {

		if (currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution")
				.contentEquals("Yes"))

		{
			// Please specify the study(ies) or registry group(s) regarding participation in
			// other studies.
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("SpecifyParticipationInOtherStudies0"));

			fanconiEligibilityQuestionnairePage.commonRBtonList.get(1).click();
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyAt1TextBox,
					currentRow.get("SpecifyParticipationInOtherStudiesDetails1"));

			fanconiEligibilityQuestionnairePage.commonRBtonList.get(2).click();
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyAt2TextBox,
					currentRow.get("SpecifyParticipationInOtherStudiesDetails2"));

			fanconiEligibilityQuestionnairePage.commonRBtonList.get(3).click();
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther1TextBox,
					currentRow.get("SpecifyParticipationInOtherStudiesDetails3"));

			fanconiEligibilityQuestionnairePage.commonRBtonList.get(4).click();
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther2TextBox,
					currentRow.get("SpecifyParticipationInOtherStudiesDetails4"));

			fanconiEligibilityQuestionnairePage.commonRBtonList.get(5).click();
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther3TextBox,
					currentRow.get("SpecifyParticipationInOtherStudiesDetails5"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		} else {
			// Do nothing
		}
	}

	/*****************************************************************/
	/*
	 * Method to submit additional information regarding participation in other
	 * studies.
	 */
	/*****************************************************************/
	public void otherMedicalInstitutionDetailsAdded() {

		// Please complete the table below to provide additional information regarding
		// participation in other studies.
		int k = 0;
		int j = 1;

		if (currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution")
				.contentEquals("Yes")) {

			for (int i = 0; i <= 5; ++i) {

				// Excel Data Reader
				Map<String, String> currentRowForAnotherStudy = CharmsUtil.testManagerData(excelSheet, "OtherStudies",
						i);

				String otherStudyName = (currentRowForAnotherStudy.get("OtherStudyName"));
				String otherStudyContactPerson = (currentRowForAnotherStudy.get("OtherStudyContactPerson"));
				String otherStudyPhoneNumber = (currentRowForAnotherStudy.get("OtherStudyPhoneNumber"));
				String otherStudyInstitution = (currentRowForAnotherStudy.get("OtherStudyInstitution"));
				String otherStudyParticipationYear1 = (currentRowForAnotherStudy.get("OtherStudyParticipationYear1"));
				String otherStudyParticipationYear2 = (currentRowForAnotherStudy.get("OtherStudyParticipationYear2"));

				// Other Study Name
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyNameList.get(i),
						otherStudyName);

				// Other Study Contact Person
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyContactPersonList.get(i),
						otherStudyContactPerson);

				// Other Study Phone Number
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyPhoneNumberList.get(i),
						otherStudyPhoneNumber);

				// Other Study Institution
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyInstitutionList.get(i),
						otherStudyInstitution);

				// Other Study Currently Participating
				CharmsUtil.selectDropDownValue(
						fanconiEligibilityQuestionnairePage.otherStudyCurrentlyParticipatingDropDownList.get(i),
						currentRowForAnotherStudy.get("OtherStudyCurrentlyParticipation"));

				// Other Study No longer participation in other study Institution Start year and
				// End Year : Start Year
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyNoLongerStartYearList.get(k),
						otherStudyParticipationYear1);

				// Other Study No longer participation in other study Institution Start year and
				// End Year: End Year
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherStudyNoLongerStartYearList.get(j),
						otherStudyParticipationYear2);

				k = k + 2;
				j = j + 2;

			}

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		} else {
			// Do nothing
		}
	}

	/*****************************************************************/
	/* Method to submit Have you been diagnosed with Fanconi anemia? */
	/*****************************************************************/
	public void diagnosedWithFanconiAnemia() {

		// Have you been diagnosed with Fanconi anemia?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/*****************************************************************/
	/*
	 * Method to submit the age or date when you were diagnosed with Fanconi anemia
	 */
	/*****************************************************************/
	public void diagnosedWithFanconiAnemiaSelected() {

		if (currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia").contentEquals("Yes")) {
			// Please enter the age or date when you were diagnosed with Fanconi anemia
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAgeOrDate"));

			if (currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAgeOrDate")
					.contentEquals("Age in years (if under age 1 year, please enter 0)")) {
				CharmsUtil.sendKeysToElement(
						fanconiEligibilityQuestionnairePage.ageParticipantDiagnosedWithFanconiTextBox,
						currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAge"));
			} else if (currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAgeOrDate")
					.contentEquals("Date (MM/DD/YYYY)"))

			{
				CharmsUtil.sendKeysToElement(
						fanconiEligibilityQuestionnairePage.dateParticipantDiagnosedWithFanconiTextBox,
						currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaDate"));
			}

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		} else {
			// Do nothing
		}
	}

	/*****************************************************************/
	/*
	 * Method to submit Have you had a chromosome breakage test for FA (sometimes
	 * also called MMC or DEB test) on a blood sample?
	 */
	/*****************************************************************/
	public void chromosomeBreakageTestSelected() {

		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/*****************************************************************/
	/* Method to submit Where was the chromosome breakage test performed? */
	/*****************************************************************/
	public void whereChromosomeBreakageTestPerformed() {

		if (currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample").contentEquals("Yes")) {
			// Where was the chromosome breakage test performed?
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("WhereWasTheChromosomeBreakageTestPerformed"));

			if (currentRow.get("WhereWasTheChromosomeBreakageTestPerformed").contentEquals("Other (please specify)")) {
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.chromosomBreakageTestPerformedTextBox,
						currentRow.get("WhereWasTheChromosomeBreakageTestPerformedOther"));

			}

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		}

		// This is to go to the Inconclusive route
		// WhatWasTheChromosomeBreakageTestResultInconclusive selected is 'Inconclusive'
		if (currentRow.get("WhatWasTheChromosomeBreakageTestResultInconclusive").contentEquals("Inconclusive")) {

			// What was the chromosome breakage test result?
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("WhatWasTheChromosomeBreakageTestResultInconclusive"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

			// Sometimes after an inconclusive result, a second test is ordered.
			// Did you have a second chromosome breakage test done on a skin biopsy sample?

			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("InconclusiveResult"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		}
	}

	/*****************************************************************/
	/* Method to submit What was the chromosome breakage test result? */
	/*****************************************************************/
	public void whatWasChromosomeBreakageTestResult() {

		if (currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample").contentEquals("Yes")) {
			// What was the chromosome breakage test result?
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("WhatWasTheChromosomeBreakageTestResult"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		} else {
			// Do nothing
		}
	}

	/*****************************************************************/
	/* Method to provide the chromosome breakage test results to us */
	/*****************************************************************/
	public void toProvideChromosomeBreakageTestResults() {

		if (currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults").isEmpty()) {
			// Do nothing
		}
		else {
			// How would you like to provide the chromosome breakage test results to
			// us?Please select one
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

			// If you have a copy of the chromosome breakage test results, please upload a
			// copy here.Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		}
	}

	/*****************************************************************/
	/*Method to submit ever had complementation testing or genetic testing forFanconi*/
	/*****************************************************************/
	public void hadComplementationGeneticTesting() {

		// Have you ever had complementation testing or genetic testing for Fanconi
		// anemia genes?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("HaveYouEverHadComplementationGeneticTesting"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/*****************************************************************/
	/* Method to provide Was the genetic testing positive for Fanconi anemia */
	/*****************************************************************/
	public void WasTheGeneticTestingPositive() {

		if (currentRow.get("HaveYouEverHadComplementationGeneticTesting").contentEquals("Yes")) {

			// Was the genetic testing positive for Fanconi anemia (did the complementation
			// or genetic testing identify a specific gene for Fanconi anemia)?
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		}
	}

	/*****************************************************************/
	/* Method to submit the Please check FA genes tested.(Mark all that apply)*/
	/*****************************************************************/
	public void checkFAGenesTested() {

		if (currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia").contentEquals("No")
				|| currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia").contentEquals("Unknown/Unsure"))

		{
			int optionsLength = fanconiEligibilityQuestionnairePage.commonRBtonList.size();
			for (int i = 0; i <= 21; ++i) {
				CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.commonRBtonList.get(i));
			}

			// CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.commonRBtonList.get(22));
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.checkFAGenesTestedTextBox,
					currentRow.get("FAGenesTestedTextBox"));

			for (int i = 23; i <= optionsLength - 2; ++i) {
				CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.commonRBtonList.get(i));
			}

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		} else {
			// DO nothing
		}
	}

	/*****************************************************************/
	/*Method to submit Was the genetic testing positive for Fanconi anemia*/
	/*****************************************************************/
	public void mutationsVariantsInformationSelected() {

		if (currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia").contentEquals("Yes"))

		{
			// Indicate which mutations/variants were found below(if you have the
			// information).

			CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.geneNameDropDownList,
					currentRow.get("GeneName"));
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.mutationVariant1TextBox,
					currentRow.get("MutationVariant1"));
			CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.inheritedFrom1DropDownList,
					currentRow.get("InheritedFrom1"));
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.mutationVariant2TextBox,
					currentRow.get("MutationVariant2"));
			CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.inheritedFrom2DropDownList,
					currentRow.get("InheritedFrom2"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		}
	}

	/*****************************************************************/
	/* Method to provide if you have a copy of the genetic test results? */
	/*****************************************************************/
	public void haveCopyOfGeneticTestResults() {

		if (currentRow.get("HaveYouEverHadComplementationGeneticTesting").contentEquals("Yes")) {

			// Do you have a copy of the genetic test results?
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("DoYouHaveCopyOfGeneticTestResults"));
			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		} else {
			// Do nothing
		}
	}

	/*****************************************************************/
	/* Method to submit how you like to provide the genetic test results to us? */
	/*****************************************************************/
	public void howProvideGeneticTestResults() {

		if (currentRow.get("DoYouHaveCopyOfGeneticTestResults").contentEquals("Yes")) {

			// How would you like to provide the genetic test results to us? Please select
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("HowWouldYouLikeToProvideGeneticTestResults"));
			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

			// If you would like to upload the genetic test results, please do so here.
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		} else {
			// Do nothing
		}
	}

	/*****************************************************************/
	/* Method to provide any of the following features? */
	/*****************************************************************/
	public void featuresOptionsSelected() {

		// Have you been told that you have any of the following features?
		// Please select yes, no, or unknown/unsure for each statement below.
		int optionsLength = fanconiEligibilityQuestionnairePage.yesForFeaturesOptions.size();

		if (currentRow.get("LowBirthWeight").contentEquals("Yes")) {

			for (int i = 0; i <= optionsLength - 1; ++i) {
				CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.yesForFeaturesOptions.get(i));
			}
		}

		else if (currentRow.get("LowBirthWeight").contentEquals("No")) {
			for (int i = 0; i <= optionsLength - 1; ++i) {
				CharmsUtil.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.noForFeaturesOptions.get(i));
			}
		} else if (currentRow.get("LowBirthWeight").contentEquals("Unknown/Unsure")) {
			for (int i = 0; i <= optionsLength - 1; ++i) {
				CharmsUtil
						.clickOnRadioButtonElement(fanconiEligibilityQuestionnairePage.unsureForFeaturesOptions.get(i));
			}
		}
		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		MiscUtils.sleep(600);
	}

	/*****************************************************************/
	/* Method to submit if you ever been diagnosed with bone marrow failure? */
	/*****************************************************************/
	public void everBeenDiagnosedWithBoneMarrowFailure() {

		// Have you ever been diagnosed with bone marrow failure?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		MiscUtils.sleep(600);
	}

	/*****************************************************************/
	/* Method to report date or age of diagnosis? */
	/*****************************************************************/
	public void reportDateOrAgeOfDiagnosis() {

		if (currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure").contentEquals("Yes")) {
			// Do you want report date or age of diagnosis? (Bone marrow failure)
			CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.reportDateOrAgeOfDiagnosisDropDownList,
					currentRow.get("DoYouWantReportDateOrAgeOfDiagnosis"));

			// Month of diagnosis (Bone marrow failure month of diagnosis)
			CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfDiagnosisDropDownList,
					currentRow.get("BoneMarrowFailureMonthOfDiagnosis"));

			// Year of diagnosis(Bone marrow failure year of diagnosis)
			CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfDiagnosisDropDownList,
					currentRow.get("BoneMarrowFailureYearOfDiagnosis"));

			// Age at diagnosis(If diagnosed under 1 year, please select 0) (Bone marrow
			// failure age at diagnosis)
			CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.ageAtDiagnosisDropDownList,
					currentRow.get("BoneMarrowFailureAgeAtDiagnosis"));

			// Was treatment received? (Bone marrow failure was treatment received?)
			CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wasTreatmentReceivedDropDownList,
					currentRow.get("BoneMarrowFailureWasTreatmentReceived"));

			if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
					.contentEquals("No, I am completing this form for myself")) {

				// Treatment:If treatment received, please specify treatment (for example
				// androgren, eltrombopag, other)
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentReceivedTextBox,
						currentRow.get("BoneMarrowFailureTreatment"));
			} else if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
					.contentEquals("Yes, I am completing this form for someone else")) {

				// Treatment:If treatment received, please specify treatment (for example
				// androgren, eltrombopag, other)
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentReceivedProxyTextBox,
						currentRow.get("BoneMarrowFailureTreatment"));
			}

			// Did you receive or are you receiving blood transfusions?
			CharmsUtil.selectDropDownValue(
					fanconiEligibilityQuestionnairePage.didYouReceiveBloodTransfusionDropDownList,
					currentRow.get("DidYouReceiveOrReceivingBloodTransfusion"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		} else {
			// Do nothing
		}
		MiscUtils.sleep(600);
	}

	/*
	 * Method to report if ever been diagnosed with myelodysplastic syndrome (MDS)
	 */
	public void diagnosedWithMyelodysplasticSyndrome() {

		if (currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure").contentEquals("Yes")) {

			// Have you ever been diagnosed with myelodysplastic syndrome (MDS)?
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome"));

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

		} else {
			// Do nothing
		}
		MiscUtils.sleep(600);
	}

	/*
	 * Method to report When were you diagnosed with myelodysplastic syndrome(MDS)
	 */
	public void ageOrDateWhenMyelodysplasticSyndromeDiagnosed() {

		if (currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("Yes")) {

			// When were you diagnosed with myelodysplastic syndrome (MDS)? Please enter the
			// age or date when you were diagnosed with MDS below.
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("AgeOrDateWhenMyelodysplasticSyndromeDiagnosed"));

			if (currentRow.get("AgeOrDateWhenMyelodysplasticSyndromeDiagnosed").contentEquals("Age")) {

				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.ageParticipantDiagnosedWithMDSTextBox,
						currentRow.get("AgeWhenMyelodysplasticSyndromeDiagnosed"));
			}

			if (currentRow.get("AgeOrDateWhenMyelodysplasticSyndromeDiagnosed").contentEquals("Date (MM/DD/YYYY)")) {
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.dateParticipantDiagnosedWithMDSTextBox,
						currentRow.get("DateWhenMyelodysplasticSyndromeDiagnosed"));
			}

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

		} else {
			// Do Nothing
		}
		MiscUtils.sleep(600);
	}

	/*
	 * Method to report if received a bone marrow, stem cell, or cord blood
	 * transplant?
	 */
	public void everReceivedBoneMarrowTransplant() {

		if (currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("Yes")
				|| currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("No"))

		{
			// Have you ever received a bone marrow, stem cell, or cord blood transplant?
			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
					currentRow.get("HaveYouEverReceivedBoneMarrowTransplant"));

			if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant")
					.contentEquals("Yes (specify treatment center including city, state, and phone number if known)")) {
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentInstitutionProxyTextBox,
						currentRow.get("BoneMarrowTransplantTreatmentInstitution"));

			} else if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant")
					.contentEquals("Yes (specify treatment institution)")) {
				CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.treatmentInstitutionTextBox,
						currentRow.get("BoneMarrowTransplantTreatmentInstitution"));
			}

			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		} else {
			// Do Nothing
		}
		MiscUtils.sleep(600);
	}

	/*
	 * Method to provide information about when you had a bone marrow, stem cell, or
	 * cord blood transplant. If you do not recall the details, select 'Don't know'.
	 */
	public void reportDateOrAgeOfTransplant() {

		if (currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome").contentEquals("Yes")) {

			if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant")
					.contentEquals("Yes (specify treatment center including city, state, and phone number if known)")) {
				// Do you want to report date or age of your transplant?
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wantToReportDateOrAgeDropDownList,
						currentRow.get("ReportDateOrAgeOfTransplant"));

				// Month of transplant
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfTransplantDropDownList,
						currentRow.get("MonthOfTransplant"));

				// Year of transplant
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfTransplantDropDownList,
						currentRow.get("YearOfTransplant"));

				// Age at transplant (If diagnosed under 1 year, please select 0)
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.ageAtTransplantDropDownList,
						currentRow.get("AgeOfTransplant"));

				// Donor type
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.donorTypeDropDownList,
						currentRow.get("DonorType"));

				// Transplant donor match
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.transpalntDonarTypeDropDownList,
						currentRow.get("TransplantDonorMatch"));

				// Stem cell source
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.stemCellSourceDropDownList,
						currentRow.get("StemCellSource"));

			}

			if (currentRow.get("HaveYouEverReceivedBoneMarrowTransplant")
					.contentEquals("Yes (specify treatment institution)")) {
				// Do you want to report date or age of your transplant?
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wantToReportDateOrAgeDropDownList,
						currentRow.get("ReportDateOrAgeOfTransplant"));

				// Month of transplant
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfTransplantDropDownList,
						currentRow.get("MonthOfTransplant"));

				// Year of transplant
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfTransplantDropDownList,
						currentRow.get("YearOfTransplant"));

				// Age at transplant (If diagnosed under 1 year, please select 0)
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.ageAtTransplantDropDownList,
						currentRow.get("AgeOfTransplant"));

				// Donor type
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.donorTypeDropDownList,
						currentRow.get("DonorType"));

				// Transplant donor match
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.transpalntDonarTypeDropDownList,
						currentRow.get("TransplantDonorMatch"));

				// Stem cell source
				CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.stemCellSourceDropDownList,
						currentRow.get("StemCellSource"));
			}
			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		}
		MiscUtils.sleep(600);
	}

	/* Method to submit information Have you ever been diagnosed with cancer? */
	public void everBeenDiagnosedWithCancer() {

		// Have you ever been diagnosed with cancer?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("HaveYouEverBeenDiagnosedWithCancer"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/* Method to provide all information about cancer */
	public void cancerdetailsAdded() {

		if (currentRow.get("HaveYouEverBeenDiagnosedWithCancer").contentEquals("No")) {
			// Do nothing
		} else {
			if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
					.contentEquals("No, I am completing this form for myself")) {
				for (int i = 0; i <= 3; i++) {

					// Excel Data Reader
					Map<String, String> currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer",
							i);

					// Tumor Type
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#1~", i + 1),
							currentRowForCancerHistory.get("TumorType"));

					// Additional Details
					CharmsUtil.sendKeysToElement(
							fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#2~", i + 1),
							currentRowForCancerHistory.get("TumorAdditionalDetails"));

					// Do you want to report date or age of diagnosis?
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#10~", i + 1),
							currentRowForCancerHistory.get("ReportDateOrAgeOfDiagnosis"));

					// Month of diagnosis
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#3~", i + 1),
							currentRowForCancerHistory.get("TumorMonthOfDiagnosis"));

					// Year of diagnosis
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#4~", i + 1),
							currentRowForCancerHistory.get("TumorYearOfDiagnosis"));

					// Age at diagnosis in years
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#11~", i + 1),
							currentRowForCancerHistory.get("TumorAgeAtDiagnosis"));

					// Are you currently receiving treatment?
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID212#5~", i + 1),
							currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"));

					// Treatment Institution
					CharmsUtil.sendKeysToElement(
							fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#6~", i + 1),
							currentRowForCancerHistory.get("TreatmentInstitution"));

					// Treating Physician
					CharmsUtil.sendKeysToElement(
							fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#7~", i + 1),
							currentRowForCancerHistory.get("TreatingPhysician"));

					// Name of institution or clinic where biopsy occurred
					CharmsUtil.sendKeysToElement(
							fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#8~", i + 1),
							currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"));

					// Name of physician who performed the biopsy
					CharmsUtil.sendKeysToElement(
							fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID212#9~", i + 1),
							currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"));
				}
			}

			if (currentRow.get("AreYouCompletingThisQuestionnaireForSomeoneElse")
					.contentEquals("Yes, I am completing this form for someone else")) {
				for (int i = 0; i <= 3; i++) {
					// Excel Data Reader
					Map<String, String> currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer",
							i);

					// Tumor Type
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#1~", i + 1),
							currentRowForCancerHistory.get("TumorType"));

					// Additional Details
					CharmsUtil.sendKeysToElement(
							fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#2~", i + 1),
							currentRowForCancerHistory.get("TumorAdditionalDetails"));

					// Do you want to report date or age of diagnosis?
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#10~", i + 1),
							currentRowForCancerHistory.get("ReportDateOrAgeOfDiagnosis"));

					// Month of diagnosis
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#3~", i + 1),
							currentRowForCancerHistory.get("TumorMonthOfDiagnosis"));

					// Year of diagnosis
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#4~", i + 1),
							currentRowForCancerHistory.get("TumorYearOfDiagnosis"));

					// Age at diagnosis in years
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#11~", i + 1),
							currentRowForCancerHistory.get("TumorAgeAtDiagnosis"));

					// Are you currently receiving treatment?
					CharmsUtil.selectDropDownValue(
							fanconiEligibilityQuestionnairePage.dynamicCancerDropDownLocator("QR~QID213#5~", i + 1),
							currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"));

					// Treatment Institution
					CharmsUtil.sendKeysToElement(
							fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#6~", i + 1),
							currentRowForCancerHistory.get("TreatmentInstitution"));

					// Treating Physician
					CharmsUtil.sendKeysToElement(
							fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#7~", i + 1),
							currentRowForCancerHistory.get("TreatingPhysician"));

					// Name of institution or clinic where biopsy occurred
					CharmsUtil.sendKeysToElement(
							fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#8~", i + 1),
							currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"));

					// Name of physician who performed the biopsy
					CharmsUtil.sendKeysToElement(
							fanconiEligibilityQuestionnairePage.dynamicCancerTextBoxLocator("QR~QID213#9~", i + 1),
							currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"));
				}
			}
			// Click Next Button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
		}
		MiscUtils.sleep(600);
	}

	/* Method to add current medication(s) that you are receiving? */
	public void currentMedicationsAreYouReceiving() {

		// What current medication(s) are you receiving? (if any)
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.currentMedicationOption,
				currentRow.get("WhatCurrentMedicationsAreYouReceiving"));

		if (currentRow.get("WhatCurrentMedicationsAreYouReceiving").contentEquals("Name of Medication(s)")) {
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.currentMedicationTextBox,
					currentRow.get("CurrentMedicationList"));
		} else {
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.currentMedicationNotApplicableOption);
		}

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/* Method to add How did you hear about this study? */
	public void howDidYouHearAboutThisStudy() {

		// How did you hear about this study?If a specific health care provider referred
		// you to this study, please include their name in the corresponding text box.
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("HowDidYouHearAboutThisStudy"));

		if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Physician")) {
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.physicianNameTextBox,
					currentRow.get("HearAboutThisStudyText"));
		}

		if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Fanconi Anemia Research Fund")) {
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.fanconiAnemiaResearchFundTextBox,
					currentRow.get("HearAboutThisStudyText"));
		}

		if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Genetic counselor")) {
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.geneticCounselorTextBox,
					currentRow.get("HearAboutThisStudyText"));
		}

		if (currentRow.get("HowDidYouHearAboutThisStudy").contentEquals("Other")) {
			CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherProviderTextBox,
					currentRow.get("HearAboutThisStudyText"));
		}

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/* Method to add name,address,and phone number of the health care provider */
	public void healthCareProviderInformation() {

		// In case we require additional medical information to determine if you are
		// eligible to participate in our research study, please provide us with the
		// name, address, and phone number of the health care provider who is most
		// familiar with your case:
		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.healthCareProviderNameTextBox,
				currentRow.get("HealthCareProviderName"));
		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.healthCareProviderAddressTextBox,
				currentRow.get("HealthCareProviderAddress"));
		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.healthCareProviderPhoneNumberTextBox,
				currentRow.get("HealthCareProviderPhoneNumber"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/* Method for permission to call this individual to seek more information? */
	public void permissionToCallProvider() {

		// Do we have your permission to call this individual to seek more information?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("DoWeHaveYourPermissionToCallThisIndividualToSeekMoreInformation"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	/* Method to add main reasons for participating in this study */
	public void mainReasonToParticipateInThisStudy() {

		// What are the main reasons for participating in this study? Select all that
		// apply. Please elaborate on the reason in the corresponding text box.
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy1"));

		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.participateInResearchTextBox,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy1Details"));

		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy2"));

		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.screenForPotentialCancerDiagnosisTextBox,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy2Details"));

		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy3"));

		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.receiveGeneticTestingTextBox,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy3Details"));

		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy4"));

		CharmsUtil.sendKeysToElement(fanconiEligibilityQuestionnairePage.otherTextBox,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy4Details"));

		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);
	}

	
	 // Method to click the final Submit button 
	public void clickSubmitButton() {
	  
	  // click the final Submit button
	  CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton); }
	 

	/******************************************************************/
	/* **** PARTICIPANT DETAILS PAGE IN NATIVE VIEW ASSERTIONS ****** */
	/******************************************************************/

	/* Method to log in to native view */
	public void loginToNativeView() {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		CommonUtils.waitForVisibility(iTrustloginPage.loginLink);
		CharmsUtil.clickOnElement(iTrustloginPage.loginLink);
		CharmsUtil.sendKeysToElement(iTrustloginPage.userNameField, "jains18");
		CharmsUtil.sendKeysToElement(iTrustloginPage.passwordField, "Sj0701**Sj0701**");
		CharmsUtil.clickOnElement(iTrustloginPage.signInButton);
		CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.linkText("Native View")));
		CharmsUtil.clickOnElement(WebDriverUtils.webDriver.findElement(By.linkText("Native View")));
	//	CommonUtils.maximizeWindow();

	}

	/* Method to Login to the Participant details page in Native View */
	public void loginToParticipantDetailsPageInNativeView() {

		CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
		CharmsUtil.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "CHARMS");
		CommonUtils.waitForVisibility(CHARMSParticipantDetailsPage.nVFamiliesLinkInNavigator);
		CommonUtils.waitForVisibility(CHARMSParticipantDetailsPage.nVAllParticipantDetailsLinkInNavigator);
		CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.nVAllParticipantDetailsLinkInNavigator);
		CommonUtils.waitForVisibility(CHARMSParticipantDetailsPage.nVParticipantDetailsListViewiFrame);
		CommonUtils.switchToFrame(CHARMSParticipantDetailsPage.nVParticipantDetailsListViewiFrame);

	}

	/* Method to click the participant detail record in list view page */
	public void participantDetailRecordClicked(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
		currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
		String participantView = currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName");
		String participantProxyView = currentRow.get("ProxyFirstName") + " " + currentRow.get("ProxyLastName");

		// JavascriptUtils.scrollIntoView(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator(participantView));
		// CommonUtils.waitForVisibility(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator(participantView));

		System.out.println(participantView);

		if (currentRow.get("ParticipantFirstName").isBlank()) {

			CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator(participantProxyView));
			System.out.println(participantProxyView);
		} else {
			CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.dynamicPreviewButtonLocator(participantView));
		}

		// JavascriptUtils.scrollIntoView(fanconiScreenerNVPage.nVFamilyMembersOpenRecordButton);
		// CommonUtils.waitForVisibility(fanconiScreenerNVPage.nVFamilyMembersOpenRecordButton);
		// CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFamilyMembersOpenRecordButton);

	}

	/********************************************************************************/
	/* Method to assert the General Information on Participant Details page */
	/********************************************************************************/
	public void generalInformationAssertionOnparticipantDetailPage(int rowNumForAssertion) {

		// Excel Data Reader
		Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		// Subject ID Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantSubjectID, "",
				" Subject ID of the General Information on Participant Details page ");

		// Participant Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantName,
				(currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")),
				" Participant Name of the General Information on Participant Details page ");

		// Generation ID Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantGenerationID, "",
				" Generation ID of the General Information on Participant Details page ");

		// Family Member ID Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantFamilyMemberID, "",
				" Family Member ID of the General Information on Participant Details page ");

		// May we have your permission to contact this relative? Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVpermissionToContactThisRelative, "Yes",
				" May we have your permission to contact this relative of the General Information on Participant Details page ");

		// Enrollment Status Assertion
		CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVpermissionEnrollmentStatus,
				"New Screener Received", " Enrollment Status of the General Information on Participant Details page ");
	}

	/********************************************************************************/
	/* Method to assert the Personal Information on Participant Details */
	/********************************************************************************/
	public void personalInformationAssertionOnparticipantDetailPage(int rowNumForAssertion) {

		// Excel Data Reader
		Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTab);
		cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTab.click();

		// Relationship to You Assertion
		CharmsUtil.assertTextBoxData(softAssert,
				cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabRelationshipToYou, "proband",
				" Relationship to You of the Personal Information on Participant Details page ");

		// First Name Assertion
		CharmsUtil.assertTextBoxData(softAssert,
				cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabFirstName,
				currentRow.get("ParticipantFirstName"),
				"First Name of the Personal Information on Participant Details page ");

		// Middle Name Assertion
		CharmsUtil.assertTextBoxData(softAssert,
				cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabMiddleName,
				currentRow.get("ParticipantMiddleName"),
				" Middle Name of the Personal Information on Participant Details page ");

		// Last Name Assertion
		CharmsUtil.assertTextBoxData(softAssert,
				cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabLastName,
				currentRow.get("ParticipantLastName"),
				" Last Name of the Personal Information on Participant Details page ");

	}

	/********************************************************************************/
	/* Method to assert the Demographic Information on Participant Details */
	/********************************************************************************/
	public void demographicsAssertionOnparticipantDetailPage(int rowNumForAssertion) {

		// Excel Data Reader
		Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantDemographicsTab);
		cHARMSParticipantDetailsPage.nVParticipantDemographicsTab.click();

		// Biological Gender Assertion
		CharmsUtil.assertDropDownData(softAssert,
				cHARMSParticipantDetailsPage.nVParticipantDemographicsTabBiologicalGender,
				currentRow.get("SexAssigned"), " Biological Gender of the Demographics on Participant Details page ");

		// Identified Gender Assertion
		CharmsUtil.assertDropDownData(softAssert,
				cHARMSParticipantDetailsPage.nVParticipantDemographicsTabIdentifiedGender,
				currentRow.get("CurrentGender"), " Identified Gender of the Demographics on Participant Details page ");

		// Participant Race Details (Select all that apply) Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabRaceDetails,
				currentRow.get("RaceList"), " Participant Race link of the Demographics on Participant Details page ");

		// Participant Other Race (Select all that apply) Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabRaceOtherText,
				currentRow.get("OtherRace"),
				" Participant Other Race of the Demographics on Participant Details page ");

		// Ethnicity Assertion
		CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabEthnicity,
				currentRow.get("Ethnicity"), " Ethnicity of the Demographics on Participant Details page ");

		// Pronouns Assertion
		CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabPronouns,
				currentRow.get("Pronouns"), " Pronouns of the Demographics on Participant Details page ");

		// Other Pronouns Assertion
		CharmsUtil.assertTextBoxData(softAssert,
				cHARMSParticipantDetailsPage.nVParticipantDemographicsTabPronounsOtherText,
				currentRow.get("PronounsOther"), " Other Pronouns of the Demographics on Participant Details page ");

		// Is the participant adopted? Assertion
		CharmsUtil.assertDropDownData(softAssert,
				cHARMSParticipantDetailsPage.nVParticipantDemographicsTabIsTheParticipantAdopted,
				currentRow.get("AreYouAdopted"),
				" Is the participant adopted of the Demographics on Participant Details page ");

		// Date of Birth Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabDOB,
				currentRow.get("DOB"), " Date of Birth of the Demographics on Participant Details page ");

		// If Date of Birth is unkown, is this person 18 years old or older Assertion
		CharmsUtil.assertDropDownData(softAssert,
				cHARMSParticipantDetailsPage.nVParticipantDemographicsTabIfDOBUnknownAge18, "-- None --",
				" If Date of Birth is unkown of the Demographics on Participant Details page ");

		// Age Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabtAge, "75",
				" Age of the Demographics on Participant Details page ");
	}

	/********************************************************************************/
	/* Method to assert the Contact Info on Participant Details page */
	/********************************************************************************/
	public void contactInformationAssertionOnparticipantDetailPage(int rowNumForAssertion) {

		// Excel Data Reader
		Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantContactInfoTab);
		cHARMSParticipantDetailsPage.nVParticipantContactInfoTab.click();

		// Does the participant need legal representation? Assertion
		CharmsUtil.assertDropDownData(softAssert,
				cHARMSParticipantDetailsPage.nVParticipantContactInfoTabDoesParticipantNeedLegalRepresentation, "No",
				" Does the participant need legal representation? of the Contact Info on Participant Details page ");

		// Contact Street Address Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabStreetAddress,
				currentRow.get("StreetAddress1") + " " + currentRow.get("StreetAddress2"),
				" Contact Street Address of the Contact Info on Participant Details page ");

		// Contact State Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabState,
				currentRow.get("State"), " Contact State of the Contact Info on Participant Details page ");

		// Contact City Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabCity,
				currentRow.get("City"), " Contact City of the Contact Info on Participant Details page ");

		// Contact Zip Code Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabZipcode,
				currentRow.get("ZipCode"), "Contact Zip Code of the Contact Info on Participant Details page ");

		// Contact Country Assertion
		CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabCountry,
				currentRow.get("CountryLived"), "Contact Country of the Contact Info on Participant Details page ");

		// Contact Email Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabEmail,
				currentRow.get("EmailAddress"), "Contact Email of the Contact Info on Participant Details page ");

		// Contact Home Phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabHomePhone,
				currentRow.get("HomePhoneNumber"),
				"Contact Home Phone of the Contact Info on Participant Details page ");

		// Contact Cell Phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabCellPhone,
				currentRow.get("CellPhoneNumber"),
				"Contact Cell Phone of the Contact Info on Participant Details page ");

		// Contact Work Phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabWorkPhone,
				currentRow.get("WorkPhoneNumber"),
				"Contact Work Phone of the Contact Info on Participant Details page ");

		// Contact Preferred phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantContactInfoTabPreferredPhone,
				currentRow.get("PreferredPhoneNumber"),
				"Contact Preferred phone of the Contact Info on Participant Details page ");
	}

	/********************************************************************************/
	/* Method to click the Back Button on Participant details page */
	/********************************************************************************/
	public void participantDetailsBackButtonClicked() {

		CHARMSParticipantDetailsPage.nVAllParticipantDetailsBackButton.click();
	}

	/********************************************************************************/
	/* Method to submit the Fanconi screener scenario VIA the portal */
	/********************************************************************************/

	public void fanconiEligibilityQuestionnaireSubmissionScenario(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
		currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		// Eligibility Questionnaire link clicked
		fanconiEligibilityQuestionnaireStepsImpl.eligibilityQuestionnairelinkClicked();

		// Initial Study related details page clicked using Next Button
		fanconiEligibilityQuestionnaireStepsImpl.initialStudyRelatedPageClicked();

		// Are you completing this questionnaire for someone else?
		fanconiEligibilityQuestionnaireStepsImpl.participantSubmission();

		// What is your name? Add Name details
		fanconiEligibilityQuestionnaireStepsImpl.participantNameSelected();

		// Are or were you a participant in the NIH Inherited Bone Marrow Failure
		// Syndrome study?
		fanconiEligibilityQuestionnaireStepsImpl.participatedInBoneMarrowFailureStudy();

		// The next set of questions will collect basic information about you.
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

		// Participant Basic Information Added
		fanconiEligibilityQuestionnaireStepsImpl.participantbasicInformationSelected();

		// What is your current gender? (select one) and Pronoun selected
		fanconiEligibilityQuestionnaireStepsImpl.participantGenderInformationSelected();

		// Are you adopted? answered
		fanconiEligibilityQuestionnaireStepsImpl.IsParticipantAdopted();

		// country USA details added
		fanconiEligibilityQuestionnaireStepsImpl.participantCountrySelected();

		// Emails added
		fanconiEligibilityQuestionnaireStepsImpl.emailAddressAdded();

		// Phone numbers added
		fanconiEligibilityQuestionnaireStepsImpl.phoneNumbersAdded();

		// Ethnicity selected
		fanconiEligibilityQuestionnaireStepsImpl.ethnicitySelected();

		// Race selected
		fanconiEligibilityQuestionnaireStepsImpl.raceSelected();

		// Another Medical Institution selected
		fanconiEligibilityQuestionnaireStepsImpl.IsOtherMedicalInstitutionSelected();

		// Please specify the study(ies) or registry group(s) regarding participation in
		// other studies.
		fanconiEligibilityQuestionnaireStepsImpl.otherMedicalInstitutionSelected();

		// Please complete the table below to provide additional information regarding
		// participation in other studies.
		fanconiEligibilityQuestionnaireStepsImpl.otherMedicalInstitutionDetailsAdded();

		// To determine eligibility, we need to collect information about your Fanconi
		// anemia diagnosis and any genetic testing performed.
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

		// Have you been diagnosed with Fanconi anemia?
		fanconiEligibilityQuestionnaireStepsImpl.diagnosedWithFanconiAnemia();

		// Please enter the age or date when you were diagnosed with Fanconi anemia
		// below.
		fanconiEligibilityQuestionnaireStepsImpl.diagnosedWithFanconiAnemiaSelected();

		// Have you had a chromosome breakage test for FA (sometimes also called MMC or
		// DEB test) on a blood sample?
		fanconiEligibilityQuestionnaireStepsImpl.chromosomeBreakageTestSelected();

		// Where was the chromosome breakage test performed?
		fanconiEligibilityQuestionnaireStepsImpl.whereChromosomeBreakageTestPerformed();

		// What was the chromosome breakage test result?
		fanconiEligibilityQuestionnaireStepsImpl.whatWasChromosomeBreakageTestResult();

		// How would you like to provide the chromosome breakage test results to us
		fanconiEligibilityQuestionnaireStepsImpl.toProvideChromosomeBreakageTestResults();

		// Have you ever had complementation testing or genetic testing for Fanconi
		// anemia genes?
		fanconiEligibilityQuestionnaireStepsImpl.hadComplementationGeneticTesting();

		// Was the genetic testing positive for Fanconi anemia
		fanconiEligibilityQuestionnaireStepsImpl.WasTheGeneticTestingPositive();

		// Please check FA genes tested. (Mark all that apply).
		fanconiEligibilityQuestionnaireStepsImpl.checkFAGenesTested();

		// Indicate which mutations/variants were found below(if you have the
		// information
		fanconiEligibilityQuestionnaireStepsImpl.mutationsVariantsInformationSelected();

		// Do you have a copy of the genetic test results?
		fanconiEligibilityQuestionnaireStepsImpl.haveCopyOfGeneticTestResults();

		// How would you like to provide the genetic test results to us?Please select
		fanconiEligibilityQuestionnaireStepsImpl.howProvideGeneticTestResults();

		// Have you been told that you have any of the following features?
		fanconiEligibilityQuestionnaireStepsImpl.featuresOptionsSelected();

		// Have you ever been diagnosed with bone marrow failure?
		fanconiEligibilityQuestionnaireStepsImpl.everBeenDiagnosedWithBoneMarrowFailure();

		// Complete the table below to provide information about when you were diagnosed
		// with bone marrow failure/aplastic anemia or low blood counts.
		fanconiEligibilityQuestionnaireStepsImpl.reportDateOrAgeOfDiagnosis();

		// Have you ever been diagnosed with myelodysplastic syndrome (MDS)?
		fanconiEligibilityQuestionnaireStepsImpl.diagnosedWithMyelodysplasticSyndrome();

		// age or date when you were diagnosed with MDS
		fanconiEligibilityQuestionnaireStepsImpl.ageOrDateWhenMyelodysplasticSyndromeDiagnosed();

		// Have you ever received a bone marrow, stem cell, or cord blood transplant?
		fanconiEligibilityQuestionnaireStepsImpl.everReceivedBoneMarrowTransplant();

		// Please complete the table below to provide information about when you had a
		// bone marrow , stem cell, or cord blood transplant.
		fanconiEligibilityQuestionnaireStepsImpl.reportDateOrAgeOfTransplant();

		// Have you ever been diagnosed with cancer?
		fanconiEligibilityQuestionnaireStepsImpl.everBeenDiagnosedWithCancer();

		// Please complete the table below by selecting which type of primary cancer(s)
		// you were diagnosed with and at what age and year they occurred.
		fanconiEligibilityQuestionnaireStepsImpl.cancerdetailsAdded();

		// What current medication(s) are you receiving? (if any)
		fanconiEligibilityQuestionnaireStepsImpl.currentMedicationsAreYouReceiving();

		// We will now ask a few remaining questions regarding this study.
		// Click Next Button
		CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

		// How did you hear about this study?
		fanconiEligibilityQuestionnaireStepsImpl.howDidYouHearAboutThisStudy();

		// please provide us with the name, address, and phone number of the health care
		// provider
		fanconiEligibilityQuestionnaireStepsImpl.healthCareProviderInformation();

		// Do we have your permission to call this individual to seek more information?
		fanconiEligibilityQuestionnaireStepsImpl.permissionToCallProvider();

		// What are the main reasons for participating in this study?
		fanconiEligibilityQuestionnaireStepsImpl.mainReasonToParticipateInThisStudy();

	}

	/******************************************************************/
	/***** METHODS FOR THE FANCONI SCREENER PAGE IN NATIVE VIEW ****/
	/******************************************************************/

	
	/*****************************************************************/
	/* Method to Login to the the All referral list view in Native View */
	/*****************************************************************/
	public void loginToFanconiStudyPageInNativeView() {

		CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
		CharmsUtil.clickOnElement(nativeViewHomePage.nativeViewFilterNavigator);
		CharmsUtil.sendKeysToElement(nativeViewHomePage.nativeViewFilterNavigator, "All Referrals");
		CommonUtils.waitForVisibility(fanconiScreenerNVPage.nVAllReferralsButton);
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVAllReferralsButton);
		CommonUtils.waitForVisibility(fanconiScreenerNVPage.nVReferralsListViewiFrame);
		CommonUtils.switchToFrame(fanconiScreenerNVPage.nVReferralsListViewiFrame);

	}

	/*****************************************************************/
	/* Method to click Fanconi Preview button on Referall list view page */
	/*****************************************************************/
	public void fanconiStudyPreviewRecordClicked(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
		currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
		
		String referallName = currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName");
		String referallProxyName = currentRow.get("ProxyFirstName") + " " + currentRow.get("ProxyLastName");

		// JavascriptUtils.scrollIntoView(fanconiScreenerNVPage.dynamicReferralPreviewButtonLocator(referallName));
		// CommonUtils.waitForVisibility(fanconiScreenerNVPage.dynamicReferralPreviewButtonLocator(referallName));

		if (currentRow.get("ParticipantFirstName").isBlank()) {
			System.out.println(referallProxyName);
			CharmsUtil.clickOnElement(fanconiScreenerNVPage.dynamicReferralPreviewButtonLocator(referallProxyName));
		} else {
			System.out.println(referallName);
			CharmsUtil.clickOnElement(fanconiScreenerNVPage.dynamicReferralPreviewButtonLocator(referallName));
		}
	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study: General Information */
	/*****************************************************************/
	public void generalInformationAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
	//	currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
		referralValue = fanconiScreenerNVPage.nVFScreenerNumberValue.getText();

		// Number Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerNumber, referralValue,
				"Number of the General Information on Fanconi Study Screener page ");

		// Does the participant need legal representation Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerDoesParticipantNeedLegalRepresentation, "No",
				"Does the participant need legal representation of the General Information on Fanconi Study Screener page ");

		// Study Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerStudy, "Fanconi",
				"Study of the General Information on Fanconi Study Screener page ");

		// Family Member Record Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerFamilyMemberRecord,
				(currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")),
				"Family Member Record of the General Information on Fanconi Study Screener page ");

		// Vital Status Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerVitalStatus, "Not answered",
				"Vital Status of the General Information on Fanconi Study Screener page ");

		// Date of death Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateOfDeath, "",
				"Date of death of the General Information on Fanconi Study Screener page ");

		// Eligibility Status Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEligibilityStatus,
				"Waiting for Eligibility",
				"Eligibility Status of the General Information on Fanconi Study Screener page ");

		// Enrollment Status Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEnrollmentStatus,
				"New Screener Received",
				"Enrollment Status of the General Information on Fanconi Study Screener page ");

		// Date Consent Requested Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateConsentRequested, "",
				"Date Consent Requested of the General Information on Fanconi Study Screener page ");

		// Consent Reminder Count Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerConsentReminderCount, "0",
				"Consent Reminder Count of the General Information on Fanconi Study Screener page ");
	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study: Contact Information */
	/*****************************************************************/
	public void contactInformationAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
	//	currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerContactInfoTab);

		// First Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerFirstName,
				currentRow.get("ParticipantFirstName"),
				" First Name of the Contact Information in Fanconi Study screener page ");

		// Middle Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMiddleName,
				currentRow.get("ParticipantMiddleName"),
				" Middle Name of the Contact Information in Fanconi Study screener page ");

		// Last Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerLastName,
				currentRow.get("ParticipantLastName"),
				" Last Name of the Contact Information in Fanconi Study screener page ");

		// Proxy First Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyFirstName,
				currentRow.get("ProxyFirstName"),
				" Proxy First Name of the Contact Information in Fanconi Study screener page ");

		// Proxy Middle Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyMiddleName,
				currentRow.get("ProxyMiddleName"),
				" Proxy Middle Name of the Contact Information in Fanconi Study screener page ");

		// Proxy Last Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyLastName,
				currentRow.get("ProxyLastName"),
				" Proxy Last Name of the Contact Information in Fanconi Study screener page ");

		// Contact Street Address Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerStreetAddress,
				currentRow.get("StreetAddress1") + " " + currentRow.get("StreetAddress2"),
				" Contact Street Address of the Contact Information in Fanconi Study screener page ");

		// Contact State Assertion
		// CharmsUtil.assertTextBoxData(softAssert,fanconiScreenerNVPage.nVFScreenerState,
		// currentRow.get("State"), " Contact State of the Contact Information in
		// Fanconi Study screener page ");

		// Contact City Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCity, currentRow.get("City"),
				" Contact City of the Contact Information in Fanconi Study screener page ");

		// Contact Zip Code Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerZipcode, currentRow.get("ZipCode"),
				" Contact Zip Code of the Contact Information in Fanconi Study screener page ");

		// Contact Country Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerCountry,
				currentRow.get("CountryLived"),
				" Contact Country of the Contact Information in Fanconi Study screener page ");

		// Contact Email Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerEmail, currentRow.get("EmailAddress"),
				" Contact Email of the Contact Information in Fanconi Study screener page ");

		// Contact Home Phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHomePhone,
				currentRow.get("HomePhoneNumber"),
				" Contact Home Phone of the Contact Information in Fanconi Study screener page ");

		// Contact Cell Phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCellPhone,
				currentRow.get("CellPhoneNumber"),
				" Contact Cell Phone of the Contact Information in Fanconi Study screener page ");

		// Contact Work Phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerWorkPhone,
				currentRow.get("WorkPhoneNumber"),
				" Contact Work Phone of the Contact Information in Fanconi Study screener page ");

		// Contact Preferred phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPreferredPhone,
				currentRow.get("PreferredPhoneNumber"),
				" Contact Preferred phone of the Contact Information in Fanconi Study screener page ");

	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study: Demographics Information */
	/*****************************************************************/
	public void demographicsAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
	//	currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerDemographicsTab);

		// Date of Birth Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDOB, currentRow.get("DOB"),
				" Date of Birth of the Demographics in Fanconi Study screener page ");

		// Biological Gender Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerBiologicalGender,
				currentRow.get("SexAssigned"),
				" Biological Gender of the Demographics in Fanconi Study screener page ");

		// Identified Gender Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerIdentifiedGender,
				currentRow.get("CurrentGender"),
				" Identified Gender of the Demographics in Fanconi Study screener page ");

		// Participant Race (Select all that apply) Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerRace, currentRow.get("RaceList"),
				" Participant Race  of the Demographics in Fanconi Study screener page ");

		// Participant Other Race Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerRaceOtherText,
				currentRow.get("OtherRace"),
				" Participant Other Race of the Demographics in Fanconi Study screener page ");

		// Is the participant adopted? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerIsTheParticipantAdopted,
				currentRow.get("AreYouAdopted"),
				" Is the participant adopted? of the Demographics in Fanconi Study screener page ");

		// Ethnicity Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEthnicity,
				currentRow.get("Ethnicity"), " Ethnicity of the Demographics in Fanconi Study screener page ");

		// Pronouns Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerPronouns, currentRow.get("Pronouns"),
				" Pronouns of the Demographics in Fanconi Study screener page ");

		// Other Pronouns Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPronounsOtherText,
				currentRow.get("PronounsOther"),
				" Other Pronouns Other Pronouns of the Demographics in Fanconi Study screener page ");

	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study:Fanconi History Information */
	/*****************************************************************/
	public void fanconiHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
	//	currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		// click on the Fanconi History Information tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerHistoryTab);

		// History of Fanconi anemia study involvement Assertion
		// PLEASE CHECK IN PORTAL
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerHistoryOfFanconiAnemiaStudyInvolvement,
				currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution"),
				" History of Fanconi anemia study involvement of the Fanconi History in Fanconi Study Screener page ");

		// Fanconi anemia diagnosis? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFanconiAnemiaDiagnosis,
				currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia"),
				" Fanconi anemia diagnosis? of the Fanconi History in Fanconi Study Screener page ");

		// Age at Fanconi diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerAgeAtFanconiDiagnosis,
				currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAge"),
				" Age at Fanconi diagnosis of the Fanconi History in Fanconi Study Screener page ");

		// Date of Fanconi diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateOfFanconiDiagnosis,
				currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaDate"),
				" Date of Fanconi diagnosis of the Fanconi History in Fanconi Study Screener page ");

	}

	/*****************************************************************/
	/*Method to assert Fanconi Study:Genetic Testing History Information*/
	/*****************************************************************/
	public void geneticTestingHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
	//	currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		// click on the Genetic Testing History tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticTestingHistoryTab);

		// Complementation Testing previously done? Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerIsComplementationTestingPreviouslyDone,
				currentRow.get("HaveYouEverHadComplementationGeneticTesting"),
				" Complementation Testing previously done? of the Genetic Testing History in Fanconi Study Screener page ");

		// Genetic testing positive for Fanconi? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticTestingPositiveForFanconi,
				currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia"),
				" Genetic testing positive for Fanconi? of the Genetic Testing History in Fanconi Study Screener page ");

		// Does the participant have a copy of the genetic test results? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDoesGeneticTestResultCopy,
				currentRow.get("DoYouHaveCopyOfGeneticTestResults"),
				" Does the participant have a copy of the genetic test results? of the Genetic Testing History in Fanconi Study Screener page ");

		// Participants preferred method of delivering genetic test results Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticTestResultsDeliveryMethod,
				currentRow.get("HowWouldYouLikeToProvideGeneticTestResults"),
				" Participants preferred method of delivering genetic test results of the Genetic Testing History in Fanconi Study Screener page ");

	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study:FA Genes Tested */
	/*****************************************************************/
	public void fAGenesTestedAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
	//	currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		// click on the Genetic Testing History tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerFAGenesTestedTab);

		// FA Genes Tested Checkboxes Assertion
		// int number = fanconiScreenerNVPage.nVFScreenerFAGenesTested.size();
		for (int i = 0; i <= 26; ++i) {

			// String testnew=
			// fanconiScreenerNVPage.nVFScreenerFAGenesTested.get(i).getDomAttribute("area-label");

			CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.nVFScreenerFAGenesTested.get(i), false,
					"FA Genes checkBox number: " + i + " Tested of the FA Genes Tested in Fanconi Study Screener page");

		}
	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study:Medical History Information */
	/*****************************************************************/
	public void medicalHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
	//	currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		// click on the Medical History tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerMedicalHistoryTab);

		// Ever diagnosed with Cancer? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEverDiagnosedWithCancer,
				currentRow.get("HaveYouEverBeenDiagnosedWithCancer"),
				" Ever diagnosed with Cancer? of the Medical History in Fanconi Study Screener page ");

		// Chromosome breakage test on blood Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestOnBlood,
				currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample"),
				" Chromosome breakage test on blood of the Medical History in Fanconi Study Screener page ");

		// Chromosome breakage test location Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestLocation,
				currentRow.get("WhereWasTheChromosomeBreakageTestPerformed"),
				" Chromosome breakage test location of the Medical History in Fanconi Study Screener page ");

		// Chromosome breakage result Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageResult,
				currentRow.get("WhatWasTheChromosomeBreakageTestResult"),
				" Chromosome breakage result of the Medical History in Fanconi Study Screener page ");

		// Chromosome breakage test on skin Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestOnSkin,
				currentRow.get("ChromosomeBreakageTestOnSkin"),
				" Chromosome breakage test on skin of the Medical History in Fanconi Study Screener page ");

		// Chromosome breakage skin test result Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageSkinTestResult,
				currentRow.get("ChromosomeBreakageSkinTestResult"),
				" Chromosome breakage skin test result of the Medical History in Fanconi Study Screener page ");

		// Chromosome Breakage Blood Test Result Delivery Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerChromosomeBreakageBloodTestResultDelivery,
				currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults"),
				" Chromosome Breakage Blood Test Result Delivery of the Medical History in Fanconi Study Screener page ");

		// Diagnosed with Myelodsplastic Syndrome (MDS) Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDiagnosedWithMyelodsplasticSyndrome,
				currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome"),
				" Diagnosed with Myelodsplastic Syndrome (MDS) of the Medical History in Fanconi Study Screener page ");

		// Age when myelodysplastic syndrome diagnosed Assertion
		CharmsUtil.assertTextBoxData(softAssert,
				fanconiScreenerNVPage.nVFScreenerAgeWhenMyelodysplasticSyndromeDiagnosed,
				currentRow.get("AgeWhenMyelodysplasticSyndromeDiagnosed"),
				" Age when myelodysplastic syndrome diagnosed of the Medical History in Fanconi Study Screener page ");

		// Date when myelodysplastic syndrome diagnosed Assertion
		CharmsUtil.assertTextBoxData(softAssert,
				fanconiScreenerNVPage.nVFScreenerDateWhenMyelodysplasticSyndromeDiagnosed,
				currentRow.get("DateWhenMyelodysplasticSyndromeDiagnosed"),
				" Date when myelodysplastic syndrome diagnosed of the Medical History in Fanconi Study Screener page ");

		// Ever received transplant (bone marrow/stem cell/ cord blood)? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEverReceivedBoneMarrowTransplant,
				currentRow.get("HaveYouEverReceivedBoneMarrowTransplant"),
				" Ever received transplant (bone marrow/stem cell/ cord blood) of the Medical History in Fanconi Study Screener page ");

		// Transplant treatment institution (bone marrow/stem cell/ cord blood)Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerTransplantTreatmentInstitution,
				currentRow.get("BoneMarrowTransplantTreatmentInstitution"),
				" Transplant treatment institution (bone marrow/stem cell/ cord blood) of the Medical History in Fanconi Study Screener page ");

		// Age at transplant Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerAgeAtTransplant,
				currentRow.get("AgeOfTransplant"),
				" Age at transplant of the Medical History in Fanconi Study Screener page ");

		// Month of transplant Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMonthOfTransplant,
				currentRow.get("MonthOfTransplant"),
				" Month of transplant of the Medical History in Fanconi Study Screener page ");

		// Year of transplant Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerYearOfTransplant,
				currentRow.get("YearOfTransplant"),
				" Year of transplant of the Medical History in Fanconi Study Screener page ");

		// Donor type Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDonorType,
				currentRow.get("DonorType"), " Donor type of the Medical History in Fanconi Study Screener page ");

		// Transplant donor match Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerTransplantDonorMatch,
				currentRow.get("TransplantDonorMatch"),
				" Transplant donor match of the Medical History in Fanconi Study Screener page ");

		// Stem cell source Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerStemCellSource,
				currentRow.get("StemCellSource"),
				" Stem cell source of the Medical History in Fanconi Study Screener page ");

		// Current Medications Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCurrentMedications,
				currentRow.get("CurrentMedicationList"),
				" Current Medications of the Medical History in Fanconi Study Screener page ");

		// Health Care Provider Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCarProviderName,
				currentRow.get("HealthCareProviderName"),
				" Health Care Provider Name of the Medical History in Fanconi Study Screener page ");

		// Health Care Provider Address Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCareProviderAddress,
				currentRow.get("HealthCareProviderAddress"),
				" Health Care Provider Address of the Medical History in Fanconi Study Screener page ");

		// Health Care Provider Phone Number Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCareProviderPhoneNumber,
				currentRow.get("HealthCareProviderPhoneNumber"),
				" Health Care Provider Phone Number of the Medical History in Fanconi Study Screener page ");

		// Permission to contact Provider Assertion (Do we have your permission to call
		// this individual to seek more information?)
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPermissionToContactProvider,
				currentRow.get("DoWeHaveYourPermissionToCallThisIndividualToSeekMoreInformation"),
				" Permission to contact Provider Assertion of the Medical History in Fanconi Study Screener page ");

		// JavascriptUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerBoneMarrowFailure);
		// Bone marrow failure? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailure,
				currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure"),
				" Bone marrow failure of the Medical History in Fanconi Study Screener page ");

		// Bone marrow failure age at diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureAgeAtDiagnosis,
				currentRow.get("BoneMarrowFailureAgeAtDiagnosis"),
				" Bone marrow failure age at diagnosis of the Medical History in Fanconi Study Screener page ");

		// Bone marrow failure month of diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureMonthOfDiagnosis,
				currentRow.get("BoneMarrowFailureMonthOfDiagnosis"),
				" Bone marrow failure month of diagnosis of the Medical History in Fanconi Study Screener page ");

		// Bone marrow failure year of diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureYearOfDiagnosis,
				currentRow.get("BoneMarrowFailureYearOfDiagnosis"),
				" Bone marrow failure year of diagnosis of the Medical History in Fanconi Study Screener page ");

		// Bone marrow failure was treatment received? Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureWasTreatmentReceived,
				currentRow.get("BoneMarrowFailureWasTreatmentReceived"),
				" Bone marrow failure was treatment received of the Medical History in Fanconi Study Screener page ");

		// Treatment Assertion (Bone marrow failure)
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerTreatment,
				currentRow.get("BoneMarrowFailureTreatment"),
				" Bone marrow failure Treatment of the Medical History in Fanconi Study Screener page ");

		// Received blood transfusions
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerReceivedBloodTransfusions,
				currentRow.get("DidYouReceiveOrReceivingBloodTransfusion"),
				" Did You receive Blood Transfusions of the Medical History in Fanconi Study Screener page ");

	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study: Participant Features */
	/*****************************************************************/
	public void participantFeaturesAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
	//	currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		// click on the Participant Features tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerParticipantFeaturesTab);

		// Low birth weight Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerLowBirthWeight,
				currentRow.get("LowBirthWeight"),
				" Low birth weight of the Participant Features in Fanconi Study Screener page ");

		// Feeding problems or Failure to thrive Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFeedingProblemsOrFailureToThrive,
				currentRow.get("FeedingProblemsOrFailureToThrive"),
				" Feeding problems or Failure to thrive of the Participant Features in Fanconi Study Screener page ");

		// Short stature Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerShortStature,
				currentRow.get("ShortStature"),
				" Short Stature of the Participant Features in Fanconi Study Screener page ");

		// Neurocognitive/ Developmental delay Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDevelopmentalDelay,
				currentRow.get("NeurocognitiveDevelopmentalDelay"),
				" Neurocognitive Developmental Delayof the Participant Features in Fanconi Study Screener page ");

		// Skin abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerSkinAbnormalities,
				currentRow.get("SkinAbnormalities"),
				"Skin abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Head/Craniofacial abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHeadCraniofacialAbnormalities,
				currentRow.get("HeadCraniofacialAbnormalities"),
				" Head Craniofacial Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Mouth abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerMouthAbnormalities,
				currentRow.get("MouthAbnormalities"),
				" Mouth abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Eye abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEyeAbnormalities,
				currentRow.get("EyeAbnormalities"),
				" Eye Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Ear abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEarAbnormalities,
				currentRow.get("EarAbnormalities"),
				" Ear Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Extremity abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerExtremityAbnormalities,
				currentRow.get("ExtremityAbnormalities"),
				" Extremity Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Skeletal deformities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerSkeletalDeformities,
				currentRow.get("SkeletalDeformities"),
				" Skeletal Deformities of the Participant Features in Fanconi Study Screener page ");

		// Heart problems Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHeartProblems,
				currentRow.get("HeartProblems"),
				" Heart Problems of the Participant Features in Fanconi Study Screener page ");

		// Heart problems other Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHeartProblemsOther,
				currentRow.get("HeartProblemsOther"),
				" Heart Problems Other of the Participant Features in Fanconi Study Screener page ");

		// Kidney abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerKidneyAbnormalities,
				currentRow.get("KidneyAbnormalities"),
				" Kidney Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Genital abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGenitalAbnormalities,
				currentRow.get("GenitalAbnormalities"),
				" Genital Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Fertility problems, hypogonadism Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFertilityProblemsHypogonadism,
				currentRow.get("FertilityProblemsHypogonadism"),
				" Fertility Problems Hypogonadism of the Participant Features in Fanconi Study Screener page ");

		// Endocrine problems Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEndocrineProblems,
				currentRow.get("EndocrineProblems"),
				" Endocrine Problems of the Participant Features in Fanconi Study Screener page ");

		// Metabolic disorders Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerMetabolicDisorders,
				currentRow.get("MetabolicDisorders"),
				" Metabolic Disorders of the Participant Features in Fanconi Study Screener page ");

	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study: Final Information */
	/*****************************************************************/
	public void finaInformationAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
	//	currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);

		// click on the Final Information tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerFinalInformationTab);

		// Particpant in NIH Inherited Bone Marrow Failure Syndrome study? Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudy,
				currentRow.get("AreOrWereYouAParticipanInNIHInheritedBoneMarrowFailuresyndromeStudy"),
				" Particpant in NIH Inherited Bone Marrow Failure Syndrome study of the Final Information in Fanconi Study Screener page ");

		// Main reasons for participating in this study? Select all that apply.Assertion
		CharmsUtil.labelHighlight(
				fanconiScreenerNVPage.nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudyLock);
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMainReasonsForParticipatingInStudy,
				currentRow.get("MainReasonToParticipateInThisStudyAll"),
				" Main reasons for participating in this study of the Final Information in Fanconi Study Screener page ");

		// Participate in research Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerParticipateInResearch,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy1Details"),
				" Participate in research of the Final Information in Fanconi Study Screener page ");

		// Screen for potential cancer diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerScreenForPotentialCancerDiagnosis,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy2Details"),
				" Screen for potential cancer diagnosis of the Final Information in Fanconi Study Screener page ");

		// Receive genetic testing Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerReceiveGeneticTesting,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy3Details"),
				" Receive genetic testing of the Final Information in Fanconi Study Screener page ");

		// Other reason for participation Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerOtherReasonForParticipation,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy4Details"),
				" Other reason for participation of the Final Information in Fanconi Study Screener page ");

		// Previous studies Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPreviousStudies,
				currentRow.get("PreviousStudies"),
				" Previous studies of the Final Information in Fanconi Study Screener page ");

		// How did you hear about this study? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHowDidYouHearAboutThisStudy,
				currentRow.get("HowDidYouHearAboutThisStudy"),
				" How did you hear about this study of the Final Information in Fanconi Study Screener page ");

		// Physician Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPhysician,
				currentRow.get("HearAboutThisStudyText"),
				" Physician of the Final Information in Fanconi Study Screener page ");
	}

	/*****************************************************************/
	/*Method to assert the Fanconi Study:Intake participates in another study*/
	/*****************************************************************/
	public void intakeParticipatesInAnotherStudyAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
		// currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener",
		// rowNumForAssertion);

		// click on the Intake participates in another study tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTab);

		List<WebElement> rowList = fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTableLinks;
		if(!rowList.isEmpty()) {
				for (int i = 0; i <= rowList.size() - 1; i++) {
	
					// scroll to the bottom of the page
					CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);
					// Excel Data Reader
					currentRowForAnotherStudy = CharmsUtil.testManagerData(excelSheet, "OtherStudies", i);
	
					CharmsUtil.clickOnElement(rowList.get(i));
					CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);
	
					/* Intake participates in another study Page Title Assertion */
					CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.IntakeParticipatesInAnotherStudyTitle,
							"Intake participates in another study",
							" Study Name in Intake participates title in another study in Fanconi Study Screener page ");
	
					// Study Name Assertion
					CharmsUtil.assertTextBoxData(softAssert,
							fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyNameTextBox,
							currentRowForAnotherStudy.get("ParticipantStudyNameInNV") + ": "
									+ currentRowForAnotherStudy.get("OtherStudyName"),
							" Study Name in Intake participates in another study in Fanconi Study Screener page ");
	
					// Study Contact Person Assertion
					CharmsUtil.assertTextBoxData(softAssert,
							fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyContactPersonTextBox,
							currentRowForAnotherStudy.get("OtherStudyContactPerson"),
							" Study Contact Person in Intake participates in another study in Fanconi Study Screener page ");
	
					// Study Phone Number Assertion
					CharmsUtil.assertTextBoxData(softAssert,
							fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyPhoneNumberTextBox,
							currentRowForAnotherStudy.get("OtherStudyPhoneNumber"),
							" Study Phone Number in Intake participates in another study in Fanconi Study Screener page ");
	
					// Start Date Assertion
					CharmsUtil.assertTextBoxData(softAssert,
							fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStartDateTextBox,
							currentRowForAnotherStudy.get("OtherStudyParticipationYear1"),
							" Start Date in Intake participates in another study in Fanconi Study Screener page ");
	
					// End Date Assertion
					CharmsUtil.assertTextBoxData(softAssert,
							fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyEndDateTextBox,
							currentRowForAnotherStudy.get("OtherStudyParticipationYear2"),
							" End Date in Intake participates in another study in Fanconi Study Screener page ");
	
					// Institution Assertion
					CharmsUtil.assertTextBoxData(softAssert,
							fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyInstitutionTextBox,
							currentRowForAnotherStudy.get("OtherStudyInstitution"),
							" Institution in Intake participates in another study in Fanconi Study Screener page ");
	
					// Currently participating Assertion
					CharmsUtil.assertDropDownData(softAssert,
							fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyCurrentlyParticipatingDropDown,
							currentRowForAnotherStudy.get("OtherStudyCurrentlyParticipation"),
							" Currently participating in Intake participates in another study in Fanconi Study Screener page ");
	
					// Relationship to you Assertion
					CharmsUtil.assertTextBoxData(softAssert,
							fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyRelationshipToYouTextBox, "",
							" Relationship to you in Intake participates in another study in Fanconi Study Screener page ");
	
					// First Name Assertion
					CharmsUtil.assertTextBoxData(softAssert,
							fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyFirstNameTextBox, "",
							" First Name Intake participates in another study in Fanconi Study Screener page ");
	
					// Last Name Assertion
					CharmsUtil.assertTextBoxData(softAssert,
							fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyLastNameTextBox, "",
							" Last Name Intake participates in another study in Fanconi Study Screener page ");
	
					// Click the back button to reach to main Screener page
					CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
	
					// scroll to the bottom of the page
					CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);
					MiscUtils.sleep(2000);
			}
		}
	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study: Genetic Mutation/Variants */
	/*****************************************************************/
	public void geneticMutationVariantsAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
		// currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener",
		// rowNumForAssertion);

		// Genetic Mutation/Variants Tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticMutationvariantTab);

		List<WebElement> rowList = fanconiScreenerNVPage.nVFScreenerGeneticMutationvariantTableLinks;

		if (!rowList.isEmpty()) {
			for (int i = 0; i <= rowList.size() - 1; i++) {

				// Preview button for the Genetic Mutation/Variants details clicked
				CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticMutationvariantPreviewRecordButton);

				// Open Button for the Genetic Mutation/Variants details clicked
				CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);

				// Genetic Mutation/Variants Title Assertion
				CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationTitle,
						"Genetic Mutation/Variant", " Genetic Mutation/Variants Title in Fanconi Study Screener page ");

				// Screener Assertion
				CharmsUtil.assertTextBoxData(softAssert,
						fanconiScreenerNVPage.nVFScreenerGeneticMutationScreenerTextBox, referralValue,
						" Screener in Genetic Mutation/Variants of Fanconi Study Screener page ");

				// Gene Name Assertion
				CharmsUtil.assertTextBoxData(softAssert,
						fanconiScreenerNVPage.nVFScreenerGeneticMutationGeneNameTextBox, currentRow.get("GeneName"),
						" Gene Name in Genetic Mutation/Variants of Fanconi Study Screener page ");

				// Mutation/Variant Assertion
				CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationVariantTextBox,
						currentRow.get("MutationVariant1"),
						" Mutation/Variant in Genetic Mutation/Variants of Fanconi Study Screener page ");

				// Inherited From Assertion
				CharmsUtil.assertDropDownData(softAssert,
						fanconiScreenerNVPage.nVFScreenerGeneticMutationInheritedFromDropDown,
						currentRow.get("InheritedFrom1"),
						" Inherited From in Genetic Mutation/Variants of Fanconi Study Screener page ");

				// Mutation/Variant 2 Assertion
				CharmsUtil.assertTextBoxData(softAssert,
						fanconiScreenerNVPage.nVFScreenerGeneticMutationVariant2TextBox,
						currentRow.get("MutationVariant2"),
						" Mutation/Variant 2 in Genetic Mutation/Variants of Fanconi Study Screener page ");

				// Inherited From 2 Assertion
				CharmsUtil.assertDropDownData(softAssert,
						fanconiScreenerNVPage.nVFScreenerGeneticMutationInheritedFrom2DropDown,
						currentRow.get("InheritedFrom2"),
						" Inherited From 2 in Genetic Mutation/Variants of Fanconi Study Screener page ");

				// Click the back button to reach to main Screener page
				CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
			}
		}
	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study: Patient Cancer History */
	/*****************************************************************/
	public void cancerHistoryAssertionOnFanconiStudyPage(int rowNumForAssertion) {

		/* Excel Data Reader for FanconiScreener Tab */
		// currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer",
		// rowNumForAssertion);

		// Cancer History Tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerCancerHistoryTab);

		List<WebElement> rowList = fanconiScreenerNVPage.nVFScreenerCancerHistoryTableRowsLink;

		if (!rowList.isEmpty()) {
			for (int i = 0; i <= rowList.size() - 1; i++) {

				// Preview button for the Cancer History details clicked
				CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerCancerHistoryTableLinks);

				// Open Button for the Cancer History details clicked
				CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);

				/* CHARMS Referral Patient Cancer [Fanconi view*] Page Assertions */

				// Cancer History Title Assertion
				CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTitle,
						"CHARMS Referral Patient Cancer", " Cancer History Title in Fanconi Study Screener page ");

				// Tumor Type Assertion
				CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTumorType,
						currentRowForCancerHistory.get("TumorType"), " Tumor Type in Fanconi Study Screener page ");

				// Month of diagnosis Assertion
				CharmsUtil.assertDropDownData(softAssert,
						fanconiScreenerNVPage.nVFScreenerCancerHistoryMonthOfDiagnosis,
						currentRowForCancerHistory.get("TumorMonthOfDiagnosis"),
						" Month of diagnosis in Fanconi Study Screener page ");

				// Year of diagnosis Assertion
				CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryYearOfDiagnosis,
						currentRowForCancerHistory.get("TumorYearOfDiagnosis"),
						" Year of diagnosis in Fanconi Study Screener page ");

				// How old was the research participant when the cancer was diagnosed? Assertion
				CharmsUtil.assertTextBoxData(softAssert,
						fanconiScreenerNVPage.nVFScreenerCancerHistoryHowOldWhenCancerDiagnosed,
						currentRowForCancerHistory.get("TumorAgeAtDiagnosis"),
						" How old was the research participant when the cancer was diagnosed?in Fanconi Study Screener page ");

				// Currently being treated Assertion
				CharmsUtil.assertDropDownData(softAssert,
						fanconiScreenerNVPage.nVFScreenerCancerHistoryCurrentlyBeingTreated,
						currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"),
						" Currently being treated in Fanconi Study Screener page ");

				// Treatment Institution Assertion
				CharmsUtil.assertTextBoxData(softAssert,
						fanconiScreenerNVPage.nVFScreenerCancerHistoryTreatmentInstitution,
						currentRowForCancerHistory.get("TreatmentInstitution"),
						" Treatment Institution in Fanconi Study Screener page ");

				// Treating Physician Assertion
				CharmsUtil.assertTextBoxData(softAssert,
						fanconiScreenerNVPage.nVFScreenerCancerHistoryTreatingPhysician,
						currentRowForCancerHistory.get("TreatingPhysician"),
						" Treating Physician in Fanconi Study Screener page ");

				// Name of institution or clinic where biopsy occurred Assertion
				CharmsUtil.assertTextBoxData(softAssert,
						fanconiScreenerNVPage.nVFScreenerCancerHistoryNameOfInstitution,
						currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"),
						" Name of institution or clinic where biopsy occurred  in Fanconi Study Screener page ");

				// Name of physician who performed the biopsy Assertion
				CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryNameOfPhysician,
						currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"),
						" Name of physician who performed the biopsy in Fanconi Study Screener page ");

				// Click the back button to reach to main Screener page
				CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);
			}
		}
	}

	/*****************************************************************/
	/* Method to assert all data in the Fanconi Study page */
	/*****************************************************************/
	public void fanconiStudyPageAssertions(int rowNumForAssertion) {
		
		/* Excel Data Reader for FanconiScreener Tab */
		currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
				
		/* Excel Data Reader for FanconiScreener Tab */
		currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer", rowNumForAssertion);

		// Fanconi Study Screener: General Information Assertion
		fanconiEligibilityQuestionnaireStepsImpl.generalInformationAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: Contact Information Assertion
		fanconiEligibilityQuestionnaireStepsImpl.contactInformationAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: Demographics Assertion
		fanconiEligibilityQuestionnaireStepsImpl.demographicsAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: Fanconi History Assertion
		fanconiEligibilityQuestionnaireStepsImpl.fanconiHistoryAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: Genetic Testing History Assertion 
		fanconiEligibilityQuestionnaireStepsImpl.geneticTestingHistoryAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: FA Genes Tested Assertion
		fanconiEligibilityQuestionnaireStepsImpl.fAGenesTestedAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: Medical History Assertion
		fanconiEligibilityQuestionnaireStepsImpl.medicalHistoryAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: Participant Features Assertion
		fanconiEligibilityQuestionnaireStepsImpl.participantFeaturesAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: Final Information Assertion
		fanconiEligibilityQuestionnaireStepsImpl.finaInformationAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: Intake participates in another study Assertion
		fanconiEligibilityQuestionnaireStepsImpl
				.intakeParticipatesInAnotherStudyAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: Genetic Mutation/Variants Assertion
		fanconiEligibilityQuestionnaireStepsImpl.geneticMutationVariantsAssertionOnFanconiStudyPage(rowNumForAssertion);
		// Fanconi Study Screener: Patient Cancer History Assertion
		fanconiEligibilityQuestionnaireStepsImpl.cancerHistoryAssertionOnFanconiStudyPage(rowNumForAssertion);

		softAssert.assertAll();
	}

	/****************************************************************************/
	/***** METHODS FOR THE FANCONI PARTICIPANT CONSENT ASSENT IN NATIVE VIEW ****/
	/****************************************************************************/

	/* Method to assert the Fanconi Study: Consent Flow */
	public void fanconiConsentAssertionOnFanconiStudyPage(int rowNumForAssertion) {
		
		/*
		 * //Enrollment status Assertion CharmsUtil.assertDropDownData(softAssert,
		 * cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus,
		 * "New Screener Received",
		 * " Enrollment Status of the General Information on Participant Details page "
		 * );
		 * 
		 * // Submit for Eligibility Review button click
		 * CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.
		 * nVParticipantSubmitForEligibilityReviewButton);
		 * cHARMSParticipantDetailsPage.nVParticipantSubmitForEligibilityReviewButton.
		 * click(); MiscUtils.sleep(2000);
		 * 
		 * //Hold/Non-Participant Date picked
		 * CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.
		 * nVParticipantHoldDateTextBox);
		 * CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.
		 * nVParticipantHoldDateButton);
		 * CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.
		 * nVParticipantHoldGoToTodayButton);
		 * 
		 * // Submit for Eligibility Review button click
		 * CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.
		 * nVParticipantSubmitForEligibilityReviewButton);
		 * cHARMSParticipantDetailsPage.nVParticipantSubmitForEligibilityReviewButton.
		 * click(); MiscUtils.sleep(2000);
		 * 
		 * //Enrollment status Assertion CharmsUtil.assertDropDownData(softAssert,
		 * cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus,
		 * "Eligibility Review",
		 * " Enrollment Status of the General Information on Participant Details page "
		 * );
		 * 
		 * 
		 * // Submit for Mark it Eligible button click
		 * CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.
		 * nVParticipantMarkEligibleButton);
		 * cHARMSParticipantDetailsPage.nVParticipantMarkEligibleButton.click();
		 * MiscUtils.sleep(2000);
		 * 
		 * // Eligibility Status Assertion CharmsUtil.assertDropDownData(softAssert,
		 * cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus, "Eligible",
		 * " Eligibility Status of the General Information on Participant Details page "
		 * );
		 * 
		 * // Enrollment Status Assertion CharmsUtil.assertDropDownData(softAssert,
		 * cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus,
		 * "Awaiting Consent",
		 * " Enrollment Status of the General Information on Participant Details page "
		 * );
		 */

		// scroll to the bottom of the page
		CommonUtils.scrollIntoView(cHARMSParticipantDetailsPage.nVParticipantConsentTableTab);
		MiscUtils.sleep(2000);

		// Click the Consent tab
		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantConsentTableTab);

		// Consent tab--> Table Preview Link
		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantConsentTablePreviewLink);

		// Consent tab--> Open button clicked
		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantOpenRecordButton);

		/*********************************************************************/
		/*********************** CHARMS Consent Page *************************/
		/*********************************************************************/

		// Family Member Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantFamilyMemberTextBox,
				(currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")),
				" Family Member of the CHARMS Consent Page ");

		// Consent Status Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantConsentStatusTextBox, "1",
				"Consent Status in Family Member of the CHARMS Consent Page ");

		// Consent call scheduled time
		CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantConsentCallScheduledTimeTextBox);

		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIcon);

		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantGoToToday);

		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton);

		// Consent Call Date
		CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantConsentCallDatesTextBox);

		CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantTimeIcon1);
		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIcon);

		CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantGoToToday);
		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantGoToToday);

		// CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton);
		// cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton.click();

		// Cohort
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantCohortTextBox, "field",
				" Cohort in CHARMS Consent Page ");

		// Consent Form
		CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantConsentFormDropDown, "Field");

		// Consent Version
		CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantConsentVersionTextBox);

		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIcon3);

		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantGoToToday);

		// Consent Type
		CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantConsentTypeDropDown, "Adult");

		// Response Type
		CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantResponseTypeDropDown,
				"Upload to Portal");

		// Consent Status Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantConsentStatusTextBox, "3",
				" Consent Status Family Member of the CHARMS Consent Page ");

		// Consent Date
		CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantConsentDateTextBox);

		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantTimeIcon4);

		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantGoToToday);

		// CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton);
		// cHARMSParticipantDetailsPage.nVParticipantTimeIconOkButton.click();

		// Consent By

		// Current/Previous
		CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantCurrentPreviousDropDown, "Current");

		// Study
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantStudyTextBox, "Fanconi",
				"Family Member of the CHARMS Consent Page ");

		// Consent/Assent Status
		CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantConsentAssentStatusDropDown,
				"Pending");

		// Interpreter used?
		CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantInterpreterUsedDropDown, "No");

		// Future Use of Specimens and Data by NIH
		CharmsUtil.selectDropDownValue(
				cHARMSParticipantDetailsPage.nVParticipantFutureUseOfSpecimensAndDataByNIHDropDown,
				"Dead End by Study Manager");

		// Future Use by Collaborators
		CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantFutureUseByCollaboratorsDropDown,
				"Dead End by PI");

		// Future Identifiable Use by Collaborators
		CharmsUtil.selectDropDownValue(
				cHARMSParticipantDetailsPage.nVParticipantFutureIdentifiableUseByCollaboratorsDropDown,
				"Dead End by PI");

		// Return of Genetic Findings
		CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantReturnOfGeneticFindingsDropDown, "0");

		// Participant Assent
		// CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantParticipantAssentDropDown);
		CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantParticipantAssentDropDown,
				"Not Needed");

		// Participant Consent
		CharmsUtil.selectDropDownValue(cHARMSParticipantDetailsPage.nVParticipantParticipantConsentDropDown,
				"Required");

		// Call Complete Button Clicked
		// CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantCallCompleteButton);
		// cHARMSParticipantDetailsPage.nVParticipantCallCompleteButton.click();

		// Consent Status Assertion
		CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantConsentStatusTextBox, "5",
				" Consent Status Family Member of the CHARMS Consent Page ");

		// Click attachment button
		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantAttachmentButton);

		// Choose File button
		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantChooseFileButton);

		cHARMSParticipantDetailsPage.nVParticipantChooseFileButton.sendKeys(
				"/Users/jains18/git/CBIIT-Test-Automation/src/main/resources/Family Cohort Study Consent.pdf");

		// Click the Hard copy of the Consent Received Button clickeed
		CharmsUtil.clickOnElement(cHARMSParticipantDetailsPage.nVParticipantHardCopyOfConsentReceivedButton);

		/*
		 * //Click the Fanconi study Preview button
		 * CharmsUtil.labelHighlight(fanconiScreenerNVPage.
		 * nVFScreenerPreviewRecordButton);
		 * fanconiScreenerNVPage.nVFScreenerPreviewRecordButton.click();
		 * 
		 * //Click the Open record button
		 * CharmsUtil.labelHighlight(fanconiScreenerNVPage.nVOpenRecordButton);
		 * fanconiScreenerNVPage.nVOpenRecordButton.click();
		 * 
		 * //scroll to the bottom of the page
		 * CommonUtils.scrollIntoView(fanconiScreenerNVPage.
		 * nVFScreenerIntakeParticipatesInAnotherStudyTable); MiscUtils.sleep(2000);
		 */

		softAssert.assertAll();
	}

	/*****************************************************************/
	/* Method to assert the Participant Detail: Complete page */
	/*****************************************************************/
	public void participantDetailPageAssertion(int rowNumForAssertion) {

		/* Click the Participant details Record */
		fanconiEligibilityQuestionnaireStepsImpl.participantDetailRecordClicked(rowNumForAssertion);
		/* General Information on Participant Details page is verified */
		fanconiEligibilityQuestionnaireStepsImpl.generalInformationAssertionOnparticipantDetailPage(rowNumForAssertion);
		/* Personal Information on Participant Details page is verified */
		fanconiEligibilityQuestionnaireStepsImpl.personalInformationAssertionOnparticipantDetailPage(rowNumForAssertion);			
		/* Demographics on Participant Details page is verified */
		fanconiEligibilityQuestionnaireStepsImpl.demographicsAssertionOnparticipantDetailPage(rowNumForAssertion);
		/* Contact Info on Participant Details page is verified */
		fanconiEligibilityQuestionnaireStepsImpl.contactInformationAssertionOnparticipantDetailPage(rowNumForAssertion);
		
		 softAssert.assertAll();
	}

	/*****************************************************************/
	/* Method to assert the Fanconi Study: Every tab on the page */
	/*****************************************************************/
	public void fanconiStudyCompleteAssertion(int rowNumForAssertion) {

		// Excel Data Reader for FanconiScreener, Cancer tab
		currentRow = CharmsUtil.testManagerData(excelSheet, "FanconiScreener", rowNumForAssertion);
		currentRowForCancerHistory = CharmsUtil.testManagerData(excelSheet, "Cancer", rowNumForAssertion);

		// Referral Number
		referralValue = fanconiScreenerNVPage.nVFScreenerNumberValue.getText();

		// Number Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerNumber, referralValue,
				"Number of the General Information on Fanconi Study Screener page ");

		// Does the participant need legal representation Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerDoesParticipantNeedLegalRepresentation, "No",
				"Does the participant need legal representation of the General Information on Fanconi Study Screener page ");

		// Study Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerStudy, "Fanconi",
				"Study of the General Information on Fanconi Study Screener page ");

		// Family Member Record Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerFamilyMemberRecord,
				(currentRow.get("ParticipantFirstName") + " " + currentRow.get("ParticipantLastName")),
				"Family Member Record of the General Information on Fanconi Study Screener page ");

		// Vital Status Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerVitalStatus, "Not answered",
				"Vital Status of the General Information on Fanconi Study Screener page ");

		// Date of death Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateOfDeath, "",
				"Date of death of the General Information on Fanconi Study Screener page ");

		// Eligibility Status Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEligibilityStatus,
				"Waiting for Eligibility",
				"Eligibility Status of the General Information on Fanconi Study Screener page ");

		// Enrollment Status Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEnrollmentStatus,
				"New Screener Received",
				"Enrollment Status of the General Information on Fanconi Study Screener page ");

		// Date Consent Requested Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateConsentRequested, "",
				"Date Consent Requested of the General Information on Fanconi Study Screener page ");

		// Consent Reminder Count Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerConsentReminderCount, "0",
				"Consent Reminder Count of the General Information on Fanconi Study Screener page ");

		CharmsUtil.labelHighlight(fanconiScreenerNVPage.nVFScreenerContactInfoTab);
		// fanconiScreenerNVPage.nVFScreenerContactInfoTab.click();

		// First Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerFirstName,
				currentRow.get("ParticipantFirstName"),
				" First Name of the Contact Information in Fanconi Study screener page ");

		// Middle Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMiddleName,
				currentRow.get("ParticipantMiddleName"),
				" Middle Name of the Contact Information in Fanconi Study screener page ");

		// Last Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerLastName,
				currentRow.get("ParticipantLastName"),
				" Last Name of the Contact Information in Fanconi Study screener page ");

		// Proxy First Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyFirstName,
				currentRow.get("ProxyFirstName"),
				" Proxy First Name of the Contact Information in Fanconi Study screener page ");

		// Proxy Middle Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyMiddleName,
				currentRow.get("ProxyMiddleName"),
				" Proxy Middle Name of the Contact Information in Fanconi Study screener page ");

		// Proxy Last Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerProxyLastName,
				currentRow.get("ProxyLastName"),
				" Proxy Last Name of the Contact Information in Fanconi Study screener page ");

		// Contact Street Address Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerStreetAddress,
				currentRow.get("StreetAddress1") + " " + currentRow.get("StreetAddress2"),
				" Contact Street Address of the Contact Information in Fanconi Study screener page ");

		// Contact State Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerState, currentRow.get("State"),
				" Contact State of the Contact Information in Fanconi Study screener page ");

		// Contact City Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCity, currentRow.get("City"),
				" Contact City of the Contact Information in Fanconi Study screener page ");

		// Contact Zip Code Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerZipcode, currentRow.get("ZipCode"),
				" Contact Zip Code of the Contact Information in Fanconi Study screener page ");

		// Contact Country Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerCountry,
				currentRow.get("CountryLived"),
				" Contact Country of the Contact Information in Fanconi Study screener page ");

		// Contact Email Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerEmail, currentRow.get("EmailAddress"),
				" Contact Email of the Contact Information in Fanconi Study screener page ");

		// Contact Home Phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHomePhone,
				currentRow.get("HomePhoneNumber"),
				" Contact Home Phone of the Contact Information in Fanconi Study screener page ");

		// Contact Cell Phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCellPhone,
				currentRow.get("CellPhoneNumber"),
				" Contact Cell Phone of the Contact Information in Fanconi Study screener page ");

		// Contact Work Phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerWorkPhone,
				currentRow.get("WorkPhoneNumber"),
				" Contact Work Phone of the Contact Information in Fanconi Study screener page ");

		// Contact Preferred phone Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPreferredPhone,
				currentRow.get("PreferredPhoneNumber"),
				" Contact Preferred phone of the Contact Information in Fanconi Study screener page ");

		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerDemographicsTab);

		// Date of Birth Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDOB, currentRow.get("DOB"),
				" Date of Birth of the Demographics in Fanconi Study screener page ");

		// Biological Gender Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerBiologicalGender,
				currentRow.get("SexAssigned"),
				" Biological Gender of the Demographics in Fanconi Study screener page ");

		// Identified Gender Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerIdentifiedGender,
				currentRow.get("CurrentGender"),
				" Identified Gender of the Demographics in Fanconi Study screener page ");

		// Participant Race (Select all that apply) Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerRace, currentRow.get("RaceList"),
				" Participant Race  of the Demographics in Fanconi Study screener page ");

		// Participant Other Race Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerRaceOtherText,
				currentRow.get("OtherRace"),
				" Participant Other Race of the Demographics in Fanconi Study screener page ");

		// Is the participant adopted? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerIsTheParticipantAdopted,
				currentRow.get("AreYouAdopted"),
				" Is the participant adopted? of the Demographics in Fanconi Study screener page ");

		// Ethnicity Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEthnicity,
				currentRow.get("Ethnicity"), " Ethnicity of the Demographics in Fanconi Study screener page ");

		// Pronouns Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerPronouns, currentRow.get("Pronouns"),
				" Pronouns of the Demographics in Fanconi Study screener page ");

		// Other Pronouns Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPronounsOtherText,
				currentRow.get("PronounsOther"),
				" Other Pronouns Other Pronouns of the Demographics in Fanconi Study screener page ");

		// click on the Fanconi History Information tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerHistoryTab);

		// History of Fanconi anemia study involvement Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerHistoryOfFanconiAnemiaStudyInvolvement,
				currentRow.get("HaveYouEverParticipatedInFanconiAnemiaStudyAtAnotherMedicalInstitution"),
				" History of Fanconi anemia study involvement of the Fanconi History in Fanconi Study Screener page ");

		// Fanconi anemia diagnosis? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFanconiAnemiaDiagnosis,
				currentRow.get("HaveYouBeenDiagnosedWithFanconiAnemia"),
				" Fanconi anemia diagnosis? of the Fanconi History in Fanconi Study Screener page ");

		// Age at Fanconi diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerAgeAtFanconiDiagnosis,
				currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaAge"),
				" Age at Fanconi diagnosis of the Fanconi History in Fanconi Study Screener page ");

		// Date of Fanconi diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerDateOfFanconiDiagnosis,
				currentRow.get("WhenWereYouDiagnosedWithFanconiAnemiaDate"),
				" Date of Fanconi diagnosis of the Fanconi History in Fanconi Study Screener page ");

		// click on the Genetic Testing History tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticTestingHistoryTab);

		// Complementation Testing previously done? Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerIsComplementationTestingPreviouslyDone,
				currentRow.get("HaveYouEverHadComplementationGeneticTesting"),
				" Complementation Testing previously done? of the Genetic Testing History in Fanconi Study Screener page ");

		// Genetic testing positive for Fanconi? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticTestingPositiveForFanconi,
				currentRow.get("WasTheGeneticTestingPositiveForFanconiAnemia"),
				" Genetic testing positive for Fanconi? of the Genetic Testing History in Fanconi Study Screener page ");

		// Does the participant have a copy of the genetic test results? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDoesGeneticTestResultCopy,
				currentRow.get("DoYouHaveCopyOfGeneticTestResults"),
				" Does the participant have a copy of the genetic test results? of the Genetic Testing History in Fanconi Study Screener page ");

		// Participants preferred method of delivering genetic test results Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticTestResultsDeliveryMethod,
				currentRow.get("HowWouldYouLikeToProvideGeneticTestResults"),
				" Participants preferred method of delivering genetic test results of the Genetic Testing History in Fanconi Study Screener page ");

		// click on the Genetic Testing History tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerFAGenesTestedTab);

		// FA Genes Tested Checkboxes Assertion
		for (int i = 0; i <= 26; ++i) {

			CharmsUtil.assertCheckBox(softAssert, fanconiScreenerNVPage.nVFScreenerFAGenesTested.get(i), false,
					"FA Genes checkBox number: " + i + " Tested the FA Genes in Fanconi Study Screener page");
		}

		// click on the Medical History tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerMedicalHistoryTab);

		// Ever diagnosed with Cancer? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEverDiagnosedWithCancer,
				currentRow.get("HaveYouEverBeenDiagnosedWithCancer"),
				" Ever diagnosed with Cancer? of the Medical History in Fanconi Study Screener page ");

		// Chromosome breakage test on blood Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestOnBlood,
				currentRow.get("HaveYouHadAChromosomeBreakageTestForFAOnBloodSample"),
				" Chromosome breakage test on blood of the Medical History in Fanconi Study Screener page ");

		// Chromosome breakage test location Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestLocation,
				currentRow.get("WhereWasTheChromosomeBreakageTestPerformed"),
				" Chromosome breakage test location of the Medical History in Fanconi Study Screener page ");

		// Chromosome breakage result Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageResult,
				currentRow.get("WhatWasTheChromosomeBreakageTestResult"),
				" Chromosome breakage result of the Medical History in Fanconi Study Screener page ");

		// Chromosome breakage test on skin Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageTestOnSkin,
				currentRow.get("ChromosomeBreakageTestOnSkin"),
				" Chromosome breakage test on skin of the Medical History in Fanconi Study Screener page ");

		// Chromosome breakage skin test result Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerChromosomeBreakageSkinTestResult,
				currentRow.get("ChromosomeBreakageSkinTestResult"),
				" Chromosome breakage skin test result of the Medical History in Fanconi Study Screener page ");

		// Chromosome Breakage Blood Test Result Delivery Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerChromosomeBreakageBloodTestResultDelivery,
				currentRow.get("HowWouldYouLikeToProvideChromosomeBreakageTestResults"),
				" Chromosome Breakage Blood Test Result Delivery of the Medical History in Fanconi Study Screener page ");

		// Diagnosed with Myelodsplastic Syndrome (MDS) Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDiagnosedWithMyelodsplasticSyndrome,
				currentRow.get("HaveYouEverBeenDiagnosedWithMyelodysplasticSyndrome"),
				" Diagnosed with Myelodsplastic Syndrome (MDS) of the Medical History in Fanconi Study Screener page ");

		// Age when myelodysplastic syndrome diagnosed Assertion
		CharmsUtil.assertTextBoxData(softAssert,
				fanconiScreenerNVPage.nVFScreenerAgeWhenMyelodysplasticSyndromeDiagnosed,
				currentRow.get("AgeWhenMyelodysplasticSyndromeDiagnosed"),
				" Age when myelodysplastic syndrome diagnosed of the Medical History in Fanconi Study Screener page ");

		// Date when myelodysplastic syndrome diagnosed Assertion
		CharmsUtil.assertTextBoxData(softAssert,
				fanconiScreenerNVPage.nVFScreenerDateWhenMyelodysplasticSyndromeDiagnosed,
				currentRow.get("DateWhenMyelodysplasticSyndromeDiagnosed"),
				" Date when myelodysplastic syndrome diagnosed of the Medical History in Fanconi Study Screener page ");

		// Ever received transplant (bone marrow/stem cell/ cord blood)? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEverReceivedBoneMarrowTransplant,
				currentRow.get("HaveYouEverReceivedBoneMarrowTransplant"),
				" Ever received transplant (bone marrow/stem cell/ cord blood) of the Medical History in Fanconi Study Screener page ");

		// Transplant treatment institution (bone marrow/stem cell/ cord blood)Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerTransplantTreatmentInstitution,
				currentRow.get("BoneMarrowTransplantTreatmentInstitution"),
				" Transplant treatment institution (bone marrow/stem cell/ cord blood) of the Medical History in Fanconi Study Screener page ");

		// Age at transplant Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerAgeAtTransplant,
				currentRow.get("AgeOfTransplant"),
				" Age at transplant of the Medical History in Fanconi Study Screener page ");

		// Month of transplant Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMonthOfTransplant,
				currentRow.get("MonthOfTransplant"),
				" Month of transplant of the Medical History in Fanconi Study Screener page ");

		// Year of transplant Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerYearOfTransplant,
				currentRow.get("YearOfTransplant"),
				" Year of transplant of the Medical History in Fanconi Study Screener page ");

		// Donor type Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDonorType,
				currentRow.get("DonorType"), " Donor type of the Medical History in Fanconi Study Screener page ");

		// Transplant donor match Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerTransplantDonorMatch,
				currentRow.get("TransplantDonorMatch"),
				" Transplant donor match of the Medical History in Fanconi Study Screener page ");

		// Stem cell source Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerStemCellSource,
				currentRow.get("StemCellSource"),
				" Stem cell source of the Medical History in Fanconi Study Screener page ");

		// Current Medications Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCurrentMedications,
				currentRow.get("CurrentMedicationList"),
				" Current Medications of the Medical History in Fanconi Study Screener page ");

		// Health Care Provider Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCarProviderName,
				currentRow.get("HealthCareProviderName"),
				" Health Care Provider Name of the Medical History in Fanconi Study Screener page ");

		// Health Care Provider Address Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCareProviderAddress,
				currentRow.get("HealthCareProviderAddress"),
				" Health Care Provider Address of the Medical History in Fanconi Study Screener page ");

		// Health Care Provider Phone Number Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHealthCareProviderPhoneNumber,
				currentRow.get("HealthCareProviderPhoneNumber"),
				" Health Care Provider Phone Number of the Medical History in Fanconi Study Screener page ");

		// Permission to contact Provider Assertion (Do we have your permission to call
		// this individual to seek more information?)
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPermissionToContactProvider,
				currentRow.get("DoWeHaveYourPermissionToCallThisIndividualToSeekMoreInformation"),
				" Permission to contact Provider Assertion of the Medical History in Fanconi Study Screener page ");

		// JavascriptUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerBoneMarrowFailure);
		// Bone marrow failure? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailure,
				currentRow.get("HaveYouEverBeenDiagnosedWithBoneMarrowFailure"),
				" Bone marrow failure of the Medical History in Fanconi Study Screener page ");

		// Bone marrow failure age at diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureAgeAtDiagnosis,
				currentRow.get("BoneMarrowFailureAgeAtDiagnosis"),
				" Bone marrow failure age at diagnosis of the Medical History in Fanconi Study Screener page ");

		// Bone marrow failure month of diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureMonthOfDiagnosis,
				currentRow.get("BoneMarrowFailureMonthOfDiagnosis"),
				" Bone marrow failure month of diagnosis of the Medical History in Fanconi Study Screener page ");

		// Bone marrow failure year of diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureYearOfDiagnosis,
				currentRow.get("BoneMarrowFailureYearOfDiagnosis"),
				" Bone marrow failure year of diagnosis of the Medical History in Fanconi Study Screener page ");

		// Bone marrow failure was treatment received? Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerBoneMarrowFailureWasTreatmentReceived,
				currentRow.get("BoneMarrowFailureWasTreatmentReceived"),
				" Bone marrow failure was treatment received of the Medical History in Fanconi Study Screener page ");

		// Treatment Assertion (Bone marrow failure)
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerTreatment,
				currentRow.get("BoneMarrowFailureTreatment"),
				" Bone marrow failure Treatment of the Medical History in Fanconi Study Screener page ");

		// Received blood transfusions
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerReceivedBloodTransfusions,
				currentRow.get("DidYouReceiveOrReceivingBloodTransfusion"),
				" Did You receive Blood Transfusions of the Medical History in Fanconi Study Screener page ");

		// click on the Participant Features tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerParticipantFeaturesTab);

		// Low birth weight Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerLowBirthWeight,
				currentRow.get("LowBirthWeight"),
				" Low birth weight of the Participant Features in Fanconi Study Screener page ");

		// Feeding problems or Failure to thrive Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFeedingProblemsOrFailureToThrive,
				currentRow.get("FeedingProblemsOrFailureToThrive"),
				" Feeding problems or Failure to thrive of the Participant Features in Fanconi Study Screener page ");

		// Short stature Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerShortStature,
				currentRow.get("ShortStature"),
				" Short Stature of the Participant Features in Fanconi Study Screener page ");

		// Neurocognitive/ Developmental delay Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerDevelopmentalDelay,
				currentRow.get("NeurocognitiveDevelopmentalDelay"),
				" Neurocognitive Developmental Delayof the Participant Features in Fanconi Study Screener page ");

		// Skin abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerSkinAbnormalities,
				currentRow.get("SkinAbnormalities"),
				"Skin abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Head/Craniofacial abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHeadCraniofacialAbnormalities,
				currentRow.get("HeadCraniofacialAbnormalities"),
				" Head Craniofacial Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Mouth abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerMouthAbnormalities,
				currentRow.get("MouthAbnormalities"),
				" Mouth abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Eye abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEyeAbnormalities,
				currentRow.get("EyeAbnormalities"),
				" Eye Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Ear abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEarAbnormalities,
				currentRow.get("EarAbnormalities"),
				" Ear Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Extremity abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerExtremityAbnormalities,
				currentRow.get("ExtremityAbnormalities"),
				" Extremity Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Skeletal deformities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerSkeletalDeformities,
				currentRow.get("SkeletalDeformities"),
				" Skeletal Deformities of the Participant Features in Fanconi Study Screener page ");

		// Heart problems Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHeartProblems,
				currentRow.get("HeartProblems"),
				" Heart Problems of the Participant Features in Fanconi Study Screener page ");

		// Heart problems other Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerHeartProblemsOther,
				currentRow.get("HeartProblemsOther"),
				" Heart Problems Other of the Participant Features in Fanconi Study Screener page ");

		// Kidney abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerKidneyAbnormalities,
				currentRow.get("KidneyAbnormalities"),
				" Kidney Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Genital abnormalities Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGenitalAbnormalities,
				currentRow.get("GenitalAbnormalities"),
				" Genital Abnormalities of the Participant Features in Fanconi Study Screener page ");

		// Fertility problems, hypogonadism Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerFertilityProblemsHypogonadism,
				currentRow.get("FertilityProblemsHypogonadism"),
				" Fertility Problems Hypogonadism of the Participant Features in Fanconi Study Screener page ");

		// Endocrine problems Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerEndocrineProblems,
				currentRow.get("EndocrineProblems"),
				" Endocrine Problems of the Participant Features in Fanconi Study Screener page ");

		// Metabolic disorders Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerMetabolicDisorders,
				currentRow.get("MetabolicDisorders"),
				" Metabolic Disorders of the Participant Features in Fanconi Study Screener page ");

		// click on the Final Information tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerFinalInformationTab);

		// Particpant in NIH Inherited Bone Marrow Failure Syndrome study? Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudy,
				currentRow.get("AreOrWereYouAParticipanInNIHInheritedBoneMarrowFailuresyndromeStudy"),
				" Particpant in NIH Inherited Bone Marrow Failure Syndrome study of the Final Information in Fanconi Study Screener page ");

		// Main reasons for participating in this study? Select all that apply.Assertion
		CharmsUtil.labelHighlight(
				fanconiScreenerNVPage.nVFScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudyLock);
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerMainReasonsForParticipatingInStudy,
				currentRow.get("MainReasonToParticipateInThisStudyAll"),
				"Main reasons for participating in this study of the Final Information in Fanconi Study Screener page ");

		// Participate in research Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerParticipateInResearch,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy1Details"),
				"Participate in research of the Final Information in Fanconi Study Screener page ");

		// Screen for potential cancer diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerScreenForPotentialCancerDiagnosis,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy2Details"),
				"Screen for potential cancer diagnosis of the Final Information in Fanconi Study Screener page ");

		// Receive genetic testing Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerReceiveGeneticTesting,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy3Details"),
				"Receive genetic testing of the Final Information in Fanconi Study Screener page ");

		// Other reason for participation Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerOtherReasonForParticipation,
				currentRow.get("WhatAreMainReasonToParticipateInThisStudy4Details"),
				"Other reason for participation of the Final Information in Fanconi Study Screener page ");

		// Previous studies Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPreviousStudies,
				currentRow.get("PreviousStudies"),
				" Previous studies of the Final Information in Fanconi Study Screener page ");

		// How did you hear about this study? Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerHowDidYouHearAboutThisStudy,
				currentRow.get("HowDidYouHearAboutThisStudy"),
				" How did you hear about this study of the Final Information in Fanconi Study Screener page ");

		// Physician Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerPhysician,
				currentRow.get("HearAboutThisStudyText"),
				" Health care provider of the Final Information in Fanconi Study Screener page ");

		// click on the Intake Participates In Another Study tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTab);

		// scroll to the bottom of the page
		CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);

		List<WebElement> rowList = fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTableLinks;

		for (int j = 0; j <= rowList.size() - 1; j++) {

			// Excel Data Reader
			currentRowForAnotherStudy = CharmsUtil.testManagerData(excelSheet, "OtherStudies", j);

			CharmsUtil.clickOnElement(rowList.get(j));
			CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);

			/* Intake participates in another study Page Title Assertion */
			CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.IntakeParticipatesInAnotherStudyTitle,
					"Intake participates in another study",
					" Study Name in Intake participates title in another study in Fanconi Study Screener page ");

			// Study Name Assertion
			CharmsUtil.assertTextBoxData(softAssert,
					fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyNameTextBox,
					currentRowForAnotherStudy.get("ParticipantStudyNameInNV") + ": "
							+ currentRowForAnotherStudy.get("OtherStudyName"),
					" Study Name in Intake participates in another study in Fanconi Study Screener page ");

			// Study Contact Person Assertion
			CharmsUtil.assertTextBoxData(softAssert,
					fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyContactPersonTextBox,
					currentRowForAnotherStudy.get("OtherStudyContactPerson"),
					" Study Contact Person in Intake participates in another study in Fanconi Study Screener page ");

			// Study Phone Number Assertion
			CharmsUtil.assertTextBoxData(softAssert,
					fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyPhoneNumberTextBox,
					currentRowForAnotherStudy.get("OtherStudyPhoneNumber"),
					" Study Phone Number in Intake participates in another study in Fanconi Study Screener page ");

			// Start Date Assertion
			CharmsUtil.assertTextBoxData(softAssert,
					fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStartDateTextBox,
					currentRowForAnotherStudy.get("OtherStudyParticipationYear1"),
					" Start Date in Intake participates in another study in Fanconi Study Screener page ");

			// End Date Assertion
			CharmsUtil.assertTextBoxData(softAssert,
					fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyEndDateTextBox,
					currentRowForAnotherStudy.get("OtherStudyParticipationYear2"),
					" End Date in Intake participates in another study in Fanconi Study Screener page ");

			// Institution Assertion
			CharmsUtil.assertTextBoxData(softAssert,
					fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyInstitutionTextBox,
					currentRowForAnotherStudy.get("OtherStudyInstitution"),
					" Institution in Intake participates in another study in Fanconi Study Screener page ");

			// Currently participating Assertion
			CharmsUtil.assertDropDownData(softAssert,
					fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyCurrentlyParticipatingDropDown,
					currentRowForAnotherStudy.get("OtherStudyCurrentlyParticipation"),
					" Currently participating in Intake participates in another study in Fanconi Study Screener page ");

			// Relationship to you Assertion
			CharmsUtil.assertTextBoxData(softAssert,
					fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyRelationshipToYouTextBox, "",
					" Relationship to you in Intake participates in another study in Fanconi Study Screener page ");

			// First Name Assertion
			CharmsUtil.assertTextBoxData(softAssert,
					fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyFirstNameTextBox, "",
					" First Name Intake participates in another study in Fanconi Study Screener page ");

			// Last Name Assertion
			CharmsUtil.assertTextBoxData(softAssert,
					fanconiScreenerNVPage.nVFScreenerIntakeParticipatesStudyLastNameTextBox, "",
					" Last Name Intake participates in another study in Fanconi Study Screener page ");

			// Click the back button to reach to main Screener page
			CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);

			// scroll to the bottom of the page
			CommonUtils.scrollIntoView(fanconiScreenerNVPage.nVFScreenerIntakeParticipatesInAnotherStudyTable);
			MiscUtils.sleep(600);
		}
		
		/**********************************************/
		/* CHARMS Genetic Mutation/Variants Assertions */
		/***********************************************/

		// Genetic Mutation/Variants Tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticMutationvariantTab);

		// CommonUtils.switchToFrame(fanconiScreenerNVPage.nVReferralsListViewiFrame);

		// Preview button for the Genetic Mutation/Variants details clicked
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerGeneticMutationvariantPreviewRecordButton);

		// Open Button for the Genetic Mutation/Variants details clicked
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);

		// Genetic Mutation/Variants Title Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationTitle,
				"Genetic Mutation/Variant", " Genetic Mutation/Variants Title in Fanconi Study Screener page ");

		// Screener Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationScreenerTextBox,
				referralValue, " Screener in Genetic Mutation/Variants of Fanconi Study Screener page ");

		// Gene Name Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationGeneNameTextBox,
				currentRow.get("GeneName"), " Gene Name in Genetic Mutation/Variants of Fanconi Study Screener page ");

		// Mutation/Variant Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationVariantTextBox,
				currentRow.get("MutationVariant1"),
				" Mutation/Variant in Genetic Mutation/Variants of Fanconi Study Screener page ");

		// Inherited From Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationInheritedFromDropDown,
				currentRow.get("InheritedFrom1"),
				" Inherited From in Genetic Mutation/Variants of Fanconi Study Screener page ");

		// Mutation/Variant 2 Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerGeneticMutationVariant2TextBox,
				currentRow.get("MutationVariant2"),
				" Mutation/Variant 2 in Genetic Mutation/Variants of Fanconi Study Screener page ");

		// Inherited From 2 Assertion
		CharmsUtil.assertDropDownData(softAssert,
				fanconiScreenerNVPage.nVFScreenerGeneticMutationInheritedFrom2DropDown,
				currentRow.get("InheritedFrom2"),
				" Inherited From 2 in Genetic Mutation/Variants of Fanconi Study Screener page ");

		// Click the back button to reach to main Screener page
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);

		// Cancer History Tab
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerCancerHistoryTab);

		// Preview button for the Cancer History details clicked
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerCancerHistoryTableLinks);

		// Open Button for the Cancer History details clicked
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerOpenRecordButton);

		/******************************************************************/
		/* CHARMS Referral Patient Cancer [Fanconi view*] Page Assertions */
		/******************************************************************/

		// Cancer History Title Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTitle,
				"CHARMS Referral Patient Cancer", " Cancer History Title in Fanconi Study Screener page ");

		// Tumor Type Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTumorType,
				currentRowForCancerHistory.get("TumorType"), " Tumor Type in Fanconi Study Screener page ");

		// Month of diagnosis Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryMonthOfDiagnosis,
				currentRowForCancerHistory.get("TumorMonthOfDiagnosis"),
				" Month of diagnosis in Fanconi Study Screener page ");

		// Year of diagnosis Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryYearOfDiagnosis,
				currentRowForCancerHistory.get("TumorYearOfDiagnosis"),
				" Year of diagnosis in Fanconi Study Screener page ");

		// How old was the research participant when the cancer was diagnosed? Assertion
		CharmsUtil.assertTextBoxData(softAssert,
				fanconiScreenerNVPage.nVFScreenerCancerHistoryHowOldWhenCancerDiagnosed,
				currentRowForCancerHistory.get("TumorAgeAtDiagnosis"),
				" How old was the research participant when the cancer was diagnosed?in Fanconi Study Screener page ");

		// Currently being treated Assertion
		CharmsUtil.assertDropDownData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryCurrentlyBeingTreated,
				currentRowForCancerHistory.get("AreYouCurrentlyReceivingTumorTreatment"),
				" Currently being treated in Fanconi Study Screener page ");

		// Treatment Institution Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTreatmentInstitution,
				currentRowForCancerHistory.get("TreatmentInstitution"),
				" Treatment Institution in Fanconi Study Screener page ");

		// Treating Physician Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryTreatingPhysician,
				currentRowForCancerHistory.get("TreatingPhysician"),
				" Treating Physician in Fanconi Study Screener page ");

		// Name of institution or clinic where biopsy occurred Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryNameOfInstitution,
				currentRowForCancerHistory.get("NameOfInstitutionOrClinicWhereBiopsyOccured"),
				" Name of institution or clinic where biopsy occurred  in Fanconi Study Screener page ");

		// Name of physician who performed the biopsy Assertion
		CharmsUtil.assertTextBoxData(softAssert, fanconiScreenerNVPage.nVFScreenerCancerHistoryNameOfPhysician,
				currentRowForCancerHistory.get("NameOfPhysicianWhoPerformedBiopsy"),
				" Name of physician who performed the biopsy in Fanconi Study Screener page ");

		// Click the back button to reach to main Screener page
		CharmsUtil.clickOnElement(fanconiScreenerNVPage.nVFScreenerBackButton);

		softAssert.assertAll();
	}
}
