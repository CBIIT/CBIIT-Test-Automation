Feature: Submitter on behalf of Requester Flow

  @RequesterAsSubmitterPublicationPending @Jira1080 @Needs_review
  Scenario: TC01 Creating a clearance request on behalf as requester by being a submitter with submission type of Publication
    Given User logged in as "PATRICIA_MADIGAN"
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
    Then User submits for verification

  @RequesterAsSubmitterPresentationPending @Jira1081 @Needs_review
  Scenario: TC02 Submitter for Requestor.Creating a CR Presentation type
    Given User logged in as "PATRICIA_MADIGAN"
    When User is on Clearance Request tab
    And User clicks on Create Clearance Request
    And the request type is Research Program
    And User chooses from dropdown CAS ID option General Program Administration
    And User adds a requester as ALBANES, DEMETRIUS
    And User inputs Submission Title as "test title"
    And User fills in Abstract field
    And User picks Submission Type as Presentation
    And User selects presentation type as Meeting Abstract
    And User inputs Meeting Name as "demo test"
    And User inputs Meeting Location as "Rockville, MD"
    And User inputs Meeting Date as "05/15/2022"
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User denies Laboratory Resources question
    And User uploads a Review Material as Abstract
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits for verification
