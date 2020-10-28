package ServiceNow.CHARMS.Steps;

import com.nci.automation.utils.MiscUtils;
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
		MiscUtils.sleep(2000);
		clinicalGeneticsBranchPage.screenerBtn.click();
	}

	@When("selects {string} to filling questionnaire out for someone else")
	public void selects_to_filling_questionnaire_out_for_someone_else(String value) {
		probandScreenerSubmissionImpl.areYouFillingThisQuestionnaireOutForSomeoneElse(value);
		probandScreenerPage.studyIntroductionSaveAndNextBtn.click();
	}

	@When("fills out all Demographic Information {string}, {string}, {string},{string}, {string} {string}, {string}, {string}, {string}, {string}, {string}")
	public void fills_out_all_Demographic_Information(String BiologicalSex, String DOB, String CountryOfBirth,
			String City, String State, String Ethnicity, String Race, String BiologicalMothersEthnicity,
			String BiologicalMothersRace, String BiologicalFathersEthnicity, String BiologicalFathersRace) {
		probandScreenerSubmissionImpl.fillingOutDemographicInformation(BiologicalSex, DOB, CountryOfBirth, City, State,
				Ethnicity, Race, BiologicalMothersEthnicity, BiologicalMothersRace, BiologicalFathersEthnicity,
				BiologicalFathersRace);
		MiscUtils.sleep(1000);
		probandScreenerPage.demographicSaveAndNextBtn.click();
	}

	@When("fills out all Contact Information with {string}, {string}, {string}, {string}, {string}")
	public void fills_out_all_Contact_Information_with(String PhoneNumber, String StreetAddress, String City,
			String State, String ZipCode) {
		MiscUtils.sleep(1000);
		probandScreenerSubmissionImpl.fillingOutProbandsContactInformation(PhoneNumber, StreetAddress, City, State,
				ZipCode);
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(probandScreenerPage.contactInfoSaveAndNextBtn);
	}

	@When("on the Personal Cancer History section selects {string} to a physician diagnosing the research participant with cancer")
	public void on_the_Personal_Cancer_History_section_selects_to_a_physician_diagnosing_the_research_participant_with_cancer(
			String yesOrNoOption) {
		MiscUtils.sleep(1000);
		probandScreenerSubmissionImpl.hasAphysicianEverDiagnosedTheResearchParticipantWithCancer(yesOrNoOption);
	}

	@When("adds Personal Cancer information {string}, {string}")
	public void adds_Personal_Cancer_information(String CancerType, String AgeResearchParticipantWasDiagnosed) {
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(probandScreenerPage.newPersonalCancerInformationBtn);
		probandScreenerSubmissionImpl.addingNewPersonalCancerInformation(CancerType,
				AgeResearchParticipantWasDiagnosed);
		JavascriptUtils.clickByJS(probandScreenerPage.personalCancerHistorySaveAndNextBtn);
	}

	@When("on the Personal Genetic Tests sections selects {string} to being genetically tested for inherited cancer syndromes")
	public void on_the_Personal_Genetic_Tests_sections_selects_to_being_genetically_tested_for_inherited_cancer_syndromes(
			String yesOption) {
		MiscUtils.sleep(2000);
		probandScreenerSubmissionImpl.hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromes(yesOption);
	}

	@When("adds Personal Genetic Tests information {string}, {string}")
	public void adds_Personal_Genetic_Tests_information(String TestedGenes, String TestResult) {
		MiscUtils.sleep(1000);
		probandScreenerPage.newPersonalGeneticTestBtn.click();
		probandScreenerSubmissionImpl.addNewPersonalGeneticTestsEntry(TestedGenes, TestResult);
		probandScreenerPage.personalGeneticTestsSaveAndNextBtn.click();
	}

	@When("on Family Members Cancer History selects {string} to having any biological relatives being diagnosed with cancer")
	public void on_Family_Members_Cancer_History_selects_to_having_any_biological_relatives_being_diagnosed_with_cancer(
			String value) {
		MiscUtils.sleep(1000);
		probandScreenerSubmissionImpl.haveAnyBiologicalRelativesBeenDiagnosedWithCancer(value);
	}

	@When("adds Family Cancer information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void adds_Family_Cancer_information(String FamilyCancerType, String RelationshipToParticipant,
			String NameOfHospital, String HospitalCountry, String HospitalCity, String HospitalState,
			String RelativesName, String RelativesDateOfBirth, String RelativesAgeWhenDiagnosed,
			String isRelativeAlive) {
		MiscUtils.sleep(500);
		JavascriptUtils.clickByJS(probandScreenerPage.newFamilyCancerInformation);
		probandScreenerSubmissionImpl.addNewFamilyCancerInformation(FamilyCancerType, RelationshipToParticipant,
				NameOfHospital, HospitalCountry, HospitalCity, HospitalState, RelativesName, RelativesDateOfBirth,
				RelativesAgeWhenDiagnosed, isRelativeAlive);
		probandScreenerPage.familyMembersCancerHistorySaveAndNext.click();
	}

	@When("on the Family Members Genetic Tests selects {string} to having any relatives being genetically tested for inherited cancer syndromes")
	public void on_the_Family_Members_Genetic_Tests_selects_to_having_any_relatives_being_genetically_tested_for_inherited_cancer_syndromes(
			String value) {
		MiscUtils.sleep(1000);
		probandScreenerSubmissionImpl.haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromes(value);
	}

	@When("adds Relatives with Genetic Tests information {string}, {string}, {string}, {string}")
	public void adds_Relatives_with_Genetic_Tests_information(String SecondRelativesName,
			String FamilyMemberGeneticTestsRelationshipToParticipant, String GenesSyndromesWithPositiveResults,
			String RelativesTestResult) {
		MiscUtils.sleep(500);
		probandScreenerPage.newFamilyRelativeInformationBtn.click();
		probandScreenerSubmissionImpl.addingNewFamilyRelativeInformation(SecondRelativesName,
				FamilyMemberGeneticTestsRelationshipToParticipant, GenesSyndromesWithPositiveResults,
				RelativesTestResult);
		probandScreenerPage.familyMembersGeneticTestsSaveAndNextBtn.click();
	}

	@When("on the Final Information section selects the following information {string}, {string}, {string}, {string}")
	public void on_the_Final_Information_section_selects_the_following_information(String HowDidYouHearAboutStudy,
			String hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy,
			String AreRelativesReceivingCancerCare, String Comments) {
		MiscUtils.sleep(1000);
		probandScreenerSubmissionImpl
				.fillingOutFinalInformationWithoutSelectingOtherAndSelectingNoToReceivingCancerFollowUp(
						HowDidYouHearAboutStudy, hasResearchParticipantOrFamilyMemberParticipatedInAnyLFSStudy,
						AreRelativesReceivingCancerCare, Comments);
	}

	@When("Submits the Screener Questionnaire")
	public void submits_the_Screener_Questionnaire() {
		probandScreenerSubmissionImpl.submitTheScreener();
		
	}

}
