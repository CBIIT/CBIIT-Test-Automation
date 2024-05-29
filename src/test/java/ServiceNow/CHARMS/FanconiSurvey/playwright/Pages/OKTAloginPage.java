package ServiceNow.CHARMS.FanconiSurvey.playwright.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class OKTAloginPage extends CommonUtils {	
	/* Username Text Box */
	@FindBy (xpath = "//input[@type='text']")
	public WebElement usernameTxtBox;
	
	/* Password Text Box */
	@FindBy (xpath = "//input[@type='password']")
	public WebElement passwordTxtBox;
	
	/* Next Button */ 
	@FindBy (xpath = "//input[@value='Next']")
	public WebElement nextButton;
	
	/* Verify button */
	@FindBy (xpath = "//input[@value='Verify']")
	public WebElement verifyBtn;
	
	/* Login button */
	@FindBy (xpath = "//input[@type='submit']")
	public WebElement loginBtn;
	
	/* Agree button */
	@FindBy (xpath = "(//button[normalize-space()='Agree'])[1]")
	public WebElement agreeBtn;
	
	/* Send Push Button */
	@FindBy (xpath = "//input[@value='Send Push']")
	public WebElement sendPushButton;
		
	public OKTAloginPage() {	
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}	
}
