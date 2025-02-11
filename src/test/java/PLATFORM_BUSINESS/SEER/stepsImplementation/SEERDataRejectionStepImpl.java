package PLATFORM_BUSINESS.SEER.stepsImplementation;

import PLATFORM_BUSINESS.SEER.constants.Registration_Constants;
import PLATFORM_BUSINESS.SEER.constants.SEERDataRejection_Constants;
import PLATFORM_BUSINESS.SEER.constants.SEERNativeView_Constants;
import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;

public class SEERDataRejectionStepImpl extends PageInitializer {

    public static String newEmailThankYou320 = "seerThankYou320" + CommonUtils.email;

    /**
     * SEER ODS Admin navigates to the Native View
     */
    public static void aSEERODSAdminNavigatesTheNativeViewPortal() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method proceeds to register with Unique Email Address
     */
    public static void proceedsToRegisterForResearchDataWithUniqueEmailAddress() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou320);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(seerLandingPage.registerForResearchDataButton);
        CommonUtils.sleep(1000);
    }

    /**
     * This method fills out all required fields on SEER Data Registration Form
     */
    public static void fillsOutAllRequiredFieldsOnSEERDataRegistrationForm() {
        SEERUserRegistrationPageStepImpl.validateEmailFieldReadOnly();
        CommonUtils.sleep(1000);
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
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Fills out all the required fields on the SEER Data Registration Form for a rejected registration.
     */
    public static void fillsOutAllRequiredFieldsOnSEERDataRegistrationFormRejected() {
        SEERUserRegistrationPageStepImpl.validateEmailFieldReadOnly();
        CommonUtils.sleep(1000);
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
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the pre-populated SEER data registration form for existing user
    */
    public static void verifyPrePopulatedSEERDataRegistrationForm() {
        CommonUtils.sleep(1000);
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
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Navigates to the SEER ODS Access Request page in Native View.
     *
     * @param SEERText          the SEER text
     * @param accessRequestsText the access requests text
     */
    public static void aSEERODSAdminNavigatesTo(String SEERText, String accessRequestsText) {
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavViewAccessRequestUnderSEERUrl());
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
    }

    /**
     * Creates a new access request.
     */
    public static void createsANewAccessRequest() {
        nativeViewAccessRequestPage.accessRequestNewButton.click();
        CommonUtils.assertTrue(nativeViewAccessRequestPage.accessRequestText.getText()
                .contentEquals(SEERNativeView_Constants.NATIVE_VIEW_ACCESS_REQUEST_MENU_TEXT));
        CommonUtils.waitForVisibility(nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(SEERDataRejection_Constants.FIRST_NAME + " " + SEERDataRejection_Constants.LAST_NAME);
        CommonUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Keys.ENTER);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessSaveButton);
        CommonUtils.sleep(1000);
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessRequestPreviewRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessRequestOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewAccessRequestPage.accessRequestCustomerText.getText()
                .contentEquals("Customer"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.selectDropDownValue("Institution",
                nativeViewAccessRequestPage.nativeViewAccessRequestAccountTypeDropdown);
        CucumberLogUtils.logScreenshot();
        nativeViewAccessRequestPage.nativeViewAccessSaveClientButton.click();
        CommonUtils.sleep(1000);
        CommonUtils.switchToDefaultContent();
    }

    /**
     * Creates a new access request for the SEER Research Database.
     *
     * @param registerForResearchData the data to register for research
     */
    public static void createsANewAccessRequestForSeerResearchDatabase(String registerForResearchData) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavViewAccessRequestUnderSEERUrl());
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        nativeViewAccessRequestPage.accessRequestNewButton.click();
        CommonUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewAccessRequestPage.accessRequestText.getText()
                .contentEquals(SEERNativeView_Constants.NATIVE_VIEW_ACCESS_REQUEST_MENU_TEXT));
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(SEERDataRejection_Constants.FIRST_NAME + " " + SEERDataRejection_Constants.LAST_NAME + "aa");
        CommonUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Keys.ENTER);
        CommonUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys(registerForResearchData);
        CommonUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys(Keys.ENTER);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessSaveClientButtonBottom);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Performs the necessary actions when the admin rejects the access requests.
     */
    public static void whenTheAdminRejectsTheAccessRequests() {
        ServiceNow_Common_Methods.filterNavigatorSearch("SEER");
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavViewAccessRequestUnderSEERUrl());
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        nativeViewAccessRequestPage.accessRequestNewButton.click();
        CommonUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(SEERDataRejection_Constants.FIRST_NAME + " " + SEERDataRejection_Constants.LAST_NAME);
        CommonUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Keys.ENTER);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys(SEERDataRejection_Constants.SEER_RESEARCH_PLUS_AND_NCCR_DATA);
        CommonUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys(Keys.ENTER);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessSaveClientButtonBottom);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessRequest);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(1000);
        CommonUtils.selectDropDownValue("Rejected",
                nativeViewAccessRequestPage.nativeViewAccessRequestStatusDropdown);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessSaveRejectedClientButtonBottom);
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessUpdateClientButtonBottom);
        CommonUtils.switchToDefaultContent();
    }

    /**
     * This method verifies the rejection email.
     */
    public static void theUserShallReceiveARejectionEmail() {
        /** Waiting for email to be sent and searchable */
        CommonUtils.sleep(50000);
        ServiceNow_Common_Methods.filterNavigatorSearch("Emails");
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavEmailUnderSystemLogsUrl());
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewEmailsPage.emailsMenu.getText()
                .contentEquals("Emails"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, newEmailThankYou320);
        CommonUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailsPreviewVerifyEmailIcon);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
        CommonUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CucumberLogUtils.logScreenshot();
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
        CommonUtils.sleep(1000);
        JavascriptUtils.drawRedBorder(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader);
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText().contentEquals(SEERDataRejection_Constants.REJECTED_EMAIL_HEADER));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedThankYouForSubmitting.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedRequestsRorSeerResearchPlusText.getText()
                + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedUseAnInstitutionAffiliatedText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedListAnInstitutionInTheOrganizationFieldText.getText()
                + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedUseAnAppropriateSigningOfficialText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedThisRequestHasBeenRejectedBasedOnText.getText())
                .contentEquals(SEERDataRejection_Constants.REJECTION_EMAIL_TEXT_THANK_YOU));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedEmailAddressesForTheSigningOfficialAndRequestorText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedRequestsUsingOpenEmailText.getText())
                .contentEquals(SEERDataRejection_Constants.EMAIL_ADDRESS_FOR_THE_SIGNING_OFFICIAL));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearTextOne.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearTextTwo.getText()
                + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearSeerDataFaqsLink.getText() + " " + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedItIsUnclearTextThree.getText())
                .contentEquals(SEERDataRejection_Constants.IT_IS_UNCLEAR_EMAIL_TEXT));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedTheOrganizationFieldWasLeftBlankText.getText() + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedTheInstitutionUniversityCompanyText.getText()
                + nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedMustBeListedText.getText()).contentEquals(SEERDataRejection_Constants.THE_ORGANIZATION_FIELD_WAS_LEFT_BLANK));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedToResubmitYourRequestText.getText()).contentEquals(SEERDataRejection_Constants.TO_RESUBMIT_YOUR_REQUEST));
        CommonUtils.assertTrue((nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedSeerDataAccessLink.getText()).contentEquals(SEERDataRejection_Constants.PLEASE_GO_TO));
        CommonUtils.assertTrue(( nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedNoteText.getText()).contentEquals(SEERDataRejection_Constants.NOTE));
        CommonUtils.assertTrue((  nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedYouCannotEditYourEmailText.getText()).contentEquals(SEERDataRejection_Constants.IF_YOUR_REQUEST_WAS_REJECTED));
        JavascriptUtils.drawRedBorder(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataRejectedEmailText);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }
}