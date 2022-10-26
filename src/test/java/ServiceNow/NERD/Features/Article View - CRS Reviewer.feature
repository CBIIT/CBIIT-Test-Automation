Feature: Article View Test Automation - CRS Reviewer Views Top Accomplishments

    @Progression
    Scenario: CRS Reviewer Sees Published Top Accomplishments
        Given a CRS Reviewer "Diane Palmieri" is on the NERD Home Page
        Then there are three knowledge bases called "NERD", "ROCK", and "Moonshot Evaluation"
        When the user clicks the NERD Knowledge Base
        Then the user is redirected to the Knowledge Base view page
        And there is a collapsed accordion with the header labeled "Top Accomplishments"
        When the user clicks the "Top Accomplishments" accordion header
        Then the "Top Accomplishments" accordion expands
        And a list of all published "Top Accomplishments" records is visible

