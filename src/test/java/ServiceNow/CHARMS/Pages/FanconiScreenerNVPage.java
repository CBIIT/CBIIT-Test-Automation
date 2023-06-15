package ServiceNow.CHARMS.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import appsCommon.PageInitializer;

public class FanconiScreenerNVPage extends PageInitializer {

	public FanconiScreenerNVPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/* *************************************************************** */
	/* ********** LOCATORS IN FANCONI STUDY SCREENER ***************** */
	/* *************************************************************** */

	/* *************************************************************** */
	/* LOCATORS In Native View for the Fanconi ELigibility Questionnaire PAGE */
	/* *************************************************************** */

	/* NV Fanconi Screener: Participant Details Preview button */
	@FindBy(xpath = "(//a[@aria-label='Preview record: Fanconi-1 tester-1'])[1]")
	public WebElement nVFamilyMembersPreviewButton;

	/* NV Fanconi Screener: Participant Details Open Record button */
	@FindBy(xpath = "(//a[normalize-space()='Open Record'])[1]")
	public WebElement nVFamilyMembersOpenRecordButton;

	/* *************************************************************** */
	/* ********** LOCATORS In General Section ***************** */
	/* *************************************************************** */

	/* NV Fanconi Screener: Switch to Iframe */
	@FindBy(xpath = "//iframe[@id='gsft_main']")
	public WebElement nVFanconiScreenerIframe;

	/* NV Fanconi Screener: Proband Fanconi Screener preview record button */
	@FindBy(xpath = "(//button[@name='viewr.x_naci_family_coho_family_history_details.proband_screener'])[1]")
	public WebElement nVFanconiScreenerPreviewRecordButton;

	/* NV Fanconi Screener: Open record button */
	@FindBy(xpath = "(//a[normalize-space()='Open Record'])[1]")
	public WebElement nVOpenRecordButton;

	/* NV Fanconi Screener: Number */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.number'])[1]")
	public WebElement nVFanconiScreenerNumber;

	/* NV Fanconi Screener: Does the participant need legal representation */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.proxy_required'])[1]")
	public WebElement nVFanconiScreenerDoesParticipantNeedLegalRepresentation;

	/* NV Fanconi Screener: Study */
	@FindBy(xpath = "(//input[@name='sys_display.x_naci_family_coho_fanconi_study_screener.study'])[1]")
	public WebElement nVFanconiScreenerStudy;

	/* NV Fanconi Screener: Family Member Record */
	@FindBy(xpath = "(//input[@name='sys_display.x_naci_family_coho_fanconi_study_screener.family_member_record'])[1]")
	public WebElement nVFanconiScreenerFamilyMemberRecord;

	/* NV Fanconi Screener: Vital Status */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.person_alive'])[1]")
	public WebElement nVFanconiScreenerVitalStatus;

	/* NV Fanconi Screener: Date of death */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.death_date'])[1]")
	public WebElement nVFanconiScreenerDateOfDeath;

	/* NV Fanconi Screener: Eligibility Status */
	@FindBy(xpath = "(//select[@name='sys_readonly.x_naci_family_coho_fanconi_study_screener.family_member_record.eligibility_status'])[1]")
	public WebElement nVFanconiScreenerEligibilityStatus;

	/* NV Fanconi Screener: Enrollment Status */
	@FindBy(xpath = "(//select[@name='sys_readonly.x_naci_family_coho_fanconi_study_screener.family_member_record.enrollment_status'])[1]")
	public WebElement nVFanconiScreenerEnrollmentStatus;

	/* NV Fanconi Screener: Date Consent Requested */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.date_consent_requested'])[1]")
	public WebElement nVFanconiScreenerDateConsentRequested;

	/* NV Fanconi Screener: Consent Reminder Count */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.consent_reminder_count'])[1]")
	public WebElement nVFanconiScreenerConsentReminderCount;

	/* *************************************************************** */
	/* ********** LOCATORS In Contact Information Tab **************** */
	/* *************************************************************** */

	/* CONTACT INFO tab */
	@FindBy(xpath = "(//span[normalize-space()='Contact Info'])[1]")
	public WebElement nVFanconiScreenerContactInfoTab;

