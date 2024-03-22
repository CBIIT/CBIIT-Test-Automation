package AnalysisTools.cProSite.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CProSiteExplorePage {

    /* This is the locator for the submit button */
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    /* This is the locator for the reset button */
    @FindBy(xpath = "//button[@type='reset']")
    public WebElement resetButton;

    /* This is the locator for the summary text */
    @FindBy(xpath = "//button[contains(text(),'Summary')]")
    public WebElement summary;

    /* This is the locator for the summary view */
    @FindBy(xpath = "//button[text()='Summary View']")
    public WebElement summaryView;

    /* This is the locator for the dataset drop down */
    @FindBy(xpath = "//input[@id='react-select-3-input']")
    public WebElement datasetDropdown;

    /* This is the locator for the analysis drop down */
    @FindBy(xpath = "//input[@id='react-select-4-input']")
    public WebElement analysisDropdown;

    /* This is the locator for the corelated gene drop down */
    @FindBy(xpath = "//input[@id='react-select-6-input']")
    public WebElement corelatedgeneDropdown;

    /* This is the locator for the protein and mRNA check box */
    @FindBy(xpath = "//input[@id='correlationMRNA']")
    public WebElement proteinandmRNAcheckbox;

    /* This is the locator for the initial verifier */
    @FindBy(xpath = "//div[@class='m-2']")
    public WebElement intialverifer;

    /* This is the locator for the export button */
    @FindBy(xpath = "//a[contains(text(),'Export Data')]")
    public WebElement exportbutton;

    /* This is the locator for the tumor verifier */
    @FindBy(xpath = "//label[normalize-space()='Tumor Type']")
    public WebElement tumorverifer;

    /* This is the locator for the drop down gene */
    @FindBy(xpath = "//input[@id='react-select-5-input']")
    public WebElement dropdowngene;

    /* This is the locator for the cancel all tumor type button */
    @FindBy(xpath = "(//*[@viewBox='0 0 20 20'])[13]")
    public WebElement cancelAllTumorTypeButton;

    /* This is the locator for the tumor drop down */
    @FindBy(xpath = "//*[@id='react-select-2-input']")
    public WebElement tumorTypeDropDown;

    public CProSiteExplorePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}