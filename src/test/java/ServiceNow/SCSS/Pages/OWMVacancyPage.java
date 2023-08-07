package ServiceNow.SCSS.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OWMVacancyPage  extends CommonUtils {

    public OWMVacancyPage() {
        PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
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

    /** Vacancy Title field **/
    @FindBy(xpath = "//input[@id='BasicInfo_title']")
    public WebElement vacancyTitleField;

    /** Vacancy Description Field **/
    @FindBy(xpath = "(//div[@class='ql-editor ql-blank'])[1]")
    public WebElement vacancyDescriptionField;

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

    /** Position Classification Dropdown **/
    @FindBy(xpath = "//span//input[@id='BasicInfo_positionClassification']")
    public WebElement positionClassificationDropdown;

    /** Position Classification Dropdown Scientific Executive **/
    @FindBy(xpath = "(//div[contains(text(),'Scientific Executive')])[2]")
    public WebElement positionScientificExecutive;

    /** Position Classification Dropdown  Senior Scientific Officer **/
    @FindBy(xpath = "(//div[contains(text(),'Senior Scientific Officer')])[2]")
    public WebElement positionSeniorScientificOfficer;

    /** Position Classification Dropdown Scientific Director **/
    @FindBy(xpath = "(//div[contains(text(),'Scientific Director')])[2]")

    public WebElement positionScientificDirector;

    /** Appointment Package Initiator **/
    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
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
    @FindBy(xpath = "//button//span[contains(text(),'save')]")
    public WebElement saveButton;


}
