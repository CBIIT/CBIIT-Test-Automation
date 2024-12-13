package PLATFORM_BUSINESS.SSJ.selenium.StepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import static com.nci.automation.web.TestProperties.getSSJUrl;

public class UnauthenticatedApplicantFlowStepsImplementation extends PageInitializer {

    public void loginUnauthenticated() {
        WebDriverUtils.webDriver.get(getSSJUrl());
        CommonUtils.sleep(3000);
    }

    public void clickLogInOption(String option) {
        switch (option) {
            case "Not Registered":
                CommonUtils.waitForVisibility(unauthenticatedApplicantPage.registerHereOption);
                CommonUtils.clickOnElement(unauthenticatedApplicantPage.registerHereOption);
                CommonUtils.sleep(2000);
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
        return unauthenticatedApplicantPage.signInWithPivCardButton.isDisplayed();
    }

    public boolean verifyNIHLoginPage() {
        return unauthenticatedApplicantPage.nihPageLogo.isDisplayed();
    }
}
