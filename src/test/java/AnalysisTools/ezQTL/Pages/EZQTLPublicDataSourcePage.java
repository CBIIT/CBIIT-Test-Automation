package AnalysisTools.ezQTL.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class EZQTLPublicDataSourcePage extends CommonUtils {

    /* This is the webelement for the dataset column */
    @FindBy(xpath = "//th[contains(text(),'Dataset')]")
    public WebElement datasetColumnElement;

    /* This is the webelement for the Type column */
    @FindBy(xpath = "//th[contains(text(),'Type')]")
    public WebElement typeColumnElement;

    /* This is the webelement for the Population column */
    @FindBy(xpath = "//th[contains(text(),'Population')]")
    public WebElement populationColumnElement;

    /* This is the webelement for the Genome Build column */
    @FindBy(xpath = "//th[contains(text(),'Genome Build')]")
    public WebElement genomeBuildColumnElement;

    /* This is the webelement for the Journal column */
    @FindBy(xpath = "//th[contains(text(),'Journal')]")
    public WebElement journalColumnElement;

    /* This is the webelement for the Year column */
    @FindBy(xpath = "//th[contains(text(),'Year')]")
    public WebElement yearColumnElement;

    /* This is the webelement for the dataset column */
    @FindBy(xpath = "//th[contains(text(),'Title')]")
    public WebElement titleColumnElement;

    /* This is the webelement for the dataset column */
    @FindBy(xpath = "//th[contains(text(),'Study Website')]")
    public WebElement studyWebsiteColumnElement;

    public EZQTLPublicDataSourcePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

}
