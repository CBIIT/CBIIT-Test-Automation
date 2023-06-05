package ServiceNow.SEER.StepsImplementation;

import ServiceNow.SEER.Constants.Registration_Constants;
import ServiceNow.SEER.Constants.SEERDataRejection_Constants;
import ServiceNow.SEER.Constants.SEERNativeView_Constants;
import ServiceNow.SEER.Pages.NativeViewAccessRequestPage;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.openqa.selenium.Keys;

public class SEERDataRejectionStepImpl extends PageInitializer {

    public static String newEmailThankYou320 = "seerThankYou320" + CommonUtils.email;

    public static void aSEERODSAdminNavigatesTheNativeViewPortal() {
        nativeViewLoginImpl.sideDoorAccountLogin();
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewHomeButton.getText()
                .contentEquals("Home"));
        CucumberLogUtils.logScreenShot();
    }

    public static void proceedsToRegisterForResearchDataWithUniqueEmailAddress() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou320);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(seerLandingPage.registerForResearchDataButton);
        MiscUtils.sleep(1000);
    }

    public static void fillsOutAllRequiredFieldsOnSEERDataRegistrationForm() {
        SEERUserRegistrationPageStepImpl.validateEmailFieldReadOnly();
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationFirstNameField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField,
                SEERDataRejection_Constants.FIRST_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField,
                SEERDataRejection_Constants.LAST_NAME + "aa");
        CommonUtils.clickOnElement(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                SEERDataRejection_Constants.ORGANIZATION_NAME);
        seerUserRegistrationPage.seerUserRegistrationCountryField.click();
        seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(SEERDataRejection_Constants.COUNTRY_NAME);
        seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationAddressField,
                SEERDataRejection_Constants.STREET_ADDRESS);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, SEERDataRejection_Constants.CITY_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationStateField, SEERDataRejection_Constants.STATE);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationZipcodeField,
                SEERDataRejection_Constants.ZIP_CODE);
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationPhoneField,
                SEERDataRejection_Constants.PHONE_NUMBER);

        /**
         * SELECTING VALUE FOR What best describes you for the purpose of requesting
         * this data?
         */
        CommonUtils.selectDropDownValue(SEERDataRejection_Constants.GENERAL_PURPOSE_FOR_USING_THE_DATA,
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void fillsOutAllRequiredFieldsOnSEERDataRegistrationFormRejected() {
        SEERUserRegistrationPageStepImpl.validateEmailFieldReadOnly();
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationFirstNameField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField,
                SEERDataRejection_Constants.FIRST_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField,
                SEERDataRejection_Constants.LAST_NAME);
        CommonUtils.clickOnElement(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                SEERDataRejection_Constants.ORGANIZATION_NAME);
        seerUserRegistrationPage.seerUserRegistrationCountryField.click();
        seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(SEERDataRejection_Constants.COUNTRY_NAME);
        seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationAddressField,
                SEERDataRejection_Constants.STREET_ADDRESS);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, SEERDataRejection_Constants.CITY_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationStateField, SEERDataRejection_Constants.STATE);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationZipcodeField,
                SEERDataRejection_Constants.ZIP_CODE);
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationPhoneField,
                SEERDataRejection_Constants.PHONE_NUMBER);

        /**
         * SELECTING VALUE FOR What best describes you for the purpose of requesting
         * this data?
         */
        CommonUtils.selectDropDownValue(SEERDataRejection_Constants.GENERAL_PURPOSE_FOR_USING_THE_DATA,
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void verifyPrePopulatedSEERDataRegistrationForm() {
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        SEERUserRegistrationPageStepImpl.validateEmailFieldReadOnly();
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationEmailField);
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationFirstNameField.getAttribute("class").contains(Registration_Constants.REGISTRATION_FORM_DISABLED_FIELD_ATTRIBUTE_VALUE));
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationFirstNameField);
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationLastNameField.getAttribute("class").contains(Registration_Constants.REGISTRATION_FORM_DISABLED_FIELD_ATTRIBUTE_VALUE));
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationLastNameField);
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationOrganizationField.getAttribute("class").contains(Registration_Constants.REGISTRATION_FORM_DISABLED_FIELD_ATTRIBUTE_VALUE));
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationCountryField.getAttribute("class").contains(Registration_Constants.REGISTRATION_FORM_DISABLED_FIELD_ATTRIBUTE_VALUE));
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationCountryField);
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationAddressField.getAttribute("class").contains(Registration_Constants.REGISTRATION_FORM_DISABLED_FIELD_ATTRIBUTE_VALUE));
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationAddressField);
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationCityField.getAttribute("class").contains(Registration_Constants.REGISTRATION_FORM_DISABLED_FIELD_ATTRIBUTE_VALUE));
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationCityField);
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationStateField.getAttribute("class").contains(Registration_Constants.REGISTRATION_FORM_DISABLED_FIELD_ATTRIBUTE_VALUE));
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationStateField);
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationZipcodeField.getAttribute("class").contains(Registration_Constants.REGISTRATION_FORM_DISABLED_FIELD_ATTRIBUTE_VALUE));
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationZipcodeField);
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationPhoneField.getAttribute("class").contains(Registration_Constants.REGISTRATION_FORM_DISABLED_FIELD_ATTRIBUTE_VALUE));
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationPhoneField);
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField.getAttribute("class").contains(Registration_Constants.REGISTRATION_FORM_DISABLED_FIELD_ATTRIBUTE_VALUE));
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenShot();
    }

    public static void aSEERODSAdminNavigatesTo(String SEERText, String accessRequestsText) {
        nativeViewEnrollementsPage.filterNavigator.sendKeys(SEERText);
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(NativeViewAccessRequestPage.nativeViewSEERAccessRequestsLink(accessRequestsText));
        CommonUtils.clickOnElement(NativeViewAccessRequestPage.nativeViewSEERAccessRequestsLink(accessRequestsText));
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewAccessRequestPage.accessRequestMenu.getText()
                .contentEquals(accessRequestsText));
    }

    public static void createsANewAccessRequest() {
        nativeViewAccessRequestPage.accessRequestNewButton.click();
        CommonUtils.assertTrue(nativeViewAccessRequestPage.accessRequestText.getText()
                .contentEquals(SEERNativeView_Constants.NATIVE_VIEW_ACCESS_REQUEST_MENU_TEXT));
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(SEERDataRejection_Constants.FIRST_NAME + " " + SEERDataRejection_Constants.LAST_NAME);
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Keys.ENTER);
        CucumberLogUtils.logScreenShot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessRequestPreviewRecordButton);
        CucumberLogUtils.logScreenShot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessRequestOpenRecordButton);
        CucumberLogUtils.logScreenShot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessRequestSaveChangesDiscardButton);
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewAccessRequestPage.accessRequestCustomerText.getText()
                .contentEquals("Customer"));
        CucumberLogUtils.logScreenShot();
        CommonUtils.selectDropDownValue("Institution",
                nativeViewAccessRequestPage.nativeViewAccessRequestAccountTypeDropdown);
        CucumberLogUtils.logScreenShot();
        nativeViewAccessRequestPage.nativeViewAccessSaveClientButton.click();
        MiscUtils.sleep(1000);
        CommonUtils.switchToDefaultContent();
    }

    public static void createsANewAccessRequestForSeerResearchDatabase(String registerForResearchData) {
        CommonUtils.switchToDefaultContent();
        SEERDataRejectionStepImpl.aSEERODSAdminNavigatesTo("", "Access Requests");
        nativeViewAccessRequestPage.accessRequestNewButton.click();
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewAccessRequestPage.accessRequestText.getText()
                .contentEquals(SEERNativeView_Constants.NATIVE_VIEW_ACCESS_REQUEST_MENU_TEXT));
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(SEERDataRejection_Constants.FIRST_NAME + " " + SEERDataRejection_Constants.LAST_NAME + "aa");
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Keys.ENTER);
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys(registerForResearchData);
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys(Keys.ENTER);
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenShot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessSaveClientButtonBottom);
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenShot();
    }

    public static void whenTheAdminRejectsTheAccessRequests() {
        SEERDataRejectionStepImpl.aSEERODSAdminNavigatesTo("", "Access Requests");
        nativeViewAccessRequestPage.accessRequestNewButton.click();
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewAccessRequestPage.accessRequestText.getText()
                .contentEquals(SEERNativeView_Constants.NATIVE_VIEW_ACCESS_REQUEST_MENU_TEXT));
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(SEERDataRejection_Constants.FIRST_NAME + " " + SEERDataRejection_Constants.LAST_NAME);
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Keys.ENTER);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys("SEER Research Plus");
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys(Keys.ENTER);
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenShot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessSaveClientButtonBottom);
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenShot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessRequest);
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        CommonUtils.selectDropDownValue("Rejected",
                nativeViewAccessRequestPage.nativeViewAccessRequestStatusDropdown);
        CucumberLogUtils.logScreenShot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessSaveRejectedClientButtonBottom);
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessUpdateClientButtonBottom);
        CommonUtils.switchToDefaultContent();
    }

    public static void theUserShallReceiveARejectionEmail() {
        /** Waiting for email to be sent and searchable */
        MiscUtils.sleep(50000);
        nativeViewEnrollementsPage.filterNavigator.clear();
        MiscUtils.sleep(500);
        nativeViewEnrollementsPage.filterNavigator.sendKeys("Emails");
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewEmailsPage.nativeViewAccessEmailsButton);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewAccessEmailsButton);
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewEmailsPage.emailsMenu.getText()
                .contentEquals("Emails"));
        CucumberLogUtils.logScreenShot();
        CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, newEmailThankYou320);
        MiscUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailsPreviewVerifyEmailIcon);
        CucumberLogUtils.logScreenShot();
        CommonUtils.clickOnElement(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CucumberLogUtils.logScreenShot();
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
        MiscUtils.sleep(1000);
        JavascriptUtils.drawRedBorder(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader);
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText()
                .contentEquals(SEERDataRejection_Constants.REJECTED_EMAIL_HEADER));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedThankYouForSubmitting.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedRequestsRorSeerResearchPlusText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedUseAnInstitutionAffiliatedText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedListAnInstitutionInTheOrganizationFieldText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedUseAnAppropriateSigningOfficialText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedThisRequestHasBeenRejectedBasedOnText.getText())
                .contentEquals(SEERDataRejection_Constants.REJECTION_EMAIL_TEXT_THANK_YOU));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedEmailAddressesForTheSigningOfficialAndRequestorText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedRequestsUsingOpenEmailText.getText())
                .contentEquals(SEERDataRejection_Constants.EMAIL_ADDRESS_FOR_THE_SIGNING_OFFICIAL));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearTextOne.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearTextTwo.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearSeerDataFaqsLink.getText() + " " + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearTextThree.getText())
                .contentEquals(SEERDataRejection_Constants.IT_IS_UNCLEAR_EMAIL_TEXT));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedTheOrganizationFieldWasLeftBlankText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedTheInstitutionUniversityCompanyText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedMustBeListedText.getText())
                .contentEquals(SEERDataRejection_Constants.THE_ORGANIZATION_FIELD_WAS_LEFT_BLANK));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedToResubmitYourRequestText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedSeerDataAccessLink.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedNoteText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedYouCannotEditYourEmailText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedSeersrtatEmail.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedForHelpText.getText())
                .contentEquals(SEERDataRejection_Constants.TO_RESUBMIT_YOUR_REQUEST));
        JavascriptUtils.drawRedBorder(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedEmailText);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }
}