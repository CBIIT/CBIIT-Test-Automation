package ServiceNow.ATO.StepsImplementation;

import org.openqa.selenium.Keys;

import ServiceNow.ATO.Pages.ConfigurationManagementPlanPage;

public class ConfigurationManagementPlanStepsImpl extends ConfigurationManagementPlanPage{

	public void enterName(String name) {
		enterTextInIFrame(nameInput, name);
	}
	
	public void enterCategory(String category) {
		enterTextInIFrame(categoryInput, category);
	}
	
	public void enterAssetTag(String assetTag) {
		enterTextInIFrame(assetTagInput, assetTag);
	}

	public void selectInstalledDate() throws Exception{
		selectTodayDate(installedDatePicker);
	}
	
	
	public void assignForm() {
		enterTextInIFrame(assignToSearchInput, "Satya Gugulothu" + Keys.TAB);
	}
	
	public void clickOnSubmit() {
		clickOnElementInIFrame(submitButton);
	}
	
	public void selectContact(String name) {
		enterTextInIFrame(contactInput, name + Keys.TAB);
	}
	
	public void selectRole(String role) {
		selectOptionInIFrame(rolesDropdown, role);
	}
	
	public void clickOnNewButton() {
		clickOnElementInIFrame(newButton);
	}
	
	public ConfigurationManagementPlanStepsImpl() {
		super();
	}
}
