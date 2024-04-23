Feature: SNOWOBF Notifications Scenarios
  Description: This Feature file contains SNOWOBF OBF Systems Support form Notifications Scenarios

  @SNOWOBF-37 @Chaudhryma @Progression
  Given I am an authenticated user with NCI credentials
  When I submit a ticket  For "New User Access" and the ticket is approved
#  Then I should get a notification