package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class MyRASHomePage {
	
	/** --------------- BEGINNING OF myRAS Home PAGE   ---------------  */
	
	/* Warning Agree button */
	@FindBy (xpath = "//button[normalize-space()='Agree']")
	public WebElement warningAgreeButton;
	
	/* RASopathy Eligibility Questionnaire */
	@FindBy (xpath = "//span[normalize-space()='Eligibility Questionnaire']")
	public WebElement rasoptathyEligibilityQuestionnaire;

	/** --------------- END OF myRAS Home PAGE   ---------------  */
	
	
	public MyRASHomePage() {
	PageFactory.initElements(WebDriverUtils.webDriver, this);	
	}

}
