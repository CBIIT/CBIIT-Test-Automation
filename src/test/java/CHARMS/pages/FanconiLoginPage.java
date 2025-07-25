package CHARMS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class FanconiLoginPage extends CommonUtils {
	public FanconiLoginPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/* Profile DropDown Button */
	@FindBy(xpath = "//i[@class='fa fa-chevron-down user-profile-dropdown']")
	public WebElement profileDropDownButton;

	/* Profile LogOut Button */
	@FindBy(xpath = "//a[normalize-space()='Sign Out']")
	public WebElement profileLogOutButton;
	
	/* Home Button */
	@FindBy(xpath = "(//a[normalize-space()='login'])[1]")
	public WebElement enrollLoginButton;

	/* Agree Button */
	@FindBy(xpath = "//button[contains(@class,'btn btn-default')]")
	public WebElement warningAgreeButton;

	/* Eligibility Questionnaire Link */
	@FindBy(xpath = "//div/a[@aria-label='Review Eligibility Questionnaire']/img[@role='presentation']")
	public WebElement eligibilityQuestionnaireLink;

	/* Log Out Button */
	@FindBy(xpath = "(//a[normalize-space()='Sign Out'])[1]")
	public WebElement LogoutButton;
}
