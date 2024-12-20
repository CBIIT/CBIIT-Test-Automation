package ANALYSIS_TOOLS.GWASExplorer.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowsePhenotypesPage {

    /** Browse Phenotype Tab **/
    @FindBy(xpath = "/html/body/main/div[1]/div[1]/div/div[3]/a")
    public WebElement lnkBrowsePhenotype;

    /** Select A Phenotype Text **/
    @FindBy(xpath = "//*[@class='h5 text-center text-secondary my-1']")
    public WebElement txtSelectPhenotype;

    public BrowsePhenotypesPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
