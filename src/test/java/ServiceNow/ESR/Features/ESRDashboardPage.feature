Feature: ESR Dashboard Page

    Description: This feature file contains scenarios relating to the ESR Dashboard page

    @ESR-540 @ESR-541 @Progression @sarwarahmed1
    Scenario: Test an authenticated user access the ESR dashboard page
        Given a user is on the NCI at your service homepage
        When a user logs in with valid credentials
        And user clicks on Native View
        And user navigates to Engineering Service Request
        And user clicks on Dashboard
        Then user is directed to the ESR Dashboard page