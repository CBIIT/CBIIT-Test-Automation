Feature: IAM Redesign

  @bucurgb @CO3-1430
  Scenario: Verifying that the users are migrated properly from the old AD groups to the new AD Groups for Managed Prod Accounts
    Given a user is on AD the webpage
    Then the user should be able see that the old groups should have the same numbers of users as the new groups for Prod accounts

  @bucurgb @CO3-1430 @Progression
  Scenario: Verifying that the users are migrated properly from the old AD groups to the new AD Groups for Managed Non-Prod Accounts
    Given a user is on AD the webpage
    Then the user should be able see that the old groups should have the same numbers of users as the new groups for Non-Prod accounts