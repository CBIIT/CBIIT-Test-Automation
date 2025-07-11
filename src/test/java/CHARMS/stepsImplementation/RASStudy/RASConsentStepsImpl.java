package CHARMS.stepsImplementation.RASStudy;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import CHARMS.steps.RAS_Common_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import static CHARMS.steps.RAS_All_Steps.*;
import static CHARMS.steps.RAS_Common_Methods.navigateToParticipantRecordInNativeView;

public class RASConsentStepsImpl extends PageInitializer {

    /**
     * Completes the re-consent process for a study team member using a specified collection method.
     *
     * @param sheetName the name of the sheet to retrieve relevant data or configurations
     */
    public void study_team_member_completes_re_consent_with_as_the_collection_method(String sheetName, String collectionMethod) {
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ras_NV_Consent_Record_TestDataManager.dataInitializerRasConsentRecord(sheetName, collectionMethod);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        openParticipantStudyRecord();
        nativeViewCHARMSParticipantStudyPage.reConsentButton.click();
        CommonUtils.sleep(800);
        openConsentRecord();
        consentFlowProcess();
    }

    /**
     * THIS METHOD WILL CLICK ON TABS LOCATED IN NATIVE VIEW RECORDS.
     *
     * @param tabCaptionText the text of the tab to be clicked
     */
    @Given("clicks the {string} tab")
    public static void clicksTab(String tabCaptionText) {
        RAS_Common_Methods.dynamicTabLocator(tabCaptionText).click();
        CommonUtils.sleep(600);
        CucumberLogUtils.logScreenshot();
    }
}