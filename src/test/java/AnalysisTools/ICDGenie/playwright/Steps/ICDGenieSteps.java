package AnalysisTools.ICDGenie.playwright.Steps;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ICDGenieSteps extends PlaywrightUtils {
    @Given("the user is on the ICDGenie home page")
    public void the_user_is_on_the_icd_genie_home_page() {
        PlaywrightUtils.page.navigate("https://icdgenie-qa.cancer.gov/");
    }
    @When("the user navigates to the API Access page")
    public void the_user_navigates_to_the_api_access_page() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("API Access")).click();
    }
    @When("executes Search API call")
    public void executes_search_api_call() {
        page.getByLabel("post /api/search").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Try it out")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Execute")).click();
    }
    @Then("the status code is {string}")
    public void the_status_code_is(String statusCode) {
        assertThat(page.getByText("https://icdgenie-qa.cancer.gov/api/search", new Page.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.locator("#operations-Search-post_api_search")).containsText("https://icdgenie-qa.cancer.gov/api/search");
        assertThat(page.getByRole(AriaRole.TABLE)).containsText(statusCode);
    }

    @When("executes Batch Query API call")
    public void executes_batch_query_api_call() {
        page.getByLabel("post /api/batch").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Try it out")).click();
        page.locator("#operations-Batch_Export-post_api_batch").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Execute")).click();
    }

    @Then("the status codes is {string}")
    public void the_status_codes_is(String statusCode) {
        assertThat(page.getByText("https://icdgenie-qa.cancer.gov/api/batch", new Page.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.getByRole(AriaRole.TABLE)).containsText(statusCode);
    }

    @Given("the user is on the {string} tab on ICDGenie")
    public void the_user_is_on_the_tab_on_icd_genie(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user trys out the Search sections {string} box")
    public void the_user_trys_out_the_search_sections_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the {string} text box is displayed")
    public void the_text_box_is_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user trys out the Batch Export sections {string} box")
    public void the_user_trys_out_the_batch_export_sections_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("the user is on the ICDGenie Getting Started page")
    public void the_user_is_on_the_icd_genie_getting_started_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user navigates to the Tutorials sections of page")
    public void the_user_navigates_to_the_tutorials_sections_of_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("both videos are attached")
    public void both_videos_are_attached() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the {string}")
    public void the(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user enters {string} in the home pages search bar")
    public void the_user_enters_in_the_home_pages_search_bar(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the {string}, {string}, {string}, and {string} are displayed")
    public void the_and_are_displayed(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("TBD")
    public void tbd() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("the user is on ICD Genies {string} page")
    public void the_user_is_on_icd_genies_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user searches {string}")
    public void the_user_searches(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the {string} is a result returned")
    public void the_is_a_result_returned(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("{string} is not displayed")
    public void is_not_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("the user is on the ICDGenie Batch Query page")
    public void the_user_is_on_the_icd_genie_batch_query_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user submits using the {string} file to the field and selects Participant ID for ICD-{int} codes")
    public void the_user_submits_using_the_file_to_the_field_and_selects_participant_id_for_icd_codes(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the Participant ID column is displayed in descending order")
    public void the_participant_id_column_is_displayed_in_descending_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
