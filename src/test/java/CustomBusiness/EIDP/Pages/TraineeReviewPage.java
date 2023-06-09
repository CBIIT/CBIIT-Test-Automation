package CustomBusiness.EIDP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class TraineeReviewPage extends CommonUtils {

	@FindBy(css = "a[href*='/idp/general']")
	public WebElement generalInfromationTab;

	@FindBy(css = "a[href*='/idp/projects']")
	public WebElement projectRelatedTab;

	@FindBy(id = "trainingActivitiesTab")
	public WebElement projectRelatedTrainningTab;

	@FindBy(css = "a[href*='/idp/career']")
	public WebElement careerGoalsTab;

	@FindBy(css = "a[href*='/idp/alignExpectations']")
	public WebElement alignExpectationsTab;

	@FindBy(css = "a[href*='/idp/mentor-expectations']")
	public WebElement mentorExpectationsTab;

	@FindBy(id = "changeMarkasread")
	public WebElement markAsReadCheckbox;

	@FindBy(css = "label[for='revisionRadioButtonNo']")
	public WebElement reviewedNoFeedbackRadioButton;

	@FindBy(id = "saveButton")
	public WebElement saveButton;

	@FindBy(css = "a[href*='/idp/trainingDetails']")
	public WebElement reviewAndTakeActionButton;

	@FindBy(xpath =  "//*[@id='ackRenewalDecision']")
	public WebElement ackRenewaldecision;

	public TraineeReviewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
}
