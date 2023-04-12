Feature: Admin Flow

  #end to end CR Publication type creation
  @AdminPublicationPending @Jira1119 @regressionAdmin
  Scenario: TC01 Admin creating a CR Publication type on behalf of a requester
    Given User logged in as "GEOFFREY_TOBIAS"
    And User can verify that Researcher ID tab is present
    And User can verify that Administration tab is present
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
    Then User can verify that their request is under My Pending Publications subtab
    And User selects to view the submitted request
    And User can verify scheduled reviewer CHRISTIAN ABNET as Branch Chief
    And User can verify scheduled reviewer GARCIA-CLOSAS, MONTSERRAT as Program Director
    And User can verify scheduled reviewer STEPHEN CHANOCK as Division Director
    And User deletes the request

  #end to end CR Presentation type creation
  @AdminPresentationPending @Jira1093 @regressionAdmin
  Scenario: TC02 Admin creating a CR Presentation type on behalf of a requester
    Given User logged in as "GEOFFREY_TOBIAS"
    And User can verify that Researcher ID tab is present
    And User can verify that Administration tab is present
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
    And User inputs Meeting Date as "12/15/2022"
    And User confirms the Publisher Credibility question
    And User confirms Genomic Data Generation question
    And User puts no for  Laboratory Resources question
    And User submits a Review Material as Data Sharing Plan Presentation
    And User marks Patent/Invention as Employee Invention Report filed
    And User denies Select Agents question
    And User confirms Helix Biowulf question
    And User confirms using Clinical Center's BTRIS system
    And User denies dual use
    And User confirms that the paper is High Profile
    And User lists authors for submisison
    Then User submits for verification
    Then User can verify that their request is under My Pending Publications subtab
    And User selects to view the submitted request
    And User can verify scheduled reviewer CHRISTIAN ABNET as Branch Chief
    And User can verify scheduled reviewer GARCIA-CLOSAS, MONTSERRAT as Program Director
    And User can verify scheduled reviewer STEPHEN CHANOCK as Division Director
    And User deletes the request

  @AdminViewCR @Jira1106 @regressionAdmin
  Scenario: TC03 Admin. Can view Clearance Requests across DCEG
    Given User logged in as "GEOFFREY_TOBIAS"
    And User is on Clearance Requests tab
    And User navigates to CR Search subtab
    When User clicks Search
    Then User can verify that User can view any request

  @AdminViewPublications @Jira1103 @regressionAdmin
  Scenario: TC04 Admin. Can view Publications across DCEG
    Given User logged in as "GEOFFREY_TOBIAS"
    And User is on Publications tab
    And User navigates to Publications Search subtab
    When User clicks Search button
    Then User can verify that User can view any publication across DCEG

  @ResearcherIDSearch @Jira1096 @correct @regressionAdmin
  Scenario Outline: <TC> Researcher ID Search by "<users>" and validate Create a researcher ID option is available
    Given User logged one of the following "<users>"
    And User can verify that Researcher ID tab is present
    And User navigates to Reseacher ID tab
    When User applies organization search as OFFICE OF THE DIRECTOR
    Then User can see only OFFICE OF THE DIRECTOR related profiles
    When User applies organization search as TRANS-DIVISIONAL RESEARCH PROGRAM
    Then User can see only TRANS-DIVISIONAL RESEARCH PROGRAM related profiles
    When User inputs Researcher's last name as Abnet
    Then User can see the targeted person
    When User performs a wide search
    Then User can verify that the data returned contains all authorized DCEGCS users and their corresponding available Researcher ID's
    Then Swtich user to "ALBANES_DEMETRIUS"
    Then User will see create a researcher id option

    Examples: 
      | users             | TC |
      | Admin             |TC05|
      | Branch chief      |TC06|
      | Division director |TC07|
      | Program director  |TC08|

  @AdminCanEditPublicationsAcrossDCEG @Jira1095 @regressionAdmin
  Scenario: TC09 Admin. Can edit Publications across DCEG
    Given User logged in as "GEOFFREY_TOBIAS"
    And User is on Publications tab
    And User navigates to Publications Search subtab
    When User picks Publication Status as Pending Submission
    And User clicks Search button
    Then User can verify that publications in Pending Submission status are editable
    When User picks Publication Status as Submitted for Publication
    And User clicks Search button
    Then User can verify that publications in Submitted for Publication status are editable
    When User picks Publication Status as Accepted for Publication/In Press
    And User clicks Search button
    Then User can verify that publications in Accepted for Publication/In Press status are editable
    When User picks Publication Status as E-Published (ahead of print)
    And User clicks Search button
    Then User can verify that publications in E-Published (ahead of print) status are editable
    When User picks Publication Status as Published
    And User clicks Search button
    Then User can verify that publications in Published status are editable
    When User picks Publication Status as Not Published/Abandoned
    And User clicks Search button
    Then User can verify that publications status can be reset to Published

  @AdminCanEditClearanceRequestsAcrossDCEG @Jira1094 @regressionAdmin
  Scenario: TC10 Admin. Can edit Clearance Requests across DCEG
    Given User logged in as "GEOFFREY_TOBIAS"
    And User is on Clearance Requests tab
    And User navigates to CR Search subtab
    And User marks off Clearance Request Status with the following states
      | state1 | state2                     | state3                |
      | Draft  | Submitted for Verification | Returned for Revision |
    When User clicks Search
    And User can verify that draft clearance requests are editable
    And User can verify that submitted for verification clearance requests are editable
    And User can verify that returned for revision clearance requests are editable

  @AdminTabReassignment @Jira1088 @correct @regressionAdmin
  Scenario: TC11 Admin tab.Reassignment module
    Given User logged in as "GEOFFREY_TOBIAS"
    When User clicks on Admin Tab
    Then user can verify that the following tabs are available
      | tab1         | tab2                  |
      | Reassignment | Delegation Management |
    And User goes to Reassignment tab
    When User applies search for "CHANOCK, STEPHEN" as "Reviewer"
    Then User can verify that the result is as expected per Reviewer search
    When User opens a clearance request to view
    Then User can verify that the CR opens as expected
    When User reassigns Clearance request to "DOGBE, NADIA"
    Then User can verify that the Clearance Request is reassigned to "DOGBE, NADIA"
    When User views the history of the reasigned Clearance request
    Then User can see the previous and new assignee as part of the History transaction
    When User clicks on Admin Tab
    And User goes to Reassignment tab
    When User applies search for "ALBANES, DEMETRIUS" as "Requestor"
    Then User can verify that the result is as expected per Requestor search
    When User reassigns Clearance request to "HOLMES-LILLIE, SADIE"
    Then User can verify that the Clearance Request is reassigned to "BARTELLONI, ALEXIS"
    When User applies search for "MADIGAN, PATRICIA" as "Submitter"
    Then User can verify that the result is as expected per Submitter search
    When User reassigns Clearance request to "CHANG, VICKY"
    Then User can verify that the Clearance Request is reassigned to "CHANG, VICKY"
    When User applies checkmark Select All
    Then User can verify that only page one results are selected
    When User applies a wide search for "MADIGAN, PATRICIA"
    Then User can successfully clear the search result
    When a search for "ALBANES, DEMETRIUS" is applied
    Then User can verify that each tabs contains respective Clearance requests
      | tab 1   | tab 2    | tab 3     |
      | PENDING | INFLIGHT | COMPLETED |
    And User can export each of the tabs below
      | tab 1   | tab 2    | tab 3     |
      | PENDING | INFLIGHT | COMPLETED |
    And User can verify that In-flight Clearance Requests are read only
    And User can verify that Re-assign option is not available for INFLIGHT tab
    And User can verify that Completed Requests are read only
    And User can verify that Re-assign option is not available for  COMPLETED tab
