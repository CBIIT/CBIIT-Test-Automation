package AnalysisTools.GWASExplorer.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class HomeSteps extends PageInitializer {

    @Given("the user is on the GWAS Explorer home page")
    public void the_user_is_on_the_gwas_explorer_home_page() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("GWASExplorer"));
        CommonUtils.waitForVisibility(gwasExplorerHomePage.gwasExplorerText);
        Assert.assertTrue(gwasExplorerHomePage.gwasExplorerText.isDisplayed());
    }

    @Then("the credit text is displayed")
    public void the_credit_text_is_displayed() {
        Assert.assertTrue(gwasExplorerHomePage.creditText.isDisplayed());
    }

    @When("user selects API Access tab")
    public void user_selects_API_Access_tab() {
        gwasExplorerHomePage.lnkAPIAcess.click();
    }

    @Then("API Access page displays")
    public void api_access_page_displays() {
    }
    @Then("API Acess page displays")
    public void api_Acess_page_displays() {
        CucumberLogUtils.logScreenshot();
    }

    @Then("API Acess page displays {string} heading")
    public void api_Acess_page_displays_heading(String heading) {
        Assert.assertTrue(gwasExplorerHomePage.txtAPIAccessHeading.getText().contentEquals(heading));
    }

    @When("user clicks on About page")
    public void user_clicks_on_About_page() {
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(gwasExplorerHomePage.lnkAbout);
        MiscUtils.sleep(2000);
    }

    @When("clicks on Github")
    public void clicks_on_Github() {
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(gwasExplorerHomePage.lnkGitHub);
    }

    @Then("user goes to source code from About page")
    public void user_goes_to_source_code_from_About_page() {
        CucumberLogUtils.logScreenshot();
    }

    @When("user clicks on source code")
    public void user_clicks_on_source_code() {
        gwasExplorerHomePage.lnkSourceCode.click();
    }

    @Then("user goes to PLCO source code on github")
    public void user_goes_to_PLCO_source_code_on_github() {
        CucumberLogUtils.logScreenshot();
    }

    @When("user navigates to the About page")
    public void user_navigates_to_the_About_page() {
        MiscUtils.sleep(2000);
        gwasExplorerHomePage.aboutTab.click();
    }

    @And("user clicks explore on GWAS results")
    public void user_clicks_explore_on_GWAS_results() {
        gwasExplorerHomePage.lnkExploreGwasResults.click();
    }

    @Then("user is on explore GWAS tab where {string} displays")
    public void user_is_on_explore_GWAS_tab_where_displays(String summaryResults) {
        Assert.assertEquals(summaryResults, exploreGWASPage.txtSummaryResults.getText());
    }
}