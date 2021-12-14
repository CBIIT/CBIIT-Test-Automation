package com.nci.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.Assert.assertTrue;
import org.apache.commons.lang.exception.ExceptionUtils;
import com.nci.automation.common.ScenarioContext;
import com.nci.automation.web.WebDriverUtils;

import cucumber.api.Scenario;

/**
 * This class contains cucumber related log utilities
 * that will allow you to log them to reports
 * @author sohilz2
 *
 */
public class CucumberLogUtils {

    private static Logger logger = LogManager.getLogger(CucumberLogUtils.class);
    public static boolean scenarioResult = true;
    
    /**
     * This method will log screenshot to the reports
     * @param msg accepts string message
     */
    public static void logScreenShot(String msg) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        ScenarioContext.scenario.get().write(DateUtils.getLogTime() + ": Screenshot: " + msg);
        if (ScenarioContext.isTakeScreenShots()) {
            ScenarioContext.scenario.get().embed(WebDriverUtils.getScreenShot(), "image/png");
        }
    }
    
    /**
     * This method will log screenshot to the reports
     */
    public static void logScreenShot() {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        ScenarioContext.scenario.get().write(DateUtils.getLogTime() + ": Screenshot: ");
        if (ScenarioContext.isTakeScreenShots()) {
            ScenarioContext.scenario.get().embed(WebDriverUtils.getScreenShot(), "image/png");
        }
    }
    
    /**
     * This method logs screenshot 
     * @param scenario
     */
    public static void logScreenShot(Scenario scenario) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        scenario.write(DateUtils.getLogTime() + ": Screenshot: " );
        if (ScenarioContext.isTakeScreenShots()) {
            scenario.embed(WebDriverUtils.getScreenShot(), "image/png");
        }
    }
    
    /**
     * This method will log a message to reports and console
     * @param msg Message to be logged
     */
    public static void logInfo(String msg) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        logger.info(msg);
        ScenarioContext.scenario.get().write(DateUtils.getLogTime() + ": INFO: " + MiscUtils.makeStringHtmlSafe(msg));
    }
    
    /**
     * Add a log which contains a hyperlink
     * 
     * @param hyperlink
     * @param hyperlinkMsg
     */
    public static void logLink(String hyperlink, String hyperlinkMsg) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        StringBuilder htmlString = new StringBuilder().append("<a href='");
        htmlString.append(hyperlink).append("' ");
        htmlString.append("target='_blank'");
        htmlString.append(">");
        htmlString.append(hyperlinkMsg).append("</a>");
        ScenarioContext.scenario.get().write(htmlString.toString());
    }
    
    /**
     * This method logs a message to reports and console and takes screenshot
     * @param msg your message
     * @param takeScreenShot
     */
    public static void logPass(String msg, boolean takeScreenShot) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        ScenarioContext.scenario.get().write(DateUtils.getLogTime() + ": PASS: " + msg);
        logger.info(String.format(":PASS:=%s", msg));
        if (takeScreenShot && ScenarioContext.isTakeScreenShots()) {
            ScenarioContext.scenario.get().embed(WebDriverUtils.getScreenShot(), "image/png");
        }
    }

    // exits out of scenario
    public static void logFail(String msg, Throwable t, boolean takeScreenshot) {
        String stackTrace = ExceptionUtils.getStackTrace(t);
        logFail (String.format("%s \n%s", msg, stackTrace), takeScreenshot);
    }
    
    // exits out of scenario
    public static void logFail(String msg, boolean takeScreenshot) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        if (takeScreenshot && ScenarioContext.isTakeScreenShots()) {
            ScenarioContext.scenario.get().embed(WebDriverUtils.getScreenShot(), "image/png");
        }
        logger.error(String.format(":FAIL:=%s", msg));
        assertTrue(DateUtils.getLogTime() + ": FAIL: " + msg, false);
    }

   

    public static void logDebug(String msg) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        if (ScenarioContext.isLogLevelDebug()) {
            logger.debug(msg);
            ScenarioContext.scenario.get().write(
                    DateUtils.getLogTime() + ": DEBUG: " + MiscUtils.makeStringHtmlSafe(msg));
        }
    }
    
    // continues execution
    public static void logError(String msg, Throwable t) {
        String stackTrace = ExceptionUtils.getStackTrace(t);        
        logError (String.format("%s \n%s", msg, stackTrace));
    }

    // continues execution
    public static void logError(String msg) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        logger.error(msg);
        ScenarioContext.scenario.get().write(DateUtils.getLogTime() + ": ERROR: " + MiscUtils.makeStringHtmlSafe(msg));
        scenarioResult = false;
    }

    /**
     * This method will log a message to the console only
     * @param msg
     */
    public static void logToConsole(String msg) {
      logger.info(msg);  
      System.out.println(Thread.currentThread().getName() + " : " + DateUtils.getLogTime() + ": CONSOLE: " + msg);
    }
    
    
    public static void writeHTML(String htmlContent) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        ScenarioContext.scenario.get().write(htmlContent);
    }


}
