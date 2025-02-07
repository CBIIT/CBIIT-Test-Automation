Feature: Outside Medical Services (AOMS) Scenario for CCR Electronic Approval
  Description: This Feature file contains Outside Medical Services (AOMS) Scenario for CCR Electronic Approval

  @CCREAPPROV-133 @Chaudhryma @Regression1 @playwright
  Scenario:Test Enhancement: Change "Requested For" (AMOS)
    Given I am an authenticated Electronic Approval user or a EA Fulfiller
    When I navigate to the AOMS Portal Form
#    Then I should see that "Requested For" is updated to "Principal Investigator (PI)"
#    And the Catalog name and Form Title for "Authorization for Payment of Outside Medical Services (AOMS)" is updated to "Outside Medical Services (AOMS)"

  @CCREAPPROV-134 @Chaudhryma @Regression @playwright
  Scenario:Test Change "Authorization of Payment Outside Med..." to "Outside Medical Services"
    Given I am an authenticated CBIIT User
    When I navigate to the "Services" > "CCR Services" > "Outside Medical Services (AOMS)"
    Then I should see that "Authorization for Payment of Outside Medical Services (AOMS)" Appication has been changes to: "Outside Medical Services (AOMS)"
    And the Form Title should reflect: "Outside Medical Services (AOMS)"