package AnalysisTools.cProSite.Steps;


import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class CProSiteExplorePageSteps extends PageInitializer {


    @Given("user is on cProSite explore Tab")
    public void userIsOnCProSiteExploreTab() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("cProSite"));
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();
    }

    @When("user clicks submit")
    public void userClicksSubmit() {
        cProSiteExplorePage.submitButton.click();
    }

    @Then("results is displayed")
    public void resultsIsDisplayed() {
        Assert.assertTrue(cProSiteExplorePage.summary.isDisplayed());
    }

    @When("user changes the dataset to phosphorylation site")
    public void userChangesTheDatasetToPhosphorylationSite() {


        cProSiteExplorePage.datasetDropdown.sendKeys("Phosphorylation Site");
        cProSiteExplorePage.datasetDropdown.sendKeys(Keys.ENTER);

    }
    @When("user changes the dataset to phosphorylationprotein")
    public void userChangesTheDatasetToPhosphorylationprotein() {
        cProSiteExplorePage.datasetDropdown.sendKeys("Phosphorylation/Protein");
        cProSiteExplorePage.datasetDropdown.sendKeys(Keys.ENTER);
    }

    @And("user change analysis to correlation")
    public void userChangeAnalysisToCorrelation() {
        cProSiteExplorePage.analysisDropdown.sendKeys("Correlation");
        cProSiteExplorePage.analysisDropdown.sendKeys(Keys.ENTER);
    }

    @When("user changes the dataset to rnalevel")
    public void userChangesTheDatasetToRnalevel() {
        cProSiteExplorePage.datasetDropdown.sendKeys("RNA Level");
        cProSiteExplorePage.datasetDropdown.sendKeys(Keys.ENTER);
    }

    @And("user change correlated gene to DLC{int}")
    public void userChangeCorrelatedGeneToDLC(int arg0) {
        cProSiteExplorePage.corelatedgeneDropdown.sendKeys("DLC1");
        cProSiteExplorePage.corelatedgeneDropdown.sendKeys(Keys.ENTER);
        JavascriptUtils.scrollDown(100);
        MiscUtils.sleep(3000);
    }
}
