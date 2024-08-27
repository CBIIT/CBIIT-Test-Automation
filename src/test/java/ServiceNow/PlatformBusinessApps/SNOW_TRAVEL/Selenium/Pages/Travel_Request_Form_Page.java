package ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.Selenium.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Travel_Request_Form_Page {

    /** Travel Planning System Page Header Text */
    @FindBy(xpath = "//h1[normalize-space()='Travel Planning System']")
    public WebElement travelPlanningSystemPageHeaderText;

    public Travel_Request_Form_Page() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}