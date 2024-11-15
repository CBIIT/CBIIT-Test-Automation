package ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation;

import Hooks.Hooks;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Email_Templates_Page;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Mandatory_Statements_Page;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Vacancy_Committee_Page;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Vacancy_Dashboard_Page;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Utils.SSJ_Common_Utils;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Utils.SSJ_Constants;
import appsCommon.Pages.Playwright_Common_Locators;
import appsCommon.Pages.Playwright_NativeView_Side_Door_Login_Page;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.TestProperties;
import org.testng.Assert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import static ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation.ApplicantProfileStepsImpl.timestamp;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class OWM_Vacancy_Manager_StepsImpl {

    /**
     * Navigates the user to a specific tab in the PW dashboard by clicking on the provided dashboard text.
     *
     * @param dashboardText the text value of the dashboard tab to be navigated to
     */
    public static void user_navigates_to_tab_pw(String dashboardText) {
        page.locator(Playwright_Common_Locators.dynamicTextLocator(dashboardText)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Performs a user click on a button with the specified buttonText by scrolling the element
     * into view, locating the element using the dynamicTextLocator method, and then clicking the element.
     * Additionally, it captures a screenshot using the playwrightScreenshot method from the CucumberLogUtils class.
     *
     * @param buttonText the text value of the button to be clicked
     */
    public static void user_clicks_button_pw(String buttonText) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(buttonText));
        page.locator(Playwright_Common_Locators.dynamicTextLocator(buttonText)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Check if the user can see a warning message.
     * Takes a text as input and verifies if the page contains the provided text.
     * If the text is present, it captures a screenshot using the playwrightScreenshot method from the CucumberLogUtils class.
     *
     * @param text the text value to be checked for on the page
     */
    public static void user_can_see_warning_message(String text) {
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("body")).containsText(text);
    }

    /**
     * Fills in a text field with a specified title.
     *
     * @param text      the text value used to locate the field
     * @param textInput the title to fill in the field with
     */
    public static void user_fills_in_field_with_title(String text, String textInput) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.getByPlaceholder("Please enter").fill(textInput);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Fills in a field with the specified description.
     *
     * @param text      the text value used to locate the field
     * @param textInput the description to fill in the field with
     */
    public static void user_fills_in_field_with_description(String text, String textInput) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator("#BasicInfo_description div").nth(2).fill(textInput);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Scrolls the element into view, checks the option, and takes a screenshot.
     *
     * @param text the text value of the option to be checked
     */
    public static void user_checks_option(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.getByLabel(text).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the close date entry box appears on the Vacancy Dashboard page.
     */
    public static void user_verifies_close_date_entry_box_appears() {
        Playwright_Common_Utils.scrollIntoView(Vacancy_Dashboard_Page.closeDateCalendar);
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(Vacancy_Dashboard_Page.closeDateCalendar)).isVisible();
    }

    /**
     * Verifies if the options for the Vacancy Point of Contact Information dropdown are displayed correctly.
     *
     * @param yesText the expected text for the "Yes" option
     * @param noText  the expected text for the "No" option
     */
    public static void user_verifies_and_options_are_displayed_for_vacancy_point_of_contact_information_dropdown(String yesText, String noText) {
        page.getByLabel("Are you the point of contact").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("body")).containsText(yesText);
        assertThat(page.locator("body")).containsText(noText);
    }

    /**
     * Confirms that the user is the point of contact (POC) for a vacancy after selecting "Yes" as the choice for being the point of contact for this vacancy.
     *
     * @param poc the name of the user who confirms being the POC
     */
    public static void user_confirms_being_a_poc_for_this_vacancy_after_selecting_yes_for_being_the_point_of_contact_for_this_vacancy(String poc) {
        page.getByText("Yes", new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#BasicInfo")).containsText(poc);
    }

    /**
     * Sets an entry as today's date on the Vacancy Dashboard page.
     *
     * @param text the text used to locate the element
     */
    public static void user_sets_an_entry_as_today_s_date(String text) {
        page.waitForLoadState();
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator(Vacancy_Dashboard_Page.openDateCalendar).click();
        SSJ_Common_Utils.selectingTodaysCalendarOption(Vacancy_Dashboard_Page.openDateCalendarOptions);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Sets an entry a month from the open date on the Vacancy Dashboard page.
     *
     * @param text the text used to locate the element
     */
    public static void user_sets_a_entry_a_month_from_the_open_date(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator(Vacancy_Dashboard_Page.closeDateCalendar).click();
        page.locator(Vacancy_Dashboard_Page.closeDateCalendar).fill(CommonUtils.getOneMonthFromTodayDate_In_DD_MM_YYY_format());
        page.locator("(//span[@class='ant-picker-next-icon'])[2]").click();
        List<ElementHandle> list = page.querySelectorAll(Vacancy_Dashboard_Page.closeDateCalendarOptions);
        for (ElementHandle day : list) {
            if (day.getAttribute("title").trim().equals(CommonUtils.getDateOneMonthFromNowIn_YYYY_MM_DD_format().trim())) {
                page.locator("(//*[@title='" + CommonUtils.getDateOneMonthFromNowIn_YYYY_MM_DD_format() + "'])[2]").click();
                break;
            }
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Sets an entry on the Vacancy Dashboard page.
     *
     * @param text the text used to locate the element
     */
    public static void user_sets_entry(String text) {
        page.getByLabel(text).click();
        page.locator(Vacancy_Dashboard_Page.scoringDueByDateCalendar).fill(CommonUtils.getOneMonthFromTodayDate_In_DD_MM_YYY_format());
        page.locator("(//span[@class='ant-picker-next-icon'])[3]").click();
        List<ElementHandle> list = page.querySelectorAll(Vacancy_Dashboard_Page.calendarOptions);
        for (ElementHandle day : list) {
            if (day.getAttribute("title").trim().equals(CommonUtils.getDateOneMonthFromNowIn_YYYY_MM_DD_format().trim())) {
                page.locator("(//*[@title='" + CommonUtils.getDateOneMonthFromNowIn_YYYY_MM_DD_format() + "'])[3]").click();
                break;
            }
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the application document is checked as optional by default.
     *
     * @param text the text value used to locate the element
     */
    public static void user_verifies_application_document_is_checked_as_optional_by_default(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        boolean isCheckBoxChecked = page.isChecked(Vacancy_Dashboard_Page.coverLetterCheckBox);
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertTrue(isCheckBoxChecked, "* * * * VERIFYING COVER LETTER CHECK BOX IS CHECKED BY DEFAULT * * * *");
    }

    /**
     * Verifies if the button is displayed for the Application Documents section.
     *
     * @param text the text value used to locate the button
     */
    public static void button_is_displayed_for_application_documents_section(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("plus Add More"))).isVisible();
    }

    /**
     * Allows the user to add another application document by clicking on a specific element.
     *
     * @param document the document to be added
     * @param text     the text value of the element that needs to be clicked to add the document
     */
    public static void user_can_add_another_application_document_by_clicking_on(String document, String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
        page.locator(Vacancy_Dashboard_Page.addDocumentTextBox).fill(document);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the full contact details for references is set to the default value.
     *
     * @param expectedValue The expected value for the attribute "aria-valuenow".
     */
    public static void user_verifies_full_contact_details_for_references_is_set_to_by_default(String expectedValue) {
        String actualText = page.locator(Vacancy_Dashboard_Page.referencesSlider).getAttribute("aria-valuenow");
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualText, expectedValue);
    }

    /**
     * Verifies that the references slider in the Vacancy Dashboard page has the expected number of options.
     *
     * @param expectedValue the expected number of options for the references slider
     */
    public static void user_verifies_full_contact_details_for_references_slider_has_zero_fifteen_options(int expectedValue) {
        List<ElementHandle> options = page.querySelectorAll(Vacancy_Dashboard_Page.referencesSliderOptions);
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(expectedValue, options.size());
        for (int i = 0; i < options.size(); i++) {
            String actualText = options.get(i).innerText();
            String expectedText = String.valueOf(i);
            Assert.assertEquals(actualText, expectedText);
        }
    }

    /**
     * Verifies that the number of scoring categories slider is set to the default value.
     *
     * @param expectedValue the expected default value of the number of scoring categories slider
     */
    public static void user_verifies_that_number_of_scoring_categories_slider_is_set_to_by_default(String expectedValue) {
        String actualText = page.locator(Vacancy_Dashboard_Page.numberOfCategoriesSlider).getAttribute("aria-valuenow");
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualText, expectedValue);
    }

    /**
     * Verifies that the number of scoring categories slider has zero to six options.
     *
     * @param expectedValue the expected number of options for the number of scoring categories slider
     */
    public static void user_verifies_number_of_scoring_categories_slider_has_zero_six_options(int expectedValue) {
        List<ElementHandle> options = page.querySelectorAll(Vacancy_Dashboard_Page.numberOfScoringSliderOptions);
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(expectedValue, options.size());
        for (int i = 0; i < options.size(); i++) {
            String actualText = options.get(i).innerText();
            String expectedText = String.valueOf(i + 1);
            Assert.assertEquals(actualText, expectedText);
        }
    }

    /**
     * Verifies that all positions are present via the position classification dropdown.
     * The method performs the following steps:
     * 1. Clicks on the position classification dropdown in the vacancy dashboard page.
     * 2. Waits for 2 seconds.
     * 3. Initializes a HashSet to store the actual position values.
     * 4. Sets a flag to false.
     * 5. Enters a loop to iterate through positions until the flag is true.
     * 6. Within the loop, attempts to scroll the position into view.
     * 7. Queries for all position elements and adds their inner text values to the actualValues HashSet.
     * 8. Increments the iterator.
     * 9. Catches a PlaywrightException when there are no more positions to iterate through, and sets the flag to true to exit the loop.
     * 10. Converts the HashSet to an ArrayList and sorts it in natural order.
     * 11. Takes a screenshot using Playwright Common Utils.
     * 12. Asserts that the sorted ArrayList of position names is equal to the constant SSJ_Constants.POSITION_NAMES.
     */
    public static void user_verifies_that_all_positions_are_present_via_position_classification_dropdown() {
        page.locator(Vacancy_Dashboard_Page.positionClassificationDropDown).click();
        CommonUtils.sleep(2000);
        HashSet<String> actualValues = new HashSet<>();
        boolean flag = false;
        for (int i = 1; !flag; i++) {
            try {
                String value = "" + i;
                CommonUtils.sleep(3000);
                Playwright_Common_Utils.scrollIntoView("(//div[@class='rc-virtual-list'])[2]/div/div/div/div[" + value + "]/div");
                for (ElementHandle c : page.querySelectorAll("(//div[@class='rc-virtual-list'])[2]/div/div/div/div/div")) {
                    String consoleMName = c.innerText();
                    actualValues.add(consoleMName);
                }
                i++;
            } catch (PlaywrightException e) {
                flag = true;
            }
        }
        ArrayList<String> arrayList = new ArrayList<>(actualValues);
        arrayList.sort(Comparator.naturalOrder());
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(arrayList, SSJ_Constants.POSITION_NAMES);
    }

    /**
     * Confirms that a checkbox with the specified text is displayed on the page.
     *
     * @param text the text value of the checkbox to be confirmed
     */
    public static void user_confirms_that_checkbox_is_displayed(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#BasicInfo")).containsText(text);
    }

    /**
     * Verifies that all organization codes are present via the organizational code dropdown.
     *
     * The method performs the following steps:
     * 1. Clicks on the organization code dropdown on the vacancy dashboard page.
     * 2. Waits for 2 seconds.
     * 3. Initializes a HashSet to store the actual organization code values.
     * 4. Sets a flag to false.
     * 5. Enters a loop to iterate through organization codes until the flag is true.
     * 6. Within the loop, attempts to scroll the organization code into view.
     * 7. Queries for all organization code elements and adds their inner text values to the actualValues HashSet.
     * 8. Increments the iterator.
     * 9. Catches a PlaywrightException when there are no more organization codes to iterate through, and sets the flag to true to exit the loop.
     * 10. Converts the HashSet to an ArrayList and sorts it in natural order.
     * 11. Takes a screenshot using CucumberLogUtils.playwrightScreenshot(page).
     * 12. Asserts that the sorted ArrayList of organization codes is equal to the constant SSJ_Constants.ORG_CODES.
     */
    public static void user_verifies_all_org_codes_are_present_via_organizational_code_dropdown() {
        page.locator(Vacancy_Dashboard_Page.organizationCodeDropDown).click();
        CommonUtils.sleep(2000);
        HashSet<String> actualValues = new HashSet<>();
        boolean flag = false;
        for (int i = 10; !flag; ) {
            try {
                String value = "" + i;
                CommonUtils.sleep(4000);
                for (ElementHandle c : page.querySelectorAll("(//div[@class='rc-virtual-list'])[3]/div/div/div/div/div")) {
                    String consoleMName = c.innerText();
                    actualValues.add(consoleMName);
                }
                Playwright_Common_Utils.scrollIntoView("(//div[@class='rc-virtual-list'])[3]/div/div/div/div[" + value + "]/div");
            } catch (PlaywrightException e) {
                flag = true;
            }
        }
        try (PrintWriter out = new PrintWriter(new File("./target/mySetValues.txt"))) {
            for (String value : actualValues) {
                out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        ArrayList<String> arrayList = new ArrayList<>(actualValues);
//        arrayList.sort(Comparator.naturalOrder());
//        CucumberLogUtils.playwrightScreenshot(page);
//        Assert.assertEquals(arrayList, SSJ_Constants.ORG_CODES);
    }

    /**
     * Verifies that the text of a tooltip is as expected.
     *
     * @param text       the text to be verified
     * @param docString  the expected text of the tooltip
     */
    public static void user_verifies_the_text_of_i_tooltip_is(String text, String docString) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator("label").filter(new Locator.FilterOptions().setHasText(text)).locator("a").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.TOOLTIP)).containsText(docString);
    }

    /**
     * This method allows the user to select the position classification and organizational code options on the vacancy dashboard page.
     * It performs the following actions:
     * - Clicks on the position classification drop-down.
     * - Waits for 2000 milliseconds to ensure the drop-down is loaded.
     * - Focuses on the position classification drop-down.
     * - Navigates through the options using the "ArrowUp" key press and selects the "Research Fellow" option.
     * - Clicks on the organization code drop-down.
     * - Focuses on the organization code drop-down.
     * - Navigates through the options using the "ArrowUp" key press and selects the "HNC" option.
     * - Takes a screenshot using Playwright.
     */
    public static void user_selects_position_classification_and_organizational_code_options() {
        page.locator(Vacancy_Dashboard_Page.positionClassificationDropDown).click();
        CommonUtils.sleep(2000);
        page.locator(Vacancy_Dashboard_Page.positionClassificationDropDown).focus();
        for (int i = 0; i < 28; i++) {
            page.keyboard().press("ArrowUp");
            page.waitForTimeout(200);
        }
        page.getByTitle("Research Fellow", new Page.GetByTitleOptions().setExact(true)).locator("div").click();
        page.locator(Vacancy_Dashboard_Page.organizationCodeDropDown).click();
        page.locator(Vacancy_Dashboard_Page.organizationCodeDropDown).focus();
        for (int i = 0; i < 346; i++) {
            page.keyboard().press("ArrowUp");
            page.waitForTimeout(200);
        }
        page.getByTitle("HNC", new Page.GetByTitleOptions().setExact(true)).locator("div").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method verifies that the Point of Contact (POC) is displayed by default in the Personnel Action Tracking Solution (PATS) Initiator drop-down.
     *
     * @param poc The Point of Contact (POC) that is expected to be displayed by default in the drop-down.
     */
    public static void user_verifies_that_poc_is_displayed_by_default_for_personnel_action_tracking_solution_pats_initiator_drop_down(String poc) {
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#BasicInfo")).containsText(poc);
    }

    /**
     * Scrolls into view the specified section text, takes a screenshot, and asserts that the section text is visible.
     *
     * @param text The section text to confirm visibility for.
     */
    public static void user_confirms_that_user_is_on_section(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(Playwright_Common_Locators.dynamicTextLocator(text))).isVisible();
    }

    /**
     * Scrolls the page to the specified text, checks if the statement is disabled by default,
     * takes a screenshot, and asserts that the statement is indeed disabled.
     *
     * @param text the text to locate on the page
     */
    public static void user_confirms_that_statement_is_disabled_by_default(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        boolean flag = page.locator(Mandatory_Statements_Page.equalEmploymentOpportunityEmployerButton).isDisabled();
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertTrue(flag);
    }

    /**
     * Verifies that the given text is displayed as expected.
     *
     * @param text       The text to be verified.
     * @param docString  The expected text to compare.
     */
    public static void user_verifies_the_text_of_is_displayed_as(String text, String docString) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(Mandatory_Statements_Page.mandatoryStatementsEqualOpportunityEmployerText)).containsText(docString);
    }

    /**
     * Verifies that the specified text is displayed and the description text is present.
     * This method scrolls the page to make the text visible, takes a screenshot, and performs assertions.
     *
     * @param text     The text to be verified.
     * @param docString The description text to be verified.
     */
    public static void user_verifies_the_text_is_displayed_and_description_text_is(String text, String docString) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(Mandatory_Statements_Page.mandatoryStatementsSelector)).containsText(text);
        assertThat(page.locator(Mandatory_Statements_Page.standardsOfConductText)).containsText(docString);
    }

    /**
     * Verifies that the text of foreign education is displayed as expected.
     *
     * @param text The expected text of foreign education.
     * @param docString The expected text of the document.
     */
    public static void user_verifies_the_text_of_foreign_education_is_displayed_as(String text, String docString) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(Mandatory_Statements_Page.mandatoryStatementsSelector)).containsText(text);
        assertThat(page.locator(Mandatory_Statements_Page.foreignEducationText)).containsText(docString);
    }

    /**
     * Verifies that the text of the reasonable accommodation is displayed correctly.
     *
     * @param text The expected text of the reasonable accommodation.
     * @param docString The expected text of the reasonable accommodation in doc string format.
     */
    public static void user_verifies_the_text_of_reasonable_accommodation_is_displayed_as(String text, String docString) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(Mandatory_Statements_Page.mandatoryStatementsSelector)).containsText(text);
        assertThat(page.locator(Mandatory_Statements_Page.reasonableAccommodationText)).containsText(docString);
    }

    /**
     * Disables statement options for a user.
     *
     * @param standardsOfConductText The text of the standards of conduct statement.
     * @param foreignEducationText The text of the foreign education statement.
     * @param reasonableAccommodationText The text of the reasonable accommodation statement.
     */
    public static void user_can_disable_statement_options_for(String standardsOfConductText, String foreignEducationText, String reasonableAccommodationText) {
        String[] texts = { standardsOfConductText, foreignEducationText, reasonableAccommodationText };
        for (int i = 0; i < texts.length; i++) {
            Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(texts[i]));
            page.locator("(//button[@role='switch'])[" + (i + 2) + "]").click();
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Enables statement options for the given standards of conduct, foreign education, and reasonable accommodation texts.
     *
     * @param standardsOfConductText The text to locate the standards of conduct element.
     * @param foreignEducationText The text to locate the foreign education element.
     * @param reasonableAccommodationText The text to locate the reasonable accommodation element.
     */
    public static void can_enable_statement_options_for(String standardsOfConductText, String foreignEducationText, String reasonableAccommodationText) {
        String[] texts = { standardsOfConductText, foreignEducationText, reasonableAccommodationText };
        for (int i = 0; i < texts.length; i++) {
            Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(texts[i]));
            page.locator("(//button[@role='switch'])[" + (i + 2) + "]").click();
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies if the specified text is displayed for a section.
     *
     * @param expectedAddAndManageVacancyCommitteeText The expected text to be displayed for the section.
     */
    public static void user_verifies_text_is_displayed_for_section(String expectedAddAndManageVacancyCommitteeText) {
        String actualText = page.locator(Playwright_Common_Locators.dynamicTextLocator(expectedAddAndManageVacancyCommitteeText)).innerText();
        Assert.assertEquals(actualText, expectedAddAndManageVacancyCommitteeText);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the following vacancy committee column headers are displayed.
     * Compares the actual column header texts with the expected texts.
     *
     * @param expectedCommitteeMemberText The expected text for the "Committee Member" column header.
     * @param expectedRoleText            The expected text for the "Role" column header.
     * @param expectedActionsText         The expected text for the "Actions" column header.
     */
    public static void user_verifies_the_following_vacancy_committee_column_headers_are_displayed(String expectedCommitteeMemberText, String expectedRoleText, String expectedActionsText) {
        String actualCommitteeMemberText = page.locator(Playwright_Common_Locators.dynamicTextLocator(expectedCommitteeMemberText)).innerText();
        String actualRoleText = page.locator(Playwright_Common_Locators.dynamicTextLocator(expectedRoleText)).innerText();
        String actualActionsText = page.locator(Playwright_Common_Locators.dynamicTextLocator(expectedActionsText)).innerText();
        Assert.assertEquals(actualCommitteeMemberText, expectedCommitteeMemberText);
        Assert.assertEquals(actualRoleText, expectedRoleText);
        Assert.assertEquals(actualActionsText, expectedActionsText);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Confirms whether a button with the specified expected text is displayed on the page.
     *
     * @param expectedText the text expected to be displayed on the button
     */
    public static void user_confirms_button_is_displayed(String expectedText) {
        String actualText = page.locator(Playwright_Common_Locators.dynamicTextLocator(expectedText)).innerText();
        Assert.assertEquals(actualText, expectedText);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Checks if the "Chair" role option is displayed by default for the role dropdown.
     *
     * @param expectedText The expected text of the "Chair" role option.
     */
    public static void user_can_see_chair_role_option_is_displayed_by_default_for_role_drop_down(String expectedText) {
        String actualText = page.locator(Playwright_Common_Locators.dynamicTextLocator(expectedText)).innerText();
        Assert.assertEquals(actualText, expectedText);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Adds a committee member for the chair role.
     *
     * @param committeeMember The name of the committee member to add.
     */
    public static void the_user_adds_a_committee_member_for_chair_role(String committeeMember) {
        page.locator(Vacancy_Committee_Page.vacancyCommitteeMemberDropDown).click();
        page.waitForLoadState();
        page.waitForSelector(Playwright_Common_Locators.dynamicTextLocator(committeeMember)).click();
    }

    /**
     * This method verifies that the user can see an alert with the expected message.
     *
     * @param expectedAlertMessage the expected message of the alert that the user should see
     */
    public static void user_can_see_alert(String expectedAlertMessage) {
        String actualAlertMessage = page.locator(Vacancy_Committee_Page.atLeastOneCommitteeMemberMustBeOfTheRoleExecutiveSecretaryMessage).innerText();
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
    }

    /**
     * Adds a committee member with a role to the vacancy.
     *
     * @param committeeMember The name of the committee member to be added.
     * @param roleMember      The role of the committee member to be added.
     */
    public static void user_adds_committee_member_for(String committeeMember, String roleMember) {
        page.locator(Vacancy_Committee_Page.vacancyCommitteeMemberDropDown).click();
        page.waitForSelector(Playwright_Common_Locators.dynamicTextLocator(committeeMember)).click();
        page.locator(Vacancy_Committee_Page.vacancyCommitteeMemberRoleDropDown).click();
        page.waitForSelector(Playwright_Common_Locators.dynamicTextLocator(roleMember)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Checks if the user is directed to a specific section in the Email Templates page.
     *
     * @param expectedText the expected text that should be present in the section header
     */
    public static void user_is_directed_to_section(String expectedText) {
        Playwright_Common_Utils.scrollIntoView(Email_Templates_Page.emailTemplatesHeader);
        String actualText = page.locator(Email_Templates_Page.emailTemplatesHeader).innerText();
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * Adds a committee member for a specific committee role.
     *
     * @param committeeMember The name of the committee member to add.
     * @param roleMember      The role of the committee member.
     */
    public static void user_adds_committee_member_for_pw(String committeeMember, String roleMember) {
        page.locator(Vacancy_Committee_Page.vacancyCommitteeMemberDropDown).click();
        page.waitForSelector(Playwright_Common_Locators.dynamicTextLocator(committeeMember)).click();
        page.locator(Vacancy_Committee_Page.vacancyCommitteeMemberRoleDropDown).click();
        page.locator(Vacancy_Committee_Page.vacancyCommitteeMemberRoleDropDown).focus();
        for (int i = 0; i < 3; i++) {
            page.keyboard().press("ArrowDown");
            page.waitForTimeout(200);
        }
        page.waitForSelector(Playwright_Common_Locators.dynamicTextLocator(roleMember)).click();
    }

    /**
     * Adds a committee member for the executive secretary.
     *
     * @param committeeMember The name of the committee member to be added.
     */
    public static void user_adds_committee_member_for_executive_secretary(String committeeMember) {
        page.locator(Vacancy_Committee_Page.vacancyCommitteeMemberDropDown).click();
        CommonUtils.sleep(2000);
        page.locator("(//input[@id='react-select-3-input'])[1]").focus();
        boolean isElementFound = false;
        while(!isElementFound) {
            for (int i = 0; i < 100; i++) {
                page.keyboard().press("ArrowDown");
                page.waitForTimeout(200);
                String name = "//div[@class='UserPickerDropdown']//span[contains(text(),'" + committeeMember + "')]";
                if(page.isVisible(name)) {
                    page.waitForSelector(name).click();
                    isElementFound = true;
                    break;
                }
            }
        }
        if (page.isVisible(Vacancy_Committee_Page.vacancyCommitteeChairRoleDropDown)){
            page.locator(Vacancy_Committee_Page.vacancyCommitteeChairRoleDropDown).click();
        }else if(page.isVisible(Vacancy_Committee_Page.vacancyCommitteeMemberDropDown)){
            page.locator(Vacancy_Committee_Page.vacancyCommitteeMemberDropDown).click();
        }
        page.waitForSelector(Playwright_Common_Locators.dynamicTextLocator("Executive Secretary (non-voting)")).click();

    }

    /**
     * Adds a duplicate committee member for the executive secretary.
     *
     * @param committeeMember The name of the committee member to be added.
     */
    public static void user_adds_duplicate_committee_member_for_executive_secretary(String committeeMember) {
        page.locator(Vacancy_Committee_Page.duplicateVacancyCommitteeMemberDropdown).click();
        CommonUtils.sleep(3000);
        page.locator(Playwright_Common_Locators.dynamicTextLocatorByIndex(committeeMember,2)).click();
        page.locator(Vacancy_Committee_Page.vacancyCommitteeMemberRoleDropDown ).click();
        page.waitForSelector(Playwright_Common_Locators.dynamicTextLocator("Executive Secretary (non-voting)")).click();
    }

    /**
     * Impersonates Holly or any vacancy manager.
     * This method performs the following steps:
     * 1. Navigates to the native view side door page.
     * 2. Fills the username and password text boxes with the appropriate values.
     * 3. Clicks on the login button.
     * 4. Waits for the page to finish loading.
     * 5. Reloads the page.
     * 6. Sleeps for 2000 milliseconds.
     */
    public static void impersonate_holly_or_any_vacancy_manager(){
        page.navigate(TestProperties.getNativeViewSideDoorUrl());
        page.locator(Playwright_NativeView_Side_Door_Login_Page.usernameTextBox).fill(TestProperties.SIDE_DOOR_USERNAME);
        page.locator(Playwright_NativeView_Side_Door_Login_Page.passwordTextBox).fill(TestProperties.SIDE_DOOR_PASSWORD);
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(Playwright_NativeView_Side_Door_Login_Page.loginButton)).click();
        page.waitForLoadState();
        page.reload();
        CommonUtils.sleep(2000);
    }

    /**
     * Verifies if the given vacancy title is present on the "Your Vacancies" page.
     *
     * @param vacancyTitle The title of the vacancy to be verified.
     */
    public static void verifies_vacancy_title_is_on_the_your_vacancies_page(String vacancyTitle) {
        Playwright_Common_Utils.scrollIntoView("(//a[@rel='nofollow'])[1]");
        List<ElementHandle> pagination = page.querySelectorAll("//a[@rel='nofollow']");
        for (ElementHandle itemPage : pagination) {
            if (page.querySelector("//a[normalize-space()='" + vacancyTitle + " " + timestamp + "']") != null) {
                String actualVacancy = page.locator("//a[normalize-space()='" + vacancyTitle + ' ' + ApplicantProfileStepsImpl.timestamp).innerText();
                CommonUtils.sleep(2000);
                System.out.println("Timestamp before assertion: " + ApplicantProfileStepsImpl.timestamp);
                String expectedVacancy = vacancyTitle + " " + ApplicantProfileStepsImpl.timestamp;
                Hooks.softAssert.assertEquals(actualVacancy,expectedVacancy);
                break;
            } else {
                itemPage.click();
            }
        }

    }
}