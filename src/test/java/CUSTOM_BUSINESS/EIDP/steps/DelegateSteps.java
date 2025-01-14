package CUSTOM_BUSINESS.EIDP.steps;

import static org.junit.Assert.fail;
import java.util.Map;

import com.nci.automation.web.CommonUtils;
import org.junit.Assert;
import CUSTOM_BUSINESS.EIDP.utils.CommonUtil;
import CUSTOM_BUSINESS.EIDP.utils.Constants.DelegationTypes;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
	}

	@Then("User checks \"([^\"]*)\" is added as delegate")
	public void verifyDelegateIsAdded(String name) {
		Assert.assertTrue(delegatePage.isDelegatePresentInTable(name));
	}

	@When("User deletes \"([^\"]*)\" from delegators table")
	public void deleteDelegator(String name) {
		delegatePage.deleteDelegator(name);
		CommonUtils.sleep(2000);
		Assert.assertEquals("Delegate deleted successfully.", delegatePage.getDeleteMessage());
	}

}
