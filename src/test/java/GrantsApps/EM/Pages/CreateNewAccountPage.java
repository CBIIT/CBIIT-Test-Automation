package GrantsApps.EM.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPage {

    /**
     * Create New Account page title
     */
    @FindBy(xpath = "//main[@data-select2-id='main']//app-create-account//div//div//div//h3")
    public WebElement createNewAccountTitle;

    /**
     * FULL NED NAME
     */
    @FindBy(xpath = "//a[@ngbtooltip='Click to email']")
    public WebElement full_NED_name;

    /**
     * NED NAME TOOLTIP LINK
     */
    @FindBy(xpath = "//label[@for='fundable-score-range']//a")
    public WebElement tooltipNEDnameLink;

    /**
     * NED NAME TOOLTIP TEXT
     */
    @FindBy(xpath = "//*[contains(text(),'Legal Name is always')]")
    public WebElement tooltipNEDnameText;

    /**
     * NIH NETWORK ID
     */
    @FindBy(xpath = "//div//div//div//div//div//div[2]//div[1]//p[1]")
    public WebElement nihNetworkID;

    /**
     * E-MAIL
     */
    @FindBy(xpath = "//a[@ngbtooltip='Click to e-mail']")
    public WebElement email;

    /**
     * NED ORGANISATION
     */
    @FindBy(xpath = "//div[4]//div[1]//p[1]")
    public WebElement ned_organisation;

    /**
     * SAC CODE
     */
    @FindBy(xpath = "//div[5]//div[1]//p[1]")
    public WebElement sac_code;

    /**
     * NED CLASSIFICATION
     */
    @FindBy(xpath = "//div[6]//div[1]//p[1]")
    public WebElement ned_classification;

    /**
     * ACCOUNT STATUS
     */
    @FindBy(xpath = "//label[@for='apps-not-considered']//span")
    public WebElement account_status;

    /**
     * ACTIVE I2E ROLES TABLE TITLE
     */
    @FindBy(xpath = "//main[@data-select2-id='main']//app-create-account//div//app-role-information//div//div//div//h5")
    public WebElement active_I2E_roles_table_title;

    /**
     * LIST OF I2E ROLES LINK
     */
    @FindBy(xpath = "//a[@taget='_blank']")
    public WebElement list_of_I2E_roles_link;

    public CreateNewAccountPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
