package ServiceNow.AppTracker.Steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VacancyManagerUserSteps extends PageInitializer {
	/**
	 * @Satya1Ticket88 Scenario: verify vacancy description without copy/paste
	 */
	@When("User should see Vacancy Dashboard Page")
	public void user_should_see_Vacancy_Dashboard_Page() throws TestingException {
		vacancyManagerUserStepsImpl.verifyVacancyDashboardHeader();
	}

	@When("User clicks on Create Vacancy button")
	public void user_clicks_on_Create_Vacancy_button() {
		CommonUtils.click(vacancyManagerUserPage.createVacancyButton);
		MiscUtils.sleep(2000);
	}

	@When("User enters the vacancy title")
	public void user_enters_the_vacancy_title() {
		CommonUtils.sendKeys(vacancyManagerUserPage.vacancyTitleField, "Product Manager");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@Then("User should see {string} text as")
	public void user_should_see_text_as(String vacancyDescriptionHeader, String requestVacancyDescrParagraph) {
		CommonUtils.sendKeys(vacancyManagerUserPage.vacancyDescriptionField, requestVacancyDescrParagraph);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		Assert.assertEquals(vacancyManagerUserPage.vacancyHeader.getText(), vacancyDescriptionHeader);

	}

	/**
	 * @Satya3Ticket89 Scenario: Verify Letters of Recommendation persistent in
	 *                 Basic Information
	 */
	@When("User selects recommendation as {int}")
	public void user_selects_recommendation_as(Integer int1) {
		vacancyManagerUserStepsImpl.selectRecommendationLetter();
		MiscUtils.sleep(2000);
	}

	@When("User clicks Save button")
	public void user_clicks_Save_button() {
		CommonUtils.click(vacancyManagerUserPage.basicVacancyInformationSaveButton);
		MiscUtils.sleep(2000);
		CommonUtils.click(vacancyManagerUserPage.basicVacancyInformationSaveButton);
		MiscUtils.sleep(2000);
		CommonUtils.click(vacancyManagerUserPage.basicVacancyInformationSaveButton);
		JavascriptUtils.scrollDown(7000);
		CommonUtils.click(vacancyManagerUserPage.basicVacancyInformationSaveButton);
	}

	@Then("User can verify the recommendation value showing as {int} on Review and Finalize page")
	public void user_can_verify_the_recommendation_value_showing_as_on_Review_and_Finalize_page(Integer int1) {
		vacancyManagerUserStepsImpl.verifyNumberOfLettersOfRecommendation();
		MiscUtils.sleep(2000);
	}

	/**
	 * @Satya4Ticket91 Scenario: Verify create vacancy form
	 */

	@When("User can see the Create Vacancy form opens with below left menu items")
	public void user_can_see_the_Create_Vacancy_form_opens_with_below_left_menu_items(List<String> sections) {
		int expectedSize = sections.size();
		int actualSize = vacancyManagerUserPage.listOfSections.size();
		System.out.println("Sections names: " + sections);
		Assert.assertEquals(expectedSize, actualSize);

	}

	@When("User click on {string} without entering any value in previous field")
	public void user_click_on_without_entering_any_value_in_previous_field(String nameOfSection) {
		CommonUtils.click(vacancyManagerUserPage.vacancyCommitteeSection);
		MiscUtils.sleep(2000);
		Assert.assertEquals(nameOfSection, vacancyManagerUserPage.vacancyCommitteeSectionHeader.getText());
		MiscUtils.sleep(2000);

	}

	@Then("User should able to navigate to the {string} without any error")
	public void user_should_able_to_navigate_to_the_without_any_error(String nameOfSection) {
		CommonUtils.click(vacancyManagerUserPage.basicVacancySection);
		// Assert.assertEquals(nameOfSection,
		// vacancyManagerUserPage.vacancyDashboardPageHeader.getText());
	}

	/**
	 * @Satya5Ticket93 Scenario: Verify the Vacancy Manager dashboard landing page
	 */

	@Given("User can see the dashboard page displaying tabs as below")
	public void user_can_see_the_dashboard_page_displaying_tabs_as_below(List<String> names) {

		vacancyManagerUserStepsImpl.verifyTabsOnVacancyManagerPage(names);
	}

	@Then("User can see count of each tabs")
	public void user_can_see_count_of_each_tabs() {
		vacancyManagerUserStepsImpl.verifyTabsCountOnVacancyManagerPage();
	}

	/**
	 * @Satya6Ticket93 Scenario: Verify dashboard page sub filters
	 */

	@When("User is on pre-flight vacancies tab")
	public void user_is_on_pre_flight_vacancies_tab() {

		CommonUtils.click(vacancyManagerUserPage.preFlightVacanciesTab);

		MiscUtils.sleep(2000);
	}

	@When("User can see the {string}, {string}, {string} sub filters on pre-flight vacancies tab")
	public void user_can_see_the_sub_filters_on_pre_flight_vacancies_tab(String allSubFilter, String draftSubFilter,
			String finalazedSubFilter) {
		Assert.assertTrue(vacancyManagerUserPage.allPreFlightSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(allSubFilter));
		Assert.assertTrue(vacancyManagerUserPage.draftSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(draftSubFilter));
		Assert.assertTrue(vacancyManagerUserPage.finalizedSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(finalazedSubFilter));

	}

	@When("User can see the {string}, {string}, {string} sub filters on live vacancies")
	public void user_can_see_the_sub_filters_on_live_vacancies(String allSubFilter, String liveSubFilter,
			String extendedSubFilter) {
		Assert.assertTrue(vacancyManagerUserPage.allLiveSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(allSubFilter));
		Assert.assertTrue(
				vacancyManagerUserPage.liveSubFiltersTextpreFlightVacanciesTab.getText().contentEquals(liveSubFilter));
		Assert.assertTrue(vacancyManagerUserPage.extendedSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(extendedSubFilter));

	}

	@Then("User can see the {string}, {string}, {string}, {string}, {string}, {string} sub filters on closed vacancies")
	public void user_can_see_the_sub_filters_on_closed_vacancies(String allSubFilter, String closedSubFilter,
			String triagedSubFilter, String individuallySubFilter, String scoredSubFilter, String archivedSubFilter) {

		Assert.assertTrue(vacancyManagerUserPage.allClosedSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(allSubFilter));
		MiscUtils.sleep(1000);
		Assert.assertTrue(vacancyManagerUserPage.closedClosedSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(closedSubFilter));
		MiscUtils.sleep(1000);
		Assert.assertTrue(vacancyManagerUserPage.triagedClosedSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(triagedSubFilter));
		MiscUtils.sleep(1000);
		Assert.assertTrue(vacancyManagerUserPage.individuallyScoredClosedSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(individuallySubFilter));
		MiscUtils.sleep(1000);
		Assert.assertTrue(vacancyManagerUserPage.scoredClosedSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(scoredSubFilter));
		MiscUtils.sleep(1000);
		Assert.assertTrue(vacancyManagerUserPage.archivedClosedSubFiltersTextpreFlightVacanciesTab.getText()
				.contentEquals(archivedSubFilter));
		MiscUtils.sleep(1000);
	}

	@When("User clicks on live vacancies tab")
	public void user_clicks_on_live_vacancies_tab() {
		CommonUtils.click(vacancyManagerUserPage.liveVacanciesTab);
		MiscUtils.sleep(2000);

	}

	@When("User clicks on closed vacancies tab")
	public void user_clicks_on_closed_vacancies_tab() {

		CommonUtils.click(vacancyManagerUserPage.closedVacanciesTab);
		MiscUtils.sleep(2000);
	}

	/**
	 * @Satya7Ticket94 Scenario: Verify set vacancy date functionality
	 */
	@When("User clicks on the Open date field")
	public void user_clicks_on_the_Open_date_field() {
		JavascriptUtils.scrollDown(8000);
		CommonUtils.click(vacancyManagerUserPage.openCalendarInputButtonInBasicVacancySection);

	}

	@When("User clicks on the Close Date field")
	public void user_clicks_on_the_Close_Date_field() {

		CommonUtils.click(vacancyManagerUserPage.closeCalendarInputButtonInBasicVacancySection);
	}

	@When("User selects date same as today's date in Open Date field and Close Date")
	public void user_selects_date_same_as_today_s_date_in_Open_Date_field_and_Close_Date() {

	}

	@Then("User can see the calendar pop up displays with Past dates disabled")
	public void user_can_see_the_calendar_pop_up_displays_with_Past_dates_disabled() {

		CommonUtils.selectDateFromTable(vacancyManagerUserPage.openCalendarTableInBasicVacancySection, "8");
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();

	}

	@Then("User clicks on the Open date field to see calendar past dates disabled")
	public void user_clicks_on_the_Open_date_field_to_see_calendar_past_dates_disabled() {
		JavascriptUtils.scrollDown(8000);
		CommonUtils.click(vacancyManagerUserPage.openCalendarInputButtonInBasicVacancySection);
		CucumberLogUtils.logScreenShot();
	}

	@Then("User clicks on the Close Date field to see calendar past dates disabled")
	public void user_clicks_on_the_Close_Date_field_to_see_calendar_past_dates_disabled() {
		CommonUtils.click(vacancyManagerUserPage.closeCalendarInputButtonInBasicVacancySection);
		CucumberLogUtils.logScreenShot();

	}

	/** question **/
	@Then("User selects date same as today's date as below")
	public void user_selects_date_same_as_today_s_date_as_below(Map<String, String> data) {
		String openDate = data.get("Open Date");
		String closeDate = data.get("Close Date");
		vacancyManagerUserStepsImpl.selectOpenDate(openDate);
		CommonUtil.waitBrowser(4000);
		vacancyManagerUserStepsImpl.selectCloseDate(closeDate);
		JavascriptUtils.scrollDown(7000);
		CommonUtil.waitBrowser(4000);
		CommonUtils.click(vacancyManagerUserPage.basicVacancyInformationSaveButton);
		CommonUtils.click(vacancyManagerUserPage.reviewSection);
		JavascriptUtils.scrollUp(4000);
		CommonUtil.waitBrowser(4000);

	}

	/** SectionsFields **/
	@When("User clicks on the Mandatory Statements section")
	public void user_clicks_on_the_Mandatory_Statements_section() {
		CommonUtils.click(vacancyManagerUserPage.mandatoryStatementsSection);

	}

	@Then("User can see {string},{string}, {string}, {string} toggle buttons")
	public void user_can_see_toggle_buttons(String equalOpportunityEmployer, String standardsOfConduct,
			String foreignEducation, String reasonableAccommodation) {
		Assert.assertTrue(vacancyManagerUserPage.equalOpportunityEmployerInMandatorySection.getText()
				.contentEquals(equalOpportunityEmployer));
		Assert.assertTrue(vacancyManagerUserPage.standardsOfConductFinancialDisclosureInMandatorySection.getText()
				.contentEquals(standardsOfConduct));
		Assert.assertTrue(
				vacancyManagerUserPage.foreignEducationInMandatorySection.getText().contentEquals(foreignEducation));
		Assert.assertTrue(vacancyManagerUserPage.reasonableAccommodationInMandatorySection.getText()
				.contentEquals(reasonableAccommodation));

	}

	@Then("User can see pre-filled rich text area on each of the field")
	public void user_can_see_pre_filled_rich_text_area_on_each_of_the_field() {
		System.out.println(
				"equalOpportunityEmployer " + vacancyManagerUserPage.textOfSectionEqualOpportunityEmployer.getText());
		System.out.println("standardsOfConduct " + vacancyManagerUserPage.textOfSectionForeignEducationText.getText());
		System.out.println("foreignEducation " + vacancyManagerUserPage.textOfSectionStandardsOfConductText.getText());
		System.out.println(
				"reasonableAccommodation " + vacancyManagerUserPage.textOfSectionReasonableAccommodationText.getText());

	}

	/** satya11ticket101 **/
	@When("User toggles off {string} as below")
	public void user_toggles_off_as_below(String nameFromExamples) {
		vacancyManagerUserStepsImpl.selectToggleButtonOnMandatoryStatementPage(nameFromExamples);

	}

	@When("User edits Equal Opportunity Employer text by adding {string}")
	public void user_edits_Equal_Opportunity_Employer_text_by_adding(String sentence) {
		String presentText = vacancyManagerUserPage.textOfSectionEqualOpportunityEmployer.getText();
		CommonUtils.sendKeys(vacancyManagerUserPage.textOfSectionEqualOpportunityEmployer,
				presentText + Keys.SPACE + sentence);

	}

	@Then("User can see the updated value displays in the text field")
	public void user_can_see_the_updated_value_displays_in_the_text_field() {
		Assert.assertTrue(vacancyManagerUserPage.textOfSectionEqualOpportunityEmployer.getText()
				.contains("This position requires traveling overseas"));

	}

	@Given("User toggles off\\/on Equal Opportunity Employer button")
	public void user_toggles_off_on_Equal_Opportunity_Employer_button() {
		CommonUtils.click(vacancyManagerUserPage.toggleButtonEqualOpportunityEmployer); // OFF
		MiscUtils.sleep(2000);
		CommonUtils.click(vacancyManagerUserPage.toggleButtonEqualOpportunityEmployer); // ON
		MiscUtils.sleep(2000);
	}

	@Given("User toggles off Standards of Conduct\\/Financial Disclosure button")
	public void user_toggles_off_Standards_of_Conduct_Financial_Disclosure_button() {
		CommonUtils.click(vacancyManagerUserPage.toggleButtonStandardsOfConduct);
		MiscUtils.sleep(2000);
	}

	/** @Satya13Ticket102 **/
	@Then("User can see the below fields under Application Documents {string},{string}, {string}, {string}")
	public void user_can_see_the_below_fields_under_Application_Documents(String curriculumVitae, String coverLetter,
			String visionStatement, String qualificationStatement) {
		JavascriptUtils.scrollDown(1000);
		Assert.assertTrue(
				vacancyManagerUserPage.curriculumVitaeField.getAttribute("value").contentEquals(curriculumVitae));
		Assert.assertTrue(vacancyManagerUserPage.coverLetterField.getAttribute("value").contentEquals(coverLetter));
		Assert.assertTrue(
				vacancyManagerUserPage.visionStatementField.getAttribute("value").contentEquals(visionStatement));
		Assert.assertTrue(vacancyManagerUserPage.qualificationStatementField.getAttribute("value")
				.contentEquals(qualificationStatement));

	}

	@Then("User can see Add more button to add more documents")
	public void user_can_see_Add_more_button_to_add_more_documents() {
		Assert.assertTrue(vacancyManagerUserPage.addMoreButton.isDisplayed());

	}

	@Then("User can see optional check box in each field to indicate the document is optional")
	public void user_can_see_optional_check_box_in_each_field_to_indicate_the_document_is_optional() {
		Assert.assertFalse(vacancyManagerUserPage.optionalCheckboxOfCurriculumVitae.isSelected());
		Assert.assertTrue(vacancyManagerUserPage.optionalCheckboxOfCoverLetter.isSelected());
		Assert.assertFalse(vacancyManagerUserPage.optionalCheckboxOfVisionStatement.isSelected());
		Assert.assertTrue(vacancyManagerUserPage.optionalCheckboxOfQualificationStatement.isSelected());
	}

	@Then("User can see trash icon in each field to delete the field")
	public void user_can_see_trash_icon_in_each_field_to_delete_the_field() {
		Assert.assertTrue(vacancyManagerUserPage.trashIconofCurriculumVitae.isDisplayed());
		Assert.assertTrue(vacancyManagerUserPage.trashIconofCoverLetter.isDisplayed());
		Assert.assertTrue(vacancyManagerUserPage.trashIconofVisionStatement.isDisplayed());
		Assert.assertTrue(vacancyManagerUserPage.trashIconofQualificationStatement.isDisplayed());

	}

	/** Satya14Ticket102 **/

	@Given("User renames any field in the Application Documents section and User adds more documents")
	public void user_renames_any_field_in_the_Application_Documents_section_and_User_adds_more_documents() {
		CommonUtils.click(vacancyManagerUserPage.addMoreButton);
		CommonUtils.sendKeys(vacancyManagerUserPage.newFieldForAddMoreButton, "Letter Of Confirmation");
		MiscUtils.sleep(3000);
		vacancyManagerUserPage.curriculumVitaeField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		vacancyManagerUserPage.curriculumVitaeField.sendKeys("Statement");
		MiscUtils.sleep(3000);
		CommonUtils.click(vacancyManagerUserPage.basicVacancyInformationSaveButton);
		JavascriptUtils.scrollUp(4000);
	}

	@Given("User deletes one existing document section")
	public void user_deletes_one_existing_document_section() {
		CommonUtils.click(vacancyManagerUserPage.trashIconofQualificationStatement);
		MiscUtils.sleep(3000);
	}

	@When("User comes back to Basic information tab")
	public void user_comes_back_to_Basic_information_tab() {
		CommonUtils.click(vacancyManagerUserPage.basicVacancySection);

	}

	@Then("User can see changes in documents section remains the same")
	public void user_can_see_changes_in_documents_section_remains_the_same() {
		Assert.assertTrue(vacancyManagerUserPage.curriculumVitaeField.getAttribute("value").contentEquals("Statement"));
		Assert.assertTrue(vacancyManagerUserPage.newFieldForAddMoreButton.getAttribute("value")
				.contentEquals("Letter Of Confirmation"));
	}

	/** Satya15Ticket@103 **/
	@Given("User clicks on the Email Template tab")
	public void user_clicks_on_the_Email_Template_tab() {

	}

	@Given("User can see the below fields {string},{string},{string}, {string},{string}")
	public void user_can_see_the_below_fields(String string, String string2, String string3, String string4,
			String string5) {

	}

	@Given("User toggles off\\/on Application saved checkbox to mark the template as active or not")
	public void user_toggles_off_on_Application_saved_checkbox_to_mark_the_template_as_active_or_not() {

	}

	@Given("User inputs in Application saved email template text {string}")
	public void user_inputs_in_Application_saved_email_template_text(String string) {
		;
	}

	@Given("User clicks on Vacancy Committee tab")
	public void user_clicks_on_Vacancy_Committee_tab() {

	}

	@When("User clicks on the Email template tab")
	public void user_clicks_on_the_Email_template_tab() {

	}

	@Then("User can see the updated changes displaying as same")
	public void user_can_see_the_updated_changes_displaying_as_same() {

	}

}
