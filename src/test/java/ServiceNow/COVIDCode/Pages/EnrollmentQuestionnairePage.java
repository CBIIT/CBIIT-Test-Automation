package ServiceNow.COVIDCode.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;


public class EnrollmentQuestionnairePage extends CommonUtils {

	/**
	 * --------------- BEGINNING OF COVIDcode ENROLLMENT QUESTIONNAIRE GENERALS ---------------
	 * 
	 */

	/** COVIDcode Enrollment Questionnaire Header */
	@FindBy(xpath = "//h1[text()=' COVIDcode Enrollment Questionnaire ']")
	public WebElement COVIDcodeEnrollmentQuestionnaireHeader;

	/** COVIDcode Enrollment Questionnaire: Home Button */
	@FindBy(xpath = "//*[contains(text(), 'Home')]")
	public WebElement COVIDcodeHomeButton;

	/**
	 * COVIDcode Enrollment Questionnaire: Please fill out each data
	 * element..Paragraph
	 */
	@FindBy(xpath = "//p[contains(text(),'please contact the study team')]")
	public WebElement enrollmentQuestionnaireParagraph;

	/** COVIDcode Enrollment Questionnaire: NIH Medical Record Number Text Box */
	@FindBy(id = "sp_formfield_nih_medical_record_number")
	public WebElement enrollmentQuestionnaireNIHMedicalRecordNumberTextBox;

	/** COVIDcode Enrollment Questionnaire: Anonymized Patient ID Text box */
	@FindBy(xpath = "//*[@id='sp_formfield_anonymized_patient_id']")
	public WebElement enrollmentQuestionnaireAnonymizedPatiendIDTextBox;

	/** COVIDcode Enrollment Questionnaire: User Group ID dropdown */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_user_group_id']")
	public WebElement enrollmentQuestionnaireUserGroupIdDropdown;

	/** COVIDcode Enrollment Questionnaire: User Group ID dropdown values */
	@FindBy(xpath = "//select[@id='user-group-id']/option")
	public List<WebElement> enrollmentQuestionnaireUserGroupIDdropDownValues;

	/** COVIDcode Enrollment Questionnaire: Consent dropdown */
	@FindBy(xpath = "//*[@id='s2id_sp_formfield_verbal_consent']/a")
	public WebElement enrollmentQuestionnaireConsentDropdown;

	/** COVIDcode Enrollment Questionnaire: Consent drop down values in a List */
	@FindBy(xpath = "/html/body/div[9]/ul/li")
	public List<WebElement> enrollmentQuestionaireConsentDropDownValues;

	/** COVIDcode Enrollment Questionnaire Confirm submission pop up: YES button */
	@FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[2]")
	public WebElement enrollmentQuestionnaireConfirmSubmissionYesButton;

	/** COVIDcode Confirm Submission Pop Up Text */
	@FindBy(xpath = "//p[contains(text(), 'Are you sure you want to submit')]")
	public WebElement enrollmentQuestionnaireConfirmSubmissionPopUpText;

	/** COVIDcode Enrollment Questionnaire Save button */
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement enrollmentQuestionnaireSaveButton;

	/** COVIDcode Enrollment Questionnaire Submit button */
	@FindBy(xpath = "//*[contains(text(), 'Submit for Review')]")
	public WebElement enrollmentQuestionnaireSubmitButton;
	
	/** COVIDcode Enrollment Questionnaire Submit Yes button */
	@FindBy(xpath = "//button[@ng-click='buttonClicked(button)'][2]")
	public WebElement enrollmentQuestionnaireSubmitYesButton;
	
	/** COVIDcode Enrollment Questionnaire Hospital Name text */
	@FindBy(xpath = "//div[@id='host_hospital_city_code']/div/label")
	public WebElement enrollmentQuestionnaireHospitalNameText;

