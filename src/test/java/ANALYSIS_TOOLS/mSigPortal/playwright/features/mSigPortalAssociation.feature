Feature: These are the scenarios for the mSigPortal Association application

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to calculate based on the selected parameter
    Given User navigates to the mSigPortal Website
    When User clicks on the association card on the mSigPortal website
    Then User clicks on the load study button
    Then User clicks on the load data button under univariable tab
    Then User clicks on the calculate button under the univariable tab

  @satya @Smoke @Regression @playwright
  Scenario: Verify User is able to reset the selected data after calculating based on the selected parameter
    Given User navigates to the mSigPortal Website
    When User clicks on the association card on the mSigPortal website
    Then User clicks on the load study button

  @satya  @Smoke @Regression @playwright
  Scenario: Verify User is able to calculate based on the selected parameter and validate add and remove association
    Given User navigates to the mSigPortal Website
    When User clicks on the association card on the mSigPortal website
    Then User clicks on the load study button
    Then User clicks on the load data button under univariable tab
    Then User clicks on the calculate button under the univariable tab
    Then Validate add association variable is enabled
    Then User clicks on the add association variable button
    Then User clicks on the remove button to remove it