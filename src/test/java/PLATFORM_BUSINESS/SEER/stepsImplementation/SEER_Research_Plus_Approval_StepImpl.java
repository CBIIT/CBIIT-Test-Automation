package PLATFORM_BUSINESS.SEER.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import PLATFORM_BUSINESS.SEER.constants.Registration_Constants;
import PLATFORM_BUSINESS.SEER.constants.SEERDataAccessRequest_Constants;
import PLATFORM_BUSINESS.SEER.constants.SEERDataRejection_Constants;
import PLATFORM_BUSINESS.SEER.constants.SEERNativeView_Constants;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.Keys;
import static com.nci.automation.web.TestProperties.getSeerOdsUrl;

public class SEER_Research_Plus_Approval_StepImpl extends PageInitializer {

    /**
     * This method simulates the process of a user being approved for SEER Research Plus data.
     */
    public static void a_user_is_approved_for_seer_research_plus_data() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        ServiceNow_Common_Methods.impersonateAnyUser("learas@nih.gov");
        WebDriverUtils.webDriver.get(getSeerOdsUrl());
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerPlusUserRegistrationSubmitButton);
        CommonUtils.waitForClickability(seerUserRegistrationPage.seerPlusUserRegistrationSubmitButton);
        seerUserRegistrationPage.seerPlusUserRegistrationSubmitButton.click();
        CommonUtils.assertTrue(seerDataAccessRequestPage.requestedForText.getText().contentEquals("Requested for"));
        System.out.println("Requested For Text: " + seerDataAccessRequestPage.requestedForText.getText());
        CommonUtils.assertEquals(Registration_Constants.PLUS_USER_NAME, seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("value"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestedForReadOnlyTextBox.getAttribute("disabled").equals("true"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeText.getText().contentEquals("Database type"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDatabaseTypeReadOnlyTextBox.getText().contains("SEER Research Plus and NCCR Data"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeUsingTheDataText.getText().contentEquals(SEERDataAccessRequest_Constants.WHAT_IS_THE_GENERAL_PURPOSE_TEXT));
        CommonUtils.selectDropDownValue("Administrative", seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
        CucumberLogUtils.logScreenshot();
        CommonUtils.sendKeysToElement(seerDataAccessRequestPage.seerDataAccessSigningOfficialFirstNameTextBox, "Alex");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sendKeysToElement(seerDataAccessRequestPage.seerDataAccessSigningOfficialLastNameTextBox, "Lear");
        CucumberLogUtils.logScreenshot();
        CommonUtils.sendKeysToElement(seerDataAccessRequestPage.seerDataAccessSigningOfficialEmailAddressTextBox, "Learas@nih.gov");
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
        CommonUtils.assertTrue(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfieldHeader.getText().contentEquals("I understand the limitation of treatment data."));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitialsText.getText().contentEquals("Initials"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield.getAttribute("disabled").equals("true"));
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph);
        CommonUtils.assertEquals(SEERDataAccessRequest_Constants.I_UNDERSTAND_THE_LIMITATIONS_OF_TREATEMENT_DATA,seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph.getText());
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationHeaderText.getText()
                .contentEquals("Data Use Agreement Certification"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials.getAttribute("disabled")
                .equals("true"));
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.seerDataAccessRequestWhatIsYourGeneralPurposeForUsingTheDataDD);
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessNCCRResearchDataUseAgreementCertificationHeaderText.getText()
                .contentEquals("NCCR Research Data Use Agreement"));
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessNCCRResearchDataUseAgreementCertificationInitials.getAttribute("disabled")
                .equals("true"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText);
        CommonUtils.assertEquals(SEERDataAccessRequest_Constants.DATA_USE_AGREE_EMT_CERTIFFICATION,seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText.getText());
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataContentTextLastParagraph, 8000);
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationText, 8000);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollUpWithinElement(seerDataAccessRequestPage.seerDataAccessNCCRResearchDataUseAgreementCertificationText, 8000);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.scrollIntoView(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield);
        seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield.sendKeys(Registration_Constants.PLUS_USER_FIRST_NAME.charAt(0) + "" + Registration_Constants.PLUS_USER_LAST_NAME.charAt(0));
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.iUnderstandTheLimitationOfTreatmentDataInitialsfield);
        seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials.sendKeys(Registration_Constants.PLUS_USER_FIRST_NAME.charAt(0) + "" + Registration_Constants.PLUS_USER_LAST_NAME.charAt(0));
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessDataUseAgreementCertificationInitials);
        seerDataAccessRequestPage.seerDataAccessNCCRResearchDataUseAgreementCertificationInitials.sendKeys(Registration_Constants.PLUS_USER_FIRST_NAME.charAt(0) + "" + Registration_Constants.PLUS_USER_LAST_NAME.charAt(0));
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessNCCRResearchDataUseAgreementCertificationInitials);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertTrue(seerDataAccessRequestPage.seerDataAccessSEERIsSupportedByTheBottomText.getText()
                .contentEquals("SEER is supported by the Surveillance Research Program (SRP) in NCI's Division of Cancer Control and Population Sciences (DCCPS). SRP provides national leadership in the science of cancer surveillance as well as analytical tools and methodological expertise in collecting, analyzing, interpreting, and disseminating reliable population-based statistics."));
        CommonUtils.waitForVisibility(seerDataAccessRequestPage.seerDataAccessSubmitButton);
        seerDataAccessRequestPage.seerDataAccessSubmitButton.click();
        CucumberLogUtils.logScreenshot();
        String seerRegistrationIsCompletePage = WebDriverUtils.webDriver.getTitle();
        CommonUtils.assertEquals(Registration_Constants.SEER_DATA_REQUEST_CONFIRMATION_ODS_DATA_ACCESS_REQUEST, seerRegistrationIsCompletePage);
        CommonUtils.assertEquals(Registration_Constants.THANK_YOU_DATA_ACCESS_REQUEST_IS_COMPLETE_MESSAGE, seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader.getText());
        JavascriptUtils.drawBlueBorder(seerDataAccessRequestPage.seerDataAccessYourDataAccessRequestIsCompleteHeader);
        CucumberLogUtils.logScreenshot();
        ServiceNow_Common_Methods.logOutOfNativeView();
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CucumberLogUtils.logScreenshot();
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavViewAccessRequestUnderSEERUrl());
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        nativeViewAccessRequestPage.accessRequestNewButton.click();
        CommonUtils.assertTrue(nativeViewAccessRequestPage.accessRequestText.getText()
                .contentEquals(SEERNativeView_Constants.NATIVE_VIEW_ACCESS_REQUEST_MENU_TEXT));
        CommonUtils.waitForVisibility(nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Registration_Constants.PLUS_USER_FIRST_NAME + " " + Registration_Constants.PLUS_USER_LAST_NAME);;
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Keys.ENTER);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessSaveButton);
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessRequestPreviewRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessRequestOpenRecordButton);
        CucumberLogUtils.logScreenshot();
        CommonUtils.assertTrue(nativeViewAccessRequestPage.accessRequestCustomerText.getText()
                .contentEquals("Customer"));
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(nativeViewAccessRequestPage.nativeViewAccessRequestAccountTypeDropdown);
        CommonUtils.selectDropDownValue("Institution",
                nativeViewAccessRequestPage.nativeViewAccessRequestAccountTypeDropdown);
        CucumberLogUtils.logScreenshot();
        nativeViewAccessRequestPage.nativeViewAccessSaveClientButton.click();
        CommonUtils.switchToDefaultContent();
        ServiceNow_Common_Methods.filterNavigatorSearch("SEER");
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavViewAccessRequestUnderSEERUrl());
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        nativeViewAccessRequestPage.accessRequestNewButton.click();
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Registration_Constants.PLUS_USER_FIRST_NAME + " " + Registration_Constants.PLUS_USER_LAST_NAME);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Keys.ENTER);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys(SEERDataRejection_Constants.SEER_RESEARCH_PLUS_AND_NCCR_DATA);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys(Keys.ENTER);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessSaveClientButtonBottom);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessRequest);
        CucumberLogUtils.logScreenshot();
        CommonUtils.selectDropDownValue("Approved", nativeViewAccessRequestPage.nativeViewAccessRequestStatusDropdown);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessSaveRejectedClientButtonBottom);
        CommonUtils.clickOnElement(nativeViewAccessRequestPage.nativeViewAccessUpdateClientButtonBottom);
        CommonUtils.switchToDefaultContent();
    }

    /**
     * This method simulates the process of receiving the approval email notification.
     * It waits for the email to be sent and searchable, filters through the emails to find the approved email,
     * verifies the content of the email, and performs various checks on the email content.
     */
    public static void they_receive_the_approval_email_notification() {
        CommonUtils.sleep(60000); //needed more time to wait for the rejection email to be received
        ServiceNow_Common_Methods.filterNavigatorSearch("Emails");
        WebDriverUtils.webDriver.get(SEER_TestProperties_StepImpl.getNativeViewFilterNavEmailUnderSystemLogsUrl());
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        CommonUtils.assertTrue(nativeViewEmailsPage.emailsMenu.getText()
                .contentEquals("Emails"));
        CucumberLogUtils.logScreenshot();
        //search email using the filter button
        CommonUtils.waitForVisibility(nativeViewEmailsPage.nativeViewEmailPageFilterButton);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailPageFilterButton);
        CommonUtils.waitForVisibility(nativeViewEmailsPage.nativeViewEmailPageFilterOptionRow1Field1ToSearch);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailPageFilterOptionRow1Field1ToSearch);
        CommonUtils.sendKeys(nativeViewEmailsPage.nativeViewEmailPageFilterOptionRow1Field1ToSearch, Keys.ENTER);
        CommonUtils.sendKeys(nativeViewEmailsPage.nativeViewEmailPageFilterOptionRow1Field1InputToSearch, "Recipients");
        CommonUtils.sendKeys(nativeViewEmailsPage.nativeViewEmailPageFilterOptionRow1Field1InputToSearch, Keys.ENTER);
        CommonUtils.waitForVisibility(nativeViewEmailsPage.nativeViewEmailPageFilterSearchConditionRow1ToSearchForRecipientsOnly);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailPageFilterSearchConditionRow1ToSearchForRecipientsOnly);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailPageFilterSearchConditionRow1ToSelectIsForRecipientsOnly);
        CommonUtils.waitForVisibility(nativeViewEmailsPage.nativeViewEmailPageFilterSearchINPUTRow1ToSearchForRecipientsOnly);
        CommonUtils.sendKeysToElement(nativeViewEmailsPage.nativeViewEmailPageFilterSearchINPUTRow1ToSearchForRecipientsOnly, "alex.lear@nih.gov");
        CommonUtils.waitForVisibility(nativeViewEmailsPage.nativeViewEmailPageFilterRow1AndButton);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailPageFilterRow1AndButton);
        CommonUtils.waitForClickability(nativeViewEmailsPage.nativeViewEmailPageFilterOptionRow2Field1ToSearchSubject);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailPageFilterOptionRow2Field1ToSearchSubject);
        CommonUtils.sendKeys(nativeViewEmailsPage.nativeViewEmailPageFilterOptionRow2Field1ToSearchSubject,"ENTER");
        CommonUtils.sendKeys(nativeViewEmailsPage.nativeViewEmailPageFilterOptionRow2Field1SelectSubjectToSearch, "Subject");
        CommonUtils.sendKeys(nativeViewEmailsPage.nativeViewEmailPageFilterOptionRow2Field1SelectSubjectToSearch, Keys.ENTER);
        CommonUtils.waitForVisibility(nativeViewEmailsPage.nativeViewEmailPageFilterSearchConditionRow2ToSelectContains);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailPageFilterSearchConditionRow2ToSelectContains);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailPageFilterSearchConditionRow2ToSelectContainsForSubject);
        CommonUtils.waitForVisibility(nativeViewEmailsPage.nativeViewEmailPageFilterSearchINPUTRow2ToSearchForApprovedEmailSubject);
        CommonUtils.sendKeys(nativeViewEmailsPage.nativeViewEmailPageFilterSearchINPUTRow2ToSearchForApprovedEmailSubject, "Your SEER Data Access Request has been approved");
        CommonUtils.waitForVisibility(nativeViewEmailsPage.nativeViewEmailPageFilterRunButton);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailPageFilterRunButton);
        CommonUtils.waitForVisibility(nativeViewEmailsPage.nativeViewEmailsPreviewVerifyEmailIconForApprovedEmail);
        CommonUtils.clickOnElement(nativeViewEmailsPage.nativeViewEmailsPreviewVerifyEmailIconForApprovedEmail);
        CommonUtils.clickOnElement(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
        JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CommonUtils.clickOnElement(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CucumberLogUtils.logScreenshot();
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
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
        CucumberLogUtils.logScreenshot();
    }
}