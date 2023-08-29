package AnalysisTools.scAtlas.Steps;

import com.nci.automation.web.CommonUtils;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SCAtlasCohortsSteps extends PageInitializer {

    @When("the user enters {string} in the gene filter")
    public void the_user_enters_in_the_gene_filter(String geneFilter) {
        CommonUtils.waitForClickability(scAtlasCohortsPage.geneFilterTextBox);
        CommonUtils.sendKeys(scAtlasCohortsPage.geneFilterTextBox, geneFilter);
    }

    @Then("the {string} Cell is returned")
    public void the_cell_is_returned(String geneReturned) {
        CommonUtils.waitForClickability(scAtlasCohortsPage.geneFilterTextBox);
        CommonUtils.assertEquals(scAtlasCohortsPage.aaasGeneResults.getText(), geneReturned);
    }

    @Then("the {string} gene Cell is returned")
    public void the_gene_cell_is_returned(String genCellReturned) {
        CommonUtils.waitForClickability(scAtlasCohortsPage.geneFilterTextBox);
        CommonUtils.assertEquals(scAtlasCohortsPage.rp11GeneResults.getText(), genCellReturned);
    }
}