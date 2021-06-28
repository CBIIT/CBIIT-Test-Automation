<<<<<<< Updated upstream
Feature: Native View Scenarios

  @Smoke @juarezds @Progression
=======
<<<<<<< HEAD
#Author: Diego Juarez
#Supports COVID-
Feature: Native View Scenarios

  @Smoke @updated2/5/21 @juarezds
=======
Feature: Native View Scenarios

  @Smoke @juarezds @Progression
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: COVIDcode Study nurse with an Admin role is able to submit an Enrollment Questionnaire in Native View
    Given a COVIDcode Study nurse with an Admin role has logged in to the COVIDcode Study Native View application
    And is on the COVIDcode Enrollments page
    When the COVIDcode Study nurse begins an Enrollment Questionnaire for a "Group 1" user who consents "Yes" to join the study
    And fills out the Enrollment Questionnaire by entering all required information including Demographics, Symptomology, and Exposures and Risk Factors
    And submits the Enrollment Questionnaire
    Then the Enrollment Questionnaire should be successfully submitted

  @Smoke @juarezds
  Scenario: Add a RVS status field on the Enrollment Form
    When the COVIDcode user is on the COVIDcode Study Native View application
    Given the COVIDcode user is on the COVIDcode Enrollments page and clicks on New button
    And the COVIDcode user navigates to the Participant Events tab
    Then there is a RVS Status drop down with the options Accepted and Refused and clicks on "accepted"

  @Smoke @juarezds
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

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View My Inquiry Tracking Records - Verifying Study Team Contact fields
    Given a user has logged into the COVIDcode application in Native View
    And navigates to My Inquiry Tracking Records
    And opens a new  Inquiry Tracking record by clicking on "New" button
    Then the "Covid Test Result F/U 1", "Covid Test Result F/U 2", "COVID test result received (non OMS)?", and "Telephone interview date/time" field are visible in the "Study Team Contact" section

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View COVIDcode Enrollments - Verifying RVS Payment Requested
    Given a user has logged into the COVIDcode application in Native View
    And opens a COVIDCode Enrollment record
    Then the "RVS Payment Requested" field is visible in the "Participant Events" section

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View COVIDcode Enrollments - Add Convalescent Plasma Option
    Given a COVIDCode App Admin user is in the Native View
    When the users open an Enrollment records
    And a create a new Disease Course record
    Then there is a field option called a "Convalescent plasma" for the a Drug Treatments field

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View COVIDcode Follow up - Add Convalescent Plasma Option
    Given a COVIDCode App Admin users is in the Native View
    When the user opens a Follow Up record
    And a creates a new Disease Course record
    Then there is a field option called "Convalescent plasma" for Drug Treatments field

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View Specimens - Add Fedex and Appointment Made Fields
    Given a COVIDCode App Admin user is in Native View
    When the user opens a Specimens record
    And clicks the Sample Outcome field
    Then "Fedex requested" and "Appointment made" are available as field options

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View My Inquiry Tracking Records - Verify Add Assigned Nurses Field
    Given a Study Nurse is in Native view
    When the user opens an Inquiry Tracking Record
    Then there is a field called "Assigned To" in the Study Team Contact tab

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View My Inquiry Tracking Records - Verify Add Assigned Nurses Field
    Given a Study Nurse is in the Native view
    When the users opens an Inquiry Tracking Record
    And clicks the "Add Me" button
    Then their name "Diego Juarez" is added to the Assigned To field

<<<<<<< Updated upstream
  @Smoke @updatedFeb042021 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @updatedFeb042021 @juarezds
=======
  @Smoke @updatedFeb042021 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View My Inquiry Tracking Records - Verify Add Assigned Nurses Field
    Given a Study Nurse is in Native View
    When the users open an Inquiry Tracking Record
    And click the Unlock Assigned To button
    Then the user is able to select multiple nurses from a list of Alan Orpia, Janet Bracci, Laura Harney, Lisa Leathwood, Maureen Risch, Kathryn Nichols and Stephanie Steinbart

<<<<<<< Updated upstream
  @Smoke @COVID-425 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-425 @juarezds
=======
  @Smoke @COVID-425 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View COVIDcode Enrollments - Veriying Error Message for Invalid Data in Inches
    When on the Initial Questionnaire form in Native View
    And on the Demographics Information
    When selecting "Feet/Inches" for Height
    And entering value for feet
    And entering a value greater than 12 Inches for Height
    And clicking anywhere else
    Then a message displays "Because you have a value in feet, inches cannot be more than 11.99"

<<<<<<< Updated upstream
  @Smoke @COVID-425 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-425 @juarezds
=======
  @Smoke @COVID-425 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View COVIDcode Follow Ups - Verifying Error Message for Invalid Data in Inches
    When on the Follow Up form in Native View
    And on the Demographics Information
    When selecting "Feet/Inches" for Height
    And entering value for feet
    And entering a value greater than 12 Inches for Height
    And clicking anywhere else
    Then a message displays "Because you have a value in feet, inches cannot be more than 11.99"

<<<<<<< Updated upstream
  @Smoke @COVID-422 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-422 @juarezds
=======
  @Smoke @COVID-422 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Add Field Options for "When were you officially diagnosed with COVID-19" field
    When on the enrollment form in Native View
    And navigating to the Symptomology in Native View
    Then "Have you officially been diagnosed with COVID-19?" displays

  @Smoke @New @COVID-422 @juarezds
  Scenario: Add Field Options for "When were you officially diagnosed with COVID-19" field
    When on the Follow Up form in Native View
    And navigating to the Symptomology section
    Then "Have you officially been diagnosed with COVID-19?" displays

