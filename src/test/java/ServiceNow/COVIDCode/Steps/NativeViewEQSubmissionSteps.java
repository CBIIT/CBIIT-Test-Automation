package ServiceNow.COVIDCode.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NativeViewEQSubmissionSteps extends PageInitializer {

	@Given("a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application")
	public void a_COVIDcode_Study_nurse_with_an_Admin_role_has_logged_in_to_the_COVIDcode_Study_Native_View_application()
			throws TestingException {

		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		WebDriverUtils.webDriver.findElement(By.linkText("Log in")).click();
		loginImpl.loginToITrust();
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();

	}

	@Given("is on the COVIDcode Enrollments page")
	public void is_on_the_COVIDcode_Enrollments_page() throws InterruptedException {

		CommonUtils.waitForVisibility(WebDriverUtils.webDriver.findElement(By.id("filter")));

		// Thread.sleep(3000);
		WebDriverUtils.webDriver.findElement(By.cssSelector("#filter")).sendKeys("CovidCode App");
		// driver.findElement(By.id("filter")).sendKeys("CovidCode App");

		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='1e1cc5b71b3f8090afebdd39bc4bcb28']/div/div")).click();

		String titleOfNativeEQ = WebDriverUtils.webDriver.getTitle();

		System.out.println("Title of Native View Enrollments Questionnaire page is: " + titleOfNativeEQ);

	}

	@When("the COVIDcode Study nurse begins an Enrollment Questionnaire for a {string} user who consents {string} to join the study")
	public void the_COVIDcode_Study_nurse_begins_an_Enrollment_Questionnaire_for_a_user_who_consents_to_join_the_study(
			String group, String consent) throws InterruptedException {

		CommonUtils.switchToFrame("gsft_main");

		Thread.sleep(2000);

		WebDriverUtils.webDriver.findElement(By.cssSelector("#sysverb_new")).click();

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver
				.findElement(By.xpath("//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.user_group_id']")), group);

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver.findElement(
				By.id("sys_select.x_g_nci_geco_covid_geco_covid_19_enrollment.host_hospital_code")), "HCC");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver
				.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.verbal_consent")), consent);

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.last_name"))
				.sendKeys("NVAutomatedLN");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.first_name"))
				.sendKeys("NVAutomatedFN");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.middle_initial"))
				.sendKeys("M");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.contact_email"))
				.sendKeys("email@automatedtest.com");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.contact_phone_number"))
				.sendKeys("1112223333");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.street_address_1"))
				.sendKeys("NCI Rockville");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.city"))
				.sendKeys("Rockville");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.us_state"))
				.sendKeys("MD");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.zip_code"))
				.sendKeys("20850");

	}

	@When("fills out the Enrollment Questionnaire by entering all required information including Demographics, Symptomology, and Exposures and Risk Factors")
	public void fills_out_the_Enrollment_Questionnaire_by_entering_all_required_information_including_Demographics_Symptomology_and_Exposures_and_Risk_Factors()
			throws InterruptedException {

		// Demographics
		// driver.findElement(By.xpath("//*[@id='x_g_nci_geco_covid_geco_covid_19_enrollment.form_complete_date.ui_policy_sensitive']/span[1]")).click();

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.form_complete_date"))
				.sendKeys("04-01-2020");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.date_of_birth"))
				.sendKeys("04-01-1990");

		CommonUtils.selectDropDownValue(
				WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.sex")),
				"Female");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver
				.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.height_choice")), "Foot/Inches");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.height_feet"))
				.sendKeys("5");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.height_inches"))
				.sendKeys("10");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver
				.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.weight_choice")), "Pounds");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.weight_pounds"))
				.sendKeys("200");

		CommonUtils.selectDropDownValue(
				WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.ancestry")),
				"Asian");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver
				.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.are_you_hispanic_or_latino")), "No");

		WebDriverUtils
		.webDriver.findElement(By.xpath("//*[@id='tabs2_section']/span[2]/span[1]/span[2]")).click();

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.date_first_symptoms"))
				.sendKeys("04-01-2020");

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.date_official_diagnosis"))
				.sendKeys("04-09-2020");

		WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='tabs2_section']/span[3]/span[1]/span[2]")).click();

		WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.comorbidities_unlock")).click();

		WebDriverUtils.webDriver.findElement(By.id("lookup.x_g_nci_geco_covid_geco_covid_19_enrollment.comorbidities")).click();

		WebDriverUtils.webDriver.findElement(By.id("sys_display.x_g_nci_geco_covid_geco_covid_19_enrollment.comorbidities"))
				.sendKeys("Asthma");

		WebDriverUtils.webDriver.findElement(By.id("sys_display.x_g_nci_geco_covid_geco_covid_19_enrollment.comorbidities"))
				.sendKeys(Keys.RETURN);

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.vape_habit")),
				"Never");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.smoke_100")),
				"Currently smokes daily");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.smoke_habit")),
				"1-10");

		JavascriptUtils.scrollDown(500);
		

		CommonUtils.selectDropDownValue(
				WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.used_anti_inflammatory")),
				"2-7 days ago");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.used_stroke")),
				"Over a year ago");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.used_paracetamol")),
				"Today or yesterday");

		CommonUtils.selectDropDownValue(
				WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.used_blood_thinners")), "Never");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.used_asthma")),
				"Never");

		CommonUtils.selectDropDownValue(
				WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.used_ace_inhibitors")),
				"1-12 months ago");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.used_allergy")),
				"Over a year ago");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.used_arbs")),
				"Never");

		CommonUtils.selectDropDownValue(WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.used_antibiotics")),
				"Over a year ago");

		CommonUtils.selectDropDownValue(
				WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.exposure_frequency")), "Never");

		CommonUtils.selectDropDownValue(
				WebDriverUtils.webDriver.findElement(By.id("x_g_nci_geco_covid_geco_covid_19_enrollment.exposure_protection")), "Yes");

	}

	@When("submits the Enrollment Questionnaire")
	public void submits_the_Enrollment_Questionnaire() {

		WebDriverUtils.webDriver.findElement(By.id("sysverb_insert_bottom")).click();

	}

	@Then("the Enrollment Questionnaire should be successfully submitted")
	public void the_Enrollment_Questionnaire_should_be_successfully_submitted() {
	}

}
