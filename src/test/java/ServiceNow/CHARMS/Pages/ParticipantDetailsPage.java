package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class ParticipantDetailsPage {

    public ParticipantDetailsPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
