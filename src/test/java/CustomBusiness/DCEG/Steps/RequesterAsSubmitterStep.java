package CustomBusiness.DCEG.Steps;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RequesterAsSubmitterStep extends PageInitializer {

	@Given("User logged in as PATRICIA MADIGAN")
	public void user_logged_in_as_PATRICIA_MADIGAN() throws TestingException {
		flowStepsImplementation.dcegLoginMadigan();
	}

	@When("User is on Clearance Request tab")
	public void user_is_on_Clearance_Request_tab() {
		Assert.assertTrue(createCRPage.clearanceRequestsTab.isDisplayed());
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	@When("User clicks on Create Clearance Request")
	public void user_clicks_on_Create_Clearance_Request() {
		CommonUtils.click(createCRPage.createClearanceRequestButton);
		MiscUtils.sleep(2000);
	}

	@When("the request type is Research Program")
	public void the_request_type_is_Research_Program() {
		flowStepsImplementation.checkButton();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User chooses from dropdown CAS ID option General Program Administration")
	public void user_chooses_from_dropdown_CAS_ID_option_General_Program_Administration() {
		CommonUtils.click(createCRPage.casDropdown);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.genProgramAdministration);
		MiscUtils.sleep(2000);
	}

	@When("User adds a requester as ALBANES, DEMETRIUS")
	public void user_adds_a_requester_as_ALBANES_DEMETRIUS() {
		CommonUtils.sendKeys(createCRPage.requesterField, "ALBA");
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.albanesDemetrius);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User inputs Submission Title as {string}")
	public void user_inputs_Submission_Title_as(String title) {
		CommonUtils.sendKeys(createCRPage.submissionTitleField, title);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User fills in Abstract field")
	public void user_fills_in_Abstract_field() {
		CommonUtils.sendKeys(createCRPage.abstractField, "test abstract");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User picks Submission Type as Publication")
	public void user_picks_Submission_Type_as_Publication() {
		CommonUtils.click(createCRPage.publication);
		MiscUtils.sleep(2000);
	}

	@When("User selects publication type from  Publication Type dropdown")
	public void user_selects_publication_type_from_Publication_Type_dropdown() {
		CommonUtils.click(createCRPage.publicationDropdown);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.originJournlPublicationDropdown);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User inputs Journal or Book Name as {string}")
	public void user_inputs_Journal_or_Book_Name_as(String string) {
		CommonUtils.sendKeys(createCRPage.journalField, "JNCI");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User confirms NIH Rights, PMC")
	public void user_confirms_NIH_Rights_PMC() {
		CommonUtils.click(createCRPage.nihRightConfirm);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User confirms the Publisher Credibility question")
	public void user_confirms_the_Publisher_Credibility_question() {
		CommonUtils.click(createCRPage.publisherCredibilityConfirm);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User confirms Genomic Data Generation question")
	public void user_confirms_Genomic_Data_Generation_question() {
		CommonUtils.click(createCRPage.genomicDataGenerationConfirm);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User denies Laboratory Resources question")
	public void user_denies_Laboratory_Resources_question() {
		CommonUtils.click(createCRPage.labResourcesDeny);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
	
	@When("User confirms Laboratory Resources question")
	public void user_confirms_Laboratory_Resources_question() {
		CommonUtils.click(createCRPage.labResourcesDeny);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User submits a Review Material as Manuscript")
	public void user_submits_a_Review_Material_as_Manuscript() {
		JavascriptUtils.scrollIntoView(createCRPage.manuscriptChoice);
		CommonUtils.click(createCRPage.manuscriptChoice);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		flowStepsImplementation.uploadManuscript();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User submits a Review Material as Data Sharing Plan Publication")
	public void user_submits_a_Review_Material_as_Data_Sharing_Plan_Publication() {
		JavascriptUtils.scrollIntoView(createCRPage.dataSharingPlanPublication);
		CommonUtils.click(createCRPage.dataSharingPlanPublication);
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		flowStepsImplementation.uploadDataSharing();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User submits a Review Material as Data Sharing Plan Presentation")
	public void user_submits_a_Review_Material_as_Data_Sharing_Plan_Presentation() {
		JavascriptUtils.scrollIntoView(createCRPage.dataSharingPlanPresentation);
		CommonUtils.click(createCRPage.dataSharingPlanPresentation);
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		flowStepsImplementation.uploadDataSharing();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User marks Patent\\/Invention as Employee Invention Report filed")
	public void user_marks_Patent_Invention_as_Employee_Invention_Report_filed() {
		CommonUtils.click(createCRPage.employeeInventionChoice);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User denies Select Agents question")
	public void user_denies_Select_Agents_question() {
		CommonUtils.click(createCRPage.selectAgentNo);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User confirms Helix Biowulf question")
	public void user_confirms_Helix_Biowulf_question() {
		CommonUtils.click(createCRPage.helixBiowulfYES);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User confirms using Clinical Center's BTRIS system")
	public void user_confirms_using_Clinical_Center_s_BTRIS_system() {
		CommonUtils.click(createCRPage.btrisYES);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User denies dual use")
	public void user_denies_dual_use() {
		CommonUtils.click(createCRPage.dualUseNO);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User confirms that the paper is High Profile")
	public void user_confirms_that_the_paper_is_High_Profile() {
		CommonUtils.click(createCRPage.highProfileYES);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User lists authors for submisison")
	public void user_lists_authors_for_submisison() {
		CommonUtils.sendKeys(createCRPage.authorsField, "test authors");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User can verify scheduled reviewer CHRISTIAN ABNET as Branch Chief")
	public void user_can_verify_scheduled_reviewer_CHRISTIAN_ABNET_as_Branch_Chief() {
		JavascriptUtils.scrollIntoView(createCRPage.abnetChristian);
		Assert.assertEquals("ABNET, CHRISTIAN", createCRPage.abnetChristian.getText());
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User can verify scheduled reviewer AMY BERRINGTON as Program Director")
	public void user_can_verify_scheduled_reviewer_AMY_BERRINGTON_as_Program_Director() {
		Assert.assertTrue(createCRPage.berringtonAmy.isDisplayed());
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
	
	@Then("User can verify scheduled reviewer GARCIA-CLOSAS, MONTSERRAT as Program Director")
	public void user_can_verify_scheduled_reviewer_GARCIA_CLOSAS_MONTSERRAT_as_Program_Director() {
		Assert.assertTrue(createCRPage.montserratGarcia.isDisplayed());
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User can verify scheduled reviewer STEPHEN CHANOCK as Division Director")
	public void user_can_verify_scheduled_reviewer_STEPHEN_CHANOCK_as_Division_Director() {
		Assert.assertTrue(createCRPage.chanockStephen.isDisplayed());
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("User submits for verification")
	public void user_submits_for_verification() {
		CommonUtils.click(createCRPage.submitForVerification);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(7000);
	}

	@Then("User can verify that their request is under My Pending Publications subtab")
	public void user_can_verify_that_their_request_is_under_My_Pending_Publications_subtab() {
		JavascriptUtils.clickByJS(createCRPage.myActiveSubmissions);
		MiscUtils.sleep(4000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("User deletes the request")
	public void user_deletes_the_request() {
		JavascriptUtils.scrollIntoView(createCRPage.deleteButton);
		JavascriptUtils.clickByJS(createCRPage.deleteButton);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.deleteClearanceReqConfirmation);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
	// @RequesterAsSubmitterPresentation

	@When("User picks Submission Type as Presentation")
	public void user_picks_Submission_Type_as_Presentation() {
		CommonUtils.click(createCRPage.presentationType);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User selects presentation type as Meeting Abstract")
	public void user_selects_presentation_type_as_Meeting_Abstract() {
		CommonUtils.click(createCRPage.presentationDropdown);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(createCRPage.meetingAbstract);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User inputs Meeting Name as {string}")
	public void user_inputs_Meeting_Name_as(String name) {
		CommonUtils.sendKeys(createCRPage.meetingName, name);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User inputs Meeting Location as {string}")
	public void user_inputs_Meeting_Location_as(String location) {
		CommonUtils.sendKeys(createCRPage.meetingLocation, location);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User inputs Meeting Date as {string}")
	public void user_inputs_Meeting_Date_as(String date) {
		CommonUtils.sendKeys(createCRPage.meetingDate, date);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User puts no for  Laboratory Resources question")
	public void user_puts_no_for_Laboratory_Resources_question() {
		CommonUtils.click(createCRPage.labResourcesNO);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User picks MDPL\\/Somatic Analysis as Lab results option")
	public void user_picks_MDPL_Somatic_Analysis_as_Lab_results_option() {
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(createCRPage.labResourcesMDPL);
		JavascriptUtils.clickByJS(createCRPage.labResourcesMDPL);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("User uploads a Review Material as Abstract")
	public void user_uploads_a_Review_Material_as_Abstract() {
		flowStepsImplementation.uploadAbstract();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
	@Then("User submits data for review")
	public void user_submits_data_for_review() {
		JavascriptUtils.scrollIntoView(createCRPage.submitForVerification);
		CommonUtils.click(createCRPage.submitForVerificationButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
}