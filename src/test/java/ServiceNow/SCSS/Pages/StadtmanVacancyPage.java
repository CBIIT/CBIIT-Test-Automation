package ServiceNow.SCSS.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class StadtmanVacancyPage extends CommonUtils {

    public StadtmanVacancyPage() {
        PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
    }
}
