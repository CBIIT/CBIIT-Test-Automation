Feature: OWM Vacancy Manager Scenarios
  Description: This Feature file contains OWM Vacancy Manager Scenarios

  @SSJ-7 @SSJ-8 @juarezds @Regression @playwright @Smoke @SNOW_UPDATED
  Scenario: Verification of Basic Vacancy Information section while creating an NCI Vacancy
    When User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
    And User navigates to tab "Vacancy Dashboard" - PW
    And User clicks button "+ Create Vacancy" - PW
    And User clicks button "Save" - PW
    Then User can see warning message "A vacancy title is required."
    And User fills in "Vacancy Title" field with title "Testing Automation Title"
    And User fills in "Vacancy Description" field with description "Entering Test Description"
    And User checks "Utilizing a Set Close Date" option
    Then User verifies Close Date entry box appears
    And User checks "Allow HR Specialist to Triage" option
    And User verifies "Yes" and "No" options are displayed for Vacancy Point of Contact Information dropdown
    And User "Holly Gemar-Griffith" confirms being a POC for this vacancy after selecting Yes for being the point of contact for this vacancy
    And User sets an "Open Date" entry as today's date
    And User sets a "Close Date" entry a month from the Open Date
    And User sets "Scoring Due By Date" entry
#    #REVIEW ABOVE STEP WITH BA
    And User verifies "Cover Letter" application document is checked as optional by default
    And " Add More" button is displayed for Application Documents section
    And User can add another application document "Testing Document" by clicking on " Add More"
    And User confirms that "Enable Reference Collection" checkbox is displayed
    And User verifies Full Contact Details for References is set to "3" by default
    And User verifies Full Contact Details for References slider has 16 (Zero - fifteen) options
    And User verifies that Number of Scoring Categories slider is set to "4" by default
    And User verifies Number of Scoring Categories slider has 6 (One - six) options
    And User verifies that all positions are present via Position Classification dropdown
    And User verifies the text of "Position Classification" i tooltip is
    """
    Select the Intramural or Extramural Professional Designation for your vacancy. Select “N/A” for Stadtman positions.
    """
    And User verifies the text of "Organizational Code" i tooltip is
    """
    Provide SAC code for organization where the position will reside.
    """
    And User verifies the text of "Personnel Action Tracking Solution (PATS) Initiator" i tooltip is
    """
    Populate the individual who will be assembling the appointment package within the Personnel Action Tracking Solution (PATS). Value defaults to the SSJ Vacancy Manager, but can be updated within the SSJ or later in PATS.
    """
    Then user selects Position Classification and Organizational Code options
    And user verifies that POC "Holly Gemar-Griffith" is displayed by default for Personnel Action Tracking Solution (PATS) Initiator drop down
    And User clicks "Save" button to save the Basic Vacancy Information
    And User confirms that User is on "Mandatory Statements" section

  @SSJ-69 @juarezds @Regression @playwright @Smoke @SNOW_UPDATED
  Scenario: Verification of Mandatory Statements section while creating an NCI Vacancy
    When User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
    And User navigates to tab "Vacancy Dashboard" - PW
    And User clicks button "+ Create Vacancy" - PW
    And User fills in "Vacancy Title" field with title "Testing Automation Title"
    And User clicks button "Save" - PW
    And User confirms that User is on "Mandatory Statements" section
    And User verifies that "Mandatory Statements" section title is displayed
    And User verifies "What mandatory job statements would you like to include with the posting?" text displayed for Mandatory Statements section
    And User confirms that "Equal Opportunity Employer" statement is disabled by default
    And User verifies the text of "Equal Opportunity Employer" is displayed as
    """
    Selection for this position will be based solely on merit, with no discrimination for non-merit reasons such as race, color, religion, gender, sexual orientation, national origin, political affiliation, marital status, disability, age, or membership or non-membership in an employee organization. The NIH encourages the application and nomination of qualified women, minorities, and individuals with disabilities.
    """
    And User verifies the text "Standards of Conduct/Financial Disclosure" is displayed and description text is
    """
    The National Institutes of Health inspires public confidence in our science by maintaining high ethical principles. NIH employees are subject to Federal government-wide regulations and statutes as well as agency-specific regulations described at the NIH Ethics Website. We encourage you to review this information. The position is subject to a background investigation and requires the incumbent to complete a public financial disclosure report prior to the effective date of the appointment.
    """
    And User verifies the text of Foreign Education "Foreign Education" is displayed as
    """
    Applicants who have completed part or all of their education outside of the U.S. must have their foreign education evaluated by an accredited organization to ensure that the foreign education is equivalent to education received in accredited educational institutions in the United States. We will only accept the completed foreign education evaluation. For more information on foreign education verification, visit the https://www.naces.org website. Verification must be received prior to the effective date of the appointment.
    """
    And User verifies the text of Reasonable Accommodation "Reasonable Accommodation" is displayed as
    """
    NIH provides reasonable accommodations to applicants with disabilities. If you require reasonable accommodation during any part of the application and hiring process, please notify us. The decision on granting reasonable accommodation will be made on a case-by-case basis.
    """
    And User can disable statement options for "Standards of Conduct/Financial Disclosure", "Foreign Education", "Reasonable Accommodation"
    And can enable statement options for "Standards of Conduct/Financial Disclosure", "Foreign Education", "Reasonable Accommodation"
    And User clicks button "Save" - PW
    Then User confirms that User is on "Vacancy Committee" section

  @SSJ-185 @SSJ-306 @juarezds @Regression @playwright @SNOW_UPDATED
  Scenario: Verification of Vacancy Committee section while creating an NCI Vacancy Positive Flow
    When User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
    And User navigates to tab "Vacancy Dashboard" - PW
    And User clicks button "+ Create Vacancy" - PW
    And User fills in "Vacancy Title" field with title "Testing Automation Title"
    And User clicks button "Save" - PW
    And User clicks on "Vacancy Committee" option on the left bar menu
    And User verifies that "Vacancy Committee" section title is displayed
    And User verifies "Add and manage vacancy committee members" text is displayed for Vacancy Committee section
    And User verifies the following Vacancy Committee column headers are displayed "Committee Member", "Role", "Actions"
    And User confirms " Add Member" button is displayed
    When User clicks button " Add Member" - PW
    Then User can see Chair "Chair" role option is displayed by default for Role drop down
    When the user adds a Committee Member "David Rampulla" for Chair role
    When User clicks "Save" for Actions
    Then User can see "At least one committee member must be of the role 'Executive Secretary'" alert
    When User clicks button " Add Member" - PW
    Then User adds Committee Member "Jason Levine" for "Executive Secretary (non-voting)"
    When User clicks "Save" for Actions
    When User clicks button " Add Member" - PW
    Then User adds Committee Member "Henry Rodriguez" for "HR Specialist (non-voting)" - PW
    When User clicks "Save" for Actions
    When User clicks button " Add Member" - PW
    Then User adds Committee Member "Sylvia Chou" for "Member"
    When User clicks "Save" for Actions
    When User clicks button " Add Member" - PW
    Then User adds Committee Member "Michael Lenardo" for "Member (read-only)"
    When User clicks "Save" for Actions
    When User clicks button " Add Member" - PW
    Then User adds Committee Member "Melissa Fajardo" for "EDI Representative (non-voting)"
    When User clicks "Save" for Actions
    And User clicks button "Save" - PW
    Then User is directed to "Email Templates" section

  @SSJ-11 @Regression @playwright @carberalf @SNOW_UPDATED
  Scenario: Verification of Vacancy Committee section while creating an NCI Vacancy Negative Flow
    When User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
    And User navigates to tab "Vacancy Dashboard" - PW
    And User clicks button "+ Create Vacancy" - PW
    And User fills in "Vacancy Title" field with title "Testing Automation Title SSJ"
    And User clicks button "Save" - PW
    And User clicks on "Vacancy Committee" option on the left bar menu
    When User clicks button " Add Member" - PW
    When the user adds a Committee Member "David Rampulla" for Chair role
    When User clicks "Save" for Actions
    Then User can see "At least one committee member must be of the role 'Executive Secretary'" alert
    When User clicks "Remove" for Actions
    Then User can see "At least one committee member must be of the role 'Chair' At least one committee member must be of the role 'Executive Secretary'" alert
    When User clicks button " Add Member" - PW
    Then User adds Committee Member "Jason Levine" for Executive Secretary
    When User clicks "Save" for Actions
    Then User can see "At least one committee member must be of the role 'Chair'" alert
    And User clicks "Remove" for Actions
    When User clicks button " Add Member" - PW
    When the user adds a Committee Member "Bre Harvey" for Chair role
    And User clicks "Save" for Actions
    When User clicks button " Add Member" - PW
    And User adds duplicate Committee Member "Bre Harvey" for Executive Secretary
    And User clicks "Save" for Actions
    Then User can see "A committee member can only be listed once on a committee. Please remove duplicate committee members." alert

  @BUGFIX_APPTRACK-1332 @playwright @Regression @cabreralf
  Scenario: BUG - Vacancy not showing for assigned Exec Secretary in Your Vacancies tab
    When User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
    And User navigates to tab "Vacancy Dashboard" - PW
    And User clicks button "+ Create Vacancy" - PW
    And enters Vacancy Title name "Testing Automation Title SSJ-1332" - PW
    And enters Vacancy Description "THIS IS A TEST AUTOMATION TEST" - PW
    And selects "Yes" for point of contact - PW
    And User sets an "Open Date" entry as today's date
    And User sets a "Close Date" entry a month from the Open Date
    And selects "0" for Full Contact Details for References
    And User verifies that Number of Scoring Categories slider is set to "4" by default
    And selects "4" for Number of Scoring Categories
    And User verifies that Number of Scoring Categories slider is set to "4" by default
    And selects "Research Fellow" for Position Classification drop down
    And selects "HNC" for Organizational Code drop down
    And User clicks button "Save" - PW
    And User clicks on "Vacancy Committee" option on the left bar menu
    When User clicks button " Add Member" - PW
    When the user adds a Committee Member "David Rampulla" for Chair role
    When User clicks "Save" for Actions
    When User clicks button " Add Member" - PW
    Then User adds Committee Member "Holly Gemar-Griffith" for Executive Secretary
    When User clicks "Save" for Actions
    And User clicks button "Save" - PW
    Then User is directed to "Email Templates" section
    And User clicks button "Save" - PW
    And clicks "Save and Finalize"
    And clicks "OK"
    And clicks "Close"
    And User navigates to tab "Your Vacancies" - PW
    And verifies Vacancy Title "Testing Automation Title SSJ-1332" is on the Your Vacancies page

  @APPTRACK-151 @cabreralf @playwright @IN-PROGRESS
  Scenario: Live vacancies View verification
