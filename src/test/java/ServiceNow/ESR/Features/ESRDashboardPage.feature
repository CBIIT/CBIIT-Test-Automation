Feature: ESR Dashboard Page

    Description: This feature file contains scenarios relating to the ESR Dashboard page

    @ESR-540 @ESR-541 @Progression @sarwarahmed1
    Scenario: Test an authenticated user access the ESR dashboard page
        Given a user logs in with valid credentials for Native View on the NCI at your service page "nativeViewSideDoor"
        And user searches "ESR" in the filter bar
        And the user clicks on create ESR
        Then user is directed to the create ESR page where "Organizational Affiliation" and "Shopping Cart" are displayed