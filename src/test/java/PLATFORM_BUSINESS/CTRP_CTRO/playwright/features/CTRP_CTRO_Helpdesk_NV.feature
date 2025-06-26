Feature: CTRP/CTRO Native View Test Case Scenarios

  @CTRPSNOW-132 @chaudhryma @playwright @Regression @Progression
  Scenario: Test Add User Role to CTRP Cloud One Group
    Given the CTRP-Cloud One user group
    When defining which user roles it has
    Then the 'x_naci_ctrp_ctro.case_user' role is added to the 'CTRP-Cloud One' group