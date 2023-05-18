package ServiceNow.CHARMS.Steps;

import java.io.FileNotFoundException;
import java.util.Set;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.CHARMS.alljava.ParticipantPersonalInformation;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FanconiEligibilityQuestionnaireSteps extends PageInitializer {
	



	@Then("fills the Fanconi Eligibility Questionnaire form")
	public void fills_the_Fanconi_Eligibility_Questionnaire_form() {

		Set<String> allWindowHandles = WebDriverUtils.webDriver.getWindowHandles();
		for (String currentWindow : allWindowHandles) {
			WebDriverUtils.webDriver.switchTo().window(currentWindow);
		}

		MiscUtils.sleep(1000);
		JavascriptUtils.scrollIntoView(fanconiEligibilityQuestionnairePage.nextButton);
		CommonUtils.waitForVisibility(fanconiEligibilityQuestionnairePage.nextButton);
		MiscUtils.sleep(2000);
		// JavascriptUtils.clickByJS(fanconiEligibilityQuestionnairePage.nextButton);
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(1000);
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(1000);
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(1000);
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(1000);
		fanconiEligibilityQuestionnairePage.nextButton.click();
		MiscUtils.sleep(1000);
		fanconiEligibilityQuestionnairePage.nextButton.click();
		
		
		 
		
		//ParticipantPersonalInformation participantPersonalInformation = new ParticipantPersonalInformation();
	//	 participantPersonalInformation.setFirstName("Tester"); 
		 
		

	}

}
