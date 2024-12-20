package CHARMS.playwright.Steps.fanconiStudy;

import CHARMS.playwright.StepsImplementation.fanconiStudy.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;

public class FanconiSurveyReproductiveHistorySteps {

    @Given("fills the Reproductive History section for scenario 1")
    public void fills_the_reproductive_history_section_for_scenario_1() {
        FanconiSurveyStepsImpl.reproductiveHistorySectionScenario1();
    }
}
