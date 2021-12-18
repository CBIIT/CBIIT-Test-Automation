package appsCommon;

import org.openqa.selenium.By;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class NativeViewLoginImpl extends PageInitializer {
	
	public void nativeViewLogin() throws TestingException {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.waitForVisibility(iTrustloginPage.loginLink);
		iTrustloginPage.loginLink.click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.linkText("Native View")));
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
	}

}
