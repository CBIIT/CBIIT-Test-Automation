package ServiceNow.COVIDDash.Steps;

import com.nci.automation.xceptions.TestingException;

import appsCommon.PageCache;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;




public class ITrustLoginPageSteps extends PageInitializer {
	
	private static PageCache pageCache=PageCache.getInstance();
	
	
	@When("logs in by entering iTrust credentials")
	public void logs_in_by_entering_iTrust_credentials() throws TestingException {
		pageCache.getITrustLoginPageImpl().loginToITrust();
	}

}
