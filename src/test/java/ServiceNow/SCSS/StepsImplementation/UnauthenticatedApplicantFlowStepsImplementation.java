package ServiceNow.SCSS.StepsImplementation;


import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;


public class UnauthenticatedApplicantFlowStepsImplementation extends PageInitializer {

    public void loginUnauthenticated() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("AppTracker"));
        MiscUtils.sleep(3000);
        CommonUtils.clickOnElement(unauthenticatedApplicantPage.logInMainPage);
        MiscUtils.sleep(3000);

    }

}