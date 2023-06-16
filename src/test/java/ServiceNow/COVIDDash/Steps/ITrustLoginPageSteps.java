package ServiceNow.COVIDDash.Steps;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageCache;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class ITrustLoginPageSteps extends PageInitializer {
	
	private static PageCache pageCache=PageCache.getInstance();
	
	
	@When("logs in by entering iTrust credentials")
	public void logs_in_by_entering_iTrust_credentials() throws TestingException {
		pageCache.getITrustLoginPageImpl().loginToITrust();
		CucumberLogUtils.logScreenShot();
	}

}
