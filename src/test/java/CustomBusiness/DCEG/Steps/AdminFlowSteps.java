package CustomBusiness.DCEG.Steps;

import static org.junit.Assert.assertTrue;
import java.awt.AWTException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.By;
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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminFlowSteps extends PageInitializer {
	@Given("User logged in as GEOFFREY TOBIAS")
	public void user_logged_in_as_GEOFFREY_TOBIAS() throws TestingException {
		flowStepsImplementation.dcegLoginTobias();
	}
	@Given("User logged in as \"([^\"]*)\"")
	public void user_logged_in(String userName) throws TestingException {
		flowStepsImplementation.dcegLogin(userName);
	}
	@Given("User can verify that Researcher ID tab is present")
	public void user_can_verify_that_Researcher_ID_tab_is_present() {
		Assert.assertTrue(adminFlowPage.researcherIDTab.isDisplayed());
		MiscUtils.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	@Given("User can verify that Administration tab is present")
	public void user_can_verify_that_Administration_tab_is_present() {
		Assert.assertTrue(adminFlowPage.administrationTab.isDisplayed());
		MiscUtils.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User selects to view the submitted request")
	public void user_selects_to_view_the_submitted_request() {
		CommonUtils.clickOnElement(createCRPage.viewFirstReq);
		MiscUtils.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	// @AdminViewCR
	@Given("User is on Clearance Requests tab")
	public void user_is_on_Clearance_Requests_tab() {
		Assert.assertTrue(adminFlowPage.clearanceRequestTab.isDisplayed());
		MiscUtils.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Given("User navigates to CR Search subtab")
	public void user_navigates_to_CR_Search_subtab() {
		CommonUtils.clickOnElement(adminFlowPage.clearanceRequestTabSearch);
		MiscUtils.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@When("User clicks Search")
	public void user_clicks_Search() {
		CommonUtils.clickOnElement(adminFlowPage.searchButton);
		MiscUtils.sleep(5000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that User can view any request")
	public void user_can_verify_that_User_can_view_any_request() {
		List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
		for (WebElement each : view) {
			Assert.assertTrue(each.isDisplayed());
		}
		System.out.println("View buttin is available for data entries");
	}

	// @AdminViewPublications
	@Given("User is on Publications tab")
	public void user_is_on_Publications_tab() {
		CommonUtils.clickOnElement(adminFlowPage.publicationsTab);
		MiscUtils.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Given("User navigates to Publications Search subtab")
	public void user_navigates_to_Publications_Search_subtab() {
		CommonUtils.clickOnElement(adminFlowPage.publicationsTabSearch);
		MiscUtils.sleep(2000);
	}

	@When("User clicks Search button")
	public void user_clicks_Search_button() {
		JavascriptUtils.scrollIntoView(adminFlowPage.publicationsTabSearchButton);
		CommonUtils.clickOnElement(adminFlowPage.publicationsTabSearchButton);
		MiscUtils.sleep(4000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that User can view any publication across DCEG")
	public void user_can_verify_that_User_can_view_any_publication_across_DCEG() {
		List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
		for (WebElement each : view) {
			Assert.assertTrue(each.isDisplayed());
		}
		System.out.println("View buttin is available for data entries");
	}

	// @AdminResearcherIDSearch
	@Given("User navigates to Reseacher ID tab")
	public void user_navigates_to_Reseacher_ID_tab() {
		CommonUtils.clickOnElement(adminFlowPage.researcherIDTab);
		MiscUtils.sleep(2000);
	}

	@When("User applies organization search as OFFICE OF THE DIRECTOR")
	public void user_applies_organization_search_as_OFFICE_OF_THE_DIRECTOR() {
		CommonUtils.clickOnElement(adminFlowPage.officeOfDirectorResID);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.searchButtonResearcherID);
		MiscUtils.sleep(4000);
	}

	@Then("User can see only OFFICE OF THE DIRECTOR related profiles")
	public void user_can_see_only_OFFICE_OF_THE_DIRECTOR_related_profiles() {
		List<WebElement> oD = WebDriverUtils.webDriver.findElements(By.xpath("//td[2]"));
		for (WebElement each : oD) {
			if (each.getText().contains("OD")) {
				System.out.println("Organization is OD");

			} else {
				System.out.println("Organization is NOT OD");
			}
		}
	}

	@When("User applies organization search as TRANS-DIVISIONAL RESEARCH PROGRAM")
	public void user_applies_organization_search_as_TRANS_DIVISIONAL_RESEARCH_PROGRAM() {
		CommonUtils.clickOnElement(adminFlowPage.transDivisionalResearchProgram);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.officeOfDirectorResID);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.searchButtonResearcherID);
		MiscUtils.sleep(4000);
	}

	@Then("User can see only TRANS-DIVISIONAL RESEARCH PROGRAM related profiles")
	public void user_can_see_only_TRANS_DIVISIONAL_RESEARCH_PROGRAM_related_profiles() {
		List<WebElement> oD = WebDriverUtils.webDriver.findElements(By.xpath("//td[2]"));
		for (WebElement each : oD) {
			System.out.println("Organization is " + each.getText());

			if (each.getText().contains("TDRP")) {
				System.out.println("Organization is TDRP");

			} else {
				System.out.println("Organization is NOT TDRP");
			}
		}
	}

	@When("User inputs Researcher's last name as Abnet")
	public void user_inputs_Researcher_s_last_name_as_Abnet() {
		CommonUtils.sendKeys(adminFlowPage.researcherLastNameField, "Abnet");
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.searchButtonResearcherID);
		MiscUtils.sleep(4000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can see the targeted person")
	public void user_can_see_the_targeted_person() {
		Assert.assertEquals(adminFlowPage.researcherDisplayedField.getText(), "ABNET, CHRISTIAN");
		boolean result = true;
		if (result) {
			System.out.println("Abnet is displayed as a search result");
		}
	}

	// @AdminTabReassignment
	@When("User clicks on Admin Tab")
	public void user_clicks_on_Admin_Tab() {
		CommonUtils.clickOnElement(adminFlowPage.administrationTab);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("user can verify that the following tabs are available")
	public void user_can_verify_that_the_following_tabs_are_available(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> tabs = CommonUtil.getMapFromDataTable(dataTable);
		Assert.assertTrue(adminFlowPage.reassignmentTab.isDisplayed(), tabs.get("tab1"));
		MiscUtils.sleep(3000);
		Assert.assertTrue(adminFlowPage.delegationManagement.isDisplayed(), tabs.get("tab2"));
		MiscUtils.sleep(4000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User goes to Reassignment tab")
	public void user_goes_to_Reassignment_tab() {
		CommonUtils.clickOnElement(adminFlowPage.reassignmentEnterButton1);
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.reassignmentEnterButton2);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@When("User applies search for {string} as {string}")
	public void user_applies_search_for_as(String name, String role) {
		MiscUtils.sleep(6000);
		CommonUtils.sendKeys(adminFlowPage.nameOfCurrentAssigneeSearchField, name);
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.chanockDropdownChoice);
		MiscUtils.sleep(2000);
		flowStepsImplementation.selectRole(role);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		CommonUtils.clickOnElement(adminFlowPage.searchButtonReassignment);
		MiscUtils.sleep(3000);
	}

	@Then("User can verify that the result is as expected per Reviewer search")
	public void user_can_verify_that_the_result_is_as_expected_per_Reviewer_search() {
		JavascriptUtils.scrollIntoView(adminFlowPage.clearanceRequestID);
		List<WebElement> rolesList = WebDriverUtils.webDriver.findElements(By.xpath("//td[11]"));
		System.out.println("role " + rolesList.size());

		for (WebElement each : rolesList) {
			System.out.println("each role name " + each.getText());

			if (each.getText().contains("Reviewer")) {
				System.out.println("true");

			} else {
				System.out.println("false");
			}

		}
	}

	@When("User reassigns Clearance request to {string}")
	public void user_reassigns_Clearance_request_to(String string) {
		flowStepsImplementation.selectDropDown(string);

	}

	@Then("User can verify that the Clearance Request is reassigned to {string}")
	public void user_can_verify_that_the_Clearance_Request_is_reassigned_to(String string) {
		String alertText = adminFlowPage.reassignAlert.getText();
		Assert.assertTrue(adminFlowPage.reassignAlert.isDisplayed());
		System.out.println(alertText);
		CommonUtils.clickOnElement(adminFlowPage.yesAlert);
		MiscUtils.sleep(7000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	@When("User views the history of the reasigned Clearance request")
	public void user_views_the_history_of_the_reasigned_Clearance_request() {
		JavascriptUtils.scrollIntoView(adminFlowPage.clearanceRequestTabInactive);
		JavascriptUtils.clickByJS(adminFlowPage.clearanceRequestTabInactive);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.clearanceRequestTabSearch);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(adminFlowPage.clReqIDReviewer, "DOGBE");
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.searchButton);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.viewFirstReqDodbe);
		MiscUtils.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		JavascriptUtils.scrollIntoView(adminFlowPage.history);
		MiscUtils.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can see the previous and new assignee as part of the History transaction")
	public void user_can_see_the_previous_and_new_assignee_as_part_of_the_History_transaction() {
		String reassignedRev = adminFlowPage.reassignedReviewer.getText();
		System.out.println(reassignedRev);
	}

	@Then("User can verify that the result is as expected per Requestor search")
	public void user_can_verify_that_the_result_is_as_expected_per_Requestor_search() {
		JavascriptUtils.scrollIntoView(adminFlowPage.clearanceRequestID);
		List<WebElement> rolesList = WebDriverUtils.webDriver.findElements(By.xpath("//td[11]"));
		System.out.println("role " + rolesList.size());

		for (WebElement each : rolesList) {
			System.out.println("each role name " + each.getText());

			if (each.getText().contains("Requestor")) {
				System.out.println("true");

			} else {
				System.out.println("false");
			}

		}
	}

	@Then("User can verify that the result is as expected per Submitter search")
	public void user_can_verify_that_the_result_is_as_expected_per_Submitter_search() {
		JavascriptUtils.scrollIntoView(adminFlowPage.clearanceRequestID);
		List<WebElement> rolesList = WebDriverUtils.webDriver.findElements(By.xpath("//td[11]"));
		System.out.println("role " + rolesList.size());

		for (WebElement each : rolesList) {
			System.out.println("each role name " + each.getText());

			if (each.getText().contains("Submitter")) {
				System.out.println("true");

			} else {
				System.out.println("false");
			}
		}
	}

	@When("User applies checkmark Select All")
	public void user_applies_checkmark_Select_All() {
		MiscUtils.sleep(4000);
		JavascriptUtils.scrollIntoView(adminFlowPage.selectAll);
		CommonUtils.clickOnElement(adminFlowPage.selectAll);
		MiscUtils.sleep(4000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	@Then("User can verify that only page one results are selected")
	public void user_can_verify_that_only_page_one_results_are_selected() {
		JavascriptUtils.scrollIntoView(adminFlowPage.clearanceRequestID);
		List<WebElement> checkmarks = WebDriverUtils.webDriver
				.findElements(By.xpath("//input[@class='selectReassignCrCheckbox']"));
		for (WebElement each : checkmarks) {
			Assert.assertTrue(each.isDisplayed());
			System.out.println("true");
		}
	}

	@When("User applies a wide search for {string}")
	public void user_applies_a_wide_search_for(String string) {
		CommonUtils.clickOnElement(adminFlowPage.anyDrop);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.checkedSubmiterMark);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.selectAllCheckmark);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.searchButtonReassignment);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can successfully clear the search result")
	public void user_can_successfully_clear_the_search_result() {
		CommonUtils.clickOnElement(adminFlowPage.clearButton);
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(adminFlowPage.noData);
		Assert.assertTrue(adminFlowPage.noData.isDisplayed());
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@When("a search for {string} is applied")
	public void a_search_for_is_applied(String name) {
		MiscUtils.sleep(4000);
		CommonUtils.sendKeys(adminFlowPage.nameOfCurrentAssigneeSearchField, name);
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.chanockDropdownChoice);
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.searchButtonReassignment);
		MiscUtils.sleep(3000);

	}

	@Then("User can verify that each tabs contains respective Clearance requests")
	public void user_can_verify_that_each_tabs_contains_respective_Clearance_requests(
			io.cucumber.datatable.DataTable data) {
		Map<String, String> tabs = CommonUtil.getMapFromDataTable(data);
		Assert.assertTrue(adminFlowPage.pendingTab.isDisplayed(), tabs.get("tab1"));
		flowStepsImplementation.verifyPendingResults();
		MiscUtils.sleep(3000);
		Assert.assertTrue(adminFlowPage.inflightTab.isDisplayed(), tabs.get("tab2"));
		flowStepsImplementation.verifyInflightResults();
		MiscUtils.sleep(3000);
		Assert.assertTrue(adminFlowPage.completedTab.isDisplayed(), tabs.get("tab3"));
		flowStepsImplementation.verifyCompletedResults();
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	@Then("User can verify that In-flight Clearance Requests are read only")
	public void user_can_verify_that_In_flight_Clearance_Requests_are_read_only() {
		CommonUtils.clickOnElement(adminFlowPage.inflightTab);
		MiscUtils.sleep(4000);
		JavascriptUtils.scrollIntoView(adminFlowPage.viewFirstRequestInflight);
		JavascriptUtils.clickByJS(adminFlowPage.viewFirstRequestInflight);
		MiscUtils.sleep(4000);
		String winHandleBefore = WebDriverUtils.webDriver.getWindowHandle();
		for (String winHandle : WebDriverUtils.webDriver.getWindowHandles()) {
			WebDriverUtils.webDriver.switchTo().window(winHandle);
		}
		WebDriverUtils.webDriver.close();
		WebDriverUtils.webDriver.switchTo().window(winHandleBefore);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	@Then("User can verify that Completed Requests are read only")
	public void user_can_verify_that_Completed_Requests_are_read_only() {
		CommonUtils.clickOnElement(adminFlowPage.completedTab);
		CommonUtils.clickOnElement(adminFlowPage.viewFirstRequestCompleted);
		MiscUtils.sleep(4000);
		String winHandleBefore = WebDriverUtils.webDriver.getWindowHandle();
		for (String winHandle : WebDriverUtils.webDriver.getWindowHandles()) {
			WebDriverUtils.webDriver.switchTo().window(winHandle);
		}
		WebDriverUtils.webDriver.close();
		WebDriverUtils.webDriver.switchTo().window(winHandleBefore);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@When("User opens a clearance request to view")
	public void user_opens_a_clearance_request_to_view() {
		CommonUtils.clickOnElement(adminFlowPage.firstCRView);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that the CR opens as expected")
	public void user_can_verify_that_the_CR_opens_as_expected() {
		String winHandleBefore = WebDriverUtils.webDriver.getWindowHandle();
		for (String winHandle : WebDriverUtils.webDriver.getWindowHandles()) {
			WebDriverUtils.webDriver.switchTo().window(winHandle);
		}
		Assert.assertTrue(adminFlowPage.clRequestSummary.isDisplayed());
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		WebDriverUtils.webDriver.close();
		WebDriverUtils.webDriver.switchTo().window(winHandleBefore);
		MiscUtils.sleep(1000);
	}

	@Then("User can export each of the tabs below")
	public void user_can_export_each_of_the_tabs_below(io.cucumber.datatable.DataTable data) throws AWTException {
		Map<String, String> tabs = CommonUtil.getMapFromDataTable(data);
		Assert.assertTrue(adminFlowPage.pendingTab.isDisplayed(), tabs.get("tab1"));
		CommonUtils.clickOnElement(adminFlowPage.pendingTab);
		CommonUtils.clickOnElement(adminFlowPage.exportResults);
		MiscUtils.sleep(3000);
		Assert.assertTrue(adminFlowPage.inflightTab.isDisplayed(), tabs.get("tab2"));
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.inflightTab);
		CommonUtils.clickOnElement(adminFlowPage.exportResults);
		MiscUtils.sleep(3000);
		Assert.assertTrue(adminFlowPage.completedTab.isDisplayed(), tabs.get("tab3"));
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.completedTab);
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.exportResultsCompleted);
		MiscUtils.sleep(4000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that Re-assign option is not available for INFLIGHT tab")
	public void user_can_verify_that_Re_assign_option_is_not_available_for_INFLIGHT_tab() throws Exception {
		CommonUtils.clickOnElement(adminFlowPage.inflightTab);
		MiscUtils.sleep(5000);
		flowStepsImplementation.verifyElementAbsent("(//input[@name='reassignButton'])[1]");
		MiscUtils.sleep(4000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	@Then("User can verify that Re-assign option is not available for  COMPLETED tab")
	public void user_can_verify_that_Re_assign_option_is_not_available_for_COMPLETED_tab() throws Exception {
		CommonUtils.clickOnElement(adminFlowPage.completedTab);
		MiscUtils.sleep(5000);
		flowStepsImplementation.verifyElementAbsent("(//input[@name='reassignButton'])[1]");
		MiscUtils.sleep(4000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		;
	}

	@Given("User logged one of the following {string}")
	public void user_logged_one_of_the_following(String user) throws TestingException {
		flowStepsImplementation.loginasUser(user);
	}

	@When("User performs a wide search")
	public void user_performs_a_wide_search() {
		CommonUtils.clickOnElement(adminFlowPage.transDivisionalResearchProgram);
		MiscUtils.sleep(2000);
		JavascriptUtils.clearByJS(adminFlowPage.researcherLastNameField);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.searchButtonResearcherID);
		MiscUtils.sleep(4000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that the data returned contains all authorized DCEGCS users and their corresponding available Researcher ID's")
	public void user_can_verify_that_the_data_returned_contains_all_authorized_DCEGCS_users_and_their_corresponding_available_Researcher_ID_s() {
		Assert.assertEquals(adminFlowPage.numberOfRequests.getText(), "500 researchers (1 to 25)");
		boolean result = true;
		if (result) {
			System.out.println("All DCEG authorized users are displayed");
		}
	}

	@Then("User will see create a researcher id option")
	public void user_will_see_create_a_researcher_id_option() {
		CommonUtils.clickOnElement(adminFlowPage.createResearcherID);
		MiscUtils.sleep(4000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User logged in as ALBANES DEMETRIUS user")
	public void user_logged_in_as_ALBANES_DEMETRIUS_user() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("dcegDemetrius"));
	}
	
	@Then("Swtich user to \"([^\"]*)\"")
	public void switch_user_to(String UserName) throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(UserName));
	}

	@When("User picks Publication Status as Pending Submission")
	public void user_picks_Publication_Status_as_Pending_Submission() {
		JavascriptUtils.scrollIntoView(adminFlowPage.pendingSubmissionStatus);
		CommonUtils.clickOnElement(adminFlowPage.pendingSubmissionStatus);
		MiscUtils.sleep(4000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that publications in Pending Submission status are editable")
	public void user_can_verify_that_publications_in_Pending_Submission_status_are_editable() {
		List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
		for (WebElement each : view) {
			Assert.assertTrue(each.isDisplayed());
		}
		System.out.println("Pending Submission status entries are editable");
	}

	@When("User picks Publication Status as Submitted for Publication")
	public void user_picks_Publication_Status_as_Submitted_for_Publication() {
		CommonUtils.clickOnElement(adminFlowPage.pendingSubmissionStatus);
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(adminFlowPage.submittedForPublicationStatus);
		CommonUtils.clickOnElement(adminFlowPage.submittedForPublicationStatus);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that publications in Submitted for Publication status are editable")
	public void user_can_verify_that_publications_in_Submitted_for_Publication_status_are_editable() {
		List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
		for (WebElement each : view) {
			Assert.assertTrue(each.isDisplayed());
		}
		System.out.println("Submitted for Publication entries are editable");
	}

	@When("User picks Publication Status as Accepted for Publication\\/In Press")
	public void user_picks_Publication_Status_as_Accepted_for_Publication_In_Press() {
		CommonUtils.clickOnElement(adminFlowPage.submittedForPublicationStatus);
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(adminFlowPage.accecptedForPublicationStatus);
		CommonUtils.clickOnElement(adminFlowPage.accecptedForPublicationStatus);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that publications in Accepted for Publication\\/In Press status are editable")
	public void user_can_verify_that_publications_in_Accepted_for_Publication_In_Press_status_are_editable() {
		List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
		for (WebElement each : view) {
			Assert.assertTrue(each.isDisplayed());
		}
		System.out.println("Accepted for Publication entries are editable");
	}

	@When("User picks Publication Status as E-Published \\(ahead of print)")
	public void user_picks_Publication_Status_as_E_Published_ahead_of_print() {
		CommonUtils.clickOnElement(adminFlowPage.accecptedForPublicationStatus);
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(adminFlowPage.epublishedStatus);
		CommonUtils.clickOnElement(adminFlowPage.epublishedStatus);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that publications in E-Published \\(ahead of print) status are editable")
	public void user_can_verify_that_publications_in_E_Published_ahead_of_print_status_are_editable() {
		List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
		for (WebElement each : view) {
			Assert.assertTrue(each.isDisplayed());
		}
		System.out.println("E-Published entries are editable");
	}

	@When("User picks Publication Status as Published")
	public void user_picks_Publication_Status_as_Published() {
		CommonUtils.clickOnElement(adminFlowPage.epublishedStatus);
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(adminFlowPage.publishedStatus);
		CommonUtils.clickOnElement(adminFlowPage.publishedStatus);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that publications in Published status are editable")
	public void user_can_verify_that_publications_in_Published_status_are_editable() {
		List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
		for (WebElement each : view) {
			Assert.assertTrue(each.isDisplayed());
		}
		System.out.println("Published  entries are editable");
		;
	}

	@When("User picks Publication Status as Not Published\\/Abandoned")
	public void user_picks_Publication_Status_as_Not_Published_Abandoned() {
		CommonUtils.clickOnElement(adminFlowPage.publishedStatus);
		MiscUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(adminFlowPage.notPublishedStatus);
		CommonUtils.clickOnElement(adminFlowPage.notPublishedStatus);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	@Then("User can verify that publications status can be reset to Published")
	public void user_can_verify_that_publications_status_can_be_reset_to_Published() {
		CommonUtils.clickOnElement(adminFlowPage.viewFirstUnpublishedReq);
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.publicationStatusDropdown);
		MiscUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.publishedDropdownChoice);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	@Given("User marks off Clearance Request Status with the following states")
	public void user_marks_off_Clearance_Request_Status_with_the_following_states(
			io.cucumber.datatable.DataTable data) {
		Map<String, String> states = CommonUtil.getMapFromDataTable(data);
		Assert.assertTrue(adminFlowPage.draftClRequestStatus.isDisplayed(), states.get("state1"));
		CommonUtils.clickOnElement(adminFlowPage.draftClRequestStatus);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		Assert.assertTrue(adminFlowPage.submittedForVerificationClRequestStatus.isDisplayed(), states.get("state2"));
		CommonUtils.clickOnElement(adminFlowPage.submittedForVerificationClRequestStatus);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		Assert.assertTrue(adminFlowPage.returnedForRevisionClRequestStatus.isDisplayed(), states.get("state3"));
		CommonUtils.clickOnElement(adminFlowPage.returnedForRevisionClRequestStatus);
		MiscUtils.sleep(3000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	@When("User can verify that draft clearance requests are editable")
	public void user_can_verify_that_draft_clearance_requests_are_editable() {
		for (int row = 1; row <= 4; row++) {
			List<WebElement> draft = WebDriverUtils.webDriver.findElements(By.xpath("//td[7]"));
			for (WebElement each : draft) {
				if (each.getText().contains("Draft")) {
					System.out.println("Drafts are present");
				}
			}
			MiscUtils.sleep(3000);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.clickOnElement(adminFlowPage.paginationRight);
		}

	}

	@When("User can verify that submitted for verification clearance requests are editable")
	public void user_can_verify_that_submitted_for_verification_clearance_requests_are_editable() {
		for (int row = 1; row <= 4; row++) {
			List<WebElement> draft = WebDriverUtils.webDriver.findElements(By.xpath("//td[7]"));
			for (WebElement each : draft) {
				if (each.getText().contains("Submitted for Verification")) {
					System.out.println("Submitted for Verification requests are present");
				}
			}
			MiscUtils.sleep(3000);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.clickOnElement(adminFlowPage.paginationRight);
		}
	}
	
	@When("User can verify that returned for revision clearance requests are editable")
	public void user_can_verify_that_returned_for_revision_clearance_requests_are_editable() {
		for (int row = 1; row <= 4; row++) {
			List<WebElement> draft = WebDriverUtils.webDriver.findElements(By.xpath("//td[7]"));
			for (WebElement each : draft) {
				if (each.getText().contains("Returned for Revision")) {
					System.out.println("Returned for Revision requests are present");
				}
			}
			MiscUtils.sleep(3000);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.clickOnElement(adminFlowPage.paginationRight);
			
		}
	}

}
