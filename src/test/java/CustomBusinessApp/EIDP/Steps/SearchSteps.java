package CustomBusinessApp.EIDP.Steps;

import java.util.Map;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import CustomBusinessApp.EIDP.Util.SharedData;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class SearchSteps extends PageInitializer{

	@When("User creates IDP request")
	public void createIDPrequest(DataTable dataTable) throws Exception {
		Map<String, String> requestData = CommonUtil.getMapFromDataTable(dataTable);
		searchStepimpl.selectSearchForDropdown(requestData.get("Search For"));
		searchStepimpl.checkTraineeWithoutIDPCheckbox();
		if(!requestData.get("Classification Type").isEmpty()) {
			searchStepimpl.selectClassificationType(requestData.get("Classification Type"));
		}
		searchStepimpl.clickOnSearchButton();
		searchStepimpl.selectActiveTrainee();
		Assert.assertTrue(searchStepimpl.isIDPFormDisplayed());
		CucumberLogUtils.logScreenShot("owner details page");
		searchStepimpl.selectNCITrainingOrganization(requestData.get("NCI Training Organization"));
		searchStepimpl.clickOnSaveAndSendMailButton();
		Assert.assertTrue(searchStepimpl.isIDPInitationSuccess());
		CucumberLogUtils.logScreenShot("IDP intiation message success");
		searchStepimpl.clickOnOkButton();
		
	}
	
	@When("User searches for completed idp request")
	public void searchCompletedIDP( ) {
		searchStepimpl.selectSearchForDropdown("Non-NCI (Fellows Only)");
		
	}
	
	@When("User selects search option as \"([^\"]*)\"")
	public void selectSearchFor(String searchOption) {
		searchStepimpl.selectSearchForDropdown(searchOption);
	}
	
	@When("User checks trainnes without IDP checkbox")
	public void traineesWithoutIDP() {
		searchStepimpl.checkTraineeWithoutIDPCheckbox();
	}
	
	@When("User selects classification type as \"([^\"]*)\"")
	public void selectClassification(String classificationType) {
		searchStepimpl.selectClassificationType(classificationType);
	}
	
	@When("User clicks on active trainee")
	public void selectActiveTrainne() throws Exception{
		searchStepimpl.selectActiveTrainee();
	}
	
	@Then("User will verify initiate IDP form is opned")
	public void verifyIDPFormOpen() {
		Assert.assertTrue(searchStepimpl.isIDPFormDisplayed());
		CucumberLogUtils.logScreenShot("owner details page");
	}
	
	@When("User selects nci training organization as \"([^\"]*)\"")
	public void selectNCITrainingOrganization(String optionVal) {
		
		searchStepimpl.selectNCITrainingOrganization(optionVal);
	}
	
	@When("User clicks on save and send mail button")
	public void clickOnSaveAndSendMailButton() {
		SharedData.traineeName = searchStepimpl.getInitiateTraineeAnotherName();
		searchStepimpl.clickOnSaveAndSendMailButton();
	}
	
	@Then("User will click on ok button")
	public void clickOnOkButton() {
		searchStepimpl.clickOnOkButton();
	}
	
	@Then("User will verify IDP initiation is successful")
	public void verifyIDPInitiationSuccessful() throws Exception{
		Assert.assertTrue(searchStepimpl.isIDPInitationSuccess());
		CucumberLogUtils.logScreenShot("IDP intiation message success");
	}
	//Revise
	@When("User selects {string} as {string}")
	public void user_searches_as(String dropDownName, String value) {
		searchStepimpl.selectStatus(value);
	}
	
	@When("User clicks on search button")
	public void clickOnSearchButton() {
		searchStepimpl.clickOnSearchButton();
	}

	@Then("User click on {string} button")
	public void user_click_on_button(String buttonName) {
		searchStepimpl.clickOnButton(buttonName);
	}

	@Then("User click on {string} on the grid")
	public void user_click_on_on_the_grid(String button) throws Exception {
		//searchStepimpl.selectReviewExistingIDP();
		button = button.trim();
		switch (button) {
		case "Revise Existing IDP":
			searchStepimpl.selectActiveCompletedIDP();
			break;
		case "Release Hold":
			searchStepimpl.selectReleaseHoldIDP();
			break;
		case "Cancel IDP" :
			searchStepimpl.selectCancelIDP();
			break;
		case "Undo Cancel IDP":
			searchStepimpl.selectUndoCancelIDP();
			break;
		case "Exist Survey":
			searchStepimpl.selectExistSurveyIDP();
			break;
		default:
			break;
		}
		
	}

	@Then("Select the reason as {string} checkbox")
	public void select_the_reason_as_checkbox(String value) {
		searchStepimpl.selectCheckBox(value);
	}
	
	@Then("User clicks on yes button in pop up")
	public void user_clicks_on_yes_button_in_pop_up() throws InterruptedException {
		searchStepimpl.clickOnPopUpYesButton();
	}
	
	@When("User reads the primary mentor name from release hold confirmation window")
	public void readPrimaryMentorNameFromConfirmationwindow() {
		CommonUtil.waitBrowser(4000);
		SharedData.primaryMentorName = searchStepimpl.getPrimaryMentorNameFromHoldConformationWindow();
		SharedData.traineeName = searchStepimpl.getTrainneeNameFromHoldConfirmationWindow();
		System.out.println("primaryMentorName = " + SharedData.primaryMentorName);
		System.out.println("traineeName = " + SharedData.traineeName);
		//commonPage.clickOnOkButton();
		
	}
	
	@When("User reads the trainee name from cancel idp confirmation window")
	public void readPrimaryMentorAndTrainneeNamesFromCancelIdpWindow() {
		CommonUtil.waitBrowser(4000);
		SharedData.traineeName = searchStepimpl.getTraineeeNameFromCancelIdpConformationWindow();
	}
	
	@When("User reads the trainee name from undo cancel idp confirmation window")
	public void readTrainneeNameFromUndoCancelIdpWindow() {
		CommonUtil.waitBrowser(4000);
		SharedData.traineeName = searchStepimpl.getTraineeeNameFromUndoCancelIdpConformationWindow();
	}
	
	@When("User enters release hold comments and clicks on ok button")
	public void enterReleaseHoldComments() {
		CommonUtil.waitBrowser(4000);
		searchStepimpl.enterReleaseHoldComments();
		searchStepimpl.clickOnReleaseHoldOkbutton();
		eidpCommonPage.clickOnOkButton();
		CommonUtil.waitBrowser(2000);
	}
	
	@When("User enters comments and clicks on yes button on cancel idp window")
	public void enterCancelIdpComments() {
		CommonUtil.waitBrowser(4000);
		searchStepimpl.enterCancelIdpComments("Cancel idp for testing");
		eidpCommonPage.clickOnYesButton();
		CommonUtil.waitBrowser(2000);
		eidpCommonPage.clickOnOkButton();
		CommonUtil.waitBrowser(3000);
	}
	
	@When("User enters comments and clicks on yes button on undo cancel idp window")
	public void enterUndoCancelIdpComments() {
		CommonUtil.waitBrowser(4000);
		searchStepimpl.enterUndoCancelIdpComments("Undo cancel idp for testing");
		searchStepimpl.clickOnUndoCancelYesButton();
		CommonUtil.waitBrowser(3000);
		eidpCommonPage.clickOnOkButton();
		CommonUtil.waitBrowser(3000);
	}
}
