package GrantsApps.EM.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ManageI2EUsersPage {

    /**
     * I2E Page Title
     */
    @FindBy(xpath = "//li//a[contains(text(),'Manage I2E Users')]")
    public WebElement i2EPageTitle;

    /**
     * Name Field
     */
    @FindBy(xpath = "//input[@id='name_typeahead']")
    public WebElement nameField;

    /**
     * Search Button
     */
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButtonI2ESearch;

    /**
     * Edit Button
     */
    @FindBy(xpath = "//div//button[@title='Modify Account']")
    public WebElement editButton;

    /**
     * add Role Button
     */
    @FindBy(xpath = "//button[normalize-space()='Add Role']")
    public WebElement addRoleBUTTON;

    /**
     * I2E Drop Down
     */
    @FindBy(xpath = "//select[@id='i2eRole-select']")
    public WebElement i2eDropDown;

    /**
     * I2E Role Drop down
     */
    @FindBy(xpath = "//ng-select2[@multiple='true']//span[@dir='ltr']//span//span[@role='combobox']")
    public WebElement I2ERoleDropD;

    /**
     * I2E Role Drop down values
     */
    @FindBy(xpath = "/html/body/span/span/span[2]/ul/li")
    public List<WebElement> I2ERoleDropDownValues;

    /**
     * I2E Role Drop down text box
     */
    @FindBy(xpath = "//body[1]/span[1]/span[1]/span[1]/input[1]")
    public WebElement I2ERoleDropDownTextBox;

    /**
     * Role Organization drop down
     */
    @FindBy(xpath = "//div[@role='document']//div//app-add-role-modal//form//div//div//div//app-nci-organization-dropdown//div//nz-tree-select//div//input[@autocomplete='off']")
    public WebElement roleOrganizationDropDown;

    /**
     * Add Role 2
     **/
    @FindBy(xpath = "//button[@id='roleCheckout-btn']")
    public WebElement addRoleButtonInsideModule;

    /**
     * I2E Page Title
     */
    @FindBy(xpath = "//h1[contains(text(),'Manage I2E Users')]")
    public WebElement i2ePageTitle;

    /**
     * I2E Home Hyperlink
     */
    @FindBy(xpath = "//a[@title='I2E Home']")
    public WebElement i2eHomeHyperlink;

    /**
     * I2E Help-drown options
     */
    @FindBy(xpath = "//*[@id='headerCollapse']/ul/li[2]/div/div/a")
    public List<WebElement> i2eHelpDropDownValues;

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE A USER
     * @param user
     * @return
     */
    public static WebElement dynamicUserTextLocator(String user) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[contains(text(),'" + user + "')]"));
    }

    public static WebElement dynamicFooterLinkLocator(String text) {
       return WebDriverUtils.webDriver.findElement(By.xpath("//a[text()='" + text + "']"));
    }

    public ManageI2EUsersPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
