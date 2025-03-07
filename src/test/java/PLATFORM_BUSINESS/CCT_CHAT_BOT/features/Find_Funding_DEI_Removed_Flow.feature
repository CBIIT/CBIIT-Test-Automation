Feature: CCT CHAT BOT Scenarios
  Description: This Feature file contains CCT CHAT BOT Scenarios from Service Now Projects Board

  @SNOWPROJ-254 @Chaudhryma @Regression @playwright
  Scenario:Test 1: [Negative Test] CCT Chatbot: Remove DEI statement and question (removed text and link)
    Given I am a user trying to access to Diversity Funding opportunities (DEI) Programs
    When I click on diversity program link "https://extramural-diversity.nih.gov/diversity-matters/underrepresented-groups"
    Then I verify that the link is broken and goes to "404" error page
    And the DEI statement and question should be removed from the chatbot

  @SNOWPROJ-254 @Chaudhryma @Regression @playwright
  Scenario: Test 2: CCT Chatbot: Remove DEI statement and question (Pre-Doctoral)
    Given I am a user who is using the Find Funding Chat Bot,
    When I click the career stage option: "Pre-Doctoral"
    Then I select option "USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select "Yes" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And first of the links is "Individual Predoctoral MD/PhD Degree Fellows (F30)"
    And second of the link is "Individual Predoctoral Fellows (F31)"
    And third of the link is "Predoctoral to Postdoctoral Fellow Transition Award (F99/K00)"
    And fourth of the link is "Institutional Research Training Grant (T32) trainee"

  @SNOWPROJ-254 @Chaudhryma @Regression @playwright
  Scenario: Test 2: CCT Chatbot: Remove DEI statement and question (Pre-Doctoral)
    Given I am a user who is using the Find Funding Chat Bot,
    When I click the career stage option: "Pre-Doctoral"
    Then I select option "USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select the option "No, I am a foreign national with a visa" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And the link for second flow is "Predoctoral to Postdoctoral Fellow Transition Award (F99/K00)"