Feature: Create OA Intake form
  Description: This feature file contains scenarios relating to OA Intake form

  @selenium @Alena @Regression @OAIntake-576 @OAIntake-544 @OAIntake-575 @OAIntake-499 @OAIntake-657 @OAIntake-430 @OAIntake-408 @OAIntake-623 @Alena
  Scenario: Create OA Intake form
    Given Submitter User logged in to OA Intake Portal
    When Submitter User clicks on New Request button
    Then Submitter User can verify that they are on an OA Intake Request page
    And Submitter User can verify Requestor (Requested for) Queue working hyperlink
    And Submitter User can verify that clicking on User Guide link redirects User to a new User Guide tab
    And Submitter User confirms that Status is "Draft" by default
    And Submitter User fills in Request Title field as "OA Intake Request"
    And Submitter User fills in Request Description field as "Request Description"
    And Submitter User fills in Requested Award Date as "12/05/2025"
    When Submitter User picks NAICS Code Status option as known
    Then Submitter User can fill in a NAICS Code Number field as "12345"
    When Submitter User chooses New or Re-compete Contract option as Re-compete
    Then Submitter User can see Previous Contract Number and Previous Buyer fields appear
    When Submitter User chooses option External Call Task Orders (TOs)(NITAAC, GSA) from Recommended Contract Mechanism dropdown
    Then Submitter User can see alert message "Task Order Acquisition Plans (TOAPs) are required for both Internal and External Call/ Order submissions."
    When Submitter User chooses option Internal NCI Call Task Order on a BPA IDIQ from Recommended Contract Mechanism dropdown
    Then Submitter User can see alert message "Task Order Acquisition Plans (TOAPs) are required for both Internal and External Call/ Order submissions."
    And Submitter User chooses R&D Support as Yes
    Then Submitter User can fill in a field Date Concept Peer Review Completed as "11/05/2025"
    When Submitter User chooses PSC Code Status as known
    Then Submitter User can fill in PSC Code field as "1234"
    And Submitter User chooses FITARA Business Case Clearances as No
    Then Submitter User can enter "100000" for Please enter the estimated value of IT and biomedical computing requirement
    When Submitter User chooses Yes for ISSO Clearance field
    Then Submitter User can enter "12345" for SSO Clearance Ticket field
    When Submitter User clicks Submit Request button
    Then Submitter User can verify a submission confirmation modal OA Intake form appears
    And Submitter User chooses to submit a request
    Then Submitter User can confirm they are redirected to Requestor (Requested For) Queue for Negotiated Contracts page

  @selenium @Alena @Regression @OAIntake-8 @OAIntake-417 @OAIntake-425 @OAIntake-426 @OAIntake-439 @OAIntake-260 @OAIntake-261 @OAIntake-263
  Scenario: OA Intake Home Page tabs and options for various roles
    Given Leadership User logged in to OA Intake Portal
    Then User can verify the Home page header
    And User can verify Home page header text
    And User can verify text for Important info part
    And User can verify "New Request" tab is displayed
    And User can verify "CO/CS Queue" tab is displayed
    And User can verify "Requestor(Requested For) Queue" tab is displayed
    And User can verify "Management Dashboard" tab is displayed
    And User can verify "Leadership Queue(Pending Action)" tab is displayed
    When User clicks on Menu dropdown
    Then Leadership User can verify the menu options displayed
    When User clicks on Instructions
    Then User can verify they are redirected to Instructions page
    When User clicks on their username
    Then User can see menu options as Profile and Log Out
    And User clicks on New Request tab
    When User clicks on  OA Intake Home button
    Then User can verify they are redirected to Home Page
    And User logs out of OA Intake application
    Given Submitter User logged in to OA Intake Portal
    Then User can verify the Home page header
    And User can verify Home page header text
    And User can verify text for Important info part
    And User can verify "New Request" tab is displayed
    And User can verify "Requestor(Requested For) Queue" tab is displayed
    When User clicks on Menu dropdown
    Then Submitter User can verify the menu options displayed
    When User clicks on Instructions
    Then User can verify they are redirected to Instructions page
    When User clicks on their username
    Then User can see menu options as Profile and Log Out
    And User clicks on New Request tab
    When User clicks on  OA Intake Home button
    Then User can verify they are redirected to Home Page
    And User logs out of OA Intake application
