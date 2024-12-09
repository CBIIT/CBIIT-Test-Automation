package CUSTOM_BUSINESS.DCEG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class DirectSubmitterPage extends CommonUtils {
	public DirectSubmitterPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	/**Create Clearance Request Button*/
	@FindBy(xpath = "//a[@id='createClearanceRequestId']")
	public WebElement createClearanceRequestButton;
	
	/**Program Director*/
	@FindBy(xpath = "//td[normalize-space()='Program Director']")
	public WebElement programDirector;
	
	/**Withdraw Button*/
	@FindBy(xpath = "//div[@id='btn-action']//input[@id='withdrawCR']")
	public WebElement withdrawButton;
	
	/**Withdraw Alert comment field*/
	@FindBy(xpath = "//textarea[@id='clearanceRequestWithdrawComments']")
	public WebElement withdrawCommentField;
	
	/**Withdraw Alert Confirmation*/
	@FindBy(xpath = "//button[contains(text(),'Withdraw Clearance Request')]")
	public WebElement withdrawConfirmation;
	
	/**Additional reviewer field*/
	@FindBy(xpath = "//input[@id='searchReviewer']")
	public WebElement additionalRevField;
	
	/**Apelberg Dropdown*/
	@FindBy(xpath = "//li[contains(text(),'APELBERG, MEREDITH / HNC9C7')]")
	public WebElement apelbergDropdown;
	
	/**Campos Dropdown*/
	@FindBy(xpath = "//li[contains(text(),'CAMPOS, NICOLE / HNC9C8')]")
	public WebElement camposDropdown;
	
	/**View first publication*/
	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]")
	public WebElement viewFirstPublication;
	
	/**Conflict of Interest No radio button*/
	@FindBy(xpath = "//input[@id='conflictOfInterest2']")
	public WebElement noConflictOfInterest;
	
	/**Actions dropdown*/
	@FindBy(xpath = "//select[@id='selectAction']")
	public WebElement actionsDropdown;
	
	/**Return for revision choice*/
	@FindBy(xpath = "//select[@id='selectAction']")
	public WebElement returnForRevisionChoice;
	
	/**Comments Field*/
	@FindBy(xpath = "//textarea[@id='actionComments']")
	public WebElement commentsField;
	
	/**Process Action*/
	@FindBy(xpath = "//button[@id='processActionButton']")
	public WebElement processActionButton;
	
	/**Confirm Return for revision*/
	@FindBy(xpath = "//button[contains(text(),'Return for Revision')]")
	public WebElement confirmReturnRevision;
	
	/**Confirm disapprove*/
	@FindBy(xpath = "//button[contains(text(),'Disapprove')]")
	public WebElement confirmDissaprove;
	
	/**Dissaprove*/
	@FindBy(xpath = "//button[contains(text(),'Disapprove')]")
	public WebElement dissaprove;
	
	/**Active Submissions tab*/
	@FindBy(xpath = "//li//a[@id='mySubmissions']")
	public WebElement activeSubmissionsTab;
	
	/**Submission Title*/
	@FindBy(xpath = "//input[@id='clearanceRequestForm_clearanceRequest_title']")
	public WebElement submissionTitle;
	
	/**Disapproved Alert*/
	@FindBy(xpath = "//p[contains(text(),'has been Disapproved. ')]")
	public WebElement disapprovedAlert;
	
	/**yes Conflict Of Interest*/
	@FindBy(xpath = "//input[@id='conflictOfInterest1']")
	public WebElement yesConflictOfInterest;
	
	/**Confirm Return for revision*/
	@FindBy(xpath = "//button[contains(text(),'Remove Current Reviewer')]")
	public WebElement confirmRemoveReviewer;

	/**Removed from list of reviewers Alert*/
	@FindBy(xpath = "//p[contains(text(),'has been removed from the list of reviewers. ')]")
	public WebElement removedFromListRevAlert;
	
	/**High Profile NO*/
	@FindBy(xpath = "//input[@id='highProfile2']")
	public WebElement highProfileNo;
	
	/**Additional Reviewer*/
	@FindBy(xpath = "//input[@id='searchReviewer']")
	public WebElement additionalReviewer;

	/**Mary Lamb dropdown*/
	@FindBy(xpath = "//li[contains(text(),'BLACK, AMANDA / HNC91')]")
	public WebElement amBlack;
	
	/**Approved alert*/
	@FindBy(xpath = "//p[contains(text(),'Approved for Dissemination.')]")
	public WebElement approvedAlert;
	
	/**Previous reviewer Abnet*/
	@FindBy(xpath = "(//tbody//td[contains(text(),'ABNET, CHRISTIAN')])[1]")
	public WebElement previousReviewer;
	
	/** Abnet removed alert**/
	@FindBy(xpath = "//p[contains(text(),'Current Reviewer: ABNET, CHRISTIAN has been removed from the list of reviewers. ')]")
	public WebElement abentRemovefFromReviewersAlert;
	
	/**Next reviewer Abnet*/
	@FindBy(xpath = "(//tbody//td[contains(text(),'ABNET, CHRISTIAN')])[1]")
	public WebElement nextReviewer;
	
	/**Returned for revision alert*/
	@FindBy(xpath = "//p[contains(text(),'Returned for Revision.')]")
	public WebElement returnedForRevisionAlert;
	
	/**NO High Profile*/
	@FindBy(xpath = "//label//input[@id='highProfileNo']")
	public WebElement noHighProfile;
}