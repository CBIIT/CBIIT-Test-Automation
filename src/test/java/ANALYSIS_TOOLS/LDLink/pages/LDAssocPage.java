package ANALYSIS_TOOLS.LDLink.pages;

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

    /** This is the xpath to the Browse Input box to upload a file */
    @FindBy(xpath = "//input[@id='ldassoc-file-label']")
    public WebElement fileUploadInputBox;

    /** This is the xpath to the Variant drop down */
    @FindBy(xpath = "//button[@id='region-codes-menu1']")
    public WebElement variantDropDown;

    /** This is the xpath to the Variant drop down value */
    @FindBy(xpath = "(//a[contains(text(),'Variant')])[1]")
    public WebElement variantDropDownValue;

    /** This is the xpath to the Variant drop down */
    @FindBy(xpath = "(//input[@id='region-variant-index']")
    public WebElement rsNumberInputOnVariantDropDown;

    /** This is the xpath to the Population drop down */
    @FindBy(xpath = "(//button[contains(text(),'Select Population')])[1]")
    public WebElement populationDropDown;

    /** This is the xpath to the Population drop down value */
    @FindBy(xpath = "((//label[contains(text(),' (YRI) Yoruba in Ibadan, Nigera ')])[1]")
    public WebElement populationYriDropDownValue;

    public LDAssocPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}