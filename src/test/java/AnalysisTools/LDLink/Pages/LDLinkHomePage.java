package AnalysisTools.LDLink.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class LDLinkHomePage extends CommonUtils {

    /* This is the text on the LDLink Home page */
    @FindBy(xpath = "//p[contains(text(),'LDlink is a suite of web-based applications')]")
    public WebElement ldLinkHomePageDescriptionText;

    /* This is the LDassoc module selector that opens the module */
    @FindBy(xpath = "(//h2[contains(text(),'LDassoc')])[1]")
    public WebElement ldAssocWindow;

    public LDLinkHomePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
