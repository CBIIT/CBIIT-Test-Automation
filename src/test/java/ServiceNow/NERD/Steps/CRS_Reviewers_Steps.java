package ServiceNow.NERD.Steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CRS_Reviewers_Steps extends PageInitializer {

	@Given("a CRS Reviewer is on the NERD Knowledge Base page")
	public void a_CRS_Reviewer_is_on_the_NERD_Knowledge_Base_page() throws TestingException {
		nerdLoginStepsImplementation.loginToNerd();
		nativeViewImpersonateUser.impersonateToCRSReviewer();
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
		MiscUtils.sleep(8000);
		CucumberLogUtils.logScreenShot();
	}

	@Given("clicks the {string} filter")
	public void clicks_the_filter(String SpecificTopic) {
		Assert.assertTrue(
				nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD.getText().contentEquals(SpecificTopic));
		JavascriptUtils.clickByJS(nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot(); 
	}

	@Then("the field options are {string}, {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string}, {string}, {string}, {string}, and {string}")
	public void the_field_options_are_and(String All, String BigdataDataSharing, String COVID19, String Communications,
			String EarlyDetection, String Metastatic, String MinorityhealthHealthdisparities, String Moonshot,
			String Partnerships, String Pediatric, String Rare, String SexGenderdifferences,
			String TrainingWorkforcedevelopment, String Womenshealth, String Workforce) {

		String[] expectedValues = { All, BigdataDataSharing, COVID19, Communications, EarlyDetection, Metastatic,
				MinorityhealthHealthdisparities, Moonshot, Partnerships, Pediatric, Rare, SexGenderdifferences,
				TrainingWorkforcedevelopment, Womenshealth, Workforce };
		int count = 0;
		for (WebElement actualValues : nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDDvalues) {
			count++;
			Assert.assertTrue(actualValues.getText().contains(expectedValues[count - 1]));
		}
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();

	}
}