package CustomBusiness.CCR.StepsImplementation;

import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class CCRLogInStepsImplementation extends PageInitializer {
    public void ccrLogin() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        MiscUtils.sleep(2000);
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CCR"));
        MiscUtils.sleep(2000);
    }
}

