package ANALYSIS_TOOLS.LDLink.pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class LDLinkAPIAccessPage extends CommonUtils {
    public LDLinkAPIAccessPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
