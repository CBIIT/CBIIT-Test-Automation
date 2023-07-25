package CustomBusiness.EIDP.Pages;

import CustomBusiness.EIDP.Steps.HooksSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.SharedData;

public class IDPAwaitingResponsePage extends CommonUtils {

	/* ------ No Revision Radio button ------ */
	@FindBy(css = "label[for='revisionRadioButtonNo']")
	private WebElement revisionRadioButtonNo;

	/* ------ IDP awaiting response icon------ */
	@FindBy(xpath = "//span[contains(text(),'IDP Awaiting Response')]")
	private WebElement idpWaitingresponseIcon;

	/* ------ Trainee Name ------ */
	@FindBy(xpath = "//td[@class='sorting_1']/a")
	private WebElement traineeNames;

	/* ------ IDP header ------ */
	@FindBy(xpath = "//div[@id='tdResponse']/div/legend/h4")
	private WebElement IDPHeader;

	/* ------ Number of Rows in IDP awaiting response table ------ */
	@FindBy(xpath = "//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr")
	private WebElement NoofRows;

	/* ------ Trainee General tab ------ */
	@FindBy(xpath = "//label[@for='traineeName']")
	private WebElement General;

	/* ------ No Revision radio button in general tab ------ */
	@FindBy(xpath = "//input[@id='revisionRadioButtonNo']")
	private WebElement NoRevisionRadioBtn;

	/* ------ Comments and feeback text area ------ */
	@FindBy(xpath = "//textarea[@name='feedbackText']")
	private WebElement commentsAndFeedback;

	/* ------ Save and continue button ------ */
	@FindBy(xpath = "//input[@id='saveAndNextButton']")
	private WebElement saveAndContinueBtn;

	/* ------ Comments and feedback button ------ */
	@FindBy(xpath = "//legend[contains(text(),'Comments/Feedback')]")
	private WebElement commentsAndFeedBackBtn;

	/* ------ IDP awaiting table ------ */
	@FindBy(xpath = "//*[@id='primaryMentorsawaitingResponseTable']")
	private WebElement tableIDP;

	/* ------ Select all mentors checkbox ------ */
	@FindBy(xpath = "//input[@id='selectAllMentor']")
	private WebElement selectAllMentorChkBox;

	/* ------ Select all trainee checkbox ------ */
	@FindBy(xpath = "//input[@id='selectAllTrainee']")
	private WebElement selectAllTraineeChkBox;

	/* ------ Save button ------ */
	@FindBy(xpath = "//input[@id='saveAndPreviousBtn']")
	private WebElement saveBtn;

	/* ------ Review and take action button ------ */
	@FindBy(xpath = "//input[@id='saveAndPreviousBtn']/../a")
	private WebElement reviewAndActionBtn;

	/* ------ Core work schedule  checkbox ------ */
	@FindBy(xpath = "//input[@id='coreWorkSchedule']")
	private WebElement workSceduleChkbox;

	/* ------ Core hours text ------ */
	@FindBy(xpath = "//textarea[@name='coreHoursText']")
	private WebElement coreHoursText;

	/* ------ Vacation policy text ------ */
	@FindBy(xpath = "//textarea[@name='vacationPoliciesText']")
	private WebElement policiesText;

	/* ------ Core meeting checkbox ------ */
	@FindBy(xpath = "//input[@id='coreMeetingFrequency']")
	private WebElement coreMettingChkBox;

	/* ------ Meeting frequency daily radio button ------ */
	@FindBy(xpath = "//input[@id='meetingFrequencyId1']")
	private WebElement dailyRadioBtn;

	/* ------ Meeting time text ------ */
	@FindBy(xpath = "//textarea[@name='meetingTimeText']")
	private WebElement meetingTimeText;

	/* ------ Communication preferences checkbox ------ */
	@FindBy(xpath = "//input[@id='coreMeetingAttendance']")
	private WebElement communicationPreferencesChkbox;

