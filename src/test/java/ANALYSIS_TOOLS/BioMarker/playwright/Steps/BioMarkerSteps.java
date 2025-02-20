package ANALYSIS_TOOLS.BioMarker.playwright.Steps;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

/*
THIS STEP NAVIGATES TO THE BIOMARKER TOOLS HOME PAGE
 */
public class BioMarkerSteps extends PlaywrightUtils {
    @Given("the user is on the BioMarker home page")
    public void the_user_is_on_the_bio_marker_home_page() {
        PlaywrightUtils.page.navigate("https://analysistools-qa.cancer.gov/biomarkerTools/");
    }

/*
THIS STEP ASSERTS THAT ALL THE NAV BAR TEXTS ARE DISPLAYED AS EXPECTED
 */
    @Then("the {string}, {string}, {string}, {string}, {string}, {string} tabs are displayed")
    public void the_tabs_are_displayed(String homeTab, String meansToRiskTab, String biomarkerComparisonTab, String riskStratificationAdvancedAnalysisTab, String meanRiskStratificationTab, String helpTab) {
        assertThat(page.getByRole(AriaRole.TABLIST)).containsText(homeTab);
        assertThat(page.getByRole(AriaRole.TABLIST)).containsText(meansToRiskTab);
        assertThat(page.getByRole(AriaRole.TABLIST)).containsText(biomarkerComparisonTab);
        assertThat(page.getByRole(AriaRole.TABLIST)).containsText(riskStratificationAdvancedAnalysisTab);
        assertThat(page.getByRole(AriaRole.TABLIST)).containsText(meanRiskStratificationTab);
        assertThat(page.getByRole(AriaRole.TABLIST)).containsText(helpTab);
    }

    /*
    THIS STEP IS NAVIGATING TO THE RISK STRATIFICATION ADVANCED ANALYSIS TAB
     */
    @When("the user navigates to the {string} tab")
    public void the_user_navigates_to_the_tab(String riskStratificationAdvancedAnalysisTab) {
        page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName(riskStratificationAdvancedAnalysisTab)).getByRole(AriaRole.LINK).click();
    }

    /*
    THIS STEP FILTERS VIA THE PARAMS SPECIFIED IN THE INPUT PANEL OF THE SEARCH PAGE
     */
    @When("searches using {string} set to {string}, {string} set to {string}, and {string} set to {string}")
    public void searches_using_set_to_set_to_and_set_to(String specificity, String specificityInput, String prevalence, String prevelanceInput, String delta, String deltaInput) {
        page.getByLabel("Independent Variable", new Page.GetByLabelOptions().setExact(true)).selectOption(specificity);
        page.getByLabel("Contour", new Page.GetByLabelOptions().setExact(true)).selectOption(prevalence);
        page.getByLabel("Fixed Values").selectOption(delta);
        page.getByPlaceholder("0.75, 0.8, 0.86, 0.92").click();
        page.getByPlaceholder("0.75, 0.8, 0.86, 0.92").click();
        page.getByPlaceholder("0.75, 0.8, 0.86, 0.92").fill(specificityInput);
        page.getByPlaceholder("0.05, 0.1").click();
        page.getByPlaceholder("0.05, 0.1").fill(prevelanceInput);
        page.getByPlaceholder("1.5, 2, 3").click();
        page.getByPlaceholder("1.5, 2, 3").fill(deltaInput);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
        CommonUtils.sleep(1000);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
        CommonUtils.sleep(10000);
    }

    /*
    THIS STEP VERIFIES THE RESULTS DISPLAYED AFTER CALCULATION ON THE SEARCH PAGE
     */
    @Then("the {string} and the {string} are displayed")
    public void the_and_the_are_displayed(String positivePredictiveValueTable, String complementOfTheNegativePredictiveValueTable) {
        assertThat(page.locator("#table-PPV1").getByText(positivePredictiveValueTable)).isVisible();
        assertThat(page.locator("#table-cNPV1").getByText(complementOfTheNegativePredictiveValueTable)).isVisible();
        assertThat(page.locator("#example-PPV1_header_0_5")).isVisible();
        assertThat(page.locator("[id=\"example-PPV1_header_\\ 0_77\"]")).isVisible();
        assertThat(page.locator("[id=\"example-PPV1_header_\\ 0_81\"]")).isVisible();
        assertThat(page.locator("[id=\"example-PPV1_header_\\ 0_82\"]")).isVisible();
        assertThat(page.locator("[id=\"example-PPV1_header_\\ 0_98\"]")).isVisible();
        assertThat(page.locator("#example-PPV1_0_01")).isVisible();
        assertThat(page.locator("#example-PPV1_0_05")).isVisible();
        assertThat(page.locator("#example-PPV1_0_1")).isVisible();
    }

    /*
    THIS STEP CALCULATES/LOADS RESULTS USING THE EXAMPLE 1 SAMPLE FILE
     */
    @When("the user calculates using {string} file")
    public void the_user_calculates_using_file(String exampleOneText) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(exampleOneText)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Calculate")).click();
    }

    /*
    THIS STEP ASSERTS THE CALCULATION BUTTON IS VISIBLE.  THIS BUTTON APPEARS VISIBLE AFTER CORRECT PARAMS ARE PROVIDED
     */
    @Then("the {string} table displays")
    public void the_table_displays(String calculations) {
        assertThat(page.getByRole(AriaRole.COLUMNHEADER, new Page.GetByRoleOptions().setName(calculations))).isVisible();
        assertThat(page.locator("#paramTable")).containsText(calculations);
    }

    /*
    THIS STEP VERIFIES THE RESULTS RETURNED ARE THE ONES EXPECTED
     */
    @Then("the {string}, {string}, and {string} links are displayed")
    public void the_and_links_are_displayed(String toolsHelp, String faq, String glossaryOfTerms) {
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(toolsHelp))).isVisible();
        assertThat(page.locator("#toc")).containsText(toolsHelp);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(faq))).isVisible();
        assertThat(page.locator("#toc")).containsText(faq);
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(glossaryOfTerms))).isVisible();
        assertThat(page.locator("#toc")).containsText(glossaryOfTerms);
    }
}