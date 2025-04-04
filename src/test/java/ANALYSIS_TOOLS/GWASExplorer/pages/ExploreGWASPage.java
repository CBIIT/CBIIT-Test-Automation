package ANALYSIS_TOOLS.GWASExplorer.pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class ExploreGWASPage extends CommonUtils {

        public ExploreGWASPage() {
            PageFactory.initElements(WebDriverUtils.webDriver, this);
        }

        /*** Summary Results Tab WebElements ***/
        /** Explore GWAS tab **/
        @FindBy(xpath = "(//a[contains(text(),'Explore')])[1]")
        public WebElement lnkExploreGWAS;

        /** Anthropometric Measures Plus Mark Box **/
        @FindBy(xpath = "(//*[@role='button'])[2]")
        public WebElement btnPlusAnthropometricMeasures;

        /** BMI Plus Mark Box **/
        @FindBy(xpath = "//label[@title = 'BMI ']")
        public WebElement btnBMI;

        /** Height Plus Mark Box **/
        @FindBy(xpath = "(//*[@role='button'])[4]")
        public WebElement btnPlusHeight;

        /** Pairwise Plot Check Box **/
        @FindBy(xpath = "//*[@for='is-pairwise']")
        public WebElement chkPairWise;

        /** BMI at Baseline BQ check box for Summary Results **/
        @FindBy(xpath = "//label[@title='BMI at Baseline (BQ)']")
        public WebElement chkBMIBaseLineSummary;

        /** Height BQ Check Box for Summary Results **/
        @FindBy(xpath = "(//*[@id='root']/div[2]/div[1]/div/div[1]/div/div[2]/div[1]/div[2]/div/label/span/text())[2]")
        public WebElement chkHeight;

        /** Ancestry/Sex drop down Top */
        @FindBy(xpath = "(//*[@class='form-control'])[1]")
        public WebElement selAncestryTop;

        /** Ancestry/Sex drop down Bottom **/
        @FindBy(xpath = "(//*[@class='form-control'])[2]")
        public WebElement selAncestryBottom;

        /** Ancestry/Sex drop down **/
        @FindBy(xpath = "//*[@class='form-control']")
        public WebElement selAncestry;

        /** Submit button for Summary Results **/
        @FindBy(xpath = "//*[@type='submit']")
        public WebElement subSummaryResults;

        /** Manhattan Plot **/
        // @FindBy(xpath = "//*[@class='manhattan-plot gene-plot-collapsed']")
        // public WebElement dspManhattanPlot;

        /** Manhattan Plot **/
        @FindBy(xpath = "//div[@role='tabpanel' and contains(@class, 'active')]//canvas[contains(@style, 'block')]")
        public WebElement dspManhattanPlot;

        /** Summary Results tab **/
        @FindBy(xpath = "//*[@id=\"root\"]/div[2]/div[1]/div/div[1]/div/div[1]/a")
        public WebElement txtSummaryResults;

        /** Gene Plot **/
        @FindBy(xpath = "//div[@data-type='gene-plot']/canvas")
        public WebElement dspGenePlot;

        /**** Variant Lookup Tab WebElements ***/

        /** Variant Lookup Tab **/
        @FindBy(xpath = "//*[@href='#/gwas/lookup']")
        public WebElement lnkVariantLookUp;

        /** Variant Search Textbox **/
        @FindBy(xpath = "//*[@id='lookup-form-variant']")
        public WebElement actVariantTextBox;

        /** BMI at Baseline BQ check box Variant Lookup **/
        @FindBy(xpath = "(//*[@type='checkbox'])[7]")
        public WebElement chkBMIBaseLineVariantLookup;

        /** Ancestry dropdown for variant lookup **/
        @FindBy(xpath = "//*[@id='lookup-form-ancestry']")
        public WebElement selAncestryVariantLookup;

        /** Sex Dropdown for variant lookup **/
        @FindBy(xpath = "//*[@id='lookup-form-sex']")
        public WebElement selSexVariantLookup;

        /** Variant Lookup Table **/
        @FindBy(xpath = "//*[@class='react-bootstrap-table table-responsive']")
        public WebElement dspVariantLookupResults;

        /** Phenotype Correlations Tab WebElements **/

        /** Phenotype Correlations Tab **/
        @FindBy(xpath = "(//a[contains(text(),'Variant Lookup')])[1]")
        public WebElement lnkPhenotypeCorrelationsTab;

        /** BMI at Baseline BQ check box for Phenotype Correlation **/
        @FindBy(xpath = "(//*[@type='checkbox'])[7]")
        public WebElement chkBMIBaseLinePhenotypeCorrelations;

        /** Check height check box for Phenotype Correlation **/
        @FindBy(xpath = "//label[@title = 'Height ']")
        public WebElement chkHeightPhenotypeCorrelation;
}