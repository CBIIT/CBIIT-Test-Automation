Feature:These are the scenarios for the BCRAT application

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is on the BCRAT online calculator page
    Given User navigates to the BCRAT Website
    Then User clicks on the BCRAT link
    Then Verify User is on the BCRAT calculator page

  @satya @Smoke @Regression @playwright
  Scenario: Verify all the links for the resources on breast cancer risk
    Given User navigates to the BCRAT Website
    Then User clicks on the BCRAT link
    Then User clicks on the health professional version link
    Then User clicks on the BCRisk in American women link
    Then User clicks on the CCT BCPrevention link
    Then User clicks on the CCT BCScreening link
    Then User clicks on the CCT BCTreatment link

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is on about the calculator tab
    Given User navigates to the BCRAT Website
    Then User clicks on the about the calculator tab
    Then Verify User is on the about the calculator tab

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to check reset functionality on the risk calculator tab
    Given User navigates to the BCRAT Website
    Then User clicks on the Calculate Patient Risk button
    Then User clicks yes for the patient eligibility and clicks ok button
    Then User reset the selection on the risk calculator tab

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to get the personalized results for respective data through the risk calculator
    Given User navigates to the BCRAT Website
    Then User clicks on the risk calculator tab
    Then User enters all the data for demographics with eligibility and history
    Then User clicks on the calculate risk button
    Then Verify User is on the personalized results page

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to edit the submitted response and again get the correct personalized results
    Given User navigates to the BCRAT Website
    Then User clicks on the risk calculator tab
    Then User enters all the data for demographics with eligibility and history
    Then User clicks on the calculate risk button
    Then User edit the response on the personalized result page
    Then User clicks on the calculate risk button
    Then Verify User is on the personalized results page

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to start new assessment after getting personalized result
    Given User navigates to the BCRAT Website
    Then User clicks on the risk calculator tab
    Then User enters all the data for demographics with eligibility and history
    Then User clicks on the calculate risk button

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to navigate to other risk assessment tool on clicking the same in the BCRAT
    Given User navigates to the BCRAT Website
    Then User clicks on the other risk assessment tool link
    Then Verify user navigated to the other risk assessment section

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to validate title of page after clicking on the links available in the footer
    Given User navigates to the BCRAT Website
    Then User clicks on the home link and verify it in the BCRAT
    Then User clicks on the contact link and verify it in the BCRAT
    Then User clicks on the policies link and verify it in the BCRAT
    Then User clicks on the HHS Vulnerability Disclosure link and verify it in the BCRAT
    Then User clicks on the Accessibility link and verify it in the BCRAT

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to validate title of page after clicking on the links available in the footer
    Given User navigates to the BCRAT Website
    Then User clicks on the US Department of HHS link and verify it in the BCRAT
    Then User clicks on the NIH link and verify it in the BCRAT
    Then User clicks on the NCI link and verify it in the BCRAT
    Then User clicks on the USA gov link and verify it in the BCRAT







