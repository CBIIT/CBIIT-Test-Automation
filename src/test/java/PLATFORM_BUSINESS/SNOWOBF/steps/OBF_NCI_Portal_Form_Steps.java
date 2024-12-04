package PLATFORM_BUSINESS.SNOWOBF.steps;

import ServiceNow.PLATFORM_BUSINESS.SNOWOBF.StepImpl.OBF_NCI_Portal_Form_StepImpl;
import APPS_COMMON.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OBF_NCI_Portal_Form_Steps {

    @Given("I am an authenticated CBIIT user")
    public void i_am_an_authenticated_cbiit_user() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
    }

    @When("I navigate to the NCI ServiceNow homepage {string} portal form")
    public void i_navigate_to_the_nci_service_now_homepage_portal_form(String obfSupportSystemTitle) {
        OBF_NCI_Portal_Form_StepImpl.i_navigate_to_the_nci_service_now_homepage_portal_form(obfSupportSystemTitle);
    }

    @Then("I should see that I can navigate to the OBF Systems Support application.")
    public void i_should_see_that_i_can_navigate_to_the_obf_systems_support_application() {
        OBF_NCI_Portal_Form_StepImpl.i_should_see_that_i_can_navigate_to_the_obf_systems_support_application();
    }

    @Then("I show see the following Text at the top of the catalog item")
    public void i_show_see_the_following_text_at_the_top_of_the_catalog_item(String expectedText) {
        OBF_NCI_Portal_Form_StepImpl.i_show_see_the_following_text_at_the_top_of_the_catalog_item(expectedText);
    }
}