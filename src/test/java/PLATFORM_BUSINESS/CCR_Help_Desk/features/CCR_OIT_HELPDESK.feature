Feature: CCR/OIT HelpDesk testing

  @CCRHELPDES-153 @chaudhryma @Regression @playwright
  Scenario: Test Allow CCR OIT Help Desk access for all NIH users
    Given I am an authenticated NCI Frederick user 'Ellen Volkmar',
    When I go to the CCR OIT Help Desk catalog item,
    Then I should be able to access the help desk to submit a request.

  @CCRHELPDES-168 @chaudhryma @Regression @playwright
  Scenario: Test Enhancement CCR OIT - Add additional logic to request form when Request Type = Protocol Build
    Given I am an authenticated user "Rohit Paul" on the CCR OIT Help Desk form
    And I have selected Labmatrix for Application
    When I select Protocol Build for Request Type
    Then I will see the Required fields, "Principal Investigator" and "Protocol Number"

  @CCRHELPDES-173 @chaudhryma @Regression @playwright
  Scenario: Test CCR/OIT Enhancement LabMatrix - Request Type = General Support
    Given I am an authenticated user "Rohit Paul" on the CCR OIT Help Desk form
    And I have selected Labmatrix for Application
    When I select General Support for Request Type
    Then I will see the additional optional field being displayed "Protocol/Study"