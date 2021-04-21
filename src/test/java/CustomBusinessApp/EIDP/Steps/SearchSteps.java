package CustomBusinessApp.EIDP.Steps;

import java.util.Map;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;

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
		//alena1
		@When("User selects IDP type as Trainees with IDP")
		public void traineesWithIDP() {
			searchStepimpl.checkTraineeWithIDPCheckbox();
			CommonUtil.waitBrowser(3000);
		}
	     //enter first name
		@When("User enters {string} to first name input box")
		public void user_enters_to_first_name_input_box(String firstName) {
		searchStepimpl.enterTraineeFirstName(firstName);
		}
	    //enter last name
		@When("User enters {string} to last name input box")
		public void user_enters_to_last_name_input_box(String lastName) {
		searchStepimpl.enterTraineeLastName(lastName);
		CommonUtil.waitBrowser(3000);
		}
	
		@When("User will click Search button")
		public void user_will_click_Search_button() {
		 searchStepimpl.clickOnSearchButton();
		 CommonUtil.waitBrowser(5000);
		 JavascriptUtils.scrollDown(1000);
		 CommonUtil.waitBrowser(5000);
		
		}

		@Then("verify expected results as {string} and {string}")
		public void verify_expected_results_as_and(String firstName, String lastName) {
		searchStepimpl.verifyFirmlyExpectedName(firstName, lastName);
		 CommonUtil.waitBrowser(5000);
		}	
		//alena2

        @When("User will select {string} as Classification type")
        public void user_will_select_as_Fellow(String userClassification) {
        searchStepimpl.selectClassificationType(userClassification);
     
        }

        @Then("User will verify first page results classification type are {string}")
        public void user_will_verify_expected_results(String  expectedClassificationType) {
        searchStepimpl.verifyFirmlyClassificationType(expectedClassificationType);
       
        } 
        @When("User will select {string} as Primary Mentor")
        public void user_will_select_as_Primary_Mentor(String nameMentor) {
        searchStepimpl.selectPrimaryMentorName(nameMentor);
        CommonUtil.waitBrowser(3000);
        }

        @Then("User will verify expected result as {string}")
        public void user_will_verify_expected_result_as(String primaryMentorName) {
        JavascriptUtils.scrollDown(2000);	
        searchStepimpl.verifyTraineeUnderPrimaryMentor(primaryMentorName);
           
        }
        @When("User will click Search button on Gloria Calloway page")
        public void user_will_click_Search_button_on_Gloria_Calloway_page() {
        searchStepimpl.clickOnSearchButtonGloriaCalloway();
        CommonUtil.waitBrowser(2000);
        JavascriptUtils.scrollDown(2000);
        }
        
        @Then("verify expected results as {string} and {string} on Gloria Calloway page")
        public void verify_expected_results_as_and_on_Gloria_Calloway_page(String firstName, String lastName) {
        searchStepimpl.verifyGloriaCallowayExpectedName(firstName, lastName);
        CommonUtil.waitBrowser(5000);
        }
        
        //GloriaSearchClassifType
        @When("User will select {string} as Classification type on Gloria Calloway page")
        public void user_will_select_as_Classification_type_on_Gloria_Calloway_page(String dropdownOptions) {
        searchStepimpl.selectClassificationTypeGloriaCalloway(dropdownOptions);
        CommonUtil.waitBrowser(3000);
        }

        @Then("User will verify first page results on Gloria Calloway page classification type are {string}")
        public void user_will_verify_first_page_results_on_Gloria_Calloway_page_classification_type_are(String classificationType) {
        searchStepimpl.verifyClassificationType(classificationType);
        CommonUtil.waitBrowser(3000);
        	
        	
        }//new scenarioChooseCBIITorganizations
        @When("User will select {string} as Training Organization")
        public void user_will_select_as_Training_Organization(String nameOrganization) {
        searchStepimpl.selectTrainingOrganization(nameOrganization);
        CommonUtil.waitBrowser(3000);
        }

        @When("User will verify first page search results of {string}")
        public void user_will_verify_first_page_search_results_of(String name_CBIIT) {
        searchStepimpl.verifyTraineeOrganization(name_CBIIT); 
        }


            
        }


        
       

        
        

		