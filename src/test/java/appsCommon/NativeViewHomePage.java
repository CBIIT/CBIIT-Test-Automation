package appsCommon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class NativeViewHomePage extends CommonUtils {

	/*
	 * Native View Landing Page common elements for all ServiceNow applications
	 */

	/** FILTER NAVIGATOR */
	@FindBy (xpath = "//input[@id='filter']")
	public WebElement nativeViewFilterNavigator;

	/** NATIVE VIEW PROFILE MODULE*/
	@FindBy(xpath = "//*[@class='sub-avatar']")
	public WebElement profileModule;

	/** NATIVE VIEW LOG OUT BUTTON */
	@FindBy(xpath = "//*[contains(text(),'Log out')]")
	public WebElement logOutButton;

	public NativeViewHomePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
