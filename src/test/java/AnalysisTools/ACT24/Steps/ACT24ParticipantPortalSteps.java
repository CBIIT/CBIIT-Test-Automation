package AnalysisTools.ACT24.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ACT24ParticipantPortalSteps extends PageInitializer {

    @Given("the participant on the ACT24 participant")
    public void the_participant_on_the_act24_participant() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ACT24Participant"));
        MiscUtils.sleep(2000);
        Assert.assertTrue(act24ParticipantPortalPage.act24WelcomeText.isDisplayed());
    }

    @Then("the splash screen is displayed")
    public void the_splash_screen_is_displayed() {
        Assert.assertTrue(act24ParticipantPortalPage.splashScreenText.isDisplayed());
    }
}