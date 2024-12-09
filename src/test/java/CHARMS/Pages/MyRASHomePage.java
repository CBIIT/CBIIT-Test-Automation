package CHARMS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.nci.automation.web.WebDriverUtils.webDriver;

public class MyRASHomePage {

	/** --------------- BEGINNING OF myRAS Home PAGE --------------- */

	/* Warning Agree button */
	@FindBy(xpath = "//button[normalize-space()='Agree']")
	public WebElement warningAgreeButton;

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

	/* RASopathy Study Consent Button */
	@FindBy(xpath = "//div[@class='custom-card-image']//a[@aria-label='Consent']")
	public WebElement rasopathyStudyConsent;

	/* RASopathy Study Assent Button */
	@FindBy(xpath = "//div[@class='custom-card-image']//a[@aria-label='Assent']")
	public WebElement rasopathyStudyAssent;

	/**
	 * Locates a dynamic module based on the given text.
	 *
	 * @param text The text of the module to locate.
	 * @return The WebElement representing the dynamic module.
	 */
	public static WebElement dynamicModuleLocator(String text){
		return webDriver.findElement(By.xpath("//span[text()='" + text + "']//parent::a"));
	}

	/** --------------- END OF myRAS Home PAGE --------------- */

	public MyRASHomePage() {
		PageFactory.initElements(webDriver, this);
	}
}
