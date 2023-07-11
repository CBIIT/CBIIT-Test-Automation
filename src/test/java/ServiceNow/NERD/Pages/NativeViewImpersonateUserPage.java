package ServiceNow.NERD.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewImpersonateUserPage extends CommonUtils {

    /** Native View Link */
    @FindBy(linkText= "Native View")
    public WebElement nativeViewLink;

    /** Native View Link Main Page */
    @FindBy(xpath = "//span[normalize-space()='Native View']")
    public WebElement nativeViewLinkMainPage;

    /** Native View Name Button */
    @FindBy(xpath = "//*[@id='profile-dropdown']/span/div/div//child::div")
    public WebElement nativeViewNameButton;

    /** Native View Log Out Button */
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    public WebElement nativeViewLogOutButton;

    public NativeViewImpersonateUserPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
