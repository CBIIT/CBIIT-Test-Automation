package CustomBusinessApp.EIDP.Steps;

import java.util.Map;

import com.nci.automation.utils.CucumberLogUtils;
<<<<<<< Updated upstream
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
=======
>>>>>>> Stashed changes

import CustomBusinessApp.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

<<<<<<< Updated upstream
public class GeneralInformationSteps extends PageInitializer {

	@When("User fills mandatory fields in general information")
	public void fillGeneralInformation() throws Exception {
		generalInformationStepImpl.fillGeneralInformation();
		CucumberLogUtils.logScreenShot("Generarl info completed");
	}

	@When("User fills mandatory fields in general information section")
	public void user_fills_mandatory_fields_in_general_information_section(io.cucumber.datatable.DataTable data)
			throws Exception {
=======
public class GeneralInformationSteps extends PageInitializer{

	@When("User fills mandatory fields in general information")
	public void fillGeneralInformation() throws Exception{
		generalInformationStepImpl.fillGeneralInformation();
		CucumberLogUtils.logScreenShot("Generarl info completed");
	}
	
	@When("User fills general information")
	public void fillGeneralInformation(DataTable data) throws Exception {
>>>>>>> Stashed changes
		Map<String, String> requestData = CommonUtil.getMapFromDataTable(data);
		generalInformationStepImpl.enterPrimaryMentor(requestData.get("Primary Mentor"));
		generalInformationStepImpl.enterLabBranchName(requestData.get("Lab Driector name"));
		String coPrimaryMentor = requestData.get("Co Primary Mentor");
		System.out.println("coPrimaryMentor = " + coPrimaryMentor);
<<<<<<< Updated upstream
		if (coPrimaryMentor != null && !"".equals(coPrimaryMentor)) {
			generalInformationStepImpl.doYouHaveCoPrimaryMentory(true);
			generalInformationStepImpl.selectCoPrimaryMentor(coPrimaryMentor);

=======
		if(coPrimaryMentor != null && !"".equals(coPrimaryMentor)) {
			generalInformationStepImpl.doYouHaveCoPrimaryMentory(true);
			generalInformationStepImpl.selectCoPrimaryMentor(coPrimaryMentor);
			
>>>>>>> Stashed changes
		} else {
			generalInformationStepImpl.doYouHaveCoPrimaryMentory(false);
		}
		generalInformationStepImpl.selectRandomHighestDegree();
		generalInformationStepImpl.selectRandomCurrentTitle();
		CommonUtil.waitBrowser(2000);
		CucumberLogUtils.logScreenShot("General Info");
		generalInformationStepImpl.clickOnSaveAndContinueButton();
	}
<<<<<<< Updated upstream

=======
	
>>>>>>> Stashed changes
	@When("User selects primary mentor as \"([^\"]*)\"")
	public void selectPrimaryMentor(String name) throws Exception {
		generalInformationStepImpl.enterPrimaryMentor(name);
		generalInformationStepImpl.selectRandomHighestDegree();
		CommonUtil.waitBrowser(2000);
		generalInformationStepImpl.clickOnSaveAndContinueButton();
	}
<<<<<<< Updated upstream

	@When("User clicks on Proceed button")
	public void user_clicks_on_Proceed_button() {
		CommonUtils.click(generalInformationPage.ProceedButton);
	}

}
=======
	
	
}
>>>>>>> Stashed changes
