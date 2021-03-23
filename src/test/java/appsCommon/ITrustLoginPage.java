package appsCommon;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;


public class ITrustLoginPage extends CommonUtils{

	
	
	@FindBy(xpath = "//a[contains(text(),'Log In')]")
	public WebElement loginLink;
	
	/** Username field*/
	@FindBy(xpath = "//input[@id='USER']")
	public WebElement userNameField;

	/** Password field */
	@FindBy(xpath = "//input[@id='PASSWORD']")
	public WebElement passwordField;
	
	/** Sign in button */
	@FindBy(xpath="//button[@type='submit']")
	public WebElement signInButton;
	
	/** Forgot Password link */
	@FindBy(xpath="//a[@class='forgot-password']")
	public WebElement forgotPasswordLink;
	
	/** Trouble Signing In link */ 
	@FindBy(xpath="//a[text()='Trouble signing in?']")
	public WebElement TroubleSigningInLink;
	
	/** Clicks on the user's profile drop down*/
	@FindBy (xpath = "//button[@id='user-info-dropdown']")
	public WebElement profileDropDown;
	
	/** Clicks on the profile drop down and selects "Sign Out" */
	@FindBy (xpath = "//a[contains(text(),'Sign Out')]")
	public WebElement covidCodeSignOutButton;
	
	

	// initialize all variables
	public ITrustLoginPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	/**
	 * Enters user-name to ITrust
	 * @throws TestingException
	 */
	public void enterUsername(WebElement userNameField, String username) throws TestingException {
		userNameField.clear();
		sendKeys(userNameField, ConfUtils.getProperty(username));
	}
	
	/**
	 * Enters password to ITrust
	 * @throws TestingException
	 */
	public void enterPassword(String password) throws TestingException {
		passwordField.clear();
		String decyptedPass=EncryptionUtils.decrypt(ConfUtils.getProperty(password));
		sendKeys(passwordField, decyptedPass);
	}
	
	/**
	 * Clicks ITrust sign-in button
	 */
	public void clickSignInButton(){
		JavascriptUtils.clickByJS(signInButton);
	}
	
	/** Clicks on log in button on the COVIDCode home page */
	public void covidCodeLogInButton() {
	JavascriptUtils.clickByJS(loginLink);
	
	}
	
}
