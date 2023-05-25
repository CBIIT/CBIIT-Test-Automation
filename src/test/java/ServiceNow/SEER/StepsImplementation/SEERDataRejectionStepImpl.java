package ServiceNow.SEER.StepsImplementation;

import ServiceNow.SEER.Constants.SEERDataRejection_Constants;
import ServiceNow.SEER.Pages.NativeViewAccessRequestPage;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SEERDataRejectionStepImpl extends PageInitializer {

    public static void aSEERODSAdminNavigatesTheNativeViewPortal() {
        nativeViewLoginImpl.sideDoorAccountLogin();
        Assert.assertTrue(nativeViewSentViewPage.nativeViewHomeButton.getText()
                .contentEquals("Home"));
        CucumberLogUtils.logScreenShot();
    }

    public static String newEmailThankYou320 = "seerThankYou320" + CommonUtils.email;
    public static void proceedsToRegisterForResearchDataWithUniqueEmailAddress() {
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmailThankYou320);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(seerLandingPage.registerForResearchDataButton);
        MiscUtils.sleep(2000);
    }

    public static void fillsOutAllRequiredFieldsOnSEERDataRegistrationForm() {
        SEERUserRegistrationPageStepImpl.validateEmailFieldReadOnly();
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationFirstNameField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField,
                SEERDataRejection_Constants.FIRST_NAME);

        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField,
                SEERDataRejection_Constants.LAST_NAME);
        MiscUtils.sleep(1000);
        CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                SEERDataRejection_Constants.ORGANIZATION_NAME);
        seerUserRegistrationPage.seerUserRegistrationCountryField.click();
        seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(SEERDataRejection_Constants.COUNTRY_NAME);
        seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationAddressField,
                SEERDataRejection_Constants.STREET_ADDRESS);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, SEERDataRejection_Constants.CITY_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationStateField, SEERDataRejection_Constants.STATE);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationZipcodeField,
                SEERDataRejection_Constants.ZIP_CODE);
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationPhoneField,
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

    public static void aSEERODSAdminNnavigatesTo(String SEERText, String accessRequestsText) {
        nativeViewEnrollementsPage.filterNavigator.sendKeys(SEERText);
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(NativeViewAccessRequestPage.nativeViewSEERAccessRequestsLink(accessRequestsText));
        MiscUtils.sleep(1000);
        NativeViewAccessRequestPage.nativeViewSEERAccessRequestsLink(accessRequestsText).click();
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
        MiscUtils.sleep(1000);
        Assert.assertTrue(nativeViewAccessRequestPage.accessRequestMenu.getText()
                .contentEquals(accessRequestsText));
    }

    public static void createsANewAccessRequest() {
        nativeViewAccessRequestPage.accessRequestNewButton.click();
        Assert.assertTrue(nativeViewAccessRequestPage.accessRequestText.getText()
                .contentEquals("Access Request"));
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(SEERDataRejection_Constants.FIRST_NAME + " " + SEERDataRejection_Constants.LAST_NAME);
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Keys.ENTER);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        nativeViewAccessRequestPage.nativeViewAccessRequestPreviewRecordButton.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        nativeViewAccessRequestPage.nativeViewAccessRequestOpenRecordButton.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        nativeViewAccessRequestPage.nativeViewAccessRequestSaveChangesDiscardButton.click();
        MiscUtils.sleep(1000);
        Assert.assertTrue(nativeViewAccessRequestPage.accessRequestCustomerText.getText()
                .contentEquals("Customer"));
        CucumberLogUtils.logScreenShot();
        CommonUtils.selectDropDownValue("Institution",
                nativeViewAccessRequestPage.nativeViewAccessRequestAccountTypeDropdown);
        CucumberLogUtils.logScreenShot();
        nativeViewAccessRequestPage.nativeViewAccessSaveClientButton.click();
        MiscUtils.sleep(2000);
        CommonUtils.switchToDefaultContent();
    }

    public static void whenTheAdminRejectsTheAccessRequests() {
        SEERDataRejectionStepImpl.aSEERODSAdminNnavigatesTo("","Access Requests");
        nativeViewAccessRequestPage.accessRequestNewButton.click();
        MiscUtils.sleep(1000);
        Assert.assertTrue(nativeViewAccessRequestPage.accessRequestText.getText()
                .contentEquals("Access Request"));
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(SEERDataRejection_Constants.FIRST_NAME + " " + SEERDataRejection_Constants.LAST_NAME);
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestCustomerTextBox.sendKeys(Keys.ENTER);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys("SEER Research Plus");
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessRequestDatasetTextBox.sendKeys(Keys.ENTER);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessSaveClientButtonBottom.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        nativeViewAccessRequestPage.nativeViewAccessRequest.click();
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        CommonUtils.selectDropDownValue("Rejected",
                nativeViewAccessRequestPage.nativeViewAccessRequestStatusDropdown);
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessSaveRejectedClientButtonBottom.click();
        MiscUtils.sleep(1000);
        nativeViewAccessRequestPage.nativeViewAccessUpdateClientButtonBottom.click();
        CommonUtils.switchToDefaultContent();
    }

    public static void theUserShallReceiveARejectionEmail() {
        /** Waiting for email to be sent and searchable */
        MiscUtils.sleep(50000);
        nativeViewEnrollementsPage.filterNavigator.clear();
        MiscUtils.sleep(5000);
        nativeViewEnrollementsPage.filterNavigator.sendKeys("Emails");
        MiscUtils.sleep(1000);
        JavascriptUtils.scrollIntoView(nativeViewEmailsPage.nativeViewAccessEmailsButton);
        MiscUtils.sleep(1000);
        nativeViewEmailsPage.nativeViewAccessEmailsButton.click();
        CucumberLogUtils.logScreenShot();
        MiscUtils.sleep(1000);
        CommonUtils.switchToFrame(nativeViewAccessRequestPage.accessRequestIFrame);
        MiscUtils.sleep(1000);
        Assert.assertTrue(nativeViewEmailsPage.emailsMenu.getText()
                .contentEquals("Emails"));
        CucumberLogUtils.logScreenShot();
        CommonUtils.selectDropDownValue("Recipients", nativeViewSentViewPage.nativeViewSearchDropDown);
        MiscUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys("seerThankYou320" + CommonUtils.email);
        MiscUtils.sleep(1000);
        nativeViewSentViewPage.nativeViewSentSearchField.sendKeys(Keys.ENTER);
        MiscUtils.sleep(2000);
        nativeViewEmailsPage.nativeViewEmailsPreviewVerifyEmailIcon.click();
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenShot();
        CommonUtils.click(nativeViewSentViewPage.NativeViewPreviewVerifyEmailOpenRecordButton);
        MiscUtils.sleep(2000);
        JavascriptUtils.scrollIntoView(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        MiscUtils.sleep(2000);
        CommonUtils.click(nativeViewSentViewPage.nativeViewPreviewVerifyEmailPreviewHTMLBodyLink);
        CucumberLogUtils.logScreenShot();
        CommonUtils.switchToFrame(nativeViewSentViewPage.nativeViewPreviewEmailIFRAME);
        MiscUtils.sleep(2000);
        Assert.assertTrue(nativeViewSentViewPage.nativeViewPreviewEmailSEERIncidenceDataHeader.getText()
                .contentEquals("SEER Incidence Data: Data Request Rejected"));
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }
}
