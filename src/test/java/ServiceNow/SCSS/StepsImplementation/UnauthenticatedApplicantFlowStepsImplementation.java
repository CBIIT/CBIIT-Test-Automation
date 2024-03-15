package ServiceNow.SCSS.StepsImplementation;


import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;


public class UnauthenticatedApplicantFlowStepsImplementation extends PageInitializer {

    public void loginUnauthentcated() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("AppTracker"));
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(appTrackerLoginPage.logInMainPage);
        MiscUtils.sleep(3000);

    }

}