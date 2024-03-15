Feature: EM Flow Sprint One
  Background: common steps
    Given User is logged in as Primary ITwoE Coordinator "Diego Juarez"

  @addI2ETechnicalSupportRole @Jira1007 @Regression @juarezds
  Scenario: Test Add I2E Technical Support Role
    And User is on Manage I2E Users page
    When User inputs "Mata Rodriguez, Kevin Osmaldo" into the Name field and clicks search
    When User clicks "Edit" button
    And tester deletes "I2E Technical Support" role to re-run test before adding role
    When User clicks "Add Role" button
    And selects "I2E Technical Support" from I2E Role drop down
    And selects "CENTER FOR BIOMEDICAL INFORMATICS & INFORMATION TECHNOLOGY (OD CBIIT)" from Role Organization drop down
    And User clicks on Add Role button Inside Module
    Then User can verify that the ItwoE Technical Support Role is displayed in the Active User Roles grid
    When User clicks Add Role button
    And User clicks I2E Role drop down
    And User selects  I2E Technical Support Role
    And selects "CENTER FOR BIOMEDICAL INFORMATICS & INFORMATION TECHNOLOGY (OD CBIIT)" from Role Organization drop down
    Then warning message with user "Mata Rodriguez, Kevin" displays with "has already active I2E Technical Support role for the same NCI Organization. Please select a different I2E Role or NCI Organization to proceed."
     Then User saves ITwoE Technical Support Role that was added role

  @verifyLeftSideNavigationLinks @Jira999 @Regression
  Scenario: Verify Left Side Navigation links
    And User can verify that first and last name of logged in user "Diego Juarez" are shown
    And User is on Manage I2E Users page
    When user clicks on My DOC Discrepancies
    Then User is able to navigate to and verify My DOC Discrepancies page in different browser tab with URL "https://i2e-test.nci.nih.gov/entmaint/discrepancy/Discrepancies.action"
    When user clicks on IMPAC II Portfolio Analysis
    Then User is able to navigate to and verify IMPAC II page in different browser tab with URL "https://i2e-test.nci.nih.gov/entmaint/impac2/execute.action"
    When user clicks on I2E Portfolio Analysis
    Then User is able to navigate to and verify ITWoE page in different browser tab with URL "https://i2e-test.nci.nih.gov/entmaint/i2e/preparePortfolioAccounts.action"
    When user clicks on Accounts Audit
    Then User is able to navigate to and verify Admin page in different browser tab with URL "https://i2e-test.nci.nih.gov/entmaint/admin/gotoDashboard.action"
    When user clicks on NEAR
    Then User is able to navigate to and verify NEAR page in different browser tab with URL "https://i2e-test.nci.nih.gov/entmaintreq/home.action"
    When user now logs in as EM Representative Bin,Li
    And User can verify that first and last name of logged in user "Bin Li" are shown
    And User is on Manage I2E Users page

  @I2ERoleDropdownList @Jira950 @Progression
  Scenario: I2E Role Drop Down List
    And User is on Manage I2E Users page
#    When User inputs "Mata Rodriguez, Kevin Osmaldo" into the Name field and clicks search
#    When User clicks "Edit" button
#    And tester deletes "GM Action Manager" role to re-run test before adding role
#    When User clicks "Add Role" button
#    And selects "GM Action Manager" from I2E Role drop down
#    And User clicks on Add Role button Inside Module
#    Then User can verify that the GM Action Manager Role is displayed in the Active User Roles grid
#    And User Saves Changes
#    When User clicks "Add Role" button
#    And User can verify that predictive search "GM" is available for ITwoE Role dropdown
#    When User chooses Administrative option from Business Area dropdown
#    Then User can verify that appropriate ITwoE roles are available via ITwoE Role dropdown
#    And User can pick eGrants Access Representative role
#    And User can remove eGrants Access Representative role
#    When User clears Administrative option form Business Area choice
#    Then ItwoE roles choices are cleared too with message " Role is required. "
    #When User chooses Administrative option from Business Area dropdown again
    #Then User can verify that Administrative related roles "eGrants Access Representative", "I2E Coordinator", "I2E Technical Support", "Primary I2E Coordinator" are reflected in I2E Role dropdown
    #When User picks Financial from Business Area dropdown
