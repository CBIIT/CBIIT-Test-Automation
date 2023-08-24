package AnalysisTools.scAtlas.Pages;

import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializer;

public class CohortsPage extends PageInitializer {

    public CohortsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}