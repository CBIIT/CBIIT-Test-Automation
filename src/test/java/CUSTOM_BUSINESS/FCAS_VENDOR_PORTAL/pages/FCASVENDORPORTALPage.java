package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCASVENDORPORTALPage {

    /**Existing Contracts page header*/
    @FindBy(xpath = "//h1[.='Existing Contracts']")
    public WebElement existingContractsPageHeader;

    /**Accept option Welcome Screen*/
    @FindBy(xpath = "//span[.='Accept']")
    public WebElement acceptWelcomeScreen;

    /**All Contracts dropdown*/
    @FindBy(xpath = "(//span[.='All Contracts'])[1]")
    public WebElement allContractsDropdown;

    /**All Contracts option*/
    @FindBy(xpath = "(//span[.='All Contracts'])[3]")
    public WebElement allContractsOption;

    /**My Contracts option*/
    @FindBy(xpath = "//span[.='All Contracts']")
    public WebElement myContractsOption;

    /**Show closed Contracts option*/
    @FindBy(xpath = "//*[@id='mat-checkbox-1']/label/span[2]")
    public WebElement showClosedContractsOption;

    /**Text search field*/
    @FindBy(xpath = "//div//input[@placeholder='Search this page...']")
    public WebElement textSearchField;

    /**Existing Contracts Record Menu*/
    @FindBy(xpath = "//button[@aria-label='75N91021F00018 quick actions']")
    public WebElement existingContractsRecordMenu;

    /**Existing Contracts Menu Submit Invoice option*/
    @FindBy(xpath = "//button[@aria-label='submit invoice']")
    public WebElement submitInvoiceOption;

    /**Existing Contracts Menu Submit Deliverable option*/
    @FindBy(xpath = "//button[@aria-label='submit deliverable']")
    public WebElement submitDeliverableOption;

    /**Submit Invoice page header*/
    @FindBy(xpath = "//div[.='Submit Invoice']")
    public WebElement submitInvoiceHeader;

    /**Submit Deliverable page header*/
    @FindBy(xpath = "//div[.='Submit Deliverable']")
    public WebElement submitDeliverableHeader;

    /**Invoice Field Submit Invoice*/
    @FindBy(xpath = "//div//input[@ng-reflect-placeholder='Invoice # *']")
    public WebElement invoiceFieldSubmitInvoice;

    /**Invoice Date Field Submit Invoice*/
    @FindBy(xpath = "//*[@id='mat-input-2']")
    public WebElement invoiceDateFieldSubmitInvoice;

    /**Start Date Field Submit Invoice*/
    @FindBy(xpath = "//*[@id='mat-input-3']")
    public WebElement startDateFieldSubmitInvoice;

    /**End Date Field Submit Invoice*/
    @FindBy(xpath = "//*[@id='mat-input-4']")
    public WebElement endDateFieldSubmitInvoice;

    /**Amount Field Submit Invoice*/
    @FindBy(xpath = "//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c133-46 cdk-text-field-autofill-monitored']")
    public WebElement amountFieldSubmitInvoice;

    /**Submission Type Dropdown Submit Invoice*/
    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c133-47']")
    public WebElement submissionTypeDropdownSubmitInvoice;

    /**Primary Contact Dropdown Submit Invoice*/
    @FindBy(xpath = "(//div[@class='mat-chip-list-wrapper'])[1]")
    public WebElement primaryContactDropdownSubmitInvoice;

    /**Associates Dropdown Submit Invoice*/
    @FindBy(xpath = "(//div[@class='mat-chip-list-wrapper'])[2]")
    public WebElement associatesDropdownSubmitInvoice;

    /**Comments Field Submit Invoice*/
    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c133-50']")
    public WebElement commentsFieldSubmitInvoice;

    /**Choose File Button*/
    @FindBy(xpath = "//button//span[.='Choose File']")
    public WebElement chooseFileButton;

    /**CancelButton*/
    @FindBy(xpath = "//button//span[.='Cancel']")
    public WebElement cancelButton;

    /**Status Filter Dropdown Submit Deliverable*/
    @FindBy(xpath = "//div[@id='mat-select-value-9']")
    public WebElement statusFilterDropdownSubmitDeliverable;


    /**Scheduled Field Submit Deliverable*/
    @FindBy(xpath = "//div[@class='unscheduled-empty ng-star-inserted']")
    public WebElement scheduledFieldSubmitDeliverable;

    /**Unscheduled Field Submit Deliverable*/
    @FindBy(xpath = "//div[@class='unscheduled-empty ng-star-inserted']")
    public WebElement unscheduledFieldSubmitDeliverable;


    public FCASVENDORPORTALPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}