package ServiceNow.SEER.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SEERDataAccessRequestPage extends CommonUtils {

	/** ------------ SEER DATA ACCESS REQUEST PAGE -----------*/

	/** SEER Data Access Request Header */
	@FindBy(xpath = "(//h1[contains(text(), 'SEER Data Access Request')])[2]")
	public WebElement seerDataAccessRequestHeader;

	/** SEER Data Access Request : Requested for text */
	@FindBy(xpath = "//label[text()='Requested for']")
	public WebElement requestedForText;

	/** SEER Data Access Request: Requested for field */
	@FindBy(xpath = "//input[@ng-model='data.access.requested_by_name']")
	public WebElement requestedForField;

	/** SEER Data Access Request: Database type text */
	@FindBy(xpath = "//label[text()='Database type']")
	public WebElement databaseTypeText;

	/** SEER Data Access Request: Database type field */
	@FindBy(xpath = "//select[@ng-model='data.access.dataset']")
	public WebElement databaseTypeField;

	/**
	 * SEER Data Access Request: What is your general purpose using the data? text
	 */
	@FindBy(xpath = "//label[text()='What is your general purpose for using the data?']")
	public WebElement whatIsYourGeneralPurposeUsingTheDataText;

	/**
	 * SEER Data Access Request: What is your general purpose using the data? Drop
	 * down
	 */
	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")
	public WebElement whatIsYourGeneralPurposeUsingTheDataDropDown;

	/** SEER Data Access Request: Data Use Agreement Certification Header text */
	@FindBy(xpath = "//label[text()='Data Use Agreement Certification']")
	public WebElement dataUseAgreementCertificationHeaderText;

	/** SEER Data Access Request: Data Use Agreement Certification Content Text */
	@FindBy(xpath = "//div[@id='data_use_agreement']")
	public WebElement dataUseAgreementCertificationContentText;

	/**
	 * SEER Data Access Request: Data Use Agreement Certification Content Text Last
	 * Paragraph
	 */
	@FindBy(xpath = "//div/ol[17]/li/span/span")
	public WebElement dataUseAgreementCertificationContentTextLastParagraph;

	/** SEER Data Access Request: Data Use Agreement Certification Initials text */
	@FindBy(xpath = "(//label[text()='Initials'])[2]")
	public WebElement dataUseAgreementCertificationInitialsText;

	/** SEER Data Access Request: Data Use Agreement Certification Initials Field */
	@FindBy(xpath = "//input[@ng-model='data.access.dua_initials']")
	public WebElement dataUseAgreementCertificationInitialsField;

	/** SEER Data Access Request: Best Practice Assurance Header text */
	@FindBy(xpath = "//label[text()='Best Practice Assurance']")
	public WebElement bestPracticeAssuranceHeaderText;

	/** SEER Data Access Request: Best Practice Assurance Content text */
	@FindBy(xpath = "//div[@id='cloud_use_agreement']")
	public WebElement bestPracticeAssuranceContentText;

	/**
	 * SEER Data Access Request: Best Practice Assurance Content Text last Paragraph
	 */
	@FindBy(xpath = "//div[@id=\"cloud_use_agreement\"]/p[50]")
	public WebElement bestPracticeAssuranceContentTextLastParagraph;

	/** SEER Data Access Request: Best Practice Assurance Initials text */
	@FindBy(xpath = "(//label[text()='Initials'])[3]")
	public WebElement bestPracticeAssuranceInitialsText;

	/** SEER Data Access Request: Best Practice Assurance Initials Filed */
	@FindBy(xpath = "//input[@ng-model='data.access.cuba_initials']")
	public WebElement bestPracticeAssuranceInitialsField;

	/** SEER Data Access Request: Submit Button */
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement seerDataAccessRequestSubmitButton;
	/** SEER Data Access Request: SEER is supported by the...bottom text */
	@FindBy(xpath = "//div[@class='col-sm-10']")
	public WebElement seerIsSupportedByTheBottomText;
	
	
	
	
	
	
	
	
	
	/**SEER Data Access Request: I understand the limitation of treatment data Content Text*/
	@FindBy(xpath ="//div[@id='treatment_data_limitations_agreement']")
	public WebElement iUnderstandTheLimitationOfTreatmentDataContentText;
	
	
	/**SEER Data Access Request: I understand the limitation of treatment data Content Text Last Paragraph*/
	@FindBy(xpath ="//div[@id=\"treatment_data_limitations_agreement\"]/p[25]")
	public WebElement iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph;
	
	/**SEER Data Access Request: I understand the limitation of treatment data Initials field*/
	@FindBy(xpath ="//input[@ng-model='data.access.limitation_initials']")
	public WebElement iUnderstandTheLimitationOfTreatmentDataInitialsfield;
	
	
	
	
	
	/** ------------ THE END OF SEER DATA ACCESS REQUEST PAGE -----------*/

	public SEERDataAccessRequestPage() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}

}