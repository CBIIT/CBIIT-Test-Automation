package CUSTOM_BUSINESS.DCEG.steps;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import CUSTOM_BUSINESS.EIDP.utils.CommonUtil;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BranchAdminSteps extends PageInitializer {

@Given("User logged in as SADIE HOLMES")
public void user_logged_in_as_SADIE_HOLMES()  {
		flowStepsImplementation.dcegLoginHolmes();
	}

	@Then("User can verify that publications in Pending Submission status are only editable within his branch")
	public void user_can_verify_that_publications_in_Pending_Submission_status_are_only_editable_within_his_branch() {
		for (int row = 1; row <= 11; row++) {
			List<WebElement> draft = WebDriverUtils.webDriver.findElements(By.xpath("//td[7]"));
			for (WebElement each : draft) {
				if (each.getText().contains("Pending Submission")) {
					System.out.println("Pending Submission request is present");
				}
			}
			CommonUtils.sleep(3000);
			CucumberLogUtils.logScreenshot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.clickOnElement(adminFlowPage.paginationRight);

		}
	}

	@Then("User can verify that publications in Submitted for Publication status are only editable within his branch")
	public void user_can_verify_that_publications_in_Submitted_for_Publication_status_are_only_editable_within_his_branch() {
		for (int row = 1; row <= 3; row++) {
			CommonUtils.sleep(3000);
			CucumberLogUtils.logScreenshot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.clickOnElement(adminFlowPage.paginationRight);

		}
	}

	@Then("User can verify that publications in Accepted for Publication\\/In Press status are only editable within his branch")
	public void user_can_verify_that_publications_in_Accepted_for_Publication_In_Press_status_are_only_editable_within_his_branch() {
		for (int row = 1; row <= 3; row++) {
			CommonUtils.sleep(3000);
			CucumberLogUtils.logScreenshot();
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.clickOnElement(adminFlowPage.paginationRight);

		}
	}

	@When("User can verify that returned search for publications in E-Published \\(ahead of print) status is across DCEG")
	public void user_can_verify_that_returned_search_for_publications_in_E_Published_ahead_of_print_status_is_across_DCEG() {
		List<WebElement> item = WebDriverUtils.webDriver.findElements(By.xpath("//tbody//tr//td[4]"));
		for (WebElement each : item) {
			if (each.getText().contains("TDRP MEB")) {
				System.out.println("TDRP MEB organization is present");
			} else if (each.getText().contains("HGP CGB")) {
				System.out.println("HGP CGB organization is present");
			}
		}
		CommonUtils.sleep(3000);
		System.out.println("Search is across DCEG");

	}

	@When("User can status of one request to Published")
	public void user_can_status_of_one_request_to_Published() {
		CommonUtils.clickOnElement(adminFlowPage.viewFirstRequest);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.publicationStatusDropdown);
		CommonUtils.sleep(3000);
		CommonUtils.clickOnElement(adminFlowPage.publicationStatusDropdown);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User applies wide search")
	public void user_applies_wide_search() {
		CommonUtils.clickOnElement(adminFlowPage.publicationsTabSearch);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.scrollIntoView(adminFlowPage.publicationsTabSearchButton);
		CommonUtils.clickOnElement(adminFlowPage.publicationsTabSearchButton);
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can view any publication across DCEG")
	public void user_can_view_any_publication_across_DCEG() {
		for (int row = 1; row <= 20; row++) {

			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.clickOnElement(adminFlowPage.paginationRight);
		}
	}

	@When("User applies high profile publications search to Publications")
	public void user_applies_high_profile_publications_search_to_Publications() {
		CommonUtils.clickOnElement(adminFlowPage.publicationsTabSearch);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.scrollIntoView(adminFlowPage.highProfileCheckbox);
		CommonUtils.clickOnElement(adminFlowPage.highProfileCheckbox);
		CommonUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(adminFlowPage.publicationsTabSearchButton);
		CommonUtils.clickOnElement(adminFlowPage.publicationsTabSearchButton);
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can view high profile entries within their NED")
	public void user_can_view_high_profile_entries_within_their_NED() {
		for (int row = 1; row <= 5; row++) {
			CommonUtils.sleep(4000);
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.clickOnElement(adminFlowPage.paginationRight);
		}
	}

	@When("User applies  non high profile publications search to Publications")
	public void user_applies_non_high_profile_publications_search_to_Publications() {
		CommonUtils.clickOnElement(adminFlowPage.clRequestTab);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.publicationsTab);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.publicationsTabSearch);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		JavascriptUtils.scrollIntoView(adminFlowPage.publicationsTabSearchButton);
		CommonUtils.clickOnElement(adminFlowPage.publicationsTabSearchButton);
		CommonUtils.sleep(4000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can view non high profile entries within their NED")
	public void user_can_view_non_high_profile_entries_within_their_NED() {
		for (int row = 1; row <= 20; row++) {
			List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
			for (WebElement each : view) {
				Assert.assertTrue(each.isDisplayed());
			}
			CommonUtils.clickOnElement(adminFlowPage.paginationRight);
		}
	}

	@When("User submits a Clearance Request where requestor is SADIE HOLMES")
	public void user_submits_a_Clearance_Request_where_requestor_is_SADIE_HOLMES() {
		flowStepsImplementation.submitCLrequest();
	}

	@Then("User can verify that clearance request is successfully submitted")
	public void user_can_verify_that_clearance_request_is_successfully_submitted() {
		JavascriptUtils.clickByJS(createCRPage.myActiveSubmissions);
		CommonUtils.sleep(4000);
		String dateSubmitted = adminFlowPage.dateSubmitted.getText();
		System.out.println(dateSubmitted);
	}

	@Then("User marks off Clearance Request Status with states")
	public void user_marks_off_Clearance_Request_Status_with_states(io.cucumber.datatable.DataTable data) {
		Map<String, String> states = CommonUtil.getMapFromDataTable(data);
		Assert.assertTrue(adminFlowPage.draftStatus.isDisplayed(), states.get("state1"));
		CommonUtils.clickOnElement(adminFlowPage.draftStatus);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(adminFlowPage.submittedForVerStatus.isDisplayed(), states.get("state2"));
		CommonUtils.clickOnElement(adminFlowPage.submittedForVerStatus);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(adminFlowPage.returnedForRevStatus.isDisplayed(), states.get("state2"));
		CommonUtils.clickOnElement(adminFlowPage.returnedForRevStatus);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify that User can operate on a clearance request that only belongs to OFFICE OF THE DIRECTOR")
	public void user_can_verify_that_User_can_operate_on_a_clearance_request_that_only_belongs_to_OFFICE_OF_THE_DIRECTOR() {
		CommonUtils.sleep(3000);
		if (branchAdminPage.firstODentry.getText().contains("OD")) {
			CommonUtils.clickOnElement(branchAdminPage.firstView);
		}
		System.out.print("Branch Admin can view only OD Clearance Requests");
	}

}