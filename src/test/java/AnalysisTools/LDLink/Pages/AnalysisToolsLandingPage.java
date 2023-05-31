package AnalysisTools.LDLink.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class AnalysisToolsLandingPage extends CommonUtils {

    /* LDlink text on Analysis Tools Landing Page */
    @FindBy(xpath = "//a[contains(text(),'LDLink')]")
    public WebElement ldLinkTextOnLandingPage;

    /* LDLink description text on Analysis Tools Landing Page */
    @FindBy(xpath = "//div[contains(text(),'A suite of web-based applications designed to easily and efficiently explore linkage disequilibrium in population subgroups. All population genotype data originates from Phase 3 of the 1000 Genomes Project and variant RS numbers are indexed based on dbSNP build 151.')]")
    public WebElement ldLinkDescriptionTextOnLandingPage;

    public AnalysisToolsLandingPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

}
