package AnalysisTools.GWASExplorer.Steps;

import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class BrowsePhenotypesSteps extends PageInitializer {
    @When("user clicks browse phenotype tab")
    public void user_clicks_browse_phenotype_tab() {
        browsePhenotypesPage.lnkBrowsePhenotype.click();
    }

    @Then("browse phenotype page displays {string}")
    public void browse_phenotype_page_displays(String text) {
        Assert.assertTrue(browsePhenotypesPage.txtSelectPhenotype.getText().contentEquals("Please select a phenotype"));
    }
}