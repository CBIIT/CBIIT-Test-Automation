Feature: CCT CHAT BOT Scenarios
  Description: This Feature file contains CCT CHAT BOT Scenarios from Service Now Projects Board

  @SNOWPROJ-142 @Chaudhryma @Regression @Smoke @playwright
  Scenario: Test 1: CCT- Add additional K12 Link to Chat Bot logic
    Given the user opens the Find Funding Chatbot on the NV
    When selects Yes to Q1 regarding finding funding opportunities
    And selects "Established Investigator" for Q2 regarding career stage
    And selects "USA" for Q3 about research training location
    And the user selects "Yes" for Q4 indicating they belong to an underrepresented group
    Then the "Career Development Award for Community Oncology and Prevention Research (K12) PI" link should be displayed at the top of the list
    And the link to Career Development Award for Community Oncology and Prevention Research (K12) PI "https://www.cancer.gov/grants-training/training/funding/k12-mccaskill-stevens" should be clickable
    And the link should open in a new tab

  @SNOWPROJ-142 @Chaudhryma @Regression @Smoke @playwright
  Scenario: Test 2: CCT- Add additional K12 Link to Chat Bot logic
    Given the user opens the Find Funding Chatbot on the NV
    When selects Yes to Q1 regarding finding funding opportunities
    And selects "Established Investigator" for Q2 regarding career stage
    And selects "USA" for Q3 about research training location
    And the user selects "No" for Question4 indicating they belong to an underrepresented group
    Then the "Career Development Award for Community Oncology and Prevention Research (K12) PI" link should be displayed at the top of the list
    And the link to Career Development Award for Community Oncology and Prevention Research (K12) PI "https://www.cancer.gov/grants-training/training/funding/k12-mccaskill-stevens" should be clickable
    And the link should open in a new tab

  @SNOWPROJ-132 @Chaudhryma @Regression @Smoke @playwright
  Scenario:Test 1: Add K01 to the CCT Find Funding Chatbot
    Given the user opens the Find Funding Chatbot on the NV
    When selects Yes to Q1 regarding finding funding opportunities
    And User selects "Post-Doctoral" for Q2 regarding career stage
    And selects "USA" for Q3 about research training location
    And selects "Yes" for Q4 "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    When the user selects "Yes" for Q5 "Do you consider yourself to belong to an underrepresented group in the biomedical research workforce?"
    Then the "NCI Mentored Research Scientist Development Award (K01)" link should be displayed at the top of the funding list
    And the link to "NCI Mentored Research Scientist Development Award (K01)" as "https://www.cancer.gov/grants-training/training/funding/k01" should be clickable
    And the "NCI Mentored Research Scientist Development Award (K01)" link should open in a new tab

  @SNOWPROJ-132 @Chaudhryma @Chaudhryma @Regression @playwright
  Scenario: Test 2:Add K01 to the CCT Find Funding Chatbot
    Given the user opens the Find Funding Chatbot on the NV
    When selects Yes to Q1 regarding finding funding opportunities
    And User selects "Clinical Fellow" for Question2 regarding career stage
    And selects "USA" for Q3 about research training location
    And selects "Yes" for Q4 "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    When the user selects "Yes" for Q5 "Do you consider yourself to belong to an underrepresented group in the biomedical research workforce?"
    Then the "NCI Mentored Research Scientist Development Award (K01)" link should be displayed at the top of the funding list
    And the link to "NCI Mentored Research Scientist Development Award (K01)" as "https://www.cancer.gov/grants-training/training/funding/k01" should be clickable
    And the "NCI Mentored Research Scientist Development Award (K01)" link should open in a new tab

  @SNOWPROJ-132 @Chaudhryma @Chaudhryma @Regression @playwright
  Scenario: Test 3:Add K01 to the CCT Find Funding Chatbot
    Given the user opens the Find Funding Chatbot on the NV
    When selects Yes to Q1 regarding finding funding opportunities
    And User selects "Clinical Fellow" for Question2 regarding career stage
    And selects "USA" for Q3 about research training location
    And selects "Yes" for Q4 "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And the user selects "No" for Question4 indicating they belong to an underrepresented group
    Then the "NCI Mentored Research Scientist Development Award (K01)" link should be displayed at the top of the funding list
    And the link to "NCI Mentored Research Scientist Development Award (K01)" as "https://www.cancer.gov/grants-training/training/funding/k01" should be clickable
    And the "NCI Mentored Research Scientist Development Award (K01)" link should open in a new tab

  @SNOWPROJ-132 @Chaudhryma @Chaudhryma @Regression @playwright
  Scenario: Test 4: Add K01 to the CCT Find Funding Chatbot
    Given the user opens the Find Funding Chatbot on the NV
    When selects Yes to Q1 regarding finding funding opportunities
    And User selects "Post-Doctoral" for Q2 regarding career stage
    And selects "USA" for Q3 about research training location
    And selects "Yes" for Q4 "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And the user selects "No" for Question4 indicating they belong to an underrepresented group
    Then the "NCI Mentored Research Scientist Development Award (K01)" link should be displayed at the top of the funding list
    And the link to "NCI Mentored Research Scientist Development Award (K01)" as "https://www.cancer.gov/grants-training/training/funding/k01" should be clickable
    And the "NCI Mentored Research Scientist Development Award (K01)" link should open in a new tab

  @SNOWPROJ-35 @Chaudhryma @Chaudhryma @Regression @playwright
  Scenario: Test 1: Verify that the Global Research Training (D43) link appears
    Given the user opens the Find Funding Chatbot on the NV
    When selects Yes to Q1 regarding finding funding opportunities
    And selects "Established Investigator" for Q2 regarding career stage
    And selects "Outside the USA" for "Let's start with where do you plan to conduct your cancer research training?"
    When the user selects "Yes" for Q5 "Do you consider yourself to belong to an underrepresented group in the biomedical research workforce?"
    Then the following links should appear "Global Research Training (D43)"

  @SNOWPROJ-35 @Chaudhryma @Chaudhryma @Regression @playwright
  Scenario: Test 2: Verify that the Global Research Training (D43) link appears
    Given the user opens the Find Funding Chatbot on the NV
    When selects Yes to Q1 regarding finding funding opportunities
    And selects "Established Investigator" for Q2 regarding career stage
    And selects "Outside the USA" for "Let's start with where do you plan to conduct your cancer research training?"
    And the user selects "No" for Question4 indicating they belong to an underrepresented group
    Then the following links should appear "Global Research Training (D43)"