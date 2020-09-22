package AnalysisTools.LDLink.Steps;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LDLinkHomePageSteps extends PageInitializer {
	
	@When("a LDLink user opens landing page")
	public void a_LDLink_user_opens_landing_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("LDLink"));
	}

	@Then("user verify LDLink present on the screen")
	public void user_verify_LDLink_present_on_the_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("user verify the description {string}")
	public void user_verify_the_description(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}





}
