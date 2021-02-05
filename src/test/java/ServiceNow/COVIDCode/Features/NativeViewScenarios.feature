#Author: juarezds
#Supports COVID-
Feature: Native View Scenarios

  @Smoke @Updated02/04/2021
  Scenario: COVIDcode Study nurse with an Admin role is able to submit an Enrollment Questionnaire in Native View
    Given a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application
    And is on the COVIDcode Enrollments page
    When the COVIDcode Study nurse begins an Enrollment Questionnaire for a "Group 1" user who consents "Yes" to join the study
    And fills out the Enrollment Questionnaire by entering all required information including Demographics, Symptomology, and Exposures and Risk Factors
    And submits the Enrollment Questionnaire
    Then the Enrollment Questionnaire should be successfully submitted

  @Smoke @New
  Scenario: Add a RVS status field on the Enrollment Form
    When the COVIDcode user is on the COVIDcode Study Native View application
    Given the COVIDcode user is on the COVIDcode Enrollments page and clicks on New button
    And the COVIDcode user navigates to the Participant Events tab
    Then there is a RVS Status drop down with the options Accepted and Refused and clicks on "accepted"

  @Smoke @New
  Scenario: COVIDcode internal user is able to see selected groupings and corresponding tables
    Given an internal user is logged into native view and searches for "COVIDCode application"
    Then the following groupings display:"Admin Guide", "Enrollment and Follow Up", "Forms Assigned to Me", "COVIDcode enrollments", "My draft enrollments", "COVIDcode Follow Ups","My draft follow ups", "Disease Course", "Specimens", "COVIDcode Dashboard", "Inquiry Tracking", "COVIDcode volunteer surveys", "COVIDcode Inquiry Tracking", "My Inquiry Tracking Records", "Inquiry Tracking Dashboard", "Institution Contact Tracking", "COVIDcode Institution Contact Tracking", "Admin", "GeCo COVID Multi-Select Choices", "Hospital Codes", "Notifications"
    When an internal user clicks on COVIDCode Enrollments
    Then a COVIDCode Enrollments table with a list of records displays
    When an internal user clicks on Disease Course
    Then a Disease Course table with a list of records displays
    When an internal user clicks on COVIDCode Follow Ups
    Then a COVIDCode Follow Ups table with a list of records displays
    When an internal user clicks on COVIDCode Dashboard
    Then a COVIDCode Dashboard table with a list of records displays

  @Smoke @New
  Scenario: Native View My Inquiry Tracking Records - Verifying Study Team Contact fields
    Given a user has logged into the COVIDcode application in Native View
    And navigates to My Inquiry Tracking Records
    And opens a new  Inquiry Tracking record by clicking on "New" button
    Then the "Covid Test Result F/U 1", "Covid Test Result F/U 2", "COVID test result received (non OMS)?", and "Telephone interview date/time" field are visible in the "Study Team Contact" section

  @Smoke @New
  Scenario: Native View COVIDcode Enrollments - Verifying RVS Payment Requested
    Given a user has logged into the COVIDcode application in Native View
    And opens a COVIDCode Enrollment record
    Then the "RVS Payment Requested" field is visible in the "Participant Events" section

  @Smoke @New
  Scenario: Native View COVIDcode Enrollments - Add Convalescent Plasma Option
    Given a COVIDCode App Admin user is in the Native View
    When the users open an Enrollment records
    And a create a new Disease Course record
    Then there is a field option called a "Convalescent plasma" for the a Drug Treatments field

  @Smoke @New
  Scenario: Native View COVIDcode Follow up - Add Convalescent Plasma Option
    Given a COVIDCode App Admin users is in the Native View
    When the user opens a Follow Up record
    And a creates a new Disease Course record
    Then there is a field option called "Convalescent plasma" for Drug Treatments field

  @Smoke @New
  Scenario: Native View Specimens - Add Fedex and Appointment Made Fields
    Given a COVIDCode App Admin user is in Native View
    When the user opens a Specimens record
    And clicks the Sample Outcome field
    Then "Fedex requested" and "Appointment made" are available as field options

  @Smoke @New
  Scenario: Native View My Inquiry Tracking Records - Verify Add Assigned Nurses Field
    Given a Study Nurse is in Native view
    When the user opens an Inquiry Tracking Record
    Then there is a field called "Assigned To" in the Study Team Contact tab

  @Smoke @New
  Scenario: Native View My Inquiry Tracking Records - Verify Add Assigned Nurses Field
    Given a Study Nurse is in the Native view
    When the users opens an Inquiry Tracking Record
    And clicks the "Add Me" button
    Then their name "Diego Juarez" is added to the Assigned To field

  @Smoke @New
  Scenario: Native View My Inquiry Tracking Records - Verify Add Assigned Nurses Field
    Given a Study Nurse is in Native View
    When the users open an Inquiry Tracking Record
    And click the Unlock Assigned To button
    Then the user is able to select multiple nurses from a list of Alan Orpia, Janet Bracci, Laura Harney, Lisa Leathwood, Maureen Risch, Kathryn Nichols and Stephanie Steinbart
