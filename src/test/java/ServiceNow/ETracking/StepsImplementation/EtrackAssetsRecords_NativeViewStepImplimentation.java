package ServiceNow.ETracking.StepsImplementation;

import ServiceNow.ETracking.Constants.EtrackAssetsRecords_NativeView_Constants;
import ServiceNow.SEER.Constants.SEERNativeView_Constants;
import appsCommon.PageInitializer;
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
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewImpersonateUser.impersonateEtrackingUser();
        nativeViewEnrollementsPage.filterNavigator.clear();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVeTrackingFilterNavigator);
        etrackAssetsRecords_NativeViewPage.nVeTrackingFilterNavigator.sendKeys(EtrackAssetsRecords_NativeView_Constants.ETRACKING_NATIVE_VIEW_FILTER_NAVIGATION_SEARCH_BOX);
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVeTrackingTab);
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackingAssetsTab);
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.nVEtrackingAssetsTab);
        CommonUtils.switchToFrame(etrackAssetsRecords_NativeViewPage.accessRequestIFrame);
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
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.eTrackAssetLocator(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX));
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.eTrackAssetLocator(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX));
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
    }

    public static void thereIsDeleteButton() {
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton);
        CommonUtils.assertTrue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton.getText().contentEquals(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_OPEN_RECORD_DELETE_BUTTON));
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton);
    }

    public static void theUserClicksTheDeleteButton() {
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordDeleteButton);
    }

    public static void theRecordIsDeleted() {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown);
        CommonUtils.selectDropDownValue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown, EtrackAssetsRecords_NativeView_Constants.ETRACKING_NATIVE_VIEW_ASSETS_ALL_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, Keys.ENTER);
        CommonUtils.assertTrue(nativeViewAccessRequestPage.nativeViewAccessRequestNoRecordsToDisplayText.getText().contentEquals(SEERNativeView_Constants.NATIVE_VIEW_NO_RECORD_TO_DISPLAY_TEXT));
        JavascriptUtils.drawBlueBorder(nativeViewAccessRequestPage.nativeViewAccessRequestNoRecordsToDisplayText);
    }

    public static void anEtrackingUserIsOnAnAssetRecord() throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        nativeViewImpersonateUser.impersonateEtrackingUser();
        nativeViewEnrollementsPage.filterNavigator.clear();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVeTrackingFilterNavigator);
        etrackAssetsRecords_NativeViewPage.nVeTrackingFilterNavigator.sendKeys(EtrackAssetsRecords_NativeView_Constants.ETRACKING_NATIVE_VIEW_FILTER_NAVIGATION_SEARCH_BOX);
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVeTrackingTab);
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackingAssetsTab);
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.nVEtrackingAssetsTab);
        CommonUtils.switchToFrame(etrackAssetsRecords_NativeViewPage.accessRequestIFrame);
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
    }

    public static void thereIsAFreeTextFieldCalled(String AssetInformation) {
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation);
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation.getText(), AssetInformation, "--Verifying the Asset information field--");
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation);
    }

    public static void theUserIsAbleToEnterAtLeastOneThousandCharacters() {
        String numOfCharacters = "";
        for (int i = 0; i < 50; i++) {
            numOfCharacters = numOfCharacters + EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_ASSET_INFORMATION_TEXT_BOX;
        }
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox, numOfCharacters);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox);
        CommonUtils.selectDropDownValue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordStatusDropDown, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_STATUS_DROP_DOWN);
        etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordSubmitButton.click();
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown);
        CommonUtils.selectDropDownValue(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchDropDown, EtrackAssetsRecords_NativeView_Constants.ETRACKING_NATIVE_VIEW_ASSETS_ALL_RECORD_SEARCH_DROP_DOWN);
        CommonUtils.sendKeysToElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX);
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsAllRecordSearchTextBox, Keys.ENTER);
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.eTrackAssetLocator(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX));
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.eTrackAssetLocator(EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_NEW_RECORD_DECAL_NUMBER_TEXT_BOX));
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformation);
        CommonUtils.click(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordAssetInformationTextBox);
        thereIsDeleteButton();
        theUserClicksTheDeleteButton();
        theRecordIsDeleted();
    }

    public static void theUserOpensTheModelRecord() {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelOpenRecordButton);
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsOpenRecordButton);
    }

    public static void thereIsFieldCalled(String description) {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionField);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionField);
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionField.getText(), description, "--verifying Description field");
    }

    public static void theUserIsAbleToMakeTextChangesToTheDescriptionField() {
        CommonUtils.sendKeys(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionTextBox, EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_MODEL_RECORD_DESCRIPTION_TEXT_BOX);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionTextBox);
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordUpdateButton);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordUpdateButton);
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelOpenRecordButton);
        theUserOpensTheModelRecord();
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionTextBox.getText(), EtrackAssetsRecords_NativeView_Constants.ETRACKING_ASSETS_MODEL_RECORD_DESCRIPTION_TEXT_BOX, "--Verifying the updated Description Text Field --");
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordDescriptionTextBox);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsModelRecordBackButton);
        thereIsDeleteButton();
        theUserClicksTheDeleteButton();
        theRecordIsDeleted();
    }

    public static void thereIsADatePickerFieldCalled(String expirationDate) {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateField);
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateField.getText(), expirationDate, "--Verify the Expiration date field--");
    }

    public static void theUserClicksTheExpirationDateCalendarIconField() {
        CommonUtils.waitForClickability(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
    }

    public static void theUserIsAbleToSelectAnyDate() {
        JavascriptUtils.drawBlueBorder(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendar);
        CommonUtils.clickOnElement(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateSelectGoToTodayDate);
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendarIcon);
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordExpirationDateCalendar);
        JavascriptUtils.clickByJS(etrackAssetsRecords_NativeViewPage.eTrackAssetExpirationDateSelectAnyDate);
    }

    public static void thereIsAFieldCalled(String decalNumber) {
        CommonUtils.waitForVisibility(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel);
        CommonUtils.assertEqualsWithMessage(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel.getText(), decalNumber, "--Verify the Decal number field--");
    }

    public static void thereIsNoFieldCalled(String barcode) {
        CommonUtils.assertTrue(!barcode.equals(etrackAssetsRecords_NativeViewPage.nVEtrackAssetsNewRecordDecalNumberLabel.getText()));
    }
}