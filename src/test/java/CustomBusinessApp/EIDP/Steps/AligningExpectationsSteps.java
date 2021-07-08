package CustomBusinessApp.EIDP.Steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.WebDriverUtils;
import org.junit.Assert;

import com.nci.automation.utils.MiscUtils;

import CustomBusinessApp.EIDP.Util.SharedData;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;

public class AligningExpectationsSteps extends PageInitializer {

	@When("User fills mandatory fields in aligning expecations page")
	public void fillAligningExpecations() throws Exception {
		aligningExpectationsStepImpl.fillAligningExpectations();
	}

	@When("User edits aligning expectations")
	public void editAligningExpecations() throws Exception {
		aligningExpectationsStepImpl.enterAligningDescription(
				"This filed dedicated for expectations about aligning and it is a textarea field.");
		aligningExpectationsStepImpl.clickOnSaveButton();
	}

	@When("User will click on revew and take action button")
	public void user_will_click_on_revew_and_take_action_button() {
		MiscUtils.sleep(4000);
		System.out.println("TRAINEE NAME = " + SharedData.traineeName);
		aligningExpectationsStepImpl.clickOnReviewAndTakeActionButton();
	}

	public void clickOnReviewAndTakeActionButton() {
		aligningExpectationsStepImpl.clickOnReviewAndTakeActionButton();
	}

	@When("User verifies IDP will be placed on hold message")
	public void verifyIDPHoldMsg() {
		try {
			MiscUtils.sleep(6000);
			eidpDashboardStepImpl.clickOnSendIDPToPrimaryMentorButton();
			MiscUtils.sleep(4000);
			String msg = aligningExpectationsStepImpl.getHoldMsg();
			System.out.println("hold message = " + msg);
			eidpCommonPage.clickOnYesButton();
			// Your IDP will be placed on hold since you updated the following field(s):
			Assert.assertTrue(
					msg.contains("Your IDP will be placed on hold since you updated the following field(s):"));

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