	/**
	 * ---------- THE END OF COVIDcode ENROLLMENT QUESTIONNAIRE GENERALS --------
	 */

	
	/**
	 * --------- BEGINNING OF COVIDcode ENROLLMENT QUESTIONNAIRE CONTACT INFO SECTION ---------
	 */

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient LAST NAME text
	 * 
	 * box
	 */
	@FindBy(id = "sp_formfield_last_name")
	public WebElement enrollmentQuestionnairePatientLastNameTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient FIRST NAME text box
	 */
	@FindBy(id = "sp_formfield_first_name")
	public WebElement enrollmentQuestionnairePatientFirstNameTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient MIDDLE NAME text box
	 */
	@FindBy(id = "sp_formfield_middle_initial")
	public WebElement enrollmentQuestionnairePatientMiddletNameTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient EMAIL ADDRESS text
	 * box
	 */
	@FindBy(id = "sp_formfield_contact_email")
	public WebElement enrollmentQuestionnairePatientEmailAddressTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient PHONE NUMBER text
	 * box
	 */
	@FindBy(id = "sp_formfield_contact_phone_number")
	public WebElement enrollmentQuestionnairePatientPhoneNumberTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient STREET ADDRESS 1
	 * text box
	 */
	@FindBy(id = "sp_formfield_street_address_1")
	public WebElement enrollmentQuestionnairePatientStreetAddress1TextBox;

	/** COVIDcode Enrollment Questionnaire Contact info: patient CITY text box */
	@FindBy(id = "sp_formfield_city")
	public WebElement enrollmentQuestionnairePatientCityTextBox;

	/** COVIDcode Enrollment Questionnaire Contact info: patient STATE text box */
	@FindBy(id = "sp_formfield_us_state")
	public WebElement enrollmentQuestionnairePatientStateTextBox;

	/**
	 * COVIDcode Enrollment Questionnaire Contact info: patient ZIP CODE text box
	 */
	@FindBy(id = "sp_formfield_zip_code")
	public WebElement enrollmentQuestionnairePatientZipCodeTextBox;

	/**
	 * ---- THE END OF COVIDcode ENROLLMENT QUESTIONNAIRE CONTACT INFO SECTION -----*/

	
	/**
	 * ------- BEGINNING OF COVIDcode ENROLLMENT QUESTIONNAIRE DEMOGRAPHICS SECTION ------*/

	/** COVIDcode Enrollment Questionnaire demographics tab */
	@FindBy(xpath = "//a[contains(text(), 'Demographics')]")
	public WebElement demographicsTab;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: Date form completed calendar
	 * field
	 */
	@FindBy(xpath = "//input[@id='sp_formfield_form_complete_date']")
	public WebElement enrollmentQuestionnaireDateFormCompletedBox;
	
	/** COVIDcode Enrollment Questionnaire Demographics: Date form completed Selected date cannot be in the future text */
	@FindBy(xpath = "(//div[@ng-show='field.messages']/div)[1]")
	public WebElement enrollmentQuestionnaireDateFormSelectedDateCannotBeInTheFutureText;

	/** COVIDcode Enrollment Questionnaire Demographics: current weight dropdown */
	@FindBy(xpath = "//div[@id = 's2id_sp_formfield_weight_choice']/a")
	public WebElement enrollmentQuestionnaireCurrentWeightDropdown;
	
