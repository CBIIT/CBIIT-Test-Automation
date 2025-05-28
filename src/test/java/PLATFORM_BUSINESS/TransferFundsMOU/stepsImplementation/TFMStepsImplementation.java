package PLATFORM_BUSINESS.TransferFundsMOU.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import PLATFORM_BUSINESS.TransferFundsMOU.constants.TFMConstants;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.NoSuchElementException;

import static Hooks.Hooks.softAssert;
import static com.nci.automation.web.TestProperties.getTFMUrl;

public class TFMStepsImplementation extends PageInitializer {

    /**
     *  User logs in as a Submitter to TFM Portal.
     */
    public static void userLoginTFMPortal() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((TFMConstants.SUBMITTER));
        WebDriverUtils.webDriver.get(getTFMUrl());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * User navigates to TFM portal view form.
     */
    public static void navigateToTFMViaPortalView() {
        CommonUtils.sleep(5000);
        CommonUtils.waitForClickability(tfmPage.servicesDropdownPortalViewTFM);
        CommonUtils.clickOnElement(tfmPage.servicesDropdownPortalViewTFM);
        CommonUtils.waitForClickability(tfmPage.businessServicesPortalViewTFM);
        CommonUtils.clickOnElement(tfmPage.businessServicesPortalViewTFM);
        CommonUtils.waitForClickability(tfmPage.tfmOption);
        CommonUtils.clickOnElement(tfmPage.tfmOption);
    }

    /**
     *Verify TFM portal view Page title
     */
    public static void verifyTFMPageTitle() throws Exception {
        {
            try {
                softAssert.assertTrue(tfmPage.pageTitleTFMPortalView.isDisplayed());
            } catch (Exception e) {
                throw e;
            }
        }
    }
}