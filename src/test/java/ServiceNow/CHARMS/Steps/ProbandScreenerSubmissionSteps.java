package ServiceNow.CHARMS.Steps;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.mysql.cj.conf.HostInfo;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.When;

public class ProbandScreenerSubmissionSteps extends PageInitializer {

	@When("the probands selects on screener to submit a screener")
	public void the_probands_selects_on_screener_to_submit_a_screener() {
		// clicking on the screener button
		clinicalGeneticsBranchPage.screenerBtn.click();
		MiscUtils.sleep(2000);
	}

	@When("selects {string} to filling questionnaire out for someone else")
	public void selects_to_filling_questionnaire_out_for_someone_else(String noOption) {
		/** scrolling into areYouFillingOutThisQuestionnaireForSomeoneElseDropDown */
		JavascriptUtils.scrollIntoView(probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDown);
		/** clicking areYouFillingOutThisQuestionnaireForSomeoneElseDropDown */
		probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDown.click();
		/** selecting no from areYouFillingOutThisQuestionnaireForSomeoneElseDropDown */
		List<WebElement> values = probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, noOption);
		/** taking screenshot */
		CucumberLogUtils.logScreenShot();
		/** Clicking on the save button and adding wait */
		probandScreenerPage.studyIntroductionSaveAndNextBtn.click();
		MiscUtils.sleep(3000);
	}

	@When("fills out all Demographic Information {string}, {string}, {string},{string}, {string} {string}, {string}, {string}, {string}, {string}, {string}")
	public void fills_out_all_Demographic_Information(String BiologicalSex, String DOB, String CountryOfBirth,
			String City, String State, String Ethnicity, String Race, String BiologicalMothersEthnicity,
			String BiologicalMothersRace, String BiologicalFathersEthnicity, String BiologicalFathersRace) {
		probandScreenerPage.biologicalSex.click();
		List<WebElement> biologicalSexValue = probandScreenerPage.biologicalSexDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalSexValue, BiologicalSex);
		JavascriptUtils.selectDateByJS(probandScreenerPage.dateOfBirth, DOB);
		probandScreenerPage.countryOfBirth.click();
		List<WebElement> countryOfBirthValues = probandScreenerPage.countryOfBirthDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(countryOfBirthValues, CountryOfBirth);
		probandScreenerPage.birthCity.clear();
		probandScreenerPage.birthCity.sendKeys(City);
		probandScreenerPage.birthState.clear();
		probandScreenerPage.birthState.sendKeys(State);
		probandScreenerPage.ethnicityDropDown.click();
		List<WebElement> probandsEthnicityDropDownValues = probandScreenerPage.ethnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(probandsEthnicityDropDownValues, Ethnicity);
		// probandScreenerPage.probandsRaceClear.click();
		probandScreenerPage.probandsRaceDropDown.click();
		CucumberLogUtils.logScreenShot();
		List<WebElement> probandsRaceDropDownValues = probandScreenerPage.probandsRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(probandsRaceDropDownValues, Race);
		probandScreenerPage.biologicalMothersEthnicityDropDown.click();
		List<WebElement> biologicalMothersEthnicityDropDownValues = probandScreenerPage.biologicalMothersEthnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalMothersEthnicityDropDownValues,
				BiologicalMothersEthnicity);
		// probandScreenerPage.motherRaceClear.click();
		probandScreenerPage.biologicalMothersRaceDropDown.click();
		List<WebElement> biologicalMothersRaceDropDownValues = probandScreenerPage.biologicalMothersRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalMothersRaceDropDownValues, BiologicalMothersRace);
		probandScreenerPage.biologicalFathersEthnicityDropDown.click();
		List<WebElement> biologicalFathersEthnicityDropDownValues = probandScreenerPage.biologicalFathersEthnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalFathersEthnicityDropDownValues,
				BiologicalFathersEthnicity);
		// probandScreenerPage.fatherRaceClear.click();
		probandScreenerPage.biologicalFathersRaceDropDown.click();
		List<WebElement> biologicalFathersRaceDropDownValues = probandScreenerPage.biologicalFathersRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalFathersRaceDropDownValues, BiologicalFathersRace);
		CucumberLogUtils.logScreenShot();
		// scrolling into biologicalFathersRaceDropDown
		JavascriptUtils.scrollIntoView(probandScreenerPage.biologicalFathersRaceDropDown);
		MiscUtils.sleep(3000);
		probandScreenerPage.demographicSaveAndNextBtn.click();
		MiscUtils.sleep(3000);

	}

	@When("fills out all Contact Information with {string}, {string}, {string}, {string}, {string}")
	public void fills_out_all_Contact_Information_with(String PhoneNumber, String StreetAddress, String City,
			String State, String ZipCode) {
		probandScreenerPage.probandsPhoneNumber.clear();
		probandScreenerPage.probandsPhoneNumber.sendKeys(PhoneNumber);
		probandScreenerPage.probandsStAddress.clear();
		probandScreenerPage.probandsStAddress.sendKeys(StreetAddress);
		probandScreenerPage.probandsCity.clear();
		probandScreenerPage.probandsCity.sendKeys(City);
		probandScreenerPage.probandsState.clear();
		probandScreenerPage.probandsState.sendKeys(State);
		probandScreenerPage.probandsZipCode.clear();
		probandScreenerPage.probandsZipCode.sendKeys(ZipCode);
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(probandScreenerPage.contactInfoSaveAndNextBtn);
		CucumberLogUtils.logScreenShot();
	}

	@When("on the Personal Cancer History section selects {string} to a physician diagnosing the research participant with cancer")
	public void on_the_Personal_Cancer_History_section_selects_to_a_physician_diagnosing_the_research_participant_with_cancer(
			String yesOption) {
		probandScreenerPage.hasAPhysicianEverDiagnosedTheResearchParticipantWithCancer.click();
		List<WebElement> yesOrNoCancer = probandScreenerPage.hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerValues;
		CommonUtils.selectValueFromBootStrapDropDown(yesOrNoCancer, yesOption);
		MiscUtils.sleep(2000);

	}

	@When("adds Personal Cancer information {string}, {string}")
	public void adds_Personal_Cancer_information(String CancerType, String AgeResearchParticipantWasDiagnosed) {

		probandScreenerPage.newPersonalCancerInformationBtn.click();
		probandScreenerPage.cancerTypeOrSiteDropDown.click();
		List<WebElement> cancerTypeOrSite = probandScreenerPage.cancerTypeOrSiteDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(cancerTypeOrSite, CancerType);
		probandScreenerPage.howOldWasTheResearchParticipantWhenTheCancerWasDiagnosed
				.sendKeys(AgeResearchParticipantWasDiagnosed);
		MiscUtils.sleep(3000);
		probandScreenerPage.addNewEntrySaveBtn.click();
		probandScreenerPage.personalCancerHistorySaveAndNextBtn.click();

	}

	@When("on the Personal Genetic Tests sections selects {string} to being genetically tested for inherited cancer syndromes")
	public void on_the_Personal_Genetic_Tests_sections_selects_to_being_genetically_tested_for_inherited_cancer_syndromes(
			String yesOption) {
		probandScreenerPage.hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDown.click();
		List<WebElement> hasParticipantBeenGeneticallyTestedForInheritedCancerSyndromeValues = probandScreenerPage.hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(
				hasParticipantBeenGeneticallyTestedForInheritedCancerSyndromeValues, yesOption);

	}

	@When("adds Personal Genetic Tests information {string}, {string}")
	public void adds_Personal_Genetic_Tests_information(String TestedGenes, String TestResult) {
		probandScreenerPage.newPersonalGeneticTestBtn.click();
		MiscUtils.sleep(2000);
		probandScreenerPage.testGenesHereditaryCancerSyndromes.click();
		List<WebElement> testedGenesHereditaryCancerSyndrome = probandScreenerPage.testGenesHereditaryCancerSyndromesValues;
		CommonUtils.selectValueFromBootStrapDropDown(testedGenesHereditaryCancerSyndrome, TestedGenes);
		probandScreenerPage.testResults.click();
		List<WebElement> testedResultValues = probandScreenerPage.testResultsValues;
		CommonUtils.selectValueFromBootStrapDropDown(testedResultValues, TestResult);
		MiscUtils.sleep(3000);
		probandScreenerPage.testedGenesSaveBtn.click();
		CucumberLogUtils.logScreenShot();
		probandScreenerPage.personalGeneticTestsSaveAndNextBtn.click();
	}

	@When("on Family Members Cancer History selects {string} to having any biological relatives being diagnosed with cancer")
	public void on_Family_Members_Cancer_History_selects_to_having_any_biological_relatives_being_diagnosed_with_cancer(
			String yesOption) {
		probandScreenerPage.haveAnyBiologicalRelativesBeenDiagnosedWithCancer.click();
		List<WebElement> haveAnyBiologicalRelativesBeenDiagnosedWithCancer = probandScreenerPage.haveAnyBiologicalRelativesBeenDiagnosedWithCancerValues;
		CommonUtils.selectValueFromBootStrapDropDown(haveAnyBiologicalRelativesBeenDiagnosedWithCancer, yesOption);
	}

	@When("adds Family Cancer information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void adds_Family_Cancer_information(String FamilyCancerType, String RelationshipToParticipant,
			String NameOfHospital, String HospitalCountry, String HospitalCity, String HospitalState,
			String RelativesName, String RelativesDateOfBirth, String RelativesAgeWhenDiagnosed,
			String isRelativeAlive) {
//debug
		probandScreenerPage.newFamilyCancerInformation.click();
		probandScreenerPage.familyCancerTypeOrSite.click();// name drop down
		MiscUtils.sleep(2000);
		List<WebElement> familyCancerTypeOrSiteValues = probandScreenerPage.familyCancerTypeOrSiteValues;
		MiscUtils.sleep(2000);
		CommonUtils.selectValueFromBootStrapDropDown(familyCancerTypeOrSiteValues, FamilyCancerType);
		MiscUtils.sleep(1000);
		probandScreenerPage.relationshipToResearchParticipant.click();
		List<WebElement> relationshipToParticipant = probandScreenerPage.relationshipToResearchParticipantValues;
		CommonUtils.selectValueFromBootStrapDropDown(relationshipToParticipant, RelationshipToParticipant);
		probandScreenerPage.nameOfHospitalWhereDiagnosed.click();
		probandScreenerPage.nameOfHospitalWhereDiagnosed.sendKeys(NameOfHospital);
		probandScreenerPage.hospitalCountryDropDown.click();
		List<WebElement> hospitalCountry = probandScreenerPage.hospitalCountryDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(hospitalCountry, HospitalCountry);
		probandScreenerPage.hospitalCity.sendKeys(HospitalCity);
		probandScreenerPage.hospitalState.sendKeys(HospitalState);
		probandScreenerPage.relativesName.sendKeys(RelativesName);
		JavascriptUtils.selectDateByJS(probandScreenerPage.relativesDOB, RelativesDateOfBirth);
		probandScreenerPage.relativesAgeOfDiagonsis.sendKeys(RelativesAgeWhenDiagnosed);
		probandScreenerPage.isThisRelativeAliveDropDown.click();
		List<WebElement> isThisRelativeAlive = probandScreenerPage.isThisRelativeAliveDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(isThisRelativeAlive, isRelativeAlive);
		MiscUtils.sleep(3000);
		probandScreenerPage.newFamilyMemberInformationSaveBtn.click();
		probandScreenerPage.familyMembersCancerHistorySaveAndNext.click();

	}

	@When("on the Family Members Genetic Tests selects {string} to having any relatives being genetically tested for inherited cancer syndromes")
	public void on_the_Family_Members_Genetic_Tests_selects_to_having_any_relatives_being_genetically_tested_for_inherited_cancer_syndromes(
			String yesOption) {
		probandScreenerPage.haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDown.click();
		List<WebElement> haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromes = probandScreenerPage.haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromes,
				yesOption);
	}

	@When("adds Relatives with Genetic Tests information {string}, {string}, {string}, {string}")
	public void adds_Relatives_with_Genetic_Tests_information(String SecondRelativesName,
			String FamilyMemberGeneticTestsRelationshipToParticipant, String GenesSyndromesWithPositiveResults, String RelativesTestResult) {
		probandScreenerPage.newFamilyRelativeInformationBtn.click();
		probandScreenerPage.anotherRelativesName.sendKeys(SecondRelativesName);
		probandScreenerPage.anotherRelativesRelationshipToResearchParticipant.click();
		List<WebElement> relationshipToResearchParticipant = probandScreenerPage.anotherRelativesRelationshipToResearchParticipantValues;
		CommonUtils.selectValueFromBootStrapDropDown(relationshipToResearchParticipant, FamilyMemberGeneticTestsRelationshipToParticipant);
		probandScreenerPage.genesHereditaryCancerSyndromeWithPositiveResults.click();
		List<WebElement> genesHereditaryCancerSyndromeWithPositiveResults = probandScreenerPage.genesHereditaryCancerSyndromeWithPositiveResultsValues;
		CommonUtils.selectValueFromBootStrapDropDown(genesHereditaryCancerSyndromeWithPositiveResults,
				GenesSyndromesWithPositiveResults);
		probandScreenerPage.additionalFamilyMemberTestResultDropDown.click();
		List<WebElement> additionalFamilyMemberTestResults = probandScreenerPage.additionalFamilyMemberTestResultDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(additionalFamilyMemberTestResults, RelativesTestResult);
		MiscUtils.sleep(3000);
		probandScreenerPage.additionalFamilyMemberGeneticsSaveBtn.click();
		MiscUtils.sleep(3000);
		probandScreenerPage.familyMembersGeneticTestsSaveAndNextBtn.click();
	}

	@When("on the Final Information section selects the following information {string}, {string}, {string}, {string}")
	public void on_the_Final_Information_section_selects_the_following_information(String HowDidYouHearAboutStudy,
			String hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy,
			String AreRelativesReceivingCancerCare, String Comments) {
		probandScreenerPage.howDidyouHearAboutThisStudy.click();
		List<WebElement> howDidYouHearAboutThisStudy = probandScreenerPage.howDidyouHearAboutThisStudyValues;
		CommonUtils.selectValueFromBootStrapDropDown(howDidYouHearAboutThisStudy, HowDidYouHearAboutStudy);
		probandScreenerPage.hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudy.click();
		List<WebElement> hasTheParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudy = probandScreenerPage.hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyValues;
		CommonUtils.selectValueFromBootStrapDropDown(hasTheParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudy,
				hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy);
		probandScreenerPage.areAnyRelativesCurrentlyReceivingCancerCareOrFollowUp.click();
		List<WebElement> areAnyRelativesCurrentlyReceivingCancerCareOrFollowUp = probandScreenerPage.areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpValues;
		CommonUtils.selectValueFromBootStrapDropDown(areAnyRelativesCurrentlyReceivingCancerCareOrFollowUp,
				AreRelativesReceivingCancerCare);
		//probandScreenerPage.commentTxtBox.sendKeys(Comments);
		//probandScreenerPage.screenerSubmitBtn.click();
	}

	@When("Submits the Screener Questionnaire")
	public void submits_the_Screener_Questionnaire() {
	}

}
