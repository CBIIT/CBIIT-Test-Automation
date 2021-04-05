package ServiceNow.NERD.Steps;

import org.junit.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TopAccomplishmentsSubmissionSteps extends PageInitializer{
	
	@Given("a Program Staff member is on the CRS Knowledge Management System page")
	public void a_Program_Staff_member_is_on_the_CRS_Knowledge_Management_System_page() 
			throws TestingException{
		nerdLoginStepsImplementation.loginToNerd();
	   
		
	}

	@When("the Program Staff Member clicks on {string} for Top Accomplishments")
	public void the_Program_Staff_Member_clicks_on_for_Top_Accomplishments(String string) 
			throws TestingException{
		CommonUtils.click(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentsCreateNewSubmissionLink);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		Assert.assertEquals("Create New Submission", createNewSubmissionPage.crsKnowledgeManagementSystemCreateNewSubmissionBreadcrumb.getText());
	    CucumberLogUtils.logScreenShot();
	}

	@When("fills out all required fields")
	public void fills_out_all_required_fields() 
			throws TestingException{
	    CommonUtils.click(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentFiscalYear2019);
	    MiscUtils.sleep(2000);
	    CommonUtils.sendKeys(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentTitle, "AutomationTest");
	    MiscUtils.sleep(2000);
	    CommonUtils.selectDropDownValue(createNewSubmissionPage.leadDOCDropDown, "CBIIT");
	    CucumberLogUtils.logScreenShot();
	    MiscUtils.sleep(4000);
	    CommonUtils.switchToFrame(createNewSubmissionPage.DescriptionTextBoxIframe);
		createNewSubmissionPage.DescriptionTextBox.sendKeys("Testing");
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.switchTo().defaultContent();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentResearchType);
		MiscUtils.sleep(2000);
		CommonUtils.selectDropDownValue(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentResearchType, "Basic");
	    CucumberLogUtils.logScreenShot();
	    
	}

	@Then("the Program Staff Member is able to Save the submission")
	public void the_Program_Staff_Member_is_able_to_Save_the_submission() 
			throws TestingException{
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentNewSubmissionSaveButton);
		MiscUtils.sleep(2000);
	    CommonUtils.click(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentNewSubmissionSaveButton);
	    CucumberLogUtils.logScreenShot();
	    MiscUtils.sleep(2000);
	    CommonUtils.click(createNewSubmissionPage.popUpSubmissionConfirmationOkButton);
	    CucumberLogUtils.logScreenShot();
		
	}

	@Then("on the CRS Knowledge Management System page, the Program Staff member sees options to Submit, Edit, and Delete")
	public void on_the_CRS_Knowledge_Management_System_page_the_Program_Staff_member_sees_options_to_Submit_Edit_and_Delete() 
			throws TestingException{
		WebDriverUtils.webDriver.navigate().refresh();
		Assert.assertEquals("Submissions", nerdCrsKnowledgeDatabaseSubmissionsPage.topSubmisionsName.getText());
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.topAccomplishmentSubmissionsPageLink);
		MiscUtils.sleep(2000);
	    Assert.assertTrue(nerdDynamicXpaths.submitToCRSButton("AutomationTest").isDisplayed());
	    Assert.assertTrue(nerdDynamicXpaths.submitToCRSButton("AutomationTest").isEnabled());
	    Assert.assertEquals("Submit", nerdDynamicXpaths.submitToCRSButton("AutomationTest").getText());
	    Assert.assertTrue(nerdDynamicXpaths.eiditCRSButton("AutomationTest").isDisplayed());
	    Assert.assertTrue(nerdDynamicXpaths.eiditCRSButton("AutomationTest").isEnabled());
	    Assert.assertEquals("Edit", nerdDynamicXpaths.eiditCRSButton("AutomationTest").getText());
	    Assert.assertTrue(nerdDynamicXpaths.deleteCRSButton("AutomationTest").isDisplayed());
	    Assert.assertTrue(nerdDynamicXpaths.deleteCRSButton("AutomationTest").isEnabled());
	    Assert.assertEquals("Delete", nerdDynamicXpaths.deleteCRSButton("AutomationTest").getText());
	    CucumberLogUtils.logScreenShot();
	    MiscUtils.sleep(2000);
	    CommonUtils.click(nerdDynamicXpaths.deleteCRSButton("AutomationTest"));
	    MiscUtils.sleep(2000);
	    CucumberLogUtils.logScreenShot();
	    CommonUtils.click(createNewSubmissionPage.crsKnowledgeManagementSystemConfirmDeleteButton);
	    MiscUtils.sleep(2000);
	    CucumberLogUtils.logScreenShot();
	    CommonUtils.click(createNewSubmissionPage.informationDialogPopUpOKbutton);
	    MiscUtils.sleep(2000);
	    CucumberLogUtils.logScreenShot();
	}

}
