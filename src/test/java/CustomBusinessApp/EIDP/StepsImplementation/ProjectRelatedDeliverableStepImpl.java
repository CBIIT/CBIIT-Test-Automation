package CustomBusinessApp.EIDP.StepsImplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;

public class ProjectRelatedDeliverableStepImpl extends PageInitializer{
	
	public void fillProjectDeliverableData() throws Exception{
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.projectTitle);
		Thread.sleep(4000);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.projectTitle, "Test Project for IDP application");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.description, "National cancel institute electronic individual development plan related project for trainee through automation");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.responsibilities, "Test reponsibilities :: analysis and understand and report");
		enterPublication();
		CommonUtils.click(projectRelatedDeliverablePage.saveAndContinueButton);
		Thread.sleep(4000);
		enterClassesCoursesWorkshop();
		CucumberLogUtils.logScreenShot("Project Deliverable");
		CommonUtils.click(projectRelatedDeliverablePage.saveAndContinueButton);
	}
	
	public void enterPublication() {
		CommonUtils.click(projectRelatedDeliverablePage.publicationButton);
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.selectTypeDropdown);
		eidpBasePage.selectOption(projectRelatedDeliverablePage.selectTypeDropdown, "Manuscript");
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.targetMonthStartDropdown);
		eidpBasePage.selectOption(projectRelatedDeliverablePage.targetMonthStartDropdown, "February");
		eidpBasePage.selectOption(projectRelatedDeliverablePage.targetYearDropdown, "2022");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.publicationtitle, "Publication title for automation");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.publicationDescription, "Publication description");
		CucumberLogUtils.logScreenShot("Publication Detils");
		CommonUtils.click(projectRelatedDeliverablePage.addDeliverablesButton);
		
	}
	
	public void enterClassesCoursesWorkshop() {
		eidpBasePage.waitForElementToLoad(By.id("workshopSubmission"));
		CommonUtil.waitBrowser(2000);
		MiscUtils.sleep(2000);
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.classesCoursesWorkshopButton);
		CommonUtils.click(projectRelatedDeliverablePage.classesCoursesWorkshopButton);
		MiscUtils.sleep(2000);
		CommonUtils.click(projectRelatedDeliverablePage.travelNoRadioButton);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classesStartDate, "09/20/2020");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classesToDate, "10/20/2020");
		CommonUtils.click(projectRelatedDeliverablePage.classRoomLocation);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classRoomLocation, "New york");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classroomtitle, "Sample class");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classDescrption, "Entering description through automation script for testing");
		CommonUtils.click(projectRelatedDeliverablePage.existingProjectNoRadioButton);
		CommonUtils.click(projectRelatedDeliverablePage.addworkshopsButton);
	}
	
	public void addWorkShipDetailsWithStatus( ) {
		eidpBasePage.waitForElementToLoad(By.id("workshopSubmission"));
		CommonUtil.waitBrowser(2000);
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.classesCoursesWorkshopButton);
		CommonUtils.click(projectRelatedDeliverablePage.classesCoursesWorkshopButton);
		CommonUtil.waitBrowser(2000);
		//status radio button selection -> In Progress
		WebDriverUtils.getWebDriver().findElements(By.cssSelector("#trackClassActStatus > .controls > label")).get(1).click();
		CommonUtils.click(projectRelatedDeliverablePage.travelNoRadioButton);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classesStartDate, "02/20/2021"+Keys.TAB);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classesToDate, "10/20/2021"+Keys.TAB);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classRoomLocation, "Virtual");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classroomtitle, "Sample class");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.classDescrption, "Entering description through automation script for testing");
		CommonUtils.click(projectRelatedDeliverablePage.existingProjectNoRadioButton);
		CommonUtils.click(projectRelatedDeliverablePage.addworkshopsButton);
	}
	
	
	public void addNewProject() {
		CommonUtil.waitBrowser(7000);
		//CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("projectsTab")));
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.addNewProjectButton);
		CommonUtils.click(projectRelatedDeliverablePage.addNewProjectButton);
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.projectTitle);
		CommonUtils.sendKeys(projectRelatedDeliverablePage.projectTitle, "Test Project for IDP application");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.description, "National cancel institute electronic individual development plan related project for trainee through automation");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.responsibilities, "Test reponsibilities :: analysis and understand and report");
		CommonUtils.click(projectRelatedDeliverablePage.publicationButton);
		CommonUtils.waitForClickability(projectRelatedDeliverablePage.publicationSubTypeSelect);
		eidpBasePage.selectOption(projectRelatedDeliverablePage.publicationSubTypeSelect, "Manuscript");
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.xpath("//label[contains(text(), 'In Preparation')]")));
		CommonUtils.sendKeys(projectRelatedDeliverablePage.publicationtitle, "Publication title for automation");
		CommonUtils.sendKeys(projectRelatedDeliverablePage.publicationDescription, "Publication description");
		eidpBasePage.selectOption(projectRelatedDeliverablePage.targetDateMonth, "December");
		eidpBasePage.selectOption(projectRelatedDeliverablePage.targetDateYear, "2021");
		CommonUtils.click(projectRelatedDeliverablePage.addDeliverablesButton);
	}
	
	public void markAllExistingProjectsAsCompleted() {
		List<WebElement> projectEditButtons = WebDriverUtils.getWebDriver().findElements(By.cssSelector("#tab_0 [aria-label='edit']"));
		for(int i=0; i<projectEditButtons.size(); i++) {
			CommonUtil.waitBrowser(5000);
			projectEditButtons = WebDriverUtils.getWebDriver().findElements(By.cssSelector("#tab_0 [aria-label='edit']"));
			CommonUtils.click(projectEditButtons.get(i)); //click on project edit icon
			MiscUtils.sleep(3000);
			CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("projStatus_297"))); //click on complete radio button
			markAllDeliverablesOfTheProjectCompleted();
			MiscUtils.sleep(3000);
			CommonUtils.waitForVisibility(projectRelatedDeliverablePage.projectsAndTrainingSave);
			CommonUtils.click(projectRelatedDeliverablePage.projectsAndTrainingSave);
		}
		
	}
	
	public void markAllDeliverablesOfTheProjectCompletedNew() {
		markManualScriptSectionStatus();
	}
	
	public void markManualScriptSectionStatus() {
		CommonUtil.waitBrowser(3000);
		List<WebElement> rows = WebDriverUtils.getWebDriver().findElements(By.cssSelector("[id*='manuscriptRowId']"));
		for(int i= 0 ; i < rows.size(); i++) {
			CommonUtil.waitBrowser(4000);
			//rows = WebDriverUtils.getWebDriver().findElements(By.cssSelector("[id*='manuscriptRowId']"));
			String text = rows.get(i).findElements(By.tagName("td")).get(1).getText();
			System.out.println("text = " + text);;
		}
	}
	
	public void markAllDeliverablesOfTheProjectCompleted() {
		CommonUtil.waitBrowser(5000);
		List<WebElement> editDeliverableIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector(".editDeliverables"));
		for(int i=0; i<editDeliverableIcons.size(); i++) {
			CommonUtil.waitBrowser(5000);
			editDeliverableIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector(".editDeliverables"));
			CommonUtils.click(editDeliverableIcons.get(i));
			CommonUtil.waitBrowser(2000);
			String currentDeliverableTitle = WebDriverUtils.getWebDriver().findElement(By.cssSelector("#myProjectModal #myModalLabel")).getText();
			if("Publication".equalsIgnoreCase(currentDeliverableTitle)) {
				markPublicationSubTypeAsCompleted();
			} else if("Presentation".equalsIgnoreCase(currentDeliverableTitle)){
				WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='trackPresentationDelStatus']//*[contains(text(), 'Completed')]")).click();
				
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker3")).sendKeys("05/01/2021");
				if(CommonUtils.isElementDisplayed(WebDriverUtils.getWebDriver().findElement(By.id("datepicker4")))) {
					WebDriverUtils.getWebDriver().findElement(By.id("datepicker4")).sendKeys("05/10/2021");
				}
				WebDriverUtils.getWebDriver().findElement(By.id("presentationFields3Location")).sendKeys("Virtual");
				projectRelatedDeliverablePage.addDeliverablesButton.click();
			} else if("Other Type of Deliverable".equalsIgnoreCase(currentDeliverableTitle)) {
				WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='trackOtherDelStatus']//*[contains(text(), 'Completed')]")).click();
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker3")).sendKeys("05/01/2021");
				if(CommonUtils.isElementDisplayed(WebDriverUtils.getWebDriver().findElement(By.id("datepicker4")))) {
					WebDriverUtils.getWebDriver().findElement(By.id("datepicker4")).sendKeys("05/10/2021");
				}
				WebDriverUtils.getWebDriver().findElement(By.id("presentationFields3Location")).sendKeys("Virtual");
				projectRelatedDeliverablePage.addDeliverablesButton.click();
			}
		}
	}
	
	
	public void markPublicationSubTypeAsCompleted() {
		String publicationSubType = WebDriverUtils.getWebDriver().findElement(By.cssSelector(".publicSubTypeText")).getText();
		if("Manuscript".equalsIgnoreCase(publicationSubType)) {
			WebDriverUtils.getWebDriver().findElement(By.xpath("//label[contains(text(), 'Submitted')]")).click();
			WebDriverUtils.getWebDriver().findElement(By.id("datepicker3")).sendKeys("05/01/2021");
			if(CommonUtils.isElementDisplayed(WebDriverUtils.getWebDriver().findElement(By.id("datepicker4")))) {
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker4")).sendKeys("05/10/2021");
			}
			projectRelatedDeliverablePage.addDeliverablesButton.click();
		} else {
			WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='trackWhitePaperRepStatus']//*[contains(text(), 'Completed')]")).click();
			WebDriverUtils.getWebDriver().findElement(By.id("datepicker3")).sendKeys("05/01/2021");
			if(CommonUtils.isElementDisplayed(WebDriverUtils.getWebDriver().findElement(By.id("datepicker4")))) {
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker4")).sendKeys("05/10/2021");
			}
			projectRelatedDeliverablePage.addDeliverablesButton.click();
		}
		
