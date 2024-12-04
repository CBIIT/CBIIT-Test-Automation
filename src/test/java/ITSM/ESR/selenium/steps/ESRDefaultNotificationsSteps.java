package ITSM.ESR.selenium.steps;

import ServiceNow.ITSM.ESR.Selenium.StepsImplementation.ESRDefaultNotificationsStepsImplementation;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ESRDefaultNotificationsSteps extends PageInitializer {

    @And("user fills out all required information including {string}, {string}, {string}, {string}, {string} and {string} and clicks submit")
    public void user_fills_out_all_required_information_including_and_and_clicks_submit(String projectName, String projectDescription, String federalLead, String projectLead, String businessOwner, String phoneNumber) {
        ESRDefaultNotificationsStepsImplementation.completeRequiredInformationForESRCreation(projectName, projectDescription, federalLead, projectLead, businessOwner, phoneNumber);
    }

    @Then("user checks the activity feed and confirms request notification is sent")
    public void user_checks_the_activity_feed_and_confirms_request_notification_is_sent() {
        ESRDefaultNotificationsStepsImplementation.defaultNotificationConfirmation();
    }

    @And("user proceeds into the catalog task")
    public void user_proceeds_into_the_catalog_task() {
        ESRDefaultNotificationsStepsImplementation.selectFirstCatalogTask();
    }

    @And("fills out catalog task with required information such as {string} to get into the Federal Lead Approval stage")
    public void fills_out_catalog_task_with_required_information_such_as_to_get_into_the_federal_lead_approval_stage(String docText) {
        ESRDefaultNotificationsStepsImplementation.completeFirstCatalogTaskInformation(docText);
    }

    @Then("user checks the activity feed to confirm the Federal Lead approval notification was sent")
    public void user_checks_the_activity_feed_to_confirm_the_federal_lead_approval_notification_was_sent() {
        ESRDefaultNotificationsStepsImplementation.verifyNotificationsSent();
    }

    @And("the user goes into the approvers tab and clicks on the Federal Lead")
    public void the_user_goes_into_the_approvers_tab_and_clicks_on_the_federal_lead() {
        ESRDefaultNotificationsStepsImplementation.clickFederalLeadApprover();
    }
    @And("the user rejects the approval request and leaves a comment {string}")
    public void the_user_rejects_the_approval_request_and_leaves_a_comment(String testComment) {
        ESRDefaultNotificationsStepsImplementation.rejectApprovalRequest(testComment);
    }
    @Then("user checks the activity feed to confirm the Federal Lead rejection notification was sent")
    public void user_checks_the_activity_feed_to_confirm_the_federal_lead_rejection_notification_was_sent() {
        ESRDefaultNotificationsStepsImplementation.rejectionNotificationSent();
    }

    @Then("user submits an additional comment {string} on the requested item and confirms the notification")
    public void user_submits_an_additional_comment_on_the_requested_item_and_confirms_the_notification(String testComment) {
        ESRDefaultNotificationsStepsImplementation.additionalCommentAddedOnRequestedItem(testComment);
    }
}