	/* ------ Communication Preference Text ------ */
	@FindBy(xpath = "//textarea[@name='communicationPreferencesText']")
	private WebElement communicationPreferenceText;

	/* ------ Feedback Checkbox ------ */
	@FindBy(xpath = "//input[@id='coreFeedback']")
	private WebElement feedbackChkBox;

	/* ------ Work products Text ------ */
	@FindBy(xpath = "//textarea[@name='workProductsText']")
	private WebElement workProductsText;

	/* ------ Career planning Text ------ */
	@FindBy(xpath = "//textarea[@name='careerPlanningText']")
	private WebElement careerPlanningText;

	/* ------ Core Professional attendance checkbox ------ */
	@FindBy(xpath = "//input[@id='coreProfessionalAttendance']")
	private WebElement coreProfessionalAttendancechkBox;

	/* ------ Group meetings text ------ */
	@FindBy(xpath = "//textarea[@name='groupMeetingsText']")
	private WebElement groupMeetingsText;

	/* ------ Professional meeting text ------ */
	@FindBy(xpath = "//textarea[@name='professionalMeetingsText']")
	private WebElement professionalMeetingsText;

	/* ------ Career Development text ------ */
	@FindBy(xpath = "//textarea[@name='careerDevelopmentText']")
	private WebElement careerDevelopmentText;

	/* ------ Core conduct research checkbox ------ */
	@FindBy(xpath = "//input[@id='coreConductResearch']")
	private WebElement coreConductResearchchkBox;

	/* ------ Work record storage text ------ */
	@FindBy(xpath = "//textarea[@name='workRecordStorageText']")
	private WebElement workRecordStorageText;

	/* ------ Core Renewal checkbox ------ */
	@FindBy(xpath = "//input[@id='coreRenewal']")
	private WebElement coreRenewalchkBox;

	/* ------ Renewal decision text ------ */
	@FindBy(xpath = "//textarea[@name='renewalDecisionText']")
	private WebElement renewalDecisionText;

	/* ------ OK button after clicking on decline ------ */
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement declineBtnOk;

	/* ------ General information tab ------ */
	@FindBy(css = "a[href='/idp/review-general']")
	private WebElement generalInfromationTab;

	/* ------ Project and related deliverables Tab ------ */
	@FindBy(css = "a[href='/idp/review-projects']")
	private WebElement projectAndRelatedDelivierablesOrTrainningTab;

	/* ------ Career goals and activities Tab ------ */
	@FindBy(css = "a[href='/idp/review-career76T']")
	private WebElement carieerGoalsAndActivitiesTab;

	/* ------ Aligning Expectations Tab ------ */
	@FindBy(css = "a[href='/idp/review-alignExpectations']")
	private WebElement aligningExpectationsTab;

	/* ------ Mentors expactation Tab ------ */
	@FindBy(css = "a[href='/idp/mentor-expectations']")
	private WebElement mentorExpectationsTab;

	/* ------ Request Revision Radio button ------ */
	@FindBy(css = "label[for='revisionRadioButtonYes']")
	private WebElement requestRevisionRadioButton;

	/* ------ NO revision Radio button ------ */
	@FindBy(css = "label[for='revisionRadioButtonNo']")
	private WebElement noRevisionRadioButton;

	/* ------ Request for revision comments box ------ */
	@FindBy(id = "reviewText1")
	private WebElement requestRevisionComment;

	/* ------ Co-PM lebel ------ */
	@FindBy(id = "label_copm_1")
	private WebElement coPrimaryMentorLabel;

