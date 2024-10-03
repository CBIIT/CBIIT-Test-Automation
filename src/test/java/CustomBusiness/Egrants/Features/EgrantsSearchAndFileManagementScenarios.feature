Feature: This Feature File  contains Search and file upload scenarios
Background: common steps
Given User is logged in the application and is on the landing page

  @Search @nesarh2 @selenium @Regression
  Scenario: Test Egrants main Search functionality
    And searches for "CA125123"
    And verifies the Project title as BAYLOR COLLEGE OF MEDICINE CANCER CENTER-CANCER CENTER SUPPO…
    And verifies the Institution name as BAYLOR COLLEGE OF MEDICINE
    And clicks on year 18
    And verifies "5P30CA125123-18" is the landed grant folder

  @FileUpload @nesarh2 @selenium @Regression
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

  @EGRANTS-591 @UpdateDocumentCategory @nesarh2 @selenium @Regression
  Scenario: Test updating document category
    And searches for grant "CA125123"
    And selects grant year 18 from Years
    When clicks on update icon
    And selects Funding from Category dropdown
    And selects Transition Approval as Subcategory
    Then clicks on update icon to submit the changes

  @EGRANTS-591 @ReplaceExistingFile @nesarh2 @selenium @Regression
  Scenario: Test replacing an existing file
    And searches for grant "CA125123"
    And selects grant year 18 from Years
    When clicks on Replace icon
    And clicks on Locate File and Upload tab
    And uploads a file
    Then verifies the success message "Done! New document has been created"
    And clicks on Check Document button to view the uploaded document

  @EGRANTS-591 @DeleteUploadedFile @nesarh2 @selenium @Regression
  Scenario: Test deletion of an uploaded file
    And searches for grant "CA125123"
    And selects grant year 18 from Years
    And expands the document details and clicks on Delete button
    Then clicks on OK button to confirm Deletion

  @InstitutionalFileUpload @nesarh2 @selenium @Regression
  Scenario: Test Institutional file upload
    And clicks on Institutional Files menu
    And clicks on AAVOGEN, INC.
    And clicks on Create New Document link
    And selects Organization Document from category dropdown
    And provides "Test Document" as a subcategory
    And clicks on Locate File and Upload tab
    And uploads a file
    Then clicks on Create New button

  @EGRANTS-591 @InstitutionalFileCategoryUpdate @nesarh2 @selenium @Regression
  Scenario: Test updating category and subcategory for an Institutional File
    And clicks on Institutional Files menu
    And clicks on AAVOGEN, INC.
    And clicks Update icon for an uploaded Organization Document
    And selects Follow-Up as the new category
    And enters Follow-up facility visit Test as subcategory
    Then clicks on Save Update button

  @EGRANTS-591 @InstitutionalFileDelete @nesarh2 @selenium @Regression
  Scenario: Test deletion of an uploaded Institutional file
    And clicks on Institutional Files menu
    And clicks on AAVOGEN, INC.
    Then clicks on Delete button to delete an uploaded document

  @EGRANTS-622 @CreateGrantYear @nesarh2 @selenium @Regression
  Scenario: Test adding a grant year
    And clicks on Add Document button
    And searches for "125123" on Add New Document page
    And selects create grant year from Grant dropdown
    And selects type 3 as the grant type
    And selects P30 as the activity code
    And enters 21 as the Year
    And enters S1 as the Suffix Code
    And clicks on Create New button to create grant year
    Then verifies the grant year is created

  @EGRANTS-224 @AuditFileDownload @nesarh2 @selenium @Regression
  Scenario: Test audit file download
    And activates the download mode
    And searches for grant "CA125123"
    And selects grant year 18S1 from Years
    And selects all files within the grant folder
    And clicks on Download button
    Then verifies the success icon for downloaded files