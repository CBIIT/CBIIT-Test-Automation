Feature: CCR Landing Page Scenarios

  @Nekrashevich  @landingPage @Smoke
  Scenario: Verify CCR Landing Page items
    Given User is on CCR Landing page and user is "internal user"
    And User can see "Home" tab displayed
    And User can see "Positions" tab displayed

  @Nekrashevich @Regression @Smoke @fillApplication @CAMS-9
  Scenario Outline: Fill In An Application As An Internal User
    Given User is on CCR Landing page and user is "admin user"
    And Admin User creates a new vacancy
    And User logs out of CCR application
    And User is on CCR Landing page and user is "internal user"
    And User navigates to "Chief Technical Officer" open vacancy
    And User applies for that vacancy
    And User enters "<firstName>" into a first name field
    And User enter "<middleName>" into a middle name field
    And User enters "<lastName>" into a last name field
    And User enters "<email>" into an email field
    And User enters "<phone>" into a phone field
    And User enters "<businessPhone>" into a business phone field
    And User selects "Other" from a degree dropdown
    And User enters "<otherDegree(s)>" into an other degree field
    And User confirms that User is a US Citizen
    And User clicks Next button for "Basic Information" section
    And User enters "<address>" into an address field
    And User enters "<address2>" into an address2 field
    And User enters "<city>" into a city field
    And User enters "<state>" into a state field
    And User enters "<zip>" into a zip field
    And User selects United States from a country dropdown for "Address" section
    And User clicks Next button for "Address" section
    And User enters "<department>" into a department field
    And User enters "<institution>" into an institution field
    And User enters "<businessAddress>" into a business address field
    And User enters "<businessAddress2>" into a business address2 field
    And User enters "<businessCity>" into a business city field
    And User enters "<businessState>" into a business state field
    And User enters "<businessZip>" into a business zip field
    And User selects United States from a country dropdown for "Business Address" section
    And User clicks Next button for "Business Address" section
    And User enters "<referenceFirstName>" into a reference First name field
    And User enters "<referenceLastName>" into a reference Last name field
    And User enters "<referenceEmail>" into a reference Email field
    And User enters "<referencePhoneNumber>" into a reference Phone Number field
    And User selects "Other" from a degree dropdown
    And User clicks Next button for "Reference" section
    And User uploads "CV" document
    And User uploads "Research Goals" document
    And User clicks Next button for "Required Documents" section
    And User selects an outreach source as "Contacted By Member"
    And User selects "Yes" for the question on simplicity of uploading application materials
    And User selects "Yes" for the question on whether the ad posted on the website contains enough information to decide on applying for a job
    And User inputs "No suggestions at the moment" in the changing process text field
    And User submits CCR Careers application
    And User logs out of CCR application
    Given User is on CCR Landing page and user is "admin user"
    And Admin User deletes a newly created vacancy

    Examples:
      | firstName | middleName | lastName | email           | phone      | businessPhone | referenceFirstName| referenceLastName| referenceEmail|referencePhoneNumber |  otherDegree(s) | address   | address2 | city  | state | zip   | department | institution | businessAddress |  businessAddress2 | businessCity | businessState | businessZip |
      | Elena     | Maria      | Beloli   | elena@gmail.com | 2012212343 | 2023323454    |  John             |    Molls         | test@gmail.com| 2123345678          | MBA            |  7 Mills  | Drive    | Reston| VA    | 20453 | Research   |  NCI        | 43 Cal Dr       |  Full Circuit     | Mclean       | VA            | 20567       |

