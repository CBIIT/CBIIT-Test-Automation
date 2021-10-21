package AnalysisTools.CEDCD.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.web.CommonUtils;

public class CEDCDCohortPage extends CommonUtils {

	/**
	 * ========================= Login.gov WebElements
	 * =================================
	 */
/** Adding line, losing sleep */
	
	/** ADD SECOND LINE */
	
	/** Username for Login.gov */
	@FindBy(xpath = "//input[@id = 'user_email']")
	public WebElement cohortUsername;

	/** Password for Login.gov */
	@FindBy(xpath = "//input[@id = 'user_password']")
	public WebElement cohortPassword;

	/** Sign in button for Login.gov */
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement signinButton;
	
	/** =============== Cohort Selection  ================= */
	
	/** Cohort Selection Down Arrow **/
	@FindBy(xpath = "//*[@class=' css-tlfecz-indicatorContainer']")
	public WebElement cohortSelectionDownArrow; 
	
	/** Cohort Selection Text Box **/
	@FindBy(xpath = "//*[@class=' css-1hwfws3']")
	public WebElement  cohortSelectionTextBox; 
	
	/** =============== Questionnaire Section A ================= */

	/** =============== Cohort Information Section ===================== */

	/** Cohort Information section tab */
	@FindBy(xpath = "//button[contains(text(),'Cohort Information')]")
	public WebElement cohortInformationTab;

	/** A2 Cohort's Description text box */
	@FindBy(xpath = "//div/textarea[@placeholder = 'Max of 5000 characters']")
	public WebElement a2TextBox;

	/**  */
	@FindBy(xpath = "(//input[@placeholder='Max of 200 characters'])[1]")
	public WebElement a3TextBox;

	/** A4a Cohort Name */
	@FindBy(xpath = "//input[@name='completerName']")
	public WebElement a4aName;

	/** A4a Position with Cohort */
	@FindBy(xpath = "//input[@name='completerPosition']")
	public WebElement a4aCohortPosition;

	/** A4a Country code/Area number */
	@FindBy(xpath = "(//input[@title='country code'])[1]")
	public WebElement a4aCountryCode;

	/** A4a Phone number */
	@FindBy(xpath = "//input[@name='completerPhone']")
	public WebElement a4aPhone;

	/** A4a Email */
	@FindBy(xpath = "//input[@name='completerEmail']")
	public WebElement a4aEmail;

	/** A4b Is this the same person who completed this form radio no button */
	@FindBy(xpath = "//input[@id='clarification-contact-radio-no']")
	public WebElement a4bRadioButtonNo;

	/** A4b Is this the same person who completed this form radio button yes */
	@FindBy(xpath = "//input[@id='clarification-contact-radio-yes']")
	public WebElement a4bRadioButtonYes;

	/** A4b Cohort Name Textbox */
	@FindBy(xpath = "//input[@name='contacterName']")
	public WebElement a4bName;

	/** A4b Position with Cohort Textbox */
	@FindBy(xpath = "//input[@name='contacterPosition']")
	public WebElement a4bCohortPosition;

	/** A4b Country code/Area number Textbox */
	@FindBy(xpath = "(//input[@title='country code'])[2]")
	public WebElement a4bCountryCode;

	/** A4b Phone number Textbox */
	@FindBy(xpath = "//input[@name='contacterPhone']")
	public WebElement a4bPhone;

	/** A4b Email Textbox */
	@FindBy(xpath = "//input[@name='contacterEmail']")
	public WebElement a4bEmail;

	/** =============== Principal Investigator Section ===================== */

	/** Principal Investigator section tab */
	@FindBy(xpath = "//button[contains(text(),'Principal Investigators')]")
	public WebElement principalInvestigatorTab;

	/** A5 Add New Investigator button */
	@FindBy(xpath = "//button[contains(text(),'Add New Investigator')]")
	public WebElement addNewInvestigator;

	/** A5 Cohort Principal Investigators Name Textbox */
	@FindBy(xpath = "//input[@name='investigator_name_0']")
	public WebElement a5InvestigatorsName;

	/** A5 Cohort Principal Investigators Institutions Textbox */
	@FindBy(xpath = "//input[@name='investigator_inst_0']")
	public WebElement a5InvestigatorsInstitution;

	/** A5 Cohort Principal Investigators Email Textbox */
	@FindBy(xpath = "//input[@name='investigator_email_0']")
	public WebElement a5InvestigatorsEmails;

	/**
	 * A6 If an investigator is interested in collaborating with your cohort on a
	 * new project, whom should they contact?
	 */
	// something that isn't automated is adding more than one principal
	// investigators -- clarification is needed if automation is necessary for more
	// than 1 PI

	/** Same as the person who completed the form(4a) */
	@FindBy(xpath = "//input[@id='default-completerName-check']")
	public WebElement sameAs4aCheckbox;

	/** Same as the person who completed the form(4b) */
	@FindBy(xpath = "//input[@id='default-contacterName-check']")
	public WebElement sameAs4bCheckbox;

	/** A6 Collaborator's Name Textbox */
	@FindBy(xpath = "//input[@name='collaboratorName']")
	public WebElement collaboratorName;

	/** A6 Collaborator's Position with Cohort Textbox */
	@FindBy(xpath = "//input[@name='collaboratorPosition']")
	public WebElement collaboratorPosition;

	/** A6 Collaborator's Phone Number's Country Code Textbox */
	@FindBy(xpath = "(//input[@title='country code'])[3]")
	public WebElement collaboratorCountryCode;

	/** A6 Collaborator's Phone Number Textbox */
	@FindBy(xpath = "//input[@name='collaboratorPhone']")
	public WebElement collaboratorPhone;

	/** A6 Collaborator's Emails Textbox */
	@FindBy(xpath = "//input[@name='collaboratorEmail']")
	public WebElement collaboratorEmail;

	/** =============== Eligibility & Enrollment Section ===================== */

	/** Eligibility & Enrollment section tab */
	@FindBy(xpath = "//button[contains(text(),'Eligibility & Enrollment')]")
	public WebElement eligibilityAndEnrollmentTab;

	/** A7 Eligibility Criteria's Eligible Sex radio button */
	@FindBy(xpath = "//label[contains(text(), 'All')]")
	public WebElement eligibleSexAllValue;

	/** A7 Eligibility Criteria's Eligible Sex radio button */
	@FindBy(xpath = "//label[contains(text(), 'Males only')]")
	public WebElement eligibleSexMaleOnlyValue;

	/** A7 Eligibility Criteria's Eligible Sex radio button */
	@FindBy(xpath = "//label[contains(text(), 'Females only')]")
	public WebElement eligibleSexFemaleOnlyValue;

	/** A7 Baseline population consists of Check box */
	@FindBy(xpath = "//label[contains(text(), 'Cancer survivors only, specify cancer site(s)')]")
	public WebElement baselinePopulationCheckbox;

	/** A7 Baseline population consists of Text box */
	@FindBy(xpath = "//input[@name='cancerSites']")
	public WebElement baselinePopulationTextbox;

	/**
	 * A7 Please specify any eligibility criteria in addition to age and sex Textbox
	 */
	@FindBy(xpath = "//input[@name='eligible_disease_other_specify']")
	public WebElement eligibilityDiseaseOtherSpecifyTextbox;

	/** A8 Total number of subject's enrolled to date textbox */
	@FindBy(xpath = "//input[@name='enrollment_total']")
	public WebElement enrollmentTotal;

	/** A8 Started in year textbox */
	@FindBy(xpath = "//input[@name='enrollment_year_start']")
	public WebElement startedInYear;

	/** A8 is enrollment ongoing No radio button */
	@FindBy(xpath = "//input[@id='enrollment-ongoing-radio-no']")
	public WebElement enrollmentOngoingNoRadio;

	/** A8 is enrollment ongoing Yes radio button */
	@FindBy(xpath = "//input[@id='enrollment-ongoing-radio-yes']")
	public WebElement enrollmentOngoingYesRadio;

	/** A8 Ended in Year only applicable if No is selected */
	@FindBy(xpath = "//input[@name='enrollment_year_end']")
	public WebElement endedInYear;

	/** A8 Ended in Year only applicable if Yes is selected */
	@FindBy(xpath = "//input[@name='enrollment_target']")
	public WebElement targetNumberPlannedToEnroll;

	/** A8 Ended in Year only applicable if Yes is selected */
	@FindBy(xpath = "//input[@name='enrollment_year_complete']")
	public WebElement targetCountCompletionYear;

	/** A8 Baseline Age range of enrolled subjects minimum value */
	@FindBy(xpath = "//input[@name='enrollment_age_min']")
	public WebElement enrollmentAgeMin;

	/** A8 Baseline Age range of enrolled subjects maximum value */
	@FindBy(xpath = "//input[@name='enrollment_age_max']")
	public WebElement enrollmentAgeMax;

	/** A8 Baseline Median Age */
	@FindBy(xpath = "//input[@name='enrollment_age_median']")
	public WebElement enrollmentMedianAge;

	/** A8 Baseline Mean Age */
	@FindBy(xpath = "//input[@name='enrollment_age_mean']")
	public WebElement enrollmentMeanAge;

	/** A8 Current Age range of enrolled participants minimum value */
	@FindBy(xpath = "//input[@name='current_age_min']")
	public WebElement currentAgeMin;

	/** A8 Current Age range of enrolled participants maximum value */
	@FindBy(xpath = "//input[@name='current_age_max']")
	public WebElement currentAgeMax;

	/** A8 Current Median Age */
	@FindBy(xpath = "//input[@name='current_age_median']")
	public WebElement currentMedianAge;

	/** A8 Current Mean Age */
	@FindBy(xpath = "//input[@name='current_age_mean']")
	public WebElement currentMeanAge;

	/** =============== Recruitment Section ===================== */

	/** Recruitment Section Tab */
	@FindBy(xpath = "//button[contains(text(),'Recruitment')]")
	public WebElement recruitmentTab;

	/**
	 * A9 Specify the frequency of questionnaires, e.g, annually, every 2 years etc.
	 * text box
	 */
	@FindBy(xpath = "(//div[@class='col-sm-12']/input[@placeholder='Max of 200 characters'])[2]")
	public WebElement questionnaireFrequency;

	/** A10 Most recent year questionnaire data was collected? text box */
	@FindBy(xpath = "//input[@name='most_recent_year']")
	public WebElement mostRecentYear;

	/** A11 In person value */
	@FindBy(xpath = "//label[contains(text(),'In person')]")
	public WebElement a11InPerson;

	/** A11 Phone Interview value */
	@FindBy(xpath = "//label[contains(text(),'Phone interview')]")
	public WebElement a11PhoneInterview;

	/** A11 Self Administered via paper value */
	@FindBy(xpath = "//label[contains(text(),'Self-administered via paper')]")
	public WebElement a11AdministeredViaPaper;

	/** A11 Self Administered via web based device value */
	@FindBy(xpath = "//label[contains(text(),'Self-administered via web-based device')]")
	public WebElement a11AdministeredViaWebBasedDevice;

	/** A11 Other, please specify value */
	@FindBy(xpath = "//label[contains(text(),'Other, please specify')]")
	public WebElement a11otherPleaseSpecify;

	/** A11 Other, please specify text box value */
	@FindBy(xpath = "(//input[@name='data_collected_other_specify'])[1]")
	public WebElement a11otherPleaseSpecifyTextbox;

	/** A12 None value */
	@FindBy(xpath = "(//label[contains(text(),'None')])[1]")
	public WebElement a12None;

	/** A12 Require collaboration with cohort investigators value */
	@FindBy(xpath = "//label[contains(text(),'Require collaboration with cohort investigators')]")
	public WebElement a12CollabWithCohortInvestigator;

	/** A12 Require IRB approvals value */
	@FindBy(xpath = "//label[contains(text(),'Require IRB approvals')]")
	public WebElement a12RequireIRBApproval;

	/** A12 Require data use agreements and/or material transfer agreement value */
	@FindBy(xpath = "//label[contains(text(),'Require data use agreements and/or material transfer agreement')]")
	public WebElement a12MaterialTransferAgreement;

	/** A12 Restrictions in the consent related to genetic information value */
	@FindBy(xpath = "//label[contains(text(),'Restrictions in the consent related to genetic information')]")
	public WebElement a12GeneticInformation;

	/**
	 * A12 Restrictions in the consent related to linking to other databases value
	 */
	@FindBy(xpath = "//label[contains(text(),'Restrictions in the consent related to linking to other databases')]")
	public WebElement a12LinkingOtherDatabases;

	/** A12 Restrictions on commercial use value */
	@FindBy(xpath = "//label[contains(text(),'Restrictions on commercial use')]")
	public WebElement a12CommercialUse;

	/** A12 Other, please specify value */
	@FindBy(xpath = "(//label[contains(text(),'Other, please specify')])[2]")
	public WebElement a12OtherPleaseSpecify;

