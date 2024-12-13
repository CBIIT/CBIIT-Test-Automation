package ANALYSIS_TOOLS.ACT24.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static com.nci.automation.web.TestProperties.getAct24ResearcherUrl;

public class ACT24ResearcherPortalSteps extends PageInitializer {

    @Given("the user is on the ACT24 Researcher site")
    public void the_user_is_on_the_act24_researcher_site() {
        WebDriverUtils.webDriver.get(getAct24ResearcherUrl());
    }

    @When("the user enters {string} as email and {string} as password and clicks Login")
    public void the_user_enters_as_email_and_as_password_and_clicks_login(String email, String password) {
        act24ResearcherStepImpl.researcherLogin(email, password);
    }

    @Given("the Researcher is logged in {string} and {string}")
    public void the_researcher_is_logged_in_and(String email, String password) {
        WebDriverUtils.webDriver.get(getAct24ResearcherUrl());
        CommonUtils.sleep(2000);
        /** Looking into why the first login doesn't work but the second attempt does **/
        act24ResearcherStepImpl.researcherLogin(email, password);
        CommonUtils.sleep(2000);
        act24ResearcherStepImpl.researcherLogin(email, password);
    }

    @When("the user creates a new study {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_creates_a_new_study(String studyName, String studyDescription, String studyAbbreviation, String expectedParticipants, String recallPerParticipant, String studyStartDate, String studyEndDate) {
        CommonUtils.sleep(3000);
        act24ResearcherStepImpl.createNewStudy(studyName, studyDescription, studyAbbreviation, expectedParticipants, recallPerParticipant, studyStartDate, studyEndDate);
        //NEED TO CHANGE STUDY ABBREVIATION (THERE CAN'T BE DUPLICATE NAMES)
        CommonUtils.sleep(2000);
    }

    @Then("the Researcher is logged in")
    public void the_researcher_is_logged_in() {
    }

    @Then("the screen is displayed")
    public void the_screen_is_displayed() {
        Assert.assertTrue(act24ResearcherPortalPage.successfulStudyCreationPrompt.isDisplayed());
    }
}