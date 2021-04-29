package AnalysisTools.CEDCD.Pages;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CEDCDCohortPage extends CommonUtils {
	
	/**========================= Login.gov WebElements =================================*/
	
	/** Username for Login.gov */
	@FindBy (xpath = "//input[@id = 'user_email']")
	public WebElement cohortUsername;
	
	/** Password for Login.gov */
	@FindBy (xpath = "//input[@id = 'user_password']")
	public WebElement cohortPassword;
	
	/** Sign in button for Login.gov */
	@FindBy (xpath = "//input[@type='submit']")
	public WebElement signinButton;
	
	
	/** =============== Questionnaire Section A ================= */
	
	/** =============== Cohort Information Section ===================== */
	
	/** Cohort Information section tab */
	@FindBy (xpath = "//button[contains(text(),'Cohort Information')]")
	public WebElement cohortInformationTab;
	
	/** A2 Cohort's Description text box */
	@FindBy (xpath = "//div/textarea[@placeholder = 'Max of 5000 characters']")
	public WebElement a2TextBox;
	
	/**  */
	@FindBy (xpath = "(//input[@placeholder='Max of 200 characters'])[1]")
	public WebElement a3TextBox;
	
	/** A4a Cohort Name */
	@FindBy (xpath = "//input[@name='completerName']")
	public WebElement a4aName;
	
	/** A4a Position with Cohort */
	@FindBy (xpath = "//input[@name='completerPosition']")
	public WebElement a4aCohortPosition;
	
	/** A4a Country code/Area number */
	@FindBy (xpath = "(//input[@title='country code'])[1]")
	public WebElement a4aCountryCode;
	
	/** A4a Phone number */
	@FindBy (xpath = "//input[@name='completerPhone']")
	public WebElement a4aPhone;
	
	/** A4a Email */
	@FindBy (xpath = "//input[@name='completerEmail']")
	public WebElement a4aEmail;
	
	/** A4b Is this the same person who completed this form radio no button */
	@FindBy (xpath = "//input[@id='clarification-contact-radio-no']")
	public WebElement a4bRadioButtonNo;
	
	/** A4b Is this the same person who completed this form radio button yes */
	@FindBy (xpath = "//input[@id='clarification-contact-radio-yes']")
	public WebElement a4bRadioButtonYes;
	
	/** A4b Cohort Name Textbox */
	@FindBy (xpath = "//input[@name='contacterName']")
	public WebElement a4bName;
	
	/** A4b Position with Cohort Textbox */
	@FindBy (xpath = "//input[@name='contacterPosition']")
	public WebElement a4bCohortPosition;
	
	/** A4b Country code/Area number Textbox*/
	@FindBy (xpath = "(//input[@title='country code'])[2]")
	public WebElement a4bCountryCode;
	
	/** A4b Phone number Textbox */
	@FindBy (xpath = "//input[@name='contacterPhone']")
	public WebElement a4bPhone;
	
	/** A4b Email Textbox */
	@FindBy (xpath = "//input[@name='contacterEmail']")
	public WebElement a4bEmail;
	
	/** =============== Principal Investigator Section ===================== */
	
	/** Principal Investigator section tab */
	@FindBy (xpath = "//button[contains(text(),'Principal Investigators')]")
	public WebElement principalInvestigatorTab;
	
	/** A5 Add New Investigator button */
	@FindBy (xpath = "//button[contains(text(),'Add New Investigator')]")
	public WebElement addNewInvestigator;
	
	/** A5 Cohort Principal Investigators Name Textbox */
	@FindBy (xpath = "//input[@name='investigator_name_0']")
	public WebElement a5InvestigatorsName;
	
	/** A5 Cohort Principal Investigators Institutions Textbox */
	@FindBy (xpath = "//input[@name='investigator_inst_0']")
	public WebElement a5InvestigatorsInstitution;
	
	/** A5 Cohort Principal Investigators Email Textbox */
	@FindBy (xpath = "//input[@name='investigator_email_0']")
	public WebElement a5InvestigatorsEmails;
	
	/** A6 If an investigator is interested in collaborating with your cohort on a new project, whom should they contact? */
	// something that isn't automated is adding more than one principal investigators -- clarification is needed if automation is necessary for more than 1 PI
	
	/** Same as the person who completed the form(4a) */
	@FindBy (xpath = "//input[@id='default-completerName-check']")
	public WebElement sameAs4aCheckbox;
	
	/** Same as the person who completed the form(4b) */
	@FindBy (xpath = "//input[@id='default-contacterName-check']")
	public WebElement sameAs4bCheckbox;
	
	/** A6 Collaborator's Name Textbox */
	@FindBy (xpath = "//input[@name='collaboratorName']")
	public WebElement collaboratorName;
	
	/** A6 Collaborator's Position with Cohort Textbox */
	@FindBy (xpath = "//input[@name='collaboratorPosition']")
	public WebElement collaboratorPosition;
	
	/** A6 Collaborator's Phone Number's Country Code Textbox */
	@FindBy (xpath = "(//input[@title='country code'])[3]")
	public WebElement collaboratorCountryCode;
	
	/** A6 Collaborator's Phone Number Textbox */
	@FindBy (xpath = "//input[@name='collaboratorPhone']")
	public WebElement collaboratorPhone;
	
	/** A6 Collaborator's Emails Textbox */
	@FindBy (xpath = "//input[@name='collaboratorEmail']")
	public WebElement collaboratorEmail;
	
	/** =============== Eligibility & Enrollment Section ===================== */
	
	/** Eligibility & Enrollment section tab */
	@FindBy (xpath = "//button[contains(text(),'Eligibility & Enrollment')]")
	public WebElement eligibilityAndEnrollmentTab;
	
	/** A7 Eligibility Criteria's Eligible Sex radio button*/
	@FindBy (xpath = "//label[contains(text(), 'All')]")
	public WebElement eligibleSexAllValue;
	
	/** A7 Eligibility Criteria's Eligible Sex radio button */
	@FindBy (xpath = "//label[contains(text(), 'Males only')]")
	public WebElement eligibleSexMaleOnlyValue;
	
	/** A7 Eligibility Criteria's Eligible Sex radio button */
	@FindBy (xpath = "//label[contains(text(), 'Females only')]")
	public WebElement eligibleSexFemaleOnlyValue;
	
	/** A7 Baseline population consists of Check box */
	@FindBy (xpath = "//label[contains(text(), 'Cancer survivors only, specify cancer site(s)')]")
	public WebElement baselinePopulationCheckbox;
	
	/** A7 Baseline population consists of Text box */
	@FindBy (xpath = "//input[@name='cancerSites']")
	public WebElement baselinePopulationTextbox;
	
	/** A7 Please specify any eligibility criteria in addition to age and sex Textbox */
	@FindBy (xpath = "//input[@name='eligible_disease_other_specify']")
	public WebElement eligibilityDiseaseOtherSpecifyTextbox;
	
	/** A8 Total number of subject's enrolled to date textbox */
	@FindBy (xpath = "//input[@name='enrollment_total']")
	public WebElement enrollmentTotal;
	
	/** A8 Started in year textbox*/
	@FindBy (xpath = "//input[@name='enrollment_year_start']")
	public WebElement startedInYear;
	
	/** A8 is enrollment ongoing No radio button */
	@FindBy (xpath = "//input[@id='enrollment-ongoing-radio-no']")
	public WebElement enrollmentOngoingNoRadio;
	
	/** A8 is enrollment ongoing Yes radio button */
	@FindBy (xpath = "//input[@id='enrollment-ongoing-radio-yes']")
	public WebElement enrollmentOngoingYesRadio;
	
	/** A8 Ended in Year only applicable if No is selected */
	@FindBy (xpath = "//input[@name='enrollment_year_end']")
	public WebElement endedInYear;
	
	/** A8 Ended in Year only applicable if Yes is selected */
	@FindBy (xpath = "//input[@name='enrollment_target']")
	public WebElement targetNumberPlannedToEnroll;
	
	/** A8 Ended in Year only applicable if Yes is selected */
	@FindBy (xpath = "//input[@name='enrollment_year_complete']")
	public WebElement targetCountCompletionYear;
	
	/** A8 Baseline Age range of enrolled subjects minimum value */
	@FindBy (xpath = "//input[@name='enrollment_age_min']")
	public WebElement enrollmentAgeMin;
	
	/** A8 Baseline Age range of enrolled subjects maximum value */
	@FindBy (xpath = "//input[@name='enrollment_age_max']")
	public WebElement enrollmentAgeMax;
	
	/** A8 Baseline Median Age */
	@FindBy (xpath = "//input[@name='enrollment_age_median']")
	public WebElement enrollmentMedianAge;
	
	/** A8 Baseline Mean Age */
	@FindBy (xpath = "//input[@name='enrollment_age_mean']")
	public WebElement enrollmentMeanAge;
	
	/** A8 Current Age range of enrolled participants minimum value */
	@FindBy (xpath = "//input[@name='current_age_min']")
	public WebElement currentAgeMin;
	
	/** A8 Current Age range of enrolled participants maximum value */
	@FindBy (xpath = "//input[@name='current_age_max']")
	public WebElement currentAgeMax;
	
	/** A8 Current Median Age */
	@FindBy (xpath = "//input[@name='current_age_median']")
	public WebElement currentMedianAge;
	
	/** A8 Current Mean Age */
	@FindBy (xpath = "//input[@name='current_age_mean']")
	public WebElement currentMeanAge;
	
	/** =============== Recruitment Section ===================== */
	
	/** Recruitment Section Tab */
	@FindBy (xpath = "//button[contains(text(),'Recruitment')]")
	public WebElement recruitmentTab;
	
	/** A9 Specify the frequency of questionnaires, e.g, annually, every 2 years etc. text box */
	@FindBy (xpath = "(//div[@class='col-sm-12']/input[@placeholder='Max of 200 characters'])[2]")
	public WebElement questionnaireFrequency;
	
	/** A10 Most recent year questionnaire data was collected? text box */
	@FindBy (xpath = "//input[@name='most_recent_year']")
	public WebElement mostRecentYear;
	
	/** A11 In person value */
	@FindBy (xpath = "//label[contains(text(),'In person')]")
	public WebElement a11InPerson;
	
	/** A11 Phone Interview value */
	@FindBy (xpath = "//label[contains(text(),'Phone interview')]")
	public WebElement a11PhoneInterview;
	
	/** A11 Self Administered via paper value */
	@FindBy (xpath = "//label[contains(text(),'Self-administered via paper')]")
	public WebElement a11AdministeredViaPaper;
	
	/** A11 Self Administered via web based device value */
	@FindBy (xpath = "//label[contains(text(),'Self-administered via web-based device')]")
	public WebElement a11AdministeredViaWebBasedDevice;
	
	/** A11 Other, please specify value */
	@FindBy (xpath = "//label[contains(text(),'Other, please specify')]")
	public WebElement a11otherPleaseSpecify;
	
	/** A11 Other, please specify text box value */
	@FindBy (xpath = "(//input[@name='data_collected_other_specify'])[1]")
	public WebElement a11otherPleaseSpecifyTextbox;
	
	/** A12 None value */
	@FindBy (xpath = "(//label[contains(text(),'None')])[1]")
	public WebElement a12None;
	
	/** A12 Require collaboration with cohort investigators value */
	@FindBy (xpath = "//label[contains(text(),'Require collaboration with cohort investigators')]")
	public WebElement a12CollabWithCohortInvestigator;
	
	/** A12 Require IRB approvals value */
	@FindBy (xpath = "//label[contains(text(),'Require IRB approvals')]")
	public WebElement a12RequireIRBApproval;
	
	/** A12 Require data use agreements and/or material transfer agreement value */
	@FindBy (xpath = "//label[contains(text(),'Require data use agreements and/or material transfer agreement')]")
	public WebElement a12MaterialTransferAgreement;
	
	/** A12 Restrictions in the consent related to genetic information value */
	@FindBy (xpath = "//label[contains(text(),'Restrictions in the consent related to genetic information')]")
	public WebElement a12GeneticInformation;
	
	/** A12 Restrictions in the consent related to linking to other databases value */
	@FindBy (xpath = "//label[contains(text(),'Restrictions in the consent related to linking to other databases')]")
	public WebElement a12LinkingOtherDatabases;
	
	/** A12 Restrictions on commercial use value */
	@FindBy (xpath = "//label[contains(text(),'Restrictions on commercial use')]")
	public WebElement a12CommercialUse;
	
	/** A12 Other, please specify value */
	@FindBy (xpath = "(//label[contains(text(),'Other, please specify')])[2]")
	public WebElement a12OtherPleaseSpecify;
	
	/** A12 Other, please specify text box */
	@FindBy (xpath = "(//input[@name='data_collected_other_specify'])[2]")
	public WebElement a12OtherPleaseSpecifyTextbox;
	
	/** A13 None value */
	@FindBy (xpath = "(//label[contains(text(),'None')])[2]")
	public WebElement a13None;
	
	/** A13 Send newsletters or other information or personal mailings unrelated to data collection (e.g., birthday cards) value */
	@FindBy (xpath = "//label[contains(text(),'Send newsletters or other information or personal mailings unrelated to data collection (e.g., birthday cards)')]")
	public WebElement a13SendNewsletters;
	
	/** A13 Share study findings with participants value */
	@FindBy (xpath = "//label[contains(text(),'Share study findings with participants')]")
	public WebElement a13ShareStudyFindings;
	
	/** A13 Provide individual results to participants (e.g. genetic variants, blood pressure) value */
	@FindBy (xpath = "//label[contains(text(),'Provide individual results to participants (e.g. genetic variants, blood pressure)')]")
	public WebElement a13GeneticVariantsBloodPressure;
	
	/** A13 Include participants on advisory committees value */
	@FindBy (xpath = "//label[contains(text(),'Include participants on advisory committees')]")
	public WebElement a13AdvisoryCommittees;
	
	/** A13 Invite participants to attend meetings/workshops value */
	@FindBy (xpath = "//label[contains(text(),'Invite participants to attend meetings/workshops')]")
	public WebElement a13AttendMeetingsAndWorkshop;
	
	/** A13 Incorporate participant input on research process value */
	@FindBy (xpath = "//label[contains(text(),'Incorporate participant input on research process')]")
	public WebElement a13InputOnResearchProcess;
	
	/** A13 Other participant-centered or outreach activities, please specify value */
	@FindBy (xpath = "//label[contains(text(),'Other participant-centered or outreach activities, please specify')]")
	public WebElement a13OtherPleaseSpecify;
	
	/** A13 Other please specify text box */
	@FindBy (xpath = "//input[@name='strategy_other_specify']")
	public WebElement a13OtherPleaseSpecifyTextbox;
	
	/** =============== Documents Section ===================== */
	
	/** Documents section tab */
	@FindBy (xpath = "//button[contains(text(),'Documents')]")
	public WebElement documentsTab;
	
	/** ====================================Action Buttons========================================== */
	
	/** Previous Action Button */
	@FindBy (xpath = "//button[contains(text(),'Previous')]")
	public WebElement previousButton;
	
	/** Next Action Button */
	@FindBy (xpath = "//button[contains(text(),'Next')]")
	public WebElement nextButton;
	
	/** Save Action Button */
	@FindBy (xpath = "(//button[contains(text(),'Save')])[1]")
	public WebElement saveButton;
	
	/** Save and Continue Action Button */
	@FindBy (xpath = "//button[contains(text(),'Save & Continue')]")
	public WebElement saveAndContinueButton;
	
	/** Save Action Button */
	@FindBy (xpath = "//button[contains(text(),'Submit For Review')]")
	public WebElement submitForReviewButton;
	
	/** =============== Questionnaire Section B ================= */
	
	/** Enrollment Date **/
	@FindBy(xpath = "(//*[@type='text'])[6]")
	public WebElement enrollmentDateBox; 
	
	
	
	/** =============== Questionnaire Section D ================= */
	
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
	

public CEDCDCohortPage(){
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
}
