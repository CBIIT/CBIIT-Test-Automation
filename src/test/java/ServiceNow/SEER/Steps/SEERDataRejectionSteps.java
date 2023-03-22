package ServiceNow.SEER.Steps;

import com.nci.automation.web.CommonUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;

public class SEERDataRejectionSteps extends PageInitializer {

    @Given("proceeds to register for research data with unique email address")
    public void proceeds_to_register_for_research_data_with_unique_email_address() {
        CommonUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        seerLandingPage.researchDataRequestsEmailAddressField.sendKeys("seer" + CommonUtils.email);
        seerLandingPage.registerForResearchDataButton.click();
    }
}
