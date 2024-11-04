package ServiceNow.NCCR.Steps;

import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.ArrayList;

public class NCCRSteps  extends PageInitializer {

    @Given("Submitter User logged in to NCCR Portal")
    public void submitter_user_logged_in_to_nccr_portal() {
        nccrStepsImplementation.nccrSubmitterUserLogin();
    }

    /**
     * User verifies User is on the NCCR Portal landing page
     */
    @Given("User can verify that User is on the NCCR Portal landing page")
    public void user_can_verify_that_user_is_on_the_nccr_portal_landing_page() {
        Assert.assertTrue(nccrPage.sectionMyAssignedDataRequest.isDisplayed());
    }

    @Given("User see {string} section")
    public void user_see_section(String section) {
        nccrStepsImplementation.verifySectionDisplayed(section);
    }

    @Given("User confirms that the text of {string} section is correct")
    public void user_confirms_that_the_text_of_section_is_correct(String text) {
        nccrStepsImplementation.verifySectionTexDisplayed(text);
    }

    /**
     * User clicks on Native View hyperlink
     */
    @When("User clicks on Native View hyperlink")
    public void user_clicks_on_native_view_hyperlink() {
        CommonUtils.clickOnElement(nccrPage.nativeViewHyperlink);
    }

    /**
     * User opens Native View page and closes it
     */
    @Then("User can confirm that it redirects them to Native View page")
    public void user_can_confirm_that_it_redirects_them_to_native_view_page() {
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        Assert.assertTrue(nccrPage.nativeViewPageHeader.isDisplayed());
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));
        CommonUtils.sleep(2000);
    }

    @When("User clicks Go to the NCCR Platform hyperlink")
    public void user_clicks_go_to_the_nccr_platform_hyperlink() {
        CommonUtils.clickOnElement(nccrPage.nccrDataPlatformHyperlink);
    }

    @Then("User can confirm that it redirects them to Data Platform page")
    public void user_can_confirm_that_it_redirects_them_to_data_platform_page() {
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        Assert.assertTrue(nccrPage.dataPlatformPageHeader.isDisplayed());
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));
        CommonUtils.sleep(2000);
    }

    @Then("User can see Data Requests Awaiting My Review tab")
    public void user_can_see_data_requests_awaiting_my_review_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can confirm the right columns ar displayed for Data Requests Awaiting My Review tab")
    public void user_can_confirm_the_right_columns_ar_displayed_for_data_requests_awaiting_my_review_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can see Data Requests Awaiting My Review tab search text field")
    public void user_can_see_data_requests_awaiting_my_review_tab_search_text_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can see pagination for Data Requests Awaiting My Review tab")
    public void user_can_see_pagination_for_data_requests_awaiting_my_review_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User clicks on All Data Requests tab")
    public void user_clicks_on_all_data_requests_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can confirm the right columns ar displayed for All Data Requests tab")
    public void user_can_confirm_the_right_columns_ar_displayed_for_all_data_requests_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can see All Data Requests tab search text field")
    public void user_can_see_all_data_requests_tab_search_text_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User clicks Show Filter icon")
    public void user_clicks_show_filter_icon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can see Load Filter, Save Filter, Add Sort, and New Criteria buttons")
    public void user_can_see_load_filter_save_filter_add_sort_and_new_criteria_buttons() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can close filter")
    public void user_can_close_filter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User can see pagination for All Data Requests tab")
    public void user_can_see_pagination_for_all_data_requests_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
