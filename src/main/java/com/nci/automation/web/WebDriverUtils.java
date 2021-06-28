package com.nci.automation.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
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
<<<<<<< Updated upstream
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

=======
<<<<<<< HEAD
=======
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
import com.nci.automation.common.Constants;
import com.nci.automation.common.ScenarioContext;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.LocalConfUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;

<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
/**
 * This class contains web driver related methods
 * 
 * @author sohilz2
 */
public class WebDriverUtils {

	private final static Logger logger = Logger.getLogger(WebDriverUtils.class);
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	public static WebDriver webDriver;
//	public static final String GET_EXE = ".exe";
//	public static final String GET_LINUX = "_linux"; 

	/**
	 * Get a web-driver to interact with the UI
	 */
	@SuppressWarnings("deprecation")
<<<<<<< Updated upstream
	public static WebDriver getWebDriver() {
	
=======
<<<<<<< HEAD
	public static WebDriver getWebDriver() {  

=======
	public static WebDriver getWebDriver() {
	
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
		String browser = ConfUtils.getProperty("browser");
		String headless = ConfUtils.getProperty("headless");
		String avdName = ConfUtils.getProperty("avdName");
		String platformName = ConfUtils.getProperty("platformName");
		String udid = ConfUtils.getProperty("udid");
		if (webDriver == null) {
			setDriverExecutables();
<<<<<<< Updated upstream
			if (Constants.BROWSER_MOBILE.equalsIgnoreCase(browser)) {
=======
<<<<<<< HEAD

			if(Constants.BROWSER_MOBILE.equalsIgnoreCase(browser)) {

>>>>>>> Stashed changes
				DesiredCapabilities cap = new DesiredCapabilities();
				if (platformName.equalsIgnoreCase(Constants.IOS_MOBILE)) {
					cap.setCapability("deviceName", "iOS");
					cap.setCapability("platformName", "iOS");
					cap.setCapability(CapabilityType.BROWSER_NAME, "Safari");
					cap.setCapability(CapabilityType.VERSION, "14");
					cap.setCapability("udid", udid);
					cap.setCapability("automationName", "XCUITest");
				} else {
					cap.setCapability("deviceName", "Android");
					cap.setCapability("platformName", "Android");
<<<<<<< Updated upstream
					cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
					cap.setCapability(CapabilityType.VERSION, "10");
					cap.setCapability("avd", avdName);
=======
					cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); 
					cap.setCapability(CapabilityType.VERSION, "10");		
					cap.setCapability("avd", avdName );

=======
			if (Constants.BROWSER_MOBILE.equalsIgnoreCase(browser)) {
				DesiredCapabilities cap = new DesiredCapabilities();
				if (platformName.equalsIgnoreCase(Constants.IOS_MOBILE)) {
					cap.setCapability("deviceName", "iOS");
					cap.setCapability("platformName", "iOS");
					cap.setCapability(CapabilityType.BROWSER_NAME, "Safari");
					cap.setCapability(CapabilityType.VERSION, "14");
					cap.setCapability("udid", udid);
					cap.setCapability("automationName", "XCUITest");
				} else {
					cap.setCapability("deviceName", "Android");
					cap.setCapability("platformName", "Android");
					cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
					cap.setCapability(CapabilityType.VERSION, "10");
					cap.setCapability("avd", avdName);
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
				}
				try {
					webDriver = new AppiumDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), cap);
				} catch (MalformedURLException e) {
					e.printStackTrace();
					CucumberLogUtils.logFail("Mobile driver intlization filed", false);
				}
<<<<<<< Updated upstream
			} else if (Constants.BROWSER_CHROME.equals(browser)) {
				ChromeOptions chromeOptions = new ChromeOptions();
				if (headless.equalsIgnoreCase("true")) {
					chromeOptions.setHeadless(true);
					chromeOptions.addArguments("window-size=1920,1080");
=======
<<<<<<< HEAD

			}
			else if (Constants.BROWSER_CHROME.equals(browser)) {
				ChromeOptions chromeOptions = new ChromeOptions();
				if (headless.equalsIgnoreCase("true")) {
					chromeOptions.setHeadless(true);
=======
			} else if (Constants.BROWSER_CHROME.equals(browser)) {
				ChromeOptions chromeOptions = new ChromeOptions();
				if (headless.equalsIgnoreCase("true")) {
					chromeOptions.setHeadless(true);
					chromeOptions.addArguments("window-size=1920,1080");
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
					webDriver = new ChromeDriver(chromeOptions);
				} else {
					webDriver = new ChromeDriver(chromeOptions);
					System.out.println(chromeOptions.getVersion());
				}
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
			} else if (browser.equalsIgnoreCase(Constants.BROWSER_IE)) {
				DesiredCapabilities desiredCapabilities = DesiredCapabilities.internetExplorer();
				desiredCapabilities.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, Boolean.TRUE);
				desiredCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, Boolean.TRUE);
				desiredCapabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "ignore");
				webDriver = new InternetExplorerDriver(desiredCapabilities);
<<<<<<< Updated upstream
			} else if (browser.equalsIgnoreCase(Constants.BROWSER_FIREFOX)) {
				FirefoxOptions fireOptions = new FirefoxOptions();
=======
<<<<<<< HEAD

			} else if (browser.equalsIgnoreCase(Constants.BROWSER_FIREFOX)) {
				FirefoxOptions fireOptions = new FirefoxOptions();

=======
			} else if (browser.equalsIgnoreCase(Constants.BROWSER_FIREFOX)) {
				FirefoxOptions fireOptions = new FirefoxOptions();
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
				if (headless.equalsIgnoreCase("true")) {
					fireOptions.setHeadless(true);
					webDriver = new FirefoxDriver(fireOptions);
				} else {
					webDriver = new FirefoxDriver(fireOptions);
				}
<<<<<<< Updated upstream
			} else if(browser.equalsIgnoreCase(Constants.BROWSER_SAFARI)) {
				SafariOptions safariOptions = new SafariOptions();
				if (headless.equalsIgnoreCase("true")) {
					//safariOptions.setHeadless(true);
					//safariOptions.addArguments("window-size=1920,1080");
					webDriver = new SafariDriver(safariOptions);
				} else {
					webDriver = new SafariDriver(safariOptions);
				}
			} else if (browser.equalsIgnoreCase("htmlunitdriver")) {
				webDriver = new HtmlUnitDriver();
			} else if (browser.equalsIgnoreCase(Constants.BROWSER_PHANTOM)) {
=======
<<<<<<< HEAD

			} else if (browser.equalsIgnoreCase("htmlunitdriver")) {
					 webDriver=new HtmlUnitDriver();
			}  else if (browser.equalsIgnoreCase(Constants.BROWSER_PHANTOM)) {
=======
			} else if(browser.equalsIgnoreCase(Constants.BROWSER_SAFARI)) {
				SafariOptions safariOptions = new SafariOptions();
				if (headless.equalsIgnoreCase("true")) {
					//safariOptions.setHeadless(true);
					//safariOptions.addArguments("window-size=1920,1080");
					webDriver = new SafariDriver(safariOptions);
				} else {
					webDriver = new SafariDriver(safariOptions);
				}
			} else if (browser.equalsIgnoreCase("htmlunitdriver")) {
				webDriver = new HtmlUnitDriver();
			} else if (browser.equalsIgnoreCase(Constants.BROWSER_PHANTOM)) {
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setJavascriptEnabled(true);
				capabilities.setCapability("takesScreenshot", true);
				capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS,
						new String[] { "--web-security=no", "--ignore-ssl-errors=yes" });
<<<<<<< Updated upstream
				String[] phantomArgs = new String[] { "--webdriver-loglevel=NONE" };
				capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomArgs);
				webDriver = new PhantomJSDriver(capabilities);
			} else {
=======
<<<<<<< HEAD
				
				String[] phantomArgs = new String[] { "--webdriver-loglevel=NONE" }; 
				capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomArgs);
				webDriver = new PhantomJSDriver(capabilities);
				 
			}else {

=======
				String[] phantomArgs = new String[] { "--webdriver-loglevel=NONE" };
				capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomArgs);
				webDriver = new PhantomJSDriver(capabilities);
			} else {
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
				CucumberLogUtils.logFail("Unsupported browser in localConf.properties file! "
						+ "Browser has to be 'ie' or 'firefox' or 'phantomjs'", false);
				return null;
			}
		}
