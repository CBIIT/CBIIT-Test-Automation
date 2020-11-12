package AnalysisTools.PLCO.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;

import AnalysisTools.PLCO.Pages.APIAcessPage;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class APIAcessSteps extends PageInitializer {
	
	@When("user selects API Acess tab")
	public void user_selects_API_Acess_tab() {
		apiAcessPage.lnkAPIAcess.click();
		

	}

	@Then("API Acess page displays")
	public void api_Acess_page_displays() {
		CucumberLogUtils.logScreenShot();
	}
	
	@Then("API Acess page displays {string} heading")
	public void api_Acess_page_displays_heading(String heading) {
		Assert.assertTrue(apiAcessPage.txtAPIAcessHeading.getText().contentEquals(heading));
		
	}


}
