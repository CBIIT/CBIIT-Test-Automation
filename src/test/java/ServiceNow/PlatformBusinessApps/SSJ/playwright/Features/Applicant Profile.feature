Feature: Applicant Profile Scenarios
  Description: This Feature file contains Applicant Profile Scenarios

  @juarezds @SSJ-32 @SSJ-33 @SSJ-36 @SSJ-92 @SSJ-98 @Regression @playwright
  Scenario Outline: Verifying the Save application functionality
    Given a test account "<firstName>" is reset before executing a test
    When User is on SSJ Landing page and user is "Maria Chaudhry" - PW
    And User is on Profile tab - PW
    And User inputs "<firstName>" into first name field - PW
    And User inputs "<middleName>" into middle name field - PW
    And User inputs "<lastName>" into last name field - PW
    And User inputs "<email>" into email field - PW
    And User inputs "<phone>" into phone field - PW
    And User inputs "<businessPhone>" into business phone field - PW
    And selects highest education "<highestEducation>"
    And User confirms being a US Citizen - PW
    And User inputs "<address>" into address field - PW
    And User inputs "<aptNumber>" into appNumber field - PW
    And User inputs "<city>" into city field - PW
    And User inputs "<state>" into state field - PW
    And User inputs "<country>" into country field - PW
    And User inputs "<zip>" into zip field - PW
    When User clicks on Save Application button - PW
    Then user verifies that first name "<firstName>", middle name "<middleName>", and last name "<lastName>" saved display as expected
    And verifies that the saved address displays with "<address>", "<aptNumber>", "<city>", "<state>", "<country>", "<zip>"
    And verifies that the saved email address displays as "<email>"
    And verifies that the saved phone number displays as "<phone>"
    And verifies that the saved business phone number displays as "<businessPhone>"
    And verifies that the saved highest education displays as "<highestEducation>"
    And verifies that the saved US Citizenship displays as "<US Citizenship>"
    And tester navigates to native view to reset account with name "<firstName>" so that automated test can run again without manual intervention

    Examples:
      | firstName | middleName | lastName   | email              | phone      | businessPhone | highestEducation | US Citizenship | address  | aptNumber | city       | state | country | zip   |
      | SSJTest   | Michelle   | Pololi     | mario@gmail.com    | 2018212343 | 2023323454    | Masters          | Yes            | 7 Mills  | 12378     | Reston     | VA    | USA     | 20453 |
      | David     | Black      | Kristensen | kristen1@nih.gov   | 2133212333 | 2902122234    | Bachelors        | Yes            | 2 Bells  | 231       | McLean     | VA    | USA     | 21333 |
      | Krista    | James      | Bernier    | bernierkd@nih.gov  | 2018211343 | 2123323454    | Masters          | Yes            | 11 Kolls | 78        | Sterling   | VA    | USA     | 20483 |
      | Joe       | Donald     | Viola      | violajc@nih.gov    | 2233212333 | 2202122234    | Bachelors        | Yes            | 11 Bells | 23        | Ashburn    | VA    | USA     | 29233 |
      | William   | Michel     | Violette   | violettews@nih.gov | 3018212343 | 2023323454    | Doctorate        | Yes            | 7 Mills  | 13378     | San Diego  | CA    | USA     | 90453 |
      | Violeta   | Seidell    | Lack       | seidellvv@nih.gov  | 4133212333 | 2902122234    | Bachelors        | Yes            | 2 Bells  | 2313      | Monterey   | CA    | USA     | 94333 |
      | Abby      | Marianna   | Molnar     | molnaraj@nih.gov   | 7018211343 | 2123323454    | Masters          | Yes            | 11 Kolls | 6         | Carmel     | CA    | USA     | 97812 |
      | Maureen   | Jim        | Kennedy    | mkennedyh@nih.gov  | 8233212333 | 2202122234    | Bachelors        | Yes            | 11 Bells | 39        | San Jose   | CA    | USA     | 95112 |
      | Jessica   | Marianna   | Mollick    | mollickja@nih.gov  | 7018211343 | 2123323454    | Masters          | Yes            | 11 Kolls | 6         | Sausalito  | CA    | USA     | 97712 |
      | Karen     | Elena      | Andrew     | andrewkl@nih.gov   | 8233212333 | 2202122234    | Bachelors        | Yes            | 11 Bells | 39        | Sacramento | CA    | USA     | 95512 |

  @juarezds @SSJ-32 @SSJ-33 @SSJ-36 @SSJ-92 @SSJ-98 @Regression @playwright @Bug_Open @Smoke
  Scenario Outline: Verifying the Save application functionality
    Given a test account "<firstName>" is reset before executing a test
    When User is on SSJ Landing page and user is "Maria Chaudhry" - PW
    And User is on Profile tab - PW
    And User inputs "<firstName>" into first name field - PW
    And User inputs "<middleName>" into middle name field - PW
    And User inputs "<lastName>" into last name field - PW
    And User inputs "<email>" into email field - PW
    And User inputs "<phone>" into phone field - PW
    And User inputs "<businessPhone>" into business phone field - PW
    And selects highest education "<highestEducation>"
    And User confirms being a US Citizen - PW
    And User inputs "<address>" into address field - PW
    And User inputs "<aptNumber>" into appNumber field - PW
    And User inputs "<city>" into city field - PW
    And User inputs "<state>" into state field - PW
    And User inputs "<country>" into country field - PW
    And User inputs "<zip>" into zip field - PW
    When User clicks on Save Application button - PW
    Then user verifies that first name "<firstName>", middle name "<middleName>", and last name "<lastName>" saved display as expected
    And verifies that the saved address displays with "<address>", "<aptNumber>", "<city>", "<state>", "<country>", "<zip>"
    And verifies that the saved email address displays as "<email>"
    And verifies that the saved phone number displays as "<phone>"
    And verifies that the saved business phone number displays as "<businessPhone>"
    And verifies that the saved highest education displays as "<highestEducation>"
    And verifies that the saved US Citizenship displays as "<US Citizenship>"
    And tester navigates to native view to reset account with name "<firstName>" so that automated test can run again without manual intervention

    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | highestEducation | US Citizenship | address | aptNumber | city   | state | country | zip   |
      | SSJTest   | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | Masters          | Yes            | 7 Mills | 12378     | Reston | VA    | USA     | 20453 |

  @alenan @SSJ-712 @Bug_Open @juarezds @In_Progress @playwright @Smoke
  Scenario: Edit Demographics of Profile
    Given a test account "Maria Chaudhry" is reset before executing a test
    When User is on SSJ Landing page and user is "Maria Chaudhry" - PW
    When User is on Profile tab - PW
    And User clicks Edit for Demographics section - PW
    And User chooses to share demographic details - PW
    And User edits sex choice - PW
    And User edits ethnicity choice - PW
    And User edits race choice - PW
    And User edits disability choice - PW
    And User saves the updated section - PW
    And User clicks Edit for Demographics section - PW
    And User chooses not to share demographic details - PW
    Then User saves the updated section - PW

  @US_APPTRACK-342 @TC_APPTRACK-385 @JUAREZDS @Regression @playwright
  Scenario Outline: Verifying applicant is able to see "Your Applications" tab and page content after applying to a Vacancy
