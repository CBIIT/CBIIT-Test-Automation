package ServiceNow.CHARMS.Steps;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.When;

public class ProbandScreenerSubmissionSteps extends PageInitializer {

	@When("the probands selects on screener to submit a screener")
	public void the_probands_selects_on_screener_to_submit_a_screener() {
		clinicalGeneticsBranchPage.screenerBtn.click();
		MiscUtils.sleep(2000);
	}

	@When("selects {string} to filling questionnaire out for someone else")
	public void selects_to_filling_questionnaire_out_for_someone_else(String noOption) {
		JavascriptUtils.scrollIntoView(probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDown);
		probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDown.click();
		List<WebElement> values = probandScreenerPage.areYouFillingOutThisQuestionnaireForSomeoneElseDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(values, noOption);
		CucumberLogUtils.logScreenShot();
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
		probandScreenerPage.probandsRaceDropDown.click();
		CucumberLogUtils.logScreenShot();
		List<WebElement> probandsRaceDropDownValues = probandScreenerPage.probandsRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(probandsRaceDropDownValues, Race);
		probandScreenerPage.biologicalMothersEthnicityDropDown.click();
		List<WebElement> biologicalMothersEthnicityDropDownValues = probandScreenerPage.biologicalMothersEthnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalMothersEthnicityDropDownValues,
				BiologicalMothersEthnicity);
		probandScreenerPage.biologicalMothersRaceDropDown.click();
		List<WebElement> biologicalMothersRaceDropDownValues = probandScreenerPage.biologicalMothersRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalMothersRaceDropDownValues, BiologicalMothersRace);
		probandScreenerPage.biologicalFathersEthnicityDropDown.click();
		List<WebElement> biologicalFathersEthnicityDropDownValues = probandScreenerPage.biologicalFathersEthnicityDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalFathersEthnicityDropDownValues,
				BiologicalFathersEthnicity);
		probandScreenerPage.biologicalFathersRaceDropDown.click();
		List<WebElement> biologicalFathersRaceDropDownValues = probandScreenerPage.biologicalFathersRaceDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(biologicalFathersRaceDropDownValues, BiologicalFathersRace);
		CucumberLogUtils.logScreenShot();
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
		CucumberLogUtils.logScreenShot();
		probandScreenerPage.contactInfoSaveAndNextBtn.click();
	}

	@When("on the Personal Cancer History section selects {string} to a physician diagnosing the research participant with cancer")
	public void on_the_Personal_Cancer_History_section_selects_to_a_physician_diagnosing_the_research_participant_with_cancer(
			String yesOption) {
		probandScreenerPage.hasAPhysicianEverDiagnosedTheResearchParticipantWithCancer.click();
		List<WebElement> yesOrNoCancer = probandScreenerPage.hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerValues;
		CommonUtils.selectValueFromBootStrapDropDown(yesOrNoCancer, yesOption);

	}

	@When("adds Personal Cancer information {string}, {string}")
	public void adds_Personal_Cancer_information(String CancerType, String AgeResearchParticipantWasDiagnosed) {

		probandScreenerPage.newPersonalCancerInformationBtn.click();
		probandScreenerPage.cancerTypeOrSiteDropDown.click();
		List<WebElement> cancerTypeOrSite = probandScreenerPage.cancerTypeOrSiteDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(cancerTypeOrSite, CancerType);
		probandScreenerPage.howOldWasTheResearchParticipantWhenTheCancerWasDiagnosed
				.sendKeys(AgeResearchParticipantWasDiagnosed);
		probandScreenerPage.addNewEntrySaveBtn.click();
		probandScreenerPage.personalCancerHistorySaveAndNextBtn.click();

	}

	@When("on the Personal Genetic Tests sections selects {string} to being genetically tested for inherited cancer syndromes")
	public void on_the_Personal_Genetic_Tests_sections_selects_to_being_genetically_tested_for_inherited_cancer_syndromes(
			String yesOption) {
		probandScreenerPage.hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDown.click();
		List<WebElement> hasParticipantBeenGeneticallyTestedForInheritedCancerSyndromeValues = probandScreenerPage.hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues;
		CommonUtils.selectValueFromBootStrapDropDown(hasParticipantBeenGeneticallyTestedForInheritedCancerSyndromeValues, yesOption);
		

	}

	@When("adds Personal Genetic Tests information {string}, {string}")
	public void adds_Personal_Genetic_Tests_information(String TestedGenes, String TestResult) {
		probandScreenerPage.newPersonalGeneticTestBtn.click();
		probandScreenerPage.testGenesHereditaryCancerSyndromes.click();
		List<WebElement> testedGenesHereditaryCancerSyndrome = probandScreenerPage.testGenesHereditaryCancerSyndromesValues;
		CommonUtils.selectValueFromBootStrapDropDown(testedGenesHereditaryCancerSyndrome, TestedGenes);
		probandScreenerPage.testResults.click();
		List<WebElement>testedResultValues = probandScreenerPage.testResultsValues;
		CommonUtils.selectValueFromBootStrapDropDown(testedResultValues, TestResult);
		probandScreenerPage.testedGenesSaveBtn.click();
		CucumberLogUtils.logScreenShot();
		probandScreenerPage.personalGeneticTestsSaveAndNextBtn.click();
	}

	@When("on Family Members Cancer History selects {string} to having any biological relatives being diagnosed with cancer")
	public void on_Family_Members_Cancer_History_selects_to_having_any_biological_relatives_being_diagnosed_with_cancer(
			String yesOption) {
		probandScreenerPage.haveAnyBiologicalRelativesBeenDiagnosedWithCancer.click();
		List<WebElement>haveAnyBiologicalRelativesBeenDiagnosedWithCancer = probandScreenerPage.haveAnyBiologicalRelativesBeenDiagnosedWithCancerValues;
		CommonUtils.selectValueFromBootStrapDropDown(haveAnyBiologicalRelativesBeenDiagnosedWithCancer, yesOption);
		probandScreenerPage.newFamilyCancerInformation.click();
	}

	@When("adds Family Cancer information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void adds_Family_Cancer_information(String FamilyCancerType, String RelationshipToParticipant, String NameOfHospital,
			String HospitalCountry, String HospitalCity, String HospitalState, String RelativesName,
			String RelativesDateOfBirth, String RelativesAgeWhenDiagnosed, String isRelativeAlive) {
		probandScreenerPage.familyCancerTypeOrSite.click();
		List<WebElement> familyCancerTypeOrSiteValues = probandScreenerPage.familyCancerTypeOrSiteValues;
		CommonUtils.selectValueFromBootStrapDropDown(familyCancerTypeOrSiteValues, FamilyCancerType);
		probandScreenerPage.relationshipToResearchParticipant.click();
		List<WebElement> relationshipToParticipant = probandScreenerPage.relationshipToResearchParticipantValues;
		CommonUtils.selectValueFromBootStrapDropDown(relationshipToParticipant, RelationshipToParticipant);
	}

	@When("on the Family Members Genetic Tests selects {string} to having any relatives being genetically tested for inherited cancer syndromes")
	public void on_the_Family_Members_Genetic_Tests_selects_to_having_any_relatives_being_genetically_tested_for_inherited_cancer_syndromes(
			String yesOption) {
	}

	@When("adds Relatives with Genetic Tests information {string}, {string}, {string}, {string}")
	public void adds_Relatives_with_Genetic_Tests_information(String SecondRelativesName,
			String RelationshipToParticipant, String GenesSyndromesWithPositiveResults,
			String RelativesTestResult) {
	}

	@When("on the Final Information section selects the following information {string}, {string}, {string}, {string}")
	public void on_the_Final_Information_section_selects_the_following_information(String HowDidYouHearAboutStudy, String hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy,
			String areRelativesReceivingCancerCare, String comments) {
	}

	@When("Submits the Screener Questionnaire")
	public void submits_the_Screener_Questionnaire() {
	}

}
