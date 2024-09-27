package ServiceNow.CHARMS.Playwright.Steps.FanconiStudy;

import ServiceNow.CHARMS.FanconiSurvey.Playwright.StepsImplementation.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;

public class FanconiSurveySexualHistorySteps {

    @Given("fills the Sexual History section for scenario 1")
    public void fills_the_sexual_history_section_for_scenario_1() {
        FanconiSurveyStepsImpl.sexualHistorySectionScenario1();
    }
}
