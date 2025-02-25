package PLATFORM_BUSINESS.OCPL_Training.steps;

import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.getNCISPUrl;

public class OCPL_Training_Request_Steps {

    /**
     * It navigates to the NCISP URL, fills out the OCPL Training request form fields with specified values.
     */
    @Given("the user is filling of the OCPL Training request form,")
    public void the_user_is_filling_of_the_ocpl_training_request_form() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.navigate(getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#fresponsive")).containsText("Services");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Business Services")).first().click();
        assertThat(page.locator("md-content")).containsText("OCPL");
        assertThat(page.locator("md-content")).containsText("OCPL Training Request");
        page.getByText("OCPL Training Request OCPL Training Request").click();
        page.locator("#catItemTop").getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName("OCPL Training Request")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("CBIIT Test Account Clear")).click();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Requested For").setExact(true)).fill("Ben Foulkes");
        page.getByText("Ben Foulkes").click();
        assertThat(page.locator("#fee_tuition")).containsText("Fee/Tuition");
        page.getByLabel("Fee/Tuition").fill("$22");
        assertThat(page.locator("#course_name_num")).containsText("Course Name/Num");
        page.getByLabel("Course Name/Num").click();
        page.getByLabel("Course Name/Num").fill("23");
        page.getByLabel("Course Name/Num").press("Enter");
        assertThat(page.locator("#training_dates")).containsText("Training Dates");
        page.getByLabel("Training Dates").click();
        page.getByLabel("Training Dates").fill("21");
        assertThat(page.locator("#training_location")).containsText("Training Location");
        page.getByLabel("Training Location").click();
        page.getByLabel("Training Location").fill("21");
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- FILLING THE REGISTRATION LINK FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#registration_link")).containsText("Registration Link");
        page.getByLabel("Edit Registration Link").click();
        page.getByLabel("Registration Link", new Page.GetByLabelOptions().setExact(true)).fill("https://service-test.nci.nih.gov/ncisp?id=nci_sc_cat_item&sys_id=68b210fbdb2a77004c89ff621f961942");
        page.getByLabel("Registration Link", new Page.GetByLabelOptions().setExact(true)).press("Enter");
        page.getByLabel("Lock Registration Link").click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- FILLING THE JUSTIFICATION FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#justification")).containsText("Justification");
        page.getByLabel("Justification").click();
        page.getByLabel("Justification").fill("Test");

