package CustomBusiness.EIDP.StepsImplementation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Pages.BasePage;
import CustomBusiness.EIDP.Util.CommonUtil;
import CustomBusiness.EIDP.Util.SharedData;
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
		try {
			CommonUtils.click(traineeReviewPage.ackRenewaldecision);
			CommonUtils.click(traineeReviewPage.saveButton);
		}catch(Exception e) {
			
		}
		CommonUtils.click(traineeReviewPage.reviewAndTakeActionButton);

	}
}
