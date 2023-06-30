package ServiceNow.CcrHelpDesk.Steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.ConfUtils;

import ServiceNow.CcrHelpDesk.Pages.CCRHelpDeskPage;
import ServiceNow.CcrHelpDesk.Pages.LoginStepsImplCCR;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CCRHelpDeskSteps extends PageInitializer {
	
	private LoginStepsImplCCR loginStepsImpl = new LoginStepsImplCCR();
	private CCRHelpDeskPage ccrHelpDesk	=	new CCRHelpDeskPage();
	
	@Given("User opens CCR HelpDesk application in browser")
	public void user_opens_CCR_HelpDesk_application_in_browser() {
		loginStepsImpl.openApp();
	}

	@When("User will login to CCR HelpDesk application")
	public void user_will_login_to_CCR_HelpDesk_application() throws InterruptedException {
		//Thread.sleep(3000);
		if(loginStepsImpl.isLoginButtonDisplayed()) {
			loginStepsImpl.clckOnLoginButton();
		}
		loginStepsImpl.enterUsername(ConfUtils.getProperty("sgugulothuUsername"));
		String decyptedPass=EncryptionUtils.decrypt(ConfUtils.getProperty("sgugulothuPassword"));
		loginStepsImpl.enterPassword(decyptedPass);
		loginStepsImpl.clickOnSignInButton();
		
	}
	
	
	@Then("Submit a new ticket")
	public void submit_a_new_ticket() {
		ccrHelpDesk.fillTikcetDetails();
	}

	@Then("verify the state of the ticket as  {string}")
	public void verify_the_state_of_the_ticket_as_2(String expectedState) {
		ccrHelpDesk.validateTheStatsAs(expectedState);
	}

	@Then("goto native view")
	public void goto_native_view() {
		ccrHelpDesk.clickOnNativeView();
	}

	@Then("Filter on CCR Healpdesk menu")
	public void filter_on_CCR_Healpdesk_menu() {
		ccrHelpDesk.setFilterValue("CCR/OIT HelpDesk");
		ccrHelpDesk.seelctAllFromFilterMenu();
	}

	@Then("search for the lastet ticket")
	public void search_for_the_lastet_ticket() {
	    ccrHelpDesk.sortTheTicketsToDisplayTheLatestOnOnTop();
	}

	@Then("Assign the ticket to myself")
	public void assign_the_ticket_to_myself() {
		ccrHelpDesk.OpenLatestTicket();
	    ccrHelpDesk.assignTicketToMe();
	}
	
	@Then("Open new ticket")
	public void openTheTicket() {
		ccrHelpDesk.OpenLatestTicket();
	}

	@Then("verify the state of the ticket as {string}")
	public void verify_the_state_of_the_ticket_as(String string) {
	    ccrHelpDesk.VerifyStateAs(string);
	}

	@Then("click on ticket on hold")
	public void click_on_ticket_on_hold() {
	    ccrHelpDesk.ticketOnHoldButtonClick();
	}

	@Then("click on completed button")
	public void click_on_completed_button() {
		ccrHelpDesk.ClickOnTicketName("Ticket Off Hold");
		ccrHelpDesk.ClickOnTicketName("Ticket In Progress");
		ccrHelpDesk.ClickOnTicketName("Ticket Resolved");
	}

	@Then("Close the ticket")
	public void close_the_ticket() {
		ccrHelpDesk.ClickOnTicketName("Ticket Closed");
	}

	@Then("validate that the following fields are available to enter details requested for")
	public void validate_that_the_following_fields_are_available_to_enter_details_requested_By_auto_populate_Email_Phone_Number() {
	    // Write code here that turns the phrase above into concrete actions
		ccrHelpDesk.validateFieldsArePresent("Requested for");
	}

	@Then("validate that the following fields are available to enter details Room  Number")
	public void validate_that_the_following_fields_are_available_to_enter_details_Room_Number() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("validate that the following fields are available to enter details Building")
	public void validate_that_the_following_fields_are_available_to_enter_details_Building() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

	@Then("validate that the following fields are available to enter details Application Name – List of applications needed.")
	public void validate_that_the_following_fields_are_available_to_enter_details_Application_Name_List_of_applications_needed() {
		ccrHelpDesk.validateFieldsArePresent("Application");
	}

	@Then("validate that the following fields are available to enter details Short Description")
	public void validate_that_the_following_fields_are_available_to_enter_details_Short_Description() {
		ccrHelpDesk.validateFieldsArePresent("Short description");
	}

	@Then("validate that the following fields are available to enter details Description")
	public void validate_that_the_following_fields_are_available_to_enter_details_Description() {
		ccrHelpDesk.validateFieldsArePresent("Details");
	}

	@Then("validate that this field is available Ticket ID \\(Auto generated)")
	public void validate_that_this_field_is_available_Ticket_ID_Auto_generated() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Number");
	}

	@Then("validate that this field is available Status \\(drop down) \\(Open, In Review, Work in Progress, Resolved, Closed Complete)")
	public void validate_that_this_field_is_available_Status_drop_down_Open_In_Review_Work_in_Progress_Resolved_Closed_Complete() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("State");
	}

	@Then("validate that this field is available Submitted By \\(auto-populate)")
	public void validate_that_this_field_is_available_Submitted_By_auto_populate() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Opened by");
	}

	@Then("validate that this field is available Submitted Date \\(auto-populate)")
	public void validate_that_this_field_is_available_Submitted_Date_auto_populate() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Created");
	}

	@Then("validate that this field is available Application Name – List of applications needed.")
	public void validate_that_this_field_is_available_Application_Name_List_of_applications_needed() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Application");
	}

	@Then("validate that this field is available Priority \\(high, Medium, Low) default = Med \\(not visible to customer)")
	public void validate_that_this_field_is_available_Priority_high_Medium_Low_default_Med_not_visible_to_customer() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Priority");
	}

	@Then("validate that this field is available Severity \\(high, Medium, Low) default = Med \\(not visible to customer)")
	public void validate_that_this_field_is_available_Severity_high_Medium_Low_default_Med_not_visible_to_customer() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Priority");
	}

	@Then("validate that this field is available Due Date \\(Validate Due Date is not before submitted date) \\(not visible to customer)")
	public void validate_that_this_field_is_available_Due_Date_Validate_Due_Date_is_not_before_submitted_date_not_visible_to_customer() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Due date");
	}

	@Then("validate that this field is available Title \\(Character Length =?)")
	public void validate_that_this_field_is_available_Title_Character_Length() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Title");
	}

	@Then("validate that this field is available Description \\(Character Length =?)")
	public void validate_that_this_field_is_available_Description_Character_Length() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Description");
	}

	

	@Then("validate that this field is available Requested By -required")
	public void validate_that_this_field_is_available_Requested_By_required() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Requested by");
	}

	@Then("validate that this field is available Application - required")
	public void validate_that_this_field_is_available_Application_required() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Application");
	}

	@Then("validate that this field is available Short Description - required")
	public void validate_that_this_field_is_available_Short_Description_required() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Description");
	}

	@Then("validate that this field is available Description - required")
	public void validate_that_this_field_is_available_Description_required() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Description");
	}


	@Then("validate that this field is available State \\(Required)")
	public void validate_that_this_field_is_available_State_Required() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("State");
	}

	@Then("validate that this field is available Created")
	public void validate_that_this_field_is_available_Created() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Created");
	}

	@Then("validate that this field is available Opened by")
	public void validate_that_this_field_is_available_Opened_by() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Opened by");
	}

	@Then("validate that this field is available Requested For")
	public void validate_that_this_field_is_available_Requested_For() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Requested for");
	}

	@Then("validate that this field is available Application  \\(Required)")
	public void validate_that_this_field_is_available_Application_Required() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Application");
	}

	@Then("validate that this field is available Due Date")
	public void validate_that_this_field_is_available_Due_Date() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Due date");
	}

	@Then("validate that this field is available Assignment Group \\(Required)")
	public void validate_that_this_field_is_available_Assignment_Group_Required() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Assignment group");
	}

	@Then("validate that this field is available Assigned to")
	public void validate_that_this_field_is_available_Assigned_to() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Assigned to");
	}

	@Then("validate that this field is available Detail Tab")
	public void validate_that_this_field_is_available_Detail_Tab() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Details");
	}

	@Then("validate that this field is available Short Description")
	public void validate_that_this_field_is_available_Short_Description() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Short description");
	}

	@Then("validate that this field is available Description")
	public void validate_that_this_field_is_available_Description() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Short description");
	}

	@Then("validate that this field is available Notes Tab")
	public void validate_that_this_field_is_available_Notes_Tab() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Notes");
	}


	@Then("validate that this field is available Emails")
	public void validate_that_this_field_is_available_Emails() {
		ccrHelpDesk.validateFieldsArePresentOnNativeViewWithNewLocator("Emails");
	}

	@Then("validate that this field is available created")
	public void validate_that_this_field_is_available_created() {
		ccrHelpDesk.validateFieldsArePresentOnNativeView("Created");
	}

	@Then("validate that this field is available Recipients")
	public void validate_that_this_field_is_available_Recipients() {
		ccrHelpDesk.validateFieldsArePresentOnNativeViewWithNewLocator("Recipients");
	}

	@Then("validate that this field is available Subject")
	public void validate_that_this_field_is_available_Subject() {
		ccrHelpDesk.validateFieldsArePresentOnNativeViewWithNewLocator("Subject");
	}




	@When("I click on {string} in CCR\\/OIT Help  Desk menu")
	public void i_click_on_in_CCR_OIT_Help_Desk_menu(String string) {
		ccrHelpDesk.seelctFromFilterMenu(string);
	}

	@Then("I should see {string} as one of the fields.")
	public void i_should_see_as_one_of_the_fields(String string) {
		ccrHelpDesk.validateFieldsArePresentOnNativeViewWithNewLocator(string);
	}

	@Given("I am an authenticated Admin Fulfiller on the CCR\\/OIT")
	public void i_am_an_authenticated_Admin_Fulfiller_on_the_CCR_OIT() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}


	@Then("I should see the following choices have been added Created by")
	public void i_should_see_the_following_choices_have_been_added_Created_by() {
		ccrHelpDesk.validateFieldsArePresentOnNativeViewWithNewLocator("Created by");
		}

	@Then("I should see the following choices have been added Created on")
	public void i_should_see_the_following_choices_have_been_added_Created_on() {
		ccrHelpDesk.validateFieldsArePresentOnNativeViewWithNewLocator("Created");
	}

	@Then("I should see the following choices have been added Updated")
	public void i_should_see_the_following_choices_have_been_added_Updated() {
		ccrHelpDesk.validateFieldsArePresentOnNativeViewWithNewLocator("Updated");
	}

	@Then("I should see the following choices have been added Updated by")
	public void i_should_see_the_following_choices_have_been_added_Updated_by() {
		ccrHelpDesk.validateFieldsArePresentOnNativeViewWithNewLocator("Updated by");
	}

}