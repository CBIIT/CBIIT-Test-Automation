package CHARMS.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Then;

public class RAS_Survey_Data_Verification_Steps extends PageInitializer {

    @Then("RAS Survey Data for Scenario One is verified")
    public void ras_survey_Data_for_scenario_one_is_verified() {
        rASSurveyDataVerificationStepsImpl.ras_survey_Data_for_scenario_one_is_verified();
    }

    /**
     * This method verifies the RAS Survey Data in Native View for Scenario Two.
     */
    @Then("RAS Survey Data for Scenario Two is verified")
    public void ras_survey_Data_for_scenario_two_is_verified() {
        rASSurveyDataVerificationStepsImpl.ras_survey_Data_for_scenario_two_is_verified();
    }
}