	/*
	 * CONTACT INFO tab->Are you the legal guardian of this person? DropDown
	 * 
	 * @FindBy(xpath = "") public WebElement
	 * nVFanconiScreenerAreYouTheLegalGuardianOfThisPerson;
	 * 
	 * CONTACT INFO tab->Legal Representative Name TextBox
	 * 
	 * @FindBy(xpath = "") public WebElement
	 * nVFanconiScreenerLegalRepresentativeName;
	 * 
	 * CONTACT INFO tab->What is your relationship to this person? DropDown
	 * 
	 * @FindBy(xpath = "") public WebElement
	 * nVFanconiScreenerWhatIsYourRelationshipToThisPerson;
	 * 
	 * 
	 * CONTACT INFO tab->Please specify your relationship to the participant
	 * DropDown
	 * 
	 * @FindBy(xpath = "") public WebElement
	 * nVFanconiScreenerSpecifyYourRelationshipToTheParticipant;
	 */

	/* CONTACT INFO tab->FirstName */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.first_name'])[1]")
	public WebElement nVFanconiScreenerFirstName;

	/* CONTACT INFO tab->MiddleName */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.middle_name'])[1]")
	public WebElement nVFanconiScreenerMiddleName;

	/* CONTACT INFO tab->LastName */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.last_name'])[1]")
	public WebElement nVFanconiScreenerLastName;

	/* CONTACT INFO tab->ProxyFirstName */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.proxy_first_name'])[1]")
	public WebElement nVFanconiScreenerProxyFirstName;

	/* CONTACT INFO tab->ProxyMiddleName */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.proxy_middle_name'])[1]")
	public WebElement nVFanconiScreenerProxyMiddleName;

	/* CONTACT INFO tab->ProxyLastName */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.proxy_last_name'])[1]")
	public WebElement nVFanconiScreenerProxyLastName;

	/* CONTACT INFO tab->Contact Street Address TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.street_address'])[1]")
	public WebElement nVFanconiScreenerStreetAddress;

	/* CONTACT INFO tab->Contact State TextBox */
	@FindBy(xpath = "")
	public WebElement nVFanconiScreenerState;

	/* CONTACT INFO tab->Contact City TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.city'])[1]")
	public WebElement nVFanconiScreenerCity;

	/* CONTACT INFO tab->Contact ZipCode TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.zipcode'])[1]")
	public WebElement nVFanconiScreenerZipcode;

	/* CONTACT INFO tab->Contact Country DropDown */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.country'])[1]")
	public WebElement nVFanconiScreenerCountry;

	/* CONTACT INFO tab->Contact Email TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.email_address'])[1]")
	public WebElement nVFanconiScreenerEmail;

	/* CONTACT INFO tab->Contact Home Phone TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.phone'])[1]")
	public WebElement nVFanconiScreenerHomePhone;

	/* CONTACT INFO tab->Contact Cell Phone TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.cell_phone'])[1]")
	public WebElement nVFanconiScreenerCellPhone;

	/* CONTACT INFO tab->Contact Work Phone TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.work_phone'])[1]")
	public WebElement nVFanconiScreenerWorkPhone;

	/* CONTACT INFO tab->Contact Contact Preferred Phone TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.preferred_phone'])[1]")
	public WebElement nVFanconiScreenerPreferredPhone;

	/* *************************************************************** */
	/* ********** LOCATORS In Demographic Tab ***************** */
	/* *************************************************************** */

	/* DEMOGRAPHICS tab */
	@FindBy(xpath = "(//span[normalize-space()='Demographics'])[1]")
	public WebElement nVFanconiScreenerDemographicsTab;

	/* DEMOGRAPHICS tab->Date of Birth iFrame */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.date_of_birth_month_day_year'])[1]")
	public WebElement nVFanconiScreenerDOB;

