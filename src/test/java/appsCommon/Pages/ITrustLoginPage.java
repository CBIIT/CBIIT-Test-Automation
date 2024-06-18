package appsCommon.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class ITrustLoginPage extends CommonUtils {

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right hidden-xs hidden-sm ng-scope']//li//a")
    public WebElement loginLink;

    /**
     * Username field
     */
    @FindBy(xpath = "//input[@id='USER']")
    public WebElement userNameField;

    /**
     * Password field
     */
    @FindBy(xpath = "//input[@id='PASSWORD']")
    public WebElement passwordField;

    /**
     * Sign in button
     */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    /**
     * Forgot Password link
     */
    @FindBy(xpath = "//a[@class='forgot-password']")
    public WebElement forgotPasswordLink;

    /**
     * Trouble Signing In link
     */
    @FindBy(xpath = "//a[text()='Trouble signing in?']")
    public WebElement TroubleSigningInLink;

    /**
     * Clicks on the user's profile drop down
     */
    @FindBy(xpath = "//button[@id='user-info-dropdown']")
    public WebElement profileDropDown;

    /**
     * Clicks on the profile drop down and selects "Sign Out"
     */
    @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
    public WebElement covidCodeSignOutButton;

    public ITrustLoginPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /**
     * Enters a username into the specified username field.
     *
     * @param userNameField The web element representing the username field.
     * @param username      The username to be entered.
     */
    public void enterUsername(WebElement userNameField, String username) {
        userNameField.clear();
        sendKeys(userNameField, ConfUtils.getProperty(username));
    }

    /**
     * Enters a password into the password field.
     *
     * @param password The password to be entered.
     */
    public void enterPassword(String password) {
        passwordField.clear();
        String decryptedPass = EncryptionUtils.decrypt(ConfUtils.getProperty(password));
        sendKeys(passwordField, decryptedPass);
    }

    /**
     * Clicks on the Sign In button on the iTrust login page.
     * The method uses the CommonUtils class to perform the click action.
     */
    public void clickSignInButton() {
        CommonUtils.clickOnElement(signInButton);
    }

    /**
     * Clicks on log in button on the COVIDCode home page
     */
    public void covidCodeLogInButton() {
        JavascriptUtils.clickByJS(loginLink);
    }
}