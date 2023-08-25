package ServiceNow.ESR.Pages;

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
}
