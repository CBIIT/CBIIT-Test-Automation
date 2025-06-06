
package CUSTOM_BUSINESS.ETD.steps;

import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NIDDKStep extends PageInitializer {
	// @profileNIDDK

	@When("User is on homepage")
	public void user_is_on_homepage() {
		// CommonUtils.click(committeeMemberVotingUserPage.yourVacanciesTab);
		// CommonUtils.sleep(1000);
	}

	@Then("User can delete the newly created NIDDK profile")
	public void user_can_delete_the_newly_created_NIDDK_profile() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser,"BULL, MELBOURNE");
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.deleteDorsey);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.confirmationDelete);
		CommonUtils.sleep(2000);
	}

	@Then("newly assigned NIDDK admin is able to log in")
	public void newly_assigned_NIDDK_admin_is_able_to_log_in() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		CommonUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "DORSEY, NOVELLA");
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}
	
	@Then("User can verify that NIDDK profile is present")
	public void user_can_verify_that_NIDDK_profile_is_present() {
		Assert.assertTrue(etdAdminNCIPage.acadiaProfile.isDisplayed());
		CommonUtils.sleep(2000);
	}
	
	@Then("User can verify that NIDDK profile is not present")
	public void user_can_verify_that_NIDDK_profile_is_not_present() {
		Assert.assertTrue(etdAdminNCIPage.alertNoMatchingTitle.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Alert is present ");
		}
	}
}