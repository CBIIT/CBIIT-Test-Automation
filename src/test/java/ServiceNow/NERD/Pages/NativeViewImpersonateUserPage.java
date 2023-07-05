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

    public NativeViewImpersonateUserPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
