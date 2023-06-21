package GrantsApps.ChangePassword.Util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.nci.automation.common.ScenarioContext;
import com.nci.automation.utils.DateUtils;
import com.nci.automation.web.WebDriverUtils;

import ServiceNow.ATO.Utils.DriverObjectFactory;
import cucumber.api.Scenario;



public class ReportUtil {

    public static void takeScreenShot(Scenario scenario, String screenshotName) {
        TakesScreenshot ts = (TakesScreenshot) DriverObjectFactory.getWebDriver();
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

        scenario.embed(screenshot, screenshotName);
    }

    public static void captureScreenshot(String fileName) {

        if (ScenarioContext.scenario.get() == null) {
            return;
        }
        byte[] screenshot = ((TakesScreenshot) WebDriverUtils.getWebDriver()).getScreenshotAs(OutputType.BYTES);
        ScenarioContext.scenario.get().write(DateUtils.getLogTime() + ": Screenshot: " + fileName);
        if (ScenarioContext.isTakeScreenShots()) {
            try {
                ScenarioContext.scenario.get().embed(screenshot, "image/png");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}