package ServiceNow.AwardNomination.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class AwardNominationPage {





    public AwardNominationPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
