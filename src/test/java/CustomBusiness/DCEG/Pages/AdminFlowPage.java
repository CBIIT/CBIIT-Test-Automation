package CustomBusiness.DCEG.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class AdminFlowPage extends CommonUtils {
	public AdminFlowPage() {
		PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
	}

	/** Researcher ID tab */
	@FindBy(xpath = "//a[@id='section_researchId']")
	public WebElement researcherIDTab;

	/** Researcher ID tab */
	@FindBy(xpath = "//a[@id='section_admin']")
	public WebElement administrationTab;

	/** Publications tab */
	@FindBy(xpath = "//a[@id='section_pubs']")
	public WebElement publicationsTab;

	/** Publications tab Search */
	@FindBy(xpath = "//a[@id='pubSearch']")
	public WebElement publicationsTabSearch;

	/** Publications tab Search Button */
	@FindBy(xpath = "//input[@id='search_pub_submit']")
	public WebElement publicationsTabSearchButton;

	/** Clearance Request tab */
	@FindBy(xpath = "//a[@id='section_cr_active']")
	public WebElement clearanceRequestTab;

	/** Clearance Request Inactive */
	@FindBy(xpath = "//a[contains(text(),' Clearance Requests ')]")
	public WebElement clearanceRequestTabInactive;

	/** Clearance Request tab Search */
	@FindBy(xpath = "//a[@id='mySearch']")
	public WebElement clearanceRequestTabSearch;

	/** Clearance Request tab Search Active */
	@FindBy(xpath = "//a[@id='mySearch_active']")
	public WebElement clearanceRequestTabSearchActive;

	/** Search Button */
	@FindBy(xpath = "//input[@id='search_submit']")
	public WebElement searchButton;

	/** Number of CR Admin */
	@FindBy(xpath = "//div[@id='citations_info']")
	public WebElement numberOfCRAdmin;

	/** View First Request */
	@FindBy(xpath = "//tbody/tr[1]/td[10]/a[1]")
	public WebElement viewFirstRequest;

	/** Paginate Next Button */
	@FindBy(xpath = "(//a[@class='paginate_button next'])[1]")
	public WebElement paginateNext;

	/** Office Of Director */
	@FindBy(xpath = "//input[@id='searchResearcherBean.dcegProgram[1]']")
	public WebElement officeOfDirectorResID;

	/** Researcher ID Search Button */
	@FindBy(xpath = "//input[@id='search_researcher_submit']")
	public WebElement searchButtonResearcherID;

	/** Reassignment Tab */
	@FindBy(xpath = "(//div[@class='card__back'])[1]")
	public WebElement reassignmentTab;

	/** Reassignment Tab */
	@FindBy(xpath = "(//div[@class='card__back'])[2]")
	public WebElement delegationManagement;

	/** Reassignment Enter Button */
	@FindBy(xpath = "//div[2]//div[1]//div[1]")
	public WebElement reassignmentEnterButton1;

	/** Reassignment Enter Button2 */
	@FindBy(xpath = "//span[contains(text(),'Reassignment module allows you to search for pendi')]//a[@id='reassignmentModule']")
	public WebElement reassignmentEnterButton2;

	/** Name of current assignee search field */
	@FindBy(xpath = "//input[@id='searchCurrentAssignee']")
	public WebElement nameOfCurrentAssigneeSearchField;

	/** Chanock Steven dropdown choice */
	@FindBy(xpath = "(//li[@class='ui-menu-item'])[1]")
	public WebElement chanockDropdownChoice;

	/** Dropdown Role */
	@FindBy(xpath = "//button[@title='Requestor, Submitter, Reviewer']")
	public WebElement dropdownRole;

	/** Select All Checkmark */
	@FindBy(xpath = "//input[@value='multiselect-all']")
	public WebElement selectAllCheckmark;

	/** Requestor Checkmark */
	@FindBy(xpath = "//input[@value='Requestor']")
	public WebElement requestorCheckmark;

	/** Submitter Checkmarkd */
	@FindBy(xpath = "//label[normalize-space()='Submitter']")
	public WebElement submitterCheckmark;

	/** Reviewer Checkmark */
	@FindBy(xpath = "//label[normalize-space()='Reviewer']")
	public WebElement reviewerCheckmark;

	/** Search Button Reassignment */
	@FindBy(xpath = "(//input[@id='actionAssignee'])[1]")
	public WebElement searchButtonReassignment;

	/** Clear Button Reassignment */
	@FindBy(xpath = "(//input[@id='actionAssignee'])[2]")
	public WebElement clearButtonReassignment;

	/** Clear Button Reassignment */
	@FindBy(xpath = "//table[@id='pendingQueueTable']//th[@aria-label='ClearanceRequest ID: activate to sort column ascending'][normalize-space()='ClearanceRequest ID']")
	public WebElement clearanceRequestID;

	/** Clearance Request */
	@FindBy(xpath = "(//a[@id='requestID'])[1]")
	public WebElement cR;

	/** Clearance Request */
	@FindBy(xpath = "(//input[@name='selectReassignCrCheckbox'])[1]")
	public WebElement firstCRcheckbox;

	/** Clearance Request */
	@FindBy(xpath = "(//input[@name='reassignButton'])[1]")
	public WebElement reassign;

	/** Clearance Request */
	@FindBy(xpath = "(//a[@id='requestID'])[1]")
	public WebElement firstCRView;

	/** reassign Name */
	@FindBy(xpath = "//input[@name='searchNewAssignee']")
	public WebElement reassigName;

	/** reassign Dialog Button */
	@FindBy(xpath = "//button[@class='btn btn-primary dialogReassignButton']")
	public WebElement reassignDialogButton;

	/** reassign Alert */
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-alert']")
	public WebElement reassignAlert;

	/** yes Alert */
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement yesAlert;

	/** Dogbe Nadia dropdown */
	@FindBy(xpath = "//li[contains(text(),'DOGBE, NADIA [F] / NCI DCEG TDRP OEEB / 9609 MEDICAL CENTER DRIVE 6E128')]")
	public WebElement dogbeNadiaDropdown;

	/** Dogbe Nadia dropdown */
	@FindBy(xpath = "//li[contains(text(),'HOLMES-LILLIE, SADIE')]")
	public WebElement HOLMESSADIEDropdown;

	/** Dogbe Nadia dropdown */
	@FindBy(xpath = "//li[contains(text(),'CHANG, VICKY VICKY [F] / NCI DCEG TDRP OEEB / 9609 MEDICAL CENTER DRIVE 6E128')]")
	public WebElement CHANGVICKYDropdown;

	/** first CR */
	@FindBy(xpath = "(//input[@class='selectReassignCrCheckbox'])[1]")
	public WebElement firstCR;

	/** Clearance Request Summary **/
	@FindBy(xpath = "(//a[@id='exp-col'])[1]")
	public WebElement clRequestSummary;

	/** Clearance Request ID Search **/
	@FindBy(xpath = "//input[@id='search_crId']")
	public WebElement clReqIDSearch;

	/** Clearance Request ID Reviewer **/
	@FindBy(xpath = "//input[@name='searchBean.reviewer']")
	public WebElement clReqIDReviewer;

	/** Clearance Request ID Reviewer **/
	@FindBy(xpath = "//tbody/tr[1]/td[10]/a[1]")
	public WebElement viewFirstReqDodbe;

	/** History **/
	@FindBy(xpath = "//a[contains(text(),'History')]")
	public WebElement history;

	/** Reassigned Reviewer **/
	@FindBy(xpath = "//tbody//tr[1]//td[4]")
	public WebElement reassignedReviewer;

	/** Name Search Dropdown */
	@FindBy(xpath = "//span[@class='multiselect-selected-text']")
	public WebElement anyDrop;

	/** checked requestor mark */
	@FindBy(xpath = "//label[@class='checkbox']//input[@value='Requestor']")
	public WebElement checkedRequesterMark;

	/** checked requestor mark */
	@FindBy(xpath = "//label[normalize-space()='Submitter']")
	public WebElement checkedSubmiterMark;

	/** Select All */
	@FindBy(xpath = "//input[@id='pendingQueueTable-select-all']")
	public WebElement selectAll;

	/** Checked checkmark */
	@FindBy(xpath = "//input[@class='selectReassignCrCheckbox']")
	public WebElement checkedCheckmark;

	/** Clear Button **/
	@FindBy(xpath = "//input[@name='clearSearch']")
	public WebElement clearButton;

	/* NO data found **/
	@FindBy(xpath = "(//td[@class='dataTables_empty'])[1]")
	public WebElement noData;

	/* PENDING **/
	@FindBy(xpath = "//a[normalize-space()='PENDING']")
	public WebElement pendingTab;

	/* INFLIGHT **/
	@FindBy(xpath = "//a[normalize-space()='INFLIGHT']")
	public WebElement inflightTab;
	/* COMPLETED **/
	@FindBy(xpath = "//a[normalize-space()='COMPLETED']")
	public WebElement completedTab;

	/* Export Results **/
	@FindBy(xpath = "(//a[@id='dataTables_export_top'])[1]")
	public WebElement exportResults;

	/* Export Results Completed **/
	@FindBy(xpath = "(//a[@class='small dataTables_export_top'])[3]")
	public WebElement exportResultsCompleted;

	/** View First Request Inflight */
	@FindBy(xpath = "(//a[@id='requestID'])[1]")
	public WebElement viewFirstRequestInflight;

	/** View First Request Inflight */
	@FindBy(xpath = "(//a[@class='btn btn-primary btn-xs'])[18]")
	public WebElement viewFirstRequestCompleted;

	/** Human Genetics Program */
	@FindBy(xpath = "//input[@id='searchResearcherBean.dcegProgram[0]']")
	public WebElement humanGeneticsProgram;

	/** Trans Divisional Research Program */
	@FindBy(xpath = "//input[@id='searchResearcherBean.dcegProgram[2]']")
	public WebElement transDivisionalResearchProgram;

	/** Researcher Last Name Field */
	@FindBy(xpath = "//input[@name='searchResearcherBean.researcher']")
	public WebElement researcherLastNameField;

	/** Researcher Displayed Field */
	@FindBy(xpath = "//td[@class='sorting_1']")
	public WebElement researcherDisplayedField;

	/** Number of Requests */
	@FindBy(xpath = "//div[@id='researcher_table_info']")
	public WebElement numberOfRequests;

	/** Create Researcher ID option */
	@FindBy(xpath = "(//ul[@class='nav navbar-nav navbar-right admin-nav']//a)[1]")
	public WebElement createResearcherID;

	/** Pending Submission Status */
	@FindBy(xpath = "//input[@id='dashboard_searchPubBean_col1Statuses-1']")
	public WebElement pendingSubmissionStatus;

	/** Submitted For Publication Status */
	@FindBy(xpath = "//input[@id='dashboard_searchPubBean_col1Statuses-2']")
	public WebElement submittedForPublicationStatus;

	/** Accepted For Publication Status */
	@FindBy(xpath = "//input[@id='dashboard_searchPubBean_col1Statuses-3']")
	public WebElement accecptedForPublicationStatus;

	/** Epublished Status */
	@FindBy(xpath = "//input[@id='dashboard_searchPubBean_col2Statuses-1']")
	public WebElement epublishedStatus;

	/** Published Status */
	@FindBy(xpath = "//input[@id='dashboard_searchPubBean_col2Statuses-2']")
	public WebElement publishedStatus;

	/** Not Published Status */
	@FindBy(xpath = "//input[@id='dashboard_searchPubBean_col2Statuses-3']")
	public WebElement notPublishedStatus;

	/** View first unpublished request */
	@FindBy(xpath = "(//a[@id='editpub'])[1]")
	public WebElement viewFirstUnpublishedReq;

	/** Publication Status Dropdown */
	@FindBy(xpath = "//select[@id='publicationStatusSelect']")
	public WebElement publicationStatusDropdown;

	/** Published Dropdown Choice */
	@FindBy(xpath = "(//option[contains(text(),'Published')])[2]")
	public WebElement publishedDropdownChoice;

	/** Draft Clearance Request Status */
	@FindBy(xpath = "//input[@id='dashboard_searchBean_col1Statuses-1']")
	public WebElement draftClRequestStatus;

	/** Submitted For Verification Clearance Request Status */
	@FindBy(xpath = "//input[@id='dashboard_searchBean_col1Statuses-2']")
	public WebElement submittedForVerificationClRequestStatus;

	/** Returned For Revision Request Status */
	@FindBy(xpath = "//input[@id='dashboard_searchBean_col2Statuses-1']")
	public WebElement returnedForRevisionClRequestStatus;

	/** Pagination Right */
	@FindBy(xpath = "(//i[@class='fa fa-caret-right'])[1]")
	public WebElement paginationRight;

	/** High Profile checkbox */
	@FindBy(xpath = "//input[@id='search_hpQ']")
	public WebElement highProfileCheckbox;

	/** Clearance request inactive tab */
	@FindBy(xpath = "//a[@id='section_cr']")
	public WebElement clRequestTab;

	/** Date of Submitted Request */
	@FindBy(xpath = "(//td[8])[1]")
	public WebElement dateSubmitted;

	/** Draft Status */
	@FindBy(xpath = "//input[@id='dashboard_searchBean_col1Statuses-1']")
	public WebElement draftStatus;

	/** Submitted For Verification Status */
	@FindBy(xpath = "//input[@id='dashboard_searchBean_col1Statuses-2']")
	public WebElement submittedForVerStatus;

	/** Returned For Revision Status */
	@FindBy(xpath = "//input[@id='dashboard_searchBean_col2Statuses-1']")
	public WebElement returnedForRevStatus;

	/** Draft TDRP CGB */
	@FindBy(xpath = "//a[contains(text(),'301245')]")
	public WebElement draftTDRPCGB;

	/** Journal name */
	@FindBy(xpath = "//input[@id='publicationNameInput']")
	public WebElement journalName;

	/** Submitted For Verification TDRP CGB */
	@FindBy(xpath = "//a[contains(text(),'301223')]")
	public WebElement submittedForVerificationTDRPCGB;

	/** Submitted For Verification TDRP CGB */
	@FindBy(xpath = "//a[contains(text(),'301163')]")
	public WebElement returnedForRevisionTDRPCGB;

	/** Search Active Tab */
	@FindBy(xpath = "//a[@id='mySearch_active']")
	public WebElement searchActiveTab;

	/** Publication 301163 TDRP CGB */
	@FindBy(xpath = "//a[contains(text(),'301442')]")
	public WebElement publication301442TDRPCGB;

	/** Publication 301163 TDRP CGB */
	@FindBy(xpath = "(//div[@class='col-sm-9'])[6]")
	public WebElement disabledJournalName;

	/** Journal/Book name */
	@FindBy(xpath = "//input[@id='publicationName']")
	public WebElement journalBookName;

	/** Publication 30247 */
	@FindBy(xpath = "//tbody/tr[3]/td[10]/a[1]")
	public WebElement publication30247;

	/** Publication OEEB */
	@FindBy(xpath = "//a[normalize-space()='300330']")
	public WebElement publicationOEEB;

	/** Publication Title */
	@FindBy(xpath = "//input[@id='publicationTitle']")
	public WebElement publicationTitle;

	/** Inactive Publication Title */
	@FindBy(xpath = "//p[contains(text(),'Early-life Farm Exposures and Adult Asthma and Atopy in the Agricultural Lung Health Study')]")
	public WebElement inactivePublicationTitle;

}
