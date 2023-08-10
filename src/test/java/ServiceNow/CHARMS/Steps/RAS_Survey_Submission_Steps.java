package ServiceNow.CHARMS.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import java.util.Set;
import com.nci.automation.web.WebDriverUtils;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;

public class RAS_Survey_Submission_Steps extends PageInitializer {

	static String rasSurveyPin;

	@Given("enters Okta email address {string} and One Time Pin code to proceed with the RAS Survey")
	public void enters_Okta_email_address_and_One_Time_Pin_code_to_proceed_with_the_RAS_Survey(
			String oktaEmailAddress) {

		/**
		 * USING SAME PIN TEXT AND GO BUTTON LOCATORS AS CGB IIQ SINCE THEY ARE THE SAME
		 */
		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText);

		rasSurveyPin = myRASHomePage.rasoptathyIndividualInformationQuestionnairePinText.getText();

		CommonUtils.waitForVisibility(myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton);
		myRASHomePage.rasoptathyIndividualInformationQuestionnaireOneTimePinGoButton.click();

		Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow1 : allWindowHandles1) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow1);
		}

		MiscUtils.sleep(1000);
		CommonUtils.waitForVisibility(rASSurveyPage.cHARMSEmailLogIn);
		rASSurveyPage.cHARMSEmailLogIn.sendKeys("charmsras5@yahoo.com");
		rASSurveyPage.cHARMSpasswordToLogIn.sendKeys(rasSurveyPin);
		CucumberLogUtils.logScreenshot();
		rASSurveyPage.surveyNextButton.click();
	}


}
