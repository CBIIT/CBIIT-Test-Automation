package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fcasVendorPortalPage {

    /**Existing Contracts page header*/
    @FindBy(xpath = "//h1[.='Existing Contracts']")
    public WebElement existingContractsPageHeader;

    public fcasVendorPortalPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
