Feature: CRS Reviewers Test Scenarios 

Description: This feature file contains test scenarios related to CRS Reviewers
   
  @SS-3450 @bucurgb @Regression @Smoke
  Scenario: Verifying New OM Category Type - Service Portal
    Given a CRS reviewer is logged into NERDs CRS Knowledge Management System
    When adding a new OM entry
    Then OM Content Type "OM Content Type" displays
    And the following check box options are also available, "Administration Transition Material", "Congressional Justification", "HHS Requests", "Anti-Harrassment/Civility Material", "Donna's Blog", "Furlough Planning", "Equity and Inclusion Program", "COVID-19 Leadership Messages"
    And when selecting Other "Other"
    Then the If Other is selected above, please specify "If Other is selected above, please specify" field displays


  @SS-3871 @SS-3938 @Regression
  Scenario: Test Special topics filter missing "Women's Health"
    Given a CRS reviewer is logged into NERDs CRS Knowledge Management System
    And clicks the "Special Topic" filter
    Then the field options are "All", "Big data/Data Sharing", "COVID-19","Communications","Early Detection","Metastatic","Minority health/Health disparities","Moonshot","Partnerships","Pediatric","Rare", "Report/Guidance/Policy", "Sex/Gender differences", "Training/Workforce development", "Women's health", and "Workforce"
