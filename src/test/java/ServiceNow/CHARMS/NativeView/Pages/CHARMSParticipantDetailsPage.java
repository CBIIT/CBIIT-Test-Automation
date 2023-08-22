package ServiceNow.CHARMS.NativeView.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CHARMSParticipantDetailsPage extends CommonUtils {
	
    /*
     * USE THIS METHOD TO DYNAMICALLY LOCATE RECORD BUTTONS ON
     * @param text
     * @return
     */
	  public static WebElement dynamicPreviewButtonLocator1(String text) {
		  return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::tr/td[2]"));
	        
	    }
	  
	  public static WebElement dynamicPreviewButtonLocator(String text) {
		  return WebDriverUtils.webDriver.findElement(By.xpath("(//a[normalize-space()='" + text + "'])[1]"));
		  	        
	    }
	  
	  // //table/tbody[@class='list2_body']/child::tr/td[3]//a[normalize-space()='Fanconi-2 tester-2']
	  //(//a[normalize-space()='Fanconi-3 tester-3'])[1]

	/* VERIFIES DATA In Participant Details Page */

	public CHARMSParticipantDetailsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	/* *************************************************************** */
	/* VERIFIES NAVIGATION PANEL */
	/* *************************************************************** */
	
	/* CHARMS Navigation-> All Participant Details in Navigation Panel */
	@FindBy(xpath = "(//span[@class='nav-favorite-title ng-binding'][normalize-space()='Families'])[1]")
	public static WebElement nVFamiliesLinkInNavigator;
	
	
	/* CHARMS Navigation-> All Participant Details in Navigation Panel */
	@FindBy(xpath = "(//span[normalize-space()='All Participant Details'])[1]")
	public static WebElement nVAllParticipantDetailsLinkInNavigator;
	
	/* CHARMS Navigation-> All Participant Details in Navigation Panel */
	@FindBy(xpath = "(//div[@id='gsft_nav']//a[.='All Participant Details'])[1]")
	public static WebElement nVAllParticipantDetailsLinkInNavigator1;
	
	/* CHARMS Navigation-> All Participant Details Back Button */
	@FindBy(xpath = "(//button[@aria-label='Back'])[1]")
	public static WebElement nVAllParticipantDetailsBackButton;
	

	/* *************************************************************** */
	/* VERIFIES PARTICIPANT DETAILS LIST VIEW */
	/* *************************************************************** */
	
	/* Participant List View-> iFrame */
	@FindBy(xpath = "//iframe[@id='gsft_main']")
	public static WebElement nVParticipantDetailsListViewiFrame;
	
	@FindBy(xpath = "//iframe[@id='templateIframe']")
	public static WebElement nVParticipantDetailsListViewNavigatoriFrame;
	
	/* *************************************************************** */
	/* VERIFIES GENERAL INFORMATION DATA */
	/* *************************************************************** */

	/* Participant--> Subject ID TextBox */
	@FindBy(xpath = "(//input[@aria-label='Subject ID'])[1]")
	public WebElement nVParticipantSubjectID;

	/* Participant--> Name TextBox */
	@FindBy(xpath = "(//input[@aria-label='Name'])[1]")
	public WebElement nVParticipantName;

	/* Participant--> Generation ID TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.generation_id'])[1]")
	public WebElement nVParticipantGenerationID;

	/* Participant--> Family Member ID TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.family_member_id'])[1]")
	public WebElement nVParticipantFamilyMemberID;
	
	/* Participant--> May we have your permission to contact this relative? DropDown */
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_family_history_details.permission_to_contact'])[1]")
	public WebElement nVpermissionToContactThisRelative;
	
	/* Participant--> May we have your permission to contact this relative? DropDown */
	@FindBy(xpath = "(//select[@id='sys_readonly.x_naci_family_coho_family_history_details.enrollment_status'])[1]")
	public WebElement nVpermissionEnrollmentStatus;


	/*
	 * Participant--> May we have your permission to contact this relative? DropDown
	 */
//	@FindBy(xpath = "(//select[@id='x_naci_family_coho_family_history_details.permission_to_contact'])[1]")
//	public WebElement nVParticipantPermissionToContactRelative;

	/* Participant--> Study */
	@FindBy(xpath = "(//input[@name='sys_display.x_naci_family_coho_family_history_details.family.study'])[1]")
	public WebElement nVParticipantStudy;

	/* Participant--> Eligibility Status */
	@FindBy(xpath = "//select[contains(@name,'sys_readonly.x_naci_family_coho_family_history_details.eligibility_status')]")
	public WebElement nVParticipantEligibilityStatus;

	/* Participant--> Enrollment Status */
	@FindBy(xpath = "(//select[@id='sys_readonly.x_naci_family_coho_family_history_details.enrollment_status'])[1]")
	public WebElement nVParticipantEnrollmentStatus;

	/* Participant--> Referral */
	@FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_family_history_details.proband_screener'])[1]")
	public WebElement nVParticipantReferral;

	/* Participant--> Assigned To */
	@FindBy(xpath = "(//input[contains(@name,'sys_display.x_naci_family_coho_family_history_details.assigned_to')])[1]")
	public WebElement nVParticipantAssignedTo;

	/* *************************************************************** */
	/* VERIFIES PERSONAL INFORMATION DATA */
	/* *************************************************************** */

	/* PERSONAL INFORMATION tab */
	@FindBy(xpath = "(//span[normalize-space()='Personal Information'])[1]")
	public WebElement nVParticipantPersonalInformationTab;

	/* PERSONAL INFORMATION tab-> RelationshipToYou DropDown option selected */
	@FindBy(xpath = "(//select[contains(@name,'x_naci_family_coho_family_history_details.relationship_to_you')])[1]")
	public WebElement nVParticipantPersonalInformationTabRelationshipToYou;

	/* PERSONAL INFORMATION tab- -> FirstName */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.first_name'])[1]")
	public WebElement nVParticipantPersonalInformationTabFirstName;

	/* PERSONAL INFORMATION tab-> MiddleName */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.middle_name'])[1]")
	public WebElement nVParticipantPersonalInformationTabMiddleName;

	/* PERSONAL INFORMATION tab-> LastName */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.last_name'])[1]")
	public WebElement nVParticipantPersonalInformationTabLastName;

	/* *************************************************************** */
	/* ***************** VERIFIES DEMOGRAPHICS DATA ************ */
	/* *************************************************************** */

	/* DEMOGRAPHICS tab */
	@FindBy(xpath = "(//span[normalize-space()='Demographics'])[1]")
	public WebElement nVParticipantDemographicsTab;

	/* DEMOGRAPHICS tab-> Biological Gender? DropDown selected option */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.biological_gender'])[1]")
	public WebElement nVParticipantDemographicsTabBiologicalGender;

	/* DEMOGRAPHICS tab-> Participants identified gender? DropDown */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.screener_identified_gender'])[1]")
	public WebElement nVParticipantDemographicsTabIdentifiedGender;

	/* DEMOGRAPHICS tab-> Participant Race (Select all that apply) */
	@FindBy(xpath = "(//button[@aria-labelledby='x_naci_family_coho_family_history_details.race_title_text'])[1]")
	public WebElement nVParticipantDemographicsTabRace;

	
	/* DEMOGRAPHICS tab-> Participant Race  details (Select all that apply) */
	@FindBy(xpath = "(//p[@id='x_naci_family_coho_family_history_details.race_nonedit'])[1]")
	public WebElement nVParticipantDemographicsTabRaceDetails;
			
	/* DEMOGRAPHICS tab-> Participant Race Other TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.other_race'])[1]")
	public WebElement nVParticipantDemographicsTabRaceOtherText;

	/* DEMOGRAPHICS tab-> Ethnicity? DropDown */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.ethnicity'])[1]")
	public WebElement nVParticipantDemographicsTabEthnicity;

	/* DEMOGRAPHICS tab-> Pronouns DropDown */
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_family_history_details.pronouns'])[1]")
	public WebElement nVParticipantDemographicsTabPronouns;

	/* DEMOGRAPHICS tab-> Other Pronouns textBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.pronouns_other'])[1]")
	public WebElement nVParticipantDemographicsTabPronounsOtherText;

	/* DEMOGRAPHICS tab-> Is the participant adopted? DropDown */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.adopted'])[1]")
	public WebElement nVParticipantDemographicsTabIsTheParticipantAdopted;

	/* DEMOGRAPHICS tab-> Date of Birth iFrame */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.date_of_birth_month_day_year'])[1]")
	public WebElement nVParticipantDemographicsTabDOB;

	/*
	 * DEMOGRAPHICS tab-> If Date of Birth is unkown, is this person 18 years old or
	 * older ? DropDown
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.if_date_of_birth_is_unkown_is_this_person_18_years_old_or_older'])[1]")
	public WebElement nVParticipantDemographicsTabIfDOBUnknownAge18;

	/* DEMOGRAPHICS tab-> Age */
	@FindBy(xpath = "(//input[@aria-label='Age'])[1]")
	public WebElement nVParticipantDemographicsTabtAge;

	/* *************************************************************** */
	/* VERIFIES CONTACT INFO DATA */
	/* *************************************************************** */

	/* CONTACT INFO tab */
	@FindBy(xpath = "(//span[normalize-space()='Contact Info'])[1]")
	public WebElement nVParticipantContactInfoTab;

	/*
	 * CONTACT INFO tab-> Does the participant need legal representation? DropDown
	 */
	@FindBy(xpath = "(//select[contains(@name,'x_naci_family_coho_family_history_details.proxy_required')])[1]")
	public WebElement nVParticipantContactInfoTabDoesParticipantNeedLegalRepresentation;

	/* CONTACT INFO tab-> Are you the legal guardian of this person? DropDown */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.legal_guardian'])[1]")
	public WebElement nVParticipantContactInfoTabAreYouTheLegalGuardianOfThisPerson;

	/* CONTACT INFO tab-> Legal Representative Name TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.legal_representative_name'])[1]")
	public WebElement nVParticipantContactInfoTabLegalRepresentativeName;

	/* CONTACT INFO tab-> What is your relationship to this person? DropDown */
	@FindBy(xpath = "//select[@name=\"x_naci_family_coho_family_history_details.relationship\"]//option[@selected=\"SELECTED\"]")
	public WebElement nVParticipantContactInfoTabWhatIsYourRelationshipToThisPerson;

	/*
	 * CONTACT INFO tab-> Please specify your relationship to the participant
	 * DropDown
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.relationship'])[1]")
	public WebElement nVParticipantContactInfoTabSpecifyYourRelationshipToTheParticipant;

	/* CONTACT INFO tab-> Contact Street Address TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.street_address'])[1]")
	public WebElement nVParticipantContactInfoTabStreetAddress;

	/* CONTACT INFO tab-> Contact State TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.state'])[1]")
	public WebElement nVParticipantContactInfoTabState;

	/* CONTACT INFO tab-> Contact City TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.city'])[1]")
	public WebElement nVParticipantContactInfoTabCity;

	/* CONTACT INFO tab-> Contact Country DropDown */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.country'])[1]")
	public WebElement nVParticipantContactInfoTabCountry;

	/* CONTACT INFO tab-> Contact ZipCode TextBox */
	@FindBy(xpath = "//input[@name=\"x_naci_family_coho_family_history_details.zipcode\"]")
	public WebElement nVParticipantContactInfoTabZipcode;

	/* CONTACT INFO tab-> Contact Email TextBox */
	@FindBy(xpath = "(//input[@id='x_naci_family_coho_family_history_details.email_address'])[1]")
	public WebElement nVParticipantContactInfoTabEmail;

	/* CONTACT INFO tab-> Contact Home Phone TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.phone'])[1]")
	public WebElement nVParticipantContactInfoTabHomePhone;

	/* CONTACT INFO tab-> Contact Cell Phone TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.cell_phone'])[1]")
	public WebElement nVParticipantContactInfoTabCellPhone;

	/* CONTACT INFO tab-> Contact Work Phone TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.work_phone'])[1]")
	public WebElement nVParticipantContactInfoTabWorkPhone;

	/* CONTACT INFO tab-> Contact Contact Preferred Phone TextBox */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_family_history_details.preferred_phone'])[1]")
	public WebElement nVParticipantContactInfoTabPreferredPhone;

	/* *************************************************************** */
	/* VERIFIES MEDICAL INFORMATION DATA */
	/* *************************************************************** */

	/* MEDICAL INFORMATION tab */
	@FindBy(xpath = "(//span[normalize-space()='Medical Information'])[1]")
	public WebElement nVParticipantMedicalInfoTab;

	/*
	 * MEDICAL INFORMATION tab-> Has a physician ever diagnosed this participant
	 * with cancer? DropDown
	 */
	@FindBy(xpath = "(//select[contains(@name,'x_naci_family_coho_family_history_details.has_cancer')])[1]")
	public WebElement nVParticipantMedicalInfoTabParticipantDiagnosedWithCancer;

	/*
	 * MEDICAL INFORMATION tab-> Has the participant ever had genetic testing?
	 * DropDown
	 */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.genetic_testing'])[1]")
	public WebElement nVParticipantMedicalInfoTabEverHadGeneticTesting;

	/* MEDICAL INFORMATION tab-> Vital Status? DropDown */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.person_alive'])[1]")
	public WebElement nVParticipantMedicalInfoTabVitalStatus;

	/* MEDICAL INFORMATION tab-> Cohort DropDown */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_family_history_details.cohort'])[1]")
	public WebElement nVParticipantMedicalInfoTabCohort;

	/* *************************************************************** */
	/* VERIFIES CANCER HISTORY TAB DATA */
	/* *************************************************************** */

	/* CANCER HISTORY tab-> */
	@FindBy(xpath = "(//div[@id='tabs2_list']//span[@class='tab_header']/child::span)[1]")
	public WebElement nVParticipantCancerHistoryTab;

	/* CANCER HISTORY tab-> Participant Cancer History Tab Iframe */
	@FindBy(xpath = "//iframe[@id='gsft_main']")
	public WebElement nVParticipantCancerHistoryTabIframe;

	/* CANCER HISTORY tab-> Preview Button */
	@FindBy(xpath = "//tr[@record_class='x_naci_family_coho_mock_up_intake_patient_cancer']//td[@class='list_decoration_cell col-small col-center ']")
	public WebElement nVParticipantCancerHistorytabPreviewButton;

	/* CANCER HISTORY tab-> Preview Open Record Button */
	@FindBy(xpath = "(//a[normalize-space()='Open Record'])[1]")
	public WebElement nVParticipantCancerHistorytabPreviewOpenRecordButton;

	/* CANCER HISTORY tab-> Tumor Type */
	@FindBy(xpath = "(//input[@name='sys_display.x_naci_family_coho_mock_up_intake_patient_cancer.tumor_type'])[1]")
	public WebElement nVParticipantCancerHistorytabTumorType;

	/* CANCER HISTORY tab-> Month of diagnosis */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_mock_up_intake_patient_cancer.month_of_diagnosis'])[1]")
	public WebElement nVParticipantCancerHistorytabMonthOfDiagnosis;

	/* CANCER HISTORY tab-> Year of diagnosis */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_mock_up_intake_patient_cancer.year_of_diagnosis'])[1]")
	public WebElement nVParticipantCancerHistorytabYearOfDiagnosis;

	/*
	 * CANCER HISTORY tab-> How old was the research participant when the cancer was
	 * diagnosed?
	 */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_mock_up_intake_patient_cancer.age_in_years_at_diagnosis'])[1]")
	public WebElement nVParticipantCancerHistorytabHowOldParticipantWhenCancerDiagnosed;

	/* CANCER HISTORY tab-> Currently being treated */
	@FindBy(xpath = "(//select[@name='x_naci_family_coho_mock_up_intake_patient_cancer.currently_being_treated'])[1]")
	public WebElement nVParticipantCancerHistorytabCurrentlyBeingTreated;

	/* CANCER HISTORY tab-> Treatment Institution */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_mock_up_intake_patient_cancer.treatment_institution'])[1]")
	public WebElement nVParticipantCancerHistorytabTreatmentInstitution;

	/* CANCER HISTORY tab-> Treatment Institution */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_mock_up_intake_patient_cancer.treating_physician'])[1]")
	public WebElement nVParticipantCancerHistorytabTreatingPhysician;

	/* CANCER HISTORY tab-> Name of institution or clinic where biopsy occurred */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_mock_up_intake_patient_cancer.biopsy_institution'])[1]")
	public WebElement nVParticipantCancerHistorytabInstitutionNameWhereBiopsyOccured;

	/* CANCER HISTORY tab-> Name of physician who performed the biopsy */
	@FindBy(xpath = "(//input[@name='x_naci_family_coho_mock_up_intake_patient_cancer.biopsy_physician'])[1]")
	public WebElement nVParticipantCancerHistorytabPhysicianWhoPerformedBiopsy;

	/* CANCER HISTORY tab-> Back Button */
	@FindBy(xpath = "//button[@aria-label=\"Back\"]")
	public WebElement nVParticipantIntakeFormBackButton;

	/* *************************************************************** */
	/* VERIFIES GENETIC HISTORY TAB DATA */
	/* *************************************************************** */

	@FindBy(xpath = "//span[@aria-controls = 'x_naci_family_coho_fanconi_study_screener.x_naci_family_coho_genetic_mutation_variant.screener_list']")
	public WebElement nVParticipantGeneticHistoryTab;

	/* *************************************************************** */
	/* VERIFIES CONSENT PAGE DATA */
	/* *************************************************************** */
	
	/* Consent  */
	
	@FindBy(xpath = "(//button[@id='study_panel_review'])[1]")
	public WebElement nVParticipantSubmitForEligibilityReviewButton;

	@FindBy(xpath = "(//button[@id='mark_eligible'])[1]")
	public WebElement nVParticipantMarkEligibleButton;
		
	//Hold/Non-Participant Date Text Box
		@FindBy(xpath = "(//input[@id='x_naci_family_coho_family_history_details.u_participantdate'])[1]")
		public WebElement nVParticipantHoldDateTextBox;
		
		//Hold/Non-Participant Date Button
		@FindBy(xpath = "(//span[@class='icon icon-calendar'])[3]")
		public WebElement nVParticipantHoldDateButton;
		
		//Hold/Non-Participant Date Button
		@FindBy(xpath = "(//td[@aria-label='Go to Today'])[1]")
		public WebElement nVParticipantHoldGoToTodayButton;
		
	@FindBy(xpath = "(//span[normalize-space()='Consents (1)'])[1]")
	public WebElement nVParticipantConsentTableTab;

	@FindBy(xpath = "(//tbody[@class='list2_body']//tr/td[2])[1]")
	public WebElement nVParticipantConsentTablePreviewLink;

	@FindBy(xpath = "(//a[normalize-space()='Open Record'])[1]")
	public WebElement nVParticipantOpenRecordButton;

	@FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_fcsms_consent.family_member'])[1]")
	public WebElement nVParticipantFamilyMemberTextBox;

	// Consent call scheduled time
	@FindBy(xpath = "(//input[@id='x_naci_family_coho_fcsms_consent.consent_call_scheduled_time'])[1]")
	public WebElement nVParticipantConsentCallScheduledTimeTextBox;

	// Consent call Date time Icon
	@FindBy(xpath = "(//span[@class='icon-calendar icon'])[1]")
	public WebElement nVParticipantTimeIcon;
	
	// Consent call scheduled time-->Go to today Date link
	@FindBy(xpath = "(//td[@aria-label='Go to Today'])[1]")
	public WebElement nVParticipantGoToToday;
	
	// Consent call Date time Icon Close Button
	@FindBy(xpath = "(//button[@id='GwtDateTimePicker_ok'])[1]")
	public WebElement nVParticipantTimeIconOkButton;
	
	// Consent Call Date
	@FindBy(xpath = "(//input[@id='x_naci_family_coho_fcsms_consent.consent_call_date'])[1]")
	public WebElement nVParticipantConsentCallDatesTextBox;
	
	// Consent call Date time Icon
	@FindBy(xpath = "(//span[contains(@class,'icon icon-calendar')])[2]")
	public WebElement nVParticipantTimeIcon1;

	// Cohort
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.family_member.cohort'])[1]")
	public WebElement nVParticipantCohortTextBox;

	// Consent Form
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.consent_form'])[1]")
	public WebElement nVParticipantConsentFormDropDown;

	// Consent Version
	@FindBy(xpath = "(//input[@id='x_naci_family_coho_fcsms_consent.consent_version'])[1]")
	public WebElement nVParticipantConsentVersionTextBox;

	// Consent Type
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.consent_type'])[1]")
	public WebElement nVParticipantConsentTypeDropDown;
	
	// Consent call Date time Icon
	@FindBy(xpath = "(//span[@class='icon icon-calendar'])[3]")
	public WebElement nVParticipantTimeIcon3;

	// Response Type
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.response_type'])[1]")
	public WebElement nVParticipantResponseTypeDropDown;

	// Consent Status
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.status'])[1]")
	public WebElement nVParticipantConsentStatusTextBox;

	// Consent Date
	@FindBy(xpath = "(//input[@id='x_naci_family_coho_fcsms_consent.consent_date'])[1]")
	public WebElement nVParticipantConsentDateTextBox;
	
	// Consent Date Date time Icon
	@FindBy(xpath = "(//span[@class='icon icon-calendar'])[4]")
	public WebElement nVParticipantTimeIcon4;

	// Consent By
	@FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_fcsms_consent.consent_by'])[1]")
	public WebElement nVParticipantConsentByTextBox;

	// Current/Previous
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.current_previous'])[1]")
	public WebElement nVParticipantCurrentPreviousDropDown;

	// Study
	@FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_fcsms_consent.study'])[1]")
	public WebElement nVParticipantStudyTextBox;

	// Consent/Assent Status
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.participant_response'])[1]")
	public WebElement nVParticipantConsentAssentStatusDropDown;

	// Interpreter used?
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.interpreter_used'])[1]")
	public WebElement nVParticipantInterpreterUsedDropDown;

	// Future Use of Specimens and Data by NIH
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.future_use_of_specimens_and_data_by_nih'])[1]")
	public WebElement nVParticipantFutureUseOfSpecimensAndDataByNIHDropDown;

	// Future Use by Collaborators
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.future_use_by_collaborators'])[1]")
	public WebElement nVParticipantFutureUseByCollaboratorsDropDown;

	// Future Identifiable Use by Collaborators
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.future_identifiable_use_by_collaborators'])[1]")
	public WebElement nVParticipantFutureIdentifiableUseByCollaboratorsDropDown;

	// Return of Genetic Findings
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.return_of_genetic_findings'])[1]")
	public WebElement nVParticipantReturnOfGeneticFindingsDropDown;

	// Participant Assent
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.participant_assent'])[1]")
	public WebElement nVParticipantParticipantAssentDropDown;

	// Participant Consent
	@FindBy(xpath = "(//select[@id='x_naci_family_coho_fcsms_consent.participant_consent'])[1]")
	public WebElement nVParticipantParticipantConsentDropDown;

	// Call Complete Button
	@FindBy(xpath = "(//button[@id='call_complete'])[1]")
	public WebElement nVParticipantCallCompleteButton;

	//Attachment button
	@FindBy(xpath = "(//button[@id='header_add_attachment'])[1]")
	public WebElement nVParticipantAttachmentButton;

	//Choose File
	@FindBy(xpath = "(//input[@id='loadFileXml'])[1]")
	public WebElement nVParticipantChooseFileButton;

	@FindBy(xpath = "(//button[@id='hard_consent_received'])[1]")
	public WebElement nVParticipantHardCopyOfConsentReceivedButton;
	
}