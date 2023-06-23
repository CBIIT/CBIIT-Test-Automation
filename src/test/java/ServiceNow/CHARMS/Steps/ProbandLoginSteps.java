package ServiceNow.CHARMS.Steps;

import org.junit.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProbandLoginSteps extends PageInitializer {
	
	@Given("a Proband is on the CHARMS home page")
	public void a_Proband_is_on_the_CHARMS_home_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CHARMS"));
		CucumberLogUtils.logScreenShot();
	}

	@When("the Proband logs in with existing valid credentials")
	public void the_Proband_logs_in_with_existing_valid_credentials() {
		charmsHomePageImpl.charmsLogin();
		//added
	}
	
	@Then("the {string} page displays")
	public void the_page_displays(String clinicalGeneticsBranchText) {
		Assert.assertTrue(clinicalGeneticsBranchPage.clinicalGeneticsBranchText.getText().contentEquals(clinicalGeneticsBranchText));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}


}
