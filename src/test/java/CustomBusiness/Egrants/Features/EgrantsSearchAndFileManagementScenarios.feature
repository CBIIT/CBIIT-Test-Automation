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
    And searches for "125123" on Add New Document page
    And selects grant year 18
    And selects category as Application File
    And passes "Test File" as subcategory
    And clicks on Locate File and Upload tab
    And uploads a file
    Then verifies the success message "Done! New document has been created"
    And clicks on uploaded document

  @UpdateDocumentCategory @nesarh2 @Regression
  Scenario: Test updating document category
    And searches for grant "CA125123"
    And selects grant year 18 from Years
    When clicks on update icon
    And selects Funding from Category dropdown
    And selects Transition Approval as Subcategory
    Then clicks on update icon to submit the changes

  @ReplaceExistingFile @nesarh2 @In-Progress
  Scenario: Test replacing an existing file
    And searches for grant "CA125123"
    And selects grant year 18 from Years
    When clicks on Upload icon
    #And clicks on Locate File and Upload tab
    #And uploads a file
    #Then verifies the success message "Done! New document has been created"
    #And clicks on Check Document button to view the uploaded document

  @DeleteUploadedFile @nesarh2 @Regression
  Scenario: Test deletion of an uploaded file
    And searches for grant "CA125123"
    And selects grant year 18 from Years
    And expands the document details and clicks on Delete button
    Then User clicks on OK button to confirm Deletion

  @InstitutionalFileUpload @nesarh2 @Regression
  Scenario: Test Institutional file upload
    And clicks on Institutional Files menu
    And clicks on AAVOGEN, INC.
    And clicks on Create New Document link
    And selects Organization Document from category dropdown
    And provides "Test Document" as a subcategory
    And clicks on Locate File and Upload tab
    And uploads a file
    Then clicks on Create New button

  @InstitutionalFileDelete @nesarh2 @Progression
  Scenario: Test deletion of an uploaded Institutional file

  @VerifySoftDeletedYear @nesarh2 @Progression
  Scenario: Verify soft deleted years are not displayed