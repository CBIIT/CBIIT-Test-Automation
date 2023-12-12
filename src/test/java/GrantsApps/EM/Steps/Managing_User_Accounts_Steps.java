package GrantsApps.EM.Steps;

import GrantsApps.EM.Pages.ManageI2EUsersPage;
import GrantsApps.EM.StepImplementation.EMStepsImplementation;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Managing_User_Accounts_Steps extends PageInitializer {

    String expectedNEDname;

    @Given("clicks Show Advanced Filters")
    public void clicks_show_advanced_filters() {
        manageI2EUsersPage.showAdvancedFilters.click();
    }

    @Given("selects {string} in I2E Account Status drop down list")
    public void selects_in_i2e_account_status_drop_down_list(String text) {
        EMStepsImplementation.selects_values_in_i2e_account_status_drop_down_list(text);
    }

    @Given("searches")
    public void searches() {
        manageI2EUsersPage.searchButtonI2ESearch.click();
    }

    @And("gets the full NED name of the first record")
    public void user_can_verify_that_user_s_full_name_is_displayed() {
        MiscUtils.sleep(5000);
        JavascriptUtils.scrollIntoView(manageI2EUsersPage.createButton);
        expectedNEDname = JavascriptUtils.getTextUsingJS(manageI2EUsersPage.fullNEDName);
    }

    @Given("clicks Create on the first record in the results")
    public void clicks_create_on_the_first_record_in_the_results() {
        EMStepsImplementation.clicks_create_on_the_first_record_in_the_results();

    }

    @Given("User can verify the page name is {string}")
    public void user_can_verify_the_page_name_is(String expectedName) {
        EMStepsImplementation.user_can_verify_the_page_name_is(expectedName);
    }

    @Given("can verify that User's full name is displayed")
    public void can_verify_that_user_s_full_name_is_displayed() {
        String actual_NED_full_name = createNewAccountPage.full_NED_name.getText();
        Assert.assertEquals(actual_NED_full_name, expectedNEDname);
    }

    @Given("can verify the respective wording of Full Name tooltip {string}")
    public void can_verify_the_respective_wording_of_full_name_tooltip(String expectedWording_of_full_name_tooltip) {
        EMStepsImplementation.user_can_verify_the_respective_wording_of_full_name_tooltip(expectedWording_of_full_name_tooltip);
    }

    @Given("can verify that the following fields have values displayed: NIH \\(Network) ID, E-mail, NED Organization, SAC Code, NED Classification")
    public void can_verify_that_the_following_fields_have_values_displayed_nih_network_id_e_mail_ned_organization_sac_code_ned_classification() {
        EMStepsImplementation.user_can_verify_that_the_following_fields_have_values_displayed_nih_network_id_e_mail_ned_organization_sac_code_ned_classification();
    }

    @Given("can verify that Account Status is set to {string}")
    public void can_verify_that_account_status_is_set_to(String expectedAccountStatus) {
        EMStepsImplementation.user_can_verify_that_account_status_is_set_to(expectedAccountStatus);
    }

    @Given("can verify the table title is {string}")
    public void can_verify_the_table_title_is(String expectedI2ErolesTableTitle) {
        EMStepsImplementation.user_can_verify_the_table_title_is(expectedI2ErolesTableTitle);
    }

    @Given("can verify the PDF document link {string} opens upon clicking on the List of I2E Roles hyperlink")
    public void can_verify_the_pdf_document_link_opens_upon_clicking_on_the_list_of_i2e_roles_hyperlink(String expected_I2E_roles_pdf_url) {
        EMStepsImplementation.user_can_verify_the_pdf_document_link_opens_upon_clicking_on_the_list_of_i2e_roles_hyperlink(expected_I2E_roles_pdf_url);
    }
}
