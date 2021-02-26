Feature: NCI Staff Member Test Scenarios
  
  Description: This feature file contains scenarios related to NCI Staff Members

  Scenario: Verifying additional question on COVID submission and entry form - Service Portal
    Given user is on the COVID-19 Activities submissions page
    Then the section "This activity aligns with the following NIH COVID-19 Strategic Plan" displays
    And the following check box options are also displayed "Increase fundamental and foundational knowledge of SARS-CoV-2 and COVID-19", "Participate in public-private partnerships", "Ensure that diagnosis, treatment, and prevention options are accessible and available for underserved and vulnerable populations", "Speed innovation in COVID-19 testing technologies", "Support studies on preventative treatments and behavioral and community prevention practices"

  @Smoke @juarezds
  Scenario: Program Staff member Collaborations Submission
    Given a Program Staff member is on the CRS Knowledge Management System "Submissions" page
    And creates a new submission for Collaboration category
    Then the created Collaborations submission is displays in the Collaborations category section with the status "Under Review"
