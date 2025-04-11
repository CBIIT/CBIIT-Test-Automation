package PLATFORM_BUSINESS.ApplicationAccessAndApproval.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import PLATFORM_BUSINESS.ApplicationAccessAndApproval.stepsImplementation.AAAStepsImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AAAlSteps extends PageInitializer {

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
}
