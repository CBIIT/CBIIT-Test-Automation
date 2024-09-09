package ServiceNow.CHARMS.FanconiSurvey.Playwright.Steps;

import ServiceNow.CHARMS.FanconiSurvey.Playwright.StepsImplementation.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;

public class FanconiSurveySurgicalAndOtherMedicalHistorySteps {

    @Given("fills the Surgical and other Medical History section for scenario 1")
    public void fills_the_surgical_and_other_medical_history_section_for_scenario_1() {
        FanconiSurveyStepsImpl.surgicalAndOtherMedicalHistorySectionScenario1();
    }
}
