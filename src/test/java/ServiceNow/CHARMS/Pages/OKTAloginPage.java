package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class OKTAloginPage extends CommonUtils {
	
	/** Username Text Box */
	@FindBy (xpath = "//input[@name='username']")
	public WebElement usernameTxtBox;
	
	/** Password Text Box */
	@FindBy (xpath = "//input[@name='password']")
	public WebElement passwordTxtBox;
	
	/** Next Button */ 
	@FindBy (xpath = "//input[@value='Next']")
	public WebElement nextButton;
	
	/** Login button*/
	@FindBy (xpath = "//input[@type='submit']")
	public WebElement loginBtn;
	
	
	
	public OKTAloginPage() {	
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	
}
