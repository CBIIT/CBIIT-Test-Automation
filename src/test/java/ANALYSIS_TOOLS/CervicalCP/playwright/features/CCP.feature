Feature: These are the scenarios that are under the Run Scenario tab on Cervical Cancer Prevention

  @Smoke @Regression @matakevin @NCIATWP-6681 @playwright
  Scenario: Implement translation to Spanish - PW
    Given the user is on the CCP home page
    Then the translation drop down is displayed

  @Smoke @Regression @matakevin @NCIATWP-6966 @playwright
    Scenario: About page - PW
    Given the user is on the CCP home page
    Then the navbar reads "Home", "About", "Run Scenario", "Compare Scenario" in order

  @Smoke @Regression @matakevin @NCIATWP-6996 @playwright
  Scenario: Dynamic content on the Run Scenario tab - PW
    Given the user is on the Run Scenario tab on Cervical CP
    When the user inputs "10000" for the target population
    And move the Percent screening coverage to ten percent
    Then the results section displays "Approximately 200 (Pap test) screening tests, NA triage tests, and 0 diagnostic tests will be required. 0 women will require treatment. 0.0% of women are possibly overtreated."

  @Progression @matakevin @NCIATWP-6596 @playwright
    Scenario: Test Cervical CP - Add a second pie chart - PW
    Given the user is on the Run Scenario tab on Cervical CP
    When the user inputs "10000" for the target population
    Then the first pie chart is named "Population with precancer in one year" is displayed
    When clicks on Triage checkbox
    And clicks Colposcopy checkbox
    Then the "Impact on Cervical Precancer and Impact on the Population Targeted for Screening" is displayed

  @Smoke @Regression @matakevin @NCIATWP-7967 @playwright
  Scenario: Test Cervical CP - Triage and Colposcopy slider are flipped - PW
    Given the user is on the Run Scenario tab on Cervical CP
    When the user inputs "10000" for the target population
    And sets all sliders to "100" percent
    When the Triage slider is moved to "0"
    Then the Colposcopy value is still "0"

  @inProgress @matakevin @NCIATWP-6596 @playwright
  Scenario: Verify compare scenario functionality
    Given the user is on the Compare Scenarios tab
    When the user adds "Compare Scenario 1.scenario", "Compare Scenario 2.scenario", "Compare Scenario 3.scenario" scenario files
    Then the "Scenario Assumptions" link is displayed

  @inProgress @forCoverage @NEEDTOCREATEONJIRA
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