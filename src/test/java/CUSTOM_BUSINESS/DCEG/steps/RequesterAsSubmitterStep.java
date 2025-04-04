package CUSTOM_BUSINESS.DCEG.steps;

import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RequesterAsSubmitterStep extends PageInitializer {

	@Given("User logged in as PATRICIA MADIGAN")
	public void user_logged_in_as_PATRICIA_MADIGAN()  {
		flowStepsImplementation.dcegLoginMadigan();
	}

	@When("User is on Clearance Request tab")
	public void user_is_on_Clearance_Request_tab() {
		Assert.assertTrue(createCRPage.clearanceRequestsTab.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();

	}

	@When("User clicks on Create Clearance Request")
	public void user_clicks_on_Create_Clearance_Request() {
		CommonUtils.clickOnElement(createCRPage.createClearanceRequestButton);
		CommonUtils.sleep(2000);
	}

	@When("the request type is Research Program")
	public void the_request_type_is_Research_Program() {
		flowStepsImplementation.checkButton();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User chooses from dropdown CAS ID option General Program Administration")
	public void user_chooses_from_dropdown_CAS_ID_option_General_Program_Administration() {
		CommonUtils.clickOnElement(createCRPage.casDropdown);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.genProgramAdministration);
		CommonUtils.sleep(2000);
	}

	@When("User adds a requester as ALBANES, DEMETRIUS")
	public void user_adds_a_requester_as_ALBANES_DEMETRIUS() {
		CommonUtils.sendKeys(createCRPage.requesterField, "ALBA");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.albanesDemetrius);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User inputs Submission Title as {string}")
	public void user_inputs_Submission_Title_as(String title) {
		CommonUtils.sendKeys(createCRPage.submissionTitleField, title);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User fills in Abstract field")
	public void user_fills_in_Abstract_field() {
		CommonUtils.sendKeys(createCRPage.abstractField, "test abstract");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User picks Submission Type as Publication")
	public void user_picks_Submission_Type_as_Publication() {
		CommonUtils.clickOnElement(createCRPage.publication);
		CommonUtils.sleep(2000);
	}

	@When("User selects publication type from  Publication Type dropdown")
	public void user_selects_publication_type_from_Publication_Type_dropdown() {
		CommonUtils.clickOnElement(createCRPage.publicationDropdown);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.originJournlPublicationDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User inputs Journal or Book Name as {string}")
	public void user_inputs_Journal_or_Book_Name_as(String string) {
		CommonUtils.sendKeys(createCRPage.journalField, "JNCI");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User confirms NIH Rights, PMC")
	public void user_confirms_NIH_Rights_PMC() {
		CommonUtils.clickOnElement(createCRPage.nihRightConfirm);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User confirms the Publisher Credibility question")
	public void user_confirms_the_Publisher_Credibility_question() {
		CommonUtils.clickOnElement(createCRPage.publisherCredibilityConfirm);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User confirms Genomic Data Generation question")
	public void user_confirms_Genomic_Data_Generation_question() {
		CommonUtils.clickOnElement(createCRPage.genomicDataGenerationConfirm);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User denies Laboratory Resources question")
	public void user_denies_Laboratory_Resources_question() {
		CommonUtils.clickOnElement(createCRPage.labResourcesDeny);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}
	
	@When("User confirms Laboratory Resources question")
	public void user_confirms_Laboratory_Resources_question() {
		CommonUtils.clickOnElement(createCRPage.labResourcesDeny);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User submits a Review Material as Manuscript")
	public void user_submits_a_Review_Material_as_Manuscript() {
		JavascriptUtils.scrollIntoView(createCRPage.manuscriptChoice);
		CommonUtils.clickOnElement(createCRPage.manuscriptChoice);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		flowStepsImplementation.uploadManuscript();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User submits a Review Material as Data Sharing Plan Publication")
	public void user_submits_a_Review_Material_as_Data_Sharing_Plan_Publication() {
		JavascriptUtils.scrollIntoView(createCRPage.dataSharingPlanPublication);
		CommonUtils.clickOnElement(createCRPage.dataSharingPlanPublication);
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
		flowStepsImplementation.uploadDataSharing();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User submits a Review Material as Data Sharing Plan Presentation")
	public void user_submits_a_Review_Material_as_Data_Sharing_Plan_Presentation() {
		JavascriptUtils.scrollIntoView(createCRPage.dataSharingPlanPresentation);
		CommonUtils.clickOnElement(createCRPage.dataSharingPlanPresentation);
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
		flowStepsImplementation.uploadDataSharing();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User marks Patent\\/Invention as Employee Invention Report filed")
	public void user_marks_Patent_Invention_as_Employee_Invention_Report_filed() {
		CommonUtils.clickOnElement(createCRPage.employeeInventionChoice);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User denies Select Agents question")
	public void user_denies_Select_Agents_question() {
		CommonUtils.clickOnElement(createCRPage.selectAgentNo);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User confirms Helix Biowulf question")
	public void user_confirms_Helix_Biowulf_question() {
		CommonUtils.clickOnElement(createCRPage.helixBiowulfYES);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User confirms using Clinical Center's BTRIS system")
	public void user_confirms_using_Clinical_Center_s_BTRIS_system() {
		CommonUtils.clickOnElement(createCRPage.btrisYES);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User denies dual use")
	public void user_denies_dual_use() {
		CommonUtils.clickOnElement(createCRPage.dualUseNO);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User confirms that the paper is High Profile")
	public void user_confirms_that_the_paper_is_High_Profile() {
		CommonUtils.clickOnElement(createCRPage.highProfileYES);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User lists authors for submisison")
	public void user_lists_authors_for_submisison() {
		CommonUtils.sendKeys(createCRPage.authorsField, "test authors");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User can verify scheduled reviewer CHRISTIAN ABNET as Branch Chief")
	public void user_can_verify_scheduled_reviewer_CHRISTIAN_ABNET_as_Branch_Chief() {
		JavascriptUtils.scrollIntoView(createCRPage.abnetChristian);
		Assert.assertEquals("ABNET, CHRISTIAN", createCRPage.abnetChristian.getText());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User can verify scheduled reviewer AMY BERRINGTON as Program Director")
	public void user_can_verify_scheduled_reviewer_AMY_BERRINGTON_as_Program_Director() {
		Assert.assertTrue(createCRPage.berringtonAmy.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}
	
	@Then("User can verify scheduled reviewer GARCIA-CLOSAS, MONTSERRAT as Program Director")
	public void user_can_verify_scheduled_reviewer_GARCIA_CLOSAS_MONTSERRAT_as_Program_Director() {
		Assert.assertTrue(createCRPage.montserratGarcia.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User can verify scheduled reviewer STEPHEN CHANOCK as Division Director")
	public void user_can_verify_scheduled_reviewer_STEPHEN_CHANOCK_as_Division_Director() {
		Assert.assertTrue(createCRPage.chanockStephen.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User submits for verification")
	public void user_submits_for_verification() {
		CommonUtils.clickOnElement(createCRPage.submitForVerification);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.sleep(7000);
	}

	@Then("User can verify that their request is under My Pending Publications subtab")
	public void user_can_verify_that_their_request_is_under_My_Pending_Publications_subtab() {
		JavascriptUtils.clickByJS(createCRPage.myActiveSubmissions);
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User deletes the request")
	public void user_deletes_the_request() {
		JavascriptUtils.scrollIntoView(createCRPage.deleteButton);
		JavascriptUtils.clickByJS(createCRPage.deleteButton);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.deleteClearanceReqConfirmation);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}
	// @RequesterAsSubmitterPresentation

	@When("User picks Submission Type as Presentation")
	public void user_picks_Submission_Type_as_Presentation() {
		CommonUtils.clickOnElement(createCRPage.presentationType);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User selects presentation type as Meeting Abstract")
	public void user_selects_presentation_type_as_Meeting_Abstract() {
		CommonUtils.clickOnElement(createCRPage.presentationDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(createCRPage.meetingAbstract);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User inputs Meeting Name as {string}")
	public void user_inputs_Meeting_Name_as(String name) {
		CommonUtils.sendKeys(createCRPage.meetingName, name);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User inputs Meeting Location as {string}")
	public void user_inputs_Meeting_Location_as(String location) {
		CommonUtils.sendKeys(createCRPage.meetingLocation, location);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User inputs Meeting Date as {string}")
	public void user_inputs_Meeting_Date_as(String date) {
		CommonUtils.sendKeys(createCRPage.meetingDate, date);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User puts no for  Laboratory Resources question")
	public void user_puts_no_for_Laboratory_Resources_question() {
		CommonUtils.clickOnElement(createCRPage.labResourcesNO);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User picks MDPL\\/Somatic Analysis as Lab results option")
	public void user_picks_MDPL_Somatic_Analysis_as_Lab_results_option() {
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(createCRPage.labResourcesMDPL);
		JavascriptUtils.clickByJS(createCRPage.labResourcesMDPL);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User uploads a Review Material as Abstract")
	public void user_uploads_a_Review_Material_as_Abstract() {
		flowStepsImplementation.uploadAbstract();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}
	@Then("User submits data for review")
	public void user_submits_data_for_review() {
		JavascriptUtils.scrollIntoView(createCRPage.submitForVerification);
		CommonUtils.clickOnElement(createCRPage.submitForVerificationButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}
}