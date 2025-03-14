Feature: SNOWTRAVEL Native View Form Scenarios
  Description: This Feature file contains SNOWTRAVEL Travle Planning System Form Scenarios in Native View

  @SNOWTRAVEL-124 @Chaudhryma @Smoke @Regression @playwright
  Scenario: Test Create Travel Request Application Module
    Given I am an authenticated DOC CGH Travel Request User "Dimetria Branch"
    When I search "Travel Planning System", in the filter navigator,
    Then I will see Modules created for the "Travel Requests", "Assigned to Me", "Assigned to My Group",and "My Approvals" underneath Travel Planning System Application

  @SNOWTRAVEL-104 @Chaudhryma @Regression @playwright
  Scenario: Test Create Assignment Groups
    Given that I am logged into ServiceNow Native View
    When I search for Group under System Security
    And I search for "NCI CGH - Travel Request Branch Directors" group Name
    And I verify the associated users "Dimetria Branch", "Kalina Duncan" and "Mark Parascandola" are listed under the Group Members tab
    When I go back to Groups and search for "NCI CGH - Travel Request Travel Planners" group Name
    And I verify that the associated users "Brian Davis", "Dimetria Branch", "Jennifer Bridges" , "Karen Grady", "Raven Coit" and "Susan Giuliani" are listed under the Group Members tab
    When I go back again and search for "NCI CGH - Travel Request Proxy users" group Name
    Then I verify that the associated users "Dimetria Branch", "Kalina Duncan" and "Mark Parascandola" should be listed under the Group Members tab

  @SNOWTRAVEL-148 @Chaudhryma @Regression @playwright
  Scenario: Test Create Assignment Group for CGH Travel Manager
    Given that I am logged into ServiceNow Native View
    When I search for "NCI CGH - Travel Managers" Group under System Security
    Then I verify that "Dimetria Branch" should be listed under the Group Member tab

  @SNOWTRAVEL-190 @Chaudhryma @Regression @playwright
  Scenario: Test Add Dimetria Branch to the CGH Branch Director Assignment Group
    Given that I am logged into ServiceNow Native View
    When I search for the "NCI CGH - Travel Request Branch Directors" Groups under System Security
    Then I will see user "Dimetria Branch" added to the CGH Branch Director Assignment Group.

  @SNOWTRAVEL-186 @Chaudhryma @Regression @playwright
  Scenario: Test Add user Karen Grady to the CGH Travel Planners Assignment Group
    Given that I am logged into ServiceNow Native View
    When I search for "NCI CGH - Travel Request Travel Planners" Groups under System Security:
    Then I will see user "Karen Grady" added to the CGH Travel Planners Assignment Group.