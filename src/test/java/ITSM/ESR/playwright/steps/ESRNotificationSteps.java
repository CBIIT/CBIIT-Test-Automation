package ITSM.ESR.playwright.steps;

import ITSM.ESR.playwright.stepsImplementation.ESRNotificationStepsImplementation;
import io.cucumber.java.en.Then;

public class ESRNotificationSteps {

    @Then("user confirms a request notification is sent in the activity feed")
    public void user_confirms_a_request_notification_is_sent_in_the_activity_feed() {
        ESRNotificationStepsImplementation.verifyRequestNotification();
    }

    @Then("the user confirms a watchlist update notification is sent in the activity feed")
    public void the_user_confirms_a_watchlist_update_notification_is_sent_in_the_activity_feed() {
        ESRNotificationStepsImplementation.verifyWatchlistUpdateNotification();
    }
}