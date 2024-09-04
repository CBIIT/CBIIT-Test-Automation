Feature: Applicant Flow Scenarios

  @Regression @Nekrashevich @SSJ-948 @selenium @Smoke @SNOW_UPDATED
  Scenario: Applicant view of SSJ Landing page
    Given User is on SSJ Landing page and user is "Okta Verified Applicant"
    And User can see SSJ landing page title "Specialized Scientific Jobs"
    And User can navigate via hyperlink to learn more about NIH
    And User can see "Open Vacancies" header
    And User can see Open Vacancies text as "The closing time for the application period differs for each vacancy on the final day. Please click on a vacancy below to find the specific closing time."
    Then User can see open vacancies table columns
      | column1       | column2   | column3            |
      | Vacancy Title | Institute | Application Period |

  @Regression @Nekrashevich @selenium @Smoke @SNOW_UPDATED
  Scenario: Vacancy Details View for an Applicant
    Given User is on SSJ Landing page and user is "Okta Verified Applicant"
    And User is on SSJ landing page
    When User clicks to apply for a live vacancy
    And User verifies that a vacancy title is displayed
    And User verifies that open and close dates are displayed
    And User verifies that Point of Contact is displayed
    And User verifies that Application Documents header is displayed
    And User confirms that HHS and NIH are Equal Opportunity Employers Statements are displayed
      | statement1                   | statement2                                | statement3        | statement4              |
      | EQUAL OPPORTUNITY EMPLOYMENT | STANDARDS OF CONDUCT/FINANCIAL DISCLOSURE | FOREIGN EDUCATION | REASONABLE ACCOMODATION |
    And User can verify the description of "EQUAL OPPORTUNITY EMPLOYMENT" statement
    And User can verify the description of "STANDARDS OF CONDUCT/FINANCIAL DISCLOSURE" statement
    And User can verify the description of "FOREIGN EDUCATION" statement
    Then User can verify the description of "REASONABLE ACCOMODATION" statement

  @Regression @Nekrashevich @selenium @Smoke @SNOW_UPDATED
  Scenario: Your Applications tab
    Given User is on SSJ Landing page and user is "Okta Verified Applicant"
    When User is on Your Applications tab
    And User can verify "Your Applications" page title
    Then User can see the following columns displayed on Your Applications page
      | column1       | column2 | column3        | column4               | column5 |
      | Vacancy Title | Status   | Vacancy Closes | Application Submitted | Actions |
