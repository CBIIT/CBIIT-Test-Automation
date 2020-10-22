package ServiceNow.CHARMS.Steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.When;

public class ProbandScreenerSubmissionSteps extends PageInitializer {

	/*
	 * Waits added to automation script to allow enough time for smooth Jenkins
	 * execution - Jenkins execution runs headless via HTMLUnitDriver
	 */

	@When("the probands selects on screener to submit a screener")
	public void the_probands_selects_on_screener_to_submit_a_screener() {
		/** Clicking on the screener button */
		MiscUtils.sleep(2000);
		clinicalGeneticsBranchPage.screenerBtn.click();
		MiscUtils.sleep(2000);
	}

	@When("selects {string} to filling questionnaire out for someone else")
	public void selects_to_filling_questionnaire_out_for_someone_else(String noOption) {
		/** Scrolling into areYouFillingOutThisQuestionnaireForSomeoneElseDropDown */
		JavascriptUtils.scrollIntoView(probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDown);

		/** Clicking areYouFillingOutThisQuestionnaireForSomeoneElseDropDown */
		MiscUtils.sleep(1000);
		probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDown.click();

		/** Selecting no from areYouFillingOutThisQuestionnaireForSomeoneElseDropDown */
		MiscUtils.sleep(1000);
		List<WebElement> values = probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, noOption);

		/** Taking screenshot */
		CucumberLogUtils.logScreenShot();

