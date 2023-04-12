Feature: IC's home tab

@NCI @regression6
Scenario: Home Tab NCI User
Given User is on ETD home page and user is "CLIFFORD, DAVID"
When User is on Home Tab
Then user can verify that the content is NCI related

@NIDKK @regression6
Scenario: Home Tab NIDKK User
Given User is on ETD home page and user is "BULL, MELBOURNE"
When User is on Home Tab
Then user can verify that the content is NIDKK related

@OHR @regression6
Scenario: Home Tab OHR User
Given User is on ETD home page and user is "WARTONICK, JEAN"
When User is on Home Tab
Then user can verify that the content is OHR related