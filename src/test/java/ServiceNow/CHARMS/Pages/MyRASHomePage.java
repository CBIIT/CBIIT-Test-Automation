package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class MyRASHomePage {

	/** --------------- BEGINNING OF myRAS Home PAGE --------------- */

	/* Warning Agree button */
	@FindBy(xpath = "//button[normalize-space()='Agree']")
	public WebElement warningAgreeButton;

	/* RASopathy Eligibility Questionnaire */
	@FindBy(xpath = "(//span[normalize-space()='Eligibility Questionnaire'])[2]")
	public WebElement rasoptathyEligibilityQuestionnaire;

	/* RASopathy RAS Survey Button */
	@FindBy(xpath = "(//span[normalize-space()='RAS Survey'])[2]")
	public WebElement rasoptathyRasSurveyButton;

	/* RASopathy RAS IIQ Button */
	@FindBy(xpath = "(//span[normalize-space()='Individual Information Questionnaire'])[2]")
	public WebElement rasoptathyIiqButton;

	/* RASopathy RAS Survey Go Button */
	@FindBy(xpath = "//button[@id='icYesConfirm']")
	public WebElement rasoptathyRasSurveyGoButton;

	/* RASopathy RAS Survey Close Button */
	@FindBy(xpath = "//button[@id='icNoConfirm']")
	public WebElement rasoptathyRasSurveyCloseButton;

	/* RASopathy RAS Survey Pin */
	@FindBy(xpath = "//p[@align='center']//parent::div//child::h3")
	public WebElement rasoptathyRasSurveyPin;

	/* RASopathy Study Consent */
	@FindBy(xpath = "//div[@class='custom-card-image']//a[@aria-label='Consent']")
	public WebElement rasopathyStudyConsent;

	/* RASopathy CHARMSAutomatedTestTwo link */
	@FindBy(xpath = "//button[@aria-label='User Information']")
	public WebElement charmsAutomatedTestTwoLink;

	/* RASopathy CHARMSAutomatedTestTwo Sign Out link */
	@FindBy(xpath = "//a[normalize-space()='Sign Out']")
	public WebElement charmsAutomatedTestTwoSignOutLink;

	/* RASopathy Individual Information Questionnaire */
	@FindBy(xpath = "//div[@class='custom-card-title']//a[@aria-label='Review Individual Information Questionnaire']")
	public WebElement rasoptathyIndividualInformationQuestionnaire;

	/* RASopathy Individual Information Questionnaire Pin text */
	@FindBy(xpath = "//h3[@ng-show='c.showCode']")
	public WebElement rasoptathyIndividualInformationQuestionnairePinText;

	/* RASopathy Individual Information Questionnaire One Time Pin Go button */
	@FindBy(xpath = "//button[normalize-space()='Go']")
	public WebElement rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton;

	/* RAS Survey */
	@FindBy(xpath = "(//span[normalize-space()='RAS Survey'])[2]")
	public WebElement rasSurvey;

	/** --------------- END OF myRAS Home PAGE --------------- */

	public MyRASHomePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
