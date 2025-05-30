package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.steps;

import CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.stepsImplementation.FCASVENDORPORTALStepsImplementation;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static APPS_COMMON.PageInitializers.PageInitializer.fCASVENDORPORTALPage;

public class FCASVENDORPORTALSteps {

    @Given("User is logged in to the FCAS Vendor Portal")
    public void user_is_logged_in_to_the_fcas_vendor_portal() {
       FCASVENDORPORTALStepsImplementation.userLoginFCASVendorPortal();
    }

    /**
     *  User accepts PII Disclaimer
     */
    @Given("User accepts PII Disclaimer")
    public void user_accepts_pii_disclaimer() {
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.acceptWelcomeScreen);
    }

    @Given("User is on Existing Contracts page")
    public void user_is_on_existing_contracts_page() throws Exception {
       FCASVENDORPORTALStepsImplementation.verifyExistingContractsPageTitle();
    }

    /**
     * User clicks on All Contracts dropdown
     */
    @When("User clicks on All Contracts dropdown")
    public void user_clicks_on_all_contracts_dropdown() {
     CommonUtils.clickOnElement(fCASVENDORPORTALPage.allContractsDropdown);
    }

    @Then("User can see All Contracts and My Contracts options")
    public void user_can_see_all_contracts_and_my_contracts_options() throws Exception {
      FCASVENDORPORTALStepsImplementation.verifyAllMyContractsOptions();
    }

    @Then("User can see Show Closed Contracts option")
    public void user_can_see_show_closed_contracts_option() throws Exception {
       FCASVENDORPORTALStepsImplementation.verifyShowClosedContractsOption();
    }

    @Then("User can see a search page text field")
    public void user_can_see_a_search_page_text_field() throws Exception {
        FCASVENDORPORTALStepsImplementation.textSearchFieldOption();
    }
}
