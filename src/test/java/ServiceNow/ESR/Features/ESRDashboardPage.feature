Feature: Create ESR Page

    Description: This feature file contains scenarios relating to the create ESR ticket page

    @ESR-540 @ESR-541 @Regression @sarwarahmed1
    Scenario: Test an authenticated user access the create ESR pag
        Given a user logs in with valid credentials for Native View on the NCI at your service page "nativeViewSideDoor"
        And user searches "ESR" in the filter bar
        And the user clicks on create ESR
        Then user is directed to the create ESR page where "Organizational Affiliation" and "Shopping Cart" are displayed