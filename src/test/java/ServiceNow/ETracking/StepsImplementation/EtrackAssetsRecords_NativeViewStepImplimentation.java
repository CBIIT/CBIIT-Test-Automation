package ServiceNow.ETracking.StepsImplementation;

import GrantsApps.EM.Pages.ManageI2EUsersPage;
import ServiceNow.ETracking.Constants.EtrackAssetsRecords_NativeView_Constants;
import ServiceNow.SEER.Constants.SEERNativeView_Constants;
import appsCommon.Pages.NativeView_SideDoor_Dashboard_Page;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.Keys;

public class EtrackAssetsRecords_NativeViewStepImplimentation extends PageInitializer {

    /**
     * This method will log in as a eTracking user
     *
     */

    /**
     * All Etracking Asset methods needs Screenshots once the issues is resolved
     */
    public static void aEtrackingUserOpensAnAssetRecord() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_And_Land_In_Native_View("Jeffrey Alderdice");
        ServiceNow_Common_Methods.filterNavigatorSearch("Assets");
        CucumberLogUtils.logScreenshot();
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewButton.click();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberTextBox);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordModelTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_MODEL_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordCostTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_COST_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStockroomTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_STOCKROOM_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordQuantityTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_QUANTITY_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetTypeTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_ASSET_TYPE_TEXT_BOX);
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateTextBox);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_EXPIRATION_DATE_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_ASSET_INFORMATION_TEXT_BOX);
        CommonUtils.selectDropDownValue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDown, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_STATUS_DROP_DOWN);
        etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordSubmitButton.click();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown);
        CommonUtils.selectDropDownValue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown, EtrackAssetsRecords_NativeView_Constants.ETRACKING_NATIVE_VIEW_ASSETS_ALL_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, Keys.ENTER);
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.eTrackAssetLocator(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX));
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CucumberLogUtils.logScreenshot();
    }

    public static void thereIsDeleteButton() {
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton);
        CommonUtils.assertTrue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton.getText().contentEquals(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_OPEN_RECORD_DELETE_BUTTON));
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton);
        CucumberLogUtils.logScreenshot();
    }

    public static void theUserClicksTheDeleteButton() {
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton);
        CucumberLogUtils.logScreenshot();
    }

    public static void theRecordIsDeleted() {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown);
        CommonUtils.selectDropDownValue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown, EtrackAssetsRecords_NativeView_Constants.ETRACKING_NATIVE_VIEW_ASSETS_ALL_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, Keys.ENTER);
        CommonUtils.assertEqualsWithMessage(nativeViewAccessRequestPage.nativeViewAccessRequestNewNoRecordsToDisplayText.getText(),SEERNativeView_Constants.NATIVE_VIEW_NO_RECORD_TO_DISPLAY_TEXT, "Verify there are no records to display created by Automation");
        JavascriptUtils.drawBlueBorder(nativeViewAccessRequestPage.nativeViewAccessRequestNewNoRecordsToDisplayText);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    public static void anEtrackingUserIsOnAnAssetRecord() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_And_Land_In_Native_View("Jeffrey Alderdice");
        MiscUtils.sleep(6000);
        ServiceNow_Common_Methods.filterNavigatorSearch("Assets");
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewButton.click();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberTextBox);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordModelTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_MODEL_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordCostTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_COST_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStockroomTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_STOCKROOM_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordQuantityTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_QUANTITY_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetTypeTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_ASSET_TYPE_TEXT_BOX);
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateTextBox);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_EXPIRATION_DATE_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_ASSET_INFORMATION_TEXT_BOX);
        CucumberLogUtils.logScreenshot();
    }

    public static void anEtrackingUserImpersonation() throws TestingException {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonate_Any_User_And_Land_In_Native_View("Jeffrey Alderdice");
        CucumberLogUtils.logScreenshot();
    }

    public static void thereIsAFreeTextFieldCalled(String AssetInformation) {
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation);
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation.getText(), AssetInformation, "--Verifying the Asset information field--");
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation);
        CucumberLogUtils.logScreenshot();
    }

    public static void theUserIsAbleToEnterAtLeastOneThousandCharacters() {
        String numOfCharacters = "";
        for (int i = 0; i < 50; i++) {
            numOfCharacters = numOfCharacters + EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_ASSET_INFORMATION_TEXT_BOX;
        }
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox, numOfCharacters);
        System.out.println("Print Characters real lenght:::: " + numOfCharacters.length());
        CommonUtils.assertEqualsWithMessage(Integer.toString(numOfCharacters.length()), EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_ASSET_INFORMATION_TEXT_BOX_EXPECTED_LENGTH,
                "--Verify the Asset Information Text Box Characters count--" );
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox);
        CucumberLogUtils.logScreenshot();
        CommonUtils.selectDropDownValue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDown, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_STATUS_DROP_DOWN);
        etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordSubmitButton.click();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown);
        CommonUtils.selectDropDownValue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown, EtrackAssetsRecords_NativeView_Constants.ETRACKING_NATIVE_VIEW_ASSETS_ALL_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, Keys.ENTER);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.eTrackAssetLocator(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX));
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox);
        CucumberLogUtils.logScreenshot();
        thereIsDeleteButton();
        theUserClicksTheDeleteButton();
        theRecordIsDeleted();
    }

    public static void theUserOpensTheModelRecord() {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CucumberLogUtils.logScreenshot();
    }

    public static void thereIsFieldCalled(String description) {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionField);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionField);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionField.getText(), description, "--verifying Description field");
    }

    public static void theUserIsAbleToMakeTextChangesToTheDescriptionField() {
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionTextBox,
                EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_MODEL_RECORD_DESCRIPTION_TEXT_BOX);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionTextBox);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordUpdateButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordUpdateButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelOpenRecordButton);
        theUserOpensTheModelRecord();
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionTextBox.getText(),
                EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_MODEL_RECORD_DESCRIPTION_TEXT_BOX,
                "--Verifying the updated Description Text Field --");
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionTextBox);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordBackButton);
        CucumberLogUtils.logScreenshot();
        thereIsDeleteButton();
        theUserClicksTheDeleteButton();
        theRecordIsDeleted();
    }

    public static void thereIsADatePickerFieldCalled(String expirationDate) {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateField);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateField);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateField.getText(), expirationDate, "--Verify the Expiration date field--");
    }

    public static void theUserClicksTheExpirationDateCalendarIconField() {
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        CucumberLogUtils.logScreenshot();
    }

    public static void theUserIsAbleToSelectAnyDate() {
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendar);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateSelectGoToTodayDate);
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendar);
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.eTrackAssetExpirationDateSelectAnyDate);
        CucumberLogUtils.logScreenshot();
    }

    public static void thereIsAFieldCalled(String decalNumber) {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel.getText(), decalNumber, "--Verify the Decal number field--");
    }

    public static void thereIsNoFieldCalled(String barcode) {
        CommonUtils.assertTrue(!barcode.equals(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel.getText()));
    }

    public static void thereIsAFieldCalledStatus(){
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusField);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusField);
        CucumberLogUtils.logScreenshot();
    }

    public static void theUserClicksTheStatusField(){
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDown);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDown);
        CucumberLogUtils.logScreenshot();
    }

    public static void theFollowingFieldOptionsAreAvailable(String checkedOut,String inStockroom,String inTransfer){
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDown);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(checkedOut));
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(checkedOut));
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(inStockroom));
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(inStockroom));
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(inTransfer));
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(inTransfer));
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(checkedOut,etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(checkedOut).getText(),"verify the checked Out drop down option" );
        CommonUtils.assertEqualsWithMessage(inStockroom,etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(inStockroom).getText(),"verify the In Stockroom drop down option" );
        CommonUtils.assertEqualsWithMessage(inTransfer,etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(inTransfer).getText(),"verify the In Transfer drop down option" );
        CucumberLogUtils.logScreenshot();
    }
}