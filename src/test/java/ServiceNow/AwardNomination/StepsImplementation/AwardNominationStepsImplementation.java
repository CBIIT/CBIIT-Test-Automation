package ServiceNow.AwardNomination.StepsImplementation;

import ServiceNow.AwardNomination.Constants.AwardNominationConstants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.WebDriverUtils;
import static com.nci.automation.web.TestProperties.getAwardNominationUrl;

public class AwardNominationStepsImplementation extends PageInitializer {

    /**
     * Logs in as a Submitter User to NCCR Portal.
     */
    public void awardNominationSubmitterUserLogin() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_Without_Landing_In_Native_View((AwardNominationConstants.SUBMITTERAWARDNOMINATION));
        WebDriverUtils.webDriver.get(getAwardNominationUrl());
        CucumberLogUtils.logScreenshot();
    }
}