	/** A12 Other, please specify text box */
	@FindBy(xpath = "(//input[@name='data_collected_other_specify'])[2]")
	public WebElement a12OtherPleaseSpecifyTextbox;

	/** A13 None value */
	@FindBy(xpath = "(//label[contains(text(),'None')])[2]")
	public WebElement a13None;

	/**
	 * A13 Send newsletters or other information or personal mailings unrelated to
	 * data collection (e.g., birthday cards) value
	 */
	@FindBy(xpath = "//label[contains(text(),'Send newsletters or other information or personal mailings unrelated to data collection (e.g., birthday cards)')]")
	public WebElement a13SendNewsletters;

	/** A13 Share study findings with participants value */
	@FindBy(xpath = "//label[contains(text(),'Share study findings with participants')]")
	public WebElement a13ShareStudyFindings;

	/**
	 * A13 Provide individual results to participants (e.g. genetic variants, blood
	 * pressure) value
	 */
	@FindBy(xpath = "//label[contains(text(),'Provide individual results to participants (e.g. genetic variants, blood pressure)')]")
	public WebElement a13GeneticVariantsBloodPressure;

	/** A13 Include participants on advisory committees value */
	@FindBy(xpath = "//label[contains(text(),'Include participants on advisory committees')]")
	public WebElement a13AdvisoryCommittees;

	/** A13 Invite participants to attend meetings/workshops value */
	@FindBy(xpath = "//label[contains(text(),'Invite participants to attend meetings/workshops')]")
	public WebElement a13AttendMeetingsAndWorkshop;

	/** A13 Incorporate participant input on research process value */
	@FindBy(xpath = "//label[contains(text(),'Incorporate participant input on research process')]")
	public WebElement a13InputOnResearchProcess;

	/**
	 * A13 Other participant-centered or outreach activities, please specify value
	 */
	@FindBy(xpath = "//label[contains(text(),'Other participant-centered or outreach activities, please specify')]")
	public WebElement a13OtherPleaseSpecify;

	/** A13 Other please specify text box */
	@FindBy(xpath = "//input[@name='strategy_other_specify']")
	public WebElement a13OtherPleaseSpecifyTextbox;

	/** =============== Documents Section ===================== */

	/** Documents section tab */
	@FindBy(xpath = "//button[contains(text(),'Documents')]")
	public WebElement documentsTab;

	/**
	 * ====================================Action
	 * Buttons==========================================
	 */

	/** Previous Action Button */
	@FindBy(xpath = "//button[contains(text(),'Previous')]")
	public WebElement previousButton;

	/** Next Action Button */
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	public WebElement nextButton;

	/** Save Action Button */
	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	public WebElement saveButton;

	/** Save and Continue Action Button */
	@FindBy(xpath = "//button[contains(text(),'Save & Continue')]")
	public WebElement saveAndContinueButton;

	/** Save Action Button */
	@FindBy(xpath = "//button[contains(text(),'Submit For Review')]")
	public WebElement submitForReviewButton;

	/**
	 * ================================== Section Selection
	 * ========================================
	 */

	/** Section A */
	@FindBy(xpath = "(//div/div/div/span[contains(text(),'Basic Information')])[2]")
	public WebElement sectionA;

	/** Section B */
	@FindBy(xpath = "(//div/div/div/span[contains(text(),'Enrollment Counts')])[2]")
	public WebElement sectionB;

	/** Section C */
	@FindBy(xpath = "(//div/div/div/span[contains(text(),'Data Collection')])[2]")
	public WebElement SectionC;

	/** Section D */
	@FindBy(xpath = "(//div/div/div/span[contains(text(),'Cancer Information')])[2]")
	public WebElement sectionD;

	/** Section E */
	@FindBy(xpath = "(//div/div/div/span[contains(text(),'Mortality')])[2]")
	public WebElement sectionE;

	/** Section F */
	@FindBy(xpath = "(//div/div/div/span[contains(text(),'Data Linkage & Harmonization')])[2]")
	public WebElement SectionF;

	/** Section G */
	@FindBy(xpath = "(//div/div/div/span[contains(text(),'Biospecimens')])[2]")
	public WebElement SectionG;
	
/** =============== Questionnaire Section B ================= */
	
	/** Enrollment Date **/
	@FindBy(xpath = "//*[@placeholder='MM/DD/YYYY']")
	public WebElement enrollmentDateBox; 

	/**
	 * =============================== Questionnaire Section C
	 * ===================================
	 */

	/** Locators for Major Content Domains section */
	@FindBy(xpath = "//button[contains(text(),'Major Content Domains')]")
	public WebElement majorContentDomainstab;

	/** C.1 Socio-economic Status Baseline No Value */
	@FindBy(xpath = "//input[@id='seStatusBaseLine_0']")
	public WebElement c1BaselineNoRadio;

	/** C.1 Socio-economic Status Baseline Yes Value */
	@FindBy(xpath = "//input[@id='seStatusBaseLine_1']")
	public WebElement c1BaselineYesRadio;

	/** C.1 Socio-economic Status Follow Up No Value */
	@FindBy(xpath = "//input[@id='seStatusFollowUp_0']")
	public WebElement c1FollowUpNoRadio;

	/** C.1 Socio-economic Status Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='seStatusFollowUp_1']")
	public WebElement c1FollowUpYesRadio;

	/** C.2 Education Level Baseline No Value */
	@FindBy(xpath = "//input[@id='educationBaseLine_0']")
	public WebElement c2BaselineNoRadio;

	/** C.2 Education Level Baseline Yes Value */
	@FindBy(xpath = "//input[@id='educationBaseLine_1']")
	public WebElement c2BaselineYesRadio;

	/** C.2 Education Level Follow Up No Value */
	@FindBy(xpath = "//input[@id='educationFollowUp_0']")
	public WebElement c2FollowUpNoRadio;

	/** C.2 Education Level Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='educationFollowUp_1']")
	public WebElement c2FollowUpYesRadio;

	/** C.3 Marital Status Baseline No Value */
	@FindBy(xpath = "//input[@id='maritalStatusBaseLine_0']")
	public WebElement c3BaselineNoRadio;

	/** C.3 Marital Status Baseline Yes Value */
	@FindBy(xpath = "//input[@id='maritalStatusBaseLine_1']")
	public WebElement c3BaselineYesRadio;

	/** C.3 Marital Status Follow Up No Value */
	@FindBy(xpath = "//input[@id='maritalStatusFollowUp_0']")
	public WebElement c3FollowUpNoRadio;

	/** C.3 Marital Status Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='maritalStatusFollowUp_1']")
	public WebElement c3FollowUpYesRadio;

	/** C.4 Language/Country of Origin Baseline No Value */
	@FindBy(xpath = "//input[@id='originBaseLine_0']")
	public WebElement c4BaselineNoRadio;

	/** C.4 Language/Country of Origin Baseline Yes Value */
	@FindBy(xpath = "//input[@id='originBaseLine_1']")
	public WebElement c4BaselineYesRadio;

	/** C.4 Language/Country of Origin Follow Up No Value */
	@FindBy(xpath = "//input[@id='originFollowUp_0']")
	public WebElement c4FollowUpNoRadio;

	/** C.4 Language/Country of Origin Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='originFollowUp_1']")
	public WebElement c4FollowUpYesRadio;

	/** C.5 Employment Status Baseline No Value */
	@FindBy(xpath = "//input[@id='empStatusBaseLine_0']")
	public WebElement c5BaselineNoRadio;

	/** C.5 Employment Status Baseline Yes Value */
	@FindBy(xpath = "//input[@id='empStatusBaseLine_1']")
	public WebElement c5BaselineYesRadio;
	
	/** C.5 Employment Status Follow Up No Value */
	@FindBy(xpath = "//input[@id='empStatusFollowUp_0']")
	public WebElement c5FollowUpNoRadio;

	/** C.5 Employment Status Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='empStatusFollowUp_1']")
	public WebElement c5FollowUpYesRadio;

	/** C.6 Health Insurance Status Baseline No Value */
	@FindBy(xpath = "//input[@id='insuranceStatusBaseLine_0']")
	public WebElement c6BaselineNoRadio;

	/** C.6 Health Insurance Status Baseline Yes Value */
	@FindBy(xpath = "//input[@id='insuranceStatusBaseLine_1']")
	public WebElement c6BaselineYesRadio;

	/** C.6 Health Insurance Status Follow Up No Value */
	@FindBy(xpath = "//input[@id='insuranceStatusFollowUp_0']")
	public WebElement c6FollowUpNoRadio;

	/** C.6 Health Insurance Status Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='insuranceStatusFollowUp_1']")
	public WebElement c6FollowUpYesRadio;

	/**
	 * C.7 Anthropometry (e.g., weight, height, waist circumference) Baseline No
	 * Value
	 */
	@FindBy(xpath = "//input[@id='anthropometryBaseLine_0']")
	public WebElement c7BaselineNoRadio;

	/**
	 * C.7 Anthropometry (e.g., weight, height, waist circumference) Baseline Yes
	 * Value
	 */
	@FindBy(xpath = "//input[@id='anthropometryBaseLine_1']")
	public WebElement c7BaselineYesRadio;

	/**
	 * C.7 Anthropometry (e.g., weight, height, waist circumference) Follow Up No
	 * Value
	 */
	@FindBy(xpath = "//input[@id='anthropometryFollowUp_0']")
	public WebElement c7FollowUpNoRadio;

	/**
	 * C.7 Anthropometry (e.g., weight, height, waist circumference) Follow Up Yes
	 * Value
	 */
	@FindBy(xpath = "//input[@id='anthropometryFollowUp_1']")
	public WebElement c7FollowUpYesRadio;

	/** C.8 Dietary Intake Baseline No Value */
	@FindBy(xpath = "//input[@id='dietaryBaseLine_0']")
	public WebElement c8BaselineNoRadio;

	/** C.8 Dietary Intake Baseline Yes Value */
	@FindBy(xpath = "//input[@id='dietaryBaseLine_1']")
	public WebElement c8BaselineYesRadio;

	/** C.8 Dietary Intake Follow Up No Value */
	@FindBy(xpath = "//input[@id='dietaryFollowUp_0']")
	public WebElement c8FollowUpNoRadio;

	/** C.8 Dietary Intake Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='dietaryFollowUp_1']")
	public WebElement c8FollowUpYesRadio;

	/** =================================== */

	/** C.9 Dietary Supplement Use Baseline No Value */
	@FindBy(xpath = "//input[@id='supplementBaseLine_0']")
	public WebElement c9BaselineNoRadio;

	/** C.9 Dietary Supplement Use Baseline Yes Value */
	@FindBy(xpath = "//input[@id='supplementBaseLine_1']")
	public WebElement c9BaselineYesRadio;

	/** C.9 Dietary Supplement Use Follow Up No Value */
	@FindBy(xpath = "//input[@id='supplementFollowUp_0']")
	public WebElement c9FollowUpNoRadio;

	/** C.9 Dietary Supplement Use Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='supplementFollowUp_1']")
	public WebElement c9FollowUpYesRadio;

	/** =================================== */

	/** C.10 Complementary and Alternative Medicine Baseline No Value */
	@FindBy(xpath = "//input[@id='medicineBaseLine_0']")
	public WebElement c10BaselineNoRadio;

	/** C.10 Complementary and Alternative Medicine Baseline Yes Value */
	@FindBy(xpath = "//input[@id='medicineBaseLine_1']")
	public WebElement c10BaselineYesRadio;

	/** C.10 Complementary and Alternative Medicine Follow Up No Value */
	@FindBy(xpath = "//input[@id='medicineFollowUp_0']")
	public WebElement c10FollowUpNoRadio;

	/** C.10 Complementary and Alternative Medicine Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='medicineFollowUp_1']")
	public WebElement c10FollowUpYesRadio;

	/** =================================== */

	/**
	 * C.11 Prescription Medication Use (not related to cancer treatment) Baseline
	 * No Value
	 */
	@FindBy(xpath = "//input[@id='prescriptionBaseLine_0']")
	public WebElement c11BaselineNoRadio;

	/**
	 * C.11 Prescription Medication Use (not related to cancer treatment) Baseline
	 * Yes Value
	 */
	@FindBy(xpath = "//input[@id='prescriptionBaseLine_1']")
	public WebElement c11BaselineYesRadio;

	/**
	 * C.11 Prescription Medication Use (not related to cancer treatment) Follow Up
	 * No Value
	 */
	@FindBy(xpath = "//input[@id='prescriptionFollowUp_0']")
	public WebElement c11FollowUpNoRadio;

	/**
	 * C.11 Prescription Medication Use (not related to cancer treatment) Follow Up
	 * Yes Value
	 */
	@FindBy(xpath = "//input[@id='prescriptionFollowUp_1']")
	public WebElement c11FollowUpYesRadio;

