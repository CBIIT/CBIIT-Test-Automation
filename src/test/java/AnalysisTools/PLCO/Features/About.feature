Feature: About 

@Smoke
Scenario: User is able to go to source code from About page
Given user on PLCO homepage
When user clicks on About page
And clicks on Github
Then user goes to source code from About page