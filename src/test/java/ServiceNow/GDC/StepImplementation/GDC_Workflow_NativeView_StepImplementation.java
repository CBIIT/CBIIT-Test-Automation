package ServiceNow.GDC.StepImplementation;

import ServiceNow.GDC.Constants.GDC_WorkFlow_NV_Constants;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import javax.crypto.Cipher;

public class GDC_Workflow_NativeView_StepImplementation extends PageInitializer {

    public static void createNewGDCRecord(){
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVFilterNavigator);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCCreateNewTab);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCCreateNewTab);
        CommonUtils.switchToFrame(etrackAssetsRecords_NativeViewPage.accessRequestIFrame);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCShortDescriptionLabel);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCShortDescriptionTextBox, GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_SHORT_DESCRIPTION_TEXT_BOX);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCRecordSubmitterSearchTextBox, GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_SUBMITTER_SEARCH_TEXT_BOX);
        MiscUtils.sleep(500);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCCreateNewRecord1stSaveButton);
        CommonUtils.waitForClickability(gDC_Workflow_NativeView_Page.nVGDCCreateNewRecord1stSaveButton);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCCreateNewRecord1stSaveButton);
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordAssignedToSearchTextBox);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCRecordAssignedToSearchTextBox, Keys.ENTER);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCRecordAssignedToSearchTextBox, GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_ASSIGNED_TO_USER_TEXT_BOX);
        MiscUtils.sleep(500);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCExistedRecordAssigneToSavedButton);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCExistedRecordAssigneToSavedButton);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordStateTextBox);
        CucumberLogUtils.logScreenshot();
    }

    public static void deleteAutomatedGDCRecord() throws TestingException {
        nativeViewImpersonateUser.impersonateToStaffMemberCBIIT();
        nativeViewImpersonateUserPage.nativeViewLink.click();
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nativeViewEnrollementsPage.filterNavigator);
        nativeViewEnrollementsPage.filterNavigator.clear();
        gDC_Workflow_NativeView_Page.nVFilterNavigator.sendKeys(GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_FILTER_NAVIGATION_SEARCH_BOX);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCAllTab);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCAllTab);
        CommonUtils.switchToFrame(gDC_Workflow_NativeView_Page.accessRequestIFrame);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchDropDown);
        CommonUtils.selectDropDownValue(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchDropDown, GDC_WorkFlow_NV_Constants.GDC_NATIVE_ALL_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchTextBox, GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_SHORT_DESCRIPTION_TEXT_BOX);
        CommonUtils.sendKeys(gDC_Workflow_NativeView_Page.nVGDCAllRecordSearchTextBox, Keys.ENTER);
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordLocator);
        CommonUtils.clickOnElement(gDC_Workflow_NativeView_Page.nVGDCRecordLocator);
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
        CommonUtils.waitForVisibility(gDC_Workflow_NativeView_Page.nVGDCRecordNoRecordToDisplay);
        JavascriptUtils.drawBlueBorder(gDC_Workflow_NativeView_Page.nVGDCRecordNoRecordToDisplay);
        CucumberLogUtils.logScreenshot();
    }

    public static void iAmAuthenticatedGDCFulfillerInNV() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewImpersonateUser.impersonateGDCFulfillerUser();
        nativeViewEnrollementsPage.filterNavigator.clear();
        gDC_Workflow_NativeView_Page.nVFilterNavigator.sendKeys(GDC_WorkFlow_NV_Constants.GDC_NATIVE_VIEW_FILTER_NAVIGATION_SEARCH_BOX);
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
        deleteAutomatedGDCRecord();
    }
}
