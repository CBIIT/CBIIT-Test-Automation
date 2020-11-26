Feature: Home

@Smoke
Scenario: User is able to go to source code from home page
Given user on PLCO homepage
When user clicks on source code
Then user goes to PLCO source code on github
