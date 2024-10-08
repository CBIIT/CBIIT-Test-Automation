package AnalysisTools.GWASExplorer.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GwasExplorerHomePage extends CommonUtils {

    /* This is the GWAS Explorer main text */
    @FindBy(xpath = "(//b[contains(text(),'GWAS Explorer')])[1]")
    public WebElement gwasExplorerText;

    /* This is the text under the Credit column */
    @FindBy(xpath = "//p[contains(text(),'Mitchell Machiela, Neal Freedman, Wen-Yi Huang, Wendy Wong, Sonja Berndt, Mustapha Abubakar, Jonas De Almeida, Jada Hislop, Erikka Loftfield, Jennifer Loukissas, Joshua Sampson, Montse Garcia-Closas, Stephen Chanock and colleagues at the')]")
    public WebElement creditText;

    /**** API ACCESS TAB ELEMENTS ***/

    /** API Access Tab **/
    @FindBy(xpath = "//*[@id='root']/div[1]/div[1]/div/div[5]/a")
    public WebElement lnkAPIAcess;

    /** API Access Page Heading **/
    @FindBy(xpath = "//h3[contains(text(), 'API Access')]")
    public WebElement txtAPIAccessHeading;

    /*** ABOUT TAB ELEMENTS ***/

    /** About Page Tab **/
    @FindBy(xpath = "/html/body/main/div[1]/div[1]/div/div[3]/a")
    public WebElement lnkAbout;

    /** About Page Github Link **/
    @FindBy(xpath = "//a[contains(text(),'GitHub')]")
    public WebElement lnkGitHub;

    /*** HOME TAB ELEMENTS ***/

    /** Home Page Github Link **/
    @FindBy(linkText = "source code")
    public WebElement lnkSourceCode;

    /** TABS **/

    /** About Tabs */
    @FindBy(xpath = "//*[@id='root']/div[1]/div[1]/div/div[6]/a")
    public WebElement aboutTab;

    /** Explore GWAS Results **/
    @FindBy(xpath = "//*[@id='root']/div[1]/div[1]/div/div[2]/a")
    public WebElement lnkExploreGwasResults;
    public GwasExplorerHomePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}