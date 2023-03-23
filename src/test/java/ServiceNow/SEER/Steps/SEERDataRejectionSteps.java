package ServiceNow.SEER.Steps;

import com.nci.automation.web.CommonUtils;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SEERDataRejectionSteps extends PageInitializer {

    @Given("proceeds to register for research data with unique email address")
    public void proceeds_to_register_for_research_data_with_unique_email_address() {
        CommonUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        seerLandingPage.researchDataRequestsEmailAddressField.sendKeys("seer" + CommonUtils.email);
        seerLandingPage.registerForResearchDataButton.click();
    }

    @When("a SEER ODS Admin navigates to {string}")
    public void a_SEER_ODS_Admin_navigates_to(String seerDataAccess) {
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewHomePage.nativeViewFilterNavigator.sendKeys(seerDataAccess);
    }
}
