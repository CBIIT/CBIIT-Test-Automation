package CustomBusiness.ETD.Steps;

import org.testng.Assert;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LiaisonUserStep extends PageInitializer   {
	//@tabsPresentDisabled"
	@Then("User can verify that Home tab is disabled")
	public void user_can_verify_that_Home_tab_is_disabled() {
		// CommonUtils.click(etsApprovalPage.decisionDropdown);
		// MiscUtils.sleep(3000);
		// CommonUtils.click(etsApprovalPage.decisionDissaprove);
		// MiscUtils.sleep(3000);
	}
	
	@When("User cannot select all checkmark")
	public void user_cannot_select_all_checkmark() {
	    Assert.assertTrue(etdAdminNCIPage.disabledSelectAll.isDisplayed());
	    MiscUtils.sleep(3000);
	}
}