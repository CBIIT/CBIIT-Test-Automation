package AnalysisTools.LDLink.Steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LDLinkHomeAndLandingPageSteps extends PageInitializer {

	@Given("a LDlink user opens Analysis Tools page")
	public void a_LDlink_user_opens_Analysis_Tools_page() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://analysistools-qa.cancer.gov/");

	}

	@Then("user verify {string} present on the screen")
	public void user_verify_present_on_the_screen(String ldLinkText) {
		String expectedLDLinkText = ldLinkLandingPage.ldLinkTextOnLandingPage.getText();
		boolean ldLinkIsDisplayed = ldLinkLandingPage.ldLinkTextOnLandingPage.isDisplayed();
		Assert.assertTrue(ldLinkIsDisplayed);
		Assert.assertEquals(ldLinkText, expectedLDLinkText);
	}

	@Then("user verify the description {string}")
	public void user_verify_the_description(String ldLinkDescriptionText) {
		String ldLinkDescriptionOnLandingPage = ldLinkLandingPage.ldLinkDescriptionTextOnLandingPage.getText();
		boolean ldLinkDescriptionTextIsDisplayed = ldLinkLandingPage.ldLinkDescriptionTextOnLandingPage.isDisplayed();
		Assert.assertTrue(ldLinkDescriptionTextIsDisplayed);
		Assert.assertEquals(ldLinkDescriptionText, ldLinkDescriptionOnLandingPage);

	}

	@When("user clicks LDLink on landing page")
	public void user_clicks_LDLink_on_landing_page() {
	}

	@Then("User verify title is {string}")
	public void user_verify_title_is(String string) {
	}

	@When("a LDlink user opens home page")
	public void a_LDlink_user_opens_home_page() {
	}

}
