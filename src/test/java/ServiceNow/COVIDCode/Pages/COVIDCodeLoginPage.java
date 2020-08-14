package ServiceNow.COVIDCode.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class COVIDCodeLoginPage extends CommonUtils {

	/** Accept and Complete Enrollment Questionnaire button */
	@FindBy(linkText  = "Access and complete enrollment questionnaire →")
	public WebElement AcceptandCompleteQuestionnaireButton;
	
	@FindBy(linkText  = "Log In")
	public WebElement LogInButton;
	
	public COVIDCodeLoginPage() {
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	
	
}
