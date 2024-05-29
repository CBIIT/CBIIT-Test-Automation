package ServiceNow.CHARMS.FanconiSurvey.playwright.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class MelanomaLoginPage {

    /* Login To Study button */
    @FindBy(xpath = "//button[normalize-space()='Login to Study']")
    public WebElement loginToMelanomaButton;

    public MelanomaLoginPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

}
