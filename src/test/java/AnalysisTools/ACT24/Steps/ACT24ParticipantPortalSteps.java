package AnalysisTools.ACT24.Steps;

import AnalysisTools.ACT24.StepsImpl.ACT24ParticipantStepImpl;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ACT24ParticipantPortalSteps extends PageInitializer {

    @Given("the participant on the ACT24 participant")
    public void the_participant_on_the_act24_participant() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ACT24Participant"));
    }

    @Then("the splash screen is displayed")
    public void the_splash_screen_is_displayed() {
        Assert.assertTrue(act24ParticipantPortalPage.splashScreenText.isDisplayed());
    }

    @When("the user adds wake up time on splash screen")
    public void the_user_adds_wake_up_time_on_splash_screen() {
        act24ParticipantStepImpl.addWakeTimeOnSplashScreen();
    }
    @When("the user adds a Sleeping or in Bed entry")
    public void the_user_adds_a_sleeping_or_in_bed_entry() {
        CommonUtils.clickOnElement(act24ParticipantPortalPage.okOnWelcomeBackPopup);
    }
    @Then("the timeline displays a sleeping or in bed tile")
    public void the_timeline_displays_a_sleeping_or_in_bed_tile() {
    }
}