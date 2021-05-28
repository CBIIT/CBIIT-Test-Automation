package ServiceNow.ATO.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Utils.DriverObjectFactory;

public class ConfigurationManagementPlanPage extends BasePage{
	
	@FindBy(css = "input[id$='name'][class*='form-control']")
	public WebElement nameInput;
	
	@FindBy(css = "input[id$='category'][class*='form-control']")
	public WebElement categoryInput;
	
	@FindBy(css = "input[id$='asset_tag'][class*='form-control']")
	public WebElement assetTagInput;
	
	@FindBy(css = "button[id$='install_date.ui_policy_sensitive'][class*='date_time_trigger']")
	public WebElement installedDatePicker;
	
	@FindBy(css = "select[id$='install_status']")
	public WebElement statusDropdown;
	
	@FindBy(id = "sysverb_insert_bottom")
	public WebElement submitButton;
	
	@FindBy(css = "input[id$='assigned_to'][class*='form-control']")
	public WebElement assignToSearchInput;
	
	@FindBy(css = "[id='sys_display.x_g_nci_atoaas_system_contact.contact']")
	public WebElement contactInput;
	
	@FindBy(css = "[id='x_g_nci_atoaas_system_contact.role']")
	public WebElement rolesDropdown;
	
	@FindBy(css = "div[id$='system_contact.form'] [id='sysverb_new']")
	public WebElement newButton;
	
	public ConfigurationManagementPlanPage() {
		PageFactory.initElements(DriverObjectFactory.getWebDriver(), this);
		}
	
	
	
}
