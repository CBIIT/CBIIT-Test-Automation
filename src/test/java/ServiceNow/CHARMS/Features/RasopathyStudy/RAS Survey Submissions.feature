Feature: RAS Survey Scenarios (Preview)
    This feature file contains RAS Survey submission scenarios via Qualtrics Preview

    @juarezds @InProgress @Progression
    Scenario: Submitting the RAS Survey
    This scenario is completing the forms for someone else and selects 'No' to all questions
        Given a participant is on the RASopathies Longitudinal Cohort Study login page "myRASLoginPage"
        And logs in via Okta with username "charmsras2@yahoo.com" and password "RASTest2023$$"
        And clicks on the Ras Survey Form
        And a participant enters username "charmsparticipant3@yopmail.com" and pin
#		Then the participant will be able to rewind the form
        When the participant submits a RAS Survey from excel sheet "RasSurveyScenario1"
