package ServiceNow.CHARMS.Playwright.Steps.FanconiStudy;

import ServiceNow.CHARMS.Playwright.StepsImplementation.FanconiStudy.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;

//Steps to fill the Fanconi Survey Reproductive History module
public class FanconiSurveyReproductiveHistorySteps {

    @Given("fills the Reproductive History section for scenario 1")
    public void fills_the_reproductive_history_section_for_scenario_1() {
        FanconiSurveyStepsImpl.reproductiveHistorySectionScenario1();
    }
}
