Feature: Collaborations Scenerios
  Description: This feature file contains collaboration category scenerios

  Scenario: Saving Collaboration submission with data verification
    Given a Program Staff member is on the CRS Knowledge Management System "Submissions" page

  @juarezds @ReadyForReview @DONE
  Scenario: NIH strategic alignment (Secondary Optional) and HHS Strategic Plan Alignment (Secondary Optional) field should not be visible
    Given a Regular User has submitted a Collaboration
    When the DOC Planning Contact locates the record "Diego Test" in their Collaboration queue
    And clicks the Edit button for the record "Diego Test"
    And lands on the submission edit page for author "CBIIT Test Account"
    Then the Rank field is not visible and "Diego Test" collaboration is deleted for Automation Testing

  @New @juarezds @DONE
  Scenario: NIH strategic alignment (Secondary Optional) and HHS Strategic Plan Alignment (Secondary Optional) field should not be visible
    Given a DOC Planning Contact clicks the Submit to CRS button for a Collaboration "Diego Test"
    When the CRS Reviewer locates the record "Diego Test" in the Submissions page
    And clicks the Edit button for the record "Diego Test"
    And lands on the submission edit page for author "CBIIT Test Account"
    Then the Rank field is not visible and "Diego Test" collaboration is deleted
