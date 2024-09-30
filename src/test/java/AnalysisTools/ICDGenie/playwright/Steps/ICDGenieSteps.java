package AnalysisTools.ICDGenie.playwright.Steps;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.nio.file.Paths;
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

    @When("the user is on the {string} tab on ICDGenie")
    public void the_user_is_on_the_tab_on_icd_genie(String tab) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(tab)).click();
    }

    @When("the user is on the Getting Started tab on ICDGenie")
    public void the_user_is_on_the_getting_started_tab_on_icd_genie() {
        page.locator("#app-navbar").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Getting Started")).click();
    }

    @When("the user trys out the Search sections POST box")
    public void the_user_trys_out_the_search_sections_post_box() {
        page.getByLabel("post /api/search").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Try it out")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Execute")).click();
    }

    @Then("the Curl text box on Search is displayed")
    public void the_curl_text_box_on_search_is_displayed(){
        assertThat(page.locator("pre").filter(new Locator.FilterOptions().setHasText("curl -X 'POST' \\ 'https://"))).isVisible();
    }

    @Then("the Curl text box on Batch Export is displayed")
    public void the_curl_text_box_on_batch_export_is_displayed() {
        assertThat(page.locator("pre").filter(new Locator.FilterOptions().setHasText("curl -X 'POST' \\ 'https://icdgenie-qa.cancer.gov/api/batch' \\ -H 'accept"))).isVisible();
    }

    @When("the user trys out the Batch Export sections POST box")
    public void the_user_trys_out_the_batch_export_sections_post_box() {
        page.getByLabel("post /api/batch").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Try it out")).click();
        page.locator("#operations-Batch_Export-post_api_batch").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Execute")).click();
    }

    @When("the user navigates to the Tutorials sections of page")
    public void the_user_navigates_to_the_tutorials_sections_of_page() {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("TUTORIALS")).click();
    }

    @Then("both videos are attached")
    public void both_videos_are_attached() {
        assertThat(page.frameLocator("iframe[title=\"formatting\"]").locator("vb-overlay-play-controls div").first()).isVisible();
        assertThat(page.frameLocator("iframe[title=\"batch\"]").locator("vb-overlay-play-controls div").first()).isVisible();
    }

    @Then("the {string}")
    public void the(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enters {string} in the home pages search bar")
    public void the_user_enters_in_the_home_pages_search_bar(String searchTextValue) {
        page.getByPlaceholder("Search ICD Genie").click();
        page.getByPlaceholder("Search ICD Genie").fill(searchTextValue);
        page.getByPlaceholder("Search ICD Genie").press("Enter");
    }

    @When("the user navigates to the About page")
    public void the_user_navigates_to_the_about_page() {
        page.navigate("https://icdgenie-qa.cancer.gov/about");
    }

    @Then("the {string}, {string}, {string}, {string}, {string}, and {string} About page text is displayed")
    public void the_and_about_page_text_is_displayed(String aboutText1, String aboutText2, String aboutText3, String aboutText4, String aboutText5, String aboutText6) {
        assertThat(page.locator("#main-content")).containsText(aboutText1);
        assertThat(page.locator("#main-content")).containsText(aboutText2);
        assertThat(page.locator("#main-content")).containsText(aboutText3);
        assertThat(page.locator("#main-content")).containsText(aboutText4);
        assertThat(page.locator("#resources")).containsText(aboutText5);
        assertThat(page.locator("#contact")).containsText(aboutText6);
    }

    @Then("the {string}, {string}, {string}, and {string} are displayed")
    public void the_and_are_displayed(String indexTableText, String neoplasmTableText, String drugTableText, String injuryTableText) {
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(indexTableText))).isVisible();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(neoplasmTableText))).isVisible();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(drugTableText))).isVisible();
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(injuryTableText))).isVisible();
    }

    @Given("TBD")
    public void tbd() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the user is on ICDGenies Search page")
    public void the_user_is_on_icdgenies_search_page() {
        page.navigate("https://icdgenie-qa.cancer.gov/search");
    }

    @When("the user searches {string}")
    public void the_user_searches(String breastCancertext) {
        page.getByPlaceholder("Search by Keywords, ICD-10").click();
        page.getByPlaceholder("Search by Keywords, ICD-10").fill("breast cancer");
        page.getByPlaceholder("Search by Keywords, ICD-10").press("Enter");
    }

    @Then("the {string} is a result returned")
    public void the_is_a_result_returned(String breastCancerResultsReturned) {
        assertThat(page.getByLabel("ICD-10 Code Table")).containsText(breastCancerResultsReturned);
    }

    @Given("the user is on the ICDGenie Batch Query page")
    public void the_user_is_on_the_icd_genie_batch_query_page() {
        page.navigate("https://icdgenie-qa.cancer.gov/batch-query");
    }

    @When("the user submits using the {string} file to the field and selects Participant ID for ICD{int} codes")
    public void the_user_submits_using_the_file_to_the_field_and_selects_participant_id_for_icd_codes(String fileLocation, int NOTNEEDED) {
        page.getByLabel("Upload a file containing").click();
        page.getByLabel("Upload a file containing").setInputFiles(Paths.get(fileLocation));
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
    }

    @Then("the {string} text and the {string} button are displayed")
    public void the_text_and_the_button_are_displayed(String resultsReturned, String exportResultsButtonText) {
        assertThat(page.locator("#main-content")).containsText(resultsReturned);
        assertThat(page.locator("#main-content")).containsText(exportResultsButtonText);
    }

    @When("the user trys out the Search sections {string} box")
    public void the_user_trys_out_the_search_sections_box(String apiRequestType) {
    }

    @Then("the {string} text box is displayed")
    public void the_text_box_is_displayed(String curlTextBox) {
    }

    @When("the user trys out the Batch Export sections {string} box")
    public void the_user_trys_out_the_batch_export_sections_box(String curlTextbox) {
    }
}