package CUSTOM_BUSINESS.DCEG.utils;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nci.automation.web.WebDriverUtils;

public class DCEGCommonUtils extends WebDriverUtils {
	public static void waitBrowser(int ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static void waitUtilsAlertIsPresent(long timeOut) {
		WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(timeOut));
		webDriverWait.until(ExpectedConditions.alertIsPresent());

	}
}