	/** COVIDcode Enrollment Questionnaire Demographics: current weight search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_weight_choice']")
	public WebElement enrollmentQuestionnaireCurrentWeightSearchBox;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: what is your current weight
	 * drop down values
	 */
	@FindBy(xpath ="//div[@class='select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireCurrentWeightDropdownValues;

	/** COVIDcode Enrollment Questionnaire Demographics: Weight Text Box */
	@FindBy(xpath = "//input[@id='sp_formfield_weight_pounds']")
	public WebElement enrollmentQuestionnaireWeightTextBox;

	/** COVIDcode Enrollment Questionnaire Demographics: DOB calendar */
	@FindBy(xpath = "//input[@id='sp_formfield_date_of_birth']")
	public WebElement enrollmentQuestionnaireDOBbox;
	
	/** COVIDcode Enrollment Questionnaire Demographics: DOB calendar Selected date cannot be in the future text */
	@FindBy(xpath = "(//div[@ng-show='field.messages']/div)[2]")
	public WebElement enrollmentQuestionnaireDOBSelectedDateCannotBeInTheFutureText;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: describe your race drop down
	 */
	@FindBy(xpath = "//div[@id = 's2id_sp_formfield_ancestry']/a")
	public WebElement enrollmentQuestionnaireRaceDropdown;
	
	/** COVIDcode Enrollment Questionnaire Demographics:  describe your race search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_ancestry']")
	public WebElement enrollmentQuestionnaireRaceSearchBox;
	
	/** COVIDcode Enrollment Questionnaire Demographics: Race dropdown values */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireRaceDropdownValues;
	
	/**
	 * COVIDcode Enrollment Questionnaire Demographics:when were you officially
	 * diagnosed with COVID-19?
	 */
	@FindBy(xpath = "//input[@id='sp_formfield_date_official_diagnosis']")
	public WebElement enrollmentQuestionnaireWhenOfficiallyDiagnosed;

	/** COVIDcode Enrollment Questionnaire Demographics: biological sex drop down */
	@FindBy(xpath = "//div[@id = 's2id_sp_formfield_sex']/a")
	public WebElement enrollmentQuestionnaireBiologicalSexDropdown;
	
	/** COVIDcode Enrollment Questionnaire Demographics: biological search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_sex']")
	public WebElement enrollmentQuestionnaireBiologicalSexSearchBox;
	
	/**  
	 * COVIDcode Enrollment Questionnaire Demographics: biological sex dropdown
	 * values
	 */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireBiologicalSexDropDownValues;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: are you hispanic or latino
	 * drop down
	 */
	@FindBy(xpath = "//div[@id = 's2id_sp_formfield_are_you_hispanic_or_latino']/a")
	public WebElement enrollmentQuestionnaireHispanicOrLatinoDropdown;
	
	/** COVIDcode Enrollment Questionnaire Demographics: are you hispanic or latino search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_are_you_hispanic_or_latino']")
	public WebElement enrollmentQuestionnaireHispanicOrLatinoSearchBox;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: are you hispanic or latino
	 * dropdown values
	 */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireHispanicOrLatinoDropdownValues;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: what is your current height
	 * drop down
	 */
	@FindBy(xpath = "//div[@id = 's2id_sp_formfield_height_choice']/a")
	public WebElement enrollmentQuestionnaireCurrentHeightDropdown;
	
	/** COVIDcode Enrollment Questionnaire Demographics: current height search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_height_choice']")
	public WebElement enrollmentQuestionnaireCurrentHeightSearchBox;

	/**
	 * COVIDcode Enrollment Questionnaire Demographics: what is your current height
	 * dropdown values
	 */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireCurrentHeightDropdownValues;

	/** COVIDcode Enrollment Questionnaire Demographics: feet text box */
	@FindBy(xpath = "//input[@id='sp_formfield_height_feet']")
	public WebElement enrollmentQuestionnaireFeetTextBox;

	/** COVIDcode Enrollment Questionnaire Demographics: inches text box */
	@FindBy(xpath = "//input[@id='sp_formfield_height_inches']")
	public WebElement enrollmentQuestionnaireInchesTextBox;
	
	/** COVIDcode Enrollment Questionnaire Demographics: error message when enter invalid value for inches */
	@FindBy(xpath = "//div[contains(text(), 'Because you have a value in feet, inches cannot be more than 11')]")
    public WebElement enrollmentQuestionnaireInchesErrorMessage;
	
	/**
	 * --- THE END OF COVIDcode ENROLLMENT QUESTIONNAIRE DEMOGRAPHICS SECTION ----
	 */

	/**
	 * -------- BEGINNING OF COVIDcode ENROLLMENT QUESTIONNAIRE SYMPTOMOLOGY SECTION -----
	 */

	/** COVIDcode Enrollment Questionnaire patient zip code text box */
	@FindBy(id = "sp_formfield_zip_code")
	public WebElement patientZipCodeTextBox;

	/** COVIDcode Enrollment Questionnaire Symptomology tab */
	@FindBy(xpath = "//*[contains(text(),'Symptomology')]")
	public WebElement symptomologyTab;

	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: Were you symptomatic
	 * dropdown
	 */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_symptomatic']")
	public WebElement enrollmentQuestionnaireWereYouSymptomaticDropdown;
	
	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: Were you symptomatic
	 * text
	 */
	@FindBy(xpath = "//div[@id='symptomatic']/div/label")
	public WebElement enrollmentQuestionnaireWereYouSymptomaticText;
	
	/** COVIDcode Enrollment Questionnaire Symptomology: Were you symptomatic search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_symptomatic']")
	public WebElement enrollmentQuestionnaireWereYouSymptomaticSearchBox;

	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: Were you symptomatic
	 * dropdown values
	 */
	@FindBy(xpath = "//li[@role='presentation']")
	public List<WebElement> enrollmentQuestionnaireWereYouSymptomaticDropdownValues;
	
	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: How was the sample taken
	 * dropdown
	 */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_how_was_the_sample_taken']/a")
	public WebElement enrollmentQuestionnaireHowWasTheSampleTakenDropdown;
	
	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: How was the sample taken
	 * search box
	 */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_how_was_the_sample_taken']")
	public WebElement enrollmentQuestionnaireHowWasTheSampleTakenSearchBox;
	
	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: How was the sample taken
	 * text
	 */
	@FindBy(xpath = "//div[@id='how_was_the_sample_taken']/div/label")
	public WebElement enrollmentQuestionnaireHowWasTheSampleTakenText;
	
	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: What type of test did the patient receive
	 * search box
	 */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_test_type']")
	public WebElement enrollmentQuestionnaireWhatTypeOfTestDidThePatientReceiveSearchBox;
	
	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: What type of test did the patient receive
	 * text
	 */
	@FindBy(xpath = "//div[@id='test_type']/div/label")
	public WebElement enrollmentQuestionnaireWhatTypeOfTestDidThePatientReceiveText;

	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: When did you first develop
	 * symptoms of COVID-19? calendar
	 */
	@FindBy(xpath = "//input[@id='sp_formfield_date_first_symptoms']")
	public WebElement enrollmentQuestionnaireWhenDevelopSymptoms;
	
	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: When did you first develop
	 * symptoms of COVID-19 text
	 */
	@FindBy(xpath = "//div[@id='date_first_symptoms']/div/label")
	public WebElement enrollmentQuestionnaireWhenDevelopSymptomsText;
	
	/** COVIDcode Enrollment Questionnaire Symptomology: When did you first develop symptoms of COVID-19 Selected date cannot be in the future text */
	@FindBy(xpath = "(//div[@ng-show='field.messages']/div)[3]")
	public WebElement enrollmentQuestionnaireWhenDevelopSymptomsSelectedDateCannotBeInTheFutureText;

	/** COVIDcode Enrollment Questionnaire Symptomology: Have you officially been diagnosed with COVID-19 dropdown */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_officially_diagnosed']/a")
	public WebElement enrollmentQuestionnaireHaveYouOfficiallyBeenDiagnosedDropdown;
	
	/** COVIDcode Enrollment Questionnaire Symptomology: Have you officially been diagnosed with COVID-19 dropdown */
	@FindBy(xpath = "//div[@id='officially_diagnosed']/div/label")
	public WebElement enrollmentQuestionnaireHaveYouOfficiallyBeenDiagnosedText;
	
	/** COVIDcode Enrollment Questionnaire Symptomology: Have you officially been diagnosed with COVID-19 Search Text */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_officially_diagnosed']")
	public WebElement enrollmentQuestionnaireHaveYouOfficiallyBeenDiagnosedSearchText;
	
	/**
	 * COVIDcode Enrollment Questionnaire Symptomology: When were you officially
	 * diagnosed with COVID-19? calendar
	 */
	@FindBy(xpath = "//input[@id='sp_formfield_date_official_diagnosis']")
	public WebElement enrollmentQuestionnaireWhenOfficiallyDiagnosedCalendar;

	/** COVIDcode Enrollment Questionnaire Symptomology: When were you officially diagnosed with COVID-19 Selected date cannot be in the future text */
	@FindBy(xpath = "(//div[@ng-show='field.messages']/div)[4]")
	public WebElement enrollmentQuestionnaireWhenOfficiallyDiagnosedCalendarSelectedDateCannotBeInTheFutureText;


	/**
	 * ---- THE END OF COVIDcode ENROLLMENT QUESTIONNAIRE SYMPTOMOLOGY SECTION -----
	 */
	
	
    /** --------------- BEGINNING OF COVIDcode ENROLLMENT QUESTIONNAIRE EXPOSURES AND RISK FACTORS SECTION TABLE ---------------  */ 
	
	/** Enrollment Questionnaire Exposures and risk factors tab */
	@FindBy(xpath = "//*[contains(text(),'Exposures')]")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsTab;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Please tell me if you/the patient have any of the following medical conditions search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_comorbidities']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsPleaseTellMeIfThePatientHaveAnyOfTheFollowingMedicalConditionsSearchBox;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Have you/the patient ever regularly vaped an e-cigarette or similar device? drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_vape_habit']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsHaveThePatientEverRegularlyVapedAnEcigaretteOrSimilarDeviceDD;

