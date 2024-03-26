package AnalysisTools.scAtlas.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SCAtlasCohortsPage extends CommonUtils {

    /* This is the Tumor Cell Community tab */
    @FindBy(xpath = "//button[contains(text(),'Tumor Cell Community')]")
    public WebElement tumorCellCommunityTab;

    /* This is the T-Cell tab */
    @FindBy(xpath = "(//button[contains(text(),'T-Cell')])[1]")
    public WebElement tCellTab;

    /* This is the Gene filter text box */
    @FindBy(xpath = "//input[@aria-label='Tumor Cell Gene']")
    public WebElement geneFilterTextBox;

    /* This is the AAAS results Cell Count */
    @FindBy(xpath = "(//button[contains(text(),'AAAS')])[1]")
    public WebElement aaasGeneResults;

    /* This is the AAAS results Cell Count */
    @FindBy(xpath = "//button[contains(text(),'RP11-1260E13.2')]")
    public WebElement rp11GeneResults;

    public SCAtlasCohortsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}