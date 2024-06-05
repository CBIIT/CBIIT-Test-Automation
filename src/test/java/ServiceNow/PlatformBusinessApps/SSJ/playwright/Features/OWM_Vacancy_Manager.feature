Feature: OWM Vacancy Manager Scenarios
  Description: This Feature file contains OWM Vacancy Manager Scenarios

  @SSJ-7 @SSJ-8 @juarezds @Regression @playwright
  Scenario: Verification of Basic Vacancy Information section while creating an NCI Vacancy
    When User is on SCSS Landing page and user is "OWM Vacancy Manager" - PW
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
    And  User verifies all org codes are present via Organizational Code dropdown
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

  @SSJ-69 @juarezds @Regression @playwright @Progression
  Scenario: Verification of Mandatory Statements section while creating an NCI Vacancy
    When User is on SCSS Landing page and user is "OWM Vacancy Manager" - PW
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

  @SSJ-185 @SSJ-306 @juarezds @Regression @playwright
  Scenario: Verification of Vacancy Committee section while creating an NCI Vacancy Positive Flow
    When User is on SCSS Landing page and user is "OWM Vacancy Manager" - PW
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

  @SSJ-11 @Regression @playwright @carberalf
  Scenario: Verification of Vacancy Committee section while creating an NCI Vacancy Negative Flow
    When User is on SCSS Landing page and user is "OWM Vacancy Manager" - PW
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
    When the user adds a Committee Member "Jay Kurani" for Chair role
    And User clicks "Save" for Actions
    When User clicks button " Add Member" - PW
    And User adds duplicate Committee Member "Jay Kurani" for Executive Secretary
    And User clicks "Save" for Actions
    Then User can see "A committee member can only be listed once on a committee. Please remove duplicate committee members." alert

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