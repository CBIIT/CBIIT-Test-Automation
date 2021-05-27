package ServiceNow.NERD.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import ServiceNow.COVIDDash.Utils.COVIDConstants;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NERDCollaborationSubmissionSteps extends PageInitializer {
	public static String title = "Title" + CommonUtils.getDateAsString();

	@Given("a Program Staff member is on the CRS Knowledge Management System {string} page")
	public void a_Program_Staff_member_is_on_the_CRS_Knowledge_Management_System_page(String submissionsPage)
			throws TestingException {
		nerdLoginStepsImplementation.loginToNerd();
		Assert.assertEquals(submissionsPage,
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageSubmissionsLink
						.getText());
	}

	@Given("creates a new submission for Collaboration category")
	public void creates_a_new_submission_for_Collaboration_category() {
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the created Collaborations submission is displays in the Collaborations category section with the status {string}")
	public void the_created_Collaborations_submission_is_displays_in_the_Collaborations_category_section_with_the_status(
			String string) throws TestingException {
		Assert.assertEquals("Create New Submission",
				createNewSubmissionPage.crsKnowledgeManagementSystemCreateNewSubmissionBreadcrumb.getText());
		CucumberLogUtils.logScreenShot();
		CommonUtils.sendKeys(createNewSubmissionPage.titleTextBox, "AutomationTest");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.pleaseSpecifyDropDown, "New");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.fiscalYearDropDown, "2021");
		MiscUtils.sleep(2000);
		CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
		CommonUtils.sendKeys(createNewSubmissionPage.DescriptionTextBox, "Test Description");
		WebDriverUtils.webDriver.switchTo().defaultContent();
		CommonUtils.selectDropDownValue(createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown, "2020");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.leadDOCDropDown, "CBIIT");
		MiscUtils.sleep(2000);
		CommonUtils.selectCheckbox(createNewSubmissionPage.crsKnowledgeManagementSystemOtherDOCsList, "aria-label",
				"CBIIT");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.sendKeys(createNewSubmissionPage.pocTextBox, "Test");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.nihICs_ODcollaboratorsDropDown, "Other");
		MiscUtils.sleep(1000);
		Assert.assertEquals("IF OTHER IS SELECTED ABOVE, please specify",
				createNewSubmissionPage.nihICs_ODCollaboratorsIfOtherIsSelectedAbovePleaseSpecifyText.getText());
		CommonUtils.sendKeys(createNewSubmissionPage.nihICs_ODCollaboratorsIfOtherIsSelectedAbovePleaseSpecifyTextBox,
				"Test");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.hhsAgencyCollaboratorsDropDown, "ACF");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown, "Commerce");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown,
				"No Tribal/State/Local/Government Collaborators");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown,
				"Health Canada");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown, "Wellcome Trust");
		CommonUtils.selectCheckbox(
				createNewSubmissionPage.crsKnowledgeManagementSystemSelectTypeOfCollaborativeActivityList, "aria-label",
				"Research Initiative");
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.selectDropDownValue(createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown,
				"Yes");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown, "No");
		CommonUtils.selectCheckbox(createNewSubmissionPage.crsKnowledgeManagementSystemProductsOutputsList,
				"aria-label", "Strategic Plan");
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue(createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown,
				"4.2 Balance Outputs with Outcomes");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.nihStrategicAlignment_SecondaryOptional_DropDown,
				"4.2 Balance Outputs with Outcomes");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown,
				"1.4: Strengthen and expand the healthcare workforce to meet America's diverse needs");
		CommonUtils.selectDropDownValue(createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown,
				"1.4: Strengthen and expand the healthcare workforce to meet America's diverse needs");
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.sendKeys(createNewSubmissionPage.chooseFileButton, COVIDConstants.DOC_PATH);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(createNewSubmissionPage.submitButton);
		CommonUtils.click(createNewSubmissionPage.popUpConfirmationYesButton);
		MiscUtils.sleep(3000);
		Assert.assertEquals("Submission has been successfully submitted.",
				createNewSubmissionPage.popUpSubmissionConfirmationText.getText());
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
		CommonUtils.click(createNewSubmissionPage.popUpSubmissionConfirmationOkButton);
		MiscUtils.sleep(5000);
		JavascriptUtils.clickByJS(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals("Under Review",
				createNewSubmissionPage.crsKnowledgeManagementSystemAutomationTestUnderReviewText.getText());
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(2000);
		nativeViewDashPage.enterTextImpersntSearchBox("Karen Ortner");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		MiscUtils.sleep(5000);
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink);
		MiscUtils.sleep(1000);
		CommonUtils.click(createNewSubmissionPage.crsKnowledgeManagementSystemAutomationTestDeleteButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(createNewSubmissionPage.crsKnowledgeManagementSystemConfirmDeleteButton);
		MiscUtils.sleep(2000);
		Assert.assertEquals("Submission has been successfully deleted.",
				createNewSubmissionPage.crsKnowledgeManagementSystemSubmissionHasBeenSuccessfullyDeletedPopUpText
						.getText());
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(
				createNewSubmissionPage.crsKnowledgeManagementSystemSubmissionHasBeenSuccessfullyDeletedPopUpOkButton);
	}

}
