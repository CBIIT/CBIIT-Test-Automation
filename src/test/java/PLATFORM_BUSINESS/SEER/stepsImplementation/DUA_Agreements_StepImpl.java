package PLATFORM_BUSINESS.SEER.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import PLATFORM_BUSINESS.SEER.constants.Registration_Constants;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import java.util.Set;
import static com.nci.automation.web.TestProperties.getSeerOdsUrl;

public class DUA_Agreements_StepImpl extends PageInitializer {

    /**
     * This method represents the actions taken when a user is on the SEER Data Access Request page.
     * It initiates the user registration submission, verifies email address, switches to the new window,
     * validates the landing page title, waits for visibility of specific element, and asserts the page header content.
     */
    public static void a_user_is_on_the_SEER_Data_Access_Request()  {
        SEERUserRegistrationPageStepImpl.aSEERUserRegistrationHasBeenSuccessfullySubmitted();
        SEERDataAccessRequestPageStepsImpl.userVerifiesEmailAddressByClickingOnTheEmailVerificationLinkThatIsSentToTheUserAfterSubmittingASEERUserRegistrationForm();
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        String landingPageTitle = WebDriverUtils.webDriver.getTitle();
        CommonUtils.assertEquals(Registration_Constants.SEER_DATA_ACCESS_CONFIRMATION_ODS_DATA_ACCESS_REQUEST, landingPageTitle );
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessRequestHeader);
        CommonUtils.assertTrue(
                seerDataAccessRequestPage.seerDataAccessRequestHeader.getText().contentEquals("SEER Data Access Request"));

    }

    /**
     * This method represents the actions taken when a user is on the SEER Data Access Research Plus Request page.
     * It logs in to ServiceNow using the side door test account, impersonates a user, navigates to the SEER ODS URL,
     * logs a screenshot, waits for a brief period, scrolls to view and click on the SEER Plus User Registration Submit Button,
     */
    public static void a_user_is_on_the_SEER_Data_Access_Research_Plus_Request() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser("learas@nih.gov");
        WebDriverUtils.webDriver.get(getSeerOdsUrl());
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerPlusUserRegistrationSubmitButton);
        CommonUtils.waitForClickability(seerUserRegistrationPage.seerPlusUserRegistrationSubmitButton);
        seerUserRegistrationPage.seerPlusUserRegistrationSubmitButton.click();
        CommonUtils.sleep(3000);
    }
}