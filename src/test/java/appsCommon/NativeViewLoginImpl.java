package appsCommon;

import org.openqa.selenium.By;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class NativeViewLoginImpl extends PageInitializer {
	
	public void nativeViewLogin() throws TestingException {
		MiscUtils.sleep(3000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.clickByJS(WebDriverUtils.webDriver.findElement(By.linkText("Log in")));
		/** ----- Review Safari locators ----- */
		//JavascriptUtils.clickByJS(WebDriverUtils.webDriver.findElement(By.xpath("//a[@href='/ncisp?id=nci_landing']")));
		//WebDriverUtils.webDriver.findElement(By.linkText("Log in")).click();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
	}

}
