package ServiceNow.AppTracker.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class AppTrackerLoginPage extends CommonUtils {
	/** Login as NIH Trusted User **/
	@FindBy(xpath = "//*[text()='Login with NIH iTrust']")
	public WebElement NIHTrustedUserLogin;

	/** Login dropDown menu on main page **/
	@FindBy(xpath = "//button[@class='ant-btn ant-btn-link ant-dropdown-trigger Login']")
	public WebElement logInMainPage;

	/** Native View LogIn Button **/
	@FindBy(xpath = "*[text()='Log in']")
	public WebElement logInNativeView;

	/** Native View Button **/
	@FindBy(xpath = "//span[@class='ng-binding' and text()='Native View']")
	public WebElement nativeViewButton;

	/** Impersonate View DropDown **/
	@FindBy(xpath = "//button[@id='user_info_dropdown']")
	public WebElement impersonateViewDropDown;

	/** Impersonate option from DropDown View **/
	@FindBy(xpath = "//a[@id='glide_ui_impersonator']")
	public WebElement impersonateOption;

	/** APPTRACK VACANCY MANAGER **/
	@FindBy(xpath = "//a[@class='list-group-item ng-binding ng-scope' and text()= 'APPTRACK VACANCY MANAGER']")
	public WebElement apptrackVacancyManager;

	
	/** APPTRACK COMMITTEE MEMBER **/
	@FindBy(xpath = "//a[@class='list-group-item ng-binding ng-scope' and text()= 'APPTRACK COMMITTEE MEMBER']")
	public WebElement apptrackCommitteeMember;
	
	/** APPTRACK SCORING MEMBER **/
	@FindBy(xpath = "//a[@class='list-group-item ng-binding ng-scope' and text()= 'APPTRACK SCORING MEMBER']")
	public WebElement apptrackScoringMember;
	
	public AppTrackerLoginPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}

}
