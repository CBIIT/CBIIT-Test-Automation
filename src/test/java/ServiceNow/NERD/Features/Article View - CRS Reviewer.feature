Feature: Article View Test Automation - CRS Reviewer Views Top Accomplishments

  @juarezds @SS-4631 @ReadyForReview @DONE
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
  Scenario: CRS Reviewer Sees Top Accomplishment Fields
    Given a CRS Reviewer "Diane Palmieri" is viewing the list of the published "Top Accomplishments"
    Then there is a record called "The genetics and epigenetics of susceptibility to dietary-induced non-alcoholic fatty liver disease"
    When the user clicks the title of the record "The genetics and epigenetics of susceptibility to dietary-induced non-alcoholic fatty liver disease"
    Then the user is redirected to the Article View of the "The genetics and epigenetics of susceptibility to dietary-induced non-alcoholic fatty liver disease" record
    And the following fields and their associated data are visible for Top Accomplishments, "Category", "Rank", "Title", "DOC", "Description", "Cancer Site/Type", "Research Type", "Special Topic", "References", "Other References", "Collaborations", "Fiscal Year", "Point of Contact", "Point of Contact Email", "CRS Contact", "Author"

  @juarezds @ReadyForReview
  Scenario: Article View Test Automation - CRS Reviewer Views Collaboration
    Given a CRS Reviewer "Diane Palmieri" is on the NERD Home Page
    Then there are three knowledge bases called "NERD", "ROCK", and "Moonshot Evaluation"
    When the user clicks the NERD Knowledge Base
    Then the user is redirected to the Knowledge Base view page
    And there is a collapsed accordion with the header labeled "Collaborations"

  @juarezds @ReadyForReview
  Scenario: CRS Reviewer Sees Published Other Accomplishments
    Given a CRS Reviewer "Diane Palmieri" is on the NERD Home Page
    Then there are three knowledge bases called "NERD", "ROCK", and "Moonshot Evaluation"
    When the user clicks the NERD Knowledge Base
    Then the user is redirected to the Knowledge Base view page
    And there is a collapsed accordion with the header labeled "Other Accomplishments"
    When the user clicks the "Other Accomplishments" accordion header
    Then the "Other Accomplishments" accordion expands
    And a list of all published "Other Accomplishments" records is visible

  @juarezds @ReadyForReview
  Scenario: CRS Reviewer Sees Published Collaborations
    Given a CRS Reviewer "Diane Palmieri" is on the NERD Home Page
    Then there are three knowledge bases called "NERD", "ROCK", and "Moonshot Evaluation"
    When the user clicks the NERD Knowledge Base
    Then the user is redirected to the Knowledge Base view page
    And there is a collapsed accordion with the header labeled "Collaborations"
    When the user clicks the "Collaborations" accordion header
    Then the "Collaborations" accordion expands
    And a list of all published "Collaborations" records is visible

  @juarezds @ReadyForReview
  Scenario: CRS Reviewer Sees Top Accomplishment Fields
    Given a CRS Reviewer "Diane Palmieri" is viewing the list of the published "Collaborations"
    Then there is a record called "Biobanking and Cohort Network (BCNet) at IARC/WHO"
    When the user clicks the title of the record "Biobanking and Cohort Network (BCNet) at IARC/WHO"
    Then the user is redirected to the Article View of the "Biobanking and Cohort Network (BCNet) at IARC/WHO" record
    And the following fields and their associated data are visible, "Category", "Please specify", "Acronym", "Fiscal Year", "Description", "Website URL(s)", "FY the Collaborative Activity Originated", "Lead DOC", "Other DOCs", "POC", "References", "NIH ICs/OD Collaborators", "HHS Agency Collaborators", "Other Federal Agency Collaborators", "Tribal/State/Local Government Collaborators", "Foreign Government Collaborators", "Non-Governmental Collaborators", "Other Collaborators", "Select type of collaborative activity", "IF COMMITTEE IS SELECTED ABOVE, Is this a FACA committee", "Is this collaboration related to a regulatory activity?", "Was NIH funding provided for this activity?", "Products/Outputs", "IF RESEARCH RESOURCE IS SELECTED ABOVE, Specify Type", "NIH strategic alignment", "HHS Strategic Plan Alignment", and "Author"


