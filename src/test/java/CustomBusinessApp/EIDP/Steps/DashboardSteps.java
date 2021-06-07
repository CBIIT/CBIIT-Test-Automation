package CustomBusinessApp.EIDP.Steps;


import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;

import CustomBusinessApp.EIDP.Util.SharedData;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardSteps extends PageInitializer {

	
	@When("User will click on search in dashboard")
	public void clickOnSearch() {
		eidpDashboardStepImpl.clickOnSearch();
		CucumberLogUtils.logScreenShot("After Search");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("User click on Search button")
	public void clickOnSearchButton() {
		eidpDashboardStepImpl.clickOnSearchButton();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@When("User will click on manage delegate button in dashboard")
	public void clickOnManageDelegate() {
		eidpDashboardStepImpl.clickOnManageDelegate();
		CucumberLogUtils.logScreenShot();
	}
	
	
	@When("User will click on IDP Awaiting response button")
	public void clickOnIDPAwaitingResponse() {
		eidpDashboardStepImpl.clickOnIDPAwaitResponsButton();
		CucumberLogUtils.logScreenShot();
	}
	
	@When("User will clickOn start idp button")
	public void clickOnStartIDPButton() throws Exception{
		eidpDashboardStepImpl.clickOnStartIDPButton();
		CucumberLogUtils.logScreenShot();
	}
	
	@When("User will clickOn proceed button")
	public void clickOnProceedButton() throws Exception{
		eidpDashboardStepImpl.clickOnProceedButton();
	}
	
	@When("User clicks on Send IDP to the Primary Mentor button")
	public void sendIDPtoPrimaryMentory() throws Exception{
		eidpDashboardStepImpl.clickOnSendIDPToPrimaryMentorButton();
		eidpCommonPage.waitForGoBackToHomePageButtonVisible();
	}
	
	@When("User clicks on VERIFY MEETING button")
	public void clickOnVerifyMeetingButton() {
		eidpDashboardStepImpl.clickOnVerifyMeetingButton();
		CucumberLogUtils.logScreenShot();
	}
	
	@When("User clicks on Verify meeting and accept IDP button")
	public void verifyMeetingAndAccept() {
		eidpCommonPage.clickOnVerifyMeetingAndAcceptIDPButton();
		CucumberLogUtils.logScreenShot();
	}
	
	@When("User enters meeting date and submits")
	public void enterMeetingDate() {
//		eidpCommonPage.enterToday();
		eidpDashboardStepImpl.selectVerifyMeetingCheckbox();
		eidpDashboardStepImpl.clickOnSubmitButton();
		eidpCommonPage.waitForGoBackToHomePageButtonVisible();
		CucumberLogUtils.logScreenShot();
	}
	
	@When("User enters verify meeting checkbox and submits")
	public void selectCheckBoxAndSubmit() {
		eidpDashboardStepImpl.selectVerifyMeetingCheckbox();
		eidpDashboardStepImpl.clickOnSubmitButton();
		eidpCommonPage.waitForGoBackToHomePageButtonVisible();
	}
	
	@When("User enters verify meeting checkbox and submits and waits for home queue")
	public void selectCheckboxAndSubmitAndWait() {
		eidpDashboardStepImpl.selectVerifyMeetingCheckbox();
		eidpDashboardStepImpl.clickOnSubmitButton();
		eidpCommonPage.waitForGoBackToHomeQueueButtonVisible();
	}
	
	@When("User clicks on yes button")
	public void clickOnyesButton() {
		eidpCommonPage.clickOnYesButton();
	}
	
	@When("User clicks on yes button on trainee page")
	public void clickYesButtonOnTrainee() {
		eidpCommonPage.clickOnYesButtonOnTrainee();
	}
	
	@When("User enters meeting date and submits and waits for home queue")
	public void enterMeetingDateAndWaitForHomeQueue() {
//		eidpCommonPage.enterToday();
		eidpDashboardStepImpl.selectVerifyMeetingCheckbox();
		eidpDashboardStepImpl.clickOnSubmitButton();
		eidpCommonPage.waitForGoBackToHomeQueueButtonVisible();
	}
	
	@Then("User verifies IDP request send successfully")
	public void verifyIDPRequestSentSucuessfully() {
		Assert.assertTrue(eidpDashboardStepImpl.isIDPSentMessage());
	}
	
	@When("User selects incomplete IDP request")
	public void selectIncompleteIDPRequest() {
		eidpDashboardStepImpl.selectFirstPendingReviewIDP();
	}
	
	@When("User clicks on the trainee specific IDP request")
	public void selectIncompleteIDPrequestOfTrainnee() throws Exception{
		eidpDashboardStepImpl.selectIDPRequestOfTrainee();
		CucumberLogUtils.logScreenShot();
	}
	
	@Then("Complete Process")
	public void lastStep(){
		eidpDashboardStepImpl.finishSteps();
	}
	
	@When("User clicks on proceed button of the trainee specific IDP request")
	public void clickProceedbuttonOfTrainee() throws Exception{
		eidpDashboardStepImpl.clickProceedButtonOfTrainee();
	}
	
	@When("User clicks on Decline IDP button")
	public void clickOnDeclineIDPButton() throws Exception{
		generalInformationStepImpl.clickOnGeneralInformationTab();
		SharedData.traineeName = generalInformationStepImpl.getTraineeName();
		generalInformationStepImpl.clickOnDeclineIDPButton();
		eidpCommonPage.clickOnOkButton();
	}
	
	@Then("Trainee verifies IDP request status as \"([^\"]*)\"")
	public void verifyRequestStatus(String expectedStatus) {
		String actualStatus = eidpDashboardStepImpl.getIDPRequestStatus();
		CucumberLogUtils.logScreenShot("Request Status");
		if(actualStatus != null) {
			actualStatus = actualStatus.trim();
			Assert.assertEquals(expectedStatus, actualStatus);
		}
	}
	
	@When("User clicks on yes button of modal")
	public void clickOnYesButton() {
		//CommonUtil.waitBrowser(3000);
		eidpCommonPage.clickOnModalFooterYesButton();
	}
}


