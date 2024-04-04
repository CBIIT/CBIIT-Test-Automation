package ServiceNow.PlatformBusinessApps.CTRP_CTRO.Selenium.StepImplementation;

import ServiceNow.PlatformBusinessApps.CTRP_CTRO.Selenium.Constants.CTRPCTRO_NV_Constants;
import ServiceNow.PlatformBusinessApps.CTRP_CTRO.Selenium.Pages.CTRPCTRO_NV_Page;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;

public class CTRPCTRO_NV_StepImpl extends PageInitializer {

    /**
     * This method will submit CTRP/CTRO new Case in Native View
     *
     */
    public static void ctrp_ctro_helpdesk_case_submit_nv(){
        WebDriverUtils.webDriver.get(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_URL);
        MiscUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryField(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_CATEGORY_FIELD));
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryField(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_CATEGORY_FIELD));
        CucumberLogUtils.logScreenshot();
        CommonUtils.selectDropDownValue(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDown, CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_CATEGORY_FIELD_DROP_DOWN_NCI_DCC_ACCRUAL_REPORT_OPTION);
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_CATEGORY_FIELD_DROP_DOWN_NCI_DCC_ACCRUAL_REPORT_OPTION));
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryField(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SUBCATEGORY_FIELD));
        CommonUtils.selectDropDownValue(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseSubcategoryFieldDropDown, CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SUBCATEGORY_FIELD_DROP_DOWN_ACOUNT_RELATED_OPTION);
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseAssignmentGroupFieldSearchBox, CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_ASSIGNMENT_GROUP_FIELD_SEARCH_BOX_OPTION);
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseShortDescriptionFieldTextBox, CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SHORT_DESCRIPTION_FIELD_TEXT_BOX_OPTION);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseSubmitButton.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will search and open CTRP/CTRO Case in Native View
     *
     */
    public static void a_ctrp_ctro_helpdesk_case() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        ctrp_ctro_helpdesk_case_submit_nv();
        CommonUtils.waitForVisibility(CTRPCTRO_NV_Page.ctrpCTRONVAllCasesSearchDropDown);
        CommonUtils.selectDropDownValue(CTRPCTRO_NV_Page.ctrpCTRONVAllCasesSearchDropDown, CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_ALL_CASES_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(CTRPCTRO_NV_Page.ctrpCTRONVAllCasesSearchTextBox, CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SHORT_DESCRIPTION_FIELD_TEXT_BOX_OPTION);
        CommonUtils.sendKeys(CTRPCTRO_NV_Page.ctrpCTRONVAllCasesSearchTextBox, Keys.ENTER);
        CommonUtils.hoverOverElement(CTRPCTRO_NV_Page.nVRecordName(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SHORT_DESCRIPTION_FIELD_TEXT_BOX_OPTION));
        CommonUtils.waitForClickability(CTRPCTRO_NV_Page.ctrpCTROCaseLocator(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SHORT_DESCRIPTION_FIELD_TEXT_BOX_OPTION));
        JavascriptUtils.clickByJS(CTRPCTRO_NV_Page.ctrpCTROCaseLocator(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SHORT_DESCRIPTION_FIELD_TEXT_BOX_OPTION));
        CommonUtils.waitForVisibility(CTRPCTRO_NV_Page.ctrpCTRONVCaseOpenRecordButton);
        CommonUtils.clickOnElement(CTRPCTRO_NV_Page.ctrpCTRONVCaseOpenRecordButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method will select the Category Field option in NV for CTRP/CTRO Case
     *
     */
    public static void users_select(String category){
        CommonUtils.waitForVisibility(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryField(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_CATEGORY_FIELD));
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryField(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_CATEGORY_FIELD));
        MiscUtils.sleep(2000);
        CommonUtils.assertEqualsWithMessage(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryField(CTRPCTRO_NV_Constants.
        CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_CATEGORY_FIELD).getText(), category,"--Verify the Category field--");
        CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDown.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the new added Category field for CTRP/CTRO Case in Native View
     *
     */
    public static void a_new_category_called_is_added(String nciDCCAccrualReport){
        CommonUtils.selectDropDownValue(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDown, CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_CATEGORY_FIELD_DROP_DOWN_NCI_DCC_ACCRUAL_REPORT_OPTION);
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_CATEGORY_FIELD_DROP_DOWN_NCI_DCC_ACCRUAL_REPORT_OPTION));
        CommonUtils.assertTrue(nciDCCAccrualReport.contains(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_CATEGORY_FIELD_DROP_DOWN_NCI_DCC_ACCRUAL_REPORT_OPTION).getText()));
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the Subcategory options for new added Category field for CTRP/CTRO Case in Native View
     *
     */
    public static void following_options_are_available_in_the_subcategory_field_when_the_nci_dcc_accrual_report_category_is_selected(String accountRelated,
      String dataReview, String feedBack, String generalInquiries, String policyDecision, String technicalIssues, String training) {
        CommonUtils.selectDropDownValue(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseSubcategoryFieldDropDown, CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SUBCATEGORY_FIELD_DROP_DOWN_ACOUNT_RELATED_OPTION);
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SUBCATEGORY_FIELD_DROP_DOWN_ACOUNT_RELATED_OPTION));
        CommonUtils.assertTrue(accountRelated.contains(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SUBCATEGORY_FIELD_DROP_DOWN_ACOUNT_RELATED_OPTION).getText()));
        CommonUtils.clickOnElement(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(dataReview));
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(dataReview));
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(feedBack));
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(feedBack));
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(generalInquiries));
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(generalInquiries));
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(policyDecision));
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(policyDecision));
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(technicalIssues));
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(technicalIssues));
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(training));
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseCategoryFieldDropDownOptions(training));
        CucumberLogUtils.logScreenshot();
        CTRPCTRO_NV_Page.ctrpCTRONVUpdatedCaseSaveButton.click();
        MiscUtils.sleep(2000);
        CommonUtils.assertTrue(CTRPCTRO_NV_Page.ctrpCTRONVCreateNewCaseSubcategoryFieldDropDown.getText().equals(CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CASE_SUBCATEGORY_FIELD_DROP_DOWN_ALL_OPTIONS));
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method deletes the CTRP/CTRO Case in Native View and verify that the case is deleted
     *
     */
    public static void deleteTheRecord() {
        CommonUtils.clickOnElement(CTRPCTRO_NV_Page.ctrpCTRONVCaseRecordDeleteButton);
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(CTRPCTRO_NV_Page.ctrpCTRONVCaseRecordPopUpDeleteButton);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(CTRPCTRO_NV_Page.ctrpCTRONVAllCasesSearchDropDown);
        CommonUtils.selectDropDownValue(CTRPCTRO_NV_Page.ctrpCTRONVAllCasesSearchDropDown, CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_ALL_CASES_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(CTRPCTRO_NV_Page.ctrpCTRONVAllCasesSearchTextBox, CTRPCTRO_NV_Constants.CTRP_CTRO_NATIVE_VIEW_CREATE_NEW_CASE_SHORT_DESCRIPTION_FIELD_TEXT_BOX_OPTION);
        CommonUtils.sendKeys(CTRPCTRO_NV_Page.ctrpCTRONVAllCasesSearchTextBox, Keys.ENTER);
        CommonUtils.assertTrue(CTRPCTRO_NV_Page.nativeViewNoRecordsToDisplayText.getText().contentEquals(CTRPCTRO_NV_Constants.NATIVE_VIEW_NO_RECORD_TO_DISPLAY_TEXT));
        CommonUtils.assertEqualsWithMessage(CTRPCTRO_NV_Page.nativeViewNoRecordsToDisplayText.getText(),CTRPCTRO_NV_Constants.NATIVE_VIEW_NO_RECORD_TO_DISPLAY_TEXT,
                "Verify there are no records to display created by Automation and the record has been deleted");
        JavascriptUtils.drawBlueBorder(CTRPCTRO_NV_Page.nativeViewNoRecordsToDisplayText);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }
}