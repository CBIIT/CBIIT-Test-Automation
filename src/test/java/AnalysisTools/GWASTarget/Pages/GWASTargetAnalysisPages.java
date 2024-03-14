package AnalysisTools.GWASTarget.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GWASTargetAnalysisPages extends CommonUtils {

    // This is the Submit button on GWAS Target's analysis tab
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement submitButton;

    // This is the Reset button on GWAS Target's analysis tab
    @FindBy(xpath = "//button[contains(text(),'Reset')]")
    public WebElement resetButton;

    // This is the Queue Job name text box on GWAS Target's analysis tab
    @FindBy(xpath = "//input[@id='jobName']")
    public WebElement jobNameTextBox;

    // This is the Queue email text box on GWAS Target's analysis tab
    @FindBy(xpath = "//input[@id='email']")
    public WebElement queueEmailTextBox;

    // This is the analysis was successfully submitted text on GWAS Target's analysis tab
    @FindBy(xpath = "//*[@id='root']/div/div/div/div/div[2]/div/div/div/div/p")
    public WebElement analysisSuccessfullySubmittedText;

    // This is the Gene Analysis tab under the GWAS Target's analysis tab
    @FindBy(xpath = "//a[contains(text(),'Gene Analysis')]")
    public WebElement geneAnalysisTab;

    // This is the Gene Set Analysis tab under the GWAS Target's analysis tab
    @FindBy(xpath = "//a[contains(text(),'Gene Set Analysis')]")
    public WebElement geneSetAnalysisTab;

    // This is the Gene Set Analysis tab under the GWAS Target's analysis tab
    @FindBy(xpath = "//p[contains(text(),'Your job is submitted and you will receive an email when the results are available.')]")
    public WebElement queueSuccessfulSubmissionPrompt;

    // This is the long running job queue under the GWAS Target's analysis tab
    @FindBy(xpath = "//input[@id='sendNotification']")
    public WebElement queueCheckbox;

    public GWASTargetAnalysisPages() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
