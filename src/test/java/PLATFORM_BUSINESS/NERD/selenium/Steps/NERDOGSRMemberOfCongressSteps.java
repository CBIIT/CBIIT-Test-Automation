package PLATFORM_BUSINESS.NERD.selenium.Steps;

import PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation;
import PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDOGSRMemberOfCongressStepImpl;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NERDOGSRMemberOfCongressSteps extends PageInitializer {

    @Given("{string} is in the OGCR Admin Group")
    public void is_in_the_ogcr_admin_group(String oGCRUser) {
        NERDOGSRMemberOfCongressStepImpl.aUserIsInTheOgcrAdminGroup(oGCRUser);
    }

    @When("the user goes to the OGCR Knowledge Base")
    public void the_user_goes_to_the_ogcr_knowledge_base() {
        NERDOGSRMemberOfCongressStepImpl.theUserGoesToTheOgcrKnowledgeBase();
    }

    @When("the OGCR user clicks the Add New Entry button")
    public void the_ogcr_user_clicks_the_add_new_entry_button() {
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageOGCRCreateNewSubmissionLink);
    }

    @Then("the Member of Congress drop down field only includes options that have the {string} flag enabled in the Member of Congress table")
    public void the_member_of_congress_drop_down_field_only_includes_options_that_have_the_flag_enabled_in_the_member_of_congress_table(String active) {
        NERDOGSRMemberOfCongressStepImpl.newEntryMemberOfCongressDropDownValues();
        NERDOGSRMemberOfCongressStepImpl.newEntryMemberOfCongressNativeViewVerification(active);
    }
}