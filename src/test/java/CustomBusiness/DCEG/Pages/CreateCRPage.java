package CustomBusiness.DCEG.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CreateCRPage extends CommonUtils {
	public CreateCRPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/**Create Clearance Request Button*/
	@FindBy(xpath = "//a[@id='createClearanceRequestId']")
	public WebElement createClearanceRequestButton;
	
	/**Save Button*/
	@FindBy(xpath = "//input[@id='saveCR']")
	public WebElement saveButton;
	
	/**Submit for Verification Button*/
	@FindBy(xpath = "//div[@id='btn-action']//input[@id='submitForReviewCR']")
	public WebElement submitForVerificationButton;
	
	/**Clearance Requests Tab*/
	@FindBy(xpath = "//a[@id='section_cr_active']")
	public WebElement clearanceRequestsTab;
	
	/**Publications Tab*/
	@FindBy(xpath = "//a[@id='section_pubs']")
	public WebElement publicationsTab;
	
	/**CAS ID / Research Program Title dropdown**/
	@FindBy(xpath = "//a[@id='programSelectLink']")
	public WebElement casDropdown;
	
	/**General program Administration option**/
	@FindBy(xpath = "//li[@aria-label='Collaborative Research Programs : 00010 - EBP - General Program Administration [NRS]']")
	public WebElement genProgramAdministration;
	
	/**Requester field **/
	@FindBy(xpath = "//input[@id='requestorName']")
	public WebElement requesterField;
	
	/**Submission title field **/
	@FindBy(xpath = "//input[@id='clearanceRequestForm_clearanceRequest_title']")
	public WebElement submissionTitleField;
	
	/**Abstract field **/
	@FindBy(xpath = "//textarea[@id='abstractText']")
	public WebElement abstractField;
	
	/**Submission Type publication **/
	@FindBy(xpath = "//input[@id='34']")
	public WebElement publication;
	
	/**ResearchProgram **/
	@FindBy(xpath = "//input[@id='36']")
	public WebElement researchProgram;
	
	/**Publication Type Dropdown **/
	@FindBy(xpath = "//select[@id='publicationTypeSelect']")
	public WebElement publicationDropdown;
	
	/**Publication Type Dropdown **/
	@FindBy(xpath = "//option[@value='38']")
	public WebElement originJournlPublicationDropdown;
	
	/**Journal Field **/
	@FindBy(xpath = "//input[@id='publicationNameInput']")
	public WebElement journalField;
	
	/**NIH rights question confirm answer**/
	@FindBy(xpath = "//label//input[@id='publishingAgreementCheckbox']")
	public WebElement nihRightConfirm;
	
	/**Publisher Credibility confirm answer**/
	@FindBy(xpath = "//input[@id='publisherCredibilityYes']")
	public WebElement publisherCredibilityConfirm;
	
	/**Genomic Data Generation confirm answer**/
	@FindBy(xpath = "//input[@id='genomicDataYes']")
	public WebElement genomicDataGenerationConfirm;
	
	/**Laboratory Resources deny answer**/
	@FindBy(xpath = "//input[@id='labResourcesNo']")
	public WebElement labResourcesDeny;
	
	/**Laboratory Resources confirm answer**/
	@FindBy(xpath = "//input[@id='labResourcesYes']")
	public WebElement labResourcesConfirm;
	
	/**Manuscript choice**/
	@FindBy(xpath = "//input[@id='ft_19']")
	public WebElement manuscriptChoice;
	
	/**Patent Invention Employee Invention Report filed choice**/
	@FindBy(xpath = "//input[@id='68']")
	public WebElement employeeInventionChoice;
	
	/**Select Agent NO choice**/
	@FindBy(xpath = "//input[@id='selectAgentsNo']")
	public WebElement selectAgentNo;
	
	/**Helix Biowulf YES choice**/
	@FindBy(xpath = "//input[@id='helixBiowulfYes']")
	public WebElement helixBiowulfYES;
	
	/**Clinical Center's BTRIS system YES choice**/
	@FindBy(xpath = "//input[@id='btrisYes']")
	public WebElement btrisYES;
	
	/**Dual Use NO choice**/
	@FindBy(xpath = "//input[@id='dualUseNo']")
	public WebElement dualUseNO;
	
	/*High Profile YES choice**/
	@FindBy(xpath = "//input[@id='highProfileYes']")
	public WebElement highProfileYES;
	
	/*High Profile No choice**/
	@FindBy(xpath = "//input[@id='highProfileNo']")
	public WebElement highProfileNO;
	
	/*Authors field**/
	@FindBy(xpath = "//textarea[@id='authorsList']")
	public WebElement authorsField;
	
	/*ABNET, CHRISTIAN field**/
	@FindBy(xpath = "//td[normalize-space()='ABNET, CHRISTIAN']")
	public WebElement abnetChristian;
	
	/*Branch Chief field**/
	@FindBy(xpath = "//td[normalize-space()='Branch Chief']")
	public WebElement branchChief;
	
	/*BERRINGTON, AMY field**/
	@FindBy(xpath = "//td[normalize-space()='BERRINGTON, AMY']")
	public WebElement berringtonAmy;
	
	/*GARCIA-CLOSAS, MONTSERRAT field**/
	@FindBy(xpath = "//td[normalize-space()='GARCIA-CLOSAS, MONTSERRAT']")
	public WebElement montserratGarcia;
	
	/*Program Director field**/
	@FindBy(xpath = "//td[normalize-space()='Program Director']")
	public WebElement prDirector;
	
	/*CHANOCK, STEPHEN field**/
	@FindBy(xpath = "//td[normalize-space()='CHANOCK, STEPHEN']")
	public WebElement chanockStephen;
	
	/*Division Director field**/
	@FindBy(xpath = "//td[normalize-space()='Division Director']")
	public WebElement divDirector;
	
	/*Submit For Verification**/
	@FindBy(xpath = "//div[@id='btn-action']//input[@id='VerifyCR']")
	public WebElement submitForVerification;
	
	/*Data Sharing PLan**/
	@FindBy(xpath = "//div[@id='fileTypePresentation']//input[@id ='ftp_50']")
	public WebElement dataSharingPlanPresentation;
	
	/*Data Sharing PLan**/
	@FindBy(xpath = "//div[@id='fileTypePublication']//input[@id ='ft_50']")
	public WebElement dataSharingPlanPublication;
	
	/*My active submissions**/
	@FindBy(xpath = "//a[@id='mySubmissions']")
	public WebElement myActiveSubmissions;
	
	/*Test Request**/
	@FindBy(xpath = "//a[@id='mySubmissions']")
	public WebElement testRequest;
	
	/*View test request**/
	@FindBy(xpath = "(//a[@id='editpub'])[1]")
	public WebElement viewFirstReq;
	
	/*Delete Button**/
	@FindBy(xpath = "//input[@id='deleteCR']")
	public WebElement deleteButton;
	
	/* Confirmation Delete Clearance request**/
	@FindBy(xpath = "//button[contains(text(),'Delete Clearance Request')]")
	public WebElement deleteClearanceReqConfirmation;
	
	/*Presentation type**/
	@FindBy(xpath = "(//input[@class='submissionTypeRadio'])[2]")
	public WebElement presentationType;
	
	/*Presentation dropdown**/
	@FindBy(xpath = "//select[@id='presentationTypeSelect']")
	public WebElement presentationDropdown;
	
	/*Meeting abstract**/
	@FindBy(xpath = "//option[@value='47']")
	public WebElement meetingAbstract;
	
	/*Meeting Name**/
	@FindBy(xpath = "//input[@id='meetingNameInput']")
	public WebElement meetingName;
	
	/*Meeting Location**/
	@FindBy(xpath = "//input[@id='meetingLocationInput']")
	public WebElement meetingLocation;
	
	/*Meeting Date:**/
	@FindBy(xpath = "//input[@id='datepicker']")
	public WebElement meetingDate;
	
	/*Lab Resources YES**/
	@FindBy(xpath = "//input[@id='labResourcesYes']")
	public WebElement labResourcesYES;
	
	/*Lab Resources NO**/
	@FindBy(xpath = "//input[@id='labResourcesNo']")
	public WebElement labResourcesNO;
	
	/*Lab Resources MDPL**/
	@FindBy(xpath = "//div[@id='labResourcesFollowUpGroupWriteView']//input[@id='labResourcesCheckboxlist-1']")
	public WebElement labResourcesMDPL;
	
	/*Review Materials Abstract*/
	@FindBy(xpath = "//input[@id='ftp_49']")
	public WebElement reviewMaterialsAbstract;
	
	/*ALBANES DEMETRIUS*/
	@FindBy(xpath = "//li[contains(text(),'ALBANES, DEMETRIUS / HNC9C2')]")
	public WebElement albanesDemetrius;
	
	/*ALBANES DEMETRIUS*/
	@FindBy(xpath = "//li[contains(text(),'ALBANES")
	public WebElement alexisBartelloni;
	
	/*ALBANES DEMETRIUS*/
	@FindBy(xpath = "//input[@id='submitForReviewCR']")
	public WebElement submitForReview;
}
