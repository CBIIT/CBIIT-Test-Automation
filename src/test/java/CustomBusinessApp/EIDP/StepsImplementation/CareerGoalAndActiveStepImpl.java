package CustomBusinessApp.EIDP.StepsImplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
<<<<<<< HEAD
import com.nci.automation.utils.MiscUtils;
=======
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;

public class CareerGoalAndActiveStepImpl extends PageInitializer{
	public void fillCarrerGoalActivite() throws Exception{
		CommonUtils.waitForVisibility(careerGoalAndActivePage.saveAndContinueButton);
		selectCareerGoal();
		Thread.sleep(4000);
		fillSkill();
		Thread.sleep(2000);
		CucumberLogUtils.logScreenShot("Career Goal");
		CommonUtils.click(careerGoalAndActivePage.saveAndContinueButton);
		
	}
	
	public void clickOnSaveAndContinueButton() {
		CommonUtils.click(careerGoalAndActivePage.saveAndContinueButton);
	}
	
	public void selectCareerGoal() throws Exception{
		List<WebElement> goals = WebDriverUtils.getWebDriver().findElements(By.cssSelector("[data-target^='#academic']"));
		goals.get(0).click();
		Thread.sleep(3000);
		List<WebElement> goalOptions = WebDriverUtils.getWebDriver().findElements(By.cssSelector(".controls.line.ta_interestGroup.collapse.in label"));
		goalOptions.get(0).click();
		CommonUtils.click(goals.get(0));	
	}
	
	public void fillSkill() throws Exception {
		CommonUtils.click(careerGoalAndActivePage.communicationSkillButton);
		CommonUtils.waitForVisibility(careerGoalAndActivePage.typeDropdown);
		eidpBasePage.selectOption(careerGoalAndActivePage.typeDropdown, "Writing");
		CommonUtils.sendKeys(careerGoalAndActivePage.description, "Automation script writing skill set enter for testing");
		CommonUtils.click(careerGoalAndActivePage.doneButton);
	}
	
	public void editCareerTrainingActivites() {
//		waitForElementToLoad(By.id("maincontent"));
		CommonUtil.waitBrowser(2000);
		List<WebElement> editIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector("[title='Edit']"));
		for(int i=0; i<editIcons.size(); i++) {
//			waitForElementToLoad(By.cssSelector("[title='Edit']"));
			CommonUtils.click(editIcons.get(i));
			CommonUtil.waitBrowser(3000);
			List<WebElement> careerStatus = WebDriverUtils.getWebDriver().findElements(By.xpath("//*[text()=' Please indicate the status of this career exploration:']//ancestor::div[@role='group']"));
			
			CommonUtils.click(careerStatus.get(careerStatus.size() - 1).findElement(By.tagName("label")));
			CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("addMore")));
			CommonUtil.waitBrowser(2000);
			//String modalName = WebDriverUtils.getWebDriver().findElement(By.cssSelector(".modal.fade.modal-lg.in .modal-title")).getText();
			//editProjectRelatedTrainning(modalName);
		}
		CommonUtils.click(careerGoalAndActivePage.saveAndContinueButton);
		CommonUtil.waitBrowser(5000);
	}
	
	public void markAllExistingCareerGoalsAsCompleted() {
		List<WebElement> editIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector("[title='Edit']"));
		for(int i=0; i<editIcons.size(); i++) {
			CommonUtil.waitBrowser(4000);
			editIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector("[title='Edit']"));
<<<<<<< HEAD
			editIcons.get(i).click();
			CommonUtils.click(WebDriverUtils.getWebDriver().findElements(By.cssSelector(".modal-lg.in label.radio")).get(2));
			//WebDriverUtils.getWebDriver().findElements(By.cssSelector(".modal-lg.in label.radio")).get(2).click();
			//doneButton.click();
			MiscUtils.sleep(3000);
=======
			editIcons.get(0).click();
			CommonUtils.click(WebDriverUtils.getWebDriver().findElements(By.cssSelector(".modal-lg.in label.radio")).get(2));
			//WebDriverUtils.getWebDriver().findElements(By.cssSelector(".modal-lg.in label.radio")).get(2).click();
			//doneButton.click();
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
			CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.xpath("//*[contains(@class, 'modal-lg')][contains(@class, 'in')]//*[text()='Done']")));
			//WebDriverUtils.getWebDriver().findElement(By.xpath("//*[contains(@class, 'modal-lg')][contains(@class, 'in')]//*[text()='Done']")).click();
		}
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("careerGoalsSubmitSave")));
		//WebDriverUtils.getWebDriver().findElement(By.id("careerGoalsSubmitSave")).click();
		CommonUtil.waitBrowser(4000);
	}
	
	public void addNewCareerGoal() {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.communicationSkillButton);
		careerGoalAndActivePage.communicationSkillButton.click();
		CommonUtil.waitBrowser(2000);
		WebDriverUtils.getWebDriver().findElements(By.cssSelector(".modal-lg.in label.radio")).get(1).click();
		eidpBasePage.selectOption(careerGoalAndActivePage.typeDropdown, "Speaking");
		careerGoalAndActivePage.description.sendKeys("This is the test of communcation skills part of IDP");
		careerGoalAndActivePage.doneButton.click();
	}
}
