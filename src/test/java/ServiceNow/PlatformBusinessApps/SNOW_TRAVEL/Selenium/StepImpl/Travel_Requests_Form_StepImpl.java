package ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.Selenium.StepImpl;

import ServiceNow.PlatformBusinessApps.SNOW_TRAVEL.Selenium.Constants.Trava_Request_Form_Constants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

public class Travel_Requests_Form_StepImpl extends PageInitializer {

    /**
     * This method is impersonating CGH user
     */
    public static void i_am_a_authenticated_travel_request_user_under_the_doc_cgh() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser("Dimetria Branch");
        WebDriverUtils.webDriver.get(Trava_Request_Form_Constants.GSNOWTRAVEL_FORM_URL);
    }

    public static void i_am_on_the_portal_form(String travelPlanningSystem) {
        CommonUtils.waitForVisibility(travel_Request_Form_Page.travelPlanningSystemPageHeaderText);
        JavascriptUtils.drawBlueBorder(travel_Request_Form_Page.travelPlanningSystemPageHeaderText);
    }
}