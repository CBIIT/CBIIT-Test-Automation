package ANALYSIS_TOOLS.LDLink.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.LD_LINK_URL;

public class LDlinkSteps extends PageInitializer {

    /**
     * This step will navigate to the LDlink home page and select the LDscore module
     */
    @Given("the user is on the LDscore module on LDlink")
    public void the_user_is_on_the_l_dscore_module_on_l_dlink() {
        page.navigate(LD_LINK_URL);
        page.getByText("LDscore Calculate LDscore.").click();
    }

    /**
     * This step verifies the link is visible and contains the same texts as provided in FF
     */
    @Then("the link {string} is displayed")
    public void the_link_is_displayed(String sampleFormatLink) {
        assertThat(page.locator("#ldheritSampleFormat")).containsText(sampleFormatLink);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(sampleFormatLink))).isVisible();
    }

    /**
     * This step clicks on the Sample Format Link on the LDscore submodules
     */
    @When("the user clicks on {string}")
    public void the_user_clicks_on(String sampleFormatLink) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(sampleFormatLink)).click();
    }

    /**
     * This step navigate to the Documentation page and verifies all the intended texts are displayed
     */
    @Then("the user is on the Documentation page with the LDscore text displayed")
    public void the_user_is_on_the_documentation_page_with_the_l_dscore_text_displayed() {
        assertThat(page.locator("#help-tab")).containsText("LDscore - Perform LD score regression analysis online utilizing the ldsc tool developed in https://github.com/bulik/ldsc.");
        assertThat(page.locator("#help-tab")).containsText("For LD score calculation - genotype information as .bim/.bed/.fam files, as well as window in centiMorgan (cM) or kilobasepairs (kb) selected from the drop-down menu.");
        assertThat(page.locator("#help-tab")).containsText("For heritability analysis - GWAS summary statistics (format: tab-separated files with columns accepted by https://github.com/bulik/ldsc/blob/master/munge_sumstats.py, e.g. with effect size, p-value, SNP identifiers, and allelic information, note header naming format is important). For example: SNP (Variant ID e.g., rs number), A1 (Allele 1, interpreted as reference allele for signed sumstat), A2 (Allele 2, interpreted as non-reference allele for signed sumstat), Frq (Allele frequency), BETA or [linear/logistic] regression coefficient (0 --> no effect; above 0 --> A1 is trait/risk increasing), P (p-Value), N (Sample size). In addition, a reference population needs to be selected from the drop down menu.");
        assertThat(page.locator("#help-tab")).containsText("For genetic correlation - GWAS summary statistics (format: tab-separated files with columns accepted by https://github.com/bulik/ldsc/blob/master/munge_sumstats.py, e.g. with effect size, p-value, SNP identifiers, and allelic information, note header naming format is important). For example: SNP (Variant ID e.g., rs number), A1 (Allele 1, interpreted as reference allele for signed sumstat), A2 (Allele 2, interpreted as non-reference allele for signed sumstat), Frq (Allele frequency), BETA or [linear/logistic] regression coefficient (0 --> no effect; above 0 --> A1 is trait/risk increasing), P (p-Value), N (Sample size). In addition, a reference population needs to be selected from the drop down menu.");
        assertThat(page.locator("#help-tab")).containsText("Reference population - One 1000 Genomes Project/Genome Aggregation Database (gnomAD) sub-population is required for heritability analysis or genetic correlation.");
        assertThat(page.locator("#help-tab")).containsText("For LD Score calculation - A summary of LD Scores, the MAF/LD Score Correlation Matrix, full LD Scores file, as well as the option to download input data, in addition to a code prompt output summary.");
        assertThat(page.locator("#help-tab")).containsText("For heritability analysis - Total Observed scale heritability, Lambda GC, Mean Chi^2, Intercept and LDSC Ratio, as well as a code prompt output summary.");
        assertThat(page.locator("#help-tab")).containsText("For genetic correlation - tables with heritability of phenotype 1, heritability of phenotype 2, Genetic Covariance, Genetic Correlation and a Summary of Genetic Correlation Results, as well as a code prompt output summary.");
    }

    /**
     * This step clicks on the "LDscore Calculation" submodule on the LDscore module
     */
    @When("the user clicks on the LDscore Calculation link")
    public void the_user_clicks_on_the_ldscore_calculation_link() {
        page.locator("#home-tab-anchor").click();
        page.getByText("LDscore Calculate LDscore.").click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("LDscore Calculation")).click();
    }

    /**
     * This step clicks on the "Genetic Correlation" submodule on the LDscore module
     */
    @When("the user clicks on the Genetic Correlation link")
    public void the_user_clicks_on_the_genetic_correlation_link() {
        page.locator("#home-tab-anchor").click();
        page.getByText("LDscore Calculate LDscore.").click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Genetic Correlation")).click();
    }
}
