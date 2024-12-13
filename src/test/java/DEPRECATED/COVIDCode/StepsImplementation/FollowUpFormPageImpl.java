package DEPRECATED.COVIDCode.StepsImplementation;

import java.util.List;
import com.nci.automation.web.CommonUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;

public class FollowUpFormPageImpl extends PageInitializer{
	
	public void accessingFollowUpForm()  {
		WebDriverUtils.webDriver.get("");
		CucumberLogUtils.logScreenshot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenshot();
		iTrustLoginPageImpl.loginToITrust();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		//ADDING TEMPORARY WORK AROUND TO LOG INTO FOLLOW UP FORM
		WebDriverUtils.webDriver.get("");
		servicePortalQuestionnairePage.startNewFollowUpButton.click();

	}
	
	public void selectingExistingFollowUPEnrollment() {
		followUpFormPage.enrollmentSearchDropDown.click();
		CommonUtils.sleep(3000);
		followUpFormPage.enrollmentSearchTxtBox.sendKeys("AutomatedFN");
		CommonUtils.sleep(3000);
		followUpFormPage.enrollmentSearchTxtBox.sendKeys(Keys.ENTER);
		CucumberLogUtils.logScreenshot();
	}
	
	public void searchEnrollmentByPatientIDLastNameFirstNameNIHMedicalRecordNumber() {
		followUpFormPage.enrollmentSearchDropDown.click();
		followUpFormPage.enrollmentSearchTxtBox.sendKeys("AutomatedFN");	
		CommonUtils.sleep(3000);
		followUpFormPage.enrollmentSearchTxtBox.sendKeys(Keys.ENTER);
		CucumberLogUtils.logScreenshot();
		followUpFormPage.enrollmentSearchXbutton.click();
		followUpFormPage.enrollmentSearchDropDown.click();
		//followUpFormPage.enrollmentSearchTxtBox.sendKeys("NVAutomatedLN");
		List<WebElement>existingFormsList=followUpFormPage.enrollmentSearchValues;
		CommonUtils.sleep(3000);
		String name=existingFormsList.get(0).getText();
		followUpFormPage.enrollmentSearchTxtBox.sendKeys(name);
		followUpFormPage.enrollmentSearchValuesAfterInput.click();
		CucumberLogUtils.logScreenshot();
		followUpFormPage.enrollmentSearchXbutton.click();
		followUpFormPage.enrollmentSearchDropDown.click();
		followUpFormPage.enrollmentSearchTxtBox.sendKeys("HCC");
		CommonUtils.sleep(3000);
		followUpFormPage.enrollmentSearchTxtBox.sendKeys(Keys.ENTER);
		CucumberLogUtils.logScreenshot();
		followUpFormPage.enrollmentSearchXbutton.click();
	}
	
	public void searchEnrollmentByPatientID() {
		followUpFormPage.enrollmentSearchDropDown.click();
		followUpFormPage.enrollmentSearchTxtBox.sendKeys("AutomatedLN");	
		CommonUtils.sleep(3000);
		followUpFormPage.enrollmentSearchTxtBox.sendKeys(Keys.ENTER);
		CucumberLogUtils.logScreenshot();
	}
	public void accessingFollowUpFormDiseaseCourseSection() {
		JavascriptUtils.scrollIntoView(followUpFormPage.diseaseCourseNewButton);
		CucumberLogUtils.logScreenshot();
		followUpFormPage.diseaseCourseNewButton.click();
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}
	
	public void verifyingExposuresAndRiskFactorsQuestion(String patientsSelfReportedHealth, String medicalConditionsText, String patientCancerTypeText, String immunizationsUpToDateText, String patientReceivedVaccinationsText, String patientsWalkingPaceText, String hoursSpentSittingText, String patientVapeCigarettesText, String patientSmokeAtLeast100cigarettesText, String patientConsumeAlcoholicBeveragesText, String hoursSpentExercisingText) {
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsSelfReportedHealthQuestionText.getText().contentEquals(patientsSelfReportedHealth));
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsMedicalConditionsQuestionText.getText().contentEquals(medicalConditionsText));
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsCancerQuestionText.getText().contentEquals(patientCancerTypeText));
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsImmunizationsQuestionText.getText().contentEquals(immunizationsUpToDateText));
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsVacinationsReceivedQuestionText.getText().contentEquals(patientReceivedVaccinationsText));
		CucumberLogUtils.logScreenshot();
		Assert.assertTrue(followUpFormPage.exposiresAndRiskFactorsWalkingPaceQuestionText.getText().contentEquals(patientsWalkingPaceText));
		JavascriptUtils.scrollIntoView(followUpFormPage.exposuresAndRiskFactorsHoursSpentSittingQuestionText);
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsHoursSpentSittingQuestionText.getText().contentEquals(hoursSpentSittingText));
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(followUpFormPage.exposureAndRiskFactorsVapeHabit);
		Assert.assertTrue(followUpFormPage.exposureAndRiskFactorsVapeHabit.getText().contentEquals(patientVapeCigarettesText));
		Assert.assertTrue(followUpFormPage.exposureAndRiskFactorsSmokeQuestionText.getText().contentEquals(patientSmokeAtLeast100cigarettesText));
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsAlcoholConsumptionQuestionText.getText().contentEquals(patientConsumeAlcoholicBeveragesText));
		JavascriptUtils.scrollIntoView(followUpFormPage.exposuresAndRiskFactorsHoursPerWeekSpentQuestionText);
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsHoursPerWeekSpentQuestionText.getText().contentEquals(hoursSpentExercisingText));
		CucumberLogUtils.logScreenshot();
	}

}
