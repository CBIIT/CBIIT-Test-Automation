Feature: Stadtman Vacancy Scenarios

  @Regression @Smoke @Nekrashevich @APPTRACK-7 @APPTRACK-91 @Stadtman
  Scenario: Create a vacancy as Stadtman Vacancy Manager
    Given User is on SSJ Landing page and user is "Stadtman Vacancy Manager"
    And User navigates to tab "Vacancy Dashboard"
    And User clicks button "Create vacancy"
    And the user submits the "Basic Vacancy Information"
    And the user is selecting the "Mandatory Statements"
    And the user is adding "Vacancy Committee" members
    And the user chooses "Email Templates"
    And User includes all available Email Templates selections
    Then User publishes a vacancy
    And User verify that a vacancy is finalized
    When an "applicant" is on the SCSS landing page
    Then applicant should see the published vacancy

  @Regression @Smoke @bucurgb @APPTRACK-67 @Stadtman
  Scenario: Create a vacancy as Stadtman Vacancy Manager
    Given User is on SSJ Landing page and user is "Stadtman Vacancy Manager"
    Then the User should see the menu options "Home", "Vacancy Dashboard", "Your Vacancies", "Reports", "Profile"
    And User is able to see the NIH link and the "Open Vacancies" on the Home page
    And User navigates to tab "Vacancy Dashboard"
    And User can see all vacancies
    And User navigates and can see all vacancies under "Your Vacancies" tab
    And used navigates to see "Reports"
