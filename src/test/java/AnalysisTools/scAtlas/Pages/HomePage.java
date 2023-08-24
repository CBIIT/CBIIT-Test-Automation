package AnalysisTools.scAtlas.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializer;

public class HomePage extends PageInitializer {

    /* Home button on the navigation banner */
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement homeTab;

    public HomePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
