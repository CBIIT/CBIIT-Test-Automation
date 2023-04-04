package AnalysisTools.cProSite.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CProSiteExplorePage {

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//button[text()='Summary']")
    public WebElement summary;

    @FindBy(xpath ="//input[@id='react-select-3-input']")
    public WebElement datasetDropdown;
    public CProSiteExplorePage(){

        PageFactory.initElements(WebDriverUtils.webDriver, this);

    }


}
