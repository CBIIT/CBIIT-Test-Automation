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

    public AAAPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
