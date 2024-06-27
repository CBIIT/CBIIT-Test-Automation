package AnalysisTools.CervicalCP.Playwright.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class CCPRunScenarioPage extends CommonUtils {
    public CCPRunScenarioPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
