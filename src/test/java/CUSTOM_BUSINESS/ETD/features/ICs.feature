Feature: IC's home tab

@NCI @Regression @Needs_review
Scenario: Home Tab NCI User
Given User is on ETD home page and user is "CLIFFORD, DAVID"
When User is on Home Tab
Then user can verify that the content is NCI related

@NIDKK @Regression @Needs_review
Scenario: Home Tab NIDKK User
Given User is on ETD home page and user is "BULL, MELBOURNE"
When User is on Home Tab
Then user can verify that the content is NIDKK related

@OHR @Regression @Needs_review
Scenario: Home Tab OHR User
Given User is on ETD home page and user is "WARTONICK, JEAN"
When User is on Home Tab
Then user can verify that the content is OHR related