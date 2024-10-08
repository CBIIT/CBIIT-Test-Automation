package AnalysisTools.GWASExplorer.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class BrowsePhenotypesSteps extends PageInitializer {

    @When("user clicks browse phenotype tab")
    public void user_clicks_browse_phenotype_tab() {
        CommonUtils.sleep(2000);
        JavascriptUtils.clickByJS(browsePhenotypesPage.lnkBrowsePhenotype);
        CommonUtils.sleep(2000);
    }

    @Then("browse phenotype page displays {string}")
    public void browse_phenotype_page_displays(String selectPhenotype) {
        Assert.assertTrue(browsePhenotypesPage.txtSelectPhenotype.getText().contentEquals(selectPhenotype));
    }
}