Feature:These are the scenarios for the mSigPortal Association application

  @satya112 @Smoke @Regression @playwright
  Scenario: Verify User is able to calculate based on the selected parameter
    Given User navigates to the mSigPortal Website
    When User clicks on the association card on the mSigPortal website
    Then User clicks on the load study button
    Then User clicks on the load data button under univariable tab
    Then User clicks on the calculate button under the univariable tab

  @satya11 @Smoke @Regression @playwright
  Scenario: Verify User is able to reset the selected data after calculating based on the selected parameter
    Given User navigates to the mSigPortal Website
    When User clicks on the association card on the mSigPortal website
    Then User clicks on the load study button
    And User clicks on the download variable data button
    Then User clicks on the arrow and then clicks on the reset button

  @satya11 @Smoke @Regression @playwright
  Scenario: Verify User is able to calculate based on the selected parameter
    Given User navigates to the mSigPortal Website
    When User clicks on the association card on the mSigPortal website
    Then User clicks on the load study button
    Then User clicks on the load data button under univariable tab
    Then User clicks on the calculate button under the univariable tab
    Then Navigate to the multivariable tab under the association
    Then Validate add association variable is enabled
    Then User clicks on the add association variable button
    Then User clicks on the remove button to remove it