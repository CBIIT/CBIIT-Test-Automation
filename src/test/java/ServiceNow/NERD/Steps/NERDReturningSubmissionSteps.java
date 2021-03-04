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
		nerdDynamicXpaths.submitToCRSButton("TestingCRSReviewer").click();
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
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
	}

	@Then("the {string} and {string} field values are cleared and are required")
	public void the_and_field_values_are_cleared_and_are_required(String PleaseSpecify, String FiscalYear)
			throws TestingException {
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
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.submitToCRSButton("TestingCRSReviewer").click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(1000);
		Assert.assertTrue(nerdCrsKnowledgeDatabaseSubmissionsPage.requiredFieldsNeedToBeFilledInBeforeSubmissionText
				.getText().contentEquals("Required fields need to be filled in before submission."));
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
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
		createNewSubmissionPage.cancelButton.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.deleteButtonReturnedToStaffMember("TestingCRSReviewer").click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton.click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Then("the options available for the {string} field are {string}, {string}, {string}, and {string}")
	public void the_options_available_for_the_field_are_and(String PleaseSpecify, String Edited, String NocChange,
			String Ended, String NotLedByNCI) throws TestingException {
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
		createNewSubmissionPage.cancelButton.click();
		MiscUtils.sleep(1000);
		nerdDynamicXpaths.deleteButtonReturnedToStaffMember("TestingCRSReviewer").click();
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Given("a Collaboration has been submitted to the DOC Planning Contact")
	public void a_Collaboration_has_been_submitted_to_the_DOC_Planning_Contact() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
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
		nerdDynamicXpaths.deleteButton("TestingUnderReviewText").click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmDeleteYesButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(1000);
	}

	@Given("a published Collaboration has been returned to the Program Staff")
	public void a_published_Collaboration_has_been_returned_to_the_Program_Staff() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.click(
				nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsCreateNewSubmissionLink);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		createNewSubmissionPage.titleTextBox.sendKeys("TestingOneMajorVersionNumberChange");
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
		nerdDynamicXpaths.returnButtonToStaff("TestingOneMajorVersionNumberChange").click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowTextField
				.sendKeys("Testing Returning To The Program Staff");
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmRETURNtoStaffPopUpWindowYesButton.click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemSubmissionsPageCollaborationsLink.click();
		JavascriptUtils
				.drawBlueBorder(nerdDynamicXpaths.returnedToStaffMemberText("TestingOneMajorVersionNumberChange"));
	}

	@When("the Program Staff resubmits the article to the DOC Planning Contact")
	public void the_Program_Staff_resubmits_the_article_to_the_DOC_Planning_Contact() throws TestingException {
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
		nerdDynamicXpaths.submitButtonToDOCPlanningContact("TestingOneMajorVersionNumberChange").click();
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(2000);
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
		nerdDynamicXpaths.submitToCRSButton("TestingOneMajorVersionNumberChange").click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
	}

	@Then("the article is incremented one major version number")
	public void the_article_is_incremented_one_major_version_number() throws TestingException {
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
		nativeViewDashPage.enterTextImpersntSearchBox("Grace Liou");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(10000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.submissionsOrderByDropDown.click();
		MiscUtils.sleep(4000);
		nerdDynamicXpaths.publishToNERDButton("TestingCRSReviewer").click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.confirmSubmissionYesButton.click();
		MiscUtils.sleep(1000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.popUpOKbutton.click();
		MiscUtils.sleep(3000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageHOMEButton.click();
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
	}
}
