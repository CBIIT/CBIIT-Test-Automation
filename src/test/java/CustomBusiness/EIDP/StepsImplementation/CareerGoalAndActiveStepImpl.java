package CustomBusiness.EIDP.StepsImplementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializers.PageInitializer;

public class CareerGoalAndActiveStepImpl extends PageInitializer {
	
	public void fillCarrerGoalActivite() throws Exception {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.saveAndContinueButton);
		selectCareerGoal();
		MiscUtils.sleep(1000);
		fillSkill();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(careerGoalAndActivePage.saveAndContinueButton);
	}

	public void fillCarrerGoalActiviteNHGRI() throws Exception {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.saveAndContinueButton);
		selectCareerGoal();
		Thread.sleep(4000);
		fillSkillNGHRI();
		Thread.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(careerGoalAndActivePage.saveAndContinueButton);
	}

	public void fillCarrerGoalActiviteForRenewIdp() throws Exception {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.saveAndContinueButton);
		selectCareerGoal();
		Thread.sleep(4000);
		fillSkill();
		Thread.sleep(2000);
		completeSKills();
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(careerGoalAndActivePage.saveAndContinueButton);
	}
	
	public void fillCarrerGoalActiviteForNIDCRRenewIdp() throws Exception {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.saveAndContinueButton);
		selectCareerGoalNIDCR();
		Thread.sleep(4000);
		fillSkill();
		Thread.sleep(2000);
		completeSKills();
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(careerGoalAndActivePage.saveAndContinueButton);
	}

	public void clickOnSaveAndContinueButton() {
		CommonUtils.clickOnElement(careerGoalAndActivePage.saveAndContinueButton);
	}

	public void selectCareerGoal() throws Exception {
		// Added check so that element is clicked only when the menu is collapsed
		if (careerGoalAndActivePage.goals.get(0).getAttribute("class").contains("collapsed")) {
			careerGoalAndActivePage.goals.get(0).click();
		} else if (careerGoalAndActivePage.goals.get(0).getAttribute("aria-expanded") == null
				|| careerGoalAndActivePage.goals.get(0).getAttribute("aria-expanded").equals("false")) {
			careerGoalAndActivePage.goals.get(0).click();
		}
		MiscUtils.sleep(3000);
		if (careerGoalAndActivePage.goalOptions.size() == 0) {
			careerGoalAndActivePage.academicOption.click();
			MiscUtils.sleep(3000);
		}
		careerGoalAndActivePage.goalOptions.get(2).click();
		careerGoalAndActivePage.goalOptions.get(3).click();
		careerGoalAndActivePage.goalOptions.get(4).click();
		careerGoalAndActivePage.goalOptions.get(5).click();
		CommonUtils.clickOnElement(careerGoalAndActivePage.goals.get(0));
	}
	
	public void selectCareerGoalNIDCR() throws Exception {
		List<WebElement> goals = WebDriverUtils.webDriver
				.findElements(By.cssSelector("[data-target^='#academic']"));
		// Added check so that element is clicked only when the menu is collapsed
		if (goals.get(0).getAttribute("class").contains("collapsed")) {
			goals.get(0).click();
		} else if (goals.get(0).getAttribute("aria-expanded") == null
				|| goals.get(0).getAttribute("aria-expanded").equals("false")) {
			goals.get(0).click();
		}
		Thread.sleep(3000);
		List<WebElement> goalOptions = WebDriverUtils.webDriver
				.findElements(By.cssSelector(".controls.line.ta_interestGroup.collapse.in label"));
		if (goalOptions.size() == 0) {
			WebDriverUtils.webDriver.findElement(By.cssSelector("[data-target='#academic24']")).click();
			Thread.sleep(3000);
			goalOptions = WebDriverUtils.webDriver
					.findElements(By.cssSelector(".controls.line.ta_interestGroup.collapse.in label"));
		}
		try{goalOptions.get(2).click();}catch(Exception e) {
			CommonUtils.clickOnElement(goals.get(0));
		}
		goalOptions.get(3).click();
		goalOptions.get(4).click();
		CommonUtils.clickOnElement(goals.get(0));
	}

	public void fillSkillNGHRI() throws Exception {
		CommonUtils.clickOnElement(careerGoalAndActivePage.communicationSkillButton);
		CommonUtils.waitForVisibility(careerGoalAndActivePage.typeDropdown);
		eidpBasePage.selectOption(careerGoalAndActivePage.typeDropdown, "Writing");
		CommonUtils.sendKeys(careerGoalAndActivePage.description,
				"Automation script writing skill set enter for testing");
		CommonUtils.clickOnElement(careerGoalAndActivePage.doneButton);
	}

	public void fillSkill() throws Exception {
		CommonUtils.clickOnElement(careerGoalAndActivePage.communicationSkillButton);
		CommonUtils.waitForVisibility(careerGoalAndActivePage.typeDropdown);
		eidpBasePage.selectOption(careerGoalAndActivePage.typeDropdown, "Writing");
		CommonUtils.sendKeys(careerGoalAndActivePage.description,
				"Automation script writing skill set enter for testing");
		CommonUtils.clickOnElement(careerGoalAndActivePage.doneButton);
	}

	public void completeSKills() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<WebElement> skillStatus = WebDriverUtils.webDriver
				.findElements(By.xpath("//table[@id='com_speaking']/tbody/tr/td[5]"));
		for (int i = 0; i < skillStatus.size(); i++) {
			if (skillStatus.get(i).getText().equals("")) {
				List<WebElement> editButtons = WebDriverUtils.webDriver
						.findElements(By.xpath("//table[@id='com_speaking']//button[@title='Edit']"));
				CommonUtils.clickOnElement(editButtons.get(i));
				CommonUtils.clickOnElement(careerGoalAndActivePage.careerExplorationStatus);
				CommonUtils.clickOnElement(careerGoalAndActivePage.doneButton);
			}
		}
	}

	public void editCareerTrainingActivites() {
		MiscUtils.sleep(2000);
		for (int i = 0; i < careerGoalAndActivePage.editIcons.size(); i++) {
			CommonUtils.clickOnElement(careerGoalAndActivePage.editIcons.get(i));
			MiscUtils.sleep(3000);
			CommonUtils.clickOnElement(careerGoalAndActivePage.careerStatuses.get(careerGoalAndActivePage.careerStatuses.size() - 1)
			.findElement(By.tagName("label")));
			CommonUtils.clickOnElement(careerGoalAndActivePage.addMoreButton);
			MiscUtils.sleep(2000);
		}
		CommonUtils.clickOnElement(careerGoalAndActivePage.saveAndContinueButton);
		MiscUtils.sleep(3000);
	}

	public void markAllExistingCareerGoalsAsCompleted() {
		for (int i = 0; i < careerGoalAndActivePage.editIcons.size(); i++) {
			MiscUtils.sleep(4000);
			careerGoalAndActivePage.editIcons.get(i).click();
			CommonUtils.clickOnElement(careerGoalAndActivePage.editRadiobuttons.get(2));
			MiscUtils.sleep(3000);
			careerGoalAndActivePage.editIcons.get(0).click();
			CommonUtils.clickOnElement(careerGoalAndActivePage.editRadiobuttons.get(2));
			CommonUtils.clickOnElement(careerGoalAndActivePage.doneButton);
		}
		CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.id("careerGoalsSubmitSave")));
		MiscUtils.sleep(4000);
	}

	public void addNewCareerGoal() {
		CommonUtils.waitForVisibility(careerGoalAndActivePage.communicationSkillButton);
		careerGoalAndActivePage.communicationSkillButton.click();
		eidpBasePage.selectOption(careerGoalAndActivePage.typeDropdown, "Speaking");
		careerGoalAndActivePage.description.sendKeys("This is the test of communcation skills part of IDP");
		careerGoalAndActivePage.doneButton.click();
	}
}