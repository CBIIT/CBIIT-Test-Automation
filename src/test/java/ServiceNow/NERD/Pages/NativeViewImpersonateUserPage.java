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
    @FindBy(xpath = "//*[@id='crs-kd-nav']/div/div[1]/div//button")
    public WebElement nativeViewNameButton;

    /** Native View Log Out Button */
    @FindBy(xpath = "//*[@id='crs-kd-nav']/div/div[1]/div/ul/li[8]/a")
    public WebElement nativeViewLogOutButton;

    public NativeViewImpersonateUserPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
