package ServiceNow.CHARMS.FanconiSurvey.Playwright.Steps;

import ServiceNow.CHARMS.FanconiSurvey.Playwright.StepsImplementation.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;

public class FanconiSurveyMedicalHistorySteps {

    @Given("fills the Medical History section for scenario 1")
    public void fills_the_medical_history_section_for_scenario_1() {
        FanconiSurveyStepsImpl.medicalHistorySectionScenario1();
    }
}