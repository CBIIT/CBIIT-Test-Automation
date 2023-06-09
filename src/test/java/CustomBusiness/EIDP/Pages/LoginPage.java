package CustomBusiness.EIDP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;

public class LoginPage extends CommonUtil{
	
	@FindBy(id = "USER")
	public WebElement username;
	
	@FindBy(id = "PASSWORD")
	public WebElement password;
	
	@FindBy(css = "button[onclick='return submitForm(1);']")
	public WebElement signInButton;
	
	@FindBy(css = ".fa.fa-user")
	public WebElement changeUserButton;
	
	@FindBy( xpath = "//button[@id='dropdown-change-user']")
	public WebElement changeUser;  
	
	@FindBy( xpath = "//input[@id='undefinedTypeahead']")
	public WebElement changeUserInput;
	
	@FindBy(id= "select2-input-changeUser-container")
	public WebElement changeUserDropdown;
	
	@FindBy(css = "input[type='search']")
	//@FindBy(xpath = "//*[@id='page-home']/span/span/span[1]")
	public WebElement searchableChangeUserInput;
	
	@FindBy(css = "li[role='treeitem']")
	public WebElement changeUserOption;
	
	public LoginPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}	
	
}
