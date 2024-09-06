package ServiceNow.PlatformBusinessApps.SEER.StepsImplementation;

import ServiceNow.PlatformBusinessApps.SEER.Constants.Registration_Constants;
import appsCommon.PageInitializers.PageInitializer;
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

    public static String newEmail282 = "seerThankYou282" + CommonUtils.email;

    /**
     * Verifies that the email address field is read-only.
     */
    public static void validateEmailFieldReadOnly() {
        Assert.assertTrue(
                seerUserRegistrationPage.seerUserRegistrationEmailField.getAttribute("disabled").equals("true"));
    }

    /**
     *  This method fills out the Registration Form
     */
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
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Fills out the registration form.
     */
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
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method checks if the user is able to select an organization option and prevents it if the option is found.
     *
     * @param organizationOption the organization option that should not be selected
     */
    public static void userShouldNotBeAleToSelectAsAnOrganizationOption(String organizationOption) {
        for (WebElement organization : seerUserRegistrationPage.seerUserRegistrationOrganizations){
            String org = organization.getAttribute("value");
            if(org.contains(organizationOption)){
                CommonUtils.sendKeys(seerUserRegistrationPage.seerUserRegistrationOrganizationField,
                        organizationOption.substring(0, 5));
                CucumberLogUtils.logScreenshot();
                MiscUtils.sleep(1000);
                CucumberLogUtils.logScreenshot();
                CommonUtils.assertTrue(!org.equals(organizationOption));
                break;
            }
        }
    }

    /**
     * This method fill the Registration form without Stats and Zip code fields
     */
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

        /**
         * SELECTING VALUE FOR What best describes you for the purpose of requesting
         * this data?
         */
        CommonUtils.selectDropDownValue(Registration_Constants.GENERAL_PURPOSE_FOR_USING_THE_DATA,
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Fills out the SEER Registration Form for Non-Institutional users.
     */
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
        CucumberLogUtils.logScreenshot();
        seerUserRegistrationPage.seerUserRegistrationAddressField.sendKeys(Registration_Constants.NI_STREET_ADDRESS);
        seerUserRegistrationPage.seerUserRegistrationCityField.sendKeys(Registration_Constants.NI_CITY_NAME);
        seerUserRegistrationPage.seerUserRegistrationStateField.sendKeys(Registration_Constants.NI_STATE);
        seerUserRegistrationPage.seerUserRegistrationZipcodeField.sendKeys(Registration_Constants.NI_ZIP_CODE);
        seerUserRegistrationPage.seerUserRegistrationPhoneField.sendKeys(Registration_Constants.NI_PHONE_NUMBER);
        MiscUtils.sleep(1000);
    }

    /**
     * Submits the SEER user registration form successfully.
     *
     * @throws TestingException if any error occurs during the registration process
     */
    public static void aSEERUserRegistrationHasBeenSuccessfullySubmitted() throws TestingException {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
        CommonUtils.waitForVisibility(seerLandingPage.researchDataRequestsEmailAddressField);
        JavascriptUtils.scrollIntoView(seerLandingPage.researchDataRequestsEmailAddressField);
        CommonUtils.sendKeys(seerLandingPage.researchDataRequestsEmailAddressField, newEmail282);
        CommonUtils.waitForVisibility(seerLandingPage.registerForResearchDataButton);
        seerLandingPage.registerForResearchDataButton.click();
        MiscUtils.sleep(2000);
        String seerRegistrationPage = WebDriverUtils.webDriver.getTitle();
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
        CommonUtils.waitForVisibility(seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        CommonUtils.selectDropDownValue(Registration_Constants.GENERAL_PURPOSE_FOR_USING_THE_DATA,
                seerUserRegistrationPage.seerUserRegistrationWhichOfTheseBestDescribeYouField);
        CucumberLogUtils.logScreenshot();
        seerUserRegistrationPage.seerUserRegistrationSubmitButton.click();
        MiscUtils.sleep(2000);
        String seerRegistrationIsCompletePage = WebDriverUtils.webDriver.getTitle();
        CommonUtils.assertEquals(Registration_Constants.SEER_DATA_CONFIRMATION_ODS_DATA_ACCESS_REQUEST, seerRegistrationIsCompletePage);
        CommonUtils.assertEquals(Registration_Constants.THANK_YOU_REGISTRATION_IS_COMPLETE_MESSAGE,
                seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader.getText());
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerUserRegistrationIsCompleteHeader);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * The user should see the "You Already Have Access To Seer Research Data" page when re-registering.
     *
     * @param youAlreadyHaveAccessToSeerResearchData The message that the user should see on the page when re-registering.
     * @throws TestingException If any error occurs during the re-registration process.
     */
    public static void theUserShouldSeePageWhenReRegistering(String youAlreadyHaveAccessToSeerResearchData) throws TestingException{
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("SEERDataAccess"));
        SEERDataAccessRequestPageStepsImpl.enterEmailAddress349();
        MiscUtils.sleep(2000);
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerYouAlreadyHaveAccessToSeerResearchDataHeader);
        org.junit.Assert.assertEquals(youAlreadyHaveAccessToSeerResearchData,
                seerUserRegistrationPage.seerYouAlreadyHaveAccessToSeerResearchDataHeader.getText());
    }

    /**
     * Verifies that the landing page has a link for Seer Research plus instruction.
     *
     * @param youAlreadyHaveAccessToSeerResearchData The message that the user should see on the page when re-registering.
     */
    public static void theLandingPageHasLinkForSeerResearchPlusInstruction(String youAlreadyHaveAccessToSeerResearchData){
        JavascriptUtils.drawBlueBorder(seerUserRegistrationPage.seerHowToRequestAccessToSeerDataLink);
        CommonUtils.assertEquals(youAlreadyHaveAccessToSeerResearchData,
                seerUserRegistrationPage.seerHowToRequestAccessToSeerDataLink.getText());
        CucumberLogUtils.logScreenshot();
    }
}