Feature: Create OA Intake form
  Description: This feature file contains scenarios relating to OA Intake form

  @selenium@Alena @Regression @OAIntake-708 @OAIntake-640 @OAIntake-639 @OAIntake-709 @OAIntake-538 @OAIntake-682 @OAIntake-576 @OAIntake-544 @OAIntake-575 @OAIntake-499 @OAIntake-657 @OAIntake-430 @OAIntake-408 @OAIntake-623 @Alena
  Scenario: Create OA Intake form and give approvals till Accepted Status
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
    And User logs out of OA Intake application
    Given Leadership User logged in to OA Intake Portal
    And User clicks on Leadership Queue tab
    And User picks recently submitted OA Intake request
    And User adds Team Lead as "Carrie Mills"
    And User adds Contracting Officer as "Andy May"
    When User clicks Send To Branch button
    Then User can verify confirmation modal This request has been successfully assigned to Branch Review appears
    And User picks recently submitted OA Intake request
    When User clicks Send To CO CS button
    Then User can verify confirmation modal This request has been successfully assigned to CO CS review
    And User logs out of OA Intake application
    Given User logs in as Contracting Officer to OA Intake Portal
    And User clicks on CO CS Queue tab
    And User picks recently submitted OA Intake request
    And User clicks Accept Submission
    And User picks recently accepted OA Intake request
    Then User can verify the status of the request is Accepted
    And User logs out of OA Intake application

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

  @selenium @Alena @Regression @OAIntake-332 @OAIntake-670 @OAIntake-669
  Scenario: Requestor (Requested For) Queue for Negotiated Contracts
    Given Leadership User logged in to OA Intake Portal
    And User clicks on Requestor (Requested For) Queue tab
    And User can verify page header as "Requestor (Requested For) Queue for Negotiated Contracts "
    And User can see New Request button
    And User can see Contact Support button
    And User can verify Purchasing Online Tracking System (POTS) hyperlink is displayed
    When User clicks Purchasing Online Tracking System (POTS) hyperlink
    Then User is redirected to authentication page
    And User can verify FFRDC Contract Administration System (FCAS) hyperlink is displayed
    And User can verify that OA Intakes are pre-filtered for a logged in Leadership User
    And User can verify that Request ID column can be sorted in descending and ascending order
    And User can verify that Status column can be sorted in descending and ascending order
    And User can verify that Request Title column can be sorted in descending and ascending order
    And User can verify that Requestor (Requested For) column can be sorted in descending and ascending order
    And User can verify that Submitter column can be sorted in descending and ascending order
    And User can verify that Created On column can be sorted in descending and ascending order
    And User can verify that Status Date column can be sorted in descending and ascending order
    And User logs out of OA Intake application

  @selenium @Alena @Regression @OAIntake-657 @OAIntake-640 @OAIntake-700 @OAIntake-708
  Scenario: Contracting Officer/Contract Specialist Queue
    Given Leadership User logged in to OA Intake Portal
    And User clicks on CO CS Queue tab
    And User can verify page header is "Contracting Officer/Contract Specialist Queue"
    And User can see OA Intakes - Assigned section
    When User clicks on OA Intakes - Assigned menu
    Then User can see the following options for OA Intakes - Assigned requests
      | option1       | option2         | option3       |
      | Export as PDF | Export as Excel | Export as CSV |
    And User can see OA Intakes - Assigned filter is preset with assigned requests
    And User can remove filters for OA Intakes - Assigned requests
    And User can see OA Intakes - Accepted section
    When User clicks on OA Intakes - Accepted menu
    Then User can see the following options for OA Intakes - Accepted requests
      | option1       | option2         | option3       |
      | Export as PDF | Export as Excel | Export as CSV |
    And User can see OA Intakes - Accepted filter is preset with accepted requests
    And User can remove filters for OA Intakes - Accepted requests
    And User can see OA Intakes - Cancelled section
    When User clicks on OA Intakes - Cancelled menu
    Then User can see the following options for OA Intakes - Cancelled requests
      | option1       | option2         | option3       |
      | Export as PDF | Export as Excel | Export as CSV |
    And User can see OA Intakes - Cancelled filter is preset with cancelled requests
    And User can remove filters for OA Intakes - Cancelled requests
    And User logs out of OA Intake application

  @selenium @Alena @Regression @OAIntake-650 @OAIntake-606
  Scenario: Leadership Queue (Pending Action)
    Given Leadership User logged in to OA Intake Portal
    And User clicks on Leadership Queue tab
    And User can verify page header is "Leadership Queue (Pending Action)"
    When User clicks on OA Intake Leadership Queue menu
    Then User can see the following options for OA Intake Leadership Queue menu
      | option1       | option2         | option3       |
      | Export as PDF | Export as Excel | Export as CSV |
    And User can see OA Intakes filter is preset with submitted requests
    And User can verify that Leadership Queue Request ID column can be sorted in descending and ascending order
    And User can verify that Leadership Queue Status column can be sorted in descending and ascending order
    And User can verify that Leadership Queue Branch column can be sorted in descending and ascending order
    And User can verify that Leadership Queue Request Title column can be sorted in descending and ascending order
    And User can verify that Leadership Queue Requestor (Requested For) column can be sorted in descending and ascending order
    And User can verify that Leadership Queue Estimated Amount column can be sorted in descending and ascending order
    And User can verify that Leadership Queue Recommended Contract Mechanism column can be sorted in descending and ascending order
    And User can verify that Leadership Queue Requested Award Date column can be sorted in descending and ascending order
    And User can verify that Leadership Queue Submitter column can be sorted in descending and ascending order
    And User can verify that Leadership Queue Status Date column can be sorted in descending and ascending order
    And User can verify that Leadership Queue Created On column can be sorted in descending and ascending order
    And User logs out of OA Intake application