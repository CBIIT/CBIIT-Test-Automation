package ServiceNow.CHARMS.Pages;

import io.github.sukgu.support.FindElementBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class TestAccountResetPage {
	/* Native View Run Fix Script button*/
	@FindBy(xpath = "(//button[contains(text(),'Run Fix Script')])[1]")
	public WebElement nativeViewRunFixScriptButton;

	/* Native View iFrame for Fix Script Run button */
	@FindElementBy(css = "iframe[title='Main Content']")
	public static WebElement nativeViewiFrame;

	/* Native View iFrame for Proceed in background button */
	@FindBy(xpath = "//button[normalize-space()='Proceed in Background']")
	public WebElement nativeViewIFrameForProceedInBackgroundButton;

	/* Native View Proceed in Background button */
	@FindBy(xpath = "//button[contains(text(),'Proceed in Background')]")
	public WebElement nativeViewProceedInBackgroundButton;

	/* Native View Profile button */
	@FindBy(css = "span[aria-label='Sonika Jain, Available']")
	public WebElement nativeViewProfileButton;

	/* Native View profile logout  button */
	@FindBy(css = "now-icon[class='user-menu-icon polaris-enabled'][icon='square-arrow-left-outline']")
	public WebElement nativeViewProfileLogoutButton;

	/* Native View Close button */
	@FindBy(xpath = "(//button[@id='close_button'])[1]")
	public WebElement nativeViewCloseButton;

	/* Native View CC button */
	@FindBy(xpath = "//div[@class='sub-avatar']")
	public WebElement nativeViewCCButton;

	/* Native View CC log out button */
	@FindBy(xpath = "//a[normalize-space()='Log out']")
	public WebElement nativeViewCCLogOutButton;

	public TestAccountResetPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