#    Given User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
#    And User navigates to tab "Vacancy Dashboard" - PW
#    When User clicks on the "live vacancies" tab
#    Then User can see the filters "All","Live","Extended"
#    And User can verify All is by default selected
#    And User can verify that All subfilter displays vacancies in the open state
#    And User can verify that vacancies with subfilter All are by default sorted by number of applicants in ascending order
#    And User can verify that Live subfilter displays vacancies in the open state
#    And User can verify that vacancies with subfilter Live are by default sorted by number of applicants in ascending order
#    And User can verify the table columns are displayed as "Vacancy Title","Applicants","Open Date","Close Date","Actions"

    When User is on SSJ Landing page and user is "OWM Vacancy Manager" - PW
    And clicks on "Vacancy Dashboard" - PW
    And clicks on "+ Create Vacancy" - PW
    And enters Vacancy Title name "DIEGO TEST" - PW
    And enters Vacancy Description "THIS IS A TEST AUTOMATION TEST" - PW
    And User checks "Utilizing a Set Close Date" option
    And selects "Yes" for point of contact - PW
    And User sets an "Open Date" entry as today's date
    And User sets a "Close Date" entry a month from the Open Date
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

#    And User can edit a vacancy
#    And User can copy link of a vacancy
#    And User can extend a vacancy
#    And User can sort vacancies by Applicants in ascending order
#    And User can sort vacancies by Open Date in descending order
#    And User can sort vacancies by Close Date in ascending order

  @SSJ-310 @SSJ-158 @SSJ-71 @playwright
  Scenario: Verification of Email Templates section while creating an NCI Vacancy Positive Flow
    Given User is on SSJ Landing page and user is "OWM Vacancy Manager"
    And User navigates to tab "Vacancy Dashboard"
    And User clicks button "Create vacancy"
    And User fills in "Vacancy Title" field
    And User clicks "Save" section button
    And User verifies that "Mandatory Statements" section title is displayed
    And User clicks "Save" section button
    And User verifies that "Vacancy Committee"  section title is displayed
    And User clicks "Save" section button
    And User verifies that "Email Templates"  section title is displayed
    And User confirms that "Application saved" and "Application submitted confirmation" templates are enabled by default
    And User can disable "Application saved" and "Application submitted confirmation" templates choice
    And User verifies the text of "Application saved" template
    And User verifies the tect of "Application submitted confirmation" template
    And User clicks "Save" section button
    And User verifies that "Review and Finalize" section title is displayed

  @SSJ-64 @SSJ-305 @playwright
  Scenario: Alerts validation during an NCI vacancy creation
    Given User is on SSJ Landing page and user is "OWM Vacancy Manager"
    And User navigates to tab "Vacancy Dashboard"
    And User clicks button "Create vacancy"
    And User clicks "Save" section button
    Then User sees "A vacancy title is required." alert toast message
    And User fills in "Vacancy Title" field
    And User clicks "Save" section button
    And User verifies that "Mandatory Statements" section title is displayed
    And User clicks "Save" section button
    And User verifies that "Vacancy Committee"  section title is displayed
    And User clicks "Save" section button
    And User verifies that "Email Templates"  section title is displayed
    And User clicks "Save" section button
    And User verifies that "Review and Finalize" section title is displayed
    Then User confirms alerts are displayed for the following fields
      | Vacancy Description | Vacancy Point of Contact Information | Open Date | Organizational Code | Position Classification |
    When User clicks "Save and Finalize" button
    Then Use sees an alert "Sorry, we can't submit just yet. The sections below in red have fields that require a different selection or a selection must be made.We've highlighted those fields in red. Please return to those sections and address the highlights, then return here and click 'Save and Finalize' again."
    And User clicks Edit for "Basic Vacancy Information" section
    And User sees "Please enter a description." alert for Vacancy Description fields
    And User sees "Please select an open date" alert for Open Date entry
    And User sees "Please make a selection" for Position Classification field
    And User sees "Please make a selection" for Organizational Code field
    And User clicks on Review and Finalize left menu option
    And User clicks Edit for "Vacancy Committee" section
    Then User can verify alert "At least one committee member must be of the role 'Chair' At least one committee member must be of the role 'Executive Secretary'" is present

  @SSJ-221 @SSJ-100 @playwright
  Scenario: Create a live NCI draft vacancy
    Given User is on SSJ Landing page and user is "OWM Vacancy Manager"
    And User navigates to tab "Vacancy Dashboard"
    And User clicks button "Create vacancy"
    And User fills in "Vacancy Title" field
    And User fills in "Vacancy Description" field
    And User selects "Yes" for  as Are you the point of contact for this vacancy? choice
    And User fills in Open Date
    And User selects Position Classification option
    And User selects Organizational Code option
    And User verifies that Personnel Action Tracking Solution (PATS) Initiator is Susan Greenhouse
    And User clicks "Save" section button
    And User verifies that "Mandatory Statements" section title is displayed
    And User clicks "Save" section button
    And User verifies that "Vacancy Committee"  section title is displayed
    And User adds a Committee Chair
    And User adds Executive Secretary (non-voting)
    And User verifies that "Email Templates"  section title is displayed
    And User clicks "Save" section button
    When User clicks "Save and Finalize" button
    And User can see a new live vacancy on a Vacancy Dashboard under Live Vacancies
    When User navigates to Home tab
    Then User can see a new live vacancy under Open Vacancies

  @SSJ-1 @SSJ-29 @SSJ-66 @SSJ-62 @playwright
  Scenario: Vacancy Dashboard verification
    Given User is on SSJ Landing page and user is "OWM Vacancy Manager"
    And User navigates to tab "Vacancy Dashboard"
    Then User confirms Create Vacancy button is displayed
    And User sees vacancy types set up as the folllowing options
      | Pre-flight vacancies | Live vacancies | Closed vacancies |
    When User is on pre-flight vacancies
    Then User sees the following pre-flight vacancies filters
      | All | Draft | Finalized |
    And User sees pre-flight vacancies colums
      | Vacancy Titlle | Open Date | Close Date | Actions |
    When User is on live vacancies
    Then User sees the following live vacancies filters
      | All | Live | Extended |
    And User sees live vacancies colums
      | Vacancy Title | Open Date | Close Date | Actions |
    When User is on closed vacancies
    Then User sees the following closed vacancies filters
      | AlL | Triage | Individual | ScoringCommittee | ReviewVoting | Complete |
    And User sees closed vacancies colums
      | Vacancy Title | Open Date | Close Date | Actions |

  @SSJ-160 @SSJ-284 @playwright
  Scenario: NCI Live Vacancy Edit, Copy Link and Extend options
    Given User is on SSJ Landing page and user is "OWM Vacancy Manager"
    And User navigates to tab "Vacancy Dashboard"
    And User has created a  live vacancy
    Then User confirms the following action choices are present for a live vacancy
      | Edit | Copy Link | Extend |
    When User clicks Edit
    Then User is on Edit Vacancy modal
    And User edits vacancy title field
    And User clicks "Save" section button
    And User navigates to tab "Vacancy Dashboard"
    And User clicks Copy Link option
    Then User can verify alert toast message "Vacancy link copied to clipboard" appears
    When User opens a new web page
    Then User can paste the copied link
    And User verifies  that User is landed on that vacancy the Vacancy Details view
    And User closes the opened  new web page
    When User clicks Extend
    Then User sees Extend Vacancy modal appear
    And User sets a date
    And User clicks Confirm
    Then User can verify the updated close date
    And User navigates to Home tab
    Then User can verify the updated close date on Home Tab for that live vacancy

  @SSJ-93 @SSJ-146 @playwright
  Scenario: Vacancies sorting
    Given User is on SSJ Landing page and user is "OWM Vacancy Manager"
    And User navigates to tab "Vacancy Dashboard"
    When User is on pre-flight vacancies
    And User sees that default sorting setting is by pre-flight  All
    And User can sort by pre-flight Draft
    And User can sort by pre-flight Finalized
    When User is on live vacancies
    And User sees that default sorting setting is by live All
    And User can sort by live Live
    And User can sort by live Extended
    When User is on closed vacancies
    And User sees that default sorting setting is by closed All
    And User can sort by Closed Triage
    And User can sort by Closed Individual Scoring
    And User can sort by Closed Committee Review
    And User can sort by Closed Voting Complete

