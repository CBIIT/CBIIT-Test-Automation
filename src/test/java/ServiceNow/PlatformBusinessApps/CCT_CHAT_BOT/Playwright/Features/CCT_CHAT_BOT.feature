Feature: CCT CHAT BOT Scenarios
  Description: This Feature file contains CCT CHAT BOT Scenarios from Service Now Projects Board

  @SNOWPROJ-142 @Chaudhryma @Regression
  Scenario: Test 1: CCT- Add additional K12 Link to Chat Bot logic
    Given the user opens the Find Funding Chatbot on the NV
    When selects Yes to Q1 regarding finding funding opportunities
    And selects "Established Investigator" for Q2 regarding career stage
    And selects "USA" for Q3 about research training location
    And the user selects "Yes" for Q4 indicating they belong to an underrepresented group
    Then the "Career Development Award for Community Oncology and Prevention Research (K12) PI" link should be displayed at the top of the list
    And the link to Career Development Award for Community Oncology and Prevention Research (K12) PI "https://www.cancer.gov/grants-training/training/funding/k12-mccaskill-stevens" should be clickable
    And the link should open in a new tab