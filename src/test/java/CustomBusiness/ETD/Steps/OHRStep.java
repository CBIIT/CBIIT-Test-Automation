package CustomBusiness.ETD.Steps;

import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Then;

public class OHRStep extends PageInitializer  {
	
	@Then("newly assigned OHR admin is able to log in")
	public void newly_assigned_OHR_admin_is_able_to_log_in() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		MiscUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser, "HASKINS, APRILE");
		MiscUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can delete the newly created OHR profile")
	public void user_can_delete_the_newly_created_OHR_profile() {
		JavascriptUtils.scrollIntoView(etdAdminNCIPage.changeUserButtonNCI);
		JavascriptUtils.clickByJS(etdAdminNCIPage.changeUserButtonNCI);
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.inputFieldChangeUser);
		MiscUtils.sleep(4000);
		CommonUtils.sendKeys(etdAdminNCIPage.inputFieldChangeUser,"WARTONICK, JEAN");
		MiscUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(etdAdminNCIPage.dropdownChangeUser);
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(etdAdminNCIPage.deleteHaskins);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(etdAdminNCIPage.confirmationDelete);
		MiscUtils.sleep(2000);
	}
	
	@Then("User can verify that OHR profile is present")
	public void user_can_verify_that_OHR_profile_is_present() {
		Assert.assertTrue(etdAdminNCIPage.carolynProfile.isDisplayed());
		MiscUtils.sleep(2000);
	}
}
