package ServiceNow.ATO.Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;



public class ReportUtil {
	
	public static void takeScreenShot(Scenario scenario, String screenshotName) {
		TakesScreenshot ts = (TakesScreenshot) DriverObjectFactory.getWebDriver();
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		
		scenario.embed(screenshot, screenshotName);
	}
	

}
