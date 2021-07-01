package ServiceNow.ATO.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.nci.automation.web.WebDriverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverObjectFactory {
	private static WebDriver driver;
	private static String browserName = "chrome";
	private DriverObjectFactory() {

	}

	public static WebDriver getWebDriver() {
		/*if (driver == null) {
			if(browserName.equals("safari")) {
				driver = new SafariDriver();
			}
			else if(browserName.equals("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}else {
				driver = new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}*/
		driver = WebDriverUtils.getWebDriver();
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver=null;
		}
	}
}
