Feature: These are the scenarios under the Find Submissions tab on the GDS Tracking application

    @matakevin @2MFA
    Scenario: Logging in redirects user to the Find Submissions page
        Given the user is on the GDS Tracking home page
        When the user logs in with valid credentials
        Then the user is on the Find Submissions tab