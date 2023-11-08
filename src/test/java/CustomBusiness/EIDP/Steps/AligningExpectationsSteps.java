package CustomBusiness.EIDP.Steps;

import org.junit.Assert;
import com.nci.automation.utils.MiscUtils;
import CustomBusiness.EIDP.Util.SharedData;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
			MiscUtils.sleep(2000);
			eidpDashboardStepImpl.clickOnSendIDPToPrimaryMentorButton();
			MiscUtils.sleep(2000);
			String msg = aligningExpectationsStepImpl.getHoldMsg();
			System.out.println("hold message = " + msg);
			eidpCommonPage.clickOnYesButton();
			Assert.assertTrue(
					msg.contains("Your IDP will be placed on hold since you updated the following field(s):"));
	}
}