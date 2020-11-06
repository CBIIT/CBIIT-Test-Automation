package ServiceNow.CICDBuild.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class DevOpsLoginPage extends CommonUtils {

	/** User name text box */
	@FindBy(id = "user_name")
	public WebElement userNameTextBox;
	
	/** Password text box */
	@FindBy (id = "user_password")
	public WebElement passwordTxtBox;
	
	/** Log in button*/
	@FindBy (id = "sysverb_login")
	public WebElement logInButton;
	
	/** Native View link */
	@FindBy (linkText = "Native View")
	public WebElement nativeViewLink;

	
	public DevOpsLoginPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