	/* DEMOGRAPHICS tab->Biological Gender? DropDown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.biological_gender'])[1]")
	public WebElement nVFanconiScreenerBiologicalGender;

	/* DEMOGRAPHICS tab->Identified gender? DropDown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.screener_identified_gender'])[1]")
	public WebElement nVFanconiScreenerIdentifiedGender;

	/* DEMOGRAPHICS tab->Participant Race (Select all that apply) */
	@FindBy(xpath = "(//p[contains(text(),'Caucasian (white), Black/African American, Native ')])[1]")
	public WebElement nVFanconiScreenerRace;

	/* DEMOGRAPHICS tab->Participant Race Other TextBox */
	@FindBy(xpath = "(//input[contains(@onchange,\"onChange('x_naci_family_coho_fanconi_study_screener.family_member_record.other_race');\")])[1]")
	public WebElement nVFanconiScreenerRaceOtherText;

	/* DEMOGRAPHICS tab->Is the participant adopted? DropDown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.adopted'])[1]")
	public WebElement nVFanconiScreenerIsTheParticipantAdopted;

	/* DEMOGRAPHICS tab->Ethnicity? DropDown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.ethnicity'])[1]")
	public WebElement nVFanconiScreenerEthnicity;

	/* DEMOGRAPHICS tab->Pronouns DropDown selected option */
	@FindBy(xpath = "(//select[contains(@name,'x_naci_family_coho_fanconi_study_screener.family_member_record.pronouns')])[1]")
	public WebElement nVFanconiScreenerPronouns;

	/* DEMOGRAPHICS tab - -> Other Pronouns textBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.family_member_record.pronouns_other'])[1]")
	public WebElement nVFanconiScreenerPronounsOtherText;

	/* *************************************************************** */
	/* ********** LOCATORS In Fanconi History Tab ***************** */
	/* *************************************************************** */

	/*
	 * Fanconi History tab->History of Fanconi anemia study involvement: DropDown
	 * selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.history_of_fanconi_anemia_study_involvement'])[1]")
	public WebElement nVFanconiScreenerHistoryOfFanconiAnemiaStudyInvolvement;

	/* Fanconi History tab->Fanconi anemia diagnosis?: DropDown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.fanconi_anemia_diagnosis'])[1]")
	public WebElement nVFanconiScreenerFanconiAnemiaDiagnosis;

	/* Fanconi History tab->Age at Fanconi diagnosis: TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.age_at_fanconi_diagnosis'])[1]")
	public WebElement nVFanconiScreenerAgeAtFanconiDiagnosis;

	/* Fanconi History tab->Date of Fanconi diagnosis: Date Picker */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.date_of_fanconi_diagnosis'])[1]")
	public WebElement nVFanconiScreenerDateOfFanconiDiagnosis;

	/* *************************************************************** */
	/* ********** LOCATORS In Genetic Testing History Tab *********** */
	/* *************************************************************** */

	/*
	 * Genetic Testing History tab->Complementation Testing previously done?
	 * Dropdown selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.complementation_testing_previously_done'])[1]")
	public WebElement nVFanconiScreenerIsComplementationTestingPreviouslyDone;

	/*
	 * Genetic Testing History tab->Genetic testing positive for Fanconi? Dropdown
	 * selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.genetic_testing_positive_for_fanconi'])[1]")
	public WebElement nVFanconiScreenerGeneticTestingPositiveForFanconi;

	/*
	 * Genetic Testing History tab->Does the participant have a copy of the genetic
	 * test results? Dropdown selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.genetic_test_result'])[1]")
	public WebElement nVFanconiScreenerDoesGeneticTestResultCopy;

	/*
	 * Genetic Testing History tab->Participants preferred method of delivering
	 * genetic test results: Dropdown selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.participants_preferred_method_of_delivering_genetic_test_results'])[1]")
	public WebElement nVFanconiScreenerGeneticTestResultsDeliveryMethod;

	/* *************************************************************** */
	/* ********** LOCATORS In FA Genes Tested Tab ***************** */
	/* *************************************************************** */

	/* FA Genes Tested tab->: FA Genes Tested CheckBoxes */
	@FindBy(xpath = "(//span[@class='input-group-checkbox'])")
	public List<WebElement> nVFanconiScreenerFAGenesTested;

