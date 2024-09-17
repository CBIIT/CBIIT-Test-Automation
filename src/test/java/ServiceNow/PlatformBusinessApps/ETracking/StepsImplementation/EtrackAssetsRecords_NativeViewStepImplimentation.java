package ServiceNow.PlatformBusinessApps.ETracking.StepsImplementation;

import ServiceNow.PlatformBusinessApps.ETracking.Constants.EtrackAssetsRecords_NativeView_Constants;
import ServiceNow.PlatformBusinessApps.SEER.Constants.SEERNativeView_Constants;
import appsCommon.Utils.ServiceNow_Common_Methods;
import appsCommon.Utils.ServiceNow_Login_Methods;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.Keys;

public class EtrackAssetsRecords_NativeViewStepImplimentation extends PageInitializer {

    /**
     * All Etracking Asset methods needs Screenshots once the issues is resolved
     */
    public static void aEtrackingUserOpensAnAssetRecord() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser("Jeffrey Alderdice");
        ServiceNow_Common_Methods.filterNavigatorSearch("Assets");
        CucumberLogUtils.logScreenshot();
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
        CommonUtils.hoverOverElement(etrackAssetsRecords_NativeViewPage.eTrackAssetLocator(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX));
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.eTrackAssetLocator(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX));
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the delete button
     */
    public static void thereIsDeleteButton() {
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton);
        CommonUtils.assertTrue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton.getText().contentEquals(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_OPEN_RECORD_DELETE_BUTTON));
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method represents the action of a user clicking on the delete button.
     */
    public static void theUserClicksTheDeleteButton() {
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method represents the action of deleting a record.
     */
    public static void theRecordIsDeleted() {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown);
        CommonUtils.selectDropDownValue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown, EtrackAssetsRecords_NativeView_Constants.ETRACKING_NATIVE_VIEW_ASSETS_ALL_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, Keys.ENTER);
        CommonUtils.assertTrue(nativeViewAccessRequestPage.nativeViewAccessRequestNewNoRecordsToDisplayText.getText().contentEquals(SEERNativeView_Constants.NATIVE_VIEW_NO_RECORD_TO_DISPLAY_TEXT));
        CommonUtils.assertEqualsWithMessage(nativeViewAccessRequestPage.nativeViewAccessRequestNewNoRecordsToDisplayText.getText(),SEERNativeView_Constants.NATIVE_VIEW_NO_RECORD_TO_DISPLAY_TEXT, "--VERIFY THERE ARE NO RECORDS TO DISPLAY CREATED BY AUTOMATION--");
        JavascriptUtils.drawBlueBorder(nativeViewAccessRequestPage.nativeViewAccessRequestNewNoRecordsToDisplayText);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * This method represents the action of when an Etracking User is on an Asset Record
     */
    public static void anEtrackingUserIsOnAnAssetRecord() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser("Jeffrey Alderdice");
        MiscUtils.sleep(3000);
        ServiceNow_Common_Methods.filterNavigatorSearch("Assets");
        MiscUtils.sleep(2000);
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

    /**
     * Verifies the existence and properties of a free text field.
     *
     * @param AssetInformation The expected value of the asset information field.
     */
    public static void thereIsAFreeTextFieldCalled(String AssetInformation) {
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation);
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation.getText(), AssetInformation, "--VERIFYING THE ASSET INFORMATION FIELD--");
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies that the user is able to enter at least one thousand characters.
     */
    public static void theUserIsAbleToEnterAtLeastOneThousandCharacters() {
        String numOfCharacters = "";
        for (int i = 0; i < 50; i++) {
            numOfCharacters = numOfCharacters + EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_ASSET_INFORMATION_TEXT_BOX;
        }
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox, numOfCharacters);
        System.out.println("Print Characters real lenght:::: " + numOfCharacters.length());
        CommonUtils.assertEqualsWithMessage(Integer.toString(numOfCharacters.length()), EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_ASSET_INFORMATION_TEXT_BOX_EXPECTED_LENGTH,
                "--VERIFY THE ASSET INFORMATION TEXT BOX CHARACTERS COUNT--" );
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

    /**
     * This method represents the action of the user opening the model record.
     */
    public static void theUserOpensTheModelRecord() {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This metha verifies the "Description" field.
     *
     * @param description The expected description of the field.
     */
    public static void thereIsFieldCalled(String description) {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionField);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionField);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionField.getText(), description, "--VERIFYING DESCRIPTION FIELD--");
    }

    /**
     * The user is able to make text changes to the description field.
     */
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
                "--VERIFYING THE UPDATED DESCRIPTION TEXT FIELD --");
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionTextBox);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordBackButton);
        CucumberLogUtils.logScreenshot();
        thereIsDeleteButton();
        theUserClicksTheDeleteButton();
        theRecordIsDeleted();
    }

    /**
     * This method verifies a date picker "Expiration Date" field.
     *
     * @param expirationDate The expected expiration date value.
     */
    public static void thereIsADatePickerFieldCalled(String expirationDate) {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateField);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateField);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateField.getText(), expirationDate, "--VERIFY THE EXPIRATION DATE FIELD--");
    }

    /**
     * This method represents the action of the user clicking on the expiration date calendar icon field.
     */
    public static void theUserClicksTheExpirationDateCalendarIconField() {
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method represents the action of the user being able to select any date.
     */
    public static void theUserIsAbleToSelectAnyDate() {
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendar);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateSelectGoToTodayDate);
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendar);
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.eTrackAssetExpirationDateSelectAnyDate);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the field "Decal Number".
     *
     * @param decalNumber The expected decal number of the field.
     */
    public static void thereIsAFieldCalled(String decalNumber) {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel.getText(), decalNumber, "--VERIFY THE DECAL NUMBER FIELD--");
    }

    /**
     * Verifies if there is no field called "barcode".
     *
     * @param barcode The barcode value to check.
     */
    public static void thereIsNoFieldCalled(String barcode) {
        CommonUtils.assertTrue(!barcode.equals(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel.getText()));
    }

    /**
     * This method verifies the field called "Status".
     */
    public static void thereIsAFieldCalledStatus(){
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusField);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusField);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Represents the action of the user clicking on the status field.
     */
    public static void theUserClicksTheStatusField(){
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDown);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDown);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Sets the options for the field in the page and verifies the selected options.
     *
     * @param checkedOut     The value of the "Checked Out" option.
     * @param inStockroom    The value of the "In Stockroom" option.
     * @param inTransfer     The value of the "In Transfer" option.
     */
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
        CommonUtils.assertEqualsWithMessage(checkedOut,etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(checkedOut).getText(),"VERIFY THE CHECKED OUT DROP DOWN OPTION" );
        CommonUtils.assertEqualsWithMessage(inStockroom,etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(inStockroom).getText(),"VERIFY THE IN STOCKROOM DROP DOWN OPTION" );
        CommonUtils.assertEqualsWithMessage(inTransfer,etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDownOptions(inTransfer).getText(),"VERIFY THE IN TRANSFER DROP DOWN OPTION" );
        CucumberLogUtils.logScreenshot();
    }
}