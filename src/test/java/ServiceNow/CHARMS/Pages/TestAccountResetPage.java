package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class TestAccountResetPage {

	/*
	 * Native View Run Fix Script button
	 */
     
	@FindBy(xpath = "//span[contains(@class,'navbar_ui_actions')]//button[contains(@title,\"Run this Fix Script now – ignores the 'Run once' field value, honors 'Unloadable' field\")][normalize-space()='Run Fix Script']")
	public WebElement nativeViewRunFixScriptButton;
	
	/*
	 * Native View iFrame for Fix Script Run button
	 */

	@FindBy (xpath = "//iframe[contains(@title,'Reset CHARMS Test Accounts | Fix Script | NCI at Your Service')]")
	public WebElement nativeViewIFrame;
	
	/*
	 * Native View iFrame for Proceed in background button
	 */

	@FindBy (xpath = "//button[normalize-space()='Proceed in Background']")
	public WebElement nativeViewIFrameForProceedInBackgroundButton;
	
	/*
	 * Native View Proceed in Background button
	 */
	
	@FindBy (xpath = "//button[normalize-space()='Proceed in Background']")
	public WebElement nativeViewProceedInBackgroundButton;
	
	
	
	public TestAccountResetPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
