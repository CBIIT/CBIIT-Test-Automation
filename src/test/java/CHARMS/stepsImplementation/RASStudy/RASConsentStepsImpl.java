package CHARMS.stepsImplementation.RASStudy;

import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;

public class RASConsentStepsImpl extends PageInitializer {

    /**
     * Study Team member completes the re-consent process using the specified collection method.
     *
     * @param collectionMethod the method used for the re-consent collection
     */
    public void study_team_member_completes_re_consent_with_as_the_collection_method(String collectionMethod) {
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.reConsentButton);
        nativeViewCHARMSParticipantStudyPage.reConsentButton.click();
        CommonUtils.sleep(800);

        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsTab);
        JavascriptUtils.clickByJS(nativeViewCHARMSParticipantDetailsPage.nativeViewPatientDetailsConsentsPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
    }
}
