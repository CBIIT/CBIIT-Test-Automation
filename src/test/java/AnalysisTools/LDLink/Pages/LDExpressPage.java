package AnalysisTools.LDLink.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class LDExpressPage extends CommonUtils {

    /* This is the genome build button to display the drop down */
    @FindBy(xpath = "//button[@id='region-codes-men']")
    public WebElement genomeBuildSelector;

    /*
     * This is the GrCh38 High Coverage value from the Genome Build drop down on the
     * ldExpress module
     */
    @FindBy(xpath = "(//ul[@aria-labelledby='region-codes-men']/li)[3]")
    public WebElement grCh38HighCoverageValueFromDropDown;

    /* This is the input text box for RS numbers on the ldExpress Module */
    @FindBy(xpath = "//textarea[@id='ldexpress-file-snp-numbers']")
    public WebElement rsNumberInputTextBox;

    /* This is the Select Population drop down */
    @FindBy(xpath = "(//button[contains(text(),'Select Population')])[2]")
    public WebElement selectPopulationDropDown;

    /*
     * This is the (CHB) Han Chinese in Bejing, China selection from the population
     * dropdown
     */
    @FindBy(xpath = "(//label[contains(text(),' (CHB)  Han Chinese in Bejing, China ')])[2]")
    public WebElement chbOptionOnPopulationDropDown;

    /* This is the Select Tissue drop down */
    @FindBy(xpath = "//button[contains(text(),'Select Tissue')]")
    public WebElement selectTissueDropDown;

    /* This is the Brain-Amygdala option on the Select Tissue drop down */
    @FindBy(xpath = "//label[contains(text(),' Brain - Amygdala')]")
    public WebElement brainAmygdalaOptionOnTissueDropDown;

    /* This is the submit button on the ldExpress module */
    @FindBy(xpath = "//input[@id='ldexpress']")
    public WebElement submitOnLdExpress;

    /*
     * This is the Variants with Warnings link displayed after results are
     * calculated
     */
    @FindBy(xpath = "//a[@id='ldexpress-query-warnings-button']")
    public WebElement variantsWithWarningsLink;

    /*
     * This is the first warning message on the details column on the ldExpress
     * module
     */
    @FindBy(xpath = "//td[contains(text(),'No entries in GTEx are identified using the LDexpress search criteria.')]")
    public WebElement warning1Text;

    /*
     * This is the second warning message on the details column on the ldExpress
     * module
     */
    @FindBy(xpath = "//td[contains(text(),'Variant is not in 1000G reference panel.')]")
    public WebElement warning2Text;

    public LDExpressPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}