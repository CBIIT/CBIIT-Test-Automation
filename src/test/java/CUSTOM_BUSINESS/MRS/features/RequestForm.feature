Feature: Request Form Flow

Background: common steps
Given User is logged in MRS application

@SubmitRequestForm @NESARH2 @playwright @Regression
Scenario: Submit a request form on behalf of another person
  When User clicks on Create Request button
  And User enters the "Creating a request through automated test" as Request Title
  And User enters "Lam, Tram" in Requestor field
  And User enters "Team Member" as the requestor title
  And User selects "Yes" for Do you want to submit On Behalf Of another NCI Division?
  And User provides "NCI DCCPS BRP" in the organization field for which they are working on behalf of
  And User selects "Original Journal Article" for Publication Type
  And User enters "Test Journal" in Journal or Book Name
  And User selects "Yes" for any associated fees
  And User enters "100" in the Amount field
  And User selects "Ellison, Gary" as NIH Authors
  And User enters "QA Team Members" as Non NIH Authors
  And User selects "NCI Researchers" as the Author Type
  And User selects No for the BIAS question
  And User selects "NCI CCR CBL" as NIH Represented Organizations
  And User enters "12345" as the Grants or Contract Number
  And User enters "None" as the Journal Impact Factor
  And User selects "No" for Does this Request address any high profile or controversial content?
  And User selects "No" for Does this manuscript involve clinical trial information?
  And User clicks on Choose File button to upload a document
  And User selects "Serial" as Approval Type
  And User selects "Buckley, Denise" as additional approver
  Then User clicks on Submit for Verification button

  @SubmitRequestFormForYourself @NESARH2 @playwright @Regression
  Scenario: Submit a request form for yourself
    When User impersonates as "ELLISON, GARY"
    And User clicks on Create Request button
    And User enters the "Creating a request through for myself automated test" as Request Title
    And User enters "ELLISON, GARY" in Requestor field
    And User enters "Team Member" as the requestor title
    And User selects "No" for Do you want to submit On Behalf Of another NCI Division?
    And User selects "Reviews" for Publication Type
    And User enters "Test Reviews" in Journal or Book Name
    And User selects "No" for any associated fees
    And User selects "LAM, TRAM" as NIH Authors
    And User selects "Both NCI and External Researchers" as the Author Type
    And User selects No for the BIAS question
    And User selects "NCI DCCPS BRP BBPSB" as NIH Represented Organizations
    And User selects "Yes" for Does this Request address any high profile or controversial content?
    And User enters "Test explanation in the text area" as the explanation
    And User selects "Yes" for Does this manuscript involve clinical trial information?
    And User selects "Yes" for Does this manuscript or abstract involve a Clinical Study with a CTEP or NIH Trial?
    And User enters "CTEP12345" as the CTEP or NIH Clinical Trial Number
    And User selects "Yes" for Clinical Exemption: Is the study exempt from being considered human subjects research?
    And User clicks on Choose File button to upload a document
    And User selects "Parallel" as Approval Type
    Then User clicks on Submit for Approval button