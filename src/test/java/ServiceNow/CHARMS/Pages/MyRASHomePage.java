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
	
	/* RASopathy Study Consent */
	@FindBy (xpath = "//div[@class='custom-card-image']//a[@aria-label='Consent']")
	public WebElement rasopathyStudyConsent;
	
	/* RASopathy CHARMSAutomatedTestTwo link */
	@FindBy (xpath = "//button[@aria-label='User Information']")
	public WebElement charmsAutomatedTestTwoLink;

	/* RASopathy CHARMSAutomatedTestTwo Sign Out link */
	@FindBy (xpath = "//a[normalize-space()='Sign Out']")
	public WebElement charmsAutomatedTestTwoSignOutLink;
	
	/* RASopathy Individual Information Questionnaire */
	@FindBy (xpath = "//div[@class='custom-card-image ng-scope']//a[@aria-label='Review Individual Information Questionnaire']")
	public WebElement rasoptathyIndividualInformationQuestionnaire;
	
	/* RASopathy Individual Information Questionnaire Pin text */
	@FindBy (xpath = "//h3[@ng-show='c.showCode']")
	public WebElement rasoptathyIndividualInformationQuestionnairePinText;
	
	/* RASopathy Individual Information Questionnaire One Time Pin Go button */
	@FindBy (xpath = "//button[normalize-space()='Go']")
	public WebElement rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton;
	
	
	/** --------------- END OF myRAS Home PAGE   ---------------  */
	
	
	public MyRASHomePage() {
	PageFactory.initElements(WebDriverUtils.webDriver, this);	
	}

}