<<<<<<< Updated upstream
  @Smoke @COVID-405 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-405 @juarezds
=======
  @Smoke @COVID-405 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Verifying Add Sample Code Column
    When a COVIDcode user is logged into the COVIDcode application in Native View
    And navigates to the Specimen module
    Then a "Sample Code" column displays

<<<<<<< Updated upstream
  @Smoke @COVID-424 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-424 @juarezds
=======
  @Smoke @COVID-424 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View Specimens - Verify new field option for the Sample Outcome drop down Hold displays
    When navigating to the Specimens module in Native View
    And opening a Specimen record
    Then for Specimens records, a new field option for the Sample Outcome drop down "Hold" displays

<<<<<<< Updated upstream
  @Smoke @COVID-375 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-375 @juarezds
=======
  @Smoke @COVID-375 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View COVIDcode Inquiry Tracking - Verify selecting Constented to for Outcome the user group ID is automatically set to Group 2
    Given a COVIDcode user is logs into native view
    And searches for the COVIDcode application
    And navigates to COVIDcode Inquiry Tracking
    And clicks on New
    When selecting Constented to for Outcome
    Then the user group ID is automatically set to 'Group 2'

<<<<<<< Updated upstream
  @Smoke @COVID-376 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-376 @juarezds
=======
  @Smoke @COVID-376 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Verifying Add Symptomology Tab to Follow Up Form
    Given a COVIDcode User is on the Follow Up form
    When navigating to the Symptomology tab
    Then the following fields display: 'Were you symptomatic?', 'How was the sample taken?', 'What type of test did the patient receive? (Please select all that apply)', 'Have you officially been diagnosed with COVID-19?'
    And when selecting 'Yes' to Were you symptomatic?
    Then when did you first develop symptoms of COVID-19? date picker displays

<<<<<<< Updated upstream
  @Smoke @COVID-259 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-259 @juarezds
=======
  @Smoke @COVID-259 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View COVIDcode Initial Questionnaire - Verifying updated Hospital Name
    When a COVIDcode user is on the Initial Questionnaire form in Native View
    Then the user is able to see the "Hospital Name" and "Inquiry ID" fields in Native View

<<<<<<< Updated upstream
  @Smoke @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @juarezds
=======
  @Smoke @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View COVIDcode Initial Questionnaire - Validating future dates are not allowed
    Given a COVIDCode user is on the Initial questionnaire page in Native View
    Then the systems does not allow any future dates to be selected for the any date picker

<<<<<<< Updated upstream
  @Smoke @COVID-196 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @COVID-196 @juarezds
=======
  @Smoke @COVID-196 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Native View COVIDcode Follow Up - Validating future dates are not allowed
    Given COVIDCode user is on the Follow Up form page in Native View
    Then the system does not allow any future dates to be selected for the any date picker

<<<<<<< Updated upstream
  @Smoke @CBIIT-79 @juarezds
=======
<<<<<<< HEAD
  @Smoke @New @CBIIT-79 @juarezds
=======
  @Smoke @CBIIT-79 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Uploading File In Native View Initial Questionnaire
    Given a COVIDcode Admin user is on the COVIDcode Native View page
    And the COVIDcode Admin user fill outs an Initial Questionnaire for a "Group 1" user
    When the COVIDcode Admin user uploads files in various formats
    Then the uploaded files should be displayed
    When the COVIDcode Admin user submits the Initial Questionnaire
    Then the COVIDcode Admin user should be able to see the files uploaded

<<<<<<< Updated upstream
  @Smoke @COVID-418 @juarezds
=======
<<<<<<< HEAD
  @New @Smoke @COVID-418 @juarezds
=======
  @Smoke @COVID-418 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Verifying Re-enable Which Organs Showed Signs of Dysfunction/Failure?
    Given a COVIDcode user is on the existing Initial Questionnaire form
    When on Disease Course section, when selecting "Yes" for the Organ Failure
    Then a new question appears "Which organ(s) showed signs of dysfunction/failure?"
    And field options are: Liver, Kidney, Lungs, Heart, Central Nervous system, Hematologic System, Other, Other (free text field)

<<<<<<< Updated upstream
  @Smoke @COVID-419 @juarezds
=======
<<<<<<< HEAD
  @New @Smoke @COVID-419 @juarezds
=======
  @Smoke @COVID-419 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Update Dates for List Edits
    Given a COVIDcode User logs into the COVIDcode application in Native View
    And navigates to the COVIDcode Inquiry Tracking module
    When clicking New
    And entering a date for Initial Emails Sent Date field
    Then the Covid Test Result F/U 1 and Covid Test Result F/U 2 are automatically updated with dates a week apart

<<<<<<< Updated upstream
  @Smoke @COVID-198 @juarezds
=======
<<<<<<< HEAD
  @New @Smoke @COVID-198 @juarezds
=======
  @Smoke @COVID-198 @juarezds
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
  Scenario: Verifying Follow Up Form - Verifying 'Drug Treatments' section - Native View
    When a COVIDCode provider is on the Disease Course section on the Follow Up Form in Native View
    Then Drug Treatments section should display along with the values on the Follow Up Form in Native View None, Azithromycin, Chloroquine, Corticosteroids, Hydroxycholoquine, JAK Inhibitor, Remdesivir, Tocilizumab, Other
