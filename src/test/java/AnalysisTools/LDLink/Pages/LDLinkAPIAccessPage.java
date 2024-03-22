package AnalysisTools.LDLink.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class LDLinkAPIAccessPage extends CommonUtils {
    public LDLinkAPIAccessPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
