package CustomBusiness.EIDP.Steps;

import com.nci.automation.web.CommonUtils;
import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoPrimaryMentorSteps extends PageInitializer {

	@When("User marks all the fields as reviewed in all the tabs")
	public void markReviewInAllTabs() {
		coPrimaryMentorPage.markAsReviewedInAllTabs();
	}

	@When("User marks all the fields as reviewed in all the tabs being LBO")
	public void user_marks_all_the_fields_as_reviewed_in_all_the_tabs_being_LBO() {
		coPrimaryMentorPage.markNHGRIasReviewed();
	}

	@When("Director user review, approve & submit")
	public void markReviewInAllTabsForDirector() {
		coPrimaryMentorPage.markAsReviewedInAllTabsForDir();
	}

	@When("Primary mentor clicks on SEND IDP TO THE TRAINEE button")
	public void clickOnSendIDPToTrainee() {
		eidpCommonPage.clickOnbutton("Send IDP to the Trainee");
		eidpCommonPage.waitForGoBackToYourQueueButtonVisible();
	}

	@When("User clicks on REVIEWED button")
	public void clickOnReviewedButton() {
		CommonUtils.sleep(4000);
		coPrimaryMentorPage.clickOnReviewedButton();
		CommonUtils.sleep(2000);
	}

	@When("User clicks on REVIEWED button then approves and submit")
	public void clickOnReviewedButtonApproveAndSubmit() {
			coPrimaryMentorPage.markAsReviewed();
			coPrimaryMentorPage.clickOnApproveAndSubmitButton();
	}

	@When("User clicks on Marks as REVIEWED button on LBO page")
	public void clickOnReviewedLBO() {
			coPrimaryMentorPage.markAsReviewed();
	}

	@Then("Finish Idp process")
	public void finish() {
		coPrimaryMentorPage.approveIdp();
	}

	@When("User clicks on APPROVE AND SUBMIT button")
	public void clickOnApproveAndSubmitButton() {
			coPrimaryMentorPage.clickOnApproveAndSubmitButton();
	}

	@When("User clicks on APPROVE AND SUBMIT button for nci")
	public void clickOnApproveAndSubmitButtonforNCI() {
		coPrimaryMentorPage.clickOnApproveAndSubmitButtonFORNCI();
	}

	@When("User clicks on APPROVE AND SUBMIT button NHGRI")
	public void clickOnApproveAndSubmitButtonNHGRI() {
		coPrimaryMentorPage.clickOnApproveAndSubmitButtonNHGRI();
	}

	@When("User clicks on Yes button")
	public void clickOnYesButton() {
			coPrimaryMentorPage.clickOnYesButton();
			eidpCommonPage.waitForGoBackToHomeQueueButtonVisible();
			CucumberLogUtils.logScreenshot();
	} 
	
	@When("User clicks on APPROVE IDP button")
	public void approveIDP() {
		coPrimaryMentorPage.clickOnApproveIDPButton();
	}

	@When("User clicks on SEND BACK TO TRAINEE button")
	public void sendBackToTrainee() {
		eidpCommonPage.clickOnSendBackToTrinee();
		eidpCommonPage.clickOnbutton("Send IDP to the Trainee");
		eidpCommonPage.waitForGoBackToYourQueueButtonVisible();
	}

	@When("User clicks on RETURN TO THE PRIMARY MENTOR button")
	public void clickOnReturnToPrimaryMentorButton() {
		coPrimaryMentorPage.clickOnReturnToPrimaryMentorButton();
		eidpCommonPage.waitForGoBackToYourQueueButtonVisible();
	}

	@When("User clicks on RETURN TO TRAINEE button")
	public void clickOnReturnToTraineeButton() {
		coPrimaryMentorPage.clickOnReturnToPrimaryMentorButton();
		eidpCommonPage.waitForGoBackToYourQueueButtonVisible();
	}

	@Then("User verifies trainnee request is displayed")
	public void verifyTrainneeName() {
		Assert.assertTrue(coPrimaryMentorPage.isTrainneeNameDisplayed());
	}

}
