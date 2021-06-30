package CustomBusinessApp.EIDP.Steps;

import java.util.Map;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class GeneralInformationSteps extends PageInitializer {

	@When("User fills mandatory fields in general information")
	public void fillGeneralInformation() throws Exception {
		generalInformationStepImpl.fillGeneralInformation();
		CucumberLogUtils.logScreenShot("Generarl info completed");
	}

	@When("User fills mandatory fields in general information section")
	public void user_fills_mandatory_fields_in_general_information_section(io.cucumber.datatable.DataTable data)
			throws Exception {
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
		generalInformationStepImpl.selectRandomHighestDegree();
		generalInformationStepImpl.selectRandomCurrentTitle();
		CommonUtil.waitBrowser(2000);
		CucumberLogUtils.logScreenShot("General Info");
		generalInformationStepImpl.clickOnSaveAndContinueButton();
		MiscUtils.sleep(1000);
	}

	@When("User selects primary mentor as \"([^\"]*)\"")
	public void selectPrimaryMentor(String name) throws Exception {
		generalInformationStepImpl.enterPrimaryMentor(name);
		generalInformationStepImpl.selectRandomHighestDegree();
		CommonUtil.waitBrowser(2000);
		generalInformationStepImpl.clickOnSaveAndContinueButton();
	}
	@Then("User selects primary mentor as exactly {string}")
	public void user_selects_primary_mentor_as_exactly(String name) {
		generalInformationStepImpl.enterPrimaryMentor(name);
		CommonUtil.waitBrowser(2000);
		generalInformationStepImpl.clickOnSaveAndContinueButton();
		
	}
	@When("User will click on Search tab")
	public void user_will_click_on_Seacrh_tab() {
	    CommonUtils.click(generalInformationPage.searchSection);
	}



	@When("User clicks on Proceed button")
	public void user_clicks_on_Proceed_button() {
		CommonUtils.click(generalInformationPage.ProceedButton);
	}
	@Then("User will click on General Information section")
	public void user_will_click_on_General_Information_section() {
		CommonUtils.click(generalInformationPage.clickOnCompletedGeneralInfobutton);
	}


}
