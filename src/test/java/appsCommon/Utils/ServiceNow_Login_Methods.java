package appsCommon.Utils;

import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Pages.NativeView_SideDoor_Login_Page;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import static com.nci.automation.web.TestProperties.*;

public class ServiceNow_Login_Methods extends PageInitializer {

    /**
     * USE THIS METHOD TO LOG IN TO SERVICE NOW USING THE SIDE DOOR TEST ACCOUNT
     * USERNAME AND PASSWORD ARE SPECIFIED IN THE LOCAL ENV PROPERTIES FILE
     */
    public static void nativeViewSideDoorLogin() {
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(getNativeViewSideDoorUrl());
        NativeView_SideDoor_Login_Page.enterSideDoorUsername(SIDE_DOOR_USERNAME);
        NativeView_SideDoor_Login_Page.enterSideDoorPassword(SIDE_DOOR_PASSWORD);
        CucumberLogUtils.logScreenshot();
        NativeView_SideDoor_Login_Page.clickSignInButton();
        CommonUtils.sleep(3000);
        webDriver.navigate().refresh();
    }

    /***
     * USE THIS METHOD TO LOG IN TO NATIVE VIEW VIA iTRUST - ONLY USE FOR NECESSARY OCCASIONS
     * USERNAME AND PASSWORD ARE SPECIFIED IN THE LOCAL ENV PROPERTIES FILE
     * @
     */
    public static void nativeViewLogin() {
        WebDriverUtils.webDriver.get(getNCISPUrl());
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(iTrustloginPage.loginLink);
        iTrustloginPage.loginLink.click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        iTrustLoginPageImpl.loginToITrust();
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.linkText("Native View")));
        WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
    }
}
