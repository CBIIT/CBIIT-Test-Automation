package ServiceNow.CHARMS.Playwright.Steps.FanconiStudy;

import ServiceNow.CHARMS.Playwright.StepsImplementation.FanconiStudy.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;

public class FanconiSurveyDemographicsSteps {

    @Given("fills the Demographic section for scenario 1")
    public void fills_the_demographic_section_for_scenario_1() {
        FanconiSurveyStepsImpl.demographicSectionScenario1();
    }
}
