Feature: CRS Reviewers Test Scenarios
  
  Description: This feature file contains test scenarios related to CRS Reviewers

  Scenario: Verifying New OM Category Type - Service Portal
    Given a CRS reviewer is logged into NERD's CRS Knowledge Management System
    When adding a new OM entry
    Then OM Content Type "OM Content Type" displays
    And the following check box options are also available, "Administration Transition Material", "Congressional Justification", "HHS Requests", "Anti-Harrassment/Civility Material", "Donna's Blog", "Furlough Planning", "Equity and Inclusion Program", "COVID-19 Leadership Messages"
    And when selecting Other "Other"
    Then the If Other is selected above, please specify "If Other is selected above, please specify" field displays
