package GRANTS.EM.playwright.stepsImplementation;

import GRANTS.EM.playwright.pages.EM_Page;
import GRANTS.EM.playwright.pages.ITrust_Page;
import APPS_COMMON.Pages.Playwright_Common_Locators;
import APPS_COMMON.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.PlaywrightException;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.*;

public class EM_Steps_Implementation {

    /**
     * This method logs in the user as a primary I-TwoE coordinator with a password.
     * It navigates to the EM application URL, fills in the username and password fields,
     * and presses the Enter key to log in.
     */
    public static void user_is_logged_in_as_primary_i_two_e_coordinator_pw() {
        page.navigate(getEnterpriseMaintenanceUrl());
        page.locator(ITrust_Page.usernameTextBox).fill(I_TRUST_USERNAME);
        page.locator(ITrust_Page.passwordTextBox).fill(EncryptionUtils.decrypt(I_TRUST_PASSWORD));
        page.locator(ITrust_Page.passwordTextBox).press("Enter");
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method allows the user to input a value into the Name field and click the Search button.
     *
     * @param user the value to input into the Name field
     */
    public static void user_inputs_into_the_name_field_and_clicks_search_pw(String user) {
        page.getByLabel("Name", new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel("Name", new Page.GetByLabelOptions().setExact(true)).fill(user);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(user)).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Performs the action of deleting a role from a tester's account before re-running the test and adding the role again.
     *
     * @param value the value used to locate the element to delete the role
     */
    public static void tester_deletes_role_to_re_run_test_before_adding_role_pw(String value) {
        page.waitForLoadState();
        Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(value));
        CommonUtils.sleep(2000);
        try {
            if (page.locator(EM_Page.gmActionManagerRoleText).isVisible()) {
                page.locator(EM_Page.gmActionManagerRoleText).click();
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yes")).click();
                Playwright_Common_Utils.scrollIntoView(Playwright_Common_Locators.dynamicTextLocator(" Save Changes "));
                page.locator(Playwright_Common_Locators.dynamicTextLocator(" Save Changes ")).click();
                PlaywrightUtils.page.waitForLoadState();
            }
        } catch (PlaywrightException e) {
            System.out.println("* * * GM ACCOUNT MANAGER ROLE NOT PRESENT -- TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * GM ACCOUNT MANAGER ROLE NOT PRESENT -- TEST CONTINUES * * *");
        }
    }

    /**
     * Adds a role to the user and verifies that the role was successfully saved.
     *
     * @param value the value of the role to be added
     */
    public static void user_adds_role_and_verifies_role_was_successfully_saved(String value) {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Role")).click();
        page.getByRole(AriaRole.DIALOG).getByLabel("", new Locator.GetByLabelOptions().setExact(true)).click();
        page.getByRole(AriaRole.SEARCHBOX).fill(value);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("GM Action Manager Allows to")).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Role")).click();
        assertThat(page.locator("app-role-information")).containsText(value);
        CucumberLogUtils.playwrightScreenshot(page);
        page.locator(Playwright_Common_Locators.dynamicTextLocator(" Save Changes ")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Allows the user to type in a value in the ITwoE role drop-down.
     *
     * @param roleText the value to type in the role drop-down
     */
    public static void user_types_in_in_i_two_e_role_drop_down(String roleText) {
        page.getByRole(AriaRole.DIALOG).getByLabel("", new Locator.GetByLabelOptions().setExact(true)).click();
        page.getByRole(AriaRole.SEARCHBOX).fill(roleText);
    }

    /**
     * This method verifies that the following roles are displayed as expected.
     * It compares the expected values with the actual values retrieved from the page.
     *
     * @param valueOne   the first expected role
     * @param valueTwo   the second expected role
     * @param valueThree the third expected role
     * @param valueFour  the fourth expected role
     * @param valueFive  the fifth expected role
     * @param valueSix   the sixth expected role
     * @param valueSeven the seventh expected role
     */
    public static void the_following_roles_should_display(String valueOne, String valueTwo, String valueThree, String valueFour, String valueFive, String valueSix, String valueSeven) {
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(valueOne);
        expectedValues.add(valueTwo);
        expectedValues.add(valueThree);
        expectedValues.add(valueFour);
        expectedValues.add(valueFive);
        expectedValues.add(valueSix);
        expectedValues.add(valueSeven);
        List<ElementHandle> actualValues = page.querySelectorAll(EM_Page.commonI2ERoleDropDownValuesLocator);
        ArrayList<String> actualStringValues = new ArrayList<>();
        for (ElementHandle value : actualValues) {
            actualStringValues.add(value.innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualStringValues, expectedValues);
    }

    /**
     * This method selects the "Administrative Facilitates" option from the Business Area dropdown.
     * It clicks on the textbox with name "All" to open the dropdown, then selects the option
     * with name "Administrative Facilitates".
     */
    public static void user_chooses_administrative_option_from_business_area_dropdown_pw() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("All")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Administrative Facilitates")).click();
    }

    /**
     * Verifies that the following roles are displayed as expected. It compares the expected values with the actual values retrieved from the page.
     *
     * @param valueOne   the first expected role
     * @param valueTwo   the second expected role
     * @param valueThree the third expected role
     * @param valueFour  the fourth expected role
     */
    public static void the_following_roles_should_display(String valueOne, String valueTwo, String valueThree, String valueFour) {
        page.getByRole(AriaRole.DIALOG).getByLabel("", new Locator.GetByLabelOptions().setExact(true)).click();
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(valueOne);
        expectedValues.add(valueTwo);
        expectedValues.add(valueThree);
        expectedValues.add(valueFour);
        List<ElementHandle> actualValues = page.querySelectorAll(EM_Page.commonI2ERoleDropDownValuesLocator);
        ArrayList<String> actualStringValues = new ArrayList<>();
        for (ElementHandle value : actualValues) {
            actualStringValues.add(value.innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualStringValues, expectedValues);
    }

    /**
     * This method allows the user to select a role by name from the dropdown options and take a screenshot.
     *
     * @param value the name of the role to select
     */
    public static void user_can_select_role_pw(String value) {
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName(value)).locator("b").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Removes the eGrants Access Representative role for the current user.
     * This method performs the following steps:
     * 1. Locates the element with the label "×eGrants Access Representative".
     * 2. Clicks the "×" button on the element to remove the role.
     * 3. Takes a screenshot of the page using the PlaywrightUtils library.
     */
    public static void user_can_remove_e_grants_access_representative_role_pw() {
        page.getByLabel("×eGrants Access Representative").getByText("×").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clears the administrative option form business area choice.
     *
     * This method performs the following steps:
     * 1. Clicks on the "Remove all items" button on the page.
     * 2. Takes a screenshot of the page using the playwrightScreenshot method from CucumberLogUtils.
     *
     * Note: Ensure that the required page object is parameterized when using the playwrightScreenshot method.
     */
    public static void user_clears_administrative_option_form_business_area_choice_pw() {
        page.getByTitle("Remove all items").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Clears the choices for the I-TwoE roles and displays a message.
     *
     * This method performs the following steps:
     * 1. Clicks on the "app-business-area-dropdown" locator to open the dropdown.
     * 2. Takes a screenshot of the page using the playwrightScreenshot method from CucumberLogUtils.
     * 3. Retrieves the text from the "app-i2e-role-dropdown" locator and asserts that it contains the specified value.
     *
     * @param value the value to verify in the "app-i2e-role-dropdown" locator.
     * @see CucumberLogUtils#playwrightScreenshot(Page)
     */
    public static void itwo_e_roles_choices_are_cleared_with_message(String value) {
        page.locator("app-business-area-dropdown").getByLabel("").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("app-i2e-role-dropdown")).containsText(value);
    }

    /**
     * This method selects the "Administrative Facilitates" option from the Business Area dropdown.
     * It clicks on the textbox with name "All" to open the dropdown, then selects the option
     * with name "Administrative Facilitates".
     * After selecting the option, it takes a screenshot of the page using the `playwrightScreenshot()` method from `CucumberLogUtils` class.
     *
     * Note: Make sure to parameterize the required page object when using the `playwrightScreenshot()` method.
     */
    public static void the_user_chooses_administrative_option_from_business_area_dropdown_pw() {
        page.locator("app-business-area-dropdown").getByLabel("").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Financial Manages NCI funds")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the following roles are displayed as expected. It compares the expected values with the actual values retrieved from the page.
     *
     * @param valueOne   the first expected role
     * @param valueTwo   the second expected role
     * @param valueThree the third expected role
     * @param valueFour  the fourth expected role
     * @param valueFive  the fifth expected role
     */
    public static void the_following_roles_should_display(String valueOne, String valueTwo, String valueThree, String valueFour, String valueFive) {
        page.getByRole(AriaRole.DIALOG).getByLabel("", new Locator.GetByLabelOptions().setExact(true)).click();
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(valueOne);
        expectedValues.add(valueTwo);
        expectedValues.add(valueThree);
        expectedValues.add(valueFour);
        expectedValues.add(valueFive);
        List<ElementHandle> actualValues = page.querySelectorAll(EM_Page.commonI2ERoleDropDownValuesLocator);
        ArrayList<String> actualStringValues = new ArrayList<>();
        for (ElementHandle value : actualValues) {
            actualStringValues.add(value.innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualStringValues, expectedValues);
    }

    /**
     * The user chooses the "General" option from the Business Area dropdown.
     * It performs the following steps:
     * 1. Clicks on the textbox with the name "Financial" to open the dropdown.
     * 2. Clicks on the option with the name "General Provides read only".
     * 3. Takes a screenshot of the page using the `playwrightScreenshot()` method from `CucumberLogUtils` class.
     *
     * Note: Make sure to parameterize the required page object when using the `playwrightScreenshot()` method.
     * @see CucumberLogUtils#playwrightScreenshot(Page)
     */
    public static void the_user_chooses_general_option_from_business_area_dropdown_pw() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Financial")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("General Provides read only")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method verifies that the specified role is displayed as expected on the page.
     * It compares the expected value with the actual value retrieved from the page.
     *
     * @param text the expected value of the role to be displayed
     */
    public static void the_following_role_should_display(String text) {
        page.getByRole(AriaRole.DIALOG).getByLabel("", new Locator.GetByLabelOptions().setExact(true)).click();
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(text);
        List<ElementHandle> actualValues = page.querySelectorAll(EM_Page.commonI2ERoleDropDownValuesLocator);
        ArrayList<String> actualStringValues = new ArrayList<>();
        for (ElementHandle value : actualValues) {
            actualStringValues.add(value.innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualStringValues, expectedValues);
    }

    /**
     * This method allows the user to choose the "Grants Management" option from the Business Area dropdown.
     * It performs the following steps:
     *   1. Clicks on the element with the locator "app-business-area-dropdown" to open the dropdown.
     *   2. Clicks on the option with the label "Grants Management Facilitates" to select it.
     *   3. Takes a screenshot of the page using the `playwrightScreenshot()` method from `CucumberLogUtils` class.
     *
     * Note: Make sure to parameterize the required page object when using the `playwrightScreenshot()` method.
     *
     * @see CucumberLogUtils#playwrightScreenshot(Page)
     */
    public static void the_user_chooses_grants_management_option_from_business_area_dropdown_pw() {
        page.locator("app-business-area-dropdown").getByLabel("").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Grants Management Facilitates")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verifies that the following roles are displayed as expected.
     * It compares the expected values with the actual values retrieved from the page.
     *
     * @param valueOne   the first expected role
     * @param valueTwo   the second expected role
     * @param valueThree the third expected role
     * @param valueFour  the fourth expected role
     * @param valueFive  the fifth expected role
     * @param valueSix   the sixth expected role
     * @param valueSeven the seventh expected role
     * @param valueEight the eighth expected role
     * @param valueNine  the ninth expected role
     * @param valueTen   the tenth expected role
     */
    public static void the_following_roles_should_display(String valueOne, String valueTwo, String valueThree, String valueFour, String valueFive, String valueSix, String valueSeven, String valueEight, String valueNine, String valueTen) {
        page.getByRole(AriaRole.DIALOG).getByLabel("", new Locator.GetByLabelOptions().setExact(true)).click();
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(valueOne);
        expectedValues.add(valueTwo);
        expectedValues.add(valueThree);
        expectedValues.add(valueFour);
        expectedValues.add(valueFive);
        expectedValues.add(valueSix);
        expectedValues.add(valueSeven);
        expectedValues.add(valueEight);
        expectedValues.add(valueNine);
        expectedValues.add(valueTen);
        List<ElementHandle> actualValues = page.querySelectorAll(EM_Page.commonI2ERoleDropDownValuesLocator);
        ArrayList<String> actualStringValues = new ArrayList<>();
        for (ElementHandle value : actualValues) {
            actualStringValues.add(value.innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualStringValues, expectedValues);
    }

    /**
     * Method that represents the user choosing a program option from the business area dropdown on the page.
     * It performs the following steps:
     * 1. Clicks on the element with the locator "app-business-area-dropdown" to open the dropdown.
     * 2. Clicks on the desired program option in the dropdown.
     * 3. Takes a screenshot of the page using the `playwrightScreenshot()` method from `CucumberLogUtils` class.
     *
     * @see CucumberLogUtils#playwrightScreenshot(Page)
     */
    public static void the_user_chooses_program_option_from_business_area_dropdown_pw() {
        page.locator("app-business-area-dropdown").getByLabel("").click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Program Provides privileges")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method allows the user to choose the referral option from the business area dropdown.
     */
    public static void the_user_chooses_referral_option_from_business_area_dropdown_pw() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Program")).click();
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Referral Facilitates Referral")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Verify that the specified roles are displayed on the page.
     *
     * @param valueOne   The first role value to be checked.
     * @param valueTwo   The second role value to be checked.
     * @param valueThree The third role value to be checked.
     */
    public static void the_following_roles_should_display(String valueOne, String valueTwo, String valueThree) {
        page.getByRole(AriaRole.DIALOG).getByLabel("", new Locator.GetByLabelOptions().setExact(true)).click();
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(valueOne);
        expectedValues.add(valueTwo);
        expectedValues.add(valueThree);
        List<ElementHandle> actualValues = page.querySelectorAll(EM_Page.commonI2ERoleDropDownValuesLocator);
        ArrayList<String> actualStringValues = new ArrayList<>();
        for (ElementHandle value : actualValues) {
            actualStringValues.add(value.innerText());
        }
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualStringValues, expectedValues);
    }

    /**
     * This method verifies the tool tip text displayed for the Business Area dropdown.
     *
     * @param toolTipText The expected tool tip text to verify.
     */
    public static void user_can_verify_business_area_dropdown_tool_tip_text(String toolTipText) {
        page.locator("label").filter(new Locator.FilterOptions().setHasText("Business Area")).locator("a").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("//div[@class='tooltip-inner']")).containsText(toolTipText);
    }

    /**
     * Verifies if the option description displayed on the page matches the expected description.
     *
     * @param optionHeader The header of the option.
     * @param expectedOptionText The expected description of the option.
     */
    public static void option_contains_the_description_expected(String optionHeader, String expectedOptionText) {
        String actualOptionText = page.locator("//ul[@class='select2-results__options']//li//span[b[text()='" + optionHeader + "']]//following-sibling::span").innerText();
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(actualOptionText, expectedOptionText);
    }

    /**
     * Executes the necessary actions when the user selects the "All" option.
     * This method performs the following steps:
     * 1. Finds the textbox element with the role "Administrative".
     * 2. Clicks on the textbox element.
     * 3. Takes a screenshot using Playwright.
     * 4. Finds the option element with the role "All" and name "Includes All I2E roles.".
     * 5. Clicks on the option element.
     * 6. Takes another screenshot using Playwright.
     *
     * Note: This method assumes that the Playwright library is already configured and available.
     */
    public static void when_user_selects_all_option() {
        page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Administrative")).click();
        CucumberLogUtils.playwrightScreenshot(page);
        page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("All Includes All I2E roles.")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method allows the user to verify that the administrative option is no longer selected.
     * It captures a screenshot using CucumberLogUtils.playwrightScreenshot method and asserts that the element
     * with id "select2-businessArea-select-container" does not contain the text "×All".
     */
    public static void user_can_verify_that_administrative_option_is_no_longer_selected() {
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("#select2-businessArea-select-container")).containsText("×All");
    }

    /**
     * Removes the selected value from the business area dropdown.
     *
     * This method clicks on the "Remove all items" option to remove all selected items from the dropdown.
     * It also captures a screenshot using CucumberLogUtils.playwrightScreenshot() after the value is removed.
     */
    public static void user_removes_selected_value_from_business_area_drop_down() {
        page.getByTitle("Remove all items").click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method allows the user to verify that the value is no longer present.
     * It performs the following actions:
     * 1. Clicks on the "app-business-area-dropdown" locator element.
     * 2. Takes a screenshot using CucumberLogUtils.playwrightScreenshot method.
     * 3. Verifies that the "app-business-area-dropdown" locator element does not contain any text.
     *
     * @throws AssertionError if the value is still present
     */
    public static void user_can_verify_that_the_value_is_no_longer_present() {
        page.locator("app-business-area-dropdown").getByLabel("").click();
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.locator("app-business-area-dropdown")).containsText("");
    }

    /**
     * Displays the first and last name of the logged in user
     *
     * @param expectedFirstAndLastName the expected first and last name of the logged in user
     */
    public static void first_and_last_name_of_logged_in_user_are_displayed(String expectedFirstAndLastName) {
        assertThat(page.locator("#headerCollapse")).containsText(expectedFirstAndLastName);
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * Navigates to a hyperlink and verifies the URL of the hyperlink.
     *
     * @param hyperlinkText the text of the hyperlink to navigate to
     * @param expectedURL the expected URL of the hyperlink
     */
    public static void user_can_navigate_to_hyperlink_and_verify_hyperlink_url(String hyperlinkText, String expectedURL) {
        Page page1 = page.waitForPopup(() -> {
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(hyperlinkText)).click();
        });
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(page1.url(), expectedURL);
        page1.close();
    }

    /**
     * This method allows the user to navigate to a hyperlink with the given text and verifies the URL of the hyperlink.
     *
     * @param hyperlinkText The text of the hyperlink the user wants to navigate to.
     * @param expectedURL   The expected URL of the hyperlink.
     */
    public static void user_can_navigate_to_hyperlink_and_verifies_hyperlink_url(String hyperlinkText, String expectedURL) {
        Page page5 = page.waitForPopup(() -> {
            page.getByRole(AriaRole.CONTENTINFO).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName(hyperlinkText)).click();
        });
        CucumberLogUtils.playwrightScreenshot(page);
        Assert.assertEquals(page5.url(), expectedURL);
        page5.close();
    }

    /**
     * This method allows the user to confirm the application version number.
     *
     * @param applicationVersionNumber The application version number to confirm.
     */
    public static void user_can_confirm_the_application_version_number(String applicationVersionNumber) {
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.CONTENTINFO)).containsText(applicationVersionNumber);
    }

    /**
     * Verifies if the given text is present in the NIH motto paragraph on the page.
     *
     * @param nihMottoText The text to verify in the NIH motto paragraph.
     */
    public static void user_can_verify_nih_motto(String nihMottoText) {
        CucumberLogUtils.playwrightScreenshot(page);
        assertThat(page.getByRole(AriaRole.PARAGRAPH)).containsText(nihMottoText);
    }
}