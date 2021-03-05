package ServiceNow.NERD.Steps;


import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CRS_Submission_Flow_Steps extends PageInitializer{
	
	@When("NCI Staff Member submits a screener")
	public void nci_Staff_Member_submits_a_screener() throws TestingException {
		
		/** This function starts the driver */
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		
		/** This function logs into NERD */
		nerdHomePage.serviceNowUsername.sendKeys("matarodriguezko");
		nerdHomePage.serviceNowPassword.sendKeys("Victoria1777!");
		JavascriptUtils.clickByJS(nerdHomePage.serviceNowSignIn);
		MiscUtils.sleep(1000);
		
		/** This submits a screener for covid19 */
		JavascriptUtils.clickByJS(nerdHomePage.covid19CreateNewSubmissionbtn);
		JavascriptUtils.clickByJS(nerdHomePage.titleTextBox);
		nerdHomePage.titleTextBox.sendKeys("Kevin Mata Test");
		JavascriptUtils.clickByJS(nerdHomePage.docDropDown);
		CommonUtils.selectValueFromBootStrapDropDown(nerdHomePage.docDropDownValues, "CBIIT");
		JavascriptUtils.clickByJS(nerdHomePage.nciActivityDropDown);
		CommonUtils.selectValueFromBootStrapDropDown(nerdHomePage.nciActivityDropDownValues, "App development/IT solutions");
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(nerdHomePage.descriptionTextBox);
		MiscUtils.sleep(1000);
		nerdHomePage.descriptionTextBox.sendKeys(" Test preformed by Kevin Mata");
		JavascriptUtils.clickByJS(nerdHomePage.covidStrategicCheckbox);
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nerdHomePage.grantValue);
		nerdHomePage.fundingInfoTextBox.sendKeys("Money from testing");
		JavascriptUtils.clickByJS(nerdHomePage.bladderValue);
		JavascriptUtils.clickByJS(nerdHomePage.basicValue);
		nerdHomePage.collaborationTextBox.sendKeys("Testing collaborations");
		nerdHomePage.pointOfContactTextBox.sendKeys("Testing Point of Contact");
		JavascriptUtils.drawRedBorder(nerdHomePage.submitNewSubmission);
		JavascriptUtils.clickByJS(nerdHomePage.submitNewSubmission);
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nerdHomePage.confirmingSubmission);
		
	}

	@Then("We use NERD Users on NERD native view")
	public void we_use_NERD_Users_on_NERD_native_view() {
		
	}

	@Then("We find the corresponding user to impersonate")
	public void we_find_the_corresponding_user_to_impersonate() {
		
	}

	@When("We go back to NERD UI and see what DOC planning contact sees")
	public void we_go_back_to_NERD_UI_and_see_what_DOC_planning_contact_sees() {
		
	}

	@Then("We submit to CRS")
	public void we_submit_to_CRS() {
		
	}


}

