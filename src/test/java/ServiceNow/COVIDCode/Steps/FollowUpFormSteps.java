package ServiceNow.COVIDCode.Steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FollowUpFormSteps extends PageInitializer {

	@When("a COVIDCode user accesses a Follow Up Form to update an existing enrollment")
	public void a_COVIDCode_user_accesses_a_Follow_Up_Form_to_update_an_existing_enrollment() throws TestingException {		
		followUpFormPageImpl.accessingFollowUpForm();
	}

	@Then("the question {string} should display in the demographics section")
	public void the_question_should_display_in_the_demographics_section(String questionText) {
		String txt = followUpFormPage.whatIsHighestEducationLevelCompleted.getText();
		Assert.assertTrue(txt.contentEquals(questionText));
		JavascriptUtils.scrollDown(2000);
		CucumberLogUtils.logScreenShot();		
	}
	
	@Given("a COVIDCode user is on the Follow Up Form to update an existing enrollment")
	public void a_COVIDCode_user_is_on_the_Follow_Up_Form_to_update_an_existing_enrollment() throws TestingException {	
		followUpFormPageImpl.accessingFollowUpForm();	
	}

	@Then("the user is able to search an existing enrollment by patient ID, last name, first name, or NIH Medical Record Number")
	public void the_user_is_able_to_search_an_existing_enrollment_by_patient_ID_last_name_first_name_or_NIH_Medical_Record_Number() {
		followUpFormPageImpl.searchEnrollmentByPatientIDLastNameFirstNameNIHMedicalRecordNumber();	
	}

	@Given("a COVIDCode Provider is on the Follow Up Form to update an existing enrollment")
	public void a_COVIDCode_Provider_is_on_the_Follow_Up_Form_to_update_an_existing_enrollment() throws TestingException {
		followUpFormPageImpl.accessingFollowUpForm();
	}

	@When("an enrollment is selected")
	public void an_enrollment_is_selected() {
		followUpFormPage.enrollmentSearchDropDown.click();
		followUpFormPage.enrollmentSearchTxtBox.sendKeys("AutomatedFN");	
		MiscUtils.sleep(3000);
		followUpFormPage.enrollmentSearchTxtBox.sendKeys(Keys.ENTER);
		CucumberLogUtils.logScreenShot();
	}

	@Then("the Group ID and Hospital Code fields should be locked")
	public void the_Group_ID_and_Hospital_Code_fields_should_be_locked() {
		Assert.assertTrue(followUpFormPage.userGroupID.getAttribute("disabled").contentEquals("true"));
		Assert.assertTrue(followUpFormPage.hostHospitalCode.getAttribute("disabled").contentEquals("true"));
		CucumberLogUtils.logScreenShot();
	}

}
