Feature: These are the scenarios for the Home page on the ACT24 Application

  @Smoke @satya @Regression @playwright @NCIATWP-8536
  Scenario: Verify title of home screen of ACT24 website
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    Then Verify the title of the ACT24 website home page is "Researcher Site"
    Then User logout from the ACT24 website

  @Smoke @satya @Regression @playwright @NCIATWP-8537
  Scenario: Verify user is able to click on every menu tabs in the home page
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    Then User clicks on the every menu tabs in the home page

  @Smoke @satya @Regression @playwright @NCIATWP-8538
  Scenario: Verify user is able to click on instructions and export button on the homepage
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    Then User clicks on the instructions to expand details on it and then again click on it
    Then User clicks on the export button under my studies menu tab

  @Smoke @satya @Regression @playwright @NCIATWP-8540
  Scenario: Verify user is able to click on instructions and export button on the homepage
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    Then User changes entries visibility to "100" and again to "10"
    And Verify columns are clickable in the table displayed

  @Smoke @satya @Regression @playwright @NCIATWP-8537
  Scenario: Verify whether the search is working on the my studies page or not
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    Then User enters text in the search box on the my studies page
    Then Verify study abbreviation column contains searched text in the table data

  @Smoke @satya @Regression @playwright @NCIATWP-8541
  Scenario: Verify create new study page is opening on click of the mentioned button
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    Then User clicks on the create new study button on the researcher page
    And User verifies that page is opened to create new studies

  @Smoke @satya @Regression @playwright @NCIATWP-8541
  Scenario: Verify study is being created on submitting with the mandatory details
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    Then User clicks on the create new study button on the researcher page
    And User enters all the mandatory details for creating the new study
    Then User clicks on the submit button to create the study
    Then Validate the text "The Study has been created successfully."

  @Smoke @satya @Regression @playwright @NCIATWP-8542
  Scenario: Validate user is on the study staff menu tab in the researcher website
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    And User enters the created study text in the search box on the my studies page
    Then User clicks on the study staff button of the searched study
    Then Validate user is on the study staff menu tab in the researcher website

  @Smoke @satya @Regression @playwright @NCIATWP-8543
  Scenario: Verify user is able to update the created study details
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    And User enters the created study text in the search box on the my studies page
    Then User clicks on the edit study button of the created study
    And User edits the entered details of the already created study
    Then User clicks on the save changes button and details are getting edited

  @Smoke @satya @Regression @playwright @NCIATWP-8544
  Scenario: Validate search and clear button is working in the analytics data menu tab
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    And User enters the created study text in the search box on the my studies page
    Then User clicks on the analytics data for the created study
    And User clicks on the clear button
    Then User selects the created study from the dropdown again
    Then User clicks on the search button on the analytics data menu tab

  @Smoke @satya @Regression @playwright @NCIATWP-8545
  Scenario: Validate the logged in email address is matching with the email address displayed under the my account menu tab
    Given User navigates to ACT24 website
    When User enters "satya.gugulothu@nih.gov" in email and "Satyakotya123@" in password and clicks Login
    And User clicks on the my account menu tab in the act24 researcher website
    Then Validate the email field value matches with "satya.gugulothu@nih.gov"