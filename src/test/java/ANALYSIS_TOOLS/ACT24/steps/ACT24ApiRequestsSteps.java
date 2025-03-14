package ANALYSIS_TOOLS.ACT24.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ANALYSIS_TOOLS.ACT24.stepsImpl.ACT24ApiRequestsStepImpl;

public class ACT24ApiRequestsSteps {

    /**
     * Setting up base url for study list api
     */
    @Given("User sets the baseUrl and endpoint for the request")
    public void user_sets_the_base_url_and_endpoint_for_the_request() {
        ACT24ApiRequestsStepImpl.setBaseurlForStudyList();
    }

    /**
     * Sending request and retrieving the study list
     */
    @Then("User sends the request and retrieves the study list")
    public void user_sends_the_request_and_retrieves_the_study_list() {
        ACT24ApiRequestsStepImpl.sendGetRequestForStudyList();
    }

    /**
     * Setting up base url for participant list
     */
    @Given("User sets the baseUrl and endpoint for the request of participant list")
    public void user_sets_the_base_url_and_endpoint_for_the_request_of_participant_list() {
        ACT24ApiRequestsStepImpl.setBaseurlForParticipantList();
    }

    /**
     * Sending request and retrieving the participant list
     */
    @Then("User sends the request and retrieves the participant list")
    public void user_sends_the_request_and_retrieves_the_participant_list() {
        ACT24ApiRequestsStepImpl.sendGetRequestForParticipantList();
    }

    /**
     * Setting up base url for QC summary report
     */
    @Given("User sets the baseUrl and endpoint for the request of QC summary report")
    public void user_sets_the_base_url_and_endpoint_for_the_request_of_qc_summary_report() {
        ACT24ApiRequestsStepImpl.setBaseurlForQCSummaryReport();
    }

    /**
     * Setting up base url for QC summary report
     */
    @Then("User sends the request and retrieves the QC summary report")
    public void user_sends_the_request_and_retrieves_the_qc_summary_report() {
        ACT24ApiRequestsStepImpl.sendGetRequestForQCSummaryReport();
    }

    /**
     * Setting up base url for QC detail report
     */
    @Given("User sets the baseUrl and endpoint for the request of QC detail report")
    public void user_sets_the_base_url_and_endpoint_for_the_request_of_qc_detail_report() {
        ACT24ApiRequestsStepImpl.setBaseurlForQCDetailReport();
    }

    /**
     * Setting up base url for QC detail report
     */
    @Then("User sends the request and retrieves the QC detail report")
    public void user_sends_the_request_and_retrieves_the_qc_detail_report() {
        ACT24ApiRequestsStepImpl.sendGetRequestForQCDetailReport();
    }

    /**
     * Setting up base url for detail report
     */
    @Given("User sets the baseUrl and endpoint for the request of detail report")
    public void user_sets_the_base_url_and_endpoint_for_the_request_of_detail_report() {
        ACT24ApiRequestsStepImpl.setBaseurlForDetailReport();
    }

    /**
     * Setting up base url for detail report
     */
    @Then("User sends the request and retrieves the detail report")
    public void user_sends_the_request_and_retrieves_the_detail_report() {
        ACT24ApiRequestsStepImpl.sendGetRequestForDetailReport();
    }
}