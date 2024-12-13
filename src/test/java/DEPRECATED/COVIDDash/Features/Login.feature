Feature: Login Scenarios
  Reviewer and Regular User/PI Login
  Description: This feature tests User Story COVIDDASH-133, 141

  @smoke @regression @juarezds
  Scenario: Covid dash Login
    Given User navigates to the COVID-19 Biorepository login page
    When the User clicks on Login to access button
    And logs in by entering iTrust credentials
    Then the User is directed to the home page

  @regression @juarezds
  Scenario: Reviewer Login
    Given a Reviewer navigates to the COVID-19 Biorepository login page
    When the Reviewer selects Login to access button
    And logs in by entering iTrust credentials
    Then the Reviewer is directed to the Submissions page
    And is able to see two tables names "Studies Pending Approval" and "Approved / Rejected Studies"


