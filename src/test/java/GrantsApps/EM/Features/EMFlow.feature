Feature: EM Flow Sprint One
  Background: common steps
    Given User is logged in as Primary ITwoE Coordinator "Diego Juarez"

  @addI2ETechnicalSupportRole @Jira1007 @Regression @juarezds
  Scenario: Test Add I2E Technical Support Role
    And User is on Manage I2E Users page
    When User inputs "Mata Rodriguez, Kevin Osmaldo" into the Name field and clicks search
    When User clicks "Edit" button
    When User clicks "Add Role" button
    And selects "I2E Technical Support" from I2E Role drop down
    And selects "CENTER FOR BIOMEDICAL INFORMATICS & INFORMATION TECHNOLOGY (OD CBIIT)" from Role Organization drop down
    And User clicks on Add Role button Inside Module