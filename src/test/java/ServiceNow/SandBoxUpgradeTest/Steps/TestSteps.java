package ServiceNow.SandBoxUpgradeTest.Steps;

import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.github.sukgu.Shadow;

public class TestSteps {

    Shadow shadow = new Shadow(WebDriverUtils.webDriver);
    @Given("testing")
    public void testing() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.filterNavigatorSearch("CHARMS Studies");
    }
}