Feature: CCT CHAT BOT Scenarios
  Description: This Feature file contains CCT CHAT BOT Scenarios from Service Now Projects Board

  @SNOWPROJ-254 @Chaudhryma @Regression @playwright
  Scenario:Test 1: [Negative Test] CCT Chatbot: Remove DEI statement and question (removed text and link)
    Given I am a user trying to access to Diversity Funding opportunities (DEI) Programs
    When I click on diversity program link "https://extramural-diversity.nih.gov/diversity-matters/underrepresented-groups"
    Then I verify that the link is broken and goes to "404" error page
    And the DEI statement and question should be removed from the chatbot

  @SNOWPROJ-254 @Chaudhryma @Regression @playwright
  Scenario: Test 2: CCT Chatbot: Remove DEI statement and question (Pre-Doctoral- 1st flow)
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
  Scenario: Test 2: CCT Chatbot: Remove DEI statement and question (Pre-Doctoral - 2nd - 4th flow)
    Given I am a user who is using the Find Funding Chat Bot,
    When I click the career stage option: "Pre-Doctoral"
    Then I select option "USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select the option "No, I am a foreign national with a visa" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And the link for second flow is "Predoctoral to Postdoctoral Fellow Transition Award (F99/K00)"
    And I click on restart button to start the next flow
    When I click the career stage option: "Pre-Doctoral"
    Then I select the second option "Outside the USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select the option "No, I am a foreign national with a visa" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text for third flow on top of the following links: "I could not find any programs that you may be eligible for, but please check this page for other resources:"
    And the link for third flow is "Cancer funding resources"
    And I click on restart button to start the next flow
    When I click the career stage option: "Pre-Doctoral"
    Then I select the second option "Outside the USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select "Yes" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And the first link for fourth flow is "Individual Predoctoral MD/PhD Degree Fellows (F30)"
    And the second link for fourth flow is "Individual Predoctoral Fellows (F31)"

  @SNOWPROJ-254 @Chaudhryma @Regression @playwright
  Scenario: Test 3: CCT Chatbot: Remove DEI statement and question (Post-Doctoral)
    Given I am a user who is using the Find Funding Chat Bot,
    When I click the career stage second option "Post-Doctoral"
    Then I select option "USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select "Yes" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And first link of post-Doctoral first flow is "NCI Mentored Research Scientist Development Award (K01)"
    And second link of post-Doctoral first flow is "NCI Pathway to Independence Award (K99/R00)"
    And third link of post-Doctoral first flow is "National Research Service Award (NRSA) for Individual Postdoctoral Fellows (F32)"
    And fourth link of post-Doctoral first flow is "Career Development Award for Clinical Oncology (K12) Scholar"
    And fifth link of post-Doctoral first flow is "NCI Transition Career Development Award (K22)"
    And sixth link of post-Doctoral first flow is "Mentored Quantitative Research Career Award (K25)"
    And seventh link of post-Doctoral first flow is "NCI Pathway to Independence Award for Outstanding Early Stage Postdoctoral Researchers (K99/R00)"
    And eighth link of post-Doctoral first flow is "Institutional Research Training Grant (T32) trainee"
    And I click on restart button to start the next flow
    When I click the career stage second option "Post-Doctoral"
    Then I select option "USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select the option "No, I am a foreign national with a visa" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And the first link for second flow is "NCI Pathway to Independence Award (K99/R00)"
    And the second link for second flow is "NCI Pathway to Independence Award for Outstanding Early Stage Postdoctoral Researchers (K99/R00)"
    And I click on restart button to start the next flow
    When I click the career stage second option "Post-Doctoral"
    Then I select the second option "Outside the USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select the option "No, I am a foreign national with a visa" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text for third flow on top of the following links: "I could not find any programs that you may be eligible for, but please check this page for other resources:"
    And the link for third flow is "Cancer funding resources"
    And I click on restart button to start the next flow
    When I click the career stage second option "Post-Doctoral"
    Then I select the second option "Outside the USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select "Yes" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And the link for fourth flow of post-Doctoral is "National Research Service Award (NRSA) for Individual Postdoctoral Fellows (F32)"

  @SNOWPROJ-254 @Chaudhryma @Regression @playwright
  Scenario: Test 4: CCT Chatbot: Remove DEI statement and question (Clinical Fellow)
    Given I am a user who is using the Find Funding Chat Bot,
    When I click the career stage third option: "Clinical Fellow"
    Then I select option "USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select "Yes" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And first link of Clinical Fellow first flow is "NCI Mentored Research Scientist Development Award (K01)"
    And second link of Clinical Fellow first flow is "NCI Pathway to Independence Award (K99/R00)"
    And third link of Clinical Fellow first flow is "National Research Service Award (NRSA) for Individual Postdoctoral Fellows (F32)"
    And fourth link of Clinical Fellow first flow is "Mentored Clinical Scientist Research Career Development Award (K08)"
    And fifth link of Clinical Fellow first flow is "Career Development Award for Clinical Oncology (K12) Scholar"
    And sixth link of Clinical Fellow first flow is "NCI Transition Career Development Award (K22)"
    And seventh link of Clinical Fellow first flow is "NCI Pathway to Independence Award for Outstanding Early Stage Postdoctoral Researchers (K99/R00)"
    And eighth link of Clinical Fellow first flow is "Institutional Research Training Grant (T32) trainee"
    And I click on restart button to start the next flow
    When I click the career stage third option: "Clinical Fellow"
    Then I select option "USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select the option "No, I am a foreign national with a visa" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And the first link for second flow is "NCI Pathway to Independence Award (K99/R00)"
    And the second link for second flow is "NCI Pathway to Independence Award for Outstanding Early Stage Postdoctoral Researchers (K99/R00)"
    And I click on restart button to start the next flow
    When I click the career stage third option: "Clinical Fellow"
    Then I select the second option "Outside the USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select the option "No, I am a foreign national with a visa" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text for third flow on top of the following links: "I could not find any programs that you may be eligible for, but please check this page for other resources:"
    And the link for third flow is "Cancer funding resources"
    And I click on restart button to start the next flow
    When I click the career stage third option: "Clinical Fellow"
    Then I select the second option "Outside the USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I select "Yes" to the question "Are you a citizen of the USA, a noncitizen national, or a permanent resident?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And the link for fourth flow is "National Research Service Award (NRSA) for Individual Postdoctoral Fellows (F32)"
    And the second link for Clinical Fellow fourth flow is "Mentored Clinical Scientist Research Career Development Award (K08)"

  @SNOWPROJ-254 @Chaudhryma @Regression @playwright
  Scenario: Test 5: CCT Chatbot: Remove DEI statement and question (Established Investigator)
    Given I am a user who is using the Find Funding Chat Bot,
    When I click the career stage fourth option: "Established Investigator"
    Then I select option "USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    And first link of Established Investigator is "Career Development Award for Community Oncology and Prevention Research (K12) PI"
    And second link of Established Investigator is "Career Development Award for Clinical Oncology (K12) PI"
    And third link of Established Investigator flow is "Mentored Quantitative Research Career Award (K25)"
    And fourth link of Established Investigator flow is "Cancer Research Education Grants Program (R25)"
    And fifth link of Established Investigator flow is "Institutional Research Training Grant (T32) PI"
    And I click on restart button to start the next flow
    When I click the career stage fourth option: "Established Investigator"
    Then I select the second option "Outside the USA" to the question "Let's start with where do you plan to conduct your cancer research training?"
    And I should see the text on top of the following links: "You may be eligible for the following programs:"
    Then the following link should appear "Global Research Training (D43)"