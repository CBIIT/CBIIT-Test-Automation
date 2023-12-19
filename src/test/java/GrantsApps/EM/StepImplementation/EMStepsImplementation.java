package GrantsApps.EM.StepImplementation;

import GrantsApps.EM.Pages.ManageI2EUsersPage;
import GrantsApps.EM.Utils.EM_Constants;
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
import java.util.ArrayList;
import java.util.List;

public class EMStepsImplementation extends PageInitializer {

    static String expectedNEDname;

    public void emLogin(String userName) throws TestingException {
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

    public static void user_is_logged_in_as_primary_ic_coordinator() {
        WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("EM"));
        iTrustLoginPageImpl.loginToITrust();
        CucumberLogUtils.logScreenshot();
    }

    public static void verifies_that_first_and_last_name_of_logged_in_user_are_shown(String user) {
        String actualUser = ManageI2EUsersPage.dynamicUserTextLocator(user).getText();
        Assert.assertEquals(actualUser, user);
        CucumberLogUtils.logScreenshot();
    }

    public static void verifyingUserIsOnI2EPage(String expectedPageName) {
        String actualPageName = manageI2EUsersPage.i2ePageTitle.getText();
        Assert.assertEquals(actualPageName, expectedPageName);
        CucumberLogUtils.logScreenshot();
    }

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

    public static void verifyingContactOptions(String option1, String option2) {
        ManageI2EUsersPage.dynamicLinkLocator("Contact ").click();
        MiscUtils.sleep(2000);
        String actualEmailTechnicalSupportText = ManageI2EUsersPage.dynamicLinkLocator(option1).getText();
        Assert.assertEquals(actualEmailTechnicalSupportText, option1.trim());
        String actualEmailBusinessPolicyText = ManageI2EUsersPage.dynamicLinkLocator(option2).getText();
        Assert.assertEquals(actualEmailBusinessPolicyText, option2.trim());
        CucumberLogUtils.logScreenshot();
    }

    public static void selects_values_in_i2e_account_status_drop_down_list(String text) {
        CommonUtils.waitForVisibility(manageI2EUsersPage.i2eAccountStatusDropDown);
        manageI2EUsersPage.i2eAccountStatusDropDown.click();
        CommonUtils.selectValueFromBootStrapDropDown(manageI2EUsersPage.i2eAccountStatusValues, text);
        MiscUtils.sleep(2000);
    }

    public static void user_can_verify_that_user_s_full_name_is_displayed() {
        MiscUtils.sleep(5000);
        JavascriptUtils.scrollIntoView(manageI2EUsersPage.createButton);
        expectedNEDname = JavascriptUtils.getTextUsingJS(manageI2EUsersPage.fullNEDName);
    }

    public static void clicks_create_on_the_first_record_in_the_results() {
        MiscUtils.sleep(5000);
        JavascriptUtils.scrollIntoView(manageI2EUsersPage.createButton);
        JavascriptUtils.clickByJS(manageI2EUsersPage.createButton);
        MiscUtils.sleep(2000);
    }

    public static void user_can_verify_the_page_name_is(String expectedPageName) {
        String actualPageName = createNewAccountPage.createNewAccountTitle.getText();
        Assert.assertEquals(actualPageName, expectedPageName);
        MiscUtils.sleep(2000);
        CucumberLogUtils.logScreenshot();
    }

    public static void user_can_verify_that_users_full_name_is_displayed() {
        String actual_NED_full_name = createNewAccountPage.full_NED_name.getText();
        Assert.assertEquals(actual_NED_full_name, expectedNEDname);
    }

    public static void user_can_verify_the_respective_wording_of_full_name_tooltip(String expectedWording_of_full_name_tooltip) {
        createNewAccountPage.tooltipNEDnameLink.click();
        MiscUtils.sleep(1000);
        String actualWording_of_full_name_tooltip = createNewAccountPage.tooltipNEDnameText.getText();
        Assert.assertEquals(actualWording_of_full_name_tooltip, expectedWording_of_full_name_tooltip);
    }

