package ServiceNow.GDC.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GDC_Workflow_NativeView_Page extends CommonUtils {

    public GDC_Workflow_NativeView_Page() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** Native View Filter Navigator */
    @FindBy(xpath = "//input[@id='filter']")
    public WebElement nVFilterNavigator;

    /** Native View GDC Create New Tab */
    @FindBy(xpath = "//a[@id='358c0a391bd43190e541631ee54bcbc9']")
    public WebElement nVGDCCreateNewTab;

    /** Native View GDC All Tab */
    @FindBy(xpath = "//a[@id='0e8c0e791bd43190e541631ee54bcbd5']")
    public WebElement nVGDCAllTab;

    /**Native View Access Requests IFRAME*/
    @FindBy(xpath = "//*[@id='gsft_main']")
    public WebElement accessRequestIFrame;

    /** Native View GDC All Record Search Drop Down */
    @FindBy(xpath = "//span[@id='x_g_nci_gdc_case_hide_search']/div//child::span//child::span//child::select")
    public WebElement nVGDCAllRecordSearchDropDown;

    /** Native View GDC All Record Search Text Box */
    @FindBy(xpath = "//span[@id='x_g_nci_gdc_case_hide_search']//div//input")
    public WebElement nVGDCAllRecordSearchTextBox;

    /** Native View Record Name Dynamic Xpath */
    public WebElement nVRecordName(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//div[normalize-space()='" + value + "']"));
    }

    /** Native View Record locator Dynamic Xpath */
    public WebElement nVRecordLocator(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//div[normalize-space()='" + value + "']//parent::div//parent::td//parent::tr//child::td[2]//child::a"));
    }

    /** Native View GDC Record locator */
    @FindBy(xpath = "//td[@class='list_decoration_cell col-small col-center ']//a")
    public WebElement nVGDCRecordLocator;

    /** Native View GDC Open Record Button */
    @FindBy(xpath = "//a[normalize-space()='Open Record']")
    public WebElement nVGDCOpenRecordButton;

    /** Native View GDC Short Description Label */
    @FindBy(xpath = "//span[@title='Task - Short Description']")
    public WebElement nVGDCShortDescriptionLabel;

    /** Native View GDC Short Description Text Box */
    @FindBy(xpath = "//input[@id='x_g_nci_gdc_case.short_description']")
    public WebElement nVGDCShortDescriptionTextBox;

    /** Native View GDC Record Submitter Search TEXT BOX */
    @FindBy(xpath = "//input[@id='sys_display.x_g_nci_gdc_case.submitter']")
    public WebElement nVGDCRecordSubmitterSearchTextBox;

    /** Native View GDC Record Category Drop Down */
    @FindBy(xpath = "//select[@id='x_g_nci_gdc_case.category_gdc']")
    public WebElement nVGDCRecordCategoryDropDown;

    /** Native View GDC Create New Record 1st Save Button */
    @FindBy(xpath = "//button[@id='sysverb_insert_and_stay']")
    public WebElement nVGDCCreateNewRecord1stSaveButton;

    /** Native View GDC Existing Record Assigned To Save Button */
    @FindBy(xpath = "//div[@id='x_g_nci_gdc_case.form_header']//script[7]//parent::span//child::button[3]")
    public WebElement nVGDCExistedRecordAssigneToSavedButton;

    /** Native View GDC Record Assigned to Search TEXT BOX */
    @FindBy(xpath = "//*[@id='sys_display.x_g_nci_gdc_case.assigned_to']")
    public WebElement nVGDCRecordAssignedToSearchTextBox;

    /** Native View GDC Record Delete Button */
    @FindBy(xpath = "//button[@id='sysverb_delete']")
    public WebElement nVGDCRecordDeleteButton;

    /**Native View Delete Confirm Pop Up IFRAME*/
    @FindBy(xpath = "//div[@id='delete_confirm_form']//div[@class='modal-dialog modal-md']")
    public WebElement nVDeleteConfirmPopUpIFrame;

    /** Native View GDC Record Confirm Delete Button */
    @FindBy(xpath = "//button[@id='ok_button']")
    public WebElement nVGDCRecordConfirmDeleteButton;

    /** Native View GDC Record Start Work Button */
    @FindBy(xpath = "//button[@class='form_action_button header  action_context btn btn-primary'][1]")
    public WebElement nVGDCRecordStartWorkButton;

    /** Native View GDC Record Resolved Button */
    @FindBy(xpath = "//button[@id='f7bd23911b283510e541631ee54bcb34']")
    public WebElement nVGDCRecordResolvedButton;

    /** Native View GDC Record Cancel Case Button */
    @FindBy(xpath = "//button[@id='f7bd23911b283510e541631ee54bcb34']")
    public WebElement nVGDCRecordCancelCaseButton;

    /** Native View GDC Record State Text Box */
    @FindBy(xpath = "//select[@id='x_g_nci_gdc_case.state']")
    public WebElement nVGDCRecordStateTextBox;

    /** Native View GDC Record Closure Information Tab */
    @FindBy(xpath = "//span[normalize-space()='Closure Information']")
    public WebElement nVGDCRecordClosureInformationTab;

    /** Native View GDC Record Configure Duration Field */
    @FindBy(xpath = "//input[@id='sys_readonly.x_g_nci_gdc_case.calendar_duration']")
    public WebElement nVGDCRecordConfigureDurationField;

    /** Native View GDC Record Configure Business Duration Field */
    @FindBy(xpath = "//input[@id='sys_readonly.x_g_nci_gdc_case.business_duration']")
    public WebElement nVGDCRecordConfigureBusinessDurationField;

    /** Native View GDC Record No Records To Display */
    @FindBy(xpath = "//td[normalize-space()='No records to display']")
    public WebElement nVGDCRecordNoRecordToDisplay;
}