        CucumberLogUtils.scenario.log("---- FILLING THE TRAINING PROVIDER FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#training_provider")).containsText("Training Provider");
        page.getByLabel("Training Provider").click();
        page.getByLabel("Training Provider").fill("Test");

        CucumberLogUtils.scenario.log("---- FILLING THE PROVIDER PHONE FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#provider_phone")).containsText("Provider Phone");
        page.getByLabel("Provider Phone").click();
        page.getByLabel("Provider Phone").fill("12");

        CucumberLogUtils.scenario.log("---- SELECTING THE 'Metro' for THE TRANSPORTATION BY FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#transportation_by_metro_personal_vehicle")).containsText("Transportation By");
        page.getByText("NA", new Page.GetByTextOptions().setExact(true)).click();

        CucumberLogUtils.scenario.log("---- FILLING THE OTHER NOTES OR SPECIAL ARRANGEMENTS FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#other_notes_or_special_arrangements")).containsText("Other Notes or Special Arrangements");
        page.getByLabel("Other Notes or Special").click();
        page.getByLabel("Other Notes or Special").fill("test");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Scrolls the page to ensure the specified element at the bottom of the form is in view.
     */
    @When("the user reaches the bottom of the form,")
    public void the_user_reaches_the_bottom_of_the_form() {
        page.locator("//span[normalize-space()='Are you requesting Compensatory Time for Travel (CTT) during this training?']").scrollIntoViewIfNeeded();
    }

    /**
     * The user will see the following two required fields.
     *
     * @param compensatoryTimeForTravel_CTT The first required field representing Compensatory Time for Travel (CTT)
     * @param compTime_CT The second required field representing Comp Time (CT)
     */
    @Then("the user will see the following two required fields, {string} and {string}")
    public void the_user_will_see_the_following_two_required_fields_and(String compensatoryTimeForTravel_CTT, String compTime_CT) {
        CucumberLogUtils.scenario.log("---- ASSERTION OF REQUIRED CTT FIELD ----");
        assertThat(page.locator("#are_you_requesting_compensatory_time_for_travel_ctt_during_this_training").getByLabel("Required", new Locator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.locator("//span[normalize-space()='Are you requesting Compensatory Time for Travel (CTT) during this training?']")).containsText(compensatoryTimeForTravel_CTT);

        CucumberLogUtils.scenario.log("---- ASSERTION OF REQUIRED CT FIELD ----");
        assertThat(page.locator("#are_you_requesting_comp_time_ct_during_this_training").getByLabel("Required", new Locator.GetByLabelOptions().setExact(true))).isVisible();
        assertThat(page.locator("#are_you_requesting_comp_time_ct_during_this_training")).containsText(compTime_CT);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verify that both of the specified fields contain Yes and No radio button options.
     */
    @Then("both of the above fields have Yes and No Radion button options")
    public void both_of_the_above_fields_have_yes_and_no_radion_button_options() {
        CucumberLogUtils.scenario.log("---- ASSERTION OF YES AND NO RADIO BUTTON OPTIONS FOR CTT FIELD ----");
        assertThat(page.getByLabel("Required -Are you requesting Compensatory Time for Travel (CTT) during this").getByRole(AriaRole.RADIOGROUP)).containsText("YesNo");

        CucumberLogUtils.scenario.log("---- ASSERTION OF YES AND NO RADIO BUTTON OPTIONS FOR CT FIELD ----");
        assertThat(page.getByLabel("Required -Are you requesting Comp Time (CT) during this training?").getByRole(AriaRole.RADIOGROUP)).containsText("YesNo");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies the tooltip verbiage for the CCT field on the page.
     *
     * @param compensatoryTimeForTravel_CTT The expected verbiage for the Compensatory Time for Travel (CTT) field
     * @param docString The expected verbiage for the document string field
     */
    @Then("verify the tooltip verbiage for the CCT field {string}")
    public void verify_the_tooltip_verbiage_for_the_cct_field(String compensatoryTimeForTravel_CTT, String docString) {
        assertThat(page.locator("#are_you_requesting_compensatory_time_for_travel_ctt_during_this_training")).containsText(compensatoryTimeForTravel_CTT);
        assertThat(page.getByLabel("More information for Are you requesting Compensatory Time for Travel (CTT)")).isVisible();
        page.getByLabel("More information for Are you requesting Compensatory Time for Travel (CTT)").click();
        assertThat(page.locator("#are_you_requesting_compensatory_time_for_travel_ctt_during_this_training")).containsText(docString);

        CucumberLogUtils.scenario.log("---- SELECTS 'YES' FOR 'ARE YOU REQUESTING COMPENSATORY TIME FOR TRAVEL (CTT) DURING THIS' FIELD ----");
        page.getByLabel("Required -Are you requesting Compensatory Time for Travel (CTT) during this").getByText("Yes").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verify the tooltip verbiage for the CT field.
     *
     * @param compTime_CT The expected verbiage for the Comp Time (CT) field
     * @param ctDocString The expected verbiage for the document string field
     */
    @Then("verify the tooltip verbiage for the CT field {string}")
    public void verify_the_tooltip_verbiage_for_the_ct_field(String compTime_CT, String ctDocString) {
        assertThat(page.locator("#are_you_requesting_comp_time_ct_during_this_training")).containsText(compTime_CT);
        assertThat(page.getByLabel("More information for Are you requesting Comp Time (CT) during this training?")).isVisible();
        page.getByLabel("More information for Are you requesting Comp Time (CT) during this training?").click();
        assertThat(page.locator("#are_you_requesting_comp_time_ct_during_this_training")).containsText(ctDocString);

        CucumberLogUtils.scenario.log("---- SELECTS 'NO' FOR 'ARE YOU REQUESTING COMP TIME (CT) DURING THIS TRAINING?' FIELD ----");
        page.getByLabel("Required -Are you requesting Comp Time (CT) during this training?").getByText("No").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Submits the OCPL Training Request Form
     */
    @Then("when the user submits the form containing their responses to the questions, the system will capture their response.")
    public void when_the_user_submits_the_form_containing_their_responses_to_the_questions_the_system_will_capture_their_response() {
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").scrollIntoViewIfNeeded();
        page.locator("//button[@class='btn btn-primary ng-binding ng-scope']").click();
        assertThat(page.getByText("How can we help, CBIIT? All")).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verify the response in the body of the specified email in the System log emails.
     *
     * @param ocplTrainingRequest The email to verify the response in the body
     */
    @Then("verify the response in the body of {string} email in the System log emails")
    public void verify_the_response_in_the_body_of_email_in_the_system_log_emails(String ocplTrainingRequest) {
        assertThat(page.getByLabel("Header menu").getByRole(AriaRole.LINK)).containsText("Native View");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Native View")).click();
        assertThat(page.getByPlaceholder("Filter")).isVisible();
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill("System Logs");
        page.getByPlaceholder("Filter").press("Enter");
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Emails"))).isVisible();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Emails")).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search a specific field of").selectOption("subject");
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(ocplTrainingRequest);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Emails.").locator("tbody")).containsText(ocplTrainingRequest);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("(//a[@aria-label='Preview record: OCPL Training Request'])[1]").click();
        page.frameLocator("iframe[name='gsft_main']").locator("//a[normalize-space()='Open Record']").isVisible();
        page.frameLocator("iframe[name='gsft_main']").locator("//a[normalize-space()='Open Record']").click();
        page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Preview Email")).scrollIntoViewIfNeeded();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Preview Email"))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("(//a[normalize-space()='Preview Email'])").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").frameLocator("iframe[title=\"Preview Email\"]").getByRole(AriaRole.PARAGRAPH)).containsText("Are you requesting Compensatory Time for Travel (CTT) during this training? = Yes");
        assertThat(page.frameLocator("iframe[name='gsft_main']").frameLocator("iframe[title=\"Preview Email\"]").getByRole(AriaRole.PARAGRAPH)).containsText("Are you requesting Comp Time (CT) during this training? = No");
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Close", new FrameLocator.GetByLabelOptions().setExact(true))).containsText("Close");
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Close", new FrameLocator.GetByLabelOptions().setExact(true))).containsText("Close");
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Close", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("#sysverb_delete")).containsText("Delete");
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("#sysverb_delete").click();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("#ok_button")).containsText("Delete");
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Confirmation Help").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Delete")).click();
    }

    /**
     * Method to fills out the OCPL Training request form fields with specified values.
     */
    @Given("the user is filling the OCPL Training request form")
    public void the_user_is_filling_the_ocpl_training_request_form() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.navigate(getNCISPUrl());
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#fresponsive")).containsText("Services");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Services").setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Business Services")).first().click();
        assertThat(page.locator("md-content")).containsText("OCPL");
        assertThat(page.locator("md-content")).containsText("OCPL Training Request");
        page.getByText("OCPL Training Request OCPL Training Request").click();
        page.locator("#catItemTop").getByRole(AriaRole.HEADING, new Locator.GetByRoleOptions().setName("OCPL Training Request")).click();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("CBIIT Test Account Clear")).click();
        page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Requested For").setExact(true)).fill("Ben Foulkes");
        page.getByText("Ben Foulkes").click();
        assertThat(page.locator("#fee_tuition")).containsText("Fee/Tuition");
        page.getByLabel("Fee/Tuition").fill("$22");
        assertThat(page.locator("#course_name_num")).containsText("Course Name/Num");
        page.getByLabel("Course Name/Num").click();
        page.getByLabel("Course Name/Num").fill("23");
        page.getByLabel("Course Name/Num").press("Enter");
        assertThat(page.locator("#training_dates")).containsText("Training Dates");
        page.getByLabel("Training Dates").click();
        page.getByLabel("Training Dates").fill("21");
        assertThat(page.locator("#training_location")).containsText("Training Location");
        page.getByLabel("Training Location").click();
        page.getByLabel("Training Location").fill("21");
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- FILLING THE REGISTRATION LINK FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#registration_link")).containsText("Registration Link");
        page.getByLabel("Edit Registration Link").click();
        page.getByLabel("Registration Link", new Page.GetByLabelOptions().setExact(true)).fill("https://service-test.nci.nih.gov/ncisp?id=nci_sc_cat_item&sys_id=68b210fbdb2a77004c89ff621f961942");
        page.getByLabel("Registration Link", new Page.GetByLabelOptions().setExact(true)).press("Enter");
        page.getByLabel("Lock Registration Link").click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- FILLING THE JUSTIFICATION FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#justification")).containsText("Justification");
        page.getByLabel("Justification").click();
        page.getByLabel("Justification").fill("Test");

        CucumberLogUtils.scenario.log("---- FILLING THE TRAINING PROVIDER FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#training_provider")).containsText("Training Provider");
        page.getByLabel("Training Provider").click();
        page.getByLabel("Training Provider").fill("Test");

        CucumberLogUtils.scenario.log("---- FILLING THE PROVIDER PHONE FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#provider_phone")).containsText("Provider Phone");
        page.getByLabel("Provider Phone").click();
        page.getByLabel("Provider Phone").fill("12");
    }

    /**
     * This method verifies the field "Transportation By"
     *
     * @param transportationBy the user selects for the required field "Transportation By"
     */
    @When("the user reaches the required field {string},")
    public void the_user_reaches_the_required_field(String transportationBy) {
        CucumberLogUtils.scenario.log("---- SELECTING THE 'NA' for THE TRANSPORTATION BY FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#transportation_by_metro_personal_vehicle")).containsText(transportationBy);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * The user selects "NA" the specified option for "Transportation By" field on the page.
     *
     * @param nA The option to be selected by the user
     */
    @Then("the user will have the ability to select the option {string},")
    public void the_user_will_have_the_ability_to_select_the_option(String nA) {
        assertThat(page.getByText(nA, new Page.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.getByLabel("Required -Transportation By").getByRole(AriaRole.RADIOGROUP)).containsText(nA);
        page.getByText(nA, new Page.GetByTextOptions().setExact(true)).click();

        CucumberLogUtils.scenario.log("---- FILLING THE OTHER NOTES OR SPECIAL ARRANGEMENTS FIELD ON THE OCPL TRAINING FORM ----");
        assertThat(page.locator("#other_notes_or_special_arrangements")).containsText("Other Notes or Special Arrangements");
        page.getByLabel("Other Notes or Special").click();
        page.getByLabel("Other Notes or Special").fill("test");
        page.getByLabel("More information for Are you requesting Compensatory Time for Travel (CTT)").click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- SELECTS 'YES' FOR 'ARE YOU REQUESTING COMPENSATORY TIME FOR TRAVEL (CTT) DURING THIS' FIELD ----");
        page.getByLabel("Required -Are you requesting Compensatory Time for Travel (CTT) during this").getByText("Yes").click();
        page.getByLabel("More information for Are you requesting Comp Time (CT) during this training?").click();
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("---- SELECTS 'NO' FOR 'ARE YOU REQUESTING COMP TIME (CT) DURING THIS TRAINING?' FIELD ----");
        page.getByLabel("Required -Are you requesting Comp Time (CT) during this training?").getByText("No").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verify the response for a given field in the body of specified email in the System log emails.
     *
     * @param ocplTrainingRequest The email to verify the response in the body
     */
    @Then("verify the response for given field in the body of {string} email in the System log emails")
    public void verify_the_response_for_given_field_in_the_body_of_email_in_the_system_log_emails(String ocplTrainingRequest) {
        assertThat(page.getByLabel("Header menu").getByRole(AriaRole.LINK)).containsText("Native View");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Native View")).click();
        assertThat(page.getByPlaceholder("Filter")).isVisible();
        page.getByPlaceholder("Filter").click();
        page.getByPlaceholder("Filter").fill("System Logs");
        page.getByPlaceholder("Filter").press("Enter");
        assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Emails"))).isVisible();
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Emails")).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search a specific field of").selectOption("subject");
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(ocplTrainingRequest);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Emails.").locator("tbody")).containsText(ocplTrainingRequest);
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("(//a[@aria-label='Preview record: OCPL Training Request'])[1]").click();
        page.frameLocator("iframe[name='gsft_main']").locator("//a[normalize-space()='Open Record']").isVisible();
        page.frameLocator("iframe[name='gsft_main']").locator("//a[normalize-space()='Open Record']").click();
        page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Preview Email")).scrollIntoViewIfNeeded();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Preview Email"))).isVisible();
        CucumberLogUtils.playwrightScreenshot(page);
        page.frameLocator("iframe[name='gsft_main']").locator("(//a[normalize-space()='Preview Email'])").click();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").frameLocator("iframe[title=\"Preview Email\"]").getByRole(AriaRole.PARAGRAPH)).containsText("Transportation By = NA");
        CucumberLogUtils.playwrightScreenshot(page);
    }
}