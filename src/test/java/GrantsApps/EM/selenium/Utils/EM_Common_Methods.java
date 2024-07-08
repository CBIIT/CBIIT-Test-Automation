package GrantsApps.EM.selenium.Utils;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.WebDriverUtils;
import org.testng.Assert;

public class EM_Common_Methods {

    /**
     * Switches to the new window and verifies the page title of the new window.
     *
     * @param expectedURL the expected URL of the new window
     */
    public static void switchWindowAndVerifyPageTitle(String expectedURL){
        String winHandleBefore = WebDriverUtils.webDriver.getWindowHandle();
        for (String winHandle : WebDriverUtils.webDriver.getWindowHandles()) {
            WebDriverUtils.webDriver.switchTo().window(winHandle);
        }
        String actualUrl = WebDriverUtils.webDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedURL);
        WebDriverUtils.webDriver.close();
        WebDriverUtils.webDriver.switchTo().window(winHandleBefore);
        CucumberLogUtils.logScreenshot();
    }
}