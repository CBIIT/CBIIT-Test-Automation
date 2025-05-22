package PLATFORM_BUSINESS.TransferFundsMOU.steps;

import PLATFORM_BUSINESS.TransferFundsMOU.stepsImplemetation.TFMStepsImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TFMSteps {

    @Given("Submitter User logged in to TFM Portal")
    public void submitter_user_logged_in_to_tfm_portal() {
        TFMStepsImplementation.userLoginTFMPortal();
        TFMStepsImplementation.navigateToTFMViaPortalView();
    }

    @Then("Submitter User can verify they are on the TFM portal view form")
    public void submitter_user_can_verify_they_are_on_the_tfm_portal_view_form() {
         TFMStepsImplementation.verifyTFMPageTitle();
    }
}