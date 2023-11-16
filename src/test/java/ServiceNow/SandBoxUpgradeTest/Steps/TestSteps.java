package ServiceNow.SandBoxUpgradeTest.Steps;

import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.github.sukgu.Shadow;

public class TestSteps extends PageInitializer {

    Shadow shadow = new Shadow(WebDriverUtils.webDriver);
    @Given("testing")
    public void testing() throws TestingException {
       // ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        //MiscUtils.sleep(3100);
        //ServiceNow_Common_Methods.filterNavigatorSearch("CHARMS Studies");
        testAccountResetImpl.resetTestAccountSignIn();
        testAccountResetImpl.resetTestAccount();

    }
}