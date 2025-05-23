package PLATFORM_BUSINESS.TransferFundsMOU.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TFMPage {

    /**Portal View Services dropdown*/
    @FindBy(xpath = "//*[@id='fresponsive']/li[1]/a")
    public WebElement servicesDropdownPortalViewTFM;

    /**Portal View Business Services*/
    @FindBy(xpath = "(//li//a[contains(text(),' Business Services ')])[1]")
    public WebElement businessServicesPortalViewTFM;

    /**TFM option*/
    @FindBy(xpath = " //a[contains(text(),'Transfer Funds MOU ')]")
    public WebElement tfmOption;

    /**Portal View TFM Page title*/
    @FindBy(xpath ="//h1[.='Transfer Funds MOU']")
    public WebElement pageTitleTFMPortalView;
    public TFMPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}