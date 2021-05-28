package ServiceNow.ATO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Utils.DriverObjectFactory;

public class IdentityAndAccessManagementPage extends BasePage{
	
	public IdentityAndAccessManagementPage() {
		PageFactory.initElements(DriverObjectFactory.getWebDriver(), this);
	}
	
	@FindBy(css = "input[aria-label='Role']")
	public WebElement roleInput;
	
	@FindBy(css = "select[id$='privilege']")
	public WebElement privilegeDropdown;
	
	@FindBy(css = "select[id$='type']")
	public WebElement typeDropdown;
	
	@FindBy(css = "select[id$='sensitivity_level']")
	public WebElement sensitivityLevelDropdown;
	
	@FindBy(css = "textarea[id$='auhorized_privileges']")
	public WebElement authorizedPrvilegesTextarea;
	
	@FindBy(css = "textarea[id$='functions_performed']")
	public WebElement functionsPerformedTextarea;
	
	@FindBy(id = "sysverb_insert")
	public WebElement topSubmitButton;
	
	@FindBy(css = "[id='x_g_nci_atoaas_identity_and_access_management.uses_shared_accounts']")
	public WebElement isSharedAccountSelectedInput;
	
	@FindBy(css = "[id='label.ni.x_g_nci_atoaas_identity_and_access_management.uses_shared_accounts'][class$='checkbox-label']")
	public WebElement sharedAccountsCheckbox;
	
	@FindBy(css = "[id='x_g_nci_atoaas_identity_and_access_management.shared_account_description']")
	public WebElement sharedAccountDescription;
	
	@FindBy(css = "[id='x_g_nci_atoaas_identity_and_access_management.uses_password_authentication']")
	public WebElement passwordAuthenticationCheckboxVal;
	
	@FindBy(css = "[tab_caption='System Password Requirements'] label[id$='uses_password_authentication']")
	public WebElement passwordAuthenticationCheckbox;
	
	@FindBy(css = "[id='x_g_nci_atoaas_identity_and_access_management.password_strength_description']")
	public WebElement passwordStrengthDescriptionTextarea;
	
	@FindBy(css = "[id='x_g_nci_atoaas_identity_and_access_management.password_change_frequency_description']")
	public WebElement passwordChangeFrequencyDescriptionTextarea;
	
	@FindBy(css = "[id='x_g_nci_atoaas_identity_and_access_management.password_forgotten_procedure']")
	public WebElement passwordForgottenProcedureTextarea;
	
	@FindBy(css = "textarea[id$='password_caching_description']")
	public WebElement passwordCachingDescriptionTextarea;
	
	@FindBy(css = "textarea[id$='credentials_obscured_confirmation']")
	public WebElement credentialsObscuredConfirmationTextarea;
	
	@FindBy(css = "textarea[id$='failed_logins_attempts_description']")
	public WebElement failedLoginsAttemptsDescriptionTextarea;
	
	@FindBy(css = "textarea[id$='least_priviledge_description']")
	public WebElement leastPriviledgeDescriptionTextarea;
	
	@FindBy(css = "textarea[id$='inactivity_timeout_description']")
	public WebElement inactivityTimeoutDescriptionTextarea;
	
	@FindBy(css = "textarea[id$='device_identification_description']")
	public WebElement deviceIdentificationDescriptionTextarea;
	
	@FindBy(css = "textarea[id$='identifier_management_process']")
	public WebElement identifierManagementProcessDescriptionTextarea;
	
	@FindBy(css = "textarea[id$='authenticator_management_process']")
	public WebElement authenticatorManagementProcessTextarea;
	
	@FindBy(css = "textarea[id$='account_management_process']")
	public WebElement accountManagementProcessTextarea;
	
	@FindBy(css = "textarea[id$='system_use_of_notifications_description']")
	public WebElement systemUseOfNotificationsDescriptionTextarea;
	
	
	@FindBy(css = "textarea[id$='permitted_unauthenticated_actions']")
	public WebElement permittedUnauthenticatedActionsTextarea;
	
	@FindBy(css = "textarea[id$='public_content_management_description']")
	public WebElement publicContentManagmentDescriptionTextarea;

	
	
}
