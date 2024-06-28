package GrantsApps.EM.selenium.StepImplementation;

import GrantsApps.EM.selenium.Pages.ManageI2EUsersPage;
import GrantsApps.EM.selenium.Pages.ModifyAccountPage;
import GrantsApps.EM.selenium.Utils.EM_Constants;
import appsCommon.PageInitializers.PageInitializer;
import appsCommon.Utils.Dynamic_Locators;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EMStepsImplementation extends PageInitializer {

    static String expectedNEDname;

    /**
     * Logs into the application as the specified user.
     *
     * @param userName the username of the user to log in as
     */
    public void emLogin(String userName) {
        switch (userName) {
            case "Elizabeth Andreyev":
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
                iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "andreyeveUsername");
                iTrustloginPage.enterPassword("andreyevePassword");
                MiscUtils.sleep(3000);
                iTrustloginPage.clickSignInButton();
                MiscUtils.sleep(3000);
                break;
            case "Diego Juarez":
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
                iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
                iTrustloginPage.enterPassword("Password");
                MiscUtils.sleep(3000);
                iTrustloginPage.clickSignInButton();
                MiscUtils.sleep(3000);
                break;
            default:
                throw new RuntimeException("***** NOT VALID USER *****");
        }
    }

    /**
     * This method is used to perform the following steps:
     * 1. Open the web driver using the application URL
     * 2. Login to the iTrust application
     * 3. Take a screenshot
     */
    public static void user_is_logged_in_as_primary_ic_coordinator() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
        iTrustLoginPageImpl.loginToITrust();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that the first and last name of the logged-in user are shown on the Manage I2E Users page.
     *
     * @param user the username of the user to verify
     */
    public static void verifies_that_first_and_last_name_of_logged_in_user_are_shown(String user) {
        String actualUser = ManageI2EUsersPage.dynamicUserTextLocator(user).getText();
        Assert.assertEquals(actualUser, user);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies if the user is on the specified I2E page.
     *
     * @param expectedPageName the expected name of the page
     */
    public static void verifyingUserIsOnI2EPage(String expectedPageName) {
        String actualPageName = manageI2EUsersPage.i2ePageTitle.getText();
        Assert.assertEquals(actualPageName, expectedPageName);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Determines whether the user is able to navigate to a specific hyperlink based on the provided link text.
     *
     * @param linkText the text of the hyperlink to navigate to
     */
    public static void is_able_to_navigate_to_hyperlink(String linkText) {
        String emWindowHandle = WebDriverUtils.webDriver.getWindowHandle();
        switch (linkText) {
            case "IMPAC II ":
                CommonUtils.clickOnElement(ManageI2EUsersPage.dynamicLinkLocator(linkText));
                CommonUtils.switchToNextWindow();
                String actualIMPACIIPageTitle = WebDriverUtils.webDriver.getTitle();
                String expectedIMPACIIPageTitle = EM_Constants.IMPAC_II_PAGE_TITLE;
                Assert.assertEquals(actualIMPACIIPageTitle, expectedIMPACIIPageTitle);
                WebDriverUtils.webDriver.switchTo().window(emWindowHandle);
                break;
            case "I2E Home":
                CommonUtils.clickOnElement(manageI2EUsersPage.i2eHomeHyperlink);
                MiscUtils.sleep(3000);
                String actual_I2E_PageTitle = WebDriverUtils.webDriver.getTitle();
                String expected_I2E_PageTitle = EM_Constants.I2E_HOME_PAGE_TITLE;
                Assert.assertEquals(actual_I2E_PageTitle, expected_I2E_PageTitle);
                WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
                MiscUtils.sleep(2000);
                break;
            case "Workbench":
                CommonUtils.clickOnElement(ManageI2EUsersPage.dynamicLinkLocator(linkText));
                CommonUtils.switchToNextWindow();
                String actualWorkbenchPageTitle = WebDriverUtils.webDriver.getTitle();
                String expectedWorkbenchPageTitle = EM_Constants.WORKBENCH_PAGE_TITLE;
                Assert.assertEquals(actualWorkbenchPageTitle, expectedWorkbenchPageTitle);
                WebDriverUtils.webDriver.switchTo().window(emWindowHandle);
                MiscUtils.sleep(3000);
                break;
        }
    }

    /**
     * Verifies the help dropdown options on a specific page.
     *
     * @param helpDropDown The locator of the help dropdown element.
     * @param option1      The expected value of option 1 in the dropdown.
     * @param option2      The expected value of option 2 in the dropdown.
     * @param option3      The expected value of option 3 in the dropdown.
     */
    public static void verifyingHelpDropDownOptions(String helpDropDown, String option1, String option2, String option3) {
        CommonUtils.clickOnElement(ManageI2EUsersPage.dynamicLinkLocator(helpDropDown));
        MiscUtils.sleep(2000);
        List<String> actualHelpDropDownValues = new ArrayList<>();
        for (WebElement option : manageI2EUsersPage.i2eHelpDropDownValues) {
            actualHelpDropDownValues.add(option.getText());
        }
        List<String> expectedValues = new ArrayList<>();
        expectedValues.add(option1);
        expectedValues.add(option2);
        expectedValues.add(option3);
        Assert.assertEquals(actualHelpDropDownValues, expectedValues);
    }

    /**
     * Verifies if the help dropdown URL matches the given URL when navigating to a specific hyperlink.
     *
     * @param hyperlinkText The text of the hyperlink to navigate to.
     * @param URL           The expected URL of the hyperlink.
     */
    public static void verifyingHelpDropDownUrls(String hyperlinkText, String URL) {
        String emMainWindowHandle = webDriver.getWindowHandle();
        ManageI2EUsersPage.dynamicLinkLocator("Help ").click();
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(ManageI2EUsersPage.dynamicLinkLocator(hyperlinkText));
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        Assert.assertEquals(webDriver.getCurrentUrl(), URL);
        webDriver.switchTo().window(emMainWindowHandle);
        CucumberLogUtils.logScreenshot();
        MiscUtils.sleep(1000);
    }

    /**
     * Verifies the contact options on the Manage I2E Users page.
     *
     * @param option1 The expected value of the first contact option.
     * @param option2 The expected value of the second contact option.
     */
    public static void verifyingContactOptions(String option1, String option2) {
        ManageI2EUsersPage.dynamicLinkLocator("Contact ").click();
        MiscUtils.sleep(2000);
        String actualEmailTechnicalSupportText = ManageI2EUsersPage.dynamicLinkLocator(option1).getText();
        Assert.assertEquals(actualEmailTechnicalSupportText, option1.trim());
        String actualEmailBusinessPolicyText = ManageI2EUsersPage.dynamicLinkLocator(option2).getText();
        Assert.assertEquals(actualEmailBusinessPolicyText, option2.trim());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Selects the given text from the I2E Account Status drop-down list.
     *
     * @param text the text to select from the drop-down list
     */
    public static void selects_values_in_i2e_account_status_drop_down_list(String text) {
        CommonUtils.waitForVisibility(manageI2EUsersPage.i2eAccountStatusDropDown);
        manageI2EUsersPage.i2eAccountStatusDropDown.click();
        CommonUtils.selectValueFromBootStrapDropDown(manageI2EUsersPage.i2eAccountStatusValues, text);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that the user's full name is displayed.
     * <p>
     * This method waits for 5 seconds, scrolls into view of the create button,
     * and gets the text of the user's full name from the page.
     *
     * @throws InterruptedException if the thread is interrupted while waiting
     */
    public static void user_can_verify_that_user_s_full_name_is_displayed() {
        MiscUtils.sleep(5000);
        JavascriptUtils.scrollIntoView(manageI2EUsersPage.createButton);
        expectedNEDname = JavascriptUtils.getTextUsingJS(manageI2EUsersPage.fullNEDName);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Clicks on the first record in the results.
     * <p>
     * This method waits for 5 seconds, scrolls into view of the create button, and clicks the create button.
     * Then it waits for 2 seconds.
     */
    public static void clicks_create_on_the_first_record_in_the_results() {
        MiscUtils.sleep(5000);
        JavascriptUtils.scrollIntoView(manageI2EUsersPage.createButton);
        JavascriptUtils.clickByJS(manageI2EUsersPage.createButton);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies if the page name is equal to the expected page name.
     *
     * @param expectedPageName the expected page name
     */
    public static void user_can_verify_the_page_name_is(String expectedPageName) {
        String actualPageName = createNewAccountPage.createNewAccountTitle.getText();
        CucumberLogUtils.logScreenshot();
        Assert.assertEquals(actualPageName, expectedPageName);
        MiscUtils.sleep(2000);
    }

    /**
     * Verifies that the user's full name is displayed.
     * <p>
     * This method waits for 5 seconds, scrolls into view of the create button,
     * and gets the text of the user's full name from the page.
     *
     * @throws InterruptedException if the thread is interrupted while waiting
     */
    public static void user_can_verify_that_users_full_name_is_displayed() {
        String actual_NED_full_name = createNewAccountPage.full_NED_name.getText();
        CucumberLogUtils.logScreenshot();
        Assert.assertEquals(actual_NED_full_name, expectedNEDname);
    }

    /**
     * Verifies the respective wording of the full name tooltip.
     *
     * @param expectedWording_of_full_name_tooltip the expected wording of the full name tooltip
     */
    public static void user_can_verify_the_respective_wording_of_full_name_tooltip(String expectedWording_of_full_name_tooltip) {
        createNewAccountPage.tooltipNEDnameLink.click();
        MiscUtils.sleep(1000);
        String actualWording_of_full_name_tooltip = createNewAccountPage.tooltipNEDnameText.getText();
        CucumberLogUtils.logScreenshot();
        Assert.assertEquals(actualWording_of_full_name_tooltip, expectedWording_of_full_name_tooltip);
    }

    /**
     * Verifies that the specified fields have values displayed on the page.
     *
     * @param createNewAccountPage the page object representing the create new account page
     */
    public static void user_can_verify_that_the_following_fields_have_values_displayed_nih_network_id_e_mail_ned_organization_sac_code_ned_classification() {
        boolean is_NIH_network_id_displayed = createNewAccountPage.nihNetworkID.isDisplayed();
        CucumberLogUtils.logScreenshot();
        Assert.assertTrue(is_NIH_network_id_displayed, "-- VERIFYING THAT NIH NETWORK ID VALUE IS DISPLAYED --");
        boolean is_email_displayed = createNewAccountPage.email.isDisplayed();
        Assert.assertTrue(is_email_displayed, "--VERIFYING THAT EMAIL VALUE IS DISPLAYED --");
        boolean is_NED_organization_displayed = createNewAccountPage.ned_organisation.isDisplayed();
        Assert.assertTrue(is_NED_organization_displayed, "--VERIFYING THAT NED ORGANISATION VALUE IS DISPLAYED --");
        boolean is_SAC_code_displayed = createNewAccountPage.sac_code.isDisplayed();
        Assert.assertTrue(is_SAC_code_displayed, "--VERIFYING THAT SAC CODE VALUE IS DISPLAYED --");
        boolean is_NED_classification_displayed = createNewAccountPage.ned_classification.isDisplayed();
        Assert.assertTrue(is_NED_classification_displayed, "--VERIFYING THAT NED CLASSIFICATION VALUE IS DISPLAYED --");
    }

    /**
     * Verifies that the account status is set to the expected account status.
     *
     * @param expectedAccountStatus the expected account status
     */
    public static void user_can_verify_that_account_status_is_set_to(String expectedAccountStatus) {
        String actualAccountStatus = createNewAccountPage.account_status.getText();
        CucumberLogUtils.logScreenshot();
        Assert.assertEquals(actualAccountStatus, expectedAccountStatus);
    }

    /**
     * Verifies that the table title in the create new account page matches the expected title.
     *
     * @param expectedI2ErolesTableTitle the expected title of the table
     */
    public static void user_can_verify_the_table_title_is(String expectedI2ErolesTableTitle) {
        String actualI2ErolesTableTitle = createNewAccountPage.active_I2E_roles_table_title.getText();
        CucumberLogUtils.logScreenshot();
        Assert.assertEquals(actualI2ErolesTableTitle, expectedI2ErolesTableTitle);
    }

    /**
     * Verifies that the PDF document link opens upon clicking on the list of I2E roles hyperlink.
     *
     * @param expected_I2E_roles_pdf_url the expected URL of the PDF document
     */
    public static void user_can_verify_the_pdf_document_link_opens_upon_clicking_on_the_list_of_i2e_roles_hyperlink(String expected_I2E_roles_pdf_url) {
        String emMainWindowHandle = webDriver.getWindowHandle();
        createNewAccountPage.list_of_I2E_roles_link.click();
        CommonUtils.switchToNextWindow();
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
        String actual_I2E_roles_pdf_url = webDriver.getCurrentUrl();
        Assert.assertEquals(actual_I2E_roles_pdf_url, expected_I2E_roles_pdf_url);
        webDriver.switchTo().window(emMainWindowHandle);
    }

    /**
     * Verifies that the following fields are present on the page:
     * 1. expectedRoleText
     * 2. expectedRoleOrganisationText
     * 3. expectedAssignedCAtext
     * 4. expectedStartDateText
     * 5. expectedAction
     *
     * @param expectedRoleText             the expected text for the role field
     * @param expectedRoleOrganisationText the expected text for the role organization field
     * @param expectedAssignedCAtext       the expected text for the assigned CA field
     * @param expectedStartDateText        the expected text for the start date field
     * @param expectedAction               the expected text for the action field
     */
    public static void user_can_verify_that_the_following_fields_are_present(String expectedRoleText, String expectedRoleOrganisationText, String expectedAssignedCAtext, String expectedStartDateText, String expectedAction) {
        List<String> actualHeaders = new ArrayList<>();
        List<String> expectedHeaders = new ArrayList<>();
        expectedHeaders.add(expectedRoleText);
        expectedHeaders.add(expectedRoleOrganisationText);
        expectedHeaders.add(expectedAssignedCAtext);
        expectedHeaders.add(expectedStartDateText);
        expectedHeaders.add(expectedAction);
        for (WebElement header : createNewAccountPage.active_I2E_roles_headers) {
            String actualHeader = header.getText();
            actualHeaders.add(actualHeader);
        }
        CucumberLogUtils.logScreenshot();
        Assert.assertEquals(actualHeaders, expectedHeaders);
    }

    /**
     * Verifies that the title is present on the page.
     *
     * @param expectedTitle the expected title to verify
     */
    public static void user_can_verify_that_title_is_present(String expectedTitle) {
        String actualTitle = createNewAccountPage.cancer_activity_monitors_optional_title.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method simulates a user clicking on the "Add Role" button.
     */
    public static void user_clicks_add_role_button() {
        createNewAccountPage.add_role_button.click();
    }

    /**
     * Simulates a user clicking on the I2E Role drop-down.
     */
    public static void user_clicks_i2e_role_drop_down() {
        MiscUtils.sleep(2000);
        createNewAccountPage.i2e_role_drop_down.click();
    }

    /**
     * Verifies that the business area drop-down is pre-populated with the expected value.
     *
     * @param expectedAdministrativeText the expected value of the business area drop-down
     */
    public static void user_can_verify_that_business_area_drop_down_is_pre_populated_with_value(String expectedAdministrativeText) {
        String actualAdministrativeText = createNewAccountPage.administrative_business_area.getText();
        CommonUtils.assertEquals(actualAdministrativeText, expectedAdministrativeText);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that all the documents contain the expected CBIIT text in the role_organization drop-down list.
     *
     * @param expectedCBIITtext The expected CBIIT text to be displayed in the drop-down list.
     */
    public static void user_can_verify_that_all_the_docs_contain_in_role_organization_drop_down_list(String expectedCBIITtext) {
        createNewAccountPage.role_organization_drop_down.click();
        CommonUtils.waitForClickability(createNewAccountPage.role_organization_first_cbiit_value);
        String firstCBIITvalue = createNewAccountPage.role_organization_first_cbiit_value.getText();
        boolean isCBIITtextDisplayedFirstOption = firstCBIITvalue.contains(expectedCBIITtext);
        Assert.assertTrue(isCBIITtextDisplayedFirstOption, "---- VERIFYING IF CBIIT TEXT IS DISPLAYED FOR THE FIRST VALUE ---");
        createNewAccountPage.role_organization_drop_down_arrow.click();
        String secondCBIITvalue = createNewAccountPage.role_organization_second_cbiit_value.getText();
        boolean isCBIITtextDisplayedSecondOption = secondCBIITvalue.contains(expectedCBIITtext);
        Assert.assertTrue(isCBIITtextDisplayedSecondOption, "---- VERIFYING IF CBIIT TEXT IS DISPLAYED FOR THE SECOND VALUE ---");
        String thirdCBIITvalue = createNewAccountPage.role_organization_third_cbiit_value.getText();
        boolean isCBIITtextDisplayedThirdOption = thirdCBIITvalue.contains(expectedCBIITtext);
        Assert.assertTrue(isCBIITtextDisplayedThirdOption, "---- VERIFYING IF CBIIT TEXT IS DISPLAYED FOR THE THIRD VALUE ---");
        String fourthCBIITvalue = createNewAccountPage.role_organization_fourth_cbiit_value.getText();
        boolean isCBIITtextDisplayedFourthOption = fourthCBIITvalue.contains(expectedCBIITtext);
        Assert.assertTrue(isCBIITtextDisplayedFourthOption, "---- VERIFYING IF CBIIT TEXT IS DISPLAYED FOR THE FOURTH VALUE ---");
        String fifthCBIITvalue = createNewAccountPage.role_organization_fifth_cbiit_value.getText();
        boolean isCBIITtextDisplayedFifthOption = fifthCBIITvalue.contains(expectedCBIITtext);
        Assert.assertTrue(isCBIITtextDisplayedFifthOption, "---- VERIFYING IF CBIIT TEXT IS DISPLAYED FOR THE FIFTH VALUE ---");
        String sixthCBIITvalue = createNewAccountPage.role_organization_sixth_cbiit_value.getText();
        boolean isCBIITtextDisplayedSixthOption = sixthCBIITvalue.contains(expectedCBIITtext);
        Assert.assertTrue(isCBIITtextDisplayedSixthOption, "---- VERIFYING IF CBIIT TEXT IS DISPLAYED FOR THE SIXTH VALUE ---");
    }

    /**
     * Saves the changes made by the user.
     * This method clicks on the "Save Changes" button on the createNewAccountPage,
     * then accepts any alert that may be displayed.
     */
    public static void user_saves_changes() {
        createNewAccountPage.save_changes_button.click();
        CommonUtils.acceptAlert();
    }

    /**
     * Verifies if the success message is displayed after performing a certain action.
     *
     * @param expectedSuccessMessage the expected success message to be displayed
     */
    public static void user_can_verify_the_success_message_is_displayed(String expectedSuccessMessage) {
        String actualSuccessMessage = createNewAccountPage.success_message.getText();
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that the "Return to Manage I2E Users" hyperlink directs to the specified URL.
     *
     * @param searchPageExpectedURL the expected URL of the search page
     */
    public static void user_can_verify_that_return_to_manage_i2e_users_hyperlink_directs_to_url(String searchPageExpectedURL) {
        createNewAccountPage.return_to_manage_i2e_users_hyperlink.click();
        MiscUtils.sleep(2000);
        String searchPageActualURL = webDriver.getCurrentUrl();
        Assert.assertEquals(searchPageActualURL, searchPageExpectedURL);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Logs in as Li, Bin.
     * <p>
     * This method performs the following steps:
     * <ol>
     * <li>Pauses the execution for 2 seconds using the {@link MiscUtils#sleep(long)} method.</li>
     * <li>Clicks on the "change user" dropdown by executing JavaScript code using the {@link JavascriptUtils#clickByJS(String)} method.</li>
     * <li>Clicks on the "change user" field using the {@link CommonUtils#clickOnElement(WebElement)} method.</li>
     * <li>Enters "Li, Bin" in the "change user" field input using the {@link CommonUtils#sendKeys(WebElement, String)} method.</li>
     * <li>Waits for the "Li, Bin" option to become clickable using the {@link CommonUtils#waitForClickability(WebElement)} method.</li>
     * <li>Clicks on the "Li, Bin" option using the {@link CommonUtils#clickOnElement(WebElement)} method.</li>
     * <li>Pauses the execution for 2 seconds using the {@link MiscUtils#sleep(long)} method.</li>
     * </ol>
     * </p>
     */
    public void loginAsLiBin() {
        MiscUtils.sleep(2000);
        JavascriptUtils.clickByJS(manageI2EUsersPage.changeuserDr);
        CommonUtils.clickOnElement(manageI2EUsersPage.changeuserField);
        CommonUtils.sendKeys(manageI2EUsersPage.changeuserFieldInput, "Li, Bin");
        CommonUtils.waitForClickability(manageI2EUsersPage.liBinOption);
        CommonUtils.clickOnElement(manageI2EUsersPage.liBinOption);
        MiscUtils.sleep(2000);
    }

    /**
     * Checks if the user is on the "Manage ITWOE Users" page.
     * Waits for the visibility of the page title element.
     * Asserts if the page title element is displayed.
     * Logs a screenshot of the page.
     */
    public static void user_is_on_manage_itwoe_users_page() {
        CommonUtils.waitForVisibility(manageI2EUsersPage.i2EPageTitle);
        CommonUtils.assertTrue(manageI2EUsersPage.i2EPageTitle.isDisplayed());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Enters the provided name into the name field and clicks on the search button.
     *
     * @param name the name to be entered into the name field
     */
    public static void user_inputs_into_the_name_field_and_clicks_search(String name) {
        CommonUtils.sendKeys(manageI2EUsersPage.nameField, name);
        CucumberLogUtils.logScreenshot();
        CommonUtils.clickOnElement(manageI2EUsersPage.searchButtonI2ESearch);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Selects a value from the I2E Role drop-down on the manageI2EUsersPage.
     *
     * @param text the value to be selected from the drop-down
     */
    public static void selects_from_i2e_role_drop_down(String text) {
        CommonUtils.clickOnElement(manageI2EUsersPage.I2ERoleDropD);
        CommonUtils.sendKeysToElement(manageI2EUsersPage.I2ERoleDropDownTextBox, text);
        CommonUtils.sendKeys(manageI2EUsersPage.I2ERoleDropDownTextBox, Keys.ENTER);
    }

    /**
     * Selects an option from the role organization dropdown.
     *
     * @param text the option to select from the dropdown
     */
    public static void selects_from_role_organization_drop_down(String text) {
        CommonUtils.clickOnElement(manageI2EUsersPage.roleOrganizationDropDown);
        CommonUtils.sendKeysToElement(manageI2EUsersPage.roleOrganizationDropDown, text);
        CommonUtils.clickOnElement(Dynamic_Locators.dynamicContainsTextLocatorWithSpanTagName(text));
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method allows the user to click on the "Add Role" button inside a module.
     * It uses the manageI2EUsersPage.addRoleButtonInsideModule element to locate the button.
     * After clicking on the button, it logs a screenshot using CucumberLogUtils.logScreenshot().
     */
    public static void user_clicks_on_Add_Role_button_Inside_Module() {
        CommonUtils.clickOnElement(manageI2EUsersPage.addRoleButtonInsideModule);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Deletes a role to re-run a test before adding the role.
     *
     * @param role the name of the role to be deleted
     */
    public static void tester_deletes_role_to_re_run_test_before_adding_role(String role) {

        try {
            MiscUtils.sleep(2000);
            if (WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(text(),'" + role + "')]//parent::td//parent::tr/td)[5]/span/button")).isDisplayed()) {
                WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(text(),'" + role + "')]//parent::td//parent::tr/td)[5]/span/button")).click();
                WebDriverUtils.webDriver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
            }
        } catch (WebDriverException e) {
            System.out.println("* * * GM ACCOUNT MANAGER ROLE NOT PRESENT -- TEST CONTINUES * * *");
            CucumberLogUtils.scenario.log("* * * GM ACCOUNT MANAGER ROLE NOT PRESENT -- TEST CONTINUES * * *");
        }
    }

    /**
     * Waits for 2 seconds and then performs a click action on the I_E_Role_drop_down element in the account details page.
     */
    public static void user_clicks_I_E_Role_drop_down() {
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(accountDetailsPage.I2ERoleDropDown);
    }

    /**
     * Selects the I&E Technical Support role for the user in the system.
     * This method clicks on the technical support role element on the account details page,
     * sleeps for 1000 milliseconds, and logs a screenshot of the page.
     */
    public static void user_selects_I_E_Technical_Support_Role() {
        CommonUtils.clickOnElement(accountDetailsPage.technicalSupportRole);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Displays a warning message with user information.
     *
     * @param user    the user information to be displayed in the warning message
     * @param message the warning message to be displayed
     */
    public static void warning_message_with_user_displays_with(String user, String message) {
        System.out.println(accountDetailsPage.duplicateRoleWarningMessage.getText());
        Assert.assertTrue(accountDetailsPage.duplicateRoleWarningMessage.getText().contains(user));
        Assert.assertTrue(accountDetailsPage.duplicateRoleWarningMessage.getText().contains(message));
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method saves the ITwoE Technical Support Role that was added.
     * <p>
     * It first clicks on the close button of the add role modal window.
     * After a short delay, it clicks on the save changes button on the account details page.
     */
    public static void user_saves_ITwoE_Technical_Support_Role_that_was_added_role() {
        CommonUtils.clickOnElement(accountDetailsPage.addRoleModalClose);
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(accountDetailsPage.saveChangesButton);
        MiscUtils.sleep(2000);
    }

    /**
     * Verifies that the first and last name of the logged in user are shown correctly.
     *
     * @param expectedName the expected first and last name of the logged in user
     */
    public static void user_can_verify_that_first_and_last_name_of_logged_in_user_are_shown(String expectedName) {
        MiscUtils.sleep(2000);
        CommonUtils.waitForClickability(WebDriverUtils.webDriver.findElement(By.xpath("//body/app-root/app-header/lib-header/header/nav/div/div/ul/li/span[1]")));
        String actualName = WebDriverUtils.webDriver.findElement(By.xpath("//body/app-root/app-header/lib-header/header/nav/div/div/ul/li/span[1]")).getText();
        Assert.assertEquals(actualName, expectedName);
    }

    /**
     * This method is used to simulate a user clicking on the "My DOC Discrepancies" element.
     * It uses JavaScript to perform the click action and logs a screenshot after the click.
     */
    public static void user_clicks_on_My_DOC_Discrepancies() {
        JavascriptUtils.clickByJS(manageI2EUsersPage.myDOCDiscrepancies);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method simulates a user clicking on the IMPAC II Portfolio Analysis.
     * It clicks on the element representing the IMPAC II Portfolio Analysis, waits for 3 seconds, and logs a screenshot.
     */
    public static void user_clicks_on_IMPAC_II_Portfolio_Analysis() {
        CommonUtils.clickOnElement(manageI2EUsersPage.impac2PortfolioAnalysis);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method simulates the user clicking on the I/E Portfolio Analysis.
     *
     * @param int1 The value of int1 is not used in this method.
     */
    public static void user_clicks_on_I_E_Portfolio_Analysis(Integer int1) {
        CommonUtils.clickOnElement(manageI2EUsersPage.i2EPortfolioAnalysis);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method simulates a user clicking on the 'Accounts Audit' option.
     * It clicks on the element using the CommonUtils class, sleeps for 3000 milliseconds to allow for loading time,
     * and logs a screenshot of the page using the CucumberLogUtils class.
     *
     * @return void
     */
    public static void user_clicks_on_Accounts_Audit() {
        CommonUtils.clickOnElement(manageI2EUsersPage.accountsAudit);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Simulates a user clicking on the "NEAR" button.
     * <p>
     * This method finds the "NEAR" button element on the manageI2EUsersPage and clicks on it.
     * It then waits for 3 seconds before taking a screenshot using CucumberLogUtils.
     */
    public static void user_clicks_on_NEAR() {
        CommonUtils.clickOnElement(manageI2EUsersPage.near);
        MiscUtils.sleep(3000);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Waits for the save changes button to be clickable and then clicks on it.
     * Takes a screenshot after saving changes.
     */
    public static void user_Saves_Changes() {
        CommonUtils.waitForClickability(accountDetailsPage.saveChangesButton);
        CommonUtils.clickOnElement(accountDetailsPage.saveChangesButton);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies that predictive search is available for I2E Role dropdown.
     *
     * @param role The role to be searched in the dropdown.
     */
    public static void user_can_verify_that_predictive_search_is_available_for_i_two_e_role_dropdown(String role) {
        CommonUtils.clickOnElement(manageI2EUsersPage.I2ERoleDropD);
        CommonUtils.sendKeysToElement(manageI2EUsersPage.I2ERoleDropDownTextBox, role);
        List<WebElement> roles = WebDriverUtils.webDriver.findElements(By.xpath("/html/body/span/span/span[2]/ul/li"));
        for (WebElement gmRole : roles) {
            String actualText = gmRole.getText();
            CommonUtils.assertTrueTestNG(actualText.contains(role), "--- PREDICTIVE SEARCH IS NOT WORKING ---");
        }
    }

    /**
     * This method allows the user to choose the administrative option from the business area dropdown.
     * It performs the following steps:
     * 1. Closes the add role modal by clicking on the close button.
     * 2. Clicks on the add role button.
     * 3. Clicks on the All Business Area dropdown.
     * 4. Clicks on the Administrative Business Area dropdown option.
     */
    public static void user_chooses_administrative_option_from_business_area_dropdown() {
        CommonUtils.clickOnElement(accountDetailsPage.addRoleModalClose);
        CommonUtils.clickOnElement(accountDetailsPage.addRole);
        CommonUtils.clickOnElement(accountDetailsPage.allBADropDown);
        CommonUtils.clickOnElement(accountDetailsPage.administrativeBADropDownOption);
    }

    /**
     * This method verifies that appropriate i2e roles are available through the i2e role dropdown. It performs the following steps:
     * 1. Clicks on the i2e role dropdown.
     * 2. Asserts that the i2e Tech Support option is displayed.
     * 3. Logs a screenshot.
     */
    public static void user_can_verify_that_appropriate_i_two_e_roles_are_available_via_i_two_e_role_dropdown() {
        CommonUtils.clickOnElement(manageI2EUsersPage.I2ERoleDropD);
        Assert.assertTrue(accountDetailsPage.i2ETechSupportDropDownOption.isDisplayed());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method allows the user to pick the eGrants access representative role.
     * It performs the following steps:
     * 1. Clicks on the eGrants access representative role element in the account details page.
     * 2. Logs a screenshot of the page.
     */
    public static void user_can_pick_e_grants_access_representative_role() {
        CommonUtils.clickOnElement(accountDetailsPage.eGrantsAccessRepresentativeRole);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method allows the user to remove the e-grants access representative role.
     * It waits for the remove items icon to be clickable, clicks on it, and logs a screenshot.
     */
    public static void user_can_remove_e_grants_access_representative_role() {
        CommonUtils.waitForClickability(accountDetailsPage.removeItemsIconi2E);
        CommonUtils.clickOnElement(accountDetailsPage.removeItemsIconi2E);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Clears the administrative option form Business Area choice.
     * This method waits for the Business Area icon to be clickable, clicks on it to remove the items,
     * clicks on the Business Area dropdown, and logs a screenshot.
     */
    public static void user_clears_Administrative_option_form_Business_Area_choice() {
        CommonUtils.waitForClickability(accountDetailsPage.removeItemsBAIcon);
        CommonUtils.clickOnElement(accountDetailsPage.removeItemsBAIcon);
        CommonUtils.clickOnElement(accountDetailsPage.allBADropDown);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Clears the choices for the iTwo e-roles and displays a message if it is not visible.
     *
     * @param message the message to be displayed
     */
    public static void itwo_e_roles_choices_are_cleared_too_with_message(String message) {
        Assert.assertTrue(Dynamic_Locators.dynamicTextLocator(message).isDisplayed(), "--- MESSAGE DOES NOT APPEAR!! ---");
        CucumberLogUtils.logScreenshot();
    }

    /**
     * User chooses the administrative option from the business area dropdown again.
     * This method clicks on the business area dropdown on the account details page, selects the administrative option,
     * and waits for 5 seconds.
     */
    public static void user_chooses_administrative_option_from_business_area_dropdown_again() {
        CommonUtils.clickOnElement(accountDetailsPage.allBADropDown);
        CommonUtils.waitForClickability(accountDetailsPage.administrativeBADropDownOption);
        CommonUtils.clickOnElement(accountDetailsPage.administrativeBADropDownOption);
        MiscUtils.sleep(5000);
    }

    /**
     * Verifies that the given administrative related roles are reflected in the I2E role dropdown.
     *
     * @param role1 The first administrative related role to verify.
     * @param role2 The second administrative related role to verify.
     * @param role3 The third administrative related role to verify.
     * @param role4 The fourth administrative related role to verify.
     */
    public static void user_can_verify_that_administrative_related_roles_are_reflected_in_i2e_role_dropdown(String role1, String role2, String role3, String role4) {
        MiscUtils.sleep(6000);
        CommonUtils.clickOnElement(manageI2EUsersPage.I2ERoleDropD);
        MiscUtils.sleep(6000);
        ArrayList<String> list = new ArrayList();
        list.add(role1);
        list.add(role2);
        list.add(role3);
        list.add(role4);
        List<WebElement> i2eRoles = WebDriverUtils.webDriver.findElements(By.xpath("/html/body/span/span/span[2]/ul/li"));
        ArrayList<String> actualRoleTextValues = new ArrayList<>();
        for(WebElement i2eRole : i2eRoles){
            String actualRoleText = i2eRole.getText();
            actualRoleTextValues.add(actualRoleText);
        }
        Assert.assertEquals(actualRoleTextValues, list);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Selects the "Financial" option from the business area dropdown.
     */
    public static void user_picks_financial_from_business_area_dropdown() {
        CommonUtils.clickOnElement(accountDetailsPage.allBADropDown);
        CommonUtils.waitForClickability(accountDetailsPage.financialBA);
        CommonUtils.clickOnElement(accountDetailsPage.financialBA);
    }

    /**
     * Checks if the user is on the Manage I/E Users page.
     *
     * @param int1 an integer parameter (not used in the method)
     */
    public static void user_is_on_Manage_I_E_Users_page(Integer int1) {
        CommonUtils.waitForVisibility(manageI2EUsersPage.i2EPageTitle);
        CommonUtils.assertTrue(manageI2EUsersPage.i2EPageTitle.isDisplayed());
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method simulates a user clicking on the "Add Role" button.
     * It uses the CommonUtils class to perform the click action on the corresponding element in the accountDetailsPage.
     * After the click, it logs a screenshot using the CucumberLogUtils class.
     *
     * @see CommonUtils
     * @see CucumberLogUtils
     */
    public static void user_clicks_Add_Role_button() {
        CommonUtils.clickOnElement(accountDetailsPage.addRole);
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Clicks the "Show Advanced Filters" button on the manageI2EUsersPage and logs a screenshot using the CucumberLogUtils.
     */
    public static void clicks_show_advanced_filters() {
        manageI2EUsersPage.showAdvancedFilters.click();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Performs a search action on the Manage I2E Users page.
     * This method clicks the search button and logs a screenshot.
     */
    public static void searches() {
        manageI2EUsersPage.searchButtonI2ESearch.click();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * This method verifies if the "Add Role" button is displayed on the create new account page.
     * It logs a screenshot and asserts that the button is displayed.
     */
    public static void can_verify_the_add_role_button() {
        CucumberLogUtils.logScreenshot();
        Assert.assertTrue(createNewAccountPage.add_role_button.isDisplayed());
    }

    /**
     * Verifies that a title is present with a specific tooltip text.
     *
     * @param expectedTitle       The expected title of the element.
     * @param text                The text used to locate the element.
     * @param expectedToolTipText The expected tooltip text of the element.
     */
    public static void can_verify_that_title_is_present_with_tooltip(String expectedTitle, String text, String expectedToolTipText) {
        EMStepsImplementation.user_can_verify_that_title_is_present(expectedTitle);
        CommonUtils.waitForClickability(modifyAccountPage.cancerActivityMonitorsToolTip);
        modifyAccountPage.cancerActivityMonitorsToolTip.click();
        CommonUtils.waitForVisibility(Dynamic_Locators.dynamicContainsTextLocator(text));
        String actualToolTipText = Dynamic_Locators.dynamicContainsTextLocator(text).getText();
        CucumberLogUtils.logScreenshot();
        Assert.assertEquals(actualToolTipText, expectedToolTipText);
    }

    /**
     * Verifies if a button with the specified text is enabled.
     *
     * @param text the text to search for the button
     *
     */
    public static void user_can_verify_that_button_is_enabled(String text) {
        JavascriptUtils.scrollIntoView(Dynamic_Locators.dynamicTextLocator(text));
        boolean isDeactivateAccountButtonEnabled = Dynamic_Locators.dynamicTextLocator(text).isEnabled();
        CucumberLogUtils.logScreenshot();
        Assert.assertTrue(isDeactivateAccountButtonEnabled, "* * * DEACTIVATE BUTTON IS NOT ENABLED * * *");
    }

    /**
     * This method allows the user to verify whether a button is disabled or not.
     *
     * @param text the text of the button to verify
     */
    public static void user_can_verify_that_button_is_disabled(String text) {
        boolean isSaveChangesButtonEnabled = Dynamic_Locators.dynamicTextLocator(text).isEnabled();
        CucumberLogUtils.logScreenshot();
        Assert.assertFalse(isSaveChangesButtonEnabled, "* * * SAVE CHANGES BUTTON IS ENABLED * * *");
    }

    /**
     * Verifies that a section is displayed based on the given text.
     *
     * @param text The text to find and verify if it is displayed.
     */
    public static void user_can_verify_that_section_is_displayed(String text) {
        boolean isTextDisplayed = Dynamic_Locators.dynamicTextLocator(text).isDisplayed();
        CucumberLogUtils.logScreenshot();
        Assert.assertTrue(isTextDisplayed, "* * * VERIFYING I2E ACCOUNT HISTORY TEXT IS DISPLAYED * * *");
    }

    /**
     * This method simulates a user's click on the "Show" button for a specific element identified by the given text.
     *
     * @param text The text identifying the element for which the "Show" button needs to be clicked.
     */
    public static void user_clicks_on_show_for(String text) {
        JavascriptUtils.scrollIntoView(ModifyAccountPage.dynamicShowLinkLocator(text));
        ModifyAccountPage.dynamicShowLinkLocator(text).click();
        CucumberLogUtils.logScreenshot();
    }

    /**
     * Verifies the column header names of the inactive I2E roles table in the user interface.
     *
     * @param expectedRoleText           The expected column header name for the Role.
     * @param expectedRoleOrganizationText   The expected column header name for the Role Organization.
     * @param expectedStartDateText      The expected column header name for the Start Date.
     * @param expectedEndDateText        The expected column header name for the End Date.
     * @param expectedUpdateByText       The expected column header name for the Updated By.
     */
    public static void user_verifies_inactive_i2e_roles_column_header_names(String expectedRoleText, String expectedRoleOrganizationText, String expectedStartDateText, String expectedEndDateText, String expectedUpdateByText) {
        MiscUtils.sleep(2000);
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(expectedRoleText);
        expectedValues.add(expectedRoleOrganizationText);
        expectedValues.add(expectedStartDateText);
        expectedValues.add(expectedEndDateText);
        expectedValues.add(expectedUpdateByText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.comparingTwoLists(modifyAccountPage.actualInactiveI2ERolesColumnHeaderValues, expectedValues);
    }


    /**
     * This method verifies that the start dates are displayed in descending order.
     * It extracts the dates from the column headers of the inactive I2E roles table on the modify account page.
     * It compares each date with the next date in the list to ensure that they are in descending order.
     * If any pair of dates is not in descending order, an asterisked message is logged.
     * @throws AssertionError if the start dates are not in descending order
     */
    public static void user_verifies_that_start_dates_are_displayed_in_descending_order() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        List<LocalDate> dates = modifyAccountPage.inactiveI2ERolesTableColumnHeaders.stream()
                .map(e -> LocalDate.parse(e.getText(), formatter))
                .collect(Collectors.toList());
        CucumberLogUtils.logScreenshot();
        for (int i = 0; i < dates.size() - 1; i++) {
            Assert.assertTrue(dates.get(i).compareTo(dates.get(i + 1)) >= 0, "* * * DATES ARE NOT IN DESCENDING ORDER * * *");
        }
    }

    /**
     * Verifies column header names for inactive cancer activities.
     *
     * @param expectedCancerActivityText The expected column header name for cancer activity.
     * @param expectedTypeText The expected column header name for type.
     * @param expectedStartDateText The expected column header name for start date.
     * @param expectedEndDateText The expected column header name for end date.
     * @param expectedUpdatedByText The expected column header name for updated by.
     */
    public static void user_verifies_inactive_cancer_activities_column_header_names(String expectedCancerActivityText, String expectedTypeText, String expectedStartDateText, String expectedEndDateText, String expectedUpdatedByText) {
        MiscUtils.sleep(2000);
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(expectedCancerActivityText);
        expectedValues.add(expectedTypeText);
        expectedValues.add(expectedStartDateText);
        expectedValues.add(expectedEndDateText);
        expectedValues.add(expectedUpdatedByText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.comparingTwoLists(modifyAccountPage.actualInactiveCancerActivitiesValues, expectedValues);
    }

    /**
     * Verifies the column header names for change history.
     *
     * @param expectedDateText The expected header name for the date column.
     * @param expectedChangesMadeText The expected header name for the changes made column.
     * @param expectedUpdatedByText The expected header name for the updated by column.
     */
    public static void user_verifies_change_history_column_header_names(String expectedDateText, String expectedChangesMadeText, String expectedUpdatedByText) {
        MiscUtils.sleep(2000);
        ArrayList<String> expectedValues = new ArrayList<>();
        expectedValues.add(expectedDateText);
        expectedValues.add(expectedChangesMadeText);
        expectedValues.add(expectedUpdatedByText);
        CucumberLogUtils.logScreenshot();
        CommonUtils.comparingTwoLists(modifyAccountPage.actualChangeHistoryValues, expectedValues);
    }

    /**
     * Verifies that start dates for change history table are displayed in descending order.
     */
    public static void user_verifies_that_start_dates_for_change_history_table_are_displayed_in_descending_order() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        List<LocalDate> dates = modifyAccountPage.changeHistoryDateValues.stream()
                .map(e -> LocalDate.parse(e.getText(), formatter))
                .collect(Collectors.toList());
        CucumberLogUtils.logScreenshot();
        for (int i = 0; i < dates.size() - 1; i++) {
            Assert.assertTrue(dates.get(i).compareTo(dates.get(i + 1)) >= 0, "* * * DATES ARE NOT IN DESCENDING ORDER * * *");
        }
    }

    /**
     * Scrolls the page to the specified hyperlink element and clicks on it.
     * Takes a string parameter to identify the hyperlink by its text.
     * After clicking on the hyperlink, it logs a screenshot using CucumberLogUtils.
     *
     * @param text the text to identify the hyperlink element
     */
    public static void user_is_able_to_click_on_the_hyperlink(String text) {
        JavascriptUtils.scrollIntoView(Dynamic_Locators.dynamicTextLocator(text));
        Dynamic_Locators.dynamicTextLocator(text).click();
        CucumberLogUtils.logScreenshot();
    }
}