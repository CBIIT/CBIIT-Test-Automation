package ATO.Utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ReportUtil {
	
	public static void takeScreenShot(Scenario scenario, String screenshotName) {
		TakesScreenshot ts = (TakesScreenshot) DriverObjectFactory.getWebDriver();
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		
//		scenario.embed(screenshot, screenshotName);
	}


}