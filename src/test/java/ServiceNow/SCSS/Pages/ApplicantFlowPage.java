package ServiceNow.SCSS.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class ApplicantFlowPage extends CommonUtils {

    public ApplicantFlowPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
