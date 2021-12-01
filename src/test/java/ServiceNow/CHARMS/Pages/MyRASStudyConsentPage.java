package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.WebDriverUtils;

public class MyRASStudyConsentPage {
	
	
	
	
	/** --------------- BEGINNING OF myRAS Study Consent PAGE   ---------------  */
	
	/* Yes, I have read the terms and conditions checkbox */
	@FindBy (xpath = "//input[@name='consent_read']")
	public WebElement yesIhaveReadTheTermsAndConditionsCheckbox;
	
	
	/* I am this person radio button */
	@FindBy (xpath = "//div[2]//span[1]//div[1]//div[1]//div[1]//div[1]//div[4]//div[2]//div[2]//div[1]//input[1]")
	public WebElement iAmThisPersonRadioButton;
	
	/* I DO give permission for my coded specimens and data to be stored and used for future research as described in the form above. Radio Button */
	@FindBy (xpath = "//input[@aria-label='I DO give permission for my coded specimens and data to be stored and used for future research as described in the form above.']")
	public WebElement iDoGivePermissionForMyCodedSpecimensAndDataToBeStoredRadioButton;
	
	/*I DO give permission for my coded specimens and data to be shared with other researchers and used by these researchers for future research as described above. Radio Button */
	@FindBy (xpath = "//div[2]//span[1]//div[1]//div[1]//div[1]//div[1]//div[4]//div[2]//div[9]//div[1]//input[1]")
	public WebElement iDoGivePermissionForMyCodedSpecimensAndDataToBeSharedWithOtherResearchersRadioButton;
	
	/* Consent button */
	@FindBy (xpath = "//button[normalize-space()='Consent']")
	public WebElement consentButton;
	
	/* Signing Password text box */
	@FindBy (xpath = "//div[@class='form-group']//input[@name='signature_password']")
	public WebElement signingPasswordTextBox;
	
	/* Sign Button */
	@FindBy (xpath = "//button[contains(@ng-click,'c.confirm()')]")
	public WebElement signButton;
	
	/* Your Consent Form has been submitted successfully ! Ok button */
	@FindBy (xpath = "//button[normalize-space()='OK']")
	public WebElement yourConsentFormHasBeenSubmittedOKbutton;

	
	/** --------------- END OF myRAS Study Consent PAGE   ---------------  */
	
	
	public MyRASStudyConsentPage() {
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
