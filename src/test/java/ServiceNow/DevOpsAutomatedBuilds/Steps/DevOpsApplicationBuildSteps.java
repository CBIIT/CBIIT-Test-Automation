package ServiceNow.DevOpsAutomatedBuilds.Steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DevOpsApplicationBuildSteps extends PageInitializer{
	
	@Given("login to the CICD_Dev_Ops application in Native View is successful with username {string} and password {string}")
	public void login_to_the_CICD_Dev_Ops_application_in_Native_View_is_successful_with_username_and_password(String username, String password) throws TestingException {	
		devOpsAutomatedBuildStepsImplementation.devOpsSandboxNativeViewLogin(username, password);
	}
		
	@When("selecting the {string} application")
	public void selecting_the_application(String cicdDevOps) {		
		devOpsAutomatedBuildStepsImplementation.selectingCICDDevOpsApplication(cicdDevOps);
	}

	@When("selecting {string} as the deployment type")
	public void selecting_as_the_deployment_type(String application) {		
		devOpsAutomatedBuildStepsImplementation.selectingApplicationAsDeploymentType(application);
	}

	@Then("build is able to be executed successfully")
	public void build_is_able_to_be_executed_successfully() {		
		devOpsAutomatedBuildStepsImplementation.clickBuildButton();
	}
	
	@When("selects {string} as the deployment type")
	public void selects_as_the_deployment_type(String updateSet) {		
		devOpsAutomatedBuildStepsImplementation.selectingUpdateSetAsDeploymentType(updateSet);
	}

	@When("selecting sets that contain {string} and moving them to the right side table")
	public void selecting_sets_that_contain_and_moving_them_to_the_right_side_table(String pendingCodeReview) {
		devOpsAutomatedBuildStepsImplementation.selectingCICDDevOpsInProgressSetsAndMovingToRightTable();
	}
}
