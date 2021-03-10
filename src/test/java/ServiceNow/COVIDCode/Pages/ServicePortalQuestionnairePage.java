package ServiceNow.COVIDCode.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ServicePortalQuestionnairePage extends CommonUtils {

	/** --------------- BEGINNING OF COVIDcode SERVICE PORTAL NIH USER DASHBOARD HEADER SECTION ---------------  */ 

	/**Service Portal Questionnaire Page  Header */
	@FindBy(xpath = "//h1[contains(text(),'NIH')]")
	public WebElement nihUserDashboardHeader;

	/** NIH User Dashboard Header Text */
	@FindBy(xpath = "//p[@class='hero-text']")
	public WebElement nihUserDashboardHeaderText;
	
	/** ServicePortalEnrollment Questionnaire Submission Confirmation Text */
	@FindBy(xpath = "/html/body/div/div/div/span")
	public WebElement servicePortalEnrollmentQuestionnaireSubmissionConfirmationText;
	
	/** --------------- THE END OF COVIDcode SERVICE PORTAL NIH USER DASHBOARD HEADER SECTION ---------------  */ 
	
	
	/** --------------- BEGINNING OF COVIDcode SERVICE PORTAL DRAFT INITIAL QUESTIONNAIRE SECTION ---------------  */ 

	/** Start new initial questionnaire button */
	@FindBy(xpath = "//button[contains(text(), 'Start new initial questionnaire')]")
	public WebElement startNewQuestionnaireButton;

	@FindBy(xpath = "//*[contains(text(), 'initial questionnaire')]")
	public WebElement startNewInitialQuestionnaireButton;
	
	/** Draft Initial Patient ID text */
	@FindBy (xpath = "(//div[contains(text(), 'Patient ID')])[1]")
	public WebElement draftInitialPatientID;
	
	/** Draft Initial User Group ID */
	@FindBy (xpath = "(//div[contains(text(), 'User Group ID')])[1]")
	public WebElement draftInitialUserGroupID;
	
	/** Draft Initial NIH Medical Record # */
	@FindBy (xpath = "(//div[contains(text(), 'NIH Medical Record #')])[1]")
	public WebElement draftInitialNIHMedicalRecordNumber;
	
	/** Draft Initial Last Update */
	@FindBy (xpath = "(//div[contains(text(), 'Last Updated')])[1]")
	public WebElement draftInitialLastUpdate;
	
	/** Draft Initial Available Actions */
	@FindBy (xpath = "(//div[contains(text(), 'Available Actions')])[1]")
	public WebElement draftInitialAvailableActions;
	
	/** Draft IQ Table First Row */
	@FindBy (xpath = "(//div[@class= 'row table-row ng-scope'])[1]")
	public WebElement draftIQTableFirstRow;
	
	/** Draft IQ Table First Row Patient ID Field */
	@FindBy (xpath = "//*[@id= 'x8069d1771ba02050e541631ee54bcb94']/div[1]/div[1]/div[3]/div[1]")
	public WebElement draftIQTableFirstRowPatientIDField;
	
	/** Draft IQ Table First Row User Group ID Field */
	@FindBy (xpath = "//*[@id= 'x8069d1771ba02050e541631ee54bcb94']/div[1]/div[1]/div[3]/div[2]")
	public WebElement draftIQTableFirstRowUserGroupIDField;
	
	/** Draft Initial First Open Button In The Table */
	@FindBy (xpath = "(//button[contains(text(), 'OPEN')])[1]")
	public WebElement draftInitialOpenButton;
	
	/** Draft Initial First Delete Button In The Table */
	@FindBy (xpath = "(//button[contains(text(), 'DELETE')])[1]")
	public WebElement draftInitialDeleteButton;
	
	/** Draft Initial Pagination Button Back */
	@FindBy (xpath = "(//div[@class='pagination-button-section'])[1]/button[1]")
	public WebElement draftInitialPageButtonBack;
	
	/** Draft Initial Pagination Button Forward */
	@FindBy (xpath = "(//div[@class='pagination-button-section'])[1]/button[2]")
	public WebElement draftInitialPageButtonForward;
	
	/** Enrollment Creation pop up text */
	@FindBy(xpath = "//*[contains(text(), 'Enrollment Creation')]")
	public WebElement EnrollmentCreationTitle;

	/** Enrollment Creation User Group ID Drop Down */
	@FindBy(xpath="//*[@id='user-group-id']")
	public WebElement EnrollmentCreationUserGroupIDSelectDropDown;
	
	/** Enrollment Creation User Group ID Drop Down Values */
	@FindBy(xpath="//*[@id='user-group-id']/option")
	public List<WebElement> EnrollmentCreationUserGroupIDSelectDropDownValues;

	/** Enrollment Creation Window Text*/
	@FindBy(xpath="//*[@id='enrollmentCreation']/div/div/div[1]/h4/b")
	public WebElement enrollmentCreationWindowText;

	@FindBy (xpath = "//*[contains(text(), 'Enrollment Creation')]")
	public WebElement enrollmentCreationTitle;
	
	/** Enrollment Creation User Group ID Drop Down Box */
	@FindBy (xpath = "//*[@class='form-control input']")
	public WebElement enrollmentCreationUserGroupIDSelectDropDown;
	
	/** Enrollment Creation User Group ID Drop Down Values */
	@FindBy (xpath = "//select[@id='user-group-id']/option")
	public List<WebElement> enrollmentCreationUserGroupIDValues;
	
	/** Delete Confirmation Button */
	@FindBy (xpath = "//*[contains(text(), 'Yes')]")
	public WebElement deleteConfirmationButton;
	
	/** Create Enrollment Button */
	@FindBy (xpath = "//*[contains(text(), 'Create Enrollment')]")
	public WebElement createEnrollmentButton;
	
	/** Draft Initial Questionnaire Text */
	@FindBy(xpath = "//h1[contains(text(), 'Draft Initial Questionnaire')]")
	public WebElement draftInitialQuestionnaireText;
	
	/** --------------- THE END OF COVIDcode SERVICE PORTAL DRAFT INITIAL QUESTIONNAIRE SECTION ---------------  */ 

	
	/** --------------- BEGINNING OF COVIDcode SERVICE PORTAL DRAFT FOLLOW UP QUESTIONNAIRE SECTION ---------------  */ 

	/** Start New Follow-up Questionnaire */
	@FindBy (xpath= "//*[contains(text(), 'follow-up')]")
	public WebElement startNewFollowUpButton;
	
	/** Draft Follow Up Patient ID text */
	@FindBy (xpath = "(//div[contains(text(), 'Patient ID')])[2]")
	public WebElement draftFollowUpPatientIDHeader;
	
	/** Draft Follow Up User Group ID */
	@FindBy (xpath = "(//div[contains(text(), 'User Group ID ')])[2]")
	public WebElement draftFollowUpUserGroupIDHeader;
	
	/** Draft Follow Up User Group ID Field */
	@FindBy (xpath = "//*[@id='x8069d1771ba02050e541631ee54bcb94']/div[1]/div[2]/div[3]")
	public WebElement draftFollowUpUserGroupIDField;
	
	/** Draft Follow Up Last Updated */
	@FindBy(xpath="//*[@id='x8069d1771ba02050e541631ee54bcb94']/div[1]/div[2]/div[2]/div[4]")
	public WebElement draftFollowUpLastUpdated;
	
	/** Draft Follow Up NIH Medical Record */
	@FindBy (xpath = "(//div[contains(text(), 'NIH Medical Record ')])[2]")
	public WebElement draftFollowUpNIHMedicalRecordHeader;
	
	/** Draft Follow Up Last Update */
	@FindBy (xpath = "(//div[contains(text(), 'Last Updated')])[2]")
	public WebElement draftFollowUpLastUpdate;
	
	/** Draft Follow Up Available Actions */
	@FindBy (xpath = "(//div[contains(text(), 'Available Actions')])[2]")
	public WebElement draftFollowUpAvailableActions;
	
	/** Draft Follow Up Table First Row */
	@FindBy (xpath = "//*[@id= 'x8069d1771ba02050e541631ee54bcb94']/div[1]/div[2]/div[3]")
	public WebElement draftFollowUpFirstRow;
	
	/** Draft Follow Up Table NIH Medical Record First Row */
	@FindBy (xpath = "//*[@id= 'x8069d1771ba02050e541631ee54bcb94']/div[1]/div[2]/div[3]")
	public WebElement draftFollowUNihMedicalRecordFirstRow;

	/** Draft Follow Up Draft FollowUp Back Button */
	@FindBy (xpath = "(//div[@class='pagination-button-section'])[2]/button[1]")
	public WebElement draftFollowUpPageButtonBack;
	
	/** Draft Follow Up Pagination Button Forward */
	@FindBy (xpath = "(//div[@class='pagination-button-section'])[2]/button[2]")
	public WebElement draftFollowUpPageButtonForward;
	
	/** Draft Follow up First Open Button in the table */
	@FindBy (xpath = "(//*[@id= 'approve-button'])[6]")
	public WebElement draftFollowUpFirstOpenButton;
	
	/** Draft Follow up First Delete Button in the table */
	@FindBy (xpath = "(//*[@id= 'reject-button'])[6]")
	public WebElement draftFollowUpFirstDeleteButton;
	
	/** Enrollment Look Up pop up text */
	@FindBy (xpath = "//*[contains(text(), 'Enrollment Look Up')]")
	public WebElement enrollmentLookUpTitle;
	
	/** Enrollment Look Up Patient ID Search Drop Down */
	@FindBy (xpath="//*[@id= 's2id_enrollmentId']/a")
	public WebElement enrollmentLookUpPatientIDSearchDropDown;
	
	/** Enrollment Look Up Patient ID Search Drop Down Text Field */
	@FindBy (xpath="//input[@class='select2-input']")
	public WebElement enrollmentLookUpPatientIDSearchDropDownTextField;
	
	/** Enrollment Look Up Search Patient ID Values */
	@FindBy(xpath = "//ul[@class='select2-results']/li")
	public List<WebElement> enrollmentLookUpPatientIDSearchValues;

	/** Enrollment Look Up Create Follow Up Button */
	@FindBy (xpath = "//*[contains(text(),'Create Follow Up')]")
	public WebElement enrollmentLookUpCreateFollowUpButton;

	/** Draft Follow-up Questionnaire Text */
	@FindBy(xpath = "//h1[contains(text(), 'Draft Follow-up Questionnaire')]")
	public WebElement draftFollowUpQuestionnaireText;
	
	/** --------------- THE END OF COVIDcode SERVICE PORTAL DRAFT FOLLOW UP QUESTIONNAIRE SECTION ---------------  */ 

	public ServicePortalQuestionnairePage() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}


}
