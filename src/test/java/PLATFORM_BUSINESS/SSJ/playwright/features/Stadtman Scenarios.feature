Feature: Stadtman Scenarios

  @US_APPTRACK-342 @TC_APPTRACK-385 @JUAREZDS @Regression @playwright @SNOW_UPDATED @Progression
  Scenario Outline: Verifying applicant is able to see "Your Applications" tab and page content after applying to a Vacancy
    Given a registered Okta SSJ user is on the SSJ Landing page
    And logs in with Okta account username "<Okta Username>"
    And clicks on Vacancy "Stadtman Scope Testing"
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
    And clicks on Vacancy "Stadtman Scope Testing"
    And clicks "Apply"
    Then user is on the "Application Documents" page
    And uploads a Vision Statement if Vision Statement option is displayed
    And uploads cover letter if cover letter option is displayed
    And uploads qualification statement if qualification statement is displayed
    And uploads a Curriculum Vitae if Curriculum Vitae option is displayed
    And selects two focus areas
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
    Then if reference three is required then user enters Reference Three first name "<referenceThreeFirstName>"
    And enters Reference Three middle name "<referenceThreeMiddleName>"
    And enters Reference Three last name "<referenceThreeLastName>"
    And enters Reference Three email address "<referenceThreeEmail>"
    And enters Reference Three phone number "<referenceThreePhoneNumber>"
    And selects Reference Three relationship as Co-worker
    And enters Reference Three position title "<referenceThreePositionTitle>"
    And enters Reference Three organization name "<referenceThreeOrganizationName>"
    And clicks "Next"
#    Then user is on the "Demographic Information" page
#    And user agrees to share demographic details and help improve the hiring process.
#    And selects "Male" for Sex
#    And selects "Hispanic or Latino" for Ethnicity
#    And selects "American Indian or Alaska", "Asian", "Black or African-American", "Native Hawaiian or other", "White" for Race
#    And selects "None of the conditions listed above apply to me." for Disability or Serious Health Condition
#    And clicks "Next"
#    Then user is on the "Review" page
#    And user verifies basic information "<firstName>", "<middleName>", "<lastName>", "<email>", "<phone>", "<businessPhone>", "<highestEducation>", and "<US Citizenship>"
#    And user verifies address information "<address>", "<aptNumber>", "<city>", "<state>", "<zip>"
#    And user verifies demographics information "Yes", "Male", "Hispanic or Latino", "American Indian or Alaska Native, Asian, Black or African-American, Native Hawaiian or other Pacific Islander, White", and "None of the conditions listed above apply to me."
#    And user verifies references one information "<referenceOneFirstName>", "<referenceOneLastName>", "<referenceOneEmail>", "<referenceOnePhoneNumber>", "<referenceOneRelationship>", "<referenceOnePositionTitle>", "<referenceOneOrganizationName>"
#    And user verifies references two information "<referenceTwoFirstName>", "<referenceTwoLastName>", "<referenceTwoEmail>", "<referenceTwoPhoneNumber>", "<referenceTwoRelationship>", "<referenceTwoPositionTitle>", "<referenceTwoOrganizationName>"
#    And if either a Cover Letter, Qualification Statement, Curriculum Vitae (CV), or Vision Statement (or all) were uploaded then documents are displayed in the Application Documents section
#    And clicks "Submit Application"
#    And clicks "Ok"
#    And clicks "Done"
#    And verifies Your Applications tab is displayed
#    When user navigates to Your Applications tab
#    And user verifies "Your Applications" page title is displayed
#    Then user verifies the following columns are displayed on Your Applications page "Vacancy Title", "Status", "Vacancy Closes", "Application Submitted", "Actions"z
#
    Examples:
      | Okta Username | firstName       | middleName | lastName | email           | phone      | businessPhone | highestEducation | US Citizenship | address | aptNumber | city   | state | country | zip   | referenceOneFirstName | referenceOneMiddleName | referenceOneLastName | referenceOneEmail     | referenceOnePhoneNumber | referenceOneRelationship | referenceOnePositionTitle | referenceOneOrganizationName                 | referenceTwoFirstName | referenceTwoMiddleName | referenceTwoLastName | referenceTwoEmail     | referenceTwoPhoneNumber | referenceTwoRelationship | referenceTwoPositionTitle | referenceTwoOrganizationName                 | referenceThreeFirstName | referenceThreeMiddleName | referenceThreeLastName | referenceThreeEmail | referenceThreePhoneNumber | referenceThreeRelationship | referenceThreePositionTitle | referenceThreeOrganizationName                 |
      | StadtmanUser1 | StadtmanUserOne | Michelle   | Pololi   | mario@gmail.com | 2018212343 | 2023323454    | Masters          | Yes            | 7 Mills | 12378     | Reston | VA    | USA     | 20453 | Fred                  | Trout                  | Laste                | referenceOne@test.com | 7036875816              | Supervisor/Manager       | PROJECT MANAGER           | TESTING ORGANIZATION FIELD FOR REFERENCE ONE | John                  | Steven                 | Vakhutko             | referenceTwo@test.com | 7036875816              | Co-worker                | TEST AUTOMATION LEAD      | TESTING ORGANIZATION FIELD FOR REFERENCE TWO | Luis                    | TEST                     | Cabrera                | luis@test.com       | 703-123-4567              | Co-Worker                  | CBIIT FEDERAL LEAD          | TESTING ORGANIZATION FIELD FOR REFERENCE THREE |