Feature: These are the scenarios for the Participant Portal of the ACT24 Application

  @Smoke @satya @Regression @playwright @NCIATWP-8602
  Scenario: Verify title of the participant portal of the ACT24 website
    Given User navigates to Participant Portal of the ACT24 website
    When User logins with the valid credentials in the website
    Then Verify the title of the participant portal of the ACT24 website

  @Smoke @satya @Regression @playwright @NCIATWP-8603
  Scenario: Verify User is able to navigate to participant portal from researcher portal of ACT24 website
    Given User navigates to ACT24 website
    And User logins into the ACT24 website with valid credentials
    Then User creates a new study
    Then User navigates to the participants account menu tab and click on the clear button
    Then User selects the created study and clicks on the search button under the participants account menu tab
    Then User uploads the required xlsx file
    When User clicks on the load button
    Then User selects the created study and clicks on the search button under the participants account menu tab
    Then User navigates to the participant url of the selected study in the new tab

  @Smoke @satya @Regression @playwright @NCIATWP-8604
  Scenario: Verify subject recall is getting opened in the new tab or not
    Given User navigates to ACT24 website
    And User logins into the ACT24 website with valid credentials
    Then User navigates to the participants account menu tab and click on the clear button
    Then User selects the created study and clicks on the search button under the participants account menu tab
    Then User navigates to the participant url of the selected study in the new other tab
    Then User clicks on fourth tab and then click on next

  @Smoke @satya @Regression @playwright @NCIATWP-7100 @NCIATWP-7321
  Scenario: Verify that recall is getting submitted
    Given User navigates to ACT24 website
    And User logins into the ACT24 website with valid credentials
    When User creates a study and loads subjects by uploading required xlsx file under the participants account menu tab
    Then User searches the created study in the participant account menu tab
    Then User opens first recall in the new tab
    Then User selects all the activities over the period
    Then user clicks on the next button
    Then User clicks on the submit recall now button
    Then Validate that recall is submitted successfully

  @Smoke @satya @Regression @playwright @NCIATWP-8605
  Scenario: Verify that user is able to change the language of participant portal in the ACT24 website
    Given User navigates to ACT24 website
    And User logins into the ACT24 website with valid credentials
    Then User navigates to the participants account menu tab and click on the clear button
    Then User selects the newly created study and searches under the participants account menu tab
    Then User selects the second recall of same study
    Then User opens second recall in the new tab
    When When User reaches the add activity page of the participant portal
    Then User changes the language from french to english on the portal

  @Smoke @satya @Regression @playwright @NCIATWP-8606
  Scenario: Verify user is able to click on the help link and also do logout from the portal
    Given User navigates to ACT24 website
    And User logins into the ACT24 website with valid credentials
    Then User navigates to the participants account menu tab and click on the clear button
    Then User selects the newly created study and searches under the participants account menu tab
    Then User selects the third recall of same study
    Then User opens third recall in the new tab
    When When User reaches the add activity page of the participant portal
    Then User clicks on the help link and verify it in participant portal
    Then User clicks on the logout button and then clicks on the OK