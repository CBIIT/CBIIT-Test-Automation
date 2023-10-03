package ServiceNow.SCSS.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OWMVacancySteps  extends PageInitializer {

    @When("User is on SCSS Landing page and user is {string}")
    public void user_is_on_scss_landing_page_and_user_is(String user) {
        sCCSLoginStepsImplementation.sCSSLogin(user);
    }

    @Given("User is on SCSS landing page")
        public void user_is_on_SCSS_landing_page() {
        CommonUtils.waitForVisibility(owmVacancyPage.scssLandingPageTitle);
        CommonUtils.assertTrue(owmVacancyPage.scssLandingPageTitle.isDisplayed());
        CucumberLogUtils.logScreenshot();
    }

    @Given("User navigates to tab {string}")
        public void user_navigates_to_tab(String string) {
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyDashboardTab);
        CommonUtils.clickOnElement(owmVacancyPage.vacancyDashboardTab);
        CucumberLogUtils.logScreenshot();
    }

    @Given("User clicks button {string}")
        public void user_clicks_button(String button) {
        oWMVacancyStepsImplementation.clickButton(button);
        CucumberLogUtils.logScreenshot();
    }

    @Given("User submits the {string}")
        public void user_submits_the(String basicVacancyInformation) {
        oWMVacancyStepsImplementation.userSubmitsTheBasicVacancyInformation(basicVacancyInformation);
    }

    @Given("user is selecting the {string}")
        public void user_is_selecting_the(String statements) {
        oWMVacancyStepsImplementation.userIsSelectingTheMandatoryStatements(statements);
    }

    @Given("user is adding {string} members")
        public void user_is_adding_members(String commetteeMembers) {
        oWMVacancyStepsImplementation.userIsAddingMembers(commetteeMembers);
    }

    @Given("user chooses {string}")
        public void user_chooses(String emailTemplates) {
        oWMVacancyStepsImplementation.userChoosesEmailTemplate(emailTemplates);
    }

    @Given("User includes all available Email Templates selections")
        public void user_includes_all_available_email_templates_selections() {
        CommonUtils.clickOnElement(owmVacancyPage.reviewFinalizeTab);
    }

    @Then("User publishes a vacancy")
        public void user_publishes_a_vacancy() {
        oWMVacancyStepsImplementation.userPublishesAVacancy();
    }

    @Then("User verify that a vacancy is finalized")
    public void user_verify_that_a_vacancy_is_finalized() {
        oWMVacancyStepsImplementation.userVerifyThatAVacancyIsFinalized();
        oWMVacancyStepsImplementation.logOutScss();
    }
}
