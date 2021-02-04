package ServiceNow.SEER.Steps;

import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SEERLandingPageSteps extends PageInitializer {

	@Given("a user is on the SEER Data Access landing page")
	public void a_user_is_on_the_SEER_Data_Access_landing_page() throws TestingException {
		WebDriverUtils.getWebDriver();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
		CucumberLogUtils.logScreenShot();
	}

	@Then("the {string} text displays as")
	public void the_text_displays_as(String requestDatabaseAccessHeader, String requestDatabaseAccessParagraph) {
		Assert.assertEquals(requestDatabaseAccessHeader, seerLandingPage.requestDatabaseAccessHeader.getText());
		Assert.assertEquals(requestDatabaseAccessParagraph, seerLandingPage.requestDatabaseAccessText.getText());
	}

	@Then("under {string} the text displayed is")
	public void under_the_text_displayed_is(String institutionalAccounts, String doYouHaveAnAccount) {
		Assert.assertEquals(institutionalAccounts, seerLandingPage.institutionalAccountsHeaderText.getText());
		Assert.assertEquals(doYouHaveAnAccount, seerLandingPage.doYouHaveAnAccountParagraph.getText());
	}

	@Then("the text displayed is {string}")
	public void the_text_displayed_is(String ifYouAreUnable) {
		Assert.assertEquals(ifYouAreUnable, seerLandingPage.ifYouAreUnableToAuthenticateText.getText());
	}
	
	@Then("under {string}, text displayed is")
	public void under_text_displayed_is(String nonInstitutionalAccounts, String forAllOtherAccountsText) {
		Assert.assertEquals(nonInstitutionalAccounts, seerLandingPage.nonInstitutionalAccountsHeaderText.getText());
		Assert.assertEquals(forAllOtherAccountsText, seerLandingPage.forAllOtherAccountsParagraph.getText());
	}

	@Then("under {string} text displayed is {string} and {string}")
	public void under_text_displayed_is_and(String existingSeerAccountHolders, String pleaseEnterText,
			String requestSeerText) {
		Assert.assertEquals(existingSeerAccountHolders,
				seerLandingPage.existingSeerStatAccountHoldersHeaderText.getText());
		Assert.assertEquals(pleaseEnterText, seerLandingPage.pleaseEnterYourCurrentSeerStatUsernameParagraph.getText());
		Assert.assertEquals(requestSeerText, seerLandingPage.requestSeerResearchPlusDatabasesParagraph.getText());
	}

}
