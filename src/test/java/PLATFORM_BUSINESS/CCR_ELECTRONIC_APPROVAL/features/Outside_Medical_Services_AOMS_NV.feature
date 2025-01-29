Feature: Outside Medical Services (AOMS) Scenarios in Native View for CCR Electronic Approval
  Description: This Feature file contains Outside Medical Services (AOMS) Scenarios in Native View for CCR Electronic Approval

  @CCREAPPROV-32 @Chaudhryma @Regression @playwright
  Scenario: Test Add CCROCD EA Native View & Module for Authorization for Payment of Outside Medical Services (AOMS)
    Given I am an  electronic approval (EA) Fulfiller "Aubrey Wachter"
    When I navigate to the native view
    Then I should see that I have access to the "CCR Electronic Approvals" module
    And verify that module contains "Tickets", "Create New", "Assigned to Me", "Unassigned", "Patient Travel Exceptions", "04-C-0165 Requests", "AOMS (Authorization of Outside Medical Services)", and "All"
    And when I click on "Create New" and select "Authorization of Outside Medical Services" for Form Type
    Then I should see that the following mandatory fields appear in the Request Details Section:

      """
      Form Type
      Patient Name
      MRN
      AMOS Protocol ID
      Date(s) of Service
      Team Point of Contact (POC)
      POC Email Address
      Quote/Estimate from Vendor
      Vendor Name
      Vendor Point of Contact (POC)
      Vendor POC Contact Information
      List of Requested Service(s)
      Detailed Justification for Why Service(s) is/are Required
      """