package ServiceNow.CHARMS.Steps;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.asserts.SoftAssert;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import ServiceNow.CHARMS.NativeView.Pages.CHARMSParticipantDetailsPage;
import ServiceNow.CHARMS.Utils.CharmsUtil;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FanconiEligibilityQuestionnaireSteps extends PageInitializer {
	String referralValue;
	String consent = System.getProperty("user.name") + "git/CBIIT-Test-Automation/src/main/resources/Family Cohort Study Consent.pdf";
	
	SoftAssert softAssert = new SoftAssert();

	Map<String, String> currentRow; // Excel Data Reader for FanconiScreener Tab
	Map<String, String> currentRowForAnotherStudy; // Excel Data Reader for OtherStudies Tab
	Map<String, String> currentRowForCancerHistory; // Excel Data Reader for Cancer History Tab

	/******************************************************************/
	/************** FANCONI SCREENER SUBMISSION FROM PORTAL ***********/
	/******************************************************************/

	@Given("All scenarios are submitted")
	public void all_scenarios_are_submitted()
			throws TestingException, JsonIOException, JsonSyntaxException, FileNotFoundException {

		for (int i = 10; i <= 10; ++i) {
			String username = "charmsparticipant" + i + "@yopmail.com";
			String password = "Charms123";
			System.out.println(username);
			MiscUtils.sleep(1000);
			if (i != 1) {
				try {
					CharmsUtil.clickOnElement(fanconiLoginPage.LogoutDropDownLink);
					CharmsUtil.clickOnElement(fanconiLoginPage.LogoutButton);
				} catch (Exception e) {
				}
			}
			WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("fanconiLogin"));
			System.out.println(WebDriverUtils.webDriver.getCurrentUrl());
			MiscUtils.sleep(1000);
			CommonUtils.waitForVisibility(fanconiLoginPage.enrollLoginButton);
			CharmsUtil.clickOnElement(fanconiLoginPage.enrollLoginButton);
			CharmsUtil.sendKeysToElement(oktaLoginPage.usernameTxtBox, username);
			CharmsUtil.sendKeysToElement(oktaLoginPage.passwordTxtBox, password);
			MiscUtils.sleep(600);
			CommonUtils.waitForVisibility(oktaLoginPage.loginBtn);
			CharmsUtil.clickOnElement(oktaLoginPage.loginBtn);
			CommonUtils.waitForVisibility(fanconiLoginPage.warningAgreeButton);
			CharmsUtil.clickOnElement(fanconiLoginPage.warningAgreeButton);
			fanconiLoginPage.eligibilityQuestionnaireLink.click();
			fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(i - 1);
			// Click the submit button
			CharmsUtil.clickOnElement(fanconiEligibilityQuestionnairePage.nextButton);

			Set<String> windows = WebDriverUtils.webDriver.getWindowHandles();
			int sizer = windows.size();
			System.out.println(sizer);

			Iterator<String> iterator = windows.iterator();
			while (iterator.hasNext()) {
				String selectedTab = iterator.next();
				System.out.println(WebDriverUtils.webDriver.getCurrentUrl());
				WebDriverUtils.webDriver.switchTo().window(selectedTab);
				break;
			}
		}
	}

	@Then("fills the Fanconi Eligibility Questionnaire form for scenario1")
	public void fills_the_Fanconi_Eligibility_Questionnaire_form_for_scenario1() {
		fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(0);
	}

	@Then("fills the Fanconi Eligibility Questionnaire form for scenario2")
	public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario2() {
		fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(1);
	}

	@Then("fills the Fanconi Eligibility Questionnaire form for scenario3")
	public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario3() {
		fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(2);
	}

	@Then("fills the Fanconi Eligibility Questionnaire form for scenario4")
	public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario4() {
		fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(3);
	}

	@Then("fills the Fanconi Eligibility Questionnaire form for scenario5")
	public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario5() {
		fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(4);
	}

	@Then("fills the Fanconi Eligibility Questionnaire form for scenario6")
	public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario6() {
		fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(5);
	}

	@Then("fills the Fanconi Eligibility Questionnaire form for scenario7")
	public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario7() {
		fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(6);
	}

	@Then("fills the Fanconi Eligibility Questionnaire form for scenario8")
	public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario8() {
		fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(7);
	}

	@Then("fills the Fanconi Eligibility Questionnaire form for scenario9")
	public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario9() {
		fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(8);
	}

	@Then("fills the Fanconi Eligibility Questionnaire form for scenario10")
	public void fills_the_fanconi_eligibility_questionnaire_form_for_scenario10() {
		fanconiEligibilityQuestionnaireStepsImpl.fanconiEligibilityQuestionnaireSubmissionScenario(9);
	}

	@Then("clicks the submit button")
	public void clicks_the_submit_button() {
		// Click the submit button
		fanconiEligibilityQuestionnaireStepsImpl.clickSubmitButton();
		// Close the window
		WebDriverUtils.closeWebDriver();
	}

	/******************************************************************/
	/************** FANCONI SCREENER NATIVE VIEW ASSERTION *************/
	/******************************************************************/

	@Given("the study nurse log in Native View")
	public void the_study_nurse_log_in_Native_View() throws InvalidFormatException, IOException, TestingException {
		// Logging into native view
		fanconiEligibilityQuestionnaireStepsImpl.loginToNativeView();
		// Logging into the Participant details page in Native View
		fanconiEligibilityQuestionnaireStepsImpl.loginToParticipantDetailsPageInNativeView();
	}

	/*********************************************************************/
	/******** PARTICIPANT DETAILS PAGE IN NATIVE VIEW ASSERTIONS ********/
	/*********************************************************************/

	@Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page for all scenarios")
	public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Participant_Details_page_for_all_scenarios()
			throws InvalidFormatException, IOException, TestingException {

		// Data verification in Participant Details page for all the scenarios
		for (int i = 0; i <= 9; i++) {
			fanconiEligibilityQuestionnaireStepsImpl.participantDetailPageAssertion(i);
			CharmsUtil.clickOnElement(CHARMSParticipantDetailsPage.nVAllParticipantDetailsBackButton);
		}
	}

	@Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Participant Details page for each scenario")
	public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Participant_Details_page_for_each_scenario()
			throws InvalidFormatException, IOException, TestingException {
		// rowcount is the scenario num
		int rowcount = 0;
		fanconiEligibilityQuestionnaireStepsImpl.participantDetailPageAssertion(rowcount);
	}

	/*********************************************************************/
	/***** FANCONI STUDY SCREENER PAGE IN NATIVE VIEW ASSERTIONS *********/
	/*********************************************************************/

	@Given("the study nurse log in Native View and go to Study Screener page")
	public void the_study_nurse_log_in_native_view_and_go_to_study_screener_page() {
		// Logging into native view
		fanconiEligibilityQuestionnaireStepsImpl.loginToNativeView();
		// Login to the All referral list view in Native View
		fanconiEligibilityQuestionnaireStepsImpl.loginToFanconiStudyPageInNativeView();
	}

	@Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page for all scenarios")
	public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Fanconi_Study_Screener_page_for_all_scenarios()
			throws InvalidFormatException, IOException, TestingException {
		for (int i = 0; i <= 9; i++) {
			// Log into the Fanconi study page by clicking the Preview button in All
			// referral list view page
			fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPreviewRecordClicked(i);
			// Fanconi Screener page verification
			fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPageAssertions(i);
			fanconiScreenerNVPage.nVFScreenerBackButton.click();
			MiscUtils.sleep(2000);
		}
	}

	@Then("data submitted via the Fanconi Eligibility Questionnaire is verified in Fanconi Study Screener page for each scenario")
	public void data_submitted_via_the_Fanconi_Eligibility_Questionnaire_is_verified_in_Fanconi_Study_Screener_page_for_each_scenario()
			throws InvalidFormatException, IOException, TestingException {
		int rowcount = 0;
		fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPreviewRecordClicked(rowcount);
		fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyPageAssertions(rowcount);
		fanconiScreenerNVPage.nVFScreenerBackButton.click();
	}

	@Then("data submitted is verified in Fanconi Study page")
	public void data_submitted_is_verified_in_fanconi_study_page()
			throws InvalidFormatException, IOException, TestingException {
		// Participant complete Fanconi Study page is verified in SN
		fanconiEligibilityQuestionnaireStepsImpl.fanconiStudyCompleteAssertion(0);
	}

	@Then("consent in Fanconi is verified")
	public void consent_in_Fanconi_is_verified() {
		int rowcount = 1;		
		/* Click the Participant details Record */
		fanconiEligibilityQuestionnaireStepsImpl.participantDetailRecordClicked(rowcount);
		// Participant Consent Assent Table is verified
		fanconiEligibilityQuestionnaireStepsImpl.fanconiConsentAssertionOnFanconiStudyPage(rowcount);
	}
}
