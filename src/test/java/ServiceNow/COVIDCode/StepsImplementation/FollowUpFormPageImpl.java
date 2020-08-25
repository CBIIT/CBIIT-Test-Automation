package ServiceNow.COVIDCode.StepsImplementation;

import org.openqa.selenium.Keys;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;

public class FollowUpFormPageImpl extends PageInitializer{
	
	public void accessingFollowUpForm() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.accessAndCompleteFollowUpQuestionnaireButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}
	
	public void searchEnrollmentByPatientIDLastNameFirstNameNIHMedicalRecordNumber() {
		followUpFormPage.enrollmentSearchDropDown.click();
		followUpFormPage.enrollmentSearchTxtBox.sendKeys("AutomatedFN");	
		MiscUtils.sleep(3000);
		followUpFormPage.enrollmentSearchTxtBox.sendKeys(Keys.ENTER);
		CucumberLogUtils.logScreenShot();
		followUpFormPage.enrollmentSearchXbutton.click();
		followUpFormPage.enrollmentSearchDropDown.click();
		followUpFormPage.enrollmentSearchTxtBox.sendKeys("NVAutomatedLN");
		MiscUtils.sleep(3000);
		followUpFormPage.enrollmentSearchTxtBox.sendKeys(Keys.ENTER);
		CucumberLogUtils.logScreenShot();
		followUpFormPage.enrollmentSearchXbutton.click();
		followUpFormPage.enrollmentSearchDropDown.click();
		followUpFormPage.enrollmentSearchTxtBox.sendKeys("HCC");
		MiscUtils.sleep(3000);
		followUpFormPage.enrollmentSearchTxtBox.sendKeys(Keys.ENTER);
		CucumberLogUtils.logScreenShot();
		followUpFormPage.enrollmentSearchXbutton.click();
	}
	
	public void accessingFollowUpFormDiseaseCourseSection() {
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCourseAddButton);
		CucumberLogUtils.logScreenShot();
		followUpFormPage.diseaseCourseAddButton.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

}
