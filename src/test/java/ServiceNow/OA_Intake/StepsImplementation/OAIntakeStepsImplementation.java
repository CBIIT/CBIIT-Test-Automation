package ServiceNow.OA_Intake.StepsImplementation;

import ServiceNow.OA_Intake.Constants.OAIntakeConstants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.WebDriverUtils;
import static com.nci.automation.web.TestProperties.getOAntakeUrl;

public class OAIntakeStepsImplementation extends PageInitializer {

    /**
     * Logs in as a Submitter to OA Intake Portal.
     */
    public void oaIntakeSubmitterUserLogin(){
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((OAIntakeConstants.SUBMITTER));
        WebDriverUtils.webDriver.get(getOAntakeUrl());
        CucumberLogUtils.logScreenshot();
    }
}