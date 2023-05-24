package ServiceNow.SEER.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SEERLandingPageSteps extends PageInitializer {

	@Given("a user is on the SEER Data Access landing page")
	public void a_user_is_on_the_SEER_Data_Access_landing_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
		CucumberLogUtils.logScreenShot();
	}

	@When("the user attempts to request research data with existing email address {string}")
	public void the_user_attempts_to_request_research_data_with_existing_email_address(String existingEmailAddress) {
		CommonUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
		seerLandingPage.researchDataRequestsEmailAddressField.sendKeys(existingEmailAddress);
		seerLandingPage.registerForResearchDataButton.click();
	}

	@Then("user sees the following header {string}  and message pop-up with links:")
	public void user_sees_the_following_header_and_message_pop_up_with_links(String expectedHeaderText,
																			 String expectedParagraph) {

		CommonUtils.waitForVisibility(seerExistingAccountPage.headerText);
		String actualHeaderText = seerExistingAccountPage.headerText.getText();
		JavascriptUtils.drawBlueBorder(seerExistingAccountPage.headerText);
		CommonUtils.assertEquals(actualHeaderText, expectedHeaderText);

		String actualParagraphText = seerExistingAccountPage.paragraph.getText();
		JavascriptUtils.drawBlueBorder(seerExistingAccountPage.paragraph);
		CommonUtils.assertEquals(actualParagraphText, expectedParagraph);
		CucumberLogUtils.logScreenShot();
	}

	@Then("{string} button is also displayed")
	public void button_is_also_displayed(String expectedButtonText) {
		String actualButtonText = seerExistingAccountPage.backToSeerDatabaseDetailsButton.getText();
		JavascriptUtils.drawBlueBorder(seerExistingAccountPage.backToSeerDatabaseDetailsButton);
		CommonUtils.assertEquals(actualButtonText, expectedButtonText);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the SEER Data Access landing page has the following text displayed")
	public void the_SEER_Data_Access_landing_page_has_the_following_text_displayed(String expectedLandingPageText) {
		String actualLandingPageText = seerLandingPage.landingPageText.getText();
		System.out.println(actualLandingPageText);
		CommonUtils.assertEquals(actualLandingPageText, expectedLandingPageText);
		JavascriptUtils.scrollDown(300);
		JavascriptUtils.drawBlueBorder(seerLandingPage.landingPageText);
		CucumberLogUtils.logScreenShot();
	}
}