	/** =================================== */

	/**
	 * C.12 Non-prescription Medication Use (not related to cancer treatment)
	 * Baseline No Value
	 */
	@FindBy(xpath = "//input[@id='nonprescriptionBaseLine_0']")
	public WebElement c12BaselineNoRadio;

	/**
	 * C.12 Non-prescription Medication Use (not related to cancer treatment)
	 * Baseline Yes Value
	 */
	@FindBy(xpath = "//input[@id='nonprescriptionBaseLine_1']")
	public WebElement c12BaselineYesRadio;

	/**
	 * C.12 Non-prescription Medication Use (not related to cancer treatment) Follow
	 * Up No Value
	 */
	@FindBy(xpath = "//input[@id='nonprescriptionFollowUp_0']")
	public WebElement c12FollowUpNoRadio;

	/**
	 * C.12 Non-prescription Medication Use (not related to cancer treatment) Follow
	 * Up Yes Value
	 */
	@FindBy(xpath = "//input[@id='nonprescriptionFollowUp_1']")
	public WebElement c12FollowUpYesRadio;

	/** =================================== */

	/** C.13 Alcohol Consumption Baseline No Value */
	@FindBy(xpath = "//input[@id = 'alcoholBaseLine_0']")
	public WebElement c13BaselineNoRadio;

	/** C.13 Alcohol Consumption Baseline Yes Value */
	@FindBy(xpath = "//input[@id = 'alcoholBaseLine_1']")
	public WebElement c13BaselineYesRadio;

	/** C.13 Alcohol Consumption Follow Up No Value */
	@FindBy(xpath = "//input[@id = 'alcoholFollowUp_0']")
	public WebElement c13FollowUpNoRadio;

	/** C.13 Alcohol Consumption Follow Up Yes Value */
	@FindBy(xpath = "//input[@id = 'alcoholFollowUp_1']")
	public WebElement c13FollowUpYesRadio;

	/** =================================== */

	/** C.14 Cigarette Smoking Baseline No Value */
	@FindBy(xpath = "//input[@id = 'cigaretteBaseLine_0']")
	public WebElement c14BaselineNoRadio;

	/** C.14 Cigarette Smoking Baseline Yes Value */
	@FindBy(xpath = "//input[@id = 'cigaretteBaseLine_1']")
	public WebElement c14BaselineYesRadio;

	/** C.14 Cigarette Smoking Follow Up No Value */
	@FindBy(xpath = "//input[@id = 'cigaretteFollowUp_0']")
	public WebElement c14FollowUpNoRadio;

	/** C.14 Cigarette Smoking Follow Up Yes Value */
	@FindBy(xpath = "//input[@id = 'cigaretteFollowUp_1']")
	public WebElement c14FollowUpYesRadio;

	/** =================================== */

	/**
	 * C.15 Use of tobacco products other than cigarettes check box BASELINE check
	 * boxes
	 */
	/** Cigars value */
	@FindBy(xpath = "//input[@id = 'cigarBaseLine']")
	public WebElement c15CigarBaselineValue;

	/** Pipes value */
	@FindBy(xpath = "//input[@id = 'pipeBaseLine']")
	public WebElement c15PipesBaselineValue;

	/** Chewing Tobacco value */
	@FindBy(xpath = "//input[@id = 'tobaccoBaseLine']")
	public WebElement c15ChewTobaccoBaselineValue;

	/** E-Cigarettes value */
	@FindBy(xpath = "//input[@id = 'ecigarBaseLine']")
	public WebElement c15ECigarettesBaselineValue;

	/** Other value */
	@FindBy(xpath = "//input[@id = 'noncigarOtherBaseLine']")
	public WebElement c15OtherBaselineValue;

	/** C.15 Other text box BASELINE */
	@FindBy(xpath = "//input[@name= 'noncigarBaseLineSpecify']")
	public WebElement c15OtherBaselineTextBox;

	/**
	 * C.15 Use of tobacco products other than cigarettes check box FOLLOW UP values
	 */
	/** Cigars value */
	@FindBy(xpath = "//input[@id = 'cigarFollowUp']")
	public WebElement c15CigarFollowUpValue;

	/** Pipes value */
	@FindBy(xpath = "//input[@id = 'pipeFollowUp']")
	public WebElement c15PipesFollowUpValue;

	/** Chewing Tobacco value */
	@FindBy(xpath = "//input[@id = 'tobaccoFollowUp']")
	public WebElement c15ChewTobaccoFollowUpValue;

	/** E-Cigarettes value */
	@FindBy(xpath = "//input[@id = 'ecigarFollowUp']")
	public WebElement c15ECigarettesFollowUpValue;

	/** Other value */
	@FindBy(xpath = "//input[@id = 'noncigarOtherFollowUp']")
	public WebElement c15OtherFollowUpValue;

	/** C.15 Other text box */
	@FindBy(xpath = "//input[@name= 'noncigarFollowUpSpecify']")
	public WebElement c15OtherFollowUpTextBox;

	/** =================================== */

	/** C.16 Physical Activity Baseline No Value */
	@FindBy(xpath = "//input[@id = 'physicalBaseLine_0']")
	public WebElement c16BaselineNoRadio;

	/** C.16 Physical Activity Baseline Yes Value */
	@FindBy(xpath = "//input[@id = 'physicalBaseLine_1']")
	public WebElement c16BaselineYesRadio;

	/** C.16 Physical Activity Follow Up No Value */
	@FindBy(xpath = "//input[@id = 'physicalFollowUp_0']")
	public WebElement c16FollowUpNoRadio;

	/** C.16 Physical Activity Follow Up Yes Value */
	@FindBy(xpath = "//input[@id = 'physicalFollowUp_1']")
	public WebElement c16FollowUpYesRadio;

	/** =================================== */

	/** C.17 Sleep Habits Baseline No Value */
	@FindBy(xpath = "//input[@id = 'sleepBaseLine_0']")
	public WebElement c17BaselineNoRadio;

	/** C.17 Sleep Habits Baseline Yes Value */
	@FindBy(xpath = "//input[@id = 'sleepBaseLine_1']")
	public WebElement c17BaselineYesRadio;

	/** C.17 Sleep Habits Follow Up No Value */
	@FindBy(xpath = "//input[@id = 'sleepFollowUp_0']")
	public WebElement c17FollowUpNoRadio;

	/** C.17 Sleep Habits Follow Up Yes Value */
	@FindBy(xpath = "//input[@id = 'sleepFollowUp_1']")
	public WebElement c17FollowUpYesRadio;

	/** =================================== */

	/** C.18 Reproductive History Baseline No Value */
	@FindBy(xpath = "//input[@id = 'reproduceBaseLine_0']")
	public WebElement c18BaselineNoRadio;

	/** C.18 Reproductive History Baseline Yes Value */
	@FindBy(xpath = "//input[@id = 'reproduceBaseLine_1']")
	public WebElement c18BaselineYesRadio;

	/** C.18 Reproductive History Follow Up No Value */
	@FindBy(xpath = "//input[@id = 'reproduceFollowUp_0']")
	public WebElement c18FollowUpNoRadio;

	/** C.18 Reproductive History Follow Up Yes Value */
	@FindBy(xpath = "//input[@id = 'reproduceFollowUp_1']")
	public WebElement c18FollowUpYesRadio;

	/** =================================== */

	/** C.19 Self Reported Health Baseline No Value */
	@FindBy(xpath = "//input[@id='reportedHealthBaseLine_0']")
	public WebElement c19BaselineNoRadio;

	/** C.19 Self Reported Health Baseline Yes Value */
	@FindBy(xpath = "//input[@id='reportedHealthBaseLine_1']")
	public WebElement c19BaselineYesRadio;

	/** C.19 Self Reported Health Follow Up No Value */
	@FindBy(xpath = "//input[@id='reportedHealthFollowUp_0']")
	public WebElement c19FollowUpNoRadio;

	/** C.19 Self Reported Health Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='reportedHealthFollowUp_1']")
	public WebElement c19FollowUpYesRadio;

	/** =================================== */

	/** C.20 Quality of Life Baseline No Value */
	@FindBy(xpath = "//input[@id='lifeBaseLine_0']")
	public WebElement c20BaselineNoRadio;

	/** C.20 Quality of Life Baseline Yes Value */
	@FindBy(xpath = "//input[@id='lifeBaseLine_1']")
	public WebElement c20BaselineYesRadio;

	/** C.20 Quality of Life Follow Up No Value */
	@FindBy(xpath = "//input[@id='lifeFollowUp_0']")
	public WebElement c20FollowUpNoRadio;

	/** C.20 Quality of Life Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='lifeFollowUp_1']")
	public WebElement c20FollowUpYesRadio;

	/** =================================== */

	/** C.21 Social Support Baseline No Value */
	@FindBy(xpath = "//input[@id='socialSupportBaseLine_0']")
	public WebElement c21BaselineNoRadio;

	/** C.21 Social Support Baseline Yes Value */
	@FindBy(xpath = "//input[@id='socialSupportBaseLine_1']")
	public WebElement c21BaselineYesRadio;

	/** C.21 Social Support Follow Up No Value */
	@FindBy(xpath = "//input[@id='socialSupportFollowUp_0']")
	public WebElement c21FollowUpNoRadio;

	/** C.21 Social Support Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='socialSupportFollowUp_1']")
	public WebElement c21FollowUpYesRadio;

	/** =================================== */

	/** C.22 Cognitive Function Baseline No Value */
	@FindBy(xpath = "//input[@id='cognitionBaseLine_0']")
	public WebElement c22BaselineNoRadio;

	/** C.22 Cognitive Function Baseline Yes Value */
	@FindBy(xpath = "//input[@id='cognitionBaseLine_1']")
	public WebElement c22BaselineYesRadio;

	/** C.22 Cognitive FunctionFollow Up No Value */
	@FindBy(xpath = "//input[@id='cognitionFollowUp_0']")
	public WebElement c22FollowUpNoRadio;

	/** C.22 Cognitive Function Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='cognitionFollowUp_1']")
	public WebElement c22FollowUpYesRadio;

	/** =================================== */

	/** C.23 Depression Baseline No Value */
	@FindBy(xpath = "//input[@id='depressionBaseLine_0']")
	public WebElement c23BaselineNoRadio;

	/** C.23 Depression Baseline Yes Value */
	@FindBy(xpath = "//input[@id='depressionBaseLine_1']")
	public WebElement c23BaselineYesRadio;

	/** C.23 Depression Follow Up No Value */
	@FindBy(xpath = "//input[@id='depressionFollowUp_0']")
	public WebElement c23FollowUpNoRadio;

	/** C.23 Depression Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='depressionFollowUp_1']")
	public WebElement c23FollowUpYesRadio;

	/** =================================== */

	/** C.24 Other Psychosocial Variables Baseline No Value */
	@FindBy(xpath = "//input[@id='psychosocialBaseLine_0']")
	public WebElement c24BaselineNoRadio;

	/** C.24 Other Psychosocial Variables Baseline Yes Value */
	@FindBy(xpath = "//input[@id='psychosocialBaseLine_1']")
	public WebElement c24BaselineYesRadio;

	/** C.24 Other Psychosocial Variables Follow Up No Value */
	@FindBy(xpath = "//input[@id='psychosocialFollowUp_0']")
	public WebElement c24FollowUpNoRadio;

	/** C.24 Other Psychosocial Variables Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='psychosocialFollowUp_1']")
	public WebElement c24FollowUpYesRadio;

	/** =================================== */

	/** C.25 Fatigue Baseline No Value */
	@FindBy(xpath = "//input[@id='fatigueBaseLine_0']")
	public WebElement c25BaselineNoRadio;

	/** C.25 Fatigue Baseline Yes Value */
	@FindBy(xpath = "//input[@id='fatigueBaseLine_1']")
	public WebElement c25BaselineYesRadio;

	/** C.25 Fatigue Follow Up No Value */
	@FindBy(xpath = "//input[@id='fatigueFollowUp_0']")
	public WebElement c25FollowUpNoRadio;

	/** C.25 Fatigue Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='fatigueFollowUp_1']")
	public WebElement c25FollowUpYesRadio;

	/** =================================== */

	/** C.26 Family History of Cancer Baseline No Value */
	@FindBy(xpath = "//input[@id='cancerHistoryBaseLine_0']")
	public WebElement c26BaselineNoRadio;

	/** C.26 Family History of Cancer Baseline Yes Value */
	@FindBy(xpath = "//input[@id='cancerHistoryBaseLine_1']")
	public WebElement c26BaselineYesRadio;

	/** C.26 Family History of Cancer Follow Up No Value */
	@FindBy(xpath = "//input[@id='cancerHistoryFollowUp_0']")
	public WebElement c26FollowUpNoRadio;

	/** C.26 Family History of Cancer Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='cancerHistoryFollowUp_1']")
	public WebElement c26FollowUpYesRadio;

	/** =================================== */

