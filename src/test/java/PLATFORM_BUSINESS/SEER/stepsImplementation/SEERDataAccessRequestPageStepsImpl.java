package PLATFORM_BUSINESS.SEER.stepsImplementation;

import PLATFORM_BUSINESS.SEER.constants.*;
import PLATFORM_BUSINESS.SEER.pages.NativeViewCustomersPage;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import org.testng.Assert;
import java.util.Iterator;
import java.util.Set;

public class SEERDataAccessRequestPageStepsImpl extends PageInitializer {

    public static String newEmailThankYou282 = "seerThankYou282" + CommonUtils.email;
    public static String newEmailThankYou283 = "seerThankYou283" + CommonUtils.email;
    public static String newEmailThankYou284 = "seerThankYou284" + CommonUtils.email;
    public static String newEmailThankYou285 = "seerThankYou285" + CommonUtils.email;
    public static String newEmailThankYou286 = "seerThankYou286" + CommonUtils.email;
    public static String newEmailThankYou399 = "seerThankYou399" + CommonUtils.email;
    public static String newEmailThankYou349 = "seerThankYou349" + CommonUtils.email;

    /**
     * Verifies the agreements on the SEER data access request page.
     * It checks if the treatment data limitations agreement, data use agreement certification, and best practice assurance
     * agreements are displayed correctly.
     */
    public static void verifyingAgreements() {
        CommonUtils.sleep(2000);
        String actualTreatmentDataLimitationsAgreementText = seerDataAccessRequestPage.seerDataAccessTreatmentDataLimitationsAgreement.getText();
        CommonUtils.assertEquals(actualTreatmentDataLimitationsAgreementText, DUA_Constants.SEER_ACKNOWLEDGMENT_OF_TREATMENT_DATA_LIMITATIONS);
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessTreatmentDataLimitationsAgreement);
        CucumberLogUtils.logScreenshot();
        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
        String actualDataUseAgreementCertificationText = seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText();
        CommonUtils.assertEquals(actualDataUseAgreementCertificationText, DUA_Constants.DATA_USE_AGREEMENT_CERTIFICATION);
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        String actualDataAccessBestPracticeAssuranceText = seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText.getText();
        CommonUtils.assertEquals(actualDataAccessBestPracticeAssuranceText, DUA_Constants.BEST_PRACTICE_ASSURANCE);
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the research plus user agreements.
     */
    public static void verifyingResearchPlusAgreements() {
        String actualTreatmentDataLimitationsAgreementText = seerDataAccessRequestPage.seerDataAccessTreatmentDataLimitationsAgreement.getText();
        CommonUtils.assertEquals(actualTreatmentDataLimitationsAgreementText, DUA_Constants.SEER_ACKNOWLEDGMENT_OF_TREATMENT_DATA_LIMITATIONS);
        CucumberLogUtils.logScreenshot();
        String actualFontSizeSeerAcknowledgmentOfTreatmentDataLimitationsHeading = seerDataAccessRequestPage.seerAcknowledgmentOfTreatmentDataLimitationsHeading.getCssValue("font-size");
        String actualFontWeightSeerAcknowledgmentOfTreatmentDataLimitationsHeading = seerDataAccessRequestPage.seerAcknowledgmentOfTreatmentDataLimitationsHeading.getCssValue("font-weight");
        String actualFontWeightSeerAcknowledgmentOfTreatmentDataLimitationsBody = seerDataAccessRequestPage.seerAcknowledgmentOfTreatmentDataLimitationsBody.getCssValue("font-weight");
        CommonUtils.assertTrue(!actualFontWeightSeerAcknowledgmentOfTreatmentDataLimitationsHeading.equals(actualFontWeightSeerAcknowledgmentOfTreatmentDataLimitationsBody));
        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
        String actualDataUseAgreementCertificationText = seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText();
        CommonUtils.assertEquals(actualDataUseAgreementCertificationText, DUA_Constants.DATA_USE_AGREEMENT_CERTIFICATION);
        CucumberLogUtils.logScreenshot();
        String actualFontSizeSeerResearchDataUseAgreementHeading = seerDataAccessRequestPage.seerResearchDataUseAgreementHeading.getCssValue("font-size");
        String actualFontWeightSeerResearchDataUseAgreementHeading = seerDataAccessRequestPage.seerResearchDataUseAgreementHeading.getCssValue("font-weight");
        String actualFontWeightSeerResearchDataUseAgreementBody = seerDataAccessRequestPage.seerResearchDataUseAgreementBody.getCssValue("font-weight");
        CommonUtils.assertTrue(!actualFontWeightSeerResearchDataUseAgreementHeading.equals(actualFontWeightSeerResearchDataUseAgreementBody));
        CommonUtils.assertTrue(actualFontSizeSeerAcknowledgmentOfTreatmentDataLimitationsHeading.equals(actualFontSizeSeerResearchDataUseAgreementHeading));
        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        String actualDataAccessBestPracticeAssuranceText = seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText.getText();
        CommonUtils.assertEquals(actualDataAccessBestPracticeAssuranceText, DUA_Constants.BEST_PRACTICE_ASSURANCE);
        CucumberLogUtils.logScreenshot();
        String actualFontSizeSeerBestPracticesAssuranceForSecuringNCISupportedRegistryDataHeading = seerDataAccessRequestPage.seerBestPracticesAssuranceForSecuringNCISupportedRegistryDataHeading.getCssValue("font-size");
        String actualFontWeightSeerBestPracticesAssuranceForSecuringNCISupportedRegistryDataHeading = seerDataAccessRequestPage.seerBestPracticesAssuranceForSecuringNCISupportedRegistryDataHeading.getCssValue("font-weight");
        String actualFontWeightSeerBestPracticesAssuranceForSecuringNCISupportedRegistryDataBody = seerDataAccessRequestPage.seerBestPracticesAssuranceForSecuringNCISupportedRegistryDataBody.getCssValue("font-weight");
        CommonUtils.assertTrue(!actualFontWeightSeerBestPracticesAssuranceForSecuringNCISupportedRegistryDataHeading.equals(actualFontWeightSeerBestPracticesAssuranceForSecuringNCISupportedRegistryDataBody));
        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessNCCRReasearchDataUseAgreementText);
        String actualSeerDataAccessNCCRReasearchDataUseAgreementText = seerDataAccessRequestPage.seerDataAccessNCCRReasearchDataUseAgreementText.getText();
        CommonUtils.assertEquals(actualSeerDataAccessNCCRReasearchDataUseAgreementText, DUA_Constants.NCCR_REASEARCH_DATA_USER_AGREEMENT);
        String actualFontSizeSeerNationalChildhoodCancerRegistryNCCRResearchDataUseAgreementHeading = seerDataAccessRequestPage.seerNationalChildhoodCancerRegistryNCCRResearchDataUseAgreementHeading.getCssValue("font-size");
        String actualFontWeightSeerNationalChildhoodCancerRegistryNCCRResearchDataUseAgreementHeading = seerDataAccessRequestPage.seerNationalChildhoodCancerRegistryNCCRResearchDataUseAgreementHeading.getCssValue("font-weight");
        String actualFontWeightSeerNationalChildhoodCancerRegistryNCCRResearchDataUseAgreementBody = seerDataAccessRequestPage.seerNationalChildhoodCancerRegistryNCCRResearchDataUseAgreementBody.getCssValue("font-weight");
        CommonUtils.assertTrue(!actualFontWeightSeerNationalChildhoodCancerRegistryNCCRResearchDataUseAgreementHeading.equals(actualFontWeightSeerNationalChildhoodCancerRegistryNCCRResearchDataUseAgreementBody));
        CommonUtils.assertTrue(actualFontSizeSeerBestPracticesAssuranceForSecuringNCISupportedRegistryDataHeading.equals(actualFontSizeSeerResearchDataUseAgreementHeading));
        CommonUtils.assertTrue(actualFontSizeSeerBestPracticesAssuranceForSecuringNCISupportedRegistryDataHeading.equals(actualFontSizeSeerNationalChildhoodCancerRegistryNCCRResearchDataUseAgreementHeading));
        CucumberLogUtils.logScreenshot();
    }

    /**
     * user enters the email address, and submits the form.
     */
    public static void enterEmailAddress283() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou283);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(seerLandingPage.registerForResearchDataButton);
        CommonUtils.sleep(1000);
    }

    /**
     * Enters the email address from the newEmailThankYou284 field into the email address field.
     */
    public static void enterEmailAddress284() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou284);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(seerLandingPage.registerForResearchDataButton);
        CommonUtils.sleep(1000);
    }

    /**
     * This method is used to enter an email address into the email address field and submit the form.
     */
    public static void enterEmailAddress285() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou285);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(seerLandingPage.registerForResearchDataButton);
        CommonUtils.sleep(1000);
    }

    /**
     * user enters a pre-defined email address,
     */
    public static void enterEmailAddress286() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou286);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(seerLandingPage.registerForResearchDataButton);
        CommonUtils.sleep(1000);
    }

    /**
     * Enters a predefined email address into the email address field.
     */
    public static void enterEmailAddress399() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou399);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(seerLandingPage.registerForResearchDataButton);
        CommonUtils.sleep(1000);
    }

    /**
     * Scrolls into view and enters an email address into the email address field,
     * then submits the form.
     */
    public static void enterEmailAddress349() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou349);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(seerLandingPage.registerForResearchDataButton);
        CommonUtils.sleep(1000);
    }

    /**
     * Verifies that the specified breadcrumbs are displayed on the SEER landing page.
     *
     * @param homeBreadcrumb                      The expected home breadcrumb.
     * @param dataAndSoftwareBreadcrumb          The expected data and software breadcrumb.
     * @param incidenceDatabaseBreadcrumb
     */
    public static void theFollowingBreadcrumbsAreDisplayed(String homeBreadcrumb, String dataAndSoftwareBreadcrumb,
                                                           String incidenceDatabaseBreadcrumb, String requestSeerIncidenceDataBreadcrumb,
                                                           String submissionConfirmationBreadcrumb) {
        CommonUtils.assertEquals(homeBreadcrumb, seerLandingPage.seerHomeBreadcrumb.getText());
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerHomeBreadcrumb);
        CommonUtils.assertEquals(dataAndSoftwareBreadcrumb, seerLandingPage.seerDataAndSoftwareBreadcrumb.getText());
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerDataAndSoftwareBreadcrumb);
        CommonUtils.assertEquals(incidenceDatabaseBreadcrumb, seerLandingPage.seerIncidenceDatabaseBreadcrumb.getText());
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
        CommonUtils.assertEquals(requestSeerIncidenceDataBreadcrumb,
                seerLandingPage.seerRequestSeerIncidenceDataBreadcrumb.getText());
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerRequestSeerIncidenceDataBreadcrumb);
        CommonUtils.assertEquals(submissionConfirmationBreadcrumb,
                seerLandingPage.seerSubmissionConfirmationBreadcrumb.getText());
        JavascriptUtils.drawBlueBorder(seerLandingPage.seerSubmissionConfirmationBreadcrumb);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Submits the registration form by clicking on the submit button after waiting for it to be visible.
     */
    public static void submitsTheRegistrationForm() {
        JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerUserRegistrationSubmitButton);
        CommonUtils.clickOnElement(seerUserRegistrationPage.seerUserRegistrationSubmitButton);
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Enters the given country name and selects the corresponding option for the country field.
     *
     * @param USA The name of the country to be entered and selected.
     */
    public static void enteringAndSelectingForCountryField(String USA) {
        seerUserRegistrationPage.seerUserRegistrationCountryField.click();
        seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(USA);
        seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * The method represents the user's inability to submit the registration form because the state
     * and zip code fields are required.
     */
    public static void theUserIsNotAbleToSubmitTheRegistrationFormBecauseTheStateAndZipCodeFieldsAreRequired() {
        String seerRegistrationPage = WebDriverUtils.webDriver.getTitle();
        CommonUtils.assertTrue(seerRegistrationPage.contentEquals(Registration_Constants.SEER_USER_REGISTRATION_ODS_DATA_ACCESS_REQUEST));
        Assert.assertTrue(seerUserRegistrationPage.seerUserRegistrationStateStarSign.isDisplayed(), Registration_Constants.VERIFYING_STATE_FIELD_IS_NOT_REQUIRED_TEXT);
        Assert.assertTrue(seerUserRegistrationPage.seerUserRegistrationZipcodeStarSign.isDisplayed(), Registration_Constants.VERIFYING_ZIP_CODE_FIELD_IS_NOT_REQUIRED_TEXT);
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationStateStarSign);
        CommonUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationZipcodeStarSign);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * The user lands on the page after completing the registration process.
     *
     * @param registrationIsCompleteText The expected registration completion header text.
     */
    public static void theUserLandsOnThePage(String registrationIsCompleteText) {
        CommonUtils.sleep(2000);
        String seerRegistrationIsCompletePage = WebDriverUtils.webDriver.getTitle();
        CommonUtils.assertEquals(Registration_Constants.SEER_DATA_CONFIRMATION_ODS_DATA_ACCESS_REQUEST, seerRegistrationIsCompletePage);
        CommonUtils.assertEquals(registrationIsCompleteText,
                seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that the page header displays as expected.
     *
     * @param seerIncidenceDatabasDetailsText The expected content of the page header.
     */
    public static void thePageHeaderDisplaysAs(String seerIncidenceDatabasDetailsText) {
        CommonUtils.assertEquals(seerIncidenceDatabasDetailsText,
                seerUserRegistrationPage.seerUserRegistrationIncidenceDatabaseDetailsLink.getText());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Displays the following text on the page:
     *
     * @param registrationIsCompleteFullText The text to be displayed.
     */
    public static void theFollowingTextAlsoDisplays(String registrationIsCompleteFullText) {
        CommonUtils.assertEquals(registrationIsCompleteFullText,
                seerUserRegistrationPage.seerUserRegistrationConfirmationText.getText());
        CommonUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationConfirmationText);
    }

    /**
     * This method verifies that the "Back to SEER Database Details" button is displayed correctly.
     */
    public static void theBackToSEERDatabaseDetailsButtonDisplays() {
        CommonUtils.assertEquals(Registration_Constants.BACK_TO_SEER_DATABASE_DETAILS_BUTTON_TEXT,
                seerUserRegistrationPage.seerUserRegistrationBackToSeerDatabaseDetailsButton.getText());
        CommonUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationBackToSeerDatabaseDetailsButton);
    }

    /**
     * The method verifies that the specified SEER information text displays on the bottom of the page.
     *
     * @param seerIsSupportedByTheSurveillanceResearchProgramText The expected SEER information text.
     */
    public static void theFollowingSEERInformationTextDisplaysOnTheBottomOfThePage(
            String seerIsSupportedByTheSurveillanceResearchProgramText) {
        CommonUtils.assertEquals(seerIsSupportedByTheSurveillanceResearchProgramText,
                seerUserRegistrationPage.seerUserRegistrationSeerIsSupportedByTheSurveillanceResearchProgramText
                        .getText());
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationSeerIsSupportedByTheSurveillanceResearchProgramText);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies the user's email address by clicking on the email verification link.
     *
     * @ if there is an error during the verification process.
     */
    public static void userVerifiesEmailAddressByClickingOnTheEmailVerificationLinkThatIsSentToTheUserAfterSubmittingASEERUserRegistrationForm() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        /** Waiting for email to be sent and searchable */
        CommonUtils.sleep(50000);
        ServiceNow_Common_Methods.filterNavigatorSearch("mailbox");
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavSentUnderMailBoxUrl());
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, newEmailThankYou282);
        CommonUtils.sleep(2000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewCreatedButton);
        CommonUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon.click();
        CommonUtils.clickOnElement(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
        CommonUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText()
                .contentEquals(SEERDataAccessRequest_Constants.SEER_INCIDENT_DATA_VERIFY_EMAIL_ADDRESS_TEXT));
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailHelloNameText.getText()
                .contentEquals("Hello " + Registration_Constants.NI_FIRST_NAME + ","));
        CommonUtils.waitForVisibility(nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink);
        nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink.click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.switchToDefaultContent();
        CommonUtils.sleep(1000);
    }

    /**
     * Marks the customer account type as public in the native view.
     *
     * @param publicAccount The account type to be marked as public.
     */
    public static void customerAccountTypeWillBeMarkedAsPublicInNativeView(String publicAccount) {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        /** Waiting for email to be sent and searchable */
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavCustomerUnderSEERUrl());
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        CommonUtils.selectDropDownValue("Last name", nativeViewSentViewPage.nativeViewSearchDropDown);
        CommonUtils.sleep(1000);
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, SEERDataRejection_Constants.LAST_NAME + "aa");
        CommonUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        NativeViewCustomersPage.seerCustomerLocatorBylastNameInfoButton(SEERDataRejection_Constants.LAST_NAME  + "aa").click();
        CommonUtils.sleep(1000);
        nativeViewCustomersPage.nativeViewSeerCustomerAccountTypeReadOnlyField.getText();
        CommonUtils.assertTrue(nativeViewCustomersPage.nativeViewSeerCustomerAccountTypeReadOnlyField.getAttribute("value").contentEquals(publicAccount));
        JavascriptUtils.drawBlueBorder(nativeViewCustomersPage.nativeViewSeerCustomerAccountTypeReadOnlyField);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * This method represents the workflow for a new user who does not have an active SEER research database access request.
     */
    public static void aNewUserWhoDoesNotHaveAnActiveSEERResearchDatabaseAccessRequest() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        /** Waiting for email to be sent and searchable */
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavViewAccessRequestUnderSEERUrl());
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(2000);
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, SEERDataRejection_Constants.FIRST_NAME + " " + SEERDataRejection_Constants.LAST_NAME + "aa");
        CommonUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        CommonUtils.sleep(1000);
        CommonUtils.assertEqualsWithMessage(nativeViewAccessRequestPage.nativeViewAccessRequestEmailsNoRecordsToDisplayText.getText(), SEERNativeView_Constants.NATIVE_VIEW_NO_RECORD_TO_DISPLAY_TEXT, "Verify there are no records to display created by Automation");
        JavascriptUtils.drawBlueBorder(nativeViewAccessRequestPage.nativeViewAccessRequestEmailsNoRecordsToDisplayText);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * The {@code theUserIsDirectedToThePage} method is used to verify that the user is directed to the expected page.
     *
     * @param landingPageHeaderText The expected header text of the landing page.
     */
    public static void theUserIsDirectedToThePage(String landingPageHeaderText) {
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        String landingPageTitle = WebDriverUtils.webDriver.getTitle();
        CommonUtils.assertEquals(Registration_Constants.SEER_DATA_ACCESS_CONFIRMATION_ODS_DATA_ACCESS_REQUEST, landingPageTitle );
                CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessRequestHeader);
        CommonUtils.assertTrue(
                seerDataAccessRequestPage.seerDataAccessRequestHeader.getText().contentEquals(landingPageHeaderText));
    }

    /**
     * Verifies that the field on the SEER data access request page contains the name of the requestor in read-only format.
     *
     * @param requestedFor The expected name of the requestor.
     */
    public static void theFieldContainsTheNameOfTheRequestorInReadOnlyFormat(String requestedFor) {
        CommonUtils.assertTrue(seerDataAccessRequestPage.requestedForText.getText().contentEquals(requestedFor));
        CommonUtils.assertEquals(Registration_Constants.NI_FIRST_NAME + " " + Registration_Constants.NI_MIDDLE_NAME + " " + Registration_Constants.NI_LAST_NAME,
                seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("value"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("disabled")
                .equals("true"));
    }

    /**
     * Verifies that the specified field on the SEER data access request page displays in read-only format.
     *
     * @param databaseType          The expected database type.
     * @param seerResearchDatabase  The expected SEER research database name.
     */
    public static void theFieldDisplaysWithInReadOnlyFormat(String databaseType, String seerResearchDatabase) {
        CommonUtils.assertTrue(
                seerDataAccessRequestPage.seerDataAccessDatabaseTypeText.getText().contentEquals(databaseType));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getText()
                .contains(seerResearchDatabase));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getAttribute("disabled")
                .equals("true"));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * The user can select a general purpose for using the data.
     * This method verifies that the general purpose dropdown is displayed, selects the "Administrative" option,
     */
    public static void theUserCanSelectAGeneralPurposeForUsingTheData() {
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeUsingTheDataText
                .getText().contentEquals(SEERDataAccessRequest_Constants.WHAT_IS_THE_GENERAL_PURPOSE_TEXT));
        CommonUtils.selectDropDownValue("Administrative",
                seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies that the textbox for entering initials displays with the user's initials in read-only mode.
     *
     * @param IUnderstandTheLimitationsOfTreatmentData The user's initials for the 'I Understand the Limitations of Treatment Data' field.
     */
    public static void beforeEnteringInitialsForTheTextBoxForInitialsIsDisplaysWithTheUsersInitialsInReadOnlyMode(String IUnderstandTheLimitationsOfTreatmentData) {
        JavascriptUtils.scrollIntoView(
                seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
        CommonUtils.assertTrue(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfieldHeader.getText()
                .contentEquals(IUnderstandTheLimitationsOfTreatmentData));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitialsText.getText()
                .contentEquals("Initials"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield.getAttribute("disabled")
                .equals("true"));
    }

    /**
     * Waits for the visibility of the "I Understand the Limitations of Treatment Data" content text on the SEER data access request page.
     * Verifies that the content text matches the expected text.
     */
    public static void theIUnderstandTheLimitationsOfTreatmentDataTextAgreementDisplayed() {
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph);
        CommonUtils.assertEquals(SEERDataAccessRequest_Constants.I_UNDERSTAND_THE_LIMITATIONS_OF_TREATEMENT_DATA,seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph.getText());
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies that the textbox for entering initials displays with the user's initials in read-only mode.
     *
     * @param dataUseAgreementCertification The user's initials for the 'Data Use Agreement Certification' field.
     */
    public static void beforeEnteringInitialsForTheInitialsTextBoxDisplaysWithTheUsersInitialsInReadOnlyMode(
            String dataUseAgreementCertification) {
        JavascriptUtils.scrollIntoView(
                seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationHeaderText.getText()
                .contentEquals(dataUseAgreementCertification));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials.getAttribute("disabled")
                .equals("true"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.getAttribute("disabled")
                .equals("true"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials
                .getAttribute("disabled").equals("true"));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Waits for the visibility of the data use agreement certification text on the SEER data access request page.
     * Verifies that the displayed text matches the expected text.
     */
    public static void theDataUseAgreementCertificationTextAgreementDisplayed() {
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
        CommonUtils.assertEquals(SEERDataAccessRequest_Constants.DATA_USE_AGREE_EMT_CERTIFFICATION,seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText());
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies that the user's initials are displayed in read-only format before entering them.
     *
     * @param bestPracticeAssurance The best practice assurance text expected to be displayed.
     */
    public static void beforeEnteringInitialsForTheUsersInitialsDisplayInReadOnlyFormat(String bestPracticeAssurance) {
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceHeaderText.getText().contentEquals(bestPracticeAssurance));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitialsText.getText().contentEquals("Initials"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.getAttribute("disabled").equals("true"));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Waits for the visibility of the best practice assurance text on the SEER data access request page.
     * Verifies that the displayed text matches the expected text.
     */
    public static void theBestPracticeAssuranceTextDisplayed() {
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        CommonUtils.assertEquals(SEERDataAccessRequest_Constants.BEAT_PRACTICE_ASSURANCE,seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText.getText());
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method scrolls down each agreement on the page.
     */
    public static void whenTheUserScrollsDownEachAgreement() {
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph, 8000);
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText, 8000);
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText, 8000);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Scroll into view the element for entering the user's initials.
     * Enter the initials of the user's first and last name into the designated fields.
     */
    public static void theUserIsAbleToEnterIntials() {
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield);
        seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield.sendKeys(Registration_Constants.NI_FIRST_NAME.charAt(0) + "" + Registration_Constants.NI_LAST_NAME.charAt(0));
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield);
        seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials.sendKeys(Registration_Constants.NI_FIRST_NAME.charAt(0) + "" + Registration_Constants.NI_LAST_NAME.charAt(0));
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials);
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials);
        seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.sendKeys(Registration_Constants.NI_FIRST_NAME.charAt(0) + "" + Registration_Constants.NI_LAST_NAME.charAt(0));
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials);
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies if the given SEER information text is displayed at the bottom of the page.
     *
     * @param expectedText the expected SEER information text
     */
    public static void seerInformationIsDisplayedOnTheBottomOfThePageAsFollows(String expectedText) {
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessSEERIsSupportedByTheBottomText.getText().contentEquals(expectedText));
        CommonUtils.sleep(1000);
    }

    /**
     * After entering the required information, the user is able to successfully submit the SEER Data Access Request Form.
     */
    public static void afterEnteringRequiredInformationTheUserIsAbleToSuccessfullySubmitTheSEERDataAccessRequestForm() {
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessSubmitButton);
        seerDataAccessRequestPage.seerDataAccessSubmitButton.click();
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        String seerRegistrationIsCompletePage = WebDriverUtils.webDriver.getTitle();
        CommonUtils.assertEquals(Registration_Constants.SEER_DATA_REQUEST_CONFIRMATION_ODS_DATA_ACCESS_REQUEST, seerRegistrationIsCompletePage);
        CommonUtils.assertEquals(Registration_Constants.THANK_YOU_DATA_ACCESS_REQUEST_IS_COMPLETE_MESSAGE, seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader.getText());
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies whether the breadcrumb displays the provided link for the Seer Incidence Database.
     *
     * @param seerIncidenceDatabaseLink the expected link to be displayed on the breadcrumb
     */
    public static void theBreadCrumbDisplays(String seerIncidenceDatabaseLink) {
        CommonUtils.waitForVisibility(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
        CommonUtils.assertEquals(seerIncidenceDatabaseLink, seerLandingPage.seerIncidenceDatabaseBreadcrumb.getText());
    }

    /**
     *  user clicks on the 'Seer Incidence Database' breadcrumb.
     * @param seerIncidenceDatabaseUrl the expected URL of the Seer Incidence Database
     */
    public static void whenClickingUserIsDirectedTo(String seerIncidenceDatabaseUrl) {
        CommonUtils.waitForVisibility(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
        CommonUtils.clickOnElement(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        String actualSeerCancerGovDataUrl = WebDriverUtils.webDriver.getCurrentUrl();
        CommonUtils.assertEquals(seerIncidenceDatabaseUrl, actualSeerCancerGovDataUrl);
        CommonUtils.sleep(1000);
        WebDriverUtils.webDriver.navigate().back();
    }

    /**
     * This method is used to simulate the user entering an email address for a non-institutional account.
     *
     */
    public static void theUserEntersAnEmailAddressForANonInstitutionalAccount() {
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, CommonUtils.email);
        CommonUtils.clickOnElement(seerLandingPage.registerForResearchDataButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies if the user is on the specified page.
     *
     * @param seerUserRegistrationHeader the expected registration header text on the page
     */
    public static void theUserIsOnThePage(String seerUserRegistrationHeader) {
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationHeaderText);
        CommonUtils.assertEquals(seerUserRegistrationHeader,
                seerUserRegistrationPage.seerUserRegistrationHeaderText.getText());
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationHeaderText);
    }

    /**
     * Checks if the user is directed to the registration page
     *
     * @param seerRegistrationIsCompleteText the expected text that indicates the user registration is complete
     */
    public static void userIsDirectedToTheRegistrationPage(String seerRegistrationIsCompleteText) {
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader);
        CommonUtils.assertEquals(seerRegistrationIsCompleteText,
                seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
    }

    /**
     * This method is used to allow the user to confirm their email address
     * by clicking on the email verification link sent to the user's email address.
     *
     * @ if an error occurs during the testing process.
     */
        public static void userConfirmsTheirEmailAddressByClickingOnTheEmailVerificationLinkSentToTheUsersEmailAddress()
             {
            ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        /** Waiting for email to be sent and searchable */
        CommonUtils.sleep(70000);
        ServiceNow_Common_Methods.filterNavigatorSearch("mailbox");
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavSentUnderMailBoxUrl());
        CommonUtils.sleep(3000);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.sleep(1000);
        CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, newEmailThankYou285);
        CommonUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewCreatedButton);
        CommonUtils.sleep(2000);
        nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon.click();
        CommonUtils.clickOnElement(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CommonUtils.sleep(2000);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
        CommonUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText().contentEquals(SEERDataAccessRequest_Constants.SEER_INCIDENT_DATA_VERIFY_EMAIL_ADDRESS_TEXT));
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailHelloNameText.getText().contains(Registration_Constants.FIRST_NAME));
        CommonUtils.sleep(2000);
        String mainPageHandle = WebDriverUtils.webDriver.getWindowHandle();
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink);
        CommonUtils.sleep(2000);
        Set<String> allWindows = WebDriverUtils.webDriver.getWindowHandles();
        Iterator<String> it = allWindows.iterator();
        while (it.hasNext()) {
            String childHandle = it.next();
            if (!childHandle.equals(mainPageHandle)) {
                WebDriverUtils.webDriver.switchTo().window(childHandle);
            }
        }
    }

    /**
     * The `theUserIsDirectedToPage` method is used to verify if the user is directed to the specified page
     * by checking the header text on the page.
     *
     * @param seerDataAccessRequestPageText The expected header text on the page that the user should be directed to.
     */
    public static void theUserIsDirectedToPage(String seerDataAccessRequestPageText) {
        CommonUtils.sleep(2000);
        CommonUtils.assertEquals(seerDataAccessRequestPageText, seerDataAccessRequestPage.seerDataAccessRequestHeader.getText());
    }

    /**
     * This method ensures that the user selects a general purpose for using the data.
     */
    public static void theUserHasToSelectAGeneralPurposeForUsingTheData() {
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("disabled").equals("true"));
        CommonUtils.sleep(2000);
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getAttribute("disabled").equals("true"));
        CommonUtils.selectDropDownValue("Administrative", seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sleep(2000);
    }

    /**
     * This method is used to agree to the data use agreement
     * certification and best practice assurance by typing initials.
     * It scrolls up within the element, fills in the initials field,
     */
    public static void alsoHasToAgreeByTypingInitialsToTheDataUseAgreementCertificationAndBestPracticeAssurance() {
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph, 8000);
        CommonUtils.sendKeys(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield, Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
        CommonUtils.sleep(2000);
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText, 8000);
        CommonUtils.sendKeys(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials, Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
        CommonUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText, 8000);
        seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.sendKeys(Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
        CommonUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * The method verifies if the page displays the expected header.
     *
     * @param yourDataAccessRequestIsCompleteHeader the expected header text
     */
    public static void thePageDisplays(String yourDataAccessRequestIsCompleteHeader) {
        CommonUtils.sleep(500);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertEquals(yourDataAccessRequestIsCompleteHeader,
                seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader.getText());
    }
}