Feature: Find Submissons features
    @matakevin
    Scenario: Logging in redirects user to the Find Submissions page
        Given the user is on the GDS Tracking home page
        When the user logs in with valid credentials
        Then the user is on the Find Submissions tab