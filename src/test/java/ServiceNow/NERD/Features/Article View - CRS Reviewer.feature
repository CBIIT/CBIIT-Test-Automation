Feature: Article View Test Automation - CRS Reviewer Views Top Accomplishments

  @SS-4631 @SS-4636 @SS-4637 @bucurgb @Regression
  Scenario Outline: CRS Reviewer Sees Published Top Accomplishments, Other accomplishments and Collaborations
    Given a CRS Reviewer is on the NERD Home Page
    Then there are three knowledge bases called "<knowledgeBaseOne>", "<knowledgeBaseTwo>", and "<knowledgeBaseThree>"
    When the user clicks the NERD Knowledge Base
    Then the user is redirected to the Knowledge Base view page
    And there is a collapsed accordion with the header labeled "<knowledgeCategory>"
    When the user clicks the "<knowledgeCategory>" accordion header
    Then the "<knowledgeCategory>" accordion expands
    And a list of all published "<knowledgeCategory>" records is visible

    Examples:
      | knowledgeBaseOne | knowledgeBaseTwo | knowledgeBaseThree  | knowledgeCategory     |
      | NERD             | ROCK             | Moonshot Evaluation | Top Accomplishments   |
      | NERD             | ROCK             | Moonshot Evaluation | Other Accomplishments |
      | NERD             | ROCK             | Moonshot Evaluation | Collaborations        |

  @SS-4631 @bucurgb @Regression
  Scenario Outline: CRS Reviewer Sees Top Accomplishment Fields
    Given a CRS Reviewer is viewing the list of the published "Top Accomplishments"
    Then there is a record called "<recordName>"
    When the user clicks the title of the record "<recordName>"
    Then the user is redirected to the Article View of the "<recordName>" record
    And the following fields and their associated data are visible for Top Accomplishments, "Category", "Rank", "Title", "DOC", "Description", "Cancer Site/Type", "Research Type", "Special Topic", "References", "Other References", "Collaborations", "Fiscal Year", "Point of Contact", "Point of Contact Email", "CRS Contact", "Author"

    Examples:
      | recordName                                                                                          |
      | The genetics and epigenetics of susceptibility to dietary-induced non-alcoholic fatty liver disease |

  @SS-4637 @bucurgb @Regression
  Scenario Outline: CRS Reviewer Sees Other Accomplishment Fields
    Given a CRS Reviewer is viewing the list of the published "Other Accomplishments"
    Then there is a record called "<recordName>"
    When the user clicks the title of the record "<recordName>"
    Then the user is redirected to the Article View of the "<recordName>" record
    And the following fields and their associated data are visible for Other Accomplishments, "Category", "DOC", "Other Accomplishment Type", "Description", "Cancer Site/Type", "Research Type", "Special Topic", "References", "Other References", "Collaborations", "Fiscal Year", "Point of Contact", "CRS Contact","Author"

    Examples:
      | recordName                                                                        |
      | Rigosertib induces mitotic arrest in pediatric cancer in a RAS-independent manner |

  @SS-4636 @bucurgb @Regression
  Scenario Outline: CRS Reviewer Sees Collaborations
    Given a CRS Reviewer is viewing the list of the published "Collaborations"
    Then there is a record called "<recordName>"
    When the user clicks the title of the record "<recordName>"
    Then the user is redirected to the Article View of the "<recordName>" record
    And the following fields and their associated data are visible, "Category", "Please specify", "Acronym", "Fiscal Year", "Description", "Website URL(s)", "FY the Collaborative Activity Originated", "Lead DOC", "Other DOCs", "POC", "References", "NIH ICs/OD Collaborators", "HHS Agency Collaborators", "Other Federal Agency Collaborators", "Tribal/State/Local Government Collaborators", "Foreign Government Collaborators", "Non-Governmental Collaborators", "Other Collaborators", "Select type of collaborative activity", "IF COMMITTEE IS SELECTED ABOVE, Is this a FACA committee", "Is this collaboration related to a regulatory activity?", "Was NIH funding provided for this activity?", "Products/Outputs", "IF RESEARCH RESOURCE IS SELECTED ABOVE, Specify Type", "NIH strategic alignment", "HHS Strategic Plan Alignment", and "Author"

    Examples:
      | recordName                                        |
      | Biobanking and Cohort Network (BCNet) at IARC/WHO |