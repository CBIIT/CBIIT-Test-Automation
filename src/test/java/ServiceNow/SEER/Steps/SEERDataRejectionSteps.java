package ServiceNow.SEER.Steps;

import ServiceNow.SEER.StepsImplementation.SEERDataRejectionStepImpl;
import appsCommon.PageInitializer;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SEERDataRejectionSteps extends PageInitializer {

    @Given("an authenticated ODS SEER Data user with an eRA Commons account is on the SEER Data Access landing page")
    public void an_authenticated_ODS_SEER_Data_user_with_an_eRA_Commons_account_is_on_the_SEER_Data_Access_landing_page() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
        SEERDataRejectionStepImpl.proceedsToRegisterForResearchDataWithUniqueEmailAddress();
    }

    @Given("fills out all required fields on SEER Data registration form")
    public void fills_out_all_required_fields_on_SEER_Data_registration_form() {
        SEERDataRejectionStepImpl.fillsOutAllRequiredFieldsOnSEERDataRegistrationFormRejected();
    }

    @Given("a SEER ODS Admin navigates the Native View portal")
    public void a_SEER_ODS_Admin_navigates_the_Native_View_portal() {
        SEERDataRejectionStepImpl.aSEERODSAdminNavigatesTheNativeViewPortal();
    }

    @When("a SEER ODS Admin navigates to {string},{string}")
    public void a_SEER_ODS_Admin_navigates_to(String SEERText, String accessRequestsText) {
        SEERDataRejectionStepImpl.aSEERODSAdminNavigatesTo(SEERText,accessRequestsText);
    }

    @When("creates a new Access Request")
    public void creates_a_new_Access_Request() {
        SEERDataRejectionStepImpl.createsANewAccessRequest();
    }

    @When("when the admin rejects the Access Requests")
    public void when_the_admin_rejects_the_Access_Requests() {
        SEERDataRejectionStepImpl.whenTheAdminRejectsTheAccessRequests();
    }

    @Then("the user shall receive a rejection email")
    public void the_user_shall_receive_a_rejection_email() {
        SEERDataRejectionStepImpl.theUserShallReceiveARejectionEmail();
    }
}