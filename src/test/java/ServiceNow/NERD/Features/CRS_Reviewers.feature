Feature: CRS Reviewers Test Scenarios
  
  Description: This feature file contains test scenarios related to CRS Reviewers
   
  @Smoke @SS-3871 @SS-3938 @juarezds 
  Scenario: Test Special topics filter missing "Women's Health"
    Given a CRS Reviewer is on the NERD Knowledge Base page
    And clicks the "Special Topic" filter
    Then the field options are "All", "Big data/Data sharing", "COVID-19","Communications","Early Detection","Metastatic","Minority health/Health disparities","Moonshot","Partnerships","Pediatric","Rare", "Sex/Gender differences", "Training/Workforce development", "Women's health", and "Workforce"
