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

	/** NERD Special Topics Drop Down Values */
	@FindBy(xpath = "//div/div/div/div[3]/div[1]/div/div/div[1]/div/div/div[2]/div[2]/div[3]/ul/li")
	public List<WebElement> nerdSpecialTopicsDDvalues;

	/**
	 * ------------ END OF CRS KNOWLEGE MANAGEMENT SYSTEM HOME PAGE: NERD
	 * -----------
	 */

	/**
	 * ------------ END OF CRS KNOWLEGE MANAGEMENT SYSTEM HOME PAGE -----------
	 */

	public NERDSubmissionsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
