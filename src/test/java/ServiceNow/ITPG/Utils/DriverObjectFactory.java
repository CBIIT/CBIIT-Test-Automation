package ServiceNow.ITPG.Utils;

import org.openqa.selenium.WebDriver;
import com.nci.automation.web.WebDriverUtils;

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
		driver = WebDriverUtils.webDriver;
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver=null;
		}
	}
}
