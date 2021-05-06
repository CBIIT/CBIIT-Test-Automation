package ServiceNow.SEER.Steps;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.nci.automation.common.Constants;
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
		CucumberLogUtils.logScreenShot();
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
		CucumberLogUtils.logScreenShot();
	}

}

From:"Nekrashevich, Alena (NIH/NCI) [C]"<alena.nekrashevich @nih.gov>Date:Wednesday,May 5,2021 at 9:13

PM To:"Juarez, Diego (NIH/NCI) [C]"<diego.juarez
@nih.gov>Subject:RE:LandingPage.feature

Thank
you
Diego.
Could you
please send
me the SEERDataAccessRequestPageSteps.java?

Best regards,
Alena
Nekrashevich
NCI CBIIT–
QA Automation

Engineer
(202) 445-7020(Cell)
 
From: Juarez, Diego (NIH/NCI) [C] <diego.juarez@nih.gov> 
Sent: Wednesday, May 5, 2021 5:33 PM
To: Nekrashevich, Alena (NIH/NCI) [C] <alena.nekrashevich@nih.gov>
Subject: LandingPage.feature
 
Feature: SEER Data Access Landing Page Scenarios
 
  @Smoke @juarezds
  Scenario: Verifying Request Database Access text
    Given a user is on the SEER Data Access landing page
    Then the "Request Database Access" text displays as
      """
      Request Database Access
      To request access to the SEER Incidence Databases, you will need to create a new SEER*Stat account by registering. For immediate access to the SEER Research Plus Databases, you will need to register with your eRA Commons credentials using the Institutional Account Login. If you do not have an eRA commons login and are not affiliated with an Institute, you will need to use the Non-Institutional Account, and will receive access to the SEER Research Database.
      If you are affiliated with an Institute and have an institutional email account (.edu, .gov, .org), you must use your eRA Commons credentials to request the SEER data.
      Existing SEER*Stat account holders can upgrade access to the Research Plus Databases by logging in with your SEER*Stat Username and registered email address.
      Only users who have already used this system to request a new, non-Institutional account can upgrade an existing account. All other users should follow steps to create a new account.
      """
 
  @Smoke @juarezds
  Scenario: Verifying Institutional Accounts, Non-Institutional Accounts, Existing SEER*Stat Account Holders text on landing page
    Given a user is on the SEER Data Access landing page
    Then under "Institutional Accounts" the text displayed is
      """
      Do you have an account affiliated with a research organization?
      Examples include: eRA commons login, NIH, HHS, etc.
      """
    And the text displayed is "* If you are unable to authenticate, please use the Non-institutional option."
    And under "Non-Institutional Accounts", text displayed is
      """
      For all other accounts, please enter your email to continue.
      Examples include Google or Yahoo accounts.
      """
    And under "Existing SEER*Stat Account Holders" text displayed is "Please enter your current SEER*Stat Username and the email address you used to request access to other databases." and "Request SEER Research Plus Databases"
