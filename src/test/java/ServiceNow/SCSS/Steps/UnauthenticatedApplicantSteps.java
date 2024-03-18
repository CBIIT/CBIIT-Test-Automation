package ServiceNow.SCSS.Steps;




import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.xceptions.TestingException;




public class UnauthenticatedApplicantSteps  extends PageInitializer {

    @Given("User is on AppTracker home page and user is Unauthenticated Applicant")
    public void user_is_on_AppTracker_home_page_and_user_is_Unauthenticated_Applicant() throws TestingException {
        unauthenticatedApplicantFlowStepsImplementation.loginUnauthenticated();
    }

    @When("User  clicks on the register for Okta within the Login dropdown")
    public void user_clicks_on_the_register_for_Okta_within_the_Login_dropdown() {
        CommonUtils.clickOnElement(unauthenticatedApplicantPage.registerForOkta);
        MiscUtils.sleep(2000);
    }

    @When("User enters registration details")
    public void user_enters_registration_details() {
        CommonUtils.sendKeys(unauthenticatedApplicantPage.firstNameOktaRegistration, "Elena");
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(unauthenticatedApplicantPage.lastNameOktaRegistration, "Sun");
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(unauthenticatedApplicantPage.phoneNumberOktaRegistration, "7892223434");
        MiscUtils.sleep(2000);

    }

    @When("User enters an email that has an Okta account assigned to it")
    public void user_enters_an_email_that_has_an_Okta_account_assigned_to_it() {
        CommonUtils.sendKeys(unauthenticatedApplicantPage.emailOktaRegistration, "anekrashevich@unissant.com");
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(unauthenticatedApplicantPage.confirmEmailOktaRegistration, "anekrashevich@unissant.com");
        MiscUtils.sleep(2000);
    }

    @Then("User can see that error message {string}")
    public void user_can_see_that_error_message(String string) {
        CommonUtils.clickOnElement(unauthenticatedApplicantPage.createAccountOktaRegistration);
        MiscUtils.sleep(2000);
        Assert.assertTrue(unauthenticatedApplicantPage.sameEmailErrorOktaRegistration.isDisplayed());
        MiscUtils.sleep(2000);
    }

    @When("User can see Login button for existing Okta accounts")
    public void user_can_see_Login_button_for_existing_Okta_accounts() {
        Assert.assertTrue(unauthenticatedApplicantPage.loginButtonOktaRegistration.isDisplayed());
        MiscUtils.sleep(2000);
    }

    @When("User enters all the registration details")
    public void user_enters_all_the_registration_details() {
        CommonUtils.sendKeys(unauthenticatedApplicantPage.firstNameOktaRegistration, "Elena");
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(unauthenticatedApplicantPage.lastNameOktaRegistration, "Sun");
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(unauthenticatedApplicantPage.emailOktaRegistration, "qaw123123P@outlook.com");
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(unauthenticatedApplicantPage.confirmEmailOktaRegistration, "qaw123123P@outlook.com");
        MiscUtils.sleep(2000);
        CommonUtils.sendKeys(unauthenticatedApplicantPage.phoneNumberOktaRegistration, "7892223434");
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(unauthenticatedApplicantPage.createAccountOktaRegistration);
    }

    @Then("User can verify that Okta account was not created")
    public void user_can_verify_that_Okta_account_was_successfully_created() {
        MiscUtils.sleep(2000);
        Assert.assertTrue(unauthenticatedApplicantPage.errorAccountOkta.isDisplayed());
        MiscUtils.sleep(2000);
    }

    @When("User applies for an open vacancy as unauthenticated applicant")
    public void user_applies_for_an_open_vacancy_as_unauthenticated_applicant() {
        CommonUtils.clickOnElement(unauthenticatedApplicantPage.salesforceDevVacancy);
        MiscUtils.sleep(2000);
    }

    @When("User clicks Sign In and Apply Button")
    public void user_clicks_Sign_In_and_Apply_Button() {
        CommonUtils.clickOnElement(unauthenticatedApplicantPage.signInAndApply);
        MiscUtils.sleep(2000);
    }

    @Then("User is redirected to Okta registration page")
    public void user_is_redirected_to_Okta_registration_page() {
        Assert.assertTrue(unauthenticatedApplicantPage.headlineOkta.isDisplayed());
        MiscUtils.sleep(2000);
    }
    @Given("User can verify that User can browse through open vacancies")
    public void user_can_verify_that_User_can_browse_through_open_vacancies() {
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(unauthenticatedApplicantPage.masterDataEngineerVacancy);
        MiscUtils.sleep(2000);
        Assert.assertTrue(unauthenticatedApplicantPage.masterDataEngineerHeadlineVacancy.isDisplayed());
        MiscUtils.sleep(2000);
        CommonUtils.clickOnElement(unauthenticatedApplicantPage.homeButton);
        MiscUtils.sleep(2000);
    }
}