#    Given an Okta user "" is on the SSJ home page and logs in - PLEASE LEAVE THIS HERE! NEED TO CONNECT WITH OKTA TEAM
    Given a test vacancy "DIEGO TEST" is reset before creating a vacancy
    When User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
    And clicks on "Vacancy Dashboard" - PW
    And clicks on "+ Create Vacancy" - PW
    And enters Vacancy Title name "DIEGO TEST" - PW
    And enters Vacancy Description "THIS IS A TEST AUTOMATION TEST" - PW
    And selects "Yes" for point of contact - PW
    And User sets an "Open Date" entry as today's date
    And unselects the option for cover letter
    And checks "Enable Reference Collection" check box
    And selects a Reference Collection Date Ten days from today
    And selects "2" for Full Contact Details for References
    And selects "Research Fellow" for Position Classification drop down
    And selects "HNC" for Organizational Code drop down
    And clicks "Save"
    And clicks Save for Mandatory Statements
    And selects "David Rampulla" for Committee Member with chair role
    And selects "Jay Kurani" for Committee Member with Executive Secretary role
    And clicks "Save"
    And clicks Save for Email Templates
    Then user is able to see the Review and Finalize section with the vacancy information submitted
    And verifies Vacancy Title "DIEGO TEST"
    And verifies Utilize a Set Close Date is "No"
    And verifies Allow HR Specialist to Triage is "No"
    And verifies Vacancy Description "THIS IS A TEST AUTOMATION TEST"
    And verifies Vacancy Point of Contact Information is "Holly Gemar-Griffith" with email address "holly.gemar-griffith@nih.gov"
    And verifies Open Date is todays date
    And verifies Application Documents "Curriculum Vitae (CV)", "Cover Letter", "Vision Statement", "Qualification Statement"
    And verifies Reference Collection is "Yes"
    And verifies Collection Date is ten days from today
    And verifies "2 recommendation(s)" reference recommendations are required for this vacancy
    And verifies "4 categories" scoring categories are required for this vacancy
    And verifies Organizational Code is "HNC"
    And verifies Position Classification is "Research Fellow"
    And verifies Personnel Action Tracking Solution (PATS) Initiator is "Holly Gemar-Griffith"
    And verifies Mandatory Statements "Equal Opportunity Employment", "Standards of Conduct/Financial Disclosure", "Foreign Education", and "Reasonable Accomodation" are displayed
    And verifies Committee Member "David Rampulla" is displayed with role "Chair"
    And verifies Committee Member "Jay Kurani" is displayed with role "Executive Secretary (non-voting)"
    And verifies Email Templates "Application saved", "Application submitted confirmation", "Applicant Reference Request", "Applicant Reference Received", "Applicant Reference Received - Applicant"
    And clicks "Save and Finalize"
    And clicks "OK"
    And clicks "Close"
    And OWM Vacancy Manager logs out
    Given a test account "<firstName>" is reset before executing a test
    When User is on SSJ Landing page and user is "Maria Chaudhry" - PW
    And clicks on Vacancy Title "DIEGO TEST"
    And clicks "Apply"
    And proceeds with completing profile by clicking "Finish Profile"
    And User inputs "<firstName>" into first name field - PW
    And User inputs "<middleName>" into middle name field - PW
    And User inputs "<lastName>" into last name field - PW
    And User inputs "<email>" into email field - PW
    And User inputs "<phone>" into phone field - PW
    And User inputs "<businessPhone>" into business phone field - PW
    And selects highest education "<highestEducation>"
    And User confirms being a US Citizen - PW
    And User inputs "<address>" into address field - PW
    And User inputs "<aptNumber>" into appNumber field - PW
    And User inputs "<city>" into city field - PW
    And User inputs "<state>" into state field - PW
    And User inputs "<country>" into country field - PW
    And User inputs "<zip>" into zip field - PW
    When User clicks on Save Application button - PW
    Then user verifies that first name "<firstName>", middle name "<middleName>", and last name "<lastName>" saved display as expected
    And verifies that the saved address displays with "<address>", "<aptNumber>", "<city>", "<state>", "<country>", "<zip>"
    And verifies that the saved email address displays as "<email>"
    And verifies that the saved phone number displays as "<phone>"
    And verifies that the saved business phone number displays as "<businessPhone>"
    And verifies that the saved highest education displays as "<highestEducation>"
    And verifies that the saved US Citizenship displays as "<US Citizenship>"
    And navigates to the "Home" tab to be able to apply to a vacancy after creating a profile
    And clicks on Vacancy Title "DIEGO TEST"
    And clicks "Apply"
    Then user is on the "Application Documents" page
    And uploads cover letter if cover letter option is displayed
    And uploads qualification statement if qualification statement is displayed
    And uploads a Curriculum Vitae if Curriculum Vitae option is displayed
    And uploads a Vision Statement if Vision Statement option is displayed
    And clicks "Next"
    Then user is on the "References" page
    Then if reference one is required then user enters Reference One first name "<referenceOneFirstName>"
    And enters Reference One middle name "<referenceOneMiddleName>"
    And enters Reference One last name "<referenceOneLastName>"
    And enters Reference One email address "<referenceOneEmail>"
    And enters Reference One phone number "<referenceOnePhoneNumber>"
    And selects Reference One relationship as "<referenceOneRelationship>"
    And enters Reference One position title "<referenceOnePositionTitle>"
    And enters Reference One organization name "<referenceOneOrganizationName>"
    Then if reference two is required then user enters Reference Two first name "<referenceTwoFirstName>"
    And enters Reference Two middle name "<referenceTwoMiddleName>"
    And enters Reference Two last name "<referenceTwoLastName>"
    And enters Reference Two email address "<referenceTwoEmail>"
    And enters Reference Two phone number "<referenceTwoPhoneNumber>"
    And selects Reference Two relationship as Co-worker
    And enters Reference Two position title "<referenceTwoPositionTitle>"
    And enters Reference Two organization name "<referenceTwoOrganizationName>"
    And clicks "Next"
    Then user is on the "Demographic Information" page
    And user agrees to share demographic details and help improve the hiring process.
    And selects "Male" for Sex
    And selects "Hispanic or Latino" for Ethnicity
    And selects "American Indian or Alaska", "Asian", "Black or African-American", "Native Hawaiian or other", "White" for Race
    And selects "None of the conditions listed above apply to me." for Disability or Serious Health Condition
    And clicks "Next"
    Then user is on the "Review" page
    And user verifies basic information "<firstName>", "<middleName>", "<lastName>", "<email>", "<phone>", "<businessPhone>", "<highestEducation>", and "<US Citizenship>"
    And user verifies address information "<address>", "<aptNumber>", "<city>", "<state>", "<zip>"
    And user verifies demographics information "Yes", "Male", "Hispanic or Latino", "American Indian or Alaska Native, Asian, Black or African-American, Native Hawaiian or other Pacific Islander, White", and "None of the conditions listed above apply to me."
    And user verifies references one information "<referenceOneFirstName>", "<referenceOneMiddleName>", "<referenceOneLastName>", "<referenceOneEmail>", "<referenceOnePhoneNumber>", "<referenceOneRelationship>", "<referenceOnePositionTitle>", "<referenceOneOrganizationName>"
    And user verifies references two information "<referenceTwoFirstName>", "<referenceTwoMiddleName>", "<referenceTwoLastName>", "<referenceTwoEmail>", "<referenceTwoPhoneNumber>", "<referenceTwoRelationship>", "<referenceTwoPositionTitle>", "<referenceTwoOrganizationName>"
    And if either a Cover Letter, Qualification Statement, Curriculum Vitae (CV), or Vision Statement (or all) were uploaded then documents are displayed in the Application Documents section
    And clicks "Submit Application"
    And clicks "Ok"
    And clicks "Done"
    And verifies Your Applications tab is displayed
    When user navigates to Your Applications tab
    And user verifies "Your Applications" page title is displayed
    Then user verifies the following columns are displayed on Your Applications page "Vacancy Title", "Status", "Vacancy Closes", "Application Submitted", "Actions"
    And tester navigates to native view to reset account with name "<firstName>" so that automated test can run again without manual intervention

    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | highestEducation | US Citizenship | address | aptNumber | city   | state | country | zip   | referenceOneFirstName | referenceOneMiddleName | referenceOneLastName | referenceOneEmail     | referenceOnePhoneNumber | referenceOneRelationship | referenceOnePositionTitle | referenceOneOrganizationName                 | referenceTwoFirstName | referenceTwoMiddleName | referenceTwoLastName | referenceTwoEmail     | referenceTwoPhoneNumber | referenceTwoRelationship | referenceTwoPositionTitle | referenceTwoOrganizationName                 |
      | SSJTest   | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | Masters          | Yes            | 7 Mills | 12378     | Reston | VA    | USA     | 20453 | Fred                  | Trout                  | Laste                | referenceOne@test.com | 7036875816              | Supervisor/Manager       | PROJECT MANAGER           | TESTING ORGANIZATION FIELD FOR REFERENCE ONE | John                  | Steven                 | Vakhutko             | referenceTwo@test.com | 7036875816              | Co-worker                | TEST AUTOMATION LEAD      | TESTING ORGANIZATION FIELD FOR REFERENCE TWO |


  @US_APPTRACK-342 @TC_APPTRACK-385 @JUAREZDS @playwright @Regression
  Scenario: Verifying applicant does not see "Your Applications" tab if applicant has not applied to a Vacancy
    Given a user who has not applied to a Vacancy before is on the SSJ home page
    Then Your Applications tab should NOT be displayed

  @TC_APPTRACK-145 @JUAREZDS @playwright @Regression
  Scenario: Verifying Vacancy details
    Given the test application "SSJTest" is deleted to re-run automated tests
    Given a test vacancy "DIEGO TEST" is reset before creating a vacancy
    When User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
    And clicks on "Vacancy Dashboard" - PW
    And clicks on "+ Create Vacancy" - PW
    And enters Vacancy Title name "DIEGO TEST" - PW
    And enters Vacancy Description "THIS IS A TEST AUTOMATION TEST" - PW
    And selects "Yes" for point of contact - PW
    And User sets an "Open Date" entry as today's date
    And unselects the option for cover letter
    And checks "Enable Reference Collection" check box
    And selects a Reference Collection Date Ten days from today
    And selects "2" for Full Contact Details for References
    And selects "Research Fellow" for Position Classification drop down
    And selects "HNC" for Organizational Code drop down
    And clicks "Save"
    And clicks Save for Mandatory Statements
    And selects "David Rampulla" for Committee Member with chair role
    And selects "Jay Kurani" for Committee Member with Executive Secretary role
    And clicks "Save"
    And clicks Save for Email Templates
    Then user is able to see the Review and Finalize section with the vacancy information submitted
    And clicks "Save and Finalize"
    And clicks "OK"
    And clicks "Close"
    And OWM Vacancy Manager logs out
    When User is on SSJ Landing page and user is "Maria Chaudhry" - PW
    And clicks on Vacancy Title "DIEGO TEST"
    And verifies Vacancy Title is "DIEGO TEST"
    And verifies text "Open Date" with the date in which the Vacancy was created
    And verifies text Open Until Filled "Open Until Filled"
    And verifies point of contact text "Point of Contact:" with POC "Holly Gemar-Griffith "
    And verifies Vacancy Description text "THIS IS A TEST AUTOMATION TEST"
    And verifies Application Documents text "APPLICATION DOCUMENTS"
    And verifies required documents with required references needed to apply to this test Vacancy


#APPTRACK-145
#APPTRACK-144
#APPTRACK-827
#APPTRACK-1158
#APPTRACK-134
#APPTRACK-133
#APPTRACK-370
#APPTRACK-135
#APPTRACK-360
#APPTRACK-129
#APPTRACK-128
#APPTRACK-127
#APPTRACK-928
#APPTRACK-928
#APPTRACK-927
#APPTRACK-1130
#APPTRACK-594
#APPTRACK-359
#APPTRACK-911
#APPTRACK-599
#APPTRACK-461
#APPTRACK-1106
#APPTRACK-463
#APPTRACK-1109
#APPTRACK-454
#APPTRACK-565