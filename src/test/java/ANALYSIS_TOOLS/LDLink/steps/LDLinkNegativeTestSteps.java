package ANALYSIS_TOOLS.LDLink.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.nio.file.Paths;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.CommonUtils.assertEquals;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.getLdLinkUrl;

public class LDLinkNegativeTestSteps extends PageInitializer {

    /*
    This step navigates to the LDLink home page and then the LDAssoc module
     */
    @Given("the user is on the LDAssoc module")
    public void the_user_is_on_the_ld_assoc_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDassoc Interactively").click();
    }

    /*
    This will enable the "Use example data" and de-select the population drop down and calculate
     */
    @When("using example data and unselecting population")
    public void using_example_data_and_unselecting_population() {
        page.locator("#ldassoc-sample span").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("CEU")).click();
        page.getByRole(AriaRole.CHECKBOX, new Page.GetByRoleOptions().setName("(CEU) Utah Residents from")).uncheck();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    This will assert the validation error is displayed with string passed in feature file
    This is a common step/element for almost all the negative tests
     */
    @Then("the {string} validation error displays")
    public void the_validation_error_displays(String populationErrorPopup) {
        assertThat(page.locator(".popover-content")).containsText(populationErrorPopup);
    }

    /*
    This will assert the validation error is displayed with string passed in feature file
    This is similar to the previous step but doesn't use same type of popup
     */
    @Then("the {string} popup error displays")
    public void the_popup_error_displays(String populationErrorPopup) {
        String dataContent = page.locator("[data-content]").first().getAttribute("data-content");
        assertEquals(populationErrorPopup, dataContent);
    }

    /*
    This step navigates to the LDLink home page and then the LDExpress module
     */
    @Given("the user is on the LDExpress module")
    public void the_user_is_on_the_ld_express_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDexpress Search if a list of").click();
    }

    /*
    This is a common method with all negative tests, it will calculate on the respective module
     */
    @When("calculating")
    public void calculating() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    This method will enter an RSNumber and then calculate on the respective page
     */
    @When("entering RS number {string} and calculating")
    public void entering_rs_number_and_calculating(String rsNum) {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter list of RS numbers or")).click();
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Enter list of RS numbers or")).fill(rsNum);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    This method will select the YRI population value and calculate on the respective page
     */
    @When("selecting YRI population and calculating")
    public void selecting_yri_population_and_calculating() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select Population")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("(YRI) Yoruba in Ibadan, Nigera")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    This step navigates to the LDLink home page and then the LDHap module
     */
    @Given("the user is on the LDHap module")
    public void the_user_is_on_the_ld_hap_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDhap Calculate population").click();
    }

    /*
    This will enter the RSNumber on the LDProxy module (different kind of input panel to the common one) and calculates on the respective page
     */
    @When("entering LDProxy rs number {string} and calculating")
    public void entering_ld_proxy_rs_number_and_calculating(String rsNum) {
        page.getByPlaceholder("Variant RSID or CHR:POS").click();
        page.getByPlaceholder("Variant RSID or CHR:POS").fill(rsNum);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    This step navigates to the LDLink home page and then the LDMatrix module
     */
    @Given("the user is on the LDMatrix module")
    public void the_user_is_on_the_ld_matrix_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDmatrix Create an").click();
    }

    /*
    This step navigates to the LDLink home page and then the LDPair module
     */
    @Given("the user is on the LDPair module")
    public void the_user_is_on_the_ld_pair_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDpair Investigate correlated").click();
    }

    /*
    This step navigates to the LDLink home page and then the LDPop module
     */
    @Given("the user is on the LDPop module")
    public void the_user_is_on_the_ld_pop_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDpop Investigate allele").click();
    }

    /*
    This will enter RSNumber to the first input panel on the LDPair and then calculates
    @params rsNum will be the first rsNumber on the LDpair module
     */
    @When("calculating after entering LDPair rs number {string} in first field")
    public void calculating_after_entering_ld_pair_rs_number_in_first_field(String rsNum) {
        page.locator("#ldpair-snp1").click();
        page.locator("#ldpair-snp1").fill("rs538233958");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    This will enter RSNumber to the second input panel on the LDPair and then calculates
    @params rsNum will enter the rs number in the second field for the LDPair module
     */
    @When("calculating after entering LDPair rs number {string} in second field")
    public void calculating_after_entering_ld_pair_rs_number_in_second_field(String rsNum) {
        page.locator("#ldpair-snp2").click();
        page.locator("#ldpair-snp2").fill("rs2022099");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    This will enter RSNumber to the first input panel on the LDPop and then calculates
    @params rsNum is the RS Number that gets added in the first field on the LDPop module
     */
    @When("calculating after entering LDPop rs number {string} in first field")
    public void calculating_after_entering_ld_pop_rs_number_in_first_field(String rsNum) {
        page.locator("#ldpop-snp1").click();
        page.locator("#ldpop-snp1").fill("rs538233958");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    This will enter RSNumber to the second input panel on the LDPop and then calculates
    @params rsNum is the RS Number that gets added in the second field on the LDPop module
     */
    @When("calculating after entering LDPop rs number {string} in second field")
    public void calculating_after_entering_ld_pop_rs_number_in_second_field(String rsNum) {
        page.locator("#ldpop-snp2").click();
        page.locator("#ldpop-snp2").fill("rs2022099");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    This step navigates to the LDLink home page and then the LDProxy module
     */
    @Given("the user is on the LDProxy module")
    public void the_user_is_on_the_ld_proxy_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDproxy Interactively explore").click();
    }

    /*
    This step navigates to the LDLink home page and then the LDTrait module
     */
    @Given("the user is on the LDTrait module")
    public void the_user_is_on_the_ld_trait_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDtrait Search if a list of").click();
    }

    /*
    This method will navigate to the LDScore module -- defaulting to the LDScore Calculation subtab
     */
    @Given("the user is on the LDScore Calculation module")
    public void the_user_is_on_the_ld_score_Calculation_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDscore Calculate LDscore.").click();
    }

    /*
    This method will add the bed file which is 1 of 3 required files and submit to display error
     */
    @When("calculating with ones one fam file")
    public void calculating_with_ones_one_fam_file() {
        page.locator("#ldscore-files").getByText("Browse").click();
        page.locator("#ldscore-file").setInputFiles(Paths.get("src/test/resources/ldLinkResources/22.fam"));
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    This will assert the error message on ldCalculation is as expected
     */
    @Then("the {string} error message on LDScore Calculation is displayed")
    public void the_error_message_on_ld_score_calculation_is_displayed(String ldCalcErrorMessage) {
        assertThat(page.locator("#ldscore-file-message")).containsText(ldCalcErrorMessage);
    }

    /*
    This method will navigate to the LDScore module and go to the Heritability Analysis sub tab
     */
    @Given("the user is on the LDScore modules Heritability Analysis tab")
    public void the_user_is_on_the_ld_score_modules_heritability_analysis_tab() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDscore Calculate LDscore.").click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Heritability Analysis")).click();
    }

    @When("calculating with {string} population selected")
    public void calculating_with_population_selected(String eurPop) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Select Population")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(eurPop)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    @Then("the {string} error message is displayed")
    public void the_error_message_is_displayed(String ldScoreHeritabilityErrorMessage) {
        assertThat(page.locator("#ldscore-bokeh-graph-herit")).containsText((ldScoreHeritabilityErrorMessage));
    }

    /*
    This method will navigate to the LDScore module and go to the Genetic Correlation sub tab
     */
    @Given("the user is on the LDScore modules Genetic Correlation tab")
    public void the_user_is_on_the_ld_score_modules_genetic_correlation_tab() {
        page.navigate(getLdLinkUrl());
        page.getByText("LDscore Calculate LDscore.").click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Genetic Correlation")).click();
    }

    /*
    This method is for the Genetic Correlation sub tab in the LDScore module and will select EUR as population and calculate afterward
     */
    @When("calculating and selecting EUR as population")
    public void calculating_and_selecting_eur_as_population() {
    //THIS STEP WILL BE IMPLEMENTED LATER SEEING AS THE CALCULATION ERROR HANDLING ISN'T DEVELOPED FOR THIS SUB MODULE YET.
    }

    /*
    THIS IS THE ERROR MESSAGE ON THE GENETIC CORRELATION PAGE AFTER POPULATION IS FILLED OUT
    @params genCorErrorMessage is for the error message that will be added when the error handling is developed
    THERE IS NO ERROR YET BUT THERE SHOULD BE
     */
    @Then("the Genetic Correlation {string} text is displayed")
    public void the_genetic_correlation_text_is_displayed(String genCorErrorMessage) {
        assertThat(page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("loading icon"))).isVisible();
    }

    /*
    This step navigates to the LDLink home page and then the SNPChip module
     */
    @Given("the user is on the SNPChip module")
    public void the_user_is_on_the_snp_chip_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("SNPchip Find commercial").click();
    }

    /*
   This step navigates to the LDLink home page and then the SNPClip module
    */
    @Given("the user is on the SNPClip module")
    public void the_user_is_on_the_snp_clip_module() {
        page.navigate(getLdLinkUrl());
        page.getByText("SNPclip Prune a list of").click();
    }
}