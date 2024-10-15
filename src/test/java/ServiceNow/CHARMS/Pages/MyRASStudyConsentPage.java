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

	/* I am this person. Radio Button */
	@FindBy (xpath = "//input[@aria-label='I am this person.']")
	public WebElement iAmThisPersonRadioButton;

	/* I am this person's parent/guardian. Radio Button */
	@FindBy(xpath = "//input[@aria-label='Yes']")
	public WebElement iAmThisPersonsParentGuardianRadioButton;

	/* Question 2 Text: I DO give permission for my identifiable specimens and data to be stored and used by the study team for future studies as described above. */
	@FindBy(xpath = "(//label[contains(@class,'ng-binding')])[2]")
	public WebElement iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeStoredAndUsedByTheStudyTeamText;

	/* I DO give permission for my identifiable specimens and data to be stored and used by the study team for future studies as described above. Radio Button */
	@FindBy(xpath = "//input[@aria-label=\"I DO give permission for the participant's identifiable specimens and data to be stored and used by the study team for future studies as described above.\"]")
	public WebElement iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeStoredAndUsedByTheStudyTeamRadioButton;

	/* Question 3 Text: I DO give permission for my de-identified specimens and data to be shared with and used by other researchers for future research. Text */
	@FindBy(xpath = "(//label[contains(@class,'ng-binding')])[3]")
	public WebElement iDoGivePermissionForMyDeIdentifiedSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersText;

	/* I DO give permission for my de-identified specimens and data to be shared with and used by other researchers for future research. Radio Button */
	@FindBy(xpath = "//input[@id='specimen_share_yes']")
	public WebElement iDoGivePermissionForMyDeIdentifiedSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersRadioButton;

	/* Question 4 Text: I DO give permission for my identifiable specimens and data to be shared with and used by other researchers for future studies. Text */
	@FindBy(xpath = "(//label[contains(@class,'ng-binding')])[4]")
	public WebElement iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersForFutureStudiesText;

	/* I DO give permission for my identifiable specimens and data to be shared with and used by other researchers for future studies. Radio Button */
	@FindBy(xpath = "//input[@aria-label='I DO give permission for this participants identifiable specimens and data to be shared with and used by other researchers for future studies.']")
	public WebElement iDoGivePermissionForMyIdentifiableSpecimensAndDataToBeSharedWithAndUsedByOtherResearchersForFutureStudiesRadioButton;

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
	@FindBy (xpath = "//div[@class='form-group']//input[@id='signature_password']")
	public WebElement signingPasswordTextBox;

	/* I voluntarily give my assent to participate in this research. (The minor should check this box) Text */
	@FindBy(xpath = "//div[contains(text(),'I voluntarily give my assent to participate in this research.')]")
	public WebElement iVoluntarilyGiveMyAssentToParticipateInThisResearchText;

	/* I voluntarily give my assent to participate in this research. (The minor should check this box) Check box */
	@FindBy(xpath = "//div[contains(text(),'I voluntarily give my assent to participate in thi')]//input[@role='checkbox']")
	public WebElement iVoluntarilyGiveMyAssentToParticipateInThisResearchCheckBox;

	/* Sign Button */
	@FindBy (xpath = "//button[@ng-click='c.confirm()']")
	public WebElement signButton;

	/* Your Consent Form Has Been Submitted Successfully Message */
	@FindBy(xpath = "//div[@ng-show=\"c.data.form == 'general_consent'\"]")
	public WebElement yourConsentFormHasBeenSubmittedSuccessfullyMessage;
	
	/* Your Consent Form has been submitted successfully ! Ok button */
	@FindBy (xpath = "//button[normalize-space()='OK']")
	public WebElement yourConsentFormHasBeenSubmittedOKbutton;

	
	/** --------------- END OF myRAS Study Consent PAGE   ---------------  */
	
	
	public MyRASStudyConsentPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

}
