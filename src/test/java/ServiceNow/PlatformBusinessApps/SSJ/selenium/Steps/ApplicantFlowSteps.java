package ServiceNow.PlatformBusinessApps.SSJ.selenium.Steps;

import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.awt.*;
import java.util.Map;
import static ServiceNow.ATO.Utils.DriverObjectFactory.getWebDriver;

public class ApplicantFlowSteps extends PageInitializer {

    @Given("User is on Profile tab")
    public void user_is_on_profile_tab() {
        applicantFlowStepsImplementation.userIsOnProfileTab();
    }

    @Given("User clicks Edit for Demographics section")
    public void user_clicks_edit_for_section() {
        Assert.assertTrue(applicantFlowStepsImplementation.clickEditButtonDemographicsSection());
    }

    @Given("User clicks Edit for Basic Information section")
    public void user_clicks_edit_for_basic_information_section() {
        Assert.assertTrue(applicantFlowStepsImplementation.clickEditButtonBasicInfoSection());
    }


    @Given("User inputs {string} into first name field")
    public void user_inputs_into_first_name_field(String firstName) {
        applicantFlowStepsImplementation.enterFirstNameProfileTab(firstName);
    }

    @Given("User inputs {string} into middle name field")
    public void user_inputs_into_middle_name_field(String middleName) {
        applicantFlowStepsImplementation.enterMiddleNameProfileTab(middleName);
    }

    @Given("User inputs {string} into last name field")
    public void user_inputs_into_last_name_field(String lastName) {
        applicantFlowStepsImplementation.enterLastNameProfileTab(lastName);
    }

    @Given("User inputs {string} into email field")
    public void user_inputs_into_email_field(String email) {
        applicantFlowStepsImplementation.enterEmailProfileTab(email);
    }

    @Given("User inputs {string} into phone field")
    public void user_inputs_into_phone_field(String phone) {
        applicantFlowStepsImplementation.enterPhoneProfileTab(phone);
    }

    @Given("User inputs {string} into business phone field")
    public void user_inputs_into_business_phone_field(String businessPhone) {
        applicantFlowStepsImplementation.enterBusinessPhoneProfileTab(businessPhone);
    }

    @Given("User inputs {string} into address field")
    public void user_inputs_into_address_field(String address) {
        applicantFlowStepsImplementation.enterAddressProfileTab(address);
    }

    @Given("User inputs {string} into appNumber field")
    public void user_inputs_into_app_number_field(String appNumber) {
        applicantFlowStepsImplementation.enterAppNumberProfileTab(appNumber);
    }

    @Given("User inputs {string} into city field")
    public void user_inputs_into_city_field(String city) {
        applicantFlowStepsImplementation.enterCityProfileTab(city);
    }

    @Given("User inputs {string} into state field")
    public void user_inputs_into_state_field(String state) {
        applicantFlowStepsImplementation.enterStateProfileTab(state);
    }

    @Given("User inputs {string} into country field")
    public void user_inputs_into_country_field(String country) {
        applicantFlowStepsImplementation.enterCountryProfileTab(country);
    }

    @Given("User inputs {string} into zip field")
    public void user_inputs_into_zip_field(String zip) {
        applicantFlowStepsImplementation.enterZipProfileTab(zip);
    }

    @Given("User picks highest degree option as {string}")
    public void user_picks_highest_degree_option_as(String degree) {
        applicantFlowStepsImplementation.pickDegree(degree);
    }

    @Given("User confirms being a US Citizen")
    public void user_confirms_being_a_us_citizen() {
        CommonUtils.assertTrue(applicantFlowPage.rdButtonUSCitizen.isSelected());
    }

    @Given("User saves the updated section")
    public void user_saves_the_updated_section() {
        applicantFlowStepsImplementation.userSavesUpdatedSection();
    }

    @Given("User edits sex choice")
    public void user_edits_sex_choice() {
        applicantFlowStepsImplementation.editSexChoice();
    }

    @Given("User edits ethnicity choice")
    public void user_edits_ethnicity_choice() {
        applicantFlowStepsImplementation.editEthnicityChoice();
    }

    @Given("User edits race choice")
    public void user_edits_race_choice() {
        applicantFlowStepsImplementation.editRaceChoice();
    }

    @Given("User edits disability choice")
    public void user_edits_disability_choice() {
        applicantFlowStepsImplementation.editDisabilityChoice();
    }

