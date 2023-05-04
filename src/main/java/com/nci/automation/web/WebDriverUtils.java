package com.nci.automation.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import com.nci.automation.utils.FrameworkConstants;
import io.github.bonigarcia.wdm.config.OperatingSystem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import com.nci.automation.common.Constants;
import com.nci.automation.common.ScenarioContext;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.LocalConfUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contains web driver related methods
 *
 * @author juarezds
 */
public class WebDriverUtils {

    private final static Logger logger = LogManager.getLogger(WebDriverUtils.class);
    public static WebDriver webDriver;

    public static WebDriver getWebDriver() {

        String browser = ConfUtils.getProperty("browser");
        String headless = ConfUtils.getProperty("headless");

        if (webDriver == null) {
            if (Constants.BROWSER_MOBILE.equalsIgnoreCase(browser)) {
                launchMobile();
            } else if (Constants.BROWSER_CHROME.equalsIgnoreCase(browser)) {
                launchChrome();
            } else if (browser.equalsIgnoreCase(Constants.BROWSER_FIREFOX)) {
                launchFirefox();
            } else if (browser.equalsIgnoreCase(Constants.BROWSER_SAFARI)) {
                launchSafari();
            } else if (browser.equalsIgnoreCase(Constants.BROWSER_EDGE)) {
                launchEdge();
            } else {
                CucumberLogUtils.logFail("Unsupported browser in localEnv.properties file! " + "PLEASE ENTER VALID BROWSER NAME", false);
                return null;
            }
        }
        long implicitWaitInSeconds = Long.valueOf(LocalConfUtils.getProperty("implicitWaitInSeconds"));
        webDriver.manage().timeouts().implicitlyWait(implicitWaitInSeconds, TimeUnit.SECONDS);
        if (!Constants.BROWSER_MOBILE.equalsIgnoreCase(browser)) {
            webDriver.manage().window().maximize();
        }
        return webDriver;
    }

    /**
     * This method sets the path to executable drivers based on the operating
     * system. No setting needs to be changed if switching to another operating
     * system. ---- POSSIBLY REMOVE SINCE IT IS NOT BEING USED?----
     */
    private static void setDriverExecutables() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
        String browser = ConfUtils.getProperty("browser");
        String osName = Constants.GET_OS_NAME;

        if (browser.equalsIgnoreCase(Constants.BROWSER_CHROME)) {
            if (osName.contains("Mac")) {
                // System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH);
                WebDriverManager.chromedriver().setup();
            } else if (osName.contains("Window")) {
                // System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH + GET_EXE);
            } else if (osName.contains("Linux")) {
                // System.setProperty(Constants.CHROME_KEY, Constants.CHROME_PATH + GET_LINUX);
            }
        } else if (browser.equalsIgnoreCase(Constants.BROWSER_IE)) {
            if (osName.contains("Mac")) {
                // System.setProperty(Constants.IE_KEY, Constants.IE_PATH);
                WebDriverManager.iedriver().setup();
            } else if (osName.contains("Windows")) {
                // System.setProperty(Constants.IE_KEY, Constants.IE_PATH + GET_EXE);
                //WebDriverManager.iedriver().operatingSystem(OperatingSystem.WIN).setup();
            } else if (osName.contains("Linux")) {
                //WebDriverManager.iedriver().operatingSystem(OperatingSystem.LINUX).setup();
            }
        } else if (browser.equalsIgnoreCase(Constants.BROWSER_FIREFOX)) {
            if (osName.contains("Mac")) {
                // System.setProperty(Constants.FIREFOX_KEY, Constants.FIREFOX_PATH);
                WebDriverManager.firefoxdriver().setup();
            } else if (osName.contains("Windows")) {
                // System.setProperty(Constants.FIREFOX_KEY, Constants.FIREFOX_PATH + GET_EXE);
                //	WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
            } else if (osName.contains("Linux")) {
                //	WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
            }
        } else if (browser.equalsIgnoreCase(Constants.BROWSER_PHANTOM)) {
            if (osName.contains("Mac")) {
                // System.setProperty(Constants.PHANTOM_KEY, Constants.PHANTOM_PATH);
                //WebDriverManager.phantomjs().setup();
            } else if (osName.contains("Windows")) {
                // System.setProperty(Constants.PHANTOM_KEY, Constants.PHANTOM_PATH + GET_EXE);
                //WebDriverManager.phantomjs().operatingSystem(OperatingSystem.WIN).setup();
            } else if (osName.contains("Linux")) {
                //WebDriverManager.phantomjs().operatingSystem(OperatingSystem.LINUX).setup();
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

    public static void refreshPage(WebDriver driver) {
        driver.navigate().refresh();
    }

    public static void launchChrome() {
        String osName = FrameworkConstants.GET_OS_NAME;
        if (osName.contains("Windows")) {
            WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } else if (osName.contains("Mac")) {
            WebDriverManager.chromedriver().operatingSystem(OperatingSystem.MAC).setup();
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } else if (osName.contains("Linux")) {
            WebDriverManager.chromedriver().operatingSystem(OperatingSystem.LINUX).setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless=new");
            webDriver = new ChromeDriver(chromeOptions);
        }
    }

    public static void launchMobile() {
        String avdName = ConfUtils.getProperty("avdName");
        String platformName = ConfUtils.getProperty("platformName");
        String udid = ConfUtils.getProperty("udid");
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
        }
    }

    public static void launchFirefox() {
        String osName = FrameworkConstants.GET_OS_NAME;
        if (osName.contains("Windows")) {
            WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.WIN).setup();
            webDriver = new FirefoxDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } else if (osName.contains("Mac")) {
            WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.MAC).setup();
            webDriver = new FirefoxDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } else if (osName.contains("Linux")) {
            WebDriverManager.firefoxdriver().operatingSystem(OperatingSystem.LINUX).setup();
            FirefoxOptions fireOptions = new FirefoxOptions();
            fireOptions.addArguments("--headless=new");
            webDriver = new FirefoxDriver(fireOptions);
        }
    }

    public static void launchSafari() {
        String osName = FrameworkConstants.GET_OS_NAME;
        if (osName.contains("Windows")) {
            WebDriverManager.safaridriver().operatingSystem(OperatingSystem.WIN).setup();
            webDriver = new SafariDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } else if (osName.contains("Mac")) {
            WebDriverManager.safaridriver().operatingSystem(OperatingSystem.MAC).setup();
            webDriver = new SafariDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } else if (osName.contains("Linux")) {
            WebDriverManager.safaridriver().operatingSystem(OperatingSystem.LINUX).setup();
            SafariOptions safariOptions = new SafariOptions();
            webDriver = new SafariDriver();
        }
    }

    public static void launchEdge() {
        String osName = FrameworkConstants.GET_OS_NAME;
        if (osName.contains("Windows")) {
            WebDriverManager.edgedriver().operatingSystem(OperatingSystem.WIN).setup();
            webDriver = new EdgeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } else if (osName.contains("Mac")) {
            WebDriverManager.edgedriver().operatingSystem(OperatingSystem.MAC).setup();
            webDriver = new EdgeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } else if (osName.contains("Linux")) {
            WebDriverManager.edgedriver().operatingSystem(OperatingSystem.LINUX).setup();
            webDriver = new EdgeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
    }
}