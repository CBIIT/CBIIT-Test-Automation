package ServiceNow.SEER.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewEmailsPage extends CommonUtils {

    /** --------------- NATIVE VIEW EMAILS PAGE --------------- */

    /**NativeView Emails Button */
    @FindBy(xpath = "//*[@id=\'8d620b63c611227b008368697b0b8d7b\']/div/div")
    public WebElement nativeViewAccessEmailsButton;

    /**Native View Emails Dropdown Menu*/
    @FindBy(xpath = "//*[@id=\'list_nav_sys_email\']/div/div[1]/h1/a")
    public WebElement emailsMenu;

    /**Native View Emails Preview Verify Email I icon*/
    @FindBy(xpath = "//td[normalize-space()='Your SEER Data Access Request has been rejected']//parent::tr//child::td[2]//child::a")
    public WebElement nativeViewEmailsPreviewVerifyEmailIcon;

    public NativeViewEmailsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}