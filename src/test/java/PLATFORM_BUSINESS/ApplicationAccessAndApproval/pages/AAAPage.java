package PLATFORM_BUSINESS.ApplicationAccessAndApproval.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AAAPage {

    /**Portal View Services dropdown*/
    @FindBy(xpath = "//*[@id='fresponsive']/li[1]/a")
    public WebElement servicesDropdownPortalView;

    /**Portal View Enterprise IT Services*/
    @FindBy(xpath = "//li//a[contains(text(),' Enterprise IT Services ')]")
    public WebElement enterpriseITServicesPortalView;

    /**Portal View Account Admin*/
    @FindBy(xpath = "//a[contains(text(),' Account Admin & IAM ')]")
    public WebElement accountAdminAIMPortalView;

    /**Portal View Account Administration*/
    @FindBy(xpath = "//span[contains(text(),'Account Administration')]")
    public WebElement accountAdministrationAIMPortalView;

    /**Portal View Aaa Remove permissions*/
    @FindBy(xpath = "//a[contains(text(),' Application Access and Approval ')]")
    public WebElement aaaPortalView;

    /**AAA Page Title*/
    @FindBy(xpath = "//title[contains(text(),'Add/Remove ServiceNow Permissions')]")
    public WebElement aaaPageTitle;

    /**AAA Page Header*/
    @FindBy(xpath = "//h1[.='Application Access and Approval']")
    public WebElement aaaPageHeader;

    /**Requested for dropdown*/
    @FindBy(xpath = "//div[@id='s2id_sp_formfield_requested_for']")
    public WebElement requestedForDropdown;

    /**Requested for field*/
    @FindBy(xpath = "//span[@id='select2-chosen-4']")
    public WebElement requestedForField;

    /**Requested for email*/
    @FindBy(xpath = "//input[@id='sp_formfield_sn_esign_document']")
    public WebElement requestedForEmailField;

    /**Requested for organization affiliation*/
    @FindBy(xpath = "//input[@id='sp_formfield_requested_for_organization_affiliation']")
    public WebElement organizationAffiliationField;

    /**System Name dropdown*/
    @FindBy(xpath = "//div//span[@id='select2-chosen-1']")
    public WebElement systemNameDropdown;

    /**Application datasources dropdown*/
    @FindBy(xpath = "//div[@id='s2id_sp_formfield_application_datasource_id']")
    public WebElement applDatasourcesDropdown;

    /**Application/Datasource Short Description field*/
    @FindBy(xpath = "//textarea[@id='sp_formfield_short_description']")
    public WebElement applDatasourcesDescriptionField;

    /**DOC level field*/
    @FindBy(xpath = "//div[@id='s2id_sp_formfield_doc_level']//input")
    public WebElement docLevelField;

    /**User Role field*/
    @FindBy(xpath = "//div[@id='s2id_sp_formfield_user_role']//input")
    public WebElement userRoleField;

    /**datepicker field*/
    @FindBy(xpath = "//input[@id='sp_formfield_valid_until_date']")
    public WebElement datepickerField;

    /**Business Justification field*/
    @FindBy(xpath = "//textarea[@id='sp_formfield_business_justification']")
    public WebElement businessJustificationField;

    /**Federal Supervisor drpd*/
    @FindBy(xpath = "//div[@id='s2id_sp_formfield_federal_supervisor']")
    public WebElement federalSupervisorDropdown;

    /**2nd Level Federal Supervisor drpd*/
    @FindBy(xpath = "//a[@class='select2-choice select2-default form-control']")
    public WebElement secondLevelSupervisorDropdown;

    public AAAPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
