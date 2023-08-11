package com.nci.automation.web;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import com.nci.automation.utils.FrameworkConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import com.nci.automation.utils.LocalConfUtils;

/**
 * This class contains web driver related methods
 *
 * @author juarezds
 */
public class WebDriverUtils {

	private final static Logger logger = LogManager.getLogger(WebDriverUtils.class);
	public static WebDriver webDriver;

<<<<<<< HEAD
	public static WebDriver getWebDriver() {
=======
    public static void setUp() {
>>>>>>> 829249a15e6003b50d33d6afb09487b4f3b9cd62

		String browser = ConfUtils.getProperty("browser");
		String headless = ConfUtils.getProperty("headless");

<<<<<<< HEAD
		if (webDriver == null) {
			if (FrameworkConstants.BROWSER_CHROME.equalsIgnoreCase(browser)) {
				launchChrome();
			} else if (browser.equalsIgnoreCase(FrameworkConstants.BROWSER_FIREFOX)) {
				launchFirefox();
			} else if (browser.equalsIgnoreCase(FrameworkConstants.BROWSER_SAFARI)) {
				launchSafari();
			} else if (browser.equalsIgnoreCase(FrameworkConstants.BROWSER_EDGE)) {
				launchEdge();
			} else {
				return null;
			}
		}
		long implicitWaitInSeconds = Long.valueOf(LocalConfUtils.getProperty("implicitWaitInSeconds"));
		webDriver.manage().timeouts().implicitlyWait(implicitWaitInSeconds, TimeUnit.SECONDS);
		if (!FrameworkConstants.BROWSER_MOBILE.equalsIgnoreCase(browser)) {
			webDriver.manage().window().maximize();
		}
		return webDriver;
	}
=======
            if (FrameworkConstants.BROWSER_CHROME.equalsIgnoreCase(browser)) {
                launchChrome();
            } else if (browser.equalsIgnoreCase(FrameworkConstants.BROWSER_FIREFOX)) {
                launchFirefox();
            } else if (browser.equalsIgnoreCase(FrameworkConstants.BROWSER_SAFARI)) {
                launchSafari();
            } else if (browser.equalsIgnoreCase(FrameworkConstants.BROWSER_EDGE)) {
                launchEdge();
            } else {
                throw new RuntimeException("INVALID BROWSER");
            }
        }
>>>>>>> 829249a15e6003b50d33d6afb09487b4f3b9cd62

	/**
	 * This method will close the current web-driver
	 */
	public static void closeWebDriver() {
		webDriver.quit();
	}

	/**
	 * Fetches current URL from browser window
	 *
	 * @param driver
	 * @return
	 */
	public static String getCurrentURL(WebDriver driver) {
		String url = "";

		if (driver != null) {
			url = driver.getCurrentUrl();
		}
		return url;
	}

	public static void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public static void launchChrome() {
		String osName = FrameworkConstants.GET_OS_NAME;
		if (osName.contains("Windows")) {
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} else if (osName.contains("Mac")) {
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} else if (osName.contains("Linux")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless=new");
			webDriver = new ChromeDriver(chromeOptions);
		}
	}

	public static void launchFirefox() {
		String osName = FrameworkConstants.GET_OS_NAME;
		if (osName.contains("Windows")) {
			webDriver = new FirefoxDriver();
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} else if (osName.contains("Mac")) {
			webDriver = new FirefoxDriver();
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} else if (osName.contains("Linux")) {
			FirefoxOptions fireOptions = new FirefoxOptions();
			fireOptions.addArguments("--headless=new");
			webDriver = new FirefoxDriver(fireOptions);
		}
	}

	public static void launchSafari() {
		String osName = FrameworkConstants.GET_OS_NAME;
		if (osName.contains("Windows")) {
			webDriver = new SafariDriver();
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} else if (osName.contains("Mac")) {
			webDriver = new SafariDriver();
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} else if (osName.contains("Linux")) {
			SafariOptions safariOptions = new SafariOptions();
			webDriver = new SafariDriver();
		}
	}

	public static void launchEdge() {
		String osName = FrameworkConstants.GET_OS_NAME;
		if (osName.contains("Windows")) {
			webDriver = new EdgeDriver();
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} else if (osName.contains("Mac")) {
			webDriver = new EdgeDriver();
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} else if (osName.contains("Linux")) {
			webDriver = new EdgeDriver();
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	}
}
