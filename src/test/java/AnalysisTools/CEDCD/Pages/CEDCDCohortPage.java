package AnalysisTools.CEDCD.Pages;

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

	/** Username for Login.gov */
	@FindBy(xpath = "//input[@id = 'user_email']")
	public WebElement cohortUsername;

	/** Password for Login.gov */
	@FindBy(xpath = "//input[@id = 'user_password']")
	public WebElement cohortPassword;

	/** Sign in button for Login.gov */
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement signinButton;

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

	/** =================================== */

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

	/** =================================== */

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

	/** =================================== */

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

	/** =================================== */

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

	/** =================================== */

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

	/** =================================== */

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

	/** =================================== */

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

	public CEDCDCohortPage() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}
}
