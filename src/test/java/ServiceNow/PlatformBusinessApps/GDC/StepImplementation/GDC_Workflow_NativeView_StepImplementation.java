package ServiceNow.PlatformBusinessApps.GDC.StepImplementation;

import ServiceNow.PlatformBusinessApps.GDC.Constants.GDC_WorkFlow_NV_Constants;
import ServiceNow.PlatformBusinessApps.SEER.Constants.SEERNativeView_Constants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.Keys;

public class GDC_Workflow_NativeView_StepImplementation extends PageInitializer {

    public static void createNewGDCRecord(){

        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCShortDescriptionLabel);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCShortDescriptionTextBox, GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_SHORT_DESCRIPTION_TEXT_BOX);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCRecordSubmitterSearchTextBox, GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_SUBMITTER_SEARCH_TEXT_BOX);
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordAssignedToSearchTextBox);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCRecordAssignedToSearchTextBox, Keys.ENTER);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCRecordAssignedToSearchTextBox, GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_ASSIGNED_TO_USER_TEXT_BOX);
        MiscUtils.sleep(500);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCRecordCategoryDropDown, Keys.ENTER);
        MiscUtils.sleep(1000);
        CommonUtils.selectDropDownValue(gDC_Workflow_NativeView_Page.nVGDCRecordCategoryDropDown, GDC_WorkFlow_NV_Constants.GDC_CATEGORY_DROPDOWN_FIELD);
        MiscUtils.sleep(500);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCCreateNewRecord1stSaveButton);
        CommonUtils.waitForClickability(gDC_Workflow_NativeView_Page.nVGDCCreateNewRecord1stSaveButton);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCCreateNewRecord1stSaveButton);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordStateTextBox);
        CucumberLogUtils.logScreenshot();
    }

    public static void deleteAutomatedGDCRecord() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        WebDriverUtils.webDriver.get(GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_FILTER_NAVIGATION_ALL_UNDER_GDC_URL);
        MiscUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        MiscUtils.sleep(2000);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchDropDown, GDC_WorkFlow_NV_Constants.GDC_NATIVE_ALL_RECORD_SEARCH_DROP_DOWN);
        MiscUtils.sleep(3000);
        CommonUtils.sendKeysToElement(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchTextBox, GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_SHORT_DESCRIPTION_TEXT_BOX);
        MiscUtils.sleep(3000);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchTextBox, Keys.ENTER);
        CommonUtils.hoverOverElement(gDC_Workflow_NativeView_Page.nVRecordName(GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_SHORT_DESCRIPTION_TEXT_BOX));
        CommonUtils.waitForClickability(gDC_Workflow_NativeView_Page.nVRecordLocator(GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_SHORT_DESCRIPTION_TEXT_BOX));
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVRecordLocator(GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_SHORT_DESCRIPTION_TEXT_BOX));
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCOpenRecordButton);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCOpenRecordButton);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordDeleteButton);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCRecordDeleteButton);
        CommonUtils.switchToFrame(gDC_Workflow_NativeView_Page.nVDeleteConfirmPopUpIFrame);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCRecordConfirmDeleteButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchDropDown, GDC_WorkFlow_NV_Constants.GDC_NATIVE_ALL_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchTextBox, GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_SHORT_DESCRIPTION_TEXT_BOX);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchTextBox, Keys.ENTER);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(nativeViewAccessRequestPage.nativeViewAccessRequestEmailsNoRecordsToDisplayText.getText(),SEERNativeView_Constants.NATIVE_VIEW_NO_RECORD_TO_DISPLAY_TEXT, "Verify there are no records to display created by Automation");
        JavascriptUtils.drawBlueBorder(nativeViewAccessRequestPage.nativeViewAccessRequestEmailsNoRecordsToDisplayText);
        CucumberLogUtils.logScreenshot();
    }

    public static void iAmAuthenticatedGDCFulfillerInNV() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser("wwysoc2@uchicago.edu");
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        WebDriverUtils.webDriver.get(GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_FILTER_NAVIGATION_CREATE_NEW_UNDER_GDC_URL);
        MiscUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        createNewGDCRecord();
    }

    public static void iGetATicketAssignedToMe(){
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordAssignedToSearchTextBox);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordAssignedToSearchTextBox);
        CommonUtils.assertEqualsWithMessage(GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_ASSIGNED_TO_USER_TEXT_BOX, GDC_WorkFlow_NV_Constants.GDC_FULFILLER_USER_NAME,
                "--Verifying the Assigned to User is same as the Impersonate User--");
        CucumberLogUtils.logScreenshot();
    }

    public static void gDCUIActionsOnTopRightCornerForGDCFlow() throws TestingException {
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordStartWorkButton);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordStartWorkButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCRecordStartWorkButton);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordStateTextBox);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordResolvedButton);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordCancelCaseButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordResolvedButton);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCRecordResolvedButton);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordStateTextBox);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordStateTextBox);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
        deleteAutomatedGDCRecord();
    }

    public static void gDCTicketIsResolved(){
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordStartWorkButton);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordStartWorkButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCRecordStartWorkButton);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordStateTextBox);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordResolvedButton);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordCancelCaseButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordResolvedButton);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCRecordResolvedButton);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordStateTextBox);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordStateTextBox);
        CucumberLogUtils.logScreenshot();
    }

    public static void clickOnClosureInfoAndCheckBusinessDuration() throws TestingException{
        CommonUtils.waitForClickability(gDC_Workflow_NativeView_Page.nVGDCRecordClosureInformationTab);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCRecordClosureInformationTab);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordConfigureBusinessDurationField);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCRecordConfigureBusinessDurationField);
        MiscUtils.sleep(5000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
        deleteAutomatedGDCRecord();
    }
}