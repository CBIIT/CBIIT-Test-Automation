package CustomBusiness.EIDP.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import CustomBusiness.EIDP.Util.SharedData;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DashboardSteps extends PageInitializer {

	@When("User will click on search in dashboard")
	public void clickOnSearch() {
			eidpDashboardStepImpl.clickOnSearch();
			CucumberLogUtils.logScreenShot();
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
		try {
			eidpDashboardStepImpl.clickOnIDPAwaitResponsButton();
			CucumberLogUtils.logScreenShot();
		} catch (Exception e) {

		}
	}

	@When("User will clickOn start idp button")
	public void clickOnStartIDPButton() throws Exception {
		eidpDashboardStepImpl.clickOnStartIDPButton();
		CucumberLogUtils.logScreenShot();
	}

	@Then("user will click on revise idp button")
	public void reviseIDPButton() throws Exception {
		eidpDashboardStepImpl.clickOnReviseIDP();
	}

	@When("User will clickOn proceed button")
	public void clickOnProceedButton() throws Exception {
		eidpDashboardStepImpl.clickOnProceedButton();
		MiscUtils.sleep(3000);
	}

	@When("User clicks on Send IDP to the Primary Mentor button")
	public void sendIDPtoPrimaryMentory() throws Exception {
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
		eidpDashboardStepImpl.selectVerifyMeetingCheckbox();
		eidpDashboardStepImpl.clickOnSubmitButton();
		try {
			eidpCommonPage.waitForGoBackToHomePageButtonVisible();
		} catch (Exception e) {
		}
		CucumberLogUtils.logScreenShot();
	}

	@When("User enters verify meeting checkbox and submits")
	public void selectCheckBoxAndSubmit() {
		eidpDashboardStepImpl.selectVerifyMeetingCheckbox();
		eidpDashboardStepImpl.clickOnSubmitButton();
		try {
			eidpCommonPage.waitForGoBackToHomePageButtonVisible();
		} catch (Exception e) {

		}
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
		eidpDashboardStepImpl.selectVerifyMeetingCheckbox();
		eidpDashboardStepImpl.clickOnSubmitButton();
		eidpCommonPage.waitForGoBackToHomeQueueButtonVisible();
	}

	@When("User checks verify meeting checkbox and submits and waits for home page")
	public void enterMeetingDateAndWaitForHomePage() {
		eidpDashboardStepImpl.selectVerifyMeetingCheckbox();
		eidpDashboardStepImpl.clickOnSubmitButton();
		try {
			eidpCommonPage.waitForGoBackToHomeQueueButtonVisible();
		} catch (Exception e) {

		}
	}

	@When("User clicks on mark as reviewed checkbox")
	public void clickOnMarkAsReviewedCheckbox() {
		eidpCommonPage.clickOnMarkAsReviewed();
	}

	@Then("User verifies IDP request send successfully")
	public void verifyIDPRequestSentSucuessfully() {
		Assert.assertTrue(eidpDashboardStepImpl.isIDPSentMessage());
	}

	@When("User selects incomplete IDP request")
	public void selectIncompleteIDPRequest() {
		eidpDashboardStepImpl.selectFirstPendingReviewIDP();
	}

	@When("User clicks on the trainee specific IDP NHGRI request")
	public void selectIncompleteIDPrequestOfTrainneeNHGRI() throws Exception {
		eidpDashboardStepImpl.selectIDPRequestOfTraineeNHGRI();
		CucumberLogUtils.logScreenShot();
	}

	@When("User clicks on the trainee specific IDP request")
	public void selectIncompleteIDPrequestOfTrainnee() throws Exception {
		eidpDashboardStepImpl.selectIDPRequestOfTrainee();
		CucumberLogUtils.logScreenShot();
	}

	@When("User clicks on the trainee specific IDP being co-primary mentor")
	public void user_clicks_on_the_trainee_specific_IDP_being_co_primary_mentor() throws Exception {
		eidpDashboardStepImpl.clickProceedButtonOfTraineeCoPrimaryMentorNHGRI();
		CucumberLogUtils.logScreenShot();
	}

	@When("User clicks on the trainee specific IDP request for renewal")
	public void selectIncompleteIDPrequestOfTrainneeForRenewal() throws Exception {
		eidpDashboardStepImpl.selectIDPRequestOfTraineeForRenewal();
		CucumberLogUtils.logScreenShot();
	}

	@Then("Complete Process")
	public void lastStep() {
		eidpDashboardStepImpl.finishSteps();
	}

	@When("User clicks on proceed button of the trainee specific IDP request")
	public void clickProceedbuttonOfTrainee() throws Exception {
		eidpDashboardStepImpl.clickProceedButtonOfTrainee();
	}

	@When("User clicks on proceed button of the trainee specific IDP NHGRI request")
	public void clickProceedbuttonOfTraineeNHGRI() throws Exception {
		eidpDashboardStepImpl.clickProceedButtonOfTraineeNHGRI();
	}

	@When("User clicks on Decline IDP button")
	public void clickOnDeclineIDPButton() throws Exception {
		generalInformationStepImpl.clickOnGeneralInformationTab();
		SharedData.traineeName = generalInformationStepImpl.getTraineeName();
		generalInformationStepImpl.clickOnDeclineIDPButton();
		eidpCommonPage.clickOnOkButton();
	}

	@Then("Trainee verifies IDP request status as \"([^\"]*)\"")
	public void verifyRequestStatus(String expectedStatus) {
		String actualStatus = eidpDashboardStepImpl.getIDPRequestStatus();
		CucumberLogUtils.logScreenShot("Request Status");
		if (actualStatus != null) {
			actualStatus = actualStatus.trim();
			Assert.assertEquals(expectedStatus, actualStatus);
		}
	}

	@When("User clicks on yes button of modal")
	public void clickOnYesButton() throws Exception {
		eidpCommonPage.clickOnModalFooterYesButton();
		CommonUtil.waitBrowser(3000);
	}

	@When("User clicks on the requestto verify meeting")
	public void user_clicks_on_the_requestto_verify_meeting() throws Exception {
		eidpDashboardStepImpl.clickProceedButtonOfTraineeNHGRI();
	}

	@Then("User clicks on Home button")
	public void user_clicks_on_Home_button() {
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.xpath("//a[@title='Home']")));
	}

	@Then("User will click on manage delegate tab")
	public void user_will_click_on_manage_delegate_tab() {
		CommonUtils.click(eidpDashboardPage.manageDelegateTab);
	}

}
