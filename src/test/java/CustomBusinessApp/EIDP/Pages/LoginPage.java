package CustomBusinessApp.EIDP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;


public class LoginPage extends CommonUtil{
	
//	public final String nidcrURL = "https://idp-test.cancer.gov/nidcr/idp/";
//	public final String url = "https://idp-test.cancer.gov/";
	
	@FindBy(how = How.ID, id = "USER")
	public WebElement username;
	
	@FindBy(how = How.ID, id = "PASSWORD")
	public WebElement password;
	
	@FindBy(how = How.CSS, css = "button[onclick='return submitForm(1);']")
	public WebElement signInButton;
	
	@FindBy(how = How.CSS, css = ".fa.fa-user")
	public WebElement changeUserButton;
	
	@FindBy(how = How.ID, id= "select2-input-changeUser-container")
	public WebElement changeUserDropdown;
	
	@FindBy(how = How.CSS, css = "input[type='search']")
	public WebElement searchableChangeUserInput;
	
	@FindBy(how = How.CLASS_NAME, className = ".select2-search.select2-search--dropdown .select2-search__field")
	public WebElement searchableChangeUserInputForFellow;
	
	
	@FindBy(how = How.CSS, css = "li[role='treeitem']")
	public WebElement changeUserOption;
	
	public LoginPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
//	
	
}
