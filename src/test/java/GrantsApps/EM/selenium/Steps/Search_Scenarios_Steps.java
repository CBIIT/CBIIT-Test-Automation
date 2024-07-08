package GrantsApps.EM.selenium.Steps;

import GrantsApps.EM.selenium.StepImplementation.EMStepsImplementation;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;

public class Search_Scenarios_Steps extends PageInitializer {

    @Given("User is logged in as Primary IC Coordinator")
    public void user_is_logged_in_as_primary_ic_coordinator() {
        EMStepsImplementation.user_is_logged_in_as_primary_ic_coordinator();
    }

    @Given("verifies that first and last name of logged in user {string} are shown")
    public void verifies_that_first_and_last_name_of_logged_in_user_are_shown(String user) {
        EMStepsImplementation.verifies_that_first_and_last_name_of_logged_in_user_are_shown(user);
    }

    @Given("is on {string} page")
    public void is_on_page(String expectedPageName) {
        EMStepsImplementation.verifyingUserIsOnI2EPage(expectedPageName);
    }

    @Given("is able to navigate to {string} hyperlink")
    public void is_able_to_navigate_to_hyperlink(String linkText) {
        EMStepsImplementation.is_able_to_navigate_to_hyperlink(linkText);
    }

    @Given("user is able to confirm that the {string} drop down has the following options {string}, {string}, {string}")
    public void user_is_able_to_confirm_that_the_drop_down_has_the_following_options(String helpDropDown, String option1, String option2, String option3) {
        EMStepsImplementation.verifyingHelpDropDownOptions(helpDropDown, option1, option2, option3);
    }

    @Given("User can open and verify respective hyperlink {string} with URL {string}")
    public void user_can_open_and_verify_respective_hyperlink_with_url(String hyperlinkText, String URL) {
        EMStepsImplementation.verifyingHelpDropDownUrls(hyperlinkText,URL);
    }

    @Given("User can verify that Contact has the following options {string} and {string}")
    public void user_can_verify_that_contact_has_the_following_options_and(String option1, String option2) {
        EMStepsImplementation.verifyingContactOptions(option1, option2);
    }
}