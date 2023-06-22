package CustomBusiness.EIDP.Steps;

import java.util.Map;
import org.openqa.selenium.By;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
		// if (CommonUtils.isElementPresent(By.id("orcidId"))) {
		// 	CommonUtils.sendKeys(WebDriverUtils.webDriver.findElement(By.id("orcidId")), "9999-9999-9999-9999");
		// }
		Map<String, String> requestData = CommonUtil.getMapFromDataTable(data);
		Thread.sleep(2000);
		generalInformationStepImpl.enterPrimaryMentor(requestData.get("Primary Mentor"));
		Thread.sleep(2000);
		generalInformationStepImpl.enterLabBranchName(requestData.get("Lab Driector name"));
		Thread.sleep(2000);
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
		MiscUtils.sleep(1000);
	}

	@When("User fills general information for delegate idp case")
	public void fillGeneralInformationForDelegateIdpCase(DataTable data) throws Exception {
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
		MiscUtils.sleep(1000);
	}

	@When("Edit general information")
	public void editGeneralInformation() {
		generalInformationStepImpl.editGeneralInformation();
	}

	@When("User selects primary mentor as \"([^\"]*)\"")
	public void selectPrimaryMentor(String name) throws Exception {
		// if (CommonUtils.isElementPresent(By.id("orcidId"))) {
		// 	CommonUtils.sendKeys(WebDriverUtils.webDriver.findElement(By.id("orcidId")), "9999-9999-9999-9999");
		// }
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

	@When("Review and Take Action and finish")
	public void test() {
		generalInformationStepImpl.reviewTakeAction();
		generalInformationStepImpl.sendToPrimaryMentor();
		CommonUtil.waitBrowser(2000);
		try {
			generalInformationStepImpl.clickYes();
		} catch (Exception e) {

		}
		CommonUtil.waitBrowser(2000);
		CucumberLogUtils.logScreenShot("IDP Hold Screenshot");

	}

}
