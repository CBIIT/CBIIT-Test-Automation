package ServiceNow.NERD.Steps;

import ServiceNow.NERD.StepsImplementation.Covid19ActivitiesSubmissionsStepImplementation;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Then;

public class Covid19ActivitiesSubmissionsSteps extends PageInitializer {

    public static String title = "Title" + CommonUtils.getDateAsString();

    @Then("the following check box options are also displayed {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_covid19_strategic_plan_following_check_box_options_are_also_displayed(String priority1ImproveFundamentalKnowledge, String priority2AdvanceResearchToImproveDetection,
                                                                                      String priority3SupportToAdvanceTreatment, String priority4AccelerateResearchToImprovePrevention,
                                                                                      String priority5PreventAndRedressPoorCOVID19Outcomes, String other) {
        Covid19ActivitiesSubmissionsStepImplementation.
                covid19StrategicPlanCheckBoxOptionsAreAlsoDisplayed(priority1ImproveFundamentalKnowledge, priority2AdvanceResearchToImproveDetection,
                        priority3SupportToAdvanceTreatment, priority4AccelerateResearchToImprovePrevention, priority5PreventAndRedressPoorCOVID19Outcomes, other);
    }
}