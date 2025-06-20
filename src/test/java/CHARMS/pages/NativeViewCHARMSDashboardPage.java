package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;

public class NativeViewCHARMSDashboardPage {

    /**
     * Native View Dashboard Button
     */
    @FindBy(xpath = "(//div[@class='sn-widget-list-title'][normalize-space()='Dashboard'])[3]")
    public WebElement nativeViewCharmsDashboardButton;

    /**
     * Native View Dashboard Button
     */
    @FindBy(xpath = "//div[contains(text(),'All Participant Details')]//parent::div//parent::a")
    public WebElement nativeViewAllParticipantsDetailsButton;

    /**
     * Native View Ras Study Dropdown Menu
     */
    @FindBy(xpath = "//*[@id='navbar']/div[1]/span")
    public WebElement rasStudyMenu;

    /**
     * Native View Ras Study Dropdown Menu
     */
    @FindBy(xpath = "//a[@title='Participant Details Context Menu']")
    public WebElement rasStudyParticipantsDetailsMenu;

    /**
     * Native View Ras Study New Screener Received Dynamic Locator
     */
    public static WebElement nativeViewnewScreenerReceivedLocator(String value) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//td[normalize-space()='" + value + "']//parent::tr//child::td[2]//child::a"));
    }

    /**
     * Native View Ras Study Open Record Button
     */
    @FindBy(xpath = "//a[normalize-space()='Open Record']")
    public WebElement rasStudyOpenRecordButton;

    /**
     * Native View Add New Participant Button
     */
    @FindBy(xpath = "//button[normalize-space()='Add New Participant']")
    public WebElement nativeViewAddNewParticipantButton;

    /**
     * Locates a web element representing a search input field for a specific column
     * in a native view table based on the provided column name.
     *
     * @param columnName the name of the column to locate the search input field for
     * @return the WebElement corresponding to the search input field of the specified column
     */
    public WebElement nativeViewSearchColumnLocator(String columnName) {
        return locateByXpath("//input[@aria-label='Search column: " + columnName.toLowerCase() +"']");
    }

    public NativeViewCHARMSDashboardPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
