Feature: Native View Clinic Visits and Appointments
  Description: This feature file contains scenarios where a Study Team member creates a new Clinic Visit followed by a new Appointment.

  @muzipovay2 @RAS_STUDY @CP2-3871 @CP2-4392 @CP2-4159 @CP2-4821 @CP2-4175 @selenium @RAS_Regression2
  Scenario: Study Team member opens PD record, navigates to the Clinic Visits related list, and creates a new Clinic Visit, then adds Post-Clinic procedures
    Given test automation account "https://service-test.nci.nih.gov/nav_to.do?uri=sys_script_fix.do?sys_id=b8daf9fa872096107e87a8a60cbb3597" has been reset
    Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
    And logs in via Okta with username "consent_participant@yopmail.com" and password "Charms123$"
    And clicks on "Eligibility Questionnaire" to begin survey
    When the participant submits a screener from excel sheet "screenerScenario2"
    Given Study Team member logs in to Native View and navigates to participant's record "screenerScenario2"
    And Study Team member submits participant for review and marks them eligible
    And navigates to participant Consent Record
    And clicks the "Consent Call" tab
    And selects "Participant upload to portal" as the Collection Method
    And selects Today as the Consent Call Scheduled Time
    And selects Today as the Consent Call Date
    And selects "Yes" for Copy of ConsentAssent Provided Before Signing
    And selects "Yes" for Protocol Discussed in Private Setting
    And selects "Yes" for Participant Verbalized Understanding of Study Conditions and Participation
    And selects "Yes" for Questions Addressed Before Signing
    And presses the Call Complete button
    And attaches Family Cohort Study Consent pdf
    And clicks the "Consent Information" tab
    And selects Today as the Consent Version
    And presses the Hard Copy of Consent Received button
    And selects Today as the Consent Date
    And fills in "Rene Aguilar" for the Consent By field
    And clicks the "Consent Signed" tab
    And selects "Yes" for Consent Assent Obtained Before Study Procedures
    And selects "Yes" for Copy of Signed Dated Consent Assent Given to Participant
    And selects "Yes" from the Future Use of Specimens and Data by NIH dropdown
    And selects "Yes" from the Future Use by Collaborators dropdown
    And selects "Yes" from the Future Identifiable Use by Collaborators dropdown
    Then Study Team member presses the Sign and Complete button
    Then presses the back button
    Then Study Team member navigates to the Clinic Visits related list and creates new Clinic Visit for "screenerScenario2"
    Then creates a new Appointment for "screenerScenario2"
    And presses the back button
    Then Study Team members adds Post Clinic procedures