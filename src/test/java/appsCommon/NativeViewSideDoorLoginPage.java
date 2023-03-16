package appsCommon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class NativeViewSideDoorLoginPage extends CommonUtils {

	/*
	 * Native View Side Door Login Page common elements for all ServiceNow
	 * applications
	 */

	/** User name field **/
	@FindBy(xpath = "//input[@name=\"user_name\"]")
	public WebElement nativeViewSideDoorUserName;

	/** Password field **/
	@FindBy(xpath = "//input[@name=\"user_password\"]")
	public WebElement nativeViewSideDoorPassword;

	/** Log in Button **/
	@FindBy(xpath = "//button[@name=\"not_important\"]")
	public WebElement nativeViewSideDoorLogInButton;

	/* initialize all variables */
	public NativeViewSideDoorLoginPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/* Enters user-name to Side Door URI @throws TestingException */
	public void enterUsername(WebElement nativeViewUserName, String sideDoorUserName) throws TestingException {
		nativeViewUserName.clear();
		sendKeys(nativeViewUserName, ConfUtils.getProperty(sideDoorUserName));
	}

	/* Enters password to Side Door URI @throws TestingException */
	public void enterPassword(WebElement nativeViewSideDoorPassword, String sideDoorPassword) throws TestingException {
		nativeViewSideDoorPassword.clear();
		sendKeys(nativeViewSideDoorPassword, ConfUtils.getProperty(sideDoorPassword));
	}

	/* Clicks Side Door URI sign-in button */
	public void clickSignInButton() {
		JavascriptUtils.clickByJS(nativeViewSideDoorLogInButton);

	}

}
