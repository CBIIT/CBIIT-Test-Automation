package ServiceNow.CHARMS.Steps;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;

public class RASSurveyDataVerificationSteps extends PageInitializer {

    @Given("data verification")
    public void data_verification() throws TestingException {

        // Logging into native view
        MiscUtils.sleep(1000);
        nativeViewLoginImpl.nativeViewLogin();
        CommonUtils.waitForVisibility(nativeViewHomePage.nativeViewFilterNavigator);
        nativeViewHomePage.nativeViewFilterNavigator.sendKeys("CHARMS");
        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewDashboardLink);
        charmsNativeViewPage.nativeViewDashboardLink.click();
        CommonUtils.waitForVisibility(charmsNativeViewPage.nativeViewiFrameCHARMS);
        CommonUtils.switchToFrame(charmsNativeViewPage.nativeViewiFrameCHARMS);

        // Scrolling into view - locating Rasopathy Surveys

        // Opening Automated Test Record - Self submission

        // verifying
    }

}
