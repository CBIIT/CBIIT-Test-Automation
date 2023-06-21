package CustomBusiness.EIDP.StepsImplementation;

import com.nci.automation.web.CommonUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;

public class TraineeReviewStepsImpl extends PageInitializer{
    
    public void reivewIDPRequest() {
		CommonUtil.waitBrowser(4000);
		CommonUtils.click(traineeReviewPage.generalInfromationTab);
		CommonUtils.click(traineeReviewPage.markAsReadCheckbox);
		CommonUtils.click(traineeReviewPage.projectRelatedTab);
		CommonUtils.click(traineeReviewPage.markAsReadCheckbox);
		CommonUtils.click(traineeReviewPage.projectRelatedTrainningTab);
		CommonUtils.click(traineeReviewPage.markAsReadCheckbox);
		CommonUtils.click(traineeReviewPage.careerGoalsTab);
		CommonUtils.click(traineeReviewPage.markAsReadCheckbox);
		CommonUtils.click(traineeReviewPage.alignExpectationsTab);
		CommonUtils.click(traineeReviewPage.markAsReadCheckbox);
		CommonUtils.click(traineeReviewPage.mentorExpectationsTab);
		CommonUtils.click(traineeReviewPage.reviewedNoFeedbackRadioButton);
		CommonUtils.click(traineeReviewPage.saveButton);
		if(CommonUtils.isElementDisplayed(traineeReviewPage.ackRenewaldecision)){
			CommonUtils.click(traineeReviewPage.ackRenewaldecision);
			CommonUtils.click(traineeReviewPage.saveButton);
		}
		CommonUtils.click(traineeReviewPage.reviewAndTakeActionButton);
	}
}
