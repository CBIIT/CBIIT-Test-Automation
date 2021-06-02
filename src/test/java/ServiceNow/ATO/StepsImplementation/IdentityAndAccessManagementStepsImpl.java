package ServiceNow.ATO.StepsImplementation;

import ServiceNow.ATO.Pages.IdentityAndAccessManagementPage;

public class IdentityAndAccessManagementStepsImpl extends IdentityAndAccessManagementPage{

	public IdentityAndAccessManagementStepsImpl() {
		super();
	}
	
	public void checkUserSharedAccountsCheckBox() {
		clickOnElementInIFrame(sharedAccountsCheckbox);
	}
	
	public Boolean isUserSharedAccountsCheckboxSeleted() {
		switchToFrame();
		String val = isSharedAccountSelectedInput.getAttribute("value");
		switchToDefaultFrame();
		if("true".equalsIgnoreCase(val)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void enterSharedAccountsProcedures(String data) {
		switchToFrame();
		sharedAccountDescription.clear();
		sharedAccountDescription.sendKeys(data);
		switchToDefaultFrame();
	}
	
	public Boolean isSystemUsesPasswordAuthenticationCheckboxSelected() {
		switchToFrame();
		String val = passwordAuthenticationCheckboxVal.getAttribute("value");
		switchToDefaultFrame();
		if("true".equalsIgnoreCase(val)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void checkSystemUsesPasswordAuthenticationCheckbox() {
		clickOnElementInIFrame(passwordAuthenticationCheckbox);
	}
	
	public void enterPasswordStrengthDescription(String description) {
		enterTextInIFrame(passwordStrengthDescriptionTextarea, description);
	}
	
	public void enterPasswordChangeFrequencyDescription(String description) {
		enterTextInIFrame(passwordChangeFrequencyDescriptionTextarea, description);
	}
	
	public void enterPasswordForgottenProcedure(String description) {
		enterTextInIFrame(passwordForgottenProcedureTextarea, description);
	}
	
	public void enterPasswordCachingDescription(String description) {
		enterTextInIFrame(passwordCachingDescriptionTextarea, description);
	}
	
	public void enterCredentialsObscuredConfirmation(String description) {
		enterTextInIFrame(credentialsObscuredConfirmationTextarea, description);
	}
	
	public void enterFailedLoginsAttemptsDescription(String description) {
		enterTextInIFrame(failedLoginsAttemptsDescriptionTextarea, description);
	}
	
	public void enterLeastPriviledgeDescription(String description) {
		enterTextInIFrame(leastPriviledgeDescriptionTextarea, description);
	}
	
	public void enterInactivityTimeoutDescription(String description) {
		enterTextInIFrame(inactivityTimeoutDescriptionTextarea, description);
	}
	
	public void enterDeviceIdentificationDescription(String description) {
		enterTextInIFrame(deviceIdentificationDescriptionTextarea, description);
	}
	
	public void enterIdentifierManagementProcess(String description) {
		enterTextInIFrame(identifierManagementProcessDescriptionTextarea, description);
	}
	
	public void enterAuthenticatorManagementProcess(String description) {
		enterTextInIFrame(authenticatorManagementProcessTextarea, description);
	}
	
	public void enterAccountManagementProcess(String description) {
		enterTextInIFrame(accountManagementProcessTextarea, description);
	}
	
	public void enterSystemUseOfNotificationsDescription(String description) {
		enterTextInIFrame(systemUseOfNotificationsDescriptionTextarea, description);
	}
	
	public void enterPermittedUnauthenticatedActions(String description) {
		enterTextInIFrame(permittedUnauthenticatedActionsTextarea, description);
	}
	
	public void enterPublicContentManagementDescription(String description) {
		enterTextInIFrame(publicContentManagmentDescriptionTextarea, description);
	}
	
	public void enterRole(String roleName) {
		enterTextInIFrame(roleInput, roleName);
	}
	
	public void selectPrivilege(String val) {
		selectOptionInIFrame(privilegeDropdown, val);
	}
	
	public void selectType(String val) {
		selectOptionInIFrame(typeDropdown, val);
	}
	
	public void selectSensitivityLevel(String val) {
		selectOptionInIFrame(sensitivityLevelDropdown, val);
	}
	
	public void enterAuhorizedPrivileges(String text) {
		enterTextInIFrame(authorizedPrvilegesTextarea, text);
	}
	
	public void enterFunctionsPerformed(String text) {
		enterTextInIFrame(functionsPerformedTextarea, text);
	}
	
	public void clickOnSubmitButton() {
		clickOnElementInIFrame(topSubmitButton);
	}
	
}
