package CustomBusiness.CCR.Steps;

import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import java.util.Map;

public class InternalUserSteps extends PageInitializer {
    @Given("User is on CCR Landing page and user is {string}")
    public void user_is_on_ccr_landing_page_and_user_is(String user) throws TestingException {
        switch (user) {
            case "internal user":
                cCRLogInStepsImplementation.ccrLogin();
                break;
        }
    }
    @Given("User can see tabs displayed")
    public void user_can_see_tabs_displayed(io.cucumber.datatable.DataTable data) {
        Map<String, String> options = CommonUtil.getMapFromDataTable(data);
        Assert.assertTrue(options.get("Option1"),cCRLandingPage.homeTab.isDisplayed());
        Assert.assertTrue(options.get("Option2"),cCRLandingPage.positionsTab.isDisplayed());
    }
//    @Given("User navigates to {string} open vacancy")
//    public void user_navigates_to_open_vacancy(String text) {
//        CommonUtils.clickOnElement();
//    }
//    @Given("User clicks {string} button")
//    public void user_clicks_button(String text) {
//        CommonUtils.clickOnElement();
//    }
    @Given("User enters {string} into a first name field")
    public void user_enters_into_a_first_name_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User enter {string} into a middle name field")
    public void user_enter_into_a_middle_name_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User enter {string} into a last name field")
    public void user_enter_into_a_last_name_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User enter {string} into an email field")
    public void user_enter_into_an_email_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User enter {string} into a phone field")
    public void user_enter_into_a_phone_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User enter {string} into a business phone field")
    public void user_enter_into_a_business_phone_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User enter {string} into a degree field")
    public void user_enter_into_a_degree_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User enter {string} into an other degree field")
    public void user_enter_into_an_other_degree_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("User confirms that User is a US Citizen")
    public void user_confirms_that_user_is_a_us_citizen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}