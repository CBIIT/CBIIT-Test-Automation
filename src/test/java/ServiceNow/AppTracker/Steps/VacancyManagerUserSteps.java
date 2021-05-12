package ServiceNow.AppTracker.Steps;

import org.junit.Assert;

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
	CommonUtils.sendKeys(vacancyManagerUserPage.vacancyTitleField,"Product Manager");
	MiscUtils.sleep(2000);
	CucumberLogUtils.logScreenShot();	
	}

	@Then("User should see {string} text as")
	public void user_should_see_text_as( String vacancyDescriptionHeader ,String requestVacancyDescrParagraph ) {
	CommonUtils.sendKeys(vacancyManagerUserPage.vacancyDescriptionField, requestVacancyDescrParagraph);	
	MiscUtils.sleep(2000);
	CucumberLogUtils.logScreenShot();
	Assert.assertEquals(vacancyManagerUserPage.vacancyHeader,vacancyDescriptionHeader);
	Assert.assertEquals(vacancyManagerUserPage.vacancyDescriptionField.getText(),requestVacancyDescrParagraph);
	}
	
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

	@When("User click on Basic Information tab")
	public void user_click_on_Basic_Information_tab() {
	    
	}

	@Then("User can verify the recommendation value showing as {int} on Review and Finalize page")
	public void user_can_verify_the_recommendation_value_showing_as_on_Review_and_Finalize_page(Integer int1) {
	vacancyManagerUserStepsImpl.verifyNumberOfLettersOfRecommendation();
	MiscUtils.sleep(2000);
	}

}
