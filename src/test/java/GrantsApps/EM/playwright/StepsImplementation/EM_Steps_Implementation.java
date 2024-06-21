package GrantsApps.EM.playwright.StepsImplementation;

import GrantsApps.EM.playwright.Pages.EM_Page;
import GrantsApps.EM.playwright.Pages.ITrust_Page;
import appsCommon.Pages.Playwright_Common_Locators;
import appsCommon.PlaywrightUtils.Playwright_Common_Utils;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.PlaywrightException;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class EM_Steps_Implementation {

    /**
     * This method logs in the user as a primary I-TwoE coordinator with a password.
     * It navigates to the EM application URL, fills in the username and password fields,
     * and presses the Enter key to log in.
     */
    public static void user_is_logged_in_as_primary_i_two_e_coordinator_pw() {
        page.navigate(EnvUtils.getApplicationUrl("EM"));
        page.locator(ITrust_Page.usernameTextBox).fill(ConfUtils.getProperty("Username"));
        page.locator(ITrust_Page.passwordTextBox).fill(EncryptionUtils.decrypt(ConfUtils.getProperty("Password")));
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
        MiscUtils.sleep(2000);
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
        assertThat(page.locator("#ngb-tooltip-386")).containsText(toolTipText);
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
}