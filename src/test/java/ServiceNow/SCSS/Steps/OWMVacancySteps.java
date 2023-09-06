package ServiceNow.SCSS.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class OWMVacancySteps  extends PageInitializer {

    @Given("User is on SCSS Landing page and user is {string}")
    public void user_is_on_scss_landing_page_and_user_is(String user) {
        sCCSLoginStepsImplementation.sCSSLogin(user);
    }

    @Given("User is on SCSS landing page")
    public void user_is_on_SCSS_landing_page() {
        CommonUtils.waitForVisibility(owmVacancyPage.scssLandingPageTitle);
        CommonUtils.assertTrue(owmVacancyPage.scssLandingPageTitle.isDisplayed());
    }

    @Given("User navigates to tab {string}")
    public void user_navigates_to_tab(String string) {
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyDashboardTab);
        CommonUtils.clickOnElement(owmVacancyPage.vacancyDashboardTab);
    }

    @Given("User clicks button {string}")
    public void user_clicks_button(String button) {
        oWMVacancyStepsImplementation.clickButton(button);
    }

    @Given("User fills in Vacancy Title as {string}")
    public void user_fills_in_vacancy_title_as(String vacTitle) {
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyTitleField);
        CommonUtils.sendKeys(owmVacancyPage.vacancyTitleField, vacTitle);
    }

    @Given("User fills in field Vacancy Description as {string}")
    public void user_fills_in_field_vacancy_description_as(String description) {
        CommonUtils.sendKeys(owmVacancyPage.vacancyDescriptionField, description);
    }

    @Given("User marks option as checked for Allow HR Specialist to Triage")
    public void user_marks_option_as_checked_for_allow_hr_specialist_to_triage() {
        CommonUtils.clickOnElement(owmVacancyPage.allowHRSpecialistToTriageCheckbox);
    }

    @Given("User selects open date as {string} and close date as {string}")
    public void user_selects_open_date_as_and_close_date_as(String openDate, String closeDate) {
        oWMVacancyStepsImplementation.selectOpenCloseDate(openDate,closeDate);
        MiscUtils.sleep(3000);
    }

    @Given("User selects {string} as a Position Classification choice")
    public void user_selects_as_a_position_classification_choice(String position) {
        oWMVacancyStepsImplementation.selectPositionClassification(position);
    }

    @Given("User verifies that {string} is a contact for Appointment Package Initiator")
    public void user_verifies_that_is_a_contact_for_appointment_package_initiator(String person) {
        JavascriptUtils.scrollIntoView(owmVacancyPage.apptPackageInitiatorField);
        Assert.assertEquals(owmVacancyPage.apptPackageInitiatorField.getAttribute("title"), person);
    }

    @Given("User picks {string} for Organizational Code")
    public void user_picks_for_organizational_code(String code) {
        oWMVacancyStepsImplementation.selectOrganizationalCode(code);
    }

    @Given("User confirms that Cover letter document is marked as optional")
    public void user_confirms_that_cover_letter_document_is_marked_as_optional() {
        Assert.assertTrue(owmVacancyPage.coverLetterOptionalCheckmark.isSelected());
    }

    @Given("User includes all available Mandatory Statements Page selections")
    public void user_includes_all_available_mandatory_statements_page_selections() {
        CommonUtils.waitForVisibility(owmVacancyPage.vacCommiteeTab);
        CommonUtils.clickOnElement(owmVacancyPage.vacCommiteeTab);
    }

    @Given("User adds {string} as a Chair")
    public void user_adds_as_a_chair(String person) {
        oWMVacancyStepsImplementation.addChair(person);
    }

    @Given("User adds {string} as an Executive Secretary")
    public void user_adds_as_an_executive_secretary(String member) {
        oWMVacancyStepsImplementation.addExecutiveSecretary(member);
    }

    @Given("User includes all available Email Templates selections")
    public void user_includes_all_available_email_templates_selections() {
        CommonUtils.clickOnElement(owmVacancyPage.reviewFinalizeTab);
    }

    @Then("User publishes a vacancy by clicking {string} button")
    public void user_publishes_a_vacancy_by_clicking_button(String button) {
        oWMVacancyStepsImplementation.clickButton(button);
        CommonUtils.clickOnElement(owmVacancyPage.okConfirmationAlert);
    }

    @Then("User cav verify that a vacancy is finalized")
    public void user_cav_verify_that_a_vacancy_is_finalized() {
        CommonUtils.waitForVisibility(owmVacancyPage.vacancyFinalizedAlert);
        CommonUtils.assertTrue(owmVacancyPage.vacancyFinalizedAlert.isDisplayed());
        CommonUtils.clickOnElement(owmVacancyPage.closeConfirmationAlert);
    }
}
