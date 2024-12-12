package CUSTOM_BUSINESS.EIDP.stepsImplementation;

import com.nci.automation.web.CommonUtils;
import CUSTOM_BUSINESS.EIDP.utils.CommonUtil;
import APPS_COMMON.PageInitializers.PageInitializer;

public class TraineeReviewStepsImpl extends PageInitializer{
    
    public void reivewIDPRequest() {
		CommonUtil.waitBrowser(4000);
		CommonUtils.clickOnElement(traineeReviewPage.generalInfromationTab);
		CommonUtils.clickOnElement(traineeReviewPage.markAsReadCheckbox);
		CommonUtils.clickOnElement(traineeReviewPage.projectRelatedTab);
		CommonUtils.clickOnElement(traineeReviewPage.markAsReadCheckbox);
		CommonUtils.clickOnElement(traineeReviewPage.projectRelatedTrainningTab);
		CommonUtils.clickOnElement(traineeReviewPage.markAsReadCheckbox);
		CommonUtils.clickOnElement(traineeReviewPage.careerGoalsTab);
		CommonUtils.clickOnElement(traineeReviewPage.markAsReadCheckbox);
		CommonUtils.clickOnElement(traineeReviewPage.alignExpectationsTab);
		CommonUtils.clickOnElement(traineeReviewPage.markAsReadCheckbox);
		CommonUtils.clickOnElement(traineeReviewPage.mentorExpectationsTab);
		CommonUtils.clickOnElement(traineeReviewPage.reviewedNoFeedbackRadioButton);
		CommonUtils.clickOnElement(traineeReviewPage.saveButton);
		if(CommonUtils.isElementDisplayed(traineeReviewPage.ackRenewaldecision)){
			CommonUtils.clickOnElement(traineeReviewPage.ackRenewaldecision);
			CommonUtils.clickOnElement(traineeReviewPage.saveButton);
		}
		CommonUtils.clickOnElement(traineeReviewPage.reviewAndTakeActionButton);
	}
}
