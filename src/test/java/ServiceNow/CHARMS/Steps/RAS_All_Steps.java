package ServiceNow.CHARMS.Steps;

import ServiceNow.CHARMS.StepsImplementation.RASConsentStepsImpl;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RAS_All_Steps extends PageInitializer {

    /**
     * THIS METHOD WILL SELECT THE CONSENT FLOW ACCORDING TO THE SHEET CHOSEN IN THE FEATURE FILE
     *
     * @param sheetName the name of the sheet for which the e-consent is being submitted
     */
    @Given("the e-consent is submitted for {string}")
    public void the_e_consent_is_submitted_for(String sheetName) {
        RASConsentStepsImpl.the_e_consent_is_submitted_for(sheetName);
    }

    /**
     * THIS METHOD WILL FILL OUT THE STUDY CONSENT FORM
     *
     * @param password the password to be used for completing the form
     */
    @Given("participant clicks on Study Consent and completes form with {string}")
    public void participant_clicks_on_Study_Consent_and_completes_form_with(String password) {
        RASConsentStepsImpl.participant_clicks_on_Study_Consent_and_completes_form_with(password);
    }

    /**
     * THIS METHOD WILL SIGN THE CONSENT RECORD IN NATIVE VIEW
     *
     * @param sheetName
     * @param consentStatus
     * @param consentType
     * @param responseType
     */
    @Then("PI completes consent and verifies {string} {string} {string} {string} in Native View")
    public void PI_completes_consent_and_verifies_in_Native_View(String sheetName, String consentStatus, String consentType, String responseType) {
        RASConsentStepsImpl.PI_completes_consent_and_verifies_in_Native_View(sheetName, consentStatus, consentType, responseType);
    }

    /**
     * THIS METHOD VERIFIES THAT THE CONSENT DOWNLOAD FORM IS SHOWN ON THE PARTICIPANT'S PORTAL
     *
     * @param participantPortalText
     */
    @Given("{string} shows on participant portal")
    public void shows_on_participant_portal(String participantPortalText) {
        RASConsentStepsImpl.shows_on_participant_portal(participantPortalText);
    }

    /**
     * THIS METHOD WILL VERIFY THAT THE CONSENT FORM PDF WAS DOWNLOADED AND THEN DELETE IT FROM THE DIRECTORY
     *
     * @param expectedDownloadStudyConsentText
     * @param pdfName
     */
    @Given("{string} text shows on participant portal and when clicked downloads {string}")
    public void text_shows_on_participant_portal_and_when_clicked_downloads(String expectedDownloadStudyConsentText, String pdfName) {
        RASConsentStepsImpl.text_shows_on_participant_portal_and_when_clicked_downloads(expectedDownloadStudyConsentText, pdfName);
    }
}
