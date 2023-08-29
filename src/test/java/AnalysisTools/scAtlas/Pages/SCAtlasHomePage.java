package AnalysisTools.scAtlas.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SCAtlasHomePage extends CommonUtils {

    /* Home button on the navigation banner */
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement homeTab;

    /* This is the NCI-CLARITY window */
    @FindBy(xpath = "(//h3[contains(text(),'NCI-CLARITY')])[1]")
    public WebElement nciClarityWindow;

    /* This is the Multi-Regional window */
    @FindBy(xpath = "//h3[contains(text(),'Multi-Regional')]")
    public WebElement multiRegionalWindow;

    /* This is the Sequential NCI-CLARITY window */
    @FindBy(xpath = "//h3[contains(text(),'Sequential NCI-CLARITY')]")
    public WebElement sequentialNciClarityWindow;

    public SCAtlasHomePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
