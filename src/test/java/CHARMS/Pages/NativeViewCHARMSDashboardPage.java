package CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public NativeViewCHARMSDashboardPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
