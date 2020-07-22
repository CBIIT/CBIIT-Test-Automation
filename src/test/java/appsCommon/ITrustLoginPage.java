package appsCommon;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;


public class ITrustLoginPage extends CommonUtils{

	
	
	@FindBy(xpath = "//div[@class='col-md-8']//a")
	private WebElement loginLink;
	
	@FindBy(xpath = "//input[@id='USER']")
	private WebElement userNameField;

	@FindBy(xpath = "//input[@id='PASSWORD']")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement signInButton;
	
	@FindBy(xpath="//a[@class='forgot-password']")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[text()='Trouble signing in?']")
	private WebElement TroubleSigningInLink;
	
	

	// initialize all variables
	public ITrustLoginPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	/**
	 * Enters user-name to ITrust
	 * @throws TestingException
	 */
	public void enterUsername() throws TestingException {
		userNameField.clear();
		sendKeys(userNameField, ConfUtils.getProperty("Username"));
	}
	
	/**
	 * Enters password to ITrust
	 * @throws TestingException
	 */
	public void enterPassword() throws TestingException {
		passwordField.clear();
		String decyptedPass=EncryptionUtils.decrypt(ConfUtils.getProperty("Password"));
		sendKeys(passwordField, decyptedPass);
	}
	
	/**
	 * Clicks ITrust sign-in button
	 */
	public void clickSignInButton(){
		signInButton.click();
	}
	
	
	
}
