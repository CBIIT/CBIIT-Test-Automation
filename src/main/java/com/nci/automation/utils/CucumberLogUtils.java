package com.nci.automation.utils;

import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.Scenario;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
/**
 * This class contains cucumber related log utilities
 * that will allow you to log them to reports
 * 
 * @author juarezds
 *
 */
public class CucumberLogUtils {

    public static Scenario scenario;
    public static Logger log = (Logger) LogManager.getLogger(CucumberLogUtils.class);


    /***
     * USE THIS METHOD TO ATTACH SCREENSHOT TO REPORT
     */
    public static void logScreenshot(){
        final byte[] screenshot = ((TakesScreenshot) WebDriverUtils.webDriver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Attaching screenshot to report");
    }
}
