Feature: Branch Admin Adjunct Organization Flow

  @BranchAdminAdjunctOrganization @Jira1129 @Needs_review
  Scenario: TC01 Branch Admin with a DCEG Adjunct Org Association flow
    Given User logged in as "Gitau_Nancy"
    And User is on Clearance Requests tab
    And User navigates to CR Search subtab
    And User can edit a Draft cr listed under TDRP CGB
    And User can edit a Submitted for Verification cr listed under TDRP CGB
    And User can edit a Returned for Revision cr listed under TDRP CGB
    And User is on Publications tab
    And User navigates to Publications Search subtab
    And User clicks Search button
    Then User can verify that User can not operate on publications outside of their Adjunct org only-TDRP CGB

  @BranchAdminAdjunctNegativeScenario @Jira1131 @Needs_review
  Scenario: TC02 Branch Admin with a DCEG Adjunct Org Association flow. Negative scenario editing clearance requests/publications
    Given User logged in as "Gitau_Nancy"
    And User is on Clearance Requests tab
    And User navigates to CR Search subtab
    And User can not edit a Drafts that are not TDRP CGB
    And User can not edit a Submitted for Verification cr that is not listed under TDRP CGB
    And User can not edit a Returned for Revision  cr that is not listed under TDRP CGB
    And User is on Publications tab
    And User navigates to Publications Search subtab
    And User clicks Search button
    Then User can verify that User can not operate on publications outside of their Adjunct org only-TDRP CGB
