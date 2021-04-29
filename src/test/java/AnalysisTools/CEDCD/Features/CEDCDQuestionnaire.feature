Feature: Questionnaire

  #Scenario Outline: Admin able to add cohort
    #Given the user is on the CEDCD homepage
    #When the user is logged in as Admin
    #When user selects add new Cohort
    #And enters Cohort Name as "<Cohort Name>"
    #And enters Cohort Acronym as "<Cohort Acronym>"
    #And enters Cohort Owner
    #And enters "<Notes>"
    #And clicks submit
    #Then Cohort is added
    #Examples: 
      #| Cohort Name             | Cohort Acronym | Notes                         |
      #| Second Automated Cohort | SAC            | This Cohort Will Be Automated |

  Scenario: Cohort Owner logs in and selects cohort
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section A of the Questionnaire is filled out

  @Progression
  Scenario: Cohort Owner completes Section B
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section B of the Questionnaire is filled out

  @Progression
  Scenario: Cohort Owner completes Section D
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section D of the Questionnaire is filled out

  @Progression
  Scenario: Cohort Owner completes Section F
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section F of the Questionnaire is filled out
