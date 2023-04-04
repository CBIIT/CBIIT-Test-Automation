package AnalysisTools.cProSite.Steps;


import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
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
}
