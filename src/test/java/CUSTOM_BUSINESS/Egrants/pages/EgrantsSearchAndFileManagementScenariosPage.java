package CUSTOM_BUSINESS.Egrants.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EgrantsSearchAndFileManagementScenariosPage {

    /**
     * Search box
     */
    @FindBy(xpath = "//input[@id='txtKW']")
    public WebElement searchBox;

    /**
     * Search button main page
     */
    @FindBy(xpath = "//button[@id='btnsearch']")
    public WebElement searchButton;

    /**
     * Project Title OR //div[@id='grantbar2']
     */
    @FindBy(xpath = "//span[contains(text(),'BAYLOR COLLEGE OF MEDICINE CANCER CENTER - CANCER ')]")
    public WebElement projectTitle;

    /**
     * Institution Name
     */
    @FindBy (xpath = "//span[normalize-space()='BAYLOR COLLEGE OF MEDICINE']")
    public WebElement institutionName;

    /**
     * Grant year 18
     */
    @FindBy (xpath = "(//a[@title='View All Documents for 5P30CA125123-18'])[1]")
    public WebElement year18MainGrantHeader;

    /**
     * Full grant serial number
     */
    @FindBy (xpath = "//b[contains(text(),'5P30CA125123-18')]")
    public WebElement fullGrantSerialNumber;

    /**
     * Add Document button
     */
    @FindBy(xpath ="//button[@title='Click here to add new document [shift + alt + O]']")
    public WebElement addDocumentButton;

    /**
     * Search box on Add Document Page
     */
    @FindBy(xpath = "//input[@id='txtSerialnum']")
    public WebElement searchBoxAddDocumentPage;

    /**
     * Search button Add document Page
     */
    @FindBy(xpath = "//button[@id='btnSearch']")
    public WebElement searchButtonOnAddDocPage;

    /**
     * Grants drop-down
     */
    @FindBy(id = "ddlAppls")
    public WebElement grantsDropdown;

    /**
     * Grant year 18
     */
    @FindBy(css = "div[id='appls_10_687129'] a[title='View All Documents for 5P30CA125123-18']")
    public WebElement year18;

    /**
     * Category drop-down
     */
    @FindBy(xpath = "//select[@id='ddlCategories']")
    public WebElement categoryDropdown;

    /**
     * Application File Category
     */
    @FindBy(xpath = "//select/option[@id='38']")
    public WebElement applicationFileCategory;

    /**
     * Application File Sub-category
     */
    @FindBy(xpath = "//input[@id='T_38']")
    public WebElement subCategory;

    /**
     * Locate File and upload tab
     */
    @FindBy(xpath = "//button[text()='Locate File and Upload']")
    public WebElement locateFileAndUploadTab;

    /**
     * Choose File
     */
    @FindBy(xpath = "//input[@id='customFile']")
    public WebElement chooseFile;

    /**
     * Choose File - Replace Page
     */
    @FindBy(xpath = "//label[normalize-space()='Choose file...']")
    public WebElement replaceFile;

    /**
     * Add button for chosen file
     */
    @FindBy(xpath = "//button[@id='btnFileUpload']")
    public WebElement addFileButton;

    /**
     * Success Message
     */
    @FindBy(xpath = "//span[@id='mssg']")
    public WebElement successMessage;

    /**
     * Check Document Button
     */
    @FindBy(xpath = "//a[@id='notice']")
    public WebElement checkDocumentButton;

    /**
     * Institutional Files tab
     */
    @FindBy (xpath = "//a[contains(text(), 'Institutional Files')]")
    public WebElement institutionalFiles;

    /**
     * Select an Institution
     */
    @FindBy (xpath = "//a/b[contains(text(), 'AAVOGEN, INC.')]")
    public WebElement aavogeninc;

    /**
     * Create new document link
     */
    @FindBy (xpath = "//a[contains(text(), 'Create New Document')]")
    public WebElement createNewDocumentLink;

    /**
     * Document category - Index 3
     */
    @FindBy (xpath = "//select[@id='ddlCategories']")
    public WebElement documentCategoryDropdown;

    /**
     * Document Subcategory
     */
    @FindBy (xpath = "//input[@id='comments']")
    public WebElement subCategoryInstitutionalFiles;

    /**
     * Create New button
     */
    @FindBy (xpath = "//button[@id='btnFileUpload']")
    public WebElement createNewButton;

    /**
     * Expand icon (First Row)
     */
    @FindBy (xpath = "(//img[contains(@name,'show_qc')])[2]")
    public WebElement expandIconFirstRow;

    /**
     * Expand icon (Second Row)
     */
    @FindBy (xpath = "(//img[contains(@name,'show_qc')])[3]")
    public WebElement expandIconSecondRow;

    /**
     * Subcategory for funding
     */
    @FindBy (css = "#D_37")
    public WebElement subCategoryforFunding;

    /**
     * Update button
     */
    @FindBy (xpath = "//button[@title='Click here to update document index [shift + alt + U]']")
    public WebElement updateButton;

    /**
     * Gear Icon (Update)
     */
    @FindBy (xpath = "(//*[@title='Update Document'])[1]")
    public WebElement gearIcon;

    /**
     * Calendar
     */
    @FindBy (xpath = "//input[@id='txtDocumentdate']")
    public WebElement calendar;

    /**
     * Replace Button
     */
    @FindBy (xpath = "(//a[@title='Replace Document'])[1]")
    public WebElement replaceButton;

    /**
     * Delete Button on first row
     */
    @FindBy (xpath = "(//a[normalize-space()='Delete'])[1]")
    public WebElement deleteButtonFirstRow;

    /**
     * Delete Button on second row
     */
    @FindBy (xpath = "(//a[normalize-space()='Delete'])[2]")
    public WebElement deleteButtonSecondRow;

    /**
     * Created On Text first row
     */
    @FindBy (xpath = "(//tr[@class='odd-row dt-hasChild']//div[@class='qc_options']//div[contains(text(), 'Created On')])[1]")
    public WebElement createdOnTextFirstRow;

    /**
     * Created On Text second row
     */
    @FindBy (xpath = "(//tr[@class='odd-row dt-hasChild']//div[@class='qc_options']//div[contains(text(), 'Created On')])[2]")
    public WebElement createdOnTextSecondRow;

    /**
     * Created By Text
     */
    @FindBy (xpath = "//tr[@class='odd-row dt-hasChild']//div[@class='qc_options']//div[contains(text(), 'Created On')]")
    public WebElement createdByText;

    /**
     * Update Icon for Institutional Files
     */
    @FindBy (xpath = "(//a[@title='Click here to update this document'])[1]")
    public WebElement updateIconInstitutionalFiles;

    /**
     * Save Update button for Institutional Files category
     */
    @FindBy (xpath = "//div/button[@id='btnUpdate']")
    public WebElement saveUpdateButton;

    /**
     * Delete Icon for Institutional Files
     */
    @FindBy (xpath = "(//a[@title='Click here to delete this document'])[1]")
    public WebElement deleteIconInstitutionalFiles;

    /**
     * Application type dropdown
     */
    @FindBy (xpath = "//select[@id='ddlAppls']//option[@value='CreateGrantYear']")
    public WebElement createNewGrantYearText;

    /**
     * Application type dropdown
     */
    @FindBy (xpath = "//select[@id='ddlAppltype']")
    public WebElement applicationType;

    /**
     * Activity Code dropdown
     */
    @FindBy (xpath = "//select[@id='ddlActivitycode']")
    public WebElement activityCode;

    /**
     * Grant year text box
     */
    @FindBy (xpath = "//input[@id='txtSupportyear']")
    public WebElement yearTextBox;

    /**
     * Grant year text box
     */
    @FindBy (xpath = "//input[@id='txtSuffixcode']")
    public WebElement suffixCodeTextBox;

    /**
     * Create New button for grant year
     */
    @FindBy (xpath = "//button[@name='submit']")
    public WebElement createNewGrantYearButton;

    /**
     * Success message for created grant year
     */
    @FindBy (xpath = "//b[@id='notice']")
    public WebElement grantYearHasBeenCreated;

    /**
     * Resources Menu
     */
    @FindBy (xpath = "//li[@id='navDropDown1']")
    public WebElement resourcesMenu;

    /**
     * Audit File Download Mode
     */
    @FindBy (xpath = "//a[@title='Audit File Download (Chrome Only)']")
    public WebElement auditFileDownloadMode;

    /**
     * Check All checkbox
     */
    @FindBy (xpath = "//input[@title='Check All']")
    public WebElement checkAllCheckbox;

    /**
     * Download button
     */
    @FindBy (xpath = "//div/button[contains(text(), 'ownload')]")
    public WebElement downloadButton;

    /**
     * Download success message
     */
    @FindBy (xpath = "(//td/img[@title='File Download Successful!'])[1]")
    public WebElement downloadSuccessMessage;

    /**
     * Downloading spin message
     */
    @FindBy (xpath = "(//td/img[@title='Downloading ...'])[1]")
    public WebElement downloadingMessage;

    /**
     * Grant year 18S1
     */
    @FindBy(css = "div[id='appls_10_687129'] a[title='View All Documents for 3P30CA125123-18S1']")
    public WebElement year18S1;

    /**
     * Category Filter Icon
     */
    @FindBy(xpath = "//a/img[@src='/Content/images/filter.png']")
    public WebElement categoryFilterIcon;

    /**
     * Activation Notice category
     */
    @FindBy(xpath = "//div/input[@id='cat_29']")
    public WebElement activationNoticeCategory;

    /**
     * Application File category
     */
    @FindBy(xpath = "//div/input[@id='cat_38']")
    public WebElement ApplicationFileCategory;

    /**
     * Search Icon
     */
    @FindBy(xpath = "//button/img[@src='/Content/images/searchicon.png']")
    public WebElement searchIcon;

    /**
     * Number of years text box
     */
    @FindBy(xpath = "//input[@placeholder='Yrs']")
    public WebElement numberOfYearsTextBox;

    /**
     * Application File Category Text
     */
    @FindBy(xpath = "(//a[contains(text(), 'Application File')])[1]")
    public WebElement getApplicationFileCategoryText;

    /**
     *  Activation Notice Category Text
     */
    @FindBy(xpath = "(//a[contains(text(), 'Activation Notice')])[1]")
    public WebElement getActivationNoticeCategoryText;

    /**
     *  Date picker
     */
    @FindBy(xpath = "//td/img[@class='ui-datepicker-trigger']")
    public WebElement datePicker;

    /**
     *  Add Funding Document Button
     */
    @FindBy(xpath = "//button[@title='Click here to add new funding document [shift + alt + F]']")
    public WebElement addFundingDocumentButton;

    /**
     *  Expand All Grant Years Button
     */
    @FindBy(xpath = "//a/img[@title='View All Grant Years']")
    public WebElement expandAllGrantYearsButton;

    /**
     *  Funding SubCategory
     */
    @FindBy(xpath = "//div/input[@id='txtSubCategory']")
    public WebElement fundingSubCategory;

    /**
     * Expanded - Grant year 18
     */
    @FindBy(css = "div[id='appls_all_687129'] a[title='View All Documents for 5P30CA125123-18']")
    public WebElement grantYear18;

    /**
     * Supplement SandBox
     */
    @FindBy(css = "//a/b[@title='View Supplement Files']")
    public WebElement supplementSandBox;

    /**
     * Supplement Application File Checkbox
     */
    @FindBy(css = "(//tr/td/input[@title='Check here to load suppelment'])[1]")
    public WebElement supplementApplicationFileCheckbox;

    /**
     * Process Type Dropdown
     */
    @FindBy(css = "//div/select[@id='ddlProcess']")
    public WebElement processTypeDropdown;

    /**
     * Move to Parent Button
     */
    @FindBy(css = "//button[@title='Click here to pay with Parent Grant by parent appl [alt + shift + M]']")
    public WebElement moveToParentButton;

    /**
     * Expanded - Grant year 17S1
     */
    @FindBy(css = "div[id='appls_all_687129'] a[title='View All Documents for 3P30CA125123-17S1']")
    public WebElement grantYear17S1;

    /**
     * Add Request Name Button
     */
    @FindBy(xpath = "//div/button[contains(text(), 'Add Request Name')]")
    public WebElement addRequestNameButton;

    /**
     * Request Name Text Box
     */
    @FindBy(css = "input[id='newGrantYearName10831223']")
    public WebElement requestNameTextBox;

    /**
     * Request Name Save Button
     */
    @FindBy(css = "div[id='renameModalId10831223'] div[class='modal-body'] div button:nth-child(1)")
    public WebElement requestNameSaveButton;

    /**
     * Request Name Delete Button
     */
    @FindBy(css = "button[id='deleteGrantYearName10831223']")
    public WebElement requestNameDeleteButton;

    /**
     * Edit Request Name Button
     */
    @FindBy(xpath = "//div/button[contains(text(), 'Edit Request Name')]")
    public WebElement editRequestNameButton;

    /**
     * Label Text
     */
    @FindBy(css = "div[id='yearName10831223']")
    public WebElement labelText;

    /**
     * Edit Button Supplement Notification
     */
    @FindBy(xpath = "(//td/button[contains(text(), 'Edit')])[1]")
    public WebElement editButtonSupplementNotification;

    /**
     * PA Text Field
     */
    @FindBy(xpath = "(//input[starts-with(@id, 'txtPA_')])[1]")
    public WebElement paTextField;

    /**
     * Save Button Supplement Notification
     */
    @FindBy(xpath = "(//td/button[contains(text(), 'Save')])[1]")
    public WebElement saveButtonSupplementNotification;

    /**
     * eRA Notification Tab
     */
    @FindBy(xpath = "//a[normalize-space()='eRA Notification']")
    public WebElement eRANotificationTab;

    /**
     * Delete Button Supplement Notification
     */
    @FindBy(xpath = "(//td/button[contains(text(), 'Delete')])[1]")
    public WebElement deleteButtonSupplementNotification;

    /**
     * Review Button Supplement Notification
     */
    @FindBy(xpath = "(//td/button[contains(text(), 'Review')])[1]")
    public WebElement reviewButtonSupplementNotification;

    /**
     * Resend This Notification Button
     */
    @FindBy(xpath = "//td/a[contains(text(), 'To Resend this Notification...')]")
    public WebElement resendThisNotificationButton;

    /**
     * Type Drop Down
     */
    @FindBy(xpath = "//td/select[@id='ddlEmail_Type_1']")
    public WebElement typeDropDown;

    /**
     * Position Drop Down
     */
    @FindBy(xpath = "//td/select[@id='ddlEmail_Position_1']")
    public WebElement positionDropDown;

    /**
     * Name Text Box Notification
     */
    @FindBy(xpath = "//td/input[@id='txtName_1']")
    public WebElement nameTextBoxNotification;

    /**
     * Email Text Box Notification
     */
    @FindBy(xpath = "//td/input[@id='txtAddress_1']")
    public WebElement emailTextBoxNotification;

    /**
     * Add Button Notification
     */
    @FindBy(xpath = "(//td/input[@id='btnAdd'])[1]")
    public WebElement addButtonNotification;

    /**
     * Resend Button Notification
     */
    @FindBy(xpath = "(//td/input[@id='btnResent'])[1]")
    public WebElement resendButtonNotification;

    /**
     * Second Type Drop Down
     */
    @FindBy(xpath = "//td/select[@id='ddlEmail_Type_2']")
    public WebElement secondTypeDropDown;

    /**
     * Second Position Drop Down
     */
    @FindBy(xpath = "//td/select[@id='ddlEmail_Position_2']")
    public WebElement secondPositionDropDown;

    /**
     * Second Name Text Box Notification
     */
    @FindBy(xpath = "//td/input[@id='txtName_2']")
    public WebElement secondNameTextBoxNotification;

    /**
     * Second Email Text Box Notification
     */
    @FindBy(xpath = "//td/input[@id='txtAddress_2']")
    public WebElement secondEmailTextBoxNotification;

    /**
     * New Exception Code Tab - Grants Archival Process
     */
    @FindBy(xpath = "//a[normalize-space()='New Exception Code']")
    public WebElement newExceptionCodeTab;

    /**
     * Exception Code Text Box
     */
    @FindBy(xpath = "//input[@title='Execption Code']")
    public WebElement exceptionCodeTextBox;

    /**
     * Exception Code Details Text Box
     */
    @FindBy(xpath = "//input[@title='Execption Code Detail']")
    public WebElement newExceptionDetailsTextBox;

    /**
     * Create New Exception Code Button
     */
    @FindBy(xpath = "//button[@id='txtCreate']")
    public WebElement createNewExceptionCodeButton;

    /**
     * Delete Exception Button
     */
    @FindBy(xpath = "//tr[td[text()='Test Exception Code'] and td[text()='Test Exception Description']]//button[@id='btnDelete']")
    public WebElement deleteExceptionButton;

    /**
     * Drag and Drop Button
     */
    @FindBy(xpath = "//*[@id='li_ddrop']")
    public WebElement dragAndDropButton;

    /**
     * Upload via Email Button
     */
    @FindBy(xpath = "//*[@id='content']/table/tbody/tr/td[2]/div[1]/button[3]")
    public WebElement uploadViaEmailButton;

    /**
     * Convert to pdf and Add button
     */
    @FindBy(xpath = "//*[@id='btnFilePdfUpload']")
    public WebElement convertToPdfAndAddButton;

    /**
     * Add Document button
     */
    @FindBy(xpath = "//*[@id='btnFilePdfUpload']")
    public WebElement addDocButton;

    /**
     * upload button for document Activation Notice
     */
    @FindBy(xpath = "//*[@id='loadgrid_10831223']/tbody/tr[1]/td[5]")
    public WebElement uploadButtonActivationNoticeDoc;

    /**
     * Replace Document Page Title
     */
    @FindBy(xpath = "//*[@id='page_title']")
    public WebElement replaceDocumentPageTitle;

    /**
     * Grant field
     */
    @FindBy(xpath = "//b[contains(text(),'Grant')]")
    public WebElement grantField;

    /**
     * Category field
     */
    @FindBy(xpath = "//b[contains(text(),'Category')]")
    public WebElement categoryField;

    /**
     * Date field
     */
    @FindBy(xpath = "//b[contains(text(),'Date')]")
    public WebElement dateField;

    /**
     * Drag and Drop Covert to PDF and Upload button
     */
    @FindBy(xpath = "//button[@id='btnPdfDragdrop']")
    public WebElement convertToPdfAndUploadButton;

    /**
     * Drag and Drop Upload button
     */
    @FindBy(xpath = "//button[@id='btnDragdrop']")
    public WebElement dragAndDropUploadButton;

    /**
     * warning Upload Email
     */
    @FindBy(xpath = "//*[@id='by_email']")
    public WebElement warningUploadEmail;

    /**
     * Upload via Email button
     */
    @FindBy(xpath = "//button[@id='btnEmail']")
    public WebElement uploadViaEmailBtn;

    /**
     * Return to eGrants File button
     */
    @FindBy(xpath = "//button[@class='btn btn-primary eGrantsReturnBtn']")
    public WebElement returnToeGrantsFileBtn;

    /**
     * header Grant Years
     */
    @FindBy(xpath = "//b[@id='toggle_title']")
    public WebElement headerGrantYears;

    /**
     * Add Document button Grant
     */
    @FindBy(xpath = "//*[@id='create new buttons']/button[1]")
    public WebElement addDocumentButtonGrant;

    /**
     * Add  Funding Document button Grant
     */
    @FindBy(xpath = "//*[@id='create new buttons']/button[2]")
    public WebElement addButtonGrantPage;

    /**
     * Document name header
     */
    @FindBy(xpath = "//th[contains(text(),'Document Name')]")
    public WebElement columnHeaderDocName;

    /**
     * Date header
     */
    @FindBy(xpath = "//th[contains(text(),'Date')]")
    public WebElement columnHeaderDate;

    /**
     * Pages header
     */
    @FindBy(xpath = "//th[contains(text(),'Pages')]")
    public WebElement columnHeaderPages;

    /**
     * Upload header
     */
    @FindBy(xpath = "//span[contains(text(),'Upload')]")
    public WebElement columnHeaderUpload;

    /**
     * Update header
     */
    @FindBy(xpath = "//span[contains(text(),'Update')]")
    public WebElement columnHeaderUpdate;

    /**
     * Update last document button
     */
    @FindBy(xpath = "//*[@id='loadgrid_10877115']/tbody/tr[1]/td[6]/a/img")
    public WebElement updateLastDocButton;

    /**
     * Update Document page header
     */
    @FindBy(xpath = "//b[@id='page_title']")
    public WebElement updateDocPageHeader;

    /**
     * Constructor
     */
    public EgrantsSearchAndFileManagementScenariosPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}