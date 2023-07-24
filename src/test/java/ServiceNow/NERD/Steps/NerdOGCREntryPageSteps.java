package ServiceNow.NERD.Steps;

import ServiceNow.NERD.StepsImplementation.NerdOGCREntryPageStepsImplementation;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Then;

public class NerdOGCREntryPageSteps extends PageInitializer {

    @Then("I should Only see the following options in the Special Topic field dropdown list {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_should_only_see_the_following_options_in_the_special_topic_field_dropdown_list(String DDValuePayline, String bigDataDataSharing,
                                                                                                 String CCDI, String COVID19, String healthDisparities, String lowDoseRadiation,
                                                                                                 String mCDEarlyDetection, String moonshot, String pediatric, String rare, String sTARAct, String survivorship) {
        NerdOGCREntryPageStepsImplementation.newEntrySpecialTopicDropDownValues(DDValuePayline, bigDataDataSharing, CCDI, COVID19, healthDisparities,
                lowDoseRadiation, mCDEarlyDetection, moonshot, pediatric, rare, sTARAct, survivorship);
    }
}
