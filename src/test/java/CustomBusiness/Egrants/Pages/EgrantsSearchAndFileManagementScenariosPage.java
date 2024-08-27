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
    public WebElement searchButtonOnAddDocumentPage;

    /**
     * Grants drop-down
     */
    @FindBy(xpath = "//select[@id='ddlAppls']")
    public WebElement grantsDropdown;

    /**
     * Grant year 18
     */
    @FindBy(xpath = "//select[@id='ddlAppls']/option[text()='5P30CA125123-18']")
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
     * Document category
     */
    @FindBy (xpath = "//td/input[@id='comments']")
    public WebElement subCategoryInstitutionalFiles;

    /**
     * Create New button
     */
    @FindBy (xpath = "//button[@id='btnFileUpload']")
    public WebElement createNewButton;

    /**
     * Update icon
     */
    @FindBy (xpath = "/(//*[@title='Update Document'])[1]")
    public WebElement updateIcon;

    /**
     * Subcategory for funding
     */
    @FindBy (xpath = "//select[@id='D_37']")
    public WebElement subCategoryforFunding;

    /**
     * Update button
     */
    @FindBy (xpath = "//button[@title='Click here to update document index [shift + alt + U]']")
    public WebElement updateButton;

    /**
     * Expand button
     */
    @FindBy (xpath = "//img[@name='show_qc_all']")
    public WebElement expandButton;

    /**
     * Get text for an updated document
     */
    @FindBy (xpath = "(//*[contains(text(),'Updated On')])[1]")
    public WebElement updateText;

    public EgrantsSearchAndFileManagementScenariosPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}