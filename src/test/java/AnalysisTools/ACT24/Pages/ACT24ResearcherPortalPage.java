package AnalysisTools.ACT24.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class ACT24ResearcherPortalPage extends CommonUtils {
    public ACT24ResearcherPortalPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
