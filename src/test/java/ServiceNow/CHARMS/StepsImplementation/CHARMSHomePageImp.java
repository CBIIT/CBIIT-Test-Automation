package ServiceNow.CHARMS.StepsImplementation;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.JavascriptUtils;
import appsCommon.PageInitializer;

public class CHARMSHomePageImp extends PageInitializer {
	
	public void charmsLogin() {
		MiscUtils.sleep(2000);
		charmsHomePage.loginButton.click();
		MiscUtils.sleep(2000);
		oktaLoginPage.usernameTxtBox.sendKeys("diegojuarezbusiness@gmail.com");
		MiscUtils.sleep(1000);
		oktaLoginPage.nextButton.click();
		MiscUtils.sleep(2000);
		oktaLoginPage.passwordTxtBox.sendKeys("EDM4life99");
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		oktaLoginPage.loginBtn.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(clinicalGeneticsBranchPage.charmsAgreeBtn);
		MiscUtils.sleep(2000);		
	}
}
