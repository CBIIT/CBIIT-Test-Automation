package AnalysisTools.LDLink.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class LDAssocPage extends CommonUtils {

    /**
     * This is the "Use example GWAS data" button used to add the example file to
     * input parameters
     */
    @FindBy(xpath = "//label[@class='switch']")
    public WebElement useExampleButton;

    /** This is the calculate button on the LDassoc module */
    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement submitOnLDassoc;

    /** This is the Association Text on the LDassoc module after results load */
    @FindBy(xpath = "//h3[contains(text(),'Association Results')]")
    public WebElement associationResultsText;

    public LDAssocPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

}
