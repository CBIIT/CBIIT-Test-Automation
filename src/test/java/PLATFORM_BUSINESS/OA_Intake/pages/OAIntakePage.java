package PLATFORM_BUSINESS.OA_Intake.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OAIntakePage {
    public OAIntakePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** New request tab */
    @FindBy(xpath = "//div//h2[.='New Request']")
    public WebElement tabnNewRequest;

    /** New request page header */
    @FindBy(xpath = "//div//h3[contains(text(),'Office of Acquisitions (OA) New Request ')]")
    public WebElement newRequestPageHeader;

    /** Requestor Queue hyperlink */
    @FindBy(xpath = "//a[@title='Requester Queue Link']")
    public WebElement requestorQueueHyperlink;

    /** Requestor page header */
    @FindBy(xpath = "//h2[contains(text(),'Requestor (Requested For) Queue for ')]")
    public WebElement requestorPageHeader;

    /**  User Guide hyperlink*/
    @FindBy(xpath = "//*[@id=\"xbd56f5e41b8af910344042e2b24bcb61\"]/div/div/div/div[2]/p[5]/strong/a")
    public WebElement userGuideHyperlink;

    /**  User Guide Please log in to see articles*/
    @FindBy(xpath = "//p[contains(text(),'Please log in to see articles.')]")
    public WebElement userGuideLoginText;

    /**  Status of request*/
    @FindBy(xpath = "//span[@class='select2-chosen'][.='Draft']")
    public WebElement requestStatus;

    /**  request Title field*/
    @FindBy(xpath = "//input[@id='sp_formfield_request_title']")
    public WebElement requestTitleField;

    /**  request Description field*/
    @FindBy(xpath = "//textarea[@id='sp_formfield_request_description']")
    public WebElement requestDescriptionField;

    /**  award date field*/
    @FindBy(xpath = "//input[@id='sp_formfield_expected_award_date']")
    public WebElement awardDateField;

    /** NAICS code status dropdown*/
    @FindBy(xpath = "//div[@id='s2id_sp_formfield_known_naics_code_select']")
    public WebElement drpdnNAICSCodeStatus;

    /** NAICS code status Known option*/
    @FindBy(xpath = "//ul//li//div[@class='select2-result-label']")
    public WebElement drpdnNAICSCodeKnownOption;

    /** NAICS code field*/
    @FindBy(xpath = "//input[@id='sp_formfield_naics_code']")
    public WebElement nAICSCodeField;

    /** dropdown New or Re-compete Contract*/
    @FindBy(xpath = "//*[@id='s2id_sp_formfield_new_contract']")
    public WebElement drpdwnNewRecompeteContract;

    /**  Re-compete Contract*/
    @FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
    public WebElement recompeteContract;

    /**  Re-compete Contract Number field */
    @FindBy(xpath = "//div[@id='s2id_sp_formfield_previous_contract_num']")
    public WebElement previousContractNumberField;

    /**  Previous Number field */
    @FindBy(xpath = "(//a[@class='select2-choice select2-default form-control'])[2]")
    public WebElement previousBuyerField;

    /**  Recommended Contract Mechanism dropdown*/
    @FindBy(xpath = "//*[@id='s2id_sp_formfield_contract_mechanism']")
    public WebElement drpdownRecomContractMechanism;

    /**  External Call/Task Orders (TOs)(NITAAC, GSA)*/
    @FindBy(xpath = "(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[2]")
    public WebElement externalCallOption;

    /**  Internal Call/Task Orders (TOs)(NITAAC, GSA)*/
    @FindBy(xpath = "(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[3]")
    public WebElement internalCallOption;

    /**  alert messagen Task Order Acquisition Plans*/
    @FindBy(xpath = "(//div[.=' Task Order Acquisition Plans (TOAPs) are required for both Internal and External Call/ Order submissions.'])[2]")
    public WebElement alertMessageTaskOrderAcqPlans;

    /**  R&D/R&D Support dropdown*/
    @FindBy(xpath = "//*[@id='s2id_sp_formfield_rd_support']")
    public WebElement drpdownRD;

    /**  R&D/R&D Support yes*/
    @FindBy(xpath = "(//div[@class='select2-result-label'])[1]")
    public WebElement RDYes;

    /**  Date Concept Peer Review Completed field*/
    @FindBy(xpath = "//input[@id='sp_formfield_date_review_completed']")
    public WebElement dateConceptPeerReviewComField;

    /**  Dropdown PSC Code Status*/
    @FindBy(xpath = "//*[@id='s2id_sp_formfield_psc_code_status']")
    public WebElement dropdownPSCCodeStatus;

    /**  Yes PSC Code Status*/
    @FindBy(xpath = "(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[1]")
    public WebElement yesPSCCodeStatus;

    /**  PSC Code Field*/
    @FindBy(xpath = "//input[@id='sp_formfield_psc_code']")
    public WebElement PSCCodeField;

    /**  FITARA dropdown*/
    @FindBy(xpath = "//div[@id='s2id_sp_formfield_acquisition_components_details']")
    public WebElement dropdwnFITARA;

    /**  FITARA no*/
    @FindBy(xpath = "(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[2]")
    public WebElement noFITARA;

    /**   estimated value of IT field*/
    @FindBy(xpath = "//input[@name='estimated_value_it_bio_comp']")
    public WebElement estValueITField;

    /**  ISSO Clearance dropdown*/
    @FindBy(xpath = "//div[@id='s2id_sp_formfield_requested_isso_clearance']")
    public WebElement dropdownISSO;

    /**  ISSO Clearance yes*/
    @FindBy(xpath = "(//li[@class='select2-results-dept-0 select2-result select2-result-selectable'])[1]")
    public WebElement yesISSO;

    /**  SSO Clearance Ticket field*/
    @FindBy(xpath = "//input[@name='isso_clearance_ticket']")
    public WebElement ISSOClearanceTicketField;

    /** button Submit Request*/
    @FindBy(xpath = "(//button[@ng-click='triggerUIAction(action)'])[1]")
    public WebElement btnSubmitRequest;

    /**Modal Submit buuton*/
    @FindBy(xpath = "(//button[@ng-click='buttonClicked(button)'])[1]")
    public WebElement modalSubmitButton;

    /**Confirmation Modal Text Task Order Acquisition Plan*/
    @FindBy(xpath = "//li[.='Task Order Acquisition Plans (TOAPs) are required for both Internal and External Call/ Order submissions.']")
    public WebElement textConfModalTaskOrderAcquisitionPlans;

    /**Confirmation Modal Text Concept SPL*/
    @FindBy(xpath = "//ul//li[contains(text(),'Please attach the concept/SPL approval and BSA minutes /waiver (if received).')]")
    public WebElement textConfModalConceptSPL;

    /**Confirmation Modal Text draft Statement of Work and IGCE*/
    @FindBy(xpath = "//li[.='In order for your new requirement to be assigned, you are encouraged to submit AT A MINIMUM a draft Statement of Work and IGCE!']")
    public WebElement textConfModalDraftStWorkICGE;

    /**OA Intake Page header*/
    @FindBy(xpath = "//h1[.='Office of Acquisitions (OA) Portal']")
    public WebElement pageHeaderOAIntake;

    /**OA Intake Page header text*/
    @FindBy(xpath = "//h3[.='Welcome to the National Cancer Institute Office of Acquisitions (OA)']")
    public WebElement pageHeaderTextOAIntake;

    /**OA Intake Page IMPORTANT text*/
    @FindBy(xpath = "//h3[.='Welcome to the National Cancer Institute Office of Acquisitions (OA)']")
    public WebElement importantTextOAIntake;

    /**New Request tab*/
    @FindBy(xpath = "//h2[.='New Request']")
    public WebElement tabNewRequest;

    /**CO/CS Queue tab*/
    @FindBy(xpath = "//h2[.='CO/CS Queue']")
    public WebElement tabCOCSQueue;

    /**Requestor (Requested For) Queue tab*/
    @FindBy(xpath = "//h2[.='Requestor (Requested For) Queue']")
    public WebElement tabRequestorQueue;

    /**Management Dashboard tab*/
    @FindBy(xpath = "//h2[.='Management Dashboard']")
    public WebElement tabManagementDashboard;

    /**Leadership Queue(Pending Action) tab*/
    @FindBy(xpath = "//h2[.='Leadership Queue (Pending Action)']")
    public WebElement tabLeadershipQueue;

    /**Menu dropdown*/
    @FindBy(xpath = "//*[@id='x08f52ac01bb17550344042e2b24bcbe1']/li[1]/a")
    public WebElement menuDrpdwn;

    /**Menu Home option*/
    @FindBy(xpath = "(//a[@class='ng-scope']//span[.='Home'])[1]")
    public WebElement menuHome;

    /**Menu Requestor Queue*/
    @FindBy(xpath = "//a[@class='ng-scope']//span[.='Requestor (Requested For) Queue']")
    public WebElement menuRequestorQueue;

    /**Menu Leadership Queue*/
    @FindBy(xpath = "//a[@class='ng-scope']//span[.='Leadership Queue (Pending Action)']")
    public WebElement menuLeadershipQueue;

    /**Menu Leadership Queue*/
    @FindBy(xpath = "//a[@class='ng-scope']//span[.='CO/CS Queue']")
    public WebElement menuCOCSQueue;

    /**Menu Management Dashboard*/
    @FindBy(xpath = "//a[@class='ng-scope']//span[.='Management Dashboard']")
    public WebElement menuManagementDashboard;

    /**Menu User Guide*/
    @FindBy(xpath = "//a[@class='ng-scope']//span[.='User Guide']")
    public WebElement menuUserGuide;

    /**Instructions hyperlink*/
    @FindBy(xpath = "//a[@href='/oa_intake?id=oa_intake_form_instructions']")
    public WebElement hyperlinkInstructions;

    /**Instructions page header*/
    @FindBy(xpath = "//div//h2[contains(text(),'Instructional Page')]")
    public WebElement pageHeaderInstructions;

    /**home button*/
    @FindBy(xpath = "//*[@id='x08f52ac01bb17550344042e2b24bcbe1']/li[3]/a")
    public WebElement homeButton;

    /**profile usrename*/
    @FindBy(xpath = "(//div[@class='sub-avatar'])[1]")
    public WebElement profileUsername;

    /**profile Profile option*/
    @FindBy(xpath = "//a[.='Profile']")
    public WebElement profileProfileOption;

    /**profile Log Out option*/
    @FindBy(xpath = "(//a[.='Log out'])[1]")
    public WebElement profileLogOutOption;

    /**Requested For page header*/
    @FindBy(xpath = "//h2[contains(text(),'Requestor (Requested For) Queue for ')]")
    public WebElement pageHeaderRequestedFor;

    /**Requsted For page header*/
    @FindBy(xpath = "//h1[contains(text(),'Contracting Officer/Contract Specialist Queue')]")
    public WebElement pageHeaderContractingOfficer;

    /**New Request button*/
    @FindBy(xpath = "//h2[.='New Request']")
    public WebElement buttonNewRequest;

    /**Contact Support button*/
    @FindBy(xpath = "//h2[.='Contact Support']")
    public WebElement buttonContactSupport;

    /**hyperlink POTS*/
    @FindBy(xpath = "//a[@href='https://pots.nci.nih.gov']")
    public WebElement hyperlinkPOTS;

    /**NIH login content*/
    @FindBy(xpath = "//main[@class='nih-login-content']")
    public WebElement nihLoginContent;

    /**hyperlink FCAS*/
    @FindBy(xpath = "//a[@href='https://fcas.cancer.gov/']")
    public WebElement hyperlinkFCAS;

    /**requestor breadcrumbs*/
    @FindBy(xpath = "//a[contains(text(),'Requestor (Requested For) = Wanda Neal')]")
    public WebElement requestorBreadcrumbs;

    /**Request ID sort by ascending option*/
    @FindBy(xpath = "//div[@title='Sort by Ascending'][contains(text(),'Request ID')]")
    public WebElement sortAscendingRequestID;

    /**Request ID sort by descending option*/
    @FindBy(xpath = "//div[@title='Sort by Descending'][contains(text(),'Request ID')]")
    public WebElement sortDescendingRequestID;

    /**Status sort by ascending option*/
    @FindBy(xpath = "(//div[@title='Sort by Ascending'][contains(text(),'Status')])[1]")
    public WebElement sortAscendingStatus;

    /**Status sort by descending option*/
    @FindBy(xpath = "(//div[@title='Sort by Descending'][contains(text(),'Status')])[1]")
    public WebElement sortDescendingStatus;

    /**Request Title by ascending option*/
    @FindBy(xpath = "//div[@title='Sort by Ascending'][contains(text(),'Request Title')]")
    public WebElement sortAscendingRequestTitle;

    /**Request Title by descending option*/
    @FindBy(xpath = "//div[@title='Sort by Descending'][contains(text(),'Request Title')]")
    public WebElement sortDescendingRequestTitle;

    /**Requested For by ascending option*/
    @FindBy(xpath = "//div[@title='Sort by Ascending'][contains(text(),' Requestor (Requested For')]")
    public WebElement sortAscendingRequestedFor;

    /**Requested For by descending option*/
    @FindBy(xpath = "//div[@title='Sort by Descending'][contains(text(),' Requestor (Requested For')]")
    public WebElement sortDescendingRequestedFor;

    /**Submitter by ascending option*/
    @FindBy(xpath = "//div[@title='Sort by Ascending'][contains(text(),' Submitter')]")
    public WebElement sortAscendingSubmitter;

    /**Submitter by descending option*/
    @FindBy(xpath = "//div[@title='Sort by Descending'][contains(text(),' Submitter')]")
    public WebElement sortDescendingSubmitter;

    /**Created on by ascending option*/
    @FindBy(xpath = "//div[@title='Sort by Ascending'][contains(text(),'Created On')]")
    public WebElement sortAscendingCreatedOn;

    /**Created on by descending option*/
    @FindBy(xpath = "//div[@title='Sort by Descending'][contains(text(),'Created On')]")
    public WebElement sortDescendingCreatedOn;

    /**Status Date by ascending option*/
    @FindBy(xpath = "//div[@title='Sort by Ascending'][contains(text(),'Status Date')]")
    public WebElement sortAscendingStatusDate;

    /**Status Date by ascending option*/
    @FindBy(xpath = "//div[@title='Sort by Descending'][contains(text(),'Status Date')]")
    public WebElement sortDescendingStatusDate;

    /**OA Intakes - Assigned section*/
    @FindBy(xpath = "//h2[contains(text(),'OA Intakes - Assigned')]")
    public WebElement sectionOAIntakesAssigned;

    /**OA Intakes - Assigned menu*/
    @FindBy(xpath = "//button[@aria-label='OA Intakes - Assigned Context Menu']")
    public WebElement sectionOAIntakesAssignedMenu;

    /**OA Intakes - Assigned menu Export as PDF*/
    @FindBy(xpath = "(//a[.='Export as PDF'])[1]")
    public WebElement exportAsPDFOAIntakesAssignedMenu;

    /**OA Intakes - Assigned menu Export as Excel*/
    @FindBy(xpath = "(//a[.='Export as Excel'])[1]")
    public WebElement exportAsExcelOAIntakesAssignedMenu;

    /**OA Intakes - Assigned menu Export as CSV*/
    @FindBy(xpath = "(//a[.='Export as CSV'])[1]")
    public WebElement exportAsCSVOAIntakesAssignedMenu;

    /**OA Intakes - Accepted section*/
    @FindBy(xpath = "//h2[contains(text(),'OA Intakes - Accepted')]")
    public WebElement sectionOAIntakesAccepted;

    /**OA Intakes - Cancelled section*/
    @FindBy(xpath = "//h2[contains(text(),'OA Intakes - Cancelled')]")
    public WebElement sectionOAIntakesCancelled;

    /**OA Intakes - Accepted menu*/
    @FindBy(xpath = "//button[@aria-label='OA Intakes - Accepted Context Menu']")
    public WebElement sectionOAIntakesAcceptedMenu;

    /**OA Intakes - Accepted menu Export as PDF*/
    @FindBy(xpath = "(//a[.='Export as PDF'])[2]")
    public WebElement exportAsPDFOAIntakesAcceptedMenu;

    /**OA Intakes - Accepted menu Export as Excel*/
    @FindBy(xpath = "(//a[.='Export as Excel'])[2]")
    public WebElement exportAsExcelOAIntakesAcceptedMenu;

    /**OA Intakes - Accepted menu Export as CSV*/
    @FindBy(xpath = "(//a[.='Export as CSV'])[2]")
    public WebElement exportAsCSVOAIntakesAcceptedMenu;

    /**OA Intakes - AssignedStatus = Assigned*/
    @FindBy(xpath = "//a[.='Status = Assigned']")
    public WebElement presetFilterAssigned;

    /**OA Intakes - Cancelled Status = Cancelled*/
    @FindBy(xpath = "//a[.='Status = Cancelled']")
    public WebElement presetFilterCancelled;

    /**OA Intakes - Assigned remove Subsequent conditions*/
    @FindBy(xpath = "(//a[@aria-label='All Press enter to remove all subsequent conditions'])[1]")
    public WebElement removeSubsequentConditionsAssigned;

    /**OA Intakes - Accepted remove Subsequent conditions*/
    @FindBy(xpath = "//*[@id='xad4221091bee8e10c5c40e1ce54bcb2e']/div/div/div/div[2]/div[1]/div/div/span[1]/a")
    public WebElement removeSubsequentConditionsAccepted;

    /**OA Intakes - Cancelled remove Subsequent conditions*/
    @FindBy(xpath = "//*[@id='x10fadd561bce4a10c5c40e1ce54bcbbd']/div/div/div/div[2]/div[1]/div/div/span[1]/a")
    public WebElement removeSubsequentConditionsCancelled;

    /**OA Intakes - Accepted Status = Accepted*/
    @FindBy(xpath = "//a[.='Status = Accepted']")
    public WebElement presetFilterAccepted;

    /**OA Intakes - Cancelled menu*/
    @FindBy(xpath = "(//span[@class='dropdown m-r-xs'])[3]")
    public WebElement sectionOAIntakesCancelledMenu;

    /**OA Intakes - Cancelled menu Export as PDF*/
    @FindBy(xpath = "//*[@id='x10fadd561bce4a10c5c40e1ce54bcbbd']/div/div/div/div[1]/span/ul/li[1]/a")
    public WebElement exportAsPDFOAIntakesCancelledMenu;

    /**OA Intakes - Cancelled menu Export as Excel*/
    @FindBy(xpath = "//*[@id='x10fadd561bce4a10c5c40e1ce54bcbbd']/div/div/div/div[1]/span/ul/li[2]/a")
    public WebElement exportAsExcelOAIntakesCancelledMenu;

    /**OA Intakes - Cancelled menu Export as CSV*/
    @FindBy(xpath = "//*[@id='x10fadd561bce4a10c5c40e1ce54bcbbd']/div/div/div/div[1]/span/ul/li[3]/a")
    public WebElement exportAsCSVOAIntakesCancelledMenu;
}
