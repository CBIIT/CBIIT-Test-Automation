package GRANTS.ChangePassword.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ChangePasswordPage extends CommonUtils {
    /**
     * Page assertion
     **/
    @FindBy(xpath = "//h2[contains(text(),'Change I2E / Data Mart password for user: ANDREYEVE')]")
    public WebElement pageTitle;
    /**
     * Password Field One
     **/
    @FindBy(xpath = "//input[@id='passwordOne']")
    public WebElement passwordFieldOne;
    /**
     * Password Field Two
     **/
    @FindBy(xpath = "//input[@id='passwordTwo']")
    public WebElement passwordFieldTwo;
    /**
     * Change Button
     **/
    @FindBy(xpath = "//input[@id='submit']")
    public WebElement changeButton;
    /**
     * Success Message
     **/
    @FindBy(xpath = "//span[@class='span-alert-message']")
    public WebElement successMessage;
    /**
     * Failure Message- 15 characters
     **/
    @FindBy(xpath = "//span[@id='passwordOne.errors']")
    public WebElement failureMessageCharacterLimit;
    /**
     * Failure Message- Old password
     **/
    @FindBy(xpath = "//span[@id='passwordTwo.errors']")
    public WebElement failureMessageOldPassword;

    public ChangePasswordPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}

