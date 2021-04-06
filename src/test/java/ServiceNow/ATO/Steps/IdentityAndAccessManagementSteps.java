package ServiceNow.ATO.Steps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.CommonPage;
import ServiceNow.ATO.Pages.IdentityAndAccessManagementPage;
import ServiceNow.ATO.StepsImplementation.IdentityAndAccessManagementStepsImpl;
import ServiceNow.ATO.Utils.CommonUtil;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class IdentityAndAccessManagementSteps {
	
	private Scenario scenario;
	private IdentityAndAccessManagementStepsImpl identityAndAccessManagementStepsImpl;
	private CommonPage commonPage;
	
	@Before
	public void before() {
		this.identityAndAccessManagementStepsImpl = new IdentityAndAccessManagementStepsImpl();
		this.commonPage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), CommonPage.class);
	}
	
	
	@When("User fills shared accounts details")
	public void fillSharedAccountsDetails(DataTable dataTable) {
		Map<String, String> testData = CommonUtil.getMapFromDataTable(dataTable);
		Boolean isUserSharedAccount = "true".equalsIgnoreCase(testData.get("Uses Shared Accounts")) ? true : false;
		if(isUserSharedAccount) {
			if(!identityAndAccessManagementStepsImpl.isUserSharedAccountsCheckboxSeleted()) {
				identityAndAccessManagementStepsImpl.checkUserSharedAccountsCheckBox();
			}
			identityAndAccessManagementStepsImpl.enterSharedAccountsProcedures(testData.get("Shared Accounts Procedures"));
		}
	}
	
	@When("User clicks on System Uses Password Authentication checkbox")
	public void selectSystemUsesPasswordAuthentication() {
		if(!identityAndAccessManagementStepsImpl.isSystemUsesPasswordAuthenticationCheckboxSelected()) {
			identityAndAccessManagementStepsImpl.checkSystemUsesPasswordAuthenticationCheckbox();
		}
		
	}
	
	
	@When("User fills system password requirements details")
	public void fillSystemPasswordRequirements(DataTable dataTable) {
		Map<String, String> testData = CommonUtil.getMapFromDataTable(dataTable);
		Set<String> keySet = testData.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			switch(key) {
			case "Strength Description":
				identityAndAccessManagementStepsImpl.enterPasswordStrengthDescription(testData.get(key));
				break;
			case "Change Frequency Description":
				identityAndAccessManagementStepsImpl.enterPasswordChangeFrequencyDescription(testData.get(key));
				break;
			case "Forgotten Procedure":
				identityAndAccessManagementStepsImpl.enterPasswordForgottenProcedure(testData.get(key));
				break;
			case "Caching Description":
				identityAndAccessManagementStepsImpl.enterPasswordCachingDescription(testData.get(key));
				break;
			case "Credential Obscured Confirmation":
				identityAndAccessManagementStepsImpl.enterCredentialsObscuredConfirmation(testData.get(key));
				break;
			case "Failed Login Attempts":
				identityAndAccessManagementStepsImpl.enterFailedLoginsAttemptsDescription(testData.get(key));
				break;
			case "Least Privilege":
				identityAndAccessManagementStepsImpl.enterLeastPriviledgeDescription(testData.get(key));
				break;
			case "Inactive Timeout":
				identityAndAccessManagementStepsImpl.enterInactivityTimeoutDescription(testData.get(key));
				break;
			default:
				break;
			}
		}
		
	}
	
	@When("User fills Account Lifecycle Policy and Procedures")
	public void fillAccountLifecyclePolicyAndProcedures(DataTable dataTable) {
		Map<String, String> testData = CommonUtil.getMapFromDataTable(dataTable);
		Set<String> keySet = testData.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			switch(key) {
			case "Device Identification Description":
				identityAndAccessManagementStepsImpl.enterDeviceIdentificationDescription(testData.get(key));
				break;
			case "Identifier Management Process":
				identityAndAccessManagementStepsImpl.enterIdentifierManagementProcess(testData.get(key));
				break;
			case "Authenticator Management Process":
				identityAndAccessManagementStepsImpl.enterAuthenticatorManagementProcess(testData.get(key));
				break;
			case "Account Management Process":
				identityAndAccessManagementStepsImpl.enterAccountManagementProcess(testData.get(key));
				break;
			case "System Use of Notifications Description":
				identityAndAccessManagementStepsImpl.enterSystemUseOfNotificationsDescription(testData.get(key));
				break;
			case "Permitted Unauthenticated Actions":
				identityAndAccessManagementStepsImpl.enterPermittedUnauthenticatedActions(testData.get(key));
				break;
			case "Public Content Management Description":
				identityAndAccessManagementStepsImpl.enterPublicContentManagementDescription(testData.get(key));
				break;
			default:
				break;
			}
		}
	}
	
	@When("User enters rules and privileges")
	public void enterRuleDetails(DataTable dataTable) {
		Map<String, String> testData = CommonUtil.getMapFromDataTable(dataTable);
		Set<String> keySet = testData.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			switch(key) {
			case "Role":
				identityAndAccessManagementStepsImpl.enterRole(testData.get(key));
				break;
			case "Privilege":
				identityAndAccessManagementStepsImpl.selectPrivilege(testData.get(key));
				break;
			case "Type":
				identityAndAccessManagementStepsImpl.selectType(testData.get(key));
				break;
			case "Sensitivity Level":
				identityAndAccessManagementStepsImpl.selectSensitivityLevel(testData.get(key));
				break;
			case "Authorized privileges":
				identityAndAccessManagementStepsImpl.enterAuhorizedPrivileges(testData.get(key));
				break;
			case "Functions Performed":
				identityAndAccessManagementStepsImpl.enterFunctionsPerformed(testData.get(key));
				break;
			default:
				break;
			}
		}
		
		identityAndAccessManagementStepsImpl.clickOnSubmitButton();
	}
	

}
