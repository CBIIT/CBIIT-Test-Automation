package AnalysisTools.CervicalCP.playwright.Steps;

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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user inputs {int} for the target population, move the percentages to {int}% each")
    public void the_user_inputs_for_the_target_population_move_the_percentages_to_each(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the results section displays {string}")
    public void the_results_section_displays(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
