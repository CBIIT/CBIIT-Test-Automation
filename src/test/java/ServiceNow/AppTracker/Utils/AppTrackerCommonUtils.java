package ServiceNow.AppTracker.Utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nci.automation.web.WebDriverUtils;

public class AppTrackerCommonUtils  extends WebDriverUtils{

	public static void waitBrowser(int ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void waitUtilsAlertIsPresent(long timeOut) {
		WebDriverWait webDriverWait = new WebDriverWait(webDriver,timeOut);
		webDriverWait.until(ExpectedConditions.alertIsPresent());
	
}
	}