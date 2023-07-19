package AnalysisTools.ezQTL.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class EZQTLDocumentationPage extends CommonUtils {

    /* This is the webelement for the Release History text */
    @FindBy(xpath = "//a[contains(text(),'Release History')]")
    public WebElement releaseHistoryLink;

    /* This is the webelement for the Input File Format of ezQTL text */
    @FindBy(xpath = "//a[contains(text(),'Input File Format of ezQTL')]")
    public WebElement inputFileFormatOfEzqtlLink;

    /* This is the webelement for the QTL Association Data text */
    @FindBy(xpath = "//a[contains(text(),'QTL Association Data')]")
    public WebElement qtlAssociationDataLink;

    /* This is the webelement for the Quantification Data text */
    @FindBy(xpath = "//a[contains(text(),'Quantification Data')]")
    public WebElement quantificationDataLink;

    /* This is the webelement for the Genotype Data text */
    @FindBy(xpath = "//a[contains(text(),'Genotype Data')]")
    public WebElement genotypeDataLink;

    /* This is the webelement for the LD Matrix Data text */
    @FindBy(xpath = "//a[contains(text(),'LD Matrix Data')]")
    public WebElement ldMatrixDataLink;

    /* This is the webelement for the GWAS Data text */
    @FindBy(xpath = "//a[contains(text(),'GWAS Data')]")
    public WebElement gwasDataLink;

    /* This is the webelement for the Public Data Source text */
    @FindBy(xpath = "(//a[contains(text(),'Public Data Source')])[2]")
    public WebElement publicDataSourceLink;

    /*
     * This is the webelement for the Relationship Between Input Datasets and Module
     * Functions text
     */
    @FindBy(xpath = "//a[contains(text(),'Relationship Between Input Datasets and Module Functions')]")
    public WebElement relationshipBetweenInputDatasetsAndModuleFunctionsLink;

    /* This is the webelement for the Colocalization Analysis text */
    @FindBy(xpath = "//a[contains(text(),'Colocalization Analysis')]")
    public WebElement colocalizationAnalysisLink;

    /*
     * This is the webelement for the Comparison Between ezQTL and Other Tools text
     */
    @FindBy(xpath = "//a[contains(text(),'Comparison Between ezQTL and Other Tools')]")
    public WebElement comparisonBetweenEzqtlAndOtherToolsLink;

    /* This is the webelement for the Frequently Asked Questions text */
    @FindBy(xpath = "//a[contains(text(),'Frequently Asked Questions')]")
    public WebElement frequentlyAskedQuestionsLink;

    public EZQTLDocumentationPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

}
