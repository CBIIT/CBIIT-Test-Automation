package CustomBusiness.EIDP.StepsImplementation;

import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class
ProjectRelatedDeliverableStepImpl extends PageInitializer {

	public void fillProjectDeliverableData() throws Exception {
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.projectTitle);
		Thread.sleep(4000);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.projectTitle, "Test Project for IDP application");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.description,
				"National cancel institute electronic individual development plan related project for trainee through automation");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.responsibilities,
				"Test reponsibilities :: analysis and understand and report");
		enterPublication();
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.saveAndContinueButton);
		enterClassesCoursesWorkshop();
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.saveAndContinueButton);
	}

	public void clickOnProjectRelatedTraining() {
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.trainingActivityButton);
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.saveAndContinueButton);
	}

	public void enterPublication() {
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.publicationButton);
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.selectTypeDropdown);
		eidpBasePage.selectOption(projectRelatedDeliverablePage.selectTypeDropdown, "Manuscript");
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.targetMonthStartDropdown);
		eidpBasePage.selectOption(projectRelatedDeliverablePage.targetMonthStartDropdown, "December");
		eidpBasePage.selectOption(projectRelatedDeliverablePage.targetYearDropdown, "2023");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.publicationtitle, "Publication title for automation");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.publicationDescription, "Publication description");
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.addDeliverablesButton);
	}

	public void enterClassesCoursesWorkshop() {
		eidpBasePage.waitForElementToLoad(By.id("workshopSubmission"));
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.classesCoursesWorkshopButton);
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.classesCoursesWorkshopButton);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.travelNoRadioButton);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classesStartDate, "05/20/2023");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classesToDate, "10/20/2023");
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.classRoomLocation);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classRoomLocation, "New york");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classroomtitle, "Sample class");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classDescrption,
				"Entering description through automation script for testing");
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.existingProjectNoRadioButton);
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.addworkshopsButton);
	}

	public void addWorkShipDetailsWithStatus() {
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.classesCoursesWorkshopButton);
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.classesCoursesWorkshopButton);
		MiscUtils.sleep(1000);
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.travelNoRadioButton);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classesStartDate, "02/20/2023" + Keys.TAB);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classesToDate, "10/20/2023" + Keys.TAB);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classRoomLocation, "Virtual");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classroomtitle, "Sample class");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classDescrption,
				"Entering description through automation script for testing");
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.existingProjectNoRadioButton);
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.addworkshopsButton);
	}

	public void addNewProject() {
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.addNewProjectButton);
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.addNewProjectButton);
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.projectTitle);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.projectTitle, "Test Project for IDP application");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.description,
				"National cancel institute electronic individual development plan related project for trainee through automation");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.responsibilities,
				"Test reponsibilities :: analysis and understand and report");
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.publicationButton);
		CommonUtils.waitForClickability(projectRelatedDeliverablePage.selectTypeDropdown);
		eidpBasePage.selectOption(projectRelatedDeliverablePage.selectTypeDropdown, "Manuscript");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.publicationtitle, "Publication title for automation");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.publicationDescription, "Publication description");
		eidpBasePage.selectOption(projectRelatedDeliverablePage.targetDateMonth, "December");
		eidpBasePage.selectOption(projectRelatedDeliverablePage.targetDateYear, "2024");
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.addDeliverablesButton);
	}

	public void markAllExistingProjectsAsCompleted() {
		for (int i = 0; i < projectRelatedDeliverablePage.projectEditButtons.size(); i++) {
			MiscUtils.sleep(5000);
			CommonUtils.clickOnElement(projectRelatedDeliverablePage.projectEditButtons.get(i));
			MiscUtils.sleep(3000);
			CommonUtils.clickOnElement(projectRelatedDeliverablePage.completeRadioButton);
			markAllDeliverablesOfTheProjectCompleted();
			MiscUtils.sleep(3000);
			CommonUtils.waitForVisibility(projectRelatedDeliverablePage.projectsAndTrainingSave);
			CommonUtils.clickOnElement(projectRelatedDeliverablePage.projectsAndTrainingSave);
		}
	}

	public void markAllDeliverablesOfTheProjectCompletedNew() {
		markManualScriptSectionStatus();
	}

	public void markManualScriptSectionStatus() {
		CommonUtil.waitBrowser(3000);
		List<WebElement> rows = WebDriverUtils.webDriver.findElements(By.cssSelector("[id*='manuscriptRowId']"));
		for (int i = 0; i < rows.size(); i++) {
			CommonUtil.waitBrowser(4000);
			String text = rows.get(i).findElements(By.tagName("td")).get(1).getText();
			System.out.println("text = " + text);
			;
		}
	}

	public void markAllDeliverablesOfTheProjectCompleted() {
		CommonUtil.waitBrowser(5000);
		List<WebElement> editDeliverableIcons = WebDriverUtils.webDriver
				.findElements(By.cssSelector(".editDeliverables"));
		for (int i = 0; i < editDeliverableIcons.size(); i++) {
			CommonUtil.waitBrowser(5000);
			editDeliverableIcons = WebDriverUtils.webDriver.findElements(By.cssSelector(".editDeliverables"));
			CommonUtils.clickOnElement(editDeliverableIcons.get(i));
			CommonUtil.waitBrowser(2000);
			String currentDeliverableTitle = WebDriverUtils.webDriver
					.findElement(By.cssSelector("#myProjectModal #myModalLabel")).getText();
			if ("Publication".equalsIgnoreCase(currentDeliverableTitle)) {
				markPublicationSubTypeAsCompleted();
			} else if ("Presentation".equalsIgnoreCase(currentDeliverableTitle)) {
				WebDriverUtils.webDriver
						.findElement(
								By.xpath("//*[@id='trackPresentationDelStatus']//*[contains(text(), 'Completed')]"))
						.click();

				WebDriverUtils.webDriver.findElement(By.id("datepicker3")).sendKeys("05/01/2021");
				if (CommonUtils.isElementDisplayed(WebDriverUtils.webDriver.findElement(By.id("datepicker4")))) {
					WebDriverUtils.webDriver.findElement(By.id("datepicker4")).sendKeys("05/10/2021");
				}
				WebDriverUtils.webDriver.findElement(By.id("datepicker3")).sendKeys("01/15/2021");
				WebDriverUtils.webDriver.findElement(By.id("presentationFields3Location")).sendKeys("Virtual");
				projectRelatedDeliverablePage.addDeliverablesButton.click();
			} else if ("Other Type of Deliverable".equalsIgnoreCase(currentDeliverableTitle)) {
				WebDriverUtils.webDriver
						.findElement(By.xpath("//*[@id='trackOtherDelStatus']//*[contains(text(), 'Completed')]"))
						.click();
				WebDriverUtils.webDriver.findElement(By.id("datepicker3")).sendKeys("05/01/2021");
				if (CommonUtils.isElementDisplayed(WebDriverUtils.webDriver.findElement(By.id("datepicker4")))) {
					WebDriverUtils.webDriver.findElement(By.id("datepicker4")).sendKeys("05/10/2021");
				}
				WebDriverUtils.webDriver.findElement(By.id("datepicker3")).sendKeys("01/15/2021");
				WebDriverUtils.webDriver.findElement(By.id("presentationFields3Location")).sendKeys("Virtual");
				projectRelatedDeliverablePage.addDeliverablesButton.click();
			}
		}
	}

	public void markPublicationSubTypeAsCompleted() {
		String publicationSubType = WebDriverUtils.webDriver.findElement(By.cssSelector(".publicSubTypeText"))
				.getText();
		if ("Manuscript".equalsIgnoreCase(publicationSubType)) {
			WebDriverUtils.webDriver.findElement(By.xpath("//label[contains(text(), 'Submitted')]")).click();
			WebDriverUtils.webDriver.findElement(By.id("datepicker3")).sendKeys("05/01/2021");
			if (CommonUtils.isElementDisplayed(WebDriverUtils.webDriver.findElement(By.id("datepicker4")))) {
				WebDriverUtils.webDriver.findElement(By.id("datepicker4")).sendKeys("05/10/2021");
			}
			projectRelatedDeliverablePage.addDeliverablesButton.click();
		} else {
			WebDriverUtils.webDriver
					.findElement(By.xpath("//*[@id='trackWhitePaperRepStatus']//*[contains(text(), 'Completed')]"))
					.click();
			WebDriverUtils.webDriver.findElement(By.id("datepicker3")).sendKeys("05/01/2021");
			if (CommonUtils.isElementDisplayed(WebDriverUtils.webDriver.findElement(By.id("datepicker4")))) {
				WebDriverUtils.webDriver.findElement(By.id("datepicker4")).sendKeys("05/10/2021");
			}
			WebDriverUtils.webDriver.findElement(By.id("datepicker3")).sendKeys("01/15/2021");
			projectRelatedDeliverablePage.addDeliverablesButton.click();
		}
	}

	public void markAllProjectRelatedTrainningsAreCompleted() {
		
		for (int i = 0; i < projectRelatedDeliverablePage.trainningActivitiesEditIcons.size(); i++) {
			projectRelatedDeliverablePage.trainningActivitiesEditIcons.get(i).click();
			MiscUtils.sleep(2000);
			String currentTrainningType = projectRelatedDeliverablePage.trainingTypeText.getText();
			if ("Interest/Working Group Participation".equalsIgnoreCase(currentTrainningType.trim())) {
				projectRelatedDeliverablePage.interestGroups.get(3).click();
				projectRelatedDeliverablePage.workDateFrom.clear();
				projectRelatedDeliverablePage.workDateTo.clear();
				projectRelatedDeliverablePage.workDateFrom.sendKeys("07/15/2023");
				projectRelatedDeliverablePage.workDateTo.sendKeys("12/15/2023");
				projectRelatedDeliverablePage.interestGroupLocation.clear();
				projectRelatedDeliverablePage.interestGroupLocation.sendKeys("Virtual");
				projectRelatedDeliverablePage.addGroupPerticipation.click();

			} else if ("Classes/Courses/Workshops".equalsIgnoreCase(currentTrainningType.trim())) {
				projectRelatedDeliverablePage.classCourseStatuses.get(2).click();
				projectRelatedDeliverablePage.classesStartDate.clear();
				projectRelatedDeliverablePage.classesToDate.clear();
				projectRelatedDeliverablePage.classesStartDate.sendKeys("07/15/2023");
				projectRelatedDeliverablePage.classesToDate.sendKeys("12/15/2023");
				projectRelatedDeliverablePage.classRoomLocation.clear();
				projectRelatedDeliverablePage.classRoomLocation.sendKeys("Virtual");
				projectRelatedDeliverablePage.addworkshopsButton.click();
			} else {
				projectRelatedDeliverablePage.otherActStatuses.get(2).click();
				projectRelatedDeliverablePage.otherStartDate.clear();
				projectRelatedDeliverablePage.otherToDate.clear();
				projectRelatedDeliverablePage.otherStartDate.sendKeys("07/15/2023");
				projectRelatedDeliverablePage.otherToDate.sendKeys("12/15/2023");
				projectRelatedDeliverablePage.othersLocation.clear();
				projectRelatedDeliverablePage.othersLocation.sendKeys("Virtual");
				projectRelatedDeliverablePage.addOthersTrainingActivities.click();
			}
		}
		MiscUtils.sleep(6000);
		projectRelatedDeliverablePage.projectsAndTrainingSave.click();
	}

	public void selectProjectStatus(String status) {
		String idValue = "";
		switch (status) {
		case "In Progress":
			idValue = "projStatus_296";
			break;

		default:
			break;
		}
		CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.id(idValue)));
	}

	@FindBy(css = ".editProject")
	private WebElement editProjectIcon;

	public void editProject() throws Exception {
		eidpBasePage.waitForElementToLoad(By.cssSelector(".editProject"));
		CommonUtil.waitBrowser(2000);
		CommonUtils.clickOnElement(editProjectIcon);
	}

	public void editAllDeliverables() throws Exception {
		CommonUtil.waitBrowser(2000);
		List<WebElement> editIcons = WebDriverUtils.webDriver.findElements(By.cssSelector(".editDeliverables"));
		for (int i = 0; i < editIcons.size(); i++) {
			CommonUtils.clickOnElement(editIcons.get(i));
			eidpBasePage.waitForElementToLoad(By.cssSelector("#myProjectModal .modal-title"));
			CommonUtil.waitBrowser(2000);
			String modalName = WebDriverUtils.webDriver.findElement(By.cssSelector("#myProjectModal .modal-title"))
					.getText();
			editDeliverable(modalName);
		}
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.saveAndContinueButton);
		CommonUtil.waitBrowser(8000);
		eidpBasePage.waitForElementToLoad(By.id("workshopSubmission"));
		List<WebElement> editLIcons = WebDriverUtils.webDriver
				.findElements(By.cssSelector("#tab3-2 [aria-label='edit']"));
		for (int i = 0; i < editLIcons.size(); i++) {

			CommonUtil.waitBrowser(2000);
			int attempts = 0;
			while (attempts < 4) {
				try {
					editLIcons.get(i).click();
					break;
				} catch (StaleElementReferenceException e) {
				}
				attempts++;
			}
			CommonUtil.waitBrowser(4000);
			String modalName = WebDriverUtils.webDriver
					.findElement(By.cssSelector(".modal.fade.modal-lg.in .modal-title")).getText();
			editProjectRelatedTrainning(modalName);
		}
		CommonUtils.clickOnElement(projectRelatedDeliverablePage.saveAndContinueButton);
		CommonUtil.waitBrowser(2000);
	}

	public void editDeliverable(String name) {
		switch (name) {
		case "Other Type of Deliverable":
			CommonUtils.clickOnElement(WebDriverUtils.webDriver
					.findElement(By.xpath("//*[@id='myProjectModal']//*[contains(text(), 'In Progress')]")));
			CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.id("addDeliverablesButton")));
			break;

		case "Publication":
			CommonUtils.clickOnElement(
					WebDriverUtils.webDriver.findElement(By.xpath("//label[contains(text(), 'In Press')]")));
			CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.id("addDeliverablesButton")));
			break;

		default:
			break;
		}
	}

	public void editProjectRelatedTrainning(String name) {
		if (name != null) {
			name = name.trim();
			switch (name) {
			case "Interest/Working Group Participation":
				CommonUtils.clickOnElement(WebDriverUtils.webDriver
						.findElement(By.cssSelector("#trackIntrstGrpActStatus .controls label")));
				CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.id("addGroupParticipation")));
				break;
			case "Classes/Courses/Workshops":
				CommonUtils.clickOnElement(WebDriverUtils.webDriver
						.findElement(By.cssSelector("#ta_classCourses2 [role='group'] .controls label")));
				CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.id("addworkshops")));
				break;
			default:

				break;
			}
		}
	}
}