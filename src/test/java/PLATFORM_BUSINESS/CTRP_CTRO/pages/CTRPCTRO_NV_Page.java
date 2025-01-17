package PLATFORM_BUSINESS.CTRP_CTRO.pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CTRPCTRO_NV_Page extends CommonUtils {

    public CTRPCTRO_NV_Page() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /** CTRP/CTRO Native View Create New Case Category Field */
    public static WebElement ctrpCTRONVCreateNewCaseCategoryField(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//span[normalize-space()='" + value + "']"));
    }

    /** CTRP/CTRO Native View Create New Case Category Field Drop Down Box */
    @FindBy(xpath = "//select[@id='x_naci_ctrp_ctro_case.u_category_ctrp']")
    public static WebElement ctrpCTRONVCreateNewCaseCategoryFieldDropDown;

    /** CTRP/CTRO Native View Create New Case Category Field Drop Down options */
    public static WebElement ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//option[@value='" + value + "']"));
    }

    /** CTRP/CTRO Native View Create New Case Subcategory Field Drop Down Box */
    @FindBy(xpath = "//select[@id='x_naci_ctrp_ctro_case.u_subcategory_ctrp']")
    public static WebElement ctrpCTRONVCreateNewCaseSubcategoryFieldDropDown;

    /** CTRP/CTRO Native View Create New Case ASSIGNMENT GROUP Field SEARCH Box */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_ctrp_ctro_case.assignment_group']")
    public static WebElement ctrpCTRONVCreateNewCaseAssignmentGroupFieldSearchBox;

    /** CTRP/CTRO Native View Create New Case Short description Field Text Box */
    @FindBy(xpath = "//input[@id='x_naci_ctrp_ctro_case.short_description']")
    public static WebElement ctrpCTRONVCreateNewCaseShortDescriptionFieldTextBox;

    /** CTRP/CTRO Native View Create New Case Submit Button */
    @FindBy(xpath = "//*[@id='sysverb_insert_bottom']")
    public static WebElement ctrpCTRONVCreateNewCaseSubmitButton;

    /** CTRP/CTRO Native View Updated Case Save Button */
    @FindBy(xpath = "//*[@id='ctrp_save']")
    public static WebElement ctrpCTRONVUpdatedCaseSaveButton;

    /** --------------- NATIVE VIEW CTRP/CTRO ALL CASES PAGE --------------- */

    /** Native View CTRP/CTRO ALL CASES Search Drop Down */
    @FindBy(xpath = "//*[@id='x_naci_ctrp_ctro_case_hide_search']/div//child::span//child::span//child::select")
    public static WebElement ctrpCTRONVAllCasesSearchDropDown;

    /** Native View CTRP/CTRO ALL CASES Search Text Box */
    @FindBy(xpath = "//*[@id='x_naci_ctrp_ctro_case_hide_search']/div//child::input")
    public static WebElement ctrpCTRONVAllCasesSearchTextBox;

    /** Native View Record Name Dynamic Xpath */
    public static WebElement nVRecordName(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//div[normalize-space()='" + value + "']"));
    }

    /** CTRP/CTRO Case locator Dynamic Xpath */
    public static WebElement ctrpCTROCaseLocator(String value) {
        return WebDriverUtils.webDriver
                .findElement(By.xpath("//div[normalize-space()='" + value + "']//parent::div//parent::td//parent::tr//child::td[2]//child::a"));
    }

    /** CTRP/CTRO Native View Case Open Record Button */
    @FindBy(xpath = "//a[normalize-space()='Open Record']")
    public static WebElement ctrpCTRONVCaseOpenRecordButton;

    /** CTRP/CTRO Native View Case Record Delete Button */
    @FindBy(xpath = "//button[@id='sysverb_delete']")
    public static WebElement ctrpCTRONVCaseRecordDeleteButton;

    /** CTRP/CTRO Native View Case Record Pop Up Delete Button */
    @FindBy(xpath = "//button[@id='ok_button']")
    public static WebElement ctrpCTRONVCaseRecordPopUpDeleteButton;

    /**NativeView No Records To Display Text*/
    @FindBy(xpath = "//*[@id='x_naci_ctrp_ctro_case']/div[1]")
    public static WebElement nativeViewNoRecordsToDisplayText;
}