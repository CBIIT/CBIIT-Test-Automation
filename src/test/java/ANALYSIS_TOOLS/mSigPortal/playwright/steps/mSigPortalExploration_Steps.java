package ANALYSIS_TOOLS.mSigPortal.playwright.steps;

import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ANALYSIS_TOOLS.mSigPortal.playwright.stepsImplementations.mSigPortalExplorationStepsImpl;

public class mSigPortalExploration_Steps {

    @When("User clicks on the submit button in the exploration tab")
    public void user_clicks_on_the_submit_button_in_the_exploration_tab() {
        PlaywrightUtils.page.locator("//button[normalize-space()='Submit']").click();
    }

    @Then("User clicks on the reset button in the exploration tab")
    public void user_clicks_on_the_reset_button_in_the_exploration_tab() {
        mSigPortalExplorationStepsImpl.clickResetButton();
    }
}