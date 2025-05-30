package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCASVENDORPORTALPage {

    /**Existing Contracts page header*/
    @FindBy(xpath = "//h1[.='Existing Contracts']")
    public WebElement existingContractsPageHeader;

    /**accept option Welcome Screen*/
    @FindBy(xpath = "//span[.='Accept']")
    public WebElement acceptWelcomeScreen;

    /**All Contracts dropdown*/
    @FindBy(xpath = "(//span[.='All Contracts'])[1]")
    public WebElement allContractsDropdown;

    /**All Contracts option*/
    @FindBy(xpath = "(//span[.='All Contracts'])[3]")
    public WebElement allContractsOption;

    /**My Contracts option*/
    @FindBy(xpath = "//span[.='All Contracts']")
    public WebElement myContractsOption;

    /**Show closed Contracts option*/
    @FindBy(xpath = "//*[@id='mat-checkbox-1']/label/span[2]")
    public WebElement showClosedContractsOption;

    /**text serach field*/
    @FindBy(xpath = "//div//input[@placeholder='Search this page...']")
    public WebElement textSearchField;

    public FCASVENDORPORTALPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
