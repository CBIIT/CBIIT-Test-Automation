package ServiceNow.AppTracker.Steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VacancyManagerUserSteps extends PageInitializer {
/** @Satya1Ticket88 
Scenario: verify vacancy description without copy/paste */
	
	@When("User logs in as an NIH Trusted User")
	public void user_logs_in_as_an_NIH_Trusted_User() throws TestingException {
		vacancyManagerUserStepsImpl.appTrackerServicePortalLogin();

	}

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
	
	/**  @Satya3Ticket89
Scenario: Verify Letters of Recommendation persistent in Basic Information */
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
	/**  @Satya4Ticket91
Scenario: Verify create vacancy form
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
	Assert.assertEquals(nameOfSection, vacancyManagerUserPage.vacancyDashboardPageHeader.getText());
}

/** @Satya5Ticket93
Scenario: Verify the Vacancy Manager dashboard landing page*/

@Given("User can see the dashboard page displaying tabs as below")
public void user_can_see_the_dashboard_page_displaying_tabs_as_below(List<String> names) {
	
	vacancyManagerUserStepsImpl.verifyTabsOnVacancyManagerPage(names);	
}


@Then("User can see count of each tabs")
public void user_can_see_count_of_each_tabs() {
  vacancyManagerUserStepsImpl.verifyTabsCountOnVacancyManagerPage();
}

/**@Satya6Ticket93
Scenario: Verify dashboard page sub filters*/

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
public void user_can_see_the_sub_filters_on_live_vacancies(String allSubFilter, String liveSubFilter ,
		String extendedSubFilter) {
	Assert.assertTrue(vacancyManagerUserPage.allLiveSubFiltersTextpreFlightVacanciesTab.getText()
			.contentEquals(allSubFilter));
	Assert.assertTrue(vacancyManagerUserPage.liveSubFiltersTextpreFlightVacanciesTab.getText()
			.contentEquals(liveSubFilter));
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

/*@When("User clicks on any sub tab")
public void user_clicks_on_any_sub_tab() {
 
}

@When("User can see the grid shows the filtered value")
public void user_can_see_the_grid_shows_the_filtered_value() {
   
}
*/
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

	

}
