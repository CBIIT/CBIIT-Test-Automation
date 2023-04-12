Feature: Regular User flow

  Background: common steps
    Given User logged in as "ALBANES_DEMETRIUS"

  @regUserAddNonNHIGroup @Jira1113 @regUserRegression
  Scenario: TC01 Regular User. Add Non-NIH Group
    When User on an editable publication
    And User chooses to add non-NIH group
    And User inputs group name
    Then User can successfully add non-NIH group

  @regUserAddNonNHIAuthor @Jira1112 @regUserRegression
  Scenario: TC02 Regular User.Add Non-NIH Author
    When User on an editable publication
    And User chooses to add non-nhi author
    Then User can verify that non-nih author was added successfully

  @regUserManuallyAddAuthor @Jira1111 @regUserRegression
  Scenario: TC03 Regular User. Search NIH Authors.Manually add an NIH author.
    When User on an editable publication
    And User is able to perform an NIH author search
    Then User can manually add an NIH author

  @regUserAuthorMatching @Jira1110 @regUserRegression
  Scenario: TC04 Regular user. Author Matching
    When User on an editable publication
    And user inputs PubMed id as 33737737
    Then User can verify that author match has been applied

  @regUserViewCRWithinBranch @Jira1086 @regUserRegression
  Scenario: TC05 Regular User.View Clearance Request only within his branch
    And User is on Clearance Requests tab
    And User navigates to CR Search subtab
    And User marks off Clearance Request Status with states
      | Draft                      |
      | Submitted for Verification |
      | Returned for Revision      |
    When User clicks Search
    Then User can verify that view button is available for a CR that is within his branch

  @regUserEditCRUserIsRequestor @Jira1084 @regUserRegression
  Scenario: TC06 Regular User. Edit Clearance Request only where user is a requestor
    And User is on Clearance Requests tab
    And User navigates to CR Search subtab
    And User marks off Clearance Request Status with states
      | Draft                      |
      | Submitted for Verification |
      | Returned for Revision      |
    When User clicks Search
    And User can edit only a CR where he is specified as a requestor

  @regUserSearchForPublication @Jira1082 @regUserRegression
  Scenario: TC07 Regular User search for Publications
    And User is on Publications tab
    And User navigates to Publications Search subtab
    When User picks Publication Status as Pending Submission
    And User clicks Search button
    And User can verify that returned search for publications in Pending Submission status is across DCEG
    When User picks Publication Status as Submitted for Publication
    And User clicks Search button
    And User can verify that returned search for publications in Submitted for Publication status is across DCEG
    When User picks Publication Status as Accepted for Publication/In Press
    And User clicks Search button
    And User can verify that returned search for publications in Accepted for Publication/In Press status is across DCEG
    When User picks Publication Status as E-Published (ahead of print)
    And User clicks Search button
    And User can verify that returned search for publications in E-Published (ahead of print) status is across DCEG
    When User picks Publication Status as Published
    And User clicks Search button
    And User can verify that returned search for publications in Published status is across DCEG
    When User picks Publication Status as Not Published/Abandoned
    And User clicks Search button
    And User can verify that returned search for publications in Not Published/Abandoned status is across DCEG

  @editPublicationsUserIsRequestor @Jira1077 @regUserRegression
  Scenario: TC08 Regular User. Edit publications only when regular user is a requestor
    And User is on Publications tab
    And User navigates to Publications Search subtab
    When User picks Publication Status as Pending Submission
    And User clicks Search button
    Then User can verify that publications in Pending Submission status are only editable where user is a requestor
    When User picks Publication Status as Submitted for Publication
    And User clicks Search button
    Then User can verify that publications in Submitted for Publication status are only editable where user is a requestor
    When User picks Publication Status as Accepted for Publication/In Press
    And User clicks Search button
    Then User can verify that publications in Accepted for Publication/In Press status are only editable where user is a requestor
    When User picks Publication Status as E-Published (ahead of print)
    And User clicks Search button
    Then User can verify that publications in E-Published (ahead of print) status are only editable where user is a requestor
    When User picks Publication Status as Published
    And User clicks Search button
    Then User can verify that publications in Published status are only editable where user is a requestor
