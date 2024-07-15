Feature: Applicant Flow Scenarios

  Background: common steps
    Given User is on SSJ Landing page and user is "Okta Verified Applicant"

  @Regression @Nekrashevich @APPTRACK-758 @selenium @Smoke
  Scenario Outline: Edit Basic Information of Profile
    And User is on Profile tab
    And User clicks Edit for Basic Information section
    And User inputs "<firstName>" into first name field
    And User inputs "<middleName>" into middle name field
    And User inputs "<lastName>" into last name field
    And User inputs "<email>" into email field
    And User inputs "<phone>" into phone field
    And User inputs "<businessPhone>" into business phone field
    And User picks highest degree option as "Masters"
    And User confirms being a US Citizen
    And User inputs "<address>" into address field
    And User inputs "<appNumber>" into appNumber field
    And User inputs "<city>" into city field
    And User inputs "<state>" into state field
    And User inputs "<country>" into country field
    And User inputs "<zip>" into zip field
    And User saves the updated section
    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | address | appNumber | city   | state | country | zip   |
      | Mario     | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | 7 Mills | 12378     | Reston | VA    | USA     | 20453 |

  @Regression @Nekrashevich @APPTRACK-712 @selenium @Smoke
  Scenario: Edit Demographics of Profile
    When User is on Profile tab
    And User clicks Edit for Demographics section
    And User chooses to share demographic details
    And User edits sex choice
    And User edits ethnicity choice
    And User edits race choice
    And User edits disability choice
    And User saves the updated section
    And User clicks Edit for Demographics section
    And User chooses not to share demographic details
    Then User saves the updated section

  @Regression @Nekrashevich @SSJ-948 @selenium @Smoke
  Scenario: Applicant view of SSJ Landing page
    And User can see SSJ landing page title "Specialized Scientific Jobs"
    And User can navigate via hyperlink to learn more about NIH
    And User can see "Open Vacancies" header
    And User can see Open Vacancies text as "The closing time for the application period differs for each vacancy on the final day. Please click on a vacancy below to find the specific closing time."
    Then User can see open vacancies table columns
      | column1       | column2   | column3            |
      | Vacancy Title | Institute | Application Period |


   @Smoke @Nekrashevich  @SSJ-763 @Outdated
  Scenario: Vacancy Details View for an Applicant
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
    Then User can verify the description of "REASONABLE ACCOMMODATION" statement


  @Regression @Smoke @Nekrashevich  @SSJ-342 @selenium
  Scenario: Your Applications tab
    When User is on Your Applications tab
    And User can verify "Your Applications" page title
    Then User can see the following columns displayed on Your Applications page
      | column1       | column2 | column3        | column4               | column5 |
      | Vacancy Title | Status   | Vacancy Closes | Application Submitted | Actions |
