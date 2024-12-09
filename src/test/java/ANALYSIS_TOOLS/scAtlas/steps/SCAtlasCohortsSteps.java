package ANALYSIS_TOOLS.scAtlas.steps;

import com.nci.automation.web.CommonUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.*;

public class SCAtlasCohortsSteps extends PageInitializer {

    @When("the user enters {string} in the gene filter")
    public void the_user_enters_in_the_gene_filter(String geneFilter) {
        CommonUtils.sleep(5000);
        CommonUtils.waitForClickability(scAtlasCohortsPage.geneFilterTextBox);
        CommonUtils.scrollIntoView(scAtlasCohortsPage.geneFilterTextBox);
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

    @Then("the {string} genes Cell is returned")
    public void the_genes_cell_is_returned(String genCellReturned) {
        CommonUtils.waitForClickability(scAtlasCohortsPage.geneFilterTextBox);
        CommonUtils.assertEquals(scAtlasCohortsPage.mccc1GeneResults.getText(), genCellReturned);
    }

    @Then("the {string} gene Cells is returned")
    public void the_gene_cells_is_returned(String genCellReturned) {
        CommonUtils.waitForClickability(scAtlasCohortsPage.geneFilterTextBox);
        CommonUtils.assertEquals(scAtlasCohortsPage.ss18l1GeneResults.getText(), genCellReturned);
    }
}