	/** C.27 Family History of Cancer with Pedigrees Baseline No Value */
	@FindBy(xpath = "//input[@id='cancerPedigreeBaseLine_0']")
	public WebElement c27BaselineNoRadio;

	/** C.27 Family History of Cancer with Pedigrees Baseline Yes Value */
	@FindBy(xpath = "//input[@id='cancerPedigreeBaseLine_1']")
	public WebElement c27BaselineYesRadio;

	/** C.27 Family History of Cancer with Pedigrees Follow Up No Value */
	@FindBy(xpath = "//input[@id='cancerPedigreeFollowUp_0']")
	public WebElement c27FollowUpNoRadio;

	/** C.27 Family History of Cancer with Pedigrees Follow Up Yes Value */
	@FindBy(xpath = "//input[@id='cancerPedigreeFollowUp_1']")
	public WebElement c27FollowUpYesRadio;

	/** =================================== */

	/**
	 * C.28 Physical function meassures (e.g. grip strength, gait speed, etc.)
	 * Baseline No Value
	 */
	@FindBy(xpath = "//input[@id='physicalMeasureBaseLine_0']")
	public WebElement c28BaselineNoRadio;

	/**
	 * C.28 Physical function meassures (e.g. grip strength, gait speed, etc.)
	 * Baseline Yes Value
	 */
	@FindBy(xpath = "//input[@id='physicalMeasureBaseLine_1']")
	public WebElement c28BaselineYesRadio;

	/**
	 * C.28 Physical function meassures (e.g. grip strength, gait speed, etc.)
	 * Follow Up No Value
	 */
	@FindBy(xpath = "//input[@id='physicalMeasureFollowUp_0']")
	public WebElement c28FollowUpNoRadio;

	/**
	 * C.28 Physical function meassures (e.g. grip strength, gait speed, etc.)
	 * Follow Up Yes Value
	 */
	@FindBy(xpath = "//input[@id='physicalMeasureFollowUp_1']")
	public WebElement c28FollowUpYesRadio;

	/** =================================== */

	/**
	 * C.29 Environmental or Occupational Exposures (e.g. air contaminants/quality,
	 * occupational exposures and history, water source) Baseline No Value
	 */
	@FindBy(xpath = "//input[@id='exposureBaseLine_0']")
	public WebElement c29BaselineNoRadio;

	/**
	 * C.29 Environmental or Occupational Exposures (e.g. air contaminants/quality,
	 * occupational exposures and history, water source) Baseline Yes Value
	 */
	@FindBy(xpath = "//input[@id='exposureBaseLine_1']")
	public WebElement c29BaselineYesRadio;

	/**
	 * C.29 Environmental or Occupational Exposures (e.g. air contaminants/quality,
	 * occupational exposures and history, water source) Follow Up No Value
	 */
	@FindBy(xpath = "//input[@id='exposureFollowUp_0']")
	public WebElement c29FollowUpNoRadio;

	/**
	 * C.29 Environmental or Occupational Exposures (e.g. air contaminants/quality,
	 * occupational exposures and history, water source) Follow Up Yes Value
	 */
	@FindBy(xpath = "//input[@id='exposureFollowUp_1']")
	public WebElement c29FollowUpYesRadio;

	/** =================================== */

	/**
	 * C.30 Residential history Information (zip code, GIS) over time? Baseline No
	 * Value
	 */
	@FindBy(xpath = "//input[@id='residenceBaseLine_0']")
	public WebElement c30BaselineNoRadio;

	/**
	 * C.30 Residential history Information (zip code, GIS) over time? Baseline Yes
	 * Value
	 */
	@FindBy(xpath = "//input[@id='residenceBaseLine_1']")
	public WebElement c30BaselineYesRadio;

	/**
	 * C.30 Residential history Information (zip code, GIS) over time? Follow Up No
	 * Value
	 */
	@FindBy(xpath = "//input[@id='residenceFollowUp_0']")
	public WebElement c30FollowUpNoRadio;

	/**
	 * C.30 Residential history Information (zip code, GIS) over time? Follow Up Yes
	 * Value
	 */
	@FindBy(xpath = "//input[@id='residenceFollowUp_1']")
	public WebElement c30FollowUpYesRadio;

	/** =============== Other Medical Conditions Section ===================== */

	/** Locators for Other Medical Conditions section */
	@FindBy(xpath = "//button[contains(text(),'Other Medical Conditions')]")
	public WebElement otherMedicalConditionsTab;

	/** C.31 Do you have information on the following medical conditions? */

	/** a. Diabetes Baseline No value */
	@FindBy(xpath = "//input[@id = 'diabetesBaseLine_0']")
	public WebElement c31DiabetesBaselineNoRadio;

	/** a. Diabetes Baseline Yes value */
	@FindBy(xpath = "//input[@id = 'diabetesBaseLine_1']")
	public WebElement c31DiabetesBaselineYesRadio;

	/** a. Diabetes Follow Up No value */
	@FindBy(xpath = "//input[@id = 'diabetesFollowUp_0']")
	public WebElement c31DiabetesFollowUpNoRadio;

	/** a. Diabetes Follow Up Yes value */
	@FindBy(xpath = "//input[@id = 'diabetesFollowUp_1']")
	public WebElement c31DiabetesFollowUpYesRadio;

	/** b. Stroke Baseline No value */
	@FindBy(xpath = "//input[@id = 'strokeBaseLine_0']")
	public WebElement c31StrokeBaselineNoRadio;

	/** b. Stroke Baseline Yes value */
	@FindBy(xpath = "//input[@id = 'strokeBaseLine_1']")
	public WebElement c31StrokeBaselineYesRadio;

	/** b. Stroke Follow Up No value */
	@FindBy(xpath = "//input[@id = 'strokeFollowUp_0']")
	public WebElement c31StrokeFollowUpNoRadio;

	/** b. Stroke Follow Up Yes value */
	@FindBy(xpath = "//input[@id = 'strokeFollowUp_1']")
	public WebElement c31StrokeFollowUpYesRadio;

	/** c. COPD and/or Emphysema Baseline No value */
	@FindBy(xpath = "//input[@id = 'copdBaseLine_0']")
	public WebElement c31COPDBaselineNoRadio;

	/** c. COPD and/or Emphysema Baseline Yes value */
	@FindBy(xpath = "//input[@id = 'copdBaseLine_1']")
	public WebElement c31COPDBaselineYesRadio;

	/** c. COPD and/or Emphysema Follow Up No value */
	@FindBy(xpath = "//input[@id = 'copdFollowUp_0']")
	public WebElement c31COPDFollowUpNoRadio;

	/** c. COPD and/or Emphysema Follow Up Yes value */
	@FindBy(xpath = "//input[@id = 'copdFollowUp_1']")
	public WebElement c31COPDFollowUpYesRadio;
	
	/** d. Cardiovascular Disease Baseline No value */
	@FindBy(xpath = "//input[@id = 'cardiovascularBaseLine_0']")
	public WebElement c31CardiovascularBaselineNoRadio;

	/** d. Cardiovascular Disease Baseline Yes value */
	@FindBy(xpath = "//input[@id = 'cardiovascularBaseLine_1']")
	public WebElement c31CardiovascularBaselineYesRadio;

	/** d. Cardiovascular Disease Follow Up No value */
	@FindBy(xpath = "//input[@id = 'cardiovascularFollowUp_0']")
	public WebElement c31CardiovascularFollowUpNoRadio;

	/** d. Cardiovascular Disease Follow Up Yes value */
	@FindBy(xpath = "//input[@id = 'cardiovascularFollowUp_1']")
	public WebElement c31CardiovascularFollowUpYesRadio;

	/** e. Osteoporosis Baseline No value */
	@FindBy(xpath = "//input[@id = 'osteoporosisBaseLine_0']")
	public WebElement c31OsteoporosisBaselineNoRadio;

	/** e. Osteoporosis Baseline Yes value */
	@FindBy(xpath = "//input[@id = 'osteoporosisBaseLine_1']")
	public WebElement c31OsteoporosisBaselineYesRadio;

	/** e. Osteoporosis Follow Up No value */
	@FindBy(xpath = "//input[@id = 'osteoporosisFollowUp_0']")
	public WebElement c31OsteoporosisFollowUpNoRadio;

	/** e. Osteoporosis Follow Up Yes value */
	@FindBy(xpath = "//input[@id = 'osteoporosisFollowUp_1']")
	public WebElement c31OsteoporosisFollowUpYesRadio;

	/** f. Mental Health Baseline No value */
	@FindBy(xpath = "//input[@id = 'mentalBaseLine_0']")
	public WebElement c31MentalHealthBaselineNoRadio;

	/** f. Mental Health Baseline Yes value */
	@FindBy(xpath = "//input[@id = 'mentalBaseLine_1']")
	public WebElement c31MentalHealthBaselineYesRadio;

	/** f. Mental Health Follow Up No value */
	@FindBy(xpath = "//input[@id = 'mentalFollowUp_0']")
	public WebElement c31MentalHealthFollowUpNoRadio;

	/** f. Mental Health Follow Up Yes value */
	@FindBy(xpath = "//input[@id = 'mentalFollowUp_1']")
	public WebElement c31MentalHealthFollowUpYesRadio;

	/** g. Cognitive Decline Baseline No value */
	@FindBy(xpath = "//input[@id = 'cognitiveDeclineBaseLine_0']")
	public WebElement c31CognitiveDeclineBaselineNoRadio;

	/** g. Cognitive Decline Baseline Yes value */
	@FindBy(xpath = "//input[@id = 'cognitiveDeclineBaseLine_1']")
	public WebElement c31CognitiveDeclineBaselineYesRadio;

	/** g. Cognitive Decline Follow Up No value */
	@FindBy(xpath = "//input[@id = 'cognitiveDeclineFollowUp_0']")
	public WebElement c31CognitiveDeclineFollowUpNoRadio;

	/** g. Cognitive Decline Follow Up Yes value */
	@FindBy(xpath = "//input[@id = 'cognitiveDeclineFollowUp_1']")
	public WebElement c31CognitiveDeclineFollowUpYesRadio;

	/** =============== Cancer Related Conditions Section ===================== */

	/** Locators for Cancer Related Conditions section */
	@FindBy(xpath = "//button[contains(text(), 'Cancer Related Conditions' )]")
	public WebElement cancerRelatedConditionsTab;

	/** C.32 Do you have information on the following cancer related conditions? */

	/**
	 * Acute treatment-related toxicity (e.g., diarrhea, nephrotoxicity) check box
	 */
	@FindBy(xpath = "//input[@id = 'cancerToxicity']")
	public WebElement c32CancerToxicityCheckbox;

	/** Late effects of treatment (e.g., cardiotoxicity, lymphedema) check box */
	@FindBy(xpath = "//input[@id = 'cancerLateEffects']")
	public WebElement c32CancerLateEffectsCheckbox;

	/** Symptom management (e.g., fatigue, pain, sexual dysfunction) check box */
	@FindBy(xpath = "//input[@id = 'cancerSymptom']")
	public WebElement c32CancerSymptomsCheckbox;

	/** Other Check box */
	@FindBy(xpath = "//input[@id = 'cancerOther']")
	public WebElement c32CancerOtherCheckbox;

	/** Other Text Box */
	@FindBy(xpath = "//input[@name='cancerOtherSpecify']")
	public WebElement c32CancerOtherSpecifyTextbox;
	
	@FindBy(xpath = "//*[@class='cedcd-btn']")
	public WebElement cancerInformationTab; 
	
	@FindBy(xpath = "//*[@id='ci_confirmed_cancer_date']")
	public WebElement d2AscertainedDateTextBox; 
	
	@FindBy(xpath = "//*[@type='checkbox']")
	public List<WebElement> SectionDCheckBoxes;
	
	
	@FindBy(xpath = "//*[@type='radio']")
	public List<WebElement> SectionDRadioButton;
	
	/** =============== Questionnaire Section F ================= */
	
	@FindBy(xpath = "//*[@type='radio']")
	public List<WebElement> SectionFRadioButtons; 
	
	@FindBy(xpath = "//*[@class='px-0 col-sm-2']")
	public WebElement sectionFUploadPdf;
	
	@FindBy(xpath = "//*[@name='dataOnlineURL']")
	public WebElement sectionFWebsiteTextBox;

	/**
	 * =============================== Questionnaire Section E
	 * ===================================
	 */	
	
	/** E1's text box.  Takes year in YYYY format */
	@FindBy (xpath = "//input[@name='mortalityYear']")
	public WebElement e1MortalityFollowUpTextBox;
	
	/** E2's check boxes */
	
	/** E2's U.S. National Death Index (NDI) linkage check box value */
	@FindBy (xpath = "(//input[@type = 'checkbox'])[1]")
	public WebElement e2NDICheckBox;
	
