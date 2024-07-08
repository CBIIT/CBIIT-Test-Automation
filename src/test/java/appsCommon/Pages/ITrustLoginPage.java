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

    /**
     * LOGIN LINK
     */
    @FindBy(xpath = "(//a[@ng-click='clickedOnIt()'])[1]")
    public WebElement loginLink;

    /**
     * USERNAME FIELD
     */
    @FindBy(xpath = "//input[@id='USER']")
    public WebElement userNameField;

    /**
     * PASSWORD FIELD
     */
    @FindBy(xpath = "//input[@id='PASSWORD']")
    public WebElement passwordField;

    /**
     * SIGN IN BUTTON
     */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    /**
     * FORGOT PASSWORD LINK
     */
    @FindBy(xpath = "//a[@class='forgot-password']")
    public WebElement forgotPasswordLink;

    /**
     * TROUBLE SIGNING IN LINK
     */
    @FindBy(xpath = "//a[text()='Trouble signing in?']")
    public WebElement TroubleSigningInLink;

    /**
     * PROFILE DROP DOWN
     */
    @FindBy(xpath = "//button[@id='user-info-dropdown']")
    public WebElement profileDropDown;

    /**
     * COVID CODE SIGN OUT BUTTON
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