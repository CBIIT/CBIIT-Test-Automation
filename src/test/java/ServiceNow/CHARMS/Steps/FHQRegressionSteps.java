package ServiceNow.CHARMS.Steps;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import ServiceNow.CHARMS.Constants.FHQSurveyPageConstants;
import ServiceNow.CHARMS.Pages.FHQSurveyPortalPage;
import ServiceNow.CHARMS.Utils.ComponentTestResult;
import ServiceNow.CHARMS.Utils.FHQUtil;
import ServiceNow.CHARMS.Utils.StepTestResult;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class FHQRegressionSteps extends PageInitializer {

    private ArrayList<StepTestResult> scenarioReportList = new ArrayList<StepTestResult>();

    @Then("clicks the home button")
    public void clicks_the_home_button() {

        fHQSurveyPortalPage.homeButton.click();

        MiscUtils.sleep(5000);

    }

    @Then("Generate Scenario Report for the details of the complete FHQ Survey for a Participant")
    public void generate_Scenario_Report_for_the_details_of_the_complete_FHQ_Survey_for_a_Participant() {

        for (StepTestResult tr : scenarioReportList) {
            System.out.println(tr.toString());

        }
    }
}