package appsCommon.Pages;

import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.WebDriverUtils;
import io.github.sukgu.support.ElementFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class NativeView_SideDoor_Login_Page extends CommonUtils {

    /**
     * SIDE DOOR USERNAME FIELD
     **/
    @FindBy(xpath = "//input[@type='text']")
    public static WebElement sideDoorUserNameField;

    /**
     * SIDE DOOR PASSWORD FIELD
     **/
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement sideDoorPasswordField;

    /**
     * SIGN IN BUTTON
     */
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement signInButton;

    /**
     * Enters user-name to Native View Side door username text box
     */
    public static void enterSideDoorUsername(String username) {
        sideDoorUserNameField.clear();
        sendKeys(sideDoorUserNameField, ConfUtils.getProperty(username));
    }

    /**
     * Enters password to Native View Side door password text box
     */
    public static void enterSideDoorPassword(String password) {
        sideDoorPasswordField.clear();
        String decryptedPass = EncryptionUtils.decrypt(ConfUtils.getProperty(password));
        sendKeys(sideDoorPasswordField, decryptedPass);
    }

    /**
     * Clicks sign-in button
     */
    public static void clickSignInButton() {
        CommonUtils.clickOnElement(signInButton);
    }

    public NativeView_SideDoor_Login_Page() {
        ElementFieldDecorator decorator = new ElementFieldDecorator(new DefaultElementLocatorFactory(WebDriverUtils.webDriver));
        PageFactory.initElements(decorator, this);
    }
}