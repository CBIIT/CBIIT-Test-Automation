package CHARMS.steps;

import java.util.ArrayList;
import CHARMS.utils.StepTestResult;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Then;

public class FHQRegressionSteps extends PageInitializer {


    private ArrayList<StepTestResult> scenarioReportList = new ArrayList<StepTestResult>();

    @Then("clicks the home button")
    public void clicks_the_home_button() {

        fHQSurveyPortalPage.homeButton.click();

        CommonUtils.sleep(5000);

    }

    @Then("Generate Scenario Report for the details of the complete FHQ Survey for a Participant")
    public void generate_Scenario_Report_for_the_details_of_the_complete_FHQ_Survey_for_a_Participant() {

        for (StepTestResult tr : scenarioReportList) {
            System.out.println(tr.toString());

        }
    }
}