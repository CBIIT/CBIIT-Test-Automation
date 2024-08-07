Feature: DEPRECATED TESTS

  @APPTRACK-67
  Scenario: Create a vacancy as Stadtman Vacancy Manager
    Given User is on SSJ Landing page and user is "Stadtman Vacancy Manager"
    Then the User should see the menu options "Home", "Vacancy Dashboard", "Your Vacancies", "Reports", "Profile"
    And User is able to see the NIH link and the "Open Vacancies" on the Home page
    And User navigates to tab "Vacancy Dashboard"
    And User can see all vacancies
    And User navigates and can see all vacancies under "Your Vacancies" tab
    And used navigates to see "Reports"

  @APPTRACK-7 @APPTRACK-91
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

  @SSJ-91 @SSJ-876 @SSJ-992
  Scenario: Create a vacancy as OWM Vacancy Manager
    Given User is on SSJ Landing page and user is "OWM Vacancy Manager"
    And User is on SSJ landing page
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

  @SSJ-7
  Scenario: Create a vacancy as OWM Vacancy Manager
    Given User is on SSJ Landing page and user is "OWM Vacancy Manager"
    And User is on SSJ landing page
    Then the User should see the menu options "Home", "Vacancy Dashboard", "Your Vacancies", "Reports", "Profile"
    And User is able to see the NIH link and the "Open Vacancies" on the Home page
    And User navigates to tab "Vacancy Dashboard"
    And User can see all vacancies
    And User navigates and can see all vacancies under "Your Vacancies" tab
    And used navigates to see "Reports"

  @SSJ-763
  Scenario: Vacancy Details View for an Applicant
    And User is on SSJ landing page
    When User clicks to apply for a live vacancy
    And User verifies that a vacancy title is displayed
    And User verifies that open and close dates are displayed
    And User verifies that a close date has "12:00PM ET" end period specified
    And User verifies that Point of Contact is displayed
    And User verifies that Application Documents header is displayed
    And User confirms that HHS and NIH are Equal Opportunity Employers Statements are displayed
      | statement1                   | statement2                                | statement3        | statement4              |
      | EQUAL OPPORTUNITY EMPLOYMENT | STANDARDS OF CONDUCT/FINANCIAL DISCLOSURE | FOREIGN EDUCATION | REASONABLE ACCOMODATION |
    And User can verify the description of "EQUAL OPPORTUNITY EMPLOYMENT" statement
    And User can verify the description of "STANDARDS OF CONDUCT/FINANCIAL DISCLOSURE" statement
    And User can verify the description of "FOREIGN EDUCATION" statement
    Then User can verify the description of "REASONABLE ACCOMODATION" statement

  @SSJ-298
  Scenario: Okta error registration
    And User clicks on Login Dropdown
    And User clicks "Not Registered" option
    Then User is redirected to Okta registration page
    And User enters all the registration details
    Then User can verify that Okta account was not created