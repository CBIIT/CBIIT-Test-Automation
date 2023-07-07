package com.nci.automation.web;

import com.nci.automation.common.Constants;
import com.nci.automation.common.ScenarioContext;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.FrameworkConstants;
import com.nci.automation.utils.LocalConfUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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