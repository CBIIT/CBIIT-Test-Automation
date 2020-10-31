package ServiceNow.COVIDCode.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SignOutVerificationPage extends CommonUtils {

	/** Clicks on the log in web element */
	@FindBy(xpath = "(//a[contains(text(),'Log in')])[2]")
	public WebElement ncipLogInBtn;
	
	/** Clicks the profile dropdown */
	@FindBy (xpath = "//a[@id='profile-dropdown']")
	public WebElement profileDropdown;
	
	/** Clicks  on log out button on profile dropdown*/
	@FindBy  (xpath = "//li[@role='presentation']//a[contains(text(),'Log out')]")
	public WebElement logOutBtn;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public SignOutVerificationPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}