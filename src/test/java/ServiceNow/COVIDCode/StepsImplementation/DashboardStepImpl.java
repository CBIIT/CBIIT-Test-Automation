package ServiceNow.COVIDCode.StepsImplementation;

import org.junit.Assert;

import com.nci.automation.web.JavascriptUtils;

import appsCommon.PageInitializer;

public class DashboardStepImpl extends PageInitializer {
	
	public void draftInitialQuestionnaireTableHeaderAssertion(String draftInitialPatientIDText, String draftInitialUserGroupIDText, String draftInitialNIHMedicalRecordText, String draftInitialLastUpdatedText, String draftInitialAvailableActionsText) {
		Assert.assertTrue(servicePortalQuestionnairePage.draftInitialPatientID.getText().contentEquals(draftInitialPatientIDText));
		Assert.assertTrue(servicePortalQuestionnairePage.draftInitialUserGroupID.getText().contentEquals(draftInitialUserGroupIDText));
		Assert.assertTrue(servicePortalQuestionnairePage.draftInitialNIHMedicalRecordNumber.getText().contentEquals(draftInitialNIHMedicalRecordText));
		Assert.assertTrue(servicePortalQuestionnairePage.draftInitialAvailableActions.getText().contentEquals(draftInitialAvailableActionsText));
	}
	
	public void draftFollowUpQuestionnaireTableHeaderAssertion(String draftFollowUpPatientIDText, String draftFollowUpGroupIDText, String draftFollowUpNIHMedicalRecordText, String draftFollowUpLastUpdateText, String draftFollowUpAvailableActionsText) {
		JavascriptUtils.scrollIntoView(servicePortalQuestionnairePage.startNewFollowUpButton);
		Assert.assertTrue(servicePortalQuestionnairePage.draftFollowUpPatientIDHeader.getText().contentEquals(draftFollowUpPatientIDText));
		Assert.assertTrue(servicePortalQuestionnairePage.draftFollowUpUserGroupIDHeader.getText().contentEquals(draftFollowUpGroupIDText));
		Assert.assertTrue(servicePortalQuestionnairePage.draftFollowUpNIHMedicalRecordHeader.getText().contentEquals(draftFollowUpNIHMedicalRecordText));
		Assert.assertTrue(servicePortalQuestionnairePage.draftFollowUpAvailableActions.getText().contentEquals(draftFollowUpAvailableActionsText));
	}

}
