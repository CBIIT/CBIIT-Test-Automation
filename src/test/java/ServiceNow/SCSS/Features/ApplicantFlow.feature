Feature: Applicant Flow Scenarios

  Background: common steps
    Given User is on SCSS Landing page and user is "Okta Verified Applicant"

  @Regression @Smoke @Nekrashevich @APPTRACK-758
  Scenario Outline: Edit Basic Information of Profile
    When User is on SCSS landing page
    And User is on Profile tab
    And User clicks Edit for "Basic Information" section
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
     | firstName | middleName | lastName | email           | phone      | businessPhone | address   | appNumber | city  | state | country  | zip   |
     | Mario     | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    |  7 Mills  | 12378     | Reston| VA    | USA      | 20453 |


  @Regression @Smoke @Nekrashevich @APPTRACK-712
  Scenario: Edit Demographics of Profile
    When User is on SCSS landing page
    And User is on Profile tab
    And User clicks Edit for "Demographics" section
    And User chooses to share demographic details
    And User edits sex choice
    And User edits ethnicity choice
    And User edits race choice
    And User edits disability choice
    And User saves the updated section
    And User clicks Edit for "Demographics" section
    And User chooses not to share demographic details
    Then User saves the updated section


  @Regression @Smoke @Nekrashevich @APPTRACK-768
  Scenario Outline:Verify the Save application functionality
    When User is on SCSS landing page
    And User is on Profile tab
    And User clicks Edit for "Basic Information" section
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
    When User clicks on Save Application button
    Then successful save alert is displayed
    And User can verify the application became a draft
    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | address   | appNumber | city  | state | country  | zip   |
      | Mario     | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    |  7 Mills  | 12378     | Reston| VA    | USA      | 20453 |


  @Regression @Smoke @Nekrashevich @APPTRACK-845
  Scenario: Verify Minimum Applicant Qualification-Degree
    And User is on Home Page
    And User intends to apply for a vacancy
    And User enters  First Name, Last Name, and Email
    When User selects no for Do you possess a Doctoral degree? field
    Then User can see the following message displays "A Doctoral degree is minimally required to apply to this vacancy. Please click cancel to go back"
    When User clicks on Next button
    Then User can see the message "Please fill out all required fields."

  @Regression @Smoke @Nekrashevich @APPTRACK-948
  Scenario: Vacancy Details view
    And User is on Home Page
    And User wants to apply for a vacancy
    And User can seethe following fields are displayed
      | field1                 | field2    | field3     | field4                   | field5                |
      | VP Product Development | Open Date | Close Date | vacancy description text | APPLICATION DOCUMENTS |
    And User can see mandatory statements indicated as active are displayed
      | field1                       | field2                                    | field3            | field4                  |
      | EQUAL OPPORTUNITY EMPLOYMENT | STANDARDS OF CONDUCT/FINANCIAL DISCLOSURE | FOREIGN EDUCATION | REASONABLE ACCOMODATION |
    Then User is able to apply to the vacancy

  @Regression @Smoke @Nekrashevich @APPTRACK-385
  Scenario: Entering basic information negative outcome
    And User is on Home Page
    When User intends to apply for a vacancy
    And User enters  First Name, Last Name
    And User enters Email Address, Phone Number, and Business Phone Number incorrectly
    And User chooses no to Do you possess a Doctoral degree?
    Then User can see alerts
      | alert1                             | alert2                            | alert3                            | alert4                                                                                           |
      | Please enter a valid email address | Please enter a valid phone number | Please enter a valid phone number | A Doctoral degree is minimally required to apply to this vacancy. Please click cancel to go back |

  @Regression @Smoke @Nekrashevich @APPTRACK-373
  Scenario: Entering address details
    And User is on Home Page
    When User intends to apply for a vacancy
    And User enters  First Name, Last Name
    And User enters Email Address, Phone Number, and Business Phone Number correctly
    And User chooses yes to Do you possess a Doctoral degree?
    Then User can move to the Address section
    And User enters data in the  fields
      | Address Line One | Address Line Two | City    | State/Province | Country |
      | 123 Pipe Drive   | apt 34           | Herndon | VA             | USA     |
    And User removes data from Address Line Two
    When User presses Next button
    Then User can see an alert"Please enter zip/postal code"
    When User enters zipcode
    Then User can move to the next section

  @Regression @Smoke @Nekrashevich @APPTRACK-415
  Scenario: Fill In References section Required Fields
    And User is on Home Page
    When User applies for an vacancy
    And User enters  First Name, Last Name
    And User enters Email Address, Phone Number, and Business Phone Number correctly
    And User chooses yes to Do you possess a Doctoral degree?
    Then User can move to the Address section
    And User fills in Address section details
    And User enters only First Name, Last Name, Email Address, and contact directly info in References section
    And User  denies for references to be contacted
    And User can see References blurb
    And User can see Position Title(if applicable) References field
    And User can see Relationships dropdown options
      | option1            | option2   | option3   | option4 |
      | Supervisor/Manager | Co-worker | Colleague | Peer    |
    Then User can move to the Application Documents section

  @Regression @Nekrashevich  @APPTRACK-102
  Scenario: Upload documents in the Reference section on the Vacancy Application
    And User is on Home Page
    When User applies for an vacancy
    And User enters  First Name, Last Name
    And User enters Email Address, Phone Number, and Business Phone Number correctly
    And User chooses yes to Do you possess a Doctoral degree?
    Then User can move to the Address section
    And User fills in Address section details
    And User fills in References section
    Then User uploads not all the documents not marked as optional
    And User can see an alert
    When User uploads all the needed documents
    Then User is able to move to Review section

  @Regression @Nekrashevich  @APPTRACK-359  @APPTRACK-254
  Scenario: Applicant Dashboard screen
    When User is on Your Applications tab
    Then User can see the following columns
      | field1        | field2 | field3         | field4                | field5  |
      | Vacancy Title | State  | Vacancy Closes | Application Submitted | Actions |

  @Regression @Nekrashevich @APPTRACK-930  @APPTRACK-928
  Scenario: Verify business phone number showing blank if not submitted
    And User is on Home Page
    When User applies for an vacancy
    And User enters  First Name, Last Name
    And User enters Email Address, Phone Number, and leaves field Business Phone Number blank
    And User chooses yes to Do you possess a Doctoral degree?
    Then User can move to the Address section
    And User fills in Address section details
    And User fills in References section
    And User can see the documents section alert displayed "Please ensure each of your documents are unique files.  "
    And User can see  documents section alert displayed "Application documents will not be saved unless your application is submitted/finalized on the next section."
    When User uploads all the needed documents
    Then User is able to move to Review section
    And User can verify that Business Phone Number field shows blank