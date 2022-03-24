package ServiceNow.CHARMS.StepsImplementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.internal.runners.statements.ExpectException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.nci.automation.dao.ExcelReader;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

import ServiceNow.CHARMS.Constants.CHARMSConstants;
import appsCommon.PageInitializer;

public class RASSurveyStepsImpl extends PageInitializer {

	/*
	 * Use this method to click all check boxes in myRassurvey
	 */
	public void selectingCheckBoxes() {

		MiscUtils.sleep(1000);
		List<WebElement> listOfElements = rASSurveyPage.xpathForAllCheckBoxes;
		for (WebElement element : listOfElements) {
			element.click();
		}
	}

	/*
	 * Use this method to click all check boxes in myRassurvey except for the
	 * parameter passed
	 *
	 * @param string the string to no be clicked
	 */
	public void selectingCheckBoxes(String unsureOrUnknown) {

		MiscUtils.sleep(1000);
		List<WebElement> listOfElements = rASSurveyPage.xpathForAllCheckBoxes;
		for (WebElement element : listOfElements) {
			if (!element.getText().contentEquals(unsureOrUnknown)) {
				element.click();
			} else {
				break;
			}
		}
	}

	/*
	 * Use this method to click all check boxes in myRassurvey except for the
	 * parameters passed
	 *
	 * @param string the strings to not be clicked
	 */
	public void selectingCheckBoxes(String unsureOrUnknown, String otherNotKnownIssues) {

		MiscUtils.sleep(1000);
		List<WebElement> listOfElements = rASSurveyPage.xpathForAllCheckBoxes;
		for (WebElement element : listOfElements) {
			if (!element.getText().contentEquals(unsureOrUnknown)
					|| element.getText().contentEquals(otherNotKnownIssues)) {
				element.click();
			} else {
				break;
			}
		}
	}

	/*
	 * Use this method to click all check boxes in myRassurvey except for the
	 * parameters passed
	 *
	 * @param string the strings to not be clicked
	 */
	public void selectingCheckBoxesAnd(String unsureOrUnknown, String otherNotKnownIssues) {

		MiscUtils.sleep(1000);
		List<WebElement> listOfElements = rASSurveyPage.xpathForAllCheckBoxes;
		for (WebElement element : listOfElements) {
			if (!element.getText().contentEquals(unsureOrUnknown)
					&& !element.getText().contentEquals(otherNotKnownIssues)) {
				element.click();
			}
		}
	}

