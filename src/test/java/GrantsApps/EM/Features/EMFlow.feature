Feature: EM Flow Sprint One
  Background: common steps
    Given User is logged in as Primary ITwoE Coordinator "Diego Juarez"

  @addI2ETechnicalSupportRole @Jira1007 @Regression @Progression @juarezds
  Scenario: Test Add I2E Technical Support Role
    And User is on Manage I2E Users page
    When User inputs "Mata Rodriguez, Kevin Osmaldo" into the Name field and clicks search
    When User clicks "Edit" button
    When User clicks "Add Role" button
    And selects "I2E Technical Support" from I2E Role drop down
    And selects "CENTER FOR BIOMEDICAL INFORMATICS & INFORMATION TECHNOLOGY (OD CBIIT)" from Role Organization drop down
    And User clicks on Add Role button Inside Module
#    Then User can verify that the ItwoE Technical Support Role is displayed in the Active User Roles grid
#    When User clicks Add Role button
#    And User clicks I2E Role drop down
#    And User selects  I2E Technical Support Role
#    And User selects "CENTER FOR BIOMEDICAL INFORMATICS & INFORMATION TECHNOLOGY (OD CBIIT)" value in the Role Organization drop down list
#    Then User can verify the validation "Li, Bin has already active I2E Technical Support role for the same NCI Organization. Please select a different I2E Role or NCI Organization to proceed."
#    Then User saves ITwoE Technical Support Role that was  added role