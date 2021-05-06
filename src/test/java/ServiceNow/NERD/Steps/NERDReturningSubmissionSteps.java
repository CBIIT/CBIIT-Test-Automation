package ServiceNow.NERD.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NERDReturningSubmissionSteps extends PageInitializer {

	@Given("a published Collaboration has been returned to the DOC Planning Contact by the CRS Reviewer")
	public void a_published_Collaboration_has_been_returned_to_the_DOC_Planning_Contact_by_the_CRS_Reviewer()
			throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.titleTextBox.sendKeys("TestingCRSReviewer");
		CommonUtils.selectDropDownValue("New", createNewSubmissionPage.pleaseSpecifyDropDown);
		createNewSubmissionPage.acronymTextBox.sendKeys("Testing");
		CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
		CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
		createNewSubmissionPage.DescriptionTextBox.sendKeys("Testing");
		WebDriverUtils.webDriver.switchTo().defaultContent();
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown);
		CommonUtils.selectDropDownValue("CBIIT", createNewSubmissionPage.leadDOCDropDown);
		createNewSubmissionPage.otherDOCsCBIITCheckBox.click();
		createNewSubmissionPage.pocTextBox.sendKeys("Testing");
		createNewSubmissionPage.ReferencesTextBox.sendKeys("Test");
		CommonUtils.selectDropDownValue("CC", createNewSubmissionPage.nihICs_ODcollaboratorsDropDown);
		CommonUtils.selectDropDownValue("ACF", createNewSubmissionPage.hhsAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Commerce", createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("No Tribal/State/Local/Government Collaborators",
				createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Health Canada",
				createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("American Society for Microbiology (ASM)",
				createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown);
		createNewSubmissionPage.selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("Yes",
				createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown);
		CommonUtils.selectDropDownValue("Yes", createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown);
		createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("1.1 Fundamental Science",
				createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue("1.2 Treatment and Cures",
				createNewSubmissionPage.nihStrategicAlignment_SecondaryOptional_DropDown);
		CommonUtils.selectDropDownValue(
				"1.4: Strengthen and expand the healthcare workforce to meet America's diverse needs",
				createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue(
				"3.2: Safeguard the public against preventable injuries and violence or their results",
				createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown);
		createNewSubmissionPage.submitButton.click();
		MiscUtils.sleep(2000);
		createNewSubmissionPage.popUpConfirmationYesButton.click();
		MiscUtils.sleep(3000);
		createNewSubmissionPage.informationDialogPopUpOKbutton.click();
		MiscUtils.sleep(3000);
		nativeViewImpersonateUser.impersonateToDocPlanningContact();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.submitToCRSButton("TestingCRSReviewer").click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		nativeViewImpersonateUser.impersonateToCRSReviewer();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
		CommonUtils.selectValueFromBootStrapDropDown(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
				"Submissions");
		MiscUtils.sleep(10000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown);
		MiscUtils.sleep(4000);
		nerdDynamicXpaths.publishToNERDButton("TestingCRSReviewer").click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
		JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButton("TestingCRSReviewer"));
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField.sendKeys("Testing Return Submission");
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
	}

	@Then("the {string} and {string} field values are cleared and are required")
	public void the_and_field_values_are_cleared_and_are_required(String PleaseSpecify, String FiscalYear)
			throws TestingException {
		nativeViewImpersonateUser.impersonateToDocPlanningContact();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.submitToCRSButton("TestingCRSReviewer").click();
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton);
		MiscUtils.sleep(1000);
		Assert.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.requiredFieldsNeedToBeFilledInBeforeSubmissionText
				.getText().contentEquals("Required fields need to be filled in before submission."));
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton);
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.editButton("TestingCRSReviewer").click();
		MiscUtils.sleep(1000);
		Assert.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
		if (!createNewSubmissionPage.pleaseSpecifyDropDown.isSelected()) {
			CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
			MiscUtils.sleep(1000);
		}
		Assert.assertTrue(createNewSubmissionPage.fiscalYearText.getText().contentEquals(FiscalYear));
		if (!createNewSubmissionPage.fiscalYearDropDown.isSelected()) {
			CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
			MiscUtils.sleep(1000);
		}
		createNewSubmissionPage.cancelButton.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.deleteButton("TestingCRSReviewer").click();
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Then("the Collaboration shows as {string} in the Submissions page")
	public void the_Collaboration_shows_as_in_the_Submissions_page(String ReturnedToDOC) throws TestingException {
		Assert.assertTrue(
				nerdDynamicXpaths.returnedToDOCText("TestingCRSReviewer").getText().contentEquals(ReturnedToDOC));
		JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToDOCText("TestingCRSReviewer"));
		MiscUtils.sleep(2000);
		nativeViewImpersonateUser.impersonateToDocPlanningContact();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		nerdDynamicXpaths.deleteButton("TestingCRSReviewer").click();
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@When("the DOC Planning Contact fills out the {string} and {string} field")
	public void the_DOC_Planning_Contact_fills_out_the_and_field(String PleaseSpecify, String FiscalYear)
			throws TestingException {
		nativeViewImpersonateUser.impersonateToDocPlanningContact();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		nerdDynamicXpaths.editButton("TestingCRSReviewer").click();
		MiscUtils.sleep(2000);
		Assert.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
		if (!createNewSubmissionPage.pleaseSpecifyDropDown.isSelected()) {
			CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
		}
		Assert.assertTrue(createNewSubmissionPage.fiscalYearText.getText().contentEquals(FiscalYear));
		if (!createNewSubmissionPage.fiscalYearDropDown.isSelected()) {
			CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
		}
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nerdCrsKnowledgeDatabaseSubmissionsPage.SaveButton.click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
	}

	@When("returns the Collaboration to the Program Staff")
	public void returns_the_Collaboration_to_the_Program_Staff() {
		nerdDynamicXpaths.returnButtonToStaff("TestingCRSReviewer").click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
				.sendKeys("Testing Returning To The Program Staff");
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
		Assert.assertTrue(nerdDynamicXpaths.returnedToStaffMemberText("TestingCRSReviewer").getText()
				.contentEquals("Returned to Staff Member"));
		JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText("TestingCRSReviewer"));

	}

	@Then("the {string} and {string} field values are not cleared and are required")
	public void the_and_field_values_are_not_cleared_and_are_required(String PleaseSpecify, String FiscalYear)
			throws TestingException {
		nativeViewImpersonateUser.impersonateToStaffMemmber();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		nerdDynamicXpaths.editButtonReturnedToStaffMember("TestingCRSReviewer").click();
		MiscUtils.sleep(1000);
		Assert.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
		if (createNewSubmissionPage.pleaseSpecifyDropDown.isSelected()) {
			Assert.assertTrue(createNewSubmissionPage.pleaseSpecifyAsterisk.isDisplayed());
		}
		Assert.assertTrue(createNewSubmissionPage.fiscalYearText.getText().contentEquals(FiscalYear));
		if (createNewSubmissionPage.fiscalYearDropDown.isSelected()) {
			Assert.assertTrue(createNewSubmissionPage.fiscalYearAsterisk.isDisplayed());
		}
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.cancelButton.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.deleteButtonReturnedToStaffMember("TestingCRSReviewer").click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Then("the options available for the {string} field are {string}, {string}, {string}, and {string}")
	public void the_options_available_for_the_field_are_and(String PleaseSpecify, String Edited, String NocChange,
			String Ended, String NotLedByNCI) throws TestingException {
		nativeViewImpersonateUser.impersonateToStaffMemmber();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		nerdDynamicXpaths.editButtonReturnedToStaffMember("TestingCRSReviewer").click();
		Assert.assertTrue(createNewSubmissionPage.pleaseSpecifyText.getText().contentEquals(PleaseSpecify));
		MiscUtils.sleep(1000);
		String[] exp = { Edited, NocChange, Ended, NotLedByNCI };
		for (WebElement act : createNewSubmissionPage.pleaseSpecifyDropDownValues) {
			boolean match = false;
			for (int i = 0; i < exp.length; i++) {
				if (act.getText().equals(exp[i])) {
					match = true;
				}
			}
			Assert.assertTrue(match);
		}
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.cancelButton.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.deleteButtonReturnedToStaffMember("TestingCRSReviewer").click();
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Given("a Collaboration has been submitted to the DOC Planning Contact")
	public void a_Collaboration_has_been_submitted_to_the_DOC_Planning_Contact() throws TestingException {
		nerdLoginStepsImplementation.loginToNerd();
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.titleTextBox.sendKeys("TestingUnderReviewText");
		CommonUtils.selectDropDownValue("New", createNewSubmissionPage.pleaseSpecifyDropDown);
		createNewSubmissionPage.acronymTextBox.sendKeys("Testing");
		CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
		CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
		createNewSubmissionPage.DescriptionTextBox.sendKeys("Testing");
		WebDriverUtils.webDriver.switchTo().defaultContent();
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown);
		CommonUtils.selectDropDownValue("CBIIT", createNewSubmissionPage.leadDOCDropDown);
		createNewSubmissionPage.otherDOCsCBIITCheckBox.click();
		MiscUtils.sleep(2000);
		createNewSubmissionPage.pocTextBox.sendKeys("Testing");
		createNewSubmissionPage.ReferencesTextBox.sendKeys("Test");
		CommonUtils.selectDropDownValue("CC", createNewSubmissionPage.nihICs_ODcollaboratorsDropDown);
		CommonUtils.selectDropDownValue("ACF", createNewSubmissionPage.hhsAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Commerce", createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("No Tribal/State/Local/Government Collaborators",
				createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Health Canada",
				createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("American Society for Microbiology (ASM)",
				createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown);
		createNewSubmissionPage.selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("Yes",
				createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown);
		CommonUtils.selectDropDownValue("Yes", createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown);
		createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("1.1 Fundamental Science",
				createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue("1.2 Treatment and Cures",
				createNewSubmissionPage.nihStrategicAlignment_SecondaryOptional_DropDown);
		CommonUtils.selectDropDownValue(
				"1.4: Strengthen and expand the healthcare workforce to meet America's diverse needs",
				createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue(
				"3.2: Safeguard the public against preventable injuries and violence or their results",
				createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown);
		createNewSubmissionPage.submitButton.click();
		createNewSubmissionPage.popUpConfirmationYesButton.click();
		MiscUtils.sleep(5000);
		createNewSubmissionPage.informationDialogPopUpOKbutton.click();
		MiscUtils.sleep(2000);
	}

	@Then("the submitted Collaboration shows as {string} in the Submissions page")
	public void the_submitted_Collaboration_shows_as_in_the_Submissions_page(String UnderReview)
			throws TestingException {
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		JavascriptUtils.scrollIntoView(nerdDynamicXpaths.underReviewText("TestingUnderReviewText"));
		Assert.assertTrue(nerdDynamicXpaths.underReviewText("TestingUnderReviewText").getText().toString()
				.contentEquals(UnderReview));
		JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText("TestingUnderReviewText"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nativeViewImpersonateUser.impersonateToDocPlanningContact();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		nerdDynamicXpaths.deleteButton("TestingUnderReviewText").click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Given("a published Collaboration has been returned to the Program Staff with the article version number as {string}")
	public void a_published_Collaboration_has_been_returned_to_the_Program_Staff_with_the_article_version_number_as(
			String versionNumber) throws TestingException {
		nerdLoginStepsImplementation.loginToNerd();
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.titleTextBox.sendKeys(CommonUtils.email);
		CommonUtils.selectDropDownValue("New", createNewSubmissionPage.pleaseSpecifyDropDown);
		createNewSubmissionPage.acronymTextBox.sendKeys("Testing");
		CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
		CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
		createNewSubmissionPage.DescriptionTextBox.sendKeys("Testing");
		WebDriverUtils.webDriver.switchTo().defaultContent();
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown);
		CommonUtils.selectDropDownValue("CBIIT", createNewSubmissionPage.leadDOCDropDown);
		createNewSubmissionPage.otherDOCsCBIITCheckBox.click();
		createNewSubmissionPage.pocTextBox.sendKeys("Testing");
		createNewSubmissionPage.ReferencesTextBox.sendKeys("Test");
		CommonUtils.selectDropDownValue("CC", createNewSubmissionPage.nihICs_ODcollaboratorsDropDown);
		CommonUtils.selectDropDownValue("ACF", createNewSubmissionPage.hhsAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Commerce", createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("No Tribal/State/Local/Government Collaborators",
				createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Health Canada",
				createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("American Society for Microbiology (ASM)",
				createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown);
		createNewSubmissionPage.selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("Yes",
				createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown);
		CommonUtils.selectDropDownValue("Yes", createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown);
		createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("1.1 Fundamental Science",
				createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue("1.2 Treatment and Cures",
				createNewSubmissionPage.nihStrategicAlignment_SecondaryOptional_DropDown);
		CommonUtils.selectDropDownValue(
				"1.4: Strengthen and expand the healthcare workforce to meet America's diverse needs",
				createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue(
				"3.2: Safeguard the public against preventable injuries and violence or their results",
				createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown);
		createNewSubmissionPage.submitButton.click();
		createNewSubmissionPage.popUpConfirmationYesButton.click();
		createNewSubmissionPage.informationDialogPopUpOKbutton.click();
		MiscUtils.sleep(3000);
		nativeViewImpersonateUser.impersonateToDocPlanningContact();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.submitToCRSButton(CommonUtils.email).click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		nativeViewImpersonateUser.impersonateToCRSReviewer();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
		CommonUtils.selectValueFromBootStrapDropDown(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
				"Submissions");
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
		MiscUtils.sleep(4000);
		nerdDynamicXpaths.publishToNERDButton(CommonUtils.email).click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
		JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButton(CommonUtils.email));
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField.sendKeys(CommonUtils.email);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		CucumberLogUtils.logScreenShot();
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageHOMEButton.click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
		MiscUtils.sleep(7000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsList.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.publishedCollaboration(CommonUtils.email).click();
		CommonUtils.swicthToAnotherWindow();
		MiscUtils.sleep(1000);
		Assert.assertTrue("Verifying Article version number has been incremented",
				nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber1.getText()
						.contentEquals("Version 1.0 - DOC Version"));
		JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber1);
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		nativeViewImpersonateUser.impersonateToDocPlanningContact();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.editButton(CommonUtils.email).click();
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
		MiscUtils.sleep(1000);
		CommonUtils.selectDropDownValue("2024", createNewSubmissionPage.fiscalYearDropDown);
		nerdCrsKnowledgeDatabaseSubmissionsPage.SaveButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
		nerdDynamicXpaths.returnButtonToStaff(CommonUtils.email).click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
				.sendKeys("Testing Returning To The Program Staff");
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
		JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText(CommonUtils.email));
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
	}

	@When("the Program Staff resubmits the article to the DOC Planning Contact")
	public void the_Program_Staff_resubmits_the_article_to_the_DOC_Planning_Contact() throws TestingException {
		nativeViewImpersonateUser.impersonateToStaffMemmber();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(nerdDynamicXpaths.submitButtonToDOCPlanningContact(CommonUtils.email));
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton);
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nerdDynamicXpaths.underReviewText(CommonUtils.email));
		Assert.assertTrue(nerdDynamicXpaths.underReviewText(CommonUtils.email).getText().contentEquals("Under Review"));
		JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.underReviewText(CommonUtils.email));
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(5000);
		nativeViewImpersonateUser.impersonateToDocPlanningContact();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.submitToCRSButton(CommonUtils.email).click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		nativeViewImpersonateUser.impersonateToCRSReviewer();

	}

	@Then("the article is incremented one major version number as {string}")
	public void the_article_is_incremented_one_major_version_number_as(String versionNumber) throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(10000);

		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
		CommonUtils.selectValueFromBootStrapDropDown(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
				"Submissions");
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
		MiscUtils.sleep(4000);
		nerdDynamicXpaths.publishToNERDButton(CommonUtils.email).click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
		CucumberLogUtils.logScreenShot();
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageHOMEButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
		MiscUtils.sleep(7000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsList.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.publishedCollaboration(CommonUtils.email).click();
		CommonUtils.swicthToAnotherWindow();
		MiscUtils.sleep(1000);
		System.out.println("Version 2 TEXT:"
				+ nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber2.getText().toString());
		Assert.assertTrue("Verifying Article version number has been incremented",
				nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber2.getText()
						.contentEquals(versionNumber));
		JavascriptUtils.drawBlueBorder(nerdCrsKnowledgeDatabaseSubmissionsPage.collaborationsVersionNumber2);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	// Volha
	@Given("a published Collaboration is returned to the DOC Planning Contact")
	public void a_published_Collaboration_is_returned_to_the_DOC_Planning_Contact() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.titleTextBox.sendKeys("CollaborationVolhaTest");
		CommonUtils.selectDropDownValue("New", createNewSubmissionPage.pleaseSpecifyDropDown);
		createNewSubmissionPage.acronymTextBox.sendKeys("Testing");
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fiscalYearDropDown);
		CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
		createNewSubmissionPage.DescriptionTextBox.sendKeys("Testing");
		WebDriverUtils.webDriver.switchTo().defaultContent();
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown);
		CommonUtils.selectDropDownValue("CBIIT", createNewSubmissionPage.leadDOCDropDown);
		createNewSubmissionPage.otherDOCsCBIITCheckBox.click();
		createNewSubmissionPage.pocTextBox.sendKeys("Testing");
		createNewSubmissionPage.ReferencesTextBox.sendKeys("Test");
		CommonUtils.selectDropDownValue("CC", createNewSubmissionPage.nihICs_ODcollaboratorsDropDown);
		CommonUtils.selectDropDownValue("ACF", createNewSubmissionPage.hhsAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Commerce", createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("No Tribal/State/Local/Government Collaborators",
				createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Health Canada",
				createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("American Society for Microbiology (ASM)",
				createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown);
		createNewSubmissionPage.selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("Yes",
				createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown);
		CommonUtils.selectDropDownValue("Yes", createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown);
		createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("1.1 Fundamental Science",
				createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue("1.2 Treatment and Cures",
				createNewSubmissionPage.nihStrategicAlignment_SecondaryOptional_DropDown);
		CommonUtils.selectDropDownValue(
				"1.4: Strengthen and expand the healthcare workforce to meet America's diverse needs",
				createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue(
				"3.2: Safeguard the public against preventable injuries and violence or their results",
				createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown);
		createNewSubmissionPage.submitButton.click();
		MiscUtils.sleep(2000);
		createNewSubmissionPage.popUpConfirmationYesButton.click();
		MiscUtils.sleep(3000);
		createNewSubmissionPage.informationDialogPopUpOKbutton.click();
		MiscUtils.sleep(3000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(3000);
		nativeViewDashPage.enterTextImpersntSearchBox("Karen Ortner");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.submitToCRSButton("CollaborationVolhaTest").click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(2000);
		nativeViewDashPage.enterTextImpersntSearchBox("Grace Liou");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
		CommonUtils.selectValueFromBootStrapDropDown(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
				"Submissions");
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
		MiscUtils.sleep(4000);
		nerdDynamicXpaths.publishToNERDButton("CollaborationVolhaTest").click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
		JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButton("CollaborationVolhaTest"));
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField.sendKeys("Testing Return Submission");
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
	}

	@Given("the DOC Planning Contact resubmits the submission")
	public void the_DOC_Planning_Contact_resubmits_the_submission() throws TestingException {
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
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(4000);
		nerdDynamicXpaths.editButton("CollaborationVolhaTest").click();
		MiscUtils.sleep(8000);
		CommonUtils.selectDropDownValue("Edited", createNewSubmissionPage.pleaseSpecifyDropDown);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fiscalYearDropDown);
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.SaveButton.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
		nerdDynamicXpaths.submitButtonReturnedToStaffMember("CollaborationVolhaTest").click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
	}

	@When("the CRS Reviewer returns the submission once more")
	public void the_CRS_Reviewer_returns_the_submission_once_more() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(2000);
		nativeViewDashPage.enterTextImpersntSearchBox("Grace Liou");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
		CommonUtils.selectValueFromBootStrapDropDown(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
				"Submissions");
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
		MiscUtils.sleep(4000);
		JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButton("CollaborationVolhaTest"));
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField
				.sendKeys("Testing Second Return Submission");
	}

	@Then("a notification is sent to the DOC Planning Contact")
	public void a_notification_is_sent_to_the_DOC_Planning_Contact() throws TestingException {
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToDOCText("CollaborationVolhaTest"));
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(3000);
		nativeViewDashPage.enterTextImpersntSearchBox("Karen Ortner");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		JavascriptUtils.clickByJS(nerdDynamicXpaths.deleteButton("CollaborationVolhaTest"));
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Given("a DOC Planning Contact creates a Collaboration submission")
	public void a_DOC_Planning_Contact_creates_a_Collaboration_submission() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(1000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(3000);
		nativeViewDashPage.enterTextImpersntSearchBox("Karen Ortner");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.titleTextBox.sendKeys("DOCPlanContactCreateCollabarationTest");
		CommonUtils.selectDropDownValue("New", createNewSubmissionPage.pleaseSpecifyDropDown);
		createNewSubmissionPage.acronymTextBox.sendKeys("Testing");
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fiscalYearDropDown);
		CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
		createNewSubmissionPage.DescriptionTextBox.sendKeys("Testing");
		WebDriverUtils.webDriver.switchTo().defaultContent();
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown);
		CommonUtils.selectDropDownValue("CBIIT", createNewSubmissionPage.leadDOCDropDown);
		createNewSubmissionPage.otherDOCsCBIITCheckBox.click();
		createNewSubmissionPage.pocTextBox.sendKeys("Testing");
		createNewSubmissionPage.ReferencesTextBox.sendKeys("Test");
		CommonUtils.selectDropDownValue("CC", createNewSubmissionPage.nihICs_ODcollaboratorsDropDown);
		CommonUtils.selectDropDownValue("ACF", createNewSubmissionPage.hhsAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Commerce", createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("No Tribal/State/Local/Government Collaborators",
				createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Health Canada",
				createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("American Society for Microbiology (ASM)",
				createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown);
		createNewSubmissionPage.selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("Yes",
				createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown);
		CommonUtils.selectDropDownValue("Yes", createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown);
		createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("1.1 Fundamental Science",
				createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue("1.2 Treatment and Cures",
				createNewSubmissionPage.nihStrategicAlignment_SecondaryOptional_DropDown);
		CommonUtils.selectDropDownValue(
				"1.4: Strengthen and expand the healthcare workforce to meet America's diverse needs",
				createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue(
				"3.2: Safeguard the public against preventable injuries and violence or their results",
				createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown);
		nerdCrsKnowledgeDatabaseSubmissionsPage.saveButtonNewSubmissionDOCplanning.click();
		MiscUtils.sleep(2000);
		createNewSubmissionPage.informationDialogPopUpOKbutton.click();
		MiscUtils.sleep(3000);
	}

	@Then("they are able to return the submission to a Program Staff in the same DOC")
	public void they_are_able_to_return_the_submission_to_a_Program_Staff_in_the_same_DOC() throws TestingException {
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(4000);
		nerdDynamicXpaths.returnButtonToStaff("DOCPlanContactCreateCollabarationTest").click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowDropDown.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowForSearchStaffMemberTextField
				.sendKeys("Diego Juarez");
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowResultsTextField.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
				.sendKeys("Return DOC Test to Staff Member");
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmReturnYesButton.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(2000);
		JavascriptUtils
				.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText("DOCPlanContactCreateCollabarationTest"));
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(4000);
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
		nativeViewDashPage.enterTextImpersntSearchBox("Diego Juarez");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		nerdDynamicXpaths.deleteButtonReturnedToStaffMember("DOCPlanContactCreateCollabarationTest").click();
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Given("a Collaboration has been returned to a Program Staff")
	public void a_Collaboration_has_been_returned_to_a_Program_Staff() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.titleTextBox.sendKeys("TestCollaborationReturnToStaff");
		CommonUtils.selectDropDownValue("New", createNewSubmissionPage.pleaseSpecifyDropDown);
		createNewSubmissionPage.acronymTextBox.sendKeys("Testing");
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fiscalYearDropDown);
		CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
		createNewSubmissionPage.DescriptionTextBox.sendKeys("Testing");
		WebDriverUtils.webDriver.switchTo().defaultContent();
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown);
		CommonUtils.selectDropDownValue("CBIIT", createNewSubmissionPage.leadDOCDropDown);
		createNewSubmissionPage.otherDOCsCBIITCheckBox.click();
		createNewSubmissionPage.pocTextBox.sendKeys("Testing");
		createNewSubmissionPage.ReferencesTextBox.sendKeys("Test");
		CommonUtils.selectDropDownValue("CC", createNewSubmissionPage.nihICs_ODcollaboratorsDropDown);
		CommonUtils.selectDropDownValue("ACF", createNewSubmissionPage.hhsAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Commerce", createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("No Tribal/State/Local/Government Collaborators",
				createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Health Canada",
				createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("American Society for Microbiology (ASM)",
				createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown);
		createNewSubmissionPage.selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("Yes",
				createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown);
		CommonUtils.selectDropDownValue("Yes", createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown);
		createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("1.1 Fundamental Science",
				createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue("1.2 Treatment and Cures",
				createNewSubmissionPage.nihStrategicAlignment_SecondaryOptional_DropDown);
		CommonUtils.selectDropDownValue(
				"1.4: Strengthen and expand the healthcare workforce to meet America's diverse needs",
				createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue(
				"3.2: Safeguard the public against preventable injuries and violence or their results",
				createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown);
		createNewSubmissionPage.submitButton.click();
		MiscUtils.sleep(2000);
		createNewSubmissionPage.popUpConfirmationYesButton.click();
		MiscUtils.sleep(3000);
		createNewSubmissionPage.informationDialogPopUpOKbutton.click();
		MiscUtils.sleep(3000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(3000);
		nativeViewDashPage.enterTextImpersntSearchBox("Karen Ortner");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.returnButtonToStaff("TestCollaborationReturnToStaff").click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowDropDown.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowForSearchStaffMemberTextField
				.sendKeys("Diego Juarez");
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowResultsTextField.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
				.sendKeys("Return Test to Staff Member");
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmReturnYesButton.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(2000);
	}

	@Then("the Collaboration shows as {string} in the Submission page")
	public void the_Collaboration_shows_as_in_the_Submission_page(String ReturnedToStaffMember)
			throws TestingException {
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(5000);
		JavascriptUtils.scrollIntoView(nerdDynamicXpaths.returnedToStaffMemberText("TestCollaborationReturnToStaff"));
		MiscUtils.sleep(3000);
		Assert.assertTrue(nerdDynamicXpaths.returnedToStaffMemberText("TestCollaborationReturnToStaff").getText()
				.contentEquals(ReturnedToStaffMember));
		MiscUtils.sleep(3000);
		JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText("TestCollaborationReturnToStaff"));
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
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
		nativeViewDashPage.enterTextImpersntSearchBox("Diego Juarez");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		nerdDynamicXpaths.deleteButtonReturnedToStaffMember("TestCollaborationReturnToStaff").click();
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Given("a published Collaboration started by a Program Staff has been returned to the DOC Planning Contact")
	public void a_published_Collaboration_started_by_a_Program_Staff_has_been_returned_to_the_DOC_Planning_Contact()
			throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.titleTextBox.sendKeys("TestingAuthorSubmission");
		CommonUtils.selectDropDownValue("New", createNewSubmissionPage.pleaseSpecifyDropDown);
		createNewSubmissionPage.acronymTextBox.sendKeys("Testing");
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fiscalYearDropDown);
		CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
		createNewSubmissionPage.DescriptionTextBox.sendKeys("Testing");
		WebDriverUtils.webDriver.switchTo().defaultContent();
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown);
		CommonUtils.selectDropDownValue("CBIIT", createNewSubmissionPage.leadDOCDropDown);
		createNewSubmissionPage.otherDOCsCBIITCheckBox.click();
		createNewSubmissionPage.pocTextBox.sendKeys("Testing");
		createNewSubmissionPage.ReferencesTextBox.sendKeys("Test");
		CommonUtils.selectDropDownValue("CC", createNewSubmissionPage.nihICs_ODcollaboratorsDropDown);
		CommonUtils.selectDropDownValue("ACF", createNewSubmissionPage.hhsAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Commerce", createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("No Tribal/State/Local/Government Collaborators",
				createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Health Canada",
				createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("American Society for Microbiology (ASM)",
				createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown);
		createNewSubmissionPage.selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("Yes",
				createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown);
		CommonUtils.selectDropDownValue("Yes", createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown);
		createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("1.1 Fundamental Science",
				createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue("1.2 Treatment and Cures",
				createNewSubmissionPage.nihStrategicAlignment_SecondaryOptional_DropDown);
		CommonUtils.selectDropDownValue(
				"1.4: Strengthen and expand the healthcare workforce to meet America's diverse needs",
				createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue(
				"3.2: Safeguard the public against preventable injuries and violence or their results",
				createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown);
		createNewSubmissionPage.submitButton.click();
		MiscUtils.sleep(2000);
		createNewSubmissionPage.popUpConfirmationYesButton.click();
		MiscUtils.sleep(3000);
		createNewSubmissionPage.informationDialogPopUpOKbutton.click();
		MiscUtils.sleep(3000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(3000);
		nativeViewDashPage.enterTextImpersntSearchBox("Karen Ortner");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.submitToCRSButton("TestingAuthorSubmission").click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(2000);
		nativeViewDashPage.enterTextImpersntSearchBox("Grace Liou");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenu.click();
		CommonUtils.selectValueFromBootStrapDropDown(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageDropDownMenuValues,
				"Submissions");
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
		MiscUtils.sleep(4000);
		nerdDynamicXpaths.publishToNERDButton("TestingAuthorSubmission").click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
		JavascriptUtils.clickByJS(nerdDynamicXpaths.returnButton("TestingAuthorSubmission"));
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowTextField
				.sendKeys("Testing Return AuthorSubmission");
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNpopUpWindowYESbutton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
	}

	@Given("the DOC Planning Contact returns the Collaboration to the Program Staff")
	public void the_DOC_Planning_Contact_returns_the_Collaboration_to_the_Program_Staff() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(3000);
		nativeViewDashPage.enterTextImpersntSearchBox("Karen Ortner");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.returnButtonToStaff("TestingAuthorSubmission").click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowDropDown.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowForSearchStaffMemberTextField
				.sendKeys("Diego Juarez");
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowResultsTextField.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
				.sendKeys("Return TestAuthor to Staff Member");
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmReturnYesButton.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(2000);
	}

	@Then("the author will show as the Program Staff user who originally created the Submission")
	public void the_author_will_show_as_the_Program_Staff_user_who_originally_created_the_Submission()
			throws TestingException {
		String authorExpected = nerdDynamicXpaths.authorTextDocSubmission("TestingAuthorSubmission").getText();
		MiscUtils.sleep(3000);
		Assert.assertEquals(authorExpected,
				nerdDynamicXpaths.authorTextDocSubmission("TestingAuthorSubmission").getText());
		MiscUtils.sleep(3000);
		JavascriptUtils.drawBlueBorder(nerdDynamicXpaths.authorTextDocSubmission("TestingAuthorSubmission"));
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(5000);
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
		nativeViewDashPage.enterTextImpersntSearchBox("Diego Juarez");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		nerdDynamicXpaths.deleteButtonReturnedToStaffMember("TestingAuthorSubmission").click();
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Given("a DOC Planning Contact creates a Collaboration")
	public void a_DOC_Planning_Contact_creates_a_Collaboration() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(1000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(3000);
		nativeViewDashPage.enterTextImpersntSearchBox("Karen Ortner");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.titleTextBox.sendKeys("DOCPlanContactCreateCollabarationSubmission");
		CommonUtils.selectDropDownValue("New", createNewSubmissionPage.pleaseSpecifyDropDown);
		createNewSubmissionPage.acronymTextBox.sendKeys("Testing");
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fiscalYearDropDown);
		CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
		createNewSubmissionPage.DescriptionTextBox.sendKeys("Testing");
		WebDriverUtils.webDriver.switchTo().defaultContent();
		CommonUtils.selectDropDownValue("2021", createNewSubmissionPage.fyTheCollaborativeActivityOriginatedDropDown);
		CommonUtils.selectDropDownValue("CBIIT", createNewSubmissionPage.leadDOCDropDown);
		createNewSubmissionPage.otherDOCsCBIITCheckBox.click();
		createNewSubmissionPage.pocTextBox.sendKeys("Testing");
		createNewSubmissionPage.ReferencesTextBox.sendKeys("Test");
		CommonUtils.selectDropDownValue("CC", createNewSubmissionPage.nihICs_ODcollaboratorsDropDown);
		CommonUtils.selectDropDownValue("ACF", createNewSubmissionPage.hhsAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Commerce", createNewSubmissionPage.otherFederalAgencyCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("No Tribal/State/Local/Government Collaborators",
				createNewSubmissionPage.tribalStateLocalGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("Health Canada",
				createNewSubmissionPage.foreignGovernmentCollaboratorsDropDown);
		CommonUtils.selectDropDownValue("American Society for Microbiology (ASM)",
				createNewSubmissionPage.nonGovernmentalCollaboratorsDropDown);
		createNewSubmissionPage.selectTypeOfCollaborativeActivityListResourceDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("Yes",
				createNewSubmissionPage.isThisCollaborationRelatedToRegulatoryActivityDropDown);
		CommonUtils.selectDropDownValue("Yes", createNewSubmissionPage.wasNIHFundingProvidedForThisActivityDropDown);
		createNewSubmissionPage.productsOutputsListResearchToolDevelopmentCheckBox.click();
		CommonUtils.selectDropDownValue("1.1 Fundamental Science",
				createNewSubmissionPage.nihStrategicAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue("1.2 Treatment and Cures",
				createNewSubmissionPage.nihStrategicAlignment_SecondaryOptional_DropDown);
		CommonUtils.selectDropDownValue(
				"1.4: Strengthen and expand the healthcare workforce to meet America's diverse needs",
				createNewSubmissionPage.hhsStrategicPlanAlignment_Primary_DropDown);
		CommonUtils.selectDropDownValue(
				"3.2: Safeguard the public against preventable injuries and violence or their results",
				createNewSubmissionPage.hhsStrategicPlanAlignment_SecondaryOptional_DropDown);
		nerdCrsKnowledgeDatabaseSubmissionsPage.saveButtonNewSubmissionDOCplanning.click();
		MiscUtils.sleep(2000);
		createNewSubmissionPage.informationDialogPopUpOKbutton.click();
		MiscUtils.sleep(3000);
	}

	@Then("they are able to return the Collaboration to a Program Staff user")
	public void they_are_able_to_return_the_Collaboration_to_a_Program_Staff_user() throws TestingException {
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(4000);
		nerdDynamicXpaths.returnButtonToStaff("DOCPlanContactCreateCollabarationSubmission").click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowDropDown.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowForSearchStaffMemberTextField
				.sendKeys("Diego Juarez");
		MiscUtils.sleep(4000);
		CucumberLogUtils.logScreenShot();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowResultsTextField.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
				.sendKeys("Return Test Submission to Staff Member");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmReturnYesButton.click();
		MiscUtils.sleep(2000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(2000);
		Assert.assertTrue(nerdDynamicXpaths.returnedToStaffMemberText("DOCPlanContactCreateCollabarationSubmission")
				.getText().contentEquals("Returned to Staff Member"));
		MiscUtils.sleep(2000);
		JavascriptUtils.drawBlueBorder(
				nerdDynamicXpaths.returnedToStaffMemberText("DOCPlanContactCreateCollabarationSubmission"));
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(4000);
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
		nativeViewDashPage.enterTextImpersntSearchBox("Diego Juarez");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		nerdDynamicXpaths.deleteButtonReturnedToStaffMember("DOCPlanContactCreateCollabarationSubmission").click();
		MiscUtils.sleep(1000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

}
