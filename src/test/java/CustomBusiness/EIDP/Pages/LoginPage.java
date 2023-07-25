package CustomBusiness.EIDP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;

public class LoginPage extends CommonUtil{
	
	/* ------ User name ------ */
	@FindBy(id = "USER")
	public WebElement username;
	
	/* ------ Password------ */
	@FindBy(id = "PASSWORD")
	public WebElement password;
	
	/* ------ Sign in button ------ */
	@FindBy(css = "button[onclick='return submitForm(1);']")
	public WebElement signInButton;
	
	/* ------ Change User button ------ */
	@FindBy(css = ".fa.fa-user")
	public WebElement changeUserButton;
	
	/* ------ Change user ------ */
	@FindBy( xpath = "//button[@id='dropdown-change-user']")
	public WebElement changeUser;  
	
	/* ------ Change user input box ------ */
	@FindBy( xpath = "//input[@id='undefinedTypeahead']")
	public WebElement changeUserInput;
	
	/* ------ Change user dropdown ------ */
	@FindBy(id= "select2-input-changeUser-container")
	public WebElement changeUserDropdown;
	
	/* ------ change user search ------ */
	@FindBy(css = "input[type='search']")
	public WebElement searchableChangeUserInput;
	
	/* ------ Change user option ------ */
	@FindBy(css = "li[role='treeitem']")
	public WebElement changeUserOption;
	
	public LoginPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}	
	
}
