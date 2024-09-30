package CustomBusiness.ETD.Steps;

import com.nci.automation.web.CommonUtils;
import org.testng.Assert;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LiaisonUserStep extends PageInitializer   {
	//@tabsPresentDisabled"
	@Then("User can verify that Home tab is disabled")
	public void user_can_verify_that_Home_tab_is_disabled() {
		// CommonUtils.click(etsApprovalPage.decisionDropdown);
		// CommonUtils.sleep(3000);
		// CommonUtils.click(etsApprovalPage.decisionDissaprove);
		// CommonUtils.sleep(3000);
	}
	
	@When("User cannot select all checkmark")
	public void user_cannot_select_all_checkmark() {
	    Assert.assertTrue(etdAdminNCIPage.disabledSelectAll.isDisplayed());
	    CommonUtils.sleep(3000);
	}
}