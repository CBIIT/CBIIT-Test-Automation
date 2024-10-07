package ServiceNow.COVIDDash.Steps;

import com.nci.automation.utils.CucumberLogUtils;

import appsCommon.Utils.PageCache;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.When;




public class ITrustLoginPageSteps extends PageInitializer {
	
	private static PageCache pageCache=PageCache.getInstance();
	
	
	@When("logs in by entering iTrust credentials")
	public void logs_in_by_entering_iTrust_credentials()  {
		pageCache.getITrustLoginPageImpl().loginToITrust();
		CucumberLogUtils.logScreenshot();
	}

}
