Feature:  Parking Garage (SG Parking Permit (Non-NCI Staff Only)) Catalogue Item form Scenarios
  Description: This Feature file contains Parking Garage (SG Parking Permit (Non-NCI Staff Only)) Catalogue Item form Scenarios

  @OSFMPARK-7 @OSFMPARK-31 @Chaudhryma @Regression @playwright
  Scenario: Test Create a Catalog Item for Parking Garage Request
    Given the Parking Garage Access Request Catalog Item
    When users are attempting to access it to create a request
    Then it is available on the NCI ServiceNow Portal via the following breadcrumb path: Services >> Enterprise IT Services >> Facilities >> "SG Parking Registration (Non-NCI Staff Only)"

  @OSFMPARK-7 @OSFMPARK-31 @Chaudhryma @Regression @playwright
  Scenario: [Negative] Test Update Name of Parking Garage Access Request
    Given the Parking Garage Access Request Catalog Item
    When users are attempting to access it to create a request
    Then verify that "Parking Garage Access Request" name does not exist on the NCI ServiceNow Portal via the following breadcrumb path: Services >> Enterprise IT Services >> Facilities
    And it has renamed to 'SG Parking Registration (Non-NCI Staff Only)'

  @OSFMPARK-93 @Chaudhryma @Regression @playwright
  Scenario: Test Add Short Description for the Catalog Item
    Given a Non-NCI user "Aaliya Taranath" access the SG Parking Registration (Non-NCI Only) catalog item
    When the user is on the portal of the SG Parking Registration (Non-NCI Only) catalog item
    Then the user verifies that the verbiage "Request PIV card access to the Shady Grove parking garage for non-NCI staff." should appear just below the catalog name Header