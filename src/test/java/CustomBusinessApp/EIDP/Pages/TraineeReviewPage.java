package CustomBusinessApp.EIDP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;


public class TraineeReviewPage extends CommonUtils{

	@FindBy(css = "a[href*='/idp/general']")
	private WebElement generalInfromationTab;
	
	@FindBy(css = "a[href*='/idp/projects']")
	private WebElement projectRelatedTab;
	
	@FindBy(id = "trainingActivitiesTab")
	private WebElement projectRelatedTrainningTab;
	
	@FindBy(css = "a[href*='/idp/career']")
	private WebElement careerGoalsTab;
	
	@FindBy(css = "a[href*='/idp/alignExpectations']")
	private WebElement alignExpectationsTab;
	
	@FindBy(css = "a[href*='/idp/mentor-expectations']")
	private WebElement mentorExpectationsTab;
	
	@FindBy(id = "changeMarkasread")
	private WebElement markAsReadCheckbox;
	
	@FindBy(css = "label[for='revisionRadioButtonNo']")
	private WebElement reviewedNoFeedbackRadioButton;
	
	@FindBy(id= "saveButton")
	private WebElement saveButton;
	
	@FindBy(css= "a[href*='/idp/trainingDetails']")
	private WebElement reviewAndTakeActionButton;
	
	public TraineeReviewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	public void reivewIDPRequest() {
		CommonUtil.waitBrowser(4000);
		CommonUtils.click(generalInfromationTab);
		CommonUtils.click(markAsReadCheckbox);
		
		CommonUtils.click(projectRelatedTab);
		CommonUtils.click(markAsReadCheckbox);
		CommonUtils.click(projectRelatedTrainningTab);
		CommonUtils.click(markAsReadCheckbox);
		
		CommonUtils.click(careerGoalsTab);
		CommonUtils.click(markAsReadCheckbox);
		
		CommonUtils.click(alignExpectationsTab);
		CommonUtils.click(markAsReadCheckbox);
		
		CommonUtils.click(mentorExpectationsTab);
		CommonUtils.click(reviewedNoFeedbackRadioButton);
		CommonUtils.click(saveButton);
		CommonUtils.click(reviewAndTakeActionButton);
		
		
	}
}
