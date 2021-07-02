package CustomBusinessApp.EIDP.Pages;

import java.awt.color.CMMException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.SharedData;
import cucumber.runtime.Utils;

public class IDPAwaitingResponsePage extends CommonUtils {

	@FindBy(css = "label[for='revisionRadioButtonNo']")
	private WebElement revisionRadioButtonNo;

	@FindBy(xpath = "//span[contains(text(),'IDP Awaiting Response')]")
	private WebElement idpWaitingresponseIcon;

	@FindBy(xpath = "//td[@class='sorting_1']/a")
	private WebElement traineeNames;

	@FindBy(xpath = "//div[@id='tdResponse']/div/legend/h4")
	private WebElement IDPHeader;

	@FindBy(xpath = "//*[@id='primaryMentorsawaitingResponseTable']/tbody/tr")
	private WebElement NoofRows;

	@FindBy(xpath = "//label[@for='traineeName']")
	private WebElement General;

	@FindBy(xpath = "//input[@id='revisionRadioButtonNo']")
	private WebElement NoRevisionRadioBtn;

	@FindBy(xpath = "//textarea[@name='feedbackText']")
	private WebElement commentsAndFeedback;

	@FindBy(xpath = "//input[@id='saveAndNextButton']")
	private WebElement saveAndContinueBtn;

	@FindBy(xpath = "//legend[contains(text(),'Comments/Feedback')]")
	private WebElement commentsAndFeedBackBtn;

	@FindBy(xpath = "//*[@id='primaryMentorsawaitingResponseTable']")
	private WebElement tableIDP;

	@FindBy(xpath = "//input[@id='selectAllMentor']")
	private WebElement selectAllMentorChkBox;

	@FindBy(xpath = "//input[@id='selectAllTrainee']")
	private WebElement selectAllTraineeChkBox;

	@FindBy(xpath = "//input[@id='saveAndPreviousBtn']")
	private WebElement saveBtn;

	@FindBy(xpath = "//input[@id='saveAndPreviousBtn']/../a")
	private WebElement reviewAndActionBtn;

	@FindBy(xpath = "//input[@id='coreWorkSchedule']")
	private WebElement workSceduleChkbox;

	@FindBy(xpath = "//textarea[@name='coreHoursText']")
	private WebElement coreHoursText;

	@FindBy(xpath = "//textarea[@name='vacationPoliciesText']")
	private WebElement policiesText;

	@FindBy(xpath = "//input[@id='coreMeetingFrequency']")
	private WebElement coreMettingChkBox;

	@FindBy(xpath = "//input[@id='meetingFrequencyId1']")
	private WebElement dailyRadioBtn;

	@FindBy(xpath = "//textarea[@name='meetingTimeText']")
	private WebElement meetingTimeText;

	@FindBy(xpath = "//input[@id='coreMeetingAttendance']")
	private WebElement communicationPreferencesChkbox;

	@FindBy(xpath = "//textarea[@name='communicationPreferencesText']")
	private WebElement communicationPreferenceText;

	@FindBy(xpath = "//input[@id='coreFeedback']")
	private WebElement feedbackChkBox;

	@FindBy(xpath = "//textarea[@name='workProductsText']")
	private WebElement workProductsText;

	@FindBy(xpath = "//textarea[@name='careerPlanningText']")
	private WebElement careerPlanningText;

	@FindBy(xpath = "//input[@id='coreProfessionalAttendance']")
	private WebElement coreProfessionalAttendancechkBox;

	@FindBy(xpath = "//textarea[@name='groupMeetingsText']")
	private WebElement groupMeetingsText;

	@FindBy(xpath = "//textarea[@name='professionalMeetingsText']")
	private WebElement professionalMeetingsText;

	@FindBy(xpath = "//textarea[@name='careerDevelopmentText']")
	private WebElement careerDevelopmentText;

	@FindBy(xpath = "//input[@id='coreConductResearch']")
	private WebElement coreConductResearchchkBox;

	@FindBy(xpath = "//textarea[@name='workRecordStorageText']")
	private WebElement workRecordStorageText;

	@FindBy(xpath = "//input[@id='coreRenewal']")
	private WebElement coreRenewalchkBox;

	@FindBy(xpath = "//textarea[@name='renewalDecisionText']")
	private WebElement renewalDecisionText;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement declineBtnOk;

	@FindBy(css = "a[href='/idp/review-general']")
	private WebElement generalInfromationTab;

	@FindBy(css = "a[href='/idp/review-projects']")
	private WebElement projectAndRelatedDelivierablesOrTrainningTab;

	@FindBy(css = "a[href='/idp/review-career76T']")
	private WebElement carieerGoalsAndActivitiesTab;

	@FindBy(css = "a[href='/idp/review-alignExpectations']")
	private WebElement aligningExpectationsTab;

	@FindBy(css = "a[href='/idp/mentor-expectations']")
	private WebElement mentorExpectationsTab;

	@FindBy(css = "label[for='revisionRadioButtonYes']")
	private WebElement requestRevisionRadioButton;

	@FindBy(css = "label[for='revisionRadioButtonNo']")
	private WebElement noRevisionRadioButton;

	@FindBy(id = "reviewText1")
	private WebElement requestRevisionComment;

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
			CucumberLogUtils.logScreenShot("General Info No Revision");
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
			CucumberLogUtils.logScreenShot("General Info No Revision");
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
		// String
		// str=WebDriverUtils.getWebDriver().findElement(By.xpath("//input[@id='revisionRadioButtonNo']")).getAttribute("checked");
		// System.out.println("checked value"+str);
		if (NoRevisionRadioBtn.isSelected()) {
			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.logScreenShot("Project Info No Revision");
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
			CucumberLogUtils.logScreenShot("Project Info No Revision");
			saveAndContinueBtn.click();
		}

	}

	public void careerGoalNoRevision() throws InterruptedException {
		System.out.println("careerGoalNoRevision");
		CommonUtils.waitForVisibility(commentsAndFeedBackBtn);
		// String
		// str=WebDriverUtils.getWebDriver().findElement(By.xpath("//input[@id='revisionRadioButtonNo']")).getAttribute("checked");
		// System.out.println("checked value"+str);
		if (NoRevisionRadioBtn.isSelected()) {
			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.logScreenShot("Career Goal No Revision");
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
			CucumberLogUtils.logScreenShot("Career Goal No Revision");
			saveAndContinueBtn.click();
		}
	}

	public void aliginingExpectations() throws InterruptedException {
		System.out.println("aliginingExpectations");
		CommonUtils.waitForVisibility(commentsAndFeedBackBtn);
		// String
		// str=WebDriverUtils.getWebDriver().findElement(By.xpath("//input[@id='revisionRadioButtonNo']")).getAttribute("checked");
		// System.out.println("checked value"+str);
		if (NoRevisionRadioBtn.isSelected()) {
			CommonUtils.waitForVisibility(saveAndContinueBtn);
			CucumberLogUtils.logScreenShot("Allign Expectaions");

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
			CucumberLogUtils.logScreenShot("Allign Expectaions");
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