    public static void user_can_verify_that_the_following_fields_have_values_displayed_nih_network_id_e_mail_ned_organization_sac_code_ned_classification() {
        boolean is_NIH_network_id_displayed = createNewAccountPage.nihNetworkID.isDisplayed();
        Assert.assertTrue(is_NIH_network_id_displayed, "-- VERIFYING THAT NIH NETWORK ID VALUE IS DISPLAYED --");
        boolean is_email_displayed = createNewAccountPage.email.isDisplayed();
        Assert.assertTrue(is_email_displayed, "--VERIFYING THAT EMAIL VALUE IS DISPLAYED --");
        boolean is_NED_organization_displayed = createNewAccountPage.ned_organisation.isDisplayed();
        Assert.assertTrue(is_NED_organization_displayed, "--VERIFYING THAT NED ORGANISATION VALUE IS DISPLAYED --");
        boolean is_SAC_code_displayed = createNewAccountPage.sac_code.isDisplayed();
        Assert.assertTrue(is_SAC_code_displayed, "--VERIFYING THAT SAC CODE VALUE IS DISPLAYED --");
        boolean is_NED_classification_displayed = createNewAccountPage.ned_classification.isDisplayed();
        Assert.assertTrue(is_NED_classification_displayed, "--VERIFYING THAT NED CLASSIFICATION VALUE IS DISPLAYED --");
        CucumberLogUtils.logScreenshot();
    }

    public static void user_can_verify_that_account_status_is_set_to(String expectedAccountStatus) {
        String actualAccountStatus = createNewAccountPage.account_status.getText();
        Assert.assertEquals(actualAccountStatus, expectedAccountStatus);
    }

    public static void user_can_verify_the_table_title_is(String expectedI2ErolesTableTitle) {
        String actualI2ErolesTableTitle = createNewAccountPage.active_I2E_roles_table_title.getText();
        Assert.assertEquals(actualI2ErolesTableTitle, expectedI2ErolesTableTitle);
        CucumberLogUtils.logScreenshot();
    }

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
        Assert.assertEquals(actualHeaders, expectedHeaders);
        CucumberLogUtils.logScreenshot();
    }

    public static void user_can_verify_that_title_is_present(String expectedTitle) {
        String actualTitle = createNewAccountPage.cancer_activity_monitors_optional_title.getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        CucumberLogUtils.logScreenshot();
    }

    public static void user_clicks_add_role_button() {
        createNewAccountPage.add_role_button.click();

    }

    public static void user_clicks_i2e_role_drop_down() {
        MiscUtils.sleep(2000);
        createNewAccountPage.i2e_role_drop_down.click();
    }

    public static void user_can_verify_that_business_area_drop_down_is_pre_populated_with_value(String expectedAdministrativeText) {
        String actualAdministrativeText = createNewAccountPage.administrative_business_area.getText();
        CommonUtils.assertEquals(actualAdministrativeText, expectedAdministrativeText);
        CucumberLogUtils.logScreenshot();
    }

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

    public static void user_saves_changes() {
        createNewAccountPage.save_changes_button.click();
        CommonUtils.acceptAlert();
    }

    public static void user_can_verify_the_success_message_is_displayed(String expectedSuccessMessage) {
        String actualSuccessMessage = createNewAccountPage.success_message.getText();
        Assert.assertEquals(actualSuccessMessage,expectedSuccessMessage);
        MiscUtils.sleep(1000);
        CucumberLogUtils.logScreenshot();
    }

    public static void user_can_verify_that_return_to_manage_i2e_users_hyperlink_directs_to_url(String searchPageExpectedURL) {
        createNewAccountPage.return_to_manage_i2e_users_hyperlink.click();
        MiscUtils.sleep(2000);
        String searchPageActualURL = webDriver.getCurrentUrl();
        Assert.assertEquals(searchPageActualURL,searchPageExpectedURL);
        CucumberLogUtils.logScreenshot();
    }
}