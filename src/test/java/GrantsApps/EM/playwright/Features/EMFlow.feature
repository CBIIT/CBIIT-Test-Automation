Feature: EM Flow

#  Background: common steps
#    Given User is logged in as Primary ITwoE Coordinator "Diego Juarez" - PW

  @I2ERoleDropdownList @Jira950 @InProgress
  Scenario: I2E Role Drop Down List
    Given User is logged in as Primary ITwoE Coordinator - PW
    When User inputs "Mata Rodriguez, Kevin Osmaldo" into the Name field and clicks search - PW
#When User clicks "Edit" button
#And tester deletes "GM Action Manager" role to re-run test before adding role
#When User clicks "Add Role" button
#And selects "GM Action Manager" from I2E Role drop down
#And User clicks on Add Role button Inside Module
#Then User can verify that the GM Action Manager Role is displayed in the Active User Roles grid
#And User Saves Changes
#When User clicks "Add Role" button
#And User can verify that predictive search "GM" is available for ITwoE Role dropdown
#When User chooses Administrative option from Business Area dropdown
#Then User can verify that appropriate ITwoE roles are available via ITwoE Role dropdown
#And User can pick eGrants Access Representative role
#And User can remove eGrants Access Representative role
#When User clears Administrative option form Business Area choice
#Then ItwoE roles choices are cleared too with message " Role is required. "
#    #When User chooses Administrative option from Business Area dropdown again
#    #Then User can verify that Administrative related roles "eGrants Access Representative", "I2E Coordinator", "I2E Technical Support", "Primary I2E Coordinator" are reflected in I2E Role dropdown
#    #When User picks Financial from Business Area dropdown