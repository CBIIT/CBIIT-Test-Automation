package ServiceNow.CHARMS.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.nci.automation.dao.ExcelReader;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.CHARMS.NativeView.Pages.CHARMSParticipantDetailsPage;
import ServiceNow.CHARMS.Utils.CharmsUtil;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FanconiEligibilityQuestionnaireSteps extends PageInitializer {

	@Then("fills the Fanconi Eligibility Questionnaire form")
	public void fills_the_Fanconi_Eligibility_Questionnaire_form() {

		Set<String> allWindowHandles = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow : allWindowHandles) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow);
			MiscUtils.sleep(2000);
		}

		// Excel Data Reader
		ExcelReader excelReader = new ExcelReader();
		Map<String, String> CurrentRow = null;
		try {
			List<Map<String, String>> excelDataMapList = excelReader
					.getData("/Users/jains18/git/CBIIT-Test-Automation/src/main/resources/data.xlsx", "Sheet1");
			// CurrentRow = excelDataMapList.get(0);
			CurrentRow = excelDataMapList.get(1);

		} catch (InvalidFormatException | IOException e) {
			e.printStackTrace();
		}

		JavascriptUtils.scrollIntoView(fanconiEligibilityQuestionnairePage.nextButton);
		CommonUtils.waitForVisibility(fanconiEligibilityQuestionnairePage.nextButton);
		MiscUtils.sleep(2000);

		// Initial Study related details
		for (int i = 1; i <= 6; ++i) {

			// Click Next Button
			fanconiEligibilityQuestionnairePage.nextButton.click();
			MiscUtils.sleep(1500);
		}

		// Are you completing this questionnaire for someone else?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.participantCompletingRBtonList,
				CurrentRow.get("ParticipantCompleting"));

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What is your name?
		fanconiEligibilityQuestionnairePage.firstNameTextBox.sendKeys(CurrentRow.get("FirstName"));
		fanconiEligibilityQuestionnairePage.middleNameTextBox.sendKeys(CurrentRow.get("MiddleName"));
		fanconiEligibilityQuestionnairePage.lastNameTextBox.sendKeys(CurrentRow.get("LastName"));

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Are or were you a participant in the NIH Inherited Bone Marrow Failure
		// Syndrome study?

		CharmsUtil.selectRadioButtonValue(
				fanconiEligibilityQuestionnairePage.participateBoneMarrowSyndromeStudyRBtonList,
				CurrentRow.get("ParticipationBoneMarrowSyndromeStudy"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// The next set of questions will collect basic information about you.
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What is your date of birth?
		CommonUtils.waitForVisibility(fanconiEligibilityQuestionnairePage.calendarMonthDropDown);

		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.calendarMonthDropDown,
				CurrentRow.get("DOBMonth"));

		fanconiEligibilityQuestionnairePage.calendarYearTextBox.clear();
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.calendarYearTextBox.sendKeys(CurrentRow.get("DOBYear"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.calendarDayOption.click();
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What was your sex assigned at birth, on your original birth certificate?
		// fanconiEligibilityQuestionnairePage.sexAssignedOption.get(1).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.sexAssignedRBtonList,
				CurrentRow.get("SexAssigned"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What is your current gender? (select one)
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.currentGenderRBtonList,
				CurrentRow.get("CurrentGender"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What are your pronouns?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.pronounsRBtonList,
				CurrentRow.get("Pronouns"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Are you adopted?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.adoptedRBtonList,
				CurrentRow.get("IsAdopted"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// In which country do you currently live DropDown List?
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.countrylivedDropDownList,
				CurrentRow.get("CountryLived"));

		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Please provide the mailing address where study materials can be sent needed.
		fanconiEligibilityQuestionnairePage.streetTextBox.sendKeys(CurrentRow.get("StreetAddress1"));
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.additionalStreetTextBox.sendKeys(CurrentRow.get("StreetAddress2"));
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.cityTextBox.sendKeys(CurrentRow.get("City"));
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.stateTextBox.sendKeys(CurrentRow.get("State"));
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.zipCodeTextBox.sendKeys(CurrentRow.get("ZipCode"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What is your email address?
		fanconiEligibilityQuestionnairePage.emailAddressTextBox.sendKeys(CurrentRow.get("EmailAddress"));

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Please confirm your email address.
		fanconiEligibilityQuestionnairePage.confirmEmailAddressTextBox
				.sendKeys(CurrentRow.get("ConfirmationEmailAddress"));

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Please list your phone numbers below.
		fanconiEligibilityQuestionnairePage.homePhoneNumberTextBox.sendKeys(CurrentRow.get("HomePhoneNumber"));
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.preferredHomePhoneNumberTextBox.click();
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.cellPhoneNumberTextBox.sendKeys(CurrentRow.get("CellPhoneNumber"));
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.workPhoneNumberTextBox.sendKeys(CurrentRow.get("WorkPhoneNumber"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What is your ethnicity?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.ethnicityRBtonList,
				CurrentRow.get("Ethnicity"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What is your race? Please select all that apply.
		for (int j = 1; j <= 6; ++j) {

			CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.raceRBtonList,
					CurrentRow.get("Race" + j));

			// fanconiEligibilityQuestionnairePage.raceRBtonList.get(j).click();
			MiscUtils.sleep(2000);
		}

		fanconiEligibilityQuestionnairePage.otherRaceNameTextBox.sendKeys(CurrentRow.get("OtherRace"));

		System.out.println("Other Race :" + CurrentRow.get("OtherRace"));

		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Have you ever participated in a Fanconi anemia study at another medical
		// institution, university, government agency or other site?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("ParticipationInOtherStudies"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Please specify the study(ies) or registry group(s) regarding participation in
		// other studies.
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("SpecifyParticipationInOtherStudies0"));
		MiscUtils.sleep(2000);

		// for (int j = 1; j <= 5; ++j) {
		// CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
		// CurrentRow.get("SpecifyParticipationInOtherStudies1"));

		fanconiEligibilityQuestionnairePage.commonRBtonList.get(1).click();
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyAt1TextBox
				.sendKeys(CurrentRow.get("SpecifyParticipationInOtherStudiesDetails1"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.commonRBtonList.get(2).click();
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyAt2TextBox
				.sendKeys(CurrentRow.get("SpecifyParticipationInOtherStudiesDetails2"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.commonRBtonList.get(3).click();
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther1TextBox
				.sendKeys(CurrentRow.get("SpecifyParticipationInOtherStudiesDetails3"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.commonRBtonList.get(4).click();
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther2TextBox
				.sendKeys(CurrentRow.get("SpecifyParticipationInOtherStudiesDetails4"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.commonRBtonList.get(5).click();
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.fanconiAnemiaResearcStudyOther3TextBox
				.sendKeys(CurrentRow.get("SpecifyParticipationInOtherStudiesDetails5"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		System.out.println(" Other STudy Name  " + CurrentRow.get("SpecifyParticipationInOtherStudiesDetails4"));
		System.out.println(" Other STudy Name  " + CurrentRow.get("SpecifyParticipationInOtherStudiesDetails5"));

		// Please complete the table below to provide additional information regarding
		// participation in other studies.

		// Other Study Name
		for (int i = 1; i <= 3; ++i) {

			String data = null;

			data = (CurrentRow.get("OtherStudyName" + i));

			System.out.println("Other Study Name data = " + data);

			fanconiEligibilityQuestionnairePage.otherStudyNameList.get(i - 1).sendKeys(data);
			MiscUtils.sleep(2000);
		}

		// Other Study Contact Person
		for (int i = 1; i <= 3; ++i) {

			String data = null;
			data = (CurrentRow.get("OtherStudyContactPerson" + i));

			System.out.println("Other Study Contact Person data = " + data);

			fanconiEligibilityQuestionnairePage.otherStudyContactPersonList.get(i - 1).sendKeys(data);
			MiscUtils.sleep(2000);
		}

		// Other Study Phone Number
		for (int i = 1; i <= 3; ++i) {

			String data = null;
			data = (CurrentRow.get("OtherStudyPhoneNumber" + i));

			System.out.println("Other Study Contact Person data = " + data);

			fanconiEligibilityQuestionnairePage.otherStudyPhoneNumberList.get(i - 1).sendKeys(data);
			MiscUtils.sleep(2000);
		}

		// Other Study Institution
		for (int i = 1; i <= 3; ++i) {

			String data = null;
			data = (CurrentRow.get("OtherStudyInstitution" + i));
			System.out.println("Other Study Institution data = " + data);

			fanconiEligibilityQuestionnairePage.otherStudyInstitutionList.get(i - 1).sendKeys(data);
			MiscUtils.sleep(2000);
		}

		// Other Study Currently Participating
		for (int i = 1; i <= 3; ++i) {
			CharmsUtil.selectDropDownValue(
					fanconiEligibilityQuestionnairePage.otherStudyCurrentlyParticipatingDropDownList.get(i - 1),
					CurrentRow.get("OtherStudyCurrentlyParticipation" + i));

		}

		// Other Study No longer participation in other study Institution Start year and
		// End Year
		for (int i = 1; i <= 6; ++i) {

			String data = null;
			data = (CurrentRow.get("OtherStudyParticipationYear" + i));
			System.out.println("Start year and End Year data = " + data);

			fanconiEligibilityQuestionnairePage.otherStudyNoLongerStartYearList.get(i - 1).sendKeys(data);
			MiscUtils.sleep(2000);
		}

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// To determine eligibility, we need to collect information about your Fanconi
		// anemia diagnosis and any genetic testing performed.
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Have you been diagnosed with Fanconi anemia?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("DiagnosedWithFanconiAnemia"));

		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click(); //YES
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// When were you diagnosed with Fanconi anemia? Please enter the age or date
		// when you were diagnosed with Fanconi anemia below.

		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();

		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("DiagnosedWithFanconiAnemiaAgeOrDate"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.ageParticipantDiagnosedWithFanconiTextBox
				.sendKeys(CurrentRow.get("DiagnosedWithFanconiAnemiaAge"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Have you had a chromosome breakage test for FA (sometimes also called MMC or
		// DEB test) on a blood sample?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("ChromosomeBreakageTest"));

		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Where was the chromosome breakage test performed?
		// waitUntilElemtTobeClickableByXpath(fanconiEligibilityQuestionnairePage.commonOptions.get(0).click());
		// WebDriverUtils.webDriver.navigate().refresh();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("ChromosomeBreakageTestPerformed"));
		MiscUtils.sleep(2000);

		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What was the chromosome breakage test result?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("ChromosomeBreakageTestResult"));
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click(); //
		// Diagnostic of Fanconi anemia
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// How would you like to provide the chromosome breakage test results to
		// us?Please select one.

		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click(); //FAX
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("ChromosomeBreakageTestResultProvide"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// If you have a copy of the chromosome breakage test results, please upload a
		// copy here.
		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Have you ever had complementation testing or genetic testing for Fanconi
		// anemia genes?
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click(); //Yes
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("ComplementationGeneticTesting"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Was the genetic testing positive for Fanconi anemia (did the complementation
		// or genetic testing identify a specific gene for Fanconi anemia)?
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("GeneticTestingPositiveOrNegative"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(1200);

		// Indicate which mutations/variants were found below(if you have the
		// information).

		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.geneNameDropDownList,
				CurrentRow.get("GeneName"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.mutationVariant1TextBox.sendKeys(CurrentRow.get("MutationVariant1"));
		MiscUtils.sleep(2000);

		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.inheritedFrom1DropDownList,
				CurrentRow.get("InheritedFrom1"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.mutationVariant2TextBox.sendKeys(CurrentRow.get("MutationVariant2"));
		MiscUtils.sleep(2000);

		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.inheritedFrom2DropDownList,
				CurrentRow.get("InheritedFrom2"));
		MiscUtils.sleep(2000);

		/*
		 * CommonUtils.selectDropDownIndex(1,
		 * fanconiEligibilityQuestionnairePage.geneNameDropDownList);
		 * MiscUtils.sleep(2000);
		 * fanconiEligibilityQuestionnairePage.mutationVariant1TextBox.sendKeys(
		 * "p.Asp23llefs"); MiscUtils.sleep(2000); //
		 * fanconiEligibilityQuestionnairePage.inheritedFrom1DropDownList.get(0).click()
		 * ; CommonUtils.selectDropDownIndex(1,
		 * fanconiEligibilityQuestionnairePage.inheritedFrom1DropDownList);
		 * MiscUtils.sleep(2000);
		 * fanconiEligibilityQuestionnairePage.mutationVariant2TextBox.sendKeys(
		 * "632456ghyui"); MiscUtils.sleep(2000); //
		 * fanconiEligibilityQuestionnairePage.inheritedFrom1DropDownList.get(0).click()
		 * ; CommonUtils.selectDropDownIndex(1,
		 * fanconiEligibilityQuestionnairePage.inheritedFrom2DropDownList);
		 */

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Do you have a copy of the genetic test results?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("GeneticTestResults"));
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// How would you like to provide the genetic test results to us? Please select
		// one.
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("GeneticTestResultsProvide"));
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Click Next Button
		// If you would like to upload the genetic test results, please do so here.
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Have you been told that you have any of the following features?
		// Please select yes, no, or unknown/unsure for each statement below.
		int optionsLength = fanconiEligibilityQuestionnairePage.yesForFeaturesOptions.size();

		for (int i = 0; i <= optionsLength - 1; ++i) {
			fanconiEligibilityQuestionnairePage.yesForFeaturesOptions.get(i).click();

		}

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Have you ever been diagnosed with bone marrow failure?
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("DiagnosedWithBoneMarrowFailure"));
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Please complete the table below to provide information about when you were
		// diagnosed with bone marrow failure/aplastic anemia or low blood counts.

		/* Do you want report date or age of diagnosis? */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.reportDateOrAgeOfDiagnosisDropDownList);
		CharmsUtil.selectDropDownValue(
				fanconiEligibilityQuestionnairePage.reportDateOrAgeOfDiagnosisDropDownList,
				CurrentRow.get("DateOrAgeOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Month of diagnosis */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.monthOfDiagnosisDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfDiagnosisDropDownList,
				CurrentRow.get("MonthOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Year of diagnosis */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.yearOfDiagnosisDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfDiagnosisDropDownList,
				CurrentRow.get("YearOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Age at diagnosis(If diagnosed under 1 year, please select 0) */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.ageAtDiagnosisDropDownList);
		// MiscUtils.sleep(2000);

		/* Was treatment received? */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.wasTreatmentReceivedDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wasTreatmentReceivedDropDownList,
				CurrentRow.get("WasTreatmentReceived"));
		MiscUtils.sleep(2000);

		/*
		 * Treatment:If treatment received, please specify treatment (for example
		 * androgren, eltrombopag, other)
		 */
		fanconiEligibilityQuestionnairePage.treatmentReceivedTextBox.sendKeys(CurrentRow.get("Treatment"));
		MiscUtils.sleep(2000);

		/* Did you receive or are you receiving blood transfusions? */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.didYouReceiveBloodTransfusionDropDownList);
		CharmsUtil.selectDropDownValue(
				fanconiEligibilityQuestionnairePage.didYouReceiveBloodTransfusionDropDownList,
				CurrentRow.get("BloodTransfusionReceive"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Have you ever been diagnosed with myelodysplastic syndrome (MDS)?
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("MyelodysplasticSyndromeDiagnosed"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// When were you diagnosed with myelodysplastic syndrome (MDS)? Please enter the
		// age or date when you were diagnosed with MDS below.
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();

		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("MyelodysplasticSyndromeDiagnosedAgeOrDate"));
		MiscUtils.sleep(1000);

		fanconiEligibilityQuestionnairePage.ageParticipantDiagnosedWithMDSTextBox
				.sendKeys(CurrentRow.get("MyelodysplasticSyndromeDiagnosedAge"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(1500);

		// Have you ever received a bone marrow, stem cell, or cord blood transplant?
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("EverReceivedBoneMarrowTransplant"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.treatmentInstitutionTextBox
				.sendKeys(CurrentRow.get("BoneMarrowTransplantTreatmentInstitution"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Please complete the table below to provide information about when you had a
		// bone marrow, stem cell, or cord blood transplant.

		/* Do you want to report date or age of your transplant? */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.wantToReportDateOrAgeDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.wantToReportDateOrAgeDropDownList,
				CurrentRow.get("ReportDateOrAgeOfTransplant"));

		MiscUtils.sleep(2000);

		/* Month of transplant */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.monthOfTransplantDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.monthOfTransplantDropDownList,
				CurrentRow.get("MonthOfTransplant"));
		MiscUtils.sleep(2000);

		/* Year of transplant */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.yearOfTransplantDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.yearOfTransplantDropDownList,
				CurrentRow.get("YearOfTransplant"));
		MiscUtils.sleep(2000);

		/* Age at transplant (If diagnosed under 1 year, please select 0) */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.ageAtTransplantDropDownList);
		// MiscUtils.sleep(2000);

		/* Donor type */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.donarTypeDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.donorTypeDropDownList,
				CurrentRow.get("DonorType"));
		MiscUtils.sleep(2000);

		/* Transplant donor match */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.transpalntDonarTypeDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.transpalntDonarTypeDropDownList,
				CurrentRow.get("TransplantDonorMatch"));
		MiscUtils.sleep(2000);

		/* Stem cell source */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.stemCellSourceDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.stemCellSourceDropDownList,
				CurrentRow.get("StemCellSource"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Have you ever been diagnosed with cancer?
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("DiagnosedWithCancer"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Please complete the table below by selecting which type of primary cancer(s)
		// you were diagnosed with and at what age and year they occurred.

		/* Tumor Type */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.tumorTypeDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.tumorTypeDropDownList,
				CurrentRow.get("TumorType"));
		MiscUtils.sleep(2000);

		/* Additional Details */
		fanconiEligibilityQuestionnairePage.tumorAdditionalDetailsTextBox
				.sendKeys(CurrentRow.get("TumorAdditionalDetails"));
		MiscUtils.sleep(2000);

		/* Do you want to report date or age of diagnosis? */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.tumorDateOrAgeOfDiagnosisDropDownList);
		CharmsUtil.selectDropDownValue(
				fanconiEligibilityQuestionnairePage.tumorDateOrAgeOfDiagnosisDropDownList,
				CurrentRow.get("ReportDateOrAgeOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Month of diagnosis */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.tumorMonthOfDiagnosisDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.tumorMonthOfDiagnosisDropDownList,
				CurrentRow.get("TumorMonthOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Year of diagnosis */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.tumorYearOfDiagnosisDropDownList);
		CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.tumorYearOfDiagnosisDropDownList,
				CurrentRow.get("TumorYearOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Age at diagnosis in years */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.tumorAgeOfDiagnosisDropDownList);
		// CharmsUtil.selectDropDownValue(fanconiEligibilityQuestionnairePage.tumorAgeOfDiagnosisDropDownList,
		// CurrentRow.get("TumorAgeAtDiagnosis"));
		// MiscUtils.sleep(2000);

		/* Are you currently receiving treatment? */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.areYouCurrentlyReceivingTreatmentDropDownList);
		CharmsUtil.selectDropDownValue(
				fanconiEligibilityQuestionnairePage.areYouCurrentlyReceivingTreatmentDropDownList,
				CurrentRow.get("TumorTreatmentCurrentlyReceiving"));
		MiscUtils.sleep(2000);

		/* Treatment Institution */
		fanconiEligibilityQuestionnairePage.tumorTreatmentInstitutionTextBox
				.sendKeys(CurrentRow.get("TreatmentInstitution"));
		MiscUtils.sleep(2000);

		/* Treating Physician */
		fanconiEligibilityQuestionnairePage.tumorTreatingPhysicianTextBox.sendKeys(CurrentRow.get("TreatingPhysician"));
		MiscUtils.sleep(2000);

		/* Name of institution or clinic where biopsy occurred */
		fanconiEligibilityQuestionnairePage.tumorInstitutionClinicTextBox
				.sendKeys(CurrentRow.get("InstitutionBiopsyOccured"));
		MiscUtils.sleep(2000);

		/* Name of physician who performed the biopsy */
		fanconiEligibilityQuestionnairePage.tumorPhysicianNameTextBox
				.sendKeys(CurrentRow.get("PhysicianPerformedBiopsy"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What current medication(s) are you receiving? (if any)
		// fanconiEligibilityQuestionnairePage.currentMedicationOption.click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.currentMedicationOption,
				CurrentRow.get("CurrentMedication"));
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.currentMedicationTextBox.sendKeys(CurrentRow.get("CurrentMedicationList"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// We will now ask a few remaining questions regarding this study.
		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// How did you hear about this study?
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("HearAboutThisStudy"));
		MiscUtils.sleep(2000);
		fanconiEligibilityQuestionnairePage.physicianNameTextBox
				.sendKeys(CurrentRow.get("HearAboutThisStudyPhysicianText"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// In case we require additional medical information to determine if you are
		// eligible to participate in our research study, please provide us with the
		// name, address, and phone number of the health care provider who is most
		// familiar with your case:
		fanconiEligibilityQuestionnairePage.healthCareProviderNameTextBox
				.sendKeys(CurrentRow.get("HealthCareProviderName"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.healthCareProviderAddressTextBox
				.sendKeys(CurrentRow.get("HealthCareProviderAddress"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.healthCareProviderPhoneNumberTextBox
				.sendKeys(CurrentRow.get("HealthCareProviderPhoneNumber"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// Do we have your permission to call this individual to seek more information?
		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("SeekMoreInformation"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);

		// What are the main reasons for participating in this study? Select all that
		// apply. Please elaborate on the reason in the corresponding text box.

		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(0).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("ReasonForStudyParticipation1"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.participateInResearchTextBox
				.sendKeys(CurrentRow.get("ReasonForStudyParticipationDetails1"));
		MiscUtils.sleep(2000);

		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(1).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("ReasonForStudyParticipation2"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.screenForPotentialCancerDiagnosisTextBox
				.sendKeys(CurrentRow.get("ReasonForStudyParticipationDetails2"));
		MiscUtils.sleep(2000);

		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(2).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("ReasonForStudyParticipation3"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.receiveGeneticTestingTextBox
				.sendKeys(CurrentRow.get("ReasonForStudyParticipationDetails3"));
		MiscUtils.sleep(2000);

		// fanconiEligibilityQuestionnairePage.commonRBtonList.get(3).click();
		CharmsUtil.selectRadioButtonValue(fanconiEligibilityQuestionnairePage.commonRBtonList,
				CurrentRow.get("ReasonForStudyParticipation4"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.otherTextBox
				.sendKeys(CurrentRow.get("ReasonForStudyParticipationDetails4"));
		MiscUtils.sleep(2000);

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(2000);
	}

	@Then("clicks the submit button")
	public void clicks_the_submit_button() {

		// Click Next Button
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(3000);
		// fanconiEligibilityQuestionnairePage.nextButton.click();
		// MiscUtils.sleep(2000);
	}

	@Given("the study nurse log in Native View")
	public void the_study_nurse_log_in_Native_View() throws InvalidFormatException, IOException, TestingException {
		// Logging into native view
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);

		CommonUtils.waitForVisibility(iTrustloginPage.loginLink);
		iTrustloginPage.loginLink.click();
		MiscUtils.sleep(2000);

		//CucumberLogUtils.logScreenShot();

		iTrustloginPage.userNameField.sendKeys("jains18");
		MiscUtils.sleep(500);

		iTrustloginPage.passwordField.sendKeys("Sj0701**Sj0701**");
		MiscUtils.sleep(2000);

		iTrustloginPage.signInButton.click();
		MiscUtils.sleep(2000);

		CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.linkText("Native View")));
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();

		CommonUtils.maximizeWindow();
		CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
		MiscUtils.sleep(2000);

		CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
		nativeViewHomePage.nativeViewFilterNavigator.sendKeys("CHARMS");

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(CHARMSParticipantDetailsPage.nVFamiliesLinkInNavigator);
		// CHARMSParticipantDetailsPage.nVFamiliesLinkInNavigator.click();

		CommonUtils.waitForVisibility(CHARMSParticipantDetailsPage.nVAllParticipantDetailsLinkInNavigator);
		CHARMSParticipantDetailsPage.nVAllParticipantDetailsLinkInNavigator.click();

		CommonUtils.waitForVisibility(CHARMSParticipantDetailsPage.nVParticipantDetailsListViewiFrame);
		CommonUtils.switchToFrame(CHARMSParticipantDetailsPage.nVParticipantDetailsListViewiFrame);

		CommonUtils.waitForVisibility(fanconiScreenerNVPage.nVParticipantDetailsPreviewButton);
		fanconiScreenerNVPage.nVParticipantDetailsPreviewButton.click();

		MiscUtils.sleep(2000);

		/*
		 * Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		 * for (String currentWindow1 : allWindowHandles1) {
		 * WebDriverUtils.webDriver.switchTo().window(currentWindow1);}
		 */
		CommonUtils.waitForVisibility(fanconiScreenerNVPage.nVParticipantDetailsOpenRecordButton);
		fanconiScreenerNVPage.nVParticipantDetailsOpenRecordButton.click();

	}

	@Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page in Native View")
	public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Participant_Details_page_in_Native_View()
			throws InvalidFormatException, IOException, TestingException {
	
		SoftAssert softAssert = new SoftAssert();
	
		String	excelSheet=  "/Users/jains18/git/CBIIT-Test-Automation/src/main/resources/data.xlsx";
	
	Map<String, String> currentRow = CharmsUtil.testManagerData(excelSheet,"FanconiScreener",0);
	
	/************************************************/
	/* General Information on Participant Details page is verified */
	/************************************************/
	
			// Subject ID Assertion	
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantSubjectID, ""," Subject ID of the General Information on Participant Details page ");

			// Participant Name Assertion
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantName,(currentRow.get("FirstName") + " " + currentRow.get("LastName"))," Participant Name of the General Information on Participant Details page ");
			
			// Generation ID Assertion
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantGenerationID, "", " Generation ID of the General Information on Participant Details page ");

			// Family Member ID Assertion
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantFamilyMemberID, "", " Family Member ID of the General Information on Participant Details page ");
			
			// May we have your permission to contact this relative? Assertion
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVpermissionToContactThisRelative,
					"Yes"," May we have your permission to contact this relative of the General Information on Participant Details page ");
			
			// Study Name Assertion
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantStudy, "Fanconi", " Study Name of the General Information on Participant Details page ");
			
			// Eligibility Status Assertion
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantEligibilityStatus, "Waiting for Eligibility"," Eligibility Status of the General Information on Participant Details page ");
			
			// Enrollment Status Assertion
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantEnrollmentStatus, "New Screener Received", " Enrollment Status of the General Information on Participant Details page ");
		
			// Referral Assertion
			String referralValue = cHARMSParticipantDetailsPage.nVParticipantReferral.getAttribute("value");
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantReferral, referralValue, " Referral of the General Information on Participant Details page ");

			// Assigned To Assertion	
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantAssignedTo, "", " Assigned To of the General Information on Participant Details page ");
			
			/************************************************/
			/* Personal Information on Participant Details page is verified */
			/************************************************/
			
			CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTab);
			cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTab.click();
			
			// Relationship to You Assertion
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabRelationshipToYou, "proband", " Relationship to You of the Personal Information on Participant Details page ");

			// First Name Assertion
			CharmsUtil.assertTextBoxData(softAssert,
			cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabFirstName, currentRow.get("FirstName"), "First Name of the Personal Information on Participant Details page ");

			// Middle Name Assertion
			CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabMiddleName,currentRow.get("MiddleName"), " Middle Name of the Personal Information on Participant Details page ");

			// Last Name Assertion
			CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantPersonalInformationTabLastName, currentRow.get("LastName"), " Last Name of the Personal Information on Participant Details page ");
			
			
			/************************************************/
			/* Demographics on Participant Details page is verified */
			/************************************************/

			CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantDemographicsTab);
			cHARMSParticipantDetailsPage.nVParticipantDemographicsTab.click();

			// Biological Gender Assertion
			CharmsUtil.assertDropDownData(softAssert,cHARMSParticipantDetailsPage.nVParticipantDemographicsTabBiologicalGender,
			currentRow.get("SexAssigned"), " Biological Gender of the Demographics on Participant Details page ");

			// Identified Gender Assertion
			CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabIdentifiedGender,
			currentRow.get("CurrentGender"), " Identified Gender of the Demographics on Participant Details page ");
			
			// Participant Race link (Select all that apply) Assertion
			CharmsUtil.labelHighlight(cHARMSParticipantDetailsPage.nVParticipantDemographicsTabRace);
			System.out.println("New RACE : " + cHARMSParticipantDetailsPage.nVParticipantDemographicsTabRaceDetails.getText());

			// Participant Race Details (Select all that apply) Assertion
			CharmsUtil.assertTextBoxData(softAssert,
			cHARMSParticipantDetailsPage.nVParticipantDemographicsTabRaceDetails, currentRow.get("RaceList"), " Participant Race link of the Demographics on Participant Details page ");
			
			// Participant Other Race (Select all that apply) Assertion
			CharmsUtil.assertTextBoxData(softAssert,
			cHARMSParticipantDetailsPage.nVParticipantDemographicsTabRaceOtherText, currentRow.get("OtherRace"), " Participant Other Race of the Demographics on Participant Details page ");

			// Ethnicity Assertion
			CharmsUtil.assertDropDownData(softAssert,
			cHARMSParticipantDetailsPage.nVParticipantDemographicsTabEthnicity, currentRow.get("Ethnicity"), " Ethnicity of the Demographics on Participant Details page ");

			// Pronouns Assertion
			CharmsUtil.assertDropDownData(softAssert,
			cHARMSParticipantDetailsPage.nVParticipantDemographicsTabPronouns, currentRow.get("Pronouns"), " Pronouns of the Demographics on Participant Details page ");

			// Other Pronouns Assertion
			CharmsUtil.assertTextBoxData(softAssert,cHARMSParticipantDetailsPage.nVParticipantDemographicsTabPronounsOtherText,
			"", " Other Pronouns of the Demographics on Participant Details page ");

			// Is the participant adopted? Assertion
			CharmsUtil.assertDropDownData(softAssert,
			cHARMSParticipantDetailsPage.nVParticipantDemographicsTabIsTheParticipantAdopted,
			currentRow.get("IsAdopted"), " Is the participant adopted of the Demographics on Participant Details page ");

			// Date of Birth Assertion
			
			 CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabDOB, currentRow.get("DOB"), " Date of Birth of the Demographics on Participant Details page ");

			// If Date of Birth is unkown, is this person 18 years old or older Assertion
			CharmsUtil.assertDropDownData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabIfDOBUnknownAge18, "", " If Date of Birth is unkown of the Demographics on Participant Details page ");

			// Age Assertion
			CharmsUtil.assertTextBoxData(softAssert, cHARMSParticipantDetailsPage.nVParticipantDemographicsTabtAge, "75", " Age of the Demographics on Participant Details page ");
			
			softAssert.assertAll();

	}		
}
