package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCASVENDORPORTALPage {

    /** Existing Contracts page header */
    @FindBy(xpath = "//h1[.='Existing Contracts']")
    public WebElement existingContractsPageHeader;

    /** Accept option Welcome Screen */
    @FindBy(xpath = "//span[.='Accept']")
    public WebElement acceptWelcomeScreen;

    /** All Contracts dropdown */
    @FindBy(xpath = "(//span[.='All Contracts'])[1]")
    public WebElement allContractsDropdown;

    /** All Contracts option */
    @FindBy(xpath = "(//span[.='All Contracts'])[3]")
    public WebElement allContractsOption;

    /** My Contracts option */
    @FindBy(xpath = "//span[.='All Contracts']")
    public WebElement myContractsOption;

    /** Show closed Contracts option */
    @FindBy(xpath = "//*[@id='mat-checkbox-1']/label/span[2]")
    public WebElement showClosedContractsOption;

    /** Text search field */
    @FindBy(xpath = "//div//input[@placeholder='Search this page...']")
    public WebElement textSearchField;

    /** Existing Contracts Record Menu */
    @FindBy(xpath = "//button[@aria-label='75N91021F00018 quick actions']")
    public WebElement existingContractsRecordMenu;

    /** Existing Contracts Menu Submit Invoice option */
    @FindBy(xpath = "//button[@aria-label='submit invoice']")
    public WebElement submitInvoiceOption;

    /** Existing Contracts Menu Submit Notification option */
    @FindBy(xpath = "//button[@aria-label='submit notification']")
    public WebElement submitNotificationOption;

    /** Existing Contracts Menu Submit Deliverable option */
    @FindBy(xpath = "//button[@aria-label='submit deliverable']")
    public WebElement submitDeliverableOption;

    /** Existing Contracts Menu Submit COA option */
    @FindBy(xpath = "//button[@aria-label='submit coa']")
    public WebElement submitCOAOption;

    /** Existing Contracts Menu Submit Work Order option */
    @FindBy(xpath = "//button[@aria-label='submit work order']")
    public WebElement submitWorkOrderOption;

    /** Submit Invoice page header */
    @FindBy(xpath = "//div[.='Submit Invoice']")
    public WebElement submitInvoiceHeader;

    /** Submit Deliverable page header */
    @FindBy(xpath = "//div[.='Submit Deliverable']")
    public WebElement submitDeliverableHeader;

    /** Submit COA page header */
    @FindBy(xpath = "//div[.='Submit COA']")
    public WebElement submitCOAHeader;

    /** Submit Work Order page header */
    @FindBy(xpath = "//div[.='Submit Work Order']")
    public WebElement submitWorkOrderHeader;

    /** Invoice Field Submit Invoice */
    @FindBy(xpath = "//div//input[@ng-reflect-placeholder='Invoice # *']")
    public WebElement invoiceFieldSubmitInvoice;

    /** Invoice Date Field Submit Invoice */
    @FindBy(xpath = "//*[@id='mat-input-2']")
    public WebElement invoiceDateFieldSubmitInvoice;

    /** Start Date Field Submit Invoice */
    @FindBy(xpath = "//*[@id='mat-input-3']")
    public WebElement startDateFieldSubmitInvoice;

    /** End Date Field Submit Invoice */
    @FindBy(xpath = "//*[@id='mat-input-4']")
    public WebElement endDateFieldSubmitInvoice;

    /** Amount Field Submit Invoice */
    @FindBy(xpath = "//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c133-46 cdk-text-field-autofill-monitored']")
    public WebElement amountFieldSubmitInvoice;

    /** Submission Type Dropdown Submit Invoice */
    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c133-47']")
    public WebElement submissionTypeDropdownSubmitInvoice;

    /** Primary Contact Dropdown Submit Invoice */
    @FindBy(xpath = "(//div[@class='mat-chip-list-wrapper'])[1]")
    public WebElement primaryContactDropdownSubmitInvoice;

    /** Associates Dropdown Submit Invoice */
    @FindBy(xpath = "(//div[@class='mat-chip-list-wrapper'])[2]")
    public WebElement associatesDropdownSubmitInvoice;

    /** Comments Field Submit Invoice */
    @FindBy(xpath = "//div//textarea[@ng-reflect-placeholder='Comments (optional)'")
    public WebElement commentsFieldSubmitInvoice;

    /** Choose File Button */
    @FindBy(xpath = "//button//span[.='Choose File']")
    public WebElement chooseFileButton;

    /** CancelButton */
    @FindBy(xpath = "//button//span[.='Cancel']")
    public WebElement cancelButton;

    /** Status Filter Dropdown Submit Deliverable */
    @FindBy(xpath = "//div[@id='mat-select-value-9']")
    public WebElement statusFilterDropdownSubmitDeliverable;


    /** Scheduled Field Submit Deliverable */
    @FindBy(xpath = "//div[@class='unscheduled-empty ng-star-inserted']")
    public WebElement scheduledFieldSubmitDeliverable;

    /** Unscheduled Field Submit Deliverable */
    @FindBy(xpath = "//div[@class='unscheduled-empty ng-star-inserted']")
    public WebElement unscheduledFieldSubmitDeliverable;

    /** COA Requirement Dropdown Submit COA */
    @FindBy(xpath = "//div[@class='unscheduled-empty ng-star-inserted']")
    public WebElement coaRequirementDropdownSubmitCOA;

    /** COA Field Submit COA */
    @FindBy(xpath = "//div//input[@ng-reflect-placeholder='COA # *']")
    public WebElement coaFieldSubmitCOA;

    /** Title Field Submit COA */
    @FindBy(xpath = "//div//input[@ng-reflect-placeholder='Title *']")
    public WebElement titleFieldSubmitCOA;

    /** Work Order Field Submit Work Order */
    @FindBy(xpath = "//div//input[@ng-reflect-placeholder='Work Order # *']")
    public WebElement workOrderFieldSubmitWorkOrder;

    /** Version Field Submit Work Order */
    @FindBy(xpath = "//div//input[@ng-reflect-name='VersionNumber']")
    public WebElement versionFieldSubmitWorkOrder;

    /** Package Type Dropdown Submit Work Order */
    @FindBy(xpath = "//div//hp-select[@aria-label='Package Type']")
    public WebElement packageTypeDropdownSubmitWorkOrder;

    /** Estimate Field Submit Work Order */
    @FindBy(xpath = "//div//input[@ng-reflect-placeholder='Estimate *']")
    public WebElement estimateFieldSubmitWorkOrder;

    /** Beneficiary Occupant Date Field Submit Work Order */
    @FindBy(xpath = "//*[@id='mat-input-51']")
    public WebElement beneficiaryOccupantDateFieldSubmitWorkOrder;

    /** Project ID Field Submit Work Order */
    @FindBy(xpath = "//input[@ng-reflect-placeholder='Project ID *']")
    public WebElement projectIDFieldSubmitWorkOrder;

    /** Directorate Customer Field Submit Work Order */
    @FindBy(xpath = "//input[@ng-reflect-placeholder='Directorate Customer (optional']")
    public WebElement directorateCustomerFieldSubmitWorkOrder;

    /** Directorate Field Submit Work Order */
    @FindBy(xpath = "//input[@ng-reflect-placeholder='Directorate (optional)']")
    public WebElement directorateFieldSubmitWorkOrder;

    /** Building Field Submit Work Order */
    @FindBy(xpath = "//input[@ng-reflect-placeholder='Building (optional)']")
    public WebElement buildingFieldSubmitWorkOrder;

    /** Room Field Submit Work Order */
    @FindBy(xpath = "//input[@ng-reflect-placeholder='Room (optional)']")
    public WebElement roomFieldSubmitWorkOrder;

    /** Submit Notification page header */
    @FindBy(xpath = "//div[.='Submit Notification']")
    public WebElement submitNotificationHeader;

    /** Notifications Dropdown Submit Notification */
    @FindBy(xpath = "//div[.='Submit Notification']")
    public WebElement notificationsDropdownSubmitNotification;

    /** Notifications Field Submit Notification */
    @FindBy(xpath = "//div//input[@ng-reflect-placeholder ='Notification # *']")
    public WebElement notificationFieldSubmitNotification;

    /** Existing Contracts page Title column */
    @FindBy(xpath = "(//div//div[.=' Title '])[1]")
    public WebElement existingContractsPageTitleColumn;

    /** Existing Contracts page PIID column */
    @FindBy(xpath = "(//div//div[.=' PIID '])[1]")
    public WebElement existingContractsPagePIIDColumn;

    /** Existing Contracts page Ref PIID column */
    @FindBy(xpath = "(//div//div[.=' Ref PIID '])[1]")
    public WebElement existingContractsPageRefPIIDColumn;

    /** Existing Contracts page Severability column */
    @FindBy(xpath = "(//div//div[.=' Severability '])[1]")
    public WebElement existingContractsPageSeverabilityColumn;

    /** Existing Contracts page Status column */
    @FindBy(xpath = "(//div//div[.=' Status '])[1]")
    public WebElement existingContractsPageStatusColumn;

    /** Existing Contracts page Est. Ultimate Completion column */
    @FindBy(xpath = "(//div//div[.=' Est. Ultimate Completion '])[1]")
    public WebElement existingContractsPageEstUltimateCompletionColumn;

    /** Existing Contracts tab */
    @FindBy(xpath = "(//div[@class='mat-list-item-content'])[1]")
    public WebElement existingContractsTab;

    /** Planning tab */
    @FindBy(xpath = "(//div[@class='mat-list-item-content'])[2]")
    public WebElement planningTab;

    /** Planning tab page header */
    @FindBy(xpath = "//h1[.='Planning']")
    public WebElement planningTabPageHeader;

    /** Solicitations tab */
    @FindBy(xpath = "(//div[@class='mat-list-item-content'])[3]")
    public WebElement solicitationsTab;

    /** Solicitations tab page header */
    @FindBy(xpath = "//h1[.='Solicitation']")
    public WebElement solicitationsTabPageHeader;

    /** Company Account tab */
    @FindBy(xpath = "(//div[@class='mat-list-item-content'])[4]")
    public WebElement companyAccountTab;

    /** Company Account tab page header */
    @FindBy(xpath = "//h1[.='LEIDOS BIOMEDICAL RESEARCH, INC.']")
    public WebElement companyAccountTabPageHeader;

    /** Leave Feedback Button */
    @FindBy(xpath = "//button//span[.='Leave Feedback']")
    public WebElement leaveFeedbackButton;

    /** Leave Feedback modal page header */
    @FindBy(xpath = "//h2[.='Leave Feedback']")
    public WebElement leaveFeedbackModalPageHeader;

    /** Yes radio button for question: The FCAS Vendor Portal application was user friendly */
    @FindBy(xpath = "//mat-radio-group[@ng-reflect-name='wasApplicationFriendly']//mat-radio-button[@ng-reflect-value='YES']")
    public WebElement yesRadioButtonWasApplicationFriendly;

    /** No radio button for  was easy to upload document files to the FCAS Vendor Portal */
    @FindBy(xpath = "//mat-radio-group[@ng-reflect-name='wasUploadEasy']//mat-radio-button[@ng-reflect-value='NO']")
    public WebElement noRadioButtonWasUploadEasy;

    /** No radio button for Is there additional information you think should be included in the FCAS Vendor Portal User Guide? */
    @FindBy(xpath = "//mat-radio-group[@ng-reflect-name='isGuideUseful']//mat-radio-button[@ng-reflect-value='NO']")
    public WebElement noRadioButtonIsGuideUseful;

    /** Yes radio button for Is the FCAS Vendor Portal organized in a user-friendly way? */
    @FindBy(xpath = "//mat-radio-group[@ng-reflect-name='isOrganized']//mat-radio-button[@ng-reflect-value='YES']")
    public WebElement yesRadioButtonIsOrganized;

    /** Text field for . Is there anything else you think we should know regarding the FCAS Vendor Portal Application? */
    @FindBy(xpath = "//input[@ng-reflect-name='additionalComments']")
    public WebElement textFieldAdditionalComments;

    /** Button Submit feedback */
    @FindBy(xpath = "//button//span[.=' Submit ']")
    public WebElement buttonSubmitFeedback;

    /** Planning page header */
    @FindBy(xpath = "//h1[.='Planning']")
    public WebElement planningPageHeader;

    /** All Statuses dropdown */
    @FindBy(xpath = "//div//span[.='All Statuses']")
    public WebElement allStatusesDropdown;

    /** Planning page Search field */
    @FindBy(xpath = "//input[@data-placeholder='Search this page...']")
    public WebElement planningPageSearchField;

    /** Planning page Title column */
    @FindBy(xpath = "(//div[.=' Title '])[1]")
    public WebElement planningPageTitleColumn;

    /** Planning page ID column */
    @FindBy(xpath = "(//div[.=' ID '])[1]")
    public WebElement planningPageIDColumn;

    /** Planning page Requested By column */
    @FindBy(xpath = "(//div[.=' Requested By '])[1]")
    public WebElement planningPageRequestedByColumn;

    /** Planning page Est. Award Date column */
    @FindBy(xpath = "(//div[.=' Est. Award Date '])[1]")
    public WebElement planningPageEstAwardDateColumn;

    /** Planning page Last Updated column */
    @FindBy(xpath = "(//div[.=' Last Updated '])[1]")
    public WebElement planningPageLastUpdatedColumn;

    /** Quick filter Proposal Requested */
    @FindBy(xpath = "//div[.='Proposal Requested']")
    public WebElement quickFilterProposalRequested;

    /** Quick filter Active */
    @FindBy(xpath = "//div[.='Active']")
    public WebElement quickFilterActive;

    /** Quick filter Submitted */
    @FindBy(xpath = "//div[.='Submitted']")
    public WebElement quickFilterSubmitted;

    /** Quick filter Rejected */
    @FindBy(xpath = "//div[.='Rejected']")
    public WebElement quickFilterRejected;

    /** Solicitation page header */
    @FindBy(xpath = "//h1[.='Solicitation']")
    public WebElement solicitationPageHeader;

    /** Solicitation page Title column */
    @FindBy(xpath = "(//div[.=' Title '])[1]")
    public WebElement solicitationPageTitleColumn;

    /** Solicitation column */
    @FindBy(xpath = "(//div[.=' Solicitation # '])[1]")
    public WebElement solicitationPageSolicitationColumn;

    /** Division column */
    @FindBy(xpath = "(//div[.=' Division '])[1]")
    public WebElement solicitationPageDivisionColumn;

    /** Amendments column */
    @FindBy(xpath = "(//div[.=' Amendments '])[1]")
    public WebElement solicitationPageAmendmentsColumn;

    /** Price Type column */
    @FindBy(xpath = "(//div[.=' Price Type '])[1]")
    public WebElement solicitationPagePriceTypeColumn;

    /** Q&A End Date column */
    @FindBy(xpath = "(//div[.=' Q&A End Date '])[1]")
    public WebElement solicitationPageQADateColumn;

    /**  Proposal Due Date column */
    @FindBy(xpath = "(//div[.=' Proposal Due Date '])[1]")
    public WebElement solicitationPageProposalDueDateColumn;

    /** Edit button Business Summary*/
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-button mat-button-base mat-primary ng-star-inserted']")
    public WebElement editButtonBusinessSummary;

    /** Edit Company Details modal header*/
    @FindBy(xpath = "//h2[.='Edit Company Details']")
    public WebElement editCompanyDetailsModalHeader;

    /** Name field Edit Company Details*/
    @FindBy(xpath = "//input[@ng-reflect-placeholder='Name *']")
    public WebElement nameFieldEditCompanyDetails;

    /** Email field Edit Company Details*/
    @FindBy(xpath = "//input[@ng-reflect-placeholder='Email *']")
    public WebElement emailFieldEditCompanyDetails;

    /** DUNS field Edit Company Details*/
    @FindBy(xpath = "//input[@ng-reflect-placeholder='DUNS']")
    public WebElement dUNSFieldEditCompanyDetails;

    /** Mailing address field Edit Company Details*/
    @FindBy(xpath = "//textarea[@ng-reflect-placeholder='Mailing Address *']")
    public WebElement mailingAddressFieldEditCompanyDetails;

    /** Users tab*/
    @FindBy(xpath = "//a[.='Users ']")
    public WebElement usersTab;

    /** Add User button*/
    @FindBy(xpath = "//span[.='Add User']")
    public WebElement addUserButton;

    /** Show Inactive Users option*/
    @FindBy(xpath = "//*[@id='mat-checkbox-2']/label/span[2]")
    public WebElement showInactiveUsersOption;

    /** Name column Users tab*/
    @FindBy(xpath = "(//div[.=' Name '])[1]")
    public WebElement nameColumnUsersTab;

    /** Job Title column Users tab*/
    @FindBy(xpath = "(//div[.=' Job Title '])[1]")
    public WebElement jobTitleColumnUsersTab;

    /** Email column Users tab*/
    @FindBy(xpath = "(//div[.=' Email '])[1]")
    public WebElement emailColumnUsersTab;

    /** Phone column Users tab*/
    @FindBy(xpath = "(//div[.=' Phone # '])[1]")
    public WebElement phoneColumnUsersTab;

    /** Access to View column Users tab*/
    @FindBy(xpath = "(//div[.=' Access to View '])[1]")
    public WebElement accessToViewColumnUsersTab;

    /** Admin column Users tab*/
    @FindBy(xpath = "(//div[.=' Admin '])[1]")
    public WebElement adminToViewColumnUsersTab;

    /** Account Active column Users tab*/
    @FindBy(xpath = "(//div[.=' Account Active '])[1]")
    public WebElement accountActiveColumnUsersTab;


    /** Last Name Add User modal*/
    @FindBy(xpath = "//input[@ng-reflect-name='LastName']")
    public WebElement firstNameAddUserModal;

    /** Last Name Add User modal*/
    @FindBy(xpath = "//input[@ng-reflect-name='FirstName']")
    public WebElement lastNameAddUserModal;

    /** Email Add User modal*/
    @FindBy(xpath = "//input[@ng-reflect-name='Email']")
    public WebElement emailAddUserModal;

    /** Job Title Add User modal*/
    @FindBy(xpath = "//input[@ng-reflect-name='JobTitle']")
    public WebElement jobTitleAddUserModal;

    /** Phone Number Add User modal*/
    @FindBy(xpath = "//input[@ng-reflect-name='PhoneNumber']")
    public WebElement phoneNumberAddUserModal;

    /** Resend Vendor Portal Button*/
    @FindBy(xpath = "//span[.=' Resend Vendor Portal Invite ']")
    public WebElement resendVendorPortalButton;

    /** Cancel Button Add User modal*/
    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelButtonAddUserModal;

    /** Grant access  to view Admin option*/
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    public WebElement adminOptionGrantAccess;

    /** Grant access  to view Business Representative option*/
    @FindBy(xpath = "//span[contains(text(),'Business Representative ')]")
    public WebElement businessRepresentativeOptionGrantAccess;

    /** Grant access  to view Invoices option*/
    @FindBy(xpath = "//span[contains(text(),'Invoices ')]")
    public WebElement invoicesOptionGrantAccess;

    /** Grant access  to view Deliverables option*/
    @FindBy(xpath = "//span[contains(text(),'Deliverables ')]")
    public WebElement deliverablesOptionGrantAccess;

    /** Grant access  to view COAs option*/
    @FindBy(xpath = "//span[contains(text(),'COAs ')]")
    public WebElement cOAsOptionGrantAccess;

    /** Grant access  to view Notifications option*/
    @FindBy(xpath = "//span[contains(text(),'Notifications ')]")
    public WebElement notificationsOptionGrantAccess;

    /** Grant access  to view Planning option*/
    @FindBy(xpath = "(//span[contains(text(),'Planning ')])[1]")
    public WebElement planningOptionGrantAccess;

    /** Grant access  to view Solicitation option*/
    @FindBy(xpath = "(//span[contains(text(),'Solicitation ')])[1]")
    public WebElement solicitationOptionGrantAccess;

    /** Grant access  to view Work Order option*/
    @FindBy(xpath = "//span[contains(text(),'Work Orders ')]")
    public WebElement workOrderOptionGrantAccess;

    /** Planning Coordinator option*/
    @FindBy(xpath = "//span[contains(text(),'Planning Coordinator ')]")
    public WebElement planningCoordinatorOption;

    /** Planning Coordinator description*/
    @FindBy(xpath = "//mat-hint[contains(text(),'Will be assigned to all Requirements shared with your company')]")
    public WebElement planningCoordinatorDescription;

    /** Solicitation Coordinator option*/
    @FindBy(xpath = "//span[contains(text(),'Solicitation Coordinator ')]")
    public WebElement solicitationCoordinatorOption;

    /** Solicitation Coordinator description*/
    @FindBy(xpath = "//mat-hint[contains(text(),'Will be assigned to all Solicitations shared with your company.')]")
    public WebElement solicitationCoordinatorDescription;

    public FCASVENDORPORTALPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}