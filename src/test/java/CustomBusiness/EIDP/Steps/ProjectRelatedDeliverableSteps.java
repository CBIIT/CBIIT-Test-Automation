package CustomBusiness.EIDP.Steps;

import org.openqa.selenium.By;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectRelatedDeliverableSteps extends PageInitializer {

	@When("User fills mandatory fields in project deliverable page")
	public void fillProjectDeliverableData() throws Exception {
		projectRelatedDeliverableStepImpl.fillProjectDeliverableData();
	}

	@Then("User fills mandatory fields in project deliverable page for renew")
	public void continueAfterProjectDetails() {
		projectRelatedDeliverableStepImpl.clickOnProjectRelatedTraining();
	}

	@When("User edits the existing IDP details in all the tabs")
	public void editProject() throws Exception {
		projectRelatedDeliverableStepImpl.addNewProject();
		projectRelatedDeliverableStepImpl.selectProjectStatus("In Progress");
		eidpCommonPage.clickOnbutton("Save and Continue");
		Thread.sleep(5000);
		eidpCommonPage.clickOnbutton("Save and Continue");
		Thread.sleep(5000);
		eidpCommonPage.clickOnbutton("Save and Continue");
		Thread.sleep(5000);
		aligningExpectationsStepImpl.enterAligningDescription(
				"This filed dedicated for expectations about aligning and it is a textarea field.");
		eidpCommonPage.clickOnSaveButton();
	}

	@When("User edits project related deliverables and trainnings")
	public void editProjectAndDeliverables() throws Exception {
		projectRelatedDeliverableStepImpl.editProject();
		projectRelatedDeliverableStepImpl.selectProjectStatus("In Progress");
		projectRelatedDeliverableStepImpl.editAllDeliverables();
	}

	@Then("User fills OCR id")
	public void FillORCID() {
		// try {
		// 	if (CommonUtils.isElementPresent(By.id("orcidId"))) {
		// 		CommonUtils.sendKeys(WebDriverUtils.webDriver.findElement(By.id("orcidId")), "9999-9999-9999-9999");
		// 	}
		// } catch (Exception e) {
		// 	throw e;
		// }
	}

	@When("User adds new project with deliverables")
	public void addNewProject() {

		projectRelatedDeliverableStepImpl.markAllExistingProjectsAsCompleted();
		CommonUtil.waitBrowser(3000);

		try {
			projectRelatedDeliverableStepImpl.markAllExistingProjectsAsCompleted();
		} catch (Exception e) {

		}

		projectRelatedDeliverableStepImpl.addNewProject();
		CommonUtil.waitBrowser(3000);
		projectRelatedDeliverableStepImpl.selectProjectStatus("In Progress");
		eidpCommonPage.clickOnbutton("Save and Continue");
		CommonUtil.waitBrowser(7000);
		projectRelatedDeliverableStepImpl.markAllProjectRelatedTrainningsAreCompleted();
		CommonUtil.waitBrowser(3000);
		projectRelatedDeliverableStepImpl.addWorkShipDetailsWithStatus();
		CommonUtil.waitBrowser(4000);
		eidpCommonPage.clickOnbutton("Save and Continue");
		CommonUtil.waitBrowser(6000);
	}
}
