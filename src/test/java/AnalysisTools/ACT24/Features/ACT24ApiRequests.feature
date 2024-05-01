Feature: These are API requests that are made on the ACT24' application

@matakevin @Progression
Scenario: User retrieves participant list on researcher site
Given the GET call to retrieve participant list is requested
Then the "list of participants" and 200 status code is returned