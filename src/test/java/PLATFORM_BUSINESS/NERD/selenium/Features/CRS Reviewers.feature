Feature: CRS Reviewers Test Scenarios
   
  @SS-3450 @bucurgb @Regression @Smoke @selenium
  Scenario: Verifying New OM Category Type - Service Portal
    Given a CRS reviewer "hoffmanela@nih.gov" is logged into NERDs CRS Knowledge Management System
    When adding a new OM entry
    Then OM Content Type "OM Content Type" displays
    And the following check box options are also available, "Administration Transition Material", "Congressional Justification", "HHS Requests", "Anti-Harrassment/Civility Material", "Donna's Blog", "Furlough Planning", "Equity and Inclusion Program", "COVID-19 Leadership Messages"
    And when selecting Other "Other"
    Then the If Other is selected above, please specify "If Other is selected above, please specify" field displays

  @SS-3871 @SS-3938 @chaudhryma @Regression @selenium
  Scenario: Test Special topics filter missing "Women's Health"
    Given a CRS reviewer "hoffmanela@nih.gov" is logged into NERDs CRS Knowledge Management System
    And clicks the "Special Topic" filter
    Then the field options are "All", "Big data/Data sharing", "COVID-19","Communications","Early Detection","Metastatic","Minority health/Health disparities","Moonshot","Partnerships","Pediatric","Rare", "Report/Guidance/Policy", "Sex/Gender differences", "Training/Workforce development", "Women's health", and "Workforce"

  @SS-3481 @SS-3499 @chaudhryma @Regression @selenium
  Scenario: Verifying COVID added to OM category type
    Given a CRS reviewer "hoffmanela@nih.gov" is logged into NERDs CRS Knowledge Management System
    When adding a new OM entry
    Then OM Content Type "OM Content Type" displays
    Then the following check box option is displayed as COVID19 Leadership Messages "COVID-19 Leadership Messages"