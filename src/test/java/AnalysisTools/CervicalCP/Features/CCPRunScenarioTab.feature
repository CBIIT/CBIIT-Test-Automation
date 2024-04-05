Feature: These are the scenarios that are under the Run Scenario tab on Cervical Cancer Prevention

  Scenario: Ensure the CIN and NIC values are present in English and Spanish
Given the user is on Cervical CP Run Scenario page
When the user opens the "Cervical screening test chosen" menu
Then the "VIA" value displays
When the drop down is closed
Then the "Screening test specificity for CIN2/3 (NIC2/3)", and "Triage or diagnostic test sensitivity for CIN2/3 (NIC2/3)" values are displayed

Given the user is on Cervical CP Run Scenario page
When the language is changed to Espanol
When the user opens the "Prueba de tamizaje cervical elegida" menu
Then the "IVAA" value displays
When the drop down is closed
Then the "Sensibilidad de prueba de tamizaje para NIC2/3", and "Especificidad de prueba de tamizaje para NIC2/3", and "Especificidad de la prueba de triaje o diagnóstico para NIC2/3" values are displayed