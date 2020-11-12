package com.nci.automation.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.nci.automation.common.Constants;
import com.nci.automation.common.ScenarioContext;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.LocalConfUtils;

/**
 * This class contains web driver related methods
 * 
 * @author sohilz2
 */
public class WebDriverUtils {

	private final static Logger logger = Logger.getLogger(WebDriverUtils.class);

	public static WebDriver webDriver;
	public static final String GET_EXE = ".exe";
	public static final String GET_LINUX = "_linux";

	/**
	 * Get a web-driver to interact with the UI
	 */
	@SuppressWarnings("deprecation")
	public static WebDriver getWebDriver() {

		String browser = ConfUtils.getProperty("browser");
		String headless = ConfUtils.getProperty("headless");
		if (webDriver == null) {
			setDriverExecutables();

			if (Constants.BROWSER_CHROME.equals(browser)) {
				ChromeOptions chromeOptions = new ChromeOptions();
				if (headless.equalsIgnoreCase("true")) {
					chromeOptions.setHeadless(true);
					webDriver = new ChromeDriver(chromeOptions);
				} else {
					webDriver = new ChromeDriver(chromeOptions);
					System.out.println(chromeOptions.getVersion());
				}

			} else if (browser.equalsIgnoreCase(Constants.BROWSER_IE)) {
				DesiredCapabilities desiredCapabilities = DesiredCapabilities.internetExplorer();
				desiredCapabilities.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, Boolean.TRUE);
				desiredCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, Boolean.TRUE);
				desiredCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "ignore");
				webDriver = new InternetExplorerDriver(desiredCapabilities);

			} else if (browser.equalsIgnoreCase(Constants.BROWSER_FIREFOX)) {
				FirefoxOptions fireOptions = new FirefoxOptions();

				if (headless.equalsIgnoreCase("true")) {
					fireOptions.setHeadless(true);
					webDriver = new FirefoxDriver(fireOptions);
				} else {
					webDriver = new FirefoxDriver(fireOptions);
				}

			} else if (browser.equalsIgnoreCase("htmlunitdriver")) {
					 webDriver=new HtmlUnitDriver();
			}  else if (browser.equalsIgnoreCase(Constants.BROWSER_PHANTOM)) {
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setJavascriptEnabled(true);
				capabilities.setCapability("takesScreenshot", true);
				capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS,
						new String[] { "--web-security=no", "--ignore-ssl-errors=yes" });
				
				String[] phantomArgs = new String[] { "--webdriver-loglevel=NONE" }; 
				capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomArgs);
				webDriver = new PhantomJSDriver(capabilities);
				
			}else {

				CucumberLogUtils.logFail("Unsupported browser in localConf.properties file! "
						+ "Browser has to be 'ie' or 'firefox' or 'phantomjs'", false);
				return null;
			}
		}

		long implicitWaitInSeconds = Long.valueOf(LocalConfUtils.getProperty("implicitWaitInSeconds"));
		webDriver.manage().timeouts().implicitlyWait(implicitWaitInSeconds, TimeUnit.SECONDS);

		webDriver.manage().window().maximize();

		return webDriver;
	}

	/**
	 * This method sets the path to executable drivers based on the operating
	 * system. No setting needs to be changed if switching to another operating
	 * system.
	 */
	private static void setDriverExecutables() {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		String browser = ConfUtils.getProperty("browser");

		String osName = Constants.GET_OS_NAME;

		if (browser.equalsIgnoreCase(Constants.BROWSER_CHROME)) {

			if (osName.contains("Mac")) {
				System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH);
			} else if (osName.contains("Window")) {
				System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH + GET_EXE);
			}else if (osName.contains("Linux")) {
				System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH + GET_LINUX);
			}

		} else if (browser.equalsIgnoreCase(Constants.BROWSER_IE)) {

			if (osName.contains("Mac")) {
				System.setProperty(Constants.IE_KEY, Constants.IE_PATH);
			} else if (osName.contains("Windows")) {
				System.setProperty(Constants.IE_KEY, Constants.IE_PATH + GET_EXE);
			}

		} else if (browser.equalsIgnoreCase(Constants.BROWSER_FIREFOX)) {

			if (osName.contains("Mac")) {
				System.setProperty(Constants.FIREFOX_KEY, Constants.FIREFOX_PATH);
			} else if (osName.contains("Windows")) {
				System.setProperty(Constants.FIREFOX_KEY, Constants.FIREFOX_PATH + GET_EXE);
			}
		}else if (browser.equalsIgnoreCase(Constants.BROWSER_PHANTOM)) {

			if (osName.contains("Mac")) {
				System.setProperty(Constants.PHANTOM_KEY, Constants.PHANTOM_PATH);
			} else if (osName.contains("Windows")) {
				System.setProperty(Constants.PHANTOM_KEY, Constants.PHANTOM_PATH + GET_EXE);
			}

		}
	}

	/**
	 * This method will close the current web-driver
	 */
	public static void closeWebDriver() {
		if (webDriver != null) {
			webDriver.quit();
			ScenarioContext.sauceSessionId.set(null);
			ScenarioContext.webDriver.set(null);
			webDriver = null;
		}
	}

	/**
	 * The method will provide a new driver (complete new browser).
	 * 
	 * @return
	 */
	public static WebDriver getNewDriver() {

		String browser = ScenarioContext.getBrowserID();
		WebDriver driver;

		if (Constants.BROWSER_IE.equals(browser)) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;

		} else if (Constants.BROWSER_FIREFOX.contentEquals(browser)) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;

		} else if (Constants.BROWSER_CHROME.equals(browser)) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;

		} else {
			CucumberLogUtils.logFail("Unsupported browser in localConf.properties file! "
					+ "Browser has to be 'ie' or 'firefox' or 'headless chrome, firefox'", false);
			return null;
		}
	}

	/**
	 * Use this method to get new sauce driver
	 * 
	 * @param capabilities
	 * @return
	 */
	public static WebDriver getNewSauceDriver(DesiredCapabilities capabilities) {

		WebDriver driver = null;
		String url = "http://ondemand.saucelabs.com:80/wd/hub";

		// set time zone to ET if no time zone is set
		// to show right test execution time on sauce dashboard
		if (capabilities.getCapability("time-zone") == null)
			capabilities.setCapability("time-zone", "New York");

		try {
			driver = new RemoteWebDriver(new URL(url), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		ScenarioContext.sauceSessionId.set((((RemoteWebDriver) driver).getSessionId()).toString());

		return driver;

	}

	/**
	 * Use this method in need of taking screenshot
	 * 
	 * @return image in byte codes
	 */
	public static byte[] getScreenShot() {

		byte[] screenshot = null;
		ScenarioContext.webDriver.get();
		try {
			screenshot = ((TakesScreenshot) WebDriverUtils.webDriver).getScreenshotAs(OutputType.BYTES);
		} catch (Exception e) {
			CucumberLogUtils.logError("Couldn't take screenshot");
		}
		return screenshot;
	}

	/**
	 * Use this method to navigate to an external url
	 * 
	 * @param url
	 */
	public static void navToExternalPage(String url) {

		WebDriver driver = ScenarioContext.webDriver.get();
		driver.get(url);

		try {
			Thread.sleep(1000);
			suppressAlert();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			logger.error(String.format("Navigation to external url %s failed", url), e);
		}
	}

	public static void suppressAlert() {

		Robot robot = null;
		String browser = ScenarioContext.getBrowserID();
		if (Constants.BROWSER_IE.equals(browser)) {
			try {
				robot = new Robot();
			} catch (AWTException e) {
				logger.error(String.format("Error occured while supressing alert"));
			}
			// press enter to save the file
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
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

	public static void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}

	public static void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}

	public static void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}

}
