package ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation;

import Hooks.Hooks;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.*;
import ServiceNow.PlatformBusinessApps.SSJ.utils.SSJ_Constants;
import appsCommon.Pages.Playwright_Common_Locators;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.LoadState;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.*;
import org.testng.Assert;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.getSSJUrl;

public class ApplicantProfileStepsImpl {

    public static Page newPage;
    public static String timestamp;

    /***
     * THIS METHOD LOGS INTO SSJ WITH AN IMPERSONATED USER
     * @param user
     */
    public static void ssjLogin(String user) {
        if (user.equals("OWM Vacancy Manager")) {
            Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate("Holly Gemar-Griffith");
            CommonUtils.sleep(3000);
            PlaywrightUtils.page.navigate(getSSJUrl());
        } else if (user.equals("Maria Chaudhry")) {
            Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate("Maria Chaudhry");
            CommonUtils.sleep(3000);
            PlaywrightUtils.page.navigate(getSSJUrl());
        } else if(user.equals("OKTA_APPLICANT")) {
            Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login_Impersonate(ServiceNow.PlatformBusinessApps.SSJ.playwright.Utils.SSJ_Constants.OKTA_APPLICANT);
            CommonUtils.sleep(3000);
            PlaywrightUtils.page.navigate(getSSJUrl());
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
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
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
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
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
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * USE THIS METHOD TO VERIFY IF US CITIZENSHIP WAS SELECTED OR NOT VIA THE PROFILE PAGE
     *
     * @param expectedYesOrNo
     */
    public static void verifies_that_the_saved_us_citizenship_displays_as(String expectedYesOrNo) {
        String actualUSCitizenshipText = PlaywrightUtils.page.locator(Profile_Tab_After_Submission_Page.actualUSCitizenshipText).innerText();
        Assert.assertEquals(expectedYesOrNo, actualUSCitizenshipText);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * USE THIS METHOD TO VERIFY THE EMAIL ADDRESS THAT WAS SUBMITTED VIA THE PROFILE PAGE
     *
     * @param expectedEmail
     */
    public static void verifies_that_the_saved_email_address_displays_as(String expectedEmail) {
        String actualEmailText = PlaywrightUtils.page.locator(Profile_Tab_After_Submission_Page.emailText).innerText();
        Assert.assertEquals(actualEmailText, expectedEmail);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /**
     * USE THIS METHOD TO VERIFY THE HIGHEST EDUCATION THAT WAS SUBMITTED VIA THE PROFILE PAGE
     *
     * @param expectedHighestEducation
     */
    public static void verifies_that_the_saved_highest_education_displays_as(String expectedHighestEducation) {
        String actualHighestEducationText = PlaywrightUtils.page.locator(Profile_Tab_After_Submission_Page.highestLevelOfEducationText).innerText();
        Assert.assertEquals(actualHighestEducationText, expectedHighestEducation);
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
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
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
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
        CucumberLogUtils.playwrightScreenshot(PlaywrightUtils.page);
    }

    /***
     * USE THIS METHOD TO EDIT DEMOGRAPHICS SECTION
     */
    public static void user_clicks_edit_for_demographics_section() {
        PlaywrightUtils.page.locator(Profile_Tab_Page.demographicsEditButton).click();
    }

    /***
     * USE THIS METHOD TO SHARE DEMOGRAPHICS SECTION
     */
    public static void user_chooses_to_share_demographic_details() {
        PlaywrightUtils.page.locator(Profile_Tab_Page.demographicsOptionalTab).click();
        PlaywrightUtils.page.locator(Profile_Tab_Page.shareDemographicsRadioButton).click();
    }

    /**
     * Resets the vacancy before creating a new vacancy in the ServiceNow application.
     *
     * @param text The vacancy text to search for and reset.
     */
    public static void a_test_vacancy_is_reset_before_creating_a_vacancy(String text) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption("SCSS", "Vacancies");
        CommonUtils.sleep(2000);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).fill(text);
        page.frameLocator("iframe[name='gsft_main']").getByLabel("Search", new FrameLocator.GetByLabelOptions().setExact(true)).press("Enter");
        CucumberLogUtils.playwrightScreenshot(page);
        page.reload();
        CommonUtils.sleep(3000);
        try {
            if (page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: " + text).isVisible()) {
                page.frameLocator("iframe[name='gsft_main']").getByLabel("Open record: " + text).click();
                CucumberLogUtils.playwrightScreenshot(page);
                page.waitForLoadState();
                CommonUtils.sleep(2000);
                page.reload();
                CommonUtils.sleep(1000);
                page.frameLocator("iframe[name=\"gsft_main\"]").locator("#sysverb_delete").click();
                CucumberLogUtils.playwrightScreenshot(page);
                if (!page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Confirmation Help").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Delete")).isVisible()) {
                    page.reload();
                    CommonUtils.sleep(1000);
                }
                page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Confirmation Help").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Delete")).click();
                CommonUtils.sleep(2000);
            }
            Playwright_ServiceNow_Common_Methods.logOutOfNativeView();
        } catch (Exception e) {
            CucumberLogUtils.playwrightScreenshot(page);
            System.out.println("* * * VACANCY DOES NOT EXIST - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * VACANCY DOES NOT EXIST - TEST CONTINUES * * *");
            Playwright_ServiceNow_Common_Methods.logOutOfNativeView();
        }
    }

    /**
     * Method to perform actions when the user is on the SSJ landing page and the user is pw.
     * This method logs the user into SSJ using the provided user and takes a screenshot of the page.
     *
     * @param user The user to impersonate while logging into SSJ.
     */
    public static void user_is_on_ssj_landing_page_and_user_is_pw(String user) {
        ApplicantProfileStepsImpl.ssjLogin(user);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Method to perform click action on an element identified by its text value.
     * This method also takes a screenshot of the page after the click action is performed.
     *
     * @param text The text value of the element to be clicked.
     */
    public static void clicks_on_pw(String text) {
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the vacancy title name in the specified field and takes a screenshot.
     *
     * @param vacancyName The name of the vacancy title to enter.
     */
    public static void enters_vacancy_title_name_pw(String vacancyName) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        timestamp = dtf.format(now);
        page.getByPlaceholder("Please enter").fill(vacancyName + " " + timestamp);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the vacancy description in the specified field and takes a screenshot.
     *
     * @param vacancyDescription The description of the vacancy to enter.
     */
    public static void enters_vacancy_description_pw(String vacancyDescription) {
        page.locator("#BasicInfo_description div").nth(2).fill(vacancyDescription);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects an option for the point of contact using Playwright.
     * After selecting the option, a screenshot is taken and attached to the Cucumber report.
     *
     * @param text The text value of the option to be selected.
     */
    public static void selects_for_point_of_contact_pw(String text) {
        Playwright_Common_Utils.scrollIntoView("//input[@aria-owns='BasicInfo_isUserPoc_list']");
        page.getByLabel("Are you the point of contact").click();
        page.getByText(text, new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Unselects the option for cover letter.
     * This method unchecks the option for cover letter on the page using the specified locator.
     * After unchecking the option, a screenshot is taken using the playwrightScreenshot method from CucumberLogUtils class and attached to the Cucumber report.
     */
    public static void unselects_the_option_for_cover_letter() {
        page.locator("#BasicInfo_applicationDocuments_1_isDocumentOptional").uncheck();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Performs a click action on a checkbox element identified by its text value.
     * After clicking the checkbox, a screenshot is taken and attached to the Cucumber report.
     *
     * @param text The text value of the checkbox element to be clicked.
     */
    public static void checks_check_box(String text) {
        page.getByText(text, new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects a reference collection date ten days from today.
     * <p>
     * This method waits for the page to load, clicks on the "Reference Collection Date" element,
     * fills the date input field with the date ten days from today, and selects the corresponding
     * date from the calendar options that is equal to ten days from today. A screenshot of the page
     * is taken after the reference collection date is selected.
     */
    public static void selects_a_reference_collection_date_ten_days_from_today() {
        page.waitForLoadState();
        page.getByLabel("Reference Collection Date").click();
        page.locator("//div[@class='ant-picker ant-picker-focused']//input[@placeholder='Select date']").fill(CommonUtils.getDateAfterTenDaysIn_MM_DD_YYYY_format());
        List<ElementHandle> list = page.querySelectorAll(Vacancy_Dashboard_Page.closeDateCalendarOptions);
        for (ElementHandle day : list) {
            if (day.getAttribute("title").trim().equals(CommonUtils.getDateAfterTenDaysIn_YYYY_MM_DD_format().trim())) {
                page.locator("(//*[@title='" + CommonUtils.getDateAfterTenDaysIn_YYYY_MM_DD_format() + "'])[2]").click();
                break;
            }
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects the option for full contact details for references.
     *
     * @param text The text value of the option to be selected.
     */
    public static void selects_for_full_contact_details_for_references(String text) {
        Playwright_Common_Utils.scrollIntoView("//div[@class='ant-slider Slider ant-slider-horizontal ant-slider-with-marks']//span[@class='ant-slider-mark-text ant-slider-mark-text-active'][normalize-space()='" + text + "']");
        page.locator("//div[@class='ant-slider Slider ant-slider-horizontal ant-slider-with-marks']//span[@class='ant-slider-mark-text ant-slider-mark-text-active'][normalize-space()='" + text + "']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects an option for position classification from the drop-down menu.
     *
     * @param text The text value of the option to be selected.
     */
    public static void selects_for_position_classification_drop_down(String text) {
        page.locator(".PATSPicker > .ant-form-item > .ant-row > div:nth-child(2) > .ant-form-item-control-input > .ant-form-item-control-input-content > .ant-select > .ant-select-selector").first().click();
        page.getByTitle(text, new Page.GetByTitleOptions().setExact(true)).locator("div").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects an option for the organizational code drop-down.
     *
     * @param option The option to be selected in the drop-down.
     */
    public static void selects_for_organizational_code_drop_down(String option) {
        page.locator("div:nth-child(2) > .ant-form-item > .ant-row > div:nth-child(2) > .ant-form-item-control-input > .ant-form-item-control-input-content > .ant-select > .ant-select-selector").first().click();
        page.getByTitle(option, new Page.GetByTitleOptions().setExact(true)).locator("div").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Method to perform click action on an element identified by its text value.
     * This method also takes a screenshot of the page after the click action is performed.
     *
     * @param text The text value of the element to be clicked.
     */
    public static void clicks(String text) {
        page.waitForSelector(Playwright_Common_Locators.dynamicTextLocator(text));
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
        CommonUtils.sleep(2000);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clicks the "Save" button for mandatory statements.
     * <p>
     * This method simulates a delay of 5000 milliseconds using the CommonUtils.sleep() method.
     * It then locates the "Save" button element using the specified locator and performs a click action.
     * After clicking the button, a screenshot of the page is taken using the CucumberLogUtils.playwrightScreenshot() method.
     */
    public static void clicks_save_for_mandatory_statements() {
        CommonUtils.sleep(5000);
        page.locator("(//button[@class='ant-btn ant-btn-primary wider-button'])[1]").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects a committee member with a chair role.
     *
     * @param name The name of the committee member to be selected.
     */
    public static void selects_for_committee_member_with_chair_role(String name) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("plus Add Member")).click();
        page.locator(".css-yk16xz-control").click();
        page.getByText(name, new Page.GetByTextOptions().setExact(true)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("check Save")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects a committee member with an executive secretary role.
     *
     * @param name The name of the committee member to be selected.
     */
    public static void selects_for_committee_member_with_executive_secretary_role(String name) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("plus Add Member")).click();
        page.locator(".css-1hwfws3").click();
        page.getByText(name, new Page.GetByTextOptions().setExact(true)).click();
        page.getByText("Member", new Page.GetByTextOptions().setExact(true)).click();
        page.getByTitle("Executive Secretary (non-").locator("div").click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("check Save")).click();
    }

    /**
     * Performs a click action on the "Save" button for email templates.
     * This method simulates a delay of 2000 milliseconds using the CommonUtils.sleep() method.
     * It then scrolls the specified element into view using Playwright_Common_Utils.scrollIntoView().
     * Finally, it clicks the "Save" button element using the specified locator.
     * After clicking the button, a screenshot of the page is taken using the CucumberLogUtils.playwrightScreenshot() method.
     */
    public static void clicks_save_for_email_templates() {
        CommonUtils.sleep(2000);
        Playwright_Common_Utils.scrollIntoView("//button[@class='ant-btn ant-btn-primary wider-button']");
        page.locator("//button[@class='ant-btn ant-btn-primary wider-button']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method scrolls into view the "Review and Finalize" section and verifies that it is displayed.
     * It takes a screenshot of the page after the verification.
     */
    public static void user_is_able_to_see_the_review_and_finalize_section_with_the_vacancy_information_submitted() {
        Playwright_Common_Utils.scrollIntoView(("(//h3[normalize-space()='Review and Finalize'])[1]"));
        Hooks.softAssert.assertTrue(page.locator("(//h3[normalize-space()='Review and Finalize'])[1]").isVisible(), "* * * VERIFYING REVIEW AND FINALIZE SECTION IS DISPLAYED * * *");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the vacancy title matches the given vacancy title.
     *
     * @param vacancyTitle The vacancy title to verify.
     */
    public static void verifies_vacancy_title(String vacancyTitle) {
        Hooks.softAssert.assertEquals(page.locator("((//div[@class='SectionContent'])[1]/div[1]/div/p)[1]").innerText(), vacancyTitle + " " + timestamp);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the given text matches the close date of a set.
     *
     * @param text The text to compare with the close date of a set.
     */
    public static void verifies_utilize_a_set_close_date_is(String text) {
        Hooks.softAssert.assertEquals(page.locator("((//div[@class='SectionContent'])[1]/div[1]/div/p)[2]").innerText(), text);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the HR Specialist is allowed to triage the given text.
     *
     * @param text The text to be verified.
     */
    public static void verifies_allow_hr_specialist_to_triage_is(String text) {
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='SectionContent'])[1]/div[2]/p").innerText(), text);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the vacancy description displayed on the page matches the given text.
     * Takes a screenshot of the page after the verification.
     *
     * @param text The text of the vacancy description to verify.
     */
    public static void verifies_vacancy_description(String text) {
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='SectionContent'])[1]/div[3]").innerText(), text);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the vacancy point of contact information is with the email address.
     *
     * @param fullNameText The full name of the point of contact.
     * @param emailText    The email address of the point of contact.
     */
    public static void verifies_vacancy_point_of_contact_information_is_with_email_address(String fullNameText, String emailText) {
        Hooks.softAssert.assertEquals(page.locator("//html/body/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[5]/div[2]/div[4]/div/p").innerText(), fullNameText + "\n" + emailText);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the open date displayed on the page is today's date.
     * <p>
     * This method compares the open date displayed on the page with the current date in the format "MM/DD/YYYY".
     * If the open date matches the current date, it passes the assertion. Otherwise, it fails the assertion.
     * The method also captures a screenshot of the page using Playwright.
     */
    public static void verifies_open_date_is_todays_date() {
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='DateCard']/p)[1]").innerText(), CommonUtils.getCurrentDateIn_MM_DD_YYYY_format());
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the application documents, such as curriculum vitae, cover letter, vision statement, and qualification statement, match the expected values.
     *
     * @param curriculumVitaeText        The expected text of the curriculum vitae.
     * @param coverLetterText            The expected text of the cover letter.
     * @param visionStatementText        The expected text of the vision statement.
     * @param qualificationStatementText The expected text of the qualification statement.
     */
    public static void verifies_application_documents(String curriculumVitaeText, String coverLetterText, String visionStatementText, String qualificationStatementText) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(curriculumVitaeText);
        expectedValues.add(coverLetterText);
        expectedValues.add(visionStatementText);
        expectedValues.add(qualificationStatementText);
        List<ElementHandle> values = page.querySelectorAll("//html/body/div[2]/div[2]/div/div[2]/div/div[3]/div[1]/div[5]/div[2]/ul[1]/li");
        for (int i = 0; i < values.size(); i++) {
            String actualValue = values.get(i).innerText();
            Assert.assertEquals(actualValue, expectedValues.get(i));
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the reference collection is equal to the given text.
     *
     * @param text The expected text of the reference collection.
     */
    public static void verifies_reference_collection_is(String text) {
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='SectionContent'])[1]/div[6]/p").innerText(), text);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the collection date is ten days from today.
     * This method compares the collection date displayed on the page
     * with the date calculated as ten days from today. If the two dates
     * are equal, the test passes. Otherwise, the test fails.
     * <p>
     * This method uses the following steps:
     * 1. Retrieves the collection date displayed on the page
     * 2. Calculates the date that is ten days from today
     * 3. Compares the two dates
     * 4. Takes a screenshot of the page for logging purposes
     *
     * @throws AssertionError if the collection date is not ten days from today
     */
    public static void verifies_collection_date_is_ten_days_from_today() {
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='SectionContent'])[1]/div[7]/p").innerText(), CommonUtils.getTenDaysFromToday_In_MM_DD_YYYY_format());
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if reference recommendations are required for this vacancy.
     *
     * @param text The text to compare with the retrieved reference recommendation text.
     */
    public static void verifies_reference_recommendations_are_required_for_this_vacancy(String text) {
        page.waitForLoadState();
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='SectionContent'])[1]/ul[2]/li").innerText(), text);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if scoring categories are required for this vacancy.
     *
     * @param text The expected text to verify against the scoring categories in the vacancy.
     * @see Hooks#softAssert
     * @see CucumberLogUtils#playwrightScreenshot
     */
    public static void verifies_scoring_categories_are_required_for_this_vacancy(String text) {
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='SectionContent'])[1]/div[8]/ul/li").innerText(), text);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the organizational code matches the given text in the specified page.
     *
     * @param text The expected text value to compare with the organizational code.
     */
    public static void verifies_organizational_code_is(String text) {
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='SectionContent'])[1]/ul[3]/p").innerText(), text);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the position classification is as expected.
     * <p>
     * This method scrolls into view the position classification element on the page,
     * compares its text with the given input text, and takes a screenshot for logging purposes.
     *
     * @param text The expected position classification text to be verified.
     */
    public static void verifies_position_classification_is(String text) {
        Playwright_Common_Utils.scrollIntoView("(//div[@class='SectionContent'])[1]/ul[4]/p");
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='SectionContent'])[1]/ul[4]/p").innerText(), text);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the personnel action tracking solution (PATS) initiator is the expected text.
     *
     * @param text the expected text for the personnel action tracking solution (PATS) initiator
     */
    public static void verifies_personnel_action_tracking_solution_pats_initiator_is(String text) {
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='SectionContent'])[1]/div[9]/ul/p").innerText(), text);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the mandatory statements are displayed.
     *
     * @param valueOne   the first expected value
     * @param valueTwo   the second expected value
     * @param valueThree the third expected value
     * @param valueFour  the fourth expected value
     */
    public static void verifies_mandatory_statements_and_are_displayed(String valueOne, String valueTwo, String valueThree, String valueFour) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(valueOne);
        expectedValues.add(valueTwo);
        expectedValues.add(valueThree);
        expectedValues.add(valueFour);
        List<ElementHandle> values = page.querySelectorAll("(//div[@class='SectionContent'])[2]/div/ul/li");
        for (int i = 0; i < values.size(); i++) {
            String actualValue = values.get(i).innerText();
            Assert.assertEquals(actualValue, expectedValues.get(i));
        }
    }

    /**
     * Verifies that the committee member is displayed with the specified name and role.
     *
     * @param name The name of the committee member to verify.
     * @param role The role of the committee member to verify.
     */
    public static void verifies_committee_member_is_displayed_with_role(String name, String role) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(name);
        expectedValues.add(role);
        if (name.equals("David Rampulla")) {
            List<ElementHandle> values = page.querySelectorAll("(//div[@class='SectionContent'])[3]/div/div/div/div/div/div/table/tbody/tr[1]/td");
            Assert.assertEquals(values.stream().map(ElementHandle::innerText).collect(Collectors.toList()), expectedValues);
        } else if (name.equals("Jay Kurani")) {
            List<ElementHandle> values = page.querySelectorAll("(//div[@class='SectionContent'])[3]/div/div/div/div/div/div/table/tbody/tr[2]/td");
            Assert.assertEquals(values.stream().map(ElementHandle::innerText).collect(Collectors.toList()), expectedValues);
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies the email templates by comparing the expected values with the actual values retrieved from the web page.
     *
     * @param valueOne   The expected value for the first template.
     * @param valueTwo   The expected value for the second template.
     * @param valueThree The expected value for the third template.
     * @param valueFour  The expected value for the fourth template.
     * @param valueFive  The expected value for the fifth template.
     */
    public static void verifies_email_templates(String valueOne, String valueTwo, String valueThree, String valueFour, String valueFive) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(valueOne);
        expectedValues.add(valueTwo);
        expectedValues.add(valueThree);
        expectedValues.add(valueFour);
        expectedValues.add(valueFive);
        List<ElementHandle> values = page.querySelectorAll("(//div[@class='SectionContent'])[4]/div/ul/li");
        Assert.assertEquals(values.stream().map(ElementHandle::innerText).collect(Collectors.toList()), expectedValues);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clicks on the vacancy title in the page.
     *
     * @param vacancyTitle The title of the vacancy to be clicked.
     */
    public static void clicks_on_vacancy_title(String vacancyTitle) {
        List<ElementHandle> pagination = page.querySelectorAll("//a[@rel='nofollow']");
        for (ElementHandle itemPage : pagination) {
            if (page.querySelector("//a[normalize-space()='" + vacancyTitle + " " + timestamp + "']") != null) {
                page.locator("//a[normalize-space()='" + vacancyTitle + " " + timestamp + "']").click();
                break;
            } else {
                itemPage.click();
            }
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Proceeds with completing the profile by clicking on the specified text.
     *
     * @param text the text to be clicked on
     */
    public static void proceeds_with_completing_profile_by_clicking(String text) {
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method inputs the given string value into the first name field on the webpage's profile tab.
     * It also captures a screenshot using Playwright.
     *
     * @param firstName The string value to be inputted into the first name field.
     */
    public static void user_inputs_into_first_name_field_pw(String firstName) {
        page.locator(Profile_Tab_Page.firstNameTextBox).fill(firstName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * The user_inputs_into_middle_name_field_pw method is used to input a middle name into the middle name field on the profile page.
     *
     * @param middleName The middle name to be inputted.
     */
    public static void user_inputs_into_middle_name_field_pw(String middleName) {
        page.locator(Profile_Tab_Page.middleNameTextBox).fill(middleName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Fills the last name field with the provided last name and takes a screenshot.
     *
     * @param lastName the last name to be entered into the last name field
     */
    public static void user_inputs_into_last_name_field_pw(String lastName) {
        page.locator(Profile_Tab_Page.lastNameTextBox).fill(lastName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method inputs the given email into the email field on the page and captures a screenshot.
     *
     * @param email the email to be inputted into the email field
     */
    public static void user_inputs_into_email_field_pw(String email) {
        page.getByLabel(Profile_Tab_Page.emailTextBox).fill(email);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to input a phone number into the phone field on a web page.
     *
     * @param phoneNumber The phone number to be entered into the phone field.
     */
    public static void user_inputs_into_phone_field_pw(String phoneNumber) {
        page.locator(Profile_Tab_Page.phoneNumberTextBox).fill(phoneNumber);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to input a value into the business phone field on the profile tab page.
     *
     * @param businessPhone the value to be entered into the business phone field
     */
    public static void user_inputs_into_business_phone_field_pw(String businessPhone) {
        page.locator(Profile_Tab_Page.businessPhoneNumberTextBox).fill(businessPhone);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Confirms that the user is a U.S. citizen.
     * <p>
     * This method selects the "Yes" radio button on the "Are You a U.S. Citizen?" section of the profile tab page.
     * It also takes a screenshot using CucumberLogUtils.playwrightScreenshot method.
     */
    public static void user_confirms_being_a_us_citizen_pw() {
        page.getByLabel(Profile_Tab_Page.are_You_A_US_Citizen_Yes_Radio_Button).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * User inputs the address into the address field password.
     *
     * @param address The address to be input.
     */
    public static void user_inputs_into_address_field_pw(String address) {
        page.getByLabel(Profile_Tab_Page.addressTextBox).fill(address);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * User inputs the apartment number into the application's number field.
     * <p>
     * This method fills the apartment number text box on the page with the provided apartment number.
     * It also takes a screenshot of the page using Playwright.
     *
     * @param aptNumber the apartment number to be entered into the text box
     */
    public static void user_inputs_into_app_number_field_pw(String aptNumber) {
        page.locator(Profile_Tab_Page.apartmentOrSuiteNumberTextBox).fill(aptNumber);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * User inputs the city into the city field on the Profile Tab Page and takes a screenshot.
     *
     * @param city The city to be entered into the city field.
     */
    public static void user_inputs_into_city_field_pw(String city) {
        page.getByLabel(Profile_Tab_Page.cityTextBox).fill(city);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to input a value into the state field on a web page.
     *
     * @param state The value to be entered into the state field
     */
    public static void user_inputs_into_state_field_pw(String state) {
        page.getByLabel(Profile_Tab_Page.stateTextBox).fill(state);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Allows the user to input a country into the country field in the Profile Tab.
     *
     * @param country the country to be inputted into the country field
     */
    public static void user_inputs_into_country_field_pw(String country) {
        page.getByLabel(Profile_Tab_Page.countryTextBox).fill(country);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Method to input a zip code into the zip code field in the password page.
     *
     * @param zipCode the zip code value to be entered
     */
    public static void user_inputs_into_zip_field_pw(String zipCode) {
        page.getByLabel(Profile_Tab_Page.zipCodeTextBox).fill(zipCode);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method clicks on the save application button in the user profile page and takes a screenshot using Playwright.
     *
     * @implNote This method assumes that the page object has been initialized and the save button is located on the profile tab page.
     */
    public static void user_clicks_on_save_application_button_pw() {
        page.locator(Profile_Tab_Page.saveButton).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Navigates to the tab to be able to apply to a vacancy after creating a profile.
     *
     * @param text The text used to locate the tab.
     */
    public static void navigates_to_the_tab_to_be_able_to_apply_to_a_vacancy_after_creating_a_profile(String text) {
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Checks if the user is on the expected page.
     *
     * @param expectedApplicationText The expected application text on the page.
     */
    public static void user_is_on_the_page(String expectedApplicationText) {
        String actualApplicationText = page.locator("(//h3)[1]").innerText();
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualApplicationText, expectedApplicationText);
    }

    /**
     * Uploads a cover letter to the application documents page.
     * <p>
     * This method is used to upload a cover letter to the application documents page. It locates the
     * "Cover Letter" file input element on the page and sets the input files to the specified file path.
     * If the "Cover Letter" option is not displayed, it logs a message and continues with the test.
     * After uploading the cover letter, it captures a screenshot of the page using CucumberLogUtils.
     *
     * @see ApplicationDocumentsPage
     * @see CucumberLogUtils
     */
    public static void uploads_cover_letter() {
        try {
            ElementHandle fileInput = page.querySelector(ApplicationDocumentsPage.dynamicDocLocator("Cover Letter"));
            fileInput.setInputFiles(Paths.get(SSJ_Constants.SSJ_COVER_LETTER));
        } catch (Exception e) {
            System.out.println("* * * COVER LETTER OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * COVER LETTER OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Uploads the qualification statement document.
     * This method searches for the "Qualification Statement" file input element on the page and sets the input file path to the constant SSJ_QUALIFICATION_STATEMENT.
     * If the "Qualification Statement" option is not displayed, it logs a warning message and continues with the test execution.
     * After uploading the document, it takes a screenshot using the CucumberLogUtils class.
     *
     * @throws Exception if an error occurs while uploading the qualification statement document.
     */
    public static void uploads_qualification_statement() {
        try {
            ElementHandle fileInput = page.querySelector(ApplicationDocumentsPage.dynamicDocLocator("Qualification Statement"));
            fileInput.setInputFiles(Paths.get(SSJ_Constants.SSJ_QUALIFICATION_STATEMENT));
        } catch (Exception e) {
            System.out.println("* * * QUALIFICATION STATEMENT OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * QUALIFICATION STATEMENT OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Uploads a curriculum vitae if the curriculum vitae option is displayed.
     * <p>
     * This method locates the file input element corresponding to the "Curriculum Vitae (CV)" option on the application documents page.
     * It then sets the input file to the file located at the path specified in the SSJ_CURRICULUM_VITAE_CV constant.
     * <p>
     * If the curriculum vitae option is not displayed, an exception is caught and a message is printed to the console.
     * <p>
     * After uploading the curriculum vitae, a screenshot is taken using the CucumberLogUtils.playwrightScreenshot method.
     */
    public static void uploads_a_curriculum_vitae_if_curriculum_vitae_option_is_displayed() {
        try {
            ElementHandle fileInput = page.querySelector(ApplicationDocumentsPage.dynamicDocLocator("Curriculum Vitae (CV)"));
            fileInput.setInputFiles(Paths.get(SSJ_Constants.SSJ_CURRICULUM_VITAE_CV));
        } catch (Exception e) {
            System.out.println("* * * CURRICULUM VITAE OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * CURRICULUM VITAE OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Uploads a vision statement if the vision statement option is displayed.
     * If the vision statement option is not displayed, the test continues without uploading the vision statement.
     * Takes a screenshot after the upload.
     */
    public static void uploads_a_vision_statement_if_vision_statement_option_is_displayed() {
        try {
            ElementHandle fileInput = page.querySelector(ApplicationDocumentsPage.dynamicDocLocator("Vision Statement"));
            fileInput.setInputFiles(Paths.get(SSJ_Constants.SSJ_VISION_STATEMENT));
        } catch (Exception e) {
            System.out.println("* * * VISION STATEMENT OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * VISION STATEMENT OPTION IS NOT DISPLAYED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the first name in the reference one input field.
     *
     * @param firstNameText the first name to be entered
     */
    public static void user_enters_reference_one_first_name(String firstNameText) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[1]").fill(firstNameText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the middle name text into the reference one input field.
     *
     * @param middleNameText the text to enter as the middle name
     */
    public static void enters_reference_one_middle_name(String middleNameText) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[2]").fill(middleNameText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the last name text for reference one.
     *
     * @param lastNameText The last name text to be entered for reference one.
     */
    public static void enters_reference_one_last_name(String lastNameText) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[3]").fill(lastNameText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the specified email address into the reference one input field.
     *
     * @param emailAddress the email address to enter
     */
    public static void enters_reference_one_email_address(String emailAddress) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[4]").fill(emailAddress);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the provided phone number as the first reference in the form.
     *
     * @param phoneNumber the phone number to enter as the reference
     */
    public static void enters_reference_one_phone_number(String phoneNumber) {
        try {
            page.locator("(//input[@placeholder='(123) 456-7890'])[1]").fill(phoneNumber);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects the reference one relationship as specified.
     *
     * @param relationship the relationship to select
     */
    public static void selects_reference_one_relationship_as(String relationship) {
        try {
            page.locator("(//input[@role='combobox'])[1]").click();
            page.getByTitle(relationship).locator("div").click();
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the position title in the reference one position field.
     *
     * @param positionTitle the title of the position in the reference one field
     */
    public static void enters_reference_one_position_title(String positionTitle) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[5]").fill(positionTitle);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the name of an organization in the reference one field.
     *
     * @param organizationName the name of the organization to be entered
     * @throws Exception if an error occurs while entering the organization name
     */
    public static void enters_reference_one_organization_name(String organizationName) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[6]").fill(organizationName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE ONE OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * If reference two is required, then the user enters the first name of reference two.
     *
     * @param firstName The first name of reference two that the user wants to enter.
     */
    public static void if_reference_two_is_required_then_user_enters_reference_two_first_name(String firstName) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[7]");
            page.locator("(//input[@placeholder='Please Enter'])[7]").fill(firstName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the middle name for the second reference in a form.
     *
     * @param middleName the middle name of the second reference
     */
    public static void enters_reference_two_middle_name(String middleName) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[7]");
            page.locator("(//input[@placeholder='Please Enter'])[8]").fill(middleName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the last name for the second reference.
     *
     * @param lastName the last name to enter for the reference
     */
    public static void enters_reference_two_last_name(String lastName) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[7]");
            page.locator("(//input[@placeholder='Please Enter'])[9]").fill(lastName);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the provided email address in the reference two email address input field.
     *
     * @param emailAddressText the email address to be entered
     */
    public static void enters_reference_two_email_address(String emailAddressText) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[7]");
            page.locator("(//input[@placeholder='Please Enter'])[10]").fill(emailAddressText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the reference two phone number.
     *
     * @param phoneNumberText the phone number to be entered as a reference two
     * @throws Exception if an error occurs while entering the phone number
     */
    public static void enters_reference_two_phone_number(String phoneNumberText) {
        try {
            Playwright_Common_Utils.scrollIntoView("(//input[@placeholder='Please Enter'])[7]");
            page.locator("(//input[@placeholder='(123) 456-7890'])[2]").fill(phoneNumberText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects the "Reference Two" relationship as a co-worker.
     * <p>
     * This method selects the "Reference Two" relationship as a co-worker by clicking on the input field,
     * focusing on it and using the arrow keys to navigate to the desired option. Then, it presses the Enter key
     * to make the selection. If the "Reference Two" option is not required, the method continues the test without
     * selecting it and logs the message "REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES".
     * <p>
     * After making the selection, a screenshot of the page is taken using Playwright and logged using Cucumber logging.
     *
     * @throws Exception if any error occurs during the execution of the method
     */
    public static void selects_reference_two_relationship_as_co_worker() {
        try {
            page.locator("(//input[@role='combobox'])[2]").click();
            page.locator("(//input[@role='combobox'])[2]").focus();
            for (int i = 0; i < 1; i++) {
                page.keyboard().press("ArrowDown");
                page.waitForTimeout(200);
            }
            page.keyboard().press("Enter");
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the title text in the second position of the reference on the page.
     *
     * @param titleText the text to be entered as the title in the reference.
     */
    public static void enters_reference_two_position_title(String titleText) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[11]").fill(titleText);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enters the name of the second organization in the reference field.
     *
     * @param organizationTextBox the name of the second organization to enter
     */
    public static void enters_reference_two_organization_name(String organizationTextBox) {
        try {
            page.locator("(//input[@placeholder='Please Enter'])[12]").fill(organizationTextBox);
        } catch (Exception e) {
            System.out.println("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * REFERENCE TWO OPTION IS NOT REQUIRED - TEST CONTINUES * * *");
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clicks on the "I want to share my" button on the page and
     * takes a screenshot using CucumberLogUtils.playwrightScreenshot() method.
     * This method is used when the user agrees to share their demographic
     * details to help improve the hiring process.
     */
    public static void user_agrees_to_share_demographic_details_and_help_improve_the_hiring_process() {
        page.getByText("I want to share my").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects the gender on the page.
     *
     * @param gender The gender to be selected. It can be either "male" or "female".
     */
    public static void selects_for_sex(String gender) {
        page.getByText(gender, new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects an option for a specific ethnicity.
     *
     * @param ethnicity The ethnicity option to be selected.
     */
    public static void selects_for_ethnicity(String ethnicity) {
        Playwright_Common_Utils.scrollIntoView(ethnicity, true);
        page.getByText(ethnicity, new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to select options for a race.
     *
     * @param americanIndianOrAlaska Specify the option for American Indian or Alaska.
     * @param asia                   Specify the option for Asia.
     * @param blackOrAfricanAmerican Specify the option for Black or African American.
     * @param nativeHawaiianOrOther  Specify the option for Native Hawaiian or Other.
     * @param white                  Specify the option for White.
     */
    public static void selects_for_race(String americanIndianOrAlaska, String asia, String blackOrAfricanAmerican, String nativeHawaiianOrOther, String white) {
        Playwright_Common_Utils.scrollIntoView(americanIndianOrAlaska, false);
        page.getByText(americanIndianOrAlaska).click();
        page.getByText(asia).click();
        page.getByText(blackOrAfricanAmerican).click();
        page.getByText(nativeHawaiianOrOther).click();
        page.getByText(white).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Selects an option related to a disability or serious health condition on the page.
     *
     * @param text The text of the option to select.
     */
    public static void selects_for_disability_or_serious_health_condition(String text) {
        Playwright_Common_Utils.scrollIntoView(text, true);
        page.getByText(text).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies the basic information of a user.
     *
     * @param firstName        The first name of the user.
     * @param middleName       The middle name of the user.
     * @param lastName         The last name of the user.
     * @param email            The email of the user.
     * @param phone            The phone number of the user.
     * @param businessPhone    The business phone number of the user.
     * @param highestEducation The highest education level of the user.
     * @param usCitizenship    The US citizenship status of the user.
     */
    public static void user_verifies_basic_information_and(String firstName, String middleName, String lastName, String email, String phone, String businessPhone, String highestEducation, String usCitizenship) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(firstName);
        expectedValues.add(middleName);
        expectedValues.add(lastName);
        expectedValues.add(email);
        expectedValues.add("+1" + phone);
        expectedValues.add("+1" + businessPhone);
        expectedValues.add(highestEducation);
        expectedValues.add(usCitizenship);
        ArrayList<String> actualValues = new ArrayList<>();
        for (int i = 2; i <= 9; i++) {
            actualValues.add(page.locator("(//h2)[" + i + "]//following-sibling::span").innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualValues, expectedValues);
        Assert.assertEquals(actualValues.size(), expectedValues.size());
    }

    /**
     * Verifies the demographics information provided by the user.
     *
     * @param sharingDemographicsText The expected value of the sharing demographics text.
     * @param sexText                 The expected value of the sex text.
     * @param ethnicityText           The expected value of the ethnicity text.
     * @param raceText                The expected value of the race text.
     * @param disabilityText          The expected value of the disability text.
     */
    public static void user_verifies_demographics_information_and(String sharingDemographicsText, String sexText, String ethnicityText, String raceText, String disabilityText) {
        Playwright_Common_Utils.scrollIntoView("(//h2)[17]//following-sibling::span");
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(sharingDemographicsText);
        expectedValues.add(sexText);
        expectedValues.add(ethnicityText);
        expectedValues.add(raceText);
        expectedValues.add(disabilityText);
        ArrayList<String> actualValues = new ArrayList<>();
        for (int i = 17; i <= 21; i++) {
            actualValues.add(page.locator("(//h2)[" + i + "]//following-sibling::span").innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualValues, expectedValues);
        Assert.assertEquals(actualValues.size(), expectedValues.size());
    }

    /**
     * Verifies the references information provided by the user.
     *
     * @param firstNameText    The first name of the user.
     * @param lastNameText     The last name of the user.
     * @param emailText        The email address of the user.
     * @param phoneNumberText  The phone number of the user.
     * @param relationshipText The relationship of the user.
     * @param titleText        The title of the user.
     * @param organizationText The organization of the user.
     */
    public static void user_verifies_references_information(String firstNameText, String lastNameText, String emailText, String phoneNumberText, String relationshipText, String titleText, String organizationText) {
        Playwright_Common_Utils.scrollIntoView("(//tbody/tr/td)[7]");
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(firstNameText + " " + lastNameText);
        expectedValues.add(emailText);
        expectedValues.add(phoneNumberText);
        expectedValues.add(relationshipText);
        expectedValues.add(titleText);
        expectedValues.add(organizationText);
        ArrayList<String> actualValues = new ArrayList<>();
        for (int i = 7; i <= 12; i++) {
            actualValues.add(page.locator("(//tbody/tr/td)[" + i + "]").innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(actualValues, expectedValues);
    }

    /**
     * Verifies that the user's references contain the expected information.
     *
     * @param firstNameText    The first name of the user's reference.
     * @param lastNameText     The last name of the user's reference.
     * @param emailText        The email of the user's reference.
     * @param phoneNumberText  The phone number of the user's reference.
     * @param relationshipText The relationship of the user's reference.
     * @param titleText        The title of the user's reference.
     * @param organizationText The organization of the user's reference.
     */
    public static void user_verifies_references_two_information(String firstNameText, String lastNameText, String emailText, String phoneNumberText, String relationshipText, String titleText, String organizationText) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(firstNameText + " " + lastNameText);
        expectedValues.add(emailText);
        expectedValues.add(phoneNumberText);
        expectedValues.add(relationshipText);
        expectedValues.add(titleText);
        expectedValues.add(organizationText);
        ArrayList<String> actualValues = new ArrayList<>();
        for (int i = 13; i <= 18; i++) {
            actualValues.add(page.locator("(//tbody/tr/td)[" + i + "]").innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(actualValues, expectedValues);
    }

    /**
     * Checks if either a cover letter, qualification statement, curriculum vitae (CV), vision statement, or all were uploaded.
     * If any of the documents were uploaded, they will be displayed in the application documents section.
     */
    public static void if_either_a_cover_letter_qualification_statement_curriculum_vitae_cv_or_vision_statement_or_all_were_uploaded_then_documents_are_displayed_in_the_application_documents_section() {
        page.waitForLoadState(LoadState.NETWORKIDLE);
        CommonUtils.sleep(1000);
        List<ElementHandle> actualValues = page.querySelectorAll("//div[@class='SectionContent'][5]/div");
        ArrayList<String> values = new ArrayList<>();
        for (ElementHandle actualValue : actualValues) {
            values.add(actualValue.innerText());
        }
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add("✓ Cover Letter" + "\n" + " SSJ_COVER_LETTER_TEST.docx");
        expectedValues.add("✓ Qualification Statement" + "\n" + " SSJ_QUALIFICATION_STATEMENT_TEST.pdf");
        expectedValues.add("✓ Curriculum Vitae (CV)" + "\n" + " SSJ_CURRICULUM_VITAE_(CV).docx");
        expectedValues.add("✓ Vision Statement" + "\n" + " SSJ_VISION_STATEMENT_TEST.pdf");
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertTrue(expectedValues.containsAll(values), "* * * VERIFYING UPLOADED DOCUMENTS * * *");
    }

    /**
     * Verifies that the "Your Applications" tab is displayed.
     * This method first waits for the page to finish loading, and then scrolls the page to bring the element into view.
     * Finally, it asserts that the "Your Applications" tab is visible on the page.
     */
    public static void verifies_your_applications_tab_is_displayed() {
        page.waitForLoadState();
        Playwright_Common_Utils.scrollIntoView("//a[normalize-space()='Your Applications']");
        Hooks.softAssert.assertTrue(page.locator("//a[normalize-space()='Your Applications']").isVisible(), "* * * VERIFYING YOUR APPLICATIONS TAB IS DISPLAYED * * *");
    }

    /**
     * This method allows the user to navigate to the "Your Applications" tab in the application.
     * <p>
     * It clicks on the "Your Applications" link and captures a screenshot using Playwright.
     */
    public static void user_navigates_to_your_applications_tab() {
        page.locator("//a[normalize-space()='Your Applications']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the specified page title is displayed on the current page.
     *
     * @param text the expected page title to verify
     */
    public static void user_verifies_page_title_is_displayed(String text) {
        Hooks.softAssert.assertEquals(page.locator("//h1[normalize-space()='" + text + "']").innerText(), text);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the specified columns are displayed on the application page.
     *
     * @param valueOne   The first expected column value.
     * @param valueTwo   The second expected column value.
     * @param valueThree The third expected column value.
     * @param valueFour  The fourth expected column value.
     * @param valueFive  The fifth expected column value.
     */
    public static void user_verifies_the_following_columns_are_displayed_on_your_applications_page(String valueOne, String valueTwo, String valueThree, String valueFour, String valueFive) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(valueOne);
        expectedValues.add(valueTwo);
        expectedValues.add(valueThree);
        expectedValues.add(valueFour);
        expectedValues.add(valueFive);
        List<ElementHandle> values = page.querySelectorAll("//tr[1]/th");
        ArrayList<String> actualValues = new ArrayList<>();
        for (ElementHandle value : values) {
            actualValues.add(value.innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualValues, expectedValues);
    }

    /**
     * Verifies the address information provided by the user.
     *
     * @param address   The user's street address.
     * @param aptNumber The user's apartment number.
     * @param city      The user's city.
     * @param state     The user's state.
     * @param zip       The user's ZIP code.
     */
    public static void user_verifies_address_information(String address, String aptNumber, String city, String state, String zip) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(address);
        expectedValues.add(aptNumber);
        expectedValues.add(city);
        expectedValues.add(state);
        expectedValues.add(zip);
        ArrayList<String> actualValues = new ArrayList<>();
        for (int i = 11; i <= 15; i++) {
            actualValues.add(page.locator("(//h2)[" + i + "]//following-sibling::span").innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualValues, expectedValues);
        Assert.assertEquals(actualValues.size(), expectedValues.size());
    }

    /**
     * This method represents the scenario where a user who has not applied to a vacancy before
     * is on the SSJ home page. It performs the following steps:
     * 1. Logs in using a side door test account.
     * 2. Navigates to the SSJ portal view.
     * 3. Takes a screenshot of the page using Playwright.
     */
    public static void a_user_who_has_not_applied_to_a_vacancy_before_is_on_the_ssj_home_page() {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        PlaywrightUtils.page.navigate(getSSJUrl());
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Checks if the "Your Applications" tab is not displayed.
     * Takes a screenshot using Playwright and asserts that the tab is not visible.
     */
    public static void your_applications_tab_should_not_be_displayed() {
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertFalse(page.locator("//h1[normalize-space()='Your Applications']").isVisible(), "*** VERIFYING YOUR APPLICATIONS TAB IS NOT DISPLAYED ***");
    }

    /**
     * Verifies if the vacancy title is as expected.
     *
     * @param expectedVacancyTitle The expected vacancy title to be verified.
     * @throws AssertionError If the actual vacancy title does not match the expected vacancy title.
     */
    public static void verifies_vacancy_title_is(String expectedVacancyTitle) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//*[normalize-space()='" + expectedVacancyTitle + " " + timestamp + "']").innerText(), expectedVacancyTitle + " " + timestamp);
    }

    /**
     * Verifies if the displayed vacancy creation date matches the expected date.
     *
     * @param expectedVacancyDate The expected vacancy creation date in the format "dd-MM-yyyy".
     */
    public static void verifies_text_with_the_date_in_which_the_vacancy_was_created(String expectedVacancyDate) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//label[normalize-space()='Open Date']").innerText(), expectedVacancyDate);
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='DateItem']/span)[1]").innerText(), CommonUtils.getTodayDate());
    }

    /**
     * Verifies that the text displayed for "Open Until Filled" matches the expected text.
     *
     * @param expectedOpenUntilFilledText The expected text for "Open Until Filled"
     */
    public static void verifies_text_open_until_filled(String expectedOpenUntilFilledText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//label[normalize-space()='Open Until Filled']").innerText(), expectedOpenUntilFilledText);
    }

    /**
     * Verifies the Point of Contact text with the expected Point of Contact text.
     *
     * @param expectedPointOfContactText the expected text of the Point of Contact
     * @param expectedPOCText            the expected text of the POC
     */
    public static void verifies_point_of_contact_text_with_poc(String expectedPointOfContactText, String expectedPOCText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//label[normalize-space()='Point of Contact:']").innerText(), expectedPointOfContactText);
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='DateItem']/span)[3]").innerText(), expectedPOCText);
    }

    /**
     * Verifies if the vacancy description text matches the expected text.
     * Takes a string parameter representing the expected text.
     * Takes a screenshot using Playwright before performing the verification.
     * Uses a soft assertion to compare the actual text with the expected text.
     *
     * @param expectedText the expected text to be compared with the actual text
     */
    public static void verifies_vacancy_description_text(String expectedText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("(//div[@class='ql-editor'])[1]").innerText(), expectedText);
    }

    /**
     * Verifies the text of the application documents on the current web page.
     *
     * @param expectedText the expected text of the application documents
     */
    public static void verifies_application_documents_text(String expectedText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//h2[normalize-space()='APPLICATION DOCUMENTS']").innerText(), expectedText);
    }

    /**
     * Verifies the required documents with required references needed to apply to this test vacancy.
     */
    public static void verifies_required_documents_with_required_references_needed_to_apply_to_this_test_vacancy() {
        ArrayList<String> expectedValues = new ArrayList<>();
        CommonUtils.sleep(1000);
        page.waitForSelector("//ul[@class='DocumentsList']/li");
        expectedValues.add("Vision Statement");
        expectedValues.add("Curriculum Vitae (CV)");
        expectedValues.add("Cover Letter");
        expectedValues.add("Qualification Statement");
        expectedValues.add("Full Contact Details for Two (2) References");
        Collections.sort(expectedValues);
        List<ElementHandle> values = page.querySelectorAll("//ul[@class='DocumentsList']/li");
        ArrayList<String> actualValues = new ArrayList<>();
        for (ElementHandle value : values) {
            System.out.println(value.innerText());
            actualValues.add(value.innerText());
        }
        Collections.sort(actualValues);
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(actualValues, expectedValues);
    }

    /**
     * The test application is also deleted to re-run automated tests.
     *
     * @param userName The username of the user.
     */
    public static void the_test_application_is_also_deleted_to_re_run_automated_tests(String userName) {
        Playwright_ServiceNow_Common_Methods.side_Door_Test_Account_Login();
        Playwright_ServiceNow_Common_Methods.searchFilterNavigatorAndClickOption("SCSS", "Applications");
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Search column: vacancy").fill("DIEGO TEST");
        page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Search column: vacancy").press("Enter");
        try {
            page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel(userName + " - Open record:").click();
            page.frameLocator("iframe[name=\"gsft_main\"]").locator("#sysverb_delete").click();
            page.frameLocator("iframe[name=\"gsft_main\"]").getByLabel("Confirmation Help").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Delete")).click();
        } catch (Exception e) {
            System.out.println("* * * APPLICATION DOES NOT EXIST - TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * APPLICATION DOES NOT EXIST - TEST CONTINUES * * *");
        }
        Playwright_ServiceNow_Common_Methods.logOutOfNativeView();
    }

    /**
     * Navigates an unauthenticated applicant to the SSJ homepage.
     *
     * @param ssjHomePage the URL of the SSJ homepage
     */
    public static void an_unauthenticated_applicant_is_on_the_ssj_homepage(String ssjHomePage) {
        page.navigate(getSSJUrl());
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies whether the drop down text is as expected.
     *
     * @param expectedDropDownText The expected text of the drop down
     */
    public static void verifies_that_the_drop_drown_text_is(String expectedDropDownText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//header[@class='Header']//span[2]").innerText(), expectedDropDownText);
    }

    /**
     * Clicks on the first vacancy from the list of available vacancies.
     * It locates the first vacancy on the page and performs a click action on it.
     * Additionally, it captures a screenshot of the page using the Playwright framework.
     *
     * @return void
     */
    public static void clicks_on_the_first_vacancy() {
        page.locator("(//td[@class='ant-table-cell'])[1]/a").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method verifies that the sign-in and apply button text is as expected.
     * It uses the provided expectedSignInButtonText parameter to compare the actual button text.
     *
     * @param expectedSignInButtonText The expected text of the sign-in and apply button
     */
    public static void verifies_that_sign_in_and_apply_button_text_is(String expectedSignInButtonText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//button[@class='ant-btn ant-btn-primary']//span").innerText(), expectedSignInButtonText);
    }

    /**
     * Verifies that the pop-up header text is equal to the expected modal header text.
     *
     * @param expectedModalHeaderText the expected modal header text
     */
    public static void verifies_that_the_pop_up_header_text_is(String expectedModalHeaderText) {
        page.waitForSelector("//div[@class='ant-modal-title']");
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//div[@class='ant-modal-title']").innerText(), expectedModalHeaderText);
    }

    /**
     * Verifies that the pop-up body text is equal to the expected modal body text.
     *
     * @param expectedModalBodyText The expected body text of the pop-up.
     */
    public static void verifies_that_the_pop_up_body_text_is(String expectedModalBodyText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//div[@class='ant-typography']").innerText(), expectedModalBodyText);
    }

    /**
     * Verifies that the button text is as expected.
     *
     * @param expectedCreateAnAccountText The expected text for the "Create an account" button.
     * @param expectedLogInText           The expected text for the "Log in" button.
     * @param expectedGoBackText          The expected text for the "Go Back" button.
     */
    public static void verifies_that_the_button_text_is(String expectedCreateAnAccountText, String expectedLogInText, String expectedGoBackText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//span[normalize-space()='Create an account']").innerText(), expectedCreateAnAccountText);
        Hooks.softAssert.assertEquals(page.locator("//span[normalize-space()='Log in']").innerText(), expectedLogInText);
        Hooks.softAssert.assertEquals(page.locator("//span[normalize-space()='Go Back']").innerText(), expectedGoBackText);
    }

    /**
     * Performs a click action on the specified login button and ensures that the user
     * is redirected to the login portal.
     *
     * @param logInButton the locator of the login button element to click
     */
    public static void clicks_and_is_redirected_to_the_login_portal(String logInButton) {
        page.locator("//span[normalize-space()='"+logInButton+"']").click();
        CommonUtils.sleep(4000);
        List<Page> pages = page.context().pages();
        newPage = pages.get(pages.size() - 1);
        if (TestProperties.ENV.equals("test")){
            Hooks.softAssert.assertEquals(newPage.url(), "https://iam-stage.cancer.gov/app/servicenow_ud/exk13dplx1oy5d1pZ0h8/sso/saml?RelayState=https://specializedscientificjobs-test.nih.gov/nih-ssj.do#/");
        } else if (TestProperties.ENV.equals("sandbox")) {
            Hooks.softAssert.assertEquals(newPage.url(), "https://iam-stage.cancer.gov/app/servicenow_ud/exk13dplx1oy5d1pZ0h8/sso/saml?RelayState=https://specializedscientificjobs-sandbox.nih.gov/nih-ssj.do#/");
        }

    }

    /**
     * Verifies that the PIV/CAC card button text is equal to the provided value.
     *
     * @param pivCacCardButtonText the expected text of the PIV/CAC card button
     */
    public static void verifies_that_the_piv_cac_card_button_text_is(String pivCacCardButtonText) {
        Page[] popup = {null};
        page.context().onPage(p -> popup[0] = p);
        page.click("text=Log in");
        while (popup[0] == null) {
            CommonUtils.sleep(2000);
        }
        String text = popup[0].textContent("#form19");
        assert text.contains(pivCacCardButtonText);
    }

    /**
     * Takes a string expectedQuestionText as a parameter and validates that there is no question in the page content that matches the expectedQuestionText.
     * If a matching question is found, a screenshot is taken using the Playwright framework and an assertion failure is triggered using the Hooks.softAssert class.
     *
     * @param expectedQuestionText the text of the question that is expected to be absent in the page content
     */
    public static void user_sees_there_is_no_question_that_reads(String expectedQuestionText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertFalse(page.content().contains(expectedQuestionText));
    }

    /**
     * Confirms that the user sees a statement at the top of the screen with the expected text.
     *
     * @param expectedStatementText The expected text of the statement.
     */
    public static void user_sees_there_is_a_statement_that_reads_at_the_top_of_the_screen(String expectedStatementText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//*[text()='Any reference provided can be contacted at any point in the recruitment process.']").innerText(), expectedStatementText);
    }

    /**
     * Performs a user action of clicking on the "Save Application" button.
     * This method scrolls into view the button, clicks on it, and captures a screenshot of the page.
     *
     * @return void
     */
    public static void user_clicks_on_save_application_button() {
        Playwright_Common_Utils.scrollIntoView("(//span[normalize-space()='Save Application'])[1]");
        page.locator("//span[normalize-space()='Save Application']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the successful save alert is displayed with the expected text.
     *
     * @param expectedSuccessfulText The expected text to be displayed in the save alert.
     */
    public static void verifies_that_successful_save_alert_is_displayed(String expectedSuccessfulText) {
        CucumberLogUtils.playwrightScreenshot(page);
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//*[text()='Application successfully saved ']").textContent(), expectedSuccessfulText);
    }

    /**
     * Verifies that the application became a draft.
     *
     * @param expectedDraftText The expected text indicating that the application is a draft.
     */
    public static void verifies_that_the_application_became_a_draft(String expectedDraftText) {
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("//*[text()='" + "DIEGO TEST" + " " + timestamp + "']/parent::td/following-sibling::td/span").innerText(), expectedDraftText);
    }

    /**
     * Clicks on the application with the specified vacancy title.
     * If a timestamp is available, it appends it to the vacancy title before clicking.
     *
     * @param vacancyTitle The title of the vacancy application to click.
     */
    public static void clicks_the_application(String vacancyTitle) {
        if (timestamp == null) {
            Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(vacancyTitle));
            page.locator(Playwright_Common_Locators.dynamicTextLocator(vacancyTitle)).click();
        } else {
            Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(vacancyTitle + " " + timestamp));
            page.locator(Playwright_Common_Locators.dynamicTextLocator(vacancyTitle + " " + timestamp)).click();
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Scroll into view and click on the Edit button of a vacancy in the application.
     *
     * @param applicationName the name of the application
     */
    public static void clicks_edit_vacancy(String applicationName) {
        Playwright_Common_Utils.scrollIntoView("(//a[@rel='nofollow'])[1]");
        List<ElementHandle> pagination = page.querySelectorAll("//a[@rel='nofollow']");
        for (ElementHandle itemPage : pagination) {
            if (page.querySelector("//a[normalize-space()='" + applicationName + " " + timestamp + "']") != null) {
                page.locator("//td[normalize-space()='" + applicationName + " " + timestamp + "']/following-sibling::td//button/span[text()=' Edit']").click();
                break;
            } else {
                itemPage.click();
            }
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that reference one is updated with the expected values.
     *
     * @param expectedUpdatedReferenceOneFirstName      The expected updated first name of reference one.
     * @param expectedUpdatedReferenceOneMiddleName     The expected updated middle name of reference one.
     * @param expectedUpdatedReferenceOneLastName       The expected updated last name of reference one.
     * @param expectedUpdatedReferenceOneEmail          The expected updated email of reference one.
     * @param expectedUpdatedReferenceOnePhoneNumber    The expected updated phone number of reference one.
     * @param expectedUpdatedReferenceOnePositionTitle  The expected updated position title of reference one.
     * @param expectedUpdatedReferenceOneOrganizationName The expected updated organization name of reference one.
     */
    public static void verifies_that_reference_one_is_updated(String expectedUpdatedReferenceOneFirstName, String expectedUpdatedReferenceOneMiddleName, String expectedUpdatedReferenceOneLastName, String expectedUpdatedReferenceOneEmail, String expectedUpdatedReferenceOnePhoneNumber, String expectedUpdatedReferenceOnePositionTitle, String expectedUpdatedReferenceOneOrganizationName) {
        page.locator("#references_0_firstName");
        page.locator("#references_0_middleName");
        page.locator("#references_0_lastName");
        page.locator("#references_0_email");
        page.locator("#references_0_phoneNumber");
        page.locator("#references_0_title");
        page.locator("#references_0_organization");
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("#references_0_firstName").inputValue(), expectedUpdatedReferenceOneFirstName);
        Hooks.softAssert.assertEquals(page.locator("#references_0_middleName").inputValue(), expectedUpdatedReferenceOneMiddleName);
        Hooks.softAssert.assertEquals(page.locator("#references_0_lastName").inputValue(), expectedUpdatedReferenceOneLastName);
        Hooks.softAssert.assertEquals(page.locator("#references_0_email").inputValue(), expectedUpdatedReferenceOneEmail);
        Hooks.softAssert.assertEquals(page.locator("#references_0_phoneNumber").inputValue(), expectedUpdatedReferenceOnePhoneNumber);
        Hooks.softAssert.assertEquals(page.locator("#references_0_title").inputValue(), expectedUpdatedReferenceOnePositionTitle);
        Hooks.softAssert.assertEquals(page.locator("#references_0_organization").inputValue(), expectedUpdatedReferenceOneOrganizationName);
    }

    /**
     * This method verifies that reference two is updated by comparing the expected values with the actual values
     * obtained from the page locators.
     *
     * @param expectedUpdatedReferenceTwoFirstName       The expected updated first name for reference two.
     * @param expectedUpdatedReferenceTwoMiddleName      The expected updated middle name for reference two.
     * @param expectedUpdatedReferenceTwoLastName        The expected updated last name for reference two.
     * @param expectedUpdatedReferenceTwoEmail           The expected updated email for reference two.
     * @param expectedUpdatedReferenceTwoPhoneNumber     The expected updated phone number for reference two.
     * @param expectedUpdatedReferenceTwoPositionTitle   The expected updated position title for reference two.
     * @param expectedUpdatedReferenceTwoOrganizationName The expected updated organization name for reference two.
     */
    public static void verifies_tha_reference_two_is_updated(String expectedUpdatedReferenceTwoFirstName, String expectedUpdatedReferenceTwoMiddleName, String expectedUpdatedReferenceTwoLastName, String expectedUpdatedReferenceTwoEmail, String expectedUpdatedReferenceTwoPhoneNumber, String expectedUpdatedReferenceTwoPositionTitle, String expectedUpdatedReferenceTwoOrganizationName) {
        page.locator("#references_1_firstName");
        page.locator("#references_1_middleName");
        page.locator("#references_1_lastName");
        page.locator("#references_1_email");
        page.locator("#references_1_phoneNumber");
        page.locator("#references_1_title");
        page.locator("#references_1_title");
        page.locator("#references_1_organization");
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(page.locator("#references_1_firstName").inputValue(), expectedUpdatedReferenceTwoFirstName);
        Hooks.softAssert.assertEquals(page.locator("#references_1_middleName").inputValue(), expectedUpdatedReferenceTwoMiddleName);
        Hooks.softAssert.assertEquals(page.locator("#references_1_lastName").inputValue(), expectedUpdatedReferenceTwoLastName);
        Hooks.softAssert.assertEquals(page.locator("#references_1_email").inputValue(), expectedUpdatedReferenceTwoEmail);
        Hooks.softAssert.assertEquals(page.locator("#references_1_phoneNumber").inputValue(), expectedUpdatedReferenceTwoPhoneNumber);
        Hooks.softAssert.assertEquals(page.locator("#references_1_title").inputValue(), expectedUpdatedReferenceTwoPositionTitle);
        Hooks.softAssert.assertEquals(page.locator("#references_1_organization").inputValue(), expectedUpdatedReferenceTwoOrganizationName);
    }

    /**
     * Clicks on the "Remove" button for a specific item.
     */
    public static void clicks_on_remove_button() {
        page.locator("//td[normalize-space()='" + "DIEGO TEST" + " " + timestamp + "']/following-sibling::td//div/button/span[text()=' Remove']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Scrolls into view and removes the draft based on the confirmation message.
     *
     * @param Confirm the confirmation message used to locate and remove the draft
     */
    public static void that_the_draft_was_removed(String Confirm) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(Confirm));
        page.locator(Playwright_Common_Locators.dynamicTextLocator(Confirm)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the draft is no longer showing under your application tab.
     * The method performs the following steps:
     * 1. Scroll into view the first element with "nofollow" attribute.
     * 2. Get a list of all elements with "nofollow" attribute.
     * 3. Loop through each element in the list.
     * 4. If an element with the text "DIEGO TEST" and the given timestamp is found, set the isFound variable to true and break the loop.
     * 5. If no matching element is found, click on the current element in the loop.
     * 6. Take a screenshot of the page using CucumberLogUtils.playwrightScreenshot method.
     * 7. Use Hooks.softAssert to assert that the isFound variable is false.
     */
    public static void verifies_that_the_draft_is_no_longer_showing_under_your_application_tab() {
        boolean isFound = false;
        Playwright_Common_Utils.scrollIntoView("(//a[@rel='nofollow'])[1]");
        List<ElementHandle> pagination = page.querySelectorAll("//a[@rel='nofollow']");
        for (ElementHandle itemPage : pagination) {
            if (page.querySelector("//a[normalize-space()='" + "DIEGO TEST" + " " + timestamp + "']") != null) {
                isFound = true;
                break;
            } else {
                itemPage.click();
            }
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertFalse(isFound);
    }

    /**
     * This method represents the action of a user withdrawing the application.
     */
    public static void user_withdraws_the_application() {
        page.locator("//td[normalize-space()='" + "DIEGO TEST" + " " + timestamp + "']/following-sibling::td//div/button/span[text()='Withdraw']").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method is used to withdraw the application.
     *
     * @param Withdraw the specific text to be used for withdrawing the application
     */
    public static void withdrawing_the_application(String Withdraw) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(Withdraw));
        page.locator(Playwright_Common_Locators.dynamicTextLocator(Withdraw)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the application status is as expected.
     *
     * @param expectedWithdrawnText The expected withdrawn text.
     */
    public static void verifies_that_the_application_status_is(String expectedWithdrawnText) {
        String actualWithdrawnText = page.locator("//td[normalize-space()='" + "DIEGO TEST" + " " + timestamp + "']/following-sibling::td/span[text()='withdrawn']").innerText();
        CucumberLogUtils.playwrightScreenshot(page);
        Hooks.softAssert.assertEquals(actualWithdrawnText, expectedWithdrawnText);
    }

    /**
     * Selects the number of scoring categories based on the scoring number provided.
     * Uses Playwright to interact with the webpage.
     *
     * @param scoringNumber The scoring number to select the number of categories.
     */
    public static void selects_for_number_of_scoring_categories(String scoringNumber) {
        ElementHandle sliderHandle = page.querySelector(".ant-slider-handle");
        var boxSlider = sliderHandle.boundingBox();
        page.mouse().move(boxSlider.x + boxSlider.width / 2, boxSlider.y + boxSlider.height / 2);
        page.mouse().down();
        ElementHandle target = page.querySelector(".ant-slider-mark-text[style*='" + scoringNumber + "']");
        var boxTarget = target.boundingBox();
        page.mouse().move(boxTarget.x + boxTarget.width / 2, boxTarget.y + boxTarget.height / 2);
        page.mouse().up();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Edits an application for a vacancy that has a specific status.
     *
     * @param applicationStatus the status of the vacancy application to edit
     */
    public static void edits_an_application_for_a_vacancy_that_status_is(String applicationStatus){
        page.waitForSelector(".ant-table-thead");
        int rowCount = page.querySelectorAll("//tr[@class='ant-table-row ant-table-row-level-0']").size();
        System.out.println(rowCount);
        for (int i = 0; i < rowCount; i++) {
            String rowSelector = "(//tr[@class='ant-table-row ant-table-row-level-0'])[" + (i+1) + "]";
            String statusSelector = rowSelector + "/td[2]";
            String editButtonSelector = rowSelector + "//span[contains(text(),'Edit')]";
            String status = page.locator(statusSelector).innerText();
            if (status.equalsIgnoreCase(applicationStatus)) {
                page.click(editButtonSelector);
                break;
            }
        }
    }

    /**
     * Checks if the user sees a banner with the expected message.
     *
     * @param expectedBanner the expected message that should be displayed in the banner
     */
    public static void user_sees_a_banner(String expectedBanner) {
        String alertMessage = page.textContent(".ant-alert-message");
        String alertDescription = page.textContent(".ant-alert-description");
        String actualAlertMessage = alertMessage + " " + alertDescription;
        Hooks.softAssert.assertEquals(actualAlertMessage, expectedBanner);
    }

    /**
     * Verifies that the user is on the specified section of the vacancy application.
     *
     * @param sectionTitle the title of the section to verify
     */
    public static void user_verifies_is_on_the_section_of_the_vacancy_application(String sectionTitle) {
        String actualSectionTitle = page.locator("(//h3[normalize-space()='" + sectionTitle + "'])[1]").innerText();
        System.out.println(actualSectionTitle);
        Hooks.softAssert.assertEquals(actualSectionTitle, sectionTitle);
    }

    /**
     * Update the user's demographic information with the provided details.
     *
     * @param sex The gender of the user
     * @param ethnicity The ethnicity of the user
     * @param race The race of the user
     * @param disabilitySeriousHealthCondition Indicates if the user has a disability or serious health condition
     */
    public static void user_makes_changes_to(String sex, String ethnicity, String race, String disabilitySeriousHealthCondition) {
        page.locator(Demographic_Information_Page.iWantToShareDemographicsRadioButton).click();
        page.locator(Playwright_Common_Locators.dynamicSpanNormalizeSpaceLocator(sex)).click();
        page.locator(Playwright_Common_Locators.dynamicSpanNormalizeSpaceLocator(ethnicity)).click();
        page.locator(Playwright_Common_Locators.dynamicSpanNormalizeSpaceLocator(race)).click();
        page.locator(Playwright_Common_Locators.dynamicSpanNormalizeSpaceLocator(disabilitySeriousHealthCondition)).click();
    }

    /**
     * Method to verify the updated values for sex, ethnicity, race, and disability/serious health condition on the sharing demographics page.
     *
     * @param sex The expected sex value to verify.
     * @param ethnicity The expected ethnicity value to verify.
     * @param race The expected race value to verify.
     * @param disabilitySeriousHealthCondition The expected disability/serious health condition value to verify.
     */
    public static void user_verifies_the_updated_values(String sex, String ethnicity, String race, String disabilitySeriousHealthCondition) {
        String sharingText = Playwright_Common_Locators.getTextFromHeaderOrNormalizedSpan("Sharing demographics");
        String sexText = Playwright_Common_Locators.getTextFromHeaderOrNormalizedSpan(sex);
        String ethnicityText = Playwright_Common_Locators.getTextFromHeaderOrNormalizedSpan(ethnicity);
        String raceText = Playwright_Common_Locators.getTextFromHeaderOrNormalizedSpan(race);
        String disabilitySeriousHealthConditionText = Playwright_Common_Locators.getTextFromHeaderOrNormalizedSpan(disabilitySeriousHealthCondition);
        Hooks.softAssert.assertEquals(sharingText,"Yes");
        Hooks.softAssert.assertEquals(sexText,sex);
        Hooks.softAssert.assertEquals(ethnicityText,ethnicity);
        Hooks.softAssert.assertEquals(raceText,race);
        Hooks.softAssert.assertEquals(disabilitySeriousHealthConditionText,disabilitySeriousHealthCondition);
    }

    /**
     * Method to reset the demographics information for the test to run again.
     * It clicks on the 'I do not want to share' radio button on the demographics information page,
     * clicks on the 'Save Application' button, and asserts that the alert message is as expected.
     */
    public static void user_resets_the_demographics_information_for_test_to_run_again() {
        page.locator(Demographic_Information_Page.iDoNotWantToShareRadioButton).click();
        page.locator(Playwright_Common_Locators.dynamicSpanNormalizeSpaceLocator("Save Application")).click();
        String alertMessage = page.textContent(".ant-message-notice-content");
        Hooks.softAssert.assertEquals(alertMessage,"Application successfully saved Back to Applications Home?x");
    }
}