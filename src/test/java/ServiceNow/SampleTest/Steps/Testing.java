package ServiceNow.SampleTest.Steps;

import org.openqa.selenium.By;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;

public class Testing extends PageInitializer {

    @Given("test")
    public void test() throws TestingException {

        nativeViewLoginImpl.sideDoorAccountLogin();

        MiscUtils.sleep(5000);
        nativeViewDashPage.clickUserDropDown();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateUserLink();
        MiscUtils.sleep(2000);
        nativeViewDashPage.clickImpersonateSearchDD();
        MiscUtils.sleep(3000);
        nativeViewDashPage.enterTextImpersntSearchBox("Satya Gugulothu");
        MiscUtils.sleep(2000);
        WebDriverUtils.webDriver.get(
                "https://service-test.nci.nih.gov/x/g/records-management/record/x_g_nci_record_mgt_rm_tracking_log/-1");

    }
}
