package CHARMS.playwright.steps.fanconiStudy;

import CHARMS.playwright.stepsImplementation.fanconiStudy.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;

public class FanconiSurveyMedicalHistoryContinuedSteps {

    @Given("fills the Medical History Continued section for scenario 1")
    public void fills_the_medical_history_section_continued_for_scenario_1() {
        FanconiSurveyStepsImpl.medicalHistoryContinuedSectionScenario1();
    }
}