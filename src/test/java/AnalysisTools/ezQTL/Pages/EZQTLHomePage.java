package AnalysisTools.ezQTL.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class EZQTLHomePage extends CommonUtils {

    /* This is the Analyses tab button */
    @FindBy(xpath = "//a[contains(text(),'Analyses')]")
    public WebElement analysesTabButton;

    public EZQTLHomePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
