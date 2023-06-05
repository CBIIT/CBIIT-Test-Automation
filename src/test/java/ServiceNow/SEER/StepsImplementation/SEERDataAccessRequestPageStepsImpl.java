package ServiceNow.SEER.StepsImplementation;

import ServiceNow.SEER.Constants.*;
import ServiceNow.SEER.Pages.NativeViewCustomersPage;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import appsCommon.PageInitializer;
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

    public static void verifyingAgreements() {
        String actualTreatmentDataLimitationsAgreementText = seerDataAccessRequestPage.seerDataAccessTreatmentDataLimitationsAgreement.getText();
        CommonUtils.assertEquals(actualTreatmentDataLimitationsAgreementText, DUA_Constants.SEER_ACKNOWLEDGMENT_OF_TREATMENT_DATA_LIMITATIONS);
        CucumberLogUtils.logScreenShot();
        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
        String actualDataUseAgreementCertificationText = seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText();
        CommonUtils.assertEquals(actualDataUseAgreementCertificationText, DUA_Constants.DATA_USE_AGREEMENT_CERTIFICATION);
        CucumberLogUtils.logScreenShot();
        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        String actualDataAccessBestPracticeAssuranceText = seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText.getText();
        CommonUtils.assertEquals(actualDataAccessBestPracticeAssuranceText, DUA_Constants.BEST_PRACTICE_ASSURANCE);
        CucumberLogUtils.logScreenShot();
    }

    public static void verifyingResearchPlusAgreements() {
        String actualTreatmentDataLimitationsAgreementText = seerDataAccessRequestPage.seerDataAccessTreatmentDataLimitationsAgreement.getText();
        CommonUtils.assertEquals(actualTreatmentDataLimitationsAgreementText, DUA_Constants.SEER_ACKNOWLEDGMENT_OF_TREATMENT_DATA_LIMITATIONS);
        CucumberLogUtils.logScreenShot();
        String actualFontSizeSeerAcknowledgmentOfTreatmentDataLimitationsHeading = seerDataAccessRequestPage.seerAcknowledgmentOfTreatmentDataLimitationsHeading.getCssValue("font-size");
        String actualFontWeightSeerAcknowledgmentOfTreatmentDataLimitationsHeading = seerDataAccessRequestPage.seerAcknowledgmentOfTreatmentDataLimitationsHeading.getCssValue("font-weight");
        String actualFontWeightSeerAcknowledgmentOfTreatmentDataLimitationsBody = seerDataAccessRequestPage.seerAcknowledgmentOfTreatmentDataLimitationsBody.getCssValue("font-weight");
        CommonUtils.assertTrue(!actualFontWeightSeerAcknowledgmentOfTreatmentDataLimitationsHeading.equals(actualFontWeightSeerAcknowledgmentOfTreatmentDataLimitationsBody));
        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
        String actualDataUseAgreementCertificationText = seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText();
        CommonUtils.assertEquals(actualDataUseAgreementCertificationText, DUA_Constants.DATA_USE_AGREEMENT_CERTIFICATION);
        CucumberLogUtils.logScreenShot();
        String actualFontSizeSeerResearchDataUseAgreementHeading = seerDataAccessRequestPage.seerResearchDataUseAgreementHeading.getCssValue("font-size");
        String actualFontWeightSeerResearchDataUseAgreementHeading = seerDataAccessRequestPage.seerResearchDataUseAgreementHeading.getCssValue("font-weight");
        String actualFontWeightSeerResearchDataUseAgreementBody = seerDataAccessRequestPage.seerResearchDataUseAgreementBody.getCssValue("font-weight");
        CommonUtils.assertTrue(!actualFontWeightSeerResearchDataUseAgreementHeading.equals(actualFontWeightSeerResearchDataUseAgreementBody));
        CommonUtils.assertTrue(actualFontSizeSeerAcknowledgmentOfTreatmentDataLimitationsHeading.equals(actualFontSizeSeerResearchDataUseAgreementHeading));
        CommonUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        String actualDataAccessBestPracticeAssuranceText = seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText.getText();
        CommonUtils.assertEquals(actualDataAccessBestPracticeAssuranceText, DUA_Constants.BEST_PRACTICE_ASSURANCE);
        CucumberLogUtils.logScreenShot();
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
        CucumberLogUtils.logScreenShot();
    }

    public static void enterEmailAddress283() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou283);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(seerLandingPage.registerForResearchDataButton);
        MiscUtils.sleep(1000);
    }

    public static void enterEmailAddress284() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou284);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(seerLandingPage.registerForResearchDataButton);
        MiscUtils.sleep(1000);
    }

    public static void enterEmailAddress285() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou285);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(seerLandingPage.registerForResearchDataButton);
        MiscUtils.sleep(1000);
    }

    public static void enterEmailAddress286() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou286);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(seerLandingPage.registerForResearchDataButton);
        MiscUtils.sleep(1000);
    }

    public static void enterEmailAddress399() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou399);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(seerLandingPage.registerForResearchDataButton);
        MiscUtils.sleep(1000);
    }

    public static void enterEmailAddress349() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou349);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(seerLandingPage.registerForResearchDataButton);
        MiscUtils.sleep(1000);
    }

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
        CucumberLogUtils.logScreenShot();
    }

    public static void submitsTheRegistrationForm() {
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationSubmitButton);
        CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationSubmitButton);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void enteringAndSelectingForCountryField(String USA) {
        seerUserRegistrationPage.seerUserRegistrationCountryField.click();
        seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(USA);
        seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserIsNotAbleToSubmitTheRegistrationFormBecauseTheStateAndZipCodeFieldsAreRequired() {
        String seerRegistrationPage = WebDriverUtils.getWebDriver().getTitle();
        CommonUtils.assertTrue(seerRegistrationPage.contentEquals(Registration_Constants.SEER_USER_REGISTRATION_ODS_DATA_ACCESS_REQUEST));
        org.junit.Assert.assertTrue(Registration_Constants.VERIFYING_STATE_FIELD_IS_REQUIRED_TEXT,
                seerUserRegistrationPage.seerUserRegistrationStateStarSign.isDisplayed());
        org.junit.Assert.assertTrue(Registration_Constants.VERIFYING_ZIP_CODE_FIELD_IS_REQUIRED_TEXT,
                seerUserRegistrationPage.seerUserRegistrationZipcodeStarSign.isDisplayed());
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationStateStarSign);
        MiscUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationZipcodeStarSign);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserLandsOnThePage(String registrationIsCompleteText) {
        MiscUtils.sleep(2000);
        String seerRegistrationIsCompletePage = WebDriverUtils.getWebDriver().getTitle();
        CommonUtils.assertEquals(Registration_Constants.SEER_DATA_CONFIRMATION_ODS_DATA_ACCESS_REQUEST, seerRegistrationIsCompletePage);
        CommonUtils.assertEquals(registrationIsCompleteText,
                seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
        CucumberLogUtils.logScreenShot();
    }

    public static void thePageHeaderDisplaysAs(String seerIncidenceDatabasDetailsText) {
        CommonUtils.assertEquals(seerIncidenceDatabasDetailsText,
                seerUserRegistrationPage.seerUserRegistrationIncidenceDatabaseDetailsLink.getText());
        CucumberLogUtils.logScreenShot();
    }

    public static void theFollowingTextAlsoDisplays(String registrationIsCompleteFullText) {
        CommonUtils.assertEquals(registrationIsCompleteFullText,
                seerUserRegistrationPage.seerUserRegistrationConfirmationText.getText());
        MiscUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationConfirmationText);
    }

    public static void theBackToSEERDatabaseDetailsButtonDisplays() {
        CommonUtils.assertEquals(Registration_Constants.BACK_TO_SEER_DATABASE_DETAILS_BUTTON_TEXT,
                seerUserRegistrationPage.seerUserRegistrationBackToSeerDatabaseDetailsButton.getText());
        MiscUtils.sleep(1000);
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationBackToSeerDatabaseDetailsButton);
    }

    public static void theFollowingSEERInformationTextDisplaysOnTheBottomOfThePage(
            String seerIsSupportedByTheSurveillanceResearchProgramText) {
        CommonUtils.assertEquals(seerIsSupportedByTheSurveillanceResearchProgramText,
                seerUserRegistrationPage.seerUserRegistrationSeerIsSupportedByTheSurveillanceResearchProgramText
                        .getText());
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationSeerIsSupportedByTheSurveillanceResearchProgramText);
        CucumberLogUtils.logScreenShot();
    }

    public static void userVerifiesEmailAddressByClickingOnTheEmailVerificationLinkThatIsSentToTheUserAfterSubmittingASEERUserRegistrationForm()
            throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        /** Waiting for email to be sent and searchable */
        MiscUtils.sleep(50000);
        nativeViewEnrollementsPage.filterNavigator.sendKeys("mailbox");
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewmailboxSentLink);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewmailboxSentLink);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewFrame);
        MiscUtils.sleep(1000);
        CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, newEmailThankYou282);
        MiscUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewCreatedButton);
        MiscUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon.click();
        CommonUtils.clickOnElement(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        MiscUtils.sleep(2000);
        CommonUtils.click(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText()
                .contentEquals(SEERDataAccessRequest_Constants.SEER_INCIDENT_DATA_VERIFY_EMAIL_ADDRESS_TEXT));
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailHelloNameText.getText()
                .contentEquals("Hello " + Registration_Constants.NI_FIRST_NAME + ","));
        CommonUtils.waitForVisibility(nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink);
        nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        CommonUtils.switchToDefaultContent();
        MiscUtils.sleep(1000);
    }

    public static void nativeViewLogOut(){
        CommonUtils.switchToDefaultContent();
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccountButton.click();
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewLogOutButton.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void customerAccountTypeWillBeMarkedAsPublicInNativeView(String publicAccount) {
        nativeViewLoginImpl.sideDoorAccountLogin();
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewHomeButton.getText()
                .contentEquals("Home"));
        /** Waiting for email to be sent and searchable */
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        nativeViewEnrollementsPage.filterNavigator.sendKeys("SEER");
        MiscUtils.sleep(1000);
        nativeViewEnrollementsPage.filterNavigator.sendKeys(Keys.ENTER);
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewFrame);
        MiscUtils.sleep(1000);
        CommonUtils.selectDropDownValue("Last name", nativeViewSentViewPage.nativeViewSearchDropDown);
        MiscUtils.sleep(1000);
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, SEERDataRejection_Constants.LAST_NAME + "aa");
        MiscUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        NativeViewCustomersPage.seerCustomerLocatorBylastNameInfoButton(SEERDataRejection_Constants.LAST_NAME  + "aa").click();
        MiscUtils.sleep(1000);
        nativeViewCustomersPage.nativeViewSeerCustomerAccountTypeReadOnlyField.getText();
        CommonUtils.assertTrue(nativeViewCustomersPage.nativeViewSeerCustomerAccountTypeReadOnlyField.getAttribute("value").contentEquals(publicAccount));
        JavascriptUtils.drawBlueBorder(nativeViewCustomersPage.nativeViewSeerCustomerAccountTypeReadOnlyField);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void aNewUserWhoDoesNotHaveAnActiveSEERResearchDatabaseAccessRequest() {
        nativeViewLoginImpl.sideDoorAccountLogin();
        CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewHomeButton.getText()
                .contentEquals("Home"));
        /** Waiting for email to be sent and searchable */
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        nativeViewEnrollementsPage.filterNavigator.sendKeys("SEER");
        MiscUtils.sleep(1000);
        SEERDataRejectionStepImpl.aSEERODSAdminNavigatesTo("","Access Requests");
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, SEERDataRejection_Constants.FIRST_NAME + " " + SEERDataRejection_Constants.LAST_NAME + "aa");
        MiscUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        MiscUtils.sleep(1000);
        CommonUtils.assertTrue(nativeViewAccessRequestPage.nativeViewAccessRequestNoRecordsToDisplayText.getText().contentEquals(SEERNativeView_Constants.NATIVE_VIEW_NO_RECORD_TO_DISPLAY_TEXT));
        JavascriptUtils.drawBlueBorder(nativeViewAccessRequestPage.nativeViewAccessRequestNoRecordsToDisplayText);
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserIsDirectedToThePage(String landingPageHeaderText) {
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
        String landingPageTitle = WebDriverUtils.getWebDriver().getTitle();
        CommonUtils.assertEquals(Registration_Constants.SEER_DATA_ACCESS_CONFIRMATION_ODS_DATA_ACCESS_REQUEST, landingPageTitle );
                CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessRequestHeader);
        CommonUtils.assertTrue(
                seerDataAccessRequestPage.seerDataAccessRequestHeader.getText().contentEquals(landingPageHeaderText));
    }

    public static void theFieldContainsTheNameOfTheRequestorInReadOnlyFormat(String requestedFor) {
        CommonUtils.assertTrue(seerDataAccessRequestPage.requestedForText.getText().contentEquals(requestedFor));
        CommonUtils.assertEquals(Registration_Constants.NI_FIRST_NAME + " " + Registration_Constants.NI_MIDDLE_NAME + " " + Registration_Constants.NI_LAST_NAME,
                seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("value"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("disabled")
                .equals("true"));
    }

    public static void theFieldDisplaysWithInReadOnlyFormat(String databaseType, String seerResearchDatabase) {
        CommonUtils.assertTrue(
                seerDataAccessRequestPage.seerDataAccessDatabaseTypeText.getText().contentEquals(databaseType));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getText()
                .contains(seerResearchDatabase));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getAttribute("disabled")
                .equals("true"));
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserCanSelectAGeneralPurposeForUsingTheData() {
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeUsingTheDataText
                .getText().contentEquals(SEERDataAccessRequest_Constants.WHAT_IS_THE_GENERAL_PURPOSE_TEXT));
        CommonUtils.selectDropDownValue("Administrative",
                seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

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

    public static void theIUnderstandTheLimitationsOfTreatmentDataTextAgreementDisplayed() {
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph);
        CommonUtils.assertEquals(SEERDataAccessRequest_Constants.I_UNDERSTAND_THE_LIMITATIONS_OF_TREATEMENT_DATA,seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph.getText());
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

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
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void theDataUseAgreementCertificationTextAgreementDisplayed() {
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
        CommonUtils.assertEquals(SEERDataAccessRequest_Constants.DATA_USE_AGREE_EMT_CERTIFFICATION,seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText());
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void beforeEnteringInitialsForTheUsersInitialsDisplayInReadOnlyFormat(
            String bestPracticeAssurance) {
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceHeaderText.getText()
                .contentEquals(bestPracticeAssurance));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitialsText.getText()
                .contentEquals("Initials"));
        Assert.assertNotNull("Verifying that the Initials field's value is null",
                seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.getAttribute("value")
                        .equals("false"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.getAttribute("disabled")
                .equals("true"));
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void theBestPracticeAssuranceTextDisplayed() {
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        CommonUtils.assertEquals(SEERDataAccessRequest_Constants.BEAT_PRACTICE_ASSURANCE,seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText.getText());
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void whenTheUserScrollsDownEachAgreement() {
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph,
                8000);
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText,
                8000);
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText, 8000);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserIsAbleToEnterIntials() {
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield);
        seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield.sendKeys(Registration_Constants.NI_FIRST_NAME.charAt(0) + "" + Registration_Constants.NI_LAST_NAME.charAt(0));
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield);
        seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials.sendKeys(Registration_Constants.NI_FIRST_NAME.charAt(0) + "" + Registration_Constants.NI_LAST_NAME.charAt(0));
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials);
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials);
        seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.sendKeys(Registration_Constants.NI_FIRST_NAME.charAt(0) + "" + Registration_Constants.NI_LAST_NAME.charAt(0));
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials);
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenShot();
    }

    public static void seerInformationIsDisplayedOnTheBottomOfThePageAsFollows(String expectedText) {
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessSEERIsSupportedByTheBottomText.getText()
                .contentEquals(expectedText));
        MiscUtils.sleep(1000);
    }

    public static void afterEnteringRequiredInformationTheUserIsAbleToSuccessfullySubmitTheSEERDataAccessRequestForm() {
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessSubmitButton);
        seerDataAccessRequestPage.seerDataAccessSubmitButton.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        String seerRegistrationIsCompletePage = WebDriverUtils.getWebDriver().getTitle();
        CommonUtils.assertEquals(Registration_Constants.SEER_DATA_REQUEST_CONFIRMATION_ODS_DATA_ACCESS_REQUEST,
                seerRegistrationIsCompletePage);
        CommonUtils.assertEquals(Registration_Constants.THANK_YOU_DATA_ACCESS_REQUEST_IS_COMPLETE_MESSAGE,
                seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader.getText());
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void theBreadCrumbDisplays(String seerIncidenceDatabaseLink) {
        CommonUtils.waitForVisibility(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
        CommonUtils.assertEquals(seerIncidenceDatabaseLink, seerLandingPage.seerIncidenceDatabaseBreadcrumb.getText());
    }

    public static void whenClickingUserIsDirectedTo(String seerIncidenceDatabaseUrl) {
        CommonUtils.waitForVisibility(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
        CommonUtils.click(seerLandingPage.seerIncidenceDatabaseBreadcrumb);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        String actualSeerCancerGovDataUrl = WebDriverUtils.getWebDriver().getCurrentUrl();
        CommonUtils.assertEquals(seerIncidenceDatabaseUrl, actualSeerCancerGovDataUrl);
        MiscUtils.sleep(1000);
        WebDriverUtils.getWebDriver().navigate().back();
    }

    public static void theUserEntersAnEmailAddressForANonInstitutionalAccount() {
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, CommonUtils.email);
        CommonUtils.click(seerLandingPage.registerForResearchDataButton);
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserIsOnThePage(String seerUserRegistrationHeader) {
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationHeaderText);
        CommonUtils.assertEquals(seerUserRegistrationHeader,
                seerUserRegistrationPage.seerUserRegistrationHeaderText.getText());
    }

    public static void userIsDirectedToTheRegistrationPage(String seerRegistrationIsCompleteText) {
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader);
        CommonUtils.assertEquals(seerRegistrationIsCompleteText,
                seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
    }

        public static void userConfirmsTheirEmailAddressByClickingOnTheEmailVerificationLinkSentToTheUsersEmailAddress()
            throws TestingException {
        nativeViewLoginImpl.sideDoorAccountLogin();
        /** Waiting for email to be sent and searchable */
        MiscUtils.sleep(50000);
        nativeViewEnrollementsPage.filterNavigator.sendKeys("mailbox");
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewmailboxSentLink);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewmailboxSentLink);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewFrame);
        MiscUtils.sleep(1000);
        CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
        CommonUtils.sendKeysToElement(nativeViewSentViewPage.nativeViewSentSearchField, newEmailThankYou285);
        MiscUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewCreatedButton);
        MiscUtils.sleep(2000);
        nativeViewSentViewPage.nativeViewPreviewVerifyEmailIcon.click();
        CommonUtils.clickOnElement(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        MiscUtils.sleep(2000);
        CommonUtils.click(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
        MiscUtils.sleep(1000);
            CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText()
                .contentEquals(SEERDataAccessRequest_Constants.SEER_INCIDENT_DATA_VERIFY_EMAIL_ADDRESS_TEXT));
            CommonUtils.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailHelloNameText.getText().contains(Registration_Constants.FIRST_NAME));
        MiscUtils.sleep(2000);
        String mainPageHandle = WebDriverUtils.getWebDriver().getWindowHandle();
        CommonUtils.click(nativeViewSentViewPage.nativeViewPreviewEmailVerifyEMAILlink);
        MiscUtils.sleep(2000);
        Set<String> allWindows = WebDriverUtils.getWebDriver().getWindowHandles();
        Iterator<String> it = allWindows.iterator();
        while (it.hasNext()) {
            String childHandle = it.next();
            if (!childHandle.equals(mainPageHandle)) {
                WebDriverUtils.getWebDriver().switchTo().window(childHandle);
            }
        }
    }

    public static void theUserIsDirectedToPage(String seerDataAccessRequestPageText) {
        MiscUtils.sleep(2000);
        CommonUtils.assertEquals(seerDataAccessRequestPageText,
                seerDataAccessRequestPage.seerDataAccessRequestHeader.getText());
    }


    public static void theUserHasToSelectAGeneralPurposeForUsingTheData() {
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("disabled")
                .equals("true"));
        MiscUtils.sleep(2000);
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getAttribute("disabled")
                .equals("true"));
        CommonUtils.selectDropDownValue("Administrative",
                seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(2000);
    }

    public static void alsoHasToAgreeByTypingInitialsToTheDataUseAgreementCertificationAndBestPracticeAssurance() {
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph,
                8000);
        CommonUtils.sendKeys(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield, Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText,
                8000);
        CommonUtils.sendKeys(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials, Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText);
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceText, 8000);
        seerDataAccessRequestPage.seerDataAccessBestPracticeAssuranceInitials.sendKeys(Registration_Constants.FIRST_NAME.charAt(0) + "" + Registration_Constants.LAST_NAME.charAt(0));
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void thePageDisplays(String yourDataAccessRequestIsCompleteHeader) {
        MiscUtils.sleep(500);
        CucumberLogUtils.logScreenShot();
        CommonUtils.assertEquals(yourDataAccessRequestIsCompleteHeader,
                seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader.getText());
    }
}