package AnalysisTools.GWASTarget.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GWASTargetHomePages extends CommonUtils {

    // This is the home page tab on GWAS Target
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement homePageTab;

    // This is the Analysis page on GWAS Target
    @FindBy (xpath = "(//a[contains(text(),'Analysis')])[1]")
    public WebElement analysisPageTab;

    // This is the About page on GWAS Target
    @FindBy (xpath = "//a[contains(text(),'About')]")
    public WebElement aboutPageTab;

    // This is the first passage text on GWAS Target
    @FindBy (xpath = "//p[contains(text(),'GWAS Target is a web tool that seamlessly takes GWAS summary statistics and incorporates a complex multidimensional approach to prioritize target genes involving the latest epigenome mapping data across different tissues and epigenomic datasets.')]")
    public WebElement firstPassageText;

    // This is the second passage text on GWAS Target
    @FindBy (xpath = "//*[@id='root']/div/div[2]/div/div/div/p[2]")
    public WebElement secondPassageText;

    // This is the third passage text on GWAS Target
    @FindBy (xpath = "//p[contains(text(),'Questions or comments? Contact Charles Breeze via ')]")
    public WebElement thirdPassageText;

    public GWASTargetHomePages() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
