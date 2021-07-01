package CustomBusinessApp.EIDP.Steps;

import java.util.Map;

import com.nci.automation.utils.CucumberLogUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class GeneralInformationSteps extends PageInitializer {

	@When("User fills mandatory fields in general information")
	public void fillGeneralInformation() throws Exception {
		generalInformationStepImpl.fillGeneralInformation();
		CucumberLogUtils.logScreenShot("Generarl info completed");
	}

	@When("User fills general information")
	public void fillGeneralInformation(DataTable data) throws Exception {
		Map<String, String> requestData = CommonUtil.getMapFromDataTable(data);
		generalInformationStepImpl.enterPrimaryMentor(requestData.get("Primary Mentor"));
		generalInformationStepImpl.enterLabBranchName(requestData.get("Lab Driector name"));
		String coPrimaryMentor = requestData.get("Co Primary Mentor");
		System.out.println("coPrimaryMentor = " + coPrimaryMentor);
		if (coPrimaryMentor != null && !"".equals(coPrimaryMentor)) {
			generalInformationStepImpl.doYouHaveCoPrimaryMentory(true);
			generalInformationStepImpl.selectCoPrimaryMentor(coPrimaryMentor);
		} else {
			generalInformationStepImpl.doYouHaveCoPrimaryMentory(false);
		}
		
		try {
			generalInformationStepImpl.selectRandomCurrentTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		generalInformationStepImpl.selectRandomHighestDegree();
		CommonUtil.waitBrowser(2000);
		CucumberLogUtils.logScreenShot("General Info");
		generalInformationStepImpl.clickOnSaveAndContinueButton();
	}

	@When("User fills general information for renewal")
	public void fillGeneralInformationForRenewal(DataTable data) throws Exception {
		/*
		 * Map<String, String> requestData = CommonUtil.getMapFromDataTable(data);
		 * generalInformationStepImpl.enterPrimaryMentor(requestData.
		 * get("Primary Mentor"));
		 * generalInformationStepImpl.enterLabBranchName(requestData.
		 * get("Lab Driector name")); String coPrimaryMentor =
		 * requestData.get("Co Primary Mentor"); System.out.println("coPrimaryMentor = "
		 * + coPrimaryMentor); if (coPrimaryMentor != null &&
		 * !"".equals(coPrimaryMentor)) {
		 * generalInformationStepImpl.doYouHaveCoPrimaryMentory(true);
		 * generalInformationStepImpl.selectCoPrimaryMentor(coPrimaryMentor); }
		 */
		generalInformationStepImpl.selectRandomHighestDegree();
		CommonUtil.waitBrowser(2000);
		CucumberLogUtils.logScreenShot("General Info");
		generalInformationStepImpl.clickOnSaveAndContinueButton();
	}

	@When("Edit general information")
	public void editGeneralInformation() {
		generalInformationStepImpl.editGeneralInformation();
	}
	
	@When("User selects primary mentor as \"([^\"]*)\"")
	public void selectPrimaryMentor(String name) throws Exception {
		generalInformationStepImpl.enterPrimaryMentor(name);
		generalInformationStepImpl.selectRandomHighestDegree();
		CommonUtil.waitBrowser(2000);
		generalInformationStepImpl.clickOnSaveAndContinueButton();
	}
	
	@When("Review and Take Action and finish")
	public void test() {
		generalInformationStepImpl.reviewTakeAction();
		generalInformationStepImpl.sendToPrimaryMentor();
		CommonUtil.waitBrowser(2000);
		generalInformationStepImpl.clickYes();
		CommonUtil.waitBrowser(2000);
		CucumberLogUtils.logScreenShot("IDP Hold Screenshot");
	}

}
