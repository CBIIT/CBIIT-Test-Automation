Feature: OWM Vacancy Scenarios

    @Regression @Smoke @Nekrashevich  @APPTRACK-91 @APPTRACK-876 @APPTRACK-992 @Stage
    Scenario: Create a vacancy as OWM Vacancy Manager
      Given User is on SCSS Landing page and user is "OWM Vacancy Manager"
      And User is on SCSS landing page
      And User navigates to tab "Vacancy Dashboard"
      And User clicks button "Create vacancy"
      And User submits the "Basic Vacancy Information"
      And user is selecting the "Mandatory Statements"
      And user is adding "Vacancy Committee" members
      And user chooses "Email Templates"
      And User includes all available Email Templates selections
      Then User publishes a vacancy
      And User verify that a vacancy is finalized
      When an "applicant" is on the SCSS landing page
      Then the applicant should see the published vacancy

    @Regression @Smoke @bucurgb @UserStoryTagToBeConfirmed @Stage @APPTRACK-7 @OWM
    Scenario: Create a vacancy as OWM Vacancy Manager
      Given User is on SCSS Landing page and user is "OWM Vacancy Manager"
      And User is on SCSS landing page
      Then the User should see the menu options "Home", "Vacancy Dashboard", "Your Vacancies", "Reports", "Profile"
      And User is able to see the NIH link and the "Open Vacancies" on the Home page
      And User navigates to tab "Vacancy Dashboard"
      And User can see all vacancies
      And User navigates and can see all vacancies under "Your Vacancies" tab
      And used navigates to see "Reports"
