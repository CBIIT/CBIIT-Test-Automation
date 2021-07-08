package ServiceNow.COVIDCode.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class NativeViewEnrollmentViewPage extends CommonUtils {
	
	/** --------------- BEGINNING OF NATIVE VIEW COVIDcode ENROLLMENT VIEW  ---------------  */ 

    /** Native View Enrollment View frame */
    @FindBy(xpath = "//iframe[@id='gsft_main']")
    public WebElement nativeViewEnrollmentViewFrame;
    
    /** Native View Enrollment View Save Button */
    @FindBy(xpath = "(//button[@class='form_action_button  action_context btn btn-default'])[1]")
    public WebElement nativeViewEnrollmentViewPageSaveButton;
    
    /** Native View Enrollment View Submit for Review Button */
    @FindBy(xpath = "//button[@id = 'submit_for_review_bottom']")
    public WebElement nativeViewEnrollmentViewPageSubmitForReviewBtn;
    
    /** Native View Enrollment View Update button */
    @FindBy(xpath = "//*[@id='sysverb_insert_bottom']")
    public WebElement nativeViewEnrollmentViewPageUpdateButton;
    
    /** Native View Enrollment View Back from view page button */
    @FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.form_header']/span[1]/span[1]/nav[1]/div[1]/div[1]/button[1]")
    public WebElement  nativeViewEnrollmentViewbackFromViewPageButton;
        
	/** Native View Enrollment View User Group ID drop down */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.user_group_id']")
	public WebElement nativeViewEnrollmentViewUserGroupIDDropDown;

	/** Native View Enrollment View Host Hospital Code drop down */
	@FindBy(xpath = "//select[@id='sys_select.x_g_nci_geco_covid_geco_covid_19_enrollment.host_hospital_code']")
	public WebElement nativeViewEnrollmentViewHostHospitalCodeDropDown;

	/** Native View Enrollment View Inquiry ID field */
	@FindBy(xpath = "//*[@id='sys_display.x_g_nci_geco_covid_geco_covid_19_enrollment.inquiry_id']")
	public WebElement nativeViewEnrollmentViewInquiryIdField;
	
	/** Native View Enrollment View Inquiry ID text */
	@FindBy(xpath = "//div[@id='label.x_g_nci_geco_covid_geco_covid_19_enrollment.inquiry_id']/label")
	public WebElement nativeViewEnrollmentViewInquiryIdText;

	/** Native View Enrollment View Inquiry ID lookup button */
	@FindBy(xpath = "//*[@id='lookup.x_g_nci_geco_covid_geco_covid_19_enrollment.inquiry_id']")
	public WebElement nativeViewEnrollmentViewInquiryLookUpButton;

	/** Native View Enrollment View NIH Medical Record Number field */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.nih_medical_record_number']")
	public WebElement nativeViewEnrollmentViewNihMedcalRecordNumber;

	/** Native View Enrollment View Shipment Center Code */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.shipment_center_code']")
	public WebElement nativeViewEnrollmentViewShipmentCenterCode;

	/** Native View Enrollment View Verbal Consent Drop Down */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.verbal_consent']")
	public WebElement nativeViewEnrollmentViewConsentDropDown;
	
	/** Native View Enrollment View Hospital Name text */
	@FindBy(xpath = "//div[@id='label.x_g_nci_geco_covid_geco_covid_19_enrollment.host_hospital_city_code']/label")
	public WebElement nativeViewEnrollmentViewHospitalNameText;

	/** Native View Enrollment View Patient Last Name field */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.last_name']")
	public WebElement nativeViewEnrollmentViewPatientLastNameField;

	/** Native View Enrollment View Patient First Name */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.first_name']")
	public WebElement nativeViewEnrollmentViewPatientFirstName;

	/** Native View Enrollment View Patient Middle Initial */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.middle_initial']")
	public WebElement nativeViewEnrollmentViewPatientMiddleInitial;

	/** Native View Enrollment View Contact email address */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.contact_email']")
	public WebElement nativeViewEnrollmentViewContactEmailAddress;

	/** Native View Enrollment View Contact phone number */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.contact_phone_number']")
	public WebElement nativeViewEnrollmentViewContactPhoneNumber;

	/** Native View Enrollment View Host Hospital Code dropdown */
	@FindBy(xpath = "//select[@id='sys_select.x_g_nci_geco_covid_geco_covid_19_enrollment.host_hospital_code']")
	public WebElement nativeViewEnrollmentViewHostHospitalCodeDD;

	/** Native View Enrollment View Anonymized Patient ID */
	@FindBy(xpath = "//*[@id='sys_readonly.x_g_nci_geco_covid_geco_covid_19_enrollment.anonymized_patient_id']")
	public WebElement nativeViewEnrollmentViewAnonymizedPatientID;

	/** Native View Enrollment View Street address 1 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.street_address_1']")
	public WebElement nativeViewEnrollmentViewStreetAddress1;

	/** Native View Enrollment View City */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.city']")
	public WebElement nativeViewEnrollmentViewCity;

	/** Native View Enrollment View State */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.us_state']")
	public WebElement nativeViewEnrollmentViewState;
	
	/** Native View Enrollment View Zip code */
	@FindBy(xpath = "/html/body/div[2]/form/span[1]/span/div[5]/div/div[2]/div[6]/div[2]/input")
	public WebElement nativeViewEnrollmentViewZipCode;

	/** Native View 'All' breadcrumb link */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment_breadcrumb']/a/b")
	public WebElement nativeViewAllBreadCrumbLink;
	
	/** Native View Follow Up Patient Id */
	@FindBy(xpath = "//input[@id='sys_display.x_g_nci_geco_covid_covidcode_follow_up.patient_id']")
	public WebElement nativeViewFollowUpPatientId;

	
	/** --------------- END OF NATIVE VIEW COVIDcode ENROLLMENT VIEW  ---------------  */ 


	/** --------------- NATIVE VIEW COVIDcode ENROLLMENT VIEW DEMOGRAPHICS SECTION TABLE ---------------  */ 

    /** Native View Enrollment Questionnaire demographics tab */
	@FindBy(xpath = "/html/body/div[2]/form/div[1]/span[1]/span[1]/span[2]")
	public WebElement nativeViewEnrollmentViewDemographicsTab;
	

	/** --------------- BEGINNING OF NATIVE VIEW COVIDcode ENROLLMENT VIEW DEMOGRAPHICS SECTION TABLE ---------------  */ 

	/** Native View Enrollment View Demographics Date form completed field */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.form_complete_date']")
	public WebElement nativeViewEnrollmentViewDemographicsDateFormCompletedField;
	
	/** Native View Enrollment View Demographics Date form completed Selected date cannot be in the future text */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.form_complete_date_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewDemographicsDateFormCompletedSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Enrollment View Demographics What is your date of birth? field
	 */
	@FindBy(xpath = "//input[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.date_of_birth']")
	public WebElement nativeViewEnrollmentViewDemographicsWhatIsYourDateOfBirthField;
	
	/**
	 * Native View Enrollment View Demographics What is your date of birth? Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.date_of_birth_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewDemographicsWhatIsYourDateOfBirthSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Enrollment View Demographics What is your biological sex? drop
	 * down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.sex']")
	public WebElement nativeViewEnrollmentViewDemographicsWhatIsYourBioSexDropDown;

	/** Native View Enrollment View Demographics What is your current height? */
	@FindBy(xpath = "//select[contains(@id , 'height_choice')]")
	public WebElement nativeViewEnrollmentViewDemographicsWhatIsYourCurrentHeightDropDown;
	
	/** Native View Enrollment View Demographics Height Feet field */
	@FindBy(xpath = "(//input[contains(@id, 'height_feet')])[2]")
	public WebElement nativeViewEnrollmentViewDemographicsHeightField;

	/** Native View Enrollment View Demographics Height inches field */
	@FindBy(xpath = "(//input[contains(@id, 'height_inches')])[2]")
	public WebElement nativeViewEnrollmentViewDemographicsHeightInches;
	
	/** Native View Enrollment View Demographics Error Message for Inches */
	@FindBy(xpath = "/html/body/div[2]/form/span[2]/span/div/div/div[1]/div[7]/div[2]/div[2]/div")
	public WebElement nativeViewEnrollmentViewDemographicsInchesErrorMessage;

	/** Native View Enrollment View Demographics Height centimeters field */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.height']")
	public WebElement nativeViewEnrollmentViewDemographicsHeightCentimeters;

	/**
	 * Native View Enrollment View Demographics What is your current weight? drop
	 * down
	 */
	@FindBy(xpath = "//select[contains(@id, 'weight_choice')]")
	public WebElement nativeViewEnrollmentViewDemographicsCurrentWeightDropDown;

	/** Native View Enrollment View Demographics Weight in pound field */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.weight_pounds']")
	public WebElement nativeViewEnrollmentViewDemographicsWeighPoundtField;

	/** Native View Enrollment View Demographics Weight in kilograms field */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.weight']")
	public WebElement nativeViewEnrollmentViewDemographicsWeightKilogramsField;

	/**
	 * Native View Enrollment View Demographics How would you describe your race?
	 * drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.ancestry']")
	public WebElement nativeViewEnrollmentViewDemographicsHowWouldYouDescribeYourRaceDropDown;

	/**
	 * Native View Enrollment View Demographics Are you hispanic or latino? drop
	 * down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.are_you_hispanic_or_latino']")
	public WebElement nativeViewEnrollmentViewDemographicsAreYouHispaniceOrLatinoDropDown;

	/**
	 * --------------- END OF NATIVE VIEW COVIDcode ENROLLMENT VIEW DEMOGRAPHICS  SECTION TABLE --------------- */

	
	/**
	 * --------------- BEGINNING OF NATIVE VIEW COVIDcode ENROLLMENT VIEW SYMPTOMOLOGY SECTION TABLE ---------------*/

	/** Native View Enrollment View Symptomology tab */
	@FindBy(xpath = "//*[@id='tabs2_section']/span[2]/span[1]/span[2]")
	public WebElement nativeViewEnrollmentViewSymptomologyTab;

	/**
	 * Native View Enrollment View Symptomology When did you first develop symptoms
	 * of COVID-19? field
	 */
	@FindBy(xpath = "//*[@aria-label='When did you first develop symptoms of COVID-19?']")
	public WebElement nativeViewEnrollmentViewSymptomologyWhenFirstDevelopSymptomsField;
	
	/**
	 * Native View Enrollment View Symptomology When did you first develop symptoms
	 * of COVID-19? Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.date_first_symptoms_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewSymptomologyWhenFirstDevelopSymptomsSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Enrollment View Symptomology How was the sample taken? drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.how_was_the_sample_taken']")
	public WebElement nativeViewEnrollmentViewSymptomologyHowWasTheSampleTakenDropDown;

	/** Native View Enrollment View Symptomology Were you symptomatic? drop down */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.symptomatic']")
	public WebElement nativeViewEnrollmentViewSymptomologyWereYouSymptomaticDropDown;

	/**
	 * Native View Enrollment View Symptomology When where you officially diagnosed
	 * with COVID-19? field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.date_official_diagnosis']")
	public WebElement nativeViewEnrollmentViewSymptomologyDateOfficiallyDiagnosed;
	
	/**
	 * Native View Enrollment View Symptomology When where you officially diagnosed
	 * with COVID-19? Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.date_official_diagnosis_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewSymptomologyDateOfficiallyDiagnosedSelectedDateCannotBeInTheFutureText;
	
	/** Native View Enrollment View Symptomology Have you officially been diagnosed with COVID19 */
	@FindBy(xpath="//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.officially_diagnosed']")
	public WebElement nativeViewEnrollmentViewSymptomologyHaveYouOfficiallyBeenDiagnosedWithCOVID19;
	
	/** Native View Enrollment View Symptomology Have you officially been diagnosed with COVID-19? text */
	@FindBy(xpath = "//span[contains(text(), 'Have you officially been diagnosed with COVID-19?')]")
	public WebElement nativeViewEnrollmentViewSymptomologyHaveYouOfficiallyBeenDiagnosedWithCOVID19Text;
	

	/**
	 * --------------- END OF NATIVE VIEW COVIDcode ENROLLMENT VIEW SYMPTOMOLOGY  SECTION TABLE ---------------
	 */

	
	/**
	 * --------------- BEGINNING OF NATIVE VIEW COVIDcode ENROLLMENT VIEW EXPOSURES AND RISK FACTORS SECTION TABLE ---------------
	 */

	/** Native View Enrollment View Exposures and risk factors tab */
	@FindBy(xpath = "//*[@id='tabs2_section']/span[3]/span[1]/span[2]")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsTab;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Tell Me Medical
	 * Conditions unlock button
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.comorbidities_unlock']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsTellMeMedicalConditionsUnlockButton;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Tell Me Medical
	 * Conditions Lookup Button
	 */
	@FindBy(xpath = "//*[@id='lookup.x_g_nci_geco_covid_geco_covid_19_enrollment.comorbidities']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsLookupButton;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Tell Me Medical
	 * Conditions Search Bar
	 */
	@FindBy(xpath = "//*[@id='sys_display.x_g_nci_geco_covid_geco_covid_19_enrollment.comorbidities']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorstellMeMedicalConditionsSearchBar;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Have you/the patient
	 * ever regularly vaped an e-cigarette or similar device? drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.vape_habit']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsHasPatientVapedDropDown;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Have you/the patient
	 * smoked at least 100 cigarettes in your entire life? drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.smoke_100']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsHasPatientSmoked100CigarretesDropDown;

	/**
	 * Native View Enrollment View Exposures and Risk Factors When you smoke/have
	 * smoked, how many cigarettes do/did you usually smoke daily? drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.smoke_habit']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsHowManyCigarettesPatientSmokesDailyDD;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Non-steroidal
	 * anti-inflammatory drugs drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.used_anti_inflammatory']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsAntiInflammatoryDD;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Myocardial infarction
	 * or stroke medication (ex. digoxin) drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.used_stroke']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsMyocardialInfarctionOrStrokeMedicationDD;

	/**
	 * Native View Enrollment View Exposures and Risk Factors
	 * Paracetamol/acetaminophen (ex. acetaminophen: Tylenol) drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.used_paracetamol']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsParacetamolAcetaminophenDD;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Blood thinners (ex.
	 * warfarin – Coumadin, rivaroxaban – Xarelto) drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.used_blood_thinners']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsBloodThinnersDD;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Asthma medication (ex.
	 * albuterol – Ventolin) drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.used_asthma']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsAsthmaMedicationDD;

	/**
	 * Native View Enrollment View Exposures and Risk Factors ACE-inhibitors for
	 * blood pressure (ex. enalapril, lisinopril) drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.used_ace_inhibitors']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsAceInhibitorsDD;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Pollen allergy
	 * medication (ex diphenhydramine – Benadryl, ioratadine - Claritin) drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.used_allergy']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsAllergyMedicationUsedDD;

	/**
	 * Native View Enrollment View Exposures and Risk Factors ARBs(Angiotensin II
	 * Receptor Blockers) (candesartan- Atacand, valsartan-Diovan) drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.used_arbs']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsUsedArbsDD;

	/**
	 * Native View Enrollment View Exposures and Risk Factors Antibiotics
	 * penicillin, azithromycin (ex. Z-pack) drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.used_antibiotics']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsUsedAntibioticsDD;

	/**
	 * Native View Enrollment View Exposures and Risk Factors How many times have
	 * you been exposed to known COVID-19 people? drop down
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.exposure_frequency']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsExposureToCOVID19FrequencyDD;

	/** Native View Enrollment View Exposures and Risk Factors Did you/the patient wear a mask? drop down */
	@FindBy (xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.exposure_protection']")
	public WebElement nativeViewEnrollmentViewExposuredAndRiskFactorsDidYouThePatientWearAMaskDD;
	
	/** --------------- END OF NATIVE VIEW COVIDcode ENROLLMENT VIEW EXPOSURES AND RISK FACTORS SECTION TABLE ---------------  */ 
	
	
	/** --------------- BEGINNING OF NATIVE VIEW COVIDcode ENROLLMENT VIEW PARTICIPANT EVENTS SECTION TABLE ---------------  */ 

	/** Native View Enrollment View Participant Events tab */
	@FindBy(xpath = "//*[@id='tabs2_section']/span[4]/span[1]")
	public WebElement nativeViewEnrollmentViewParticipantEventsTab;

	/** Native View Enrollment View Participant Events Consented Date field */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.consented']")
	public WebElement nativeViewEnrollmentViewParticipantEventsConsentedDate;
	
	/** Native View Enrollment View Participant Events Consented Date Selected date cannot be in the future text */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.consented_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewParticipantEventsConsentedSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Enrollment View Participant Events Minimal Survey Conducted Date
	 * field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.min_survey_conducted']")
	public WebElement nativeViewEnrollmentViewParticipantEventsMinimalSurveyConductedDate;
	
	/**
	 * Native View Enrollment View Participant Events Minimal Survey Conducted Date Selected date cannot be in the future text */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.min_survey_conducted_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewParticipantEventsMinimalSurveyConductedDateSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Enrollment View Participant Events Assigned Protocol 20-HG-0090
	 * in CRIS Date field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.assigned_protocol_cris']")
	public WebElement nativeViewEnrollmentViewParticipantEventsAssignedProtocolInCRISDate;
	
	/**
	 * Native View Enrollment View Participant Events Assigned Protocol 20-HG-0090
	 * in CRIS Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.assigned_protocol_cris_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewParticipantEventsAssignedProtocolInCRISSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Enrollment View Participant Events Data Extracted from CRIS?
	 * dropdown
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.data_extracted_cris']")
	public WebElement nativeViewEnrollmentViewParticipantEventsDataExtractedFromCRISDropDown;

	/**
	 * Native View Enrollment View Participant Events RVS Payment Requested Text
	 */
	@FindBy(xpath = "//span[contains(text(), 'RVS Payment')]")
	public WebElement nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedText;

	/**
	 * Native View Enrollment View Participant Events Data Extracted from CRIS?
	 * field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.data_extracted_date_cris']")
	public WebElement nativeViewEnrollmentViewParticipantEventsDataExtractedFromCRISField;

	/** Native View Enrollment View Participant Events RVS Status dropdown */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.rvs_status']")
	public WebElement nativeViewEnrollmentViewParticipantEventsRvsStatusDropDown;

	/**
	 * Native View Enrollment View Participant Events RVS Payment Requested Date
	 * Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.rvs_payment_requested_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedDateSelectedDateCannotBeInTheFutureText;
	
	/**
	 * Native View Enrollment View Participant Events RVS Payment Requested Date
	 * field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.rvs_payment_requested']")
	public WebElement nativeViewEnrollmentViewParticipantEventsRvsPaymentRequestedDatefField;

	/**
	 * Native View Enrollment View Participant Events When did you first develop
	 * symptoms of COVID-19? field
	 */
	@FindBy(xpath = "//div[@class='col-xs-10 col-md-9 col-lg-8 form-field input_controls']/span[1]/input[1]")
	public WebElement nativeViewEnrollmentViewParticipantEventsFirstDevelopSymptomsOfCOVID;

	/**
	 * Native View Enrollment View Participant Events Extended Survey Completed Date
	 * field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.extended_survey_completed']")
	public WebElement nativeViewEnrollmentViewParticipantEventsExtendedSurveyCompletedDate;
	
	/**
	 * Native View Enrollment View Participant Events Extended Survey Completed Date
	 * Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.extended_survey_completed_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewParticipantEventsExtendedSurveyCompletedDateSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Enrollment View Participant Events Medical Release Authorization
	 * Signed Date field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.medical_release_signed']")
	public WebElement nativeViewEnrollmentViewParticipantEventsMedicalReleaseAuthorizationSignedDate;
	
	/**
	 * Native View Enrollment View Participant Events Medical Release Authorization
	 * Signed Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.medical_release_signed_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewParticipantEventsMedicalReleaseAuthorizationSignedSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Enrollment View Participant Events OMS REDCap survey uploaded?
	 * dropdown
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.data_extracted_oms']")
	public WebElement nativeViewEnrollmentViewParticipantEventsOmsRedCapSurveyUploadedDD;

	/**
	 * Native View Enrollment View Participant Events Date OMS REDCap survey
	 * uploaded field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.data_extracted_date_oms']")
	public WebElement nativeViewEnrollmentViewParticipantEventsOmsRedCapSurveyUploadedDate;

	/**
	 * --------------- END OF NATIVE VIEW COVIDcode ENROLLMENT VIEW PARTICIPANT EVENTS SECTION TABLE ---------------
	 */

	
	/**
	 * --------------- BEGINNING OF NATIVE VIEW COVIDcode ENROLLMENT VIEW VACCINE SECTION TABLE ---------------
	 */

	/** Native View Enrollment View Vaccine tab */
	@FindBy(xpath = "//*[@id='tabs2_section']/span[5]/span[1]")
	public WebElement nativeViewEnrollmentViewVaccineTab;

	/**
	 * Native View Enrollment View Vaccine Have you received your first COVID-19
	 * Vaccine? dropdown
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.received_first_vaccine']")
	public WebElement nativeViewEnrollmentViewVaccineHaveYouReceivedYourFirstCOVIDVaccineDD;

	/** Native View Enrollment View Vaccine Manufacture dropdown */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.vaccine_manufacture']")
	public WebElement nativeViewEnrollmentViewVaccineManufactureDD;

	/**
	 * Native View Enrollment View Vaccine What date did you receive the first
	 * vaccine? Date field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.first_vaccine_date']")
	public WebElement nativeViewEnrollmentViewVaccineWhatDateDidYouReceiveFirstVaccineDate;
	
	/**
	 * Native View Enrollment View Vaccine What date did you receive the first
	 * vaccine? Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.first_vaccine_date_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewVaccineWhatDateDidYouReceiveFirstVaccineSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Enrollment View Vaccine Have you received your second COVID-19
	 * Vaccine dropdown
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.received_second_vaccine']")
	public WebElement nativeViewEnrollmentViewVaccineHaveYouReceivedYourSecondCovidVaccineDD;

	/**
	 * Native View Enrollment View Vaccine What date did you receive the second
	 * vaccine? Date field
	 */
	@FindBy(xpath = "//input[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.second_vaccine_date']")
	public WebElement nativeViewEnrollmentViewVaccineHaveYouReceivedYourSecondVaccineDate;
	
	/**
	 * Native View Enrollment View Vaccine What date did you receive the second
	 * vaccine? Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.second_vaccine_date_fieldmsg']/div")
	public WebElement nativeViewEnrollmentViewVaccineHaveYouReceivedYourSecondVaccineSelectedDateCannotBeInTheFutureText;

	/**
	 * --------------- END OF NATIVE VIEW COVIDcode ENROLLMENT VIEW VACCINE SECTION TABLE ---------------
	 */

	/**
	 * --------------- BEGINNING OF NATIVE VIEW COVIDcode ENROLLMENT VIEW DISEASE COURSES SECTION TABLE ---------------
	 */

	/** Native View Enrollment View Vaccine Disease Courses Tab */
	@FindBy(xpath = "(//div[@id='tabs2_list']/span/span)[1]")
	public WebElement nativeViewEnrollmentViewDiseaseCoursesTab;
	
	/** Native View Enrollment View Vaccine Disease Courses New button */
	@FindBy(xpath = "(//button[@class='selected_action action_context btn btn-primary'])[1]")
	public WebElement nativeViewEnrollmentViewDiseaseCoursesNewButton;

	/** Native View Enrollment View Vaccine Disease Courses Visit Date field */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_disease_course.visit_date']")
	public WebElement nativeViewEnrollmentViewDiseaseCoursesVisitDate;

	/**
	 * Native View Enrollment View Vaccine Were you admitted to the hospital to
	 * treat your COVID-19? dropdown
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_disease_course.admitted_to_hospital']")
	public WebElement nativeViewEnrollmentViewAdmittedToTheHospitalToTreatDD;

	/**
	 * Native View Enrollment View Vaccine What date were you admitted to the
	 * hospital? Date field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_disease_course.date_admission']")
	public WebElement nativeViewEnrollmentViewDateWereYouAdmittedToTheHospital;

	/**
	 * Native View Enrollment View Vaccine Disease Courses "Have you been diagnosed
	 * with pneumonia due to COVID-19?" dropdown
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_disease_course.pneumonia']")
	public WebElement nativeViewEnrollmentViewHaveYouBeenDiagnosedWithPneumoniDD;

	/**
	 * Native View Enrollment View Vaccine Disease Courses Respiratory Rate dropdown
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_disease_course.respiratory_rate']")
	public WebElement nativeViewEnrollmentViewRespiratoryRateDD;

	/** Native View Enrollment View Vaccine Disease Courses Septic Shock dropdown */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_disease_course.septic_shock']")
	public WebElement nativeViewEnrollmentViewSepticShockDD;

	/**
	 * Native View Enrollment View Vaccine Disease Courses Organ Failure dropdown
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_disease_course.organ_failure']")
	public WebElement nativeViewEnrollmentViewOrganFailureDD;
	
	/** Native View Enrollment View Disease Course Organ Failure - Which organ(s) showed signs of dysfunction/failure? text */
	@FindBy(xpath = "(//span[contains(text(), 'Which organ(s) showed signs of dysfunction/failure?')])[1]")
	public WebElement nativeViewEnrollmentWhichOrgansShowFailureText;
	
	/** Native View Enrollment View Disease Course Organ Failure - unlock options for Which organ(s) showed signs of dysfunction/failure? */
	@FindBy(xpath = "//button[@id = 'x_g_nci_geco_covid_disease_course.which_organs_unlock']")
	public WebElement unlockWhichOrgansFailedOptions;
	
	/** Native View Enrollment View Disease Course Organ Failure Lookup button */
	@FindBy(xpath = "//button[@id ='lookup.x_g_nci_geco_covid_disease_course.which_organs']")
	public WebElement nativeViewEnrollmentWhichOrgansLookupBtn;
	
	/** Native View Enrollment View Disease Course Organ Failure Lookup Field */
	@FindBy(xpath = "//input[@id = 'sys_display.x_g_nci_geco_covid_disease_course.which_organs']")
	public WebElement whichOrgansFailedLookupField;
	
	/** Native View Enrollment View Disease Course - List of Selected Failed Organs */
	@FindBy(xpath = "//select[@id = 'select_0x_g_nci_geco_covid_disease_course.which_organs']")
	public List<WebElement> listOfSelectedFailedOrgans;
	
	/** Native View Enrollment View Disease Course - Other Failed Organs Text Box */
	@FindBy(xpath = "//input[@id = 'x_g_nci_geco_covid_disease_course.other']")
	public WebElement failedOrganOtherTextBox;
	
	/** Native View Enrollment View Disease Course Drug Treatments - unlock options for Drug Treatments */
	@FindBy(xpath = "//button[@id = 'x_g_nci_geco_covid_disease_course.drug_treatments_unlock']")
	public WebElement unlockDrugTreatmentsOptions;
	
	/** Native View Disease Course - Drug Treatments Lookup Field */
	@FindBy(xpath = "//input[@id = 'sys_display.x_g_nci_geco_covid_disease_course.drug_treatments']")
	public WebElement drugTreatmentsLookupField;
	
	/** Native View Disease Course - List of Selected Drug Treatments */
	@FindBy(xpath = "//select[@id = 'select_0x_g_nci_geco_covid_disease_course.drug_treatments']")
	public List<WebElement> listOfSelectedDrugTreatments;
	
	/** Native View Disease Course - Other Drug Treatments Text Box */
	@FindBy(xpath = "//input[@id = 'x_g_nci_geco_covid_disease_course.other_drug_treatments']")
    public WebElement otherDrugTreatmentsTextBox;
	
	/** Native View Enrollment View Vaccine Disease Courses submit button */
	@FindBy(xpath = "//*[@id='sysverb_insert_bottom']")
	public WebElement nativeViewEnrollmentViewDiseaseCoursesSubmitButton;

	/** Native View Enrollment View Vaccine Disease Courses Add Attachment button */
	@FindBy(xpath = "//*[@id='add_attachment_bottom']")
	public WebElement nativeViewEnrollmentViewDiseaseCoursesAddAttachmentButton;
	
	/** Disease Courses Drug Treatments unlock button */
	@FindBy (xpath="//*[@id='x_g_nci_geco_covid_disease_course.drug_treatments_unlock']")
	public WebElement diseaseCoursesDrugTreatmentsUnlockButton;
	
	/** Disease Courses Drug Treatments select options search bar */
	@FindBy (xpath="//*[@id='sys_display.x_g_nci_geco_covid_disease_course.drug_treatments']")
	public WebElement diseaseCoursesDrugTreatmentsSearchbar;
	
	/** Disease Courses Drug Treatments lock button */
	@FindBy (xpath="//*[@id='x_g_nci_geco_covid_disease_course.drug_treatments_lock']")
	public WebElement diseaseCoursesDrugTreatmentsLockButton;

	/** Disease Courses Drug Treatments Text */
	@FindBy (xpath="//*[@id='lookup.x_g_nci_geco_covid_disease_course.drug_treatments']")
	public WebElement diseaseCoursesDrugTreatmentsText;
	
	/** Native View Enrollment View Add Attachment Top Button */
	@FindBy(xpath = "//button[@id = 'add_attachment']")
	public WebElement nativeViewEnrollmentViewAddAttachmentTopButton;
	
	/** Native View Enrollment View Choose File Attachments Button */
	@FindBy(xpath = "//input[@id='attachFile']")
	public WebElement nativeViewEnrollmentViewChooseFileAttachmentsButton;
	
	/** Native View Enrollment View Choose File Attachments Download Text */
	@FindBy(xpath = "//td[@style = 'white-space: nowrap;']/a[4]")
	public WebElement nativeViewEnrollmentViewChooseFileAttachmentsDownloadText;
	
	/** Native View Enrollment View Choose File Attachments Close Button*/
	@FindBy(xpath = "//button[@id = 'attachment_closemodal']")
	public WebElement nativeViewEnrollmentViewChooseFileAttachmentsCloseButton;
	
	/** Native View Enrollment View Submit Top Button */
	@FindBy(xpath = "//button[@id='sysverb_insert']")
	public WebElement nativeViewEnrollmentViewSubmitTopButton;
	
	/** Native View Enrollment View Delete Top Button */
	@FindBy(xpath = "//button[@id = 'sysverb_delete']")
	public WebElement nativeViewEnrollmentViewDeleteTopButton;
	
	/** Native View Enrollment View Delete Submission Pop Up Delete Button */
	@FindBy(xpath = "//button[@id = 'ok_button']")
	public WebElement nativeViewEnrollmentViewDeleteDeleteSubmissionPopUpDeleteButton;
	
	/**
	 * --------------- END OF NATIVE VIEW COVIDcode ENROLLMENT VIEW DISEASE COURSES SECTION TABLE ---------------
	 */
	
	
	/**
	 * --------------- BEGINNING OF NATIVE VIEW COVIDcode ENROLLMENT VIEW SPECIMENS SECTION TABLE ---------------
	 */

	/** Native View Enrollment View Specimens Tab */
	@FindBy(xpath = "//div[@id='tabs2_list']/span[2]/span")
	public WebElement nativeViewEnrollmentViewSpecimensTab;
	
	/** Native View Enrollment View Specimens New Button */
	@FindBy(xpath = "(//button[@class='selected_action action_context btn btn-primary'])[2]")
	public WebElement nativeViewEnrollmentViewSpecimensNewButton;

	/** Native View Enrollment View Specimens Type drop down */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_blood_samples.specimen_type']")
	public WebElement nativeViewEnrollmentViewSpecimensTypeDD;
	
	/** Native View Enrollment View Specimens Submit Button */
	@FindBy(xpath = "//button[@id='sysverb_insert_bottom']")
	public WebElement nativeViewEnrollmentViewSpecimensSubmitButton;

	/**
	 * --------------- END OF NATIVE VIEW COVIDcode ENROLLMENT VIEW SPECIMENS SECTION TABLE ---------------
	 */
	
	
	/** --------------- BEGINNING OF NATIVE VIEW COVIDcode ENROLLMENT FOLLOW UPS DEMOGRAPHICS SECTION TABLE ---------------  */ 

	/** Native View Follow Up Demographics Date form completed field */
	@FindBy(xpath = "//input[@id='x_g_nci_geco_covid_covidcode_follow_up.form_complete_date']")
	public WebElement nativeViewFollowUpDemographicsDateFormCompletedField;
	
	/** Native View Follow Up Demographics Date form completed Selected date cannot be in the future text */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.form_complete_date_fieldmsg']/div")
	public WebElement nativeViewFollowUpDemographicsDateFormCompletedSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Follow Up Demographics What is your date of birth? field
	 */
	@FindBy(xpath = "//input[@id='x_g_nci_geco_covid_covidcode_follow_up.date_of_birth']")
	public WebElement nativeViewFollowUpDemographicsWhatIsYourDateOfBirthField;
	
	/**
	 * Native View Follow Up Demographics What is your date of birth? Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.date_of_birth_fieldmsg']/div")
	public WebElement nativeViewFollowUpDemographicsWhatIsYourDateOfBirthSelectedDateCannotBeInTheFutureText;

	/**
	 * --------------- END OF NATIVE VIEW COVIDcode ENROLLMENT FOLLOW UPS DEMOGRAPHICS  SECTION TABLE --------------- */
	
	/**
	 * --------------- BEGINNING OF NATIVE VIEW COVIDcode ENROLLMENT FOLLOW UPS SYMPTOMOLOGY SECTION TABLE ---------------*/

	/** Native ViewFollow Up Symptomology tab */
	@FindBy(xpath = "//div[@id='tabs2_section']/span[2]/span[1]")
	public WebElement nativeViewFollowUpSymptomologyTab;

	/** Native Follow Up Symptomology Were you symptomatic text */
	@FindBy(xpath = "//div[@id='element.x_g_nci_geco_covid_covidcode_follow_up.symptomatic']/div/label")
	public WebElement nativeViewFollowUpSymptomologyWereYouSymptomaticText;
	
	/** Native Follow Up Symptomology When did you first develop symptoms of COVID-19 text */
	@FindBy(xpath = "//div[@id='label.x_g_nci_geco_covid_covidcode_follow_up.date_first_symptoms']/label")
	public WebElement nativeViewFollowUpSymptomologyWhenDidYouFirstDevelopSymptomsText;
	
	/** Native Follow Up Symptomology Have you officially been diagnosed with COVID-19 text */
	@FindBy(xpath = "//div[@id='label.x_g_nci_geco_covid_covidcode_follow_up.officially_diagnosed']/label")
	public WebElement nativeViewFollowUpSymptomologyHaveYouOfficiallyBeenDiagnosedText;
	
	/** Native Follow Up Symptomology How was the sample taken text */
	@FindBy(xpath = "//div[@id='label.x_g_nci_geco_covid_covidcode_follow_up.how_was_the_sample_taken']/label")
	public WebElement nativeViewFollowUpSymptomologyHowWasTheSampleTakenText;
	
	/** Native Follow Up Symptomology What type of test did the patient receive text */
	@FindBy(xpath = "//div[@id='label.x_g_nci_geco_covid_covidcode_follow_up.test_type']/label")
	public WebElement nativeViewFollowUpSymptomologyWhatTypeOfTestDidThePatientReceiveText;
	
	/** Native Follow Up Symptomology Were you symptomatic drop down */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_covidcode_follow_up.symptomatic']")
	public WebElement nativeViewFollowUpSymptomologyWereYouSymptomaticDD;
	
	/** Native Follow Up Symptomology When did you first develop symptoms of COVID-19 text field */
	@FindBy(xpath = "//input[@id='x_g_nci_geco_covid_covidcode_follow_up.date_first_symptoms']")
	public WebElement nativeViewFollowUpSymptomologyWhenDidYouFirstDevelopSymptomsTextField;
	
	/** Native Follow Up Symptomology When did you first develop symptoms of COVID-19 text Label */
	@FindBy(xpath = "//div[@id='label.x_g_nci_geco_covid_covidcode_follow_up.date_first_symptoms']/label")
	public WebElement nativeViewFollowUpSymptomologyWhenDidYouFirstDevelopSymptomsTextLabel;
	
	/**
	 * Native View Follow Up Symptomology When did you first develop symptoms
	 * of COVID-19? field
	 */
	@FindBy(xpath = "//input[@id='x_g_nci_geco_covid_covidcode_follow_up.date_first_symptoms']")
	public WebElement nativeViewFollowUpSymptomologyWhenFirstDevelopSymptomsField;
	
	/**
	 * Native View Follow Up Symptomology When did you first develop symptoms
	 * of COVID-19? Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.date_first_symptoms_fieldmsg']/div")
	public WebElement nativeViewFollowUpSymptomologyWhenFirstDevelopSymptomsSelectedDateCannotBeInTheFutureText;

	/** Native View Follow Up Symptomology Were you symptomatic? drop down */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_covidcode_follow_up.symptomatic']")
	public WebElement nativeViewFollowUpSymptomologyWereYouSymptomaticDropDown;

	/**
	 * Native View Follow Up Symptomology When where you officially diagnosed
	 * with COVID-19? field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_covidcode_follow_up.date_official_diagnosis']")
	public WebElement nativeViewFollowUpSymptomologyDateOfficiallyDiagnosed;
	
	/**
	 * Native View Follow Up Symptomology When where you officially diagnosed
	 * with COVID-19? Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.date_official_diagnosis_fieldmsg']/div")
	public WebElement nativeViewFollowUpSymptomologyDateOfficiallyDiagnosedSelectedDateCannotBeInTheFutureText;
	
	/** Native View Follow Up Symptomology Have you officially been diagnosed with COVID19 */
	@FindBy(xpath="//select[@id='x_g_nci_geco_covid_covidcode_follow_up.officially_diagnosed']")
	public WebElement nativeViewFollowUpSymptomologyHaveYouOfficiallyBeenDiagnosedWithCOVID19;

	/**
	 * --------------- END OF NATIVE VIEW COVIDcode FOLLOW UPS SYMPTOMOLOGY  SECTION TABLE ---------------
	 */
	
	
	/** --------------- BEGINNING OF NATIVE VIEW COVIDcode FOLLOW UPS PARTICIPANT EVENTS SECTION TABLE ---------------  */ 

	/** Native View Follow Up Participant Events tab */
	@FindBy(xpath = "//*[@id='tabs2_section']/span[5]/span[1]")
	public WebElement nativeViewFollowUpParticipantEventsTab;

	/** Native View Follow Up Participant Events Consented Date field */
	@FindBy(xpath = "//input[@id='x_g_nci_geco_covid_covidcode_follow_up.consented']")
	public WebElement nativeViewFollowUpParticipantEventsConsentedDate;
	
	/** Native View Follow Up Participant Events Consented Date Selected date cannot be in the future text */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.consented_fieldmsg']/div")
	public WebElement nativeViewFollowUpParticipantEventsConsentedSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Follow Up Participant Events Minimal Survey Conducted Date
	 * field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_covidcode_follow_up.min_survey_conducted']")
	public WebElement nativeViewFollowUpParticipantEventsMinimalSurveyConductedDate;
	
	/**
	 * Native View Follow Up Participant Events Minimal Survey Conducted Date Selected date cannot be in the future text */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.min_survey_conducted_fieldmsg']/div")
	public WebElement nativeViewFollowUpParticipantEventsMinimalSurveyConductedDateSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Follow Up Participant Events Assigned Protocol 20-HG-0090
	 * in CRIS Date field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_covidcode_follow_up.assigned_protocol_cris']")
	public WebElement nativeViewFollowUpParticipantEventsAssignedProtocolInCRISDate;
	
	/**
	 * Native View Follow Up Participant Events Assigned Protocol 20-HG-0090
	 * in CRIS Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.assigned_protocol_cris_fieldmsg']/div")
	public WebElement nativeViewFollowUpParticipantEventsAssignedProtocolInCRISSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Follow Up Participant Events RVS Payment Requested Date
	 * Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.rvs_payment_requested_fieldmsg']/div")
	public WebElement nativeViewFollowUpParticipantEventsRvsPaymentRequestedDateSelectedDateCannotBeInTheFutureText;
	
	/**
	 * Native View Follow Up Participant Events RVS Payment Requested Date
	 * field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_covidcode_follow_up.rvs_payment_requested']")
	public WebElement  nativeViewFollowUpParticipantEventsRvsPaymentRequestedDatefField;

	/**
	 * Native View Follow Up Participant Events Extended Survey Completed Date
	 * field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_covidcode_follow_up.extended_survey_completed']")
	public WebElement nativeViewFollowUpParticipantEventsExtendedSurveyCompletedDate;
	
	/**
	 * Native View Follow Up Participant Events Extended Survey Completed Date
	 * Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.extended_survey_completed_fieldmsg']/div")
	public WebElement nativeViewFollowUpParticipantEventsExtendedSurveyCompletedDateSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Follow Up Participant Events Medical Release Authorization
	 * Signed Date field
	 */
	@FindBy(xpath = "//*[@id='x_g_nci_geco_covid_covidcode_follow_up.medical_release_signed']")
	public WebElement nativeViewFollowUpParticipantEventsMedicalReleaseAuthorizationSignedDate;
	
	/**
	 * Native View Follow Up Participant Events Medical Release Authorization
	 * Signed Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.medical_release_signed_fieldmsg']/div")
	public WebElement nativeViewFollowUpParticipantEventsMedicalReleaseAuthorizationSignedSelectedDateCannotBeInTheFutureText;

	/**
	 * --------------- END OF NATIVE VIEW COVIDcode FOLLOW UPS PARTICIPANT EVENTS SECTION TABLE ---------------
	 */
	
	/**
	 * --------------- BEGINNING OF NATIVE VIEW COVIDcode FOLLOW UPS VACCINE SECTION TABLE ---------------
	 */

	/** Native View Follow Up Vaccine tab */
	@FindBy(xpath = "//*[@id='tabs2_section']/span[6]/span[1]")
	public WebElement nativeViewFollowUpVaccineTab;

	/**
	 * Native View Follow Up Vaccine Have you received your first COVID-19
	 * Vaccine? dropdown
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_covidcode_follow_up.received_first_vaccine']")
	public WebElement nativeViewFollowUpVaccineHaveYouReceivedYourFirstCOVIDVaccineDD;

	/** Native View Follow Up Vaccine Manufacture dropdown */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_covidcode_follow_up.vaccine_manufacture']")
	public WebElement nativeViewFollowUpViewVaccineManufactureDD;

	/**
	 * Native View Follow Up Vaccine What date did you receive the first
	 * vaccine? Date field
	 */
	@FindBy(xpath = "//input[@id='x_g_nci_geco_covid_covidcode_follow_up.first_vaccine_date']")
	public WebElement nativeViewFollowUpVaccineWhatDateDidYouReceiveFirstVaccineDate;
	
	/**
	 * Native View Follow Up Vaccine What date did you receive the first
	 * vaccine? Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.first_vaccine_date_fieldmsg']/div")
	public WebElement nativeViewFollowUpVaccineWhatDateDidYouReceiveFirstVaccineSelectedDateCannotBeInTheFutureText;

	/**
	 * Native View Follow Up Vaccine Have you received your second COVID-19
	 * Vaccine dropdown
	 */
	@FindBy(xpath = "//select[@id='x_g_nci_geco_covid_covidcode_follow_up.received_second_vaccine']")
	public WebElement nativeViewFollowUpVaccineHaveYouReceivedYourSecondCovidVaccineDD;

	/**
	 * Native View Follow Up Vaccine What date did you receive the second
	 * vaccine? Date field
	 */
	@FindBy(xpath = "//input[@id='x_g_nci_geco_covid_covidcode_follow_up.second_vaccine_date']")
	public WebElement nativeViewFollowUpVaccineHaveYouReceivedYourSecondVaccineDate;
	
	/**
	 * Native View Follow Up Vaccine What date did you receive the second
	 * vaccine? Selected date cannot be in the future text
	 */
	@FindBy(xpath = "//div[@id='x_g_nci_geco_covid_covidcode_follow_up.second_vaccine_date_fieldmsg']/div")
	public WebElement nativeViewFollowUpVaccineHaveYouReceivedYourSecondVaccineSelectedDateCannotBeInTheFutureText;

	/**
	 * --------------- END OF NATIVE VIEW COVIDcode FOLLOW UPS VACCINE SECTION TABLE ---------------
	 */

	public NativeViewEnrollmentViewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
