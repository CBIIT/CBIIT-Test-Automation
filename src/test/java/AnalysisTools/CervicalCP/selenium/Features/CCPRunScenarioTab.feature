Feature: These are the scenarios that are under the Run Scenario tab on Cervical Cancer Prevention

  @Progression @matakevin @NCIATWP-6681
  Scenario: Implement translation to Spanish
    Given the user is on the CCP home pages
    Then the translation drop down displays

  @Progression @matakevin @NCIATWP-6966
    Scenario: About page
    Given the user is on the CCP home pages
    Then the navbar reads "Home", "About", "Run Scenario", "Compare Scenario" in order

  @Progression @matakevin @NCIATWP-6996
  Scenario: Dynamic content
    Given the user is on the Run Scenario tab on Cervical CP
    When the user inputs 10000 for the target population, move the percentages to 10% each
    Then the results section displays "Approximately 200 screening tests, N/A triage tests, and N/A diagnostic tests will be required. 20 women will require treatment. 1.0% of women are possibly overtreated."

@forCoverage @NEEDTOCREATEONJIRA
  Scenario: Ensure the CIN and NIC values are present in English and Spanish
#    Given the user is on Cervical CP Run Scenario page
#    When the user opens the "Cervical screening test chosen" menu
#    Then the "VIA" value displays
#    When the drop down is closed
#    Then the "Screening test specificity for CIN2/3 (NIC2/3)", and "Triage or diagnostic test sensitivity for CIN2/3 (NIC2/3)" values are displayed
#    Given the user is on Cervical CP Run Scenario page
#    When the language is changed to Espanol
#    When the user opens the "Prueba de tamizaje cervical elegida" menu
#    Then the "IVAA" value displays
#    When the drop down is closed
#    Then the "Sensibilidad de prueba de tamizaje para NIC2/3", and "Especificidad de prueba de tamizaje para NIC2/3", and "Especificidad de la prueba de triaje o diagnóstico para NIC2/3" values are displayed