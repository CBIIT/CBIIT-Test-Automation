package ServiceNow.NERD.Pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class NERDSubmissionsPage extends CommonUtils {

	/**
	 * ------------ CRS KNOWLEGE MANAGEMENT SYSTEM SUBMISSIONSIONS PAGE -----------
	 */

	/** CRS Knowledge Management System Submissions Page Header */
	@FindBy(xpath = "//div[@class = 'container details']")
	public WebElement crsKnowledgeManagementSystemSubmissionsPageHeader;

	/** CRS Knowledge Management System Submissions Page Submissions link */
	@FindBy(xpath = "//div[@id='crs-main']/div[1]/div/ul/li")
	public WebElement crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink;

	/**
	 * CRS Knowledge Management System Submissions Page Collaborations Create New
	 * Submission link
	 */
	@FindBy(xpath = "//div[contains(text(), 'Collaborations')]/a")
	public WebElement crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink;

	/** CRS Knowledge Management System Submissions Page Collaborations link */
	@FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[3]")
	public WebElement crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink;

	/** Confirm Submission to CRS button */
	@FindBy(xpath = "//button[@ng-click='c.submitSubmission()']")
	public WebElement confirmSubmissionYesButton;

	/** Pop Up Submission has been successfully OK button */
	@FindBy(xpath = "//button[@ng-repeat='button in options.buttons track by button.label']")
	public WebElement popUpOKbutton;

	/** Confirm Delete Submission Yes Button */
	@FindBy(xpath = "//button[@ng-click='c.deleteSubmission()']")
	public WebElement confirmDeleteYesButton;

	/** Returned Submission to the DOC planning Contact SAVE button */
	@FindBy(xpath = "//button[@ng-click='c.saveSubmission()']")
	public WebElement SaveButton;
	
	
	/**
	 * 	CRS Knowledge Management System Submissions Page Top Accomplishments Create New
	 * 	Submission link
	 */
	@FindBy(xpath = "//div[contains(text(), 'Top Accomplishments')]/a")
	public WebElement topAccomplishmentsCreateNewSubmissionLink;
	
	/** CRS Top Accomplishments Submissions Page link */
	@FindBy(xpath = "//div[contains(text(), 'Top Accomplishments')]")
	public WebElement topAccomplishmentSubmissionsPageLink;
	
	/** CRS Top Accomplishments Submission Page - Fiscal Year 2019 */
	@FindBy(xpath = "(//div[@class = 'submission-checkboxes ng-scope'])[1]/md-checkbox/div[1]")
	public WebElement topAccomplishmentFiscalYear2019;
	
	/** CRS Top Accomplishments Submission Page - Fiscal Year 2021 */
	@FindBy(xpath = "(//div[@class = 'submission-checkboxes ng-scope'])[2]/md-checkbox/div[1]")
	public WebElement topAccomplishmentFiscalYear2021;
	
	/** CRS Top Accomplishment Submission Page - Title */
	@FindBy(xpath = "//input[@id = 'x_26385_crs_kd_u_kb_title']")
	public WebElement topAccomplishmentTitle;
	
	/** CRS Top Accomplishment Submission Research Type */
	@FindBy(xpath = "//select[@id='x_26385_crs_kd_u_kb_research_type']")
	public WebElement topAccomplishmentResearchType;
	
	/** CRS Top Accomplishment Submission Save Button */
	@FindBy(xpath = "//button[@ng-show='c.save'][2]")
	public WebElement topAccomplishmentNewSubmissionSaveButton;
	
	/** CRS Top Accomplishment Submission Cancel Button */
	@FindBy(xpath = "//button[@ng-click='c.goBacktoSubmissions()']")
	public WebElement topAccomplishmentNewSubmissionCancelButton;
	
	/** CRS Top Accomplishment Submission Submit Button */
	@FindBy(xpath = "(//button[@class = 'md-raised md-secondary md-button md-ink-ripple'])[1]")
	public WebElement topAccomplishmentSubmitButton;
	
	/** CRS Top Submissions */
	@FindBy(xpath = "(//a[contains(text(), 'Submissions')])[2]")
	public WebElement topSubmisionsName;
	

	
	/**
	 * ------------ COLLABORATION SUBMISSIONSIONS BY DOC PLANNING CONTACT
	 * -----------
	 */

	/** Return to Staff confirmation pop up window text field */
	@FindBy(xpath = "//textarea[@id='doc_comment']")
	public WebElement confirmRETURNtoStaffPopUpWindowTextField;

	/** Return to Staff confirmation pop up window YES button */
	@FindBy(xpath = "//button[@ng-click='c.rejectDOCSubmission()']")
	public WebElement confirmRETURNtoStaffPopUpWindowYesButton;
	
	/**
	 * Information dialog: Required fields need to be filled in before submission.
	 * text
	 */
	@FindBy(xpath = "//div[@class='spModal_content']")
	public WebElement requiredFieldsNeedToBeFilledInBeforeSubmissionText;
	
	/** Save Button for New Submission By DOC Planning contact */
	@FindBy(xpath = "//*[@id=\"crs-article\"]/div/div/div/div[2]/button[1]")
	public WebElement saveButtonNewSubmissionDOCplanning;
	
	/** Cancel Button for New Submission By DOC Planning contact */
	@FindBy(xpath = "//*[@id=\"crs-article\"]/div/div/div/div[2]/button[2]")
	public WebElement cancelButtonNewSubmissionDOCplanning;
	
	/** Return to Staff Member Drop Down*/
	@FindBy(xpath = "/html/body/div[3]/md-dialog/div[2]/div/a/span[2]/b")
	public WebElement confirmRETURNtoStaffPopUpWindowDropDown;
	
	/** Confirm: Enter Text for search Staff Member */
	@FindBy (xpath = "/html/body/div[5]/div/input")
	public WebElement confirmRETURNtoStaffPopUpWindowForSearchStaffMemberTextField;
	
	/** Confirm: Enter Text for search Staff Member Results */
	@FindBy (xpath = "/html/body/div[5]/ul/li/div")
	public WebElement confirmRETURNtoStaffPopUpWindowResultsTextField;
	
	/** Confirm Return to Staff member PopUp Window YES Button */
	@FindBy (xpath = "/html/body/div[3]/md-dialog/div[3]/button[1]")
	public WebElement confirmReturnYesButton;
	
	/** Confirm Return to Staff member Pop Up Window NO Button */
	@FindBy (xpath = "/html/body/div[3]/md-dialog/div[3]/button[2]")
	public WebElement confirmReturnNoButton;
	
	

	/**
	 * ------------ END OF COLLABORATION SUBMISSIONSIONS BY DOC PLANNING CONTACT
	 * -----------
	 */

	/** ------------ COLLABORATION SUBMISSIONSIONS BY CRS REVIEWER ----------- */

	/** Submissions : Order by Drop Down */
	@FindBy(xpath = "//select[@id='orderBy']")
	public WebElement submissionsOrderByDropDown;

	/** Submissions: Confirm RETURN pop up window Text field */
	@FindBy(xpath = "//textarea[@id='crs_comment']")
	public WebElement confirmRETURNpopUpWindowTextField;

	/** Submissions: Confirm RETURN pop up window YES button */
	@FindBy(xpath = "//button[@ng-click='c.rejectCRSSubmission()']")
	public WebElement confirmRETURNpopUpWindowYESbutton;

	/**
	 * ------------ END OF COLLABORATION SUBMISSIONSIONS BY CRS REVIEWER -----------
	 */

	/**
	 * ------------ END OF CRS KNOWLEGE MANAGEMENT SYSTEM SUBMISSIONSIONS PAGE
	 * -----------
	 */

	/** ------------ CRS KNOWLEGE MANAGEMENT SYSTEM HOME PAGE ----------- */

	/** CRS Knowledge Management System Home Page NERD Button */
	@FindBy(xpath = "(//div[@class='kb-top-pad'])[1]")
	public WebElement crsKnowledgeManagementSystemHomePageNERDButton;

	/** CRS Knowledge Management System Home Page HOME Button */
	@FindBy(xpath = "//a[text()='Home']")
	public WebElement crsKnowledgeManagementSystemHomePageHOMEButton;

	/** CRS Knowledge Management System Home Page Drop Down Menu */
	@FindBy(xpath = "(//button[@id='single-button'])[1]")
	public WebElement crsKnowledgeManagementSystemHomePageDropDownMenu;

	/** CRS Knowledge Management System Home Page Drop Down Menu Values */
	@FindBy(xpath = "(//ul[@class='dropdown-menu-right dropdown-menu'])[1]/li")
	public List<WebElement> crsKnowledgeManagementSystemHomePageDropDownMenuValues;

	/** ------------ CRS KNOWLEGE MANAGEMENT SYSTEM HOME PAGE: NERD ----------- */

	/** NERD Special Topics Drop Down */
	@FindBy(xpath = "(//button[@class='btn btn-default dropdown-toggle'])[3]")
	public WebElement nerdSpecialTopicsDD;
	
	/**NERD Special Topics Drop Down Values */
	@FindBy(xpath = "//div[@class='filter-section ng-scope open']/ul/li ")
	public List <WebElement> nerdSpecialTopicsDDvalues;
	
	/**NERD Collaborations List */
	@FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[3]")
	public WebElement collaborationsList;
	
	/**NERD Collaborations DOC Version Link*/
	@FindBy(xpath = "//div[@class='block-info']")
	public WebElement collaborationsDOCVersionLink;
	
	/**NERD Collaborations Version number1*/
	@FindBy(partialLinkText = "DOC Version")
	public WebElement collaborationsVersionNumber1;
	
	/**NERD Collaborations Version number*/
	@FindBy(partialLinkText = "Version 2.0")
	public WebElement collaborationsVersionNumber2;
	
	
	/** ------------  THE END OF CRS KNOWLEGE MANAGEMENT SYSTEM HOME PAGE: NERD  -----------*/
	
	/** ------------ THE END OF CRS KNOWLEGE MANAGEMENT SYSTEM HOME PAGE -----------*/

	
	public NERDSubmissionsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
<<<<<<< Updated upstream
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
