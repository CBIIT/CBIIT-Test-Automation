package ServiceNow.OA_Intake.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class OAIntakePage {
    public OAIntakePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
