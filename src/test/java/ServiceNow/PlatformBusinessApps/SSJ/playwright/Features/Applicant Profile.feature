Feature: Applicant Profile Scenarios
  Description: This Feature file contains Applicant Profile Scenarios

  @SSJ-32 @SSJ-33 @SSJ-36 @SSJ-92 @SSJ-98 @JUAREZDS @Regression @playwright @SNOW_UPDATED
  Scenario Outline: Verifying the Save application functionality
    Given a test account "<firstName>" is reset before executing a test
    When User is on SSJ Landing page and user is "Maria Chaudhry" - PW
    And User is on Profile tab - PW
    And User inputs "<firstName>" into first name field - PW
    And User inputs "<middleName>" into middle name field - PW
    And User inputs "<lastName>" into last name field - PW
    And User inputs "<email>" into email field - PW
    And User inputs "<phone>" into phone field - PW
    And User inputs "<businessPhoneVacancy>" into business phone field - PW
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
    And verifies that the saved business phone number displays as "<businessPhoneVacancy>"
    And verifies that the saved highest education displays as "<highestEducation>"
    And verifies that the saved US Citizenship displays as "<US Citizenship>"
    And tester navigates to native view to reset account with name "<firstName>" so that automated test can run again without manual intervention

    Examples:
      | firstName | middleName | lastName   | email              | phone      | businessPhoneVacancy | highestEducation | US Citizenship | address  | aptNumber | city       | state | country | zip   |
      | SSJTest   | Michelle   | Pololi     | mario@gmail.com    | 2018212343 | 2023323454           | Masters          | Yes            | 7 Mills  | 12378     | Reston     | VA    | USA     | 20453 |
      | SSJTest   | Black      | Kristensen | kristen1@nih.gov   | 2133212333 | 2902122234           | Bachelors        | Yes            | 2 Bells  | 231       | McLean     | VA    | USA     | 21333 |
      | SSJTest   | James      | Bernier    | bernierkd@nih.gov  | 2018211343 | 2123323454           | Masters          | Yes            | 11 Kolls | 78        | Sterling   | VA    | USA     | 20483 |
      | SSJTest   | Donald     | Viola      | violajc@nih.gov    | 2233212333 | 2202122234           | Bachelors        | Yes            | 11 Bells | 23        | Ashburn    | VA    | USA     | 29233 |
      | SSJTest   | Michel     | Violette   | violettews@nih.gov | 3018212343 | 2023323454           | Doctorate        | Yes            | 7 Mills  | 13378     | San Diego  | CA    | USA     | 90453 |
      | SSJTest   | Seidell    | Lack       | seidellvv@nih.gov  | 4133212333 | 2902122234           | Bachelors        | Yes            | 2 Bells  | 2313      | Monterey   | CA    | USA     | 94333 |
      | SSJTest   | Marianna   | Molnar     | molnaraj@nih.gov   | 7018211343 | 2123323454           | Masters          | Yes            | 11 Kolls | 6         | Carmel     | CA    | USA     | 97812 |
      | SSJTest   | Jim        | Kennedy    | mkennedyh@nih.gov  | 8233212333 | 2202122234           | Bachelors        | Yes            | 11 Bells | 39        | San Jose   | CA    | USA     | 95112 |
      | SSJTest   | Marianna   | Mollick    | mollickja@nih.gov  | 7018211343 | 2123323454           | Masters          | Yes            | 11 Kolls | 6         | Sausalito  | CA    | USA     | 97712 |
      | SSJTest   | Elena      | Andrew     | andrewkl@nih.gov   | 8233212333 | 2202122234           | Bachelors        | Yes            | 11 Bells | 39        | Sacramento | CA    | USA     | 95512 |

  @SSJ-32 @SSJ-33 @SSJ-36 @SSJ-92 @SSJ-98 @SSJ-712 @JUAREZDS @Regression @playwright @SNOW_UPDATED
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
    And User clicks Demographics section - PW
    And User chooses to share demographic details - PW
    And User edits sex choice - PW
    And User edits ethnicity choice - PW
    And User edits race choice - PW
    And User edits disability choice - PW
    And User saves the updated section - PW
    And User clicks Edit for Demographics section - PW
    And User chooses not to share demographic details - PW
    Then User saves the updated section - PW
    And tester navigates to native view to reset account with name "<firstName>" so that automated test can run again without manual intervention

    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | highestEducation | US Citizenship | address | aptNumber | city   | state | country | zip   |
      | SSJTest   | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | Masters          | Yes            | 7 Mills | 12378     | Reston | VA    | USA     | 20453 |

  @US_APPTRACK-342 @TC_APPTRACK-385 @JUAREZDS @Regression @playwright @SNOW_UPDATED
  Scenario Outline: Verifying applicant is able to see "Your Applications" tab and page content after applying to a Vacancy
