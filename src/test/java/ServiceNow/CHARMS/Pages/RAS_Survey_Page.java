package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;
public class RAS_Survey_Page {

	//NEXT BUTTON SAME XPATH FOR ALL NEXT BUTTONS
	@FindBy(xpath = "//input[@title='→']")
	public WebElement surveyNextButton;

	// LOGIN EMAIL
	@FindBy (xpath= "//input[@name='QR~Authentication-FL_27~0~TEXT']")
	public WebElement cHARMSEmailLogIn;
	
	// LOGIN PASSWORD
	@FindBy (xpath="//input[@name='QR~Authentication-FL_27~1~TEXT']")
	public WebElement cHARMSpasswordToLogIn;

	public RAS_Survey_Page() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}