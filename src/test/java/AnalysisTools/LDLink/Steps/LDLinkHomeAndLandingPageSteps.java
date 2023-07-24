package AnalysisTools.LDLink.Steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
<<<<<<< HEAD
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
=======
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
>>>>>>> 92078d40046069db66850893bb269e74285e7ad4

public class LDLinkHomeAndLandingPageSteps extends PageInitializer {

	@Given("a LDlink user opens Analysis Tools page")
	public void a_LDlink_user_opens_Analysis_Tools_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("Analysistools"));

	}

	@Then("user verifies {string} present on the screen")
	public void user_verifies_present_on_the_screen(String ldLinkText) {
		analysisToolsLandingPage.ldLinkDescriptionTextOnLandingPage.getText();
		System.out.println("Ldlink text displays " + analysisToolsLandingPage.ldLinkTextOnLandingPage.getText());
		String expectedLDLinkText = analysisToolsLandingPage.ldLinkTextOnLandingPage.getText();
		boolean ldLinkIsDisplayed = analysisToolsLandingPage.ldLinkTextOnLandingPage.isDisplayed();
		Assert.assertTrue(ldLinkIsDisplayed);
		Assert.assertEquals(ldLinkText, expectedLDLinkText);
	}

	@Then("user verifies the description {string}")
	public void user_verifies_the_description(String ldLinkDescriptionText) {
		String ldLinkDescriptionOnLandingPage = analysisToolsLandingPage.ldLinkDescriptionTextOnLandingPage.getText();
		boolean ldLinkDescriptionTextIsDisplayed = analysisToolsLandingPage.ldLinkDescriptionTextOnLandingPage
				.isDisplayed();
		Assert.assertTrue(ldLinkDescriptionTextIsDisplayed);
		Assert.assertEquals(ldLinkDescriptionText, ldLinkDescriptionOnLandingPage);
		CucumberLogUtils.logScreenShot();

	}

	@When("user clicks LDLink on landing page")
	public void user_clicks_LDLink_on_landing_page() {
		CommonUtils.click(analysisToolsLandingPage.ldLinkTextOnLandingPage);
	}

	@Then("User verify title is {string}")
	public void user_verify_title_is(String ldLinkHomePageDescription) {
		String ldLinkHomePageText = ldLinkHomePage.ldLinkHomePageDescriptionText.getText();
		System.out.println(ldLinkHomePageText);
		assertEquals(ldLinkHomePageDescription, ldLinkHomePageText);
		CucumberLogUtils.logScreenShot();
	}

	@When("a LDlink user opens home page")
	public void a_LDlink_user_opens_home_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("LDLink"));
	}

}
