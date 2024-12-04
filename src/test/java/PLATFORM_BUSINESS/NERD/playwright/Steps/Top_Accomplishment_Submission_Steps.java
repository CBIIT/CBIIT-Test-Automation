package PLATFORM_BUSINESS.NERD.playwright.Steps;

import ServiceNow.PLATFORM_BUSINESS.NERD.playwright.StepImplementation.Top_Accomplishment_Submission_StepImpl;
import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Top_Accomplishment_Submission_Steps {

    /**
     * This method logs into the ServiceNow application and navigates to the NERD page.
     */
    @Given("any user is on NERD")
    public void any_user_is_on_nerd() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        page.navigate("https://service-test.nci.nih.gov/now/nav/ui/classic/params/target/%24knowledge.do");
    }

    /**
     * This method access to NERD catalog on the page.
     *
     * @param nerd The name of the catalog to access
     */
    @When("they access the {string} Catalog")
    public void they_access_the_catalog(String nerd) {
        page.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='NERD']").scrollIntoViewIfNeeded();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='NERD']")).containsText(nerd);
        page.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='NERD']").click();
    }

    /**
     * They can create a record called Top Accomplishment submission.
     *
     * @param topAccomplishments The record to be created
     */
    @Then("they can create a record called {string}")
    public void they_can_create_a_record_called(String topAccomplishments) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("#category-segmentedtab")).containsText(topAccomplishments);
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//a[@class='ng-binding ng-scope selected']").click();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Create Article")).isVisible();

        CucumberLogUtils.scenario.log("----  CLICK ON CREATE NEW ARTICLE  ----");
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//span[normalize-space()='Create an Article']").click();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByText("Create new article")).isVisible();
        page.frameLocator("iframe[name=\"gsft_main\"]").getByPlaceholder("Filter article templates").click();
        page.frameLocator("iframe[name=\"gsft_main\"]").getByPlaceholder("Filter article templates").fill(topAccomplishments);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByPlaceholder("Filter article templates")).hasValue(topAccomplishments);

        CucumberLogUtils.scenario.log("----  CLICK ON TOP ACCOMPLISHMENTS OPTION AND THEN CLICK ON NEXT PAGE ----");
        page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(topAccomplishments)).click();
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("(//div[normalize-space()='Next'])[1]").click();
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//div[@class='navbar-title-caption navbar-title-new-record']").waitFor();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.HEADING)).containsText("Top Accomplishments");
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByRole(AriaRole.HEADING)).containsText("New record");
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Knowledge Base", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("NERD");
    }

    /**
     * This method adds attachments via the record itself by clicking on the "Add Attachment" button,
     * and uploads a PDF attachment, and then close the attachment dialog.
     */
    @Then("add attachments via the record itself")
    public void add_attachments_via_the_record_itself() {
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("//button[@id='add_attachment']").waitFor();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("//button[@id='add_attachment']")).containsText("Add Attachment");
        Top_Accomplishment_Submission_StepImpl.uploadAttachmentInNativeView();
    }

    /**
     *  This method verifies that the Category field populates with the Top Accomplishment value and verifies the population.
     *
     * @param category The category to be verified in the field
     * @param topAccomplishments The value to be verified in the field
     */
    @Then("{string} Field Auto Populated with the following value {string}")
    public void field_auto_populated_with_the_following_value(String category, String topAccomplishments) {
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id='label\\.u_kb_template_top_accomplishments\\.kb_category']")).containsText(category);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Category")).hasValue(topAccomplishments);
    }

    /**
     * Verifies that the specified field is a mandatory drop-down with the given options.
     *
     * @param rank The label of the field to be verified as mandatory drop-down
     * @param one The first option in the drop-down
     * @param two The second option in the drop-down
     * @param three The third option in the drop-down
     * @param four The fourth option in the drop-down
     * @param five The fifth option in the drop-down
     * @param six The sixth option in the drop-down
     * @param seven The seventh option in the drop-down
     * @param eight The eighth option in the drop-down
     * @param nine The ninth option in the drop-down
     * @param ten The tenth option in the drop-down
     * @param notTopTen The option that is not in the top ten list
     */
    @Then("{string} field is mandatory drop-down with the following options {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void field_is_mandatory_drop_down_with_the_following_options(String rank, String one, String two, String three, String four, String five, String six, String seven, String eight, String nine, String ten, String notTopTen) {
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_rank\"]")).containsText("Rank");
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByText("Rank")).isVisible();
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(one);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(one);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(two);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(two);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(three);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(three);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(four);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(four);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(five);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(five);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(six);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(six);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(seven);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(seven);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(eight);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(eight);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(nine);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(nine);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(ten);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(ten);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank").selectOption(notTopTen);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Rank")).hasValue(notTopTen);
    }

    /**
     * Verifies that the Fiscal Year field is a mandatory dropdown with the options for the Previous year and Current year.
     *
     * @param fiscalYear The label indicating the fiscal year field
     * @param previousYear The option for the previous year in the dropdown
     * @param currentYear The option for the current year in the dropdown
     */
    @Then("{string} field is mandatory dropdown with the following options for Previous year {string}, and Current year {string}")
    public void field_is_mandatory_dropdown_with_the_following_options_for_previous_year_and_current_year(String fiscalYear, String previousYear, String currentYear) {
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByText("Fiscal Year")).isVisible();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_fiscal_year\"]")).containsText(fiscalYear);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Fiscal Year").selectOption(previousYear);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Fiscal Year")).hasValue(previousYear);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Fiscal Year").selectOption(currentYear);
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Fiscal Year")).hasValue(currentYear);
    }

    /**
     * Verifies that the Title field is a mandatory short text field with the given title.
     *
     * @param title The title of the field to be verified as mandatory short text field
     */
    @Then("{string} field is mandatory short text field")
    public void field_is_mandatory_short_text_field(String title) {
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByText(title, new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_title\"]")).containsText(title);
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel(title, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Title", new FrameLocator.GetByLabelOptions().setExact(true)).fill("Top Accomplishment Submission");
        assertThat(page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Title", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("Top Accomplishment Submission");
        page.frameLocator("iframe[name=\"gsft_main\"]").locator("[id=\"element\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_title\"]").click();
    }
}