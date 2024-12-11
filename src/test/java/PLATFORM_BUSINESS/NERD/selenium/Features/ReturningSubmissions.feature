Feature: Returning published Collaboration by the CRS Reviewer/DOC Planning Contact

  @SS-3893 @SS-3937 @bucurgb @Regression @selenium
  Scenario: Verifying "Please Specify" and "Fiscal Year" field values
    Given a published Collaboration has been returned to the DOC Planning Contact "Abigail Joyce" by the CRS Reviewer "hoffmanela@nih.gov"
    Then the DOC Planning Contact "Abigail Joyce" verifies that the "Please specify" and "Fiscal Year" field values are cleared and are required

  @SS-3893 @SS-3937 @bucurgb @Regression @selenium
  Scenario: Verifying status of Returned Collaboration in the Submissions page
    Given a published Collaboration has been returned to the DOC Planning Contact "Abigail Joyce" by the CRS Reviewer "hoffmanela@nih.gov"
    Then the Collaboration shows as "Returned to DOC" in the Submissions page

  @SS-3895 @SS-3936 @bucurgb @Regression @selenium
  Scenario: Verifying "Please Specify" and "Fiscal Year" field values by the Program Staff
    Given a published Collaboration has been returned to the DOC Planning Contact "Abigail Joyce" by the CRS Reviewer "hoffmanela@nih.gov"
    When the DOC Planning Contact "Abigail Joyce" fills out the "Please specify" and "Fiscal Year" field
    And returns the Collaboration to the Program Staff
    Then the "Please specify" and "Fiscal Year" field values are not cleared and are required

  @SS-3895 @SS-3936 @bucurgb @Regression @selenium
  Scenario: Verifying the options for "Please Specify" field
    Given a published Collaboration has been returned to the DOC Planning Contact "Abigail Joyce" by the CRS Reviewer "hoffmanela@nih.gov"
    When the DOC Planning Contact "Abigail Joyce" fills out the "Please specify" and "Fiscal Year" field
    And returns the Collaboration to the Program Staff
    Then the options available for the "Please specify" field are "Edited", "No change", "Ended", and "Not led by NCI"

  @SS-3895 @SS-3936 @bucurgb @Regression @selenium
  Scenario: Verifying the status of submitted Collaboration
    Given a Collaboration has been submitted to the DOC Planning Contact
    Then the submitted Collaboration shows as "Under Review" in the Submissions page

  @SS-3895 @SS-3936 @SS-3944 @SS-3982 @SS-3943 @SS-3986 @bucurgb @Regression @selenium
  Scenario: Verifying the article is incremented one major version number
    Given a Collaboration has been submitted by the Program Staff Member to the DOC Planning Contact "Abigail Joyce" who submits to CRS Reviewer "hoffmanela@nih.gov" for publishing
    When a published Collaboration has been returned to the Doc Planning Contact
    And a published Collaboration has been returned to the Program Staff by Doc Planning Contact "Abigail Joyce" with the article version number as "Version 1.0 - DOC Version"
    And the Program Staff resubmits the article to the DOC Planning Contact
    And the DOC Planning Contact "Abigail Joyce" resubmits the article to the CRS Reviewer "hoffmanela@nih.gov"
    Then the article is incremented one major version number as "Version 2.0 -"
    And check that email is not received by Doc Planning Contact "Abigail Joyce"

  @SS-3939 @SS-3894 @bucurgb @Regression @selenium
  Scenario: Verifying the notification is send to the DOC Planning Contact
    Given a published Collaboration is returned to the DOC Planning Contact "Abigail Joyce" by CRS Reviewer "hoffmanela@nih.gov"
    And the DOC Planning Contact "Abigail Joyce" resubmits the submission
    When the CRS Reviewer "hoffmanela@nih.gov" returns the submission once more
    Then a notification is sent to the DOC Planning Contact

  @SS-3939 @SS-3894 @bucurgb @Regression @selenium
  Scenario: Verifying the Collaboration submission return to Program Staff in the same DOC
    Given a DOC Planning Contact "Abigail Joyce" creates a Collaboration submission
    Then they are able to return the submission to a Program Staff in the same DOC

  @SS-3939 @SS-3894 @bucurgb @Regression @selenium
  Scenario: Verifying the Collaboration "Returned to Staff Member" in the Submission page
    Given a Collaboration has been returned to a Program Staff by DOC Planning Contact "Abigail Joyce"
    Then the Collaboration shows as "Returned to Staff Member" in the Submission page

  @SS-3939 @SS-3894 @bucurgb @Regression @selenium
  Scenario: Verifying the author will show as the Program Staff user who originally created the Submission
    Given a published Collaboration started by a Program Staff has been returned to the DOC Planning Contact "Abigail Joyce" by CRS Reviewer "hoffmanela@nih.gov"
    And the DOC Planning Contact "Abigail Joyce" returns the Collaboration to the Program Staff
    Then the author will show as the Program Staff user who originally created the Submission

  @SS-3939 @SS-3894 @bucurgb @Regression @selenium
  Scenario: Verifying the DOC Planning Contact are able to return the Collaboration to a Program Staff user
    Given DOC Planning Contact "Abigail Joyce" creates a Collaboration
    Then they are able to return the Collaboration to a Program Staff user

  @SS-3454 @SS-3362 @bucurgb @Regression @selenium
  Scenario: Verifying Publish only filter
    Given a DOC Planning Contact "Abigail Joyce" is on the CRS Knowledge Management System home page
    When selecting the Published Only checkbox
    Then the DOC Planning Contact is able to see only published submissions