Feature: Covid-19 Activities Submission page Scenarios

  @SS-3419 @SS-3449 @chaudhryma @Regression @selenium
  Scenario: Verifying additional question on COVID submission and entry form - Service Portal
    Given user is on the COVID19 Activities submissions page
    Then the section "This activity aligns with the following NIH COVID-19 Strategic Plan" displays
    And the following check box options are also displayed "Priority 1: Improve Fundamental Knowledge", "Priority 2: Advance Research to Improve Detection", "Priority 3: Support to Advance Treatment", "Priority 4: Accelerate Research to Improve Prevention", "Priority 5: Prevent and Redress Poor COVID-19 Outcomes", "Other"

  @NERDSNOW-675 @chaudhryma @Regression @selenium
  Scenario:Test Change 'Covid-19 Activities' Option on the 'Categories' Filter to Not Include 'Special Topic' Articles
    Given a NERD user is viewing the Knowledge Base as a super user Grace Liou
    When they select the COVID19 Activities Category
    Then no other results are displayed which have 'COVID-19' as the Special Topic Filter