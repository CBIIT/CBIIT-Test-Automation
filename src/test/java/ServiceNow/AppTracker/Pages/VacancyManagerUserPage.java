package ServiceNow.AppTracker.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class VacancyManagerUserPage extends CommonUtils {

	/** Vacancy Dashboard Page Header **/
	@FindBy(xpath = "//h1[contains(text(),'Vacancy Dashboard')]")
	public WebElement vacancyDashboardPageHeader;

	/** Create Vacancy Button **/
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
	public WebElement createVacancyButton;

	/** Vacancy Page Vacancy Title Input Field **/
	@FindBy(xpath = "//input[@id='BasicInfo_title']")
	public WebElement vacancyTitleField;

	/** Vacancy Page Vacancy Description Input Field **/
	@FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
	public WebElement vacancyDescriptionField;

	/** Vacancy Description Header **/
	@FindBy(xpath = "//h3[contains(text(),'Basic Vacancy Information')]")
	public WebElement vacancyHeader;

	/** Recommendation Option **/
	@FindBy(xpath = "//div[@class='ant-slider-step']")
	public WebElement lettersOfRecommendation;

	/** Basic Vacancy Information Save Button **/
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-primary wider-button']")
	public WebElement basicVacancyInformationSaveButton;

	/** Review and Finalize Page verify number of letters of recommendation **/
	@FindBy(xpath = "//li[@class='ListItemTrue' and text()='2']")
	public WebElement numberOfLettersOfRecommendation;

	/** List of Vacancy Sections **/
	@FindBy(css = "div.ant-steps-item")
	public List<WebElement> listOfSections;

	/** Vacancy Committee Section **/
	@FindBy(xpath = "//div[@class='ant-steps-item-title' and text()='Vacancy Committee']")
	public WebElement vacancyCommitteeSection;

	/** Vacancy Committee Section Header **/
	@FindBy(xpath = "//h3[text()='Vacancy Committee']")
	public WebElement vacancyCommitteeSectionHeader;

	/** Basic Vacancy Section **/
	//@FindBy(xpath = "//div[@class='ant-steps-item ant-steps-item-process ant-steps-item-active']")
	@FindBy(xpath = "//div[@class='ant-steps-item-title' and text()='Basic Vacancy Information']")
	public WebElement basicVacancySection;

	/** Mandatory Statements Section **/
	@FindBy(xpath = "//div[@class='ant-steps-item-title' and text()='Mandatory Statements']")
	public WebElement mandatoryStatementsSection;

	/** Mandatory Statements Section Equal Opportunity Employer text verify **/
	@FindBy(xpath = "//p[contains(text(), 'Equal Opportunity Employer')]")
	public WebElement equalOpportunityEmployerInMandatorySection;

	/** Mandatory Statements Section text verify **/
	@FindBy(xpath = "//div[@id='MandatoryStatements_equalOpportunityEmployerText']//p")
	public WebElement textOfSectionEqualOpportunityEmployer;

	/**
	 * Mandatory Statements Section Standards of Conduct/Financial Disclosure text
	 * verify
	 **/
	@FindBy(xpath = "//p[contains(text(), 'Standards of Conduct/Financial Disclosure')]")
	public WebElement standardsOfConductFinancialDisclosureInMandatorySection;

	/** Mandatory Statements Section Foreign Education text verify **/
	@FindBy(xpath = "//p[contains(text(), 'Foreign Education')]")
	public WebElement foreignEducationInMandatorySection;

	/** Mandatory Statements Section Reasonable Accommodation text verify **/
	@FindBy(xpath = "//p[contains(text(), 'Reasonable Accommodation')]")
	public WebElement reasonableAccommodationInMandatorySection;

	/** Mandatory Statements Foreign Education text verify **/
	@FindBy(xpath = "//div[@id='MandatoryStatements_foreignEducationText']//p" )
	public WebElement textOfSectionForeignEducationText;

	/** Mandatory Statements Section Standards of Conduct text verify **/
	@FindBy(xpath = "//div[@id='MandatoryStatements_standardsOfConductText']//p")
	public WebElement textOfSectionStandardsOfConductText;

	/** Mandatory Statements Section Reasonable Accommodation text verify **/
	@FindBy(xpath = "//div[@id='MandatoryStatements_reasonableAccomodationText']//p")
	public WebElement textOfSectionReasonableAccommodationText;

	/** Email Templates Committee Section **/
	@FindBy(xpath = "(//div[@class='ant-steps-item-title'])[4]")
	public WebElement emailTamplatesSection;

	/** Review Section **/
	@FindBy(xpath = "//div[@class='ant-steps-item-title' and text()='Review and Finalize']")
	public WebElement reviewSection;

	/** Basic Vacancy tab pre-flight vacancies **/
	@FindBy(xpath = "(//p[@class='vacancy-desc'])[1]")
	public WebElement preFlightVacanciesTab;

	/** Basic Vacancy tab pre-flight vacancies ALL sub filters **/
	@FindBy(xpath = "(//span[contains(text(), 'All')])[1]")
	public WebElement allPreFlightSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab pre-flight vacancies Draft sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Draft')]")
	public WebElement draftSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab pre-flight vacancies Finalized sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Finalized')]")
	public WebElement finalizedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab live vacancies ALL sub filters **/
	@FindBy(xpath = "(//span[contains(text(), 'All')])[2]")
	public WebElement allLiveSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab live vacancies **/
	@FindBy(xpath = "(//p[@class='vacancy-desc'])[2]")
	public WebElement liveVacanciesTab;

	/** Basic Vacancy tab live vacancies Live sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Live')]")
	public WebElement liveSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab live vacancies Extended sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Extended')]")
	public WebElement extendedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies **/
	@FindBy(xpath = "(//p[@class='vacancy-desc'])[3]")
	public WebElement closedVacanciesTab;

	/** Basic Vacancy tab closed vacancies ALL sub filters **/
	@FindBy(xpath = "(//span[contains(text(), 'All')])[3]")
	public WebElement allClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies Closed sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Closed')]")
	public WebElement closedClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies Triaged sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Triaged')]")
	public WebElement triagedClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies Individually Scored sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Individually Scored')]")
	public WebElement individuallyScoredClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies Scored sub filters **/
	@FindBy(xpath = "(//span[contains(text(), 'Scored')])[2]")
	public WebElement scoredClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy tab closed vacancies Archived sub filters **/
	@FindBy(xpath = "//span[contains(text(), 'Archived')]")
	public WebElement archivedClosedSubFiltersTextpreFlightVacanciesTab;

	/** Basic Vacancy Open Date calendar input **/
	@FindBy(xpath = "//input[@id='BasicInfo_openDate']")
	public WebElement openCalendarInputButtonInBasicVacancySection;

	/** Basic Vacancy Close Date calendar input **/
	@FindBy(xpath = "//input[@id='BasicInfo_closeDate']")
	public WebElement closeCalendarInputButtonInBasicVacancySection;

	/** Basic Vacancy Date calendar input **/
	@FindBy(xpath = "(//td[@title='2021-05-14'])[1]")
	public WebElement date;

	/** Basic Vacancy Open Date calendar table **/
	@FindBy(xpath = "(//table[@class='ant-picker-content'])[1]")
	public WebElement openCalendarTableInBasicVacancySection;

	/** Basic Vacancy Close Date calendar table **/
	@FindBy(xpath = "(//table[@class='ant-picker-content'])[2]")
	public WebElement closeCalendarTableInBasicVacancySection;

	/** Basic Vacancy Today's OpenDate calendar table **/
	@FindBy(xpath = "(//input[@title='2021-05-18'])[1]")
	public WebElement todaysOpenDate;

	/** Basic Vacancy Today's CloseDate calendar table **/
	@FindBy(xpath = "(//input[@title='2021-05-18'])[2]")
	public WebElement todaysCloseDate;
	
	/**Toggle Button on Mandatory Statements page section Equal Opportunity Employer**/
	@FindBy(xpath = "//button[@id='MandatoryStatements_equalOpportunityEmployer']")
	public WebElement toggleButtonEqualOpportunityEmployer;
	
	/**Toggle Button on Mandatory Statements page section Standards of Conduct**/
	@FindBy(xpath = "//button[@id='MandatoryStatements_standardsOfConduct']")
	public WebElement toggleButtonStandardsOfConduct;
	
	/**Toggle Button on Mandatory Statements page section Foreign Education**/
	@FindBy(xpath = "//button[@id='MandatoryStatements_foreignEducation']")
	public WebElement toggleButtonForeignEducation;
	
	/**Toggle Button on Mandatory Statements page section Reasonable Accommodation**/
	@FindBy(xpath = "//button[@id='MandatoryStatements_reasonableAccomodation']")
	public WebElement toggleButtonReasonableAccommodation;
	
	/**Curriculum Vitae field**/
	@FindBy(xpath= "//input[@id='BasicInfo_applicationDocuments_0_document']")
	public WebElement curriculumVitaeField;
	
	/**Cover Letter field**/
	@FindBy(xpath= "//input[@id='BasicInfo_applicationDocuments_1_document']")
	public WebElement coverLetterField;
	
	/**Vision Statement field**/
	@FindBy(xpath= "//input[@id='BasicInfo_applicationDocuments_2_document']")
	public WebElement visionStatementField;
	
	/**Qualification Statement field**/
	@FindBy(xpath= "//input[@id='BasicInfo_applicationDocuments_3_document']")
	public WebElement qualificationStatementField;
	
	/**Trash Icon of Curriculum Vitae field**/
	@FindBy(xpath= "(//button[@class='ant-btn ant-btn-Link ant-btn-icon-only BorderlessButton'])[1]")
	public WebElement trashIconofCurriculumVitae;
	
	/**Trash Icon of Cover Letter field**/
	@FindBy(xpath= "(//button[@class='ant-btn ant-btn-Link ant-btn-icon-only BorderlessButton'])[2]")
	public WebElement trashIconofCoverLetter;
	
	/**Trash Icon of Vision Statement field**/
	@FindBy(xpath= "(//button[@class='ant-btn ant-btn-Link ant-btn-icon-only BorderlessButton'])[3]")
	public WebElement trashIconofVisionStatement;
	
	/**Trash Icon of Qualification Statement field**/
	@FindBy(xpath= "(//button[@class='ant-btn ant-btn-Link ant-btn-icon-only BorderlessButton'])[4]")
	public WebElement trashIconofQualificationStatement;
	
	/**Optional Checkbox of Curriculum Vitae field**/
	@FindBy(xpath= "//input[@id='BasicInfo_applicationDocuments_0_isDocumentOptional']")
	public WebElement optionalCheckboxOfCurriculumVitae;
	
	/**Optional Checkbox of Cover Letter field**/
	@FindBy(xpath= "//input[@id='BasicInfo_applicationDocuments_1_isDocumentOptional']")
	public WebElement optionalCheckboxOfCoverLetter;
	
	/**Optional Checkbox of Vision Statement field**/
	@FindBy(xpath= "//input[@id='BasicInfo_applicationDocuments_2_isDocumentOptional']")
	public WebElement optionalCheckboxOfVisionStatement;
	
	/**Optional Checkbox of Qualification Statement field**/
	@FindBy(xpath= "//input[@id='BasicInfo_applicationDocuments_3_isDocumentOptional']")
	public WebElement optionalCheckboxOfQualificationStatement;
	
	/**Add More Button**/
	@FindBy(xpath= "//span[contains(text(), ' add more')]")
	public WebElement addMoreButton;
	
	
	/**New Field added by clicking AddMore Button**/
	@FindBy(xpath= "//input[@id='BasicInfo_applicationDocuments_3_document']")
	public WebElement newFieldForAddMoreButton;
	
	
	/**Application Saved Field**/
	@FindBy(xpath= "//p[contains(text(), 'Application saved')]")
	public WebElement applicationSavedField;
	
	/**Application is Inactive Field**/
	@FindBy(xpath= "//p[contains(text(), 'Application is inactive')]")
	public WebElement applicationIsInactiveField;
	
	/**Application submitted confirmation Field**/
	@FindBy(xpath= "//p[contains(text(), 'Application submitted confirmation')]")
	public WebElement applicationSubmittedConfirmationField;
	
	/**Not referred to interview Field**/
	@FindBy(xpath= "//p[contains(text(), 'Not referred to interview')]")
	public WebElement notReferredToInterviewField;
	
	/**Not referred to interview Field**/
	@FindBy(xpath= "//p[contains(text(), 'Invitation to interview')]")
	public WebElement invitationToInterviewField;
	
	/** Application Saved Toggle Button**/
	@FindBy(xpath= "//button[@id='EmailTemplates_emailTemplates_0_active']")
	public WebElement applicationSavedToggleButton;
	
	/** Application is Inactive Toggle Button**/
	@FindBy(xpath= "//button[@id='EmailTemplates_emailTemplates_1_active']")
	public WebElement applicationIsInactiveToggleButton;
	
	/** Application submitted confirmation Toggle Button**/
	@FindBy(xpath= "//button[@id='EmailTemplates_emailTemplates_2_active']")
	public WebElement ApplicationSubmittedConfirmationToggleButton;
	
	/** Not referred to interview Toggle Button**/
	@FindBy(xpath= "//button[@id='EmailTemplates_emailTemplates_3_active']")
	public WebElement notReferredToInterviewToggleButton;
	
	/** Invitation to interview Toggle Button**/
	@FindBy(xpath= "//button[@id='EmailTemplates_emailTemplates_4_active']")
	public WebElement invitationToInterviewToggleButton;
	
	/** Application Saved Text Field**/
	@FindBy(xpath= "//div[@id='EmailTemplates_emailTemplates_0_text']//p[4]")
	public WebElement applicationSavedTextField;
	
	/** Open Date alert**/
	@FindBy(xpath= "//div[@class='ant-form-item-explain ant-form-item-explain-error']")
	public WebElement openDateErrorMessage;
	

	/** Close Date alert**/
	@FindBy(xpath= "//div[@class='ant-form-item-explain ant-form-item-explain-error']")
	public WebElement closeDateErrorMessage;
	
	/**Add Member Button in Vacancy Committee section**/
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-secondary AddButton']")
	public WebElement addMemberButton;
	
	/**Committee Member dropdown in Vacancy Committee section**/
	@FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
	public WebElement committeeMemberDropdown;
	
	/**Role dropdown**/
	@FindBy(xpath ="//div[@class='ant-select-selector']")
	public WebElement roleDropdown;
	
	
	/**APPTRACK SCORING MEMBER**/
	@FindBy(xpath="//*[contains (text(), 'APPTRACK SCORING MEMBER')]")
	public WebElement apptrackScoringMember;
	
	/**APPTRACK COMMITTEE MEMBER**/
	@FindBy(xpath="//*[contains (text(), 'APPTRACK COMMITTEE MEMBER')]")
	public WebElement apptrackCommitteeMember;
	
	/**APPTRACK COMMITTEE MEMBER**/
	@FindBy(xpath="//*[contains (text(), 'APPTRACK VACANCY MANAGER')]")
	public WebElement apptrackVacancyManager;
	
	/*** Role as Member voting*/
	@FindBy(xpath="//div[@class='ant-select-item-option-content' and text()='Member (voting)']")
	public WebElement roleMemberVoting;
	
	/**Role as Chair**/
	@FindBy(xpath="//div[@class='ant-select-item-option-content' and text()='Chair']")
	public WebElement roleChair;
	
	/**Role as Executive Secretary**/
	@FindBy(xpath="//div[@class='ant-select-item-option-content' and text()='Executive Secretary']")
	public WebElement roleExecutiveSecretary;
	
	
	/**Save Button for adding member**/
	@FindBy(xpath ="//*[@class='ant-btn ant-btn-link ActionButton']//*[contains(text(), 'save')]")
	public WebElement saveButtonAddingMember;
	
	/**Beginning of text of  Alert Message in Review & Finalize Section**/
	@FindBy(xpath = "//div[@class='ErrorPanel']//p[1]")
	public WebElement beginningAlertMessage;
	
	/**End of text of  Alert Message in Review & Finalize Section**/
	@FindBy(xpath = "//div[@class='ErrorPanel']//p[2]")
	public WebElement endAlertMessage;
	
	/**Calendar DatePicker**/
	@FindBy(xpath ="//div[@class='ant-picker-cell-inner']")
	public List<WebElement> calendarDatePicker;
	
	
	public VacancyManagerUserPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}

}
