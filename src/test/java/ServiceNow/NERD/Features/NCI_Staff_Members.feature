Feature: NCI Staff Member Test Scenarios
  
  Description: This feature file contains scenarios related to NCI Staff Members

  @NEEDSUpdate @SS-4187 @juarezds 
  Scenario: Program Staff member Collaborations Submission
    Given a Program Staff member is on the CRS Knowledge Management System "Submissions" page
    And creates a new submission for Collaboration category
    Then the created Collaborations submission is displays in the Collaborations category section with the status "Under Review"
