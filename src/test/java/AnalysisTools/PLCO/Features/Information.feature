Feature: Informational tabs ( About,Home, and APIAcess)
 

@Smoke1
Scenario: User is able to go to source code from About page
Given user on PLCO homepage
When user clicks on About page
And clicks on Github
Then user goes to source code from About page

@Smoke1
Scenario: User navigates to API Acess page 
Given user on PLCO homepage
When user selects API Acess tab
Then API Acess page displays

@Smoke1
Scenario: User views API Acess Page heading
Given user on PLCO homepage
When user selects API Acess tab
Then API Acess page displays "API Access" heading

@Smoke1
Scenario: User is able to go to source code from home page
Given user on PLCO homepage
When user clicks on source code
Then user goes to PLCO source code on github


@Smoke1
Scenario: User navigates from about page to Explore GWAS
Given user on PLCO homepage
When user clicks explore on GWAS results 
Then user is on explore GWAS tab where "Summary Results" displays
