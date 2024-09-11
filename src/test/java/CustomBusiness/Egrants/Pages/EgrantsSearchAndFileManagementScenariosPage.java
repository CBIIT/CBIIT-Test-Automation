package CustomBusiness.Egrants.Pages;

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
    @FindBy(xpath = "//span[contains(text(),'BAYLOR COLLEGE OF MEDICINE CANCER CENTER-CANCER CENTER SUPPO…')]")
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
    @FindBy(xpath = "//button[@title='Add New Document [shift + alt + O]']")
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
    @FindBy(xpath = "//select[@id='ddlAppls']")
    public WebElement grantsDropdown;

    /**
     * Grant year 18
     */
    @FindBy(xpath = "(//a[@href='Javascript:by_appl(10877115 )'])[1]")
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
    @FindBy (xpath = "//tbody/tr[1]/td[5]/a[1]/img[1]")
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
    @FindBy (xpath = "(//div[contains(text(), 'Created On')])[1]")
    public WebElement createdOnTextFirstRow;

    /**
     * Created On Text second row
     */
    @FindBy (xpath = "(//div[contains(text(), 'Created On')])[2]")
    public WebElement createdOnTextSecondRow;

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

    public EgrantsSearchAndFileManagementScenariosPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}