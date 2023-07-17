package CustomBusiness.CCR.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CCRLandingPage extends CommonUtils {
    public CCRLandingPage() {
        PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
    }
    /** Home Tab */
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[contains(text(),'Home')]")
    public WebElement homeTab;
    /** Positions Tab */
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[contains(text(),'Positions')]")
    public WebElement positionsTab;
}
