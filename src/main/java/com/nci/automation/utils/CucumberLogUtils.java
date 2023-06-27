package com.nci.automation.utils;

import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.Assert.assertTrue;
import org.apache.commons.lang.exception.ExceptionUtils;
import com.nci.automation.common.ScenarioContext;



/**
 * This class contains cucumber related log utilities
 * that will allow you to log them to reports
 * 
 * @author sohilz2
 *
 */
public class CucumberLogUtils {

    private static Logger logger = LogManager.getLogger(CucumberLogUtils.class);
    public static boolean scenarioResult = true;

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
    }



    // exits out of scenario
    public static void logFail(String msg, Throwable t, boolean takeScreenshot) {
        String stackTrace = ExceptionUtils.getStackTrace(t);
        logFail(String.format("%s \n%s", msg, stackTrace), takeScreenshot);
    }

    // exits out of scenario
    public static void logFail(String msg, boolean takeScreenshot) {
        if (ScenarioContext.scenario.get() == null) {
            return;
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
        }
    }

    // continues execution
    public static void logError(String msg, Throwable t) {
        String stackTrace = ExceptionUtils.getStackTrace(t);
        logError(String.format("%s \n%s", msg, stackTrace));
    }

    // continues execution
    public static void logError(String msg) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        logger.error(msg);
        scenarioResult = false;
    }

    /**
     * This method will log a message to the console only
     * 
     * @param msg
     */
    public static void logToConsole(String msg) {
        logger.info(msg);
        System.out.println(Thread.currentThread().getName() + " : " + DateUtils.getLogTime() + ": CONSOLE: " + msg);
    }

    public static void logScreenShot(String msg) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }

        if (ScenarioContext.isTakeScreenShots()) {

        }
    }

    /**
     * This method will log screenshot to the reports
     */
    public static void logScreenShot() {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }

        if (ScenarioContext.isTakeScreenShots()) {

        }


    }

    public static void logInfo(String msg) {
        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        logger.info(msg);

    }

}
