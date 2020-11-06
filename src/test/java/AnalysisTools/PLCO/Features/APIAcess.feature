Feature: API Acess Page

@Smoke 
Scenario: User navigates to API Acess page 
Given user on PLCO homepage
When user selects API Acess tab
Then API Acess page displays

@Smoke
Scenario: User views API Acess Page heading
Given user on PLCO homepage
When user selects API Acess tab
Then API Acess page displays "API Access" heading



