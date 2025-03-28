package CUSTOM_BUSINESS.DCEG.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DirectSubmitterSteps extends PageInitializer {

	@Given("User logged in as ALBANES DEMETRIUS")
	public void user_logged_in_as_ALBANES_DEMETRIUS()  {
		flowStepsImplementation.dcegLoginDemetrius();
	}

	@Then("User can verify that Program Director was added as a Scheduled Reviewer")
	public void user_can_verify_that_Program_Director_was_added_as_a_Scheduled_Reviewer() {
		JavascriptUtils.scrollIntoView(directSubmitterPage.programDirector);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(directSubmitterPage.programDirector.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Program Director is displayed");
		}
	}

	@Then("User withdraws the request")
	public void user_withdraws_the_request() {
		CommonUtils.clickOnElement(directSubmitterPage.withdrawButton);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(directSubmitterPage.withdrawCommentField, "comments added");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(directSubmitterPage.withdrawConfirmation);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User puts no for High Profile section")
	public void user_puts_no_for_High_Profile_section() {
		CommonUtils.clickOnElement(createCRPage.highProfileNO);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify that Program Director was removed")
	public void user_can_verify_that_Program_Director_was_removed() {
		int j = WebDriverUtils.webDriver.findElements(By.xpath("//td[normalize-space()='Program Director']")).size();
		if (j > 0) {
			System.out.println("Program Director is present");
		} else {
			System.out.println("Program Director was removed");
		}
		CommonUtils.sleep(2000);

	}

	@Then("User confirms again that paper is High profile")
	public void user_assigns_confirms_again_that_paper_is_High_profile() {
		CommonUtils.clickOnElement(createCRPage.highProfileYES);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User adds added additional reviewers ahead of the default reviewers")
	public void user_adds_added_additional_reviewers_ahead_of_the_default_reviewers() {
		CommonUtils.sendKeys(directSubmitterPage.additionalRevField, "APELBERG");
		CommonUtils.sleep(1000);
		CommonUtils.clickOnElement(directSubmitterPage.apelbergDropdown);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.sendKeys(directSubmitterPage.additionalRevField, "CAMPOS");
		CommonUtils.sleep(1000);
		CommonUtils.clickOnElement(directSubmitterPage.camposDropdown);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	@Given("User logs in as CHRISTIAN ABNET")
	public void user_logs_in_as_CHRISTIAN_ABNET()  {
		flowStepsImplementation.dcegLoginAbnet();
	}

	@Given("User views the CR that requires their review")
	public void user_views_the_CR_that_requires_their_review() {
		CommonUtils.clickOnElement(directSubmitterPage.viewFirstPublication);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	@Given("User chooses no for conflict of interest question")
	public void user_chooses_no_for_conflict_of_interest_question() {
		CommonUtils.clickOnElement(directSubmitterPage.noConflictOfInterest);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User chooses to return for revision")
	public void user_chooses_to_return_for_revision() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("6");
	}

	@Then("User enters comments")
	public void user_enters_comments() {
		CommonUtils.sendKeys(directSubmitterPage.commentsField, "Comments added");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User clicks Process Action button")
	public void user_clicks_Process_Action_button() {
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.confirmReturnRevision);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("\"([^\"]*)\" revises the CR under Active Submissions tab")
	public void revises_the_CR_under_Active_Submissions_tab(String UserName) {
		WebDriverUtils.webDriver.get("");
		CommonUtils.clickOnElement(directSubmitterPage.activeSubmissionsTab);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.viewFirstPublication);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(directSubmitterPage.submissionTitle, "Edited Publication Title");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("\"([^\"]*)\" dissaproves that CR")
	public void dissaproves_that_CR(String UserName)  {
		WebDriverUtils.webDriver.get("");
		CommonUtils.clickOnElement(directSubmitterPage.viewFirstPublication);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.noConflictOfInterest);
		CommonUtils.sleep(1000);
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("7");
		CommonUtils.sendKeys(directSubmitterPage.commentsField, "Comments added");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.dissaprove);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify the request was dissaproved")
	public void user_can_verify_the_request_was_dissaproved() {
		Assert.assertTrue(directSubmitterPage.disapprovedAlert.isDisplayed());
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Given("User chooses yes for conflict of interest question")
	public void user_chooses_yes_for_conflict_of_interest_question() {
		CommonUtils.clickOnElement(directSubmitterPage.yesConflictOfInterest);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();

	}

	@Then("User chooses to remove current reviewer")
	public void user_chooses_to_remove_current_reviewer() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("10");
		CommonUtils.sendKeys(directSubmitterPage.commentsField, "Comments added");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.confirmRemoveReviewer);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify that CHRISTIAN ABNET was removed from the list of reviewers")
	public void user_can_verify_that_CHRISTIAN_ABNET_was_removed_from_the_list_of_reviewers() {
		Assert.assertTrue(directSubmitterPage.removedFromListRevAlert.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("The reviewer has been removed from the list of reviewers.");
		}
	}

	@Given("User puts no for High Profile paper")
	public void user_puts_no_for_High_Profile_paper() {
		CommonUtils.clickOnElement(directSubmitterPage.highProfileNo);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can confirm that program director is removed form reviewers")
	public void usre_can_confirm_that_program_director_is_removed_form_reviewers() {
		int j = WebDriverUtils.webDriver.findElements(By.xpath("//td[normalize-space()='Program Director']")).size();
		if (j > 0) {
			System.out.println("Program Director is present");
		} else {
			System.out.println("Program Director was removed");
		}
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Given("User chooses to refer the CR")
	public void user_chooses_to_refer_the_CR() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("8");
		CommonUtils.sendKeys(directSubmitterPage.commentsField, "Comments added");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();

	}

	@Given("User chooses to approve")
	public void user_chooses_to_approve() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("5");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();

	}

	@Then("User clicks Process Action")
	public void user_clicks_Process_Action() {
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
	}

	@Given("GARCIA-CLOSAS, MONTSERRAT can view the new CR under My Pending Reviews")
	public void garcia_CLOSAS_MONTSERRAT_can_view_the_new_CR_under_My_Pending_Reviews() {
		WebDriverUtils.webDriver.get("");
		CommonUtils.clickOnElement(directSubmitterPage.viewFirstPublication);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();

	}

	@Then("CHRISTIAN ABNET recommends the CR for approval")
	public void christian_ABNET_recommends_the_CR_for_approval() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("5");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();

	}

	@Then("\"([^\"]*)\" can view the CR under My Pending Reviews tab")
	public void user_can_view_the_CR_under_My_Pending_Reviews_tab(String UserName) {
		WebDriverUtils.webDriver.get("");
		CommonUtils.clickOnElement(directSubmitterPage.viewFirstPublication);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();

	}

	@Given("User approves the CR")
	public void user_approves_the_CR() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("11");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify that the CR has status as Approved for Dissemination")
	public void user_can_verify_that_the_CR_has_status_as_Approved_for_Dissemination() {
		Assert.assertTrue(directSubmitterPage.approvedAlert.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("The reviewer has been removed from the list of reviewers.");
		}
	}

	@Given("User chooses to reassign the CR to Amanda Black")
	public void user_chooses_to_reassign_the_CR_to_Amanda_Black() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("9");
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(directSubmitterPage.additionalRevField, "Black");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.amBlack);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Given("Amanda Black can verify that the previous reviewer was Christian Abnett")
	public void amanda_Black_can_verify_that_the_previous_reviewer_was_Christian_Abnett()  {
		WebDriverUtils.webDriver.get("");
		CommonUtils.clickOnElement(directSubmitterPage.viewFirstPublication);
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(directSubmitterPage.previousReviewer);
		Assert.assertTrue(directSubmitterPage.previousReviewer.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Abnet Christian is a previous reviewer");
		}
		CucumberLogUtils.logScreenshot();
	}

	@When("User removes current reviewer")
	public void user_removes_current_reviewer() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("10");
		CommonUtils.sendKeys(directSubmitterPage.commentsField, "Comments added");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.confirmRemoveReviewer);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User can verify that the next reviewer is displayed")
	public void user_can_verify_that_the_next_reviewer_is_displayed() {
		Assert.assertTrue(directSubmitterPage.abentRemovefFromReviewersAlert.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Christian Abnet has been removed from the list of reviewers.");

		}
	}

	@Then("User can verify that CHRISTIAN ABNET has been removed from the list of reviewers")
	public void user_can_verify_that_CHRISTIAN_ABNET_has_been_removed_from_the_list_of_reviewers() {
		Assert.assertTrue(directSubmitterPage.abentRemovefFromReviewersAlert.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Christian Abnet has been removed from the list of reviewers.");

		}
	}

	@Given("Program Director chooses to return for revision")
	public void divsion_Director_chooses_to_return_for_revision() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("6");
		CommonUtils.sendKeys(directSubmitterPage.commentsField, "Comments added");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.confirmReturnRevision);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify that the request was returned back to Albanes Demetrius for revision")
	public void user_can_verify_that_the_request_was_returned_back_to_Albanes_Demetrius_for_revision() {
		Assert.assertTrue(directSubmitterPage.returnedForRevisionAlert.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Clearance request has been Returned for Revision.");

		}
	}

	@When("Division director chooses to dissaprove")
	public void division_director_chooses_to_dissaprove() {
		WebDriverUtils.webDriver.get("");
		CommonUtils.clickOnElement(directSubmitterPage.viewFirstPublication);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(directSubmitterPage.noConflictOfInterest);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("7");
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(directSubmitterPage.commentsField, "Comments added");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.confirmDissaprove);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();

	}

	@Then("User can confirm that the CR was terminated")
	public void user_can_confirm_that_the_CR_was_terminated() {
		Assert.assertTrue(directSubmitterPage.disapprovedAlert.isDisplayed());
		boolean result = true;
		if (result) {
			System.out.println("Clearance request has been Returned for Revision.");

		}
	}

	@Given("Divsion Director chooses to refer to Amanda Black")
	public void divsion_Director_chooses_to_refer_to_Amanda_Black() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("8");
		CommonUtils.sendKeys(directSubmitterPage.additionalRevField, "Black");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.amBlack);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();

	}

	@Given("AMANDA BLACK chooses to view the submitted CR for the review")
	public void amanda_BLACK_chooses_to_view_the_submitted_CR_for_the_review() {
		WebDriverUtils.webDriver.get("");
		CommonUtils.clickOnElement(directSubmitterPage.viewFirstPublication);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@Given("AMANDA BLACK dissaapproves the CR")
	public void amanda_BLACK_dissaapproves_the_CR() {
		CommonUtils.clickOnElement(directSubmitterPage.actionsDropdown);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		Select se = new Select(WebDriverUtils.webDriver.findElement(By.id("selectAction")));
		se.selectByValue("7");
		CommonUtils.sendKeys(directSubmitterPage.commentsField, "Comments added");
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(directSubmitterPage.processActionButton);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(directSubmitterPage.dissaprove);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	@When("User denies that the paper is High Profile")
	public void user_denies_that_the_paper_is_High_Profile() {
		JavascriptUtils.scrollIntoView(directSubmitterPage.noHighProfile);
		CommonUtils.clickOnElement(directSubmitterPage.noHighProfile);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}
}