package AnalysisTools.LDLink.Steps;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LDLinkHomeAndLandingPageSteps extends PageInitializer {

	@Given("a LDlink user opens Analysis Tools page")
	public void a_LDlink_user_opens_Analysis_Tools_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("AnalysisToolsLandingPage"));
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
	}

	@When("user clicks LDLink on landing page")
	public void user_clicks_LDLink_on_landing_page() {
		CommonUtils.clickOnElement(analysisToolsLandingPage.ldLinkTextOnLandingPage);
	}

	@Then("User verify title is {string}")
	public void user_verify_title_is(String ldLinkHomePageDescription) {
		String ldLinkHomePageText = ldLinkHomePage.ldLinkHomePageDescriptionText.getText();
		System.out.println(ldLinkHomePageText);
		assertEquals(ldLinkHomePageDescription, ldLinkHomePageText);
	}

	@When("a LDlink user opens home page")
	public void a_LDlink_user_opens_home_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("LDLink"));
	}
}
