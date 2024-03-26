package AnalysisTools.ACT24.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class ACT24ParticipantPortalPage extends CommonUtils {

    public ACT24ParticipantPortalPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
