
package ServiceNow.COVIDCode.StepsImplementation;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import appsCommon.PageInitializer;

public class ServicePortalQuestionnairePageImp extends PageInitializer {

	public void startNewInitialQuestionnaire() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		servicePortalQuestionnairePage.startNewInitialQuestionnaireButton.click();
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		servicePortalQuestionnairePage.enrollmentCreationUserGroupIDSelectDropDown.click();
		List<WebElement> groupIDs = servicePortalQuestionnairePage.enrollmentCreationUserGroupIDValues;
		CommonUtils.selectValueFromBootStrapDropDown(groupIDs, "User Group 1");
		servicePortalQuestionnairePage.createEnrollmentButton.click();

	}

	public void startNewFollowUpQuestionnaire() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("COVIDCode"));
		CucumberLogUtils.logScreenShot();
		covidCodeLoginPage.LogInButton.click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		servicePortalQuestionnairePage.startNewFollowUpButton.click();
		CucumberLogUtils.logScreenShot();
		servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchDropDown.click();
		CommonUtils.selectValueFromBootStrapDropDown(
				servicePortalQuestionnairePage.enrollmentLookUpPatientIDSearchValues, "HCC0001198");

	}

	public void fillOutContactInfo() {
		covidCodeEQPage.enrollmentQuestionnairePatientLastNameTextBox.sendKeys("AutomatedLN");
		covidCodeEQPage.enrollmentQuestionnairePatientFirstNameTextBox.sendKeys("AutomatedFNGroup1");
		covidCodeEQPage.enrollmentQuestionnairePatientMiddletNameTextBox.sendKeys("M");
		MiscUtils.sleep(3000);
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
