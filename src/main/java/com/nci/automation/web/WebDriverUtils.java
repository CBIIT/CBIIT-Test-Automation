package com.nci.automation.web;

import java.time.Duration;
import com.nci.automation.utils.FrameworkConstants;
import io.github.sukgu.Shadow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class WebDriverUtils {

    public static WebDriver webDriver;
    public static Shadow shadowDriver = new Shadow(webDriver);

    public static void setUp() {

        String browser = TestProperties.BROWSER.toLowerCase();

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

    public static void launchChrome() {
        boolean headless = TestProperties.HEADLESS;
        String ci = System.getenv("CI");
        ChromeOptions chromeOptions = new ChromeOptions();

        if (headless) {
            chromeOptions.addArguments("--headless");
        }

        if ("true".equals(ci)) {
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-dev-shm-usage");
        }

        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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