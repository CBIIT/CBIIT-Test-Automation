package ServiceNow.GCP.Steps;

import ServiceNow.GCP.StepsImplementation.GCPNotifications_NativeViewStepImpl;
import appsCommon.PageInitializer;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GCPNotifications_NativeViewSteps extends PageInitializer {

    @Given("a user with admin rights is in the Native View")
    public void a_user_with_admin_rights_is_in_the_native_view() throws TestingException {
        GCPNotifications_NativeViewStepImpl.aUserWithAdminRightsIsInTheNativeView();
    }

    @When("the user types System Notifications in the Filter Navigator")
    public void the_user_types_system_notifications_in_the_filter_navigator() {
        GCPNotifications_NativeViewStepImpl.theUserTypesSystemNotificationsInTheFilterNavigator();
    }

    @When("clicks Notifications under {string}")
    public void clicks_notifications_under(String systemNotification) {
        GCPNotifications_NativeViewStepImpl.clicksNotificationsUnder(systemNotification);
    }

    @When("searches GCP Employee Training expired for the Name filter")
    public void searches_gcp_employee_training_expired_for_the_name_filter() {
        GCPNotifications_NativeViewStepImpl.searchesGcpEmployeeTrainingExpiredForTheNameFilter();
    }

    @When("clicks the GCP Employee Training expired record")
    public void clicks_the_gcp_employee_training_expired_record() {
        GCPNotifications_NativeViewStepImpl.clicksTheGcpEmployeeTrainingExpiredRecord();
    }

    @When("clicks Preview Notification")
    public void clicks_preview_notification() {
        GCPNotifications_NativeViewStepImpl.clicksPreviewNotification();
    }

    @Then("verify the GCP Employee Training expired Notification content is same as the given in Acceptance Criteria.")
    public void verify_the_gcp_employee_training_expired_notification_content_is_same_as_the_given_in_acceptance_criteria() {
        GCPNotifications_NativeViewStepImpl.theContentOfTheGCPEmployeeTrainingExpiredNotificationIsSameAsAC();
    }

    @When("searches GCP Manager Approval Notification for the Name filter")
    public void searches_gcp_manager_approval_notification_for_the_name_filter() {
        GCPNotifications_NativeViewStepImpl.searchesGcpManagerApprovalNotificationForTheNameFilter();
    }

    @When("clicks the GCP Manager Approval Notification record")
    public void clicks_the_gcp_manager_approval_notification_record() {
        GCPNotifications_NativeViewStepImpl.clicksTheGcpManagerApprovalNotificationRecord();
    }

    @Then("verify the GCP Manager Approval Notification content is same as the given in Acceptance Criteria")
    public void verify_the_gcp_manager_approval_notification_content_is_same_as_the_given_in_acceptance_criteria() {
        GCPNotifications_NativeViewStepImpl.theContentOfTheGCPManagerApprovalNotification();
    }

    @When("searches GCP Employee Training Past Due for the Name filter")
    public void searches_gcp_employee_training_past_due_for_the_name_filter() {
        GCPNotifications_NativeViewStepImpl.searchesGcpEmployeeTrainingPastDueForTheNameFilter();
    }

    @When("clicks the GCP Employee Training Past Due Notification record")
    public void clicks_the_gcp_employee_training_past_due_notification_record() {
        GCPNotifications_NativeViewStepImpl.clicksTheGcpEmployeeTrainingPastDueNotificationRecord();
    }

    @Then("verify the GCP Employee Training Past Due Notification content is same as the given in Acceptance Criteria")
    public void verify_the_gcp_employee_training_past_due_notification_content_is_same_as_the_given_in_acceptance_criteria() {
        GCPNotifications_NativeViewStepImpl.theContentOfTheGCPEmployeeTrainingPastDueNotification();
    }

    @When("searches GCP Employee Training Notification for the Name filter")
    public void searches_gcp_employee_training_notification_for_the_name_filter() {
        GCPNotifications_NativeViewStepImpl.searchesGcpEmployeeTrainingNotificationForTheNameFilter();
    }

    @When("clicks the GCP Employee Training Notification record")
    public void clicks_the_gcp_employee_training_notification_record() {
        GCPNotifications_NativeViewStepImpl.clicksTheGcpEmployeeTrainingNotificationRecord();
    }

    @Then("verify the GCP Employee Training Notification content is same as the given in Acceptance Criteria")
    public void verify_the_gcp_employee_training_notification_content_is_same_as_the_given_in_acceptance_criteria() {
        GCPNotifications_NativeViewStepImpl.theContentOfTheGCPEmployeeTrainingNotification();
    }

    @When("searches GCP Employee Training expires in a month for the Name filter")
    public void searches_gcp_employee_training_expires_in_a_month_for_the_name_filter() {
        GCPNotifications_NativeViewStepImpl.searchesGcpEmployeeTrainingExpiresInaMonthForTheNameFilter();
    }

    @When("clicks the GCP Employee Training expires in a month Notification record")
    public void clicks_the_gcp_employee_training_expires_in_a_month_notification_record() {
        GCPNotifications_NativeViewStepImpl.clicksTheGcpEmployeeTrainingExpiresInaMonthNotificationRecord();
    }

    @Then("verify the GCP Employee Training expires in a month Notification content is same as the given in Acceptance Criteria")
    public void verify_the_gcp_employee_training_expires_in_a_month_notification_content_is_same_as_the_given_in_acceptance_criteria() {
        GCPNotifications_NativeViewStepImpl.theContentOfTheGCPEmployeeTrainingExpiresInaMonthNotification();
    }
}
