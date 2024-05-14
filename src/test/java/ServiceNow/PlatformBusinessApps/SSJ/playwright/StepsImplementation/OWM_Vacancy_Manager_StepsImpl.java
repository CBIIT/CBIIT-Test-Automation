package ServiceNow.PlatformBusinessApps.SSJ.playwright.StepsImplementation;

import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Vacancy_Dashboard_Page;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Utils.SSJ_Common_Utils;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Utils.SSJ_Constants;
import appsCommon.Pages.Playwright_Common_Locators;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.PlaywrightException;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class OWM_Vacancy_Manager_StepsImpl {

    public static void user_navigates_to_tab_pw(String dashboardText) {
        page.locator(Playwright_Common_Locators.dynamicTextLocator(dashboardText)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    public static void user_clicks_button_pw(String buttonText) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(buttonText));
        page.locator(Playwright_Common_Locators.dynamicTextLocator(buttonText)).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    public static void user_can_see_warning_message(String text) {
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("body")).containsText(text);
    }

    public static void user_fills_in_field_with_title(String text, String textInput) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.getByPlaceholder("Please enter").fill(textInput);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    public static void user_fills_in_field_with_description(String text, String textInput) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator("#BasicInfo_description div").nth(2).fill(textInput);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    public static void user_checks_option(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.getByLabel(text).check();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    public static void user_verifies_close_date_entry_box_appears() {
        Playwright_Common_Utils.scrollIntoView(Vacancy_Dashboard_Page.closeDateCalendar);
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(Vacancy_Dashboard_Page.closeDateCalendar)).isVisible();
    }

    public static void user_verifies_and_options_are_displayed_for_vacancy_point_of_contact_information_dropdown(String yesText, String noText) {
        page.getByLabel("Are you the point of contact").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("body")).containsText(yesText);
        assertThat(page.locator("body")).containsText(noText);
    }

    public static void user_confirms_being_a_poc_for_this_vacancy_after_selecting_yes_for_being_the_point_of_contact_for_this_vacancy(String poc) {
        page.getByText("Yes", new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#BasicInfo")).containsText(poc);
    }

    public static void user_sets_an_entry_as_today_s_date(String text) {
        page.waitForLoadState();
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator(Vacancy_Dashboard_Page.openDateCalendar).click();
        SSJ_Common_Utils.selectingTodaysCalendarOption(Vacancy_Dashboard_Page.openDateCalendarOptions);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    public static void user_sets_a_entry_a_month_from_the_open_date(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator(Vacancy_Dashboard_Page.closeDateCalendar).click();
        page.locator(Vacancy_Dashboard_Page.closeDateCalendar).fill(CommonUtils.getOneMonthFromTodayDatein_DD_MM_YYY_format());
        List<ElementHandle> list = page.querySelectorAll(Vacancy_Dashboard_Page.closeDateCalendarOptions);
        for (ElementHandle day : list) {
            if (day.getAttribute("title").trim().equals(CommonUtils.getDateOneMonthFromNowIn_YYYY_MM_DD_format().trim())) {
                page.locator("(//*[@title='" + CommonUtils.getDateOneMonthFromNowIn_YYYY_MM_DD_format() + "'])[1]").click();
                break;
            }
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    public static void user_sets_entry(String text) {
        page.getByLabel(text).click();
        page.locator(Vacancy_Dashboard_Page.scoringDueByDateCalendar).fill(CommonUtils.getOneMonthFromTodayDatein_DD_MM_YYY_format());
        List<ElementHandle> list = page.querySelectorAll(Vacancy_Dashboard_Page.calendarOptions);
        for (ElementHandle day : list) {
            if (day.getAttribute("title").trim().equals(CommonUtils.getDateOneMonthFromNowIn_YYYY_MM_DD_format().trim())) {
                page.locator("(//*[@title='" + CommonUtils.getDateOneMonthFromNowIn_YYYY_MM_DD_format() + "'])[2]").click();
                break;
            }
        }
        CucumberLogUtils.playwrightScreenshot(page);
    }

    public static void user_verifies_application_document_is_checked_as_optional_by_default(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        boolean isCheckBoxChecked = page.isChecked(Vacancy_Dashboard_Page.coverLetterCheckBox);
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertTrue(isCheckBoxChecked, "* * * * VERIFYING COVER LETTER CHECK BOX IS CHECKED BY DEFAULT * * * *");
    }

    public static void button_is_displayed_for_application_documents_section(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("plus Add More"))).isVisible();
    }

    public static void user_can_add_another_application_document_by_clicking_on(String document, String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator(Playwright_Common_Locators.dynamicTextLocator(text)).click();
        page.locator(Vacancy_Dashboard_Page.addDocumentTextBox).fill(document);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    public static void user_verifies_full_contact_details_for_references_is_set_to_by_default(String expectedValue) {
        String actualText = page.locator(Vacancy_Dashboard_Page.referencesSlider).getAttribute("aria-valuenow");
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualText, expectedValue);
    }

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

    public static void user_verifies_that_number_of_scoring_categories_slider_is_set_to_by_default(String expectedValue) {
        String actualText = page.locator(Vacancy_Dashboard_Page.numberOfCategoriesSlider).getAttribute("aria-valuenow");
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualText, expectedValue);
    }

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

    public static void user_verifies_that_all_positions_are_present_via_position_classification_dropdown() {
        page.locator(Vacancy_Dashboard_Page.positionClassificationDropDown).click();
        MiscUtils.sleep(2000);
        HashSet<String> actualValues = new HashSet<>();
        boolean flag = false;
        for (int i = 1; !flag; i++) {
            try {
                String value = "" + i;
                MiscUtils.sleep(2000);
                Playwright_Common_Utils.scrollIntoView("(//div[@class='rc-virtual-list'])[2]/div/div/div/div[" + value + "]/div");
                MiscUtils.sleep(2000);
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

    public static void user_confirms_that_checkbox_is_displayed(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#BasicInfo")).containsText(text);
    }

    public static void user_verifies_all_org_codes_are_present_via_organizational_code_dropdown() {
        page.locator(Vacancy_Dashboard_Page.organizationCodeDropDown).click();
        MiscUtils.sleep(2000);
        HashSet<String> actualValues = new HashSet<>();
        boolean flag = false;
        for (int i = 10; !flag;) {
            try {
                String value = "" + i;
                MiscUtils.sleep(3000);
                for (ElementHandle c : page.querySelectorAll("(//div[@class='rc-virtual-list'])[3]/div/div/div/div/div")) {
                    String consoleMName = c.innerText();
                    actualValues.add(consoleMName);
                }
                Playwright_Common_Utils.scrollIntoView("(//div[@class='rc-virtual-list'])[3]/div/div/div/div[" + value + "]/div");
            } catch (PlaywrightException e) {
                flag = true;
            }
        }
        ArrayList<String> arrayList = new ArrayList<>(actualValues);
        arrayList.sort(Comparator.naturalOrder());
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(arrayList, SSJ_Constants.ORG_CODES);
    }

    public static void user_verifies_the_text_of_i_tooltip_is(String text, String docString) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        page.locator("label").filter(new Locator.FilterOptions().setHasText(text)).locator("a").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.TOOLTIP)).containsText(docString);
    }

    public static void user_selects_position_classification_and_organizational_code_options() {

        page.getByLabel("Position Classification").click();

        MiscUtils.sleep(2000);
        boolean flag = false;
        for (int i = 1; !flag; i--) {
            try {
                String value = "" + i;
                MiscUtils.sleep(3000);

                    for (ElementHandle option : page.querySelectorAll("(//div[@class='rc-virtual-list'])[3]/div/div/div/div[" + value + "]/div")) {
                        if (option.innerText().equals("Research Fellow")) {
                            option.click();
                            break;
                        }
                    }
                Playwright_Common_Utils.scrollIntoView("(//div[@class='rc-virtual-list'])[3]/div/div/div/div[" + value + "]/div");
            } catch (PlaywrightException e) {
                flag = true;
            }
        }




        page.getByTitle("Research Fellow", new Page.GetByTitleOptions().setExact(true)).locator("div").click();
        page.getByLabel("Organizational Code").click();
        page.getByTitle("HNC", new Page.GetByTitleOptions().setExact(true)).locator("div").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    public static void user_verifies_that_poc_is_displayed_by_default_for_personnel_action_tracking_solution_pats_initiator_drop_down(String poc) {
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#BasicInfo")).containsText(poc);
    }

    public static void user_confirms_that_user_is_on_section(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator(Playwright_Common_Locators.dynamicTextLocator(text))).isVisible();
    }
}
