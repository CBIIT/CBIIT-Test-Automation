package ServiceNow.SSJ.StepsImplementation;


import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.junit.Assert;


public class UnauthenticatedApplicantFlowStepsImplementation extends PageInitializer {

    public void loginUnauthenticated() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SSJPortalView"));
        MiscUtils.sleep(3000);
    }

    public void clickLogInOption(String option) {
        switch (option) {
            case "Not Registered":
                CommonUtils.waitForVisibility(unauthenticatedApplicantPage.registerHereOption);
                CommonUtils.clickOnElement(unauthenticatedApplicantPage.registerHereOption);
                MiscUtils.sleep(2000);
                break;
            case "Already Registered":
                CommonUtils.waitForVisibility(unauthenticatedApplicantPage.clickHereOption);
                CommonUtils.clickOnElement(unauthenticatedApplicantPage.clickHereOption);
                break;
            case "Employee/Contractor Only":
                CommonUtils.waitForVisibility(unauthenticatedApplicantPage.nihLoginOption);
                CommonUtils.clickOnElement(unauthenticatedApplicantPage.nihLoginOption);
                break;
        }
    }

    public boolean verifyRegisteredOktaUserPage() {
        if (unauthenticatedApplicantPage.signInWithPivCardButton.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyNIHLoginPage() {
        if (unauthenticatedApplicantPage.nihPageLogo.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}