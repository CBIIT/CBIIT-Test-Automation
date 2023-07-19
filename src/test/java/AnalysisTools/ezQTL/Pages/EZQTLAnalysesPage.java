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

    /* This is the first Chromosome drop down */
    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[9]")
    public WebElement selectFirstChromosomeDropDown;

    /* This is the second Chromosome drop down */
    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[10]")
    public WebElement selectSecondChromosomeDropDown;

    /* This is the third Chromosome drop down */
    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[11]")
    public WebElement selectThirdChromosomeDropDown;

    /* This is the fourth Chromosome drop down */
    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[12]")
    public WebElement selectFourthChromosomeDropDown;

    /* This is the fifth Chromosome drop down */
    @FindBy(xpath = "(//div[@class=' css-1hwfws3'])[13]")
    public WebElement selectFifthChromosomeDropDown;

    /* This is the chromosome 21 value on the first Chromosome drop down */
    @FindBy(xpath = "(//div[contains(text(),'21')])[1]")
    public WebElement selectFirstChromosomeDropDown21Value;

    /* This is the chromosome 21 value on the second Chromosome drop down */
    @FindBy(xpath = "(//div[contains(text(),'21')])[2]")
    public WebElement selectSecondChromosomeDropDown21Value;

    /* This is the chromosome 21 value on the third Chromosome drop down */
    @FindBy(xpath = "(//div[contains(text(),'21')])[3]")
    public WebElement selectThirdChromosomeDropDown21Value;

    /* This is the chromosome 21 value on the fourth Chromosome drop down */
    @FindBy(xpath = "(//div[contains(text(),'21')])[4]")
    public WebElement selectFourthChromosomeDropDown21Value;

    /* This is the chromosome 21 value on the fifth Chromosome drop down */
    @FindBy(xpath = "(//div[contains(text(),'21')])[5]")
    public WebElement selectFifthChromosomeDropDown21Value;

    /* This is the first position text box */
    @FindBy(xpath = "(//input[@id='select_position'])[1]")
    public WebElement firstPositionTextBox;

    /* This is the second position text box */
    @FindBy(xpath = "(//input[@id='select_position'])[2]")
    public WebElement secondPositionTextBox;

    /* This is the third position text box */
    @FindBy(xpath = "(//input[@id='select_position'])[3]")
    public WebElement thirdPositionTextBox;

    /* This is the fouth position text box */
    @FindBy(xpath = "(//input[@id='select_position'])[4]")
    public WebElement fourthPositionTextBox;

    /* This is the fifth position text box */
    @FindBy(xpath = "(//input[@id='select_position'])[5]")
    public WebElement fifthPositionTextBox;

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

    /* This is the "+ Add Locus" button to allow to run more than one locus */
    @FindBy(xpath = "//button[contains(text(),'+ Add Locus')]")
    public WebElement addLocusButton;

    /*
     * This is the Download Results button on the Locus Download sub-tab on Analyses
     * tab
     */
    @FindBy(xpath = "//button[contains(text(),'Download Results')]")
    public WebElement downloadResultsButton;

    /*
     * This is the Download Results button on the Locus Download sub-tab on Analyses
     * tab
     */
    @FindBy(xpath = "//a[contains(text(),' Download Example ReadMe Information')]")
    public WebElement downloadExampleReadMeInformationButton;

    /* This is the LD Association Data drop down */
    @FindBy(xpath = "/html/body/div/main/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div/div[1]/div/div/div[1]")
    public WebElement ldAssociationDataDropDrop;

    public EZQTLAnalysesPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

}
