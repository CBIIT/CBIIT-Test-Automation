Feature: This is the feature file for scenarios that solely involve Admin priviledges

  @matakevin @MFA
  Scenario: As Admin, I want to Review and Publish Submitted Cohort
    Given the user is on the CEDCD homepage
    When the user is logged in as Admin
    And the user filters and selects from submitted cohorts
    When the user checks all sections
    Then the admin can publish the cohort

  @matakevin @MFA
  Scenario: Timeout popup displays after five minutes when logged in
    Given the user is on the CEDCD homepage
    When the user is logged in as Admin
    And the user waits five minutes
    Then the timeout alert box is shown
