package GrantsApps.EM.Steps;

import GrantsApps.EM.StepImplementation.EMStepsImplementation;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;

public class Search_Scenarios_Steps extends PageInitializer {

    @Given("User is logged in as Primary IC Coordinator")
    public void user_is_logged_in_as_primary_ic_coordinator() {
        EMStepsImplementation.user_is_logged_in_as_primary_ic_coordinator();
    }
}
