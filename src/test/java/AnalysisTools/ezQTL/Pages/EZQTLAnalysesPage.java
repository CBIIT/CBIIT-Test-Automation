package AnalysisTools.ezQTL.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class EZQTLAnalysesPage extends CommonUtils {

    /* This is the Association File Input box */
    @FindBy(xpath = "//input[@id='qtls-association-file']")
    public WebElement associationDataFileInput;

    /* This is the Gwas Data File Input box */
    @FindBy(xpath = "//input[@id='qtls-gwas-file']")
    public WebElement gwasDataFileInput;

    /* This is the add QTL Raw Data button */
    @FindBy(xpath = "(//button[contains(text(),'+ Add ')])[1]")
    public WebElement addQtlRawDataButton;

    /* This is the Quantification Data File Input box */
    @FindBy(xpath = "//input[@id='qtls-quantification-file']")
    public WebElement quantificationDataFileInput;

    /* This is the Genotype Data File Input box */
    @FindBy(xpath = "//input[@id='qtls-genotype-file']")
    public WebElement genotypeDataFileInput;

    /* This is the LD Data File Input box */
    @FindBy(xpath = "//input[@id='qtls-ld-file']")
    public WebElement ldDataFileInput;

    /* This is the text box for QTL Distance */
    @FindBy(xpath = "//input[@id='qtls-distance-input']")
    public WebElement qtlDistanceInput;

    /* This is the text box for SNP Number Input */
    @FindBy(xpath = "//input[@id='qtls-snp-input']")
    public WebElement snpNumberInput;

    /* This is the check box */
    @FindBy(xpath = "//input[@id='toggleQueue']")
    public WebElement submitJobtoQueueCheckbox;

    /* This is the text box for job name */
    @FindBy(xpath = "//input[@id='jobName']")
    public WebElement queueJobName;

    /* This is the text box for queue email */
    @FindBy(xpath = "//input[@id='email']")
    public WebElement queueEmail;

    /* This is the submit button */
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement submitButton;

    /* This is the submit button */
    @FindBy(xpath = "//p[contains(text(),'Your job was successfully submitted to the queue. You will recieve an email at kevin.matarodriguez@nih.gov with your results.')]")
    public WebElement queueSubmissionConfirmationMessage;

    /* This is the public data check box for Association (QTL) Data */
    @FindBy(xpath = "//input[@id='gwasSource']")
    public WebElement publicGwasSourceDataCheckBox;

    /* This is the public data check box for GWAS Data */
    @FindBy(xpath = "//input[@id='ldPublic']")
    public WebElement publicLdPublicDataCheckBox;

    /* This is the public data check box for LD Data */
    @FindBy(xpath = "//input[@id='qtlPublic']")
    public WebElement publicAssociationDataCheckBox;

    /* This is the Chromosome drop down */
    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[9]")
    public WebElement selectChromosomeDropDown;

    /* This is the chromosome 21 value on the Chromosome drop down */
    @FindBy(xpath = "//div[contains(text(),'21')]")
    public WebElement selectChromosomeDropDown21Value;

    /* This is the position text box */
    @FindBy(xpath = "//input[@id='select_position']")
    public WebElement positionTextBox;

    /* This is the Load Sample Data link on the Analysis page */
    @FindBy(xpath = "//a[@href='#/qtls/sample']")
    public WebElement loadSampleDataLink;

    /* This is the Locus QC tab on the Analysis page */
    @FindBy(xpath = "//a[@id='controlled-tab-example-tab-locus-qc']")
    public WebElement locusQcTab;

    /* This is the Locus QC tab on the Analysis page */
    @FindBy(xpath = "//a[@id='controlled-tab-example-tab-locus-ld']")
    public WebElement locusLdTab;

    /* This is the Locus QC tab on the Analysis page */
    @FindBy(xpath = "//a[@id='controlled-tab-example-tab-locus-alignment']")
    public WebElement locusAlignmentTab;

    /* This is the Locus QC tab on the Analysis page */
    @FindBy(xpath = "//a[@id='controlled-tab-example-tab-locus-colocalization']")
    public WebElement locusColocalizationTab;

    /* This is the Locus QC tab on the Analysis page */
    @FindBy(xpath = "//a[@id='controlled-tab-example-tab-locus-table']")
    public WebElement locusTableTab;

    /* This is the Locus QC tab on the Analysis page */
    @FindBy(xpath = "//a[@id='controlled-tab-example-tab-locus-quantification']")
    public WebElement locusQuantificationTab;

    /* This is the Locus QC tab on the Analysis page */
    @FindBy(xpath = "//a[@id='controlled-tab-example-tab-locus-download']")
    public WebElement locusDownloadTab;

    public EZQTLAnalysesPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

}
