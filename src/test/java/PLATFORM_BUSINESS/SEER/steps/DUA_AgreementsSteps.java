package PLATFORM_BUSINESS.SEER.steps;

import PLATFORM_BUSINESS.SEER.constants.DUA_Constants;
import PLATFORM_BUSINESS.SEER.stepsImplementation.SEERDataAccessRequestPageStepsImpl;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DUA_AgreementsSteps extends PageInitializer {

    @Given("a user is on the SEER Data Access Request")
    public void a_user_is_on_the_SEER_Data_Access_Request() {
        WebDriverUtils.webDriver.get(DUA_Constants.SEER_DATA_ACCESS_REQUEST_URL);
    }

    @Then("DUA Agreements are verified")
    public void dua_Agreements_are_verified() {
        SEERDataAccessRequestPageStepsImpl.verifyingAgreements();
    }

    @Given("a user is on the SEER Data Access Research Plus Request")
    public void a_user_is_on_the_SEER_Data_Access_Research_Plus_Request() {
        WebDriverUtils.webDriver.get(DUA_Constants.SEER_DATA_ACCESS_REQUEST_INSTITUTION_URL);
    }

    @Then("DUA Research Plus Agreements are verified")
    public void dua_Research_Plus_Agreements_are_verified() {
        SEERDataAccessRequestPageStepsImpl.verifyingResearchPlusAgreements();
    }
}