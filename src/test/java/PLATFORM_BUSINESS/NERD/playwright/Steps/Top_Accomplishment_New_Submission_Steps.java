package PLATFORM_BUSINESS.NERD.playwright.Steps;

import PLATFORM_BUSINESS.NERD.playwright.StepImplementation.Top_Accomplishment_New_Submission_StepImpl;
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
import org.junit.Assert;
import java.util.regex.Pattern;
import static APPS_COMMON.Pages.Playwright_Common_Locators.iframeLocator;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class Top_Accomplishment_New_Submission_Steps {

    public static Page nedUserPage;

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
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * They can create a record called Top Accomplishment submission.
     *
     * @param topAccomplishments The record to be created
     */
    @Then("they can create a record called {string}")
    public void they_can_create_a_record_called(String topAccomplishments) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("#category-segmentedtab")).containsText(topAccomplishments);
        page.frameLocator("iframe[name='gsft_main']").locator("//a[@class='ng-binding ng-scope selected']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Create Article")).isVisible();

        CucumberLogUtils.scenario.log("----  CLICK ON CREATE NEW ARTICLE  ----");
        page.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Create an Article']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Create new article")).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByPlaceholder("Filter article templates").click();
        page.frameLocator("iframe[name='gsft_main']").getByPlaceholder("Filter article templates").fill(topAccomplishments);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByPlaceholder("Filter article templates")).hasValue(topAccomplishments);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  CLICK ON TOP ACCOMPLISHMENTS OPTION AND THEN CLICK ON NEXT PAGE ----");
        page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(topAccomplishments)).click();
        page.frameLocator("iframe[name='gsft_main']").locator("(//div[normalize-space()='Next'])[1]").click();
        page.frameLocator("iframe[name='gsft_main']").locator("//div[@class='navbar-title-caption navbar-title-new-record']").waitFor();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.HEADING)).containsText("Top Accomplishments");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.HEADING)).containsText("New record");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Knowledge Base", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("NERD");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method adds attachments via the record itself by clicking on the "Add Attachment" button,
     * and uploads a PDF attachment, and then close the attachment dialog.
     */
    @Then("add attachments via the record itself")
    public void add_attachments_via_the_record_itself() {
        page.frameLocator("iframe[name='gsft_main']").locator("//button[@id='add_attachment']").waitFor();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("//button[@id='add_attachment']")).containsText("Add Attachment");
        Top_Accomplishment_New_Submission_StepImpl.uploadAttachmentInNativeView();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     *  This method verifies that the Category field populates with the Top Accomplishment value and verifies the population.
     *
     * @param category The category to be verified in the field
     * @param topAccomplishments The value to be verified in the field
     */
    @Then("{string} Field Auto Populated with the following value {string}")
    public void field_auto_populated_with_the_following_value(String category, String topAccomplishments) {
        assertThat(page.frameLocator(iframeLocator).locator("[id='label\\.u_kb_template_top_accomplishments\\.kb_category']")).containsText(category);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Category")).hasValue(topAccomplishments);
        CucumberLogUtils.playwrightScreenshot(page);
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

        CucumberLogUtils.scenario.log("----  SELECTS EACH RANK OPTION AND VERIFY THE SELECTED OPTION ----");
        assertThat(page.frameLocator(iframeLocator).locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_rank']")).containsText(rank);
        assertThat(page.frameLocator(iframeLocator).getByText("Rank")).isVisible();
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(one);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).hasValue(one);
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(two);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).hasValue(two);
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(three);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).hasValue(three);
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(four);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).hasValue(four);
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(five);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).hasValue(five);
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(six);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).hasValue(six);
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(seven);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).hasValue(seven);
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(eight);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).hasValue(eight);
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(nine);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).hasValue(nine);
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(ten);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).hasValue(ten);
        page.frameLocator(iframeLocator).getByLabel("Rank").selectOption(notTopTen);
        assertThat(page.frameLocator(iframeLocator).getByLabel("Rank")).containsText(notTopTen);
        CucumberLogUtils.playwrightScreenshot(page);
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
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Fiscal Year")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_fiscal_year']")).containsText(fiscalYear);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Fiscal Year").selectOption(previousYear);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Fiscal Year")).hasValue(previousYear);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Fiscal Year").selectOption(currentYear);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Fiscal Year")).hasValue(currentYear);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the Title field is a mandatory short text field with the given title.
     *
     * @param title The title of the field to be verified as mandatory short text field
     */
    @Then("{string} field is mandatory short text field")
    public void field_is_mandatory_short_text_field(String title) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText(title, new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_title']")).containsText(title);
        page.frameLocator("iframe[name='gsft_main']").getByLabel(title, new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Title", new FrameLocator.GetByLabelOptions().setExact(true)).fill("Top Accomplishment Submission");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Title", new FrameLocator.GetByLabelOptions().setExact(true))).hasValue("Top Accomplishment Submission");
        page.frameLocator("iframe[name='gsft_main']").locator("[id='element\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_title']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that a DOC field is a mandatory drop down with the applicable DOCs.
     * The default selected option is "-- None --".
     * This method selects each DOC option and verifies the selected option.
     * Then, it selects the Rank option again since it resets after fiscal year and DOC selection and verifies the selected option.
     *
     * @param doc The value for the DOC field.
     * @param cbiit The value for the CBIIT option.
     * @param ccct The value for the CCCT option.
     * @param ccg The value for the CCG option.
     * @param ccr The value for the CCR option.
     * @param cct The value for the CCT option.
     * @param cgh The value for the CGH option.
     * @param crchd The value for the CRCHD option.
     * @param crs The value for the CRS option.
     * @param cssi The value for the CSSI option.
     * @param dcb The value for the DCB option.
     * @param dccps The value for the DCCPS option.
     * @param dceg The value for the DCEG option.
     * @param dcp The value for the DCP option.
     * @param dctd The value for the DCTD option.
     * @param frederick The value for the FREDERICK option.
     * @param occ The value for the OCC option.
     * @param oham The value for the OHAM option.
     * @param sbir The value for the SBIR option.
     * @param ttc The value for the TTC option.
     */
    @Then("{string} field is mandatory drop down with the applicable DOCs, None \\(selected by default), {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string},{string}, {string}")
    public void field_is_mandatory_drop_down_with_the_applicable_do_cs_none_selected_by_default(String doc, String cbiit, String ccct, String ccg, String ccr, String cct, String cgh, String crchd, String crs, String cssi,
                                                                                                String dcb, String dccps, String dceg, String dcp, String dctd, String frederick, String occ, String oham, String sbir, String ttc) {

        CucumberLogUtils.scenario.log("----  SELECTS EACH DOC OPTION AND VERIFY THE SELECTED OPTION ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText(doc)).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_doc']")).containsText(doc);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText("-- None --");
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(cbiit);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(cbiit);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(ccct);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(ccct);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(ccg);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(ccg);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(ccr);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(ccr);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(cct);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(cct);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(cgh);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(cgh);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(crchd);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(crchd);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(crs);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(crs);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(cssi);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(cssi);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(dcb);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(dcb);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(dccps);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(dccps);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(dceg);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(dceg);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(dcp);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(dcp);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(dctd);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(dctd);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(frederick);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(frederick);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(occ);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(occ);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(oham);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(oham);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(sbir);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(sbir);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true)).selectOption(ttc);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("DOC", new FrameLocator.GetByLabelOptions().setExact(true))).containsText(ttc);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    @Then("the rank field clears out and all the {string} options are reset to select again when the Fiscal Year and Doc field is changed")
    public void the_rank_field_clears_out_and_all_the_options_are_reset_to_select_again_when_the_fiscal_year_and_doc_field_is_changed(String rank) {

        CucumberLogUtils.scenario.log("----  SELECTS THE RANK OPTION AGAIN SINCE IT RESETS AFTER FISCAL YEAR AND DOC SELECTION AND VERIFY THE SELECTED OPTION ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_rank']")).containsText(rank);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Rank")).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Rank").selectOption("Not Top 10");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Rank")).containsText("Not Top 10");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the 'Description' field is mandatory open HTML text field with subtext when hovering over the Description field.
     *
     * @param description The expected description text to be validated in the field
     * @param subText The expected subtext to be validated when hovering over the description field
     */
    @Then("{string} field is mandatory open HTML text field with subtext of {string} when hover over the Description field")
    public void field_is_mandatory_open_html_text_field_with_subtext_of_when_hover_over_the_description_field(String description, String subText) {

        page.frameLocator("iframe[name='gsft_main']").locator("//span[normalize-space()='Description']//parent::label//child::span[1]").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_description']")).containsText(description);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.TOOLTIP, new FrameLocator.GetByRoleOptions().setName("(3 - 4 sentences max) –"))).containsText(subText);
        page.frameLocator("iframe[name='gsft_main']").frameLocator("internal:role=application[name='Description'i] >> iframe[title='Rich Text Area']").getByRole(AriaRole.PARAGRAPH).click();
        page.frameLocator("iframe[name='gsft_main']").frameLocator("internal:role=application[name='Description'i] >> iframe[title='Rich Text Area']").getByLabel("Description").fill("Test Description");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Checks if a 'Research Type/Other Programs' field is mandatory drop-down with None selected by default.
     * and verify thr following fields are drop down for the 'Research Type/Other Programs' field
     *
     * @param researchTypeField the field for research type
     * @param basic the basic option for the drop-down
     * @param cancerControl the cancer control option for the drop-down
     * @param epidemiological the epidemiological option for the drop-down
     * @param healthCommunication the health communication option for the drop-down
     * @param populationScience the population science option for the drop-down
     * @param researchWorkforceRecruitmentTrainingAndRetention the research workforce recruitment training and retention option for the drop-down
     * @param scienceEducationAndLiteracy the science education and literacy option for the drop-down
     * @param translationalPostClinical the translational post-clinical option for the drop-down
     * @param translationalPreClinical the translational pre-clinical option for the drop-down
     * @param other the other option for the drop-down
     */
    @Then("{string} field is mandatory drop-down, None \\(selected by default), {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void field_is_mandatory_drop_down_none_selected_by_default(String researchTypeField, String basic, String cancerControl, String epidemiological, String healthCommunication, String populationScience,
                                                                      String researchWorkforceRecruitmentTrainingAndRetention, String scienceEducationAndLiteracy, String translationalPostClinical, String translationalPreClinical, String other) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_research_type_other_programs']")).containsText(researchTypeField);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText("-- None --");
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs").selectOption(basic);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText(basic);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).hasValue(basic);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs").selectOption(cancerControl);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText(cancerControl);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).hasValue(cancerControl);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs").selectOption(epidemiological);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText(epidemiological);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).hasValue(epidemiological);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs").selectOption(healthCommunication);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText(healthCommunication);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).hasValue(healthCommunication);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs").selectOption(populationScience);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText(populationScience);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).hasValue(populationScience);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs").selectOption(researchWorkforceRecruitmentTrainingAndRetention);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText(researchWorkforceRecruitmentTrainingAndRetention);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).hasValue(researchWorkforceRecruitmentTrainingAndRetention);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs").selectOption(scienceEducationAndLiteracy);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText(scienceEducationAndLiteracy);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).hasValue(scienceEducationAndLiteracy);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs").selectOption(translationalPostClinical);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText(translationalPostClinical);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).hasValue(translationalPostClinical);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs").selectOption(translationalPreClinical);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText(translationalPreClinical);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).hasValue(translationalPreClinical);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs").selectOption(other);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).containsText(other);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Research Type/Other Programs")).hasValue(other);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Asserts that the subtext of a Research Type/Other Programs field is displayed when hovering over Research Type/Other Programs field.
     * Firstly, it verifies that the specified 'researchTypeField' is displayed through an assertion.
     * Then, it hovers over the "Research Type/Other Programs" label.
     * Subsequently, it asserts that a certain text is visible on the page and contains the provided 'subText'.
     *
     * @param subText The expected subtext to be displayed when hovering over the field.
     * @param researchTypeField The field over which to hover to trigger the display of the subtext.
     */
    @Then("subtext of {string} when hover over the {string} field")
    public void subtext_of_when_hover_over_the_field(String subText, String researchTypeField) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_research_type_other_programs']")).containsText(researchTypeField);
        page.frameLocator("iframe[name='gsft_main']").locator("label").filter(new Locator.FilterOptions().setHasText("Research Type/Other Programs")).hover();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Please select the most")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Please select the most")).containsText(subText);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Checks if the Other Topics field is an optional selection to select one or multiple options via a list collector.
     * The default selection is None.
     *
     * @param otherTopics the value for other topics
     * @param bigDataSharing the value for big data sharing
     * @param moonshot the value for moonshot
     * @param technologyDevelopment the value for technology development
     * @param covid19 the value for COVID-19
     * @param pediatric the value for pediatric
     * @param researchResourcesInfrastructure the value for research resources and infrastructure
     * @param earlyDetection the value for early detection
     * @param rare the value for rare
     * @param meetingWorkshopConference the value for meeting, workshop, conference
     * @param metastatic the value for metastatic
     * @param trainingWorkforceDevelopment the value for training and workforce development
     * @param reportGuidelinesPolicy the value for report, guidelines, and policy
     * @param minorityHealthDisparities the value for minority health disparities
     * @param womenHealth the value for women's health
     */
    @Then("{string} field is an optional selection to select one or multiple via a list collector, None \\(selected by default), {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void field_is_an_optional_selection_to_select_one_or_multiple_via_a_list_collector_none_selected_by_default(String otherTopics, String bigDataSharing, String moonshot, String technologyDevelopment, String covid19, String pediatric, String researchResourcesInfrastructure,
                                                                          String earlyDetection, String rare, String meetingWorkshopConference, String metastatic, String trainingWorkforceDevelopment, String reportGuidelinesPolicy, String minorityHealthDisparities, String womenHealth) {

        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(otherTopics);
        page.frameLocator("iframe[name='gsft_main']").locator("label").filter(new Locator.FilterOptions().setHasText("Other Topics")).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Unlock Other Topics").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='select_0u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).isEmpty();

        CucumberLogUtils.scenario.log("---- NONE IS SELECTED BY DEFAULT ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText("-- None --");
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(bigDataSharing);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(bigDataSharing);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(bigDataSharing);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(moonshot);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(moonshot);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(moonshot);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(technologyDevelopment);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(technologyDevelopment);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(technologyDevelopment);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(covid19);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(covid19);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(covid19);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(pediatric);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(pediatric);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(pediatric);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(researchResourcesInfrastructure);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(researchResourcesInfrastructure);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(researchResourcesInfrastructure);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(earlyDetection);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(earlyDetection);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(earlyDetection);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(rare);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(rare);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(rare);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(meetingWorkshopConference);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(meetingWorkshopConference);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(meetingWorkshopConference);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(metastatic);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(metastatic);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(metastatic);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(trainingWorkforceDevelopment);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(trainingWorkforceDevelopment);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(trainingWorkforceDevelopment);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(reportGuidelinesPolicy);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(reportGuidelinesPolicy);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(reportGuidelinesPolicy);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(minorityHealthDisparities);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(minorityHealthDisparities);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(minorityHealthDisparities);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']").selectOption(womenHealth);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).hasValue(womenHealth);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_topics']")).containsText(womenHealth);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies the subtext displayed when hovering over the Other Topics field.
     *
     * @param subText the expected subtext to be displayed when hovering over the Other Topics field
     */
    @Then("subtext of {string} when hover over the Other Topics field")
    public void subtext_of_when_hover_over_the_other_topics_field(String subText) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Other Topics", new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByText("Other Topics", new FrameLocator.GetByTextOptions().setExact(true)).hover();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.TOOLTIP, new FrameLocator.GetByRoleOptions().setName("Please select the most"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Please select the most")).containsText(subText);
        page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Lock Other Topics")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method verifies that a Cancer Site or Type field is an optional selection to select one or multiple options via a list collector.
     * By default, None is selected.
     *
     * @param cancerSiteOrType the cancer site or type
     * @param generalCancerNotSpecificCancer option for General Cancer/Not Specific Cancer
     * @param gallbladder option for Gallbladder
     * @param melanoma option for Melanoma
     * @param bladder option for Bladder
     * @param gastricStomach option for Gastric/Stomach
     * @param multipleMyeloma option for Multiple Myeloma
     * @param brain option for Brain
     * @param glioblastoma option for Glioblastoma
     * @param neuroblastoma option for Neuroblastoma
     * @param breast option for Breast
     * @param headAndNeck option for Head and Neck
     * @param ovarian option for Ovarian
     * @param centralNervousSystem option for Central Nervous System
     * @param kidney option for Kidney
     * @param pancreatic option for Pancreatic
     * @param cervical option for Cervical
     * @param leukemia option for Leukemia
     * @param prostate option for Prostate
     * @param colonColorectal option for Colon/Colorectal
     * @param liver option for Liver
     * @param sarcoma option for Sarcoma
     * @param endometrial option for Endometrial
     * @param lung option for Lung
     * @param skin option for Skin
     * @param esophageal option for Esophageal
     * @param lymphoma option for Lymphoma
     * @param thyroid option for Thyroid
     */
    @Then("{string} field is an optional selection to select one or multiple via a list collector, None \\(selected by default), {string}, {string},{string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void field_is_an_optional_selection_to_select_one_or_multiple_via_a_list_collector_none_selected_by_default(String cancerSiteOrType, String generalCancerNotSpecificCancer, String gallbladder, String melanoma, String bladder, String gastricStomach, String multipleMyeloma, String brain, String glioblastoma, String neuroblastoma, String breast, String headAndNeck, String ovarian,
                                                                                                                       String centralNervousSystem, String kidney, String pancreatic, String cervical, String leukemia, String prostate, String colonColorectal, String liver, String sarcoma, String endometrial, String lung, String skin, String esophageal, String lymphoma, String thyroid) {

        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Cancer Site/Type", new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(cancerSiteOrType);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Unlock Cancer Site/Type").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='select_0u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).isEmpty();

        CucumberLogUtils.scenario.log("---- NONE IS SELECTED BY DEFAULT ----");
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText("-- None --");
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(generalCancerNotSpecificCancer);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(generalCancerNotSpecificCancer);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(generalCancerNotSpecificCancer);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(gallbladder);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(gallbladder);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(gallbladder);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(melanoma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(melanoma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(melanoma);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(bladder);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(bladder);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(bladder);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(gastricStomach);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(gastricStomach);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(gastricStomach);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(multipleMyeloma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(multipleMyeloma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(multipleMyeloma);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(brain);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(brain);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(brain);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(glioblastoma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(glioblastoma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(glioblastoma);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(neuroblastoma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(neuroblastoma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(neuroblastoma);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(breast);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(breast);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(breast);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(headAndNeck);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(headAndNeck);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(headAndNeck);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(ovarian);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(ovarian);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(ovarian);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(centralNervousSystem);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(centralNervousSystem);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(centralNervousSystem);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(kidney);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(kidney);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(kidney);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(pancreatic);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(pancreatic);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(pancreatic);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(cervical);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(cervical);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(cervical);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(leukemia);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(leukemia);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(leukemia);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(prostate);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(prostate);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(prostate);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(colonColorectal);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(colonColorectal);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(colonColorectal);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(liver);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(liver);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(liver);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(sarcoma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(sarcoma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(sarcoma);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(endometrial);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(endometrial);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(endometrial);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(lung);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(lung);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(lung);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(skin);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(skin);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(skin);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(esophageal);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(esophageal);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(esophageal);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(lymphoma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(lymphoma);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(lymphoma);
        page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']").selectOption(thyroid);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).hasValue(thyroid);
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='choice\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_cancer_site_type']")).containsText(thyroid);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies the subtext displayed when hovering over a Cancer Site/Type field.
     *
     * @param subText The expected subtext to verify.
     * @param cancerSiteOrType The cancer site or type field to hover over.
     */
    @Then("verify the subtext of {string} when hover over the {string} field")
    public void verify_the_subtext_of_when_hover_over_the_field(String subText, String cancerSiteOrType) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Cancer Site/Type", new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Cancer Site/Type", new FrameLocator.GetByTextOptions().setExact(true))).containsText(cancerSiteOrType);
        page.frameLocator("iframe[name='gsft_main']").getByText("Cancer Site/Type", new FrameLocator.GetByTextOptions().setExact(true)).hover();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.TOOLTIP, new FrameLocator.GetByRoleOptions().setName("Please select a specific"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.TOOLTIP, new FrameLocator.GetByRoleOptions().setName("Please select a specific"))).containsText(subText);
        page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Lock Cancer Site/Type")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies the Collaborations text field
     *
     * @param collaborations the text to be verified in the HTML text field
     */
    @Then("{string} is an optional open HTML text field")
    public void is_an_optional_open_html_text_field(String collaborations) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("label").filter(new Locator.FilterOptions().setHasText("Collaborations"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_collaborations']")).containsText(collaborations);
        page.frameLocator("iframe[name='gsft_main']").getByText("Collaborations", new FrameLocator.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Retrieves the subtext displayed when hovering over the Collaborations field.
     * Verifies that the Collaborations field is visible, hovers over it to trigger the tooltip,
     * and then validates that the tooltip contains the provided subtext.
     *
     * @param subText The expected subtext to be validated in the tooltip
     */
    @Then("subtext of {string} when hover over the Collaborations field")
    public void subtext_of_when_hover_over_the_collaborations_field(String subText) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Collaborations", new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByText("Collaborations", new FrameLocator.GetByTextOptions().setExact(true)).hover();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.TOOLTIP, new FrameLocator.GetByRoleOptions().setName("Indicate the ICOs / agencies"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.TOOLTIP, new FrameLocator.GetByRoleOptions().setName("Indicate the ICOs / agencies"))).containsText(subText);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Checks if the given references text is displayed in an optional short text field.
     *
     * @param references The text to be checked for in the optional short text field
     */
    @Then("{string} is an optional short text field")
    public void is_an_optional_short_text_field(String references) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("References", new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_references']")).containsText(references);
        page.frameLocator("iframe[name='gsft_main']").getByText("References", new FrameLocator.GetByTextOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").frameLocator("internal:role=application[name='References's] >> iframe[title='Rich Text Area']").getByRole(AriaRole.PARAGRAPH).click();
        page.frameLocator("iframe[name='gsft_main']").frameLocator("internal:role=application[name='References's] >> iframe[title='Rich Text Area']").getByLabel("References").fill("Test");
        page.frameLocator("iframe[name='gsft_main']").getByText("ReferencesRemove lines from References script areaAdd lines to References").click();
        page.frameLocator("iframe[name='gsft_main']").frameLocator("internal:role=application[name='References's] >> iframe[title='Rich Text Area']").locator("html").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Validates that the subtext displayed when hovering over the References field contains the specified text.
     *
     * @param subText The text to be verified in the subtext displayed when hovering over the References field
     */
    @Then("subtext of {string} when hover over the References field")
    public void subtext_of_when_hover_over_the_references_field(String subText) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("References", new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByText("References", new FrameLocator.GetByTextOptions().setExact(true)).hover();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.TOOLTIP, new FrameLocator.GetByRoleOptions().setName("Please list PMIDs only,"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.TOOLTIP, new FrameLocator.GetByRoleOptions().setName("Please list PMIDs only,"))).containsText(subText);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies the Other References field
     *
     * @param otherReferences The text to be checked in the short text field
     */
    @Then("{string} is short text field")
    public void is_short_text_field(String otherReferences) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Other References", new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_other_references']")).containsText(otherReferences);
        page.frameLocator("iframe[name='gsft_main']").getByText("Other References", new FrameLocator.GetByTextOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").frameLocator("internal:role=application[name='References's] >> iframe[title='Rich Text Area']").getByRole(AriaRole.PARAGRAPH).click();
        page.frameLocator("iframe[name='gsft_main']").frameLocator("internal:role=application[name='References's] >> iframe[title='Rich Text Area']").getByLabel("References").fill("Test");
        page.frameLocator("iframe[name='gsft_main']").getByText("ReferencesRemove lines from References script areaAdd lines to References").click();
        page.frameLocator("iframe[name='gsft_main']").frameLocator("internal:role=application[name='References's] >> iframe[title='Rich Text Area']").locator("html").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Retrieves the subtext displayed when the user hovers over the Other References field.
     *
     * @param subText the text to be displayed when hovering over the Other References field
     */
    @Then("subtext of {string} when hover over the Other References field")
    public void subtext_of_when_hover_over_the_other_references_field(String subText) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Other References", new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByText("Other References", new FrameLocator.GetByTextOptions().setExact(true)).hover();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Please list grant numbers,")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Please list grant numbers,")).containsText(subText);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Method to verify if a given Point of Contact field is an optional list collector field
     * and offers multi-selection so more than one Point of Contact can be selected.
     *
     * @param pointOfContact The Point of Contact value to be verified on the page
     */
    @Then("{string} is an optional list collector field AND offers multi-selection so more than one Point of Contact can be selected")
    public void is_an_optional_list_collector_field_and_offers_multi_selection_so_more_than_one_point_of_contact_can_be_selected(String pointOfContact) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("label").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Point of Contact$")))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_point_of_contact']")).containsText(pointOfContact);
        page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Point of Contact Add me")).click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='u_kb_template_top_accomplishments\\.x_26385_crs_kd_point_of_contact_nonedit']")).containsText("CBIIT Test Account");
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Unlock Point of Contact").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Lookup using list"))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByPlaceholder("Select target record")).isVisible();
        nedUserPage = page.waitForPopup(() -> {
            page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Lookup using list")).click();
        });
        CucumberLogUtils.playwrightScreenshot(nedUserPage);
        assertThat(nedUserPage.locator("//td[@class='text-align-right']")).isVisible();
        assertThat(nedUserPage.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Margie Blochlinger"))).containsText("Margie Blochlinger");
        CucumberLogUtils.playwrightScreenshot(nedUserPage);
        nedUserPage.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Margie Blochlinger")).click();
        nedUserPage.close();
        CommonUtils.sleep(2000);
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText("Point of Contact", new FrameLocator.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Lock Point of Contact"))).isVisible();
        page.frameLocator("iframe[name='gsft_main']").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Lock Point of Contact")).click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='u_kb_template_top_accomplishments\\.x_26385_crs_kd_point_of_contact_nonedit']")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator(".section_header_html_no_scroll")).containsText("Point of Contact");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Checks if the Point of Contact Email field is an optional field that gets populated with the email of the user selected from the Point of Contact field
     *
     * @param pointOfContactEmailField the field that is expected to be populated with the email of the user selected from the Point of Contact field
     */
    @Then("{string} is an optional field THAT gets populated with the email of the user selected from the Point of Contact field")
    public void is_an_optional_field_that_gets_populated_with_the_email_of_the_user_selected_from_the_point_of_contact_field(String pointOfContactEmailField) {
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='u_kb_template_top_accomplishments\\.x_26385_crs_kd_point_of_contact_nonedit']")).containsText("CBIIT Test Account, Margie Blochlinger");
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByText(pointOfContactEmailField)).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").locator("[id='label\\.u_kb_template_top_accomplishments\\.x_26385_crs_kd_point_of_contact_email']")).containsText(pointOfContactEmailField);
        page.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_insert_and_stay_bottom']").isVisible();
        page.frameLocator("iframe[name='gsft_main']").locator("//button[@id='sysverb_insert_and_stay_bottom']").click();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Point of Contact Email")).isVisible();
        assertThat(page.frameLocator("iframe[name='gsft_main']").getByLabel("Point of Contact Email")).containsText("juan.fourie@nih.gov,margie.blochlinger@nih.gov");
        boolean emailPresent = page.frameLocator("iframe[name='gsft_main']").locator("//textarea[@id='sys_readonly.u_kb_template_top_accomplishments.x_26385_crs_kd_point_of_contact_email']").isVisible();
        Assert.assertTrue("Expected email is not present on the page", emailPresent);
        CucumberLogUtils.playwrightScreenshot(page);

        CucumberLogUtils.scenario.log("----  DELETES THE RECORD SO RANK OPTION CAN BE AVAILABLE FOR NEXT RUN ----");
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#sysverb_delete")).isVisible();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#sysverb_delete")).containsText("Delete");
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#sysverb_delete").click();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Confirmation Help").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Delete"))).isVisible();
        assertThat(page.locator("iframe[name=\"gsft_main\"]").contentFrame().locator("#ok_button")).containsText("Delete");
        page.locator("iframe[name=\"gsft_main\"]").contentFrame().getByLabel("Confirmation Help").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Delete")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}