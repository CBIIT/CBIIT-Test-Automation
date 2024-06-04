Feature: Applicant Flow Scenarios

  Background: common steps
    Given User is on SSJ Landing page and user is "Okta Verified Applicant"

  @Regression @Smoke @Nekrashevich @APPTRACK-758 @selenium
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

  @Regression @Smoke @Nekrashevich @APPTRACK-712 @selenium
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

  @Regression @Smoke @Nekrashevich @SSJ-948 @selenium
  Scenario: Applicant view of SSJ Landing page
    And User can see SSJ landing page title "Specialized Scientific Jobs"
    And User can navigate via hyperlink to learn more about NIH
    And User can see "Open Vacancies" header
    And User can see Open Vacancies text as "The closing time for the application period differs for each vacancy on the final day. Please click on a vacancy below to find the specific closing time."
    Then User can see open vacancies table columns
      | column1       | column2                  | column3            |
      | Vacancy Title | Institute/Office/Program | Application Period |

  @Regression @Smoke @Nekrashevich  @SSJ-773 @selenium
  Scenario: Your Applications tab
    When User is on Your Applications tab
    And User can verify "Your Applications" page title
    Then User can see the following columns displayed on Your Applications page
      | column1       | column2 | column3        | column4               | column5 |
      | Vacancy Title | State   | Vacancy Closes | Application Submitted | Actions |
