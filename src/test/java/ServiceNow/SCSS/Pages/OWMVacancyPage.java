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

    /** Vacancy Open Date Text Box **/
    @FindBy(xpath = "//*[@id='BasicInfo_openDate']")
    public WebElement vacancyOpenDateTextBox;

    /** Vacancy Close Date Text Box **/
    @FindBy(xpath = "//*[@id='BasicInfo_closeDate']")
    public WebElement vacancyCloseDateTextBox;

    /** Vacancy Scoring Due Date Text Box **/
    @FindBy(xpath = "//*[@id='BasicInfo_scoringDueByDate']")
    public WebElement vacancyScoringDueDateTextBox;

    /** Basic Vacancy Open Date calendar table **/
    @FindBy(xpath = "//input[@id='BasicInfo_openDate']")
    public WebElement openCalendarTableInBasicVacancySection;

    /** Basic Vacancy Close Date calendar table **/
    @FindBy(xpath = "//input[@id='BasicInfo_closeDate']")
    public WebElement closeCalendarTableInBasicVacancySection;

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

//    /** Position Classification Dropdown Option **/
//    public WebElement organizationCodeDropdownOption(String value) {
//        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='ant-select-item-option-content'][normalize-space()='" + value + "']"));
//    }

    /** Position Classification Dropdown Scientific Executive **/
    @FindBy(xpath = "//div[@class='rc-virtual-list-holder-inner']//div[@title='Scientific Executive']")
    public WebElement positionScientificExecutive;

    /** Position Classification Dropdown  Senior Scientific Officer **/
    @FindBy(xpath = "(//div[contains(text(),'Senior Scientific Officer')])[2]")
    public WebElement positionSeniorScientificOfficer;

    /** Position Classification Dropdown Scientific Director **/
    @FindBy(xpath = "(//div[contains(text(),'Scientific Director')])[2]")
    public WebElement positionScientificDirector;

    /** Appointment Package Initiator **/
    @FindBy(xpath = "//label[@for='BasicInfo_appointmentPackageIndicator']//parent::div//parent::div//child::div[2]//child::div//child::div//child::div//child::div//child::span[2]")
    public WebElement apptPackageInitiatorField;

    /** Organizational Field Dropdown **/
    @FindBy(xpath = "//input[@id='BasicInfo_sacCode']")
    public WebElement orgFieldDropdown;

    /** Organizational Code HNC **/
    @FindBy(xpath = "//div[@title='HNC']")
    public WebElement orgHNC;

    /** Organizational Code HNC1 **/
    @FindBy(xpath = "//div[@title='HNC1']")
    public WebElement orgHNC1;

    /** Organizational Code HNC14 **/
    @FindBy(xpath = "//div[@title='HNC14']")
    public WebElement orgHNC14;

    /** Save button **/
    @FindBy(xpath = "//div[@class='steps-action']//button//span[contains(text(),'Save')]")
    public WebElement saveButton;

    /** SCSS Log out User Button **/
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-link ant-dropdown-trigger Login']")
    public WebElement logOutUserButton;

    /** SCSS Log out Button **/
    @FindBy(xpath = "//span[@class='ant-dropdown-menu-title-content']")
    public WebElement logOutButton;

    /** Save Member Button **/
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-link ActionButton']")
    public WebElement saveNewMemberButton;

    /** Committee Member One Dropdown **/
    @FindBy(xpath = "//div[contains(@class,'css-1hwfws3')]")
    public WebElement committeeMemberOneDropdown;

    /** Committee Role One Dropdown **/
    @FindBy(xpath = "//div[contains(@class,'css-1hwfws3')]")
    public WebElement roleOneDropdown;

    /** Committee Role Two Dropdown **/
    @FindBy(xpath = "//span[@title='Member (voting)']")
    public WebElement roleTwoDropdown;

    /** At Least One Committee Member Text **/
    @FindBy(xpath = "//*[@id='VacancyCommittee_vacancyCommitteeValidator_help']/div")
    public WebElement atLeastOneCommitteeMemberText;

    /** At Least One Email Template Text **/
    @FindBy(xpath = "//*[@id='EmailTemplates_emailTemplatesValidator_help']/div")
    public WebElement atLeastOneEmailTemplateText;

    /** Vacancy Committee Tab **/
    @FindBy(xpath = "//div[contains(text(),'Vacancy Committee')]")
    public WebElement vacCommiteeTab;

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

    /** ok Confirmation Alert **/
    @FindBy(xpath = "//span[normalize-space()='OK']")
    public WebElement okConfirmationAlert;

    /** Vacancy Finalized Alert **/
    @FindBy(xpath = "//span[normalize-space()='OK']")
    public WebElement vacancyFinalizedAlert;

    /** Close Confirmation Alert **/
    @FindBy(xpath = "//span[normalize-space()='Close']")
    public WebElement closeConfirmationAlert;

    /** OK Confirmation Alert **/
    @FindBy(xpath = "//span[normalize-space()='OK']")
    public WebElement acceptConfirmationAlert;

    /** Ready To Finalize Vacancy Text **/
    @FindBy(xpath = "//h2[normalize-space()='Ready to finalize vacancy?']")
    public WebElement readyToFinalizeVacancyText;

    /** Vacancy Finalized Text **/
    @FindBy(xpath = "//h2[normalize-space()='Vacancy finalized']")
    public WebElement vacancyFinalizedText;
}
