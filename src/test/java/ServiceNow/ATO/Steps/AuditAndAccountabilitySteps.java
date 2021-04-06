package ServiceNow.ATO.Steps;

import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.AuditAndAccountabilityPage;
import ServiceNow.ATO.StepsImplementation.AuditAndAccountabilityStepImpl;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class AuditAndAccountabilitySteps {

	private Scenario scenario;
//	private AuditAndAccountabilityPage auditAndAccoutabilityPage;
	private AuditAndAccountabilityStepImpl auditAndAccountabilityStepImpl;
	
	@Before
	public void before() {
//		this.auditAndAccoutabilityPage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), AuditAndAccountabilityPage.class);
		auditAndAccountabilityStepImpl = new AuditAndAccountabilityStepImpl();
	}
	
	
	@When("User fills Additional Info data")
	public void fillAdditionalInfo() {
		auditAndAccountabilityStepImpl.enterAuditEventDescription("Audit events");
		auditAndAccountabilityStepImpl.enterAuditRecordsMeetNciPoliciesConfirmation("nci policies");
		auditAndAccountabilityStepImpl.enterProceduresUtilizedToMeetNciPolicies("Procedure utilization");
		auditAndAccountabilityStepImpl.enterInformationSecurityEventProcess("Information security test");
		auditAndAccountabilityStepImpl.enterAutomatedReportsDescription("Automated reports test");
		auditAndAccountabilityStepImpl.enterTimestampSourceDescription("Time stamp source test");
		auditAndAccountabilityStepImpl.enterAuditInformationProtectionDescription("Audit information protection test");
		auditAndAccountabilityStepImpl.enterAuditBackupsDescription("Audit backups test");
		
	}
	
}