	public void rasSurveyParticipantSelfSubmission() throws InvalidFormatException, IOException {


		Map<String, String> testData = ExcelReader.excelIntoHashMap(CHARMSConstants.RAS_SURVEY, "SelfSubmission");


		String unsureUnknown = testData.get("Unsure/Unknown Selecting Checkboxes");
		String unsureUnknownTwo = testData.get("Unsure/unknown Selecting Checkboxes Two");
		String motherConditions = testData.get("Mother did not have any of these conditions Selecting CheckBoxes");
		String unsureMedicationsDuringPregnancy = testData.get("Unsure of what medications/supplements/vitamins taken during pregnancy Selecting CheckBoxes");
		String additionalInfo = testData.get("Please provide any additional information about the authors, year of publication or PubMed ID (PMID), if available");
		String mothersBirthCity = testData.get("Biological Mother birth city");
		String fathersBirthCity = testData.get("Biological Father birth city");
		String mothersAge = testData.get("Mothers Age When Born");
		String fathersAge = testData.get("Fathers Age When Born");
		String otherPrenatalCondition = testData.get("Were you diagnosed with any of the following conditions during your mothers pregnancy? Other");
		String otherPrenatalTest = testData.get("Please indicate the results of the prenatal tests administered to your biological mother during her pregnancy with you Other");
		String prenatalInfection = testData.get("Was your biological mother diagnosed with any of the following conditions prior to or during her pregnancy with you? Eight");
		String prenatalRash = testData.get("Was your biological mother diagnosed with any of the following conditions prior to or during her pregnancy with you? Nine");
		String otherPrenatalComplications = testData.get("Was your biological mother diagnosed with any of the following conditions prior to or during her pregnancy with you? Ten");
		String herbalSupplement = testData.get("Please select all medications your mother took during her pregnancy with you Thirteen");
		String otherMedication1 = testData.get("Please select all medications your mother took during her pregnancy with you Fifteen");
		String otherMedication2 = testData.get("Please select all medications your mother took during her pregnancy with you Sixteen");
		String nameOfMedicationOne = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication One");
		String reasonForMedicationOne = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for medication One");
		String lengthOfTimeOne = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time One");
		String nameOfMedicationTwo = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Two");
		String reasonForMedicationTwo = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Two");
		String lengthOfTimeTwo = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Two");
		String nameOfMedicationThree = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Three");
		String reasonForMedicationThree = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Three");
		String lengthOfTimeThree = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Three");
		String nameOfMedicationFour = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Four");
		String reasonForMedicationFour = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Four");
		String lengthOfTimeFour = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Four");
		String nameOfMedicationFive = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Five");
		String reasonForMedicationFive = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Five");
		String lengthOfTimeFive = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Five");
		String nameOfMedicationSix = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Six");
		String reasonForMedicationSix = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Six");
		String lengthOfTimeSix = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Six");
		String nameOfMedicationSeven = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Seven");
		String reasonForMedicationSeven = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Seven");
		String lengthofTimeSeven = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Seven");
		String nameOfMedicationEight = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Eight");
		String reasonForMedicationEight = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Eight");
		String lengthOfTimeEight = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Eight");
		String nameOfMedicationNine = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Nine");
		String reasonForMedicationNine = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Nine");
		String lengthOfTimeNine = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Nine");
		String nameOfMedicationTen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Ten");
		String reasonForMedicationTen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Ten");
		String lengthOfTimeTen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Ten");
		String nameOfMedicationEleven = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Eleven");
		String reasonForMedicationEleven = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Eleven");
		String lengthOfTimeEleven = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Eleven");
		String nameOfMedicationTwelve = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Twelve");
		String reasonForMedicationTwelve = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Twelve");
		String lengthOfTimeTwelve = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Twelve");
		String nameOfMedicationThirteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Thirteen");
		String reasonForMedicationThirteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Thirteen");
		String lengthOfTimeThirteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Thirteen");
		String nameOfMedicationFourteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication  Fourteen");
		String reasonForMedicationFourteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Fourteen");
		String lengthOfTimeFourteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Fourteen");
		String nameOfMedicationFifteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Fifteen");
		String reasonForMedicationFifteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Fifteen");
		String lengthOfTimeFifteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Fifteen");
		String nameOfMedicationSixteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Name of Medication Sixteen");
		String reasonForMedicationSixteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Reason for Medication Sixteen");
		String lengthOfTimeSixteen = testData.get("Please provide details on the name of the medication taken, reason it was taken and approximate length of time it was taken. Length of time Sixteen");
		String otherTobaccoProducts = testData.get("What tobacco products did your biological mother use during her pregnancy with you? Please select all that apply.  Other (Please Specify) text box");
		String otherVapeProducts = testData.get("Which vaping products did your mother use during her pregnancy with you? Please select all that apply. Other (please specify) text box");
		String otherAlcoholicBeverages = testData.get("What alcoholic beverages did your mother drink during her pregnancy with you?  Please select all that apply. Other (please specify) text box");
		String otherRecreationalDrugs = testData.get("What recreational drug did your biological mother use during her pregnancy with you? Please select all that apply. Other (please specify) text box");
		String otherPrenatalProducts = testData.get("What products were used around your biological mother during her pregnancy with you?  Please select all that apply. Other (please specify) text box");
		String mothersOccupation = testData.get("Please describe your biological parents' occupation(s) during your mother's pregnancy with you?  Please list all of the occupations during the pregnancy. Mother's occupation");
		String fathersOccupation = testData.get("Please describe your biological parents' occupation(s) during your mother's pregnancy with you?  Please list all of the occupations during the pregnancy. Father's occupation");
		String mothersHeight = testData.get("What is the height of your biological mother and father?  Please complete the table below. Mother's height");
		String fathersHeight = testData.get("What is the height of your biological mother and father?  Please complete the table below. Father's height");
		String endocrinologistMedicalProvider = testData.get("What is the name of the endocrinologist who completed your examination? Doctor/ Medical Provider Name");
		String endocrinologistLocation = testData.get("What is the name of the endocrinologist who completed your examination? Location (City, State, Country)");
		String endocrinologistHospital = testData.get("What is the name of the endocrinologist who completed your examination? Hospital or Health System Affiliation");
		String otherHormoneTesting = testData.get("What were the results of your growth hormone testing? Other (please specify) text box");
		String growthHormoneTreatment = testData.get("What was your height before starting growth hormone?");
		String numberOfgrowthHormoneTreatments = testData.get("How many times have you received growth hormone treatment?");
		String treatmentOneAgeStarted = testData.get("Please provide the details of growth hormone replacement by completing the table below. Growth Hormone Treatment #1 Age Started");
		String treatmentOneAgeStopped = testData.get("Please provide the details of growth hormone replacement by completing the table below. Growth Hormone Treatment #1 Age Stopped");
		String treatmentTwoAgeStarted = testData.get("Please provide the details of growth hormone replacement by completing the table below. Growth Hormone Treatment #2 Age Started");
		String treatmentTwoAgeStopped = testData.get("Please provide the details of growth hormone replacement by completing the table below. Growth Hormone Treatment #2 Age Stopped");
		String treatmentThreeAgeStarted = testData.get("Please provide the details of growth hormone replacement by completing the table below. Growth Hormone Treatment #3 Age Started");
		String treatmentThreeAgeStopped = testData.get("Please provide the details of growth hormone replacement by completing the table below. Growth Hormone Treatment #3 Age Stopped");
		

		//clicks on survey next button after reviewing the survey details to start on the myRAS Survey questions. page - myRAS Survey
		MiscUtils.sleep(1200);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		JavascriptUtils.scrollIntoView(rASSurveyPage.nihBannerImage);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks next button on The first block of questions will collect basic demographic information. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects I am completing this form for myself option on who is completing this form page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.completingFormForSelfRadioButton);
		rASSurveyPage.completingFormForSelfRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES option for Have you ever been included in a published case report or otherwise represented in a public manner by a healthcare provider or researcher? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//enters information about a previous cancer study {string} Please provide any additional information about the authors, year of publication or PubMed ID \\(PMID), if available. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.pleaseProvideAdditionalInfoIfAvailableTextbox);
		rASSurveyPage.pleaseProvideAdditionalInfoIfAvailableTextbox.sendKeys(additionalInfo);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks Next button for The next set of questions will ask about birth and neonatal history. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//enters Biological Mother birth city {string}, select Mothers Age {string} and enters Father birth city {string},and selects Fathers age {string} for What was your biological parents age in Years when you were born? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.bioMothersBirthCityTextBox);
		rASSurveyPage.bioMothersBirthCityTextBox.sendKeys(mothersBirthCity);
		rASSurveyPage.bioFatherBirthCityTextBox.sendKeys(fathersBirthCity);
		CommonUtils.selectDropDownValue(mothersAge, rASSurveyPage.bioMothersAgeWhenBornDropDown);
		CommonUtils.selectDropDownValue(fathersAge, rASSurveyPage.bioFathersAgeWhenBornDropDown);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Were you diagnosed with hypoglycemia \\(low blood sugar) during the newborn period. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects All that apply and enters in other prenatal condition {string} for Were you diagnosed with any of the following conditions during your mothers pregnancy? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherConditionTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes(unsureUnknown);
		JavascriptUtils.scrollUp(1300);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.otherConditionTextBox);
		rASSurveyPage.otherConditionTextBox.sendKeys(otherPrenatalCondition);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//click YES During her pregnancy with you, did your mother have any prenatal tests to identify fetal birth defects or fetal medical problems? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects All normal results and enters other prenatal test {string} for Please indicate the results of the prenatal tests administered to your biological mother during her pregnancy with you. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.serumSFRadioButton);
		rASSurveyPage.serumSFRadioButton.click();
		rASSurveyPage.ultrasoundRadioButton.click();
		rASSurveyPage.amniocentesisRadioButton.click();
		rASSurveyPage.chronicVillaSamplingRadioButton.click();
		rASSurveyPage.fetalBloodSamplingRadioButton.click();
		rASSurveyPage.stressTestRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.xRayRadioButton.click();
		rASSurveyPage.otherRadioButton.click();
		rASSurveyPage.otherTestTextBox.sendKeys(otherPrenatalTest);
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects All that apply and enters mothers prenatal type of infection {string} prenatal type of rash {string}, other complications {string} for Was your biological mother diagnosed with any of the following conditions prior to or during her pregnancy with you? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.typeOfInfectionTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes(unsureUnknown, motherConditions);
		JavascriptUtils.scrollIntoView(rASSurveyPage.nihBannerImage);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.typeOfInfectionTextBox.sendKeys(prenatalInfection);
		rASSurveyPage.rashTextBox.sendKeys(prenatalRash);
		rASSurveyPage.otherComplicationsTextBox.sendKeys(otherPrenatalComplications);
		JavascriptUtils.scrollIntoView(rASSurveyPage.hypertensionTextBox);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//click YES During her pregnancy with you, did your biological mother take any medications vitamins or supplements for any reason? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects All that apply for and enters herbal supplement {string}, other medication {string}, and other medication {string} for Please select all medications your mother took during her pregnancy with you. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.herbalSupplementTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes(unsureMedicationsDuringPregnancy);
		rASSurveyPage.herbalSupplementTextBox.sendKeys(herbalSupplement);
		rASSurveyPage.otherMedicationTextBox.sendKeys(otherMedication1);
		rASSurveyPage.otherMedicationTextBox2.sendKeys(otherMedication2);
		JavascriptUtils.scrollIntoView(rASSurveyPage.nihBannerImage);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.hormonesCheckBox);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.otherMedicationTextBox2);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//adds details in Please provide details on the name of the medication taken reason it was taken and approximate length of time it was taken. page - myRAS Survey
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(rASSurveyPage.antibioticNameTextBox);
		rASSurveyPage.antibioticNameTextBox.sendKeys(nameOfMedicationOne);
		rASSurveyPage.antibioticReasonTextBox.sendKeys(reasonForMedicationOne);
		CommonUtils.selectDropDownValue(lengthOfTimeOne, rASSurveyPage.antibioticLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.vitaminNameTextBox.sendKeys(nameOfMedicationTwo);
		rASSurveyPage.vitaminReasonTextBox.sendKeys(reasonForMedicationTwo);
		CommonUtils.selectDropDownValue(lengthOfTimeTwo, rASSurveyPage.vitaminLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.antihypertensivesNameTextBox.sendKeys(nameOfMedicationThree);
		rASSurveyPage.antihypertensiveReasonTextBox.sendKeys(reasonForMedicationThree);
		CommonUtils.selectDropDownValue(lengthOfTimeThree,
				rASSurveyPage.antihypertensivesLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.medicationForHighBloodGlucoseNameTextBox.sendKeys(nameOfMedicationFour);
		rASSurveyPage.medicationForHighBloodGlucoseReasonTextBox.sendKeys(reasonForMedicationFour);
		CommonUtils.selectDropDownValue(lengthOfTimeFour,
				rASSurveyPage.medicationForHighBloodGlucoseLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.antiemeticsNameTextBox.sendKeys(nameOfMedicationFive);
		rASSurveyPage.antiemeticsReasonTextBox.sendKeys(reasonForMedicationFive);
		CommonUtils.selectDropDownValue(lengthOfTimeFive, rASSurveyPage.antiemeticsLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.hormoneNameTextBox.sendKeys(nameOfMedicationSix);
		rASSurveyPage.hormoneReasonTextBox.sendKeys(reasonForMedicationSix);
		CommonUtils.selectDropDownValue(lengthOfTimeSix, rASSurveyPage.hormonesLenghtOfTimeMedicationWasTakenDropDown);
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		rASSurveyPage.antidepressantNameTextBox.sendKeys(nameOfMedicationSeven);
		rASSurveyPage.antidepressantReasonTextBox.sendKeys(reasonForMedicationSeven);
		CommonUtils.selectDropDownValue(lengthofTimeSeven, rASSurveyPage.antiDepressantsLenghtOfTimeMedicationWasTakenDropDown);
		JavascriptUtils.scrollUp(800);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.diureticNameTextBox.sendKeys(nameOfMedicationEight);
		rASSurveyPage.diureticReasonTextBox.sendKeys(reasonForMedicationEight);
		CommonUtils.selectDropDownValue(lengthOfTimeEight, rASSurveyPage.diureticsLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.painReliverNameTextBox.sendKeys(nameOfMedicationNine);
		rASSurveyPage.painReliverReasonTextBox.sendKeys(reasonForMedicationNine);
		CommonUtils.selectDropDownValue(lengthOfTimeNine, rASSurveyPage.painRelieversLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.pretermLaborMedicationNameTextBox.sendKeys(nameOfMedicationTen);
		rASSurveyPage.pretermLaborReasonTextBox.sendKeys(reasonForMedicationTen);
		CommonUtils.selectDropDownValue(lengthOfTimeTen,
				rASSurveyPage.medicationsForPretermLaborLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.thyroidMedicationNameTextBox.sendKeys(nameOfMedicationEleven);
		rASSurveyPage.thyroidReasonTextBox.sendKeys(reasonForMedicationEleven);
		CommonUtils.selectDropDownValue(lengthOfTimeEleven,
				rASSurveyPage.thyroidMedicationsLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.antiSeizureNameTextBox.sendKeys(nameOfMedicationTwelve);
		rASSurveyPage.antiSeizureReasonTextBox.sendKeys(reasonForMedicationTwelve);
		CommonUtils.selectDropDownValue(lengthOfTimeTwelve,
				rASSurveyPage.antiSeizureMedicationsLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.herbalSupplementNameTextBox.sendKeys(nameOfMedicationThirteen);
		rASSurveyPage.herbalSupplementReasonTextBox.sendKeys(reasonForMedicationThirteen);
		CommonUtils.selectDropDownValue(lengthOfTimeThirteen,
				rASSurveyPage.herbalSupplementLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.tpnNameTextBox.sendKeys(nameOfMedicationFourteen);
		rASSurveyPage.tpnReasonTextBox.sendKeys(reasonForMedicationFourteen);
		CommonUtils.selectDropDownValue(lengthOfTimeFourteen, rASSurveyPage.tpnLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.otherMedicationNameTextBox.sendKeys(nameOfMedicationFifteen);
		rASSurveyPage.otherMedicationReasonTextBox.sendKeys(reasonForMedicationFifteen);
		CommonUtils.selectDropDownValue(lengthOfTimeFifteen, rASSurveyPage.otherMedicationLenghtOfTimeMedicationWasTakenDropDown);
		rASSurveyPage.otherMedication2NameTextBox.sendKeys(nameOfMedicationSixteen);
		rASSurveyPage.otherMedication2ReasonTextBox.sendKeys(reasonForMedicationSixteen);
		CommonUtils.selectDropDownValue(lengthOfTimeSixteen, rASSurveyPage.otherMedication2LenghtOfTimeMedicationWasTakenDropDown);
		JavascriptUtils.scrollIntoView(rASSurveyPage.antibioticNameTextBox);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Did your biological mother use any tobacco products during her pregnancy with you? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		MiscUtils.sleep(1000);
		rASSurveyPage.yesRadioButton.click();
		MiscUtils.sleep(1000);
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects All that apply and enters other tobacco product {string} for What tobacco products did your biological mother use during her pregnancy with you? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes(unsureUnknown);
		JavascriptUtils.scrollUp(800);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherTobaccoProducts);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Did your biological mother use any vaping products during her pregnancy with you? - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects All that apply and enters other vape product {string} for Which vaping products did your mother use during her pregnancy with you? Please select all that apply. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes(unsureUnknown);
		JavascriptUtils.scrollUp(1000);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherVapeProducts);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Did your biological mother drink any alcoholic beverages during her pregnancy with you? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects All that apply and enters other alcoholic beverage {string} for What alcoholic beverages did your mother drink during her pregnancy with you? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes(unsureUnknown);
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherAlcoholicBeverages);
		JavascriptUtils.scrollUp(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Did your biological mother use any recreational drugs during her pregnancy with you? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects All that apply and enters other recreational drug {string} for What recreational drug did your biological mother use during her pregnancy with you? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes(unsureUnknown);
		JavascriptUtils.scrollUp(600);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherRecreationalDrugs);
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Did your biological mother ever live or work in a place where others smoked cigarettes, pipes or cigars around her during her pregnancy with you? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects All that apply and enters other products used around your mother {string} for What products were used around your biological mother during her pregnancy with you? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.otherPleaseSpecifyTextBox);
		rASSurveyStepsImpl.selectingCheckBoxes(unsureUnknown);
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherPrenatalProducts);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//adds Please describe your biological parents occupation\\(s) during your mothers pregnancy with you? and enters mothers occupation {string} and enters fathers occupation {string} in Please list all of the occupations during the pregnancy. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.biologicalMotherOccupationTextBox);
		rASSurveyPage.biologicalMotherOccupationTextBox.sendKeys(mothersOccupation);
		rASSurveyPage.biologicalFatherOccupationTextBox.sendKeys(fathersOccupation);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//enters height in cm for biological mother height {string} and biological fathers height {string} in What is the height of your biological mother and father? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.biologicalMotherHeightTextBox);
		rASSurveyPage.biologicalMotherHeightTextBox.sendKeys(mothersHeight);
		rASSurveyPage.unitOfMeasureMotherRadioButton.click();
		rASSurveyPage.biologicalFatherHeightTextBox.sendKeys(fathersHeight);
		rASSurveyPage.unitOfMeasureFatherRadioButton.click();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks next The next set of questions will ask about hormone-related growth. Growth is influenced by many things including nutrition, parental height\\/genetics and secreted hormones that tell the body to grow taller. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Have you ever been evaluated by an endocrinologist for any reason? These are doctors that specialize in the endocrine system, which is made up of many glands that secrete hormones. Hormones play a role in many things in the body including growth, metabolism and salt regulation. Endocrinologists often diagnose conditions such as diabetes and thyroid problems. page - myRAS Survey
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//enters Endocrinologist medical provider name {string}, medical provider city, state, country {string}, hospital or medical affiliation {string} in What is the name of the endocrinologist who completed your examination? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.doctorMedicalProviderNameTextBox);
		CommonUtils.sendKeys(rASSurveyPage.doctorMedicalProviderNameTextBox, endocrinologistMedicalProvider);
		CommonUtils.sendKeys(rASSurveyPage.locatioCityStateCountryTextBox, endocrinologistLocation);
		CommonUtils.sendKeys(rASSurveyPage.hospitalOrHealthSystemAffiliationTextBox, endocrinologistHospital);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Have you ever had growth hormone testing? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects All options that apply enters other hormone testing {string} for What were the results of your growth hormone testing? page - myRAS Survey
		MiscUtils.sleep(1000);
		rASSurveyStepsImpl.selectingCheckBoxes(unsureUnknownTwo);
		rASSurveyPage.otherPleaseSpecifyTextBox.sendKeys(otherHormoneTesting);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
		
		//clicks YES Have you ever received growth hormone treatment? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//enters height before growth hormone treatment {string} for What was your height before starting growth hormone? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.whatWasYourHeightBeforeStartingGrowthHormoneRadioButton);
		rASSurveyPage.whatWasYourHeightBeforeStartingGrowthHormoneRadioButton.click();
		rASSurveyPage.heightTextBox.sendKeys(growthHormoneTreatment);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//selects number of growth hormone treatment {string} for How many times have you received growth hormone treatment? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
		CommonUtils.selectDropDownValue(numberOfgrowthHormoneTreatments,
				rASSurveyPage.howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//adds details in Please provide the details of growth hormone replacement by completing the table below. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.growthHormoneTreatment1AgeStartedTextBox);
		rASSurveyPage.growthHormoneTreatment1AgeStartedTextBox.sendKeys(treatmentOneAgeStarted);
		rASSurveyPage.growthHormoneTreatment1AgeStoppedTextBox.sendKeys(treatmentOneAgeStopped);
		rASSurveyPage.growthHormoneTreatment1AreYouStillOnGrowthHormoneNoRadioButton.click();
		rASSurveyPage.growthHormoneTreatment2AgeStartedTextBox.sendKeys(treatmentTwoAgeStarted);
		rASSurveyPage.growthHormoneTreatment2AgeStoppedTextBox.sendKeys(treatmentTwoAgeStopped);
		rASSurveyPage.growthHormoneTreatment2AreYouStillOnGrowthHormoneNoRadioButton.click();
		rASSurveyPage.growthHormoneTreatment3AgeStartedTextBox.sendKeys(treatmentThreeAgeStarted);
		rASSurveyPage.growthHormoneTreatment3AgeStoppedTextBox.sendKeys(treatmentThreeAgeStopped);
		rASSurveyPage.growthHormoneTreatment3AreYouStillOnGrowthHormoneNoRadioButton.click();
		JavascriptUtils.scrollUp(800);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks Next button The next set of questions will ask about development. Development includes things such as crawling walking and speaking understanding language. page - myRAS Survey
		MiscUtils.sleep(1200);
		CommonUtils.waitForVisibility(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Were you ever diagnosed with hypotonia as an infant or child? This is often described as unusually low muscle tone or floppy muscle tone. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks twelve-eighteen months option At what age were you able to sit without support? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.atWhatAgeWereYouAbleToSitWithoutSupportCheckRadioButton);
		rASSurveyPage.atWhatAgeWereYouAbleToSitWithoutSupportCheckRadioButton.click();
		JavascriptUtils.scrollUp(800);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks twelve-eighteen months option At what age were you able to walk without support? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.atWhatAgeWereYouAbleToWalkWithoutSupportCheckRadioButton);
		rASSurveyPage.atWhatAgeWereYouAbleToWalkWithoutSupportCheckRadioButton.click();
		JavascriptUtils.scrollUp(800);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Have you ever received physical therapy? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks twenty-four to thirthy-six months option At what age were you able to use simple two-word phrases? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.twentyFourToThirthySixMonthsRadioButton);
		rASSurveyPage.twentyFourToThirthySixMonthsRadioButton.click();
		JavascriptUtils.scrollUp(800);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.surveyNextButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();
		
		//selects Simple speech compared to people of the same age How would you describe your current speech capabilities? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.simpleSpeechComparedToPeopleOfTheSameAgeRadioButton);
		rASSurveyPage.simpleSpeechComparedToPeopleOfTheSameAgeRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Have you ever received speech therapy? page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks Severe Cognitive Delay Between the ages of three and six years old preschool years, were you ever diagnosed with issues of cognitive development? Cognitive development can include difficulties in learning, understanding, andprocessing information or making decisions. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.severeCognitiveDelayRadioButton);
		rASSurveyPage.severeCognitiveDelayRadioButton.click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.severeCognitiveDelayRadioButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks YES Didyou receive occupational therapy between three and six years of age? Occupational therapy is based on engagement in activities of daily life \\(such as self-care skills, education, work, or social interaction). page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.yesRadioButton);
		rASSurveyPage.yesRadioButton.click();
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks Attended typical elementary school without support Between the ages of six and ten \\(elementary school age)Please select the option that best describes your schooling. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.attendedTypicalElementarySchoolWithoutSupportRadioButton);
		rASSurveyPage.attendedTypicalElementarySchoolWithoutSupportRadioButton.click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.attendedTypicalElementarySchoolWithoutSupportRadioButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks Attended typical elementary school without support Between the ages of ten and seventeen \\(middle and high school age) please select the option that best describes your schooling. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.attendedTypicalclassroomOrlittleSupportRadioButton);
		rASSurveyPage.attendedTypicalclassroomOrlittleSupportRadioButton.click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.attendedTypicalclassroomOrlittleSupportRadioButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();

		//clicks Bachelors degree four-year college with BA, BS, AB, Please indicate the highest degree or level of schooling you have completed. page - myRAS Survey
		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.BachelorsDegreeRadioButton);
		rASSurveyPage.BachelorsDegreeRadioButton.click();
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(rASSurveyPage.BachelorsDegreeRadioButton);
		CucumberLogUtils.logScreenShot();
		rASSurveyPage.surveyNextButton.click();


	}

	/**
	 * Use this method to assert all text boxes in a tab in native view
	 *
	 * @param String the attribute you want to get from the element, @param
	 *               List<String>
	 *               the data in the text boxes, @param List<WebElement> the text box
	 *               xpaths
	 */
	public static void assertTextBoxes(String attributeType, List<String> data, List<WebElement> elements) {
		for (WebElement x : elements) {
			try {
				Assert.assertTrue(data.contains(x.getAttribute(attributeType)));
			} catch (AssertionError e) {
				System.out.println(x.getAttribute("name") + " " + x.getAttribute("value"));
				e.printStackTrace();
			}
		}
	}


	/**
	 * Use this method to assert all drop downs in a tab in native view
	 *
	 * @param List<String> the possible selection options in the drop downs for the
	 *                     tab, @param List<WebElement> list of the drop down box
	 *                     xpaths
	 */
	public static void assertDropDowns(List<String> responseTypes, List<WebElement> elements) {
		for (WebElement x : elements) {
			try {
				Assert.assertTrue(responseTypes.contains(x.getText()));
			} catch (AssertionError e) {

				System.out.println(x.findElement(By.xpath("./..")).getAttribute("name"));
				e.printStackTrace();
			}
		}
	}


	/**
	 * Use this method to assert native view data table and all its data in the tabs
	 * 
	 * @param List<WebElement> list of all the tabs in the data table on native view
	 */
	public void assertTable(List<WebElement> elements) throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> tabData = reader.getData(CHARMSConstants.RAS_SURVEY_DATA,
				"NativeViewData");

		for (WebElement x : elements) {
			x.click();
			// Scrolls to the clock on bottom of page
			CommonUtils.scrollIntoView(
					WebDriverUtils.webDriver.findElement(By.xpath("//button[@aria-label='Response Time']")));
			// Gets the current tabs name
			String tab_caption = WebDriverUtils.webDriver.findElement(By.xpath("("
					+ x.toString()
							.split("\\[\\[ChromeDriver: chrome on [A-Za-z]+ \\([A-Za-z0-9]+\\)\\] \\-\\> xpath: ")[1]
									.split("]$")[0]
					+ "//span[@class='tab_caption_text'])" + "[position()=" + (elements.indexOf(x) + 1) + "]"))
					.getText().split(" \\([\\d]+\\)")[0];
			// Gets all anchor tags in current tab
			List<WebElement> rowElementsATag = WebDriverUtils.webDriver
					.findElements(By.xpath("//div[@tab_caption='" + tab_caption
							+ "']//span//div//div//table//tbody//tr[@data-type='list2_row']//td[@class='vt']//a"));
			// Gets all non anhor tags with text in current tab
			List<WebElement> rowElementsTDTag = WebDriverUtils.webDriver.findElements(By.xpath("(//div[@tab_caption='"
					+ tab_caption
					+ "']//span//div//div//table//tbody//tr[@data-type='list2_row']//td[@class='vt'])[not(a) and normalize-space(text())]"));

			// Declare a hash set for the text options
			HashSet<String> textOptions = new HashSet<>();
			int length = rowElementsATag.size() + rowElementsTDTag.size();
			// Reads excel form and adds all options from excel into the hashset
			for (int i = 0; i < length; i++)
				textOptions.add(tabData.get(i).get(tab_caption));

			// If there are any anchor tags asserts that the text is in the text options
			// hash set
			if (!(rowElementsATag.size() <= 0)) {
				for (WebElement y : rowElementsATag) {
					try {
						Assert.assertTrue(textOptions.contains(y.getText()));
					} catch (AssertionError e) {
						System.out.println(
								"Failed in " + tab_caption + " at " + y.getText() + " tag type: " + y.getTagName());
						e.printStackTrace();
					}
				}
			}
			// If there are any non anchor tags asserts that the text is in the text options
			// hash set
			if (!(rowElementsTDTag.size() <= 0)) {
				for (WebElement y : rowElementsTDTag) {
					try {
						Assert.assertTrue(textOptions.contains(y.getText()));
					} catch (AssertionError e) {
						System.out.println(
								"Failed in " + tab_caption + " at " + y.getText() + " tag type: " + y.getTagName());
						e.printStackTrace();
					}
				}
			}
			{
				WebElement currentPage = WebDriverUtils.webDriver.findElement(By.xpath("//div[contains(@tab_caption,'"
						+ tab_caption
						+ "')]//span[contains(@class,'list_span_related')]//div//div[contains(@class,'container-fluid')]//div[2]//span[1]//div[1]//span[2]//span[1]"));
				WebElement totalEntries = WebDriverUtils.webDriver.findElement(By.xpath("//div[contains(@tab_caption,'"
						+ tab_caption
						+ "')]//span[contains(@class,'list_span_related')]//div//div[contains(@class,'container-fluid')]//div[2]//span[1]//div[1]//span[2]//span[2]"));

				if (!(currentPage.getText().contentEquals(totalEntries.getText()))) {
					WebElement button = WebDriverUtils.webDriver.findElement(By.xpath("//div[contains(@tab_caption,'"
							+ tab_caption
							+ "')]//span[contains(@class,'list_span_related')]//div//div[contains(@class,'container-fluid')]//div[2]//span[1]/button[@name='vcr_next']"));
					if (button.isDisplayed() && button.isEnabled()) {
						button.click();
					}
					// If there are any anchor tags asserts that the text is in the text options
					// hash set
					MiscUtils.sleep(3000);
					List<WebElement> y = WebDriverUtils.webDriver
							.findElements(By.xpath("//div[@tab_caption='" + tab_caption
									+ "']//span//div//div//table//tbody//tr[@data-type='list2_row']//td[@class='vt']//a"));
					length--;
					for (int i = 0; i < y.size(); i++) {
						textOptions.add(tabData.get(length++).get(tab_caption));
					}
					for (WebElement z : y) {
						try {
							Assert.assertTrue(textOptions.contains(z.getText()));
						} catch (AssertionError e) {
							System.out.println(
									"Failed in " + tab_caption + "at " + z.getText() + "tag type: " + z.getTagName());
							e.printStackTrace();
						}
					}
				}
				// Clears the hashset
				textOptions.clear();
			}
		}

	}
}