<<<<<<< Updated upstream
		long implicitWaitInSeconds = Long.valueOf(LocalConfUtils.getProperty("implicitWaitInSeconds"));
		webDriver.manage().timeouts().implicitlyWait(implicitWaitInSeconds, TimeUnit.SECONDS);
		
		if (!Constants.BROWSER_MOBILE.equalsIgnoreCase(browser)) {
			webDriver.manage().window().maximize();
		}
=======
<<<<<<< HEAD

		long implicitWaitInSeconds = Long.valueOf(LocalConfUtils.getProperty("implicitWaitInSeconds"));
		webDriver.manage().timeouts().implicitlyWait(implicitWaitInSeconds, TimeUnit.SECONDS);

		if(!Constants.BROWSER_MOBILE.equalsIgnoreCase(browser))
		{ webDriver.manage().window().maximize();}
=======
		long implicitWaitInSeconds = Long.valueOf(LocalConfUtils.getProperty("implicitWaitInSeconds"));
		webDriver.manage().timeouts().implicitlyWait(implicitWaitInSeconds, TimeUnit.MINUTES);


		if(!Constants.BROWSER_MOBILE.equalsIgnoreCase(browser)){ 
			webDriver.manage().window().maximize();	
		} 

>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb

>>>>>>> Stashed changes
		return webDriver;
	}

	/**
	 * This method sets the path to executable drivers based on the operating
	 * system. No setting needs to be changed if switching to another operating
	 * system.
	 */
	private static void setDriverExecutables() {
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		String browser = ConfUtils.getProperty("browser");
		String osName = Constants.GET_OS_NAME;

		if (browser.equalsIgnoreCase(Constants.BROWSER_CHROME)) {
			if (osName.contains("Mac")) {
<<<<<<< Updated upstream
				// System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH);
=======
<<<<<<< HEAD
				//System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH);
>>>>>>> Stashed changes
				WebDriverManager.chromedriver().setup();
			} else if (osName.contains("Window")) {
				// System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH + GET_EXE);
				WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
			} else if (osName.contains("Linux")) {
				// System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH + GET_LINUX);
				WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
			}
		} else if (browser.equalsIgnoreCase(Constants.BROWSER_IE)) {
			if (osName.contains("Mac")) {
				// System.setProperty(Constants.IE_KEY, Constants.IE_PATH);
				WebDriverManager.iedriver().setup();
			} else if (osName.contains("Windows")) {
				// System.setProperty(Constants.IE_KEY, Constants.IE_PATH + GET_EXE);
				WebDriverManager.iedriver().operatingSystem(OperatingSystem.WIN).setup();
			} else if (osName.contains("Linux")) {
				WebDriverManager.iedriver().operatingSystem(OperatingSystem.LINUX).setup();
			}
		} else if (browser.equalsIgnoreCase(Constants.BROWSER_FIREFOX)) {
			if (osName.contains("Mac")) {
				// System.setProperty(Constants.FIREFOX_KEY, Constants.FIREFOX_PATH);
				WebDriverManager.firefoxdriver().setup();
			} else if (osName.contains("Windows")) {
				// System.setProperty(Constants.FIREFOX_KEY, Constants.FIREFOX_PATH + GET_EXE);
				WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
			} else if (osName.contains("Linux")) {
				WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
			}
		} else if (browser.equalsIgnoreCase(Constants.BROWSER_PHANTOM)) {
			if (osName.contains("Mac")) {
				// System.setProperty(Constants.PHANTOM_KEY, Constants.PHANTOM_PATH);
				WebDriverManager.phantomjs().setup();
			} else if (osName.contains("Windows")) {
				// System.setProperty(Constants.PHANTOM_KEY, Constants.PHANTOM_PATH + GET_EXE);
				WebDriverManager.phantomjs().operatingSystem(OperatingSystem.WIN).setup();
			} else if (osName.contains("Linux")) {
				WebDriverManager.phantomjs().operatingSystem(OperatingSystem.LINUX).setup();
			}
<<<<<<< Updated upstream
=======

=======
				// System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH);
				WebDriverManager.chromedriver().setup();
			} else if (osName.contains("Window")) {
				// System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH + GET_EXE);
				WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
			} else if (osName.contains("Linux")) {
				// System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH + GET_LINUX);
				WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
			}
		} else if (browser.equalsIgnoreCase(Constants.BROWSER_IE)) {
			if (osName.contains("Mac")) {
				// System.setProperty(Constants.IE_KEY, Constants.IE_PATH);
				WebDriverManager.iedriver().setup();
			} else if (osName.contains("Windows")) {
				// System.setProperty(Constants.IE_KEY, Constants.IE_PATH + GET_EXE);
				WebDriverManager.iedriver().operatingSystem(OperatingSystem.WIN).setup();
			} else if (osName.contains("Linux")) {
				WebDriverManager.iedriver().operatingSystem(OperatingSystem.LINUX).setup();
			}
		} else if (browser.equalsIgnoreCase(Constants.BROWSER_FIREFOX)) {
			if (osName.contains("Mac")) {
				// System.setProperty(Constants.FIREFOX_KEY, Constants.FIREFOX_PATH);
				WebDriverManager.firefoxdriver().setup();
			} else if (osName.contains("Windows")) {
				// System.setProperty(Constants.FIREFOX_KEY, Constants.FIREFOX_PATH + GET_EXE);
				WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
			} else if (osName.contains("Linux")) {
				WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
			}
		} else if (browser.equalsIgnoreCase(Constants.BROWSER_PHANTOM)) {
			if (osName.contains("Mac")) {
				// System.setProperty(Constants.PHANTOM_KEY, Constants.PHANTOM_PATH);
				WebDriverManager.phantomjs().setup();
			} else if (osName.contains("Windows")) {
				// System.setProperty(Constants.PHANTOM_KEY, Constants.PHANTOM_PATH + GET_EXE);
				WebDriverManager.phantomjs().operatingSystem(OperatingSystem.WIN).setup();
			} else if (osName.contains("Linux")) {
				WebDriverManager.phantomjs().operatingSystem(OperatingSystem.LINUX).setup();
			}
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
		String browser = ScenarioContext.getBrowserID();
		WebDriver driver;
=======
<<<<<<< HEAD

		String browser = ScenarioContext.getBrowserID();
		WebDriver driver;

=======
		String browser = ScenarioContext.getBrowserID();
		WebDriver driver;
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
		if (Constants.BROWSER_IE.equals(browser)) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
		} else if (Constants.BROWSER_FIREFOX.contentEquals(browser)) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
		} else if (Constants.BROWSER_CHROME.equals(browser)) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
		WebDriver driver = ScenarioContext.webDriver.get();
		driver.get(url);
=======
<<<<<<< HEAD

		WebDriver driver = ScenarioContext.webDriver.get();
		driver.get(url);

=======
		WebDriver driver = ScenarioContext.webDriver.get();
		driver.get(url);
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
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