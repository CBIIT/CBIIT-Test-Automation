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
    @FindBy(xpath = "//a[contains(text(),' Add/Remove ServiceNow Permissions ')]")
    public WebElement addRemovePermissionsPortalView;

    /**AAA Page Title*/
    @FindBy(xpath = "//title[contains(text(),'Add/Remove ServiceNow Permissions')]")
    public WebElement aaaPageTitle;

    public AAAPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
