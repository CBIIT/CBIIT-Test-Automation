package AnalysisTools.cProSite.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CProSiteExplorePage {

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//button[@type='reset']")
    public WebElement resetButton;
    @FindBy(xpath = "//button[text()='Summary']")
    public WebElement summary;

    @FindBy(xpath ="//input[@id='react-select-3-input']")
    public WebElement datasetDropdown;

    @FindBy(xpath ="//input[@id='react-select-4-input']")
    public WebElement analysisDropdown;
    @FindBy(xpath ="//input[@id='react-select-6-input']")
    public WebElement corelatedgeneDropdown;

    @FindBy(xpath ="//input[@id='correlationMRNA']")
    public WebElement proteinandmRNAcheckbox;

    @FindBy(xpath ="//div[@class='m-2']")
    public WebElement intialverifer;

    @FindBy(xpath ="//a[contains(text(),'Export Data')]")
    public WebElement exportbutton;
    @FindBy(xpath ="//label[normalize-space()='Tumor Type']")
    public WebElement tumorverifer;

    @FindBy(xpath ="//input[@id='react-select-5-input']")
    public WebElement dropdowngene;

    public CProSiteExplorePage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);

    }


}
