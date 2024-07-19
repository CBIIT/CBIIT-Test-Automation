package AnalysisTools.CervicalCP.playwright.Steps;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CCPRunScenarioStepsPW extends PlaywrightUtils {

    @Then("the translation drop down is displayed")
    public void the_translation_drop_down_is_displayed() {
        assertThat(page.getByLabel("Select Language:")).isVisible();
    }

    @Given("the user is on the Run Scenario tab on Cervical CP")
    public void the_user_is_on_the_run_scenario_tab_on_cervical_cp() {
        PlaywrightUtils.page.navigate("https://globalcxca-qa.cancer.gov/#/run-scenario");
    }
    @When("the user inputs {string} for the target population")
    public void the_user_inputs_for_the_target_population(String targetPopulation) {
        page.getByPlaceholder("Enter Value").click();
        page.getByPlaceholder("Enter Value").fill(targetPopulation);
    }

    @When("move the Percent screening coverage to ten percent")
    public void move_the_Percent_screening_coverage_to_ten_percent() {
        page.getByLabel("Cervical screening test chosen").selectOption("pap");
        page.getByLabel("Percent screening coverage").fill("10");
    }

    @Then("the results section displays {string}")
    public void the_results_section_displays(String string) {
        MiscUtils.sleep(2000);
        assertThat(page.locator("#root")).containsText("Approximately 200 (Pap test) screening tests, NA triage tests, and 0 diagnostic tests will be required. 0 women will require treatment. 0.0% of women are possibly overtreated.");
    }

    @When("the user enters {int} for number of people in the target population")
        public void enterNumberOfPeople(int num) {
            // Code to enter number of people
    }

    @Then("the first pie chart is named {string} is displayed")
        public void isPieChartDisplayed(String chartName) {
            // Code to check if pie chart is displayed
    }

    @When("clicks on Triage checkbox")
        public void clicksOnTriageCheckbox() {
            // Code to click on triage checkbox
    }

    @When("clicks Diagnosis checkbox")
        public void clicksDiagnosisCheckbox() {
            // Code to click on diagnosis checkbox
    }

    @Then("the {string} is displayed")
        public void isSectionDisplayed(String sectionName) {
            // Code to check if section is displayed
    }
}