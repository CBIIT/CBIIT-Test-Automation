Feature: CCT CHAT BOT Scenarios
  Description: This Feature file contains CCT CHAT BOT Scenarios from Service Now Projects Board

  @SNOWPROJ-254 @Chaudhryma @Regression @playwright
  Scenario:Test 1: [Negative Test] CCT Chatbot: Remove DEI statement and question (removed text and link)
    Given I am a user trying to access to Diversity Funding opportunities (DEI) Programs
    When I click on diversity program link "https://extramural-diversity.nih.gov/diversity-matters/underrepresented-groups"
    Then I verify that the link is broken and goes to "404" error page
    And the DEI statement and question should be removed from the chatbot