package ServiceNow.PlatformBusinessApps.NERD.Steps;

import ServiceNow.PlatformBusinessApps.NERD.StepsImplementation.NERDApplicationStepsImplementation;
import ServiceNow.PlatformBusinessApps.NERD.StepsImplementation.NERDOGSRMemberOfCongressStepImpl;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NERDOGSRMemberOfCongressSteps extends PageInitializer {

    @Given("a user is in the OGCR Admin Group")
    public void a_user_is_in_the_ogcr_admin_group() {
        NERDOGSRMemberOfCongressStepImpl.aUserIsInTheOgcrAdminGroup();
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
    public void the_member_of_congress_drop_down_field_only_includes_options_that_have_the_flag_enabled_in_the_member_of_congress_table(String active) throws TestingException{
        NERDOGSRMemberOfCongressStepImpl.newEntryMemberOfCongressDropDownValues();
        NERDOGSRMemberOfCongressStepImpl.newEntryMemberOfCongressNativeViewVerification(active);
    }
}