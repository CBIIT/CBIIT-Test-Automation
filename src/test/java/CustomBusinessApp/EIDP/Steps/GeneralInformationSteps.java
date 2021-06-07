package CustomBusinessApp.EIDP.Steps;

import java.util.Map;

import com.nci.automation.utils.CucumberLogUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class GeneralInformationSteps extends PageInitializer{

	@When("User fills mandatory fields in general information")
	public void fillGeneralInformation() throws Exception{
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
		if(coPrimaryMentor != null && !"".equals(coPrimaryMentor)) {
			generalInformationStepImpl.doYouHaveCoPrimaryMentory(true);
			generalInformationStepImpl.selectCoPrimaryMentor(coPrimaryMentor);
			
		} else {
			generalInformationStepImpl.doYouHaveCoPrimaryMentory(false);
		}
		generalInformationStepImpl.selectRandomHighestDegree();
		try {
			generalInformationStepImpl.selectRandomCurrentTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		CommonUtil.waitBrowser(2000);
		CucumberLogUtils.logScreenShot("General Info");
		generalInformationStepImpl.clickOnSaveAndContinueButton();
	}
	
	@When("User selects primary mentor as \"([^\"]*)\"")
	public void selectPrimaryMentor(String name) throws Exception {
		generalInformationStepImpl.enterPrimaryMentor(name);
		generalInformationStepImpl.selectRandomHighestDegree();
		CommonUtil.waitBrowser(2000);
		generalInformationStepImpl.clickOnSaveAndContinueButton();
	}
	
	
}
