package ServiceNow.ATO.StepsImplementation;

import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.AuditAndAccountabilityPage;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import cucumber.api.java.Before;

public class AuditAndAccountabilityStepImpl extends AuditAndAccountabilityPage{
	
	public AuditAndAccountabilityStepImpl() {
		super();
	}
	public void enterAuditEventDescription(String inputText) {
		enterTextInIFrame(auditEventDescriptionTextarea, inputText);	
	}
	
	public void enterAuditRecordsMeetNciPoliciesConfirmation(String inputText) {
		enterTextInIFrame(auditRecordsMeetNciPoliciesConfirmationTextarea, inputText);
	}
	
	public void enterProceduresUtilizedToMeetNciPolicies(String inputText) {
		enterTextInIFrame(proceduresUtilizedToMeetNciPoliciesTextarea, inputText);	
	}
	
	public void enterInformationSecurityEventProcess(String inputText) {
		enterTextInIFrame(informationSecurityEventProcessTextarea, inputText);	
	}
	
	public void enterAutomatedReportsDescription(String inputText) {
		enterTextInIFrame(automatedReportsDescriptionTextarea, inputText);	
	}
	
	public void enterTimestampSourceDescription(String inputText) {
		enterTextInIFrame(timestampSourceDescriptionTextarea, inputText);	
	}
	
	public void enterAuditInformationProtectionDescription(String inputText) {
		enterTextInIFrame(auditInformationProtectionDescriptionTextarea, inputText);	
	}
	
	public void enterAuditBackupsDescription(String inputText) {
		enterTextInIFrame(auditBackupsDescriptionTextarea, inputText);	
	}
}
