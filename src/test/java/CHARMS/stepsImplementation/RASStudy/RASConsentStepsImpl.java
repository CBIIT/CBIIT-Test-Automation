package CHARMS.stepsImplementation.RASStudy;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.web.CommonUtils;
import static CHARMS.steps.RAS_All_Steps.*;
import static CHARMS.steps.RAS_Common_Methods.navigateToParticipantRecordInNativeView;

public class RASConsentStepsImpl extends PageInitializer {

    /**
     * Completes the re-consent process for a study team member using a specified collection method.
     *
     * @param sheetName the name of the sheet to retrieve relevant data or configurations
     */
    public void study_team_member_completes_re_consent_with_as_the_collection_method(String sheetName) {
        ras_Screener_TestDataManager.dataInitializerRasScreener(sheetName);
        ras_NV_Consent_Record_TestDataManager.dataInitializerRasConsentRecord(sheetName);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        openParticipantStudyRecord();
        nativeViewCHARMSParticipantStudyPage.reConsentButton.click();
        CommonUtils.sleep(800);
        openConsentRecord();
        consentFlowProcess(sheetName);
    }
}
