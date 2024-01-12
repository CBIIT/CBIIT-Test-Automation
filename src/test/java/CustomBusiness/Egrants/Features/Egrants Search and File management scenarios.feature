Feature: This Feature File  contains Search and file upload scenarios
Background: common steps
Given User is logged in the application and is on the landing page

  @Search @nesarh2 @Regression
  Scenario: Test Egrants main Search functionality
    And searches for "CA125123"
    And verifies the Project title as BAYLOR COLLEGE OF MEDICINE CANCER CENTER-CANCER CENTER SUPPO…
    And verifies the Institution name as BAYLOR COLLEGE OF MEDICINE
    And clicks on year 18
    And verifies "5P30CA125123-18" is the landed grant folder

  @FileUpload @nesarh2 @Regression
  Scenario: Test document upload
    And clicks on Add Document button
    And searches for grant "125123"
    And selects grant year 18
    And selects category as Application File
    And passes "Test File" as subcategory
    And clicks on Locate File and Upload tab
    And uploads a file
    Then verifies the success message "Done! New document has been created"
    And clicks on uploaded document

  @InstitutionalFileUpload @nesarh2 @Regression @Progression
  Scenario: Test Institutional file upload
    And clicks on Institutional Files menu
    And clicks on AAVOGEN, INC.
    And clicks on Create New Document link
    And selects Organization Document from category dropdown
    And provides "Test Document" as a subcategory
    And clicks on Locate File and Upload tab
    And uploads a file
    Then clicks on Create New button