	/** E2's Death Certificates check box value */
	@FindBy (xpath = "(//input[@type = 'checkbox'])[2]")
	public WebElement e2DeathCertificateCheckBox;
	
	/** E2's Other check box value */
	@FindBy (xpath = "(//input[@type = 'checkbox'])[3]")
	public WebElement e2OtherCheckBox;
	
	/** E2's answer to: How did your cohort confirm death? */
	@FindBy (xpath = "//input[@name = 'otherDeathSpecify']")
	public WebElement e2OtherTextBox;
	
	/** E.3 Do you have date of death for most subjects radio button No Value */
	@FindBy (xpath = "(//input[@type = 'radio'])[1]")
	public WebElement e3RadioNo;
	
	/** E.3 Do you have date of death for most subjects radio button Yes Value */
	@FindBy (xpath = "(//input[@type = 'radio'])[2]")
	public WebElement e3RadioYes;
	
	/** E.4 Do you have cause of death for most subjects No Value */
	@FindBy (xpath = "(//input[@type = 'radio'])[3]")
	public WebElement e4RadioNo;
	
	/** E.4 Do you have cause of death for most subjects Yes Value */
	@FindBy (xpath = "(//input[@type = 'radio'])[4]")
	public WebElement e4RadioYes;
	
	/** E.4 if E4 is Yes then click check boxes below */
	
	/** E4's ICD-9 check box value */
	@FindBy (xpath = "(//input[@type = 'checkbox'])[4]")
	public WebElement e4ICD9CheckBox;
	
	/** E4's ICD-10 check box value */
	@FindBy (xpath = "(//input[@type = 'checkbox'])[5]")
	public WebElement e4ICD10CheckBox;
	
	/** E4's Not Coded check box value */
	@FindBy (xpath = "(//input[@type = 'checkbox'])[6]")
	public WebElement e4NotCodedCheckBox;
	
	/** E4's Other Code check box value */
	@FindBy (xpath = "(//input[@type = 'checkbox'])[7]")
	public WebElement e4OtherCodeCheckBox;
	
	/** E4's Other Code text box value */
	@FindBy (xpath = "//input[@name='otherCodeSpecify']")
	public WebElement e4OtherCodeTextBox;
	
	/** E5's  */
	@FindBy (xpath = "//input[@name='deathNumbers']")
	public WebElement e5MortalityTextBox;
	
	/**
	 * =============================== Questionnaire Section G
	 * ===================================
	 */	
	
	/** Biospecimens Collected Tabs for section G */
	@FindBy (xpath = "//button[contains(text(),'Biospecimens Collected')]")
	public WebElement biospecimensCollectedTab;
	
	/**Specify the types of specimens you collected, whether the specimen was collected at baseline, and/or collected at other time points.*/
	
	/** G.1 Blood No radio Value */
	@FindBy (xpath = "//input[@id='bioBloodBaseline_0']")
	public WebElement g1BaselineNoValue;
	
	/** G.1 Blood Yes radio Value */
	@FindBy (xpath = "//input[@id='bioBloodBaseline_1']")
	public WebElement g1BaselineYesValue;
	
	/** G.1 If collected, types of aliquots (select all that apply) */
	
	/** G.1 Serum BASELINE check box value */
	@FindBy (xpath = "//input[@id='bioBloodBaselineSerum']")
	public WebElement g1SerumBaselineCheckBox;
	
	/** G.1 Plasma BASELINE check box value */
	@FindBy (xpath = "//input[@id='bioBloodBaselinePlasma']")
	public WebElement g1PlasmaBaselineCheckBox;
	
	/** G.1 Buffy Coat BASELINE check box value */
	@FindBy (xpath = "//input[@id='bioBloodBaselineBuffyCoat']")
	public WebElement g1BuffyCoatBaselineCheckBox;
	
	/** G.1 Other Blood Derivative BASELINE check box value */
	@FindBy (xpath = "//input[@id='bioBloodBaselineOtherDerivative']")
	public WebElement g1OtherBloodDerivativeBaselineCheckBox;
	
	/** G.1 Collected at other points yes or no radio buttons */
	
	/** G.1 Other points No radio Button */
	@FindBy (xpath = "//input[@id='bioBloodOtherTime_0']")
	public WebElement g1FollowUpNoValue;
	
	/** G.1 Other points Yes radio Button */
	@FindBy (xpath = "//input[@id='bioBloodOtherTime_1']")
	public WebElement g1FollowUpYesValue;
	
	/** G.1 Serum FOLLOW UP check box value */
	@FindBy (xpath = "//input[@id='bioBloodOtherTimeSerum']")
	public WebElement g1SerumFollowUpCheckBox;
	
	/** G.1 Plasma FOLLOW UP check box value */
	@FindBy (xpath = "//input[@id='bioBloodOtherTimePlasma']")
	public WebElement g1PlasmaFollowUpCheckBox;
	
	/** G.1 Buffy Coat FOLLOW UP check box value */
	@FindBy (xpath = "//input[@id='bioBloodOtherTimeBuffyCoat']")
	public WebElement g1BuffyCoatFollowUpCheckBox;
	
	/** G.1 Other Blood Derivative FOLLOW UP check box value */
	@FindBy (xpath = "//input[@id='bioBloodOtherTimeOtherDerivative']")
	public WebElement g1OtherBloodDerivativeFollowUpCheckBox;
	
	/** G.2 Buccal/Saliva */
	
	/** G.2 Baseline No Radio Value */
	@FindBy (xpath = "//input[@id='bioBuccalSalivaBaseline_0']")
	public WebElement g2BaselineRadioNo;
	
	/** G.2 Baseline Yes Radio Value */
	@FindBy (xpath = "//input[@id='bioBuccalSalivaBaseline_1']")
	public WebElement g2BaselineRadioYes;
	
	/** G.2 Follow Up No Radio Value */
	@FindBy (xpath = "//input[@id='bioBuccalSalivaOtherTime_0']")
	public WebElement g2FollowUpRadioNo;
	
	/** G.2 Follow Up Yes Radio Value */
	@FindBy (xpath = "//input[@id='bioBuccalSalivaOtherTime_1']")
	public WebElement g2FollowUpRadioYes;
	
	/** G.3 Tissue (include tumor and/or normal) */
	
	/** G.3 Baseline No Radio Value */
	@FindBy (xpath = "//input[@id='bioTissueBaseline_0']")
	public WebElement g3BaselineRadioNo;
	
	/** G.3 Baseline Yes Radio Value */
	@FindBy (xpath = "//input[@id='bioTissueBaseline_1']")
	public WebElement g3BaselineRadioYes;
	
	/** G.3 Follow Up No Radio Value */
	@FindBy (xpath = "//input[@id='bioTissueOtherTime_0']")
	public WebElement g3FollowUpRadioNo;
	
	/** G.3 Follow Up Yes Radio Value */
	@FindBy (xpath = "//input[@id='bioTissueOtherTime_1']")
	public WebElement g3FollowUpRadioYes;
	
	/** G.4 Urine */
	
	/** G.4 Baseline No Radio Value */
	@FindBy (xpath = "//input[@id='bioUrineBaseline_0']")
	public WebElement g4BaselineRadioNo;

	/** G.4 Baseline Yes Radio Value */
	@FindBy (xpath = "//input[@id='bioUrineBaseline_1']")
	public WebElement g4BaselineRadioYes;
	
	/** G.4 Follow Up No Radio Value */
	@FindBy (xpath = "//input[@id='bioUrineOtherTime_0']")
	public WebElement g4FollowUpRadioNo;
	
	/** G.4 Follow Up Yes Radio Value */
	@FindBy (xpath = "//input[@id='bioUrineOtherTime_1']")
	public WebElement g4FollowUpRadioYes;
	
	/** G.5 Feces */
	
	/** G.5 Baseline No Radio Value */
	@FindBy (xpath = "//input[@id='bioFecesBaseline_0']")
	public WebElement g5BaselineRadioNo;

	/** G.5 Baseline Yes Radio Value */
	@FindBy (xpath = "//input[@id='bioFecesBaseline_1']")
	public WebElement g5BaselineRadioYes;
	
	/** G.5 Follow Up No Radio Value */
	@FindBy (xpath = "//input[@id='bioFecesOtherTime_0']")
	public WebElement g5FollowUpRadioNo;
	
	/** G.5 Follow Up Yes Radio Value */
	@FindBy (xpath = "//input[@id='bioFecesOtherTime_1']")
	public WebElement g5FollowUpRadioYes;
	
	/** G.6 Other (e.g. toenails) */
	
	/** G.6 Baseline No Radio Value */
	@FindBy (xpath = "//input[@id='bioOtherBaseline_0']")
	public WebElement g6BaselineRadioNo;

	/** G.6 Baseline Yes Radio Value */
	@FindBy (xpath = "//input[@id='bioOtherBaseline_1']")
	public WebElement g6BaselineRadioYes;
	
	/** G.6 Baseline Text Box */
	@FindBy (xpath = "//input[@name='bioOtherBaselineSpecify']")
	public WebElement g6BaselineTextBox;
	
	/** G.6 Follow Up No Radio Value */
	@FindBy (xpath = "//input[@id='bioOtherOtherTime_0']")
	public WebElement g6FollowUpRadioNo;
	
	/** G.6 Follow Up Yes Radio Value */
	@FindBy (xpath = "//input[@id='bioOtherOtherTime_1']")
	public WebElement g6FollowUpRadioYes;
	
	/** G.6 Follow Up Text Box */
	@FindBy (xpath = "//input[@name='bioOtherOtherTimeSpecify']")
	public WebElement g6FollowUpTextBox;
	
	/** G.7 Did you collect repeated samples over multiple timepoints for the same individuals? */
	
	/** G.7 No Radio Button Value */
	@FindBy (xpath = "//input[@id='bioRepeatedSampleSameIndividual_0']")
	public WebElement g7RadioNo;
	
	/** G.7 Yes Radio Button Value */
	@FindBy (xpath = "//input[@id='bioRepeatedSampleSameIndividual_1']")
	public WebElement g7RadioYes;
	
	/** G.8 If your cohort does not currently collect tumor blocks, do you have information on where the blocks are kept/stored? */
	
	/** G.8 No Radio Button Value */
	@FindBy (xpath = "//input[@id='bioTumorBlockInfo_0']")
	public WebElement g8RadioNo;
	
	/** G.8 Yes Radio Button Value */
	@FindBy (xpath = "//input[@id='bioTumorBlockInfo_1']")
	public WebElement g8RadioYes;
	
	/** Additional Data Collected Section on section G */
	@FindBy (xpath = "//button[contains(text(),'Additional Data Collected')]")
	public WebElement additionalDataCollectedTab;
	
	/** G.9 Genotyping Data (SNP) */
	
	/** G.9 No Radio Button Value */
	@FindBy (xpath = "//input[@id='bioGenotypingData_0']")
	public WebElement g9RadioNo;
	
	/** G.9 Yes Radio Button Value */
	@FindBy (xpath = "//input[@id='bioGenotypingData_1']")
	public WebElement g9RadioYes;
	
	/** G.10 Sequencing Data – Exome */
	
	/** G.10 No Radio Button Value */
	@FindBy (xpath = "//label[@for='bioSequencingDataExome_0']")
	public WebElement g10RadioNo;
	
	/** G.10 Yes Radio Button Value */
	@FindBy (xpath = "//label[@for='bioSequencingDataExome_1']")
	public WebElement g10RadioYes;
	
	/** G.11 Sequencing Data – Whole Genome */
	
	/** G.11 No Radio Button Value */
	@FindBy (xpath = "//label[@for='bioSequencingDataWholeGenome_0']")
	public WebElement g11RadioNo;
	
	/** G.11 Yes Radio Button Value */
	@FindBy (xpath = "//label[@for='bioSequencingDataWholeGenome_1']")
	public WebElement g11RadioYes;
	
	/** G.12 Epigenetic Data (methylation, miRNA, histone chip-on-chip data) */
	
	/** G.12 No Radio Button Value */
	@FindBy (xpath = "//input[@id='bioEpigeneticOrMetabolicMarkers_0']")
	public WebElement g12RadioNo;
	
	/** G.12 Yes Radio Button Value */
	@FindBy (xpath = "//input[@id='bioEpigeneticOrMetabolicMarkers_1']")
	public WebElement g12RadioYes;
	
	/** G.13 Transcriptomics Data */
	
	/** G.13 No Radio Button Value */
	@FindBy (xpath = "//input[@id='bioTranscriptomicsData_0']")
	public WebElement g13RadioNo;
	
	/** G.13 Yes Radio Button Value */
	@FindBy (xpath = "//input[@id='bioTranscriptomicsData_1']")
	public WebElement g13RadioYes;
	
	/** G.14 Microbiome Data (16S RNA, metagenomics) */
	
