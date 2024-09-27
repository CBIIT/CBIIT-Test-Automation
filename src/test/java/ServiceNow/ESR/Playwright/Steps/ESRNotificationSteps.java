package ServiceNow.ESR.Playwright.Steps;

import ServiceNow.ESR.Playwright.StepsImplementation.ESRNotificationStepsImplementation;
import io.cucumber.java.en.Then;

public class ESRNotificationSteps {

    @Then("user confirms a request notification is sent in the activity feed")
    public void user_confirms_a_request_notification_is_sent_in_the_activity_feed() {
        ESRNotificationStepsImplementation.verifyRequestNotification();
    }
}
