package GrantsApps.EM.selenium.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ModifyAccountPage {

    /**
     * ACTUAL INACTIVE I2E ROLES COLUMN HEADER VALUES
     */
    @FindBy(xpath = "(//thead)[3]/tr/th")
    public List<WebElement> actualInactiveI2ERolesColumnHeaderValues;

    /**
     * ACTUAL INACTIVE CANCER ACTIVITIES COLUMN HEADER VALUES
     */
    @FindBy(xpath = "(//thead)[4]/tr/th")
    public List<WebElement> actualInactiveCancerActivitiesValues;

    /**
     * ACTUAL CHANGE HISTORY COLUMN HEADER VALUES
     */
    @FindBy(xpath = "(//thead)[5]/tr/th")
    public List<WebElement> actualChangeHistoryValues;

    /**
     * CANCER ACTIVITY MONITORS (OPTIONAL) TOOLTIP
     */
    @FindBy(xpath = "//main[@data-select2-id='main']//app-create-account//div//div//div//h5//a//i")
    public WebElement cancerActivityMonitorsToolTip;

    /**
     * INACTIVE I2E ROLES TABLE COLUMN HEADERS
     */
    @FindBy(xpath = "(//tbody)[4]/tr/td[3]")
    public List<WebElement> inactiveI2ERolesTableColumnHeaders;

    /**
     * CHANGE HISTORY DATE VALUES
     */
    @FindBy(xpath = "(//tbody)[6]/tr/td[1]")
    public List<WebElement> changeHistoryDateValues;

    /**
     * Returns the WebElement of the first link with the specified text within its parent div.
     *
     * @param text the text to search for
     * @return the WebElement of the link
     */
    public static WebElement dynamicShowLinkLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//*[text()='" + text + "'])[1]//parent::div/a"));
    }

    public ModifyAccountPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}