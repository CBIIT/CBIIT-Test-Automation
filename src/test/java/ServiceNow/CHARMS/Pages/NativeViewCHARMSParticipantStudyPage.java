package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSParticipantStudyPage {

    /** Native View Participant Study Screener Info Button */
    @FindBy(xpath = "//span[normalize-space()='Screener']//parent::label//parent::div//parent::div//child::div[3]//child::span//child::button")
    public WebElement participantStudyScreenerInfoButton;

    public NativeViewCHARMSParticipantStudyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
