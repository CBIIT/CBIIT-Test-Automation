package ServiceNow.ATO.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.ATO.Utils.CommonUtil;
import ServiceNow.ATO.Utils.DriverObjectFactory;

public class LoginPage extends BasePage{

	public final String fasturl = "https://service-test.nci.nih.gov/fast-ato";
	
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
	
	@FindBy(how = How.XPATH, xpath = "//ul[contains(@class,'hidden-sm')]//a[text()='Log in']")
	public WebElement loginButton;
	
	/** Native view link button on home page */
	@FindBy(partialLinkText = "Native View")
	public WebElement nativeviewLink;
	
	/**NCI Active home page conent */
	@FindBy(css = ".grid-stack-item-content")
	public WebElement stockItemsContent;
	
	/**Left navigation panel searchable filter input field*/
	@FindBy(id = "filter")
	public WebElement filterId;
	
	/**Left navigation filtered list */
	@FindAll({@FindBy(css = "[aria-label='Modules for Application: FAST ATO'] li")})
	public List<WebElement> filteredList;
	
	public LoginPage() {
		PageFactory.initElements(DriverObjectFactory.getWebDriver(), this);
	}
	
}
