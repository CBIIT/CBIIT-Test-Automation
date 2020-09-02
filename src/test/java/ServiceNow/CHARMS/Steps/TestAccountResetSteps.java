package ServiceNow.CHARMS.Steps;

import org.openqa.selenium.Keys;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.CHARMS.StepsImplementation.TestAccountResetImpl;
import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestAccountResetSteps extends PageInitializer {

	@Given("logged in to ServiceNow Native View")
	public void logged_in_to_ServiceNow_Native_View() throws TestingException {
		nativeViewLoginImpl.nativeViewLogin();
	}

	@When("searching for {string} in the filter navigator")
	public void searching_for_in_the_filter_navigator(String studio) {
		nativeViewHomePage.nativeViewFilterNavigator.sendKeys(studio);
	}

	@When("click on Studio")
	public void click_on_Studio() {
		String parentWindowHandle = WebDriverUtils.webDriver.getWindowHandle();
		charmsNativeViewPage.studioLink.click();
	}

	@Then("a new tab opens with ServiceNow Studios applications filter search box")
	public void a_new_tab_opens_with_ServiceNow_Studios_applications_filter_search_box() {
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
	}

	@When("searching for {string}")
	public void searching_for(String fcsms) {
		testAccountResetImpl.navigateToCHARMSstudio(fcsms);
	}

	@When("clicking on the Family Cohort Study application link")
	public void clicking_on_the_Family_Cohort_Study_application_link() {
		charmsNativeViewPage.familyCohortStudyLink.click();
	}

	@Then("the {string} page displays with CHARMS application explorer")
	public void the_page_displays_with_CHARMS_application_explorer(String string) {
		MiscUtils.sleep(2000);
	}

	@Then("on the tables drop down navigate to CHARMS Referrals")
	public void on_the_tables_drop_down_navigate_to_CHARMS_Referrals() {
		charmsNativeViewPage.charmsReferralsLink.click();
		MiscUtils.sleep(2000);
	}

	@Then("under {string} click on Show List")
	public void under_click_on_Show_List(String string) {
		testAccountResetImpl.navigateToCHARMSreferralsShowList();
	}

	@Then("search for test account email address {string}")
	public void search_for_test_account_email_address(String testAccountEmail) {
		testAccountResetImpl.searchForTestAccountCHARMSreferralsShowList(testAccountEmail);
	}

	@Then("select the account and delete it - this will reset the screener form")
	public void select_the_account_and_delete_it_this_will_reset_the_screener_form() {	
		testAccountResetImpl.deleteAccountFromCHARMSreferralsShowList();
	}

	@Then("on the tables drop down navigate to Family Member Details")
	public void on_the_tables_drop_down_navigate_to_Family_Member_Details() {
		testAccountResetImpl.navigateToFamilyMemberDetails();
	}

	@Then("navigate to Show List")
	public void navigate_to_Show_List() {
		testAccountResetImpl.navigateToFamilyMemberDetailsShowList();
	}

	@Then("search by testers name {string}")
	public void search_by_testers_name(String accountName) {
		testAccountResetImpl.searchTestAccountNameFamilyMemberDetails(accountName);
	}

	@Then("select the account and delete it - this will reset Family Member Details")
	public void select_the_account_and_delete_it_this_will_reset_Family_Member_Details() {
		testAccountResetImpl.deleteAccountFromFamilyMemberDetails();
	}

	@Then("on the tables drop down navigate to FCSMS Form Access")
	public void on_the_tables_drop_down_navigate_to_FCSMS_Form_Access() {
		
		testAccountResetImpl.navigateToFCSMSformAccess();
	}
	@Then("navigate to  FCSMS Show List")
	public void navigate_to_FCSMS_Show_List() {
		JavascriptUtils.scrollIntoView(charmsNativeViewPage.fcsmsFormAccessShowListLink);
		charmsNativeViewPage.fcsmsFormAccessShowListLink.click();
		MiscUtils.sleep(3000);
	}
	@Then("search for test account email address for FCSMS form {string}")
	public void search_for_test_account_email_address_for_FCSMS_form(String string) {
	}

	@Then("select the account and delete it - this will reset FCSMS Form Access")
	public void select_the_account_and_delete_it_this_will_reset_FCSMS_Form_Access() {
		testAccountResetImpl.deleteAccountFromFCSMSformAccess();
	}
 
}