//		else if("White Paper".equalsIgnoreCase(publicationSubType)) {
//			WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='trackWhitePaperRepStatus']//*[contains(text(), 'Completed')]")).click();
//			WebDriverUtils.getWebDriver().findElement(By.id("datepicker3")).sendKeys("01/15/2021");
//			addDeliverablesButton.click();
//		} else if("Report".equalsIgnoreCase(publicationSubType)) {
//			WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='trackWhitePaperRepStatus']//*[contains(text(), 'Completed')]")).click();
//			WebDriverUtils.getWebDriver().findElement(By.id("datepicker3")).sendKeys("01/15/2021");
//			addDeliverablesButton.click();
//		} else if("Other-publication other".equalsIgnoreCase(publicationSubType)) {
//			WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='trackWhitePaperRepStatus']//*[contains(text(), 'Completed')]")).click();
//			WebDriverUtils.getWebDriver().findElement(By.id("datepicker3")).sendKeys("01/15/2021");
//			addDeliverablesButton.click();
//		}
		
				
	}
	
	public void markAllProjectRelatedTrainningsAreCompleted() {
		//CommonUtil.waitBrowser(10000);
		//CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("trainingActivitiesTab")));
		CommonUtils.waitForVisibility(projectRelatedDeliverablePage.classesCoursesWorkshopButton);
		List<WebElement> trainningActivitiesEditIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector(".delivChoice .fa.fa-pencil"));
		for(int i=0; i<trainningActivitiesEditIcons.size(); i++) {
			CommonUtil.waitBrowser(4000);
			trainningActivitiesEditIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector(".delivChoice .fa.fa-pencil"));
			CommonUtil.waitBrowser(2000);
			trainningActivitiesEditIcons.get(i).click();
			CommonUtil.waitBrowser(2000);
			String currentTrainningType = WebDriverUtils.getWebDriver().findElement(By.cssSelector(".modal-lg.in #myModalLabel")).getText();
			if("Interest/Working Group Participation".equalsIgnoreCase(currentTrainningType.trim())) {
				WebDriverUtils.getWebDriver().findElements(By.xpath("//*[@id='ta_interestGroup2']//div[@class='controls']//label[@class='radio']"))
					.get(3).click();
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker34")).clear();
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker33")).clear();
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker34")).sendKeys("01/15/2021");
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker33")).sendKeys("01/15/2021");
				WebDriverUtils.getWebDriver().findElement(By.id("interestGroupLocation")).clear();
				WebDriverUtils.getWebDriver().findElement(By.id("interestGroupLocation")).sendKeys("Virtual");
				WebDriverUtils.getWebDriver().findElement(By.id("addGroupParticipation")).click();
				
			} else if("Classes/Courses/Workshops".equalsIgnoreCase(currentTrainningType.trim())){
				WebDriverUtils.getWebDriver().findElements(By.xpath("//*[@id='ta_classCourses2']//*[@aria-labelledby='trackClassActStatusLegend']//label"))
				.get(2).click();
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker9")).clear();
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker10")).clear();
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker9")).sendKeys("01/01/2021");
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker10")).sendKeys("01/01/2021");
				WebDriverUtils.getWebDriver().findElement(By.id("classroomLocation")).clear();
				WebDriverUtils.getWebDriver().findElement(By.id("classroomLocation")).sendKeys("Virtual");
				WebDriverUtils.getWebDriver().findElement(By.id("addworkshops")).click();
			} else {
				WebDriverUtils.getWebDriver().findElements(By.xpath("//*[@id='ta_presentations']//*[@aria-labelledby='trackOtherActStatusLegend']//label"))
				.get(2).click();
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker12")).clear();
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker13")).clear();
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker12")).sendKeys("01/01/2021");
				WebDriverUtils.getWebDriver().findElement(By.id("datepicker13")).sendKeys("01/15/2021");
				WebDriverUtils.getWebDriver().findElement(By.id("othersLocation")).clear();
				WebDriverUtils.getWebDriver().findElement(By.id("othersLocation")).sendKeys("Virtual");
				WebDriverUtils.getWebDriver().findElement(By.id("addOthersTrainingActivities")).click();
			}
		}
		CommonUtil.waitBrowser(6000);
		WebDriverUtils.getWebDriver().findElement(By.id("projectsAndTrainingSave")).click();
		
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
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id(idValue)));
	}
	
	@FindBy(css= ".editProject")
	private WebElement editProjectIcon;
	
	public void editProject() throws Exception {
		eidpBasePage.waitForElementToLoad(By.cssSelector(".editProject"));
		CommonUtil.waitBrowser(2000);
		CommonUtils.click(editProjectIcon);
		
	}
	
	
	
	public void editAllDeliverables() throws Exception {
		CommonUtil.waitBrowser(2000);
		List<WebElement> editIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector(".editDeliverables"));
		for(int i=0; i<editIcons.size(); i++) {
			CommonUtils.click(editIcons.get(i));
			eidpBasePage.waitForElementToLoad(By.cssSelector("#myProjectModal .modal-title"));
			CommonUtil.waitBrowser(2000);
			String modalName = WebDriverUtils.getWebDriver().findElement(By.cssSelector("#myProjectModal .modal-title")).getText();
			editDeliverable(modalName);
		}
		CommonUtils.click(projectRelatedDeliverablePage.saveAndContinueButton);
		CommonUtil.waitBrowser(8000);
		eidpBasePage.waitForElementToLoad(By.id("workshopSubmission"));
		List<WebElement> editLIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector("#tab3-2 [aria-label='edit']"));
		for(int i=0; i<editLIcons.size(); i++) {
			
			CommonUtil.waitBrowser(2000);
			int attempts = 0;
		    while(attempts < 4) {
		        try {
		        	editLIcons.get(i).click();
		            break;
		        } catch(StaleElementReferenceException e) {
		        }
		        attempts++;
		    }
		    CommonUtil.waitBrowser(4000);
			String modalName = WebDriverUtils.getWebDriver().findElement(By.cssSelector(".modal.fade.modal-lg.in .modal-title")).getText();
			editProjectRelatedTrainning(modalName);
		}
		CommonUtils.click(projectRelatedDeliverablePage.saveAndContinueButton);
		CommonUtil.waitBrowser(2000);
	}
	
	public void editDeliverable(String name) {
		switch (name) {
		case "Other Type of Deliverable":
			CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.xpath("//*[@id='myProjectModal']//*[contains(text(), 'In Progress')]")));
			CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("addDeliverablesButton")));
			break;
		
		case "Publication":
			CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.xpath("//label[contains(text(), 'In Press')]")));
			CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("addDeliverablesButton")));
			break;

		default:
			break;
		}
	}
	
	public void editProjectRelatedTrainning(String name) {
		if(name != null) {
			name = name.trim();
			switch (name) {
			case "Interest/Working Group Participation":
				CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.cssSelector("#trackIntrstGrpActStatus .controls label")));
				CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("addGroupParticipation")));
				break;
			case "Classes/Courses/Workshops":
				CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.cssSelector("#ta_classCourses2 [role='group'] .controls label")));
				CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("addworkshops")));
				break;
			default: 
				
				break;
			}
		}
	}

}
