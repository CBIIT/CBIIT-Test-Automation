Feature: NERD/OGCR Entry Page Scenarios

  @SS-5221 @SS-5238 @chaudhryma @Regression
  Scenario:Test Update Special Topic dropdown list on the OGCR>>Add New Entry page
    Given a user is in the OGCR Admin Group
    When the user goes to the OGCR Knowledge Base
    And the OGCR user clicks the Add New Entry button
    Then I should Only see the following options in the Special Topic field dropdown list "15x25/Payline", "Big data/Data sharing", "CCDI", "COVID-19", "Health Disparities", "Low-Dose Radiation", "MCD/Early Detection", "Moonshot", "Pediatric", "Rare", "STAR Act", "Survivorship"

  @SS-5218 @SS-5253 @chaudhryma @Regression
  Scenario:Test Update OGCR Content Type dropdown list on the OGCR>>Add New Entry page
    Given a user is in the OGCR Admin Group
    When the user goes to the OGCR Knowledge Base
    And the OGCR user clicks the Add New Entry button
    Then I should Only see the following options in the OCGR Content Type dropdown list "-- None --", "Bill Summary/Text", "Biography" , "BRAIN Brief", "CACR", "Formal Correspondence", "GAO/OIG", "Hearing/Briefing/Visit Summary", "Informal Correspondence", "Preparatory Document", "Presentation/Legislative Update", "QFR", "Significant Item", "Technical Assistance", "Other"

  @NERDSNOW-34 @NERDSNOW-48 @chaudhryma @Regression
  Scenario: Test NERD OGCR - Match the "Member of Congress" dropdown list on both the OGCR Portal page and the New Entry Form page
    Given a user is in the OGCR Admin Group
    When the user goes to the OGCR Knowledge Base
    And clicks the "Member of Congress" Drop down filter
    Then All Drop Down field options are same as the Add New Entry form page for the Member of Congress field.