    @Given("User chooses not to share demographic details")
    public void user_chooses_not_to_share_demographic_details() {
        CommonUtils.clickOnElement(applicantFlowPage.buttonNotShareDemographics);
    }

    @Given("User chooses to share demographic details")
    public void user_chooses_to_share_demographic_details() {
        CommonUtils.clickOnElement(applicantFlowPage.buttonShareDemographics);
    }

    @Given("User is on Home Page")
    public void user_is_on_Home_Page() {
        MiscUtils.sleep(1000);
        Assert.assertTrue(applicantFlowPage.homeTab.isDisplayed());
    }

    @When("User uploads all the needed documents")
    public void user_upload_all_the_needed_documents() throws AWTException {
        CommonUtils.clickOnElement(applicantFlowPage.uploadVisStatement);
        MiscUtils.sleep(1000);
        WebElement uploadFile = getWebDriver().findElement(By.xpath("(//input[@type='file'])[1]"));
        MiscUtils.sleep(3000);
        uploadFile.sendKeys("C:\\Users\\nekrashevicha2\\Desktop\\TEST-DATA\\QualificationStatement.docx");
        MiscUtils.sleep(2000);
        applicantFlowStepsImplementation.closeOutlookWindow();
        JavascriptUtils.scrollIntoView(applicantFlowPage.uploadCV);
        CommonUtils.clickOnElement(applicantFlowPage.uploadCV);
        MiscUtils.sleep(2000);
        WebElement uploadFile1 = getWebDriver().findElement(By.xpath("(//input[@type='file'])[2]"));
        MiscUtils.sleep(3000);
        uploadFile1.sendKeys("C:\\Users\\nekrashevicha2\\Desktop\\TEST-DATA\\Chris Belles.pdf");
        MiscUtils.sleep(6000);
        applicantFlowStepsImplementation.closeOutlookWindow();
    }


    @Then("User can see References blurb")
    public void user_can_see_References_blurb() {
        JavascriptUtils.scrollIntoView(applicantFlowPage.referencesBlurb);
        Assert.assertTrue(applicantFlowPage.referencesBlurb.isDisplayed());
        MiscUtils.sleep(1000);
    }

    @Then("User  denies for references to be contacted")
    public void user_can_deny_for_references_to_be_contacted() {
        CommonUtils.clickOnElement(applicantFlowPage.contactdirectlyDpReferencesSection);
        MiscUtils.sleep(1000);
        CommonUtils.clickOnElement(applicantFlowPage.noContactdirectlyDpReferencesSection);
        MiscUtils.sleep(1000);
    }

    @When("User is on Your Applications tab")
    public void user_is_on_Your_Applications_tab() {
        CommonUtils.clickOnElement(applicantFlowPage.yourApplicationsTab);
    }

    @Then("User can navigate to Your Applications tab")
    public void user_can_navigate_to_Your_Applications_tab() {
        CommonUtils.clickOnElement(applicantFlowPage.yourApplicationsTab);
        MiscUtils.sleep(1000);
    }

    @Given("User can see SSJ landing page title {string}")
    public void user_can_see_ssj_landing_page_title(String title) {
        Assert.assertTrue(applicantFlowStepsImplementation.verifySSJLandingPageTitle(title));
    }

    @Given("User can navigate via hyperlink to learn more about NIH")
    public void user_can_navigate_via_hyperlink_to_learn_more_about_nih() {
        CommonUtils.clickOnElement(applicantFlowPage.nihHyperlink);
        Assert.assertTrue(applicantFlowStepsImplementation.verifyNIHHyperlinkNavigation());
    }

    @Given("User can see {string} header")
    public void user_can_see_header(String textOpenVacanciesHeader) {
        Assert.assertTrue(applicantFlowStepsImplementation.verifyOpenVacanciesHeader(textOpenVacanciesHeader));
    }

    @Given("User can see Open Vacancies text as {string}")
    public void user_can_see_open_vacancies_text_as(String textOpenVacancies) {
        Assert.assertTrue(applicantFlowStepsImplementation.verifyOpenVacanciesText(textOpenVacancies));
    }

