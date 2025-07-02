package CUSTOM_BUSINESS.FCAS_VENDOR_PORTAL.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import static Hooks.Hooks.softAssert;
import static com.nci.automation.web.TestProperties.*;

public class FCASVENDORPORTALStepsImplementation extends PageInitializer {

    /**
     * User logs in as a Submitter to FCAS vendor Portal.
     */
    public static void userLoginFCASVendorPortal() {
        WebDriverUtils.webDriver.get(getFCASVendorPortalUrl());
        CommonUtils.sendKeys(nihLoginPage.username, I_TRUST_USERNAME);
        String decryptedPass = EncryptionUtils.decrypt(I_TRUST_PASSWORD);
        CommonUtils.sendKeys(nihLoginPage.password, decryptedPass);
        CommonUtils.clickOnElement(nihLoginPage.signInButton);
        CommonUtils.sleep(3000);
    }

    /**
     * Verify All and My contracts options
     */
    public static void verifyAllMyContractsOptions() {
        softAssert.assertTrue(fCASVENDORPORTALPage.allContractsOption.isDisplayed());
        softAssert.assertTrue(fCASVENDORPORTALPage.myContractsOption.isDisplayed());
    }

    /**
     * User chooses Existing Contracts Submit Work Order option
     */
    public static void chooseExistingContractsSubmitWorkOrderOption(){
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.existingContractsRecordMenu);
        CommonUtils.waitForClickability(fCASVENDORPORTALPage.submitWorkOrderOption);
        CommonUtils.clickOnElement(fCASVENDORPORTALPage.submitWorkOrderOption);
 }
}