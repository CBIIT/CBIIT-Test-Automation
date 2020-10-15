package ServiceNow.CHARMS.StepsImplementation;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;

public class CHARMSHomePageImp extends PageInitializer {
	
	public void charmsLogin() {
		charmsHomePage.loginButton.click();
		oktaLoginPage.usernameTxtBox.sendKeys("diegojuarezbusiness@gmail.com");
		oktaLoginPage.nextButton.click();
		oktaLoginPage.passwordTxtBox.sendKeys("EDM4life99");
		CucumberLogUtils.logScreenShot();
		oktaLoginPage.loginBtn.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(clinicalGeneticsBranchPage.charmsAgreeBtn);
		
		
		
	}

}
