package ServiceNow.ATO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Utils.DriverObjectFactory;

public class AuditAndAccountabilityPage extends BasePage{
	
	@FindBy(css = "textarea[id$='audit_events_description']")
	public WebElement auditEventDescriptionTextarea;
	
	@FindBy(css = "textarea[id$='audit_records_meet_nci_policies_confirmation']")
	public WebElement auditRecordsMeetNciPoliciesConfirmationTextarea;
	
	@FindBy(css = "textarea[id$='procedures_utilized_to_meet_nci_policies']")
	public WebElement proceduresUtilizedToMeetNciPoliciesTextarea;
	
	@FindBy(css = "textarea[id$='information_security_event_process']")
	public WebElement informationSecurityEventProcessTextarea;
	
	@FindBy(css = "textarea[id$='automated_reports_description']")
	public WebElement automatedReportsDescriptionTextarea;
	
	@FindBy(css = "textarea[id$='timestamp_source_description']")
	public WebElement timestampSourceDescriptionTextarea;
	
	@FindBy(css = "textarea[id$='audit_information_protection_description']")
	public WebElement auditInformationProtectionDescriptionTextarea;
	
	@FindBy(css = "textarea[id$='audit_backups_description']")
	public WebElement auditBackupsDescriptionTextarea;

	
	public AuditAndAccountabilityPage() {
		PageFactory.initElements(DriverObjectFactory.getWebDriver(), this);
	}
}
