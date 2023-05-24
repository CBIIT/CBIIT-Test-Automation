package ServiceNow.SEER.StepsImplementation;

import ServiceNow.SEER.Constants.Registration_Constants;
import ServiceNow.SEER.Constants.SEERDataAccessRequest_Constants;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.testng.Assert;

public class SEERUserRegistrationPageStepImpl extends PageInitializer {

    public static String newEmail = "seer" + CommonUtils.email;

    public static void validateEmailFieldReadOnly() {
        /**
         * VERIFYING EMAIL ADDRESS AND THAT EMAIL ADDRESS FIELD IS READ-ONLY
         */
        Assert.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
    }

    public static void validateEmailFieldReadOnlyNI() {
        /**
         * VERIFYING NON-INSTITUTIONAL EMAIL ADDRESS AND THAT EMAIL ADDRESS FIELD IS READ-ONLY
         */
         Assert.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
      }

    public static void fillingOutRegistrationForm() {
        MiscUtils.sleep(1000);
        CommonUtils. waitForVisibility(seerUserRegistrationPage.seerUserRegistrationFirstNameField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField,
                Registration_Constants.FIRST_NAME);

        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField,
                Registration_Constants.LAST_NAME);
        MiscUtils.sleep(1000);
        CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                Registration_Constants.ORGANIZATION_NAME);
            seerUserRegistrationPage.seerUserRegistrationCountryField.click();
            seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(Registration_Constants.COUNTRY_NAME);
            seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationAddressField,
                Registration_Constants.STREET_ADDRESS);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, Registration_Constants.CITY_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationStateField, Registration_Constants.STATE);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationZipcodeField,
                Registration_Constants.ZIP_CODE);
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationPhoneField,
                Registration_Constants.PHONE_NUMBER);

        /**
         * SELECTING VALUE FOR What best describes you for the purpose of requesting
         * this data?
         */
        CommonUtils.selectDropDownValue(Registration_Constants.GENERAL_PURPOSE_FOR_USING_THE_DATA,
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void fillingOutRegistrationFormWithoutStateAndZip() {
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationFirstNameField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField,
                Registration_Constants.FIRST_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField,
                Registration_Constants.LAST_NAME);

        /**
         * VERIFYING EMAIL ADDRESS AND THAT EMAIL ADDRESS FIELD IS READ-ONLY
         */
         Assert.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
        MiscUtils.sleep(1000);
        CommonUtils.click(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                Registration_Constants.ORGANIZATION_NAME);
        MiscUtils.sleep(1000);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationAddressField,
                Registration_Constants.STREET_ADDRESS);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, Registration_Constants.CITY_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationPhoneField,
                Registration_Constants.PHONE_NUMBER);

        /**
         * SELECTING VALUE FOR What best describes you for the purpose of requesting
         * this data?
         */
        CommonUtils.selectDropDownValue(Registration_Constants.GENERAL_PURPOSE_FOR_USING_THE_DATA,
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
    }

    public static void fillsOutTheSEERRegistrationFormNonInstitutional() {
        seerUserRegistrationPage.seerUserRegistrationFirstNameField.sendKeys(Registration_Constants.NI_FIRST_NAME);
        seerUserRegistrationPage.seerUserRegistrationMiddleNameField.sendKeys(Registration_Constants.NI_MIDDLE_NAME);
        seerUserRegistrationPage.seerUserRegistrationLastNameField.sendKeys(Registration_Constants.NI_LAST_NAME);
        org.junit.Assert.assertEquals(CommonUtils.email,
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
        org.junit.Assert.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        seerUserRegistrationPage.seerUserRegistrationOrganizationField.click();
        seerUserRegistrationPage.seerUserRegistrationOrganizationField.sendKeys(Registration_Constants.NI_ORGANIZATION_NAME);
        MiscUtils.sleep(2000);
        seerUserRegistrationPage.seerUserRegistrationJobTitleField.sendKeys(Registration_Constants.NI_JOB_TITLE);
        JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerUserRegistrationEmailField);
        seerUserRegistrationPage.seerUserRegistrationCountryField.click();
        seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(Registration_Constants.NI_COUNTRY_NAME);
        seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenShot();
        seerUserRegistrationPage.seerUserRegistrationAddressField.sendKeys(Registration_Constants.NI_STREET_ADDRESS);
        seerUserRegistrationPage.seerUserRegistrationCityField.sendKeys(Registration_Constants.NI_CITY_NAME);
        seerUserRegistrationPage.seerUserRegistrationStateField.sendKeys(Registration_Constants.NI_STATE);
        seerUserRegistrationPage.seerUserRegistrationZipcodeField.sendKeys(Registration_Constants.NI_ZIP_CODE);
        seerUserRegistrationPage.seerUserRegistrationPhoneField.sendKeys(Registration_Constants.NI_PHONE_NUMBER);
        MiscUtils.sleep(2000);
    }

    public static void aSEERUserRegistrationHasBeenSuccessfullySubmitted() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, "SEER282" + CommonUtils.email);
        CommonUtils.waitForVisibility(seerLandingPage.registerForResearchDataButton);
        seerLandingPage.registerForResearchDataButton.click();
        MiscUtils.sleep(2000);
        String seerRegistrationPage = WebDriverUtils.getWebDriver().getTitle();
        MiscUtils.sleep(1000);
        org.junit.Assert.assertTrue(seerRegistrationPage.contentEquals("SEER User Registration - ODS SEER Data Access Request"));
        seerUserRegistrationPage.seerUserRegistrationFirstNameField.sendKeys(Registration_Constants.NI_FIRST_NAME);
        seerUserRegistrationPage.seerUserRegistrationMiddleNameField.sendKeys(Registration_Constants.NI_MIDDLE_NAME);
        seerUserRegistrationPage.seerUserRegistrationLastNameField.sendKeys(Registration_Constants.NI_LAST_NAME);
        org.junit.Assert.assertEquals("SEER282" + CommonUtils.email,
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
        org.junit.Assert.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        seerUserRegistrationPage.seerUserRegistrationOrganizationField.click();
        seerUserRegistrationPage.seerUserRegistrationOrganizationField.sendKeys(Registration_Constants.NI_ORGANIZATION_NAME);
        seerUserRegistrationPage.seerUserRegistrationJobTitleField.sendKeys(Registration_Constants.NI_JOB_TITLE);
        JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerUserRegistrationEmailField);
        seerUserRegistrationPage.seerUserRegistrationCountryField.click();
        seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(Registration_Constants.NI_COUNTRY_NAME);
        seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        seerUserRegistrationPage.seerUserRegistrationAddressField.sendKeys(Registration_Constants.NI_STREET_ADDRESS);
        seerUserRegistrationPage.seerUserRegistrationCityField.sendKeys(Registration_Constants.NI_CITY_NAME);
        seerUserRegistrationPage.seerUserRegistrationStateField.sendKeys(Registration_Constants.NI_STATE);
        seerUserRegistrationPage.seerUserRegistrationZipcodeField.sendKeys(Registration_Constants.NI_ZIP_CODE);
        seerUserRegistrationPage.seerUserRegistrationPhoneField.sendKeys(Registration_Constants.NI_PHONE_NUMBER);
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        CommonUtils.selectDropDownValue(Registration_Constants.GENERAL_PURPOSE_FOR_USING_THE_DATA,
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        CucumberLogUtils.logScreenShot();
        seerUserRegistrationPage.seerUserRegistrationSubmitButton.click();
        MiscUtils.sleep(2000);
        String seerRegistrationIsCompletePage = WebDriverUtils.getWebDriver().getTitle();
        org.junit.Assert.assertEquals("SEER Data Confirmation - ODS SEER Data Access Request", seerRegistrationIsCompletePage);
        org.junit.Assert.assertEquals("Thank you - your registration is complete.",
                seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
        CucumberLogUtils.logScreenShot();
    }
}
