Feature: Fanconi Eligibility Questionnaire-Screener on the Fanconi Longitudinal Cohort Study Portal
  Description:This feature file has different submissions and assertion scenarios for the Fanconi Eligibility Questionnaire by the proband and the legal guardian (Proxy)

  @FanconiSubmission @selenium @In-Progress
  Scenario Outline: This scenario outline is verifying the IIQ Form
    Given run the Fanconi reset script to reset the accounts
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "ras_progression@yopmail.com" and password "Charms123$"
    And clicks the Fanconi Eligibility Questionnaire widget
    Then fills the Fanconi Eligibility Questionnaire form for scenario1
    Then clicks the submit button
    And the consent is submitted for "<ScreenerScenario>"
    Then data submitted for scenario is verified in native from the excel sheet "<ScreenerScenario>"
    Given a Participant is on the Fanconi Study login page
    And logs in Fanconi page via Okta with username "ras_progression@yopmail.com" and password "Charms123$"
    And clicks on the IIQ Form
    And a participant enters username "<Email>" and pin
    And the participant submits a Individual Information Questionnaire for excel sheet "<IIQScenario>"
    Examples:
      | Email                       | Password   | ScreenerScenario  | IIQScenario  | SurveyScenario     |
      | ras_progression@yopmail.com | Charms123$ | screenerScenario1 | IIQScenario1 | RASSurveyScenario1 |