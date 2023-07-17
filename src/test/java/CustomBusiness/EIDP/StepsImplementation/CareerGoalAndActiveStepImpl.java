
package CustomBusiness.EIDP.StepsImplementation;

import java.util.List;

import CustomBusiness.EIDP.Steps.HooksSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;

public class CareerGoalAndActiveStepImpl extends PageInitializer {
	
	public void fillCarrerGoalActivite() throws Exception {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.saveAndContinueButton);
		selectCareerGoal();
		Thread.sleep(1000);
		fillSkill();
		Thread.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		CommonUtils.click(careerGoalAndActivePage.saveAndContinueButton);
	}

	public void fillCarrerGoalActiviteNHGRI() throws Exception {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.saveAndContinueButton);
		selectCareerGoal();
		Thread.sleep(4000);
		fillSkillNGHRI();
		Thread.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		CommonUtils.click(careerGoalAndActivePage.saveAndContinueButton);
	}

	public void fillCarrerGoalActiviteForRenewIdp() throws Exception {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.saveAndContinueButton);
		selectCareerGoal();
		Thread.sleep(4000);
		fillSkill();
		Thread.sleep(2000);
		completeSKills();
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		CommonUtils.click(careerGoalAndActivePage.saveAndContinueButton);
	}
	
	public void fillCarrerGoalActiviteForNIDCRRenewIdp() throws Exception {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.saveAndContinueButton);
		selectCareerGoalNIDCR();
		Thread.sleep(4000);
		fillSkill();
		Thread.sleep(2000);
		completeSKills();
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		CommonUtils.click(careerGoalAndActivePage.saveAndContinueButton);
	}

	public void clickOnSaveAndContinueButton() {
		CommonUtils.click(careerGoalAndActivePage.saveAndContinueButton);
	}

	public void selectCareerGoal() throws Exception {
		List<WebElement> goals = careerGoalAndActivePage.goals;
		// Added check so that element is clicked only when the menu is collapsed
		if (goals.get(0).getAttribute("class").contains("collapsed")) {
			goals.get(0).click();
		} else if (goals.get(0).getAttribute("aria-expanded") == null
				|| goals.get(0).getAttribute("aria-expanded").equals("false")) {
			goals.get(0).click();
		}
		Thread.sleep(3000);
		List<WebElement> goalOptions = careerGoalAndActivePage.goalOptions;
		if (goalOptions.size() == 0) {
			WebDriverUtils.getWebDriver().findElement(By.cssSelector("[data-target='#academic24']")).click();
			Thread.sleep(3000);
			goalOptions = WebDriverUtils.getWebDriver()
					.findElements(By.cssSelector(".controls.line.ta_interestGroup.collapse.in label"));
		}
		goalOptions.get(2).click();
		goalOptions.get(3).click();
		goalOptions.get(4).click();
		goalOptions.get(5).click();
		CommonUtils.click(goals.get(0));
	}
	
	public void selectCareerGoalNIDCR() throws Exception {
		List<WebElement> goals = WebDriverUtils.getWebDriver()
				.findElements(By.cssSelector("[data-target^='#academic']"));
		// Added check so that element is clicked only when the menu is collapsed
		if (goals.get(0).getAttribute("class").contains("collapsed")) {
			goals.get(0).click();
		} else if (goals.get(0).getAttribute("aria-expanded") == null
				|| goals.get(0).getAttribute("aria-expanded").equals("false")) {
			goals.get(0).click();
		}
		Thread.sleep(3000);
		List<WebElement> goalOptions = WebDriverUtils.getWebDriver()
				.findElements(By.cssSelector(".controls.line.ta_interestGroup.collapse.in label"));
		if (goalOptions.size() == 0) {
			WebDriverUtils.getWebDriver().findElement(By.cssSelector("[data-target='#academic24']")).click();
			Thread.sleep(3000);
			goalOptions = WebDriverUtils.getWebDriver()
					.findElements(By.cssSelector(".controls.line.ta_interestGroup.collapse.in label"));
		}
		try{goalOptions.get(2).click();}catch(Exception e) {
			CommonUtils.click(goals.get(0));
		}
		goalOptions.get(3).click();
		goalOptions.get(4).click();
		CommonUtils.click(goals.get(0));
	}

	public void fillSkillNGHRI() throws Exception {
		CommonUtils.click(careerGoalAndActivePage.communicationSkillButton);
		CommonUtils.waitForVisibility(careerGoalAndActivePage.typeDropdown);
		eidpBasePage.selectOption(careerGoalAndActivePage.typeDropdown, "Writing");
		CommonUtils.sendKeys(careerGoalAndActivePage.description,
				"Automation script writing skill set enter for testing");
		CommonUtils.click(careerGoalAndActivePage.doneButton);
	}

	public void fillSkill() throws Exception {
		CommonUtils.click(careerGoalAndActivePage.communicationSkillButton);
		CommonUtils.waitForVisibility(careerGoalAndActivePage.typeDropdown);
		eidpBasePage.selectOption(careerGoalAndActivePage.typeDropdown, "Writing");
		CommonUtils.sendKeys(careerGoalAndActivePage.description,
				"Automation script writing skill set enter for testing");
		CommonUtils.click(careerGoalAndActivePage.doneButton);
	}

	public void completeSKills() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> skillStatus = WebDriverUtils.getWebDriver()
				.findElements(By.xpath("//table[@id='com_speaking']/tbody/tr/td[5]"));
		for (int i = 0; i < skillStatus.size(); i++) {
			if (skillStatus.get(i).getText().equals("")) {
				List<WebElement> editButtons = WebDriverUtils.getWebDriver()
						.findElements(By.xpath("//table[@id='com_speaking']//button[@title='Edit']"));
				CommonUtils.click(editButtons.get(i));
				CommonUtils.click(careerGoalAndActivePage.careerExplorationStatus);
				CommonUtils.click(careerGoalAndActivePage.doneButton);
			}
		}
	}

	public void editCareerTrainingActivites() {
		CommonUtil.waitBrowser(2000);
		List<WebElement> editIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector("[title='Edit']"));
		for (int i = 0; i < editIcons.size(); i++) {
			CommonUtils.click(editIcons.get(i));
			CommonUtil.waitBrowser(3000);
			List<WebElement> careerStatus = WebDriverUtils.getWebDriver().findElements(By.xpath(
					"//*[text()=' Please indicate the status of this career exploration:']//ancestor::div[@role='group']"));

			CommonUtils.click(careerStatus.get(careerStatus.size() - 1).findElement(By.tagName("label")));
			CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("addMore")));
			CommonUtil.waitBrowser(2000);
		}
		CommonUtils.click(careerGoalAndActivePage.saveAndContinueButton);
		CommonUtil.waitBrowser(5000);
	}

	public void markAllExistingCareerGoalsAsCompleted() {
		List<WebElement> editIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector("[title='Edit']"));
		for (int i = 0; i < editIcons.size(); i++) {
			CommonUtil.waitBrowser(4000);
			editIcons = WebDriverUtils.getWebDriver().findElements(By.cssSelector("[title='Edit']"));
			editIcons.get(i).click();
			CommonUtils.click(
					WebDriverUtils.getWebDriver().findElements(By.cssSelector(".modal-lg.in label.radio")).get(2));
			MiscUtils.sleep(3000);
			try{editIcons.get(0).click();}catch(Exception e) {
				
			}
			CommonUtils.click(
					WebDriverUtils.getWebDriver().findElements(By.cssSelector(".modal-lg.in label.radio")).get(2));
			CommonUtils.click(WebDriverUtils.getWebDriver().findElement(
					By.xpath("//*[contains(@class, 'modal-lg')][contains(@class, 'in')]//*[text()='Done']")));

		}
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.id("careerGoalsSubmitSave")));
		CommonUtil.waitBrowser(4000);
	}

	public void addNewCareerGoal() {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.communicationSkillButton);
		careerGoalAndActivePage.communicationSkillButton.click();
		eidpBasePage.selectOption(careerGoalAndActivePage.typeDropdown, "Speaking");
		careerGoalAndActivePage.description.sendKeys("This is the test of communcation skills part of IDP");
		careerGoalAndActivePage.doneButton.click();
	}
}