package CustomBusinessApp.EIDP.Steps;

import static org.junit.Assert.fail;

import java.util.Map;

import org.junit.Assert;

import com.nci.automation.utils.MiscUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import CustomBusinessApp.EIDP.Util.Constants.DelegationTypes;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class DelegateSteps extends PageInitializer {

	@When("User select delegation type as \"([^\"]*)\"")
	public void selectDelegationtype(String type) throws Exception {
		if ("temporary".equalsIgnoreCase(type)) {
			delegatePage.selectDelegationType(DelegationTypes.TEMPORARY);
		} else if ("Permanent".equalsIgnoreCase(type)) {
			delegatePage.selectDelegationType(DelegationTypes.PERMANENT);
		} else {
			fail("Invalid delegation type value = " + type);
		}

	}

	@When("User adds new delegate")
	public void addNewDelegate(DataTable data) {
		Map<String, String> map = CommonUtil.getMapFromDataTable(data);
		delegatePage.selectName(map.get("Name"));
		if (map.get("Start Date") != "" && map.get("Start Date") != null) {
			delegatePage.selectStartDate(map.get("Start Date"));
		}
		if (map.get("End Date") != "" && map.get("End Date") != null) {
			delegatePage.selectEndDate(map.get("End Date"));
			delegatePage.clickOnAddbutton();
		} else {
			delegatePage.clickOnPermanentDelegateAddButton();
		}
		CommonUtil.waitBrowser(4000);
	}

	@Then("User checks \"([^\"]*)\" is added as delegate")
	public void verifyDelegateIsAdded(String name) {

		Assert.assertTrue(delegatePage.isDelegatePresentInTable(name));
	}

	@When("User deletes \"([^\"]*)\" from delegators table")
	public void deleteDelegator(String name) {
		delegatePage.deleteDelegator(name);
		MiscUtils.sleep(3000);
		delegatePage.clickOnDeleteButton();
	}

	@Then("User check delegate delete message")
	public void verifyDeleteMessage() {
		Assert.assertEquals("Delegate deleted successfully.", delegatePage.getDeleteMessage());
	}

}
