package appsCommon;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.By;

public class ServiceNow_Login_Methods extends PageInitializer {

    /**
     * USE THIS METHOD TO LOG IN TO SERVICE NOW USING THE SIDE DOOR TEST ACCOUNT
     * USERNAME AND PASSWORD ARE SPECIFIED IN THE LOCAL ENV PROPERTIES FILE
     */
    public static void nativeViewSideDoorLogin() {
        MiscUtils.sleep(2000);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("Native View Side Door"));
        NativeView_SideDoor_Login_Page.enterSideDoorUsername("SideDoorUsername");
        NativeView_SideDoor_Login_Page.enterSideDoorPassword("SideDoorPassword");
        NativeView_SideDoor_Login_Page.clickSignInButton();
        MiscUtils.sleep(3000);
    }

    /***
     * USE THIS METHOD TO LOG IN TO NATIVE VIEW VIA iTRUST - ONLY USE FOR NECESSARY OCCASIONS
     * USERNAME AND PASSWORD ARE SPECIFIED IN THE LOCAL ENV PROPERTIES FILE
     * @throws TestingException
     */
    public static void nativeViewLogin() throws TestingException {

        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(iTrustloginPage.loginLink);
        iTrustloginPage.loginLink.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        loginImpl.loginToITrust();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.linkText("Native View")));
        WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
    }
}
