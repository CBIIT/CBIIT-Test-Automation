package ServiceNow.ATO.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Utils.CommonUtil;
import ServiceNow.ATO.Utils.Constants;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import ServiceNow.ATO.Utils.ReportUtil;
import cucumber.api.Scenario;

public class SecurityFormPage extends BasePage {
	
	public Scenario scenario;
	
	@FindBy(css = "select[id$='form_status']")
	public WebElement formStatusDropdown;
	
	@FindBy(css = "input[id$='assigned_to'][class*='element_reference_input']")
	public WebElement assignToSearchBox;
	
	@FindBy(xpath = "//span[contains(text(),'Approval')]")
	public WebElement approvalTab;
	
	@FindBy(xpath = "//span[contains(text(),'Assurance Levels')]")
	public WebElement assuranceLevelsTab;
	
	@FindBy(css = "input[id$='certified_by'][class*='element_reference_input']")
	public WebElement verifiedByInput;
	
	@FindBy(css = "button[id$='ui_policy_sensitive'][class*='date_time_trigger']")
	public WebElement verifiedOnDatePicker;
	
	@FindBy(css = "input[id$='accepted_by'][class*='element_reference_input']")
	public WebElement approvedByInput;
	
	@FindBy(css = "a[id$='ui_policy_sensitive']")
	public WebElement approvedOnDatePicker;
	
	@FindBy(css = "input[id$='information_type'][class*='element_reference_input']")
	public WebElement informationTypeSearchInput;
	
	@FindBy(css = "select[id$='confidentiality_adjusted']")
	public WebElement confidentialityAdjustDropdown;
	
	@FindBy(css = "select[id$='integrity_adjusted']")
	public WebElement integrityAdjustDropdown;
	
	@FindBy(css = "select[id$='availability_adjusted']")
	public WebElement availabilityAdjustDropdown;
	
	@FindBy(css = "textarea[id$='rationale']")
	public WebElement rationaleTextArea;
	
	@FindBy(css = "select[id$='is_standalone_system']")
	public WebElement isStandaloneSystemDropdown;
	
	@FindBy(css = "select[id$='involves_online_transactions']")
	public WebElement involvesOnlineTransactionsDropdown;
	
	@FindBy(css = "[id$='system_asset.form'] [id='sysverb_new']")
	public WebElement newButton;
	
	@FindBy(id = "sysverb_new")
	public WebElement saveButton;
	
	@FindBy(css = "select[id$='control_type']")
	public WebElement controlTypeDropdown;
	
	@FindBy(css = "select[id$='implementation_status']")
	public WebElement implementationStatusDropdown;
	
	@FindBy(css = "textarea[id$='implementation_description']")
	public WebElement implementationDescriptionTextarea;
	
	@FindBy(xpath = "//span[contains(text(), 'System Assets')][@class='tab_caption_text']")
	public WebElement systemAssetTab;
	
	@FindBy(xpath = "//span[contains(text(), 'Ports Protocols and Services')][@class='tab_caption_text']")
	public WebElement portsProtocolsAndServicesTab;
	
	@FindBy(xpath = "//span[contains(text(), 'System Interconnections')][@class='tab_caption_text']")
	public WebElement systemInterconnectionsTab;
	
	@FindBy(css = "[id$='name'][aria-label='Name']")
	public WebElement nameInput;
	
	@FindBy(css = "input[aria-label='Product']")
	public WebElement productInput;
	
	@FindBy(css = "input[aria-label='Model']")
	public WebElement modelInput;
	
	@FindBy(css = "input[aria-label='Vendor']")
	public WebElement vendorInput;
	
	@FindBy(css = "input[aria-label='Version']")
	public WebElement versionInput;
	
	@FindBy(css = "input[aria-label='Hostname']")
	public WebElement hostnameInput;
	
	@FindBy(css = "input[aria-label='IP Address']")
	public WebElement iPAddressInput;
	
	@FindBy(css = "input[aria-label='Subnet']")
	public WebElement subnetInput;
	
	@FindBy(css = "input[aria-label='Location']")
	public WebElement locationInput;
	
	@FindBy(css = "textarea[aria-label='Description']")
	public WebElement descriptionInput;
	
	@FindBy(css = "input[aria-label='Service name']")
	public WebElement serviceNameInput;
	
	@FindBy(css = "input[aria-label='Port']")
	public WebElement portInput;
	
	@FindBy(css ="select[id$='protocol']")
	public WebElement protocolDropdown;
	
	@FindBy(css ="select[id$='asset_type']")
	public WebElement assetTypeDropdown;
	
	@FindBy(css = "[aria-labelledby$='associated_asset']")
	public WebElement associatedAssetInput;
	
	@FindBy(css = "input[aria-label='System name']")
	public WebElement systemNameInput;
	
	@FindBy(css = "input[aria-label='Security categorization']")
	public WebElement securityCategorizationInput;
	
	@FindBy(css = "input[aria-label='Organization']")
	public WebElement organizationInput;
	
	@FindBy(css = "input[aria-label='Connection type']")
	public WebElement connectionTypeInput;
	
	@FindBy(css = "input[aria-label='Authorization status']")
	public WebElement authorizationStatusInput;
	
	@FindBy(css = "input[aria-label='Authorizing official']")
	public WebElement authorizingOfficialInput;
	
	@FindBy(css ="select[id$='agreement_type']")
	public WebElement agreementTypeDropdown;
	
	@FindBy(css = "[id$='ui_policy_sensitive']")
	public WebElement dateOfAgreement;
	
	@FindAll({@FindBy(id="sysverb_new")})
	public List<WebElement> newButtons; 
	
	public SecurityFormPage() {
		PageFactory.initElements(DriverObjectFactory.getWebDriver(), this);
	}
	

}
