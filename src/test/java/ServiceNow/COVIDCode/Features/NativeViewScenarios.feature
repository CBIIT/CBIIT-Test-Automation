#Author: Diego Juarez, Aidana
#Supports COVID-

Feature: Native View Scenarios

  @Updated @Smoke
  Scenario: COVIDcode Study nurse with an Admin role is able to submit an Enrollment Questionnaire in Native View
    Given a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application
    And is on the COVIDcode Enrollments page
    When the COVIDcode Study nurse begins an Enrollment Questionnaire for a "Group 1" user who consents "Yes" to join the study
    And fills out the Enrollment Questionnaire by entering all required information including Demographics, Symptomology, and Exposures and Risk Factors
    And submits the Enrollment Questionnaire
    Then the Enrollment Questionnaire should be successfully submitted


  @New @Smoke @Aidana
  Scenario: Add a RVS status field on the Enrollment Form
    When the COVIDcode user is on the COVIDcode Study Native View application
    Given the COVIDcode user is on the COVIDcode Enrollments page and clicks on New button
    And the COVIDcode user navigates to the Participant Events tab
    Then there is a RVS Status drop down with the options Accepted and Refused and clicks on "accepted"

  @New @Smoke
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

  @New @Aidana @Smoke
  Scenario: Native View My Inquiry Tracking Records - Verifying Study Team Contact fields
    Given a user has logged into the COVIDcode application in Native View
    And navigates to My Inquiry Tracking Records
    And opens a new  Inquiry Tracking record by clicking on "New" button
    Then the "Covid Test Result F/U 1", "Covid Test Result F/U 2", "COVID test result received (non OMS)?", and "Telephone interview date/time" field are visible in the "Study Team Contact" section

  @New @Aidana @Smoke
  Scenario: Native View COVIDcode Enrollments - Verifying RVS Payment Requested
    Given a user has logged into the COVIDcode application in Native View
    And opens a COVIDCode Enrollment record
    Then the "RVS Payment Requested" field is visible in the "Participant Events" section
