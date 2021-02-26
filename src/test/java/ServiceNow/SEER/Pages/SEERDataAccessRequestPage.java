package ServiceNow.SEER.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SEERDataAccessRequestPage extends CommonUtils {

/** ------------ SEER DATA ACCESS REQUEST PAGE -----------*/
	
	/** SEER Data Access Request Header */
	@FindBy (xpath = "//div[@class = 'breadcrumbs-container']/h1")
	public WebElement seerDataAccessRequestHeader;
	
	/** SEER Data Access Request : Requested for text */
	@FindBy(xpath = "//label[text()='Requested for']")
	public WebElement requestedForText;
	
	/** SEER Data Access Request:Requested For Read Only Text Box*/
	@FindBy (xpath = "//input[@ng-model = 'data.access.requested_by_name']")
	public WebElement seerDataAccessRequestedForReadOnlyTextBox;
	
	/** SEER Data Access Request: Database type text */
	@FindBy(xpath = "//label[text()='Database type']")
	public WebElement seerDataAccessDatabaseTypeText;
	
	/** SEER Data Access Request:Database Type Read Only Text Box */
	@FindBy (xpath = "//select[@id = 'dataset_pick']")
	public WebElement seerDataAccessDatabaseTypeReadOnlyTextBox;
	
	/**
	 * SEER Data Access Request: What is your general purpose using the data? text
	 */
	@FindBy(xpath = "//label[text()='What is your general purpose for using the data?']")
	public WebElement seerDataAccessRequestWhatIsYourGeneralPurposeUsingTheDataText;
	
	/** SEER Data Access Request: What Is Your General Purpose For Using The Data DD */
	@FindBy (xpath = "//select[@ng-model = 'data.access.purpose']")
	public WebElement seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD;
	
	/** SEER Data Access Request: Signing Official First Name Text Box */
	@FindBy (xpath = "//input[@ng-model = 'data.access.so_first_name']")
	public WebElement seerDataAccessSigningOfficialFirstNameTextBox;
	
	/** SEER Data Access Request:Signing Official Last Name Text Box */
	@FindBy (xpath = "//input[@ng-model = 'data.access.so_last_name']")
	public WebElement seerDataAccessSigningOfficialLastNameTextBox;
	
	/** SEER Data Access Request:Signing Official Email Address Text Box */
	@FindBy (xpath = "//input[@ng-model = 'data.access.so_email']")
	public WebElement seerDataAccessSigningOfficialEmailAddressTextBox;
	
	/** SEER Data Access Request: Do You Intend To Use The Treatment DD */
	@FindBy (xpath = "//select[@ng-model = 'data.access.treatment_usage']")
	public WebElement seerDataAccessDoYouIntendToUseTheTreatmentDD;
	
	/** SEER Data Access Request: Treatment Data Limitations Agreement */
	@FindBy (xpath = "//div[@id = 'treatment_data_limitations_agreement']")
	public WebElement seerDataAccessTreatmentDataLimitationsAgreement;
	
	/** SEER Data Access Request: Treatment Usage Explanation Text Box */
	@FindBy (xpath = "//textarea[@ng-model = 'data.access.treatment_usage_explanation']")
	public WebElement seerDataAccessTreatmentUsageExplanationTextBox;
		
	/** SEER Data Access Request: Data Use Agreement Certification Header text */
	@FindBy(xpath = "//label[text()='Data Use Agreement Certification']")
	public WebElement seerDataAccessDataUseAgreementCertificationHeaderText;
	
	/** SEER Data Access Request: Data Use Agreement Certification Text */
	@FindBy (xpath = "//div[@id = 'data_use_agreement']")
	public WebElement seerDataAccessDataUseAgreementCertificationText;
	
	/** SEER Data Access Request: Data Use Agreement Certification Initials text */
	@FindBy(xpath = "(//label[text()='Initials'])[2]")
	public WebElement seerDataAccessDataUseAgreementCertificationInitialsText;
	
	/** SEER Data Access Request: Data Use Agreement Certification Initials */
	@FindBy (xpath = "//input[@ng-model = 'data.access.dua_initials']")
	public WebElement seerDataAccessDataUseAgreementCertificationInitials;
	
	/** SEER Data Access Request: Best Practice Assurance Header text */
	@FindBy(xpath = "//label[text()='Best Practice Assurance']")
	public WebElement seerDataAccessBestPracticeAssuranceHeaderText;
	
	/** SEER Data Access Request: Best Practice Assurance Text */
	@FindBy (xpath = "//div[@id = 'cloud_use_agreement']")
	public WebElement seerDataAccessBestPracticeAssuranceText;
	
	/** SEER Data Access Request: Best Practice Assurance Initials text */
	@FindBy(xpath = "(//label[text()='Initials'])[3]")
	public WebElement seerDataAccessBestPracticeAssuranceInitialsText;
	
	/** SEER Data Access Request: Best Practice Assurance Initials */
	@FindBy (xpath = "//input[@ng-model = 'data.access.cuba_initials']")
	public WebElement seerDataAccessBestPracticeAssuranceInitials;
	
	/** SEER Data Access Request: Submit Button */
	@FindBy (xpath = "//button[text() = 'Submit']")
	public WebElement seerDataAccessSubmitButton;
	
	/** SEER Data Access Request: SEER is supported by the...bottom text */
	@FindBy(xpath = "//div[@class='col-sm-10']")
	public WebElement seerDataAccessSEERIsSupportedByTheBottomText;
	
	/** SEER Data Access Limitation Of Treatment Data Text */
	@FindBy (xpath = "//div[@id = 'treatment_data_limitations_agreement']")
	public WebElement seerDataAccessLimitationOfTreatmentDataText;
	
	/** SEER Data Access Limitation Of Treatment Data Initials */
	@FindBy (xpath = "//input[@ng-model = 'data.access.limitation_initials']")
	public WebElement seerDataAccessLimitationOfTreatmentDataInitials;
	
	/** SEER Data Access Your Data Access Request Is Complete Header */
	@FindBy (xpath = "//h3[text() = ' Thank you - your data access request is complete. ']")
	public WebElement seerDataAccessYourDataAccessRequestIsCompleteHeader;
	
	/**SEER Data Access Request: I understand the limitation of treatment data Content Text*/
	@FindBy(xpath ="//div[@id='treatment_data_limitations_agreement']")
	public WebElement iUnderstandTheLimitationOfTreatmentDataContentText;
	
	/**SEER Data Access Request: I understand the limitation of treatment data Content Text Last Paragraph*/
	@FindBy(xpath ="//div[@id= 'treatment_data_limitations_agreement']/p[25]")
	public WebElement iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph;
	
	/**SEER Data Access Request: I understand the limitation of treatment data Initials field*/
	@FindBy(xpath ="//input[@ng-model='data.access.limitation_initials']")
	public WebElement iUnderstandTheLimitationOfTreatmentDataInitialsfield;
	
	/** ------------ END OF SEER DATA ACCESS REQUEST PAGE -----------*/
	
	
	public SEERDataAccessRequestPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
