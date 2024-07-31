package CloudAndSystemEngineering.IAMRedesign.Steps;

import CloudAndSystemEngineering.IAMRedesign.StepImplementation.IAMRedesignStepImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class IAMRedesignSteps {
    @Given("a user is on AD the webpage")
    public void a_user_is_on_ad_the_webpage() {
        IAMRedesignStepImpl.getAllLinksFromExcelSheet();
    }

    @Then("the user should be able see that the old groups should have the same numbers of users as the new groups for Prod accounts")
    public void the_user_should_be_able_see_that_the_old_groups_should_have_the_same_numbers_of_users_as_the_new_groups_for_prod_accounts() {
        IAMRedesignStepImpl.goToAdUrl();
        IAMRedesignStepImpl.retrieveAllConsoleUsers();
        IAMRedesignStepImpl.verifyMannagedProdAccount();
    }

    @Then("the user should be able see that the old groups should have the same numbers of users as the new groups for Non-Prod accounts")
    public void the_user_should_be_able_see_that_the_old_groups_should_have_the_same_numbers_of_users_as_the_new_groups_for_non_prod_accounts() {
        IAMRedesignStepImpl.goToAdUrl();
        IAMRedesignStepImpl.retrieveAllConsoleUsers();
        IAMRedesignStepImpl.verifyMannagedNonProdAccount();
    }
    @Given("a user is on the console page")
    public void a_user_is_on_the_console_page() {
        IAMRedesignStepImpl.goToAWSUrl();
        IAMRedesignStepImpl.retrieveAllAWSAccounts();
    }
    @Then("the user should see all the aws accounts")
    public void the_user_should_see_all_the_aws_accounts() {

    }

}
