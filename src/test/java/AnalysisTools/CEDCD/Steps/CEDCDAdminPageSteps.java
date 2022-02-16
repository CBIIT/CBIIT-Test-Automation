package AnalysisTools.CEDCD.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDAdminPageSteps extends PageInitializer {
	
	@When("the user filters and selects from submitted cohorts")
	public void the_user_filters_and_selects_from_submitted_cohorts() {
		
		JavascriptUtils.clickByJS(cedcdAdminPage.cohortStatusDropDown);
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(cedcdAdminPage.cohortSubmittedStatus);
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(cedcdAdminPage.viewAllBtn);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(cedcdAdminPage.firstSubmittedCohort);
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		
	}

	@When("the user checks all sections")
	public void the_user_checks_all_sections() {
		
		/** This step clicks on the next button on Section A */
		
		CucumberLogUtils.logScreenShot();
		CommonUtils.scrollDown(0 , 1500);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);
		
		
//		/** This step clicks on the next button on Section B */
		CommonUtils.scrollDown(0 , 1500);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);

//		/** This step clicks on the next button on Section C */
		CommonUtils.scrollDown(0 , 3000);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);
 
		
//		/** This step clicks on the next button on Section D */
		CommonUtils.scrollDown(0 , 1500);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);
	
//		/** This step clicks on the next button on Section E */
		CommonUtils.scrollDown(0 , 1500);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);
	
//		/** This step clicks on the next button on Section F */
		CommonUtils.scrollDown(0 , 1500);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(cedcdCohortPage.nextButton);
	
//		/** This step clicks on the next button on Section G */
		CommonUtils.scrollDown(0 , 1500);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.waitForClickability(cedcdAdminPage.approveButton);
		JavascriptUtils.clickByJS(cedcdAdminPage.approveButton);
		
	}

	@Then("the admin can publish the cohort")
	public void the_admin_can_publish_the_cohort() {
		
		/** This step is confirming the Publishing of the cohort */
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(cedcdAdminPage.publishCohortPopUp.isDisplayed());
		JavascriptUtils.clickByJS(cedcdAdminPage.publishButton);
		MiscUtils.sleep(500);
		CucumberLogUtils.logScreenShot();
		
	}
	
	@When("the user waits five minutes")
	public void the_user_waits_five_minutes() {
		
		MiscUtils.sleep(300000);
		
	}

	@Then("the timeout alert box is shown")
	public void the_timeout_alert_box_is_shown() {
		
		
		Assert.assertTrue(cedcdAdminPage.sessionTimeout.isDisplayed());
		
	}

}