#    Given an Okta user "" is on the SSJ home page and logs in - PLEASE LEAVE THIS HERE! NEED TO CONNECT WITH OKTA TEAM
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
    And selects "Jason Levine" for Committee Member with Executive Secretary role
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
    And verifies Committee Member "Jason Levine" is displayed with role "Executive Secretary (non-voting)"
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
    And user verifies references one information "<referenceOneFirstName>", "<referenceOneLastName>", "<referenceOneEmail>", "<referenceOnePhoneNumber>", "<referenceOneRelationship>", "<referenceOnePositionTitle>", "<referenceOneOrganizationName>"
    And user verifies references two information "<referenceTwoFirstName>", "<referenceTwoLastName>", "<referenceTwoEmail>", "<referenceTwoPhoneNumber>", "<referenceTwoRelationship>", "<referenceTwoPositionTitle>", "<referenceTwoOrganizationName>"
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


  @US_APPTRACK-342 @TC_APPTRACK-385 @JUAREZDS @Regression @playwright @SNOW_UPDATED @ActionsTest
  Scenario: Verifying applicant does not see "Your Applications" tab if applicant has not applied to a Vacancy
    Given a user who has not applied to a Vacancy before is on the SSJ home page
    Then Your Applications tab should NOT be displayed

  @TC_APPTRACK-145 @JUAREZDS @Regression @playwright @SNOW_UPDATED
  Scenario: Verifying Vacancy details
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
    And selects "Jason Levine" for Committee Member with Executive Secretary role
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

  @TC_APPTRACK-144 @JUAREZDS @Regression @playwright @NEEDS_FIX
  Scenario: Applying for vacancy as unauthenticated applicant
    Given an unauthenticated applicant is on the SSJ homepage "SSJPortalView"
    And verifies that the drop drown text is "Login"
    And clicks on the first vacancy
    And verifies that Sign In and Apply button text is "Sign In and Apply"
    And clicks "Sign In and Apply"
    And verifies that the pop up header text is "Please log in."
    And verifies that the pop up body text is
   """
You must be logged in to apply for a vacancy.
Would you like to log in now or go back to the home page?
   """
    And verifies that the text on the buttons is "Create an account" "Log in" "Go Back"
