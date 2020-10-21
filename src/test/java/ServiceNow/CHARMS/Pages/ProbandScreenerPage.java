package ServiceNow.CHARMS.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ProbandScreenerPage extends CommonUtils {

	/** Are you filling this questionnaire out for someone else? drop down */
	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	public WebElement areYouFillingOutThisQuestionnaireForSomeoneElseDropDown;

	/** Are you filling this questionnaire out for someone else? drop down */
	@FindBy(xpath = "/html/body/div[3]/ul/li")
	public List<WebElement> areYouFillingOutThisQuestionnaireForSomeoneElseDropDownValues;

	/** SAVE and NEXT button Study Introduction*/
	@FindBy(xpath = "//button[contains(text(),'SAVE & NEXT')]")
	public WebElement studyIntroductionSaveAndNextBtn;

	/** Biological Sex Drop Down */
	@FindBy(xpath = "//span[@id='select2-chosen-5']")
	public WebElement biologicalSex;

	/** Biological Sex Values */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> biologicalSexDropDownValues;

	/** Demographic Information Date of Birth*/
	@FindBy(xpath = "//input[@id='sp_formfield_birthday']")
	public WebElement dateOfBirth;

	/** Country of Birth Drop Down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_country_of_birth']")
	public WebElement countryOfBirth;

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
	public WebElement ethnicityDropDown;

	/** Demographic Ethnicity Drop Down Values */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> ethnicityDropDownValues;

	/** Proband's Race Drop Down */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_participate_race']")
	public WebElement probandsRaceDropDown;

	/** Proband's Race */
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
	@FindBy (xpath = "/html/body/div[1]/section/main/div[3]/div/sp-page-row[2]/div/div/span/div/div/div/div[2]/div[3]/div/div[2]/button[2]")
	public WebElement demographicSaveAndNextBtn;
	
	/**Contact Information Phone Number*/
	@FindBy (xpath = "//input[@id='sp_formfield_phone_number']")
	public WebElement probandsPhoneNumber;
	
	/**Contact Information Street Address*/
	@FindBy (xpath = "//input[@id='sp_formfield_street_address']")
	public WebElement probandsStAddress;
	
	/**Contact Information City*/
	@FindBy (xpath = "//input[@id='sp_formfield_city']")
	public WebElement probandsCity;
	
	/**Contact Information State*/
	@FindBy (xpath = "//input[@id='sp_formfield_state']")
	public WebElement probandsState;
	
	/**Contact Information Zip Code*/
	@FindBy (xpath = "//input[@id='sp_formfield_zip_code']")
	public WebElement probandsZipCode;
	
	/**Contact Information Save and Next Button*/
	@FindBy (xpath = "//button[@ng-click='saveNext(c.forms.LFS21)']")
	public WebElement contactInfoSaveAndNextBtn;
	
	/**Has a physician ever diagnosed the research participant with cancer?*/
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_diagnosed_with_cancer']")
	public WebElement hasAPhysicianEverDiagnosedTheResearchParticipantWithCancer;
	
	/**Has a physician ever diagnosed the research participant with cancer? Values*/
	@FindBy (xpath = "//li[@role='presentation']")
	public List<WebElement> hasAPhysicianEverDiagnosedTheResearchParticipantWithCancerValues;
	
	/**New Personal Cancer Information btn*/
	@FindBy (xpath = "//button[contains(text(), 'New Personal Cancer Information')]")
	public WebElement newPersonalCancerInformationBtn;
	
	/**Cancer Type or Site Drop Down*/
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_cancer_type']")
	public WebElement cancerTypeOrSiteDropDown;
	
	/**Cancer Type or Site Drop Down Values*/
	@FindBy (xpath = "//li[@role='presentation']")
	public List<WebElement> cancerTypeOrSiteDropDownValues;
	
	/**How old was the research participant when the cancer was diagnosed? Text Box*/
	@FindBy (xpath = "//input[@id='sp_formfield_age_in_years_at_diagnosis']")
	public WebElement howOldWasTheResearchParticipantWhenTheCancerWasDiagnosed;
	
	/**If unknown, please select an age range question*/
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_age_range']")
	public WebElement ifUknownPleaseSelectAgeRange;
	
	/**if unknown, please select an age range question values*/
	@FindBy (xpath = "//li[@role='presentation']")
	public List<WebElement> ifUnknownPleaseSelectAgeRangeValues;
	
	/**Add new entry save button*/
	@FindBy (xpath = "//button[@id='save']")
	public WebElement addNewEntrySaveBtn;
	
	/**Personal Cancer History Save and Next Button*/
	@FindBy (xpath = "/html/body/div[1]/section/main/div[3]/div/sp-page-row[2]/div/div/span/div/div/div/div[2]/div[5]/div[1]/div[2]/button[2]")
	public WebElement personalCancerHistorySaveAndNextBtn;
	
	/**Has research participant been genetically tested for inherited cancer syndromes? Drop Down*/
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_tested_inherited_cancer_syndromes']")
	public WebElement hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDown;
	
	/**Has research participant been genetically tested for inherited cancer syndromes? Drop Down Values*/
	@FindBy (xpath = "//li[@role='presentation']")
	public List<WebElement> hasResearchParticipantBeenGeneticallyTestedForInheritedCancerSyndromesDropDownValues;
	
	/**New Personal Genetic Test Button*/
	@FindBy (xpath = "//button[contains(text(), 'New Personal Genetic Test')]")
	public WebElement newPersonalGeneticTestBtn;
	
	/**TestedGenes/Hereditary Cancer Syndromes*/
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_tested_genes_syndromes']")
	public WebElement testGenesHereditaryCancerSyndromes;
	
	/**TestedGenes/Hereditary Cancer Syndromes Values*/
	@FindBy (xpath = "//li[@role='presentation']")
	public List<WebElement> testGenesHereditaryCancerSyndromesValues;
	
	/**Test Results*/
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_test_result']")
	public WebElement testResults;
	
	/**Test Results values*/
	@FindBy (xpath = "//li[@role='presentation']")
	public List<WebElement> testResultsValues;
	
	/**Test Genetics Save Button*/
	@FindBy (xpath = "/html/body/div[1]/section/main/div[3]/div/sp-page-row[2]/div/div/span/div/div/div/div[2]/div[6]/div[2]/div/div/div[4]/div/div/div[2]/div[3]/button[1]")
	public WebElement testedGenesSaveBtn;
	
	/**Personal Genetics Tests Save & Next Button*/
	@FindBy (xpath = "/html/body/div[1]/section/main/div[3]/div/sp-page-row[2]/div/div/span/div/div/div/div[2]/div[6]/div[1]/div[2]/button[2]")
	public WebElement personalGeneticTestsSaveAndNextBtn;
	
	/**Have any biological relatives been diagnosed with cancer? Drop Down*/
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_biological_relatives_diagnosed']")
	public WebElement haveAnyBiologicalRelativesBeenDiagnosedWithCancer;
	
	/**Have any biological relatives been diagnosed with cancer? Drop Down Values*/
	@FindBy (xpath = "//li[@role='presentation']")
	public List<WebElement> haveAnyBiologicalRelativesBeenDiagnosedWithCancerValues;
	
	/**New Family Cancer Information button*/
	@FindBy (xpath = "//button[contains(text(), 'New Family Cancer Information')]")
	public WebElement newFamilyCancerInformation;
	
	/** Cancer Type or site Drop down*/
	@FindBy (xpath = "/html/body/div[1]/section/main/div[3]/div/sp-page-row[2]/div/div/span/div/div/div/div[2]/div[7]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/sp-variable-layout/fieldset[1]/div[2]/div/div[1]/div/span/div")
	public WebElement familyCancerTypeOrSite;
	
	/** Cancer Type or site Drop down values*/
	@FindBy (xpath = "//li[@role='presentation']")
	public List<WebElement> familyCancerTypeOrSiteValues;
	
	/**Relationship To Research Participant drop down*/
	@FindBy (xpath = "/html/body/div[1]/section/main/div[3]/div/sp-page-row[2]/div/div/span/div/div/div/div[2]/div[7]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/sp-variable-layout/fieldset[1]/div[2]/div/div[1]/div/span/div")
	public WebElement relationshipToResearchParticipant;
	
	/**Relationship To Research Participant drop down values*/
	@FindBy (xpath = "/html/body/div[1]/section/main/div[3]/div/sp-page-row[2]/div/div/span/div/div/div/div[2]/div[7]/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/sp-variable-layout/fieldset[1]/div[2]/div/div[1]/div/span/div")
	public List<WebElement> relationshipToResearchParticipantValues;
	
	/**Name of Hospital Where Diagnosed*/
	@FindBy (xpath = "//input[@id='sp_formfield_relative_hosiptal_diagnosed']")
	public WebElement nameOfHospitalWhereDiagnosed;
	
	
	

	public ProbandScreenerPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
