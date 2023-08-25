package ServiceNow.ESR.Steps;

import ServiceNow.ESR.StepsImplementation.ESRDefaultNotificationsStepsImplementation;
import appsCommon.PageInitializer;
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
}
