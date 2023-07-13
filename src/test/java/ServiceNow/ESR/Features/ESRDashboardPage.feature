Feature: ESR Dashboard Page

    Description: This feature file contains scenarios relating to the ESR Dashboard page

    @ESR-540 @ESR-541 @Progression @sarwarahmed1
    Scenario: Test an authenticated user access the ESR dashboard page
        Given a user logs in with valid credentials on the NCI at your service page
        When user is on the NCI Native View page
        And user clicks on the arrow dropdown for dashboards
        And user searches "ESR Dashboard" in the search bar
        And the user clicks on ESR Dashboard
        Then user is directed to the ESR Dashboard page