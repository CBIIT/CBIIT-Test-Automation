package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class MelanomaHomePage {

	/** --------------- BEGINNING OF myRAS Home PAGE --------------- */

	/* Warning Agree button */
	@FindBy(xpath = "//button[normalize-space()='Agree']")
	public WebElement warningAgreeButton;

	/* RASopathy Eligibility Questionnaire */
	@FindBy(xpath = "(//span[normalize-space()='Eligibility Questionnaire'])[2]")
	public WebElement melanomaEligibilityQuestionnaire;

	/* RASopathy Study Consent */
	@FindBy(xpath = "//div[@class='custom-card-image']//a[@aria-label='Consent']")
	public WebElement melanomaStudyConsent;

	/* RASopathy CHARMSAutomatedTestTwo link */
	@FindBy(xpath = "//button[@aria-label='User Information']")
	public WebElement charmsAutomatedTestTwoLink;

	/* RASopathy CHARMSAutomatedTestTwo Sign Out link */
	@FindBy(xpath = "//a[normalize-space()='Sign Out']")
	public WebElement charmsAutomatedTestTwoSignOutLink;

	/* RASopathy Individual Information Questionnaire */
	@FindBy(xpath = "//div[@class='custom-card-title']//a[@aria-label='Review Individual Information Questionnaire']")
	public WebElement melanomaIndividualInformationQuestionnaire;

	/* RASopathy Individual Information Questionnaire Pin text */
	@FindBy(xpath = "//h3[@ng-show='c.showCode']")
	public WebElement melanomaIndividualInformationQuestionnairePinText;

	/* RASopathy Individual Information Questionnaire One Time Pin Go button */
	@FindBy(xpath = "//button[normalize-space()='Go']")
	public WebElement melanomaIndividualInformationQuestionnaireOneTimePinGoButton;

	/* RAS Survey */
	@FindBy(xpath = "(//span[normalize-space()='RAS Survey'])[2]")
	public WebElement rasSurvey;

	/** --------------- END OF myRAS Home PAGE --------------- */

	public MelanomaHomePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
