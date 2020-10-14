package ServiceNow.CHARMS.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProbandLoginSteps extends PageInitializer {
	
	@Given("a Proband is on the CHARMS home page")
	public void a_Proband_is_on_the_CHARMS_home_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CHARMS"));
		CucumberLogUtils.logScreenShot();
	}

	@When("the Proband logs in with existing valid credentials")
	public void the_Proband_logs_in_with_existing_valid_credentials() {
		charmsHomePage.loginButton.click();
		oktaLoginPage.usernameTxtBox.sendKeys("ncitestautomation@gmail.com");
		oktaLoginPage.nextButton.click();
		oktaLoginPage.passwordTxtBox.sendKeys("TESTAutomation1990!");
		CucumberLogUtils.logScreenShot();
	}

	@Then("the Proband is directed to the Clinical Genetics Branch page")
	public void the_Proband_is_directed_to_the_Clinical_Genetics_Branch_page() {
	}


}
