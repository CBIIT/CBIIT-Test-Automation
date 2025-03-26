Feature:  Parking Garage (SG Parking Permit (Non-NCI Staff Only)) Catalogue Item form Scenarios
  Description: This Feature file contains Parking Garage (SG Parking Permit (Non-NCI Staff Only)) Catalogue Item form Scenarios in Native View

  @OSFMPARK-8 @OSFMPARK-31 @Chaudhryma @Regression @playwright
  Scenario: Test Create a 'Reports' User Group
    Given the "OSFM Parking Garage Access Requests" request
    When defining which users should be responsible for reports
    Then a group called "Parking Garage Request Report Users" is created
    And contains the following users:"Tsegaye Ayele","Melvin Pirkle","Shane Hebert","Delimo Samuel"
    And "Shane Hebert" is the Group Manager
    And "Delimo Samuel" s the Group Co-Manager

  @OSFMPARK-9 @OSFMPARK-31 @Chaudhryma @Regression @playwright
  Scenario:Test Create a 'Fulfiller' User Group
    Given the "OSFM Parking Garage Access Requests" request
    When defining which users should be responsible for reports
    Then a Fulfillers group called "Parking Garage Request Fulfillers" is created
    And contains the following users:"Tsegaye Ayele","Melvin Pirkle","Shane Hebert","Delimo Samuel"
    And "Shane Hebert" is the Group Manager
    And "Delimo Samuel" s the Group Co-Manager