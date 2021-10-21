Feature: Questionnaire

  Scenario Outline: Admin able to add cohort
    Given the user is on the CEDCD homepage
    When the user is logged in as Admin
    When user selects add new Cohort
    And enters Cohort Name as "<Cohort Name>"
    And enters Cohort Acronym as "<Cohort Acronym>"
    And enters Cohort Owner
    And enters "<Notes>"
    And clicks submit
    Then Cohort is added

    Examples: 
      | Cohort Name             | Cohort Acronym | Notes                         |
      | Second Automated Cohort | SAC            | This Cohort Will Be Automated |

    @matarodriguezko
  Scenario: Cohort Owner logs in and completes section A
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section A of the Questionnaire is filled out
    Then Section A status Circle is green

  Scenario: Cohort Owner completes Section B
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section B of the Questionnaire is filled out

   @matarodriguezko
  Scenario: Cohort Owner logs in and completes section C
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section C of the Questionnaire is filled out
    Then Section C status Circle is green

  Scenario: Cohort Owner completes Section D
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section D of the Questionnaire is filled out

   @matarodriguezko
  Scenario: Cohort Owner logs in and completes section E
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section E of the Questionnaire is filled out
    Then Section E status Circle is green

  Scenario: Cohort Owner completes Section F
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section F of the Questionnaire is filled out

   @matarodriguezko
  Scenario: Cohort Owner logs in and completes section G
    Given the user is on the CEDCD homepage
    When the user is logged in as a Cohort Owner
    And the Cohort Owner selects their Cohort questionnaire
    Then Section G of the Questionnaire is filled out
    Then Section G status Circle is green

  @Smoke @juarezds
  Scenario: Admin creates Cohort Study and Cohort Owner submits questionnaire
    Given the user is on the CEDCD homepage
    And a Admin user adds a Cohort Study linked to Cohort Owner
    When a Cohort Owner logs in
    And selects linked Cohort
    And fills out all sections of the questionnaire
    And submits the Cohort Study for Review
    Then the Cohort Study Questionnaire is successfully submitted
    
    @Progression @matarodriguezko
    Scenario:  A Multi-Cohort Owner logs in to see the Select a Cohort page
    Given the user is on the CEDCD homepage
    When a Cohort Owner logs in
    Then the Select a Cohort Page displays "Please select the cohort you wish to update from the list below."
    
    @Progression @matarodriguezko
    Scenario:  A cohort changes their questionnaire
    Given the user is on the CEDCD homepage
    When a Cohort Owner logs in and selects their first questionnaire
    And the user changes section of the questionnaire
    Then the user submits their updated questionnaire
    
