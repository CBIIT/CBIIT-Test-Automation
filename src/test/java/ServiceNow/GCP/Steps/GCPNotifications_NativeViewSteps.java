package ServiceNow.GCP.Steps;

import ServiceNow.GCP.StepsImplementation.GCPNotifications_NativeViewStepImpl;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GCPNotifications_NativeViewSteps extends PageInitializer {

    @Given("a user with an Admin rights go to Notifications under System Notification in the Native View")
    public void a_user_with_an_admin_rights_go_to_notifications_under_system_notification_in_the_native_view() {
        GCPNotifications_NativeViewStepImpl.aUserWithAdminRightsGoToNotificationsIsInTheNativeView();
    }

    @When("searches GCP Employee Training expired for the Name filter")
    public void searches_gcp_employee_training_expired_for_the_name_filter() {
        GCPNotifications_NativeViewStepImpl.searchesGcpEmployeeTrainingExpiredForTheNameFilter();
    }

    @When("the User clicks on a Preview Notification button for the GCP Employee Training expired record")
    public void the_user_clicks_on_a_preview_notification_button_for_the_gcp_employee_training_expired_record() {
        GCPNotifications_NativeViewStepImpl.userClicksThePreviewNotificationButtonForGcpEmployeeTrainingExpiredRecord();
    }

    @Then("the User verifies that the GCP Employee Training expired Notification record content is same as the given in Acceptance Criteria")
    public void the_user_verifies_that_the_gcp_employee_training_expired_notification_record_content_is_same_as_the_given_in_acceptance_criteria() {
        GCPNotifications_NativeViewStepImpl.theContentOfTheGCPEmployeeTrainingExpiredNotificationIsSameAsAC();
    }

    @When("searches GCP Manager Approval Notification for the Name filter")
    public void searches_gcp_manager_approval_notification_for_the_name_filter() {
        GCPNotifications_NativeViewStepImpl.searchesGcpManagerApprovalNotificationForTheNameFilter();
    }

    @When("the User clicks on a Preview Notification button for the GCP Manager Approval Notification record")
    public void the_user_clicks_on_a_preview_notification_button_for_the_gcp_manager_approval_notification_record() {
        GCPNotifications_NativeViewStepImpl.userClicksThePreviewNotificationButtonGcpManagerApprovalNotificationRecord();
    }

    @Then("verify the GCP Manager Approval Notification content is same as the given in Acceptance Criteria")
    public void verify_the_gcp_manager_approval_notification_content_is_same_as_the_given_in_acceptance_criteria() {
        GCPNotifications_NativeViewStepImpl.theContentOfTheGCPManagerApprovalNotification();
    }

    @When("searches GCP Employee Training Past Due for the Name filter")
    public void searches_gcp_employee_training_past_due_for_the_name_filter() {
        GCPNotifications_NativeViewStepImpl.searchesGcpEmployeeTrainingPastDueForTheNameFilter();
    }

    @When("the User clicks on a Preview Notification button for the GCP Employee Training Past Due Notification record")
    public void the_user_clicks_on_a_preview_notification_button_for_the_gcp_employee_training_past_due_notification_record() {
        GCPNotifications_NativeViewStepImpl.userClicksThePreviewNotificationButtonForTheGcpEmployeeTrainingPastDueNotificationRecord();
    }

    @Then("verify the GCP Employee Training Past Due Notification content is same as the given in Acceptance Criteria")
    public void verify_the_gcp_employee_training_past_due_notification_content_is_same_as_the_given_in_acceptance_criteria() {
        GCPNotifications_NativeViewStepImpl.theContentOfTheGCPEmployeeTrainingPastDueNotification();
    }

    @When("searches GCP Employee Training Notification for the Name filter")
    public void searches_gcp_employee_training_notification_for_the_name_filter() {
        GCPNotifications_NativeViewStepImpl.searchesGcpEmployeeTrainingNotificationForTheNameFilter();
    }

    @When("the User clicks on a Preview Notification button for the GCP Employee Training Notification record")
    public void the_user_clicks_on_a_preview_notification_button_for_the_gcp_employee_training_notification_record() {
        GCPNotifications_NativeViewStepImpl.userClicksThePreviewNotificationButtonForGcpEmployeeTrainingNotificationRecord();
    }

    @Then("verify the GCP Employee Training Notification content is same as the given in Acceptance Criteria")
    public void verify_the_gcp_employee_training_notification_content_is_same_as_the_given_in_acceptance_criteria() {
        GCPNotifications_NativeViewStepImpl.theContentOfTheGCPEmployeeTrainingNotification();
    }

    @When("searches GCP Employee Training expires in a month for the Name filter")
    public void searches_gcp_employee_training_expires_in_a_month_for_the_name_filter() {
        GCPNotifications_NativeViewStepImpl.searchesGcpEmployeeTrainingExpiresInaMonthForTheNameFilter();
    }

    @When("the User clicks on a Preview Notification button for the GCP Employee Training expires in a month Notification record")
    public void the_user_clicks_on_a_preview_notification_button_for_the_gcp_employee_training_expires_in_a_month_notification_record() {
        GCPNotifications_NativeViewStepImpl.userClicksThePreviewNotificationButtonForGcpEmployeeTrainingExpiresInaMonthNotificationRecord();
    }

    @Then("verify the GCP Employee Training expires in a month Notification content is same as the given in Acceptance Criteria")
    public void verify_the_gcp_employee_training_expires_in_a_month_notification_content_is_same_as_the_given_in_acceptance_criteria() {
        GCPNotifications_NativeViewStepImpl.theContentOfTheGCPEmployeeTrainingExpiresInaMonthNotification();
    }
}