	/** G.14 No Radio Button Value */
	@FindBy (xpath = "//input[@id='bioMicrobiomeData_0']")
	public WebElement g14RadioNo;
	
	/** G.14 Yes Radio Button Value */
	@FindBy (xpath = "//input[@id='bioMicrobiomeData_1']")
	public WebElement g14RadioYes;
	
	/** Metabolic Data tab on Section G */
	@FindBy (xpath = "//button[contains(text(),'Metabolomics Data')]")
	public WebElement metabolicDataTab;
	
	/** G.15 Metabolomic Data (from MS and/or NMR) */
	
	/** G.15 No Radio Button Value */
	@FindBy (xpath = "//input[@id='bioMetabolomicData_0']")
	public WebElement g15RadioNo;
	
	/** G.15 Yes Radio Button Value */
	@FindBy (xpath = "//input[@id='bioMetabolomicData_1']")
	public WebElement g15RadioYes;
	
	/** If G.15 is answered Yes, then they fill out the following questions */

	/** G.15a Are the biospecimens collected fasting samples? */
	
	/** G.15a No Radio Button Value */
	@FindBy (xpath = "//input[@id='bioMetaFastingSample_0']")
	public WebElement g15ARadioNo;
	
	/** G.15a Yes Radio Button Value */
	@FindBy (xpath = "//input[@id='bioMetaFastingSample_1']")
	public WebElement g15ARadioYes;
	
	/** G.15b What are the disease outcome(s) in your study? */
	
	/** G.15b Cancer Check Box Value */
	@FindBy (xpath = "//input[@id='bioMetaOutcomesInCancerStudy']")
	public WebElement g15BCancerCheckBoxValue;
	
	/** G.15b CVD Check Box Value */
	@FindBy (xpath = "//input[@id='bioMetaOutcomesInCvdStudy']")
	public WebElement g15BCVDCheckBoxValue;
	
	/** G.15b Diabetes Check Box Value */
	@FindBy (xpath = "//input[@id='bioMetaOutcomesInDiabetesStudy']")
	public WebElement g15BDiabetesCheckBoxValue;
	
	/** G.15b Other, specify: Check Box Value */
	@FindBy (xpath = "//input[@id='bioMetaOutcomesInOtherStudy']")
	public WebElement g15BOtherSpecifyCheckBoxValue;
	
	/** G.15b Other, specify: Text Box Value */
	@FindBy (xpath = "//textarea[@name='bioMetaOutcomesOtherStudySpecify']")
	public WebElement g15BOtherSpecifyTextBoxValue;
	
	/** G.15c Are you a member of the Consortium of Metabolomics Studies (COMETS)? */
	
	/** G.15c No Radio Button Value */
	@FindBy (xpath = "//input[@name='bioMemberOfMetabolomicsStudies' and @id='bioMemberOfMetabolomicsStudies_0']")
	public WebElement g15CRadioButtonNo;
	
	/** G.15c Yes Radio Button Value */
	@FindBy (xpath = "//input[@name='bioMemberOfMetabolomicsStudies' and @id='bioMemberOfMetabolomicsStudies_1']")
	public WebElement g15CRadioButtonYes;
	
	/** G.15d What is the number of participants with metabolomics data in your study? */
	
	/** G.15d Text Box */
	@FindBy (xpath = "//input[@name='bioMemberInStudy']")
	public WebElement g15DTextBox;
	
	/** G.15e Which laboratory or company was used for the analysis? Text Box */
	@FindBy (xpath = "//textarea[@name='bioLabsUsedForAnalysis']")
	public WebElement g15ETextBox;
	
	/** G.15f Which type(s) of analytical platform was used, (e.g., NMR, Orbitrap mass spectrometry, QTOF mass spectrometry)? Text Box */
	@FindBy (xpath = "//textarea[@name='bioAnalyticalPlatform']")
	public WebElement g15FTextBox;
	
	/** G.15g Which separation platform(s) was used (e.g., GC, HILIC, RPLC, Ion pairing LC)? Text Box */
	@FindBy (xpath = "//textarea[@name='bioSeparationPlatform']")
	public WebElement g15GTextBox;
	
	/** G.15h How many metabolites were measured? Text Box */
	@FindBy (xpath = "//input[@name='bioNumberMetabolitesMeasured']")
	public WebElement g15HTextBox;
	
	/** G.15i What year were samples analyzed? Text Box */
	@FindBy (xpath = "//input[@name='bioYearSamplesSent']")
	public WebElement g15ITextBox;
	
	/** Biospecimen Counts tab for Section G */
	@FindBy (xpath = "//button[contains(text(),'Biospecimens Counts')]")
	public WebElement biospecimenCountsTab;
	
	/** This is the biospecimen counts section when on the questionnaire */
	@FindBy (xpath = "(//span[contains(text(),'Biospecimen')])[4]")
	public WebElement biospecimenTabOnQuestionnaire;
	
	/** WebElements for the G16 Table */
	
	/** Types of Aliquots/Cancer Type */
	
	/** Oropharyngeal Values */
	
	/** Serum and/or Plasma/Oropharyngeal */
	@FindBy (xpath = "//input[@name='2-1']")
	public WebElement g16SerumOropharyngealTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Oropharyngeal */
	@FindBy (xpath = "//input[@name='2-2']")
	public WebElement g16BuffyOropharyngealTableValue;
	
	/** Saliva and/or Buccal/Oropharyngeal */
	@FindBy (xpath = "//input[@name='2-3']")
	public WebElement salivaOropharyngealTableValue;
	
	/** Urine/Oropharyngeal */
	@FindBy (xpath = "//input[@name='2-4']")
	public WebElement urineOropharyngealTableValue;
	
	/** Feces/Oropharyngeal */
	@FindBy (xpath = "//input[@name='2-5']")
	public WebElement fecesOropharyngealTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Oropharyngeal */
	@FindBy (xpath = "//input[@name='2-6']")
	public WebElement tumorTissueFreshFrozenOropharyngealTableValue;
	
	/** Tumor Tissue FFPE/Oropharyngeal */
	@FindBy (xpath = "//input[@name='2-7']")
	public WebElement tumorTissueFFPEOropharyngealTableValue;
	
	/** Esophagus Values */
	
	/** Serum and/or Plasma/Esophagus */
	@FindBy (xpath = "//input[@name='3-1']")
	public WebElement serumEsophagusTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Esophagus */
	@FindBy (xpath = "//input[@name='3-2']")
	public WebElement g16BuffyEsophagusTableValue;
	
	/** Saliva and/or Buccal/Esophagus */
	@FindBy (xpath = "//input[@name='3-3']")
	public WebElement salivaEsophagusTableValue;
	
	/** Urine/Esophagus */
	@FindBy (xpath = "//input[@name='3-4']")
	public WebElement urineEsophagusTableValue;
	
	/** Feces/Esophagus */
	@FindBy (xpath = "//input[@name='3-5']")
	public WebElement fecesEsophagusTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Esophagus */
	@FindBy (xpath = "//input[@name='3-6']")
	public WebElement tumorTissueFreshFrozenEsophagusTableValue;
	
	/** Tumor Tissue FFPE/Esophagus */
	@FindBy (xpath = "//input[@name='3-7']")
	public WebElement tumorTissueFFPEStomachEsophagusValue;
	
	/** Stomach Values */

	/** Serum and/or Plasma/Stomach */
	@FindBy (xpath = "//input[@name='4-1']")
	public WebElement serumStomachTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Stomach */
	@FindBy (xpath = "//input[@name='4-2']")
	public WebElement g16BuffyStomachTableValue;
	
	/** Saliva and/or Buccal/Stomach */
	@FindBy (xpath = "//input[@name='4-3']")
	public WebElement salivaStomachTableValue;
	
	/** Urine/Stomach */
	@FindBy (xpath = "//input[@name='4-4']")
	public WebElement urineStomachTableValue;
	
	/** Feces/Stomach */
	@FindBy (xpath = "//input[@name='4-5']")
	public WebElement fecesStomachTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Stomach */
	@FindBy (xpath = "//input[@name='4-6']")
	public WebElement tumorTissueFreshFrozenStomachTableValue;
	
	/** Tumor Tissue FFPE/Stomach */
	@FindBy (xpath = "//input[@name='4-7']")
	public WebElement tumorTissueFFPEStomachTableValue;
	
	/** Small Intestine Values */
	
	/** Serum and/or Plasma/Small intestine */
	@FindBy (xpath = "//input[@name='5-1']")
	public WebElement serumSmallIntestineTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Small intestine */
	@FindBy (xpath = "//input[@name='5-2']")
	public WebElement g16BuffySmallIntestineTableValue;
	
	/** Saliva and/or Buccal/Small intestine */
	@FindBy (xpath = "//input[@name='5-3']")
	public WebElement salivaSmallIntestineTableValue;
	
	/** Urine/Small intestine */
	@FindBy (xpath = "//input[@name='5-4']")
	public WebElement urineSmallIntestineTableValue;
	
	/** Feces/Small intestine */
	@FindBy (xpath = "//input[@name='5-5']")
	public WebElement fecesSmallIntestineTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Small intestine */
	@FindBy (xpath = "//input[@name='5-6']")
	public WebElement tumorTissueFreshFrozenSmallIntestineTableValue;
	
	/** Tumor Tissue FFPE/Small intestine */
	@FindBy (xpath = "//input[@name='5-7']")
	public WebElement tumorTissueFFPESmallIntestineTableValue;
	
	/** Colon Values */
	
	/** Serum and/or Plasma/Colon */
	@FindBy (xpath = "//input[@name='6-1']")
	public WebElement serumColonTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Colon */
	@FindBy (xpath = "//input[@name='6-2']")
	public WebElement g16BuffyColonTableValue;
	
	/** Saliva and/or Buccal/Colon */
	@FindBy (xpath = "//input[@name='6-3']")
	public WebElement salivaColonTableValue;
	
	/** Urine/Colon */
	@FindBy (xpath = "//input[@name='6-4']")
	public WebElement urineColonTableValue;
	
	/** Feces/Colon */
	@FindBy (xpath = "//input[@name='6-5']")
	public WebElement fecesColonTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Colon */
	@FindBy (xpath = "//input[@name='6-6']")
	public WebElement tumorTissueFreshFrozenColonTableValue;
	
	/** Tumor Tissue FFPE/Colon */
	@FindBy (xpath = "//input[@name='6-7']")
	public WebElement tumorTissueFFPEColonTableValue;
	
	/** Rectum and Anus Values */
	
	/** Serum and/or Plasma/Rectum and anus */
	@FindBy (xpath = "//input[@name='7-1']")
	public WebElement serumRectumAndAnusTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Rectum and anus */
	@FindBy (xpath = "//input[@name='7-2']")
	public WebElement g16BuffyRectumAndAnusTableValue;
	
	/** Saliva and/or Buccal/Rectum and anus */
	@FindBy (xpath = "//input[@name='7-3']")
	public WebElement salivaRectumAndAnusTableValue;
	
	/** Urine/Rectum and anus */
	@FindBy (xpath = "//input[@name='7-4']")
	public WebElement urineRectumAndAnusTableValue;
	
	/** Feces/Rectum and anus */
	@FindBy (xpath = "//input[@name='7-5']")
	public WebElement fecesRectumAndAnusTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Rectum and anus */
	@FindBy (xpath = "//input[@name='7-6']")
	public WebElement tumorTissueFreshFrozenRectumAndAnusTableValue;
	
	/** Tumor Tissue FFPE/Rectum and anus */
	@FindBy (xpath = "//input[@name='7-7']")
	public WebElement tumorTissueFFPERectumAndAnusTableValue;
	
	/** Liver Values */
	
	/** Serum and/or Plasma/Liver */
	@FindBy (xpath = "//input[@name='8-1']")
	public WebElement serumLiverTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Liver */
	@FindBy (xpath = "//input[@name='8-2']")
	public WebElement g16BuffyLiverTableValue;
	
	/** Saliva and/or Buccal/Liver */
	@FindBy (xpath = "//input[@name='8-3']")
	public WebElement salivaLiverTableValue;
	
	/** Urine/Liver */
	@FindBy (xpath = "//input[@name='8-4']")
	public WebElement urineLiverTableValue;
	
	/** Feces/Liver */
	@FindBy (xpath = "//input[@name='8-5']")
	public WebElement fecesLiverTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Liver */
	@FindBy (xpath = "//input[@name='8-6']")
	public WebElement tumorTissueFreshFrozenLiverTableValue;
	
	/** Tumor Tissue FFPE/Liver */
	@FindBy (xpath = "//input[@name='8-7']")
	public WebElement tumorTissueFFPELiverTableValue;
	
	/** Gall bladder Values */
	
	/** Serum and/or Plasma/Gall bladder */
	@FindBy (xpath = "//input[@name='9-1']")
	public WebElement serumGallBladderTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Small intestine */
	@FindBy (xpath = "//input[@name='9-2']")
	public WebElement g16BuffyGallBladderTableValue;
	