	/* FA Genes Tested tab->: Other genes/syndromes : TextBox */
	@FindBy(xpath = "(//input[contains(@aria-label,'Other genes/syndromes')])[1]")
	public WebElement nVFanconiScreenerOtherGenesSyndrome;

	/* *************************************************************** */
	/* ********** LOCATORS In Medical History Tab ***************** */
	/* *************************************************************** */

	/*
	 * Medical History tab->: Ever diagnosed with Cancer? Dropdown selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.ever_diagnosed_with_cancer'])[1]")
	public WebElement nVFanconiScreenerEverDiagnosedWithCancer;

	/*
	 * Medical History tab->: Chromosome breakage test on blood: Dropdown selected
	 * option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.chromosome_breakage_test_on_blood'])[1]")
	public WebElement nVFanconiScreenerChromosomeBreakageTestOnBlood;

	/*
	 * Medical History tab->: Chromosome breakage test location Dropdown selected
	 * option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.chromosome_breakage_test_location'])[1]")
	public WebElement nVFanconiScreenerChromosomeBreakageTestLocation;

	/* Medical History tab->: Chromosome breakage result Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.chromosome_breakage_result'])[1]")
	public WebElement nVFanconiScreenerChromosomeBreakageResult;

	/*
	 * Medical History tab->: Chromosome breakage test on skin Dropdown selected
	 * option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.chromosome_breakage_test_on_skin'])[1]")
	public WebElement nVFanconiScreenerChromosomeBreakageTestOnSkin;

	/*
	 * Medical History tab->: Chromosome breakage skin test result Dropdown selected
	 * option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.chromosome_breakage_skin_test_result'])[1]")
	public WebElement nVFanconiScreenerChromosomeBreakageSkinTestResult;

	/*
	 * Medical History tab->: Chromosome Breakage Blood Test Result Delivery
	 * Dropdown selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.test_result_delivery_method'])[1]")
	public WebElement nVFanconiScreenerChromosomeBreakageBloodTestResultDelivery;

	/*
	 * Medical History tab->: Diagnosed with Myelodsplastic Syndrome (MDS) Dropdown
	 * selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.diagnosed_with_mylodsplastic_syndrome_mds'])[1]")
	public WebElement nVFanconiScreenerDiagnosedWithMyelodsplasticSyndrome;

	/* Medical History tab->: Age when myelodysplastic syndrome diagnosed Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.age_when_diagnosed_myelodysplastic_syndrome'])[1]")
	public WebElement nVFanconiScreenerAgeWhenMyelodysplasticSyndromeDiagnosed;

	/*
	 * Medical History tab->: Date when myelodysplastic syndrome diagnosed: Date
	 * Picker
	 */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.date_when_myelodysplastic_syndrome_diagnosed'])[1]")
	public WebElement nVFanconiScreenerDateWhenMyelodysplasticSyndromeDiagnosed;

	/*
	 * Medical History tab->: Ever received transplant (bone marrow/stem cell/ cord
	 * blood)? Dropdown selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.ever_received_transplant_bone_marrow_stem_cell_cord_blood'])[1]")
	public WebElement nVFanconiScreenerEverReceivedBoneMarrowTransplant;

	/*
	 * Medical History tab->: Transplant treatment institution (bone marrow/stem
	 * cell/ cord blood): Textbox
	 */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.transplant_treatment_institution_bone_marrow_stem_cell_cord_blood'])[1]")
	public WebElement nVFanconiScreenerTransplantTreatmentInstitution;

	/* Medical History tab->: Age at transplant : Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.age_at_transplant'])[1]")
	public WebElement nVFanconiScreenerAgeAtTransplant;

	/* Medical History tab->: Month of transplant: Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.month_of_transplant'])[1]")
	public WebElement nVFanconiScreenerMonthOfTransplant;

	/* Medical History tab->: Year of transplant: Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.year_of_transplant'])[1]")
	public WebElement nVFanconiScreenerYearOfTransplant;

	/* Medical History tab->: Donor type Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.transplant_donor_type'])[1]")
	public WebElement nVFanconiScreenerDonorType;

	/* Medical History tab->: Transplant donor match Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.transplant_donor_match'])[1]")
	public WebElement nVFanconiScreenerTransplantDonorMatch;

	/* Medical History tab->: Stem cell source Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.stem_cell_source'])[1]")
	public WebElement nVFanconiScreenerStemCellSource;

	/* Medical History tab->: Current Medications: Text */
	@FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.current_medications'])[1]")
	public WebElement nVFanconiScreenerCurrentMedications;

