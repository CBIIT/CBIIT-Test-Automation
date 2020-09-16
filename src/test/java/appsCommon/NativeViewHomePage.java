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

	/** Filter Navigator */
	@FindBy (xpath = "//input[@id='filter']")
	public WebElement nativeViewFilterNavigator;
	
	
	
	
	public NativeViewHomePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
