package ServiceNow.CHARMS.StepsImplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class ProbandScreenerSubmissionImpl extends PageInitializer {

	/*
	 * Use this method to select any value from Are you filling this questionnaire
	 * out for someone else? drop down ----- SCREENSHOTS ARE TAKEN WITH THIS METHOD
	 * AS WELL -----
	 */
	public void areYouFillingThisQuestionnaireOutForSomeoneElse(String value){
		/** Scrolling into areYouFillingOutThisQuestionnaireForSomeoneElseDropDown */
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDown);

		/** Clicking areYouFillingOutThisQuestionnaireForSomeoneElseDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDown.click();

		/**
		 * Selecting value from
		 * areYouFillingOutThisQuestionnaireForSomeoneElseDropDownValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> values = probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, value);

		/** Taking screenshot */
		CucumberLogUtils.logScreenShot();

	}

	/*
	 * Use this method to fill out Demographic Information section by passing
	 * required parameters ----- SCREENSHOTS ARE TAKEN WITH THIS METHOD AS WELL
	 * -----
	 */
	public void fillingOutDemographicInformation(String BiologicalSex, String DOB, String CountryOfBirth, String City,
			String State, String Ethnicity, String Race, String BiologicalMothersEthnicity,
			String BiologicalMothersRace, String BiologicalFathersEthnicity, String BiologicalFathersRace) {
		/** Clicking on Biological Sex Drop Down */
		MiscUtils.sleep(2000);
		probandScreenerPage.biologicalSexDropDown.click();

		/** Selecting Male or Female from biological sex drop down values */
		MiscUtils.sleep(2000);
		List<WebElement> biologicalSexValue = probandScreenerPage.biologicalSexDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalSexValue, BiologicalSex);

		/** Selecting Date of Birth */
		MiscUtils.sleep(2000);
		// JavascriptUtils.selectDateByJS(probandScreenerPage.dateOfBirth, DOB);
		probandScreenerPage.dateOfBirth.sendKeys(DOB);

		/** Clicking Country of Birth drop down */
		MiscUtils.sleep(2000);
		probandScreenerPage.countryOfBirthDropDown.click();

		/** Selecting country from country of birth drop down values */
		MiscUtils.sleep(2000);
		List<WebElement> countryOfBirthValues = probandScreenerPage.countryOfBirthDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(countryOfBirthValues, CountryOfBirth);

		/** Sending city and state values */
		// probandScreenerPage.birthCity.clear();
		probandScreenerPage.birthCity.sendKeys(City);
		// probandScreenerPage.birthState.clear();
		probandScreenerPage.birthState.sendKeys(State);

		/** Clicking on probandsEthnicityDropDown */
		probandScreenerPage.probandsEthnicityDropDown.click();
		MiscUtils.sleep(2000);

		/** Selecting Probands ethnicity from probandsEthnicityDropDownValues */
		List<WebElement> probandsEthnicityDropDownValues = probandScreenerPage.ethnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(probandsEthnicityDropDownValues, Ethnicity);

		/** Clicking on probandsRaceDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.probandsRaceDropDown.click();

		/** Selecting probands race from probandsRaceDropDownValues */
		MiscUtils.sleep(2000);
		List<WebElement> probandsRaceDropDownValues = probandScreenerPage.probandsRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(probandsRaceDropDownValues, Race);

		/** Taking screenshot */
		CucumberLogUtils.logScreenShot();

		/** Scrolling into biologicalMothersEthnicityDropDown */
		JavascriptUtils.scrollIntoView(probandScreenerPage.biologicalMothersEthnicityDropDown);

		/** Clicking on biologicalMothersEthnicityDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.biologicalMothersEthnicityDropDown.click();

		/**
		 * Selecting biological mothers ethnicity from
		 * biologicalMothersEthnicityDropDownValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> biologicalMothersEthnicityDropDownValues = probandScreenerPage.biologicalMothersEthnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalMothersEthnicityDropDownValues,
				BiologicalMothersEthnicity);

		/** Clicking on biologicalMothersRaceDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.biologicalMothersRaceDropDown.click();

		/**
		 * Selecting biological mothers race from biologicalMothersRaceDropDownValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> biologicalMothersRaceDropDownValues = probandScreenerPage.biologicalMothersRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalMothersRaceDropDownValues, BiologicalMothersRace);

		/** Clicking on biological fathers ethnicity drop down */
		MiscUtils.sleep(2000);
		probandScreenerPage.biologicalFathersEthnicityDropDown.click();

		/**
		 * Selecting biological fathers ethnicity from
		 * biologicalFathersEthnicityDropDownValues
		 */
		List<WebElement> biologicalFathersEthnicityDropDownValues = probandScreenerPage.biologicalFathersEthnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalFathersEthnicityDropDownValues,
				BiologicalFathersEthnicity);

		/** Clicking on biological fathers race drop down */
		MiscUtils.sleep(2000);
		probandScreenerPage.biologicalFathersRaceDropDown.click();

		/**
		 * Selecting biological fathers race from biologicalFathersRaceDropDownValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> biologicalFathersRaceDropDownValues = probandScreenerPage.biologicalFathersRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalFathersRaceDropDownValues, BiologicalFathersRace);

		/** Taking screenshot */
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	/*
	 * Use this method to fill out probands contact information ----- SCREENSHOTS
	 * ARE TAKEN WITH THIS METHOD AS WELL -----
	 */
	public void fillingOutProbandsContactInformation(String PhoneNumber, String StreetAddress, String City,
			String State, String ZipCode) {
		/** Sending probands phone number */
		MiscUtils.sleep(2000);
		// probandScreenerPage.probandsPhoneNumber.clear();
		probandScreenerPage.probandsPhoneNumber.sendKeys(PhoneNumber);

		/** Sending probands street address */
		// probandScreenerPage.probandsStAddress.clear();
		probandScreenerPage.probandsStAddress.sendKeys(StreetAddress);
		// probandScreenerPage.probandsCity.clear();
		probandScreenerPage.probandsCity.sendKeys(City);
		// probandScreenerPage.probandsState.clear();
		probandScreenerPage.probandsState.sendKeys(State);
		// probandScreenerPage.probandsZipCode.clear();
		probandScreenerPage.probandsZipCode.sendKeys(ZipCode);
		probandScreenerPage.probandsState.click();

		/** Taking screenshot */
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	/*
	 * Use this method to select any value from Has a physician ever diagnosed the
	 * research participant with cancer? in the Personal Cancer History section
	 * ----- SCREENSHOTS ARE TAKEN WITH THIS METHOD AS WELL -----
	 */
	public void hasAphysicianEverDiagnosedTheResearchParticipantWithCancer(String yesOrNoOption) {
		/**
		 * Clicking on
		 * hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerDropDown
		 */
		MiscUtils.sleep(2000);
		probandScreenerPage.hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerDropDown.click();

		/**
		 * Selecting value from
		 * hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> yesOrNoCancer = probandScreenerPage.hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerValues;
		CommonUtils.selectValueFromBootStrapDropDown(yesOrNoCancer, yesOrNoOption);

		/** Taking screenshot */
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	/*
	 * Use this method to add new personal cancer information entries -----
	 * SCREENSHOTS ARE TAKEN WITH THIS METHOD AS WELL -----
	 */
	public void addingNewPersonalCancerInformation(String CancerType, String AgeResearchParticipantWasDiagnosed) {
		/** Clicking on cancerTypeOrSiteDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.cancerTypeOrSiteDropDown.click();

		/** Selecting cancer type from cancerTypeOrSiteDropDownValues */
		MiscUtils.sleep(2000);
		List<WebElement> cancerTypeOrSite = probandScreenerPage.cancerTypeOrSiteDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(cancerTypeOrSite, CancerType);

		/** Sending age into howOldWasTheResearchParticipantWhenTheCancerWasDiagnosed */
		MiscUtils.sleep(2000);
		probandScreenerPage.howOldWasTheResearchParticipantWhenTheCancerWasDiagnosed
				.sendKeys(AgeResearchParticipantWasDiagnosed);

		/** Taking screenshot */
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

		/** Clicking on addNewEntrySaveBtn */
		MiscUtils.sleep(2000);
		probandScreenerPage.addNewEntrySaveBtn.click();

		/** Taking screenshot */
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	/*
	 * Use this method to select any value from Has research participant been
	 * genetically tested for inherited cancer syndromes? drop down in the Personal
	 * Genetic Tests section ----- SCREENSHOTS ARE TAKEN WITH THIS METHOD AS WELL
	 * -----
	 */
	public void hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromes(String yesOption) {
		/**
		 * Clicking on
		 * hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDown
		 */
		MiscUtils.sleep(2000);
		probandScreenerPage.hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDown.click();
		/**
		 * Selecting value from
		 * hasParticipantBeenGeneticallyTestedForInheritedCancerSyndromeValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> hasParticipantBeenGeneticallyTestedForInheritedCancerSyndromeValues = probandScreenerPage.hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(
				hasParticipantBeenGeneticallyTestedForInheritedCancerSyndromeValues, yesOption);

		/** Taking screenshot */
		CucumberLogUtils.logScreenShot();
	}

	/*
	 * Use this method to add a new personal genetic test in the Personal Genetics
	 * Tests section ----- SCREENSHOTS ARE TAKEN WITH THIS METHOD AS WELL -----
	 */
	public void addNewPersonalGeneticTestsEntry(String TestedGenes, String TestResult) {
		/** Clicking on testGenesHereditaryCancerSyndromesDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.testGenesHereditaryCancerSyndromesDropDown.click();

		/** Selecting tested genes from testGenesHereditaryCancerSyndromesValues */
		MiscUtils.sleep(2000);
		List<WebElement> testedGenesHereditaryCancerSyndrome = probandScreenerPage.testGenesHereditaryCancerSyndromesValues;
		CommonUtils.selectValueFromBootStrapDropDown(testedGenesHereditaryCancerSyndrome, TestedGenes);

		/** Clicking on testResults */
		MiscUtils.sleep(2000);
		probandScreenerPage.testResults.click();

		/** Selecting value from testResultsDropDownValues */
		MiscUtils.sleep(2000);
		List<WebElement> testedResultValues = probandScreenerPage.testResultsDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(testedResultValues, TestResult);

		/** Taking screenshot */
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();

		/** Clicking on testedGenesSaveBtn */
		MiscUtils.sleep(2000);
		probandScreenerPage.testedGenesSaveBtn.click();

		/** Taking screenshot */
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	/*
	 * Use this method to select any value from Have any biological relatives been
	 * diagnosed with cancer? drop down ----- SCREENSHOTS ARE TAKEN WITH THIS METHOD
	 * AS WELL -----
	 */
	public void haveAnyBiologicalRelativesBeenDiagnosedWithCancer(String value) {
		/** Clicking on haveAnyBiologicalRelativesBeenDiagnosedWithCancerDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.haveAnyBiologicalRelativesBeenDiagnosedWithCancerDropDown.click();

		/**
		 * Selecting yes from haveAnyBiologicalRelativesBeenDiagnosedWithCancerValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> haveAnyBiologicalRelativesBeenDiagnosedWithCancer = probandScreenerPage.haveAnyBiologicalRelativesBeenDiagnosedWithCancerValues;
		CommonUtils.selectValueFromBootStrapDropDown(haveAnyBiologicalRelativesBeenDiagnosedWithCancer, value);

		/** Taking screenshot */
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	/*
	 * Use this method to add new family cancer information in the Family Members'
	 * Cancer History section ----- SCREENSHOTS ARE TAKEN WITH THIS METHOD AS WELL
	 * -----
	 */
	public void addNewFamilyCancerInformation(String FamilyCancerType, String RelationshipToParticipant,
			String NameOfHospital, String HospitalCountry, String HospitalCity, String HospitalState,
			String RelativesName, String RelativesDateOfBirth, String RelativesAgeWhenDiagnosed,
			String isRelativeAlive) {

		/** Clicking on familyCancerTypeOrSiteDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.familyCancerTypeOrSiteDropDown.click();

		/** Selecting family cancer type from familyCancerTypeOrSiteDropDownValues */
		MiscUtils.sleep(2000);
		List<WebElement> familyCancerTypeOrSiteValues = probandScreenerPage.familyCancerTypeOrSiteDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(familyCancerTypeOrSiteValues, FamilyCancerType);

		/** Clicking on relationshipToResearchParticipantDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.relationshipToResearchParticipantDropDown.click();

		/**
		 * Selecting relationship to research participant from
		 * relationshipToResearchParticipantValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> relationshipToParticipant = probandScreenerPage.relationshipToResearchParticipantValues;
		CommonUtils.selectValueFromBootStrapDropDown(relationshipToParticipant, RelationshipToParticipant);

		/**
		 * Sending name of hospital where diagnosed into nameOfHospitalWhereDiagnosed
		 */
		MiscUtils.sleep(2000);
		probandScreenerPage.nameOfHospitalWhereDiagnosed.click();

		/**
		 * Sending name of hospital where diagnosed into nameOfHospitalWhereDiagnosed
		 */
		MiscUtils.sleep(2000);
		probandScreenerPage.nameOfHospitalWhereDiagnosed.sendKeys(NameOfHospital);

		/** Clicking on hospitalCountryDropDown */
		probandScreenerPage.hospitalCountryDropDown.click();

		/** Selecting hospital country from hospitalCountryDropDownValues */
		MiscUtils.sleep(2000);
		List<WebElement> hospitalCountry = probandScreenerPage.hospitalCountryDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(hospitalCountry, HospitalCountry);

		/** Sending hospital city into hospitalCity */
		MiscUtils.sleep(1000);
		probandScreenerPage.hospitalCity.sendKeys(HospitalCity);

		/** Sending hospital state into hospitalState */
		probandScreenerPage.hospitalState.sendKeys(HospitalState);

		/** Sending relatives name into relativesName */
		probandScreenerPage.relativesName.sendKeys(RelativesName);

		/** Selecting relatives date of birth */
		MiscUtils.sleep(1500);
		JavascriptUtils.selectDateByJS(probandScreenerPage.relativesDOB, RelativesDateOfBirth);

		/** Entering relatives age of diagnosis into relativesAgeOfDiagonsis */
		probandScreenerPage.relativesAgeOfDiagonsis.sendKeys(RelativesAgeWhenDiagnosed);

		/** Clicking on isThisRelativeAliveDropDown */
		MiscUtils.sleep(1000);
		probandScreenerPage.isThisRelativeAliveDropDown.click();

		/** Selecting No, Yes, or Don't Know from isThisRelativeAliveDropDownValues */
		MiscUtils.sleep(2000);
		List<WebElement> isThisRelativeAlive = probandScreenerPage.isThisRelativeAliveDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(isThisRelativeAlive, isRelativeAlive);

		/** Taking screenshot */
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();

		/** Clicking on newFamilyMemberInformationSaveBtn */
		probandScreenerPage.newFamilyMemberInformationSaveBtn.click();

		/** Taking screenshot */
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	/*
	 * Use this method to select any value any value from the Have any relatives
	 * been genetically tested for inherited cancer syndromes? drop down in the
	 * Family Members' Genetic Tests ----- SCREENSHOTS ARE TAKEN WITH THIS METHOD AS
	 * WELL -----
	 */
	public void haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromes(String value) {
		/**
		 * Clicking on
		 * haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDown
		 */
		MiscUtils.sleep(3000);
		probandScreenerPage.haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDown.click();

		/**
		 * Selecting Not answered, Yes, No, or Don't Know from
		 * haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromes = probandScreenerPage.haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromes,
				value);

		/** Taking screenshot */
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	/*
	 * Use this method to add new family relative information on the Family Members'
	 * Genetic Tests section ----- SCREENSHOTS ARE TAKEN WITH THIS METHOD AS WELL
	 * -----
	 */
	public void addingNewFamilyRelativeInformation(String SecondRelativesName,
			String FamilyMemberGeneticTestsRelationshipToParticipant, String GenesSyndromesWithPositiveResults,
			String RelativesTestResult) {
		/** Sending another relatives name into anotherRelativesName */
		MiscUtils.sleep(2000);
		probandScreenerPage.anotherRelativesName.sendKeys(SecondRelativesName);

		/** Clicking on anotherRelativesRelationshipToResearchParticipantDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.anotherRelativesRelationshipToResearchParticipantDropDown.click();

		/**
		 * Selecting relationship to research participant from
		 * anotherRelativesRelationshipToResearchParticipantValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> relationshipToResearchParticipant = probandScreenerPage.anotherRelativesRelationshipToResearchParticipantValues;
		CommonUtils.selectValueFromBootStrapDropDown(relationshipToResearchParticipant,
				FamilyMemberGeneticTestsRelationshipToParticipant);

		/** Clicking on genesHereditaryCancerSyndromeWithPositiveResultsDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.genesHereditaryCancerSyndromeWithPositiveResultsDropDown.click();

		/** Selecting genes/cancer syndromes from */
		MiscUtils.sleep(2000);
		List<WebElement> genesHereditaryCancerSyndromeWithPositiveResults = probandScreenerPage.genesHereditaryCancerSyndromeWithPositiveResultsDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(genesHereditaryCancerSyndromeWithPositiveResults,
				GenesSyndromesWithPositiveResults);

		/** Clicking on additionalFamilyMemberTestResultDropDown */
		MiscUtils.sleep(1000);
		probandScreenerPage.additionalFamilyMemberTestResultDropDown.click();

		/** Selecting value from additionalFamilyMemberTestResultDropDownValues */
		MiscUtils.sleep(2000);
		List<WebElement> additionalFamilyMemberTestResults = probandScreenerPage.additionalFamilyMemberTestResultDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(additionalFamilyMemberTestResults, RelativesTestResult);

		/** Taking screenshot */
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();

		/** Clicking on additionalFamilyMemberGeneticsSaveBtn */
		MiscUtils.sleep(1000);
		probandScreenerPage.additionalFamilyMemberGeneticsSaveBtn.click();

		/** Taking screenshot */
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	/*
	 * Use this method to select any value from How did you hear about this study?
	 * drop down in the Final Information section
	 */
	public void howDidYouHearAboutThisStudy(String HowDidYouHearAboutStudy) {
		/** Clicking on howDidyouHearAboutThisStudyDropDown */
		MiscUtils.sleep(1000);
		probandScreenerPage.howDidyouHearAboutThisStudyDropDown.click();
		/** Selecting value from howDidyouHearAboutThisStudyDropDownValues */
		MiscUtils.sleep(2000);
		List<WebElement> howDidYouHearAboutThisStudyValues = probandScreenerPage.howDidyouHearAboutThisStudyDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(howDidYouHearAboutThisStudyValues, HowDidYouHearAboutStudy);
	}

	/*
	 * Use this method to select any value from Has the research participant or any
	 * family member participated in any LFS study? drop down in the final
	 * information section
	 */
	public void hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSstudy(
			String hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy) {
		/**
		 * Clicking on
		 * hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyDropDown
		 */
		MiscUtils.sleep(2000);
		probandScreenerPage.hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyDropDown.click();
		MiscUtils.sleep(2000);

		/**
		 * Selecting value from
		 * hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyDropDownValues
		 */
		List<WebElement> hasTheParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyValues = probandScreenerPage.hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(hasTheParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyValues,
				hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy);
	}

	/*
	 * Use this method to select any value from Are any relatives currently
	 * receiving cancer care or follow-up? drop down When selecting YES -
	 * application requires cancer type to submit
	 */
	public void areAnyRelativesCurrentlyReceivingCancerCareOrFollowUp(String AreRelativesReceivingCancerCare) {
		/** Clicking on areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpDropDown */
		MiscUtils.sleep(2000);
		probandScreenerPage.areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpDropDown.click();

		/**
		 * Selecting value from
		 * areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpDropDownValues
		 */
		MiscUtils.sleep(2000);
		List<WebElement> areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpValues = probandScreenerPage.areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpValues,
				AreRelativesReceivingCancerCare);
	}

	public void fillingOutFinalInformationWithoutSelectingOtherAndSelectingNoToReceivingCancerFollowUp(
			String HowDidYouHearAboutStudy, String hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy,
			String AreRelativesReceivingCancerCare, String Comments) {
		MiscUtils.sleep(2000);
		probandScreenerSubmissionImpl.howDidYouHearAboutThisStudy(HowDidYouHearAboutStudy);
		probandScreenerSubmissionImpl.hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSstudy(
				hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy);
		probandScreenerSubmissionImpl
				.areAnyRelativesCurrentlyReceivingCancerCareOrFollowUp(AreRelativesReceivingCancerCare);
		probandScreenerPage.commentTxtBox.sendKeys(Comments);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	public void submitTheScreener() {
		/*
		 * This method clicks on the Submit button on the Final Information Page
		 */
		MiscUtils.sleep(1000);
		probandScreenerPage.screenerSubmitBtn.click();

		/*
		 * This method waits for the "Are you ready to submit this form?" warning and
		 * selects "OK"
		 */
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(probandScreenerPage.confirmScreenerSubmissionBtn);
		MiscUtils.sleep(2000);
	}

	public void fullTestAccountReset() throws TestingException {
		/**
		 * THE BELOW CODE HAS ITS OWN CUCUMBER FEATURE IMPLEMENTATION -- PLEASE REVIEW
		 * TESTACCOUNTRESET.feature in the CHARMS features package
		 */
		nativeViewLoginImpl.nativeViewLogin();
		//MiscUtils.sleep(2000);
		nativeViewHomePage.nativeViewFilterNavigator.sendKeys("Studio");
		MiscUtils.sleep(3000);
		String parentWindowHandle = WebDriverUtils.webDriver.getWindowHandle();
		MiscUtils.sleep(2000);
		charmsNativeViewPage.studioLink.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
		testAccountResetImpl.navigateToCHARMSstudio("Family Cohort Study");
		MiscUtils.sleep(3000);
		charmsNativeViewPage.familyCohortStudyLink.click();
		MiscUtils.sleep(3000);
		// charmsNativeViewPage.charmsReferralsLink.click();
		JavascriptUtils.clickByJS(charmsNativeViewPage.charmsReferralsLink);
		MiscUtils.sleep(3000);
		testAccountResetImpl.navigateToCHARMSreferralsShowList();
		MiscUtils.sleep(3000);
		testAccountResetImpl.searchForTestAccountCHARMSreferralsShowList("diegojuarezbusiness@gmail.com");
		MiscUtils.sleep(3000);
		testAccountResetImpl.deleteAccountFromCHARMSreferralsShowList();
		MiscUtils.sleep(3000);
		testAccountResetImpl.navigateToFamilyMemberDetails();
		MiscUtils.sleep(3000);
		testAccountResetImpl.navigateToFamilyMemberDetailsShowList();
		MiscUtils.sleep(3000);
		testAccountResetImpl.searchTestAccountNameFamilyMemberDetails("Diego TestAccount2");
		MiscUtils.sleep(3000);
		testAccountResetImpl.deleteAccountFromFamilyMemberDetails();
		MiscUtils.sleep(3000);
		testAccountResetImpl.navigateToFCSMSformAccess();
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(charmsNativeViewPage.fcsmsFormAccessShowListLink);
		MiscUtils.sleep(2000);
		charmsNativeViewPage.fcsmsFormAccessShowListLink.click();
		MiscUtils.sleep(3000);
		MiscUtils.sleep(3000);
		testAccountResetImpl.deleteAccountFromFCSMSformAccess();
	}

	public void signingOutOfCharms() {
		/**
		 * clicking on Your Screener Form has been submitted successfully ! ok button
		 */
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(probandScreenerPage.screenerFormSubmittedSuccessfullyOKButton);

		/** clicking on profile account drop down */
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(probandScreenerPage.profileAccountDropDown);

		/** clicking on sign out */
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(probandScreenerPage.signOutButton);
	}
}