	/** Saliva and/or Buccal/Gall bladder */
	@FindBy (xpath = "//input[@name='9-3']")
	public WebElement salivaGallBladderTableValue;
	
	/** Urine/Gall bladder */
	@FindBy (xpath = "//input[@name='9-4']")
	public WebElement urineGallBladderTableValue;
	
	/** Feces/Gall bladder */
	@FindBy (xpath = "//input[@name='9-5']")
	public WebElement fecesGallBladderTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Gall bladder */
	@FindBy (xpath = "//input[@name='9-6']")
	public WebElement tumorTissueFreshFrozenGallBladderTableValue;
	
	/** Tumor Tissue FFPE/Gall bladder */
	@FindBy (xpath = "//input[@name='9-7']")
	public WebElement tumorTissueFFPEGallBladderTableValue;
	
	/** Pancreas Values */
	
	/** Serum and/or Plasma/Pancreas */
	@FindBy (xpath = "//input[@name='10-1']")
	public WebElement serumPancreasTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Pancreas */
	@FindBy (xpath = "//input[@name='10-2']")
	public WebElement g16BuffyPancreasTableValue;
	
	/** Saliva and/or Buccal/Pancreas */
	@FindBy (xpath = "//input[@name='10-3']")
	public WebElement salivaPancreasTableValue;
	
	/** Urine/Pancreas */
	@FindBy (xpath = "//input[@name='10-4']")
	public WebElement urinePancreasTableValue;
	
	/** Feces/Pancreas */
	@FindBy (xpath = "//input[@name='10-5']")
	public WebElement fecesPancreasTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Pancreas */
	@FindBy (xpath = "//input[@name='10-6']")
	public WebElement tumorTissueFreshFrozenPancreasTableValue;
	
	/** Tumor Tissue FFPE/Pancreas */
	@FindBy (xpath = "//input[@name='10-7']")
	public WebElement tumorTissueFFPEPancreasTableValue;
	
	/** Lung and bronchus Values */
	
	/** Serum and/or Plasma/Lung and bronchus */
	@FindBy (xpath = "//input[@name='11-1']")
	public WebElement serumLungAndBronchusTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Lung and bronchus */
	@FindBy (xpath = "//input[@name='11-2']")
	public WebElement g16BuffyLungAndBronchusTableValue;
	
	/** Saliva and/or Buccal/Lung and bronchus */
	@FindBy (xpath = "//input[@name='11-3']")
	public WebElement salivaLungAndBronchusTableValue;
	
	/** Urine/Lung and bronchus */
	@FindBy (xpath = "//input[@name='11-4']")
	public WebElement urineLungAndBronchusTableValue;
	
	/** Feces/Lung and bronchus */
	@FindBy (xpath = "//input[@name='11-5']")
	public WebElement fecesLungAndBronchusTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Lung and bronchus */
	@FindBy (xpath = "//input[@name='11-6']")
	public WebElement tumorTissueFreshFrozenLungAndBronchusTableValue;
	
	/** Tumor Tissue FFPE/Lung and bronchus */
	@FindBy (xpath = "//input[@name='11-7']")
	public WebElement tumorTissueFFPELungAndBronchusTableValue;
	
	/** Bone Values */
	
	/** Serum and/or Plasma/Bone */
	@FindBy (xpath = "//input[@name='12-1']")
	public WebElement serumBoneTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Bone */
	@FindBy (xpath = "//input[@name='12-2']")
	public WebElement g16BuffyBoneTableValue;
	
	/** Saliva and/or Buccal/Bone */
	@FindBy (xpath = "//input[@name='12-3']")
	public WebElement salivaBoneTableValue;
	
	/** Urine/Bone */
	@FindBy (xpath = "//input[@name='12-4']")
	public WebElement urineBoneTableValue;
	
	/** Feces/Bone */
	@FindBy (xpath = "//input[@name='12-5']")
	public WebElement fecesBoneTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Bone */
	@FindBy (xpath = "//input[@name='12-6']")
	public WebElement tumorTissueFreshFrozenBoneTableValue;
	
	/** Tumor Tissue FFPE/Bone */
	@FindBy (xpath = "//input[@name='12-7']")
	public WebElement tumorTissueFFPEBoneTableValue;
	
	/** Melanoma (excluding mucosal sites) Values */
	
	/** Serum and/or Plasma/Melanoma */
	@FindBy (xpath = "//input[@name='13-1']")
	public WebElement serumMelanomaTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Melanoma */
	@FindBy (xpath = "//input[@name='13-2']")
	public WebElement g16BuffyMelanomaTableValue;
	
	/** Saliva and/or Buccal/Melanoma */
	@FindBy (xpath = "//input[@name='13-3']")
	public WebElement salivaMelanomaTableValue;
	
	/** Urine/Melanoma */
	@FindBy (xpath = "//input[@name='13-4']")
	public WebElement urineMelanomaTableValue;
	
	/** Feces/Melanoma */
	@FindBy (xpath = "//input[@name='13-5']")
	public WebElement fecesMelanomaTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Melanoma */
	@FindBy (xpath = "//input[@name='13-6']")
	public WebElement tumorTissueFreshFrozenMelanomaTableValue;
	
	/** Tumor Tissue FFPE/Melanoma */
	@FindBy (xpath = "//input[@name='13-7']")
	public WebElement tumorTissueFFPEMelanomaTableValue;
	
	/** Invasive Breast Cancer Values */
	
	/** Serum and/or Plasma/Liver */
	@FindBy (xpath = "//input[@name='14-1']")
	public WebElement serumInvasiveBreastCancerTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Liver */
	@FindBy (xpath = "//input[@name='14-2']")
	public WebElement g16BuffyInvasiveBreastCancerTableValue;
	
	/** Saliva and/or Buccal/Liver */
	@FindBy (xpath = "//input[@name='14-3']")
	public WebElement salivaInvasiveBreastCancerTableValue;
	
	/** Urine/Liver */
	@FindBy (xpath = "//input[@name='14-4']")
	public WebElement urineInvasiveBreastCancerTableValue;
	
	/** Feces/Liver */
	@FindBy (xpath = "//input[@name='14-5']")
	public WebElement fecesInvasiveBreastCancerTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Liver */
	@FindBy (xpath = "//input[@name='14-6']")
	public WebElement tumorTissueFreshFrozenInvasiveBreastCancerTableValue;
	
	/** Tumor Tissue FFPE/Liver */
	@FindBy (xpath = "//input[@name='14-7']")
	public WebElement tumorTissueFFPEInvasiveBreastCancerTableValue;
	
	/** Cervix (Squamous cell carcinoma, Adenocarcinoma) Values */
	
	/** Serum and/or Plasma/Cervix */
	@FindBy (xpath = "//input[@name='16-1']")
	public WebElement serumCervixTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Cervix */
	@FindBy (xpath = "//input[@name='16-2']")
	public WebElement g16BuffyCervixTableValue;
	
	/** Saliva and/or Buccal/Cervix */
	@FindBy (xpath = "//input[@name='16-3']")
	public WebElement salivaCervixTableValue;
	
	/** Urine/Cervix */
	@FindBy (xpath = "//input[@name='16-4']")
	public WebElement urineCervixTableValue;
	
	/** Feces/Cervix */
	@FindBy (xpath = "//input[@name='16-5']")
	public WebElement fecesCervixTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Cervix */
	@FindBy (xpath = "//input[@name='16-6']")
	public WebElement tumorTissueFreshFrozenCervixTableValue;
	
	/** Tumor Tissue FFPE/Cervix */
	@FindBy (xpath = "//input[@name='16-7']")
	public WebElement tumorTissueFFPECervixTableValue;
	
	/** Corpus, body of uterus Values */

	/** Serum and/or Plasma/Corpus */
	@FindBy (xpath = "//input[@name='18-1']")
	public WebElement serumCorpusTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Corpus */
	@FindBy (xpath = "//input[@name='18-2']")
	public WebElement g16BuffyCorpusTableValue;
	
	/** Saliva and/or Buccal/Corpus */
	@FindBy (xpath = "//input[@name='18-3']")
	public WebElement salivaCorpusTableValue;
	
	/** Urine/Corpus */
	@FindBy (xpath = "//input[@name='18-4']")
	public WebElement urineCorpusTableValue;
	
	/** Feces/Corpus */
	@FindBy (xpath = "//input[@name='18-5']")
	public WebElement fecesCorpusTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Corpus */
	@FindBy (xpath = "//input[@name='18-6']")
	public WebElement tumorTissueFreshFrozenCorpusTableValue;
	
	/** Tumor Tissue FFPE/Corpus */
	@FindBy (xpath = "//input[@name='18-7']")
	public WebElement tumorTissueFFPECorpusTableValue;
	
	/** Ovary, fallopian tube, broad ligament Values */
	
	/** Serum and/or Plasma/Ovary */
	@FindBy (xpath = "//input[@name='19-1']")
	public WebElement serumOvaryTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Ovary */
	@FindBy (xpath = "//input[@name='19-2']")
	public WebElement g16BuffyOvaryTableValue;
	
	/** Saliva and/or Buccal/Ovary */
	@FindBy (xpath = "//input[@name='19-3']")
	public WebElement salivaOvaryTableValue;
	
	/** Urine/Ovary */
	@FindBy (xpath = "//input[@name='19-4']")
	public WebElement urineOvaryTableValue;
	
	/** Feces/Ovary */
	@FindBy (xpath = "//input[@name='19-5']")
	public WebElement fecesOvaryTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Ovary */
	@FindBy (xpath = "//input[@name='19-6']")
	public WebElement tumorTissueFreshFrozenOvaryTableValue;
	
	/** Tumor Tissue FFPE/Ovary */
	@FindBy (xpath = "//input[@name='19-7']")
	public WebElement tumorTissueFFPEOvaryTableValue;
	
	/** Prostate Values */
	
	/** Serum and/or Plasma/Prostate */
	@FindBy (xpath = "//input[@name='20-1']")
	public WebElement serumProstateTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Prostate */
	@FindBy (xpath = "//input[@name='20-2']")
	public WebElement g16BuffyProstateTableValue;
	
	/** Saliva and/or Buccal/Prostate */
	@FindBy (xpath = "//input[@name='20-3']")
	public WebElement salivaProstateTableValue;
	
	/** Urine/Prostate */
	@FindBy (xpath = "//input[@name='20-4']")
	public WebElement urineProstateTableValue;
	
	/** Feces/Prostate */
	@FindBy (xpath = "//input[@name='20-5']")
	public WebElement fecesProstateTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Prostate */
	@FindBy (xpath = "//input[@name='20-6']")
	public WebElement tumorTissueFreshFrozenProstateTableValue;
	
	/** Tumor Tissue FFPE/Prostate */
	@FindBy (xpath = "//input[@name='20-7']")
	public WebElement tumorTissueFFPEProstateTableValue;
	
	/** Bladder Values */
	
	/** Serum and/or Plasma/Bladder */
	@FindBy (xpath = "//input[@name='21-1']")
	public WebElement serumBladderTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Bladder */
	@FindBy (xpath = "//input[@name='21-2']")
	public WebElement g16BuffyBladderTableValue;
	
	/** Saliva and/or Buccal/Bladder */
	@FindBy (xpath = "//input[@name='21-3']")
	public WebElement salivaBladderTableValue;
	
	/** Urine/Bladder */
	@FindBy (xpath = "//input[@name='21-4']")
	public WebElement urineBladderTableValue;
	
	/** Feces/Bladder */
	@FindBy (xpath = "//input[@name='21-5']")
	public WebElement fecesBladderTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Bladder */
	@FindBy (xpath = "//input[@name='21-6']")
	public WebElement tumorTissueFreshFrozenBladderTableValue;
	
	/** Tumor Tissue FFPE/Bladder */
	@FindBy (xpath = "//input[@name='21-7']")
	public WebElement tumorTissueFFPEBladderTableValue;
	
	/** Kidney and other unspecified urinary organs Values */
	
	/** Serum and/or Plasma/Kidney */
	@FindBy (xpath = "//input[@name='22-1']")
	public WebElement serumKidneyTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Kidney */
	@FindBy (xpath = "//input[@name='22-2']")
	public WebElement g16BuffyKidneyTableValue;
	
	/** Saliva and/or Buccal/Kidney */
	@FindBy (xpath = "//input[@name='22-3']")
	public WebElement salivaKidneyTableValue;
	
	/** Urine/Kidney */
	@FindBy (xpath = "//input[@name='22-4']")
	public WebElement urineKidneyTableValue;
	
	/** Feces/Kidney */
	@FindBy (xpath = "//input[@name='22-5']")
	public WebElement fecesKidneyTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Kidney */
	@FindBy (xpath = "//input[@name='22-6']")
	public WebElement tumorTissueFreshFrozenKidneyTableValue;
	