    @Given("User can see open vacancies table columns")
    public void user_can_see_open_vacancies_table_columns(io.cucumber.datatable.DataTable data) {
        Map<String, String> columns = CommonUtil.getMapFromDataTable(data);
        Assert.assertTrue(columns.get("column1"), applicantFlowPage.columnVacancyTitle.isDisplayed());
        Assert.assertTrue(columns.get("column2"), applicantFlowPage.columnInstituteOfficeProgram.isDisplayed());
        Assert.assertTrue(columns.get("column3"), applicantFlowPage.columnApplicationPeriod.isDisplayed());
    }

    @Given("User clicks to apply for a live vacancy")
    public void user_clicks_to_apply_for_a_live_vacancy() {
        CommonUtils.clickOnElement(applicantFlowPage.liveVacancyEntry);

    }

    @Given("User verifies that a vacancy title is displayed")
    public void user_verifies_that_a_vacancy_title_is_displayed() {
        String vacTitleText = applicantFlowPage.vacancyTitleVacancyDetailsView.getText();
        Assert.assertNotNull(vacTitleText);
    }

    @Given("User verifies that open and close dates are displayed")
    public void user_verifies_that_open_and_close_dates_are_displayed() {
        String openDateLiveVacancyVacDetailsView = applicantFlowPage.openDateLiveVacancyVacDetailsView.getText();
        String closeDateLiveVacancyVacDetailsView = applicantFlowPage.closeDateLiveVacancyVacDetailsView.getText();
        Assert.assertNotNull(openDateLiveVacancyVacDetailsView);
        Assert.assertNotNull(closeDateLiveVacancyVacDetailsView);
    }

    @Given("User verifies that a close date has {string} end period specified")
    public void user_verifies_that_a_close_date_has_end_period_specified(String endPeriod) {
        Assert.assertTrue(applicantFlowStepsImplementation.verifyCloseDateContent(endPeriod));
    }

    @Given("User verifies that Point of Contact is displayed")
    public void user_verifies_that_point_of_contact_is_displayed() {
        String pocVacDetailsView = applicantFlowPage.pocVacDetailsView.getText();
        Assert.assertNotNull(pocVacDetailsView);
    }

    @Given("User verifies that Application Documents header is displayed")
    public void user_verifies_that_application_documents_header_is_displayed() {
        Assert.assertTrue(applicantFlowPage.applicationDocumentsHeader.isDisplayed());
    }

    @Given("User confirms that HHS and NIH are Equal Opportunity Employers Statements are displayed")
    public void user_confirms_that_hhs_and_nih_are_equal_opportunity_employers_statements_are_displayed(io.cucumber.datatable.DataTable data) {
        Map<String, String> statements = CommonUtil.getMapFromDataTable(data);
        Assert.assertTrue(statements.get("statement1"), applicantFlowPage.equalOpportunityEmploymentStatementVacDetailsView.isDisplayed());
        Assert.assertTrue(statements.get("statement2"), applicantFlowPage.standardsOfConductVacDetailsView.isDisplayed());
        Assert.assertTrue(statements.get("statement3"), applicantFlowPage.foreignEducationVacDetailsView.isDisplayed());
        Assert.assertTrue(statements.get("statement4"), applicantFlowPage.reasonableAccomodationVacDetailsView.isDisplayed());
    }

    @Given("User can verify the description of {string} statement")
    public void user_can_verify_the_description_of_statement(String statement) {
        applicantFlowStepsImplementation.verifyStatements(statement);
    }

    @Given("User can verify {string} page title")
    public void user_can_verify_page_title(String title) {
        Assert.assertTrue(applicantFlowStepsImplementation.verifyYourApplicationsPageTitle(title));
    }

    @Given("User can see the following columns displayed on Your Applications page")
    public void user_can_see_the_following_columns_displayed_on_your_applications_page(io.cucumber.datatable.DataTable data) {
        Map<String, String> columns = CommonUtil.getMapFromDataTable(data);
        Assert.assertTrue(columns.get("column1"), applicantFlowPage.columnVacTitleYourApplicationsPage.isDisplayed());
        Assert.assertTrue(columns.get("column2"), applicantFlowPage.columnStateYourApplicationsPage.isDisplayed());
        Assert.assertTrue(columns.get("column3"), applicantFlowPage.columnVacClosesYourApplicationsPage.isDisplayed());
        Assert.assertTrue(columns.get("column4"), applicantFlowPage.columnApplicationSubmittedYourApplicationsPage.isDisplayed());
        Assert.assertTrue(columns.get("column5"), applicantFlowPage.columnActionsYourApplicationsPage.isDisplayed());
    }
}
