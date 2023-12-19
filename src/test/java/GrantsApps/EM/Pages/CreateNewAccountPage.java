package GrantsApps.EM.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

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

    /**
     * LIST OF ACTIVE I2E ROLES HEADERS
     */
    @FindBy(xpath = "/html/body/app-root/div/div/div[2]/main/app-create-account/div/app-role-information/div/div[2]/form/div/table/thead/tr/th")
    public List<WebElement> active_I2E_roles_headers;

    /**
     * CANCER ACTIVITY MONITORS (OPTIONAL) TITLE
     */
    @FindBy(xpath = "//body/app-root/div/div/div/main[@data-select2-id='main']/app-create-account/div/div/div/h5[1]")
    public WebElement cancer_activity_monitors_optional_title;

    /**
     * ADD ROLE BUTTON
     */
    @FindBy(xpath = "//span[@ngbtooltip='Unlock the account to make changes']//button")
    public WebElement add_role_button;

    /**
     * I2E ROLE DROP DOWN
     */
    @FindBy(xpath = "//ng-select2[@multiple='true']//span[@dir='ltr']//span//span[@role='combobox']")
    public WebElement i2e_role_drop_down;

    /**
     * I2E ROLE DROP DOWN VALUES
     */
    @FindBy(xpath = "//li//span[1]//b[1]")
    public List<WebElement> i2e_role_drop_down_values;

    /**
     * BUSINESS AREA ADMINISTRATIVE VALUE
     */
    @FindBy(xpath = "//span[@title='Administrative']")
    public WebElement administrative_business_area;

    /**
     * ROLE ORGANIZATION DROP DOWN
     */
    @FindBy(xpath = "//div[@role='document']//div//app-add-role-modal//form//div//div//div//app-nci-organization-dropdown//div//nz-tree-select//div//input[@autocomplete='off']")
    public WebElement role_organization_drop_down;

    /**
     * ROLE ORGANIZATION DROP DOWN 1ST  VALUE
     */
    @FindBy(xpath = "//nz-tree-node-title[@title='CENTER FOR BIOMEDICAL INFORMATICS & INFORMATION TECHNOLOGY (OD CBIIT)']//span")
    public WebElement role_organization_first_cbiit_value;

    /**
     * ROLE ORGANIZATION DROP DOWN ARROW
     */
    @FindBy(xpath = "//nz-tree-node[1]//nz-tree-node-switcher[1]")
    public WebElement role_organization_drop_down_arrow;

    /**
     * ROLE ORGANIZATION DROP DOWN SECOND VALUE
     */
    @FindBy(xpath = "//nz-tree-node-title[@title='OFFICE OF DATA SHARING (OD CBIIT ODS)']//span")
    public WebElement role_organization_second_cbiit_value;

    /**
     * ROLE ORGANIZATION DROP DOWN THIRD VALUE
     */
    @FindBy(xpath = "//nz-tree-node-title[@title='EVALUATION & STRATEGIC INITIATIVES BRANCH (OD CBIIT ESIB)']//span")
    public WebElement role_organization_third_cbiit_value;

    /**
     * ROLE ORGANIZATION DROP DOWN FOURTH VALUE
     */
    @FindBy(xpath = "//nz-tree-node-title[@title='CANCER INFORMATICS BRANCH (OD CBIIT CIB)']//span")
    public WebElement role_organization_fourth_cbiit_value;

    /**
     * ROLE ORGANIZATION DROP DOWN FIFTH VALUE
     */
    @FindBy(xpath = "//nz-tree-node-title[@title='BUSINESS OPERATIONS BRANCH (OD CBIIT BOB)']//span")
    public WebElement role_organization_fifth_cbiit_value;

    /**
     * ROLE ORGANIZATION DROP DOWN SIXTH VALUE
     */
    @FindBy(xpath = "//nz-tree-node-title[contains(@title,'BRANCH (OD CBIIT IIOB)')]//span")
    public WebElement role_organization_sixth_cbiit_value;

    /**
     * ADD ROLE BUTTON WITHIN ADD ROLE POP UP
     */
    @FindBy(xpath = "//span[@ngbtooltip='Complete all required fields']//button[@type='button']")
    public WebElement add_role_button_pop_up;

    /**
     * SAVE CHANGES BUTTON
     */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement save_changes_button;

    /**
     * SUCCESS MESSAGE
     */
    @FindBy(xpath = "//div[@role='alert']//span//p")
    public WebElement success_message;

    /**
     * RETURN TO MANAGE I2E USERS HYPERLINK
     */
    @FindBy(xpath = "//a[@routerlink='/search']")
    public WebElement return_to_manage_i2e_users_hyperlink;

    /**
     * CHANGE HISTORY TEXT
     */
    @FindBy(xpath = "//h6[contains(text(),'Change History')]")
    public WebElement changeHistoryText;

    /**
     * CANCEL BUTTON
     */
    @FindBy(xpath = "//button[contains(text(), 'Cancel')]")
    public WebElement cancelButton;
    public CreateNewAccountPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