	/** Tumor Tissue FFPE/Kidney */
	@FindBy (xpath = "//input[@name='22-7']")
	public WebElement tumorTissueFFPEKidneyTableValue;
	
	/** Brain Values */
	
	/** Serum and/or Plasma/Brain */
	@FindBy (xpath = "//input[@name='23-1']")
	public WebElement serumBrainTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Brain */
	@FindBy (xpath = "//input[@name='23-2']")
	public WebElement g16BuffyBrainTableValue;
	
	/** Saliva and/or Buccal/Brain */
	@FindBy (xpath = "//input[@name='23-3']")
	public WebElement salivaBrainTableValue;
	
	/** Urine/Brain */
	@FindBy (xpath = "//input[@name='23-4']")
	public WebElement urineBrainTableValue;
	
	/** Feces/Brain */
	@FindBy (xpath = "//input[@name='23-5']")
	public WebElement fecesBrainTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Brain */
	@FindBy (xpath = "//input[@name='23-6']")
	public WebElement tumorTissueFreshFrozenBrainTableValue;
	
	/** Tumor Tissue FFPE/Brain */
	@FindBy (xpath = "//input[@name='23-7']")
	public WebElement tumorTissueFFPEBrainTableValue;
	
	/** Thyroid Values */
	
	/** Serum and/or Plasma/Thyroid */
	@FindBy (xpath = "//input[@name='24-1']")
	public WebElement serumThyroidTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Thyroid */
	@FindBy (xpath = "//input[@name='24-2']")
	public WebElement g16BuffyThyroidTableValue;
	
	/** Saliva and/or Buccal/Thyroid */
	@FindBy (xpath = "//input[@name='24-3']")
	public WebElement salivaThyroidTableValue;
	
	/** Urine/Thyroid */
	@FindBy (xpath = "//input[@name='24-4']")
	public WebElement urineThyroidTableValue;
	
	/** Feces/Thyroid */
	@FindBy (xpath = "//input[@name='24-5']")
	public WebElement fecesThyroidTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Thyroid */
	@FindBy (xpath = "//input[@name='24-6']")
	public WebElement tumorTissueFreshFrozenThyroidTableValue;
	
	/** Tumor Tissue FFPE/Thyroid */
	@FindBy (xpath = "//input[@name='24-7']")
	public WebElement tumorTissueFFPEThyroidTableValue;
	
	/** Non-Hodgkin Lymphoma Values */
	
	/** Serum and/or Plasma/Non-Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='26-1']")
	public WebElement serumNonHodgkinLymphomaTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Non-Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='26-2']")
	public WebElement g16BuffyNonHodgkinLymphomaTableValue;
	
	/** Saliva and/or Buccal/Non-Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='26-3']")
	public WebElement salivaNonHodgkinLymphomaTableValue;
	
	/** Urine/Non-Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='26-4']")
	public WebElement urineNonHodgkinLymphomaTableValue;
	
	/** Feces/Non-Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='26-5']")
	public WebElement fecesNonHodgkinLymphomaTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Non-Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='26-6']")
	public WebElement tumorTissueFreshFrozenNonHodgkinLymphomaTableValue;
	
	/** Tumor Tissue FFPE/Non-Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='26-7']")
	public WebElement tumorTissueFFPENonHodgkinLymphomaTableValue;
	
	/** Hodgkin Lymphoma Values */
	
	/** Serum and/or Plasma/Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='25-1']")
	public WebElement serumHodgkinLymphomaTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='25-2']")
	public WebElement g16BuffyHodgkinLymphomaTableValue;
	
	/** Saliva and/or Buccal/Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='25-3']")
	public WebElement salivaHodgkinLymphomaTableValue;
	
	/** Urine/Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='25-4']")
	public WebElement urineHodgkinLymphomaTableValue;
	
	/** Feces/Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='25-5']")
	public WebElement fecesHodgkinLymphomaTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='25-6']")
	public WebElement tumorTissueFreshFrozenHodgkinLymphomaTableValue;
	
	/** Tumor Tissue FFPE/Hodgkin Lymphoma */
	@FindBy (xpath = "//input[@name='25-7']")
	public WebElement tumorTissueFFPEHodgkinLymphomaTableValue;
	
	/** Myeloma Values */
	
	/** Serum and/or Plasma/Myeloma */
	@FindBy (xpath = "//input[@name='27-1']")
	public WebElement serumMyelomaTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Myeloma */
	@FindBy (xpath = "//input[@name='27-2']")
	public WebElement g16BuffyMyelomaTableValue;
	
	/** Saliva and/or Buccal/Myeloma */
	@FindBy (xpath = "//input[@name='27-3']")
	public WebElement salivaMyelomaTableValue;
	
	/** Urine/Myeloma */
	@FindBy (xpath = "//input[@name='27-4']")
	public WebElement urineMyelomaTableValue;
	
	/** Feces/Myeloma */
	@FindBy (xpath = "//input[@name='27-5']")
	public WebElement fecesMyelomaTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Myeloma */
	@FindBy (xpath = "//input[@name='27-6']")
	public WebElement tumorTissueFreshFrozenMyelomaTableValue;
	
	/** Tumor Tissue FFPE/Myeloma */
	@FindBy (xpath = "//input[@name='27-7']")
	public WebElement tumorTissueFFPEMyelomaTableValue;
	
	/** Leukemia Values */
	
	/** Serum and/or Plasma/Leukemia */
	@FindBy (xpath = "//input[@name='28-1']")
	public WebElement serumLeukemiaTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Leukemia */
	@FindBy (xpath = "//input[@name='28-2']")
	public WebElement g16BuffyLeukemiaTableValue;
	
	/** Saliva and/or Buccal/Leukemia */
	@FindBy (xpath = "//input[@name='28-3']")
	public WebElement salivaLeukemiaTableValue;
	
	/** Urine/Leukemia */
	@FindBy (xpath = "//input[@name='28-4']")
	public WebElement urineLeukemiaTableValue;
	
	/** Feces/Leukemia */
	@FindBy (xpath = "//input[@name='28-5']")
	public WebElement fecesLeukemiaTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Leukemia */
	@FindBy (xpath = "//input[@name='28-6']")
	public WebElement tumorTissueFreshFrozenLeukemiaTableValue;
	
	/** Tumor Tissue FFPE/Leukemia */
	@FindBy (xpath = "//input[@name='28-7']")
	public WebElement tumorTissueFFPELeukemiaTableValue;
	
	/** Ductal carcinoma in situ of breast Values */
	
	/** Serum and/or Plasma/Ductal carcinoma in situ of breast */
	@FindBy (xpath = "//input[@name='15-1']")
	public WebElement serumDuctalCarcinomaBreastTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Ductal carcinoma in situ of breast */
	@FindBy (xpath = "//input[@name='15-2']")
	public WebElement g16BuffyDuctalCarcinomaBreastTableValue;
	
	/** Saliva and/or Buccal/Ductal carcinoma in situ of breast */
	@FindBy (xpath = "//input[@name='15-3']")
	public WebElement salivaDuctalCarcinomaBreastTableValue;
	
	/** Urine/Ductal carcinoma in situ of breast */
	@FindBy (xpath = "//input[@name='15-4']")
	public WebElement urineDuctalCarcinomaBreastTableValue;
	
	/** Feces/Ductal carcinoma in situ of breast */
	@FindBy (xpath = "//input[@name='15-5']")
	public WebElement fecesDuctalCarcinomaBreastTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Ductal carcinoma in situ of breast */
	@FindBy (xpath = "//input[@name='15-6']")
	public WebElement tumorTissueFreshFrozenDuctalCarcinomaBreastTableValue;
	
	/** Tumor Tissue FFPE/Ductal carcinoma in situ of breast */
	@FindBy (xpath = "//input[@name='15-7']")
	public WebElement tumorTissueFFPEDuctalCarcinomaBreastTableValue;
	
	/** Cervical carcinoma in situ (CIN II/III, CIS, AIS) Values */
	
	/** Serum and/or Plasma/Cervical carcinoma in situ (CIN II/III, CIS, AIS) */
	@FindBy (xpath = "//input[@name='17-1']")
	public WebElement serumCervicalCarcinomaTableValue;
	
	/** Buffy Coat and/or Lymphocytes/Cervical carcinoma in situ (CIN II/III, CIS, AIS) */
	@FindBy (xpath = "//input[@name='17-2']")
	public WebElement g16BuffyCervicalCarcinomaTableValue;
	
	/** Saliva and/or Buccal/Cervical carcinoma in situ (CIN II/III, CIS, AIS) */
	@FindBy (xpath = "//input[@name='17-3']")
	public WebElement salivaCervicalCarcinomaTableValue;
	
	/** Urine/Cervical carcinoma in situ (CIN II/III, CIS, AIS) */
	@FindBy (xpath = "//input[@name='17-4']")
	public WebElement urineCervicalCarcinomaTableValue;
	
	/** Feces/Cervical carcinoma in situ (CIN II/III, CIS, AIS) */
	@FindBy (xpath = "//input[@name='17-5']")
	public WebElement fecesCervicalCarcinomaTableValue;
	
	/** Tumor Tissue Fresh/Frozen/Cervical carcinoma in situ (CIN II/III, CIS, AIS) */
	@FindBy (xpath = "//input[@name='17-6']")
	public WebElement tumorTissueFreshFrozenCervicalCarcinomaTableValue;
	
	/** Tumor Tissue FFPE/Cervical carcinoma in situ (CIN II/III, CIS, AIS) */
	@FindBy (xpath = "//input[@name='17-7']")
	public WebElement tumorTissueFFPECervicalCarcinomaTableValue;
	
	/** All Other Cancers Values */
	
	/** Serum and/or Plasma/All Other Cancers */
	@FindBy (xpath = "//input[@name='1-1']")
	public WebElement serumAllOtherCancersTableValue;
	
	/** Buffy Coat and/or Lymphocytes/All Other Cancers */
	@FindBy (xpath = "//input[@name='1-2']")
	public WebElement g16BuffyAllOtherCancersTableValue;
	
	/** Saliva and/or Buccal/All Other Cancers */
	@FindBy (xpath = "//input[@name='1-3']")
	public WebElement salivaAllOtherCancersTableValue;
	
	/** Urine/All Other Cancers */
	@FindBy (xpath = "//input[@name='1-4']")
	public WebElement urineAllOtherCancersTableValue;
	
	/** Feces/All Other Cancers */
	@FindBy (xpath = "//input[@name='1-5']")
	public WebElement fecesAllOtherCancersTableValue;
	
	/** Tumor Tissue Fresh/Frozen/All Other Cancers */
	@FindBy (xpath = "//input[@name='1-6']")
	public WebElement tumorTissueFreshFrozenAllOtherCancersTableValue;
	
	/** Tumor Tissue FFPE/All Other Cancers */
	@FindBy (xpath = "//input[@name='1-7']")
	public WebElement tumorTissueFFPEAllOtherCancersTableValue;
	
	/** No Cancer Values */
	
	/** Serum and/or Plasma/No Cancer */
	@FindBy (xpath = "//input[@name='29-1']")
	public WebElement serumNoCancerTableValue;
	
	/** Buffy Coat and/or Lymphocytes/No Cancer */
	@FindBy (xpath = "//input[@name='29-2']")
	public WebElement g16BuffyNoCancerTableValue;
	
	/** Saliva and/or Buccal/No Cancer */
	@FindBy (xpath = "//input[@name='29-3']")
	public WebElement salivaNoCancerTableValue;
	
	/** Urine/No Cancer */
	@FindBy (xpath = "//input[@name='29-4']")
	public WebElement urineNoCancerTableValue;
	
	/** Feces/No Cancer */
	@FindBy (xpath = "//input[@name='29-5']")
	public WebElement fecesNoCancerTableValue;
	
	/** Tumor Tissue Fresh/Frozen/No Cancer */
	@FindBy (xpath = "//input[@name='29-6']")
	public WebElement tumorTissueFreshFrozenNoCancerTableValue;
	
	/** Tumor Tissue FFPE/No Cancer */
	@FindBy (xpath = "//input[@name='29-7']")
	public WebElement tumorTissueFFPENoCancerTableValue;
	
	/** Confirmation for submission pop up button */
	@FindBy (xpath = "(//button[contains(text(),'Submit')])[3]")
	public WebElement confirmSubmitPopUpButton;
	
	/** This is the webelement for the Select a Cohort Please select the cohort you wish to update from the list below.  Text */
	@FindBy (xpath = "//p[@class='welcome']")
	public WebElement chooseACohortText;
	
	/** This is the element for the first cohort in the select a cohort  */
	@FindBy (xpath = "//div[@class=' css-yk16xz-control']")
	public WebElement firstCohortOnSelectACohortDropDown;
	
	public CEDCDCohortPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
