Feature: These are the scenarios that are under the Run Scenario tab on Cervical Cancer Prevention

  @Smoke @matakevin @NCIATWP-6681 @playwright
  Scenario: Implement translation to Spanish - PW
    Given the user is on the CCP home page
    Then the translation drop down is displayed

  @Smoke @matakevin @NCIATWP-6966 @playwright
    Scenario: About page - PW
    Given the user is on the CCP home page
    Then the navbar reads "Home", "About", "Run Scenario", "Compare Scenario" in order

  @Smoke1 @matakevin @NCIATWP-6996 @playwright
  Scenario: Dynamic content on the Run Scenario tab - PW
    Given the user is on the Run Scenario tab on Cervical CP
    When the user inputs "10000" for the target population
    And move the Percent screening coverage to ten percent
    Then the results section displays "Approximately 200 (Pap test) screening tests, NA triage tests, and 0 diagnostic tests will be required. 0 women will require treatment. 0.0% of women are possibly overtreated."

  @Progression @matakevin @NCIATWP-6596 @playwright
    Scenario: Test Cervical CP - Add a second pie chart - PW
    Given the user is on the Run Scenario tab on Cervical CP
    When the user enters 10000 for number of people in the target population
    Then the first pie chart is named "Population with Precancer" is displayed
    When clicks on Triage checkbox
    And clicks Diagnosis checkbox
    Then the "Impact on Cervical Precancer and Impact on the Population Targeted for Screening" is displayed

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