	/** Enrollment Questionnaire Exposures and Risk Factors Have you/the patient ever regularly vaped an e-cigarette or similar device? search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_vape_habit']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsHaveThePatientEverRegularlyVapedAnEcigaretteOrSimilarDeviceSearchBox;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Have you/the patient smoked at least 100 cigarettes in your entire life? drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_smoke_100']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsSmokedAtLeast100CigarettesDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Have you/the patient smoked at least 100 cigarettes in your entire life? search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_smoke_100']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsSmokedAtLeast100CigarettesSearchBox;
	
	/** Enrollment Questionnaire Exposures and Risk Factors When you smoke/have smoked, how many cigarettes do/did you usually smoke daily? drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_smoke_habit']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsHowManyCigarettesUsuallySmokeDailyDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors When you smoke/have smoked, how many cigarettes do/did you usually smoke daily? search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_smoke_habit']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsHowManyCigarettesUsuallySmokeDailySearchBox;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Non-steroidal anti-inflammatory drugs (ex. ibuprofen: Advil, Motrin, etc.) drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_used_anti_inflammatory']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsNonSteroidalAntiInflammatoryDrugsnDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Non-steroidal anti-inflammatory drugs (ex. ibuprofen: Advil, Motrin, etc.) drop down */
	@FindBy(xpath = "//div[@class='select2-result-label']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsNonSteroidalAntiInflammatoryDrugsnDDValues;
	
	/** Enrollment Questionnaire Exposures and Risk Factors How many times have you been exposed to someone who tested positive for COVID-19 drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_exposure_frequency']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsTestedPositiveForCovidDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors How many times have you been exposed to someone who tested positive for COVID-19 search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_exposure_frequency']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsTestedPositiveForCovidSearchBox;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Did you/the patient wear a mask? drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_exposure_protection']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsDidThePatientWearMaskDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Did you/the patient wear a mask? drop down value */
	@FindBy(xpath = "//div[@id='select2-drop']/ul/li")
	public List<WebElement> enrollmentQuestionnaireExposuredAndRiskFactorsDidThePatientWearMaskDdValue;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Did you/the patient wear a mask? search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_exposure_protection']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsDidThePatientWearMaskSearchBox;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Myocardial infarction or stroke medication (ex. digoxin) drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_used_stroke']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Paracetamol/acetaminophen (ex. acetaminophen: Tylenol) drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_used_paracetamol']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsParacetamolAcetaminophenDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Blood thinners (ex. warfarin – Coumadin, rivaroxaban – Xarelto) drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_used_blood_thinners']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsBloodThinnersDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Asthma medication (ex. albuterol – Ventolin) drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_used_asthma']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsAsthmaMedicationDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors ACE-inhibitors for blood pressure (ex. enalapril, lisinopril) drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_used_ace_inhibitors']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsAceInhibitorsDD;

	/** Enrollment Questionnaire Exposures and Risk Factors Pollen allergy medication (ex diphenhydramine – Benadryl, ioratadine - Claritin) drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_used_allergy']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsPollenAllergyMedicationUsedDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors ARBs(Angiotensin II Receptor Blockers) (candesartan- Atacand, valsartan-Diovan) drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_used_arbs']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsUsedArbsDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Antibiotics penicillin, azithromycin (ex. Z-pack) drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_used_antibiotics']/a")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsUsedAntibioticsDD;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Drop Down Value list */
	@FindBy(xpath = "//ul[@class='select2-results']/li/div")
	public List<WebElement> enrollmentQuestionnaireExposuredAndRiskFactorsDDValue;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Non-steroidal anti-inflammatory drugs (ex. ibuprofen: Advil, Motrin, etc.) Search Drop Down Text Field */
	@FindBy(xpath="//input[@autocomplete='sp_formfield_used_anti_inflammatory']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsNonSteroidalAntiInflammatoryDrugsnSearchDropDownTextField;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Myocardial infarction or stroke medication (ex. digoxin) Search Drop Down Text Field */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_used_stroke']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationSearchDropDownTextField;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Paracetamol/acetaminophen (ex. acetaminophen: Tylenol) Search Drop Down Text Field */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_used_paracetamol']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsParacetamolAcetaminophenSearchDropDownTextField;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Blood thinners (ex. warfarin – Coumadin, rivaroxaban – Xarelto) Search Drop Down Text Field */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_used_blood_thinners']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsBloodThinnersSearchDropDownTextField;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Asthma medication (ex. albuterol – Ventolin) Search Drop Down Text Field */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_used_asthma']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsAsthmaMedicationSearchDropDownTextField;
	
	/** Enrollment Questionnaire Exposures and Risk Factors ACE-inhibitors for blood pressure (ex. enalapril, lisinopril) Search Drop Down Text Field */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_used_ace_inhibitors']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsAceInhibitorsSearchDropDownTextField;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Pollen allergy medication (ex diphenhydramine – Benadryl, ioratadine - Claritin) Search Drop Down Text Field */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_used_allergy']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsPollenAllergyMedicationUsedSearchDropDownTextField;
	
	/** Enrollment Questionnaire Exposures and Risk Factors ARBs(Angiotensin II Receptor Blockers) (candesartan- Atacand, valsartan-Diovan) Search Drop Down Text Field */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_used_arbs']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsUsedArbsSearchDropDownTextField;
	
	/** Enrollment Questionnaire Exposures and Risk Factors Antibiotics penicillin, azithromycin (ex. Z-pack) Search Drop Down Text Field */
    @FindBy(xpath = "//input[@autocomplete='sp_formfield_used_antibiotics']")
	public WebElement enrollmentQuestionnaireExposuredAndRiskFactorsAntibioticsPenicillinSearchDropDownTextField;
	
    /** --------------- END OF COVIDcode ENROLLMENT QUESTIONNAIRE EXPOSURES AND RISK FACTORS SECTION TABLE ---------------  */ 
    
    
    /** --------------- BEGINNING OF COVIDcode ENROLLMENT QUESTIONNAIRE VACCINE SECTION TABLE ---------------  */ 
	
	/** Enrollment Questionnaire Vaccine tab */
	@FindBy(xpath = "//li[@heading='Vaccine']")
	public WebElement enrollmentQuestionnaireVaccineTab;
	
	/** Enrollment Questionnaire Vaccine Have you received your first COVID-19 Vaccine drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_received_first_vaccine']/a")
	public WebElement enrollmentQuestionnaireVaccineHaveYouReceivedYourFirstCovidDD;
	
	/** Enrollment Questionnaire Vaccine Have you received your first COVID-19 Vaccine search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_received_first_vaccine']")
	public WebElement enrollmentQuestionnaireVaccineHaveYouReceivedYourFirstCovidSearchBox;
	
	/** Enrollment Questionnaire Vaccine Manufacture drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_vaccine_manufacture']/a")
	public WebElement enrollmentQuestionnaireVaccineManufactureDD;
	
	/** Enrollment Questionnaire Vaccine Manufacture search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_vaccine_manufacture']")
	public WebElement enrollmentQuestionnaireVaccineManufactureSearchBox;
	
	/** Enrollment Questionnaire Vaccine Have you received your second COVID-19 Vaccine drop down */
	@FindBy(xpath = "//div[@id='s2id_sp_formfield_received_second_vaccine']/a")
	public WebElement enrollmentQuestionnaireVaccineReceivedSecondVaccineDD;
	
	/** Enrollment Questionnaire Vaccine Have you received your second COVID-19 Vaccine drop down value */
	@FindBy(xpath = "//div[@id='select2-drop']/ul/li")
	public List<WebElement> enrollmentQuestionnaireVaccineReceivedSecondVaccineDDValue;
	
	/** Enrollment Questionnaire Vaccine Have you received your second COVID-19 Vaccine search box */
	@FindBy(xpath = "//input[@autocomplete='sp_formfield_received_second_vaccine']")
	public WebElement enrollmentQuestionnaireVaccineReceivedSecondVaccineSearchBox;
	
	/** Enrollment Questionnaire Vaccine What date did you receive the second vaccine search box */
	@FindBy(xpath = "//input[@id='sp_formfield_second_vaccine_date']")
	public WebElement enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheSecondVaccineSearchBox;
	
	/** Enrollment Questionnaire Vaccine What date did you receive the second vaccine Selected date cannot be in the future Text */
	@FindBy(xpath = "(//div[@ng-show='field.messages']/div)[5]")
	public WebElement enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheSecondVaccineSelectedDateCannotBeInTheFutureText;
	
	/** Enrollment Questionnaire Vaccine What date did you receive the first vaccine search box */
	@FindBy(xpath = "//input[@id='sp_formfield_first_vaccine_date']")
	public WebElement enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheFirstVaccineSearchBox;
	
	/** Enrollment Questionnaire Vaccine What date did you receive the first vaccine Selected date cannot be in the future Text */
	@FindBy(xpath = "(//div[@ng-show='field.messages']/div)[6]")
	public WebElement enrollmentQuestionnaireVaccineWhatDateDidYouReceiveTheFirstVaccineSelectedDateCannotBeInTheFutureText;
	
    /** --------------- END OF COVIDcode ENROLLMENT QUESTIONNAIRE VACCINE SECTION TABLE ---------------  */ 

	
    /** --------------- BEGINNING OF COVIDcode ENROLLMENT QUESTIONNAIRE DISEASE COURSE SECTION ---------------  */ 
	
	/** Enrollment Questionnaire Disease Course New Button */
	@FindBy (xpath = "//*[contains(text(), 'New')] ")
	public WebElement enrollmentQuestionnaireDiseaseCourseNewButton;
	
	/** Enrollment Questionnaire Disease Course Add button */
	@FindBy (xpath = "//div[@class = 'modal-footer']/button[2]")
	public WebElement enrollmentQuestionnaireDiseaseCourseAddButton;
	
	/** Enrollment Questionnaire Disease Course Drug Treatments text */
	@FindBy (xpath = "//*[@id='drug_treatments']/div/label")
	public WebElement enrollmentQuestionnaireDiseaseCourseDrugTreatmentsText;
	
	/** Enrollment Questionnaire Disease Course Drug Treatments text field */
	@FindBy (xpath = "//input[@autocomplete='sp_formfield_drug_treatments']")
	public WebElement enrollmentQuestionnaireDiseaseCourseDrugTreatmentsTextField;
	
	/** Enrollment Questionnaire Disease Course Drug Treatments drop down values */
	@FindBy (xpath = "//div[@id='select2-drop']/ul/li")
	public List<WebElement> enrollmentQuestionnaireDiseaseCourseDrugTreatmentsDropDownValues;
	
	/** Enrollment Questionnaire Disease Course Organ Failure drop down */
	@FindBy (xpath = "//div[@id = 's2id_sp_formfield_organ_failure']/a")
	public WebElement enrollmentQuestionnaireDiseaseCourseOrganFailureDropDown;
	
	/** Enrollment Questionnaire Disease Course Organ Failure Drop Down Values */
	@FindBy (xpath = "//div[@class = 'select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireDiseaseCourseOrganFailureDropDownValues;
	
	/** Enrollment Questionnaire Disease Course: Which organ(s) showed signs of dysfunction/failure? text */
	@FindBy (xpath = "//label[contains(text(), 'Which organ(s) showed signs of dysfunction/failure?')]")
	public WebElement enrollmentQuestionnaireDiseaseCourseWhichOrgansFailedText;
	
	/** Enrollment Questionnaire Disease Course: Which organ(s) showed signs of dysfunction/failure drop down */
	@FindBy (xpath = "(//input[@class = 'select2-input select2-default'])[4]")
	public WebElement enrollmentQuestionnaireDiseaseCourseOrgansFailedDropDown;
	
	/** Enrollment Questionnaire Disease Course: Which organ(s) showed signs of dysfunction/failure drop down values */
	@FindBy (xpath = "//div[@class = 'select2-result-label']")
	public List<WebElement> enrollmentQuestionnaireDiseaseCourseOrgansFailedDropDownValues;

	/** Enrollment Questionnaire Disease Course Visit Date Search box */
	@FindBy (xpath = "//input[@id='sp_formfield_visit_date']")
	public WebElement enrollmentQuestionnaireDiseaseCourseVisitDateSearchBox;
	
	/** Enrollment Questionnaire Disease Course Symptoms Search box */
	@FindBy (xpath = "//input[@autocomplete='sp_formfield_symptoms']")
	public WebElement enrollmentQuestionnaireDiseaseCourseSymptomsSearchBox;
	
	/** Enrollment Questionnaire Disease Course Have you been diagnosed with pneumonia due to COVID-19 drop down */
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_pneumonia']/a")
	public WebElement enrollmentQuestionnaireDiseaseCourseHaveYouBeenDiagnosedWithPneumoniaDD;
	
	/** Enrollment Questionnaire Disease Course Have you been diagnosed with pneumonia due to COVID-19 Search box */
	@FindBy (xpath = "//input[@autocomplete='sp_formfield_pneumonia']")
	public WebElement enrollmentQuestionnaireDiseaseCourseHaveYouBeenDiagnosedWithPneumoniaSeacrhBox;
	
	/** Enrollment Questionnaire Disease Course Treatment Items Search box */
	@FindBy (xpath = "//input[@autocomplete='sp_formfield_treatment_items']")
	public WebElement enrollmentQuestionnaireDiseaseCourseTreatmentItemsSeacrhBox;
	
	/** Enrollment Questionnaire Disease Course Were you admitted to the hospital to treat your COVID drop down */
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_admitted_to_hospital']/a")
	public WebElement enrollmentQuestionnaireDiseaseCourseWereYouAdmittedToTheHospitalToTreatYourCovidDD;
	
	/** Enrollment Questionnaire Disease Course Were you admitted to the hospital to treat your COVID Search box */
	@FindBy (xpath = "//input[@autocomplete='sp_formfield_admitted_to_hospital']")
	public WebElement enrollmentQuestionnaireDiseaseCourseWereYouAdmittedToTheHospitalToTreatYourCovidSearchBox;
	
	/** Enrollment Questionnaire Disease Course What date were you admitted to the hospital Search box */
	@FindBy (xpath = "//input[@id='sp_formfield_date_admission']")
	public WebElement enrollmentQuestionnaireDiseaseCourseWhatDateWereYouAdmittedToTheHospitalSearchBox;
	
	/** Enrollment Questionnaire Disease Course Respiratory Rate drop down */
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_respiratory_rate']/a")
	public WebElement enrollmentQuestionnaireDiseaseCourseRespiratoryRateDD;
	
	/** Enrollment Questionnaire Disease Course Respiratory Rate Search box */
	@FindBy (xpath = "//input[@autocomplete='sp_formfield_respiratory_rate']")
	public WebElement enrollmentQuestionnaireDiseaseCourseRespiratoryRateSearchBox;
	
	/** Enrollment Questionnaire Disease Course Septic Shock drop down */
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_septic_shock']/a")
	public WebElement enrollmentQuestionnaireDiseaseCourseSepticShockDD;
	
	/** Enrollment Questionnaire Disease Course Septic Shock Search box */
	@FindBy (xpath = "//input[@autocomplete='sp_formfield_septic_shock']")
	public WebElement enrollmentQuestionnaireDiseaseCourseSepticShockSearchBox;
	
	/** Enrollment Questionnaire Disease Course Organ Failure drop down */
	@FindBy (xpath = "//div[@id='s2id_sp_formfield_organ_failure']/a")
	public WebElement enrollmentQuestionnaireDiseaseCourseOrganFailureDD;
	
	/** Enrollment Questionnaire Disease Course Organ Failure Search box */
	@FindBy (xpath = "//input[@autocomplete='sp_formfield_organ_failure']")
	public WebElement enrollmentQuestionnaireDiseaseCourseOrganFailureSearchBox;
	
    /** --------------- END OF COVIDcode ENROLLMENT QUESTIONNAIRE DISEASE COURSE SECTION ---------------  */ 
	
	public EnrollmentQuestionnairePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
