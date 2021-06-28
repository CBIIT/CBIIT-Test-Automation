package appsCommon;

import org.openqa.selenium.By;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
<<<<<<< HEAD
=======
import com.nci.automation.web.JavascriptUtils;
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class NativeViewLoginImpl extends PageInitializer {
	
	public void nativeViewLogin() throws TestingException {
		MiscUtils.sleep(3000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
<<<<<<< HEAD
		WebDriverUtils.webDriver.findElement(By.linkText("Log in")).click();
=======
		JavascriptUtils.clickByJS(WebDriverUtils.webDriver.findElement(By.linkText("Log in")));
		/** ----- Review Safari locators ----- */
		//JavascriptUtils.clickByJS(WebDriverUtils.webDriver.findElement(By.xpath("//a[@href='/ncisp?id=nci_landing']")));
		//WebDriverUtils.webDriver.findElement(By.linkText("Log in")).click();
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
	}

}
