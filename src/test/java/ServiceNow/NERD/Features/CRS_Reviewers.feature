Feature: CRS Reviewers Test Scenarios
  
  Description: This feature file contains test scenarios related to CRS Reviewers
   
   @inProgress
  Scenario: Verifying New OM Category Type - Service Portal
    Given a CRS reviewer is logged into NERD's CRS Knowledge Management System
    When adding a new OM entry
    Then OM Content Type "OM Content Type" displays
    And the following check box options are also available, "Administration Transition Material", "Congressional Justification", "HHS Requests", "Anti-Harrassment/Civility Material", "Donna's Blog", "Furlough Planning", "Equity and Inclusion Program", "COVID-19 Leadership Messages"
    And when selecting Other "Other"
    Then the If Other is selected above, please specify "If Other is selected above, please specify" field displays

  @Smoke
  Scenario: Test Special topics filter missing "Women's Health"
    Given a CRS Reviewer is on the NERD Knowledge Base page
    And clicks the "Special Topic" filter
    Then the field options are "All", "Big data/Data sharing", "COVID-19","Communications","Early Detection","Metastatic","Minority health/Health disparities","Moonshot","Partnerships","Pediatric","Rare", "Sex/Gender differences", "Training/Workforce development", "Women's health", and "Workforce"
