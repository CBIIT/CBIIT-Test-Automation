package CustomBusinessApp.EIDP.StepsImplementation;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;

import appsCommon.PageInitializer;

public class AlignExpectionsStepImpl extends PageInitializer {

	public void fillAligningExpectations() throws Exception {
		CommonUtils.sendKeys(aligningExpectationsPage.description,
				"This filed dedicated for expectations about aligning and it is a textarea field.");
		if (CommonUtils.isElementDisplayed(aligningExpectationsPage.additionalCommentNoRadioButton)) {
			CommonUtils.click(aligningExpectationsPage.additionalCommentNoRadioButton);
		}
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(aligningExpectationsPage.saveButton);
		Thread.sleep(6000);
	}

	public void clickOnSaveButton() {
		CommonUtils.click(aligningExpectationsPage.saveButton);
	}

	public void enterAligningDescription(String descriptionVal) {
		CommonUtils.sendKeys(aligningExpectationsPage.description, descriptionVal);
	}

	public String getSuccessMessage() {
		CommonUtils.waitForVisibility(aligningExpectationsPage.successMessage);
		return aligningExpectationsPage.successMessage.getText();
	}

	public void clickOnReviewAndTakeActionButton() {
		CommonUtils.waitForVisibility(aligningExpectationsPage.reviewAndTakeActionButton);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(aligningExpectationsPage.reviewAndTakeActionButton);
	}

	public void clickOnSendIDPToTraineeButton() {
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(aligningExpectationsPage.sendIDPToTraineeButton);

	}

	public String getHoldMsg() {
		return CommonUtils.getText(aligningExpectationsPage.onHoldMessage);
	}
}
