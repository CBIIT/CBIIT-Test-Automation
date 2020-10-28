package ServiceNow.CHARMS.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ProbandScreenerPage extends CommonUtils {

	/** --------------- STUDY INTRODUCTION SECTION --------------- */
	
	/** Are you filling this questionnaire out for someone else? drop down */
	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	public WebElement areYouFillingOutThisQuestionnaireForSomeoneElseDropDown;

	/** Are you filling this questionnaire out for someone else? drop down values */
	@FindBy(xpath = "/html/body/div[3]/ul/li")
	public List<WebElement> areYouFillingOutThisQuestionnaireForSomeoneElseDropDownValues;

	/** SAVE and NEXT button Study Introduction */
	@FindBy(xpath = "//button[contains(text(),'SAVE & NEXT')]")
	public WebElement studyIntroductionSaveAndNextBtn;

	/** DEMOGRAPHIC INFORMATION SECTION */
	/** Biological Sex drop down */
	@FindBy(xpath = "(//span[@class='select2-chosen'])[3]")
	public WebElement biologicalSexDropDown;

	/** Biological Sex drop down values */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> biologicalSexDropDownValues;

	/** Demographic Information Date of Birth */
	@FindBy(xpath = "//input[@id='sp_formfield_birthday']")
	public WebElement dateOfBirth;

	/** Country of Birth Drop Down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_country_of_birth']")
	public WebElement countryOfBirthDropDown;

	/** Country of Birth Drop Down Values */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> countryOfBirthDropDownValues;

	/** Demographic City Text Box */
	@FindBy(xpath = "//input[@name='birth_city']")
	public WebElement birthCity;

	/** Demographic State Text Box */
	@FindBy(xpath = "//input[@name='birth_state']")
	public WebElement birthState;

	/** Demographic Ethnicity Drop Down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_race_ethnicity']")
	public WebElement probandsEthnicityDropDown;

	/** Demographic Ethnicity Drop Down Values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> ethnicityDropDownValues;

	/** Proband's Race Drop Down */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_participate_race']")
	public WebElement probandsRaceDropDown;

	/** Proband's Race drop down values */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> probandsRaceDropDownValues;

	/** Biological Mother's Ethnicity Drop Down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_biological_mother_s_ethnicity']")
	public WebElement biologicalMothersEthnicityDropDown;

	/** Biological Mother's Ethnicity Drop Down Values */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> biologicalMothersEthnicityDropDownValues;

	/** Biological Mother's Race Drop Down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_biological_mother_s_race']")
	public WebElement biologicalMothersRaceDropDown;

	/** Biological Mother's Race Drop Down Values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> biologicalMothersRaceDropDownValues;

	/** Biological Father's Ethnicity Drop Down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_biological_father_s_ethnicity']")
	public WebElement biologicalFathersEthnicityDropDown;

	/** Biological Father's Ethnicity Drop Down Values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> biologicalFathersEthnicityDropDownValues;

	/** Biological Father's Race Drop Down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_biological_father_s_race']")
	public WebElement biologicalFathersRaceDropDown;

	/** Biological Father's Race Drop Down Values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> biologicalFathersRaceDropDownValues;

	/** Demographic Information Save and Next Button */
	@FindBy(xpath = "//div[@class='form-section']/button[@ng-click='saveNext(c.forms.LFS2)']")
	public WebElement demographicSaveAndNextBtn;

	/** --------------- END OF STUDY INTRODUCTION SECTION --------------- */
	
	
	/** --------------- CONTACT INFORMATION SECTION --------------- */

	/** Contact Information Phone Number */
	@FindBy(xpath = "//input[@id='sp_formfield_phone_number']")
	public WebElement probandsPhoneNumber;

	/** Contact Information Street Address */
	@FindBy(xpath = "//input[@id='sp_formfield_street_address']")
	public WebElement probandsStAddress;

	/** Contact Information City */
	@FindBy(xpath = "//input[@id='sp_formfield_city']")
	public WebElement probandsCity;

	/** Contact Information State */
	@FindBy(xpath = "//input[@id='sp_formfield_state']")
	public WebElement probandsState;

	/** Contact Information Zip Code */
	@FindBy(xpath = "//input[@id='sp_formfield_zip_code']")
	public WebElement probandsZipCode;

	/** Contact Information Save and Next Button */
	@FindBy(xpath = "//div[@class='form-section']/button[@ng-click='saveNext(c.forms.LFS21)']")
	public WebElement contactInfoSaveAndNextBtn;

	/** --------------- END OF CONTACT INFORMATION SECTION --------------- */
	
	
	/** --------------- PERSONAL CANCER HISTORY SECTION --------------- */

	/**
	 * Has a physician ever diagnosed the research participant with cancer? drop
	 * down
	 */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_diagnosed_with_cancer']")
	public WebElement hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerDropDown;

	/**
	 * Has a physician ever diagnosed the research participant with cancer? drop
	 * down values
	 */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerValues;

	/** New Personal Cancer Information button */
	@FindBy(xpath = "//button[contains(text(), 'New Personal Cancer Information')]")
	public WebElement newPersonalCancerInformationBtn;

	/** Cancer Type or Site Drop Down */
	@FindBy(xpath = "(//div[@id='s2id_sp_formfield_cancer_type']/a/span)[1]")
	public WebElement cancerTypeOrSiteDropDown;

	/** Cancer Type or Site Drop Down Values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> cancerTypeOrSiteDropDownValues;
	
	/**
	 * How old was the research participant when the cancer was diagnosed? Text Box
	 */
	@FindBy(xpath = "//input[@id='sp_formfield_age_in_years_at_diagnosis']")
	public WebElement howOldWasTheResearchParticipantWhenTheCancerWasDiagnosed;

	/** If unknown, please select an age range question drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_age_range']")
	public WebElement ifUknownPleaseSelectAgeRangeDropDown;

	/** if unknown, please select an age range question drop down values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> ifUnknownPleaseSelectAgeRangeDropDownValues;

	/** Add new entry save button */
	@FindBy(xpath = "//button[@id='save']")
	public WebElement addNewEntrySaveBtn;

	/** Personal Cancer History Save and Next Button */
	@FindBy(xpath = "//div[@class='form-section']/button[@ng-click='saveNext(c.forms.LFS3)']")
	public WebElement personalCancerHistorySaveAndNextBtn;

	/** --------------- END OF PERSONAL CANCER HISTORY SECTION --------------- */
	
	
	/** --------------- PERSONAL GENETIC TESTS --------------- */

	/**
	 * Has research participant been genetically tested for inherited cancer
	 * syndromes? Drop Down
	 */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_tested_inherited_cancer_syndromes']")
	public WebElement hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDown;

	/**
	 * Has research participant been genetically tested for inherited cancer
	 * syndromes? Drop Down Values
	 */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues;

	/** New Personal Genetic Test Button */
	@FindBy(xpath = "//button[contains(text(), 'New Personal Genetic Test')]")
	public WebElement newPersonalGeneticTestBtn;

	/** TestedGenes/Hereditary Cancer Syndromes drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_tested_genes_syndromes']")
	public WebElement testGenesHereditaryCancerSyndromesDropDown;

	/** TestedGenes/Hereditary Cancer Syndromes drop down values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> testGenesHereditaryCancerSyndromesValues;

	/** Test Results drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_test_result']")
	public WebElement testResults;

	/** Test Results drop down values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> testResultsDropDownValues;

	/** Test Genetics Save Button */
	@FindBy(xpath = "//div[@class='form-section']/button[@id='saveTest']")
	public WebElement testedGenesSaveBtn;

	/** Personal Genetics Tests Save & Next Button */
	@FindBy(xpath = "//div[@class='form-section']/button[@ng-click='saveNext(c.forms.LFS31)']")
	public WebElement personalGeneticTestsSaveAndNextBtn;

	/** --------------- END OF PERSONAL GENETIC TESTS --------------- */
	
	/** --------------- FAMILY MEMBERS' CANCER HISTORY SECTION --------------- */
	
	
	/** Have any biological relatives been diagnosed with cancer? Drop Down */
	@FindBy(xpath = "(//div[@id='s2id_sp_formfield_biological_relatives_diagnosed']/a/span)[1]")
	public WebElement haveAnyBiologicalRelativesBeenDiagnosedWithCancerDropDown;

	/**
	 * Have any biological relatives been diagnosed with cancer? Drop Down Values
	 */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> haveAnyBiologicalRelativesBeenDiagnosedWithCancerValues;

	/** New Family Cancer Information button */
	@FindBy(xpath = "//button[contains(text(), 'New Family Cancer Information')]")
	public WebElement newFamilyCancerInformation;

	/** Cancer Type or site Drop down */
	@FindBy(xpath = "/html/body/div[1]/section/main/div[2]/div/sp-page-row[2]/div/div/span/div/div/div/div[2]/div[7]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/sp-variable-layout/fieldset[1]/div[2]/div/div[1]/div/span/div/a/span[1]")
	public WebElement familyCancerTypeOrSiteDropDown;

	/** Cancer Type or site Drop down values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> familyCancerTypeOrSiteDropDownValues;

	/** Relationship To Research Participant drop down */
	@FindBy(xpath = "(//*[@id='s2id_sp_formfield_relationship']/a/span)[3]")
	public WebElement relationshipToResearchParticipantDropDown;

	/** Relationship To Research Participant drop down values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> relationshipToResearchParticipantValues;

	/** Name of Hospital Where Diagnosed text box */
	@FindBy(xpath = "//input[@id='sp_formfield_relative_hosiptal_diagnosed']")
	public WebElement nameOfHospitalWhereDiagnosed;

	/** Hospital Country Drop Down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_relative_hospital_country']")
	public WebElement hospitalCountryDropDown;

	/** Hospital Country Drop Down Values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> hospitalCountryDropDownValues;

	/** Hospital City text box */
	@FindBy(xpath = "//input[@id='sp_formfield_relative_hospital_city']")
	public WebElement hospitalCity;

	/** Hospital State text box */
	@FindBy(xpath = "//input[@id='sp_formfield_relative_hospital_state']")
	public WebElement hospitalState;

	/** Relative's Name text box */
	@FindBy(xpath = "/html/body/div[1]/section/main/div[2]/div/sp-page-row[2]/div/div/span/div/div/div/div[2]/div[7]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/sp-variable-layout/fieldset[3]/div/div[1]/div/div/span/span[2]/input")
	public WebElement relativesName;

	/** Relative's Date of Birth */
	@FindBy(xpath = "//input[@id='sp_formfield_date_of_birth']")
	public WebElement relativesDOB;

	/** Relative's Age (in Years) when they were diagnosed text box */
	@FindBy(xpath = "//input[@id='sp_formfield_age_at_diagnosis']")
	public WebElement relativesAgeOfDiagonsis;

	/** Is Relative Alive? Drop Down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_is_this_relative_alive']")
	public WebElement isThisRelativeAliveDropDown;

	/** Is Relative Alive? Drop Down Values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> isThisRelativeAliveDropDownValues;

	/** Family Members Cancer History Save Button */
	@FindBy(xpath = "//button[@id='saveCancer']")
	public WebElement newFamilyMemberInformationSaveBtn;

	/** Family Member Cancer's History Save & Next Button */
	@FindBy(xpath = "//div[@class='form-section']/button[@ng-click='saveNext(c.forms.LFS4)']")
	public WebElement familyMembersCancerHistorySaveAndNext;

	/** --------------- END OF FAMILY MEMBERS' CANCER HISTORY SECTION --------------- */
	
	/** --------------- FAMILY MEMBERS' GENETIC TESTS SECTION --------------- */
	/**
	 * Have any relatives been genetically tested for inherited cancer syndromes?
	 * Drop Down
	 */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_relatives_had_genetic_testing']")
	public WebElement haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDown;

	/**
	 * Have any relatives been genetically tested for inherited cancer syndromes?
	 * Drop Down Values
	 */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> haveAnyRelativesBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues;

	/** New Family Relative Information button */
	@FindBy(xpath = "//button[contains(text(),'New Family Relative Information')]")
	public WebElement newFamilyRelativeInformationBtn;

	/** Another Relative's Name text box */
	@FindBy(xpath = "//input[@id='sp_formfield_relative_name']")
	public WebElement anotherRelativesName;


	/** Relationship to research participant drop down */
	@FindBy(xpath = "(//*[@id='s2id_sp_formfield_relationship']/a/span)[5]")
	public WebElement anotherRelativesRelationshipToResearchParticipantDropDown;


	/** Relationship to research participant drop down values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> anotherRelativesRelationshipToResearchParticipantValues;

	/** Genes/Hereditary Cancer Syndromes With Positive Results drop down */
	@FindBy(xpath = "(//div[@id='s2id_sp_formfield_genes_hereditary_cancer_syndromes']/a/span)[1]")
	public WebElement genesHereditaryCancerSyndromeWithPositiveResultsDropDown;

	/**
	 * Genes/Hereditary Cancer Syndromes With Positive Results Values drop down
	 * values
	 */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> genesHereditaryCancerSyndromeWithPositiveResultsDropDownValues;

	/** Test Results for additional family member drop down */
	@FindBy(xpath = "(//div[@id='s2id_sp_formfield_relative_test_result']/a/span)[1]")
	public WebElement additionalFamilyMemberTestResultDropDown;

	/** Test Results for additional family member drop down Values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> additionalFamilyMemberTestResultDropDownValues;

	/** Save button for the family member genetics */
	@FindBy(xpath = "//*[@id='saveButton']")
	public WebElement additionalFamilyMemberGeneticsSaveBtn;

	/** Family Members' Genetic Tests Save and Next Button */
	@FindBy(xpath = "//div[@class='form-section']/button[@ng-click='saveNext(c.forms.LFS41)']")
	public WebElement familyMembersGeneticTestsSaveAndNextBtn;
	
	/** --------------- END OF FAMILY MEMBERS' GENETIC TESTS SECTION --------------- */

	/** --------------- FINAL INFORMATION SECTION --------------- */
	
	/** How did you hear about this study? drop down */
	@FindBy(xpath = "(//div[@id='s2id_sp_formfield_hear_about_this_study']/a/span)[1]")
	public WebElement howDidyouHearAboutThisStudyDropDown;

	/** How did you hear about this study? drop down values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> howDidyouHearAboutThisStudyDropDownValues;

	/**
	 * Has the research participant or any family member participated in any LFS
	 * study? drop down
	 */
	@FindBy(xpath = "(//div[@id='s2id_sp_formfield_participated_through_another_institution']/a/span)[1]")
	public WebElement hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyDropDown;

	/**
	 * Has the research participant or any family member participated in any LFS
	 * study? drop down Values
	 */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> hasTheResearchParticipantOrAnyFamilyMemberParticipatedInAnyLFSStudyDropDownValues;

	/** Are any relatives currently receiving cancer care or follow-up? drop down */
	@FindBy(xpath = "(//div[@id='s2id_sp_formfield_received_cancer_care']/a/span)[1]")
	public WebElement areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpDropDown;

	/**
	 * Are any relatives currently receiving cancer care or follow-up? drop down
	 * values
	 */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> areAnyRelativesCurrentlyReceivingCancerCareOrFollowUpDropDownValues;

	/** Comments area on Final Information Section */
	@FindBy(xpath = "//textarea[@id='sp_formfield_comments']")
	public WebElement commentTxtBox;

	/** Final Information Submit Button */
	@FindBy(xpath = "//button[contains(text(),'SUBMIT')]")
	public WebElement screenerSubmitBtn;

	/** Confirms your intent to submit screener form */
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement confirmScreenerSubmissionBtn;
	
	/** --------------- END OF FINAL INFORMATION SECTION --------------- */

	public ProbandScreenerPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
