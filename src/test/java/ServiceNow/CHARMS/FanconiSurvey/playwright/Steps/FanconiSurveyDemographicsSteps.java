package ServiceNow.CHARMS.FanconiSurvey.Playwright.Steps;

import ServiceNow.CHARMS.FanconiSurvey.Playwright.StepsImplementation.FanconiSurveyStepsImpl;
import io.cucumber.java.en.Given;

public class FanconiSurveyDemographicsSteps {

    @Given("fills the Demographic section")
    public void fills_the_demographic_section() {
        FanconiSurveyStepsImpl.demographicSection();
    }
}
