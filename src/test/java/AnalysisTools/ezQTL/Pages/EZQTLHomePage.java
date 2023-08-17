package AnalysisTools.ezQTL.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class EZQTLHomePage extends CommonUtils {

    /* This is the Home tab button */
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement homeTabButton;

    /* This is the Analyses tab button */
    @FindBy(xpath = "//a[contains(text(),'Analyses')]")
    public WebElement analysesTabButton;

    /* This is the Analyses tab button */
    @FindBy(xpath = "//a[contains(text(),'Public Data Source')]")
    public WebElement publicDataSourceTabButton;

    /* This is the Analyses tab button */
    @FindBy(xpath = "//a[contains(text(),'Documentation')]")
    public WebElement documentationTabButton;

    /* This is the webelement for citation text */
    @FindBy(xpath = "//p[contains(text(),'ezQTL, a web-based tool for integrative visualization of Quantitative Trait Loci for GWAS annotation. (')]")
    public WebElement citationTextElement;

    /* This is the webelement for Dr. Tongwu Zhang */
    @FindBy(xpath = "//a[contains(text(),'Tongwu Zhang')]")
    public WebElement tongwuZhangNameElement;

    /* This is the webelement for Dr. Jiyeon Choi */
    @FindBy(xpath = "//a[contains(text(),'Jiyeon Choi')]")
    public WebElement jiyeonChoiNameElement;

    /* This is the webelement for Dr. Kevin Brown */
    @FindBy(xpath = "//a[contains(text(),'Kevin Brown')]")
    public WebElement kevinBrownNameElement;

    /* This is the webelement for the DCEG Footer on ezQTL */
    @FindBy(xpath = "//div[contains(text(),'Division of Cancer Epidemiology and Genetics')]")
    public WebElement dcegFooterElement;

    public EZQTLHomePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}