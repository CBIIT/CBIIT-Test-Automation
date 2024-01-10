package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class TestAccountResetPage {

	/*
	 * Native View Run Fix Script button
	 */

	@FindBy(xpath = "//button[contains(text(),'Run Fix Script')]")
	public WebElement nativeViewRunFixScriptButton;

	/*
	 * Native View iFrame for Fix Script Run button
	 */

	@FindBy(xpath = "//iframe[contains(@title,'Reset CHARMS Test Accounts | Fix Script | NCI at Your Service')]")
	public WebElement nativeViewIFrame;

	/*
	 * Native View iFrame for Proceed in background button
	 */

	@FindBy(xpath = "//button[normalize-space()='Proceed in Background']")
	public WebElement nativeViewIFrameForProceedInBackgroundButton;

	/*
	 * Native View Proceed in Background button
	 */

	@FindBy(xpath = "//button[contains(text(),'Proceed in Background')]")
	public WebElement nativeViewProceedInBackgroundButton;

	/*
	 * Native View CC button
	 */
	@FindBy(xpath = "//div[@class='sub-avatar']")
	public WebElement nativeViewCCButton;

	/*
	 * Native View CC log out button
	 */
	@FindBy(xpath = "//a[normalize-space()='Log out']")
	public WebElement nativeViewCCLogOutButton;

	public TestAccountResetPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
