package ServiceNow.COVIDCode.StepsImplementation;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.COVIDCode.Pages.COVIDCodeLoginPage;
import appsCommon.PageInitializer;

public class FollowUpFormPageImpl extends PageInitializer{
	
	public void accessingFollowUpForm() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		//covidCodeLoginPage.accessAndCompleteFollowUpQuestionnaireButton.click();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		//ADDING TEMPORARY WORK AROUND TO LOG INTO FOLLOW UP FORM
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		covidCodeLoginPage.accessAndCompleteFollowUpQuestionnaireButton.click();
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
	
	public void verifyingExposuresAndRiskFactorsQuestion(String patientsSelfReportedHealth, String medicalConditionsText, String patientCancerTypeText, String immunizationsUpToDateText, String patientReceivedVaccinationsText, String patientsWalkingPaceText, String hoursSpentSittingText, String patientVapeCigarettesText, String patientSmokeAtLeast100cigarettesText, String patientConsumeAlcoholicBeveragesText, String hoursSpentExercisingText) {
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsSelfReportedHealthQuestionText.getText().contentEquals(patientsSelfReportedHealth));
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsMedicalConditionsQuestionText.getText().contentEquals(medicalConditionsText));
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsCancerQuestionText.getText().contentEquals(patientCancerTypeText));
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsImmunizationsQuestionText.getText().contentEquals(immunizationsUpToDateText));
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsVacinationsReceivedQuestionText.getText().contentEquals(patientReceivedVaccinationsText));
		CucumberLogUtils.logScreenShot();
		Assert.assertTrue(followUpFormPage.exposiresAndRiskFactorsWalkingPaceQuestionText.getText().contentEquals(patientsWalkingPaceText));
		JavascriptUtils.scrollIntoView(followUpFormPage.exposuresAndRiskFactorsHoursSpentSittingQuestionText);
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsHoursSpentSittingQuestionText.getText().contentEquals(hoursSpentSittingText));
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(followUpFormPage.exposureAndRiskFactorsVapeHabit);
		Assert.assertTrue(followUpFormPage.exposureAndRiskFactorsVapeHabit.getText().contentEquals(patientVapeCigarettesText));
		Assert.assertTrue(followUpFormPage.exposureAndRiskFactorsSmokeQuestionText.getText().contentEquals(patientSmokeAtLeast100cigarettesText));
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsAlcoholConsumptionQuestionText.getText().contentEquals(patientConsumeAlcoholicBeveragesText));
		JavascriptUtils.scrollIntoView(followUpFormPage.exposuresAndRiskFactorsHoursPerWeekSpentQuestionText);
		Assert.assertTrue(followUpFormPage.exposuresAndRiskFactorsHoursPerWeekSpentQuestionText.getText().contentEquals(hoursSpentExercisingText));
		CucumberLogUtils.logScreenShot();
	}

}
