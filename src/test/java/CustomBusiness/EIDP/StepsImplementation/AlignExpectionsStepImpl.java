package CustomBusiness.EIDP.StepsImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (CommonUtils.isElementPresentWithoutWait("//*[@id='tdAprroveIDP']")) {
				CucumberLogUtils.logScreenShot();
				CommonUtils.click(By.xpath("//*[@id='tdAprroveIDP']"));
			} else {
				CommonUtils.waitForVisibility(aligningExpectationsPage.reviewAndTakeActionButton);
				CucumberLogUtils.logScreenShot();
				CommonUtils.click(aligningExpectationsPage.reviewAndTakeActionButton);
			}
		} catch (Exception e) {

		}
	}

	public void clickOnSendIDPToTraineeButton() {
		CucumberLogUtils.logScreenShot();
		if (CommonUtils.isElementDisplayed(By.id("344"))) {
			CommonUtils.click(aligningExpectationsPage.renewalOption);
		}
		if (CommonUtils.isElementDisplayed(aligningExpectationsPage.updatesForRenewalYearText)) {
			CommonUtils.sendKeys(aligningExpectationsPage.updatesForRenewalYearText,
					"Lets Try automated test It should work fine hopefully");
		}
		if (CommonUtils.isElementDisplayed(aligningExpectationsPage.saveAndPreviousBtn)) {
			CommonUtils.click(aligningExpectationsPage.saveAndPreviousBtn);
			CommonUtils.click(aligningExpectationsPage.reviewAndTakeActionButton);
		}
		CommonUtils.click(aligningExpectationsPage.sendIDPToTraineeButton);

	}

	private WebElement find(By id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getHoldMsg() {
		return CommonUtils.getText(aligningExpectationsPage.onHoldMessage);
	}
}
