package ANALYSIS_TOOLS.CEDCD.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;

public class CEDCDAdminPageSteps extends PageInitializer {

	@When("the user filters and selects from submitted cohorts")
	public void the_user_filters_and_selects_from_submitted_cohorts() {
		JavascriptUtils.clickByJS(cedcdAdminPage.cohortStatusDropDown);
		CommonUtils.sleep(1000);
		JavascriptUtils.clickByJS(cedcdAdminPage.cohortSubmittedStatus);
		CommonUtils.sleep(1000);
		JavascriptUtils.clickByJS(cedcdAdminPage.viewAllBtn);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(cedcdAdminPage.firstSubmittedCohort);
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
	}

	@When("the user checks all sections")
	public void the_user_checks_all_sections() {
		/** This step clicks on the next button on Section A */
		JavascriptUtils.scrollScreen(0, 1500);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);

		/** This step clicks on the next button on Section B */
		JavascriptUtils.scrollScreen(0, 1500);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);

		/** This step clicks on the next button on Section C */
		JavascriptUtils.scrollScreen(0, 3000);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);

		/** This step clicks on the next button on Section D */
		JavascriptUtils.scrollScreen(0, 1500);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);

		/** This step clicks on the next button on Section E */
		JavascriptUtils.scrollScreen(0, 1500);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);

		/** This step clicks on the next button on Section F */
		JavascriptUtils.scrollScreen(0, 1500);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);

		/** This step clicks on the next button on Section G */
		JavascriptUtils.scrollScreen(0, 1500);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.waitForClickability(cedcdAdminPage.approveButton);
		JavascriptUtils.clickByJS(cedcdAdminPage.approveButton);
	}

	@Then("the admin can publish the cohort")
	public void the_admin_can_publish_the_cohort() {
		/** This step is confirming the Publishing of the cohort */
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.isElementDisplayed(cedcdAdminPage.publishCohortPopUp);
		JavascriptUtils.clickByJS(cedcdAdminPage.publishButton);
		CommonUtils.sleep(500);
		CucumberLogUtils.logScreenshot();
	}

	@When("the user waits five minutes")
	public void the_user_waits_five_minutes() {
		CommonUtils.sleep(300000);
	}

	@Then("the timeout alert box is shown")
	public void the_timeout_alert_box_is_shown() {
		CommonUtils.isElementDisplayed(cedcdAdminPage.sessionTimeout);
	}
}
