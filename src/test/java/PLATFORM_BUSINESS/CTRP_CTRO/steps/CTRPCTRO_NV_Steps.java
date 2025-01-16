package PLATFORM_BUSINESS.CTRP_CTRO.steps;

import PLATFORM_BUSINESS.CTRP_CTRO.stepsImplementation.CTRPCTRO_NV_StepImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CTRPCTRO_NV_Steps {

    @Given("a CTRP CTRO Helpdesk Case")
    public void a_ctrp_ctro_helpdesk_case() {
        CTRPCTRO_NV_StepImpl.a_ctrp_ctro_helpdesk_case();
    }

    @When("users select {string}")
    public void users_select(String category) {
      CTRPCTRO_NV_StepImpl.users_select(category);
    }

    @Then("a new category called {string} is added")
    public void a_new_category_called_is_added(String nciDCCAccrualReport) {
    CTRPCTRO_NV_StepImpl.a_new_category_called_is_added(nciDCCAccrualReport);
    }

    @Then("following options are available in the Subcategory field when the NCI DCC Accrual Report Category is selected: {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void following_options_are_available_in_the_subcategory_field_when_the_nci_dcc_accrual_report_category_is_selected(String accountRelated,
    String dataReview, String feedBack, String generalInquiries, String policyDecision, String technicalIssues, String training) {
    CTRPCTRO_NV_StepImpl.following_options_are_available_in_the_subcategory_field_when_the_nci_dcc_accrual_report_category_is_selected(
    accountRelated, dataReview, feedBack,generalInquiries, policyDecision, technicalIssues, training);
    }

    @Given("a user is on the CTRP CTRO Helpdesk Case form")
    public void a_user_is_on_the_ctrp_ctro_helpdesk_case_form() {
        CTRPCTRO_NV_StepImpl.a_user_is_on_the_ctrp_ctro_helpdesk_case_form();
    }

    @Then("the {string} category option is placed ABOVE the {string} category")
    public void the_category_option_is_placed_above_the_category(String nciDCCAccrualReport, String OnHoldTrials) {
        CTRPCTRO_NV_StepImpl.the_category_option_is_placed_above_the_category(nciDCCAccrualReport, OnHoldTrials);
    }

    @Then("all categories are displayed in alphabetical order")
    public void all_categories_are_displayed_in_alphabetical_order() {
        CTRPCTRO_NV_StepImpl.all_categories_are_displayed_in_alphabetical_order();
    }
}