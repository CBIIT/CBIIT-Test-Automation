Feature: FAST ATO testing

  @FASTATO
  Scenario: Fast ATO
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "All" package
    Then User clicks on new button to add role
    And User selects the system as "DRAP"
    And User selects the Application hosting solution as "NCI Cloud One"
   Then User clicks on the contacts tab
    And User selects the dates
    And User enters the note as "Test Automation"
    And User clicks on submit button
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    And User will change the system owner of the first package to "Satya Gugulothu"
    Given User opens fast ato app in browser
    When User clicks on "IN PROGRESS" tab of fast ato
    And User clicks on ato system
    And User verifies all system details
    Given User opens ATO application in browser
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "In Progress" package
    And User clicks on package link
    And User enters renewal due date as "today"
    And User will select the state as "Complete"
    And User clicks on save button without frame
    Given user opens the fast ato page

  @HeaderValidate
  Scenario: User validates the header
    Given user opens the fast ato page
    Then User navigates to fast ato page and validates the header
    
    
   
    @ValidatedSelfAttestedStatus
    Scenario: Valdiate self attested status
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "All" package
    Then User clicks on new button to add role
    And User selects the system as "TPW"
    And User selects the Application hosting solution as "NCI Cloud One"
    Then Switch to iframe id "gsft_main"
    And User clicks on save button without frame
    And User will select the state as "In progress"
    And User clicks on save button without frame
    Then go back and sort packages
    Then Change system owner of first package to "Satya Gugulothu" from home page
    Then User opens fast ato app in browser
    When User clicks on "IN PROGRESS" tab of fast ato
    Then user verifies all the forms in "TPW" package
    Given User opens Ato application url "https://service-test.nci.nih.gov/ncisp"
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "All" package
    Then Switch to iframe id "gsft_main"
    Then Validate the status of the first package as "Self-Attested"
    
    @CompleteATOSteps
    Scenario: Valdiate self attested status
    Given User opens ATO application in browser
    When User will login to ato application
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "All" package
    Then User clicks on new button to add role
    And User selects the system as "CLASS"
    And User selects the Application hosting solution as "NCI Cloud One"
    Then Switch to iframe id "gsft_main"
    And User clicks on save button without frame
    And User will select the state as "In progress"
    And User clicks on save button without frame
    Then User clicks on the contacts tab
    And User selects the dates
    And Set approved By to "Satya Gugulothu"
    And User clicks on save button without frame
    Then go back and sort packages
    Then Change system owner of first package to "Satya Gugulothu" from home page
    Then User opens fast ato app in browser
    When User clicks on "IN PROGRESS" tab of fast ato
    Then user verifies all the forms in "CLASS" package but edits the last one
    Given User opens ATO application in browser
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "All" package
    Then Switch to iframe id "gsft_main"
    Then Sort packages
    Then goto first package and click on verify button
    Then User opens fast ato app in browser
    When User clicks on "IN PROGRESS" tab of fast ato
    Then user verifies all the forms in "CLASS" package
    Then verify all forms are complete and take screenshot
     Given User opens ATO application in browser
    Then User clicks on "Native View" in header menu
    And User filters value as "ATO"
    And User clicks on "All" package
    Then Switch to iframe id "gsft_main"
    Then Sort packages
    Then complete the pending approvals for first package
    Then CLick On Renew Button
    
    