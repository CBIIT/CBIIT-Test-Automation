Feature: Direct Submitter

  @DirectSubmitterPublication @Jira1079 @DirectSubmitterRegression
  Scenario: TC01 Creating a CR Publication type as requester being a submitter
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    Then User can verify that Program Director was added as a Scheduled Reviewer
    And User puts no for High Profile section
    Then User can verify that Program Director was removed
    And User confirms again that paper is High profile
    And User adds added additional reviewers ahead of the default reviewers
    And User lists authors for submisison
    Then User submits data for review
    Then User can verify that their request is under My Pending Publications subtab
    And User selects to view the submitted request
    And User can verify scheduled reviewer CHRISTIAN ABNET as Branch Chief
    And User can verify scheduled reviewer GARCIA-CLOSAS, MONTSERRAT as Program Director
    And User can verify scheduled reviewer STEPHEN CHANOCK as Division Director
    And User withdraws the request

  @DirectSubmitterPresentation @Jira1078 @DirectSubmitterRegression
  Scenario: TC02 Creating a CR Presentation type as requester being a submitter
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "New"
    And User fills in Abstract field
    And User picks Submission Type as Presentation
    And User selects presentation type as Meeting Abstract
    And User inputs Meeting Name as "demo test"
    And User inputs Meeting Location as "Rockville, MD"
    And User inputs Meeting Date as "12/15/2022"
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User confirms Laboratory Resources question
    And User picks MDPL/Somatic Analysis as Lab results option
    And User uploads a Review Material as Abstract
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review
    Then User can verify that their request is under My Pending Publications subtab
    And User selects to view the submitted request
    And User can verify scheduled reviewer CHRISTIAN ABNET as Branch Chief
    And User can verify scheduled reviewer GARCIA-CLOSAS, MONTSERRAT as Program Director
    And User can verify scheduled reviewer STEPHEN CHANOCK as Division Director
    And User deletes the request

  @ResetScenarioCreateRequest1 @DirectSubmitterRegression
  Scenario: TC03 Direct Submitter Create request then Branch Chief returns for revision and disapproves
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review
    Then Swtich user to "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses no for conflict of interest question
    Then User chooses to return for revision
    And User enters comments
    And User clicks Process Action button
    And "ALBANES_DEMETRIUS" revises the CR under Active Submissions tab
    Then User submits data for review
    Then "CHRISTIAN_ABNET" dissaproves that CR
    Then User can verify the request was dissaproved

  @BranchChiefRevisionDisapproval @Jira1089 @DirectSubmitterRegression
  Scenario: TC04 Direct Submitter.Branch Chief returns for revision and disapproves
    Given User logs in as "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses no for conflict of interest question
    Then User chooses to return for revision
    And User enters comments
    And User clicks Process Action button
    And "ALBANES_DEMETRIUS" revises the CR under Active Submissions tab
    Then User submits data for review
    Then "CHRISTIAN_ABNET" dissaproves that CR
    Then User can verify the request was dissaproved

  @ResetScenarioCreateRequest2 @DirectSubmitterRegression
  Scenario: TC05 Create request
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review

  @BranchChiefchoosesYesConflictInterest @Jira1136 @DirectSubmitterRegression
  Scenario: TC06 Direct Submitter.Branch Chief chooses yes for conflict for revision and removes a current reviewer
    Given User logs in as "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses yes for conflict of interest question
    Then User chooses to remove current reviewer
    Then User can verify that CHRISTIAN ABNET was removed from the list of reviewers

  @ResetScenarioCreateRequest3 @DirectSubmitterRegression
  Scenario: TC07 Create request
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review

  @BranchAdminRemovesPrDirector @Jira1132 @DirectSubmitterRegression
  Scenario: TC08 Branch Chief overrides the High Profile flag from 'Yes' to 'No'
    Given User logs in as "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses no for conflict of interest question
    And User puts no for High Profile paper
    Then User can confirm that program director is removed form reviewers
    Then User chooses to return for revision
    And User enters comments
    And User clicks Process Action button
    And "ALBANES_DEMETRIUS" revises the CR under Active Submissions tab
    Then User submits data for review
    Then "CHRISTIAN_ABNET" dissaproves that CR
    And User can verify the request was dissaproved

  @ResetScenario_CreateRequest4 @DirectSubmitterRegression
  Scenario: TC09 Create request
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review

  @BranchChiefApprovesBranchChiefApprovesDivisionDirectorApproves @Jira1090 @DirectSubmitterRegression
  Scenario: TC10 Direct Submitter.Branch Chief approves.Branch Chief approves. Division Director approves. Program Director approves
    Given User logs in as "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses no for conflict of interest question
    And User chooses to approve
    And GARCIA-CLOSAS, MONTSERRAT can view the new CR under My Pending Reviews
    And User chooses no for conflict of interest question
    And User chooses to approve
    And "STEPHEN_CHANOCK" can view the CR under My Pending Reviews tab
    And User chooses no for conflict of interest question
    And User approves the CR
    Then User can verify that the CR has status as Approved for Dissemination

  @ResetScenarioCreateRequest5 @DirectSubmitterRegression
  Scenario: TC11 Create request
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review

  @BranchChiefReassignsDivisionDirectorApproves @Jira1091 @DirectSubmitterRegression
  Scenario: TC12 Direct Submitter. Branch Chief reassigns CR. Division Director approves CR
    Given User logs in as "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses no for conflict of interest question
    And User chooses to reassign the CR to Amanda Black
    And Amanda Black can verify that the previous reviewer was Christian Abnett
    And User chooses no for conflict of interest question
    And User chooses to approve
    And "STEPHEN_CHANOCK" can view the CR under My Pending Reviews tab
    And User chooses no for conflict of interest question
    And User approves the CR
    Then User can verify that the CR has status as Approved for Dissemination

  @ResetScenarioCreateRequest6 @DirectSubmitterRegression
  Scenario: TC13 Create request
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review

  @BranchChiefRemovesCurrentReviewerDivisionDirectorApproves @Jira1092 @DirectSubmitterRegression
  Scenario: TC14 Direct Submitter. Branch Chief removes current reviewer. Division Director approves
    Given User logs in as "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses no for conflict of interest question
    When User removes current reviewer
    Then User can verify that CHRISTIAN ABNET has been removed from the list of reviewers
    And "STEPHEN_CHANOCK" can view the CR under My Pending Reviews tab
    And User chooses no for conflict of interest question
    And User approves the CR
    Then User can verify that the CR has status as Approved for Dissemination

  @ResetScenarioCreateRequest7 @DirectSubmitterRegression
  Scenario: TC15 Create request
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review

  @BranchChiefApprovesDivisionDirectoReturnsForRevision @Jira1097 @DirectSubmitterRegression
  Scenario: TC16 Direct Submitter.Branch Chief approves.Program Director returns for revision
    Given User logs in as "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses no for conflict of interest question
    And User chooses to approve
    And User clicks Process Action
    And "MONTSERRAT_GARCIA-CLOSAS" can view the CR under My Pending Reviews tab
    And User chooses no for conflict of interest question
    And Program Director chooses to return for revision
    Then User can verify that the request was returned back to Albanes Demetrius for revision

  @ResetScenarioCreateRequest8 @DirectSubmitterRegression
  Scenario: TC17 Create request
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review

  @BranchChiefApprovesDivisionDirectorDissaproves @Jira1098 @DirectSubmitterRegression
  Scenario: TC18 Direct Submitter. Branch Chief approves.Division Director dissaproves
    Given User logs in as "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses no for conflict of interest question
    And User chooses to approve
    And User clicks Process Action
    And "MONTSERRAT_GARCIA-CLOSAS" can view the CR under My Pending Reviews tab
    And User chooses no for conflict of interest question
    And User chooses to approve
    And User clicks Process Action
    When Division director chooses to dissaprove
    Then User can confirm that the CR was terminated

  @ResetScenarioCreateRequest9 @DirectSubmitterRegression
  Scenario: TC19 Create request
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review

  @BranchChiefApprovesDivisionDirectoRefers @Jira1099 @DirectSubmitterRegression
  Scenario: TC20 Direct Submitter.Branch Chief approves.Program Director approves. Division Director refers to a different approver
    Given User logs in as "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses no for conflict of interest question
    And User chooses to approve
    And User clicks Process Action
    And GARCIA-CLOSAS, MONTSERRAT can view the new CR under My Pending Reviews
    And User chooses no for conflict of interest question
    And User chooses to approve
    And User clicks Process Action
    And "STEPHEN_CHANOCK" can view the CR under My Pending Reviews tab
    And User chooses no for conflict of interest question
    And Divsion Director chooses to refer to Amanda Black
    And AMANDA BLACK chooses to view the submitted CR for the review
    And User chooses no for conflict of interest question
    And AMANDA BLACK dissaapproves the CR

  @ResetScenarioCreateRequest10 @DirectSubmitterRegression
  Scenario: TC21 Create request
    Given User logged in as "ALBANES_DEMETRIUS"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "Test submission title"
    And User fills in Abstract field
    And User picks Submission Type as Publication
    And User selects publication type from  Publication Type dropdown
    And User inputs Journal or Book Name as "JNCI"
    And User confirms NIH Rights, PMC
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User submits a Review Material as Manuscript
    And User submits a Review Material as Data Sharing Plan Publication
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User denies that the paper is High Profile
    And User lists authors for submisison
    Then User submits data for review

  @BranchChiefApprovesDivisionDirectorApproves @Jira1104 @DirectSubmitterRegression
  Scenario: TC22 Direct Submitter. Branch Chief approves. Division Director approves
    Given User logs in as "CHRISTIAN_ABNET"
    And User views the CR that requires their review
    And User chooses no for conflict of interest question
    And User chooses to approve
    And User clicks Process Action
    And "STEPHEN_CHANOCK" can view the CR under My Pending Reviews tab
    And User chooses no for conflict of interest question
    Then User approves the CR
