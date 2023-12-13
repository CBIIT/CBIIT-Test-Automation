package ServiceNow.SandBoxUpgradeTest.Steps;

import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSteps extends PageInitializer {

    public static void main(String args[])
    {    webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        testOne();
    }
    public static void testOne() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(2000);
        ServiceNow_Common_Methods.filterNavigatorSearch("All Participant Details");
    }
}