	public IDPAwaitingResponsePage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	public void clickOnProceedOfTrainee() {
		String xpath = "//table[@id='primaryMentorsawaitingResponseTable']//tbody//tr//td//a[text()='"
				+ SharedData.traineeName + "']//ancestor::tr//td//img";
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.xpath(xpath)));
	}

	public void clickonIDpWaitigResponse() {
		CommonUtils.waitForVisibility(idpWaitingresponseIcon);
		CommonUtils.click(idpWaitingresponseIcon);

	}

	public void selecTraineeName(String str) {
		CommonUtils.waitForVisibility(IDPHeader);
		int sizeofTrainees = WebDriverUtils.getWebDriver().findElements(By.xpath("//td[@class='sorting_1']/a")).size();
		System.out.println("number of trainees displayed on Ui" + sizeofTrainees);
		for (int i = 0; i <= sizeofTrainees; i++) {
			String TraineeName = WebDriverUtils.getWebDriver().findElements(By.xpath("//td[@class='sorting_1']/a"))
					.get(i).getText();
			if (TraineeName.equalsIgnoreCase(str)) {
				WebDriverUtils.getWebDriver()
						.findElements(
								By.xpath("//td[@class='sorting_1']/a/following::td/a[@data-original-title='Proceed']"))
						.get(i).click();
			}
		}

	}

	public void validtingFieldsInaRow() throws InterruptedException {
		Thread.sleep(5000);
		CommonUtils.waitForVisibility(tableIDP);
		int sizeofrows = WebDriverUtils.getWebDriver()
				.findElements(By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr")).size();
		System.out.println("size of rows" + sizeofrows);
		for (int i = 1; i < sizeofrows; i++) {
			Thread.sleep(5000);
			String GeneralInfoOriginalreview = WebDriverUtils.getWebDriver()
					.findElement(
							By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr[" + i + "]/td[23]/a/i"))
					.getAttribute("alt");
			System.out.println("GeneralInfoOriginalreview" + GeneralInfoOriginalreview);
			System.out.println("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr[" + i + "]/td[23]/a/i");
			Thread.sleep(2000);
			String ProjectInfoOriginalreview = WebDriverUtils.getWebDriver()
					.findElement(
							By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr[" + i + "]/td[24]/a/i"))
					.getAttribute("alt");
			System.out.println("ProjectInfoOriginalreview" + ProjectInfoOriginalreview);
			Thread.sleep(2000);
			String CarrierInfoOriginalreview = WebDriverUtils.getWebDriver()
					.findElement(
							By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr[" + i + "]/td[25]/a/i"))
					.getAttribute("alt");
			System.out.println("CarrierInfoOriginalreview" + CarrierInfoOriginalreview);
			Thread.sleep(2000);
			String AligingExpectationsOriginalreview = WebDriverUtils.getWebDriver()
					.findElement(
							By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr[" + i + "]/td[26]/a/i"))
					.getAttribute("alt");
			System.out.println("AligingExpectationsOriginalreview" + AligingExpectationsOriginalreview);
			Thread.sleep(2000);
			if (GeneralInfoOriginalreview.equalsIgnoreCase("Pending Review")
					|| ProjectInfoOriginalreview.equalsIgnoreCase("Pending Review")
					|| CarrierInfoOriginalreview.equalsIgnoreCase("Pending Review")
					|| AligingExpectationsOriginalreview.equalsIgnoreCase("Pending Review")) {
				WebDriverUtils.getWebDriver()
						.findElement(
								By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr[" + i + "]/td[28]/a"))
						.click();
				System.out.println("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr[" + i + "]/td[28]/a");
				break;
			}

		}
	}

	public void validtingFieldsInaRowDecline() throws InterruptedException {

//		Thread.sleep(5000);
//		CommonUtils.waitForVisibility(tableIDP);
//		int sizeofrows=WebDriverUtils.getWebDriver().findElements(By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr")).size();
//		System.out.println("size of rows"+sizeofrows);
//		for(int i=1;i<sizeofrows;i++) {
//			Thread.sleep(5000);
//			String GeneralInfoOriginalreview=WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr["+i+"]/td[23]/a/i")).getAttribute("alt");
//			System.out.println("GeneralInfoOriginalreview"+GeneralInfoOriginalreview);
//			System.out.println("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr["+i+"]/td[23]/a/i");
//			Thread.sleep(2000);
//			String ProjectInfoOriginalreview=WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr["+i+"]/td[24]/a/i")).getAttribute("alt");
//			System.out.println("ProjectInfoOriginalreview"+ProjectInfoOriginalreview);
//			Thread.sleep(2000);
//			String CarrierInfoOriginalreview=WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr["+i+"]/td[25]/a/i")).getAttribute("alt");
//			System.out.println("CarrierInfoOriginalreview"+CarrierInfoOriginalreview);
//			Thread.sleep(2000);
//			String AligingExpectationsOriginalreview=WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr["+i+"]/td[26]/a/i")).getAttribute("alt");
//			System.out.println("AligingExpectationsOriginalreview"+AligingExpectationsOriginalreview);
//			Thread.sleep(2000);
//			if(GeneralInfoOriginalreview.equalsIgnoreCase("Pending Review")||ProjectInfoOriginalreview.equalsIgnoreCase("Pending Review")||CarrierInfoOriginalreview.equalsIgnoreCase("Pending Review")||AligingExpectationsOriginalreview.equalsIgnoreCase("Pending Review")) {
//            WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr["+i+"]/td[28]/a[2]")).click();
//            System.out.println("//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr["+i+"]/td[28]/a[2]");
//            CommonUtils.waitForVisibility(declineBtnOk);
//            declineBtnOk.click();
//            break;
//			}
//			
//		}
	}

	public void generalInfoNoRevision() throws InterruptedException {
		System.out.println("generalInfoNoRevision");
		CommonUtils.waitForVisibility(NoRevisionRadioBtn);
		if (NoRevisionRadioBtn.isSelected()) {
			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
			saveAndContinueBtn.click();

		} else {
			System.out.println("null loop");

			Thread.sleep(6000);
			CommonUtils.waitForVisibility(NoRevisionRadioBtn);
			NoRevisionRadioBtn.click();
			CommonUtils.waitForVisibility(commentsAndFeedback);
			commentsAndFeedback.sendKeys("No revision");
			try {
				if (coPrimaryMentorLabel.isDisplayed()) {
					acknowledgeCoPrimaryMentor(true);
				}
			} catch (Exception ex) {

			}

			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
			saveAndContinueBtn.click();

		}
	}

	public void acknowledgeCoPrimaryMentor(Boolean isAcknowledge) {
		if (isAcknowledge) {
			WebDriverUtils.getWebDriver().findElement(By.id("agreeCoPi")).click();
		} else {
			WebDriverUtils.getWebDriver().findElement(By.id("disagreeCoPi")).click();
		}
	}

	public void projectInfoNoRevision() throws InterruptedException {
		System.out.println("projectInfoNoRevision");
		CommonUtils.waitForVisibility(commentsAndFeedBackBtn);
		if (NoRevisionRadioBtn.isSelected()) {
			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
			saveAndContinueBtn.click();

		} else {
			Thread.sleep(6000);
			System.out.println("null loop");
			CommonUtils.waitForVisibility(NoRevisionRadioBtn);
			NoRevisionRadioBtn.click();

			CommonUtils.waitForVisibility(
					WebDriverUtils.getWebDriver().findElement(By.xpath("//textarea[@id='reviewText1']")));
			WebDriverUtils.getWebDriver().findElement(By.xpath("//textarea[@id='reviewText1']"))
					.sendKeys("No revision");

			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
			saveAndContinueBtn.click();
		}

	}

	public void careerGoalNoRevision() throws InterruptedException {
		System.out.println("careerGoalNoRevision");
		CommonUtils.waitForVisibility(commentsAndFeedBackBtn);
		if (NoRevisionRadioBtn.isSelected()) {
			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
			saveAndContinueBtn.click();
		} else {
			System.out.println("null loop");
			Thread.sleep(6000);
			CommonUtils.waitForVisibility(NoRevisionRadioBtn);
			NoRevisionRadioBtn.click();

			CommonUtils.waitForVisibility(
					WebDriverUtils.getWebDriver().findElement(By.xpath("//textarea[@id='reviewText1']")));
			WebDriverUtils.getWebDriver().findElement(By.xpath("//textarea[@id='reviewText1']"))
					.sendKeys("No revision");

			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
			saveAndContinueBtn.click();
		}
	}

	public void aliginingExpectations() throws InterruptedException {
		System.out.println("aliginingExpectations");
		CommonUtils.waitForVisibility(commentsAndFeedBackBtn);
		if (NoRevisionRadioBtn.isSelected()) {
			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

			saveAndContinueBtn.click();
		} else {
			System.out.println("null loop");
			Thread.sleep(6000);
			CommonUtils.waitForVisibility(NoRevisionRadioBtn);
			NoRevisionRadioBtn.click();

			CommonUtils.waitForVisibility(
					WebDriverUtils.getWebDriver().findElement(By.xpath("//textarea[@id='reviewText1']")));
			WebDriverUtils.getWebDriver().findElement(By.xpath("//textarea[@id='reviewText1']"))
					.sendKeys("No revision");

			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
			saveAndContinueBtn.click();
		}
	}

	public void fillMentorExpectation() {
		CommonUtils.waitForVisibility(selectAllMentorChkBox);
		selectAllMentorChkBox.click();

		CommonUtils.waitForVisibility(selectAllTraineeChkBox);
		selectAllTraineeChkBox.click();

		CommonUtils.waitForVisibility(workSceduleChkbox);
		workSceduleChkbox.click();
		CommonUtils.waitForVisibility(coreHoursText);
		coreHoursText.sendKeys("coreHoursText");
		CommonUtils.waitForVisibility(policiesText);
		policiesText.sendKeys("policiesText");

		CommonUtils.waitForVisibility(coreMettingChkBox);
		coreMettingChkBox.click();
		CommonUtils.waitForVisibility(dailyRadioBtn);
		dailyRadioBtn.click();
		CommonUtils.waitForVisibility(meetingTimeText);
		policiesText.sendKeys("meetingTimeText");

		CommonUtils.waitForVisibility(communicationPreferencesChkbox);
		communicationPreferencesChkbox.click();
		CommonUtils.waitForVisibility(communicationPreferenceText);
		communicationPreferenceText.sendKeys("communicationPreferenceText");

		CommonUtils.waitForVisibility(feedbackChkBox);
		feedbackChkBox.click();
		CommonUtils.waitForVisibility(workProductsText);
		workProductsText.sendKeys("workProductsText");
		CommonUtils.waitForVisibility(careerPlanningText);
		careerPlanningText.sendKeys("careerPlanningText");

		CommonUtils.waitForVisibility(coreProfessionalAttendancechkBox);
		coreProfessionalAttendancechkBox.click();
		CommonUtils.waitForVisibility(groupMeetingsText);
		groupMeetingsText.sendKeys("groupMeetingsText");
		CommonUtils.waitForVisibility(professionalMeetingsText);
		professionalMeetingsText.sendKeys("professionalMeetingsText");
		CommonUtils.waitForVisibility(careerDevelopmentText);
		careerDevelopmentText.sendKeys("careerDevelopmentText");

		CommonUtils.waitForVisibility(coreConductResearchchkBox);
		coreConductResearchchkBox.click();
		CommonUtils.waitForVisibility(workRecordStorageText);
		workRecordStorageText.sendKeys("workRecordStorageText");

		CommonUtils.waitForVisibility(coreRenewalchkBox);
		coreRenewalchkBox.click();
		CommonUtils.waitForVisibility(renewalDecisionText);
		renewalDecisionText.sendKeys("renewalDecisionText");

		CommonUtils.waitForVisibility(saveBtn);
		saveBtn.click();
	}

	public void validateAllTabsWithRequestRevision() {
		CommonUtils.click(this.generalInfromationTab);
		selectRevisionRequiredWithComment("Test");
		CommonUtils.click(this.saveAndContinueBtn);

	}

	public void selectRevisionRequiredWithComment(String comment) {
		CommonUtils.click(this.requestRevisionRadioButton);
		CommonUtils.sendKeys(this.requestRevisionComment, comment);

	}

}
