package CHARMS.stepsImplementation.RASStudy;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import CHARMS.constants.Native_View_Constants;
import CHARMS.steps.RAS_Common_Methods;
import CHARMS.utils.CharmsUtil;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import static CHARMS.steps.RAS_Common_Methods.navigateToParticipantRecordInNativeView;
import static Hooks.Hooks.softAssert;

public class RASSubjectFlagsStepsImpl extends PageInitializer {

    /**
     * Allows a study team member to submit Subject Flags for a given participant.
     *
     * @param sheetName The name of the Excel sheet containing the test data for the subject flags.
     */
    public void study_team_member_fills_in_a_new_subject_flags_for(String sheetName) {
        nv_subject_flags_testDataManager.dataInitializerSubjectFlags(sheetName);
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        navigateToParticipantRecordInNativeView(sheetName);
        CommonUtils.waitForClickability(nativeViewCHARMSParticipantStudyPage.subjectFlagsTab);
        JavascriptUtils.scrollIntoView(nativeViewCHARMSParticipantStudyPage.subjectFlagsTab);
        JavascriptUtils.clickByJS(nativeViewCHARMSParticipantStudyPage.subjectFlagsTab);
        CommonUtils.clickOnElement(nativeViewCHARMSParticipantStudyPage.subjectFlagsRecordPreviewButton);
        CommonUtils.waitForVisibility(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewCHARMSDashboardPage.rasStudyOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(500);
        CommonUtils.waitForClickability(nativeViewCHARMSSubjectFlagsPage.participationStatusDropdown);
        CommonUtils.selectDropDownValue(nv_subject_flags_testDataManager.PARTICIPATION_STATUS, nativeViewCHARMSSubjectFlagsPage.participationStatusDropdown);
        CommonUtils.selectDropDownValue(nv_subject_flags_testDataManager.ELIGIBLE_FOR_CLINIC, nativeViewCHARMSSubjectFlagsPage.eligibleForClinicDropdown);
        CommonUtils.selectDropDownValue(nv_subject_flags_testDataManager.INDIVIDUAL_AFFECTED_STATUS, nativeViewCHARMSSubjectFlagsPage.individualAffectedStatusDropdown);
        CommonUtils.selectDropDownValue(nv_subject_flags_testDataManager.INDIVIDUAL_GENETIC_STATUS, nativeViewCHARMSSubjectFlagsPage.individualGeneticStatusDropdown);
        CommonUtils.selectDropDownValue(nv_subject_flags_testDataManager.FAMILY_GENETIC_STATUS, nativeViewCHARMSSubjectFlagsPage.familyGeneticStatusDropdown);
        nativeViewCHARMSSubjectFlagsPage.subjectCommentsTextbox.sendKeys(nv_subject_flags_testDataManager.SUBJECT_COMMENTS);
        nativeViewCHARMSSubjectFlagsPage.saveButton.click();
        CommonUtils.sleep(600);
        CucumberLogUtils.logScreenshot();
        verify_subject_flags();
    }

    /**
     * Use this method to verify labels and fields after Subject Flag submission.
     */
    public void verify_subject_flags() {
        CharmsUtil.verifyLabel("Participation Status");
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.participationStatusDropdown, Native_View_Constants.participationStatusDropdownOptions, "---- SUBJECT FLAGS: MISMATCH IN PARTICIPATION STATUS DROPDOWN OPTIONS ----");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSSubjectFlagsPage.participationStatusDropdown, nv_subject_flags_testDataManager.PARTICIPATION_STATUS, "---- SUBJECT FLAGS: PARTICIPATION STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Eligible for Clinic");
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.eligibleForClinicDropdown, Native_View_Constants.eligibleForClinicDropdownOptions, "---- SUBJECT FLAGS: MISMATCH ELIGIBILITY FOR CLINIC DROPDOWN OPTIONS ----");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSSubjectFlagsPage.eligibleForClinicDropdown, nv_subject_flags_testDataManager.ELIGIBLE_FOR_CLINIC, "---- SUBJECT FLAGS: ELIGIBILITY FOR CLINIC DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Individual Affected Status");
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.individualAffectedStatusDropdown, Native_View_Constants.individualAffectedStatusDropdownOptions, "---- SUBJECT FLAGS: MISMATCH IN INDIVIDUAL AFFECTED STATUS DROPDOWN OPTIONS ----");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSSubjectFlagsPage.individualAffectedStatusDropdown, nv_subject_flags_testDataManager.INDIVIDUAL_AFFECTED_STATUS, "---- SUBJECT FLAGS: INDIVIDUAL AFFECTED STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Individual Genetic Status");
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.individualGeneticStatusDropdown, Native_View_Constants.individualGeneticStatusDropdownOptions, "---- SUBJECT FLAGS: MISMATCH IN INDIVIDUAL GENETIC STATUS DROPDOWN OPTIONS ----");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSSubjectFlagsPage.individualGeneticStatusDropdown, nv_subject_flags_testDataManager.INDIVIDUAL_GENETIC_STATUS, "---- SUBJECT FLAGS: INDIVIDUAL GENETIC STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Family Genetic Status");
        RAS_Common_Methods.softAssertDropdownOptions(nativeViewCHARMSSubjectFlagsPage.familyGeneticStatusDropdown, Native_View_Constants.familyGeneticStatusDropdownOptions, "---- SUBJECT FLAGS: MISMATCH IN FAMILY GENETIC STATUS STATUS DROPDOWN OPTIONS ----");
        RAS_Common_Methods.softAssertDropDownValueIsSelected(nativeViewCHARMSSubjectFlagsPage.familyGeneticStatusDropdown, nv_subject_flags_testDataManager.FAMILY_GENETIC_STATUS, "---- SUBJECT FLAGS: INDIVIDUAL GENETIC STATUS DROPDOWN MISMATCH ----");
        CharmsUtil.verifyLabel("Subject Comments");
        CharmsUtil.verifyInputField(nativeViewCHARMSSubjectFlagsPage.subjectCommentsTextbox, nv_subject_flags_testDataManager.SUBJECT_COMMENTS, "---- SUBJECT FLAGS: SUBJECT COMMENTS TEXTBOX MISMATCH ----");
        CharmsUtil.labelHighlight(nativeViewCHARMSSubjectFlagsPage.familyGeneticStatusMessageText);
        softAssert.assertEquals(nativeViewCHARMSSubjectFlagsPage.familyGeneticStatusMessageText.getText(), "Changes to Family Genetic Status are automatically synced at the family level.", "---- SUBJECT FLAGS: FAMILY GENETIC STATUS TEXT MISMATCH ----");
        CucumberLogUtils.logScreenshot();
    }
}
