Feature: Questionnaire

  @juarezds @Smoke
  Scenario: Admin creates Cohort Study and Cohort Owner submits questionnaire
    Given the user is on the CEDCD homepage
    And a Admin user adds a Cohort Study linked to Cohort Owner
    When a Cohort Owner logs in
    And selects linked Cohort
    And fills out all sections of the questionnaire
    And submits the Cohort Study for Review
    Then the Cohort Study Questionnaire is successfully submitted

