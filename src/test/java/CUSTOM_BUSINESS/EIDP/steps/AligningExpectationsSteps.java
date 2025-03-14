package CUSTOM_BUSINESS.EIDP.steps;

import com.nci.automation.web.CommonUtils;
import org.junit.Assert;
import CUSTOM_BUSINESS.EIDP.utils.SharedData;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.When;

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

	@When("User will click on review and take action button")
	public void user_will_click_on_revew_and_take_action_button() {
		System.out.println("TRAINEE NAME = " + SharedData.traineeName);
		aligningExpectationsStepImpl.clickOnReviewAndTakeActionButton();
	}

	public void clickOnReviewAndTakeActionButton() {
		aligningExpectationsStepImpl.clickOnReviewAndTakeActionButton();
	}

	@When("User verifies IDP will be placed on hold message")
	public void verifyIDPHoldMsg() {
			CommonUtils.sleep(2000);
			eidpDashboardStepImpl.clickOnSendIDPToPrimaryMentorButton();
			CommonUtils.sleep(2000);
			String msg = aligningExpectationsStepImpl.getHoldMsg();
			System.out.println("hold message = " + msg);
			eidpCommonPage.clickOnYesButton();
			Assert.assertTrue(
					msg.contains("Your IDP will be placed on hold since you updated the following field(s):"));
	}
}