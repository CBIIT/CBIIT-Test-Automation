package ServiceNow.SCSS.Steps;

import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class StadtmanVacancySteps  extends PageInitializer {

    @Given("the user submits the {string}")
    public void the_user_submits_the(String basicVacancyInformation) {
        stadtmanVacancyStepsImplementation.theUserSubmitsTheBasicVacancyInformation(basicVacancyInformation);
    }
    @Given("the user is selecting the {string}")
    public void the_user_is_selecting_the(String statements) {
        stadtmanVacancyStepsImplementation.theUserIsSelectingTheMandatoryStatements(statements);
    }
    @Given("the user is adding {string} members")
    public void the_user_is_adding_members(String commetteeMembers) {
        stadtmanVacancyStepsImplementation.theUserIsAddingMembers(commetteeMembers);
    }
    @Given("the user chooses {string}")
    public void the_user_chooses(String emailTemplates) {
        stadtmanVacancyStepsImplementation.theUserChoosesEmailTemplate(emailTemplates);
    }

    @Then("applicant should see the published vacancy")
    public void applicant_should_see_the_published_vacancy() {
        stadtmanVacancyStepsImplementation.applicantShouldSeeThePublishedVacancy();
    }
}
