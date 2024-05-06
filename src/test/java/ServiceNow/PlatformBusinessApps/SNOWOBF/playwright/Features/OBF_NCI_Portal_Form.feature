Feature: SNOWOBF Portal form Scenarios
  Description: This Feature file contains SNOWOBF OBF Systems Support form Scenarios

  @SNOWOBF-11 @SNOWOBF-2 @Chaudhryma @Regression
  Scenario: Test Create OBF Helpdesk Link on NCI ServiceNow Homepage
    Given I am an authenticated CBIIT user
    When I navigate to the NCI ServiceNow homepage 'OBF Systems Support' portal form
    Then I should see that I can navigate to the OBF Systems Support application.

  @SNOWOBF-10 @Chaudhryma @Regression
  Scenario:Test Add Catalog Item description Text
    Given I am an authenticated CBIIT user
    When I navigate to the NCI ServiceNow homepage 'OBF Systems Support' portal form
    Then I show see the following Text at the top of the catalog item
  """
  The NCI Office of Budget and Finance maintains several systems and tools relating to budget processes. This form is to request support for these tools.

  Questions about the NCI budget should be directed to the appropriate DOC contact as listed here: https://nih.sharepoint.com/sites/NCI-OBF/SitePages/NCI-OBF-Team-Contacts.aspx
  """