	/* Medical History tab->: Health Care Provider Name: Text */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.health_care_provider_name'])[1]")
	public WebElement nVFanconiScreenerHealthCarProviderName;

	/* Medical History tab->: Health Care Provider Address: Text */
	@FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.health_care_provider_address'])[1]")
	public WebElement nVFanconiScreenerHealthCareProviderAddress;

	/* Medical History tab->: Health Care Provider Phone Number: Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.health_care_provider_phone_number_text'])[1]")
	public WebElement nVFanconiScreenerHealthCareProviderPhoneNumber;

	/*
	 * Medical History tab->: Permission to contact Provider: Dropdown selected
	 * option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.permission_to_contact_provider'])[1]")
	public WebElement nVFanconiScreenerPermissionToContactProvider;

	/* Medical History tab->: Bone marrow failure? Dropdown selected option */
	@FindBy(xpath = "(//select[contains(@name,'x_naci_family_coho_fanconi_study_screener.bone_marrow_failure')])[1]")
	public WebElement nVFanconiScreenerBoneMarrowFailure;

	/* Medical History tab->: Bone marrow failure age at diagnosis: Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_age_at_diagnosis'])[1]")
	public WebElement nVFanconiScreenerBoneMarrowFailureAgeAtDiagnosis;

	/* Medical History tab->: Bone marrow failure month of diagnosis: Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_month_of_diagnosis'])[1]")
	public WebElement nVFanconiScreenerBoneMarrowFailureMonthOfDiagnosis;

	/* Medical History tab->: Bone marrow failure year of diagnosis: Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_year_of_diagnosis'])[1]")
	public WebElement nVFanconiScreenerBoneMarrowFailureYearOfDiagnosis;

	/*
	 * Medical History tab->: Bone marrow failure was treatment received? Dropdown
	 * selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_was_treatment_received'])[1]")
	public WebElement nVFanconiScreenerBoneMarrowFailureWasTreatmentReceived;

	/* Medical History tab->: Treatment: Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_treatment'])[1]")
	public WebElement nVFanconiScreenerTreatment;

	/*
	 * Medical History tab->: Received blood transfusions Dropdown selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.bone_anemia_lowbloodcount_received_blood_transfusions'])[1]")
	public WebElement nVFanconiScreenerReceivedBloodTransfusions;

	/* *************************************************************** */
	/* ********** LOCATORS In Participant Features Tab *************** */
	/* *************************************************************** */

