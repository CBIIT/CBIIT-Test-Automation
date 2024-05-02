package ServiceNow.PlatformBusinessApps.SSJ.playwright.Steps;

import ServiceNow.PlatformBusinessApps.SSJ.playwright.Pages.Vacancy_Dashboard_Page;
import ServiceNow.PlatformBusinessApps.SSJ.playwright.Utils.SSJ_Common_Utils;
import appsCommon.Pages.Playwright_Common_Locators;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import appsCommon.PlaywrightUtils.Playwright_ServiceNow_Common_Methods;
import appsCommon.Utils.Dynamic_Locators;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class OWM_Vacancy_Manager_Steps {

    @When("User navigates to tab {string} - PW")
    public void user_navigates_to_tab_pw(String dashboardText) {
        PlaywrightUtils.page.locator(Playwright_Common_Locators.dynamicTextLocator(dashboardText)).click();
    }

    @When("User clicks button {string} - PW")
    public void user_clicks_button_pw(String buttonText) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(buttonText));
        PlaywrightUtils.page.locator(Playwright_Common_Locators.dynamicTextLocator(buttonText)).click();
    }

    @Then("User can see warning message {string}")
    public void user_can_see_warning_message(String text) {
        assertThat(PlaywrightUtils.page.locator("body")).containsText(text);
    }

    @Then("User fills in {string} field with title {string}")
    public void user_fills_in_field_with_title(String text, String textInput) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        PlaywrightUtils.page.getByPlaceholder("Please enter").fill(textInput);
    }

    @Then("User fills in {string} field with description {string}")
    public void user_fills_in_field_with_description(String text, String textInput) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        PlaywrightUtils.page.locator("#BasicInfo_description div").nth(2).fill(textInput);
    }

    @Then("User checks {string} option")
    public void user_checks_option(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));
        PlaywrightUtils.page.getByLabel(text).check();
        CucumberLogUtils.playwrightScreenshot();
    }

    @Then("User verifies Close Date entry box appears")
    public void user_verifies_close_date_entry_box_appears() {
        Playwright_Common_Utils.scrollIntoView(Vacancy_Dashboard_Page.closeDateCalendar);
        CucumberLogUtils.playwrightScreenshot();
        assertThat(PlaywrightUtils.page.locator(Vacancy_Dashboard_Page.closeDateCalendar)).isVisible();
    }

    @Then("User verifies {string} and {string} options are displayed for Vacancy Point of Contact Information dropdown")
    public void user_verifies_and_options_are_displayed_for_vacancy_point_of_contact_information_dropdown(String yesText, String noText) {
        PlaywrightUtils.page.getByLabel("Are you the point of contact").click();
        assertThat(PlaywrightUtils.page.locator("body")).containsText(yesText);
        assertThat(PlaywrightUtils.page.locator("body")).containsText(noText);
    }

    @Then("User {string} confirms being a POC for this vacancy after selecting Yes for being the point of contact for this vacancy")
    public void user_confirms_being_a_poc_for_this_vacancy_after_selecting_yes_for_being_the_point_of_contact_for_this_vacancy(String poc) {
        PlaywrightUtils.page.getByText("Yes", new Page.GetByTextOptions().setExact(true)).click();
        CucumberLogUtils.playwrightScreenshot();
        assertThat(PlaywrightUtils.page.locator("#BasicInfo")).containsText(poc);
    }

    @Then("User sets an {string} entry as today's date")
    public void user_sets_an_entry_as_today_s_date(String text) {
        PlaywrightUtils.page.waitForLoadState();
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));

        PlaywrightUtils.page.locator(Vacancy_Dashboard_Page.openDateCalendar).click();



        SSJ_Common_Utils.selectingTodaysCalendarOption(Vacancy_Dashboard_Page.openDateCalendarOptions);

        MiscUtils.sleep(5000);

    }

    @Then("User sets a {string} entry a month from the Open Date")
    public void user_sets_a_entry_a_month_from_the_open_date(String text) {
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(text));

        PlaywrightUtils.page.locator(Vacancy_Dashboard_Page.closeDateCalendar).click();
        MiscUtils.sleep(2000);
        List<Locator> options = PlaywrightUtils.page.locator(Vacancy_Dashboard_Page.closeDateCalendarOptions).all();

        for (Locator option : options) {
            String reversed = new StringBuilder(CommonUtils.getOneMonthFromTodayDate()).reverse().toString();
            System.out.println("PRINTING: " + reversed);
            if (option.innerText().equals(reversed)) {
                option.click();
                break;
            }
        }

        MiscUtils.sleep(5000);
    }

}
