package ANALYSIS_TOOLS.GDSTracking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class GDSLoginPage extends CommonUtils {

    /* This is the username text box */
    @FindBy(xpath = "//input[@id='USER']")
    public WebElement username;

    /* This is the password text box */
    @FindBy(xpath = "//input[@id='PASSWORD']")
    public WebElement password;

    /* This is the sign in button */
    @FindBy(xpath = "(//button[contains(text(),'Sign in')])[2]")
    public WebElement signInButton;

    public GDSLoginPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}