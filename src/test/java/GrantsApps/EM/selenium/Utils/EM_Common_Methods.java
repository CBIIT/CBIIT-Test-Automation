package GrantsApps.EM.selenium.Utils;

import com.nci.automation.utils.CucumberLogUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import static com.nci.automation.web.WebDriverUtils.webDriver;

public class EM_Common_Methods {

    /**
     * Switches to the new window and verifies the page title of the new window.
     *
     * @param expectedURL the expected URL of the new window
     */
    public static void switchWindowAndVerifyPageTitle(String expectedURL){
        String winHandleBefore = webDriver.getWindowHandle();
        for (String winHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedURL));
        String actualUrl = webDriver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedURL);
        webDriver.close();
        webDriver.switchTo().window(winHandleBefore);
        CucumberLogUtils.logScreenshot();
    }
}