Feature: Fanconi end-to-end flow on the Fanconi Longitudinal Cohort Study Portal
  Description: This feature file contains scenarios which submit Fanconi Screeners, Consent Flows, and IIQ Forms. Then, data is verified in Native View.

  @FanconiSubmission @selenium @Fanconi_Regressionv @Progression
  Scenario Outline: This scenario submits the IIQ form and verifies the data in Native View.
    Given run the Fanconi reset script to reset the accounts
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "<Email>" and password "<Password>"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario1
    Then clicks the submit button
    And consent is submitted with collection method "<ConsentCollectionMethod>" on sheet 0
    Given a Participant is on the Fanconi Study login page
    And logs in via Okta with username "<Email>" and password "<Password>"
    And clicks on the IIQ Form
    And a participant enters username "<Email>" and pin
    And the participant submits a Individual Information Questionnaire for excel sheet "<IIQScenario>"
    Then Study Team member logs in to Native View and verifies fields in participant's CGB IIQ record
    Examples:
      | Email                         | Password  | ConsentCollectionMethod | IIQScenario  |
      | sj.fanconitester1@yopmail.com | Test123$$ | iMed                    | IIQScenario1 |