#    And clicks "Log in" and is redirected to the Okta Login Portal
#    And verifies that the PIV CAC card button text is "Sign in with PIV / CAC card"

  @TC_APPTRACK-128 @JUAREZDS @Regression @playwright @SNOW_UPDATED
  Scenario Outline: Verification of the Save application functionality
    Given a test account "SSJTest" is reset before executing a test
    And a test vacancy "DIEGO TEST" is reset before creating a vacancy
    And User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
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
    And selects "Jason Levine" for Committee Member with Executive Secretary role
    And clicks "Save"
    And clicks Save for Email Templates
    And user is able to see the Review and Finalize section with the vacancy information submitted
    And clicks "Save and Finalize"
    And clicks "OK"
    And clicks "Close"
    And OWM Vacancy Manager logs out
    When User is on SSJ Landing page and user is "Maria Chaudhry" - PW
    And clicks on Vacancy Title "DIEGO TEST"
    And clicks "Apply"
    And clicks "Finish Profile"
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
    And navigates to the "Home" tab to be able to apply to a vacancy after creating a profile
    And clicks on Vacancy Title "DIEGO TEST"
    And clicks "Apply"
    And uploads cover letter if cover letter option is displayed
    And uploads qualification statement if qualification statement is displayed
    And uploads a Curriculum Vitae if Curriculum Vitae option is displayed
    And uploads a Vision Statement if Vision Statement option is displayed
    And clicks "Next"
    And user is on the "References" page
    And if reference one is required then user enters Reference One first name "Emily"
    And enters Reference One last name "Jones"
    And enters Reference One email address "test@test.com"
    And User clicks on Save Application button
    And verifies that successful save alert is displayed "Application successfully saved Back to Applications Home?x"
    And user navigates to Your Applications tab
    Then verifies that the application became a draft "Draft"

    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | highestEducation | address | aptNumber | city   | state | country | zip   |
      | SSJTest   | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | Masters          | 7 Mills | 12378     | Reston | VA    | USA     | 20453 |

  @TC_APPTRACK-360 @JUAREZDS @Regression @playwright @SNOW_UPDATED
  Scenario Outline: Verification of the Save application functionality
    Given a test account "SSJTest" is reset before executing a test
    And User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
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
    And selects "Jason Levine" for Committee Member with Executive Secretary role
    And clicks "Save"
    And clicks Save for Email Templates
    And user is able to see the Review and Finalize section with the vacancy information submitted
    And clicks "Save and Finalize"
    And clicks "OK"
    And clicks "Close"
    And OWM Vacancy Manager logs out
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
    And navigates to the "Home" tab to be able to apply to a vacancy after creating a profile
    And clicks on Vacancy Title "DIEGO TEST"
    And clicks "Apply"
    And uploads cover letter if cover letter option is displayed
    And uploads qualification statement if qualification statement is displayed
    And uploads a Curriculum Vitae if Curriculum Vitae option is displayed
    And uploads a Vision Statement if Vision Statement option is displayed
    And clicks "Next"
    And user is on the "References" page
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
    And User clicks on Save Application button
    And verifies that successful save alert is displayed "Application successfully saved Back to Applications Home?x"
    And user navigates to Your Applications tab
    Then verifies that the application became a draft "Draft"
    And clicks Edit vacancy "DIEGO TEST"
    And uploads cover letter if cover letter option is displayed
    And uploads qualification statement if qualification statement is displayed
    And uploads a Curriculum Vitae if Curriculum Vitae option is displayed
    And uploads a Vision Statement if Vision Statement option is displayed
    And clicks "Next"
    And user is on the "References" page
    Then if reference one is required then user enters Reference One first name "<updatedReferenceOneFirstName>"
    And enters Reference One middle name "<updatedReferenceOneMiddleName>"
    And enters Reference One last name "<updatedReferenceOneLastName>"
    And enters Reference One email address "<updatedReferenceOneEmail>"
    And enters Reference One phone number "<updatedReferenceOnePhoneNumber>"
    And selects Reference One relationship as "<updatedReferenceOneRelationship>"
    And enters Reference One position title "<updatedReferenceOnePositionTitle>"
    And enters Reference One organization name "<updatedReferenceOneOrganizationName>"
    Then if reference two is required then user enters Reference Two first name "<updatedReferenceTwoFirstName>"
    And enters Reference Two middle name "<updatedReferenceTwoMiddleName>"
    And enters Reference Two last name "<updatedReferenceTwoLastName>"
    And enters Reference Two email address "<updatedReferenceTwoEmail>"
    And enters Reference Two phone number "<updatedReferenceTwoPhoneNumber>"
    And enters Reference Two position title "<updatedReferenceTwoPositionTitle>"
    And enters Reference Two organization name "<updatedReferenceTwoOrganizationName>"
    And clicks " Save Application"
    And verifies that successful save alert is displayed "Application successfully saved Back to Applications Home?x"
    And user navigates to Your Applications tab
    And clicks on Vacancy Title "DIEGO TEST"
    And uploads cover letter if cover letter option is displayed
    And uploads qualification statement if qualification statement is displayed
    And uploads a Curriculum Vitae if Curriculum Vitae option is displayed
    And uploads a Vision Statement if Vision Statement option is displayed
    And clicks "Next"
    And verifies that Reference One "<updatedReferenceOneFirstName>", "<updatedReferenceOneMiddleName>", "<updatedReferenceOneLastName>", "<updatedReferenceOneEmail>", "<updatedReferenceOnePhoneNumber>", "<updatedReferenceOnePositionTitle>", "<updatedReferenceOneOrganizationName>" is updated
    And verifies tha Reference Two "<updatedReferenceTwoFirstName>", "<updatedReferenceTwoMiddleName>", "<updatedReferenceTwoLastName>", "<updatedReferenceTwoEmail>", "<updatedReferenceTwoPhoneNumber>", "<updatedReferenceTwoPositionTitle>", "<updatedReferenceTwoOrganizationName>" is updated
    And clicks " Save Application"
    And verifies that successful save alert is displayed "Application successfully saved Back to Applications Home?x"
    And user navigates to Your Applications tab
    And clicks on Remove button
    And "Confirm" that the draft was removed
    And verifies that the draft is no longer showing under Your Application tab
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
    And clicks "Submit Application"
    And clicks "Ok"
    And clicks "Done"
    And user navigates to Your Applications tab
    And user withdraws the application
    And "Confirm" withdrawing the application
    Then verifies that the application status is "Withdrawn"

    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | highestEducation | address | aptNumber | city   | state | country | zip   | referenceOneFirstName | referenceOneMiddleName | referenceOneLastName | referenceOneEmail     | referenceOnePhoneNumber | referenceOneRelationship | referenceOnePositionTitle | referenceOneOrganizationName                 | referenceTwoFirstName | referenceTwoMiddleName | referenceTwoLastName | referenceTwoEmail     | referenceTwoPhoneNumber | referenceTwoPositionTitle | referenceTwoOrganizationName                 | updatedReferenceOneFirstName | updatedReferenceOneMiddleName | updatedReferenceOneLastName | updatedReferenceOneEmail     | updatedReferenceOnePhoneNumber | updatedReferenceOneRelationship | updatedReferenceOnePositionTitle | updatedReferenceOneOrganizationName                  | updatedReferenceTwoFirstName | updatedReferenceTwoMiddleName | updatedReferenceTwoLastName | updatedReferenceTwoEmail     | updatedReferenceTwoPhoneNumber | updatedReferenceTwoPositionTitle | updatedReferenceTwoOrganizationName                  |
      | SSJTest   | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | Masters          | 7 Mills | 12378     | Reston | VA    | USA     | 20453 | Fred                  | Trout                  | Laste                | referenceOne@test.com | 7036875816              | Supervisor/Manager       | PROJECT MANAGER           | TESTING ORGANIZATION FIELD FOR REFERENCE ONE | John                  | Steven                 | Vakhutko             | referenceTwo@test.com | 7036875816              | TEST AUTOMATION LEAD      | TESTING ORGANIZATION FIELD FOR REFERENCE TWO | Elizabeth                    | Mary                          | Smith                       | updatedReferenceOne@test.com | 7036875817                     | Colleague                       | BUSINESS ANALYST                 | UPDATED TESTING ORGANIZATION FIELD FOR REFERENCE ONE | Adam                         | Elliot                        | Washington                  | updatedReferenceTwo@test.com | 7036875817                     | PRODUCT OWNER                    | UPDATED TESTING ORGANIZATION FIELD FOR REFERENCE TWO |


#APPTRACK-827 - review
#APPTRACK-370 - review
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