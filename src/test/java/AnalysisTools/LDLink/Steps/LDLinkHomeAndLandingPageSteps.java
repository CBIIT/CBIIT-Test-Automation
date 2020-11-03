package AnalysisTools.LDLink.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

import org.junit.Assert;


public class LDLinkHomeAndLandingPageSteps extends PageInitializer {
	
	
	@When("a LDlink user opens Analysis Tools page")
	public void a_LDlink_user_opens_Analysis_Tools_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("Analysistools"));
	}

	
	

	@When("a LDlink user opens home page")
	public void a_LDlink_user_opens_home_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("LDLink"));
	}

	@Then("user verify the description {string}")
	public void user_verify_the_description(String expectedText) {
	    String actualText = ldLinkLandingPage.lblLDLinkDescripition.getText();
	    Assert.assertEquals("Verifying LDLink landing page user sees LDLink description",
				expectedText, actualText);
	    CucumberLogUtils.logScreenShot();
	    
	}
	
	@Then("User verify title is {string}")
	public void user_verify_title_is(String expectedTitle) {
		String actualTitle = WebDriverUtils.webDriver.getTitle(); 
		Assert.assertEquals("Verifying COVIDcode homepage title", expectedTitle, actualTitle); 
	}
	
	@When("user clicks LDLink on landing page")
	public void user_clicks_LDLink_on_landing_page() {
		ldLinkLandingPage.lnkLDLink.click();
	   
	}


	@Then("user verify the following applications displayed with given description")
	public void user_verify_the_following_applications_displayed_with_given_description(Map<String,String> expApps) {
		CucumberLogUtils.logScreenShot();
		Map<String,String> actApps = ldLinkHomePage.getApplicationsNameAndDescription(); 
		Assert.assertEquals(expApps, actApps);
		
	}

	@When("user clicks on LDExpress application")
	public void userClicksOnLDLinkExpressApplication() {
		ldLinkHomePage.clickLDExpressCardOnHomePage();
	}






}
