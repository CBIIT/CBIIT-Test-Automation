Feature: NERD/OGCR Entry Page Scenarios

Scenario:Test Update Special Topic dropdown list on the OGCR>>Add New Entry page
Given I am an authenticated NERD OGCR user,
When I click the "+Add New Entry" link from the CRS Knowledge Management System>>Home>>OGCR page,
And I am navigated to the Add New Entry page,
Then I should Only see the following options in the Special Topic field dropdown list "15x25/Payline", "Big Data/Data Sharing", "CCDI", "COVID-19", "Health Disparities", "Low-Dose Radiation", "MCD/Early Detection", "Moonshot", "Pediatric", "Rare", "STAR Act", "Survivorship"