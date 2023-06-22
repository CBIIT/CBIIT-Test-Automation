
package CustomBusiness.ETD.Steps;

import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializer;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NIDDKStep extends PageInitializer {
	// @profileNIDDK

	@When("User is on homepage")
	public void user_is_on_homepage() {
		// CommonUtils.click(committeeMemberVotingUserPage.yourVacanciesTab);
		// MiscUtils.sleep(1000);
	}

	@Then("User can delete the newly created NIDDK profile")
	public void user_can_delete_the_newly_created_NIDDK_profile() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		MiscUtils.sleep(3000);
		CommonUtils.click(etdAdminNCIPage.inputFieldChangeUser);
		MiscUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser,"BULL, MELBOURNE");
		MiscUtils.sleep(4000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(etdAdminNCIPage.dropdownChangeUser);
		MiscUtils.sleep(3000);
		CommonUtils.click(etdAdminNCIPage.deleteDorsey);
		MiscUtils.sleep(2000);
		CommonUtils.click(etdAdminNCIPage.confirmationDelete);
		MiscUtils.sleep(2000);
	}

	@Then("newly assigned NIDDK admin is able to log in")
	public void newly_assigned_NIDDK_admin_is_able_to_log_in() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		MiscUtils.sleep(3000);
		CommonUtils.click(etdAdminNCIPage.inputFieldChangeUser);
		MiscUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "DORSEY, NOVELLA");
		MiscUtils.sleep(4000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(etdAdminNCIPage.dropdownChangeUser);
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
	}
	
	@Then("User can verify that NIDDK profile is present")
	public void user_can_verify_that_NIDDK_profile_is_present() {
		Assert.assertTrue(etdAdminNCIPage.acadiaProfile.isDisplayed());
		MiscUtils.sleep(2000);
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