package ServiceNow.PlatformBusinessApps.NERD.Steps;

import ServiceNow.PlatformBusinessApps.NERD.StepsImplementation.Covid19ActivitiesSubmissionsStepImplementation;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @Given("a NERD user is viewing the Knowledge Base as a super user Grace Liou")
    public void a_nerd_user_is_viewing_the_knowledge_base_as_a_super_user_grace_liou() throws TestingException {
        Covid19ActivitiesSubmissionsStepImplementation.nerduserIsOnTheKnowledgeBasePageAsSuperUser();

    }

    @When("they select the COVID19 Activities Category")
    public void they_select_the_covid19_activities_category() throws TestingException {
        Covid19ActivitiesSubmissionsStepImplementation.selectTheCovid19ActivitiesCategory();
    }

    @Then("no other results are displayed which have {string} as the Special Topic Filter")
    public void no_other_results_are_displayed_which_have_as_the_special_topic_filter(String string) throws TestingException {
        Covid19ActivitiesSubmissionsStepImplementation.onlyCovid19ActivitiesCategoryResultsAreDisplayed();
    }
}