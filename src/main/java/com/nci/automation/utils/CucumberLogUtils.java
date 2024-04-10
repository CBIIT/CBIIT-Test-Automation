package com.nci.automation.utils;

import com.microsoft.playwright.Page;
import com.nci.automation.web.PlaywrightUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.nio.file.Paths;

/**
 * This class contains cucumber related log utilities
 * that will allow you to log them to reports
 * 
 * @author juarezds
 *
 */
public class CucumberLogUtils {

    public static Scenario scenario;
    /***
     * USE THIS METHOD TO ATTACH A SCREENSHOT TO CUCUMBER REPORT WHEN USING SELENIUM
     */
    public static void logScreenshot(){
        final byte[] screenshot = ((TakesScreenshot) WebDriverUtils.webDriver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Attaching screenshot to report");
    }

    /**
     * USE THIS METHOD TO ATTACH A SCREENSHOT TO CUCUMBER REPORT WHEN USING PLAYWRIGHT
     */
    public static void playwrightScreenshot(){
        PlaywrightUtils.page.waitForLoadState();
        final byte[] screenshot = PlaywrightUtils.page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot.png")));
        scenario.attach(screenshot, "image/png", "Attaching screenshot to report");
    }
}
