package ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation;

import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Profile_Tab_After_Submission_Page;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Profile_Tab_Page;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import org.testng.Assert;

public class ApplicantProfileStepsImpl {

    /***
     * THIS METHOD LOGS INTO SSJ WITH AN IMPERSONATED USER
     * @param user
     */
    public static void ssjLogin(String user) {
        if (user.equals("OWM Vacancy Manager")) {

        } else if (user.equals("Stadtman Vacancy Manager")) {

        } else if (user.equals("Maria Chaudhry")) {
            Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate("Maria Chaudhry");
            MiscUtils.sleep(2000);
            PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("SSJPortalView"));
        }
    }

    /**
     * USE THIS METHOD TO SELECT THE HIGHEST EDUCATION WHEN FILLING OUT THE PROFILE PAGE
     *
     * @param highestDegree
     */
    public static void selects_highest_education(String highestDegree) {
            PlaywrightUtils.page.getByLabel(Profile_Tab_Page.highestLevelOfEducationDropDown).click();
            PlaywrightUtils.page.getByTitle(highestDegree).locator("div").click();
            CucumberLogUtils.playwrightScreenshot();
    }

    /**
     * USE THIS METHOD TO VERIFY THE FULL NAME THAT WAS SUBMITTED VIA THE PROFILE PAGE
     *
     * @param firstName
     * @param middleName
     * @param lastName
     */
    public static void user_verifies_that_first_name_middle_name_and_last_name_saved_display_as_expected(String firstName, String middleName, String lastName) {
        String actualName = PlaywrightUtils.page.locator(Profile_Tab_After_Submission_Page.fullNameHeader).innerText();
        Assert.assertEquals(actualName, firstName + " " + middleName + " " + lastName);
        CucumberLogUtils.playwrightScreenshot();
    }

    /**
     * USE THIS METHOD TO DYNAMICALLY VERIFY ADDRESS THAT WAS SUBMITTED VIA PROFILE PAGE
     *
     * @param address
     * @param aptNumber
     * @param city
     * @param state
     * @param country
     * @param zipCode
     */
    public static void verifies_that_the_saved_address_displays_with(String address, String aptNumber, String city, String state, String country, String zipCode) {
        String actualAddressText = PlaywrightUtils.page.locator(Profile_Tab_After_Submission_Page.addressText).innerText();
        String expectedAddressText = address + " " + aptNumber + "\n" +
                city + "," + " " + state + " " + zipCode + "\n" +
                country;
        Assert.assertEquals(actualAddressText, expectedAddressText);
        CucumberLogUtils.playwrightScreenshot();
    }

    /**
     * USE THIS METHOD TO VERIFY IF US CITIZENSHIP WAS SELECTED OR NOT VIA THE PROFILE PAGE
     *
     * @param expectedYesOrNo
     */
    public static void verifies_that_the_saved_us_citizenship_displays_as(String expectedYesOrNo) {
        String actualUSCitizenshipText = PlaywrightUtils.page.locator(Profile_Tab_After_Submission_Page.actualUSCitizenshipText).innerText();
        Assert.assertEquals(expectedYesOrNo, actualUSCitizenshipText);
        CucumberLogUtils.playwrightScreenshot();
    }

    /**
     * USE THIS METHOD TO VERIFY THE EMAIL ADDRESS THAT WAS SUBMITTED VIA THE PROFILE PAGE
     *
     * @param expectedEmail
     */
    public static void verifies_that_the_saved_email_address_displays_as(String expectedEmail) {
        String actualEmailText = PlaywrightUtils.page.locator(Profile_Tab_After_Submission_Page.emailText).innerText();
        Assert.assertEquals(actualEmailText, expectedEmail);
        CucumberLogUtils.playwrightScreenshot();
    }

    /**
     * USE THIS METHOD TO VERIFY THE HIGHEST EDUCATION THAT WAS SUBMITTED VIA THE PROFILE PAGE
     *
     * @param expectedHighestEducation
     */
    public static void verifies_that_the_saved_highest_education_displays_as(String expectedHighestEducation) {
        String actualHighestEducationText = PlaywrightUtils.page.locator(Profile_Tab_After_Submission_Page.highestLevelOfEducationText).innerText();
        Assert.assertEquals(actualHighestEducationText, expectedHighestEducation);
        CucumberLogUtils.playwrightScreenshot();
    }

    /**
     * USE THIS METHOD IS TO ASSERT ACTUAL AND EXPECTED BUSINESS PHONE NUMBER WHILE FILLING IN APPLICANT INFO
     *
     * @param expectedBusinessPhoneNumber
     */
    public static void verifies_that_the_saved_business_phone_number_displays_as(String expectedBusinessPhoneNumber) {
        String actualBusinessPhoneNumber = PlaywrightUtils.page.locator(Profile_Tab_After_Submission_Page.businessPhoneNumberText).innerText();
        String formattedExpectedBusinessPhoneNumber = CommonUtils.fixPhoneFormat(expectedBusinessPhoneNumber);
        Assert.assertEquals(actualBusinessPhoneNumber, formattedExpectedBusinessPhoneNumber);
        CucumberLogUtils.playwrightScreenshot();
    }

    /**
     * USE THIS METHOD TO ASSERT ACTUAL AND EXPECTED PHONE NUMBER WHILE FILLING IN APPLICANT INFO
     *
     * @param expectedPhoneNumber
     */
    public static void verifies_that_the_saved_phone_number_displays_as(String expectedPhoneNumber) {
        String actualPhoneNumber = PlaywrightUtils.page.locator(Profile_Tab_After_Submission_Page.phoneNumberText).innerText();
        String formattedExpectedPhoneNumber = CommonUtils.fixPhoneFormat(expectedPhoneNumber);
        Assert.assertEquals(actualPhoneNumber, formattedExpectedPhoneNumber);
        CucumberLogUtils.playwrightScreenshot();
    }

    /***
     * USE THIS METHOD TO EDIT DEMOGRAPHICS SECTION
     */
    public static void user_clicks_edit_for_demographics_section(){
        PlaywrightUtils.page.locator(Profile_Tab_Page.demographicsOptionalTab).click();
        PlaywrightUtils.page.locator(Profile_Tab_Page.demographicsEditButton).click();
    }

    /***
     * USE THIS METHOD TO SHARE DEMOGRAPHICS SECTION
     */
    public static void user_chooses_to_share_demographic_details(){
        PlaywrightUtils.page.locator(Profile_Tab_Page.demographicsOptionalTab).click();
        PlaywrightUtils.page.locator(Profile_Tab_Page.shareDemographicsRadioButton).click();
    }
}
