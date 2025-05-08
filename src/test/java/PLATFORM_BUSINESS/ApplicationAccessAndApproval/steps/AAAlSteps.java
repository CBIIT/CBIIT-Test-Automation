package PLATFORM_BUSINESS.ApplicationAccessAndApproval.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import PLATFORM_BUSINESS.ApplicationAccessAndApproval.stepsImplementation.AAAStepsImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static APPS_COMMON.PageInitializers.PageInitializer.aaaPage;
import static APPS_COMMON.PageInitializers.PageInitializer.aaaStepsImplementation;
import static Hooks.Hooks.softAssert;

public class AAAlSteps {

    @Given("Submitter User logged in to AAA Portal")
    public void submitter_user_logged_in_to_aaa_portal() {
        AAAStepsImplementation.UserLogin();
    }

    @Given("User navigates to AAA form via menu")
    public void user_navigates_to_aaa_form_via_menu() {
       AAAStepsImplementation.navigateToAAAViaPortalView();
    }

    @Then("Submitter User can verify they are on the AAA form")
    public void submitter_user_can_verify_they_are_on_the_aaa_form() {
      AAAStepsImplementation.verifyAAAPageTitle();
    }

    /**
     *Verify page header is displayed
     */
    @Given("User is on AAA form portal view")
    public void user_is_on_aaa_form_portal_view() {
        softAssert.assertTrue(aaaPage.aaaPageHeader.isDisplayed());
    }

    @Given("User can see Requested for dropdown")
    public void user_can_see_requested_for_dropdown() {
      AAAStepsImplementation.verifyRequestedForDropdown();
    }

    @Given("User can see Requested for field is prepoluated")
    public void user_can_see_requested_for_field_is_prepoluated() {
        AAAStepsImplementation.verifyRequestedForFieldPopulated();
    }

    @Given("User can see Requested for Email is prepoluated")
    public void user_can_see_requested_for_email_is_prepoluated() {
      AAAStepsImplementation.verifyRequestedForEmailFieldPopulated();
    }

    @Given("User can see Requested for Organization Affiliation is prepopulated")
    public void user_can_see_requested_for_organization_affiliation_is_prepopulated() {
        AAAStepsImplementation.verifyOrganizationAffiliationFieldPopulated();
    }

    @Given("User can see System Name dropdown")
    public void user_can_see_system_name_dropdown() {
      AAAStepsImplementation.verifyRequestedForEmailFieldDisplayed();
    }

    @Given("User can see Applications Datasources dropdown")
    public void user_can_see_applications_datasources_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User can see Application Datasource Short Description field")
    public void user_can_see_application_datasource_short_description_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User can see DOC Level field")
    public void user_can_see_doc_level_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User can see User Role field")
    public void user_can_see_user_role_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User can see Valid Until Date datepicker")
    public void user_can_see_valid_until_date_datepicker() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User can see Business Justification field")
    public void user_can_see_business_justification_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User can see Federal Supervisor dropdown")
    public void user_can_see_federal_supervisor_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User can confirm Federal Supervisor is prepopulated")
    public void user_can_confirm_federal_supervisor_is_prepopulated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User can see 2nd Level Federal Supervisor dropdown")
    public void user_can_see_2nd_level_federal_supervisor_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
