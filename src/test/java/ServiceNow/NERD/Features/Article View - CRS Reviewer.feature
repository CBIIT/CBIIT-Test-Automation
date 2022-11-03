Feature: Article View Test Automation - CRS Reviewer Views Top Accomplishments

    @juarezds @SS-4631 @ReadyForReview @Progression
    Scenario: CRS Reviewer Sees Published Top Accomplishments
        Given a CRS Reviewer "Diane Palmieri" is on the NERD Home Page
        Then there are three knowledge bases called "NERD", "ROCK", and "Moonshot Evaluation"
        When the user clicks the NERD Knowledge Base
        Then the user is redirected to the Knowledge Base view page
        And there is a collapsed accordion with the header labeled "Top Accomplishments"
        When the user clicks the "Top Accomplishments" accordion header
        Then the "Top Accomplishments" accordion expands
        And a list of all published "Top Accomplishments" records is visible

    @juarezds @ReadyForReview @Progression
    Scenario:  CRS Reviewer Sees Top Accomplishment Fields
        Given a CRS Reviewer "Diane Palmieri" is viewing the list of the published "Top Accomplishments"
        Then there is a record called "The genetics and epigenetics of susceptibility to dietary-induced non-alcoholic fatty liver disease"
        When the user clicks the title of the record "The genetics and epigenetics of susceptibility to dietary-induced non-alcoholic fatty liver disease"
        Then the user is redirected to the Article View of the "The genetics and epigenetics of susceptibility to dietary-induced non-alcoholic fatty liver disease" record
        And the following fields and their associated data are visible for Top Accomplishments, "Category", "Rank", "Title", "DOC", "Description", "Cancer Site/Type", "Research Type", "Special Topic", "References", "Other References", "Collaborations", "Fiscal Year", "Point of Contact", "Point of Contact Email", "CRS Contact", "Author"


    Scenario: Article View Test Automation - CRS Reviewer Views Collaboration
        Given a CRS Reviewer "Diane Palmieri" is on the NERD Home Page
        Then there are three knowledge bases called "NERD", "ROCK", and "Moonshot Evaluation"
        When the user clicks the NERD Knowledge Base
        Then the user is redirected to the Knowledge Base view page
        And there is a collapsed accordion with the header labeled "Collaborations"
