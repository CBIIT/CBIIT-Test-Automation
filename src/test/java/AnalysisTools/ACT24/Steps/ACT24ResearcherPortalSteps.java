package AnalysisTools.ACT24.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ACT24ResearcherPortalSteps extends PageInitializer {

    @Given("the user is on the ACT24 Researcher site")
    public void the_user_is_on_the_act24_researcher_site() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ACT24Researcher"));
        MiscUtils.sleep(2000);
        Assert.assertTrue(act24ResearcherPortalPage.researcherText.isDisplayed());
    }

    @When("the user enters {string} as email and {string} as password and clicks Login")
    public void the_user_enters_as_email_and_as_password_and_clicks_login(String email, String password) {
        act24ResearcherStepImpl.researcherLogin(email, password);
    }

    @Given("the Researcher is logged in {string} and {string}")
    public void the_researcher_is_logged_in_and(String email, String password) {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("ACT24Researcher"));
        MiscUtils.sleep(2000);
        /** Looking into why the first login doesn't work but the second attempt does **/
        act24ResearcherStepImpl.researcherLogin(email, password);
        MiscUtils.sleep(2000);
        act24ResearcherStepImpl.researcherLogin(email, password);
    }

    @When("the user creates a new study {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_creates_a_new_study(String studyName, String studyDescription, String studyAbbreviation, String expectedParticipants, String recallPerParticipant, String studyStartDate, String studyEndDate) {
        MiscUtils.sleep(3000);
        act24ResearcherStepImpl.createNewStudy(studyName, studyDescription, studyAbbreviation, expectedParticipants, recallPerParticipant, studyStartDate, studyEndDate);
        MiscUtils.sleep(2000);
    }

    @Then("the screen is displayed")
    public void the_screen_is_displayed() {
        Assert.assertTrue(act24ResearcherPortalPage.successfulStudyCreationPrompt.isDisplayed());
    }
}