package ServiceNow.SCSS.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OWMVacancyPage  extends CommonUtils {

    public OWMVacancyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** SCSS Landing Page title **/
    @FindBy(xpath = "//div//h1[contains(text(),'Specialized Scientific Jobs')]")
    public WebElement scssLandingPageTitle;

    /** Vacancy Dashboard Tab **/
    @FindBy(xpath = "//ul[@class='ant-menu-overflow ant-menu ant-menu-root ant-menu-horizontal ant-menu-light']//a[@href='#/vacancy-dashboard']")
    public WebElement vacancyDashboardTab;

    /** Dynamic locator for tab options **/
    public WebElement tabOption(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='" + value + "']"));
    }

    /** Create vacancy button **/
    @FindBy(xpath = "//*[contains(text(),'+ Create Vacancy')]")
    public WebElement createVacancyButton;

    /** Basic Vacancy Information text **/
    @FindBy(xpath = "//h3[normalize-space()='Basic Vacancy Information']")
    public WebElement basicVacancyInformationText;

    /** Mandatory Statements text **/
    @FindBy(xpath = "//h3[normalize-space()='Mandatory Statements']")
    public WebElement mandatoryStatementsText;

    /** Vacancy Committee text **/
    @FindBy(xpath = "//h3[normalize-space()='Vacancy Committee']")
    public WebElement vacancyCommitteeText;

    /** Email Templates text **/
    @FindBy(xpath = "//h3[normalize-space()='Email Templates']")
    public WebElement emailTemplatesText;

    /** Review and Finalize text **/
    @FindBy(xpath = "//h3[normalize-space()='Review and Finalize']")
    public WebElement reviewAndFinalizeText;

    /** Vacancy Title field **/
    @FindBy(xpath = "//input[@id='BasicInfo_title']")
    public WebElement vacancyTitleField;

    /** Vacancy Description Field **/
    @FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
    public WebElement vacancyDescriptionField;

    /** Enable Focus Area Checkbox **/
    @FindBy(xpath = "//*[@id='BasicInfo_requireFocusArea']")
    public WebElement enableFocusAreaCheckbox;

    /** Open Vacancy Text **/
    @FindBy(xpath = "//h2[normalize-space()='Open Vacancies']")
    public WebElement openVacancyText;

    /** Live Vacancies Vacancy Title Text **/
    @FindBy(xpath = "//*[@id='rc-tabs-0-panel-live']/div[2]/div/div/div/div/div/div/table/thead/tr/th[1]")
    public WebElement liveVacanciesVacancyTitleText;

    /** Closed Vacancies Vacancy Title Text **/
    @FindBy(xpath = "//*[@id='rc-tabs-0-panel-closed']/div[2]/div/div/div/div/div/div/table/thead/tr/th[1]")
    public WebElement closedVacanciesVacancyTitleText;

    /** Live Vacancies Applicants Text **/
    @FindBy(xpath = "//*[@id='rc-tabs-0-panel-live']/div[2]/div/div/div/div/div/div/table/thead/tr/th[3]/div/span[1]")
    public WebElement liveVacanciesApplicantsText;

    /** Closed Vacancies Applicants Text **/
    @FindBy(xpath = "//*[@id='rc-tabs-0-panel-closed']/div[2]/div/div/div/div/div/div/table/thead/tr/th[2]/div/span[1]")
    public WebElement closedVacanciesApplicantsText;

    /** Live Vacancies Open Date Text **/
    @FindBy(xpath = "//*[@id='rc-tabs-0-panel-live']/div[2]/div/div/div/div/div/div/table/thead/tr/th[4]/div/span[1]")
    public WebElement liveVacanciesOpenDateText;

    /** Live Vacancies Close Date Text **/
    @FindBy(xpath = "//*[@id='rc-tabs-0-panel-live']/div[2]/div/div/div/div/div/div/table/thead/tr/th[5]/div/span[1]")
    public WebElement liveVacanciesCloseDateText;

    /** Closed Vacancies Close Date Text **/
    @FindBy(xpath = "//*[@id='rc-tabs-0-panel-closed']/div[2]/div/div/div/div/div/div/table/thead/tr/th[3]/div/span[1]")
    public WebElement closedVacanciesCloseDateText;

    /** Live Vacancies Actions Text **/
    @FindBy(xpath = "//*[@id='rc-tabs-0-panel-live']/div[2]/div/div/div/div/div/div/table/thead/tr/th[6]")
    public WebElement liveVacanciesActionsText;

    /** Closed Vacancies Actions Text **/
    @FindBy(xpath = "//*[@id='rc-tabs-0-panel-closed']/div[2]/div/div/div/div/div/div/table/thead/tr/th[4]")
    public WebElement closedVacanciesActionsText;

    /** Your Vacancies Assigned To You Text **/
    @FindBy(xpath = "//h1[normalize-space()='Vacancies Assigned To You']")
    public WebElement yourVacanciesAssignedToYouText;

    /** Dynamic locator for column filters options **/
    public WebElement columnFilterOption(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[normalize-space()='" + value + "']"));
    }

    /** Dynamic locator for column filters options **/
    public WebElement columnFilterOptionVacancyDashboard(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//th[normalize-space()='" + value + "']"));
    }

    /** Dynamic locator for column filters options vacancies **/
    public WebElement columnFilterOptionVacancies(int value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='ant-tabs-tabpane ant-tabs-tabpane-active']//child::div[1]//child::div[1]//child::label[" + value + "]/child::span[2]"));
    }

    /** Dynamic locator for vacancie dashboard tabs **/
    public WebElement vacancyDashboardTabs(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//p[normalize-space()='" + value + "']"));
    }

    /** Vacancy Close Date Text Box **/
    @FindBy(xpath = "//*[@id='BasicInfo_closeDate']")
    public WebElement vacancyCloseDateTextBox;

    /** Vacancy Scoring Due Date Text Box **/
    @FindBy(xpath = "//*[@id='BasicInfo_scoringDueByDate']")
    public WebElement vacancyScoringDueDateTextBox;

    /** Basic Vacancy Open Date calendar table **/
    @FindBy(xpath = "//input[@id='BasicInfo_openDate']")
    public WebElement openCalendarTableInBasicVacancySection;

    /** NIH Link **/
    @FindBy(xpath = "//a[normalize-space()='https://www.nih.gov/about-nih/who-we-are']")
    public WebElement nihLink;

    /** Who We Are Text **/
    @FindBy(xpath = "//a[@class='link-disabled']")
    public WebElement whoWeAreText;


    /** Calendar DatePicker **/
    @FindBy(xpath = "//div[@class='ant-picker-cell-inner']")
    public List<WebElement> calendarDatePicker;

    /** Allow HR Specialist to triage checkbox **/
    @FindBy(xpath = "//input[@id='BasicInfo_allowHrSpecialistTriage']")
    public WebElement allowHRSpecialistToTriageCheckbox;

    /** Cover Letter Optional checkmark **/
    @FindBy(xpath = "//input[@id='BasicInfo_applicationDocuments_1_isDocumentOptional']")
    public WebElement coverLetterOptionalCheckmark;

    /** Curriculum Vitae Optional checkmark **/
    @FindBy(xpath = "//input[@id='BasicInfo_applicationDocuments_0_isDocumentOptional']")
    public WebElement curriculumVitaeOptionalCheckmark;

    /** Qualification Statement Optional checkmark **/
    @FindBy(xpath = "//input[@id='BasicInfo_applicationDocuments_3_isDocumentOptional']")
    public WebElement qualificationStatementOptionalCheckmark;

    /** Recommendations Slider**/
    @FindBy(xpath = "//div[@role='slider']")
    public WebElement recommendationsSlider;

    /** Position Classification Dropdown **/
    @FindBy(xpath = "//span//input[@id='BasicInfo_positionClassification']")
    public WebElement positionClassificationDropdown;

    /** Position Classification Dropdown Option **/
    public WebElement positionClassificationDropdownOption(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='" + value + "']"));
    }

    /** Position Classification Dropdown Options **/
    public WebElement positionClassificationDropdownOptions(int value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='rc-virtual-list-holder-inner']//child::div[" + value + "]//child::div"));
    }

    /** Appointment Package Initiator **/
    @FindBy(xpath = "//label[@for='BasicInfo_appointmentPackageIndicator']//parent::div//parent::div//child::div[2]//child::div//child::div//child::div//child::div//child::span[2]")
    public WebElement apptPackageInitiatorField;

    /** Organizational Field Dropdown **/
    @FindBy(xpath = "//input[@id='BasicInfo_sacCode']")
    public WebElement orgFieldDropdown;

    /** Save button **/
    @FindBy(xpath = "//div[@class='steps-action']//button//span[contains(text(),'Save')]")
    public WebElement saveButton;

    /** SCSS Log out User Button **/
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-link ant-dropdown-trigger Login']")
    public WebElement logOutUserButton;

    /** SCSS Log out Button **/
    @FindBy(xpath = "//span[@class='ant-dropdown-menu-title-content']")
    public WebElement logOutButton;

    /** At Least One Committee Member Text **/
    @FindBy(xpath = "//*[@id='VacancyCommittee_vacancyCommitteeValidator_help']/div")
    public WebElement atLeastOneCommitteeMemberText;

    /** At Least One Email Template Text **/
    @FindBy(xpath = "//*[@id='EmailTemplates_emailTemplatesValidator_help']/div")
    public WebElement atLeastOneEmailTemplateText;

    /** Mandatory Statement Equal Opportunity Employer Button **/
    @FindBy(xpath = "//*[@id='MandatoryStatements_equalOpportunityEmployer']")
    public WebElement mandatoryStatementEqualOpportunityEmployerButton;

    /** Mandatory Statement Standards of Conduct Button **/
    @FindBy(xpath = "//*[@id='MandatoryStatements_standardsOfConduct']")
    public WebElement mandatoryStatementStandardsOfConductButton;

    /** Application saved Button **/
    @FindBy(xpath = "//*[@id='EmailTemplates_emailTemplates_0_active']")
    public WebElement applicationSavedButton;

    /** Application submitted confirmation Button **/
    @FindBy(xpath = "//*[@id='EmailTemplates_emailTemplates_1_active']")
    public WebElement applicationSubmittedButton;

    /** Mandatory Statement Foreign Education Button **/
    @FindBy(xpath = "//*[@id='MandatoryStatements_foreignEducation']")
    public WebElement mandatoryStatementForeignEducationButton;

    /** Mandatory Statement Reasonable Accommodation Button **/
    @FindBy(xpath = "//*[@id='MandatoryStatements_reasonableAccomodation']")
    public WebElement mandatoryStatementReasonableAccommodationButton;

    /** Review Finalize Tab **/
    @FindBy(xpath = "//div[contains(text(),'Review and Finalize')]")
    public WebElement reviewFinalizeTab;

    /** Save and Finalize button **/
    @FindBy(xpath = "//button//span[contains(text(),'Save and Finalize')]")
    public WebElement saveAndFinalizeButton;

    /** Select Committee Member dropdown **/
    @FindBy(xpath = "//div[@class=' css-yk16xz-control']")
    public WebElement selectComMemberDropdown;

    /** Committee Member **/
    public WebElement committeeMember(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='reference-field css-2b097c-container']//*[contains(text(),'" + value + "')]"));
    }

    /** Role **/
    public WebElement role(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[contains(text(),'" + value + "')]"));
    }

    /** OWM Vacancy Dynamic Locator Home Page**/
    public WebElement owmVacancyDynamicLocatorHomePage(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='" + value + "']//parent::td//parent::tr//child::td[2]"));
    }

    /** Action Save button **/
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-link ActionButton']//span[contains(text(),'Save')]")
    public WebElement actionSaveButton;

    /** Executive Secretary (non-voting) role **/
    @FindBy(xpath = "//div[contains(text(),'Executive Secretary (non-voting)')]")
    public WebElement exeSecretaryRole;

    /** Add Member button **/
    @FindBy(xpath = "//button//span[contains(text(),' Add Member')]")
    public WebElement addMemberButton;

    /** Role dropdwon **/
    @FindBy(xpath = "//div[@class='ant-select-selector']//span[@title='Member (voting)']")
    public WebElement roleDropdownMemberVoting;

    /** Close Confirmation Alert **/
    @FindBy(xpath = "//span[normalize-space()='Close']")
    public WebElement closeConfirmationAlert;

    /** OK Confirmation Alert **/
    @FindBy(xpath = "//span[normalize-space()='OK']")
    public WebElement acceptConfirmationAlert;

    /** Ready To Finalize Vacancy Text **/
    @FindBy(xpath = "//h2[normalize-space()='Ready to finalize vacancy?']")
    public WebElement readyToFinalizeVacancyText;

    /** Specialized Scientific Jobs Text **/
    @FindBy(xpath = "//h1[normalize-space()='Specialized Scientific Jobs']")
    public WebElement specializedScientificJobsText;

    /** Vacancy Finalized Text **/
    @FindBy(xpath = "//h2[normalize-space()='Vacancy finalized']")
    public WebElement vacancyFinalizedText;
}
