package CustomBusiness.ETD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class ETDAdminNCIPage extends CommonUtils {
	public ETDAdminNCIPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	/**Change Button*/
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
	public WebElement changeUserButtonNCI;
	
	/**Input Field*/
	@FindBy(xpath = "//input[@id='changeUserInput']")
	public WebElement inputFieldChangeUser;
	
	/**Dropdown Change User*/
	@FindBy(xpath = "//div[@class='ui-menu-item-wrapper']")
	public WebElement dropdownChangeUser;
	
	/**Organization Dropdown*/
	@FindBy(xpath = "//span[@id='select2-orgPath-container']")
	public WebElement organizationDropdown;
	
	/**Organization NCI*/
	@FindBy(xpath = "(//span[@class='select2-selection__rendered'])[2]")
	public WebElement organizationNCI;
	
	/**Home Tab*/
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	public WebElement homeTab;
	
	/**About ETD*/
	@FindBy(xpath = "//a[contains(text(),'About ETD')]")
	public WebElement aboutETDTab;
	
	/**Manage ETD*/
	@FindBy(xpath = "//a[contains(text(),'Manage ETD')]")
	public WebElement manageETDTab;
	
	/**Manage Roles*/
	@FindBy(xpath = "//a[contains(text(),'Manage Roles')]")
	public WebElement manageRolesTab;
	
	/**Home Tab title*/
	@FindBy(xpath = "//span[contains(text(),'Designation as a Tier II-Mission Critical/Mission Operations Employee')]")
	public WebElement titleHomeTab;
	
	/**About ETD title*/
	@FindBy(xpath = "//h2[contains(text(),'About ETD')]")
	public WebElement titleAboutETD;
	
	/**titleManageETD*/
	@FindBy(xpath = "//h2[contains(text(),'Manage ETD')]")
	public WebElement titleManageETD;
	
	/**titleManageRoles*/
	@FindBy(xpath = "//h2[contains(text(),'Manage Roles')]")
	public WebElement titleManageRoles;
	
	/**userCliffordDavid*/
	@FindBy(xpath = "//a[contains(text(),'CLIFFORD, DAVID')]")
	public WebElement userCliffordDavid;
	
	/**search Filter*/
	@FindBy(xpath = "//input[@aria-controls='userRolesTable']")
	public WebElement searchFilter;
	
	/**delete User*/
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[2]")
	public WebElement deleteUserButton;
	
	/**add Button*/
	@FindBy(xpath = "//button[normalize-space()='Add']")
	public WebElement addButton;
	
	/**search Name Field*/
	@FindBy(xpath = "//input[@id='addEditModalUserSearch']")
	public WebElement searchNameField;
	
	/**Alert*/
	@FindBy(xpath = "//span[@id='msgExistingUser']")
	public WebElement alert;
	
	/**role ETD Liaison*/
	@FindBy(xpath = "//input[@id='addEditModalRoleLiaison']")
	public WebElement roleETDLiaison;
	
	/**role Admin*/
	@FindBy(xpath = "//input[@id='addEditModalRoleAdmin']")
	public WebElement roleAdmin;
	
	/**dropdown Organization/SAC*/
	@FindBy(xpath = "//span[@id='select2-addEditModalOrgSelect-container']")
	public WebElement dropdownOrganization;
	 
	/**dropdown NCI*/
	@FindBy(xpath = "//li[@class='select2-results__option']")
	public WebElement dropdownNCI;
	
	/**dropdown HNC14*/
	@FindBy(xpath = "//li[@id='select2-addEditModalOrgSelect-result-g6wj-HNC14']")
	public WebElement dropdownHNC14;
	
	/**save Button*/
	@FindBy(xpath = "//button[@id='modalAddEditSubmit']")
	public WebElement saveButton;
	
	/**save Button Acknowledge on behalf of user*/
	@FindBy(xpath = "//button[@id='saveAcknowledge']")
	public WebElement saveButtonAcknowledge;
	
	/**delete Barbara*/
	@FindBy(xpath = "(//button[@class='btn btn-danger mr-2'])[4]")
	public WebElement deleteBarbara;
	
	/**confirmation Delete*/
	@FindBy(xpath = "//button[@id='modalDeleteConfirmationSubmit']")
	public WebElement confirmationDelete;
	
	/**delete Organization*/
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	public WebElement deleteOrganization;
	
	/**cancel Button*/
	@FindBy(xpath = "//button[@class='btn btn-default float-right mr-2']")
	public WebElement cancelButton;
	
	/**NCI (HNC) organization*/
	@FindBy(xpath = "((//ul[@class='userRolesList'])[4]//li)[1]")
	public WebElement orgNCIHNC;
	
	/**NCI OD (HNC1) organization*/
	@FindBy(xpath = "((//ul[@class='userRolesList'])[4]//li)[2]")
	public WebElement orgHNC1;
	
	/**edit*/
	@FindBy(xpath = "//button[@class='btn btn-primary edit mr-2']")
	public WebElement editButton;
	
	/**Adam Profile*/
	@FindBy(xpath = "//a[contains(text(),'ADAM, TRENGO')]")
	public WebElement adamProfile;
	
	/**AcadiaProfile*/
	@FindBy(xpath = "//a[contains(text(),'GRIMME, ACADIA')]")
	public WebElement acadiaProfile;
	
	/**AcadiaProfile*/
	@FindBy(xpath = "//a[contains(text(),'BANKS, CAROLYN')]")
	public WebElement carolynProfile;
	
	/**alert NoMatchingTitle*/
	@FindBy(xpath = "//td[contains(text(),'No matching records found')]")
	public WebElement alertNoMatchingTitle;
	
	/**name Tab*/
	@FindBy(xpath = "//th[@id='e-name']")
	public WebElement nameTab;
	
	/**organization Tab*/
	@FindBy(xpath = "//th[@id='e-tier']")
	public WebElement organizationTab;
	
	/**role Tab*/
	@FindBy(xpath = "//th[@aria-label='Role: activate to sort column ascending']")
	public WebElement roleTab;
	
	/**actions Tab*/
	@FindBy(xpath = "//th[@id='actions']")
	public WebElement actionsTab;
	
	/**actions Tab*/
	@FindBy(xpath = "//input[@id='sacCode']")
	public WebElement sacCode;
	
	/**Search button*/
	@FindBy(xpath = "//a[@id='search']")
	public WebElement searchButton;
	
	/**wide search result*/
	@FindBy(xpath = "//div[@id='searchResultTable_info']")
	public WebElement wideSearchResult;
	
	/**date acknowledged for AALAI, MARRIAM*/
	@FindBy(xpath = "//td[4]")
	public WebElement dateAcknowledgedMariam;
	
	/**acknowledged By David*/
	@FindBy(xpath = "//td[contains(text(),'CLIFFORD, DAVID')]")
	public WebElement acknowledgedByDavid;
	
	/**search Bar Manage ETD*/
	@FindBy(xpath = "//input[@aria-controls='searchResultTable']")
	public WebElement filterManageETD;
	
	/**alert Tier is verified*/
	@FindBy(xpath = "//span[contains(text(),'Our records indicate that you have already acknowledged your Emergency Tier Designation.')]")
	public WebElement tierIsAcknowledged;
	
	/**search Bar Manage ETD*/
	@FindBy(xpath = "//p[contains(text(),'Please read and review your Emergency Tier Designation Letter below and click on the')]")
	public WebElement tierNotAcknowledged;
	
	/**tier 1 alert*/
	@FindBy(xpath = "//span[normalize-space()='Designation as a Tier I-Emergency Employee']")
	public WebElement tier1Alert;
	
	/**tier 2 alert*/
	@FindBy(xpath = "//span[normalize-space()='Designation as a Tier II-Mission Critical/Mission Operations Employee']")
	public WebElement tier2Alert;
	
	/**tier 3 alert*/
	@FindBy(xpath = "//span[normalize-space()='Designation as a Tier III-Non-Emergency/Non-Teleworker']")
	public WebElement tier3Alert;
	
	/**tier 3D alert*/
	@FindBy(xpath = "//span[contains(text(),'You do not have an Emergency Tier Designation defi')]")
	public WebElement tier3DAlert;
	
	/**NCI Home Tab content*/
	@FindBy(xpath = "//p[contains(text(),'In accordance with NCI and NIH guidelines')]")
	public WebElement nciHomeTab;
	
	/**NIDDK Home Tab content*/
	@FindBy(xpath = "//p[contains(text(),'In accordance with NIDDK and NIH guidelines')]")
	public WebElement niddkHomeTab;
	
	/**NIDDK Home Tab content*/
	@FindBy(xpath = "//p[contains(text(),'In accordance with OD and NIH guidelines')]")
	public WebElement ohrHomeTab;
	
	/**Sort Reminders*/
	@FindBy(xpath = "//th[@class='sortable sorting_asc']")
	public WebElement sortReminders;
	
	/**edit Button First User In the Table*/
	@FindBy(xpath = "//span[@class='dtr-data']//button[@value='Acknowledge']")
	public WebElement editButtonFirstUserIntheTable;
	
	/**Acknowledge on behalf of User*/
	@FindBy(xpath = "//button[@class='btn btn-lg btn-success active']")
	public WebElement acknowledgeOnBehalfOfUser;
	
	/**Acknowledge on behalf of User Whitney*/
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary']")
	public WebElement acknowledgeOnBehalfOfUserW;
	
	/**ReminderDate*/
	@FindBy(xpath = "//div[@class='reminder-date']")
	public WebElement reminderDate;
	
	/**ReminderDateWhitney*/
	@FindBy(xpath = "//td[7]")
	public WebElement reminderDateWhitney;
	
	/**name Field*/
	@FindBy(xpath = "//th[@id='employee-name']")
	public WebElement nameField;
	
	/**tierField*/
	@FindBy(xpath = "//th[@id='tier']")
	public WebElement tierField;
	
	/**sac Field*/
	@FindBy(xpath = "//th[@id='sac']")
	public WebElement sacField;
	
	/**dateAcknowledged Field*/
	@FindBy(xpath = "//th[@id='date-acknowledge']")
	public WebElement dateAcknowledgedField;
	
	/**acknowledgedBy Field*/
	@FindBy(xpath = "//th[@id='acknowledged-by']")
	public WebElement acknowledgedByField;
	
	/**acknowledgedBy Field*/
	@FindBy(css = "body > main:nth-child(2) > section:nth-child(3) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(7)")
	public WebElement remindersField;
	
	/**TAS Field*/
	@FindBy(xpath = "//th[@id='current-TAS-status']")
	public WebElement tasField;
	
	/**TAS Expiration Field*/
	@FindBy(xpath = "//th[@id='current-TAS-expire']")
	public WebElement tasExpField;
	
	/**TAS Name Field*/
	@FindBy(xpath = "//th[@id='current-TAS-name']")
	public WebElement tasNameField;
	
	/**Notes Field*/
	@FindBy(xpath = "//th[@id='notes']")
	public WebElement notesField;

	/**Actions Field*/
	@FindBy(css = "span[class='dtr-data'] button[value='Acknowledge']")
	public WebElement editAction;
	
	/**Actions Field*/
	@FindBy(css = "img[title='Manage Acknowledgement, Notes and Exception Flag']")
	public WebElement editAction1;
	
	/**Actions Field*/
	@FindBy(css = "tr[class='child'] button:nth-child(2)")
	public WebElement resetAcknowledgement;
	
	/**Actions Field*/
	@FindBy(xpath = "//input[@id='advisoryCBI']")
	public WebElement flag;
	
	/**general notes Field*/
	@FindBy(xpath = "//textarea[@id='generalNote']")
	public WebElement generalNotesField;
	
	/**plus sign*/
	@FindBy(xpath = "//td[@class=' dt-checkboxes-cell']")
	public WebElement plusSign;
	
	/**nameSearchField*/
	@FindBy(xpath = "//input[@id='fullNameWithOrgPapth']")
	public WebElement nameSearchField;
	
	/**name Marriam*/
	@FindBy(xpath = "//div[contains(text(),'AALAI, MARRIAM (NCI CCR LP)')]")
	public WebElement name;
	
	/**name Whitney*/
	@FindBy(xpath = "//div[contains(text(),'HASTINGS, WHITNEY (NCI OD OM TTC)')]")
	public WebElement nameWhitney;
	
	/**dateNullValue*/
	@FindBy(xpath = "//td[5]")
	public WebElement dateNullValue;
	
	/**confirmAlert*/
	@FindBy(xpath = "//button[@id='confirmReset']")
	public WebElement confirmAlert;

	/**acknowledge*/
	@FindBy(xpath = "//button[@class='btn btn-lg btn-primary']")
	public WebElement acknowledged;
	
	/**select All Checkmark*/
	@FindBy(xpath = "//input[@class='selectAll']")
	public WebElement selectAll;
	
	/**Bulk Reset*/
	@FindBy(xpath = "//button[@id='bulkReset']")
	public WebElement bulkReset;
	
	/**Tier Dropdown*/
	@FindBy(xpath = "//span[@id='select2-tierLevel-container']")
	public WebElement tierDropdown;
	
	/**Tier 3D Dropdown*/
	@FindBy(xpath = "//span[@class='select2-results']//li[@id='select2-tierLevel-result-n2pp-Tier III-D']")
	public WebElement tier3D;
	
	/**input*/
	@FindBy(xpath = "//input[@class='select2-search__field']")
	public WebElement input;
	
	/**input 1 choice*/
	@FindBy(xpath = "//span[@class='select2-results']")
	public WebElement input1Choice;
	
	/**Aber Itan Date Acknowledged*/
	@FindBy(xpath = "//tbody/tr[6]/td[5]")
	public WebElement dateAcknowledgedAberItan;
	
	/**Aber Itan Date Acknowledged*/
	@FindBy(xpath = "//tbody/tr[6]/td[6]")
	public WebElement acknowledgedByAberItan;
	
	/**Not authorized alert*/
	@FindBy(xpath = "//div[@class='jumbotron']")
	public WebElement notAuthorized;
	
	/**delete Dorsey*/
	@FindBy(xpath = "//tbody/tr[2]/td[5]/button[2]")
	public WebElement deleteDorsey;
	
	/**delete Dorsey*/
	@FindBy(xpath = "//tr[@class='even']//button[@aria-label='delete button']")
	public WebElement deleteHaskins;
	
	/**disabled Select All mark*/
	@FindBy(xpath = "//th[@class='dt-checkboxes-cell dt-checkboxes-select-all sorting_disabled']")
	public WebElement disabledSelectAll;
	
	/**tier1Acknowledged*/
	@FindBy(xpath = "//span[normalize-space()='Designation as a Tier I-Emergency Employee']")
	public WebElement tier1Acknowledged;
	
	/**Organization Search Field*/
	@FindBy(xpath = "//input[@role='combobox']")
	public WebElement orgSearchField;
	
	/**Organization Search Field*/
	@FindBy(xpath = "//input[@role='combobox']")
	public WebElement nameHastings;
	
	/**Tier Search window*/
	@FindBy(css = "input[role='combobox']")
	public WebElement tierSearch;
	
	/**Tier 2 dropdown*/
	@FindBy(xpath = "//span[@id='select2-tierLevel-container']")
	public WebElement tier2;
	
}
