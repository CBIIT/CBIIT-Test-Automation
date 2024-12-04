package ITSM.ESR.selenium.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ESRTicketCreationPage {

    public ESRTicketCreationPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** Phone number text box */
    @FindBy(xpath = "//input[@name='IO:e5f0a47c6f25f500250e6bbeae3ee43c']")
    public WebElement phoneNumberTextBox;

    /** Project name text box */
    @FindBy(xpath = "//input[@name='IO:e6c63f921be92110f360a681f54bcbcb']")
    public WebElement projectNameTextBoxESR;

    /** IT Service Dropdown menu */
    @FindBy(xpath = "//select[@name='IO:e67377de1ba92110f360a681f54bcbc3']")
    public WebElement itServiceAreaDropdownESR;

    /** Project Description text box for ESR creation */
    @FindBy(xpath = "//textarea[@name='IO:bad6bb921be92110f360a681f54bcb88']")
    public WebElement projectDescriptionESR;

    /** Business Justification checkbox list for ESR */
    @FindBy(xpath = "//label[@for='ni.IO:c5a0a6031b02e110f360a681f54bcbaa']")
    public WebElement businessJustificationCheckBox;

    /** Federal Lead text box */
    @FindBy(xpath = "//input[@name='sys_display.IO:353504b61be56110f360a681f54bcbd5']")
    public WebElement federalLeadTextBox;

    /** Project Lead text box */
    @FindBy(xpath = "//input[@name='sys_display.IO:8a7a20b61b696110f360a681f54bcbfd']")
    public WebElement projectLeadTextBox;

    /** Business Owner text box */
    @FindBy(xpath = "//input[@name='sys_display.IO:22cb24f61b696110f360a681f54bcb57']")
    public WebElement businessOwnerTextBox;

    /** Submit button for ESR creation */
    @FindBy(xpath = "//button[@aria-label='Submit']")
    public WebElement submitButtonForESR;

    /** New ESR Ticket Created in RITM view */
    @FindBy(xpath = "//tbody/tr/td/a[1]")
    public WebElement linkToNewESRTicket;

    /** Notes Tab in ESR ticket */
    @FindBy(xpath = "//span[@class='tabs2_tab default-focus-outline']")
    public WebElement notesTabESRTicket;

    /** Catalog task item in ESR */
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[1]/span[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
    public WebElement catalogTaskItem;

    /** Catalog task title text */
    @FindBy(xpath = "//a[@title='Catalog Tasks Context Menu']")
    public WebElement catalogTaskTitle;

    /** Approval dropdown in catalog task */
    @FindBy(xpath = "//select[@aria-required='true']")
    public WebElement approvalDropdownCatalogTask;

    /** DOC selection box */
    @FindBy(xpath = "//input[@class='questionsetreference form-control element_reference_input'][1]")
    public WebElement docSelectionBox;

    /** Check box for business justification */
    @FindBy(xpath= "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]")
    public WebElement getBusinessJustificationCheckBox;

    /** Dropdown for overall priority */
    @FindBy(xpath= "//tbody/tr[12]/td[1]/div[1]/div[1]/div[1]/div[2]/select[1]")
    public WebElement overallPriorityDropdown;

    /** Planned start date button */
    @FindBy(xpath = "//body[1]/div[2]/form[1]/span[2]/span[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/span[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/a[1]")
    public WebElement startDateButton;

    /** Planned End Date Button */
    @FindBy(xpath = "//body[1]/div[2]/form[1]/span[2]/span[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[1]/span[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/a[1]")
    public WebElement endDateButton;

    /** Select today's date button */
    @FindBy(xpath = "//td[@aria-label='Go to Today']")
    public WebElement selectPresentDate;

    /** Scope text box */
    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/div[1]/div[1]/div[2]/textarea[1]")
    public WebElement scopeTextBox;

    /** Definition of done text box */
    @FindBy(xpath = "/html/body/div[2]/form/span[2]/span/div/div/div/div/table/tbody/tr[2]/td/div[2]/div/table/tbody/tr[6]/td/span/div[2]/table/tbody/tr[3]/td/div/div/div/div[2]/textarea")
    public WebElement definitionDoneTextBox;

    /** Risks text box */
    @FindBy(xpath = "/html/body/div[2]/form/span[2]/span/div/div/div/div/table/tbody/tr[2]/td/div[2]/div/table/tbody/tr[6]/td/span/div[2]/table/tbody/tr[4]/td/div/div/div/div[2]/textarea")
    public WebElement risksTextBox;

    /** Update Button to submit catalog task */
    @FindBy(xpath = "//nav[@role='navigation']//div//div//span//span//span//button[@value='sysverb_update']")
    public WebElement updateButton;

    /** Approval Tab to show list of approvers */
    @FindBy(xpath = "//body/div[@data-position-below-header='true']/div[@aria-label='Section Tab Lists']/span[2]/span[1]/span[2]")
    public WebElement approverTab;

    /** Federal Lead approver under the approver tab */
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/span[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")
    public WebElement federalLeadApprovalTask;

    /** State field in approval catalog task */
    @FindBy(xpath = "//select[@aria-required='false']")
    public WebElement stateFieldApprovalTask;

    /** Additional comments section on catalog task for approvers */
    @FindBy(xpath = "//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']")
    public WebElement additionalCommentField;

    /** Additional comments section on requested item */
    @FindBy(xpath = "//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Additional comments (Customer visible)']")
    public WebElement additionalCommentFieldInRequestedItem;

    /** Post button for additional comment on Requested Item */
    @FindBy(xpath = "//button[@ng-keypress='submitCheck($event)']")
    public WebElement additionalCommentPostButton;
}
