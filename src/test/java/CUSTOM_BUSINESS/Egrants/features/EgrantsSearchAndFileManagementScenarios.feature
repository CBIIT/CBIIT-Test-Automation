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

  @EGRANTS-591 @ReplaceExistingFile @nesarh2 @selenium @In-Progress
  Scenario: Test replacing an existing file
    And searches for grant "CA125123"
    And selects grant year 18 from Years
    When clicks on Replace icon
    And clicks on Locate File and Upload tab
    And selects a replacement file
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

  @TestDocumentFiltering @nesarh2 @selenium @Regression
  Scenario: Test document filter
    And searches for grant "CA125123"
    And selects 2 for number grant years
    And clicks on category filter icon
    And selects Activation Notice and Application File from the category dropdown
    And clicks on search icon
    Then verifies the filtered documents are displayed

  @MoveDocumentToDifferentGrants @nesarh2 @selenium @Regression
  Scenario: Test moving a document to different grant years
    And searches for grant "CA125123"
    And selects grant year 18 from Years
    And clicks on Update icon for a document
    And selects grant year 5P30CA125123-17 from the Grant dropdown
    And selects the current date
    Then clicks on Update button to move the document to a different grant year

  @UploadFundingDocument @nesarh2 @selenium @Regression
  Scenario: Test uploading a funding document
    And searches for grant "CA125123"
    And expands all grant years
    And selects grant year 18 from list of Years
    And clicks on Add Funding Document button
    And selects category as Co-Funding Secondary
    And passes "Test funding file" as Funding Subcategory
    And selects the current date
    And clicks on Locate File and Upload tab
    And uploads a file
    Then verifies the success message "Done! Funding document has been uploaded"

  @MoveSupplementApplication @nesarh2 @selenium @In-Progress
  Scenario: Test moving a supplement application
    And searches for grant "CA125123"
    And expands all grant years
    And selects grant year 18 from list of Years
    #And clicks on Supplement sandbox on the grant header
    And selects the Application File from the list
    And selects Pay in Parent from Process Type dropdown
    Then clicks on Move to Parent button to move the application

  @EGRANTS-374 @AddingLabelSupplementYear @nesarh2 @selenium @Regression
  Scenario: Test adding a label to a supplement year
    And searches for grant "CA125123"
    And expands all grant years
    And selects grant year 17S1 from list of Years
    And clicks on Add Request Name button
    And provides "Automated" as the label
    And clicks on Save Request Name button
    Then verifies the added label

  @EGRANTS-374 @EditLabelSupplementYear @nesarh2 @selenium @Regression
  Scenario: Test editing a label to a supplement year
    And searches for grant "CA125123"
    And expands all grant years
    And selects grant year 17S1 from list of Years
    And clicks on Edit Request Name button
    And provides new "Edited LBL" as the label
    And clicks on Save Request Name button
    Then verifies the edited label

  @EGRANTS-374 @DeleteLabelSupplementYear @nesarh2 @selenium @Regression
  Scenario: Test deleting a label to a supplement year
    And searches for grant "CA125123"
    And expands all grant years
    And selects grant year 17S1 from list of Years
    And clicks on Edit Request Name button
    Then clicks on Delete button to delete the label

  @AssignPA @nesarh2 @selenium @Regression
  Scenario: User assigns a PA number to a grant number
    Given User is on the Admin menu
    And User selects Supplements from the dropdown
    And the user clicks on Edit button
    And the user provides "PA-15-322" in the PA field
    Then the user clicks on Save button and confirms the changes

  @DeleteNotification @nesarh2 @selenium @Regression
  Scenario: User deletes an eRA Notification for a grant year
    Given User is on the Admin menu
    And User selects Supplements from the dropdown
    And the user clicks on eRA notification tab
    And the user clicks on Delete button
    Then the user confirms deletion of the notification

  @EGRANTS-629 @ResendNotification @nesarh2 @selenium @Regression
  Scenario: User resends the notification to PD and SPEC for a grant year
    Given User is on the Admin menu
    And User selects Supplements from the dropdown
    And the user clicks on eRA notification tab
    And the user clicks on Review button
    And the user clicks on Resend This Notification button
    And the user selects "TO" as the PD Notification Type
    And the user selects "TESTPD" as the PD Position
    And the user provides "Test Program Director" as the PD Name
    And the user provides "testpd@test.com" as the PD Email address
    Then the user clicks on Add button
    And the user selects "CC" as the SPEC Notification Type
    And the user selects "TESTSPEC" as the SPEC Position
    And the user provides "Test Specialist" as the SPEC Name
    And the user provides "testspec@test.com" as the SPEC Email address
    Then the user clicks on Resend Notification button

  @EGRANTS-629 @CreateNewExceptionCode @nesarh2 @selenium @Regression
  Scenario: User creates a new exception code
    Given User is on the Admin menu
    And User selects Grants Archival Process from the dropdown
    And the user clicks on New Exception Code tab
    And the user provides "Test Exception Code" as the Exception Code
    And the user provides "Test Exception Description" as the Exception Details
    Then the user clicks on Create New Exception Code button to confirm the creation

  @EGRANTS-629 @DeleteAnExceptionCode @nesarh2 @selenium @Regression
  Scenario: User deletes an new exception code
    Given User is on the Admin menu
    And User selects Grants Archival Process from the dropdown
    And the user clicks on New Exception Code tab
    Then the user clicks on Delete Exception button to delete Test Exception Code

  @EGRANTS-661 @FileUpload @alenaminsk @selenium @Regression
  Scenario: Test document upload
    And clicks on Add Document button
    And searches for "125123" on Add New Document page
    And selects grant year 18
    And selects category as Application File
    And passes "Test File" as subcategory
    And clicks on Locate File and Upload tab
    And User can see Drag and Drop button displayed
    And User can see Locate File And Upload button displayed
    And User can see Upload via Email button displayed
    And User can see Add button
    And User can see Convert to PDF and Add button
    And uploads a file
    And User clicks Convert to PDF and Add button
    Then verifies the success message "Done! New document has been created"
    And clicks on uploaded document

  @EGRANTS-685 @FileUpload @alenaminsk @selenium @Regression
  Scenario: Replace Document page
    And searches for grant "CA125123"
    And expands all grant years
    And selects grant year 17S1 from list of Years
    And User clicks on Upload button for document Activation Notice: test convert
    And User can see that page title is "Replace Document"
    And User can see Grant field displayed
    And User can see Category field displayed
    And User can see Date field displayed
    And User can see Drag and Drop button displayed


  @EGRANTS-677 @FileUpload @alenaminsk @selenium @Regression
  Scenario: Upload Doc file
    And clicks on Add Document button
    And searches for "125123" on Add New Document page
    And selects grant year 18
    And selects category as Application File
    And User clicks on Locate File and Upload tab
    And User uploads a single file with doc extension
    And User clicks Convert to PDF and Add button
    Then verifies the success message "Done! New document has been created"
    And clicks on uploaded document

  @EGRANTS-615 @FileUpload @alenaminsk @selenium @Regression
  Scenario: UI verification for Document Upload via Email
    And clicks on Add Document button
    And searches for "125123" on Add New Document page
    And selects category as Application File
    And User clicks on Upload via Email tab
    And User can verify the warning is displayed
    And User verifies Upload Via Email button is displayed
    When User clicks on Return To eGrants File
    Then User returns to eGrants File

  @EGRANTS-616 @FileUpload @alenaminsk @selenium @Regression
  Scenario: Grant page verification
    And searches for grant "CA125123"
    And expands all grant years
    And selects grant year 17S1 from list of Years
    And User clicks Add Document Grant button
    And selects category as Application File
    And User clicks on Locate File and Upload tab
    And User uploads a single file with doc extension
    And User clicks Convert to PDF and Add button
    When User clicks on Return To eGrants File
    And User can see Add Document button
    And User can see Add Funding Document button
    And User can see Document name column header
    And User can see Date column header
    And User can see Pages column header
    And User can see Upload column header
    And User can see Update column header

  @EGRANTS-693 @FileUpload @alenaminsk @selenium @Regression
  Scenario: Upload pdf file by Adding Only
    And clicks on Add Document button
    And searches for "125123" on Add New Document page
    And selects grant year 18
    And selects category as Application File
    And User clicks on Locate File and Upload tab
    And User uploads a docx file by clicking Add button
    Then verifies the success message "Done! New document has been created"
    And clicks on uploaded document

  @EGRANTS-693 @FileUpload @alenaminsk @selenium @Regression
  Scenario: Upload pdf file by Adding Only
    And clicks on Add Document button
    And searches for "125123" on Add New Document page
    And selects grant year 18
    And selects category as Application File
    And User clicks on Locate File and Upload tab
    And User uploads a doc file by clicking Add button
    Then verifies the success message "Done! New document has been created"
    And clicks on uploaded document