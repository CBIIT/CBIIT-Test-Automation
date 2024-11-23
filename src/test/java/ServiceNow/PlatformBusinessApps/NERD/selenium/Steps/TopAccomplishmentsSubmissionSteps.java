package ServiceNow.PlatformBusinessApps.NERD.selenium.Steps;

import ServiceNow.PlatformBusinessApps.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.nci.automation.web.TestProperties.getNerdUrl;

public class TopAccomplishmentsSubmissionSteps extends PageInitializer {

    @Given("a Program Staff member is on the CRS Knowledge Management System page")
    public void a_Program_Staff_member_is_on_the_CRS_Knowledge_Management_System_page() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        WebDriverUtils.webDriver.get(getNerdUrl());
    }

    @When("the Program Staff Member clicks on {string} for Top Accomplishments")
    public void the_Program_Staff_Member_clicks_on_for_Top_Accomplishments(String createNewSubmission) {
        NERDApplicationStepsImplementation.creatingNewSubmission(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentsCreateNewSubmissionLink);
    }

    @When("fills out all required fields")
    public void fills_out_all_required_fields() {
        NERDApplicationStepsImplementation.filingOutAllRequiredFieldsOfSubmission();
    }

    @Then("the Program Staff Member is able to Save the submission")
    public void the_Program_Staff_Member_is_able_to_Save_the_submission() {
        NERDApplicationStepsImplementation.savingOfSubmission();
    }

    @Then("on the CRS Knowledge Management System page, the Program Staff member sees options to Submit and Edit")
    public void on_the_crs_knowledge_management_system_page_the_program_staff_member_sees_options_to_submit_and_edit() {
        NERDApplicationStepsImplementation.submissionOptions_SubmitEdit_areAvailable();
    }
}