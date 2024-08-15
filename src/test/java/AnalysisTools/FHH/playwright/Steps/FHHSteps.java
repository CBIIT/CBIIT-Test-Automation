package AnalysisTools.FHH.playwright.Steps;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class FHHSteps extends PlaywrightUtils {

    @Given("the user is on the FHH home page")
    public void the_user_is_on_the_fhh_home_page() {
        PlaywrightUtils.page.navigate("https://familyhistory-dev.cancer.gov/html/index.html");
    }

    @When("the user click {string}")
    public void the_user_click(String createFHH) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(createFHH)).click();
    }

    @When("fills out the screener with {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fills_out_the_screener_with(String name, String gender, String monthOfBirth, String yearOfBirth, String dayOfBirth, String height, String weight) {
        page.getByLabel("*Name:").click();
        page.getByLabel("*Name:").fill(name);
        page.getByRole(AriaRole.RADIO, new Page.GetByRoleOptions().setName(gender).setExact(true)).check();
        page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("Select date")).click();
        page.getByRole(AriaRole.COMBOBOX).nth(3).selectOption(monthOfBirth);
        page.getByRole(AriaRole.COMBOBOX).nth(4).selectOption(yearOfBirth);
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(dayOfBirth).setExact(true)).click();
        page.getByLabel("Feet").click();
        page.getByLabel("Feet").fill(height);
        page.getByLabel("Inches").click();
        page.getByLabel("Inches").fill("0");
        page.getByLabel("Weight").click();
        page.getByLabel("Weight").fill(weight);
        page.getByLabel("Enter Personal Information", new Page.GetByLabelOptions().setExact(true)).locator("#disease_choice_select").selectOption("Cancer");
        page.getByLabel("Enter Personal Information", new Page.GetByLabelOptions().setExact(true)).locator("#detailed_disease_choice_select").selectOption("SNOMED_CT-269466003");
        page.getByLabel("Enter Personal Information", new Page.GetByLabelOptions().setExact(true)).locator("#age_at_diagnosis_select").selectOption("teen");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
        page.getByLabel("White").check();
        page.getByLabel("Hispanic or Latino", new Page.GetByLabelOptions().setExact(true)).check();
        page.getByLabel("Central American").check();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
        page.locator("#family_brothers").click();
        page.locator("#family_brothers").fill("2");
        page.locator("#family_sisters").click();
        page.locator("#family_sisters").fill("1");
        page.locator("#family_sons").click();
        page.locator("#family_sons").fill("0");
        page.locator("#family_daughters").click();
        page.locator("#family_daughters").fill("0");
        page.locator("#family_maternal_uncles").click();
        page.locator("#family_maternal_uncles").fill("7");
        page.locator("#family_maternal_aunts").click();
        page.locator("#family_maternal_aunts").fill("2");
        page.locator("#family_paternal_uncles").click();
        page.locator("#family_paternal_uncles").fill("3");
        page.locator("#family_paternal_aunts").click();
        page.locator("#family_paternal_aunts").fill("2");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
    }


    @Then("the {string}, {string}, and {string}, and {string} link is displayed")
    public void the_and_and_link_is_displayed(String checkFHHRisk, String colCancer, String heartDisease, String diabetes) {
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(checkFHHRisk)).click();
        assertThat(page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(colCancer)).getByRole(AriaRole.IMG).first()).isVisible();
        assertThat(page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(heartDisease)).getByRole(AriaRole.IMG).first()).isVisible();
        assertThat(page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName(diabetes)).getByRole(AriaRole.IMG).first()).isVisible();
    }

    @When("user clicks the {string} button")
    public void user_clicks_the_button(String string) {
    }

    @When("the user uploads {string}")
    public void the_user_uploads(String string) {
    }

    @Then("the {string}, {string}, {string}, {string}, {string} table headers are displayed")
    public void the_table_headers_are_displayed(String string, String string2, String string3, String string4, String string5) {
    }
}