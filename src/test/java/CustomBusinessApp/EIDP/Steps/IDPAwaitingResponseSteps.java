package CustomBusinessApp.EIDP.Steps;

import java.util.Map;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import CustomBusinessApp.EIDP.Util.SharedData;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class IDPAwaitingResponseSteps extends PageInitializer{

	
	@When("User creates a new IDP request and moves it to completed status")
	public void createCompletedIDPRequest(DataTable dataTable) throws Exception{
		Map<String, String> requestData = CommonUtil.getMapFromDataTable(dataTable);
		eidpDashboardStepImpl.clickOnSearch();
		searchStepimpl.selectSearchForDropdown(requestData.get("Search For"));
		searchStepimpl.checkTraineeWithoutIDPCheckbox();
		searchStepimpl.selectClassificationType(requestData.get("Classification Type"));
		searchStepimpl.selectActiveTrainee();
		Assert.assertTrue(searchStepimpl.isIDPFormDisplayed());
		CucumberLogUtils.logScreenShot("owner details page");
		searchStepimpl.selectNCITrainingOrganization(requestData.get("NCI Training Organization"));
		searchStepimpl.clickOnSaveAndSendMailButton();
		Assert.assertTrue(searchStepimpl.isIDPInitationSuccess());
		CucumberLogUtils.logScreenShot("IDP intiation message success");
		searchStepimpl.clickOnOkButton();
		changeUserToTrainnee();
		Thread.sleep(4000);
		eidpDashboardStepImpl.clickOnStartIDPButton();
		generalInformationStepImpl.fillGeneralInformation();
		projectRelatedDeliverableStepImpl.fillProjectDeliverableData();
		careerGoalAndActiveStepImpl.fillCarrerGoalActivite();
		aligningExpectationsStepImpl.fillAligningExpectations();
		aligningExpectationsStepImpl.clickOnReviewAndTakeActionButton();
		eidpDashboardStepImpl.clickOnSendIDPToPrimaryMentorButton();
		eidpCommonPage.waitForGoBackToHomePageButtonVisible();
		eidpLoginStepImpl.changeUser("Berzofsky,Jay");
	}
	
	public void changeUserToTrainnee() throws Exception {
		
		String updatedUserName = SharedData.traineeName;
		if(!SharedData.traineeName.contains(",")) {
			String[] temp = SharedData.traineeName.split(" ");
			if(temp.length > 2) {
				updatedUserName = temp[1] + " " + temp[2] + "," + temp[0];
			} else {
				updatedUserName = temp[1] + "," + temp[0];
			} 
		}
		System.out.println("trainee name = " + updatedUserName);
		eidpLoginStepImpl.changeUserToTrainee(updatedUserName);
	}
	
	@When("User will click on proceed button of trainee")
	public void clickOntrainee() {
		iDPAwaitingResponsePage.clickOnProceedOfTrainee();
	}
	
	@When("User will provide the general information feedback as \"([^\"]*)\" for \"([^\"]*)\"")
	public void generalInformationFeedback() {
		
	}
	
	@When("Logged in user changes the user to {string}And User will click on IDP Awaiting response button")
	public void logged_in_user_changes_the_user_to_And_User_will_click_on_IDP_Awaiting_response_button(String str) {
		eidpLoginStepImpl.changeUserToTrainee(SharedData.traineeName);
		
		iDPAwaitingResponsePage.clickonIDpWaitigResponse();
		iDPAwaitingResponsePage.selecTraineeName(SharedData.traineeName);
	  
	}
	
	@When("User validates General info Project info carreer info Aliging expectations fields if they ar pending clicks on proceed")
	public void user_validates_General_info_Project_info_carreer_info_Aliging_expectations_fields_if_they_ar_pending_clicks_on_proceed() throws InterruptedException {
		iDPAwaitingResponsePage.validtingFieldsInaRow();
	}
	
	@When("User clicks on REVIEW AND TAKE ACTION button")
	public void takeAction() {
		aligningExpectationsStepImpl.clickOnReviewAndTakeActionButton();
	}
	
	@When("User clicks on SEND IDP TO THE TRAINEE button")
	public void clickOnSendIDPToTraineeButton() throws Exception{
		aligningExpectationsStepImpl.clickOnSendIDPToTraineeButton();
		Thread.sleep(5000);
	}
	
	@When("User clicks on SUBMIT button")
	public void clickOnSubmitButton() {
		eidpCommonPage.clickOnSubmitButton();
		eidpCommonPage.waitForGoBackToHomePageButtonVisible();
	}
	

	@When("User validates fields in all the tabs and values and clicks on No Revision option")
	public void user_validates_fields_in_all_the_tabs_and_values_and_clicks_on_No_Revision_option() throws InterruptedException {
		iDPAwaitingResponsePage.generalInfoNoRevision();
		iDPAwaitingResponsePage.projectInfoNoRevision();
		iDPAwaitingResponsePage.careerGoalNoRevision();
		iDPAwaitingResponsePage.aliginingExpectations();
		iDPAwaitingResponsePage.fillMentorExpectation();
	}
	
	

@When("User validates fileds in all the tabs and values and clicks on request revision with random comment")
public void validateAsRevision() throws Exception{
	iDPAwaitingResponsePage.validateAllTabsWithRequestRevision();
}

@When("User validates and click decline icon")
public void User_validates_and_click_decline_icon() throws InterruptedException  {
	iDPAwaitingResponsePage.validtingFieldsInaRowDecline();
}


	
}
