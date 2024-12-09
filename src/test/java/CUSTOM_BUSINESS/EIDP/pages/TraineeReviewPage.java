package CUSTOM_BUSINESS.EIDP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class TraineeReviewPage extends CommonUtils {

	/* ------ General info Tab ------ */
	@FindBy(css = "a[href*='/idp/general']")
	public WebElement generalInfromationTab;

	/* ------ Project related tab ------ */
	@FindBy(css = "a[href*='/idp/projects']")
	public WebElement projectRelatedTab;

	/* ------ Project related training tab ------ */
	@FindBy(id = "trainingActivitiesTab")
	public WebElement projectRelatedTrainningTab;

	/* ------ Career goals tab ------ */
	@FindBy(css = "a[href*='/idp/career']")
	public WebElement careerGoalsTab;

	/* ------ Align expectation tab ------ */
	@FindBy(css = "a[href*='/idp/alignExpectations']")
	public WebElement alignExpectationsTab;

	/* ------ Mentors expectation tab ------ */
	@FindBy(css = "a[href*='/idp/mentor-expectations']")
	public WebElement mentorExpectationsTab;

	/* ------ Mark as read checkbox ------ */
	@FindBy(id = "changeMarkasread")
	public WebElement markAsReadCheckbox;

	/* ------ Radio button for Reviewd and NO feedback ------ */
	@FindBy(css = "label[for='revisionRadioButtonNo']")
	public WebElement reviewedNoFeedbackRadioButton;

	/* ------ Save button ------ */
	@FindBy(id = "saveButton")
	public WebElement saveButton;

	/* ------ Review and Take action button ------ */
	@FindBy(css = "a[href*='/idp/trainingDetails']")
	public WebElement reviewAndTakeActionButton;

	/* ------ Acknowledge Renewal decision radio button ------ */
	@FindBy(xpath =  "//*[@id='ackRenewalDecision']")
	public WebElement ackRenewaldecision;

	public TraineeReviewPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
