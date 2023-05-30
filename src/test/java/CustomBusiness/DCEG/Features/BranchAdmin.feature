Feature: Branch Admin Flow

  @BranchAdminSearchPublication @Jira1109 @Needs_review
  Scenario: TC01 Branch Admin. Can view publications across DCEG
    Given User logged in as "SADIE_HOLMES"
    And User is on Publications tab
    When User applies wide search
    Then User can view any publication across DCEG

  @BranchAdminViewHighProfileCR @Jira1108 @Needs_review
  Scenario: TC02 Branch Admin. Can view high profile CR within their NED. Can view non hp CR across DCEG
    Given User logged in as "SADIE_HOLMES"
    And User is on Publications tab
    When User applies high profile publications search to Publications
    Then User can view high profile entries within their NED
    When User applies  non high profile publications search to Publications
    Then User can view non high profile entries within their NED

  @BranchAdminEditsCR @Jira1085 @Needs_review
  Scenario: TC03 Branch Admin scope of actions
    Given User logged in as "SADIE_HOLMES"
    When User submits a Clearance Request where requestor is SADIE HOLMES
    Then User can verify that clearance request is successfully submitted
    And User is on Clearance Requests tab
    And User navigates to CR Search subtab
    And User marks off Clearance Request Status with states
      | state1 | state2                     | state3                |
      | Draft  | Submitted for Verification | Returned for Revision |
    When User clicks Search
    Then User can verify that User can operate on a clearance request that only belongs to OFFICE OF THE DIRECTOR

  @BranchAdminEditsPublications @Jira1083 @Needs_review
  Scenario: TC04 Branch Admin. Can only edit Publication within their NED
    Given User logged in as "SADIE_HOLMES"
    And User is on Publications tab
    And User navigates to Publications Search subtab
    When User picks Publication Status as Pending Submission
    And User clicks Search button
    Then User can verify that publications in Pending Submission status are only editable within his branch
    When User picks Publication Status as Submitted for Publication
    And User clicks Search button
    Then User can verify that publications in Submitted for Publication status are only editable within his branch
    When User picks Publication Status as Accepted for Publication/In Press
    And User clicks Search button
    Then User can verify that publications in Accepted for Publication/In Press status are only editable within his branch
    When User picks Publication Status as E-Published (ahead of print)
    And User clicks Search button
    And User can verify that returned search for publications in E-Published (ahead of print) status is across DCEG
    When User picks Publication Status as Published
    And User clicks Search button
    Then User can verify that publications in Published status are editable