		/** Clicking on the save button */
		probandScreenerPage.studyIntroductionSaveAndNextBtn.click();
	}

	@When("fills out all Demographic Information {string}, {string}, {string},{string}, {string} {string}, {string}, {string}, {string}, {string}, {string}")
	public void fills_out_all_Demographic_Information(String BiologicalSex, String DOB, String CountryOfBirth,
			String City, String State, String Ethnicity, String Race, String BiologicalMothersEthnicity,
			String BiologicalMothersRace, String BiologicalFathersEthnicity, String BiologicalFathersRace) {

		/** Clicking on Biological Sex Drop Down */
		MiscUtils.sleep(1000);
		probandScreenerPage.biologicalSexDropDown.click();

		/** Selecting Male or Female from biological sex drop down values */
		MiscUtils.sleep(1000);
		List<WebElement> biologicalSexValue = probandScreenerPage.biologicalSexDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalSexValue, BiologicalSex);

		/** Selecting Date of Birth */
		MiscUtils.sleep(1000);
		JavascriptUtils.selectDateByJS(probandScreenerPage.dateOfBirth, DOB);

		/** Clicking Country of Birth drop down */
		MiscUtils.sleep(1000);
		probandScreenerPage.countryOfBirthDropDown.click();

		/** Selecting country from country of birth drop down values */
		MiscUtils.sleep(1000);
		List<WebElement> countryOfBirthValues = probandScreenerPage.countryOfBirthDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(countryOfBirthValues, CountryOfBirth);

		/** Sending city and state values */
		probandScreenerPage.birthCity.clear();
		probandScreenerPage.birthCity.sendKeys(City);
		probandScreenerPage.birthState.clear();
		probandScreenerPage.birthState.sendKeys(State);

		/** Clicking on probandsEthnicityDropDown */
		probandScreenerPage.probandsEthnicityDropDown.click();
		MiscUtils.sleep(1000);

		/** Selecting Probands ethnicity from probandsEthnicityDropDownValues */
		List<WebElement> probandsEthnicityDropDownValues = probandScreenerPage.ethnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(probandsEthnicityDropDownValues, Ethnicity);

		/** Clicking on probandsRaceDropDown */
		MiscUtils.sleep(1000);
		probandScreenerPage.probandsRaceDropDown.click();

		/** Selecting probands race from probandsRaceDropDownValues */
		MiscUtils.sleep(1000);
		List<WebElement> probandsRaceDropDownValues = probandScreenerPage.probandsRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(probandsRaceDropDownValues, Race);

		/** Taking screenshot */
		CucumberLogUtils.logScreenShot();

		/** Scrolling into biologicalMothersEthnicityDropDown */
		JavascriptUtils.scrollIntoView(probandScreenerPage.biologicalMothersEthnicityDropDown);

		/** Clicking on biologicalMothersEthnicityDropDown */
		MiscUtils.sleep(1000);
		probandScreenerPage.biologicalMothersEthnicityDropDown.click();

		/**
		 * Selecting biological mothers ethnicity from
		 * biologicalMothersEthnicityDropDownValues
		 */
		MiscUtils.sleep(1000);
		List<WebElement> biologicalMothersEthnicityDropDownValues = probandScreenerPage.biologicalMothersEthnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalMothersEthnicityDropDownValues,
				BiologicalMothersEthnicity);

		/** Clicking on biologicalMothersRaceDropDown */
		MiscUtils.sleep(1000);
		probandScreenerPage.biologicalMothersRaceDropDown.click();

		/**
		 * Selecting biological mothers race from biologicalMothersRaceDropDownValues
		 */
		MiscUtils.sleep(1000);
		List<WebElement> biologicalMothersRaceDropDownValues = probandScreenerPage.biologicalMothersRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalMothersRaceDropDownValues, BiologicalMothersRace);

		/** Clicking on biological fathers ethnicity drop down */
		MiscUtils.sleep(1000);
		probandScreenerPage.biologicalFathersEthnicityDropDown.click();

		/**
		 * Selecting biological fathers ethnicity from
		 * biologicalFathersEthnicityDropDownValues
		 */
		List<WebElement> biologicalFathersEthnicityDropDownValues = probandScreenerPage.biologicalFathersEthnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalFathersEthnicityDropDownValues,
				BiologicalFathersEthnicity);

		/** Clicking on biological fathers race drop down */
		MiscUtils.sleep(1000);
		probandScreenerPage.biologicalFathersRaceDropDown.click();

		/**
		 * Selecting biological fathers race from biologicalFathersRaceDropDownValues
		 */
		MiscUtils.sleep(1000);
		List<WebElement> biologicalFathersRaceDropDownValues = probandScreenerPage.biologicalFathersRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalFathersRaceDropDownValues, BiologicalFathersRace);

		/** Taking screenshot */
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();

		/** Clicking on demographicSaveAndNextBtn */
		MiscUtils.sleep(1000);
		probandScreenerPage.demographicSaveAndNextBtn.click();
	}

	@When("fills out all Contact Information with {string}, {string}, {string}, {string}, {string}")
	public void fills_out_all_Contact_Information_with(String PhoneNumber, String StreetAddress, String City,
			String State, String ZipCode) {
		/** Sending probands phone number */
		MiscUtils.sleep(1000);
		probandScreenerPage.probandsPhoneNumber.clear();
		probandScreenerPage.probandsPhoneNumber.sendKeys(PhoneNumber);

		/** Sending probands street address */
		probandScreenerPage.probandsStAddress.clear();
		probandScreenerPage.probandsStAddress.sendKeys(StreetAddress);
		probandScreenerPage.probandsCity.clear();
		probandScreenerPage.probandsCity.sendKeys(City);
		probandScreenerPage.probandsState.clear();
		probandScreenerPage.probandsState.sendKeys(State);
		probandScreenerPage.probandsZipCode.clear();
		probandScreenerPage.probandsZipCode.sendKeys(ZipCode);

		/** Taking screenshot */
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(probandScreenerPage.contactInfoSaveAndNextBtn);
	}

	@When("on the Personal Cancer History section selects {string} to a physician diagnosing the research participant with cancer")
	public void on_the_Personal_Cancer_History_section_selects_to_a_physician_diagnosing_the_research_participant_with_cancer(
			String yesOption) {
		/**
		 * Clicking on
		 * hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerDropDown
		 */
		MiscUtils.sleep(1000);
		probandScreenerPage.hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerDropDown.click();

		/**
		 * Selecting Yes option from
		 * hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerValues
		 */
		MiscUtils.sleep(1000);
		List<WebElement> yesOrNoCancer = probandScreenerPage.hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerValues;
		CommonUtils.selectValueFromBootStrapDropDown(yesOrNoCancer, yesOption);

		/** Taking screenshot */
		MiscUtils.sleep(300);
		CucumberLogUtils.logScreenShot();
	}

	@When("adds Personal Cancer information {string}, {string}")
	public void adds_Personal_Cancer_information(String CancerType, String AgeResearchParticipantWasDiagnosed) {
		/** Clicking on newPersonalCancerInformationBtn */
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(probandScreenerPage.newPersonalCancerInformationBtn);

		/** Clicking on cancerTypeOrSiteDropDown */
		MiscUtils.sleep(1000);
		probandScreenerPage.cancerTypeOrSiteDropDown.click();

		/** Selecting cancer type from cancerTypeOrSiteDropDownValues */
		MiscUtils.sleep(1000);
		List<WebElement> cancerTypeOrSite = probandScreenerPage.cancerTypeOrSiteDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(cancerTypeOrSite, CancerType);

		/** Sending age into howOldWasTheResearchParticipantWhenTheCancerWasDiagnosed */
		MiscUtils.sleep(1000);
		probandScreenerPage.howOldWasTheResearchParticipantWhenTheCancerWasDiagnosed
				.sendKeys(AgeResearchParticipantWasDiagnosed);

		/** Taking screenshot */
		MiscUtils.sleep(500);
		CucumberLogUtils.logScreenShot();

		/** Clicking on addNewEntrySaveBtn */
		MiscUtils.sleep(500);
		probandScreenerPage.addNewEntrySaveBtn.click();

		/** Taking screenshot */
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();

		/** Clicking on personalCancerHistorySaveAndNextBtn */
		probandScreenerPage.personalCancerHistorySaveAndNextBtn.click();
	}

	@When("on the Personal Genetic Tests sections selects {string} to being genetically tested for inherited cancer syndromes")
	public void on_the_Personal_Genetic_Tests_sections_selects_to_being_genetically_tested_for_inherited_cancer_syndromes(
			String yesOption) {
		/** Clicking on hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDown */
		MiscUtils.sleep(1000);
		probandScreenerPage.hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDown.click();
		
		/** Selecting Yes option from hasParticipantBeenGeneticallyTestedForInheritedCancerSyndromeValues */
		MiscUtils.sleep(1000);
		List<WebElement> hasParticipantBeenGeneticallyTestedForInheritedCancerSyndromeValues = probandScreenerPage.hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(
				hasParticipantBeenGeneticallyTestedForInheritedCancerSyndromeValues, yesOption);
		
		/** Taking screenshot */
		CucumberLogUtils.logScreenShot();
	}

	@When("adds Personal Genetic Tests information {string}, {string}")
	public void adds_Personal_Genetic_Tests_information(String TestedGenes, String TestResult) {
		/** Clicking on newPersonalGeneticTestBtn */
		MiscUtils.sleep(1000);
		probandScreenerPage.newPersonalGeneticTestBtn.click();
		
		/** Clicking on testGenesHereditaryCancerSyndromesDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.testGenesHereditaryCancerSyndromesDropDown.click();
		
		/** Selecting tested genes from testGenesHereditaryCancerSyndromesValues */
		MiscUtils.sleep(500);
		List<WebElement> testedGenesHereditaryCancerSyndrome = probandScreenerPage.testGenesHereditaryCancerSyndromesValues;
		CommonUtils.selectValueFromBootStrapDropDown(testedGenesHereditaryCancerSyndrome, TestedGenes);
		
		/** Clicking on testResults */
		MiscUtils.sleep(500);
		probandScreenerPage.testResults.click();
		
		/** Selecting options from testResultsDropDownValues */
		MiscUtils.sleep(500);
		List<WebElement> testedResultValues = probandScreenerPage.testResultsDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(testedResultValues, TestResult);
		
		/** Taking screenshot */
		MiscUtils.sleep(200);
		CucumberLogUtils.logScreenShot();
		
		/** Clicking on testedGenesSaveBtn */
		MiscUtils.sleep(500);
		probandScreenerPage.testedGenesSaveBtn.click();
		
		/** Taking screenshot */
		MiscUtils.sleep(500);
		CucumberLogUtils.logScreenShot();
		
		/** Clicking on personalGeneticTestsSaveAndNextBtn */
		probandScreenerPage.personalGeneticTestsSaveAndNextBtn.click();
	}

	@When("on Family Members Cancer History selects {string} to having any biological relatives being diagnosed with cancer")
	public void on_Family_Members_Cancer_History_selects_to_having_any_biological_relatives_being_diagnosed_with_cancer(
			String yesOption) {
		/** Clicking on haveAnyBiologicalRelativesBeenDiagnosedWithCancerDropDown */ 
		MiscUtils.sleep(500);
		probandScreenerPage.haveAnyBiologicalRelativesBeenDiagnosedWithCancerDropDown.click();
		
		/** Selecting yes from haveAnyBiologicalRelativesBeenDiagnosedWithCancerValues */
		MiscUtils.sleep(500);
		List<WebElement> haveAnyBiologicalRelativesBeenDiagnosedWithCancer = probandScreenerPage.haveAnyBiologicalRelativesBeenDiagnosedWithCancerValues;
		CommonUtils.selectValueFromBootStrapDropDown(haveAnyBiologicalRelativesBeenDiagnosedWithCancer, yesOption);
		
		/** Taking screenshot */
		CucumberLogUtils.logScreenShot();
	}

	@When("adds Family Cancer information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void adds_Family_Cancer_information(String FamilyCancerType, String RelationshipToParticipant,
			String NameOfHospital, String HospitalCountry, String HospitalCity, String HospitalState,
			String RelativesName, String RelativesDateOfBirth, String RelativesAgeWhenDiagnosed,
			String isRelativeAlive) {
		/** Clicking on newFamilyCancerInformation */
		MiscUtils.sleep(500);
		probandScreenerPage.newFamilyCancerInformation.click();
		
		/** Clicking on familyCancerTypeOrSiteDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.familyCancerTypeOrSiteDropDown.click();
		
		/** Selecting family cancer type from familyCancerTypeOrSiteDropDownValues */
		MiscUtils.sleep(500);
		List<WebElement> familyCancerTypeOrSiteValues = probandScreenerPage.familyCancerTypeOrSiteDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(familyCancerTypeOrSiteValues, FamilyCancerType);
		
		/** Clicking on relationshipToResearchParticipantDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.relationshipToResearchParticipantDropDown.click();
		
		/** Selecting relationship to research participant from relationshipToResearchParticipantValues */
		MiscUtils.sleep(500);
		List<WebElement> relationshipToParticipant = probandScreenerPage.relationshipToResearchParticipantValues;
		CommonUtils.selectValueFromBootStrapDropDown(relationshipToParticipant, RelationshipToParticipant);
		
		/** Sending name of hospital where diagnosed into nameOfHospitalWhereDiagnosed */
		MiscUtils.sleep(500);
		probandScreenerPage.nameOfHospitalWhereDiagnosed.click();
		
		/** Sending name of hospital where diagnosed into nameOfHospitalWhereDiagnosed */
		MiscUtils.sleep(500);
		probandScreenerPage.nameOfHospitalWhereDiagnosed.sendKeys(NameOfHospital);
		
		/** Clicking on hospitalCountryDropDown */
		probandScreenerPage.hospitalCountryDropDown.click();
		
		/** Selecting hospital country from hospitalCountryDropDownValues */
		MiscUtils.sleep(500);
		List<WebElement> hospitalCountry = probandScreenerPage.hospitalCountryDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(hospitalCountry, HospitalCountry);
		
		/** Sending hospital city into hospitalCity */
		MiscUtils.sleep(500);
		probandScreenerPage.hospitalCity.sendKeys(HospitalCity);
		
		/** Sending hospital state into hospitalState */
		probandScreenerPage.hospitalState.sendKeys(HospitalState);
		
		/** Sending relatives name into relativesName */
		probandScreenerPage.relativesName.sendKeys(RelativesName);
		
		/** Selecting relatives date of birth */
		MiscUtils.sleep(500);
		JavascriptUtils.selectDateByJS(probandScreenerPage.relativesDOB, RelativesDateOfBirth);
		
		/** Entering relatives age of diagnosis into relativesAgeOfDiagonsis */
		probandScreenerPage.relativesAgeOfDiagonsis.sendKeys(RelativesAgeWhenDiagnosed);
		
		/** Clicking on isThisRelativeAliveDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.isThisRelativeAliveDropDown.click();
		
		/** Selecting No, Yes, or Don't Know from isThisRelativeAliveDropDownValues */
		MiscUtils.sleep(500);
		List<WebElement> isThisRelativeAlive = probandScreenerPage.isThisRelativeAliveDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(isThisRelativeAlive, isRelativeAlive);
		
		/** Taking screenshot */
		MiscUtils.sleep(300);
		CucumberLogUtils.logScreenShot();
		
		/** Clicking on newFamilyMemberInformationSaveBtn */
		probandScreenerPage.newFamilyMemberInformationSaveBtn.click();
		
		/** Taking screenshot */
		MiscUtils.sleep(500);
		CucumberLogUtils.logScreenShot();
		
		/** Clicking familyMembersCancerHistorySaveAndNext */
		probandScreenerPage.familyMembersCancerHistorySaveAndNext.click();
	}

	@When("on the Family Members Genetic Tests selects {string} to having any relatives being genetically tested for inherited cancer syndromes")
	public void on_the_Family_Members_Genetic_Tests_selects_to_having_any_relatives_being_genetically_tested_for_inherited_cancer_syndromes(
			String yesOption) {
		/** Clicking on haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDown.click();
		
		/** Selecting Not answered, Yes, No, or Don't Know from haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues */
		List<WebElement> haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromes = probandScreenerPage.haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromes,
				yesOption);
		
		/** Taking screenshot */
		CucumberLogUtils.logScreenShot();
	}

	@When("adds Relatives with Genetic Tests information {string}, {string}, {string}, {string}")
	public void adds_Relatives_with_Genetic_Tests_information(String SecondRelativesName,
			String FamilyMemberGeneticTestsRelationshipToParticipant, String GenesSyndromesWithPositiveResults,
			String RelativesTestResult) {
		/** Clicking newFamilyRelativeInformationBtn */
		MiscUtils.sleep(500);
		probandScreenerPage.newFamilyRelativeInformationBtn.click();
		
		/** Sending another relatives name into  anotherRelativesName */
		MiscUtils.sleep(500);
		probandScreenerPage.anotherRelativesName.sendKeys(SecondRelativesName);
		
		/** Clicking on anotherRelativesRelationshipToResearchParticipantDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.anotherRelativesRelationshipToResearchParticipantDropDown.click();
		
		/** Selecting relationship to research participant from anotherRelativesRelationshipToResearchParticipantValues */
		MiscUtils.sleep(500);
		List<WebElement> relationshipToResearchParticipant = probandScreenerPage.anotherRelativesRelationshipToResearchParticipantValues;
		CommonUtils.selectValueFromBootStrapDropDown(relationshipToResearchParticipant,
				FamilyMemberGeneticTestsRelationshipToParticipant);
		
		/** Clicking on genesHereditaryCancerSyndromeWithPositiveResultsDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.genesHereditaryCancerSyndromeWithPositiveResultsDropDown.click();
		
		/** Selecting genes/cancer syndromes from  */
		MiscUtils.sleep(500);
		List<WebElement> genesHereditaryCancerSyndromeWithPositiveResults = probandScreenerPage.genesHereditaryCancerSyndromeWithPositiveResultsDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(genesHereditaryCancerSyndromeWithPositiveResults,
				GenesSyndromesWithPositiveResults);
		
		/** Clicking on additionalFamilyMemberTestResultDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.additionalFamilyMemberTestResultDropDown.click();
		
		/** Selecting value from additionalFamilyMemberTestResultDropDownValues */
		MiscUtils.sleep(500);
		List<WebElement> additionalFamilyMemberTestResults = probandScreenerPage.additionalFamilyMemberTestResultDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(additionalFamilyMemberTestResults, RelativesTestResult);
		
		/** Taking screenshot */
		MiscUtils.sleep(300);
		CucumberLogUtils.logScreenShot();
		
		/** Clicking on additionalFamilyMemberGeneticsSaveBtn */
		MiscUtils.sleep(500);
		probandScreenerPage.additionalFamilyMemberGeneticsSaveBtn.click();
		
		/** Taking screenshot */
		MiscUtils.sleep(500);
		CucumberLogUtils.logScreenShot();
		
		/** Clicking on familyMembersGeneticTestsSaveAndNextBtn */
		probandScreenerPage.familyMembersGeneticTestsSaveAndNextBtn.click();
	}

	@When("on the Final Information section selects the following information {string}, {string}, {string}, {string}")
	public void on_the_Final_Information_section_selects_the_following_information(String HowDidYouHearAboutStudy,
			String hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy,
			String AreRelativesReceivingCancerCare, String Comments) {
		/** Clicking on howDidyouHearAboutThisStudyDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.howDidyouHearAboutThisStudyDropDown.click();
		
		/** Selecting value from howDidyouHearAboutThisStudyDropDownValues */
		MiscUtils.sleep(500);
		List<WebElement> howDidYouHearAboutThisStudy = probandScreenerPage.howDidyouHearAboutThisStudyDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(howDidYouHearAboutThisStudy, HowDidYouHearAboutStudy);
		
		/** Clicking on hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyDropDown.click();
		MiscUtils.sleep(500);
		
		/** Selecting value from hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyDropDownValues */
		List<WebElement> hasTheParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudy = probandScreenerPage.hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(hasTheParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudy,
				hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy);
		
		/** Clicking on areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpDropDown */
		MiscUtils.sleep(500);
		probandScreenerPage.areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpDropDown.click();
		
		/** Selecting value from areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpDropDownValues */
		MiscUtils.sleep(500);
		List<WebElement> areAnyRelativesCurrentlyReceivingCancerCareOrFollowUp = probandScreenerPage.areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(areAnyRelativesCurrentlyReceivingCancerCareOrFollowUp,
				AreRelativesReceivingCancerCare);
		
		/** Sending comments to commentTxtBox */
		probandScreenerPage.commentTxtBox.sendKeys(Comments);
		
		/** Taking screenshot */
		MiscUtils.sleep(500);
		CucumberLogUtils.logScreenShot();
		// probandScreenerPage.screenerSubmitBtn.click();
	}

	@When("Submits the Screener Questionnaire")
	public void submits_the_Screener_Questionnaire() {
		/** Submitting screener */
		probandScreenerPage.screenerSubmitBtn.click();
		MiscUtils.sleep(500);
	}

}
