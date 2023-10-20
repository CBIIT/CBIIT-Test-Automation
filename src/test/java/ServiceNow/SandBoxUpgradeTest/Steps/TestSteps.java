package ServiceNow.SandBoxUpgradeTest.Steps;

import ServiceNow.SandBoxUpgradeTest.Pages.ShadowPage;
import appsCommon.NativeView_SideDoor_PageInitializer;
import appsCommon.PageInitializer;
import appsCommon.ServiceNow_Common_Methods;
import appsCommon.ServiceNow_Login_Methods;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.github.sukgu.Shadow;
import org.openqa.selenium.By;

public class TestSteps extends NativeView_SideDoor_PageInitializer {

    ShadowPage shadowPage = new ShadowPage();
    Shadow shadow = new Shadow(WebDriverUtils.webDriver);
    @Given("testing")
    public void testing() throws Exception {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.filterNavigatorSearch("CHARMS CGB IIQ");
    }
}