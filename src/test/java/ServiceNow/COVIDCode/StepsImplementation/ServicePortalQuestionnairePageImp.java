
package ServiceNow.COVIDCode.StepsImplementation;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.junit.Assert;
import APPS_COMMON.PageInitializers.PageInitializer;

public class ServicePortalQuestionnairePageImp extends PageInitializer {

	public void startNewInitialQuestionnaire()  {
		WebDriverUtils.webDriver.get("");
		CucumberLogUtils.logScreenshot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenshot();
		iTrustLoginPageImpl.loginToITrust();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();

		CommonUtils.selectDropDownValue("User Group 1",
				servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown);
		// CommonUtils.selectDropDownValue(servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown,
		// " User Group 1");
		// servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown.click();
		// List<WebElement> groupIDs =
		// servicePortalQuestionnairePage.enrollmentCreationUserGroupIDValues;
		// CommonUtils.selectValueFromBootStrapDropDown(groupIDs, " User Group 1");
		CommonUtils.sleep(2000);

		servicePortalQuestionnairePage.createEnrollmentButton.click();

	}

	public void startNewFollowUpQuestionnaire()  {
		WebDriverUtils.webDriver.get("");
		CucumberLogUtils.logScreenshot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenshot();
		iTrustLoginPageImpl.loginToITrust();
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		CucumberLogUtils.logScreenshot();
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDown.click();
		CommonUtils.selectValueFromBootStrapDropDown(
				servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchValues, "HCC0001198");

	}

	public void fillOutContactInfo() {
		covidCodeEQPage.enrollmentQuestionnairePatientLastNameTextBox.sendKeys("AutomatedLN");
		covidCodeEQPage.enrollmentQuestionnairePatientFirstNameTextBox.sendKeys("AutomatedFNGroup1");
		covidCodeEQPage.enrollmentQuestionnairePatientMiddletNameTextBox.sendKeys("M");
		CommonUtils.sleep(3000);
		covidCodeEQPage.enrollmentQuestionnairePatientEmailAddressTextBox.sendKeys("email@email.com");
		covidCodeEQPage.enrollmentQuestionnairePatientPhoneNumberTextBox.sendKeys("2351456778");
		covidCodeEQPage.enrollmentQuestionnairePatientStreetAddress1TextBox.sendKeys("123 street");
	}

	public void turnBackToCOVIDcodeHomePage() {
		JavascriptUtils.scrollIntoView(covidCodeEQPage.COVIDcodeHomeButton);
		covidCodeEQPage.COVIDcodeHomeButton.click();

	}

	public void verifyingEnrollmentCreationPopUp(String enrollmentCreation, String userGroupID1, String userGroupID2,
			String userGroupId3) {
		Assert.assertTrue(
				servicePortalQuestionnairePage.enrollmentCreationTitle.getText().contentEquals(enrollmentCreation));

	}

}
