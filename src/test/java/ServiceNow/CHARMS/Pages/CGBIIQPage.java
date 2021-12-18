package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class CGBIIQPage {
	
	
	/* One Time Pin text box */
	@FindBy (xpath = "//input[@name='QR~Authentication-FL_18~1~TEXT']")
	public WebElement cgbIIQOneTimePinTextBox;
	
	/* One Time Pin email box */
	@FindBy (xpath = "//input[@name='QR~Authentication-FL_18~0~TEXT']")
	public WebElement cgbIIQOneTimeEmailTextBox;
	
	
	public CGBIIQPage() {
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
