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

import com.nci.automation.dao.ExcelReader;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.CHARMS.Utils.CharmsUtil;
import ServiceNow.CHARMS.Utils.ComponentTestResult;
import ServiceNow.CHARMS.Utils.StepTestResult;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FanconiEligibilityQuestionnaireSteps extends PageInitializer {

	private ArrayList<StepTestResult> scenarioReportList = new ArrayList<StepTestResult>();

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
			CurrentRow = excelDataMapList.get(0);

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

		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.calendarMonthDropDown,
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
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.countrylivedDropDownList,
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
			CharmsUtil.selectValueFromDropDownList(
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

		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.geneNameDropDownList,
				CurrentRow.get("GeneName"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.mutationVariant1TextBox.sendKeys(CurrentRow.get("MutationVariant1"));
		MiscUtils.sleep(2000);

		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.inheritedFrom1DropDownList,
				CurrentRow.get("InheritedFrom1"));
		MiscUtils.sleep(2000);

		fanconiEligibilityQuestionnairePage.mutationVariant2TextBox.sendKeys(CurrentRow.get("MutationVariant2"));
		MiscUtils.sleep(2000);

		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.inheritedFrom2DropDownList,
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
		CharmsUtil.selectValueFromDropDownList(
				fanconiEligibilityQuestionnairePage.reportDateOrAgeOfDiagnosisDropDownList,
				CurrentRow.get("DateOrAgeOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Month of diagnosis */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.monthOfDiagnosisDropDownList);
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.monthOfDiagnosisDropDownList,
				CurrentRow.get("MonthOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Year of diagnosis */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.yearOfDiagnosisDropDownList);
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.yearOfDiagnosisDropDownList,
				CurrentRow.get("YearOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Age at diagnosis(If diagnosed under 1 year, please select 0) */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.ageAtDiagnosisDropDownList);
		// MiscUtils.sleep(2000);

		/* Was treatment received? */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.wasTreatmentReceivedDropDownList);
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.wasTreatmentReceivedDropDownList,
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
		CharmsUtil.selectValueFromDropDownList(
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
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.wantToReportDateOrAgeDropDownList,
				CurrentRow.get("ReportDateOrAgeOfTransplant"));

		MiscUtils.sleep(2000);

		/* Month of transplant */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.monthOfTransplantDropDownList);
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.monthOfTransplantDropDownList,
				CurrentRow.get("MonthOfTransplant"));
		MiscUtils.sleep(2000);

		/* Year of transplant */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.yearOfTransplantDropDownList);
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.yearOfTransplantDropDownList,
				CurrentRow.get("YearOfTransplant"));
		MiscUtils.sleep(2000);

		/* Age at transplant (If diagnosed under 1 year, please select 0) */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.ageAtTransplantDropDownList);
		// MiscUtils.sleep(2000);

		/* Donor type */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.donarTypeDropDownList);
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.donorTypeDropDownList,
				CurrentRow.get("DonorType"));
		MiscUtils.sleep(2000);

		/* Transplant donor match */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.transpalntDonarTypeDropDownList);
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.transpalntDonarTypeDropDownList,
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
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.tumorTypeDropDownList,
				CurrentRow.get("TumorType"));
		MiscUtils.sleep(2000);

		/* Additional Details */
		fanconiEligibilityQuestionnairePage.tumorAdditionalDetailsTextBox
				.sendKeys(CurrentRow.get("TumorAdditionalDetails"));
		MiscUtils.sleep(2000);

		/* Do you want to report date or age of diagnosis? */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.tumorDateOrAgeOfDiagnosisDropDownList);
		CharmsUtil.selectValueFromDropDownList(
				fanconiEligibilityQuestionnairePage.tumorDateOrAgeOfDiagnosisDropDownList,
				CurrentRow.get("ReportDateOrAgeOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Month of diagnosis */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.tumorMonthOfDiagnosisDropDownList);
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.tumorMonthOfDiagnosisDropDownList,
				CurrentRow.get("TumorMonthOfDiagnosis"));
		MiscUtils.sleep(2000);

		/* Year of diagnosis */
		// CommonUtils.selectDropDownIndex(1,
		// fanconiEligibilityQuestionnairePage.tumorYearOfDiagnosisDropDownList);
		CharmsUtil.selectValueFromDropDownList(fanconiEligibilityQuestionnairePage.tumorYearOfDiagnosisDropDownList,
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
		CharmsUtil.selectValueFromDropDownList(
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
		CucumberLogUtils.logScreenShot();

		CommonUtils.waitForVisibility(iTrustloginPage.loginLink);
		iTrustloginPage.loginLink.click();
		MiscUtils.sleep(2000);

		CucumberLogUtils.logScreenShot();

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
		
		CommonUtils.waitForVisibility(charmsNativeViewPage.nVAllParticipantDetailsLink);
		charmsNativeViewPage.nVAllParticipantDetailsLink.click();
		

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDashboardLink);
		charmsNativeViewPage.nativeViewDashboardLink.click();

		CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewiFrameCHARMS);
		CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewiFrameCHARMS);

		fanconiScreenerNVPage.nVFamilyMembersPreviewButton.click();

		MiscUtils.sleep(2000);

		/*
		 * Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		 * for (String currentWindow1 : allWindowHandles1) {
		 * WebDriverUtils.webDriver.switchTo().window(currentWindow1);}
		 */

		fanconiScreenerNVPage.nVFamilyMembersOpenRecordButton.click();

	}

	@Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page in Native View")
	public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Participant_Details_page_in_Native_View()
			throws InvalidFormatException, IOException, TestingException {

		// Excel Data Reader
		ExcelReader excelReader = new ExcelReader();

		Map<String, String> CurrentRow = null;

		try {
			List<Map<String, String>> excelDataMapList = excelReader
					.getData("/Users/jains18/git/CBIIT-Test-Automation/src/main/resources/data.xlsx", "Sheet1");
			CurrentRow = excelDataMapList.get(0);

		} catch (InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		System.out.println(
				"Subject ID Assertion ****** " + cHARMSParticipantDetailsNVPage.nVParticipantSubjectID.getText());

		System.out.println("Full Name Assertion:****** " + (CurrentRow.get("FirstName") + CurrentRow.get("LastName")));

		System.out.println("Generation ID Assertion : ********"
				+ cHARMSParticipantDetailsNVPage.nVParticipantGenerationID.getText());

		System.out.println("Family Member ID Assertion : ********"
				+ cHARMSParticipantDetailsNVPage.nVParticipantFamilyMemberID.getText());

		System.out.println(
				"Study Name Assertion : ********" + cHARMSParticipantDetailsNVPage.nVParticipantStudy.getText());

		System.out.println("Eligibility Status Assertion : ************* "
				+ cHARMSParticipantDetailsNVPage.nVParticipantEligibilityStatus.getText());

		System.out.println("Enrollment Status Assertion : ********"
				+ cHARMSParticipantDetailsNVPage.nVParticipantEnrollmentStatus.getText());

		String referral = cHARMSParticipantDetailsNVPage.nVParticipantReferral.getAttribute("value");

		System.out.println("Referral Assertion : ********" + referral);

		System.out.println(
				"Assigned To Assertion : ********" + cHARMSParticipantDetailsNVPage.nVParticipantAssignedTo.getText());

		// Subject ID Assertion
		ComponentTestResult subjectIDAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantSubjectID, "");

		// Participant Name Assertion
		ComponentTestResult participantNameAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantName,
				(CurrentRow.get("FirstName") + " " + CurrentRow.get("LastName")));

		// Generation ID Assertion
		ComponentTestResult generationIDAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantGenerationID, "");

		// Family Member ID Assertion
		ComponentTestResult familyMemberIDAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantFamilyMemberID, "");

		// Study Name Assertion
		ComponentTestResult studyNameAssert = CharmsUtil.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantStudy,
				"Fanconi");

		// Eligibility Status Assertion
		ComponentTestResult eligibilityStatusAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantEligibilityStatus, "Waiting for Eligibility");

		// Enrollment Status Assertion
		ComponentTestResult enrollmentStatusAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantEnrollmentStatus, "New Screener Received");

		// Referral Assertion
		// ComponentTestResult referralAssert =
		// CharmsUtil.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantRefferal,"");

		// Assigned To Assertion
		ComponentTestResult assignedToAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantAssignedTo, "");

		StepTestResult generalInformationTabVerificationResult = new StepTestResult(
				"General Information on Participant Details page is verified ");

		generalInformationTabVerificationResult.add(subjectIDAssert);
		generalInformationTabVerificationResult.add(participantNameAssert);
		generalInformationTabVerificationResult.add(generationIDAssert);
		generalInformationTabVerificationResult.add(familyMemberIDAssert);
		generalInformationTabVerificationResult.add(studyNameAssert);
		generalInformationTabVerificationResult.add(eligibilityStatusAssert);
		generalInformationTabVerificationResult.add(enrollmentStatusAssert);
		generalInformationTabVerificationResult.add(assignedToAssert);

		scenarioReportList.add(generalInformationTabVerificationResult);

		/************************************************/
		/* Personal Information on Participant Details page is verified */
		/************************************************/

		cHARMSParticipantDetailsNVPage.nVParticipantPersonalInformationTab.click();

		System.out.println("Relationship to You Assert : ***"
				+ cHARMSParticipantDetailsNVPage.nVParticipantPersonalInformationTabRelationshipToYou.getText());

		// Relationship to You Assertion
		ComponentTestResult relationshipToYouAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantPersonalInformationTabRelationshipToYou, "");

		// First Name Assertion
		ComponentTestResult firstNameAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantPersonalInformationTabFirstName,
				CurrentRow.get("FirstName"));

		// Middle Name Assertion
		ComponentTestResult middleNameAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantPersonalInformationTabMiddleName,
				CurrentRow.get("MiddleName"));

		// Last Name Assertion
		ComponentTestResult lastNameAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantPersonalInformationTabLastName, CurrentRow.get("LastName"));

		StepTestResult personelInformationTabVerificationResult = new StepTestResult(
				"Personel Information Tab data on Participant Details page is verified ");

		personelInformationTabVerificationResult.add(relationshipToYouAssert);
		personelInformationTabVerificationResult.add(firstNameAssert);
		personelInformationTabVerificationResult.add(middleNameAssert);
		personelInformationTabVerificationResult.add(lastNameAssert);

		scenarioReportList.add(personelInformationTabVerificationResult);

		/************************************************/
		/* Demographics on Participant Details page is verified */
		/************************************************/

		cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTab.click();

		// Biological Gender Assertion
		ComponentTestResult biologicalGenderAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabBiologicalGender,
				CurrentRow.get("SexAssigned"));

		// Identified Gender Assertion
		ComponentTestResult identifiedGenderAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabIdentifiedGender,
				CurrentRow.get("CurrentGender"));

		// Participant Race (Select all that apply) Assertion
		ComponentTestResult raceAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabRace,
				"Caucasian (white), Black/African American, Native Hawaiian/Other Pacific Islander, American Indian/Alaskan Native, Asian, Other");

		// Participant Other Race (Select all that apply) Assertion
		ComponentTestResult otherRaceAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabRaceOtherText, CurrentRow.get("OtherRace"));

		// Ethnicity Assertion
		ComponentTestResult ethnicityAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabEthnicity, CurrentRow.get("Ethnicity"));

		// Pronouns Assertion
		ComponentTestResult pronounsAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabPronouns, CurrentRow.get("Pronouns"));

		// Other Pronouns Assertion
		// ComponentTestResult OtherPronounsAssert = CharmsUtil.verifyLabel(
		// cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabPronounsOtherText,
		// "");

		// Is the participant adopted? Assertion
		ComponentTestResult IsParticipantAdoptedAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabIsTheParticipantAdopted,
				CurrentRow.get("IsAdopted"));

		// Date of Birth Assertion
		ComponentTestResult dateOfBirthAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabDOB, CurrentRow.get("DOB"));

		// If Date of Birth is unkown, is this person 18 years old or older Assertion
		ComponentTestResult dateOfBirthUnknownAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabIfDOBUnknownAge18, "");

		// Age Assertion
		ComponentTestResult ageAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantDemographicsTabtAge, "75");

		StepTestResult demographicInformationTabVerificationResult = new StepTestResult(
				"Demographic Information Tab data on Participant Details page is verified ");

		demographicInformationTabVerificationResult.add(biologicalGenderAssert);
		demographicInformationTabVerificationResult.add(identifiedGenderAssert);
		demographicInformationTabVerificationResult.add(raceAssert);
		demographicInformationTabVerificationResult.add(otherRaceAssert);
		demographicInformationTabVerificationResult.add(ethnicityAssert);
		demographicInformationTabVerificationResult.add(pronounsAssert);
		demographicInformationTabVerificationResult.add(IsParticipantAdoptedAssert);
		demographicInformationTabVerificationResult.add(dateOfBirthAssert);
		demographicInformationTabVerificationResult.add(dateOfBirthUnknownAssert);
		demographicInformationTabVerificationResult.add(ageAssert);

		scenarioReportList.add(demographicInformationTabVerificationResult);

		/************************************************/
		/* Contact Info on Participant Details page is verified */
		/************************************************/

		cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTab.click();

		// Does the participant need legal representation? Assertion
		ComponentTestResult legalRepresentationAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabAreYouTheLegalGuardianOfThisPerson, "No");

		// Contact Street Address Assertion
		ComponentTestResult streetAddressAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabStreetAddress,
				CurrentRow.get("StreetAddress1") + " " + CurrentRow.get("StreetAddress2"));

		// Contact State Assertion
		ComponentTestResult stateAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabState, CurrentRow.get("State"));

		// Contact City Assertion
		ComponentTestResult cityAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabCity, CurrentRow.get("City"));

		// Contact Zip Code Assertion
		ComponentTestResult zipCodeAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabZipcode, CurrentRow.get("ZipCode"));

		// Contact Country Assertion
		ComponentTestResult countryAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabCountry, CurrentRow.get("CountryLived"));

		// Contact Email Assertion
		ComponentTestResult emailAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabEmail, CurrentRow.get("EmailAddress"));

		// Contact Home Phone Assertion
		ComponentTestResult homePhoneAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabHomePhone, CurrentRow.get("HomePhoneNumber"));

		// Contact Cell Phone Assertion
		ComponentTestResult cellPhoneAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabCellPhone, CurrentRow.get("CellPhoneNumber"));

		// Contact Work Phone Assertion
		ComponentTestResult workPhoneAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabWorkPhone, CurrentRow.get("WorkPhoneNumber"));

		// Contact Preferred phone Assertion
		ComponentTestResult preferredPhoneAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantContactInfoTabPreferredPhone,
				CurrentRow.get("HomePhoneNumber"));

		StepTestResult contactInformationTabVerificationResult = new StepTestResult(
				"Contact Information Tab data on Participant Details page is verified ");

		contactInformationTabVerificationResult.add(legalRepresentationAssert);
		contactInformationTabVerificationResult.add(streetAddressAssert);
		contactInformationTabVerificationResult.add(stateAssert);
		contactInformationTabVerificationResult.add(cityAssert);
		contactInformationTabVerificationResult.add(zipCodeAssert);
		contactInformationTabVerificationResult.add(countryAssert);
		contactInformationTabVerificationResult.add(emailAssert);
		contactInformationTabVerificationResult.add(homePhoneAssert);
		contactInformationTabVerificationResult.add(cellPhoneAssert);
		contactInformationTabVerificationResult.add(workPhoneAssert);
		contactInformationTabVerificationResult.add(preferredPhoneAssert);

		scenarioReportList.add(personelInformationTabVerificationResult);

		/************************************************/
		/* Medical Info on Participant Details page is verified */
		/************************************************/

		cHARMSParticipantDetailsNVPage.nVParticipantMedicalInfoTab.click();

		// Has a physician ever diagnosed this participant with cancer? Assertion
		ComponentTestResult participantDiagnoseeWithCancerAssert = CharmsUtil.verifyLabel(
				cHARMSParticipantDetailsNVPage.nVParticipantMedicalInfoTabParticipantDiagnosedWithCancer, "Yes");

		// Has the participant ever had genetic testing? Assertion
		ComponentTestResult participantEverHadGeneticTestingAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantMedicalInfoTabEverHadGeneticTesting, "Yes");

		// Vital Status Assertion
		ComponentTestResult vitalStatusAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantMedicalInfoTabVitalStatus, "Not answered");

		// Cohort Assertion
		ComponentTestResult cohortAssert = CharmsUtil
				.verifyLabel(cHARMSParticipantDetailsNVPage.nVParticipantMedicalInfoTabCohort, "Field");

		StepTestResult medicalInformationTabVerificationResult = new StepTestResult(
				"Contact Information Tab data on Participant Details page is verified ");

		medicalInformationTabVerificationResult.add(participantDiagnoseeWithCancerAssert);
		medicalInformationTabVerificationResult.add(participantEverHadGeneticTestingAssert);
		medicalInformationTabVerificationResult.add(vitalStatusAssert);
		medicalInformationTabVerificationResult.add(cohortAssert);

		/*********************************************************************/
		/*
		 * THE FANCONI ELIGIBILITY QUESTIONNAIRE DATA FROM PORTAL IS VERIFIED IN FANCONI
		 * STUDY SCREENER PAGE FROM NATIVE VIEW
		 */
		/*********************************************************************/

		// Click the Fanconi study Preview button
		fanconiScreenerNVPage.nVFanconiScreenerPreviewRecordButton.click();

		// Click the Open record button
		fanconiScreenerNVPage.nVOpenRecordButton.click();

		/*************************************************/
		/* Fanconi Study Screener:General Information */
		/***********************************************/

		// Number Assertion
		System.out.println(referral);

		ComponentTestResult fanconiScreenerNumberAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerNumber, referral);

		// Does the participant need legal representation Assertion
		ComponentTestResult fanconiScreenerDoesParticipantNeedLeglRepAssert1 = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerDoesParticipantNeedLegalRepresentation, "No");

		// Study Assertion
		ComponentTestResult fanconiScreenerStudyNameAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerStudy, "Fanconi");

		// Family Member Record Assertion
		ComponentTestResult fanconiScreenerFamilyMemberRecordAssert = CharmsUtil.verifyDataField(
				fanconiScreenerNVPage.nVFanconiScreenerFamilyMemberRecord,
				(CurrentRow.get("FirstName") + " " + CurrentRow.get("LastName")));

		// Vital Status Assertion
		ComponentTestResult fanconiScreenerVitalStatusAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerVitalStatus, "Not answered");

		// Date of death Assertion
		ComponentTestResult fanconiScreenerDateOfDeathAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerFamilyMemberRecord, "");

		// Eligibility Status Assertion
		ComponentTestResult fanconiScreenerEligibilityStatusAssert = CharmsUtil.verifyDataField(
				fanconiScreenerNVPage.nVFanconiScreenerEligibilityStatus,
				cHARMSParticipantDetailsNVPage.nVParticipantEligibilityStatus.getText());

		// Enrollment Status Assertion
		ComponentTestResult fanconiScreenerEnrollmentStatusAssert = CharmsUtil.verifyDataField(
				fanconiScreenerNVPage.nVFanconiScreenerEnrollmentStatus,
				cHARMSParticipantDetailsNVPage.nVParticipantEnrollmentStatus.getText());

		// Date Consent Requested Assertion
		ComponentTestResult fanconiScreenerDateConsentRequestedAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerDateConsentRequested, "");

		// Consent Reminder Count Assertion
		ComponentTestResult fanconiScreenerConsentReminderCountAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerConsentReminderCount, "0");

		StepTestResult fanconiScreenerGeneralVerificationResult = new StepTestResult(
				"Fanconi Study Screener:General Information page is verified ");

		fanconiScreenerGeneralVerificationResult.add(fanconiScreenerNumberAssert);
		fanconiScreenerGeneralVerificationResult.add(fanconiScreenerDoesParticipantNeedLeglRepAssert1);
		fanconiScreenerGeneralVerificationResult.add(fanconiScreenerStudyNameAssert);
		fanconiScreenerGeneralVerificationResult.add(fanconiScreenerFamilyMemberRecordAssert);
		fanconiScreenerGeneralVerificationResult.add(fanconiScreenerVitalStatusAssert);
		fanconiScreenerGeneralVerificationResult.add(fanconiScreenerDateOfDeathAssert);
		fanconiScreenerGeneralVerificationResult.add(fanconiScreenerEligibilityStatusAssert);
		fanconiScreenerGeneralVerificationResult.add(fanconiScreenerEnrollmentStatusAssert);
		fanconiScreenerGeneralVerificationResult.add(fanconiScreenerDateConsentRequestedAssert);
		fanconiScreenerGeneralVerificationResult.add(fanconiScreenerConsentReminderCountAssert);

		/*********************************************************************/
		/* Contact Information in Fanconi Study screener page is verified */
		/*********************************************************************/

		// fanconiScreenerNVPage.nVFanconiScreenerrContactInfoTab.click();

		// First Name Assertion
		ComponentTestResult FanconiScreenerFirstNameAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerFirstName, CurrentRow.get("FirstName"));

		// Middle Name Assertion
		ComponentTestResult fanconiScreenerMiddleNameAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerMiddleName, CurrentRow.get("MiddleName"));

		// Last Name Assertion
		ComponentTestResult fanconiScreenerLastNameAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerLastName, CurrentRow.get("LastName"));

		// Proxy First Name Assertion
		ComponentTestResult fanconiScreenerProxyFirstNameAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerProxyFirstName, CurrentRow.get("FirstName"));

		// Proxy Middle Name Assertion
		ComponentTestResult fanconiScreenerProxyMiddleNameAssert = CharmsUtil.verifyDataField(
				fanconiScreenerNVPage.nVFanconiScreenerProxyMiddleName, CurrentRow.get("ProxyMiddleName"));

		// Proxy Last Name Assertion
		ComponentTestResult fanconiScreenerProxyLastNameAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerProxyLastName, CurrentRow.get("ProxyLastName"));

		// Contact Street Address Assertion
		ComponentTestResult fanconiScreenerStreetAddressAssert = CharmsUtil.verifyDataField(
				fanconiScreenerNVPage.nVFanconiScreenerStreetAddress,
				CurrentRow.get("StreetAddress1") + " " + CurrentRow.get("StreetAddress2"));

		// Contact State Assertion
		ComponentTestResult fanconiScreenerStateAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerState, CurrentRow.get("State"));

		// Contact City Assertion
		ComponentTestResult fanconiScreenerCityAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerCity, CurrentRow.get("City"));

		// Contact Zip Code Assertion
		ComponentTestResult fanconiScreenerZipCodeAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerZipcode, CurrentRow.get("ZipCode"));

		// Contact Country Assertion
		ComponentTestResult fanconiScreenerCountryAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerCountry, CurrentRow.get("CountryLived"));

		// Contact Email Assertion
		ComponentTestResult fanconiScreenerEmailAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerEmail, CurrentRow.get("EmailAddress"));

		// Contact Home Phone Assertion
		ComponentTestResult fanconiScreenerHomePhoneAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerHomePhone, CurrentRow.get("HomePhoneNumber"));

		// Contact Cell Phone Assertion
		ComponentTestResult fanconiScreenerCellPhoneAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerCellPhone, CurrentRow.get("CellPhoneNumber"));

		// Contact Work Phone Assertion
		ComponentTestResult fanconiScreenerWorkPhoneAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerWorkPhone, CurrentRow.get("WorkPhoneNumber"));

		// Contact Preferred phone Assertion
		ComponentTestResult fanconiScreenerPreferredPhoneAssert = CharmsUtil.verifyDataField(
				fanconiScreenerNVPage.nVFanconiScreenerPreferredPhone, CurrentRow.get("HomePhoneNumber"));

		StepTestResult fanconiScreenerContactInformationVerificationResult = new StepTestResult(
				"Contact Information on Participant Details page is verified ");

		fanconiScreenerContactInformationVerificationResult.add(FanconiScreenerFirstNameAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerMiddleNameAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerLastNameAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerProxyFirstNameAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerProxyMiddleNameAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerProxyLastNameAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerStreetAddressAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerStateAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerCityAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerZipCodeAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerCountryAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerEmailAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerHomePhoneAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerCellPhoneAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerWorkPhoneAssert);
		fanconiScreenerContactInformationVerificationResult.add(fanconiScreenerPreferredPhoneAssert);

		/************************************************/
		/* Demographics in Fanconi Study screener page is verified */
		/************************************************/

		fanconiScreenerNVPage.nVFanconiScreenerDemographicsTab.click();

		// Date of Birth Assertion
		ComponentTestResult fanconiScreenerDateOfBirthAssert = CharmsUtil
				.verifyLabel(fanconiScreenerNVPage.nVFanconiScreenerDOB, CurrentRow.get("DOB"));

		// Biological Gender Assertion
		ComponentTestResult fanconiScreenerBiologicalGenderAssert = CharmsUtil
				.verifyLabel(fanconiScreenerNVPage.nVFanconiScreenerBiologicalGender, CurrentRow.get("SexAssigned"));

		// Identified Gender Assertion
		ComponentTestResult fanconiScreenerIdentifiedGenderAssert = CharmsUtil
				.verifyLabel(fanconiScreenerNVPage.nVFanconiScreenerIdentifiedGender, CurrentRow.get("CurrentGender"));

		// Participant Race (Select all that apply) Assertion
		ComponentTestResult fanconiScreenerRaceAssert = CharmsUtil.verifyLabel(
				fanconiScreenerNVPage.nVFanconiScreenerRace,
				"Caucasian (white), Black/African American, Native Hawaiian/Other Pacific Islander, American Indian/Alaskan Native, Asian, Other");

		// Participant Other Race Assertion
		ComponentTestResult fanconiScreenerOtherRaceAssert = CharmsUtil
				.verifyLabel(fanconiScreenerNVPage.nVFanconiScreenerRaceOtherText, CurrentRow.get("OtherRace"));

		// Is the participant adopted? Assertion
		ComponentTestResult fanconiScreenerIsParticipantAdoptedAssert = CharmsUtil.verifyLabel(
				fanconiScreenerNVPage.nVFanconiScreenerIsTheParticipantAdopted, CurrentRow.get("IsAdopted"));

		// Ethnicity Assertion
		ComponentTestResult fanconiScreenerEthnicityAssert = CharmsUtil
				.verifyLabel(fanconiScreenerNVPage.nVFanconiScreenerEthnicity, CurrentRow.get("Ethnicity"));

		// Pronouns Assertion
		ComponentTestResult fanconiScreenerPronounsAssert = CharmsUtil
				.verifyLabel(fanconiScreenerNVPage.nVFanconiScreenerPronouns, CurrentRow.get("Pronouns"));

		// Other Pronouns Assertion
		ComponentTestResult fanconiScreenerOtherPronounsAssert = CharmsUtil
				.verifyLabel(fanconiScreenerNVPage.nVFanconiScreenerPronounsOtherText, "");

		StepTestResult fanconiScreenerDemographicsVerificationResult = new StepTestResult(
				"Fanconi Study Screener:Demographics tab data is verified ");

		fanconiScreenerDemographicsVerificationResult.add(fanconiScreenerDateOfBirthAssert);
		fanconiScreenerDemographicsVerificationResult.add(fanconiScreenerBiologicalGenderAssert);
		fanconiScreenerDemographicsVerificationResult.add(fanconiScreenerIdentifiedGenderAssert);
		fanconiScreenerDemographicsVerificationResult.add(fanconiScreenerRaceAssert);
		fanconiScreenerDemographicsVerificationResult.add(fanconiScreenerOtherRaceAssert);
		fanconiScreenerDemographicsVerificationResult.add(fanconiScreenerIsParticipantAdoptedAssert);
		fanconiScreenerDemographicsVerificationResult.add(fanconiScreenerEthnicityAssert);
		fanconiScreenerDemographicsVerificationResult.add(fanconiScreenerPronounsAssert);
		fanconiScreenerDemographicsVerificationResult.add(fanconiScreenerOtherPronounsAssert);

		/********************************************************/
		/** Fanconi History in Fanconi Study Screener page is verified **/
		/********************************************************/

		// History of Fanconi anemia study involvement Assertion
		ComponentTestResult fanconiScreenerHistoryOfFanconiAnemiaStudyInvolvementAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerHistoryOfFanconiAnemiaStudyInvolvement, null);

		// Fanconi anemia diagnosis? Assertion
		ComponentTestResult fanconiScreenerFanconiAnemiaDiagnosisAssert = CharmsUtil
				.verifySelect2DropDowns(fanconiScreenerNVPage.nVFanconiScreenerFanconiAnemiaDiagnosis, null, 0);

		// Age at Fanconi diagnosis Assertion
		ComponentTestResult fanconiScreenerAgeAtFanconiDiagnosisAssert = CharmsUtil
				.verifySelect2DropDowns(fanconiScreenerNVPage.nVFanconiScreenerAgeAtFanconiDiagnosis, null, 0);

		// Date of Fanconi diagnosis Assertion
		ComponentTestResult fanconiScreenerDateOfFanconiDiagnosisAssert = CharmsUtil
				.verifySelect2DropDowns(fanconiScreenerNVPage.nVFanconiScreenerDateOfFanconiDiagnosis, null, 0);

		StepTestResult fanconiScreenerFanconiHistoryVerificationResult = new StepTestResult(
				"Fanconi Study Screener:Fanconi History tab data is verified ");

		fanconiScreenerFanconiHistoryVerificationResult
				.add(fanconiScreenerHistoryOfFanconiAnemiaStudyInvolvementAssert);
		fanconiScreenerFanconiHistoryVerificationResult.add(fanconiScreenerFanconiAnemiaDiagnosisAssert);
		fanconiScreenerFanconiHistoryVerificationResult.add(fanconiScreenerAgeAtFanconiDiagnosisAssert);
		fanconiScreenerFanconiHistoryVerificationResult.add(fanconiScreenerDateOfFanconiDiagnosisAssert);

		/********************************************************/
		/** Genetic Testing History in Fanconi Study Screener page is verified **/
		/********************************************************/

		// Complementation Testing previously done? Assertion
		ComponentTestResult fanconiScreenerIsComplementationTestingPreviouslyDoneAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerIsComplementationTestingPreviouslyDone, null);

		// Genetic testing positive for Fanconi? Assertion
		ComponentTestResult fanconiScreenerGeneticTestingPositiveAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerGeneticTestingPositiveForFanconi, null);

		// Does the participant have a copy of the genetic test results? Assertion
		ComponentTestResult fanconiScreenerGeneticTestResultCopyAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerDoesGeneticTestResultCopy, null);

		// Participants preferred method of delivering genetic test results Assertion
		ComponentTestResult fanconiScreenerGeneticTestResultsDeliveryMethodAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerGeneticTestResultsDeliveryMethod, null);

		StepTestResult fanconiScreenerGeneticTestingHistoryVerificationResult = new StepTestResult(
				"Fanconi Study Screener:Genetic Testing History tab data is verified ");

		fanconiScreenerGeneticTestingHistoryVerificationResult
				.add(fanconiScreenerIsComplementationTestingPreviouslyDoneAssert);
		fanconiScreenerGeneticTestingHistoryVerificationResult.add(fanconiScreenerGeneticTestingPositiveAssert);
		fanconiScreenerGeneticTestingHistoryVerificationResult.add(fanconiScreenerGeneticTestResultCopyAssert);
		fanconiScreenerGeneticTestingHistoryVerificationResult
				.add(fanconiScreenerGeneticTestResultsDeliveryMethodAssert);

		/************************************************************/
		/* FA Genes Tested in Fanconi Study Screener page is verified */
		/************************************************************/

		// FA Genes Tested Checkboxes Assertion

		/********************************************************/
		/** Medical History in Fanconi Study Screener page is verified **/
		/********************************************************/

		// Ever diagnosed with Cancer? Assertion
		ComponentTestResult fanconiScreenerEverDiagnosedWithCancerAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerEverDiagnosedWithCancer, null);

		// Chromosome breakage test on blood Assertion
		ComponentTestResult fanconiScreenerChromosomeBreakageTestOnBloodAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerChromosomeBreakageTestOnBlood, null);

		// Chromosome breakage test location Assertion
		ComponentTestResult fanconiScreenerChromosomeBreakageTestLocationAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerChromosomeBreakageTestLocation, null);

		// Chromosome breakage result Assertion
		ComponentTestResult fanconiScreenerChromosomeBreakageResultAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerChromosomeBreakageResult, null);

		// Chromosome breakage test on skin Assertion
		ComponentTestResult fanconiScreenerChromosomeBreakageTestOnSkinAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerChromosomeBreakageTestOnSkin, null);

		// Chromosome breakage skin test result Assertion
		ComponentTestResult fanconiScreenerChromosomeBreakageSkinTestResultAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerChromosomeBreakageSkinTestResult, null);

		// Chromosome Breakage Blood Test Result Delivery Assertion
		ComponentTestResult fanconiScreenerChromosomeBreakageBloodTestResultDeliveryAssert = CharmsUtil.verifyDropDowns(
				fanconiScreenerNVPage.nVFanconiScreenerChromosomeBreakageBloodTestResultDelivery, null);

		// Diagnosed with Myelodsplastic Syndrome (MDS) Assertion
		ComponentTestResult fanconiScreenerDiagnosedWithMyelodsplasticSyndromeAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerDiagnosedWithMyelodsplasticSyndrome, null);

		// Age when myelodysplastic syndrome diagnosed Assertion
		ComponentTestResult fanconiScreenerAgeWhenMyelodysplasticSyndromeDiagnosedAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerAgeWhenMyelodysplasticSyndromeDiagnosed, null);

		// Date when myelodysplastic syndrome diagnosed Assertion
		ComponentTestResult fanconiScreenerDateWhenMyelodysplasticSyndromeDiagnosedAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerDateWhenMyelodysplasticSyndromeDiagnosed, null);

		// Ever received transplant (bone marrow/stem cell/ cord blood)? Assertion
		ComponentTestResult fanconiScreenerEverReceivedBoneMarrowTransplantAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerEverReceivedBoneMarrowTransplant, null);

		// Transplant treatment institution (bone marrow/stem cell/ cord blood)
		// Assertion
		ComponentTestResult fanconiScreenerTransplantTreatmentInstitutionAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerTransplantTreatmentInstitution, null);

		// Age at transplant Assertion
		ComponentTestResult fanconiScreenerAgeAtTransplantAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerAgeAtTransplant, null);

		// Month of transplant Assertion
		ComponentTestResult fanconiScreenerMonthOfTransplantAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerMonthOfTransplant, null);

		// Year of transplant Assertion
		ComponentTestResult fanconiScreenerYearOfTransplantAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerYearOfTransplant, null);

		// Donor type Assertion
		ComponentTestResult fanconiScreenerDonorTypeAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerDonorType, null);

		// Transplant donor match Assertion
		ComponentTestResult fanconiScreenerTransplantDonorMatchAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerTransplantDonorMatch, null);

		// Stem cell source Assertion
		ComponentTestResult fanconiScreenerStemCellSourceAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerStemCellSource, null);

		// Current Medications Assertion
		ComponentTestResult fanconiScreenerCurrentMedicationsAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerCurrentMedications, null);

		// Health Care Provider Name Assertion
		ComponentTestResult fanconiScreenerHealthCarProviderNameAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerHealthCarProviderName, null);

		// Health Care Provider Address Assertion
		ComponentTestResult fanconiScreenerHealthCareProviderAddressAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerHealthCareProviderAddress, null);

		// Health Care Provider Phone Number Assertion
		ComponentTestResult fanconiScreenerHealthCareProviderPhoneNumberAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerHealthCareProviderPhoneNumber, null);

		// Permission to contact Provider Assertion
		ComponentTestResult fanconiScreenerPermissionToContactProviderAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerPermissionToContactProvider, null);

		// Bone marrow failure? Assertion
		ComponentTestResult fanconiScreenerBoneMarrowFailureAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerBoneMarrowFailure, null);

		// Bone marrow failure age at diagnosis Assertion
		ComponentTestResult fanconiScreenerBoneMarrowFailureAgeAtDiagnosisAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerBoneMarrowFailureAgeAtDiagnosis, null);

		// Bone marrow failure month of diagnosis Assertion
		ComponentTestResult fanconiScreenerBoneMarrowFailureMonthOfDiagnosisAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerBoneMarrowFailureMonthOfDiagnosis, null);

		// Bone marrow failure year of diagnosis Assertion
		ComponentTestResult fanconiScreenerBoneMarrowFailureYearOfDiagnosisAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerBoneMarrowFailureYearOfDiagnosis, null);

		// Bone marrow failure was treatment received? Assertion
		ComponentTestResult fanconiScreenerBoneMarrowFailureWasTreatmentReceivedAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerBoneMarrowFailureWasTreatmentReceived, null);

		// Treatment Assertion
		ComponentTestResult fanconiScreenerTreatmentAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerTreatment, null);

		// Received blood transfusions
		ComponentTestResult fanconiScreenerReceivedBloodTransfusionsAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerReceivedBloodTransfusions, null);

		StepTestResult fanconiScreenerMedicalHistoryVerificationResult = new StepTestResult(
				"Fanconi Study Screener: Medical History tab data is verified ");

		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerEverDiagnosedWithCancerAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerChromosomeBreakageTestOnBloodAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerChromosomeBreakageTestLocationAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerChromosomeBreakageResultAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerChromosomeBreakageTestOnSkinAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerChromosomeBreakageSkinTestResultAssert);
		fanconiScreenerMedicalHistoryVerificationResult
				.add(fanconiScreenerChromosomeBreakageBloodTestResultDeliveryAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerDiagnosedWithMyelodsplasticSyndromeAssert);
		fanconiScreenerMedicalHistoryVerificationResult
				.add(fanconiScreenerAgeWhenMyelodysplasticSyndromeDiagnosedAssert);
		fanconiScreenerMedicalHistoryVerificationResult
				.add(fanconiScreenerDateWhenMyelodysplasticSyndromeDiagnosedAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerEverReceivedBoneMarrowTransplantAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerTransplantTreatmentInstitutionAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerAgeAtTransplantAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerMonthOfTransplantAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerYearOfTransplantAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerDonorTypeAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerTransplantDonorMatchAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerStemCellSourceAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerCurrentMedicationsAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerHealthCarProviderNameAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerHealthCareProviderAddressAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerHealthCareProviderPhoneNumberAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerPermissionToContactProviderAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerBoneMarrowFailureAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerBoneMarrowFailureAgeAtDiagnosisAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerBoneMarrowFailureMonthOfDiagnosisAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerBoneMarrowFailureYearOfDiagnosisAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerBoneMarrowFailureWasTreatmentReceivedAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerTreatmentAssert);
		fanconiScreenerMedicalHistoryVerificationResult.add(fanconiScreenerReceivedBloodTransfusionsAssert);

		/********************************************************/
		/** Participant Features in Fanconi Study Screener page is verified **/
		/********************************************************/

		// Low birth weight Assertion
		ComponentTestResult fanconiScreenerLowBirthWeightAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerLowBirthWeight, null);

		// Feeding problems or Failure to thrive Assertion
		ComponentTestResult fanconiScreenerFeedingProblemsOrFailureToThriveAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerFeedingProblemsOrFailureToThrive, null);

		// Short stature Assertion
		ComponentTestResult fanconiScreenerShortStatureAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerShortStature, null);

		// Neurocognitive/ Developmental delay Assertion
		ComponentTestResult fanconiScreenerDevelopmentalDelayAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerDevelopmentalDelay, null);

		// Skin abnormalities Assertion
		ComponentTestResult fanconiScreenerSkinAbnormalitiesAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerSkinAbnormalities, null);

		// Head/Craniofacial abnormalities Assertion
		ComponentTestResult fanconiScreenerHeadCraniofacialAbnormalitiesAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerHeadCraniofacialAbnormalities, null);

		// Mouth abnormalities Assertion
		ComponentTestResult fanconiScreenerMouthAbnormalitiesAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerMouthAbnormalities, null);

		// Eye abnormalities Assertion
		ComponentTestResult fanconiScreenerEyeAbnormalitiesAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerEyeAbnormalities, null);

		// Ear abnormalities Assertion
		ComponentTestResult fanconiScreenerEarAbnormalitiesAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerEarAbnormalities, null);

		// Extremity abnormalities Assertion
		ComponentTestResult fanconiScreenerExtremityAbnormalitiesAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerExtremityAbnormalities, null);

		// Skeletal deformities Assertion
		ComponentTestResult fanconiScreenerSkeletalDeformitiesAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerSkeletalDeformities, null);

		// Heart problems Assertion
		ComponentTestResult fanconiScreenerHeartProblemsAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerHeartProblems, null);

		// Heart problems other Assertion
		ComponentTestResult fanconiScreenerHeartProblemsOtherAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerHeartProblemsOther, null);

		// Kidney abnormalities Assertion
		ComponentTestResult fanconiScreenerKidneyAbnormalitiesAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerKidneyAbnormalities, null);

		// Genital abnormalities Assertion
		ComponentTestResult fanconiScreenerGenitalAbnormalitiesAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerGenitalAbnormalities, null);

		// Fertility problems, hypogonadism Assertion
		ComponentTestResult fanconiScreenerFertilityProblemsHypogonadismAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerFertilityProblemsHypogonadism, null);

		// Endocrine problems Assertion
		ComponentTestResult fanconiScreenerEndocrineProblemsAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerEndocrineProblems, null);

		// Metabolic disorders Assertion
		ComponentTestResult fanconiScreenerMetabolicDisordersAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerMetabolicDisorders, null);

		StepTestResult fanconiScreenerParticipantFeaturesVerificationResult = new StepTestResult(
				"Fanconi Study Screener: Participant Features tab data is verified ");

		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerLowBirthWeightAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerFeedingProblemsOrFailureToThriveAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerShortStatureAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerDevelopmentalDelayAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerSkinAbnormalitiesAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerHeadCraniofacialAbnormalitiesAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerMouthAbnormalitiesAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerEyeAbnormalitiesAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerEarAbnormalitiesAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerExtremityAbnormalitiesAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerSkeletalDeformitiesAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerHeartProblemsAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerHeartProblemsOtherAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerKidneyAbnormalitiesAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerGenitalAbnormalitiesAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerFertilityProblemsHypogonadismAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerEndocrineProblemsAssert);
		fanconiScreenerParticipantFeaturesVerificationResult.add(fanconiScreenerMetabolicDisordersAssert);

		/********************************************************/
		/** Final Information in Fanconi Study Screener page is verified **/
		/********************************************************/

		// Particpant in NIH Inherited Bone Marrow Failure Syndrome study? Assertion
		ComponentTestResult fanconiScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudyAssert = CharmsUtil
				.verifyDropDowns(
						fanconiScreenerNVPage.nVFanconiScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudy,
						null);

		// Main reasons for participating in this study? Select all that apply.
		// Assertion
		ComponentTestResult fanconiScreenerMainReasonsForParticipatingInStudyAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerMainReasonsForParticipatingInStudy, null);

		// Participate in research Assertion
		ComponentTestResult fanconiScreenerParticipateInResearchAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerParticipateInResearch, null);

		// Screen for potential cancer diagnosis Assertion
		ComponentTestResult fanconiScreenerScreenForPotentialCancerDiagnosisAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerScreenForPotentialCancerDiagnosis, null);

		// Receive genetic testing Assertion
		ComponentTestResult fanconiScreenerReceiveGeneticTestingAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerReceiveGeneticTesting, null);

		// Other reason for participation Assertion
		ComponentTestResult fanconiScreenerOtherReasonForParticipationAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerOtherReasonForParticipation, null);

		// Previous studies Assertion
		ComponentTestResult fanconiScreenerPreviousStudiesAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerPreviousStudies, null);

		// How did you hear about this study? Assertion
		ComponentTestResult fanconiScreenerHowDidYouHearAboutThisStudyAssert = CharmsUtil
				.verifyDropDowns(fanconiScreenerNVPage.nVFanconiScreenerHowDidYouHearAboutThisStudy, null);

		// Physician Assertion
		ComponentTestResult fanconiScreenerPhysicianAssert = CharmsUtil
				.verifyDataField(fanconiScreenerNVPage.nVFanconiScreenerPhysician, null);

		StepTestResult fanconiScreenerFinalInformationVerificationResult = new StepTestResult(
				"Fanconi Study Screener: Final Information tab data is verified ");

		fanconiScreenerFinalInformationVerificationResult
				.add(fanconiScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudyAssert);
		fanconiScreenerFinalInformationVerificationResult.add(fanconiScreenerMainReasonsForParticipatingInStudyAssert);
		fanconiScreenerFinalInformationVerificationResult.add(fanconiScreenerParticipateInResearchAssert);
		fanconiScreenerFinalInformationVerificationResult.add(fanconiScreenerScreenForPotentialCancerDiagnosisAssert);
		fanconiScreenerFinalInformationVerificationResult.add(fanconiScreenerReceiveGeneticTestingAssert);
		fanconiScreenerFinalInformationVerificationResult.add(fanconiScreenerOtherReasonForParticipationAssert);
		fanconiScreenerFinalInformationVerificationResult.add(fanconiScreenerPreviousStudiesAssert);
		fanconiScreenerFinalInformationVerificationResult.add(fanconiScreenerHowDidYouHearAboutThisStudyAssert);
		fanconiScreenerFinalInformationVerificationResult.add(fanconiScreenerPhysicianAssert);

		/********************************************************/
		/*
		 * Intake participates in another study in Fanconi Study Screener page is
		 * verified
		 */
		/********************************************************/

		/********************************************************/
		/* Genetic Mutation/Variants in Fanconi Study Screener page is verified */
		/********************************************************/

		/********************************************************/
		/*
		 * Fanconi Screener: Patient Cancer History in Fanconi Study Screener page is
		 * verified
		 */
		/********************************************************/

		for (StepTestResult tr : scenarioReportList) {
			System.out.println(tr.toString());

		}

	}
}
