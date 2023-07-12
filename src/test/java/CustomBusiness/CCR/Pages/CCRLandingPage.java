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
    /** LogIn dropdown */
    @FindBy(xpath = "//li[@class='dropdown ng-scope']")
    public WebElement logInDropdwn;

    /** Internal users option */
    @FindBy(xpath = "//li//a[contains(text(),'Internal Users')]")
    public WebElement internalUsersOption;

    /** CCR Careers hyperlink */
    @FindBy(xpath = "//a[@href='https://ccr.cancer.gov/careers']")
    public WebElement ccrCareersHyperlink;














}
