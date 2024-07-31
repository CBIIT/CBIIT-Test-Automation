package GrantsApps.EM.selenium.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ManageI2EUsersPage {

    /**
     * I2E PAGE TITLE
     */
    @FindBy(xpath = "//li//a[contains(text(),'Manage I2E Users')]")
    public WebElement i2EPageTitle;

    /**
     * NAME FIELD
     */
    @FindBy(xpath = "//input[@id='name_typeahead']")
    public WebElement nameField;

    /**
     * SEARCH BUTTON
     */
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButtonI2ESearch;

    /**
     * I2E ROLE DROP DOWN
     */
    @FindBy(xpath = "//ng-select2[@multiple='true']//span[@dir='ltr']//span//span[@role='combobox']")
    public WebElement I2ERoleDropD;

    /**
     * I2E ROLE DROP DOWN TEXT BOX
     */
    @FindBy(xpath = "//body[1]/span[1]/span[1]/span[1]/input[1]")
    public WebElement I2ERoleDropDownTextBox;

    /**
     * ROLE ORGANIZATION DROP DOWN
     */
    @FindBy(xpath = "//div[@role='document']//div//app-add-role-modal//form//div//div//div//app-nci-organization-dropdown//div//nz-tree-select//div//input[@autocomplete='off']")
    public WebElement roleOrganizationDropDown;

    /**
     * ADD ROLE 2
     **/
    @FindBy(xpath = "//button[@id='roleCheckout-btn']")
    public WebElement addRoleButtonInsideModule;

    /**
     * I2E PAGE TITLE
     */
    @FindBy(xpath = "//h1[contains(text(),'Manage I2E Users')]")
    public WebElement i2ePageTitle;

    /**
     * I2E HOME HYPERLINK
     */
    @FindBy(xpath = "//a[@title='I2E Home']")
    public WebElement i2eHomeHyperlink;

    /**
     * I2E HELP-DROWN OPTIONS
     */
    @FindBy(xpath = "//*[@id='headerCollapse']/ul/li[2]/div/div/a")
    public List<WebElement> i2eHelpDropDownValues;

    /**
     * SHOW ADVANCED FILTERS LINK
     */
    @FindBy(xpath = "//body/app-root/div/div/div/main/app-search/div/div/div/a[1]")
    public WebElement showAdvancedFilters;

    /**
     * I2E ACCOUNT STATUS DROP DOWN
     */
    @FindBy(xpath = "//ng-select2[@multiple='false']//span//ul")
    public WebElement i2eAccountStatusDropDown;

    /**
     * I2E ACCOUNT STATUS VALUE
     */
    @FindBy(xpath = "/html/body/span/span/span/ul/li")
    public List<WebElement> i2eAccountStatusValues;

    /**
     * CREATE BUTTON
     */
    @FindBy(xpath = "//tbody/tr[1]/td[8]/app-action-cell-renderer[1]/div[1]/button[1]")
    public WebElement createButton;

    /**
     * USER'S FULL NAME
     */
    @FindBy(xpath = "/html/body/app-root/div/div/div[2]/main/app-search/div/div[2]/div/div/div/table/tbody/tr[1]/td[1]/app-user-details-renderer/lib-name-render/div/a")
    public WebElement fullNEDName;

    /**
     * MY DOC DISCREPANCIES
     */
    @FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'My DOC Discrepancies')]")
    public WebElement myDOCDiscrepancies;

    /**
     * IMPAC II PORTFOLIO ANALYSIS
     */
    @FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'IMPAC II Portfolio Analysis')]")
    public WebElement impac2PortfolioAnalysis;

    /**
     * I2E PORTFOLIO ANALYSIS
     */
    @FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'I2E Portfolio Analysis')]")
    public WebElement i2EPortfolioAnalysis;

    /**
     * ACCOUNTS AUDIT
     */
    @FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'Accounts Audit ')]")
    public WebElement accountsAudit;

    /**
     * NEAR
     */
    @FindBy(xpath = "//li[@class='list-group-item']//a[contains(text(),'NEAR')]")
    public WebElement near;

    /**
     * CHANGE USERDR
     */
    @FindBy(xpath = "//a[@id='change-user-dropdown']")
    public WebElement changeuserDr;

    /**
     * CHANGE USER FIELD
     */
    @FindBy(xpath = "(//span[@class='select2-selection select2-selection--single']//span[@class='select2-selection__rendered'])[1]")
    public WebElement changeuserField;

    /**
     * CHANGE USER FIELD INPUT
     */
    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@role='searchbox']")
    public WebElement changeuserFieldInput;

    /**
     * LI BIN OPTION
     */
    @FindBy(xpath = "//span[@class='select2-results']//li[contains(text(),'Li, Bin [OD CBIIT]')]")
    public WebElement liBinOption;

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE A USER
     * @param user
     * @return
     */
    public static WebElement dynamicUserTextLocator(String user) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[contains(text(),'" + user + "')]"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE LINKS
     * @param text
     * @return
     */
    public static WebElement dynamicLinkLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + text + "']"));
    }

    public ManageI2EUsersPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}