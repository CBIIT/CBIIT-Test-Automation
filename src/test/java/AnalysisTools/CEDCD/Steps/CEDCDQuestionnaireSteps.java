package AnalysisTools.CEDCD.Steps;

import javax.swing.plaf.basic.BasicArrowButton;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import AnalysisTools.CEDCD.Pages.CEDCDSearchCohortsPage;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CEDCDQuestionnaireSteps extends PageInitializer {
	
	@Given("the user is on the CEDCD homepage")
	public void the_user_is_on_the_CEDCD_homepage() {
		try {
			WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CEDCD"));
		} catch (TestingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("the user is logged in as Admin")
	public void the_user_is_logged_in_as_Admin() {
		cedcdAdminPage.nihLoginBtn.click();
		cedcdAdminPage.internalUsernameTxtBox.sendKeys("uddins2");
		cedcdAdminPage.internalPasswordTxtBox.sendKeys("Areeb2007!");
		cedcdAdminPage.loginSubmitBtn.click();
	}
	
	@When("user selects add new Cohort")
	public void user_selects_add_new_Cohort() {
		cedcdAdminPage.addNewCohortlnk.click();
		
		
	}
	
	@When("enters Cohort Name as {string}")
	public void enters_Cohort_Name_as(String cohortName) {
		cedcdAdminPage.cohortNameTxtBox.sendKeys(cohortName);
	}
	
	@When("enters Cohort Acronym as {string}")
	public void enters_Cohort_Acronym_as(String cohortAcronym) {
		cedcdAdminPage.cohortAcroynmTxtBox.sendKeys(cohortAcronym);
	}
	
	@When("enters Cohort Owner")
	public void enters_Cohort_Owner() {
		Actions act = new Actions(WebDriverUtils.webDriver);
		act.doubleClick(cedcdAdminPage.cohortOwnerTxtBox);
		MiscUtils.sleep(1000);
		cedcdAdminPage.cohortOwnerTxtBox.sendKeys("Diego");
		cedcdAdminPage.cohortOwnerTxtBox.sendKeys(Keys.RETURN);
	
		
	}
	
	@When("enters {string}")
	public void enters(String notes) {
		cedcdAdminPage.notesTxtBox.sendKeys(notes);
	}
	
	@When("clicks submit")
	public void clicks_submit() {
		cedcdAdminPage.cohortSubmitBtn.click();
	}
	
	@Then("Cohort is added")
	public void Cohort_is_added() {
		
	}
	

}
