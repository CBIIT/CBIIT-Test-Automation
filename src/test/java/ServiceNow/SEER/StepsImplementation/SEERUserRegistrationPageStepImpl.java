package ServiceNow.SEER.StepsImplementation;

import ServiceNow.SEER.Constants.Registration_Constants;
import appsCommon.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SEERUserRegistrationPageStepImpl extends PageInitializer {

    public static String newEmail282 = "SEER282" + CommonUtils.email;

    public static void validateEmailFieldReadOnly() {
        /**
         * VERIFYING EMAIL ADDRESS AND THAT EMAIL ADDRESS FIELD IS READ-ONLY
         */

        Assert.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
    }

    public static void fillingOutRegistrationForm() {
        MiscUtils.sleep(1000);
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationFirstNameField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField,
                Registration_Constants.FIRST_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField,
                Registration_Constants.LAST_NAME);
        CommonUtils.clickOnElement(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                Registration_Constants.ORGANIZATION_NAME);
            seerUserRegistrationPage.seerUserRegistrationCountryField.click();
            seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(Registration_Constants.COUNTRY_NAME);
            seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationAddressField,
                Registration_Constants.STREET_ADDRESS);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, Registration_Constants.CITY_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationStateField, Registration_Constants.STATE);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationZipcodeField,
                Registration_Constants.ZIP_CODE);
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationPhoneField,
                Registration_Constants.PHONE_NUMBER);

        /**
         * SELECTING VALUE FOR What best describes you for the purpose of requesting
         * this data?
         */
        CommonUtils.selectDropDownValue(Registration_Constants.GENERAL_PURPOSE_FOR_USING_THE_DATA,
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void fillingOutRegistrationFormOrganizationNotFound() {
        MiscUtils.sleep(1000);
        CommonUtils. waitForVisibility(seerUserRegistrationPage.seerUserRegistrationFirstNameField);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationFirstNameField,
                Registration_Constants.FIRST_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationLastNameField,
                Registration_Constants.LAST_NAME);
        CommonUtils.clickOnElement(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        seerUserRegistrationPage.seerUserRegistrationCountryField.click();
        seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(Registration_Constants.COUNTRY_NAME);
        seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationAddressField,
                Registration_Constants.STREET_ADDRESS);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationCityField, Registration_Constants.CITY_NAME);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationStateField, Registration_Constants.STATE);
        CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationZipcodeField,
                Registration_Constants.ZIP_CODE);
        MiscUtils.sleep(1000);
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationPhoneField,
                Registration_Constants.PHONE_NUMBER);

        /**
         * SELECTING VALUE FOR What best describes you for the purpose of requesting
         * this data?
         */
        CommonUtils.selectDropDownValue(Registration_Constants.GENERAL_PURPOSE_FOR_USING_THE_DATA,
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void userShouldNotBeAleToSelectAsAnOrganizationOption(String organizationOption) {
        for (WebElement organization : seerUserRegistrationPage.seerUserRegistrationOrganizations){
            String org = organization.getAttribute("value");
            if(org.contains(organizationOption)){
                CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                        organizationOption.substring(0, 5));
                CucumberLogUtils.logScreenShot();
                MiscUtils.sleep(1000);
                CucumberLogUtils.logScreenShot();
                CommonUtils.assertTrue(!org.equals(organizationOption));
                break;
            }
        }
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
         CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
        CommonUtils.clickOnElement(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                Registration_Constants.ORGANIZATION_NAME);
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationAddressField,
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
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
    }

    public static void fillsOutTheSEERRegistrationFormNonInstitutional() {
        seerUserRegistrationPage.seerUserRegistrationFirstNameField.sendKeys(Registration_Constants.NI_FIRST_NAME);
        seerUserRegistrationPage.seerUserRegistrationMiddleNameField.sendKeys(Registration_Constants.NI_MIDDLE_NAME);
        seerUserRegistrationPage.seerUserRegistrationLastNameField.sendKeys(Registration_Constants.NI_LAST_NAME);
        CommonUtils.assertEquals(CommonUtils.email,
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
        CommonUtils.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationOrganizationField);
        seerUserRegistrationPage.seerUserRegistrationOrganizationField.click();
        seerUserRegistrationPage.seerUserRegistrationOrganizationField.sendKeys(Registration_Constants.NI_ORGANIZATION_NAME);
        CommonUtils.sendKeysToElement(seerUserRegistrationPage.seerUserRegistrationJobTitleField,Registration_Constants.NI_JOB_TITLE);
        JavascriptUtils.scrollIntoView(seerUserRegistrationPage.seerUserRegistrationEmailField);
        seerUserRegistrationPage.seerUserRegistrationCountryField.click();
        seerUserRegistrationPage.seerUserRegistrationCountryField.sendKeys(Registration_Constants.NI_COUNTRY_NAME);
        seerUserRegistrationPage.seerUserRegistrationCountryUSA.click();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenShot();
        seerUserRegistrationPage.seerUserRegistrationAddressField.sendKeys(Registration_Constants.NI_STREET_ADDRESS);
        seerUserRegistrationPage.seerUserRegistrationCityField.sendKeys(Registration_Constants.NI_CITY_NAME);
        seerUserRegistrationPage.seerUserRegistrationStateField.sendKeys(Registration_Constants.NI_STATE);
        seerUserRegistrationPage.seerUserRegistrationZipcodeField.sendKeys(Registration_Constants.NI_ZIP_CODE);
        seerUserRegistrationPage.seerUserRegistrationPhoneField.sendKeys(Registration_Constants.NI_PHONE_NUMBER);
        MiscUtils.sleep(1000);
    }

    public static void aSEERUserRegistrationHasBeenSuccessfullySubmitted() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmail282);
        CommonUtils.waitForVisibility(seerLandingPage.registerForResearchDataButton);
        seerLandingPage.registerForResearchDataButton.click();
        MiscUtils.sleep(2000);
        String seerRegistrationPage = WebDriverUtils.getWebDriver().getTitle();
        MiscUtils.sleep(1000);
        CommonUtils.assertEquals(Registration_Constants.SEER_USER_REGISTRATION_ODS_DATA_ACCESS_REQUEST, seerRegistrationPage);
               seerUserRegistrationPage.seerUserRegistrationFirstNameField.sendKeys(Registration_Constants.NI_FIRST_NAME);
        seerUserRegistrationPage.seerUserRegistrationMiddleNameField.sendKeys(Registration_Constants.NI_MIDDLE_NAME);
        seerUserRegistrationPage.seerUserRegistrationLastNameField.sendKeys(Registration_Constants.NI_LAST_NAME);
        CommonUtils.assertEquals(newEmail282,
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("value"));
        CommonUtils.assertTrue(
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
        CommonUtils.assertEquals(Registration_Constants.SEER_DATA_CONFIRMATION_ODS_DATA_ACCESS_REQUEST, seerRegistrationIsCompletePage);
        CommonUtils.assertEquals(Registration_Constants.THANK_YOU_REGISTRATION_IS_COMPLETE_MESSAGE,
                seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
        CucumberLogUtils.logScreenShot();
    }

    public static void theUserShouldSeePageWhenReRegistering(String youAlreadyHaveAccessToSeerResearchData) throws TestingException{
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
        SEERDataAccessRequestPageStepsImpl.enterEmailAddress349();
        MiscUtils.sleep(2000);
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerYouAlreadyHaveAccessToSeerResearchDataHeader);
        org.junit.Assert.assertEquals(youAlreadyHaveAccessToSeerResearchData,
                seerUserRegistrationPage.seerYouAlreadyHaveAccessToSeerResearchDataHeader.getText());
    }

    public static void theLandingPageHasLinkForSeerResearchPlusInstruction(String youAlreadyHaveAccessToSeerResearchData){
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerHowToRequestAccessToSeerDataLink);
        CommonUtils.assertEquals(youAlreadyHaveAccessToSeerResearchData,
                seerUserRegistrationPage.seerHowToRequestAccessToSeerDataLink.getText());
        CucumberLogUtils.logScreenShot();
    }
}