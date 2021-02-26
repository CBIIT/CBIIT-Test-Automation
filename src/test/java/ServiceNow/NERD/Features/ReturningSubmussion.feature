Feature: Ruturning published Collaboration by the CRS Rreviewer/DOC Planning Contact

  @Smoke @SS-3937 @juarezds 
  Scenario: Verifying "Please Specify" and "Fiscal Year" field values
    Given a published Collaboration has been returned to the DOC Planning Contact by the CRS Reviewer
    Then the "Please specify" and "Fiscal Year" field values are cleared and are required

  @Smoke @SS-3937 @juarezds
  Scenario: Verifying status of Returned Collaboration in the Submissions page
    Given a published Collaboration has been returned to the DOC Planning Contact by the CRS Reviewer
    Then the Collaboration shows as "Returned to DOC" in the Submissions page

  @Smoke @SS-3936 @juarezds 
  Scenario: Verifying "Please Specify" and "Fiscal Year" field values by the Program Staff
    Given a published Collaboration has been returned to the DOC Planning Contact by the CRS Reviewer
    When the DOC Planning Contact fills out the "Please specify" and "Fiscal Year" field
    And returns the Collaboration to the Program Staff
    Then the "Please specify" and "Fiscal Year" field values are not cleared and are required

  @Smoke @SS-3936 @juarezds
  Scenario: Verifying the options for "Please Specify" field
    Given a published Collaboration has been returned to the DOC Planning Contact by the CRS Reviewer
    When the DOC Planning Contact fills out the "Please specify" and "Fiscal Year" field
    And returns the Collaboration to the Program Staff
    Then the options available for the "Please specify" field are "Edited", "No change", "Ended", and "Not led by NCI"

  @Smoke @SS-39361 @juarezds
  Scenario: Verifying the status of submitted Collaboration
    Given a Collaboration has been submitted to the DOC Planning Contact
    Then the submitted Collaboration shows as "Under Review" in the Submissions page

  @SS-3936 @Progression @juarezds
  Scenario: Verifying the article is incremented one major version number
    Given a published Collaboration has been returned to the Program Staff
    When the Program Staff resubmits the article to the DOC Planning Contact
    Then the article is incremented one major version number
