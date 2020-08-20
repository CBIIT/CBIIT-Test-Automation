package appsCommon;

import org.openqa.selenium.By;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class NativeViewLoginImpl extends PageInitializer {
	
	public void nativeViewLogin() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		CucumberLogUtils.logScreenShot();
		WebDriverUtils.webDriver.findElement(By.linkText("Log in")).click();
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		CucumberLogUtils.logScreenShot();
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
	}

}