#APPTRACK-384
#APPTRACK-386
#APPTRACK-260
#APPTRACK-382
#APPTRACK-268
#APPTRACK-388
#APPTRACK-829
#APPTRACK-828
#APPTRACK-948
#APPTRACK-374
#APPTRACK-376
#APPTRACK-490
#APPTRACK-257
#APPTRACK-377
#APPTRACK-1004
#APPTRACK-120
#APPTRACK-244
#APPTRACK-245
#APPTRACK-366
#APPTRACK-369
#APPTRACK-368
#APPTRACK-489
#APPTRACK-808
#APPTRACK-1131
#APPTRACK-1134
#APPTRACK-1136
#APPTRACK-352
#APPTRACK-473
#APPTRACK-912
#APPTRACK-356
#APPTRACK-357
#APPTRACK-1105
#APPTRACK-101
#APPTRACK-222
#APPTRACK-460
#APPTRACK-228
#APPTRACK-348
#APPTRACK-229
#APPTRACK-103
#APPTRACK-224
#APPTRACK-102
#APPTRACK-223
#APPTRACK-347
#APPTRACK-225
#APPTRACK-588
#APPTRACK-903
#APPTRACK-452
#APPTRACK-459
#APPTRACK-576
#APPTRACK-578
#APPTRACK-577
#APPTRACK-91
#APPTRACK-93
#APPTRACK-94
#APPTRACK-440
#APPTRACK-562
#APPTRACK-443
#APPTRACK-88