package PLATFORM_BUSINESS.ApplicationAccessAndApproval.steps;

import PLATFORM_BUSINESS.ApplicationAccessAndApproval.stepsImplementation.AAAStepsImplementation;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static APPS_COMMON.PageInitializers.PageInitializer.aaaPage;
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

    @Given("User can see Requested for field is prepopulated")
    public void user_can_see_requested_for_field_is_prepopulated() {
        AAAStepsImplementation.verifyRequestedForFieldPrepopulated();
    }

    @Given("User can see Requested for Email is prepopulated")
    public void user_can_see_requested_for_email_is_prepopulated() {
      AAAStepsImplementation.verifyRequestedForEmailFieldPrepopulated();
    }

    @Given("User can see Requested for Organization Affiliation is prepopulated")
    public void user_can_see_requested_for_organization_affiliation_is_prepopulated() {
        AAAStepsImplementation.verifyOrganizationAffiliationFieldPrepopulated();
    }

    @Given("User can see System Name dropdown")
    public void user_can_see_system_name_dropdown() {
      AAAStepsImplementation.verifyRequestedForEmailFieldDisplayed();
    }

    @Given("User can see Applications Datasources dropdown")
    public void user_can_see_applications_datasources_dropdown() {
      AAAStepsImplementation.verifyApplDatasourcesDropdownDisplayed();
    }

    @Given("User can see Application Datasource Short Description field")
    public void user_can_see_application_datasource_short_description_field() {
     AAAStepsImplementation.verifyApplDatasourcesDescriptionFieldDisplayed();
    }

    @Given("User can see DOC Level field")
    public void user_can_see_doc_level_field() {
      AAAStepsImplementation.verifyDocLevelFieldDisplayed();
    }

    @Given("User can see User Role field")
    public void user_can_see_user_role_field() {
      AAAStepsImplementation.verifyUserRoleFieldDisplayed();
    }

    @Given("User can see Valid Until Date datepicker")
    public void user_can_see_valid_until_date_datepicker() {
      AAAStepsImplementation.verifyDatepickerFieldDisplayed();
    }

    @Given("User can see Business Justification field")
    public void user_can_see_business_justification_field() {
      AAAStepsImplementation.verifyBusinessJustificationFieldDisplayed();
    }

    @Given("User can see Federal Supervisor dropdown")
    public void user_can_see_federal_supervisor_dropdown() {
    AAAStepsImplementation.verifyFederalSupervisorDropdownDisplayed();
    }

    @Given("User can see 2nd Level Federal Supervisor dropdown")
    public void user_can_see_2nd_level_federal_supervisor_dropdown() {
     AAAStepsImplementation.verifySecondLevelSupervisorDropdownDisplayed();
    }

    /**
     *User clicks on System Name dropdown
     */
    @When("User clicks on System Name dropdown")
    public void user_clicks_on_system_name_dropdown() {;
        aaaPage.systemNameDropdown.click();
    }

    @Then("User can see the expected System Name dropdown options")
    public void user_can_see_the_expected_system_name_dropdown_options() {
       AAAStepsImplementation.verifySystemNameDropdownOptionsDisplayed();
    }

    @When("User clicks on Applications Datasources dropdown")
    public void user_clicks_on_applications_datasources_dropdown() {
        CommonUtils.waitForClickability(aaaPage.applDatasourcesDropdown);
        JavascriptUtils.clickByJS(aaaPage.applDatasourcesDropdown);
    }

    @Then("User can see Applications Datasources text input field")
    public void user_can_see_applications_datasources_text_input_field() {
       AAAStepsImplementation.verifyApplicationsDatasourcesInputTextDisplayed();
    }

    @Then("User can see Privilege level field text")
    public void user_can_see_privilege_level_field_text() {
       AAAStepsImplementation.verifyPrivilegeLevelTextFieldDisplayed();
    }

    @Then("User can see DOC level field text")
    public void user_can_see_doc_level_field_text() {
        AAAStepsImplementation.verifyDOCLevelTextFieldDisplayed();
    }

    @Then("User can see Valid Until Date field text")
    public void user_can_see_valid_until_date_field_text() {
        AAAStepsImplementation.verifyValidUntilDateTextFieldDisplayed();
    }

    @Then("User can see Add Attachment button")
    public void user_can_see_add_attachment_button() {
    AAAStepsImplementation.verifyAddAttachmentDisplayed();
    }
}