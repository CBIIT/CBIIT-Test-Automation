package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CHARMSHomePage extends CommonUtils {
	
	/** sample */
	@FindBy(xpath = "//button[@ng-click='c.login()']")
	private WebElement sample1;

	/** sample */
	@FindBy(xpath = "//span[contains(@class,'user-name')]")
	private WebElement sample2;

	public CHARMSHomePage() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