	/* Participant Features tab->: Low birth weight Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.low_birth_weight'])[1]")
	public WebElement nVFanconiScreenerLowBirthWeight;

	/*
	 * Participant Features tab->: Feeding problems or Failure to thrive Dropdown
	 * selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.feeding_problems_or_failure_to_thrive'])[1]")
	public WebElement nVFanconiScreenerFeedingProblemsOrFailureToThrive;

	/* Participant Features tab->: Short stature Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.short_stature'])[1]")
	public WebElement nVFanconiScreenerShortStature;

	/*
	 * Participant Features tab->: Neurocognitive/ Developmental delay Dropdown
	 * selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.neurocognitive_developmental_delay'])[1]")
	public WebElement nVFanconiScreenerDevelopmentalDelay;

	/* Participant Features tab->: Skin abnormalities Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.skin_abnormalities'])[1]")
	public WebElement nVFanconiScreenerSkinAbnormalities;

	/*
	 * Participant Features tab->: Head/Craniofacial abnormalities Dropdown selected
	 * option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.head_craniofacial_abnormalities'])[1]")
	public WebElement nVFanconiScreenerHeadCraniofacialAbnormalities;

	/* Participant Features tab->: Mouth abnormalities Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.mouth_abnormalities'])[1]")
	public WebElement nVFanconiScreenerMouthAbnormalities;

	/* Participant Features tab->: Eye abnormalities Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.eye_abnormalities'])[1]")
	public WebElement nVFanconiScreenerEyeAbnormalities;

	/* Participant Features tab->: Ear abnormalities Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.ear_abnormalities'])[1]")
	public WebElement nVFanconiScreenerEarAbnormalities;

	/*
	 * Participant Features tab->: Extremity abnormalities Dropdown selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.extremity_abnormalities'])[1]")
	public WebElement nVFanconiScreenerExtremityAbnormalities;

	/* Participant Features tab->: Skeletal deformities Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.skeletal_deformities'])[1]")
	public WebElement nVFanconiScreenerSkeletalDeformities;

	/* Participant Features tab->: Heart problems Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.heart_problems'])[1]")
	public WebElement nVFanconiScreenerHeartProblems;

	/* Participant Features tab->: Heart problems other: Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.heart_problems_other'])[1]")
	public WebElement nVFanconiScreenerHeartProblemsOther;

	/* Participant Features tab->: Kidney abnormalities Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.kidney_abnormalities'])[1]")
	public WebElement nVFanconiScreenerKidneyAbnormalities;

	/* Participant Features tab->: Genital abnormalities Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.genital_abnormalities'])[1]")
	public WebElement nVFanconiScreenerGenitalAbnormalities;

	/*
	 * Participant Features tab->: Fertility problems, hypogonadism Dropdown
	 * selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.fertility_problems_hypogonadism'])[1]")
	public WebElement nVFanconiScreenerFertilityProblemsHypogonadism;

	/* Participant Features tab->: Endocrine problems Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.endocrine_problems'])[1]")
	public WebElement nVFanconiScreenerEndocrineProblems;

	/* Participant Features tab->: Metabolic disorders Dropdown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.metabolic_disorders'])[1]")
	public WebElement nVFanconiScreenerMetabolicDisorders;

	/* *************************************************************** */
	/* ********** LOCATORS In Final Information Tab ***************** */
	/* *************************************************************** */

	/*
	 * Final Information tab->: Participant in NIH Inherited Bone Marrow Failure
	 * Syndrome study? Dropdown selected option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.particpant_in_inherited_bone_marrow_study'])[1]")
	public WebElement nVFanconiScreenerParticpantInNIHInheritedBoneMarrowFailureSyndromeStudy;

	/*
	 * Final Information tab->: Main reasons for participating in this study? Select
	 * all that apply: Textbox
	 */
	@FindBy(xpath = "(//p[contains(text(),'Participate in research, Identify a diagnosis, Rec')])[1]")
	public WebElement nVFanconiScreenerMainReasonsForParticipatingInStudy;

	/* Final Information tab->: Participate in research: Textbox */
	@FindBy(xpath = "(//textarea[contains(@name,'x_naci_family_coho_fanconi_study_screener.participate_in_research')])[1]")
	public WebElement nVFanconiScreenerParticipateInResearch;

	/* Final Information tab->: Screen for potential cancer diagnosis: Textbox */
	@FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.screen_for_potential_cancer_diagnosis'])[1]")
	public WebElement nVFanconiScreenerScreenForPotentialCancerDiagnosis;

	/* Final Information tab->: Receive genetic testing: Textbox */
	@FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.receive_genetic_testing'])[1]")
	public WebElement nVFanconiScreenerReceiveGeneticTesting;

	/* Final Information tab->: Other reason for participation: Textbox */
	@FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.other_reason_for_participation'])[1]")
	public WebElement nVFanconiScreenerOtherReasonForParticipation;

	/* Final Information tab->: Previous studies: Textbox */
	@FindBy(xpath = "(//textarea[@name='x_naci_family_coho_fanconi_study_screener.previous_studies'])[1]")
	public WebElement nVFanconiScreenerPreviousStudies;

	/*
	 * Final Information tab->: How did you hear about this study? Dropdown selected
	 * option
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_fanconi_study_screener.hear_about_this_study'])[1]")
	public WebElement nVFanconiScreenerHowDidYouHearAboutThisStudy;

	/* Final Information tab->: Physician: Textbox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_fanconi_study_screener.physician'])[1]")
	public WebElement nVFanconiScreenerPhysician;

}
