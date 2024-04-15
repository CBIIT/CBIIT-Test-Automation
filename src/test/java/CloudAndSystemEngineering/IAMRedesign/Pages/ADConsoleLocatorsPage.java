package CloudAndSystemEngineering.IAMRedesign.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ADConsoleLocatorsPage {

    /* NIH AD Management Button */
    @FindBy(xpath = "//*[@id='content']/div[1]/a")
    public WebElement nihAdManagementButton;

    /* AD SearchBar */
    @FindBy(xpath = "//*[@id='qb']/div[2]/div[2]/input")
    public WebElement aDSearchBar;

    /* AD SearchButton */
    @FindBy(xpath = "//*[@id='qb']/div[2]/div[2]/div/span/button")
    public WebElement aDSearchButton;

    /* Active Directory Button */
    @FindBy(xpath = "//*[@id='ctl00_ctl00_MainWorkspaceHeader']/ol/li[1]/a")
    public WebElement activeDirectoryhButton;

    /* NIH Gov Button */
    @FindBy(xpath = "//a[@title='nih.gov']")
    public WebElement NIHGovButton;

    /* AD Button */
    @FindBy(xpath = "//a[@title='AD']")
    public WebElement ADButton;

    /* NIH Button */
    @FindBy(xpath = "//a[@title='NIH']")
    public WebElement NIHButton;

    /* NCI Button */
    @FindBy(xpath = "//div[@title='National Cancer Institute']//parent::td//parent::tr//child::td[2]//child::a")
    public WebElement NCIButton;

    /* Cloud One Console User Check Box */
    @FindBy(xpath = "//a[normalize-space()='NCI-Cloud-One-Console-Users']//parent::td//parent::tr//child::td[1]")
    public WebElement cloudOneConsoleUserCheckBox;

    /* Cloud One Console User Text */
    @FindBy(xpath = "//a[normalize-space()='NCI-Cloud-One-Console-Users']")
    public WebElement cloudOneConsoleUserText;

    /* Members Button */
    @FindBy(xpath = "//a[normalize-space()='Members']")
    public WebElement membersButton;

    /* Dev Read Only Checkbox */
    @FindBy(xpath = "(//a[normalize-space()='nci_aws_236370463730_dev_readonly'])//parent::td//parent::tr//child::td[1]")
    public WebElement devReadOnlyCheckbox;

    /* Read Only Dynamic Checkbox */
    public static WebElement readOnlyDynamicCheckbox(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//a[normalize-space()='nci_aws_" + value + "_dev_readonly'])//parent::td//parent::tr//child::td[1]"));
    }

    /* Console User Member Name */
    public static WebElement consoleUserMemberName(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='searchResult']/div[2]/table/tbody/tr[" + value + "]/td[2]/a"));
    }

    /* Read Only Dynamic Checkbox Typo*/
    public static WebElement readOnlyDynamicCheckboxTypo(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//a[normalize-space()='nci_aws_ " + value + "_dev_readonly'])//parent::td//parent::tr//child::td[1]"));
    }

    /* Idc Read Only Checkbox */
    @FindBy(xpath = "//a[normalize-space()='nci_aws_okta_idc_236370463730_app_readonly']//parent::td//parent::tr//child::td[1]")
    public WebElement idcReadOnlyCheckbox;

    /* Idc Read Only Dynamic Checkbox */
    public static WebElement idcReadOnlyDynamicCheckbox(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='nci_aws_okta_idc_" + value + "_app_readonly']//parent::td//parent::tr//child::td[1]"));
    }

    /* AWS Read Only Dynamic Checkbox */
    public static WebElement awsReadOnlyDynamicCheckbox(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='nci_aws_" + value + "_aws_readonly']//parent::td//parent::tr//child::td[1]"));
    }

    /* AWS Read Only Dynamic Checkbox Typo */
    public static WebElement awsReadOnlyDynamicCheckboxTypo(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='nci_aws_ " + value + "_aws_readonly']//parent::td//parent::tr//child::td[1]"));
    }

    /* NCI Power User Dynamic Checkbox */
    public static WebElement nciPowerDynamicCheckbox(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='nci_aws_" + value + "_nci_power_user']//parent::td//parent::tr//child::td[1]"));
    }

    /* NCI Power User Dynamic Checkbox Typo*/
    public static WebElement nciPowerDynamicCheckboxTypo(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='nci_aws_ " + value + "_nci_power_user']//parent::td//parent::tr//child::td[1]"));
    }

    /* IDC Power User Dynamic Checkbox */
    public static WebElement idcPowerDynamicCheckbox(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//a[normalize-space()='nci_aws_okta_idc_" + value + "_app_power_user']//parent::td//parent::tr//child::td[1]"));
    }

    /* All Console Users Names */
    @FindAll({@FindBy(xpath = "//*[@id='searchResult']/div[2]/table/tbody/tr/td[2]/a")})
    public List<WebElement> allConsoleUsersNamesText;

    /* Groups Tab */
    @FindAll({@FindBy(xpath = "//a[normalize-space()='Groups']")})
    public List<WebElement> groupsTab;

    /* User Names */
    @FindBy(xpath = "//*[@id='searchResult']/div[2]/table/tbody/tr[2]/td[2]/a")
    public WebElement userNameLocator;

    /* Type Text */
    @FindBy(xpath = "//th[@title='Type (objectClass)']")
    public WebElement typeText;

    /* User Names */
    @FindAll({@FindBy(xpath = "//*[@id='searchResult']/div[2]/table/tbody/tr/td[2]/a")})
    public List<WebElement> userNames;

    /* Groups Button */
    @FindBy(xpath = "//*[@id='searchResult']/div[2]/table/tbody/tr[9]/td[2]/a")
    public WebElement groupsButton;

    /* Groups Button */
    @FindBy(xpath = "//a[normalize-space()='Groups']")
    public WebElement groupsButtonTab;

    /* Cloud One Button */
    @FindBy(xpath = "//*[@id='searchResult']/div[2]/table/tbody/tr[2]/td[2]/a")
    public WebElement cloudOneButton;

    /* Cloud One Menu Tab */
    @FindBy(xpath = "//*[@id='ctl00_ctl00_MainWorkspaceHeader']/ol/li[7]/a")
    public WebElement cloudOneMenuTab;

    /** NATIVE VIEW LINK CONDITION**/
    @FindAll({@FindBy(xpath = "/html/body/section/div/p")})
    public List<WebElement> bannerLinkPresent;

    public ADConsoleLocatorsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
