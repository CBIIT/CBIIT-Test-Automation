Feature: NERD/OGCR Entry Page Scenarios

  @SS-5221 @SS-5238 @chaudhryma @Regression
Scenario:Test Update Special Topic dropdown list on the OGCR>>Add New Entry page
  Given a user is in the OGCR Admin Group
  When the user goes to the OGCR Knowledge Base
  And the OGCR user clicks the Add New Entry button
  Then I should Only see the following options in the Special Topic field dropdown list "15x25/Payline", "Big data/Data sharing", "CCDI", "COVID-19", "Health Disparities", "Low-Dose Radiation", "MCD/Early Detection", "Moonshot", "Pediatric", "Rare", "STAR Act", "Survivorship"
