package AnalysisTools.PLCO.Steps;

import com.nci.automation.utils.CucumberLogUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PLCOHomeSteps extends PageInitializer {
	
	
	@When("user clicks on source code")
	public void user_clicks_on_source_code() {
		PLCOHomePage.lnkSourceCode.click();
	}
	
	
	@Then("user goes to PLCO source code on github")
	public void user_goes_to_PLCO_source_code_on_github() {
		CucumberLogUtils.logScreenShot();
	}
	

}
